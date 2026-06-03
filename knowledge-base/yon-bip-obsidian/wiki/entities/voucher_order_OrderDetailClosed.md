---
tags: [BIP, metadata, voucher, OrderDetailClosed]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 订单关闭 (voucher.order.OrderDetailClosed)

> Platform: BIP V5 | Module: voucher | Table: orderdetailclosed | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 订单关闭 |
| uri | voucher.order.OrderDetailClosed |
| tableName | orderdetailclosed |
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
| 1 | U订货租户相关 (IUordercorp) | base.itf.IUordercorp |
| 2 | 逻辑删除相关 (Deletable) | base.itf.Deletable |
| 3 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (19)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | ProductId | 商品ID | ProductId | long | Long |  |  | nullable |
| 2 | code | 单据编号 | cOrderNo | text | String |  |  | nullable |
| 3 | created | 创建时间 | dCreated | timestamp | Timestamp |  |  | nullable |
| 4 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 5 | isDeleted | 逻辑删除标记 | iDeleted | switch | Boolean |  | Y | nullable |
| 6 | memo | 批注 | cMemo | text | String |  |  | nullable |
| 7 | orderDetailId | 订单行id | iOrderDetailId | long | Long |  |  | nullable |
| 8 | orderDetailIdKey | 订单行idkey | cOrderDetailIdKey | text | String |  |  | nullable |
| 9 | productImgUrl | 商品图片 | productImgUrl | text | String |  |  | nullable |
| 10 | productName | 商品名称 | productName | text | String |  |  | nullable |
| 11 | productUnitName | 计量单位 | productUnitName | text | String |  |  | nullable |
| 12 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 13 | quantity | 关闭数量 | iQuantity | number | Decimal |  |  | nullable |
| 14 | salePayMoney | 小计 | fSalePayMoney | number | Decimal |  |  | nullable |
| 15 | specDescription | 规格描述 | specDescription | text | String |  |  | nullable |
| 16 | totalQuantity | 总数量 | iTotalQuantity | number | Decimal |  |  | nullable |
| 17 | transactionPrice | 成交价 | fTransactionPrice | number | Decimal |  |  | nullable |
| 18 | uordercorp | 租户 | iCorpId | long | Long |  | Y | nullable,reportHide |
| 19 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (1)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
