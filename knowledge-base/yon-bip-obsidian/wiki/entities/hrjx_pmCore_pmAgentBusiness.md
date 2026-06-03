---
tags: [BIP, metadata, hrjx, pmAgentBusiness]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务代理人子表 (hrjx.pmCore.pmAgentBusiness)

> Platform: BIP V5 | Table: pm_agent_business | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 业务代理人子表 |
| uri | hrjx.pmCore.pmAgentBusiness |
| tableName | pm_agent_business |
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
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (14)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | agentschemeid | 主表id | agentschemeid | quote | hrjx.pmCore.pmAgentScheme |  |  | nullable |
| 2 | principal | 被代理人id | principal | quote | bd.staff.Staff |  |  | nullable |
| 3 | agent | 业务代理人id | agent | quote | bd.staff.Staff |  |  | isName,nullable |
| 4 | businessflag | businessflag | businessflag | text | String |  |  | nullable |
| 5 | agentdeptid | 代理人部门 | agentdeptid | quote | bd.adminOrg.AdminOrgVO |  |  | nullable |
| 6 | principaldeptid | 委托人部门 | principaldeptid | quote | bd.adminOrg.AdminOrgVO |  |  | nullable |
| 7 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 8 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 9 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 10 | modifyTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 11 | id | id | id | text | String |  |  | nullable,REF.ID,uiHide |
| 12 | pubts | 操作时间 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 13 | tenant | 租户id | tenantid | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 14 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (9)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | agentschemeid | 主表id | agentschemeid | hrjx.pmCore.pmAgentScheme |
| 2 | principal | 被代理人id | principal | bd.staff.Staff |
| 3 | agent | 业务代理人id | agent | bd.staff.Staff |
| 4 | agentdeptid | 代理人部门 | agentdeptid | bd.adminOrg.AdminOrgVO |
| 5 | principaldeptid | 委托人部门 | principaldeptid | bd.adminOrg.AdminOrgVO |
| 6 | creator | 创建人 | creator | base.user.BipUser |
| 7 | modifier | 修改人 | modifier | base.user.BipUser |
| 8 | tenant | 租户id | tenantid | yht.tenant.YhtTenant |
| 9 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
