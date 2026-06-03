---
tags: [BIP, metadata, hrjx, TemplateBlock]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 绩效模板考核部分 (hrjx.pmSheet.TemplateBlock)

> Platform: BIP V5 | Table: pm_template_block | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 绩效模板考核部分 |
| uri | hrjx.pmSheet.TemplateBlock |
| tableName | pm_template_block |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 3 | 树型结构 (ITree) | base.itf.ITree |
| 4 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |

---

## All Fields (52)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | blockMobileTplid | 手机区域字段模板id | block_mobile_tplid | quote | hrjx.pmCore.BilltemplateNewModelBase |  |  | nullable |
| 2 | blockPcTplid | 电脑区域字段模板id | block_pc_tplid | quote | hrjx.pmCore.BilltemplateNewModelBase |  |  | nullable |
| 3 | blockScoreway | 考核部分算分方式 | block_scoreway | text | String |  |  | nullable |
| 4 | blockSetting | 绩效模版-流转步骤设置 | - | - | hrjx.pmSheet.TemplateSetting |  |  |  |
| 5 | copyId | 复制来源考核部分id | copy_id | quote | hrjx.pmSheet.TemplateBlock |  |  | nullable |
| 6 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 7 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 8 | dispSeq | 排序 | disp_seq | int | Integer |  |  | nullable |
| 9 | dynamicLevelZone | 动态子区域 | dynamic_level_zone | int | Integer |  |  | nullable |
| 10 | endLevelZone | 末级子区域 | end_level_zone | int | Integer |  |  | nullable |
| 11 | finalScore | 区域最终分 | final_score | number | Decimal |  |  | nullable |
| 12 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 13 | indiList | 量表对应指标表 | - | - | hrjx.pmSheet.SheetIndicator |  |  |  |
| 14 | indiScoreruleId | 下级指标评分规则 | indi_scorerule_id | quote | hrjx.pmCore.ScoreRule |  |  | nullable |
| 15 | indiScoreway | 指标算分方式 | indi_scoreway | text | String |  |  | nullable |
| 16 | indiTypeWeightType | 下级指标分类权重 | indi_type_weight_type | int | Integer |  |  | nullable |
| 17 | indicatorTemplateId | 指标模板id | indicator_template_id | quote | hrjx.pmSheet.TemplateIndiSet |  |  | nullable |
| 18 | indiweightType | 指标权重类型 | indiweight_type | text | String |  |  | nullable |
| 19 | isEnd | 是否末级 | isEnd | switch | Boolean |  |  | nullable |
| 20 | isMultiLevel | 是否考核部分多层级 | is_multi_level | int | Integer |  |  | nullable |
| 21 | isaddsamelevel | 是否允许添加同级 | isaddsamelevel | int | Integer |  |  | nullable |
| 22 | level | 层级 | level | int | Integer |  |  | nullable |
| 23 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 24 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 25 | multiMobileTplid | 移动端多人评估模板 | multi_mobile_tplid | quote | hrjx.pmCore.BilltemplateNewModelBase |  |  | nullable |
| 26 | multiPcTplid | 电脑端多人评估模板 | multi_pc_tplid | quote | hrjx.pmCore.BilltemplateNewModelBase |  |  | nullable |
| 27 | name | 考核部分名称 | name | text | String |  |  | nullable |
| 28 | nextLevelWeight | 下级区域权重类型 | next_level_weight | int | Integer |  |  | nullable |
| 29 | originalid | 原始考核部分id | originalid | quote | hrjx.pmSheet.TemplateBlock |  |  | nullable |
| 30 | parent | 上级分类 | parent_id | long | Long |  |  | nullable |
| 31 | parentId | 父节点考核部分id | parent_id | quote | hrjx.pmSheet.TemplateBlock |  |  | nullable |
| 32 | partid | 区域id | partid | quote | hrjx.pmSheet.TemplatePart |  |  | nullable |
| 33 | path | 路径 | path | text | String |  |  | nullable |
| 34 | psnMobileTplid | 移动端单人评估模板 | psn_mobile_tplid | quote | hrjx.pmCore.BilltemplateNewModelBase |  |  | nullable |
| 35 | psnPcTplid | 电脑端单人评估模板 | psn_pc_tplid | quote | hrjx.pmCore.BilltemplateNewModelBase |  |  | nullable |
| 36 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 37 | remark | 描述信息 | remark | text | String |  |  | nullable |
| 38 | schemeid | 方案信息id | schemeid | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 39 | scoreruleid | 评分规则id | scoreruleid | quote | hrjx.pmCore.ScoreRule |  |  | nullable |
| 40 | sheetIndiList | 量表对应指标表 | - | - | hrjx.pmSheet.SheetIndicator |  |  |  |
| 41 | sheetid | 量表id | sheetid | quote | hrjx.pmSheet.Sheet |  |  | nullable |
| 42 | sort | 排序号 | sort_num | int | Integer |  |  | nullable |
| 43 | templateblockid | 设置态子区域id | templateblockid | quote | hrjx.pmSheet.TemplateBlock |  |  | nullable |
| 44 | templateid | 绩效模板id | templateid | quote | hrjx.pmSheet.Template |  |  | nullable |
| 45 | tenant | 租户ID | tenant_id | text | String |  | Y | nullable,uiHide |
| 46 | tplid | UI模版id | tplid | text | String |  |  | nullable |
| 47 | viewgrade | 查看等级 | viewgrade | int | Integer |  |  | nullable |
| 48 | viewrule | 查看等级规则 | viewrule | int | Integer |  |  | nullable |
| 49 | viewscore | 查看总分 | viewscore | int | Integer |  |  | nullable |
| 50 | weight | 考核部分权重 | weight | number | Decimal |  |  | nullable |
| 51 | weightType | 下级区域权重 | weight_type | text | String |  |  | nullable |
| 52 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (20)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | blockMobileTplid | 手机区域字段模板id | block_mobile_tplid | hrjx.pmCore.BilltemplateNewModelBase |
| 2 | blockPcTplid | 电脑区域字段模板id | block_pc_tplid | hrjx.pmCore.BilltemplateNewModelBase |
| 3 | copyId | 复制来源考核部分id | copy_id | hrjx.pmSheet.TemplateBlock |
| 4 | creator | 创建人 | creator | base.user.BipUser |
| 5 | indiScoreruleId | 下级指标评分规则 | indi_scorerule_id | hrjx.pmCore.ScoreRule |
| 6 | indicatorTemplateId | 指标模板id | indicator_template_id | hrjx.pmSheet.TemplateIndiSet |
| 7 | modifier | 修改人 | modifier | base.user.BipUser |
| 8 | multiMobileTplid | 移动端多人评估模板 | multi_mobile_tplid | hrjx.pmCore.BilltemplateNewModelBase |
| 9 | multiPcTplid | 电脑端多人评估模板 | multi_pc_tplid | hrjx.pmCore.BilltemplateNewModelBase |
| 10 | originalid | 原始考核部分id | originalid | hrjx.pmSheet.TemplateBlock |
| 11 | parentId | 父节点考核部分id | parent_id | hrjx.pmSheet.TemplateBlock |
| 12 | partid | 区域id | partid | hrjx.pmSheet.TemplatePart |
| 13 | psnMobileTplid | 移动端单人评估模板 | psn_mobile_tplid | hrjx.pmCore.BilltemplateNewModelBase |
| 14 | psnPcTplid | 电脑端单人评估模板 | psn_pc_tplid | hrjx.pmCore.BilltemplateNewModelBase |
| 15 | schemeid | 方案信息id | schemeid | hrjx.pmScheme.Scheme |
| 16 | scoreruleid | 评分规则id | scoreruleid | hrjx.pmCore.ScoreRule |
| 17 | sheetid | 量表id | sheetid | hrjx.pmSheet.Sheet |
| 18 | templateblockid | 设置态子区域id | templateblockid | hrjx.pmSheet.TemplateBlock |
| 19 | templateid | 绩效模板id | templateid | hrjx.pmSheet.Template |
| 20 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (3)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | indiList | 量表对应指标表 | hrjx.pmSheet.SheetIndicator |
| 2 | blockSetting | 绩效模版-流转步骤设置 | hrjx.pmSheet.TemplateSetting |
| 3 | sheetIndiList | 量表对应指标表 | hrjx.pmSheet.SheetIndicator |
