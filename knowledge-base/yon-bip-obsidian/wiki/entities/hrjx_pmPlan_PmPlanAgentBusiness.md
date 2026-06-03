---
tags: [BIP, metadata, hrjx, PmPlanAgentBusiness]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 绩效计划代理人明细表 (hrjx.pmPlan.PmPlanAgentBusiness)

> Platform: BIP V5 | Table: pm_plan_agent_business | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 绩效计划代理人明细表 |
| uri | hrjx.pmPlan.PmPlanAgentBusiness |
| tableName | pm_plan_agent_business |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |

---

## All Fields (13)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | agent | 代理人id | agent | quote | bd.staff.Staff |  |  | nullable |
| 2 | agentbusiness | 代理业务 | agentbusiness | text | String |  |  | nullable |
| 3 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 4 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 5 | dispSeq | 排序 | disp_seq | int | Integer |  |  | nullable |
| 6 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 7 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 8 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 9 | planid | 计划id | planid | quote | hrjx.pmPlan.PmPlan |  |  | nullable |
| 10 | principal | 被代理人id | principal | quote | bd.staff.Staff |  |  | nullable |
| 11 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 12 | tenant | 租户ID | tenant_id | text | String |  | Y | nullable,uiHide |
| 13 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | agent | 代理人id | agent | bd.staff.Staff |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | modifier | 修改人 | modifier | base.user.BipUser |
| 4 | planid | 计划id | planid | hrjx.pmPlan.PmPlan |
| 5 | principal | 被代理人id | principal | bd.staff.Staff |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
