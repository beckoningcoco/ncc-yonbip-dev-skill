---
tags: [BIP, metadata, hrjx, pmAgentScheme]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务代理人 (hrjx.pmCore.pmAgentScheme)

> Platform: BIP V5 | Table: pm_agent_scheme | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 业务代理人 |
| uri | hrjx.pmCore.pmAgentScheme |
| tableName | pm_agent_scheme |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |
| description | 0 停用 1 启用 |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 启用 (IEnable) | ucfbase.ucfbaseItf.IEnable |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 4 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |

---

## All Fields (19)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | name | 方案名称 | name | text | String |  |  | isName,nullable |
| 2 | orgid | 所属组织 | orgid | quote | org.func.AdminOrg |  |  | nullable |
| 3 | vid | 组织id | vid | quote | org.func.AdminOrgTimeline |  |  | migrationIgnoreRef,nullable |
| 4 | explanation | 说明 | explanation | text | String |  |  | nullable |
| 5 | versiontype | version | versiontype | int | Integer |  |  | nullable |
| 6 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 7 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 8 | enable | 是否启用 | isenable | int | Integer |  |  | nullable,uiDesign |
| 9 | originalid | 新增4 | originalid | quote | hrjx.pmCore.pmAgentScheme |  |  | nullable |
| 10 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 11 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 12 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 13 | modifyTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 14 | id | id | id | text | String |  |  | nullable,REF.ID,uiHide |
| 15 | pubts | 操作时间 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 16 | tenant | 租户id | tenantid | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 17 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 18 | pmAgentBusinessList | 业务代理人子表 | - | - | hrjx.pmCore.pmAgentBusiness |  |  |  |
| 19 | relations | 业务代理人与考核对象类型关联表 | - | - | hrjx.pmCore.EvaObjectTypeRelationForAgentScheme |  |  |  |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orgid | 所属组织 | orgid | org.func.AdminOrg |
| 2 | vid | 组织id | vid | org.func.AdminOrgTimeline |
| 3 | originalid | 新增4 | originalid | hrjx.pmCore.pmAgentScheme |
| 4 | creator | 创建人 | creator | base.user.BipUser |
| 5 | modifier | 修改人 | modifier | base.user.BipUser |
| 6 | tenant | 租户id | tenantid | yht.tenant.YhtTenant |
| 7 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | pmAgentBusinessList | 业务代理人子表 | hrjx.pmCore.pmAgentBusiness |
| 2 | relations | 业务代理人与考核对象类型关联表 | hrjx.pmCore.EvaObjectTypeRelationForAgentScheme |
