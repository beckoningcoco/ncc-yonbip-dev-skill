---
tags: [BIP, metadata, hrjx, ResultReviewEvaSetting]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 结果审核考核关系主 (hrjx.pmScheme.ResultReviewEvaSetting)

> Platform: BIP V5 | Table: pm_result_review_eva_setting | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 结果审核考核关系主 |
| uri | hrjx.pmScheme.ResultReviewEvaSetting |
| tableName | pm_result_review_eva_setting |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (15)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 2 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 3 | dispSeq | 顺序 | disp_seq | int | Integer |  |  | nullable |
| 4 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 5 | isAdjustLevel | 调整等级 | is_adjust_level | int | Integer |  |  | nullable |
| 6 | isAdjustScore | 调整总分 | is_adjust_score | int | Integer |  |  | nullable |
| 7 | isLookScoreDetail | 是否查看评分明细 | is_look_score_detail | int | Integer |  |  | nullable |
| 8 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 9 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 10 | phasedFlowDefId | 绩效流程id | phased_flow_def_id | quote | hrjx.pmPhaseFlow.PhaseFlowDef |  |  | nullable |
| 11 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 12 | resultEvaSettingRoleList | 结果审核考核关系子 | - | - | hrjx.pmScheme.ResultReviewEvaSettingRole |  |  |  |
| 13 | resultReviewId | 结果审核id | result_review_id | quote | hrjx.pmScheme.ResultReview |  |  | nullable |
| 14 | stepid | 步骤id | stepid | quote | hrjx.pmPhaseFlow.PhaseFlowStep |  |  | nullable |
| 15 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | modifier | 修改人 | modifier | base.user.BipUser |
| 3 | phasedFlowDefId | 绩效流程id | phased_flow_def_id | hrjx.pmPhaseFlow.PhaseFlowDef |
| 4 | resultReviewId | 结果审核id | result_review_id | hrjx.pmScheme.ResultReview |
| 5 | stepid | 步骤id | stepid | hrjx.pmPhaseFlow.PhaseFlowStep |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | resultEvaSettingRoleList | 结果审核考核关系子 | hrjx.pmScheme.ResultReviewEvaSettingRole |
