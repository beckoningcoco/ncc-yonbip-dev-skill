---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoreformulatemplate.ScoreFormulaFunctionBenchmarkRule"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 基准价计算规则表 (`lawbid.scoreformulatemplate.ScoreFormulaFunctionBenchmarkRule`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_score_formula_template_benchmark_rule`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 基准价计算规则表 |
| 物理表 | `cpu_score_formula_template_benchmark_rule` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:37.6630` |

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

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `calcSupplierFormulaExpress` | 参与计算的供应商公式表达式 | `calc_supplier_formula_express` | String |
| 2 | `calculatingPriceAttribute` | 参与计算的价格属性 | `calculating_price_attribute` | String |
| 3 | `calculatingSuppliers` | 参与计算的供应商 | `calculating_suppliers` | String |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `floatingDownRate` | 下浮率(%) | `floating_down_rate` | Decimal |
| 6 | `formulaFuncId` | 公式ID | `function_id` | a60a96d2-b242-4d51-9f4d-2309248c4ce8 |
| 7 | `formulaTemplateId` | 价格分模板ID | `formula_template_id` | 65cf71ee-b956-4883-9234-97530551c401 |
| 8 | `id` | ID | `id` | Long |
| 9 | `lowerComparisonPriceType` | 下限对比的价格类型 | `lower_comparison_price_type` | String |
| 10 | `lowerPriceRatio` | 平均价下限比例 | `lower_price_ratio` | Decimal |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `removedHighestPriceSupplier` | 去掉最高价供应商数 | `removed_highest_price_supplier` | Integer |
| 13 | `removedLowestPriceSupplier` | 去掉最低价供应商数 | `removed_lowest_price_supplier` | Integer |
| 14 | `supplierLowerLimit` | 供应商人数下限 | `supplier_lower_limit` | Integer |
| 15 | `supplierUpperLimit` | 供应商人数上限 | `supplier_upper_limit` | Integer |
| 16 | `upperComparisonPriceType` | 上限对比的价格类型 | `upper_comparison_price_type` | String |
| 17 | `upperPriceRatio` | 平均价上限比例 | `upper_price_ratio` | Decimal |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `formulaTemplateId` | 价格分模板ID | `lawbid.scoreformulatemplate.ScoreFormulaTemplate` | None | true |
| 2 | `formulaFuncId` | 公式ID | `lawbid.scoreformulatemplate.ScoreFormulaFunction` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
