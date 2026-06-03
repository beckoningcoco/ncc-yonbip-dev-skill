---
tags: [BIP, metadata, hrxc, WaPaymentSubjectOrg]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 支付主体适用组织 (hrxc.waPaymentSubject.WaPaymentSubjectOrg)

> Platform: BIP V5 | Table: wa_payment_subject_org | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 支付主体适用组织 |
| uri | hrxc.waPaymentSubject.WaPaymentSubjectOrg |
| tableName | wa_payment_subject_org |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 3 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (11)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | orgId | 适用组织ID | org_id | quote | org.func.BaseOrg |  |  | nullable |
| 2 | pkPaymentSubject | 支付主体ID | pk_payment_subject | quote | hrxc.waPaymentSubject.WaPaymentSubject |  |  | nullable |
| 3 | id | 主键 | id | text | String |  |  | nullable,uiHide,REF.ID |
| 4 | dr | 逻辑删除标识 | dr | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 5 | pubts | 最后操作时间 | pubts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 6 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide,notGenerate |
| 7 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 8 | creationTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable |
| 9 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 10 | modifiedTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable |
| 11 | tenant | 租户主键(旧) | tenantid | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orgId | 适用组织ID | org_id | org.func.BaseOrg |
| 2 | pkPaymentSubject | 支付主体ID | pk_payment_subject | hrxc.waPaymentSubject.WaPaymentSubject |
| 3 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 4 | creator | 创建人 | creator | base.user.BipUser |
| 5 | modifier | 修改人 | modifier | base.user.BipUser |
| 6 | tenant | 租户主键(旧) | tenantid | yht.tenant.YhtTenant |
