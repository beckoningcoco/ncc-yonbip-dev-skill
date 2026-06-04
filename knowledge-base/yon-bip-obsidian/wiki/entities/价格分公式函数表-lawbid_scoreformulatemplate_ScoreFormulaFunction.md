---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoreformulatemplate.ScoreFormulaFunction"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 价格分公式函数表 (`lawbid.scoreformulatemplate.ScoreFormulaFunction`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_score_formula_function`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 价格分公式函数表 |
| 物理表 | `cpu_score_formula_function` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:26:07.1470` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

## 部署信息

- 部署时间: 2026-01-23 23:56:01:000

## 依赖接口（2个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `express` | 函数表达式 | `express` | String |
| 4 | `expressPretty` | 条件公式友好表达 | `express_pretty` | String |
| 5 | `expressType` | 函数表达式类型 | `express_type` | String |
| 6 | `functionType` | 函数类型 | `type` | String |
| 7 | `id` | ID | `id` | Long |
| 8 | `name` | 名称 | `name` | String |
| 9 | `processHandler` | 计算处理器 | `process_handler` | String |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime |
| 11 | `version` | 数据版本 | `formula_version` | String |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
