---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoreformulatemplate.ScoreFormulaTemplate"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 价格分模板 (`lawbid.scoreformulatemplate.ScoreFormulaTemplate`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_score_formula_template`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 价格分模板 |
| 物理表 | `cpu_score_formula_template` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:57.6880` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 模板编号 |

## 部署信息

- 部署时间: 2025-10-24 23:57:54:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 4 | 启用 | `ucfbase.ucfbaseItf.IEnable` | 141 |
| 5 | 自动编号 | `voucher.base.IAutoCode` | 49 |

---

## 直接属性（41个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `baseFormulaVarExpress` | 基准价公式表达式内容 | `base_formula_express` | String |
| 2 | `basePriceId` | 评标基准价表达式 | `base_price_id` | a60a96d2-b242-4d51-9f4d-2309248c4ce8 |
| 3 | `billState` | 单据状态 | `bill_state` | String |
| 4 | `calculatingAttribute` | 价格分计算条件 | `calculating_attribute` | String |
| 5 | `code` | 模板编号 | `code` | String |
| 6 | `createDate` | 创建日期 | `create_date` | Date |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime |
| 8 | `creator` | 创建人名称 | `creator` | String |
| 9 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `creatorName` | 创建人名字 | `creator_name` | String |
| 11 | `disablets` | 停用时间 | `disablets` | DateTime |
| 12 | `dr` | 逻辑删除标记 | `dr` | Short |
| 13 | `enable` | 启用 | `enable` | sys_intboolean |
| 14 | `enablets` | 启用时间 | `enablets` | DateTime |
| 15 | `enterpriseId` | 企业 | `enterprise_id` | Long |
| 16 | `enterpriseName` | 企业名称 | `enterprise_name` | String |
| 17 | `explains` | 公式说明 | `explains` | String |
| 18 | `floatingDownRate` | 下浮率(%) | `floating_down_rate` | Decimal |
| 19 | `formulaVariableList` | 价格分计算公式参数表 | `` | 223805cf-fdfb-41cd-9490-737bd192212d |
| 20 | `formulaVersion` | 数据版本 | `formula_version` | String |
| 21 | `functionBenchmarkRuleList` | 基准价计算规则表 | `` | c7c51087-875d-4636-b832-c28dfd1b8caf |
| 22 | `functionPricescoreRuleList` | 价格分计算规则表 | `` | c04f98ad-80d0-4c1e-b52e-5461b4280705 |
| 23 | `id` | ID | `id` | Long |
| 24 | `ifPrefabricate` | 是否系统预制数据 | `if_prefabricate` | Integer |
| 25 | `ifTax` | 是否含税计算 | `if_tax` | Integer |
| 26 | `ifTemplate` | 是否为模板 | `if_template` | Integer |
| 27 | `modifier` | 修改人名称 | `modifier` | String |
| 28 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 29 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 30 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 31 | `name` | 价格分模板名称 | `name` | String |
| 32 | `priceSourceType` | 取值来源 | `price_source_type` | String |
| 33 | `pubts` | 时间戳 | `pubts` | DateTime |
| 34 | `scorePriceId` | 价格分表达式 | `score_price_id` | a60a96d2-b242-4d51-9f4d-2309248c4ce8 |
| 35 | `scoreType` | 适用评分类型 | `score_type` | String |
| 36 | `status` | 状态 | `status` | String |
| 37 | `supplierScope` | 供应商范围 | `supplier_scope` | String |
| 38 | `supplierScopeFormulaExpress` | 供应商范围公式表达式内容 | `supplier_scope_formula_express` | String |
| 39 | `tenantId` | 租户 | `tenant_id` | String |
| 40 | `ts` | 最后修改时间 | `ts` | DateTime |
| 41 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `functionPricescoreRuleList` | 价格分计算规则表 | `lawbid.scoreformulatemplate.ScoreFormulaFunctionPricescoreRule` | None | true |
| 2 | `formulaVariableList` | 价格分计算公式参数表 | `lawbid.scoreformulatemplate.ScoreFormulaVariable` | None | true |
| 3 | `functionBenchmarkRuleList` | 基准价计算规则表 | `lawbid.scoreformulatemplate.ScoreFormulaFunctionBenchmarkRule` | None | true |
| 4 | `basePriceId` | 评标基准价表达式 | `lawbid.scoreformulatemplate.ScoreFormulaFunction` | None |  |
| 5 | `scorePriceId` | 价格分表达式 | `lawbid.scoreformulatemplate.ScoreFormulaFunction` | None |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
