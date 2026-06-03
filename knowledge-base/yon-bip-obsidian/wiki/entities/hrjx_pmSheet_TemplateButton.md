---
tags: [BIP, metadata, hrjx, TemplateButton]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 绩效模版按钮控制 (hrjx.pmSheet.TemplateButton)

> Platform: BIP V5 | Table: pm_template_button | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 绩效模版按钮控制 |
| uri | hrjx.pmSheet.TemplateButton |
| tableName | pm_template_button |
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

## All Fields (12)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | biz_phase_type_id | 预制定义的阶段id | biz_phase_type_id | quote | hrjx.pmPhaseFlow.PhaseBizType |  |  | nullable |
| 2 | blockid | 考核部分id | blockid | quote | hrjx.pmSheet.TemplateBlock |  |  | nullable |
| 3 | buttoncode | 按钮编码 | buttoncode | text | String |  |  | nullable |
| 4 | enable | 是否启用 | enable | int | Integer |  |  | nullable |
| 5 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 6 | indiParent | 指标分类id | indi_parent | quote | hrjx.pmCore.IndicatorClass |  |  | nullable |
| 7 | indicatorTemplateId | 指标模板id | indicator_template_id | quote | hrjx.pmSheet.TemplateIndiSet |  |  | nullable |
| 8 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 9 | templateid | 绩效模板id | templateid | quote | hrjx.pmSheet.Template |  |  | nullable |
| 10 | tenant | 租户ID | tenant_id | text | String |  | Y | nullable,uiHide |
| 11 | type | 按钮设置类型 | type | int | Integer |  |  | nullable |
| 12 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | biz_phase_type_id | 预制定义的阶段id | biz_phase_type_id | hrjx.pmPhaseFlow.PhaseBizType |
| 2 | blockid | 考核部分id | blockid | hrjx.pmSheet.TemplateBlock |
| 3 | indiParent | 指标分类id | indi_parent | hrjx.pmCore.IndicatorClass |
| 4 | indicatorTemplateId | 指标模板id | indicator_template_id | hrjx.pmSheet.TemplateIndiSet |
| 5 | templateid | 绩效模板id | templateid | hrjx.pmSheet.Template |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
