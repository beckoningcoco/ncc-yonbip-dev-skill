---
tags: ["BIP", "元数据", "数据字典", "ycBase", "sourcing.businessRuleSolution.BusinessRuleApplyScopeLawbidFlowdef"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 管控策略-业务流程 (`sourcing.businessRuleSolution.BusinessRuleApplyScopeLawbidFlowdef`)

> ycBase | 物理表：`cpu_business_rule_control_strategy_lawbid_flowdef`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 管控策略-业务流程 |
| 物理表 | `cpu_business_rule_control_strategy_lawbid_flowdef` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycBase` |
| 构建时间 | `2026-06-04 23:10:22.5690` |

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
| 3 | `flowDefId` | 流程档案 | `flow_def_id` | 63da33d0-e4a3-40b5-8e85-839d78680826 |
| 4 | `id` | ID | `id` | Long |
| 5 | `isSys` | 是否系统预置 | `is_sys` | Short |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |
| 7 | `sysId` | 系统标识 | `sys_id` | Long |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `controlStrategyId` | 管控策略 | `sourcing.businessRuleSolution.BusinessRuleControlStrategy` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `flowDefId` | 流程档案 | `flow.flowdef.FlowDefBasicInfo` | Service |  |
