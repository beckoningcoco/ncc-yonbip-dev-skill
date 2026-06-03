---
tags: [BIP, metadata, hrjx, DistributionItem]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 强制分布子实体 (hrjx.pmScheme.DistributionItem)

> Platform: BIP V5 | Table: pm_dist_item | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 强制分布子实体 |
| uri | hrjx.pmScheme.DistributionItem |
| tableName | pm_dist_item |
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

## All Fields (14)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | distid | 强分主表id | distid | quote | hrjx.pmScheme.Distribution |  |  | nullable |
| 2 | gradeid | 考核等级id | gradeid | quote | hrjx.pmCore.Grade |  |  | nullable |
| 3 | gradeitemid | 考核等级子项id | gradeitemid | quote | hrjx.pmCore.GradeItem |  |  | nullable |
| 4 | combinationid | 等级明细组id | combinationid | text | String |  |  | nullable |
| 5 | calctype | 限制类型 | calctype | int | Integer |  |  | nullable |
| 6 | distnum | 人数 | distnum | int | Integer |  |  | nullable |
| 7 | distscale | 分布比例 | distscale | int | Integer |  |  | nullable |
| 8 | distway | 强制方式 | distway | int | Integer |  |  | nullable |
| 9 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 10 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 11 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 12 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 13 | dispSeq | 排序 | disp_seq | int | Integer |  |  | nullable |
| 14 | isCbt | 是否是cbt | is_cbt | int | Integer |  |  | nullable |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | distid | 强分主表id | distid | hrjx.pmScheme.Distribution |
| 2 | gradeid | 考核等级id | gradeid | hrjx.pmCore.Grade |
| 3 | gradeitemid | 考核等级子项id | gradeitemid | hrjx.pmCore.GradeItem |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
