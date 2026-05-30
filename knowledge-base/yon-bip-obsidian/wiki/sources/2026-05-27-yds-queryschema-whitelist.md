---
tags: [YDS, QuerySchema, No instances available, 白名单, registryUrl, devMode, 问题处理]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-yds-queryschema-whitelist.md]
---

# YDS搭建环境使用QuerySchema查询报错

> QuerySchema 查询报错 "No instances available"，需配置 NGINX 白名单和本地 YDS 配置。

## 报错

```
QuerySchema执行过程出错...No instances available:[c-scm-xfp-mgpkk.dev -> ustock.dev]
```

## 解决方案

1. **运维配置 NGINX 白名单**：将 PC 公网出口 IP 加入 `ip_expand.conf`
2. **修改本地 YDS 配置**：
   ```json
   "yds.registryUrl": "https://erp-dev-test.maogeping.com/registry-0/eureka/",
   "yds.devMode": "cloudnative"
   ```

## 关键概念

- [[QuerySchema]]
- [[NGINX 白名单]]
- [[YDS 配置]]
