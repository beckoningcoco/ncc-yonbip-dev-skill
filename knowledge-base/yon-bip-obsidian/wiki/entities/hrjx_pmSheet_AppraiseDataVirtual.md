---
tags: [BIP, metadata, hrjx, AppraiseDataVirtual]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 量表具体考核信息(虚拟) (hrjx.pmSheet.AppraiseDataVirtual)

> Platform: BIP V5 | Table: pm_appraise_data | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 量表具体考核信息(虚拟) |
| uri | hrjx.pmSheet.AppraiseDataVirtual |
| tableName | pm_appraise_data |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | hrjx.pmAppraise.AppraiseData |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

---

## All Fields (21)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | actturn | 实例轮次 | actturn | int | Integer |  |  | nullable |
| 2 | annex | 非MDD的OSS指标评价附件 | annex | text | String |  |  | nullable |
| 3 | appraiseid | 评分主表id | appraiseid | quote | hrjx.pmSheet.AppraiseVirTual |  |  | nullable |
| 4 | appraiser | 考核人id | appraiser | quote | hred.staff.Staff |  |  | nullable |
| 5 | aprStatus | 状态 | apr_status | int | Integer |  |  | nullable |
| 6 | attachment | MDD协同指标评价附件 | attachment | text | String |  |  | nullable |
| 7 | blockId | 区域id | block_id | quote | hrjx.pmSheet.TemplateBlock |  |  | nullable |
| 8 | columncode | 栏目数据 | columncode | text | String |  |  | nullable |
| 9 | deptid | 部门id | deptid | quote | org.func.AdminOrg |  |  | isMasterOrg,nullable |
| 10 | dimid | 考核人类别id | dimid | quote | hrjx.pmCore.Dimensionality |  |  | nullable |
| 11 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 12 | indiId | indi | indi_id | quote | hrjx.pmSheet.SheetIndicator |  |  | nullable |
| 13 | indicatorid | 指标id | indicatorid | quote | hrjx.pmCore.Indicator |  |  | nullable |
| 14 | numvalue | 分数 | numvalue | number | Decimal |  |  | nullable |
| 15 | periodcode | 期间code | periodcode | text | String |  |  | nullable |
| 16 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 17 | sheetid | 量表id | sheetid | quote | hrjx.pmSheet.Sheet |  |  | nullable |
| 18 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 19 | text | 等级 | text | text | String |  |  | nullable |
| 20 | turn | 轮次 | turn | int | Integer |  |  | nullable |
| 21 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (9)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | appraiseid | 评分主表id | appraiseid | hrjx.pmSheet.AppraiseVirTual |
| 2 | appraiser | 考核人id | appraiser | hred.staff.Staff |
| 3 | blockId | 区域id | block_id | hrjx.pmSheet.TemplateBlock |
| 4 | deptid | 部门id | deptid | org.func.AdminOrg |
| 5 | dimid | 考核人类别id | dimid | hrjx.pmCore.Dimensionality |
| 6 | indiId | indi | indi_id | hrjx.pmSheet.SheetIndicator |
| 7 | indicatorid | 指标id | indicatorid | hrjx.pmCore.Indicator |
| 8 | sheetid | 量表id | sheetid | hrjx.pmSheet.Sheet |
| 9 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
