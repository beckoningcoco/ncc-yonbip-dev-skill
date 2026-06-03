---
tags: [BIP, metadata, hrjx, DistItemSummaryTemplateVo]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 强分设置模板子表 (hrjx.pmSummarySchemeTemplate.DistItemSummaryTemplateVo)

> Platform: BIP V5 | Table: pm_dist_item_summary_template | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 强分设置模板子表 |
| uri | hrjx.pmSummarySchemeTemplate.DistItemSummaryTemplateVo |
| tableName | pm_dist_item_summary_template |
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

## All Fields (11)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | distTemplateId | 强分主表id | disttemplateid | quote | hrjx.pmSummarySchemeTemplate.DistSummaryTemplateVo |  |  | nullable |
| 2 | gradeItemId | 考核等级子项id | gradeitemid | quote | hrjx.pmCore.GradeItem |  |  | nullable |
| 3 | combinationId | 等级明细组id | combinationid | text | String |  |  | nullable |
| 4 | gradeId | 考核等级id | gradeId | quote | hrjx.pmCore.Grade |  |  | nullable |
| 5 | distScale | 分布比例 | distscale | int | Integer |  |  | nullable |
| 6 | calcType | 限制类型 | calctype | int | Integer |  |  | nullable |
| 7 | orderNum | 排序 | ordernum | int | Integer |  |  | nullable |
| 8 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 9 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 10 | tenant | 租户ID | tenant_id | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 11 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | distTemplateId | 强分主表id | disttemplateid | hrjx.pmSummarySchemeTemplate.DistSummaryTemplateVo |
| 2 | gradeItemId | 考核等级子项id | gradeitemid | hrjx.pmCore.GradeItem |
| 3 | gradeId | 考核等级id | gradeId | hrjx.pmCore.Grade |
| 4 | tenant | 租户ID | tenant_id | yht.tenant.YhtTenant |
| 5 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
