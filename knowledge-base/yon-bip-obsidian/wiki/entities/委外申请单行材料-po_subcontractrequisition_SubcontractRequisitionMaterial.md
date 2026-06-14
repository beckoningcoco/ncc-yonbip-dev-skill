---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.subcontractrequisition.SubcontractRequisitionMaterial"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外申请单行材料 (`po.subcontractrequisition.SubcontractRequisitionMaterial`)

> OSM | 物理表：`po_subcontract_requisition_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外申请单行材料 |
| 物理表 | `po_subcontract_requisition_material` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:58:36.2460` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 行号 |

---

## 直接属性（90个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `alternateGroupNo` | 替代组号 | `alternate_group_no` | String |
| 2 | `alternateSequence` | 替代顺序 | `alternate_sequence` | Long |
| 3 | `alternateUsageRate` | 使用比例 | `alternate_usage_rate` | Decimal |
| 4 | `ecnDetailId` | 工程变更行ID | `ecn_detail_id` | Long |
| 5 | `ecnDetailNo` | 工程变更行号 | `ecn_detail_no` | String |
| 6 | `ecnDetails` | 变更详情(废弃) | `ecn_details` | String |
| 7 | `ecnId` | 工程变更ID | `ecn_id` | Long |
| 8 | `ecnNo` | 工程变更单号 | `ecn_no` | String |
| 9 | `keySubPart` | 关键子件 | `key_sub_part` | Boolean |
| 10 | `supDirectShip` | 供应商直运 | `sup_direct_ship` | Boolean |
| 11 | `isWholeSet` | 齐套检查 | `is_whole_set` | Boolean |
| 12 | `sourcePoOrderMaterialId` | 来源生产订单材料ID | `source_po_order_material_id` | Long |
| 13 | `isWip` | 在制品 | `is_wip` | Boolean |
| 14 | `wipOpSn` | 在制品工序顺序号 | `wip_op_sn` | Decimal |
| 15 | `wipOperationId` | 在制品工序ID | `wip_operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 16 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 17 | `stepScrap` | 阶梯损耗 | `step_scrap` | Short |
| 18 | `stepScrapStart` | 阶梯损耗起始数量 | `step_scrap_start` | Decimal |
| 19 | `stepScrapEnd` | 阶梯损耗截止数量 | `step_scrap_end` | Decimal |
| 20 | `reserveid` | 跟踪线索Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 21 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 22 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 23 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 24 | `ecnStatus` | 变更状态 | `ecn_status` | Integer |
| 25 | `ecnTime` | 变更时间 | `ecn_time` | DateTime |
| 26 | `ecnUser` | 变更人 | `ecn_user` | String |
| 27 | `isKeyMaterial` | 替代基准料 | `is_key_material` | Boolean |
| 28 | `isMainMaterial` | 主料 | `is_main_material` | Boolean |
| 29 | `mustLossQuantity` | 固定损耗 | `must_loss_quantity` | Decimal |
| 30 | `defineCharacteristicsMat` | 自定义项特征组 | `define_cts` | cd111a46-6e33-4ca7-aa21-251bd00a3074 |
| 31 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 85490146-fefb-4d04-8d50-e91564a8bc95 |
| 32 | `bomAuxiliaryRecipientQty` | 应领件数(BOM单位) | `bom_auxiliary_recipient_qty` | Decimal |
| 33 | `bomUnitChangeRate` | BOM单位换算率 | `bom_unit_change_rate` | Decimal |
| 34 | `lineNo` | 行号 | `line_no` | Decimal |
| 35 | `bomUnitId` | BOM单位 | `bom_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 36 | `bomUnitUseQuantity` | 单位使用数量(BOM单位) | `bom_unit_use_quantity` | Decimal |
| 37 | `bomUnitUseQuantityInloss` | BOM单位使用数量(含损耗) | `bom_unit_use_quantity_inloss` | Decimal |
| 38 | `bomUnitUseQuantityNoloss` | BOM单位使用数量(不含损耗) | `bom_unit_use_quantity_noloss` | Decimal |
| 39 | `mainDenominatorQuantity` | 分母用量(主单位) | `main_denominator_quantity` | Decimal |
| 40 | `mainNumeratorQuantity` | 分子用量(主单位) | `main_numerator_quantity` | Decimal |
| 41 | `id` | ID | `id` | Long |
| 42 | `subcontractRequisitionProductId` | 委外申请单行id | `subcontract_requisition_product_id` | 88cbcf2d-a040-4a0b-845a-25bce8d0fb5d |
| 43 | `materialId` | 制造物料id | `material_id` | Long |
| 44 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 45 | `skuId` | SKU编码id | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 46 | `bomId` | BOMID | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 47 | `bomMaterialId` | BOM子件ID | `bom_material_id` | f78e2b2f-0634-41d3-a002-c5a68f3e9992 |
| 48 | `numeratorQuantity` | 子件用量 | `numerator_quantity` | Decimal |
| 49 | `denominatorQuantity` | 母件底数 | `denominator_quantity` | Decimal |
| 50 | `unitUseQuantity` | 单位使用数量 | `unit_use_quantity` | Decimal |
| 51 | `recipientQuantity` | 应领数量 | `recipient_quantity` | Decimal |
| 52 | `auxiliaryRecipientQuantity` | 应领件数 | `auxiliary_recipient_quantity` | Decimal |
| 53 | `stockUnitId` | 库存单位ID | `stock_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 54 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 55 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 56 | `fixedQuantity` | 固定用量 | `fixed_quantity` | Short |
| 57 | `scrap` | 子件损耗率% | `scrap` | Decimal |
| 58 | `truncUp` | 向上取整 | `trunc_up` | Short |
| 59 | `alternateType` | 替代方式 | `alternate_type` | Short |
| 60 | `alternateId` | BOM替代料ID | `alternate_id` | d380f5d1-7c66-44c1-9dbb-79d14b79fd93 |
| 61 | `substituteFlag` | 替代标识 | `substitute_flag` | SubstituteFlag |
| 62 | `supplyType` | 发料方式 | `supply_type` | Long |
| 63 | `orgId` | 库存组织id | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 64 | `warehouseId` | 供应仓库id | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 65 | `transferOutOrgId` | 调出组织id | `transfer_out_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 66 | `transferOutWarehouseId` | 调出仓库id | `transfer_out_warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 67 | `subcontractSupplyType` | 委外供应方式 | `subcontract_supply_type` | Integer |
| 68 | `remark` | 备注 | `remark` | String |
| 69 | `pubts` | 时间戳 | `pubts` | DateTime |
| 70 | `free1` | 物料规格1 | `free1` | String |
| 71 | `free2` | 物料规格2 | `free2` | String |
| 72 | `free3` | 物料规格3 | `free3` | String |
| 73 | `free4` | 香雪产地 | `free4` | String |
| 74 | `free5` | 组织 | `free5` | String |
| 75 | `free6` | 物料规格6 | `free6` | String |
| 76 | `free7` | 物料规格7 | `free7` | String |
| 77 | `free8` | 物料规格8 | `free8` | String |
| 78 | `free9` | 物料规格9 | `free9` | String |
| 79 | `free10` | 物料规格10 | `free10` | String |
| 80 | `rowno` | 行号 | `rowno` | Integer |
| 81 | `alternateRatio` | 替代比 | `alternate_ratio` | Decimal |
| 82 | `bomUnitChangeRateDen` | BOM单位换算率分母 | `bom_unit_change_rateden` | Decimal |
| 83 | `bomUnitChangeRateNum` | BOM单位换算率分子 | `bom_unit_change_ratenum` | Decimal |
| 84 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 85 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 86 | `inventoryowner` | 货主ID | `inventory_owner` | af1b583d-f5e4-4f7c-bba5-66d570ef7e3e |
| 87 | `materialExtItem` | 材料自由自定义项 | `` | b26f4179-d347-4101-aed9-580f68a1d2b9 |
| 88 | `orderMaterialUserdefItem` | 材料表固定自定义项 | `` | 657059f8-5c32-4c0d-a418-f85cff768724 |
| 89 | `ownertype` | 货主类型 | `owner_type` | Integer |
| 90 | `requirementDate` | 需求日期 | `requirement_date` | DateTime |

---

## 关联属性（23个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `defineCharacteristicsMat` | 自定义项特征组 | `po.subcontractrequisition.MaterialDefineCharacteristics` | None |  |
| 2 | `bomId` | BOMID | `ed.bom.Bom` | Service |  |
| 3 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 4 | `reserveid` | 跟踪线索Id | `st.reservation.Reservation` | Service |  |
| 5 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 6 | `transferOutWarehouseId` | 调出仓库id | `aa.warehouse.Warehouse` | Service |  |
| 7 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 8 | `transferOutOrgId` | 调出组织id | `aa.baseorg.OrgMV` | Service |  |
| 9 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 10 | `materialExtItem` | 材料自由自定义项 | `po.subcontractrequisition.SubcontractRequisitionMaterialExtItem` | None | true |
| 11 | `bomMaterialId` | BOM子件ID | `ed.bom.BomComponent` | Service |  |
| 12 | `orderMaterialUserdefItem` | 材料表固定自定义项 | `po.subcontractrequisition.SubcontractRequisitionMaterialDefine` | None | true |
| 13 | `orgId` | 库存组织id | `aa.baseorg.OrgMV` | Service |  |
| 14 | `alternateId` | BOM替代料ID | `ed.bom.BomAlternate` | Service |  |
| 15 | `freeCharacteristics` | 自由项特征组 | `po.subcontractrequisition.MaterialFreeCharacteristics` | None |  |
| 16 | `warehouseId` | 供应仓库id | `aa.warehouse.Warehouse` | Service |  |
| 17 | `wipOperationId` | 在制品工序ID | `ed.operation.Operation` | Service |  |
| 18 | `bomUnitId` | BOM单位 | `pc.unit.Unit` | Service |  |
| 19 | `subcontractRequisitionProductId` | 委外申请单行id | `po.subcontractrequisition.SubcontractRequisitionProduct` | None | true |
| 20 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 21 | `inventoryowner` | 货主ID | `st.inventoryowner.InventoryOwner` | Service |  |
| 22 | `skuId` | SKU编码id | `pc.product.ProductSKU` | Service |  |
| 23 | `stockUnitId` | 库存单位ID | `pc.unit.Unit` | Service |  |
