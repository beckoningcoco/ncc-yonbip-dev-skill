---
tags: [BIP, metadata, hrjx, ResultReviewEvaSettingRole]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 结果审核考核关系子 (hrjx.pmScheme.ResultReviewEvaSettingRole)

> Platform: BIP V5 | Table: pm_result_review_eva_setting_role | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 结果审核考核关系子 |
| uri | hrjx.pmScheme.ResultReviewEvaSettingRole |
| tableName | pm_result_review_eva_setting_role |
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

## All Fields (20)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 2 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 3 | deptid | 部门id | deptid | quote | org.func.AdminOrg |  |  | nullable |
| 4 | dispSeq | 顺序 | disp_seq | int | Integer |  |  | nullable |
| 5 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 6 | isAdjustLevel | 调整等级 | is_adjust_level | int | Integer |  |  | nullable |
| 7 | isAdjustScore | 调整总分 | is_adjust_score | int | Integer |  |  | nullable |
| 8 | isLookScoreDetail | 是否查看评分明细 | is_look_score_detail | int | Integer |  |  | nullable |
| 9 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 10 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 11 | phasedFlowDefId | 绩效流程id | phased_flow_def_id | quote | hrjx.pmPhaseFlow.PhaseFlowDef |  |  | nullable |
| 12 | psnPcTplid | 个人PC端UI模版id | psn_pc_tplid | quote | hrjx.pmCore.BilltemplateNewModelBase |  |  | nullable |
| 13 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 14 | resultReviewId | 结果审核id | result_review_id | text | String |  |  | nullable |
| 15 | resultReviewTemplateSettingId | 考核关系主表 | result_review_template_setting_id | quote | hrjx.pmScheme.ResultReviewEvaSetting |  |  | nullable |
| 16 | roleid | 执行角色id | roleid | quote | hrjx.pmExecutionRole.PmExecutionRole |  |  | nullable |
| 17 | staffid | 员工id | staffid | quote | hred.staff.Staff |  |  | nullable |
| 18 | stepid | 步骤id | stepid | quote | hrjx.pmPhaseFlow.PhaseFlowStep |  |  | nullable |
| 19 | turn | 轮次 | turn | int | Integer |  |  | nullable |
| 20 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (10)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | deptid | 部门id | deptid | org.func.AdminOrg |
| 3 | modifier | 修改人 | modifier | base.user.BipUser |
| 4 | phasedFlowDefId | 绩效流程id | phased_flow_def_id | hrjx.pmPhaseFlow.PhaseFlowDef |
| 5 | psnPcTplid | 个人PC端UI模版id | psn_pc_tplid | hrjx.pmCore.BilltemplateNewModelBase |
| 6 | resultReviewTemplateSettingId | 考核关系主表 | result_review_template_setting_id | hrjx.pmScheme.ResultReviewEvaSetting |
| 7 | roleid | 执行角色id | roleid | hrjx.pmExecutionRole.PmExecutionRole |
| 8 | staffid | 员工id | staffid | hred.staff.Staff |
| 9 | stepid | 步骤id | stepid | hrjx.pmPhaseFlow.PhaseFlowStep |
| 10 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
