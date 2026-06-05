---
tags: ["BIP", "元数据", "数据字典", "ED", "ed.mainformula.FormulaOperationActivityType"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序作业标准 (`ed.mainformula.FormulaOperationActivityType`)

> ED | 物理表：`ed_route_operation_activitytype`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序作业标准 |
| 物理表 | `ed_route_operation_activitytype` |
| 数据库 schema | `engineeringdata` |
| 所属应用 | `ED` |
| 构建时间 | `2026-06-05 09:26:26.9050` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `activityTypeId` | 作业类型 | `activityType_id` | acbdbe5a-3db1-4c88-aa59-9d89338af77b |
| 2 | `activityTypeIdActivityClass` | 作业类别 | `activity_class` | Short |
| 3 | `calcType` | 计量方式 | `calcType` | Short |
| 4 | `declareOpportunity` | 申报时机 | `declare_opportunity` | Short |
| 5 | `denominatorQuantity` | 母件底数 | `denominator_quantity` | Decimal |
| 6 | `effectiveDate` | 生效日期 | `effective_date` | DateTime |
| 7 | `expiryDate` | 失效日期 | `expiry_date` | DateTime |
| 8 | `id` | ID | `id` | Long |
| 9 | `isCalcCost` | 计算成本 | `is_calc_cost` | Short |
| 10 | `memo` | 备注 | `memo` | String |
| 11 | `originalId` | 变更源 | `original_id` | Long |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |
| 13 | `quantity` | 数量 | `quantity` | Decimal |
| 14 | `quantityUnit` | 数量单位 | `quantity_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 15 | `rollup` | 卷积成本 | `rollup` | Short |
| 16 | `routingOperationId` | 工艺路线工序ID | `routingOperation_id` | e3ed947a-f5e9-45e7-86b9-a225e6cbfbfb |
| 17 | `rowno` | 序号 | `rowno` | Integer |
| 18 | `simulate` | 参与模拟 | `simulate` | Short |
| 19 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 20 | `totalUsage` | 总用量 | `total_usage` | Decimal |
| 21 | `workload` | 标准作业量 | `workload` | Decimal |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `quantityUnit` | 数量单位 | `pc.unit.Unit` | Service |  |
| 3 | `routingOperationId` | 工艺路线工序ID | `ed.mainformula.FormulaOperation` | None | true |
| 4 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 5 | `activityTypeId` | 作业类型 | `bd.activity.Activity` | Service |  |
