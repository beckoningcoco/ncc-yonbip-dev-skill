# 根据用户ID获取yht_access_token

> 来源：yonyou-bip-dev/references/根据用户id获取yht_access_token.md

## YonBipTokenUtil

```java
@Component
public class YonBipTokenUtil {
    private static final String YHT_ACCESS_TOKEN_COOKIE = "yht_access_token";
    @Value("${domain.url}")
    private String baseUrl;
    @Autowired
    private RedisManager redisManager;
    @Autowired
    private YonBipUtil yonBipUtil;

    public String getYhtAccessToken(String yhtUserId) {
        // 1. 先查 Redis 缓存
        String yhtAccessToken = redisManager.get(YHT_ACCESS_TOKEN_COOKIE + yhtUserId);
        if (StringUtils.isBlank(yhtAccessToken)) {
            // 2. 缓存未命中，调用 genLoginTokenByUserId
            Map<String, Object> resp = yonBipUtil.genLoginTokenByUserId(yhtUserId);
            String redirectUrl = buildRedirectUrl((String) resp.get("token"));
            // 3. 请求 CAS 登录跳转
            String resultStr = yonBipUtil.doGet2(redirectUrl);
            // 4. 从响应中提取 yht_access_token cookie
            yhtAccessToken = extractYhtAccessToken(resultStr);
            // 5. 写入 Redis，过期时间 1 小时
            redisManager.set(YHT_ACCESS_TOKEN_COOKIE + yhtUserId, yhtAccessToken, 60 * 60);
        }
        return yhtAccessToken;
    }
}
```

## 流程

1. 先从 Redis 查缓存
2. 缓存未命中 → 调用 `genLoginTokenByUserId` 获取 token
3. 构造 CAS 登录重定向 URL
4. 模拟浏览器请求，从 Cookie 中提取 `yht_access_token`
5. 写入 Redis，过期 1 小时
