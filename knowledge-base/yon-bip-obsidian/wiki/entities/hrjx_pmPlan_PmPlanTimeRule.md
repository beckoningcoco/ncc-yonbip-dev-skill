---
tags: [BIP, metadata, hrjx, PmPlanTimeRule]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 绩效计划时间规则 (hrjx.pmPlan.PmPlanTimeRule)

> Platform: BIP V5 | Table: pm_plan_time_rule | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 绩效计划时间规则 |
| uri | hrjx.pmPlan.PmPlanTimeRule |
| tableName | pm_plan_time_rule |
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

## All Fields (17)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | defid | 流程id | defid | quote | hrjx.pmPhaseFlow.PhaseFlowDef |  |  | nullable |
| 2 | endTime | 结束时间 | end_time | timestamp | Timestamp |  |  | nullable |
| 3 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 4 | oprType | 处理类型 | opr_type | short | Short |  |  | nullable |
| 5 | planid | 计划id | plan_id | quote | hrjx.pmPlan.PmPlan |  |  | nullable |
| 6 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 7 | reviewid | 结果审核单元id | review_id | quote | hrjx.pmScheme.ResultReview |  |  | nullable |
| 8 | ruleType | 规则类型 | rule_type | short | Short |  |  | nullable |
| 9 | runtimeDefid | 流程实例id | runtime_defid | quote | hrjx.pmPhaseFlow.PhaseFlowDefRuntime |  |  | nullable |
| 10 | runtimeStepid | 步骤实例id | runtime_stepid | quote | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |  |  | nullable |
| 11 | schemeid | 绩效单元id | scheme_id | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 12 | sheetid | 量表id | sheet_id | quote | hrjx.pmSheet.Sheet |  |  | nullable |
| 13 | showOrder | 排序 | show_order | int | Integer |  |  | nullable |
| 14 | startTime | 开始时间 | start_time | timestamp | Timestamp |  |  | nullable |
| 15 | stepid | 步骤id | stepid | quote | hrjx.pmPhaseFlow.PhaseFlowStep |  |  | nullable |
| 16 | turn | 轮次 | turn | short | Short |  |  | nullable |
| 17 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (9)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | defid | 流程id | defid | hrjx.pmPhaseFlow.PhaseFlowDef |
| 2 | planid | 计划id | plan_id | hrjx.pmPlan.PmPlan |
| 3 | reviewid | 结果审核单元id | review_id | hrjx.pmScheme.ResultReview |
| 4 | runtimeDefid | 流程实例id | runtime_defid | hrjx.pmPhaseFlow.PhaseFlowDefRuntime |
| 5 | runtimeStepid | 步骤实例id | runtime_stepid | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |
| 6 | schemeid | 绩效单元id | scheme_id | hrjx.pmScheme.Scheme |
| 7 | sheetid | 量表id | sheet_id | hrjx.pmSheet.Sheet |
| 8 | stepid | 步骤id | stepid | hrjx.pmPhaseFlow.PhaseFlowStep |
| 9 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
