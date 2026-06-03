---
tags: [BIP, metadata, hrjx, TemplateMtrEvaluationSettingRole]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 绩效模版-中期回顾综合评价区块执行角色 (hrjx.pmSheet.TemplateMtrEvaluationSettingRole)

> Platform: BIP V5 | Table: pm_template_settingrole | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 绩效模版-中期回顾综合评价区块执行角色 |
| uri | hrjx.pmSheet.TemplateMtrEvaluationSettingRole |
| tableName | pm_template_settingrole |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | hrjx.pmSheet.TemplateSettingRole |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

---

## All Fields (48)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | appraiserelid | 考核关系id | appraiserelid | quote | hrjx.pmCore.AppraiseRelSetting |  |  | nullable |
| 2 | bizPhaseTypeId | 预制定义的阶段id | biz_phase_type_id | quote | hrjx.pmPhaseFlow.PhaseBizType |  |  | nullable |
| 3 | blockid | 考核部分id | blockid | quote | hrjx.pmSheet.TemplateBlock |  |  | nullable |
| 4 | deptId | 部门id | dept_id | quote | org.func.AdminOrg |  |  | nullable |
| 5 | dispSeq | 排序 | disp_seq | int | Integer |  |  | nullable |
| 6 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 7 | indiParent | 指标分类 | indi_parent | quote | hrjx.pmCore.IndicatorClass |  |  | nullable |
| 8 | indicatorTemplateId | 指标模板id | indicator_template_id | quote | hrjx.pmSheet.TemplateIndiSet |  |  | nullable |
| 9 | indicatorTemplateIndiId | 指标模板中指标id | indicator_template_indiid | quote | hrjx.pmSheet.SheetIndicator |  |  | nullable |
| 10 | isAddIndi | 是否可以新增定性指标 | is_add_indi | int | Integer |  |  | nullable |
| 11 | isAddIndi2 | 是否允许新增定量指标 | is_add_indi2 | int | Integer |  |  | nullable |
| 12 | isAddNewClass | 是否可以新增子区域 | is_add_new_class | int | Integer |  |  | nullable |
| 13 | isAdjustLevel | 调整等级 | is_adjust_level | int | Integer |  |  | nullable |
| 14 | isAdjustScore | 调整总分 | is_adjust_score | int | Integer |  |  | nullable |
| 15 | isAppraiseArea | 是否按当前区域评分 | is_appraise_area | int | Integer |  |  | nullable |
| 16 | isCheckIndi | 是否可以查看已有指标 | is_check_indi | int | Integer |  |  | nullable |
| 17 | isCopyPreProcessScore | 是否可以复制前轮得分 | is_copy_pre_process_score | int | Integer |  |  | nullable |
| 18 | isDeleteIndi | 是否可以删除已有指标 | is_delete_indi | int | Integer |  |  | nullable |
| 19 | isEditIndi | 是否可以编辑已有指标 | is_edit_indi | int | Integer |  |  | nullable |
| 20 | isExport | 导出 | is_export | int | Integer |  |  | nullable |
| 21 | isFromIndiTemplate | 是否可以从指标库引入 | is_from_indi_template | int | Integer |  |  | nullable |
| 22 | isLookScoreDetail | 是否查看评分明细 | is_look_score_detail | int | Integer |  |  | nullable |
| 23 | isMotifyProcess | 是否可以修改考核流程 | is_motify_process | int | Integer |  |  | nullable |
| 24 | isOtherItem | 填报加减分项 | is_other_item | int | Integer |  |  | nullable |
| 25 | isReviewData | 重新审核数据 | is_review_data | text | String |  |  | nullable |
| 26 | isUserAction | 是否用户操作 | is_user_action | int | Integer |  |  | nullable |
| 27 | isshowlastscore | 评估时是否带出前轮评分 | isshowlastscore | int | Integer |  |  | nullable |
| 28 | isvisible | 对该部分可见 | isvisible | int | Integer |  |  | nullable |
| 29 | multiMobileTplid | 批量移动端UI模版id | multi_mobile_tplid | quote | hrjx.pmCore.BilltemplateNewModelBase |  |  | nullable |
| 30 | multiPcTplid | 批量PC端UI模版id | multi_pc_tplid | quote | hrjx.pmCore.BilltemplateNewModelBase |  |  | nullable |
| 31 | objtype | 操作类型 | objtype | int | Integer |  |  | nullable |
| 32 | partid | 模板区块id | partid | quote | hrjx.pmSheet.TemplatePart |  |  | nullable |
| 33 | postid | 指定人员岗位 | postid | text | String |  |  | nullable |
| 34 | psnMobileTplid | 个人移动端UI模版id | psn_mobile_tplid | quote | hrjx.pmCore.BilltemplateNewModelBase |  |  | nullable |
| 35 | psnPcTplid | 个人PC端UI模版id | psn_pc_tplid | quote | hrjx.pmCore.BilltemplateNewModelBase |  |  | nullable |
| 36 | psnweight | 轮次内权重占比 | psnweight | number | Decimal |  |  | nullable |
| 37 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 38 | roleType | 角色类型 | role_type | int | Integer |  |  | nullable |
| 39 | roleid | 角色id | roleid | quote | hrjx.pmExecutionRole.PmExecutionRole |  |  | nullable |
| 40 | scoreType | 打分设置 | score_type | int | Integer |  |  | nullable |
| 41 | staffid | 指定人员id | staffid | quote | hred.staff.Staff |  |  | nullable |
| 42 | templateid | 绩效模板id | templateid | quote | hrjx.pmSheet.Template |  |  | nullable |
| 43 | templatesetid | 流转设置id | templatesetid | quote | hrjx.pmSheet.TemplateMtrEvaluationSetting |  |  | nullable |
| 44 | tenant | 租户ID | tenant_id | text | String |  | Y | nullable,uiHide |
| 45 | turn | 轮次 | turn | int | Integer |  |  | nullable |
| 46 | turnweight | 轮次权重 | turnweight | number | Decimal |  |  | nullable |
| 47 | weight | 权重 | weight | number | Decimal |  |  | nullable |
| 48 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (17)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | appraiserelid | 考核关系id | appraiserelid | hrjx.pmCore.AppraiseRelSetting |
| 2 | bizPhaseTypeId | 预制定义的阶段id | biz_phase_type_id | hrjx.pmPhaseFlow.PhaseBizType |
| 3 | blockid | 考核部分id | blockid | hrjx.pmSheet.TemplateBlock |
| 4 | deptId | 部门id | dept_id | org.func.AdminOrg |
| 5 | indiParent | 指标分类 | indi_parent | hrjx.pmCore.IndicatorClass |
| 6 | indicatorTemplateId | 指标模板id | indicator_template_id | hrjx.pmSheet.TemplateIndiSet |
| 7 | indicatorTemplateIndiId | 指标模板中指标id | indicator_template_indiid | hrjx.pmSheet.SheetIndicator |
| 8 | multiMobileTplid | 批量移动端UI模版id | multi_mobile_tplid | hrjx.pmCore.BilltemplateNewModelBase |
| 9 | multiPcTplid | 批量PC端UI模版id | multi_pc_tplid | hrjx.pmCore.BilltemplateNewModelBase |
| 10 | partid | 模板区块id | partid | hrjx.pmSheet.TemplatePart |
| 11 | psnMobileTplid | 个人移动端UI模版id | psn_mobile_tplid | hrjx.pmCore.BilltemplateNewModelBase |
| 12 | psnPcTplid | 个人PC端UI模版id | psn_pc_tplid | hrjx.pmCore.BilltemplateNewModelBase |
| 13 | roleid | 角色id | roleid | hrjx.pmExecutionRole.PmExecutionRole |
| 14 | staffid | 指定人员id | staffid | hred.staff.Staff |
| 15 | templateid | 绩效模板id | templateid | hrjx.pmSheet.Template |
| 16 | templatesetid | 流转设置id | templatesetid | hrjx.pmSheet.TemplateMtrEvaluationSetting |
| 17 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
