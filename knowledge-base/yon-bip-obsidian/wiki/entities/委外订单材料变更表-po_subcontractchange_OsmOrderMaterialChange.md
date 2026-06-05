---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.subcontractchange.OsmOrderMaterialChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外订单材料变更表 (`po.subcontractchange.OsmOrderMaterialChange`)

> OSM | 物理表：`osm_order_material_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外订单材料变更表 |
| 物理表 | `osm_order_material_change` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:57:19.5260` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 行号 |

---

## 直接属性（154个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `addByAutoBackFlush` | 是否入库倒冲自动添加 | `add_by_auto_back_flush` | Boolean |
| 2 | `alternateGroupNo` | 替代组号 | `alternate_group_no` | String |
| 3 | `alternateSequence` | 替代顺序 | `alternate_sequence` | Long |
| 4 | `alternateUsageRate` | 使用比例 | `alternate_usage_rate` | Decimal |
| 5 | `appliedKit` | 已申领套数 | `applied_kit` | Decimal |
| 6 | `appliedQuantity` | 已申请数量 | `applied_quantity` | Decimal |
| 7 | `auxiliaryAppliedQuantity` | 已申请件数 | `auxiliary_applied_quantity` | Decimal |
| 8 | `auxiliaryExcessAppliedQty` | 已超额申请件数 | `auxiliary_excess_applied_qty` | Decimal |
| 9 | `auxiliaryExcessRecipientQty` | 已超领件数 | `auxiliary_excess_recipient_qty` | Decimal |
| 10 | `auxiliaryReceivedQuantity` | 已领件量 | `auxiliary_received_quantity` | Decimal |
| 11 | `auxiliaryTransferQuantity` | 已调拨件数 | `auxiliary_transfer_quantity` | Decimal |
| 12 | `calcCostFlag` | 计算成本 | `calc_cost_flag` | Short |
| 13 | `ecnDetailId` | 工程变更行ID | `ecn_detail_id` | Long |
| 14 | `ecnDetailNo` | 工程变更行号 | `ecn_detail_no` | String |
| 15 | `osmRecipientQty` | 委外应领数量 | `osm_recipient_qty` | Decimal |
| 16 | `collaborationType` | 材料协同方式 | `collaboration_type` | Short |
| 17 | `collaborationMaterialLineNo` | 协同源头材料行号 | `collaboration_material_line_no` | Decimal |
| 18 | `collaborationMaterialId` | 协同源头材料行id | `collaboration_material_id` | Long |
| 19 | `cfmReceivedQty` | 确认已领数量 | `cfm_received_qty` | Decimal |
| 20 | `cfmAuxReceivedQty` | 确认已领件数 | `cfm_aux_received_qty` | Decimal |
| 21 | `cfmExcessRecipientQty` | 确认已超领数量 | `cfm_excess_recipient_qty` | Decimal |
| 22 | `cfmExcessAuxQty` | 确认已超领件数 | `cfm_excess_aux_qty` | Decimal |
| 23 | `cfmReceivedKit` | 确认已领套数 | `cfm_received_kit` | Decimal |
| 24 | `osmReceivedQty` | 委外已领数量 | `osm_received_qty` | Decimal |
| 25 | `materialStatus` | 领料状态 | `material_status` | Short |
| 26 | `appliedRetQuantity` | 退料申请数量 | `applied_ret_qty` | Decimal |
| 27 | `auxiliaryAppliedRetQuantity` | 退料申请件数 | `aux_applied_ret_qty` | Decimal |
| 28 | `appliedRetRestQuantity` | 退料申请未退库数量 | `applied_ret_rest_qty` | Decimal |
| 29 | `auxiliaryAppliedRetRestQuantity` | 退料申请未退库件数 | `aux_applied_ret_rest_qty` | Decimal |
| 30 | `excessAppliedRetQty` | 超额退料申请数量 | `excess_applied_ret_qty` | Decimal |
| 31 | `auxiliaryExcessAppliedRetQty` | 超额退料申请件数 | `aux_excess_applied_ret_qty` | Decimal |
| 32 | `excessAppliedRetRestQty` | 超额退料申请未退库数量 | `excess_applied_ret_rest_qty` | Decimal |
| 33 | `auxiliaryExcessAppliedRetRestQty` | 超额退料申请未退库件数 | `aux_excess_applied_ret_rest_qty` | Decimal |
| 34 | `appliedRestQuantity` | 领料申请未出库数量 | `applied_rest_qty` | Decimal |
| 35 | `auxiliaryAppliedRestQuantity` | 领料申请未出库件数 | `aux_applied_rest_qty` | Decimal |
| 36 | `excessAppliedRestQty` | 超额领料申请未出库数量 | `excess_applied_rest_qty` | Decimal |
| 37 | `auxiliaryExcessAppliedRestQty` | 超额领料申请未出库件数 | `aux_excess_applied_rest_qty` | Decimal |
| 38 | `entrustSupplyType` | 受托加工供应方式 | `entrust_supply_type` | Short |
| 39 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 40 | `standardQty` | 标准用量 | `standard_qty` | Decimal |
| 41 | `bomRequireQty` | BOM需求数量 | `bom_require_qty` | Decimal |
| 42 | `materialVerifStatus` | 材料核销状态 | `material_verif_status` | MaterialVerifiStatus |
| 43 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 44 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 45 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 46 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 47 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 48 | `ecnDetails` | 变更详情 | `ecn_details` | String |
| 49 | `ecnId` | 工程变更ID | `ecn_id` | Long |
| 50 | `ecnNo` | 工程变更单号 | `ecn_no` | String |
| 51 | `ecnStatus` | 变更状态 | `ecn_status` | Integer |
| 52 | `ecnTime` | 变更时间 | `ecn_time` | DateTime |
| 53 | `ecnUser` | 变更人 | `ecn_user` | String |
| 54 | `excessAppliedQty` | 已超额申请数量 | `excess_applied_qty` | Decimal |
| 55 | `excessRecipientQty` | 已超领数量 | `excess_recipient_qty` | Decimal |
| 56 | `externalSystemAutoId` | 外部系统材料ID | `external_system_auto_id` | String |
| 57 | `isKeyMaterial` | 替代基准料 | `is_key_material` | Boolean |
| 58 | `isMainMaterial` | 主料 | `is_main_material` | Boolean |
| 59 | `orderMaterialId` | 订单材料Id | `order_material_id` | Long |
| 60 | `receivedKit` | 已领套数 | `received_kit` | Decimal |
| 61 | `receivedQuantity` | 已领数量 | `received_quantity` | Decimal |
| 62 | `stockSensClue` | 现存量特征敏感线索 | `stockSensClue` | String |
| 63 | `transferQuantity` | 已调拨数量 | `transfer_quantity` | Decimal |
| 64 | `availableQty` | 可用量 | `available_qty` | Decimal |
| 65 | `availableSubQty` | 可用件数 | `available_sub_qty` | Decimal |
| 66 | `bomSensitiveUID` | BOM敏感域唯一性ID | `bom_sensitive_uid` | String |
| 67 | `costCenterId` | 成本中心 | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 68 | `currentSubQty` | 现存件数 | `current_sub_qty` | Decimal |
| 69 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 20d79f06-59e8-490b-b2b3-8b492f5539b9 |
| 70 | `routingComponentId` | 工艺路线备料id | `routing_component_id` | Long |
| 71 | `routingOperationId` | 工艺路线工序id | `routing_operation_id` | Long |
| 72 | `supplyVirtualAccbodyId` | 供方利润中心 | `supply_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 73 | `bomAuxiliaryRecipientQty` | 应领件数(BOM单位) | `bom_auxiliary_recipient_qty` | Decimal |
| 74 | `materialDefineDts` | 自定义项特征组 | `define_cts` | 767ee969-3507-4b75-be96-5da9c32ef86e |
| 75 | `bomUnitChangeRate` | BOM单位换算率 | `bom_unit_change_rate` | Decimal |
| 76 | `bomUnitId` | BOM单位 | `bom_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 77 | `bomUnitUseQuantity` | 单位使用数量(BOM单位) | `bom_unit_use_quantity` | Decimal |
| 78 | `mainDenominatorQuantity` | 分母用量(主单位) | `main_denominator_quantity` | Decimal |
| 79 | `mainNumeratorQuantity` | 分子用量(主单位) | `main_numerator_quantity` | Decimal |
| 80 | `processId` | 工序ID | `process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 81 | `processSn` | 工序顺序号 | `process_sn` | Decimal |
| 82 | `sourceautoid` | 来源单据孙表id | `source_autoid` | Long |
| 83 | `id` | ID | `id` | Long |
| 84 | `orderProductId` | 订单成产品id | `order_product_id` | 874c6c6f-0c0e-4582-800e-77098c273c53 |
| 85 | `originalOrderProductId` | 原单产品ID | `original_order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 86 | `originalMaterialId` | 原单材料ID | `original_order_material_id` | 1b1bb4a9-8a2a-44af-9c61-f22d398ec0b7 |
| 87 | `bomId` | BOMId | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 88 | `bomMaterialId` | 子件id | `bom_material_id` | f78e2b2f-0634-41d3-a002-c5a68f3e9992 |
| 89 | `alternateId` | 子件替代料关联id | `alternate_id` | d380f5d1-7c66-44c1-9dbb-79d14b79fd93 |
| 90 | `materialId` | 制造物料id | `material_id` | Long |
| 91 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 92 | `skuId` | SKU编码id | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 93 | `stockUnitId` | 库存单位ID | `stock_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 94 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 95 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 96 | `fixedQuantity` | 固定用量 | `fixed_quantity` | Short |
| 97 | `numeratorQuantity` | 子件用量 | `numerator_quantity` | Decimal |
| 98 | `denominatorQuantity` | 母件底数 | `denominator_quantity` | Decimal |
| 99 | `scrap` | 子件损耗率% | `scrap` | Decimal |
| 100 | `truncUp` | 向上取整 | `trunc_up` | Short |
| 101 | `unitUseQuantity` | 单位使用数量 | `unit_use_quantity` | Decimal |
| 102 | `supplyType` | 供应类型 | `supply_type` | String |
| 103 | `orgId` | 库存组织id | `org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 104 | `warehouseId` | 供应仓库id | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 105 | `recipientQuantity` | 应领数量 | `recipient_quantity` | Decimal |
| 106 | `auxiliaryRecipientQuantity` | 应领件数 | `auxiliary_recipient_quantity` | Decimal |
| 107 | `requirementDate` | 需求日期 | `requirement_date` | DateTime |
| 108 | `subcontractSupplyType` | 委外供应方式 | `subcontract_supply_type` | Integer |
| 109 | `supDirectShip` | 供应商直运 | `sup_direct_ship` | Boolean |
| 110 | `doubleReplenish` | 补货倍量 | `double_replenish` | Decimal |
| 111 | `replenishAdjustQuantity` | 补货调整数量 | `replenish_adjust_quantity` | Decimal |
| 112 | `auxiliaryReplenishAdjustQuantity` | 补货调整件数 | `auxiliary_replenish_adjust_quantity` | Decimal |
| 113 | `alternateType` | 替代方式 | `alternate_type` | Short |
| 114 | `substituteFlag` | 替代标识 | `substitute_flag` | SubstituteFlag |
| 115 | `tranferOutOrgId` | 调出组织id | `transfer_out_org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 116 | `transferOutWarehouseId` | 调出仓库id | `transfer_out_warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 117 | `verificationBy` | 核销依据 | `verification_by` | String |
| 118 | `bomUnitUseQuantityNoloss` | 不含损耗的BOM单位使用数量 | `bom_unit_use_quantity_noloss` | Decimal |
| 119 | `bomUnitUseQuantityInloss` | 含损耗的BOM单位使用数量 | `bom_unit_use_quantity_inloss` | Decimal |
| 120 | `remark` | 备注 | `remark` | String |
| 121 | `pubts` | 时间戳 | `pubts` | DateTime |
| 122 | `free1` | 物料规格1 | `free1` | String |
| 123 | `free2` | 物料规格2 | `free2` | String |
| 124 | `free3` | 物料规格3 | `free3` | String |
| 125 | `free4` | 香雪产地 | `free4` | String |
| 126 | `free5` | 组织 | `free5` | String |
| 127 | `free6` | 物料规格6 | `free6` | String |
| 128 | `free7` | 物料规格7 | `free7` | String |
| 129 | `free8` | 物料规格8 | `free8` | String |
| 130 | `free9` | 物料规格9 | `free9` | String |
| 131 | `free10` | 物料规格10 | `free10` | String |
| 132 | `currentStockQuantity` | 现存量 | `current_stock_quantity` | Decimal |
| 133 | `verificationQuantity` | 已核销数量 | `verification_quantity` | Decimal |
| 134 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 135 | `mustLossQuantity` | 固定损耗 | `must_loss_quantity` | Decimal |
| 136 | `reserveid` | 预留对象Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 137 | `usageType` | 用量类型 | `usage_type` | Short |
| 138 | `materialApplyFlag` | 领料申请标识 | `materialapply_flag` | Boolean |
| 139 | `shortageQuantity` | 缺料量 | `shortage_quantity` | Decimal |
| 140 | `lineNo` | 行号 | `line_no` | Decimal |
| 141 | `auxiliaryAppliedOutStockQuantity` | 已申请出库件数 | `auxiliary_applied_outstock_quantity` | Decimal |
| 142 | `appliedOutStockQuantity` | 已申请出库数量 | `applied_outstock_quantity` | Decimal |
| 143 | `materialOutDate` | 最早领料日期 | `materialout_date` | Date |
| 144 | `isWholeSet` | 齐套 | `is_whole_set` | Boolean |
| 145 | `offOrderPicking` | 表外领料 | `off_order_picking` | Boolean |
| 146 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 147 | `rowno` | 行号 | `rowno` | Integer |
| 148 | `alternateRatio` | 替代比 | `alternate_ratio` | Decimal |
| 149 | `auxiliaryVerificationQuantity` | 已核销件数 | `auxiliary_verification_quantity` | Decimal |
| 150 | `isPhantom` | 是否虚拟件 | `is_phantom` | Boolean |
| 151 | `bomComponentId` | 物料清单行id | `bom_component_id` | String |
| 152 | `orderMaterialAttrextItem` | 材料表自由自定义项 | `` | 811d2ed7-ff48-4cfb-8f90-64d15d501968 |
| 153 | `orderMaterialChangeExpinfo` | 委外订单材料变更表扩展信息 | `` | e68bd81a-e311-42bb-807c-10c49d56bd9b |
| 154 | `orderMaterialUserdefItem` | 委外材料表固定自定义项 | `` | 1f73efb5-a77d-4683-adba-93b7200d68dd |

