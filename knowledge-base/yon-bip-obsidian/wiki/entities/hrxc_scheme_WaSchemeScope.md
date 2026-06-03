---
tags: [BIP, metadata, hrxc, WaSchemeScope]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资方案适用范围 (hrxc.scheme.WaSchemeScope)

> Platform: BIP V5 | Table: wa_scheme_scope | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资方案适用范围 |
| uri | hrxc.scheme.WaSchemeScope |
| tableName | wa_scheme_scope |
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
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 4 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |

---

## All Fields (16)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | authId |  | AUTH_ID | quote | hrxc.scheme.WaSchemeAuth |  |  | nullable |
| 2 | name |  | NAME | text | String |  |  | nullable |
| 3 | type |  | TYPE | text | String |  |  | nullable |
| 4 | pkScope |  | PK_SCOPE | text | String |  |  | nullable |
| 5 | schemeId | 薪资方案主键 | SCHEME_ID | quote | hrxc.scheme.WaScheme |  |  | nullable |
| 6 | versionId | 版本主键 | VERSION_ID | text | String |  |  | nullable |
| 7 | id | 主键 | ID | text | String |  |  | nullable,uiHide,REF.ID |
| 8 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 9 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 10 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 11 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable |
| 12 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 13 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable |
| 14 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 15 | yTenantId | 友户通租户主键 | ytenant_id | quote | yht.tenant.YhtTenant |  |  | nullable |
| 16 | tenant | 租户主键 | TENANTID | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | authId |  | AUTH_ID | hrxc.scheme.WaSchemeAuth |
| 2 | schemeId | 薪资方案主键 | SCHEME_ID | hrxc.scheme.WaScheme |
| 3 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 4 | creator | 创建人 | CREATOR | base.user.BipUser |
| 5 | modifier | 修改人 | MODIFIER | base.user.BipUser |
| 6 | yTenantId | 友户通租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 7 | tenant | 租户主键 | TENANTID | yht.tenant.YhtTenant |
