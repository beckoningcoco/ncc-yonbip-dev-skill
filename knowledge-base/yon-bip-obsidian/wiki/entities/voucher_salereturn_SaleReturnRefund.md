---
tags: [BIP, metadata, voucher, SaleReturnRefund]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 退货单 (voucher.salereturn.SaleReturnRefund)

> Platform: BIP V5 | Module: voucher | Table: salereturnrefund | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 退货单 |
| uri | voucher.salereturn.SaleReturnRefund |
| tableName | salereturnrefund |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | ? |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (1)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (8)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | agentId | 客户id | iAgentId | long | Long |  |  | nullable |
| 2 | amount | 退款金额 | iAmount | number | Decimal |  |  | nullable |
| 3 | createdDate | 创建时间 | dCreatedDate | date | Date |  |  | nullable |
| 4 | paymentVoucherNo | 退款单号 | cPaymentVoucherNo | text | String |  |  | nullable |
| 5 | refundId | 退款单Id | iRefundId | long | Long |  |  | nullable |
| 6 | saleReturnId | 退货单Id | iSaleReturnId | long | Long |  |  | nullable |
| 7 | saleReturnNo | 退货单号 | cSaleReturnNo | text | String |  |  | nullable |
| 8 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (1)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
