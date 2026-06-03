---
tags: [BIP, metadata, hrxc, WaGradeAuth]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资标准授权 (hrxc.grade.WaGradeAuth)

> Platform: BIP V5 | Table: wa_grade_auth | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资标准授权 |
| uri | hrxc.grade.WaGradeAuth |
| tableName | wa_grade_auth |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 4 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (13)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | authOrgId | 授权组织主键 | AUTH_ORG_ID | text | String |  |  | nullable |
| 2 | pkWaGrd | 薪资标准类别主键 | PK_WA_GRD | quote | hrxc.grade.WaGrade |  |  | nullable,skipReferenceCheck |
| 3 | authOrgName | 授权组织名称 | AUTH_ORG_NAME | text | String |  |  | nullable |
| 4 | pubts | 是否末级 | PUBTS | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 5 | id | 主键 | ID | text | String |  |  | nullable,uiHide,REF.ID |
| 6 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 7 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 8 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable |
| 9 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 10 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable |
| 11 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 12 | tenant | 租户主键 | TENANTID | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 13 | yTenantId | 友户通租户主键 | YTENANT_ID | text | String |  |  | nullable |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | pkWaGrd | 薪资标准类别主键 | PK_WA_GRD | hrxc.grade.WaGrade |
| 2 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 3 | creator | 创建人 | CREATOR | base.user.BipUser |
| 4 | modifier | 修改人 | MODIFIER | base.user.BipUser |
| 5 | tenant | 租户主键 | TENANTID | yht.tenant.YhtTenant |
