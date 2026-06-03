---
tags: [BIP, metadata, hrjx, PmRoleRelation]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 角色与考核类型关系实体 (hrjx.evaObjType.PmRoleRelation)

> Platform: BIP V5 | Table: pm_role_relation | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 角色与考核类型关系实体 |
| uri | hrjx.evaObjType.PmRoleRelation |
| tableName | pm_role_relation |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
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
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (10)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | evaObjectTypeCode | 考核对象类型编码 | evaobjecttypecode | text | String |  |  | nullable |
| 2 | roleCode | 角色编码 | rolecode | text | String |  |  | nullable |
| 3 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 4 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 5 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 6 | modifyTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 7 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 8 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 9 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 10 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | modifier | 修改人 | modifier | base.user.BipUser |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
