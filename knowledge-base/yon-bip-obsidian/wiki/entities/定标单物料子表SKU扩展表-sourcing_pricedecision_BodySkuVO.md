---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.pricedecision.BodySkuVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 定标单物料子表SKU扩展表 (`sourcing.pricedecision.BodySkuVO`)

> ycSouringInquiry | 物理表：`cpu_pricedecision_detail_skuext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 定标单物料子表SKU扩展表 |
| 物理表 | `cpu_pricedecision_detail_skuext` |
| 数据库 schema | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:10:39.9340` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `skuCode` | 物料SKU编码 | `sku_code` | String |
| 2 | `skuName` | 物料SKU名称 | `sku_name` | String |
| 3 | `skuSpec` | 规格 | `sku_spec` | String |
| 4 | `skuModel` | SKU型号 | `sku_model` | String |
| 5 | `specNames` | SKU规格型号、规格 | `spec_names` | String |
| 6 | `materialId` | 物料id | `material_id` | Long |
| 7 | `skuId` | 物料SKU ID | `sku_id` | Long |
| 8 | `id` | ID | `id` | Long |
| 9 | `billId` | 单据id | `bill_id` | 4c65ba32-f884-44bd-ad0d-21414f32c012 |
| 10 | `billBid` | 单据子表id | `bill_bid` | 5ad37a5c-0251-495d-8791-6c08a9d69254 |
| 11 | `dr` | 逻辑删除标记 | `dr` | Short |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `billBid` | 单据子表id | `sourcing.pricedecision.PriceDecisionDetail` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `billId` | 单据id | `sourcing.pricedecision.PriceDecision` | None |  |
