---
tags: [BIP, metadata, hrjx, SheetIndicator]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 量表对应指标表 (hrjx.pmSheet.SheetIndicator)

> Platform: BIP V5 | Table: pm_sheet_indi | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 量表对应指标表 |
| uri | hrjx.pmSheet.SheetIndicator |
| tableName | pm_sheet_indi |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (50)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | assignid | 指派来源id | assignid | text | String |  |  | nullable |
| 2 | indisource | 指标来源 | indisource | int | Integer |  |  | nullable |
| 3 | indiParent | 指标分类 | indi_parent | quote | hrjx.pmCore.IndicatorClass |  |  | nullable |
| 4 | mainindiid | 主指标id | mainindiid | quote | hrjx.pmCore.Indicator |  |  | nullable |
| 5 | mainindiweight | 主指标权重 | mainindiweight | number | Decimal |  |  | nullable |
| 6 | evalstandard | 评分标准 | evalstandard | text | String |  |  | nullable |
| 7 | indiLevel | 指标等级 | indi_level | text | String |  |  | nullable |
| 8 | indiexplain | 指标说明 | indiexplain | text | String |  |  | nullable |
| 9 | actWeight | 实际权重 | act_weight | number | Decimal |  |  | nullable |
| 10 | indiWeight | 指标权重(%) | indi_weight | number | Decimal |  |  | nullable |
| 11 | scoringmethod | 计分方式 | scoringmethod | int | Integer |  |  | nullable |
| 12 | dispSeq | 顺序 | disp_seq | int | Integer |  |  | nullable |
| 13 | defineCharacter | 特征组 | define_character | UserDefine | hrjx.pmCharacter.SheetIndicatorCharacter |  |  | nullable |
| 14 | indiflag | 是否审核过程中修改过 | indiflag | switch | Boolean |  |  | nullable |
| 15 | scoreRemark | 评分说明 | score_remark | text | String |  |  | nullable |
| 16 | scoreruleid | 指标级评分规则id | scoreruleid | quote | hrjx.pmCore.ScoreRule |  |  | nullable |
| 17 | gaugeid | 公共量表id | gaugeid | quote | hrjx.pmgauge.Gauge |  |  | nullable |
| 18 | indicatorTemplateId | 指标模板id | indicator_template_id | quote | hrjx.pmSheet.TemplateIndiSet |  |  | nullable |
| 19 | indicatorTemplateIndiid | 指标模板指标id | indicator_template_indiid | quote | hrjx.pmSheet.SheetIndicator |  |  | nullable |
| 20 | templateBlockId | 运行态时模板子区域id | template_block_id | quote | hrjx.pmSheet.TemplateBlock |  |  | nullable |
| 21 | templateSettingRoleId | 绩效模板执行角色ID | template_setting_role_id | quote | hrjx.pmSheet.TemplateSettingRole |  |  | nullable |
| 22 | blockid | 子区域id/运行态为量表子区域id | blockid | quote | hrjx.pmSheet.TemplateBlock |  |  | nullable |
| 23 | schemeid | 方案id | schemeid | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 24 | workType | 工作类型 | work_type | text | String |  |  | nullable |
| 25 | indiClassScoreWay | 指标分类算分方式 | indiclass_scoreway | int | Integer |  |  | nullable |
| 26 | isformula | 是否公式 | isformula | int | Integer |  |  | nullable |
| 27 | finalScore | 指标最终分 | final_score | number | Decimal |  |  | nullable |
| 28 | projectOrgId | 所属项目 | project_org_id | quote | hrbd.projectOrg.ProjectOrgs |  |  | nullable |
| 29 | extend1 | extend1 | extend1 | text | String |  |  | nullable |
| 30 | extend2 | extend2 | extend2 | text | String |  |  | nullable |
| 31 | extend3 | extend3 | extend3 | text | String |  |  | nullable |
| 32 | extend4 | extend4 | extend4 | text | String |  |  | nullable |
| 33 | extend5 | extend5 | extend5 | text | String |  |  | nullable |
| 34 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 35 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 36 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 37 | modifyTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable,uiHide |
| 38 | id | 量表指标 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 39 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 40 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 41 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 42 | AcquisitionIndicatorList | 数据采集对应指标表 | - | - | hrjx.pmSheet.AcquisitionIndicator |  |  |  |
| 43 | bizRuleId | 计分规则 | biz_rule_id | quote | hrcb.rule_bizrule.BizRule |  |  | nullable |
| 44 | indiMtrSettings | 绩效模版-中期回顾指标模板指标流转步骤设置 | - | - | hrjx.pmSheet.TemplateMtrIndicatorSetting |  |  |  |
| 45 | indiSettings | 绩效模版-指标模板指标流转步骤设置 | - | - | hrjx.pmSheet.TemplateIndicatorSetting |  |  |  |
| 46 | indicatorid | 指标id | indicatorid | quote | hrjx.pmCore.Indicator |  |  | nullable |
| 47 | indiclassWeight | 指标分类权重 | indiclass_weight | number | Decimal |  |  | nullable |
| 48 | objectiveId | 关联目标 | objective_id | quote | hrjx.pmObjective.Objective |  |  | nullable |
| 49 | oindiColumnData | 量表结构数据实体 | - | - | hrjx.pmSheet.SheetData |  |  |  |
| 50 | sheetid | 量表id | sheetid | quote | hrjx.pmSheet.Sheet |  |  | nullable |

