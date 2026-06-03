---
tags: [BIP, metadata, hrxc, WaSchemePower]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资方案授权 (hrxc.scheme.WaSchemePower)

> Platform: BIP V5 | Table: wa_scheme_power | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资方案授权 |
| uri | hrxc.scheme.WaSchemePower |
| tableName | wa_scheme_power |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (15)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | busiOrg | 组织主键 | BUSIORG | quote | org.func.AdminOrg |  |  | isMasterOrg,nullable |
| 2 | busiOrgVid | 组织V主键 | BUSIORGVID | quote | org.func.BaseOrgTimeline |  |  | isMasterOrg,migrationIgnoreRef,nullable |
| 3 | schemeId | 薪资方案主键 | SCHEME_ID | quote | hrxc.scheme.WaScheme |  |  | nullable |
| 4 | subjectId | 薪资方案版本 | SUBJECT_ID | text | String |  |  | nullable |
| 5 | subjectType | 薪资方案版本 | SUBJECT_TYPE | text | String |  |  | nullable |
| 6 | id | 主键 | ID | text | String |  |  | nullable,uiHide,REF.ID |
| 7 | dr | 逻辑删除标识 | DR | int | Integer |  |  | nullable |
| 8 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 9 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 10 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable |
| 11 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 12 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable |
| 13 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 14 | modifyVersion | 修改版本 | modify_version | text | String |  |  | nullable |
| 15 | tenant | 租户主键(旧) | TENANTID | quote | yht.tenant.YhtTenant |  |  | nullable |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | busiOrg | 组织主键 | BUSIORG | org.func.AdminOrg |
| 2 | busiOrgVid | 组织V主键 | BUSIORGVID | org.func.BaseOrgTimeline |
| 3 | schemeId | 薪资方案主键 | SCHEME_ID | hrxc.scheme.WaScheme |
| 4 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 5 | creator | 创建人 | CREATOR | base.user.BipUser |
| 6 | modifier | 修改人 | MODIFIER | base.user.BipUser |
| 7 | tenant | 租户主键(旧) | TENANTID | yht.tenant.YhtTenant |
