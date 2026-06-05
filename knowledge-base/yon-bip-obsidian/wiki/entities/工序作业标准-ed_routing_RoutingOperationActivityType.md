---
tags: ["BIP", "元数据", "数据字典", "ED", "ed.routing.RoutingOperationActivityType"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序作业标准 (`ed.routing.RoutingOperationActivityType`)

> ED | 物理表：`ed_route_operation_activitytype`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序作业标准 |
| 物理表 | `ed_route_operation_activitytype` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 构建时间 | `2026-06-05 09:26:36.8080` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 行号 |

---

## 直接属性（23个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `routingOperationId` | 工序表关联标识 | `routingOperation_id` | 4779185e-375a-4830-bc81-92255430924e |
| 2 | `id` | ID | `id` | Long |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime |
| 4 | `activityTypeId` | 作业类型Id | `activityType_id` | acbdbe5a-3db1-4c88-aa59-9d89338af77b |
| 5 | `activityTypeIdActivityClass` | 作业类别 | `activity_class` | Short |
| 6 | `denominatorQuantity` | 母件底数 | `denominator_quantity` | Decimal |
| 7 | `workload` | 标准作业量 | `workload` | Decimal |
| 8 | `memo` | 备注 | `memo` | String |
| 9 | `quantity` | 数量 | `quantity` | Decimal |
| 10 | `isCalcCost` | 计算成本 | `is_calc_cost` | Short |
| 11 | `quantityUnit` | 数量单位ID | `quantity_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 12 | `rollup` | 卷积成本 | `rollup` | Short |
| 13 | `simulate` | 参与模拟 | `simulate` | Short |
| 14 | `declareOpportunity` | 申报时机 | `declare_opportunity` | Short |
| 15 | `effectiveDate` | 生效时间 | `effective_date` | DateTime |
| 16 | `expiryDate` | 失效时间 | `expiry_date` | DateTime |
| 17 | `totalUsage` | 总用量 | `total_usage` | Decimal |
| 18 | `calcType` | 计量方式 | `calcType` | Short |
| 19 | `rowno` | 行号 | `rowno` | Integer |
| 20 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 21 | `defineCTS` | 工序资源标准自定义项 | `define_cts` | 8a484648-c99a-4482-b8d0-aa0ea3fb1bbd |
| 22 | `originalId` | 变更源 | `original_id` | Long |
| 23 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `defineCTS` | 工序资源标准自定义项 | `ed.routing.RoutingOperationActivityTypeDct` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `quantityUnit` | 数量单位ID | `pc.unit.Unit` | Service |  |
| 4 | `routingOperationId` | 工序表关联标识 | `ed.routing.RoutingOperation` | None | true |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 6 | `activityTypeId` | 作业类型Id | `bd.activity.Activity` | Service |  |
