---
tags: [BIP, metadata, hrjx, TemplateEvaluationPart]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 绩效模板综合评价区块表 (hrjx.pmSheet.TemplateEvaluationPart)

> Platform: BIP V5 | Table: pm_template_part | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 绩效模板综合评价区块表 |
| uri | hrjx.pmSheet.TemplateEvaluationPart |
| tableName | pm_template_part |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | hrjx.pmSheet.TemplatePart |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

---

## All Fields (41)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | blockMobileTplid | 手机区域字段模板id | block_mobile_tplid | quote | hrjx.pmCore.BilltemplateNewModelBase |  |  | nullable |
| 2 | blockPcTplid | 电脑区域字段模板id | block_pc_tplid | quote | hrjx.pmCore.BilltemplateNewModelBase |  |  | nullable |
| 3 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 4 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 5 | dispSeq | 排序 | disp_seq | int | Integer |  |  | nullable |
| 6 | distributionRange | 分布范围 | distribution_range | text | String |  |  | nullable |
| 7 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 8 | indiScoreway | 指标算分方式 | indi_scoreway | int | Integer |  |  | nullable |
| 9 | indiauthority | 指标权限设置 | indiauthority | int | Integer |  |  | nullable |
| 10 | indiweightType | 指标权重类型 | indiweight_type | int | Integer |  |  | nullable |
| 11 | isMultiLevel | 是否考核部分多层级 | is_multi_level | int | Integer |  |  | nullable |
| 12 | isannex | 是否附件说明 | isannex | int | Integer |  |  | nullable |
| 13 | isshowperiod | 是否显示绩效期间 | isshowperiod | int | Integer |  |  | nullable |
| 14 | isshowschemename | 是否显示方案名称 | isshowschemename | int | Integer |  |  | nullable |
| 15 | isshowschemeremark | 是否显示方案说明 | isshowschemeremark | int | Integer |  |  | nullable |
| 16 | mantissaType | 尾数处理 | mantissa_type | text | String |  |  | nullable |
| 17 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 18 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 19 | mtrSettingList | 绩效模版-中期回顾综合评价区块流转步骤设置 | - | - | hrjx.pmSheet.TemplateMtrEvaluationSetting |  |  |  |
| 20 | multiMobileTplid | 批量移动端UI模版id | multi_mobile_tplid | quote | hrjx.pmCore.BilltemplateNewModelBase |  |  | nullable |
| 21 | multiPcTplid | 批量PC端UI模版id | multi_pc_tplid | quote | hrjx.pmCore.BilltemplateNewModelBase |  |  | nullable |
| 22 | name | 区块名称 | name | text | String |  |  | nullable |
| 23 | nextLevelScoreruleid | 下级指标评分规则 | next_level_scorerule_id | quote | hrjx.pmCore.ScoreRule |  |  | nullable |
| 24 | parttype | 区块类型 | parttype | int | Integer |  |  | nullable |
| 25 | psnMobileTplid | 个人移动端UI模版id | psn_mobile_tplid | quote | hrjx.pmCore.BilltemplateNewModelBase |  |  | nullable |
| 26 | psnPcTplid | 个人PC端UI模版id | psn_pc_tplid | quote | hrjx.pmCore.BilltemplateNewModelBase |  |  | nullable |
| 27 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 28 | remark | 描述 | remark | text | String |  |  | nullable |
| 29 | scoreruleid | 评分规则id | scoreruleid | quote | hrjx.pmCore.ScoreRule |  |  | nullable |
| 30 | scoreway | 算分方式 | scoreway | int | Integer |  |  | nullable |
| 31 | settingList | 绩效模版-综合评价区块流转步骤设置 | - | - | hrjx.pmSheet.TemplateEvaluationSetting |  |  |  |
| 32 | showParentorg | 查看所属组织 | show_parentorg | int | Integer |  |  | nullable |
| 33 | subScoreway | 下级指标算分方式 | sub_scoreway | int | Integer |  |  | nullable |
| 34 | templateid | 绩效模板id | templateid | quote | hrjx.pmSheet.Template |  |  | nullable |
| 35 | tenant | 租户ID | tenant_id | text | String |  | Y | nullable,uiHide |
| 36 | unitremark | 计划描述 | unitremark | int | Integer |  |  | nullable |
| 37 | viewrule | 查看等级规则 | viewrule | int | Integer |  |  | nullable |
| 38 | weight | 区块权重 | weight | number | Decimal |  |  | nullable |
| 39 | weightSettingType | 权重设置 | weight_setting_type | int | Integer |  |  | nullable |
| 40 | weightType | 区块权重类型 | weight_type | int | Integer |  |  | nullable |
| 41 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (12)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | blockMobileTplid | 手机区域字段模板id | block_mobile_tplid | hrjx.pmCore.BilltemplateNewModelBase |
| 2 | blockPcTplid | 电脑区域字段模板id | block_pc_tplid | hrjx.pmCore.BilltemplateNewModelBase |
| 3 | creator | 创建人 | creator | base.user.BipUser |
| 4 | modifier | 修改人 | modifier | base.user.BipUser |
| 5 | multiMobileTplid | 批量移动端UI模版id | multi_mobile_tplid | hrjx.pmCore.BilltemplateNewModelBase |
| 6 | multiPcTplid | 批量PC端UI模版id | multi_pc_tplid | hrjx.pmCore.BilltemplateNewModelBase |
| 7 | nextLevelScoreruleid | 下级指标评分规则 | next_level_scorerule_id | hrjx.pmCore.ScoreRule |
| 8 | psnMobileTplid | 个人移动端UI模版id | psn_mobile_tplid | hrjx.pmCore.BilltemplateNewModelBase |
| 9 | psnPcTplid | 个人PC端UI模版id | psn_pc_tplid | hrjx.pmCore.BilltemplateNewModelBase |
| 10 | scoreruleid | 评分规则id | scoreruleid | hrjx.pmCore.ScoreRule |
| 11 | templateid | 绩效模板id | templateid | hrjx.pmSheet.Template |
| 12 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | mtrSettingList | 绩效模版-中期回顾综合评价区块流转步骤设置 | hrjx.pmSheet.TemplateMtrEvaluationSetting |
| 2 | settingList | 绩效模版-综合评价区块流转步骤设置 | hrjx.pmSheet.TemplateEvaluationSetting |
