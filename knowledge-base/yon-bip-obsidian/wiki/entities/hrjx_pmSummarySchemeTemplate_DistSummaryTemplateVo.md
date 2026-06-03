---
tags: [BIP, metadata, hrjx, DistSummaryTemplateVo]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 强分设置模板主表 (hrjx.pmSummarySchemeTemplate.DistSummaryTemplateVo)

> Platform: BIP V5 | Table: pm_dist_summary_template | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 强分设置模板主表 |
| uri | hrjx.pmSummarySchemeTemplate.DistSummaryTemplateVo |
| tableName | pm_dist_summary_template |
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
| 2 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |

---

## All Fields (12)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | schemeTemplateId | 方案模板主键 | schemetemplateid | quote | hrjx.pmSummarySchemeTemplate.SummarySchemeTemplateVO |  |  | nullable |
| 2 | distWay | 强制方式 | distway | int | Integer |  |  | nullable |
| 3 | distType | 规则类别 | disttype | int | Integer |  |  | nullable |
| 4 | distCalc | 尾数处理方式 | distcalc | int | Integer |  |  | nullable |
| 5 | distRuleId | 强分规则id | distruleid | quote | hrjx.pmCore.DistRule |  |  | nullable |
| 6 | gradeWay | 是否全部等级校验 | gradeway | int | Integer |  |  | nullable |
| 7 | gradeId | 考核等级id | gradeid | quote | hrjx.pmCore.Grade |  |  | nullable |
| 8 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 9 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 10 | tenant | 租户ID | tenant_id | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 11 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 12 | distItemList | 强分设置模板子表 | - | - | hrjx.pmSummarySchemeTemplate.DistItemSummaryTemplateVo |  |  |  |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | schemeTemplateId | 方案模板主键 | schemetemplateid | hrjx.pmSummarySchemeTemplate.SummarySchemeTemplateVO |
| 2 | distRuleId | 强分规则id | distruleid | hrjx.pmCore.DistRule |
| 3 | gradeId | 考核等级id | gradeid | hrjx.pmCore.Grade |
| 4 | tenant | 租户ID | tenant_id | yht.tenant.YhtTenant |
| 5 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | distItemList | 强分设置模板子表 | hrjx.pmSummarySchemeTemplate.DistItemSummaryTemplateVo |
