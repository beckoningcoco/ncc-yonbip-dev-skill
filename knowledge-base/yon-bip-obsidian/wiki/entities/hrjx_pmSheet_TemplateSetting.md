---
tags: [BIP, metadata, hrjx, TemplateSetting]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 绩效模版-流转步骤设置 (hrjx.pmSheet.TemplateSetting)

> Platform: BIP V5 | Table: pm_template_setting | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 绩效模版-流转步骤设置 |
| uri | hrjx.pmSheet.TemplateSetting |
| tableName | pm_template_setting |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |

---

## All Fields (26)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | bizPhaseTypeId | 预制定义的阶段id | biz_phase_type_id | quote | hrjx.pmPhaseFlow.PhaseBizType |  |  | nullable |
| 2 | blockid | 考核部分id | blockid | quote | hrjx.pmSheet.TemplateBlock |  |  | nullable |
| 3 | defid | 绩效流程id | defid | quote | hrjx.pmPhaseFlow.PhaseFlowDef |  |  | nullable |
| 4 | dispSeq | 排序 | disp_seq | int | Integer |  |  | nullable |
| 5 | evalueteType | 评估方式 | evaluete_type | int | Integer |  |  | nullable |
| 6 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 7 | indiParent | 指标分类 | indi_parent | quote | hrjx.pmCore.IndicatorClass |  |  | nullable |
| 8 | indicatorTemplateId | 指标模板id | indicator_template_id | quote | hrjx.pmSheet.TemplateIndiSet |  |  | nullable |
| 9 | indicatorTemplateIndiId | 指标模板中指标id | indicator_template_indiid | quote | hrjx.pmSheet.SheetIndicator |  |  | nullable |
| 10 | isAdjustLevel | 调整等级 | is_adjust_level | int | Integer |  |  | nullable |
| 11 | isAdjustScore | 调整总分 | is_adjust_score | int | Integer |  |  | nullable |
| 12 | isAppraiseArea | 是否按当前区域评分 | is_appraise_area | int | Integer |  |  | nullable |
| 13 | isLookScoreDetail | 是否查看评分明细 | is_look_score_detail | text | String |  |  | nullable |
| 14 | iscollect | 数据采集 | iscollect | int | Integer |  |  | nullable |
| 15 | isviewpre | 允许查看前轮综合评价 | isviewpre | text | String |  |  | nullable |
| 16 | isvisible | 对该部分可见 | isvisible | int | Integer |  |  | nullable |
| 17 | partid | 模板区块id | partid | quote | hrjx.pmSheet.TemplatePart |  |  | nullable |
| 18 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 19 | roleList | 绩效模版-执行角色 | - | - | hrjx.pmSheet.TemplateSettingRole |  |  |  |
| 20 | scoreType | 打分设置 | score_type | int | Integer |  |  | nullable |
| 21 | showresult | 显示分数/等级枚举 | showresult | text | String |  |  | nullable |
| 22 | stepid | 绩效流程步骤id | stepid | quote | hrjx.pmPhaseFlow.PhaseFlowStep |  |  | nullable |
| 23 | templateid | 绩效模板id | templateid | quote | hrjx.pmSheet.Template |  |  | nullable |
| 24 | tenant | 租户ID | tenant_id | text | String |  | Y | nullable,uiHide |
| 25 | viewrule | 评分显示方式 | viewrule | int | Integer |  |  | nullable |
| 26 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (10)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | bizPhaseTypeId | 预制定义的阶段id | biz_phase_type_id | hrjx.pmPhaseFlow.PhaseBizType |
| 2 | blockid | 考核部分id | blockid | hrjx.pmSheet.TemplateBlock |
| 3 | defid | 绩效流程id | defid | hrjx.pmPhaseFlow.PhaseFlowDef |
| 4 | indiParent | 指标分类 | indi_parent | hrjx.pmCore.IndicatorClass |
| 5 | indicatorTemplateId | 指标模板id | indicator_template_id | hrjx.pmSheet.TemplateIndiSet |
| 6 | indicatorTemplateIndiId | 指标模板中指标id | indicator_template_indiid | hrjx.pmSheet.SheetIndicator |
| 7 | partid | 模板区块id | partid | hrjx.pmSheet.TemplatePart |
| 8 | stepid | 绩效流程步骤id | stepid | hrjx.pmPhaseFlow.PhaseFlowStep |
| 9 | templateid | 绩效模板id | templateid | hrjx.pmSheet.Template |
| 10 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | roleList | 绩效模版-执行角色 | hrjx.pmSheet.TemplateSettingRole |
