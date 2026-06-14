---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.BuyOfferBodySkuVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 询价单物料子表SKU扩展表 (`sourcing.ibuyoffer.BuyOfferBodySkuVO`)

> ycSouringInquiry | 物理表：`cpu_quotation_detail_skuext`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 询价单物料子表SKU扩展表 |
| 物理表 | `cpu_quotation_detail_skuext` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:38.0670` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（14个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `skuCode` | 物料SKU编码 | `sku_code` | String |
| 2 | `skuName` | 物料SKU名称 | `sku_name` | String |
| 3 | `skuModel` | SKU型号 | `sku_model` | String |
| 4 | `skuSpec` | 规格 | `sku_spec` | String |
| 5 | `specNames` | SKU规格型号、规格 | `spec_names` | String |
| 6 | `materialId` | 物料id | `material_id` | Long |
| 7 | `skuId` | 物料SKU ID | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 8 | `id` | ID | `id` | Long |
| 9 | `billId` | 询价单主表id | `bill_id` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 |
| 10 | `billBid` | 询价单子表id | `bill_bid` | 82d935cb-9072-4a12-b50a-8c1950dfd402 |
| 11 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 12 | `dr` | 逻辑删除标记 | `dr` | Short |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `billBid` | 询价单子表id | `sourcing.ibuyoffer.BuyOfferBodyVO` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `billId` | 询价单主表id | `sourcing.ibuyoffer.BuyOfferVO` | None |  |
| 4 | `skuId` | 物料SKU ID | `pc.product.ProductSKU` | Service |  |