---

## 关联属性（29个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplyVirtualAccbodyId` | 供方利润中心 | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 2 | `reserveid` | 预留对象Id | `st.reservation.Reservation` | Service |  |
| 3 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 4 | `materialDefineDts` | 自定义项特征组 | `po.subcontractchange.OsmOrderMaterialChangeDefineCharacteristics` | None |  |
| 5 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 6 | `orderMaterialUserdefItem` | 委外材料表固定自定义项 | `po.subcontractchange.OsmOrderMaterialChangeDefine` | None | true |
| 7 | `orgId` | 库存组织id | `org.func.InventoryOrg` | Service |  |
| 8 | `orderMaterialChangeExpinfo` | 委外订单材料变更表扩展信息 | `po.subcontractchange.OsmOrderMaterialChangeExpinfo` | None | true |
| 9 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 10 | `processId` | 工序ID | `po.order.OrderProcess` | None |  |
| 11 | `orderMaterialAttrextItem` | 材料表自由自定义项 | `po.subcontractchange.OsmOrderMaterialChangeAttrextItem` | None | true |
| 12 | `skuId` | SKU编码id | `pc.product.ProductSKU` | Service |  |
| 13 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 14 | `originalMaterialId` | 原单材料ID | `po.order.OrderMaterial` | None |  |
| 15 | `bomId` | BOMId | `ed.bom.Bom` | Service |  |
| 16 | `originalOrderProductId` | 原单产品ID | `po.order.OrderProduct` | None |  |
| 17 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 18 | `transferOutWarehouseId` | 调出仓库id | `aa.warehouse.Warehouse` | Service |  |
| 19 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 20 | `tranferOutOrgId` | 调出组织id | `org.func.InventoryOrg` | Service |  |
| 21 | `orderProductId` | 订单成产品id | `po.subcontractchange.OsmOrderProductChange` | None | true |
| 22 | `bomMaterialId` | 子件id | `ed.bom.BomComponent` | Service |  |
| 23 | `alternateId` | 子件替代料关联id | `ed.bom.BomAlternate` | Service |  |
| 24 | `freeCharacteristics` | 自由项特征组 | `po.subcontractchange.MaterialFreeCharacteristics` | None |  |
| 25 | `warehouseId` | 供应仓库id | `aa.warehouse.Warehouse` | Service |  |
| 26 | `bomUnitId` | BOM单位 | `pc.unit.Unit` | Service |  |
| 27 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 28 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 29 | `stockUnitId` | 库存单位ID | `pc.unit.Unit` | Service |  |
