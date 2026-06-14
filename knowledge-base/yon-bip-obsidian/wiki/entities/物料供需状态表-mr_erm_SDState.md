---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.erm.SDState"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 物料供需状态表 (`mr.erm.SDState`)

> MR | 物理表：`mr_sd_state`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料供需状态表 |
| 物理表 | `mr_sd_state` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:40.7310` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `stockOrgId` | 库存组织 | `stock_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 4 | `planSchemeId` | 计划方案 | `plan_scheme_id` | 0807eed3-7def-4362-b2ec-8fea5c435fc7 |
| 5 | `sdState` | 供需状态 | `sd_state` | SDStateEnum |
| 6 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 7 | `freeCharacteristics` | 自由项特征组 | `free_characteristics` | f0f6551f-0abc-4dbc-b8d1-a60f4755410d |
| 8 | `unitId` | 主计量单位 | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 9 | `reqQty` | 需求数量 | `req_qty` | Decimal |
| 10 | `reserveid` | 跟踪线索id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 11 | `departmentId` | 部门 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 12 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 13 | `safetyStockQty` | 安全库存量 | `safety_stock_qty` | Decimal |
| 14 | `currentStockQty` | 现存量 | `current_stock_qty` | Decimal |
| 15 | `supplyQty` | 供应量 | `supply_qty` | Decimal |
| 16 | `shortageQty` | 缺料数量 | `shortage_qty` | Decimal |
| 17 | `earliestShortageDate` | 最早缺料日期 | `earliest_shortage_date` | DateTime |
| 18 | `otherStockQty` | 其它组织库存量 | `other_stock_qty` | Decimal |
| 19 | `otherWarehouseQty` | 其它仓库库存量 | `other_warehouse_qty` | Decimal |
| 20 | `datasub` | 应用来源 | `datasub` | String |
| 21 | `startDate` | 起始日期 | `start_date` | DateTime |
| 22 | `endDate` | 结束日期 | `end_date` | DateTime |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |
| 24 | `SDStateInfoList` | 物料供需状态明细表 | `` | c5681a94-0c02-470e-8fa4-a272f15edd28 |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `freeCharacteristics` | 自由项特征组 | `mr.erm.SDStateFCT` | None |  |
| 2 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 3 | `reserveid` | 跟踪线索id | `st.reservation.Reservation` | Service |  |
| 4 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `departmentId` | 部门 | `aa.baseorg.DeptMV` | Service |  |
| 7 | `stockOrgId` | 库存组织 | `org.func.BaseOrg` | Service |  |
| 8 | `unitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 9 | `SDStateInfoList` | 物料供需状态明细表 | `mr.erm.SDStateInfo` | None | true |
| 10 | `planSchemeId` | 计划方案 | `mr.planscheme.PlanScheme` | None |  |
