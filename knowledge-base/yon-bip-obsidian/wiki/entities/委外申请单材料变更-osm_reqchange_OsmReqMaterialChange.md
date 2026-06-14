---
tags: ["BIP", "元数据", "数据字典", "OSM", "osm.reqchange.OsmReqMaterialChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外申请单材料变更 (`osm.reqchange.OsmReqMaterialChange`)

> OSM | 物理表：`osm_req_material_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外申请单材料变更 |
| 物理表 | `osm_req_material_change` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:56:54.0480` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（91个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 2 | `alternateGroupNo` | 替代组号 | `alternate_group_no` | String |
| 3 | `alternateId` | BOM替代料ID | `alternate_id` | d380f5d1-7c66-44c1-9dbb-79d14b79fd93 |
| 4 | `alternateRatio` | 替代比 | `alternate_ratio` | Decimal |
| 5 | `alternateSequence` | 替代顺序 | `alternate_sequence` | Long |
| 6 | `alternateType` | 替代方式 | `alternate_type` | Short |
| 7 | `alternateUsageRate` | 使用比例 | `alternate_usage_rate` | Decimal |
| 8 | `auxiliaryRecipientQuantity` | 应领件数 | `auxiliary_recipient_quantity` | Decimal |
| 9 | `bomAuxiliaryRecipientQty` | 应领件数(BOM单位) | `bom_auxiliary_recipient_qty` | Decimal |
| 10 | `bomId` | BOMID | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 11 | `bomMaterialId` | BOM子件ID | `bom_material_id` | f78e2b2f-0634-41d3-a002-c5a68f3e9992 |
| 12 | `bomUnitChangeRate` | BOM单位换算率 | `bom_unit_change_rate` | Decimal |
| 13 | `bomUnitChangeRateDen` | BOM单位换算率分母 | `bom_unit_change_rateden` | Decimal |
| 14 | `bomUnitChangeRateNum` | BOM单位换算率分子 | `bom_unit_change_ratenum` | Decimal |
| 15 | `bomUnitId` | BOM单位 | `bom_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 16 | `bomUnitUseQuantity` | 单位使用数量(BOM单位) | `bom_unit_use_quantity` | Decimal |
| 17 | `bomUnitUseQuantityInloss` | BOM单位使用数量(含损耗) | `bom_unit_use_quantity_inloss` | Decimal |
| 18 | `bomUnitUseQuantityNoloss` | BOM单位使用数量(不含损耗) | `bom_unit_use_quantity_noloss` | Decimal |
| 19 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 20 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 21 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 22 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 23 | `defineCharacteristicsMat` | 自定义项特征组 | `define_cts` | 408df734-8b0e-43d8-a9a7-e30eaff00ab8 |
| 24 | `denominatorQuantity` | 分母用量(BOM单位) | `denominator_quantity` | Decimal |
| 25 | `ecnDetailId` | 工程变更行ID | `ecn_detail_id` | Long |
| 26 | `ecnDetailNo` | 工程变更行号 | `ecn_detail_no` | String |
| 27 | `ecnDetails` | 变更详情(废弃) | `ecn_details` | String |
| 28 | `ecnId` | 工程变更ID | `ecn_id` | Long |
| 29 | `ecnNo` | 工程变更单号 | `ecn_no` | String |
| 30 | `ecnStatus` | 变更状态 | `ecn_status` | Integer |
| 31 | `ecnTime` | 变更时间 | `ecn_time` | DateTime |
| 32 | `ecnUser` | 变更人 | `ecn_user` | String |
| 33 | `fixedQuantity` | 固定用量 | `fixed_quantity` | Short |
| 34 | `free1` | 规格1 | `free1` | String |
| 35 | `free10` | 规格10 | `free10` | String |
| 36 | `free2` | 规格2 | `free2` | String |
| 37 | `free3` | 规格3 | `free3` | String |
| 38 | `free4` | 规格4 | `free4` | String |
| 39 | `free5` | 规格5 | `free5` | String |
| 40 | `free6` | 规格6 | `free6` | String |
| 41 | `free7` | 规格7 | `free7` | String |
| 42 | `free8` | 规格8 | `free8` | String |
| 43 | `free9` | 规格9 | `free9` | String |
| 44 | `freeCharacteristics` | 自由项特征组 | `free_cts` | aa8e07da-4735-4b7f-b97c-9879b63eafb1 |
| 45 | `id` | id | `id` | Long |
| 46 | `inventoryowner` | 货主ID | `inventory_owner` | af1b583d-f5e4-4f7c-bba5-66d570ef7e3e |
| 47 | `isKeyMaterial` | 替代基准料 | `is_key_material` | Boolean |
| 48 | `isMainMaterial` | 主料 | `is_main_material` | Boolean |
| 49 | `isWholeSet` | 齐套检查 | `is_whole_set` | Boolean |
| 50 | `isWip` | 在制品 | `is_wip` | Boolean |
| 51 | `keySubPart` | 关键子件 | `key_sub_part` | Boolean |
| 52 | `lineNo` | 行号 | `line_no` | Decimal |
| 53 | `mainDenominatorQuantity` | 分母用量(主单位) | `main_denominator_quantity` | Decimal |
| 54 | `mainNumeratorQuantity` | 分子用量(主单位) | `main_numerator_quantity` | Decimal |
| 55 | `materialId` | 制造物料ID | `material_id` | Long |
| 56 | `mustLossQuantity` | 固定损耗 | `must_loss_quantity` | Decimal |
| 57 | `numeratorQuantity` | 分子用量(BOM单位) | `numerator_quantity` | Decimal |
| 58 | `orgId` | 库存组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 59 | `originalReqMaterialId` | 原委外申请单行材料ID | `original_req_material_id` | 183e1151-4f0f-4e80-8b78-20b1480dc8bb |
| 60 | `originalReqProductId` | 原委外申请单行ID | `original_req_product_id` | 88cbcf2d-a040-4a0b-845a-25bce8d0fb5d |
| 61 | `ownertype` | 货主类型 | `owner_type` | Integer |
| 62 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 63 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 64 | `pubts` | 时间戳 | `pubts` | DateTime |
| 65 | `recipientQuantity` | 应领数量 | `recipient_quantity` | Decimal |
| 66 | `remark` | 备注 | `remark` | String |
| 67 | `reqProductId` | 产品id | `req_product_id` | 3b18adf7-8938-4841-b5af-5f11d4a5b9b0 |
| 68 | `requirementDate` | 需求日期 | `requirement_date` | DateTime |
| 69 | `reserveid` | 跟踪线索Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 70 | `rowno` | 序号 | `rowno` | Integer |
| 71 | `scrap` | 子件耗损率% | `scrap` | Decimal |
| 72 | `skuId` | skuId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 73 | `sourcePoOrderMaterialId` | 来源生产订单材料ID | `source_po_order_material_id` | Long |
| 74 | `stepScrap` | 阶梯损耗 | `step_scrap` | Short |
| 75 | `stepScrapEnd` | 阶梯损耗截止数量 | `step_scrap_end` | Decimal |
| 76 | `stepScrapStart` | 阶梯损耗起始数量 | `step_scrap_start` | Decimal |
| 77 | `stockUnitId` | 库存单位 | `stock_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 78 | `subcontractRequisitionProductId` | 委外申请单行id | `subcontract_requisition_product_id` | 88cbcf2d-a040-4a0b-845a-25bce8d0fb5d |
| 79 | `subcontractSupplyType` | 委外供应方式 | `subcontract_supply_type` | Integer |
| 80 | `substituteFlag` | 替代标识 | `substitute_flag` | SubstituteFlag |
| 81 | `supDirectShip` | 供应商直运 | `sup_direct_ship` | Boolean |
| 82 | `supplyType` | 发料方式 | `supply_type` | Long |
| 83 | `transferOutOrgId` | 调出组织 | `transfer_out_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 84 | `transferOutWarehouseId` | 调出仓库 | `transfer_out_warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 85 | `truncUp` | 向上取整 | `trunc_up` | Short |
| 86 | `unitUseQuantity` | 单位使用数量(主单位) | `unit_use_quantity` | Decimal |
| 87 | `warehouseId` | 供应仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 88 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 89 | `wipOpSn` | 在制品工序顺序号 | `wip_op_sn` | Decimal |
| 90 | `wipOperationId` | 在制品工序ID | `wip_operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 91 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（24个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `defineCharacteristicsMat` | 自定义项特征组 | `osm.reqchange.OsmReqMaterialChangeDefineCharacteristics` | None |  |
| 2 | `bomId` | BOMID | `ed.bom.Bom` | Service |  |
| 3 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 4 | `reserveid` | 跟踪线索Id | `st.reservation.Reservation` | Service |  |
| 5 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 6 | `transferOutWarehouseId` | 调出仓库 | `aa.warehouse.Warehouse` | Service |  |
| 7 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 8 | `transferOutOrgId` | 调出组织 | `aa.baseorg.OrgMV` | Service |  |
| 9 | `originalReqMaterialId` | 原委外申请单行材料ID | `po.subcontractrequisition.SubcontractRequisitionMaterial` | None |  |
| 10 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 11 | `reqProductId` | 产品id | `osm.reqchange.OsmReqProductChange` | None | true |
| 12 | `bomMaterialId` | BOM子件ID | `ed.bom.BomComponent` | Service |  |
| 13 | `orgId` | 库存组织 | `aa.baseorg.OrgMV` | Service |  |
| 14 | `originalReqProductId` | 原委外申请单行ID | `po.subcontractrequisition.SubcontractRequisitionProduct` | None |  |
| 15 | `alternateId` | BOM替代料ID | `ed.bom.BomAlternate` | Service |  |
| 16 | `freeCharacteristics` | 自由项特征组 | `osm.reqchange.OsmReqMaterialChangeFreeCharacteristics` | None |  |
| 17 | `warehouseId` | 供应仓库 | `aa.warehouse.Warehouse` | Service |  |
| 18 | `wipOperationId` | 在制品工序ID | `ed.operation.Operation` | Service |  |
| 19 | `bomUnitId` | BOM单位 | `pc.unit.Unit` | Service |  |
| 20 | `subcontractRequisitionProductId` | 委外申请单行id | `po.subcontractrequisition.SubcontractRequisitionProduct` | None |  |
| 21 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 22 | `inventoryowner` | 货主ID | `st.inventoryowner.InventoryOwner` | Service |  |
| 23 | `skuId` | skuId | `pc.product.ProductSKU` | Service |  |
| 24 | `stockUnitId` | 库存单位 | `pc.unit.Unit` | Service |  |
