---
tags: [BIP, metadata, hrjx, IndiclassScore]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 指标分类总分 (hrjx.pmScore.IndiclassScore)

> Platform: BIP V5 | Table: pm_indiclass_score | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 指标分类总分 |
| uri | hrjx.pmScore.IndiclassScore |
| tableName | pm_indiclass_score |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
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

## All Fields (7)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | appraiseid | 评价表id | appraiseid | text | String |  |  | nullable |
| 2 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 3 | indiclassid | 指标分类id | indiclassid | text | String |  |  | nullable |
| 4 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 5 | score | 总分 | score | number | Decimal |  |  | nullable |
| 6 | sheetid | 量表id | sheetid | text | String |  |  | nullable |
| 7 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (1)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
