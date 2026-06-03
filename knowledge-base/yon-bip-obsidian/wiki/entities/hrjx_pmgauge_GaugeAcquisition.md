---
tags: [BIP, metadata, hrjx, GaugeAcquisition]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 公共量表和数据采集人对照实体 (hrjx.pmgauge.GaugeAcquisition)

> Platform: BIP V5 | Table: pm_acquisition_gauge_staffid | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 公共量表和数据采集人对照实体 |
| uri | hrjx.pmgauge.GaugeAcquisition |
| tableName | pm_acquisition_gauge_staffid |
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

## All Fields (7)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | indicatorid | 指标id | indicatorid | quote | hrjx.pmgauge.GaugeIndicator |  |  | nullable |
| 2 | gaugeid | 公共量表id | gaugeid | quote | hrjx.pmgauge.Gauge |  |  | nullable |
| 3 | staffid | 人员id | staffid | quote | bd.staff.Staff |  |  | nullable |
| 4 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 5 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 6 | tenant | 租户ID | tenant_id | text | String |  | Y | nullable,uiHide |
| 7 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | indicatorid | 指标id | indicatorid | hrjx.pmgauge.GaugeIndicator |
| 2 | gaugeid | 公共量表id | gaugeid | hrjx.pmgauge.Gauge |
| 3 | staffid | 人员id | staffid | bd.staff.Staff |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
