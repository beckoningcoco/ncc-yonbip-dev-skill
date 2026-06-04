---
tags: ["BIP", "元数据", "数据字典", "ycBase", "sourcing.businessRuleSolution.BusinessRuleApplyScopeMaterialClass"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 管控策略-物料分类 (`sourcing.businessRuleSolution.BusinessRuleApplyScopeMaterialClass`)

> ycBase | 物理表：`cpu_business_rule_control_strategy_material_class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 管控策略-物料分类 |
| 物理表 | `cpu_business_rule_control_strategy_material_class` |
| 数据库 schema | `cpu-base` |
| 所属应用 | `ycBase` |
| 构建时间 | `2026-06-04 23:10:26.5130` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `controlStrategyId` | 管控策略 | `control_strategy_id` | da7e5585-8f8c-4510-b005-9e6bcaf6995d |
| 2 | `materialClassId` | 物料分类 | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 3 | `isSys` | 是否系统预置 | `is_sys` | Short |
| 4 | `sysId` | 系统标识 | `sys_id` | Long |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `id` | ID | `id` | Long |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `controlStrategyId` | 管控策略 | `sourcing.businessRuleSolution.BusinessRuleControlStrategy` | None | true |
| 2 | `materialClassId` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
