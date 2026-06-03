---
tags: [BIP, metadata, hrxc, WaPaymentVoucher]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资代发单拆分子单据 (hrxc.waPaymentBill.WaPaymentVoucher)

> Platform: BIP V5 | Table: wa_payment_voucher | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资代发单拆分子单据 |
| uri | hrxc.waPaymentBill.WaPaymentVoucher |
| tableName | wa_payment_voucher |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 2 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 4 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (23)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | billId | 薪资代发单 | bill_id | quote | hrxc.waPaymentBill.WaPaymentBill |  |  | nullable |
| 2 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 3 | creationTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 4 | creator | 创建人 | CREATOR | text | String |  |  | nullable |
| 5 | currencyId | 币种 | currency_id | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 6 | details | 薪资代发单明细 | - | - | hrxc.waPaymentBill.WaPaymentVoucherDetail |  |  |  |
| 7 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 8 | exceptionType | 异常类型 | exception_type | int | Integer |  |  | nullable |
| 9 | failNum | 失败数量 | fail_num | int | Integer |  |  | nullable |
| 10 | id | id | id | long | Long |  |  | nullable,uiHide,REF.ID |
| 11 | modifier | 修改人 | MODIFIER | text | String |  |  | nullable |
| 12 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 13 | num | 代发明细数量 | num | int | Integer |  |  | nullable |
| 14 | paymentBank | 付款银行 | payment_bank | text | String |  |  | nullable |
| 15 | paymentBankAccount | 付款银行账号 | payment_bank_account | text | String |  |  | nullable |
| 16 | paymentStatus | 支付状态 | payment_status | int | Integer |  |  | nullable |
| 17 | processingNum | 处理中数量 | processing_num | int | Integer |  |  | nullable |
| 18 | pubts | ts | TS | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 19 | successNum | 成功数量 | success_num | int | Integer |  |  | nullable |
| 20 | tenant | 租户ID | TENANTID | text | String |  | Y | nullable,uiHide |
| 21 | totalAmount | 总金额 | total_amount | number | Decimal |  |  | nullable |
| 22 | yTenantId | 友户通租户id | ytenant_id | text | String |  |  | nullable |
| 23 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | billId | 薪资代发单 | bill_id | hrxc.waPaymentBill.WaPaymentBill |
| 2 | currencyId | 币种 | currency_id | bd.currencytenant.CurrencyTenantVO |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | details | 薪资代发单明细 | hrxc.waPaymentBill.WaPaymentVoucherDetail |
