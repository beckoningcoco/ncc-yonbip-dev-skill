---
tags: ["BIP", "元数据", "数据字典", "ycBase", "sourcing.businessRuleSolution.BusinessRuleControlStrategy"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 管控策略 (`sourcing.businessRuleSolution.BusinessRuleControlStrategy`)

> ycBase | 物理表：`cpu_business_rule_control_strategy`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 管控策略 |
| 物理表 | `cpu_business_rule_control_strategy` |
| 数据库 schema | `cpu-base` |
| 所属应用 | `ycBase` |
| 构建时间 | `2026-06-04 23:07:28.0200` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `conditionExpression` | 其他适用条件 | `condition_expression` | String |
| 2 | `conditionExpressionDisplay` | 其他适用条件 | `condition_expression_display` | String |
| 3 | `controlMethodId` | 业务规则管控方式 | `control_method_id` | e23c3e31-be4e-470d-a8b0-c0339c5b736e |
| 4 | `disablets` | 停用时间 | `disablets` | DateTime |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `enable` | 启用 | `enable` | sys_intboolean |
| 7 | `enablets` | 启用时间 | `enablets` | DateTime |
| 8 | `id` | ID | `id` | Long |
| 9 | `isSys` | 是否系统预置 | `is_sys` | Short |
| 10 | `priority` | 优先级 | `priority` | Integer |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `remark` | 备注 | `remark` | String |
| 13 | `solutionId` | 业务规则方案主键 | `solution_id` | 5feddfc7-e8bb-4914-9718-937e7ea60df0 |
| 14 | `strategyLawbidFlowdef` | 管控策略-业务流程 | `` | 5a35267d-0479-468e-9b8b-42661c2b6764 |
| 15 | `strategyLawbidParallel` | 管控策略招投标平行表 | `` | 82aa9f10-419a-40cc-827f-ddbc391702c9 |
| 16 | `strategyLawbidPurchase` | 管控策略-采购方式 | `` | caf0ba8f-4195-47d7-b32e-7367e4564bcb |
| 17 | `strategyMaterialClasss` | 管控策略-物料分类 | `` | f1a45426-879b-4703-aa75-e8d66badf69a |
| 18 | `strategyMaterials` | 管控策略-物料 | `` | 4bb00c01-34e2-4988-8a54-980a78cbdf4d |
| 19 | `strategyPurchaseClasss` | 管控策略-采购品类 | `` | b956e8a9-b138-4212-b1bb-8e5a16092934 |
| 20 | `strategySourcingParallel` | 管控策略寻源平行表 | `` | 9d4fa2ea-a8f4-49a4-9f32-099a039c771d |
| 21 | `sysId` | 系统标识 | `sys_id` | Short |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `strategySourcingParallel` | 管控策略寻源平行表 | `sourcing.businessRuleSolution.BusinessRuleControlStrategySourcingParallel` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `strategyPurchaseClasss` | 管控策略-采购品类 | `sourcing.businessRuleSolution.BusinessRuleApplyScopePurchaseClass` | None | true |
| 4 | `strategyLawbidFlowdef` | 管控策略-业务流程 | `sourcing.businessRuleSolution.BusinessRuleApplyScopeLawbidFlowdef` | None | true |
| 5 | `controlMethodId` | 业务规则管控方式 | `business.rule.BusinessRuleControlMethod` | None |  |
| 6 | `strategyMaterials` | 管控策略-物料 | `sourcing.businessRuleSolution.BusinessRuleApplyScopeMaterial` | None | true |
| 7 | `strategyLawbidParallel` | 管控策略招投标平行表 | `sourcing.businessRuleSolution.BusinessRuleControlStrategyLawbidParallel` | None | true |
| 8 | `solutionId` | 业务规则方案主键 | `sourcing.businessRuleSolution.BusinessRuleSolution` | None | true |
| 9 | `strategyMaterialClasss` | 管控策略-物料分类 | `sourcing.businessRuleSolution.BusinessRuleApplyScopeMaterialClass` | None | true |
| 10 | `strategyLawbidPurchase` | 管控策略-采购方式 | `sourcing.businessRuleSolution.BusinessRuleApplyScopeLawbidPurchase` | None | true |
