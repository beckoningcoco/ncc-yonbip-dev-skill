---
tags: ["BIP", "元数据", "数据字典", "ycBase", "sourcing.businessRuleSolution.BusinessRuleControlStrategyLawbidParallel"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 管控策略招投标平行表 (`sourcing.businessRuleSolution.BusinessRuleControlStrategyLawbidParallel`)

> ycBase | 物理表：`cpu_business_rule_control_strategy_lawbid_parallel`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 管控策略招投标平行表 |
| 物理表 | `cpu_business_rule_control_strategy_lawbid_parallel` |
| 数据库 schema | `cpu-base` |
| 所属应用 | `ycBase` |
| 构建时间 | `2026-06-04 23:10:29.0960` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | da7e5585-8f8c-4510-b005-9e6bcaf6995d | 管控策略 |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `auctionPerformType` | 竞拍定标履行方式 | `auction_perform_type` | String |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `flowDefId` | 流程档案 | `flow_def_id` | 63da33d0-e4a3-40b5-8e85-839d78680826 |
| 4 | `id` | 管控策略 | `id` | da7e5585-8f8c-4510-b005-9e6bcaf6995d |
| 5 | `performType` | 定标履行方式 | `perform_type` | String |
| 6 | `purchaseDocFlowId` | 流程id | `purchasedoc_flow_id` | 51b620f3-fd52-4dbf-a38c-d40c310796ec |
| 7 | `purchaseId` | 采购方式id | `purchase_id` | 81c6880b-694a-4667-987f-81b5615f2401 |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `flowDefId` | 流程档案 | `flow.flowdef.FlowDefBasicInfo` | Service |  |
| 3 | `purchaseId` | 采购方式id | `lawbid.purchasedoc.PurchaseDoc` | Service |  |
| 4 | `purchaseDocFlowId` | 流程id | `lawbid.purchasedoc.PurchaseDocFlow` | Service |  |
| 5 | `id` | 管控策略 | `sourcing.businessRuleSolution.BusinessRuleControlStrategy` | None | true |