---

## Reference Fields (18)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | indiParent | 指标分类 | indi_parent | hrjx.pmCore.IndicatorClass |
| 2 | mainindiid | 主指标id | mainindiid | hrjx.pmCore.Indicator |
| 3 | scoreruleid | 指标级评分规则id | scoreruleid | hrjx.pmCore.ScoreRule |
| 4 | gaugeid | 公共量表id | gaugeid | hrjx.pmgauge.Gauge |
| 5 | indicatorTemplateId | 指标模板id | indicator_template_id | hrjx.pmSheet.TemplateIndiSet |
| 6 | indicatorTemplateIndiid | 指标模板指标id | indicator_template_indiid | hrjx.pmSheet.SheetIndicator |
| 7 | templateBlockId | 运行态时模板子区域id | template_block_id | hrjx.pmSheet.TemplateBlock |
| 8 | templateSettingRoleId | 绩效模板执行角色ID | template_setting_role_id | hrjx.pmSheet.TemplateSettingRole |
| 9 | blockid | 子区域id/运行态为量表子区域id | blockid | hrjx.pmSheet.TemplateBlock |
| 10 | schemeid | 方案id | schemeid | hrjx.pmScheme.Scheme |
| 11 | projectOrgId | 所属项目 | project_org_id | hrbd.projectOrg.ProjectOrgs |
| 12 | creator | 创建人 | creator | base.user.BipUser |
| 13 | modifier | 修改人 | modifier | base.user.BipUser |
| 14 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 15 | bizRuleId | 计分规则 | biz_rule_id | hrcb.rule_bizrule.BizRule |
| 16 | indicatorid | 指标id | indicatorid | hrjx.pmCore.Indicator |
| 17 | objectiveId | 关联目标 | objective_id | hrjx.pmObjective.Objective |
| 18 | sheetid | 量表id | sheetid | hrjx.pmSheet.Sheet |

---

## Child Tables (4)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | AcquisitionIndicatorList | 数据采集对应指标表 | hrjx.pmSheet.AcquisitionIndicator |
| 2 | indiMtrSettings | 绩效模版-中期回顾指标模板指标流转步骤设置 | hrjx.pmSheet.TemplateMtrIndicatorSetting |
| 3 | indiSettings | 绩效模版-指标模板指标流转步骤设置 | hrjx.pmSheet.TemplateIndicatorSetting |
| 4 | oindiColumnData | 量表结构数据实体 | hrjx.pmSheet.SheetData |
