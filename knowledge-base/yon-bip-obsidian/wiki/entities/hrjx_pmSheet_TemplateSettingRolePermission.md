---
tags: [BIP, metadata, hrjx, TemplateSettingRolePermission]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 模板按钮高级设置权限 (hrjx.pmSheet.TemplateSettingRolePermission)

> Platform: BIP V5 | Table: pm_template_settingrole_permission | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 模板按钮高级设置权限 |
| uri | hrjx.pmSheet.TemplateSettingRolePermission |
| tableName | pm_template_settingrole_permission |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (1)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (12)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | blockId | 运行态时模板子区域id | block_id | quote | hrjx.pmSheet.TemplateBlock |  |  | nullable |
| 2 | buttonCode | 按钮编码 | button_code | text | String |  |  | nullable |
| 3 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 4 | indiParent | 指标分类id | indi_parent | quote | hrjx.pmCore.IndicatorClass |  |  | nullable |
| 5 | indicatorTemplateId | 指标模板id | indicator_template_id | quote | hrjx.pmSheet.TemplateIndiSet |  |  | nullable |
| 6 | isUserAction | 用户保存操作 | is_user_action | int | Integer |  |  | nullable |
| 7 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 8 | settingRoleId | 执行角色id | setting_role_id | quote | hrjx.pmSheet.TemplateSettingRole |  |  | nullable |
| 9 | sourceSettingRoleId | 执行角色来源id | source_setting_role_id | quote | hrjx.pmSheet.TemplateSettingRole |  |  | nullable |
| 10 | staffId | 员工id | staff_id | quote | cs.hrstaff.staff |  |  | nullable |
| 11 | templateId | 绩效模板id | template_id | quote | hrjx.pmSheet.Template |  |  | nullable |
| 12 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (8)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | blockId | 运行态时模板子区域id | block_id | hrjx.pmSheet.TemplateBlock |
| 2 | indiParent | 指标分类id | indi_parent | hrjx.pmCore.IndicatorClass |
| 3 | indicatorTemplateId | 指标模板id | indicator_template_id | hrjx.pmSheet.TemplateIndiSet |
| 4 | settingRoleId | 执行角色id | setting_role_id | hrjx.pmSheet.TemplateSettingRole |
| 5 | sourceSettingRoleId | 执行角色来源id | source_setting_role_id | hrjx.pmSheet.TemplateSettingRole |
| 6 | staffId | 员工id | staff_id | cs.hrstaff.staff |
| 7 | templateId | 绩效模板id | template_id | hrjx.pmSheet.Template |
| 8 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
