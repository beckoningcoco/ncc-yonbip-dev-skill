---
tags: [BIP, metadata, hrjx, GaugeSetting]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 公共量表分类属性设置 (hrjx.pmgauge.GaugeSetting)

> Platform: BIP V5 | Table: pm_gauge_setting | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 公共量表分类属性设置 |
| uri | hrjx.pmgauge.GaugeSetting |
| tableName | pm_gauge_setting |
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

## All Fields (19)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | gaugeid | 公共量表id | gaugeid | quote | hrjx.pmgauge.Gauge |  |  | nullable |
| 2 | indiParent | 指标分类id | indi_parent | quote | hrjx.pmCore.IndicatorClass |  |  | nullable |
| 3 | scoreway | 汇总规则 | scoreway | int | Integer |  |  | nullable |
| 4 | indiclassWeight | 指标分类权重 | indiclass_weight | number | Decimal |  |  | nullable |
| 5 | scoreruleid | 指标分类评分规则id | scoreruleid | quote | hrjx.pmCore.ScoreRule |  |  | nullable |
| 6 | classSort | 分类排序 | class_sort | int | Integer |  |  | nullable |
| 7 | isindicompshow | 显示 | isindicompshow | switch | Boolean |  |  | nullable |
| 8 | turnstatus | 前几轮不可见 | turnstatus | int | Integer |  |  | nullable |
| 9 | specialtag | 特殊标记 | specialtag | int | Integer |  |  | nullable |
| 10 | upperlimit | 上限 | upperlimit | number | Decimal |  |  | nullable |
| 11 | lowerlimit | 下限 | lowerlimit | number | Decimal |  |  | nullable |
| 12 | isemptyclass | 是否是空分类 | isemptyclass | switch | Boolean |  |  | nullable |
| 13 | isinsert | 允许添加指标 | isinsert | switch | Boolean |  |  | nullable |
| 14 | isupdate | 允许修改 | isupdate | switch | Boolean |  |  | nullable |
| 15 | doublescoreway | 指标间汇总规则 | doublescoreway | int | Integer |  |  | nullable |
| 16 | id | 分类设置ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 17 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 18 | tenant | 租户id | tenantid | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 19 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | gaugeid | 公共量表id | gaugeid | hrjx.pmgauge.Gauge |
| 2 | indiParent | 指标分类id | indi_parent | hrjx.pmCore.IndicatorClass |
| 3 | scoreruleid | 指标分类评分规则id | scoreruleid | hrjx.pmCore.ScoreRule |
| 4 | tenant | 租户id | tenantid | yht.tenant.YhtTenant |
| 5 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
