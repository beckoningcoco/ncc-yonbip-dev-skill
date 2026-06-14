---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "osmsu.order.OrderMaterial"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 受托加工单材料 (`osmsu.order.OrderMaterial`)

> ycSaleCoor | 物理表：`osmsu_order_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 受托加工单材料 |
| 物理表 | `osmsu_order_material` |
| domain/服务域 | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:33:09.0780` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（48个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `lineNo` | 行号 | `line_no` | Decimal |
| 3 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 4 | `ctId` | 自定义项特征组id | `ct_id` | 102fc2c0-1f06-4601-908c-74a92166b9dd |
| 5 | `activity` | 活动id | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 6 | `wbs` | WBS任务id | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 7 | `wbsName` | WBS任务 | `wbs_name` | String |
| 8 | `free10` | 规格10 | `free10` | String |
| 9 | `activityCode` | 活动编码 | `activity_code` | String |
| 10 | `free2` | 规格2 | `free2` | String |
| 11 | `free3` | 规格3 | `free3` | String |
| 12 | `free1` | 规格1 | `free1` | String |
| 13 | `free6` | 规格6 | `free6` | String |
| 14 | `free7` | 规格7 | `free7` | String |
| 15 | `operationId` | 工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 16 | `free4` | 规格4 | `free4` | String |
| 17 | `free5` | 规格5 | `free5` | String |
| 18 | `free8` | 规格8 | `free8` | String |
| 19 | `tenant` | 租户ID | `tenant_id` | String |
| 20 | `free9` | 规格9 | `free9` | String |
| 21 | `wbsCode` | WBS任务编码 | `wbs_code` | String |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 23 | `activityName` | 活动 | `activity_name` | String |
| 24 | `isWip` | 在制品 | `is_wip` | Boolean |
| 25 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 26 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 27 | `dctId` | 自由项特征组id | `dct_id` | 1cc76977-b7f3-4048-ba89-be9baf1332b6 |
| 28 | `stockUnitId` | 库存单位ID | `stock_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 29 | `fixedQuantity` | 固定用量 | `fixed_quantity` | Short |
| 30 | `numeratorQuantity` | 子件用量 | `numerator_quantity` | Decimal |
| 31 | `denominatorQuantity` | 母件底数 | `denominator_quantity` | Decimal |
| 32 | `scrap` | 子件损耗率% | `scrap` | Decimal |
| 33 | `unitUseQuantity` | 单位使用数量 | `unit_use_quantity` | Decimal |
| 34 | `auxiliaryRecipientQuantity` | 应领数量 | `auxiliary_recipient_quantity` | Decimal |
| 35 | `subcontractSupplyType` | 委外供应方式 | `subcontract_supply_type` | Integer |
| 36 | `supDirectShip` | 供应商直运 | `sup_direct_ship` | Boolean |
| 37 | `skuId` | skuId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 38 | `substituteFlag` | 替代标识 | `substitute_flag` | String |
| 39 | `engineeringDrawNo` | 工程图号 | `engineering_draw_no` | String |
| 40 | `remark` | 备注 | `remark` | String |
| 41 | `doubleReplenish` | 补货倍量 | `double_replenish` | Decimal |
| 42 | `auxiliaryReplenishAdjustQuantity` | 补货调整数量 | `auxiliary_replenish_adjust_quantity` | Decimal |
| 43 | `processSn` | 工序顺序号 | `process_sn` | Decimal |
| 44 | `orderProductId` | 产品id | `order_product_id` | 1570856b-127c-4512-9d6e-a3bfb55162ef |
| 45 | `buyerTenant` | 采购商租户id | `buyer_tenant_id` | String |
| 46 | `pubts` | 时间戳 | `pubts` | DateTime |
| 47 | `orderMaterialAttrextItem` | 材料表自由自定义项 | `` | 5ac56967-793a-45bc-b776-c62f58597332 |
| 48 | `orderMaterialUserdefItem` | 材料表固定自定义项 | `` | 5156823b-607c-4797-991f-886be3a0eee9 |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ctId` | 自定义项特征组id | `osmsu.order.OrderMaterialCt` | None |  |
| 2 | `activity` | 活动id | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 3 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `wbs` | WBS任务id | `BGDM.wbs.wbs_doc` | Service |  |
| 6 | `orderProductId` | 产品id | `osmsu.order.OrderProduct` | None | true |
| 7 | `orderMaterialUserdefItem` | 材料表固定自定义项 | `osmsu.order.OrderMaterialUserdefItem` | None | true |
| 8 | `orderMaterialAttrextItem` | 材料表自由自定义项 | `osmsu.order.OrderMaterialAttrextItem` | None | true |
| 9 | `operationId` | 工序ID | `ed.operation.Operation` | Service |  |
| 10 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 11 | `skuId` | skuId | `pc.product.ProductSKU` | Service |  |
| 12 | `dctId` | 自由项特征组id | `osmsu.order.OrderMaterialDct` | None |  |
| 13 | `stockUnitId` | 库存单位ID | `pc.unit.Unit` | Service |  |
