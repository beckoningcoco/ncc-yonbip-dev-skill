---
tags: [BIP, metadata, hrjx, TemplateIndiSet]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 绩效指标模板设置 (hrjx.pmSheet.TemplateIndiSet)

> Platform: BIP V5 | Table: pm_template_indiset | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 绩效指标模板设置 |
| uri | hrjx.pmSheet.TemplateIndiSet |
| tableName | pm_template_indiset |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 3 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |

---

## All Fields (21)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | buttonList | 绩效模版按钮控制 | - | - | hrjx.pmSheet.TemplateButton |  |  |  |
| 2 | copyFromId | 拷贝源id | copy_from_id | long | Long |  |  | nullable |
| 3 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 4 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 5 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 6 | indiMtrSettingList | 绩效模版-中期回顾指标模板流转步骤设置 | - | - | hrjx.pmSheet.TemplateMtrIndiSetSetting |  |  |  |
| 7 | indiOfSetList | 量表对应指标表 | - | - | hrjx.pmSheet.SheetIndicator |  |  |  |
| 8 | indiSetBlockList | 绩效模板考核部分 | - | - | hrjx.pmSheet.TemplateBlock |  |  |  |
| 9 | indiSettingList | 绩效模版-指标模板流转步骤设置 | - | - | hrjx.pmSheet.TemplateIndiSetSetting |  |  |  |
| 10 | isAllowAddIndicator | 是否允许模板以外指标新增 | is_allow_add_indicator | int | Integer |  |  | nullable |
| 11 | isdoubleweight | 按指标分类、指标两级设置权重 | isdoubleweight | int | Integer |  |  | nullable |
| 12 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 13 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 14 | name | 指标模板名称 | name | text | String |  |  | nullable |
| 15 | originalFrom | 来自于 | original_from | int | Integer |  |  | nullable |
| 16 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 17 | refState | 引用状态,0时需要生成副本 | ref_state | int | Integer |  |  | nullable |
| 18 | sortNum | 排序 | sort_num | int | Integer |  |  | nullable |
| 19 | templateid | 绩效模板id | templateid | quote | hrjx.pmSheet.Template |  |  | nullable |
| 20 | tenant | 租户ID | tenant_id | text | String |  | Y | nullable,uiHide |
| 21 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | modifier | 修改人 | modifier | base.user.BipUser |
| 3 | templateid | 绩效模板id | templateid | hrjx.pmSheet.Template |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (5)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | indiMtrSettingList | 绩效模版-中期回顾指标模板流转步骤设置 | hrjx.pmSheet.TemplateMtrIndiSetSetting |
| 2 | indiSetBlockList | 绩效模板考核部分 | hrjx.pmSheet.TemplateBlock |
| 3 | indiSettingList | 绩效模版-指标模板流转步骤设置 | hrjx.pmSheet.TemplateIndiSetSetting |
| 4 | buttonList | 绩效模版按钮控制 | hrjx.pmSheet.TemplateButton |
| 5 | indiOfSetList | 量表对应指标表 | hrjx.pmSheet.SheetIndicator |
