---
tags: [内部交易规则, 调拨订单, autoGetPrice, 定价中心, 调价单, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-internal-trade-rules.md]
---

# 设置内部交易规则

> 客开调拨订单时，设置 `autoGetPrice=true` 让系统自动计算价格，需配合内部交易规则和定价中心调价单。

## 配置

1. **报文设置**：`reqTransferBillMap.put("autoGetPrice", true);`
2. **内部交易规则**：配置调拨关系的价格规则
3. **定价中心调价单**：设置物料价格（单价、含税单价），审核后生效

## 关键概念

- [[内部交易规则]]
- [[定价中心]]
- [[调价单]]
- [[autoGetPrice]]
