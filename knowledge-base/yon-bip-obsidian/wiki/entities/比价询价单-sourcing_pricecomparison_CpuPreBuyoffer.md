---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.pricecomparison.CpuPreBuyoffer"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 比价询价单 (`sourcing.pricecomparison.CpuPreBuyoffer`)

> ycSouringInquiry | 物理表：`cpu_pre_buyoffer`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 比价询价单 |
| 物理表 | `cpu_pre_buyoffer` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:06:13.7770` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyofferid` | 询价单id | `buyofferid` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 |
| 2 | `puorgDocId` | 采购组织id | `puorg_doc_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 3 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 4 | `compareExchRateDate` | 比价汇率日期 | `compare_exch_ratedate` | Date |
| 5 | `tenant` | 租户ID | `tenant_id` | String |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `transactionTypeId` | 交易类型id | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 9 | `ytenant` | 租户id | `ytenant_id` | String |
| 10 | `id` | 主键 | `id` | Long |
| 11 | `qtofferList` | 比价报价单 | `` | 0bf5c9da-2727-45a3-a304-2c058121c8a3 |
| 12 | `supplyQtofferList` | 比价单供应商报价子表 | `` | 7ee8e935-f0a9-4750-819a-34610cc65d35 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `buyofferid` | 询价单id | `sourcing.ibuyoffer.BuyOfferVO` | None |  |
| 2 | `puorgDocId` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 3 | `transactionTypeId` | 交易类型id | `bd.bill.TransType` | Service |  |
| 4 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 5 | `qtofferList` | 比价报价单 | `sourcing.pricecomparison.CpuPreQtoffer` | None | true |
| 6 | `supplyQtofferList` | 比价单供应商报价子表 | `sourcing.pricecomparison.CpuPreSupplyQtoffer` | None | true |
