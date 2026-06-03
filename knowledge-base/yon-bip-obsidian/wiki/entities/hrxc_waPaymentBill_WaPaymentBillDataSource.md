---
tags: [BIP, metadata, hrxc, WaPaymentBillDataSource]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资代发单数据源 (hrxc.waPaymentBill.WaPaymentBillDataSource)

> Platform: BIP V5 | Table: wa_payment_bill_datasource | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资代发单数据源 |
| uri | hrxc.waPaymentBill.WaPaymentBillDataSource |
| tableName | wa_payment_bill_datasource |
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

## All Fields (16)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | billId | 薪资代发单 | bill_id | quote | hrxc.waPaymentBill.WaPaymentBill |  |  | nullable |
| 2 | type | 类型 | type | int | Integer |  |  | nullable |
| 3 | payfileId | 发放单 | payfile_id | quote | hrxc.payfile.WaPayfile |  |  | nullable |
| 4 | waSchemeId | 发薪方案 | wa_scheme_id | quote | hrxc.scheme.WaScheme |  |  | nullable |
| 5 | waSchemeAuthId | 发薪方案授权 | wa_scheme_auth_id | quote | hrxc.scheme.WaSchemeAuth |  |  | nullable |
| 6 | id | 主键 | id | long | Long |  |  | nullable,uiHide,REF.ID |
| 7 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 8 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 9 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 10 | creator | 创建人 | CREATOR | text | String |  |  | nullable |
| 11 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 12 | creationTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 13 | modifier | 修改人 | MODIFIER | text | String |  |  | nullable |
| 14 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 15 | tenant | 租户主键(旧) | TENANTID | text | String |  | Y | nullable,uiHide |
| 16 | yTenantId | 友户通租户主键 | ytenant_id | text | String |  |  | nullable |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | billId | 薪资代发单 | bill_id | hrxc.waPaymentBill.WaPaymentBill |
| 2 | payfileId | 发放单 | payfile_id | hrxc.payfile.WaPayfile |
| 3 | waSchemeId | 发薪方案 | wa_scheme_id | hrxc.scheme.WaScheme |
| 4 | waSchemeAuthId | 发薪方案授权 | wa_scheme_auth_id | hrxc.scheme.WaSchemeAuth |
| 5 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
