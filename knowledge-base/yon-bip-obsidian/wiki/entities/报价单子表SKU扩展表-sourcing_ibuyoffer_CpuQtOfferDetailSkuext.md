---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.CpuQtOfferDetailSkuext"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 报价单子表SKU扩展表 (`sourcing.ibuyoffer.CpuQtOfferDetailSkuext`)

> ycSouringInquiry | 物理表：`cpu_qtoffer_detail_skuext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报价单子表SKU扩展表 |
| 物理表 | `cpu_qtoffer_detail_skuext` |
| 数据库 schema | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:10:33.0740` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `pubts` | 时间戳 | `pubts` | DateTime |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `billId` | 报价单ID | `bill_id` | f481bff4-9adb-490e-997f-bedc510ce69b |
| 5 | `billBid` | 报价单行ID | `bill_bid` | 52035a4f-aa8a-4ec4-8b75-858a5396cca4 |
| 6 | `materialId` | 物料ID | `material_id` | Long |
| 7 | `skuId` | 物料SKU ID | `sku_id` | Long |
| 8 | `skuCode` | 物料SKU编码 | `sku_code` | String |
| 9 | `skuName` | 物料SKU名称 | `sku_name` | String |
| 10 | `skuSpec` | SKU规格 | `sku_spec` | String |
| 11 | `skuModel` | SKU型号 | `sku_model` | String |
| 12 | `specNames` | SKU规格型号、规格 | `spec_names` | String |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `billBid` | 报价单行ID | `sourcing.ibuyoffer.CpuPriceQuotationOfferDetail` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `billId` | 报价单ID | `sourcing.ibuyoffer.CpuPriceQuotationOffer` | None |  |
