---
tags: [BIP, metadata, hrjx, PmGaugeScope]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 公共量表适用范围表 (hrjx.pmgauge.PmGaugeScope)

> Platform: BIP V5 | Table: pm_gauge_scope | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 公共量表适用范围表 |
| uri | hrjx.pmgauge.PmGaugeScope |
| tableName | pm_gauge_scope |
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

## All Fields (11)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | containsub | 包含下级 | containsub | text | String |  |  | nullable |
| 2 | creationtime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable |
| 3 | creator | 创建人 | creator | text | String |  |  | nullable |
| 4 | gaugeid | 公共量表id | gaugeid | quote | hrjx.pmgauge.Gauge |  |  | nullable |
| 5 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 6 | modifiedtime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable |
| 7 | modifier | 修改人 | modifier | text | String |  |  | nullable |
| 8 | orgid | 组织id | orgid | quote | org.func.AdminOrg |  |  | nullable |
| 9 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 10 | tenant | 租户ID | tenant_id | text | String |  | Y | nullable,uiHide |
| 11 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | gaugeid | 公共量表id | gaugeid | hrjx.pmgauge.Gauge |
| 2 | orgid | 组织id | orgid | org.func.AdminOrg |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
