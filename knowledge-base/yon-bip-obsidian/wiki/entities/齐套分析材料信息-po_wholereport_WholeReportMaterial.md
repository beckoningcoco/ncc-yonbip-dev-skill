---
tags: ["BIP", "元数据", "数据字典", "PO", "po.wholereport.WholeReportMaterial"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 齐套分析材料信息 (`po.wholereport.WholeReportMaterial`)

> PO | 物理表：`po_whole_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 齐套分析材料信息 |
| 物理表 | `po_whole_material` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:34:18.1200` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（66个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `orgId` | 库存组织 | `org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 5 | `alternateSequence` | 替代顺序 | `alternate_sequence` | Long |
| 6 | `substituteFlag` | 替代标识 | `substitute_flag` | Short |
| 7 | `alternateGroupNo` | 替代组号 | `alternate_group_no` | String |
| 8 | `alternateId` | 替代料Id | `alternate_id` | Long |
| 9 | `alternateType` | 替代方式 | `alternate_type` | Short |
| 10 | `bomMaterialId` | 子件Id | `bom_material_id` | Long |
| 11 | `bomUnitId` | BOM单位 | `bom_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 12 | `osmRecipientQty` | 委外应领数量 | `osm_recipient_qty` | Decimal |
| 13 | `appliedRestQuantity` | 领料申请未出库数量 | `applied_rest_qty` | Decimal |
| 14 | `cfmReceivedQty` | 确认已领数量 | `cfm_received_qty` | Decimal |
| 15 | `cfmAuxReceivedQty` | 确认已领件数 | `cfm_aux_received_qty` | Decimal |
| 16 | `collaborationType` | 材料协同方式 | `collaboration_type` | Short |
| 17 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 18 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 19 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 20 | `isKeyMaterial` | 关键料 | `is_key_material` | Boolean |
| 21 | `isMainMaterial` | 主料 | `is_main_material` | Boolean |
| 22 | `reserveid` | 跟踪线索Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 23 | `orderCode` | 委外订单 | `order_code` | String |
| 24 | `usageType` | 用量类型 | `usage_type` | ItemUsageTypeEnum |
| 25 | `planMaterialQuantity` | 计划发料量 | `plan_material_quantity` | Decimal |
| 26 | `supplyType` | 发料方式 | `supply_type` | ItemSupplyType |
| 27 | `transferQuantity` | 已调拨数量 | `transfer_quantity` | Decimal |
| 28 | `auxiliaryTransferQuantity` | 已调拨件数 | `auxiliary_transfer_quantity` | Decimal |
| 29 | `billSource` | 生单来源 | `bill_source` | Integer |
| 30 | `replenishAdjustQuantity` | 调整补货数量 | `replenish_adjust_quantity` | Decimal |
| 31 | `auxiliaryReplenishAdjustQuantity` | 调整补货件数 | `auxiliary_replenish_adjust_quantity` | Decimal |
| 32 | `requirementDate` | 需求日期 | `requirement_date` | DateTime |
| 33 | `supDirectShip` | 供应商直运 | `sup_direct_ship` | Boolean |
| 34 | `bomSensitiveUID` | BOM敏感域唯一性ID | `bom_sensitive_uid` | String |
| 35 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 36 | `freeCharacteristics` | 自由项特征组 | `free_characteristics` | 31506409-49a2-4464-bde7-85a0e222e224 |
| 37 | `materialDefineCharacter` | 自定义项特征属性组 | `material_define_ct` | e1bc5bd4-e578-4e8d-a0f9-b6a4fb8feaa2 |
| 38 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 39 | `pubts` | 时间戳 | `pubts` | DateTime |
| 40 | `wholeId` | 齐套分析id | `whole_id` | a8af8064-3e34-4ffe-9eb9-8f289b1aabcc |
| 41 | `orderProductId` | 成品id | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 42 | `orderMaterialId` | 生产订单材料id | `order_material_id` | d421b3fa-9bcd-4db2-b43b-fbc55db29ae7 |
| 43 | `materialId` | 制造物料 | `material_id` | Long |
| 44 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 45 | `stockUnitId` | 库存单位 | `stock_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 46 | `skuId` | skuId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 47 | `lineNo` | 产品行号 | `line_no` | Decimal |
| 48 | `isWholeSet` | 是否齐套 | `is_whole_set` | Boolean |
| 49 | `fixedQuantity` | 固定用量 | `fixed_quantity` | Short |
| 50 | `unitUseQuantity` | 单位使用数量 | `unit_use_quantity` | Decimal |
| 51 | `recipientQuantity` | 应领数量 | `recipient_quantity` | Decimal |
| 52 | `auxiliaryRecipientQuantity` | 应领件数 | `auxiliary_recipient_quantity` | Decimal |
| 53 | `appliedQuantity` | 已申请数量 | `applied_quantity` | Decimal |
| 54 | `auxiliaryAppliedQuantity` | 已申请件数 | `auxiliary_applied_quantity` | Decimal |
| 55 | `receivedQuantity` | 已领数量 | `received_quantity` | Decimal |
| 56 | `auxiliaryReceivedQuantity` | 已领件量 | `auxiliary_received_quantity` | Decimal |
| 57 | `warehouseId` | 供应仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 58 | `currentStockQuantity` | 现存量 | `current_stock_quantity` | Decimal |
| 59 | `wholeSetQuantity` | 可齐套数量 | `whole_set_quantity` | Decimal |
| 60 | `shortageQuantity` | 缺料量 | `shortage_quantity` | Decimal |
| 61 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 62 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 63 | `dailyPlanId` | 订单日计划id | `daily_plan_id` | d421b3fa-9bcd-4db2-b43b-fbc55db29ae7 |
| 64 | `inventoryowner` | 货主ID | `inventory_owner` | af1b583d-f5e4-4f7c-bba5-66d570ef7e3e |
| 65 | `orderDailyPlanCode` | 订单日计划编号 | `order_daily_plan_code` | String |
| 66 | `ownertype` | 货主类型 | `owner_type` | Integer |

---

## 关联属性（20个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 2 | `reserveid` | 跟踪线索Id | `st.reservation.Reservation` | Service |  |
| 3 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 6 | `orderProductId` | 成品id | `po.order.OrderProduct` | None |  |
| 7 | `orgId` | 库存组织 | `org.func.InventoryOrg` | Service |  |
| 8 | `dailyPlanId` | 订单日计划id | `base.entity.BizObject` | None |  |
| 9 | `materialDefineCharacter` | 自定义项特征属性组 | `po.wholereport.MaterialDefineCharacter` | None |  |
| 10 | `orderMaterialId` | 生产订单材料id | `base.entity.BizObject` | None |  |
| 11 | `freeCharacteristics` | 自由项特征组 | `po.wholereport.MaterialFreeCharacteristics` | None |  |
| 12 | `warehouseId` | 供应仓库 | `aa.warehouse.Warehouse` | Service |  |
| 13 | `bomUnitId` | BOM单位 | `pc.unit.Unit` | Service |  |
| 14 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 15 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 16 | `inventoryowner` | 货主ID | `st.inventoryowner.InventoryOwner` | Service |  |
| 17 | `skuId` | skuId | `pc.product.ProductSKU` | Service |  |
| 18 | `wholeId` | 齐套分析id | `po.wholereport.WholeReport` | None | true |
| 19 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 20 | `stockUnitId` | 库存单位 | `pc.unit.Unit` | Service |  |
