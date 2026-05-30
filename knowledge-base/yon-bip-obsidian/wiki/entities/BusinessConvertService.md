---
tags: [BIP, 推单, 转换, 单据]
created: 2026-05-28
updated: 2026-05-28
sources: [2026-05-28-maogeping-bip-v5-code-reference]
---

# BusinessConvertService

> BIP 推单/生单服务，通过转换规则自动从上游单据生成下游单据。

## 标准模板

```java
@Autowired
private BusinessConvertService businessConvertService;

public Map<String, Object> savePaymentBySourceBill(String payableBillid) {
    // 1. 查询上游单据
    IBillDO sourceBill = querySourceBill(payableBillid);

    // 2. 构建转换参数
    Map<String, Object> params = new HashMap<>();
    params.put("converterCode", "apPublicToPayment");  // 转换规则编码
    params.put("srcBillId", sourceBill.getId());
    params.put("targetBillType", "PAYMENT");
    params.put("targetBillCode", "paymentCode");

    // 3. 执行转换
    Map<String, Object> result = businessConvertService.doConvert(params);

    // 4. 保存下游单据
    String targetId = ((Map) result.get("data")).get("id").toString();
    yonbipUtil.savePayment(buildData(targetId));
    return result;
}
```

## 常用转换规则

| 规则编码 | 源单据 | 目标单据 |
|----------|--------|----------|
| `apPublicToPayment` | AP 公共事件 | 付款单 |
| `WWDDTTLSQ` | 委外订单 | 退料申请 |
| `SCDDTTLSQ` | 生产订单 | 退料申请 |

## 关键点

- `converterCode` 是在 BIP 平台配置的转换规则编码
- 需要配合 `YonbipUtil` 完成目标单据的保存、提交、审核
- 常用于 应付→付款、订单→退料 等业务链

## 相关页面

- [[YonbipUtil]]
- [[BillPlugin扩展]]
- [[BIP后端开发模板]]
