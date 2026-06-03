---
tags: [BIP, metadata, hrjx, PhaseFlowPerformanceSummaryStep]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 绩效汇总流程步骤明细子表 (hrjx.pmPhaseFlow.PhaseFlowPerformanceSummaryStep)

> Platform: BIP V5 | Table: phase_flowstep | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 绩效汇总流程步骤明细子表 |
| uri | hrjx.pmPhaseFlow.PhaseFlowPerformanceSummaryStep |
| tableName | phase_flowstep |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | hrjx.pmPhaseFlow.PhaseFlowStep |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

---

## All Fields (32)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | appealFlowId | 申诉流程ID | appeal_flow_id | quote | hrjx.pmPhaseFlow.PhaseFlowDef |  |  | nullable |
| 2 | appealTimes | 申诉次数 | appeal_times | int | Integer |  |  | nullable |
| 3 | autoenddate | 自动结束时间 | autoenddate | timestamp | Timestamp |  |  | nullable |
| 4 | autostartdate | 自动开始时间 | autostartdate | timestamp | Timestamp |  |  | nullable |
| 5 | bizPhaseTypeId | 阶段类型id | biz_phase_type_id | quote | hrjx.pmPhaseFlow.PhaseBizType |  |  | nullable |
| 6 | description | 描述 | description | text | String |  |  | nullable |
| 7 | execroleid | 执行角色id | execroleid | text | String |  |  | nullable |
| 8 | flowEndTakeValueType | 步骤结束取值方式 | flow_end_take_value_type | int | Integer |  |  | nullable |
| 9 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 10 | ifSkip | 是否跳过 | if_skip | int | Integer |  |  | nullable |
| 11 | isallindis | 是否全部指标 | isallindis | int | Integer |  |  | nullable |
| 12 | isallowmodifysheet | 审核时是否允许修改考核表 | isallowmodifysheet | int | Integer |  |  | nullable |
| 13 | isappeal | 结果申诉 | isappeal | int | Integer |  |  | nullable |
| 14 | isappraise | 评估时是否需要评分 | isappraise | int | Integer |  |  | nullable |
| 15 | ismodifyassess | 评估时是否修改考核表 | ismodifyassess | int | Integer |  |  | nullable |
| 16 | isstandard | 是否开启评分限定规则 | isstandard | int | Integer |  |  | nullable |
| 17 | matchRules | 匹配规则 | match_rules | text | String |  |  | nullable |
| 18 | name | 阶段名称 | name | text | String |  |  | isName,nullable |
| 19 | noticeScope | 通知范围 | notice_scope | text | String |  |  | nullable |
| 20 | phasedFlowDefId | 流程id | phased_flow_def_id | quote | hrjx.pmPhaseFlow.PhaseFlowDef |  |  | nullable |
| 21 | publishScope | 发布范围 | publish_scope | text | String |  |  | nullable |
| 22 | publishType | 结束前结果发布方式 | publish_type | short | Short |  |  | nullable |
| 23 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 24 | scoreRatio | 默认评分比例 | score_ratio | text | String |  |  | nullable |
| 25 | showOrder | 显示顺序 | show_order | int | Integer |  |  | nullable |
| 26 | tplid | UI模板id | tplid | text | String |  |  | nullable |
| 27 | transferType | 流转类型 | transfer_type | text | String |  |  | nullable |
| 28 | type | 阶段类型 | type | text | String |  |  | nullable |
| 29 | weight | 权重 | weight | number | Decimal |  |  | nullable |
| 30 | weightShareType | 权重分配方式 | weight_share_type | int | Integer |  |  | nullable |
| 31 | weightassigntype | 评估时角色无执行人时权重分配方式 | weightassigntype | int | Integer |  |  | nullable |
| 32 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | appealFlowId | 申诉流程ID | appeal_flow_id | hrjx.pmPhaseFlow.PhaseFlowDef |
| 2 | bizPhaseTypeId | 阶段类型id | biz_phase_type_id | hrjx.pmPhaseFlow.PhaseBizType |
| 3 | phasedFlowDefId | 流程id | phased_flow_def_id | hrjx.pmPhaseFlow.PhaseFlowDef |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
