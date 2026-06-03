---
tags: [BIP, metadata, hrjx, ResultReview]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 结果审核 (hrjx.pmScheme.ResultReview)

> Platform: BIP V5 | Table: pm_result_review | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 结果审核 |
| uri | hrjx.pmScheme.ResultReview |
| tableName | pm_result_review |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 树型结构 (ITree) | base.itf.ITree |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 4 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |

---

## All Fields (30)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | EvaObjectList | 考核对象实体 | - | - | hrjx.pmScheme.EvaObject |  |  |  |
| 2 | adminList | 绩效单元负责人实体 | - | - | hrjx.pmScheme.SchemeAdmin |  |  |  |
| 3 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 4 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 5 | dispSeq | 步骤轮次排序 | disp_seq | int | Integer |  |  | nullable |
| 6 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 7 | isAuto | 是否自动 | is_auto | int | Integer |  |  | nullable |
| 8 | isContainNext | 是否包含下级 | is_contain_next | text | String |  |  | nullable |
| 9 | isEnd | 是否末级 | isEnd | switch | Boolean |  |  | nullable |
| 10 | level | 层级 | level | int | Integer |  |  | nullable |
| 11 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 12 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 13 | name | 审核名称 | name | text | String |  |  | isName,nullable |
| 14 | oDistribution | 强制分布主实体 | - | - | hrjx.pmScheme.Distribution |  |  |  |
| 15 | parent | 上级单元 | parent_id | quote | hrjx.pmScheme.ResultReview |  |  | nullable |
| 16 | path | 路径 | path | text | String |  |  | nullable |
| 17 | planid | 绩效计划id | planid | quote | hrjx.pmPlan.PmPlan |  |  | nullable |
| 18 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 19 | remark | 模板描述 | remark | text | String |  |  | nullable |
| 20 | resultEvaSettingList | 结果审核考核关系主 | - | - | hrjx.pmScheme.ResultReviewEvaSetting |  |  |  |
| 21 | reviewcode | 编码 | reviewcode | text | String |  |  | nullable |
| 22 | reviewstate | 状态 | reviewstate | int | Integer |  |  | nullable |
| 23 | schemeid | 方案主键 | schemeid | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 24 | schemestate | 状态 | schemestate | int | Integer |  |  | nullable |
| 25 | sort | 排序号 | sort_num | int | Integer |  |  | nullable |
| 26 | stepId | 当前状态 | step_id | quote | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |  |  | nullable |
| 27 | templateid | 审核模板id | templateid | quote | hrjx.pmSheet.Template |  |  | nullable |
| 28 | tenant | 租户ID | tenant_id | text | String |  | Y | nullable,uiHide |
| 29 | turn | 当前轮次 | turn | int | Integer |  |  | nullable |
| 30 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (8)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | modifier | 修改人 | modifier | base.user.BipUser |
| 3 | parent | 上级单元 | parent_id | hrjx.pmScheme.ResultReview |
| 4 | planid | 绩效计划id | planid | hrjx.pmPlan.PmPlan |
| 5 | schemeid | 方案主键 | schemeid | hrjx.pmScheme.Scheme |
| 6 | stepId | 当前状态 | step_id | hrjx.pmPhaseFlow.PhaseFlowStepRuntime |
| 7 | templateid | 审核模板id | templateid | hrjx.pmSheet.Template |
| 8 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (4)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | oDistribution | 强制分布主实体 | hrjx.pmScheme.Distribution |
| 2 | EvaObjectList | 考核对象实体 | hrjx.pmScheme.EvaObject |
| 3 | adminList | 绩效单元负责人实体 | hrjx.pmScheme.SchemeAdmin |
| 4 | resultEvaSettingList | 结果审核考核关系主 | hrjx.pmScheme.ResultReviewEvaSetting |
