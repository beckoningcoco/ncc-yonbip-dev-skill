---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoreformulatemplate.ScoreFormulaVariable"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 价格分计算公式参数表 (`lawbid.scoreformulatemplate.ScoreFormulaVariable`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_score_formula_variable`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 价格分计算公式参数表 |
| 物理表 | `cpu_score_formula_variable` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:00:40.3960` |

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
| 1 | `code` | 编码 | `code` | String |
| 2 | `detail` | 参数说明 | `detail` | String |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `explains` | 公式说明 | `explains` | String |
| 5 | `formulaFuncExpress` | 函数公式 | `formula_func_express` | String |
| 6 | `formulaFuncId` | 函数公式ID | `formula_func_id` | Long |
| 7 | `formulaFuncPretty` | 函数公式友好表达 | `formula_func_pretty` | String |
| 8 | `formulaTemplateId` | 价格分模板ID | `formula_template_id` | 65cf71ee-b956-4883-9234-97530551c401 |
| 9 | `id` | ID | `id` | Long |
| 10 | `ifTemplate` | 是否为模板 | `if_template` | Integer |
| 11 | `maxScore` | 随机抽取范围上限 | `max_score` | Decimal |
| 12 | `minScore` | 随机抽取范围下限 | `min_score` | Decimal |
| 13 | `name` | 参数名称 | `name` | String |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |
| 15 | `realValue` | 参数值 | `real_value` | String |
| 16 | `scoreItemId` | 评标模板指标项ID | `score_item_id` | Long |
| 17 | `useType` | 参数使用类型:用户、系统内部 | `use_type` | String |
| 18 | `valueType` | 参数值获取方式 | `value_type` | String |
| 19 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `formulaTemplateId` | 价格分模板ID | `lawbid.scoreformulatemplate.ScoreFormulaTemplate` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
