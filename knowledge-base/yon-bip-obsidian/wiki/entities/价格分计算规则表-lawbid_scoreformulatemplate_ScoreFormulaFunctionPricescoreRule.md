---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoreformulatemplate.ScoreFormulaFunctionPricescoreRule"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 价格分计算规则表 (`lawbid.scoreformulatemplate.ScoreFormulaFunctionPricescoreRule`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_score_formula_template_pricescore_rule`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 价格分计算规则表 |
| 物理表 | `cpu_score_formula_template_pricescore_rule` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:39.0320` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2025-10-24 23:57:54:000

## 依赖接口（2个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `baseScore` | 基准分 | `base_score` | Decimal |
| 2 | `comparisonMaxThreshold` | 对比的边界值上限 | `comparison_maxthreshold` | Decimal |
| 3 | `comparisonThreshold` | 对比的边界值下限 | `comparison_threshold` | Decimal |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `formulaComparator` | 公式计算器:比较符 | `formula_comparator` | String |
| 6 | `formulaComparisonTarget` | 公式计算器:公式内容 | `formula_comparison_target` | String |
| 7 | `formulaFuncId` | 公式ID | `function_id` | a60a96d2-b242-4d51-9f4d-2309248c4ce8 |
| 8 | `formulaTemplateId` | 价格分模板ID | `formula_template_id` | 65cf71ee-b956-4883-9234-97530551c401 |
| 9 | `id` | ID | `id` | Long |
| 10 | `maxScore` | 最高得分 | `max_score` | Decimal |
| 11 | `minScore` | 最低得分 | `min_score` | Decimal |
| 12 | `priceChangeAboveBase` | 高于基准价时价格分变化方式 | `price_change_above_base` | String |
| 13 | `priceChangeBelowBase` | 低于基准价时价格分变化方式 | `price_change_below_base` | String |
| 14 | `priceScoreCalcAttr` | 价格分计算项(虚拟) | `price_score_calcattr` | String |
| 15 | `priceScoreCalcMethod` | 价格分计算方式(虚拟) | `price_score_calcmethod` | String |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `scoreStepAboveBase` | 高于基准价时分值变化步长 | `score_step_above_base` | Decimal |
| 18 | `scoreStepBelowBase` | 低于基准价时分值变化步长 | `score_step_below_base` | Decimal |
| 19 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `formulaTemplateId` | 价格分模板ID | `lawbid.scoreformulatemplate.ScoreFormulaTemplate` | None | true |
| 2 | `formulaFuncId` | 公式ID | `lawbid.scoreformulatemplate.ScoreFormulaFunction` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
