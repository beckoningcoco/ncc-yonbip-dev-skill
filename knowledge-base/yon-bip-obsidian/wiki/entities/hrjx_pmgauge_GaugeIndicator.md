---
tags: [BIP, metadata, hrjx, GaugeIndicator]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 公共量表指标表 (hrjx.pmgauge.GaugeIndicator)

> Platform: BIP V5 | Table: pm_gauge_indi | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 公共量表指标表 |
| uri | hrjx.pmgauge.GaugeIndicator |
| tableName | pm_gauge_indi |
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
| 4 | indicatorid | 指标名称id | indicatorid | quote | hrjx.pmCore.Indicator |  |  | nullable |
| 5 | indiexplain | 指标说明 | indiexplain | text | String |  |  | nullable |
| 6 | indiWeight | 指标权重(%) | indi_weight | number | Decimal |  |  | nullable |
| 7 | indiclassWeight | 分类权重(%) | indiclass_weight | number | Decimal |  |  | nullable |
| 8 | indiscoreruleid | 指标评分规则id | indiscoreruleid | quote | hrjx.pmCore.ScoreRule |  |  | nullable |
| 9 | scoreruleid | 指标分类评分规则 | scoreruleid | quote | hrjx.pmCore.ScoreRule |  |  | nullable |
| 10 | isformula | 是否包含公式 | isformula | switch | Boolean |  |  | nullable |
| 11 | scoretype | 计分方式 | scoretype | int | Integer |  |  | nullable |
| 12 | evalstandard | 评分标准 | evalstandard | text | String |  |  | nullable |
| 13 | plannedgoal | 计划目标值 | plannedgoal | text | String |  |  | nullable |
| 14 | dispSeq | 显示顺序 | disp_seq | int | Integer |  |  | nullable |
| 15 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 16 | pubts | 时间戳 | ts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 17 | tenant | 租户id | tenantid | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 18 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 19 | GaugeAcquisitionList | 公共量表和数据采集人对照实体 | - | - | hrjx.pmgauge.GaugeAcquisition |  |  |  |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | gaugeid | 公共量表id | gaugeid | hrjx.pmgauge.Gauge |
| 2 | indiParent | 指标分类id | indi_parent | hrjx.pmCore.IndicatorClass |
| 3 | indicatorid | 指标名称id | indicatorid | hrjx.pmCore.Indicator |
| 4 | indiscoreruleid | 指标评分规则id | indiscoreruleid | hrjx.pmCore.ScoreRule |
| 5 | scoreruleid | 指标分类评分规则 | scoreruleid | hrjx.pmCore.ScoreRule |
| 6 | tenant | 租户id | tenantid | yht.tenant.YhtTenant |
| 7 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | GaugeAcquisitionList | 公共量表和数据采集人对照实体 | hrjx.pmgauge.GaugeAcquisition |
