---
tags: [BIP, metadata, hrjx, PmPlanScope]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 试用考核适用范围 (hrjx.pmPlan.PmPlanScope)

> Platform: BIP V5 | Table: pm_plan_scope | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 试用考核适用范围 |
| uri | hrjx.pmPlan.PmPlanScope |
| tableName | pm_plan_scope |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (1)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (8)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 2 | isincludesub | 是否包含下级 | isincludesub | int | Integer |  |  | nullable |
| 3 | orgVid | 多维组织 | org_vid | quote | org.func.AdminOrgTimeline |  |  | nullable |
| 4 | orgid | 所属组织 | orgid | quote | org.func.AdminOrg |  |  | nullable |
| 5 | orgtype | 所属组织类型 | orgtype | int | Integer |  |  | nullable |
| 6 | planId | 计划id | plan_id | quote | hrjx.pmPlan.PmPlan |  |  | nullable |
| 7 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 8 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orgVid | 多维组织 | org_vid | org.func.AdminOrgTimeline |
| 2 | orgid | 所属组织 | orgid | org.func.AdminOrg |
| 3 | planId | 计划id | plan_id | hrjx.pmPlan.PmPlan |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
