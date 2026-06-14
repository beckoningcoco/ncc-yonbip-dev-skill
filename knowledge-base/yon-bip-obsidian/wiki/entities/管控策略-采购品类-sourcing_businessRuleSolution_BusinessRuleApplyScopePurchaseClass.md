---
tags: ["BIP", "元数据", "数据字典", "ycBase", "sourcing.businessRuleSolution.BusinessRuleApplyScopePurchaseClass"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 管控策略-采购品类 (`sourcing.businessRuleSolution.BusinessRuleApplyScopePurchaseClass`)

> ycBase | 物理表：`cpu_business_rule_control_strategy_purchase_class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 管控策略-采购品类 |
| 物理表 | `cpu_business_rule_control_strategy_purchase_class` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycBase` |
| 构建时间 | `2026-06-04 23:10:27.7670` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `controlStrategyId` | 管控策略 | `control_strategy_id` | da7e5585-8f8c-4510-b005-9e6bcaf6995d |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `id` | ID | `id` | Long |
| 4 | `isSys` | 是否系统预置 | `is_sys` | Short |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `purchaseClassId` | 采购品类 | `purchase_class_id` | ec3f827d-4cff-462d-b74c-1dd556c96baa |
| 7 | `sysId` | 系统标识 | `sys_id` | Long |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purchaseClassId` | 采购品类 | `pc.cls.PurchaseClass` | Service |  |
| 2 | `controlStrategyId` | 管控策略 | `sourcing.businessRuleSolution.BusinessRuleControlStrategy` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
