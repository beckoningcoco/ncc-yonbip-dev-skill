---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.plan.Rolling"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 滚动计划 (`mr.plan.Rolling`)

> MR | 物理表：`mr_plan_rolling`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 滚动计划 |
| 物理表 | `mr_plan_rolling` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:55.3030` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `freeCharacteristics` | 自由项特征组 | `rolling_fct` | 1763888b-2152-443f-94ce-b7ca729858c6 |
| 2 | `id` | ID | `id` | Long |
| 3 | `planParamId` | 计划名称 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 4 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `rollingDetail` | 滚动计划明细 | `` | 53b04213-a389-4d6c-b628-8173a527565c |
| 7 | `safetyStockQty` | 安全库存量 | `safety_stock_qty` | Decimal |
| 8 | `sensitiveUID` | 存量敏感域唯一性ID | `sensitiveUID` | String |
| 9 | `stockQty` | 库存量 | `stock_qty` | Decimal |
| 10 | `stockSensCharacteristics` | 存量敏感特征组 | `rolling_sct` | e0644aa0-b81e-42f3-9ab2-d125f037d786 |
| 11 | `supplyOrgId` | 供应组织 | `supply_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `freeCharacteristics` | 自由项特征组 | `mr.plan.RollingFCT` | None |  |
| 2 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `planParamId` | 计划名称 | `mr.planworkbench.PlanParam` | None |  |
| 5 | `stockSensCharacteristics` | 存量敏感特征组 | `mr.plan.RollingSCT` | None |  |
| 6 | `supplyOrgId` | 供应组织 | `org.func.BaseOrg` | Service |  |
| 7 | `rollingDetail` | 滚动计划明细 | `mr.plan.RollingDetail` | None | true |
