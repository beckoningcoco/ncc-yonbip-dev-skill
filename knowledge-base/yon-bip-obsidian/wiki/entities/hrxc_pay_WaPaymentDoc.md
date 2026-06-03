---
tags: [BIP, metadata, hrxc, WaPaymentDoc]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 银行支付单人员 (hrxc.pay.WaPaymentDoc)

> Platform: BIP V5 | Table: wa_payment_doc | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 银行支付单人员 |
| uri | hrxc.pay.WaPaymentDoc |
| tableName | wa_payment_doc |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 4 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (28)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | pkPayfile | 发放单主键 | PK_PAYFILE | quote | hrxc.payfile.WaPayfile |  |  | nullable |
| 2 | pkWaPayment | 支付单主键 | PK_WA_PAYMENT | quote | hrxc.payfile.WaPayment |  |  | nullable |
| 3 | pkPayfileDoc | 发放人员主键 | PK_PAYFILE_DOC | text | String |  |  | nullable |
| 4 | paymentAmount | 支付金额 | PAYMENT_AMOUNT | number | Decimal |  |  | nullable |
| 5 | paynum | 第几次代发 | paynum | int | Integer |  |  | nullable |
| 6 | uses | 用途 | uses | int | Integer |  |  | nullable |
| 7 | paymentStatus | 支付状态 | payment_status | text | String |  |  | nullable |
| 8 | failureCause | 失败原因 | failure_cause | text | String |  |  | nullable |
| 9 | useDesc | 用途 | use_desc | text | String |  |  | nullable |
| 10 | bankId | 报盘银行主键 | bank_id | text | String |  |  | nullable |
| 11 | bankName | 报盘银行名称 | bank_name | text | String |  |  | nullable |
| 12 | bankAccount | 银行账户主键 | bank_account | text | String |  |  | nullable |
| 13 | branchBankName | 收方开户行名 | branch_bank_name | text | String |  |  | nullable |
| 14 | branchBankDot | 银行网点 | branch_bank_dot | text | String |  |  | nullable |
| 15 | bankLineNumber | 收方开户行联行号 | bank_line_number | text | String |  |  | nullable |
| 16 | accountName | 账户名 | account_name | text | String |  |  | nullable |
| 17 | crtbankcode | 收方开户行编码 | crt_bank_code | text | String |  |  | nullable |
| 18 | crtbankname | 收方开户行银行名称 | crt_bank_name | text | String |  |  | nullable |
| 19 | id | 主键 | ID | text | String |  |  | nullable,REF.ID |
| 20 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 21 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 22 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 23 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 24 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 25 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 26 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 27 | yTenantId | 友户通租户主键 | ytenant_id | text | String |  |  | nullable |
| 28 | tenant | 租户主键(旧) | TENANTID | text | String |  | Y | nullable,uiHide |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | pkPayfile | 发放单主键 | PK_PAYFILE | hrxc.payfile.WaPayfile |
| 2 | pkWaPayment | 支付单主键 | PK_WA_PAYMENT | hrxc.payfile.WaPayment |
| 3 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 4 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 5 | modifier | 修改人 | MODIFIER | hred.staff.Staff |
