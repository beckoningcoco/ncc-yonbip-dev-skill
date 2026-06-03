---
tags: [BIP, metadata, hrxc, WaPayment]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 银行支付单 (hrxc.payfile.WaPayment)

> Platform: BIP V5 | Table: wa_payment | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 银行支付单 |
| uri | hrxc.payfile.WaPayment |
| tableName | wa_payment |
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

## All Fields (20)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | pkPayfile | 发放单主键 | PK_PAYFILE | quote | hrxc.payfile.WaPayfile |  |  | nullable |
| 2 | taxOrgId | 财务组织主键 | TAX_ORG_ID | text | String |  |  | nullable |
| 3 | payBankAccount | 财务组织主键 | paybankaccount | text | String |  |  | nullable |
| 4 | name | 名字 | NAME | text | String |  |  | nullable |
| 5 | paynums | 发薪人数 | PAYNUMS | int | Integer |  |  | nullable |
| 6 | totals | TOTALS | TOTALS | number | Decimal |  |  | nullable |
| 7 | paymentStatus | 支付状态 | payment_status | text | String |  |  | nullable |
| 8 | itemId | 项目主键 | item_id | text | String |  |  | nullable |
| 9 | paynum | 第几次代发 | paynum | text | String |  |  | nullable |
| 10 | id | 主键 | ID | text | String |  |  | nullable,REF.ID |
| 11 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 12 | tenant | 租户主键(旧) | TENANTID | text | String |  | Y | nullable,uiHide |
| 13 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 14 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 15 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 16 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 17 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 18 | yTenantId | 友户通租户主键 | ytenant_id | text | String |  |  | nullable |
| 19 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 20 | paymentDocs | 银行支付单人员 | - | - | hrxc.payfile.WaPaymentDoc |  |  |  |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | pkPayfile | 发放单主键 | PK_PAYFILE | hrxc.payfile.WaPayfile |
| 2 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 3 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 4 | modifier | 修改人 | MODIFIER | hred.staff.Staff |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | paymentDocs | 银行支付单人员 | hrxc.payfile.WaPaymentDoc |
