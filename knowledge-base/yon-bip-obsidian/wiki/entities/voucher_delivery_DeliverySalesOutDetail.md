---
tags: [BIP, metadata, voucher, DeliverySalesOutDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 出库信息子表 (voucher.delivery.DeliverySalesOutDetail)

> Platform: BIP V5 | Module: voucher | Table: delivery_salesout_detail | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 出库信息子表 |
| uri | voucher.delivery.DeliverySalesOutDetail |
| tableName | delivery_salesout_detail |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | uorder.voucher.UorderBizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 逻辑删除相关 (Deletable) | base.itf.Deletable |
| 2 | U订货租户相关 (IUordercorp) | base.itf.IUordercorp |
| 3 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (32)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | batchNo | 批号 | batchno | text | String |  |  | nullable |
| 2 | deliveryColumnNo | 发货单行号 | deliveryColumnNo | text | String |  |  | nullable |
| 3 | deliveryDetailId | 发货单详情Id | iDeliveryDetailId | quote | voucher.delivery.DeliveryDetail |  |  | nullable |
| 4 | deliveryId | 发货单号 | deliveryId | quote | voucher.delivery.DeliveryVoucher |  |  | nullable |
| 5 | deliveryNo | 发货单号 | deliveryNo | text | String |  |  | nullable |
| 6 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 7 | invExchRate | 销售换算率 | invExchRate | number | Decimal |  |  | nullable |
| 8 | invPriceExchRate | 计价换算率 | invPriceExchRate | number | Decimal |  |  | nullable |
| 9 | isDeleted | 是否删除 | iDeleted | switch | Boolean |  | Y | nullable |
| 10 | masterUnitId | 主计量单位Id | masterUnitId | long | Long |  |  | nullable |
| 11 | masterUnitName | 主计单位名称 | masterUnitName | text | String |  |  | nullable |
| 12 | outDate | 出库日期 | outDate | timestamp | Timestamp |  |  | nullable |
| 13 | priceQty | 计价单位数量 | priceQty | number | Decimal |  |  | nullable |
| 14 | priceUnitId | 计价单位Id | priceUnitId | long | Long |  |  | nullable |
| 15 | priceUnitName | 计价单位名称 | priceUnitName | text | String |  |  | nullable |
| 16 | productCode | 商品编码 | productCode | text | String |  |  | nullable |
| 17 | productId | 商品 | productId | long | Long |  |  | nullable |
| 18 | productName | 商品名称 | productName | text | String |  |  | nullable |
| 19 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 20 | qty | 主单位数量 | qty | number | Decimal |  |  | nullable |
| 21 | salesOutColumnId | 出库单行Id | salesOutColumnId | long | Long |  |  | nullable |
| 22 | salesOutColumnNo | 出库单行号 | salesOutColumnNo | text | String |  |  | nullable |
| 23 | salesOutId | 出库单据Id | salesOutId | long | Long |  |  | nullable |
| 24 | salesOutNo | 出库单据号 | salesOutNo | text | String |  |  | nullable |
| 25 | skuCode | sku编码 | skuCode | text | String |  |  | nullable |
| 26 | skuId | SKU | skuId | long | Long |  |  | nullable |
| 27 | skuName | sku名称 | skuName | text | String |  |  | nullable |
| 28 | subQty | 销售单位数量 | subQty | number | Decimal |  |  | nullable |
| 29 | subUnitId | 销售单位Id | subUnitId | long | Long |  |  | nullable |
| 30 | subUnitName | 销售单位名称 | subUnitName | text | String |  |  | nullable |
| 31 | uordercorp | 租户 | iCorpId | long | Long |  | Y | nullable,reportHide |
| 32 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | deliveryDetailId | 发货单详情Id | iDeliveryDetailId | voucher.delivery.DeliveryDetail |
| 2 | deliveryId | 发货单号 | deliveryId | voucher.delivery.DeliveryVoucher |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
