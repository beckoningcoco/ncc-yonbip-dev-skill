---
tags: [BIP, metadata, hrjx, GaugeUserdefined]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 公共量表字段属性设置 (hrjx.pmgauge.GaugeUserdefined)

> Platform: BIP V5 | Table: pm_gauge_userdefined | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 公共量表字段属性设置 |
| uri | hrjx.pmgauge.GaugeUserdefined |
| tableName | pm_gauge_userdefined |
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
| 1 | gaugeid | 公共量表id | gaugeid | quote | hrjx.pmgauge.Gauge |  |  | nullable |
| 2 | columncode | 栏目code | columncode | text | String |  |  | nullable |
| 3 | isvisible | 显示 | isvisible | switch | Boolean |  |  | nullable |
| 4 | isrequired | 必填项 | isrequired | switch | Boolean |  |  | nullable |
| 5 | ismodify | 允许修改 | ismodify | switch | Boolean |  |  | nullable |
| 6 | dispSeq | 排序 | disp_seq | int | Integer |  |  | nullable |
| 7 | isindicompshow | 显示 | isindicompshow | switch | Boolean |  |  | nullable |
| 8 | id | 指标设置ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 9 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 10 | tenant | 租户id | tenantid | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 11 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | gaugeid | 公共量表id | gaugeid | hrjx.pmgauge.Gauge |
| 2 | tenant | 租户id | tenantid | yht.tenant.YhtTenant |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
