---
tags: [BIP, metadata, hrjx, PhaseTask]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务阶段任务 (hrjx.pmPhaseFlow.PhaseTask)

> Platform: BIP V5 | Table: phase_task | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 业务阶段任务 |
| uri | hrjx.pmPhaseFlow.PhaseTask |
| tableName | phase_task |
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

## All Fields (26)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | agent | 代理人 | agent | quote | hred.staff.Staff |  |  | nullable |
| 2 | bizId | 业务单据id | biz_id | text | String |  |  | nullable |
| 3 | bizInfo | 业务信息 | biz_info | text | String |  |  | nullable |
| 4 | bizPhaseDefId | 流程阶段id | biz_phase_def_id | quote | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |  |  | nullable |
| 5 | bizPhaseType | 步骤类型 | biz_phase_type | text | String |  |  | nullable |
| 6 | bizPhaseTypeId | 阶段类型id | biz_phase_type_id | quote | hrjx.pmPhaseFlow.PhaseBizType |  |  | nullable |
| 7 | checkidea | 审核意见 | checkidea | text | String |  |  | nullable |
| 8 | define1 | 扩展字段一 | define1 | text | String |  |  | nullable |
| 9 | define2 | 扩展字段二 | define2 | text | String |  |  | nullable |
| 10 | define3 | 扩展字段三 | define3 | text | String |  |  | nullable |
| 11 | disposetime | 处理时间 | disposetime | timestamp | Timestamp |  |  | nullable |
| 12 | handler | 实际处理人 | handler | quote | hred.staff.Staff |  |  | nullable |
| 13 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 14 | ismodify | 当前轮次是否已修改 | ismodify | int | Integer |  |  | nullable |
| 15 | isreject | 是否退回 | is_reject | int | Integer |  |  | nullable |
| 16 | phasedFlowDefId | 流程id | phased_flow_def_id | quote | hrjx.pmPhaseFlow.PhaseFlowDefRuntime |  |  | nullable |
| 17 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 18 | relationList | 流程与代理人关联表 | - | - | hrjx.pmPhaseFlow.PhaseEmpagentRelation |  |  |  |
| 19 | resultReviewId | 结果审核id | result_review_id | quote | hrjx.pmScheme.ResultReview |  |  | nullable |
| 20 | sceneId | 场景id | scene_id | quote | hrjx.pmPhaseFlow.PhaseBizScene |  |  | nullable |
| 21 | schemeid | 绩效单元id | schemeid | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 22 | sheetid | 量表id | sheetid | quote | hrjx.pmSheet.Sheet |  |  | nullable |
| 23 | staffId | 人员id | staff_id | quote | hred.staff.Staff |  |  | nullable |
| 24 | taskStatus | 任务状态 | task_status | text | String |  |  | nullable |
| 25 | turn | 轮次 | turn | int | Integer |  |  | nullable |
| 26 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (11)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | agent | 代理人 | agent | hred.staff.Staff |
| 2 | bizPhaseDefId | 流程阶段id | biz_phase_def_id | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |
| 3 | bizPhaseTypeId | 阶段类型id | biz_phase_type_id | hrjx.pmPhaseFlow.PhaseBizType |
| 4 | handler | 实际处理人 | handler | hred.staff.Staff |
| 5 | phasedFlowDefId | 流程id | phased_flow_def_id | hrjx.pmPhaseFlow.PhaseFlowDefRuntime |
| 6 | resultReviewId | 结果审核id | result_review_id | hrjx.pmScheme.ResultReview |
| 7 | sceneId | 场景id | scene_id | hrjx.pmPhaseFlow.PhaseBizScene |
| 8 | schemeid | 绩效单元id | schemeid | hrjx.pmScheme.Scheme |
| 9 | sheetid | 量表id | sheetid | hrjx.pmSheet.Sheet |
| 10 | staffId | 人员id | staff_id | hred.staff.Staff |
| 11 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | relationList | 流程与代理人关联表 | hrjx.pmPhaseFlow.PhaseEmpagentRelation |
