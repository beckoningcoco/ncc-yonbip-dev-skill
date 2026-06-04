---
tags: ["BIP", "元数据", "数据字典", "ycBase", "sourcing.businessRuleSolution.BusinessRuleControlStrategySourcingParallel"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 管控策略寻源平行表 (`sourcing.businessRuleSolution.BusinessRuleControlStrategySourcingParallel`)

> ycBase | 物理表：`cpu_business_rule_control_strategy_sourcing_parallel`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 管控策略寻源平行表 |
| 物理表 | `cpu_business_rule_control_strategy_sourcing_parallel` |
| 数据库 schema | `cpu-base` |
| 所属应用 | `ycBase` |
| 构建时间 | `2026-06-04 23:10:30.3850` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | da7e5585-8f8c-4510-b005-9e6bcaf6995d | 管控策略 |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyofferType` | 履行方式 | `buyoffer_type` | String |
| 2 | `decisionBuyofferType` | 定标履行方式 | `decision_buyoffer_type` | String |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short |
| 4 | `id` | 管控策略 | `id` | da7e5585-8f8c-4510-b005-9e6bcaf6995d |
| 5 | `orderMethod` | 下单方式 | `order_method` | String |
| 6 | `quotationMethod` | 询价方式 | `quotation_method` | String |
| 7 | `sourcingProcess` | 寻源流程 | `sourcing_process` | String |
| 8 | `supplierInvitationMethod` | 邀请供应商方式 | `supplier_invitation_method` | String |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `id` | 管控策略 | `sourcing.businessRuleSolution.BusinessRuleControlStrategy` | None | true |
