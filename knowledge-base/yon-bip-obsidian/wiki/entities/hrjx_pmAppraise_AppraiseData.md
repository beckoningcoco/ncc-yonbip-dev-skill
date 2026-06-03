---
tags: [BIP, metadata, hrjx, AppraiseData]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 量表具体考核信息 (hrjx.pmAppraise.AppraiseData)

> Platform: BIP V5 | Table: pm_appraise_data | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 量表具体考核信息 |
| uri | hrjx.pmAppraise.AppraiseData |
| tableName | pm_appraise_data |
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
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (21)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 2 | appraiser | 公共量表id | appraiser | quote | hred.staff.Staff |  |  | nullable |
| 3 | sheetid | 量表id | sheetid | quote | hrjx.pmSheet.Sheet |  |  | nullable |
| 4 | indicatorid | 指标id | indicatorid | quote | hrjx.pmCore.Indicator |  |  | nullable |
| 5 | annex | 附件上传 | annex | text | String |  |  | nullable |
| 6 | turn | 轮次 | turn | int | Integer |  |  | nullable |
| 7 | attachment | 附件上传 | attachment | text | String |  |  | nullable |
| 8 | actturn | 实例轮次 | actturn | int | Integer |  |  | nullable |
| 9 | appraiseid | 评分主表id | appraiseid | quote | hrjx.pmAppraise.Appraise |  |  | nullable |
| 10 | aprStatus | 状态 | apr_status | int | Integer |  |  | nullable |
| 11 | blockId | 区域id | block_id | quote | hrjx.pmSheet.TemplateBlock |  |  | nullable |
| 12 | columncode | 栏目数据 | columncode | text | String |  |  | nullable |
| 13 | deptid | 部门id | deptid | quote | org.func.AdminOrg |  |  | isMasterOrg,nullable |
| 14 | dimid | 考核人类别id | dimid | quote | hrjx.pmCore.Dimensionality |  |  | nullable |
| 15 | indiId | indi | indi_id | quote | hrjx.pmSheet.SheetIndicator |  |  | nullable |
| 16 | numvalue | 分数 | numvalue | number | Decimal |  |  | nullable |
| 17 | periodcode | 期间code | periodcode | text | String |  |  | nullable |
| 18 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 19 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 20 | text | 等级 | text | text | String |  |  | nullable |
| 21 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (9)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | appraiser | 公共量表id | appraiser | hred.staff.Staff |
| 2 | sheetid | 量表id | sheetid | hrjx.pmSheet.Sheet |
| 3 | indicatorid | 指标id | indicatorid | hrjx.pmCore.Indicator |
| 4 | appraiseid | 评分主表id | appraiseid | hrjx.pmAppraise.Appraise |
| 5 | blockId | 区域id | block_id | hrjx.pmSheet.TemplateBlock |
| 6 | deptid | 部门id | deptid | org.func.AdminOrg |
| 7 | dimid | 考核人类别id | dimid | hrjx.pmCore.Dimensionality |
| 8 | indiId | indi | indi_id | hrjx.pmSheet.SheetIndicator |
| 9 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
