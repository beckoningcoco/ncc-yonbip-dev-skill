---
tags: [BIP, metadata, voucher, OrderPriceDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 订单价格详情 (voucher.order.OrderPriceDetail)

> Platform: BIP V5 | Module: voucher | Table: orderpricedetail | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 订单价格详情 |
| uri | voucher.order.OrderPriceDetail |
| tableName | orderpricedetail |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | uorder.voucher.UorderBizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | U订货租户相关 (IUordercorp) | base.itf.IUordercorp |
| 2 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (9)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | amount | 金额 | iAmount | number | Decimal |  |  | nullable |
| 2 | code | 单据编号 | cOrderNo | text | String |  |  | nullable |
| 3 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 4 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 5 | remark | 说明 | cRemark | text | String |  |  | nullable |
| 6 | type | 金额类型 | cType | text | String |  |  | nullable |
| 7 | typeName | 类型名称 | cTypeName | text | String |  |  | nullable |
| 8 | uordercorp | 租户 | iCorpId | long | Long |  | Y | nullable,reportHide |
| 9 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (1)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
