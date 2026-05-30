---
tags: [API, 销售订单, tradeRouteID, 问题处理, isEndTrade, 毛戈平]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-api-issues-summary.md]
---

# API相关问题汇总

> 项目: 毛戈平 | 版本: BIP V5

## 销售订单保存 — tradeRouteID 字段无法保存

**现象**：调用标准 API 销售订单保存时，贸易路径字段 `tradeRouteID` 传编码不报错但值未写入，传 ID 直接报空指针。

**原因**：`tradeRouteID` 关联实体中有 `isEndTrade`（是否末级站点）字段，未赋值时为 null，导致 `ConvertUtils.getBoolean()` 空指针。

**解决**：保存时同时传入 `tradeRouteID` 和 `isEndTrade` 的值。

## 关键概念

- [[销售订单 API]]
- [[tradeRouteID]]
- [[isEndTrade]]
