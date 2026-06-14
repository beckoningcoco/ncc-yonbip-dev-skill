---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "business.rule.BusinessRuleControlStrategy"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 管控策略 (`business.rule.BusinessRuleControlStrategy`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_business_rule_control_strategy` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `business.rule.BusinessRuleControlStrategy` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 管控策略 |
| 物理表 | `cpu_business_rule_control_strategy` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:25:02.7460` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2025-05-24 00:20:33:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V3_R6_2407/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202505131358_metadata_business-rule.zip`
- **安装人**: mongoTools
- **安装排名**: `1a3be5ca-8756-4341-a99b-e408ba689c1d`

## 术语标记

`ConfigData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 3 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |

---

## 直接属性（共 22 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `conditionExpression` | 条件表达式 | `condition_expression` | String | `text` |  | ✓ |
| 2 | `conditionExpressionDisplay` | 条件表达式 | `condition_expression_display` | String | `text` |  | ✓ |
| 3 | `controlMethodId` | 业务规则管控方式 | `control_method_id` | e23c3e31-be4e-470d-a8b0-c0339c5b736e | `quote` |  | ✓ |
| 4 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 6 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 7 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 8 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 9 | `isSys` | 是否系统预置 | `is_sys` | Short | `short` |  | ✓ |
| 10 | `priority` | 优先级 | `priority` | Integer | `int` |  | ✓ |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 12 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 13 | `solutionId` | 业务规则方案 | `solution_id` | 28b93821-f31e-44f5-b226-f2fbc4acda2d | `quote` |  | ✓ |
| 14 | `strategyAuthentications` | 管控策略认证等级 | `` | 2fa0a030-81ff-420b-ab66-dcabd12e050f | `` |  |  |
| 15 | `strategyCooperations` | 管控策略合作等级 | `` | a9fb22d9-0f40-4b2b-adcd-fc5470d44498 | `` |  |  |
| 16 | `strategyEvaluations` | 管控策略评价等级 | `` | 2a4a9ab7-9478-4975-ad71-edd661aa0097 | `` |  |  |
| 17 | `strategyLifeCycles` | 管控策略生命周期状态 | `` | ef239354-00ad-44ff-bbc9-c137c40ab5ff | `` |  |  |
| 18 | `strategyMaterialClasss` | 管控策略适用物料分类 | `` | 49e0dbc7-bfd3-4e86-ad41-7eb539fd28f2 | `` |  |  |
| 19 | `strategyMaterials` | 管控策略适用物料 | `` | d5547a10-8392-460b-b1c1-950c11ed49af | `` |  |  |
| 20 | `strategyPurchaseClasss` | 管控策略适用采购品类 | `` | 5a78899a-09ab-4f46-8bcd-c1e28871fdfd | `` |  |  |
| 21 | `sysId` | 系统标识 | `sys_id` | Long | `long` |  | ✓ |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 10 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 2 | `strategyPurchaseClasss` | 管控策略适用采购品类 | `business.rule.BusinessRuleControlStrategyPurchaseClass` | `` | strategyPurchaseClasss → controlStrategyId | 0..n | true | None |  |
| 3 | `controlMethodId` | 业务规则管控方式 | `business.rule.BusinessRuleControlMethod` | `control_method_id` |  →  |  |  | None |  |
| 4 | `strategyLifeCycles` | 管控策略生命周期状态 | `business.rule.BusinessRuleControlStrategyLifeCycle` | `` | strategyLifeCycles → controlStrategyId | 0..n | true | None |  |
| 5 | `strategyMaterials` | 管控策略适用物料 | `business.rule.BusinessRuleControlStrategyMaterial` | `` | strategyMaterials → controlStrategyId | 0..n | true | None |  |
| 6 | `solutionId` | 业务规则方案 | `business.rule.BusinessRuleSolution` | `solution_id` | controlStrategies → solutionId | 0..n | true | None |  |
| 7 | `strategyAuthentications` | 管控策略认证等级 | `business.rule.BusinessRuleControlStrategyAuthentication` | `` | strategyAuthentications → controlStrategyId | 0..n | true | None |  |
| 8 | `strategyEvaluations` | 管控策略评价等级 | `business.rule.BusinessRuleControlStrategyEvaluation` | `` | strategyEvaluations → controlStrategyId | 0..n | true | None |  |
| 9 | `strategyMaterialClasss` | 管控策略适用物料分类 | `business.rule.BusinessRuleControlStrategyMaterialClass` | `` | strategyMaterialClasss → controlStrategyId | 0..n | true | None |  |
| 10 | `strategyCooperations` | 管控策略合作等级 | `business.rule.BusinessRuleControlStrategyCooperation` | `` | strategyCooperations → controlStrategyId | 0..n | true | None |  |

### Composition（子表）

- **strategyPurchaseClasss**: `strategyPurchaseClasss` → `business.rule.BusinessRuleControlStrategyPurchaseClass` | 0..n
- **strategyLifeCycles**: `strategyLifeCycles` → `business.rule.BusinessRuleControlStrategyLifeCycle` | 0..n
- **strategyMaterials**: `strategyMaterials` → `business.rule.BusinessRuleControlStrategyMaterial` | 0..n
- **solutionId**: `controlStrategies` → `business.rule.BusinessRuleSolution` | 0..n
- **strategyAuthentications**: `strategyAuthentications` → `business.rule.BusinessRuleControlStrategyAuthentication` | 0..n
- **strategyEvaluations**: `strategyEvaluations` → `business.rule.BusinessRuleControlStrategyEvaluation` | 0..n
- **strategyMaterialClasss**: `strategyMaterialClasss` → `business.rule.BusinessRuleControlStrategyMaterialClass` | 0..n
- **strategyCooperations**: `strategyCooperations` → `business.rule.BusinessRuleControlStrategyCooperation` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
