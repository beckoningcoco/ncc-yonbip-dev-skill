---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planworkbench.PlanOrderQuantity"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划订单扩展表 (`mr.planworkbench.PlanOrderQuantity`)

> MR | 物理表：`mr_plan_order_quantity`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划订单扩展表 |
| 物理表 | `mr_plan_order_quantity` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:16:32.9690` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（36个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `consumQty` | 冲销数量 | `consum_qty` | Decimal |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `datasub` | 应用来源 | `datasub` | String |
| 7 | `grossQty` | 毛需求 | `gross_qty` | Decimal |
| 8 | `id` | id | `id` | Long |
| 9 | `issueRequisitionQty` | 出库申请量 | `issue_requisition_qty` | Decimal |
| 10 | `mainInputQty` | 主计量投入计划量 | `main_input_qty` | Decimal |
| 11 | `modifier` | 修改人名称 | `modifier` | String |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `outsourcePickingQty` | 委外领料量 | `outsource_picking_qty` | Decimal |
| 16 | `outsourceStockQty` | 委外备料数量 | `outsource_stock_qty` | Decimal |
| 17 | `outsourcingReceiveQty` | 委外接收量 | `outsourcing_receive_qty` | Decimal |
| 18 | `pendingInspectionQty` | 待检量 | `pending_inspection_qty` | Decimal |
| 19 | `planIssuedQty` | 计划下达量 | `plan_issued_qty` | Decimal |
| 20 | `planOrderId` | 计划订单id | `plan_order_id` | 8217afbf-acdc-42ef-a799-75a88d9fa69d |
| 21 | `planPickingQty` | 计划领料量 | `plan_picking_qty` | Decimal |
| 22 | `planTransferInQty` | 计划调入量 | `plan_transfer_in_qty` | Decimal |
| 23 | `productionPickingQty` | 生产领料量 | `production_picking_qty` | Decimal |
| 24 | `productionReceiveQty` | 生产接收量 | `production_receive_qty` | Decimal |
| 25 | `pubts` | 时间戳 | `pubts` | DateTime |
| 26 | `purchaseReceiveQty` | 采购接收量 | `purchase_receive_qty` | Decimal |
| 27 | `safetyStockQty` | 安全库存量 | `safety_stock_qty` | Decimal |
| 28 | `salesForecastQty` | 计划独立需求量 | `sales_forecast_qty` | Decimal |
| 29 | `salesOrderQty` | 销售订单量 | `sales_order_qty` | Decimal |
| 30 | `stockQty` | 库存量 | `stock_qty` | Decimal |
| 31 | `substituteQty` | 替代量 | `substitute_qty` | Decimal |
| 32 | `supplyQty` | 供给量 | `supply_qty` | Decimal |
| 33 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 34 | `transferOutQty` | 调出量 | `transfer_out_qty` | Decimal |
| 35 | `unreturnedBorrowingQty` | 借用未还量 | `unreturned_borrowing_qty` | Decimal |
| 36 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `planOrderId` | 计划订单id | `mr.planworkbench.PlanOrder` | None | true |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
