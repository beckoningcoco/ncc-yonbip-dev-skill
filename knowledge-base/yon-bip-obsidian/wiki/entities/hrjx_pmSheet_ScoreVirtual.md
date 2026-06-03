---
tags: [BIP, metadata, hrjx, ScoreVirtual]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 量表总分(虚拟) (hrjx.pmSheet.ScoreVirtual)

> Platform: BIP V5 | Table: pm_score | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 量表总分(虚拟) |
| uri | hrjx.pmSheet.ScoreVirtual |
| tableName | pm_score |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | hrjx.pmScore.Score |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

---

## All Fields (14)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | annex | 附件地址 | annex | text | String |  |  | nullable |
| 2 | applyobj | 适用对象 1=人员,2=组织 | applyobj | int | Integer |  |  | nullable |
| 3 | columncode | 栏目编码 | columncode | text | String |  |  | nullable |
| 4 | deptid | 部门id | deptid | text | String |  |  | nullable |
| 5 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 6 | numvalue | 数值 | numvalue | number | Decimal |  |  | nullable |
| 7 | periodcode | 周期 | periodcode | text | String |  |  | nullable |
| 8 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 9 | schemeid | 方案id | schemeid | quote | hrjx.pmScheme.Scheme |  |  | nullable |
| 10 | sheetid | 量表id | sheetid | quote | hrjx.pmSheet.Sheet |  |  | nullable |
| 11 | staffid | 员工id | staffid | text | String |  |  | nullable |
| 12 | tenant | 租户id | tenantid | text | String |  | Y | nullable,uiHide |
| 13 | text | 文本 | text | text | String |  |  | nullable |
| 14 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | schemeid | 方案id | schemeid | hrjx.pmScheme.Scheme |
| 2 | sheetid | 量表id | sheetid | hrjx.pmSheet.Sheet |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
