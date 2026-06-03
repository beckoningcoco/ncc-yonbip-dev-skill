---
tags: [BIP, metadata, hrjx, GaugeColumn]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 公共量表动态列栏目值 (hrjx.pmgauge.GaugeColumn)

> Platform: BIP V5 | Table: pm_gauge_column | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 公共量表动态列栏目值 |
| uri | hrjx.pmgauge.GaugeColumn |
| tableName | pm_gauge_column |
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

## All Fields (10)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | indicatorid | 指标id | indicatorid | quote | hrjx.pmCore.Indicator |  |  | nullable |
| 2 | columncode | 栏目code | columncode | text | String |  |  | nullable |
| 3 | text | 字符value | text | text | String |  |  | nullable |
| 4 | numvalue | 数值value | numvalue | number | Decimal |  |  | nullable |
| 5 | gaugeid | 公共量表主键 | gaugeid | quote | hrjx.pmgauge.Gauge |  |  | nullable |
| 6 | annex | 附件value | annex | text | String |  |  | nullable |
| 7 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 8 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 9 | tenant | 租户id | tenantid | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 10 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | indicatorid | 指标id | indicatorid | hrjx.pmCore.Indicator |
| 2 | gaugeid | 公共量表主键 | gaugeid | hrjx.pmgauge.Gauge |
| 3 | tenant | 租户id | tenantid | yht.tenant.YhtTenant |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
