---
tags: [BIP, metadata, hrjx, EvaObjectType]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 考核对象类型实体 (hrjx.evaObjType.EvaObjectType)

> Platform: BIP V5 | Table: pm_eva_object_type | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 考核对象类型实体 |
| uri | hrjx.evaObjType.EvaObjectType |
| tableName | pm_eva_object_type |
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

## All Fields (16)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | code | 编码 | code | text | String |  |  | nullable |
| 2 | name | 名称 | name | text | String |  |  | nullable |
| 3 | applyObj | 适用对象 | applyobj | int | Integer |  |  | nullable |
| 4 | enable | 启用状态 | enablestate | int | Integer |  |  | nullable |
| 5 | explanation | 说明 | explanation | text | String |  |  | nullable |
| 6 | isSystem | 是否系统预置 | issystem | int | Integer |  |  | nullable |
| 7 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 8 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 9 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 10 | modifyTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 11 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 12 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 13 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 14 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 15 | evaObjectTypeRelationList | 考核对象类型关系表 | - | - | hrjx.evaObjType.EvaObjectTypeRelation |  |  |  |
| 16 | roleRelationList | 角色与考核类型关系实体 | - | - | hrjx.evaObjType.PmRoleRelation |  |  |  |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | modifier | 修改人 | modifier | base.user.BipUser |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | roleRelationList | 角色与考核类型关系实体 | hrjx.evaObjType.PmRoleRelation |
| 2 | evaObjectTypeRelationList | 考核对象类型关系表 | hrjx.evaObjType.EvaObjectTypeRelation |
