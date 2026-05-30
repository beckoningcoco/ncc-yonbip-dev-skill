---
tags: [问题处理, API, tradeRouteID, 销售订单, 空指针]
created: 2026-05-27
updated: 2026-05-27
sources: [问题处理/API相关问题汇总]
---

# API 相关问题汇总

> BIP 平台 API 调用时的常见问题与解决方案。

## 销售订单保存 — tradeRouteID 无法保存

**版本**：BIP V5

**现象**：
- 传 `tradeRouteID_code`（编码）：保存成功但值未写入
- 传 `tradeRouteID`（ID）：空指针异常

**原因**：参照关联实体中 `isEndTrade` 字段未赋值，导致 `ConvertUtils.getBoolean()` 返回 null

**解决**：保存时同时传 `tradeRouteID` 和 `isEndTrade` 字段
