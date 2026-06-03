---
tags: [BIP, metadata, hrjx, PmPlanPhaseRule]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 试用考核时间规则设置 (hrjx.pmPlan.PmPlanPhaseRule)

> Platform: BIP V5 | Table: pm_plan_phase_rule | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 试用考核时间规则设置 |
| uri | hrjx.pmPlan.PmPlanPhaseRule |
| tableName | pm_plan_phase_rule |
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

## All Fields (10)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | defid | 流程id | defid | quote | hrjx.pmPhaseFlow.PhaseFlowDef |  |  | nullable |
| 2 | endRuleid | 结束业务规则id | end_ruleid | quote | hrcb.rule_bizrule.BizRule |  |  | nullable |
| 3 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 4 | planId | 计划id | plan_id | quote | hrjx.pmPlan.PmPlan |  |  | nullable |
| 5 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 6 | schemeId | 单元id | scheme_id | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 7 | showOrder | 排序 | show_order | int | Integer |  |  | nullable |
| 8 | startRuleid | 开始业务规则id | start_ruleid | quote | hrcb.rule_bizrule.BizRule |  |  | nullable |
| 9 | stepid | 流程步骤id | stepid | quote | hrjx.pmPhaseFlow.PhaseFlowStep |  |  | nullable |
| 10 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | defid | 流程id | defid | hrjx.pmPhaseFlow.PhaseFlowDef |
| 2 | endRuleid | 结束业务规则id | end_ruleid | hrcb.rule_bizrule.BizRule |
| 3 | planId | 计划id | plan_id | hrjx.pmPlan.PmPlan |
| 4 | schemeId | 单元id | scheme_id | hrjx.pmScheme.Scheme |
| 5 | startRuleid | 开始业务规则id | start_ruleid | hrcb.rule_bizrule.BizRule |
| 6 | stepid | 流程步骤id | stepid | hrjx.pmPhaseFlow.PhaseFlowStep |
| 7 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
