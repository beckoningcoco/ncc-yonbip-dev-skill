---
tags: [BIP, metadata, voucher, SaleReturnPrice]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 退货单单价 (voucher.salereturn.SaleReturnPrice)

> Platform: BIP V5 | Module: voucher | Table: salereturnprice | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 退货单单价 |
| uri | voucher.salereturn.SaleReturnPrice |
| tableName | salereturnprice |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | uorder.voucher.UorderVouchLine |
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

## All Fields (16)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | agentId | 客户id | iAgentId | long | Long |  |  | nullable |
| 2 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 3 | isDeleted | 逻辑删除标记 | iDeleted | switch | Boolean |  | Y | nullable |
| 4 | oldRebateToCashMoney | 历史直接抵现金额 | oldRebateToCashMoney | number | Decimal |  |  | nullable |
| 5 | oldRebateToOrderMoney | 历史退款单金额 | oldRebateToOrderMoney | number | Decimal |  |  | nullable |
| 6 | payMoney | 支付金额 | fPayMoney | number | Decimal |  |  | nullable |
| 7 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 8 | rebateToCashMoney | 直接抵现金额 | fRebateToCashMoney | number | Decimal |  |  | nullable |
| 9 | rebateToOrderMoney | 退款单金额 | fRebateToOrderMoney | number | Decimal |  |  | nullable |
| 10 | rowno | 序号 | rowno | int | Integer |  |  | isCode,nullable |
| 11 | saleReturnId | 退货单id | iSaleReturnId | quote | voucher.salereturn.SaleReturn |  |  | nullable |
| 12 | saleReturnNo | 退货单号 | cSaleReturnNo | text | String |  |  | nullable |
| 13 | totalMoney | 整单金额 | fTotalMoney | number | Decimal |  |  | nullable |
| 14 | uordercorp | 租户 | iCorpId | long | Long |  | Y | nullable,reportHide |
| 15 | voucherNo | 付款单号 | cVoucherNo | text | String |  |  | nullable |
| 16 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (2)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | saleReturnId | 退货单id | iSaleReturnId | voucher.salereturn.SaleReturn |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
