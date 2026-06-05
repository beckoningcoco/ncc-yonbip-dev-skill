---
tags: ["BIP", "元数据", "数据字典", "PO", "po.order.OrderMaterial"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 生产订单材料 (`po.order.OrderMaterial`)

> PO | 物理表：`po_order_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 生产订单材料 |
| 物理表 | `po_order_material` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:23:04.6590` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 行号 |

---

## 直接属性（152个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `alternateGroupNo` | 替代组号 | `alternate_group_no` | String |
| 2 | `appliedKit` | 已申领套数 | `applied_kit` | Decimal |
| 3 | `auxiliaryExcessAppliedQty` | 已超额申请件数 | `auxiliary_excess_applied_qty` | Decimal |
| 4 | `auxiliaryExcessRecipientQty` | 已超领件数 | `auxiliary_excess_recipient_qty` | Decimal |
| 5 | `excessAppliedQty` | 已超额申请数量 | `excess_applied_qty` | Decimal |
| 6 | `excessRecipientQty` | 已超领数量 | `excess_recipient_qty` | Decimal |
| 7 | `externalSystemAutoId` | 外部系统材料ID | `external_system_auto_id` | String |
| 8 | `isKeyMaterial` | 替代基准料 | `is_key_material` | Boolean |
| 9 | `isMainMaterial` | 主料 | `is_main_material` | Boolean |
| 10 | `receivedKit` | 已领套数 | `received_kit` | Decimal |
| 11 | `addByAutoBackFlush` | 是否入库倒冲自动添加 | `add_by_auto_back_flush` | Boolean |
| 12 | `alternateSequence` | 替代顺序 | `alternate_sequence` | Long |
| 13 | `alternateUsageRate` | 使用比例 | `alternate_usage_rate` | Decimal |
| 14 | `auxiliaryAppliedRetQuantity` | 退料申请件数 | `aux_applied_ret_qty` | Decimal |
| 15 | `materialVerifStatus` | 材料核销状态 | `material_verif_status` | MaterialVerifiStatus |
| 16 | `collaborationType` | 材料协同方式 | `collaboration_type` | Short |
| 17 | `collaborationMaterialLineNo` | 协同源头材料行号 | `collaboration_material_line_no` | Decimal |
| 18 | `collaborationMaterialId` | 协同源头材料行id | `collaboration_material_id` | Long |
| 19 | `cfmReceivedQty` | 确认已领数量 | `cfm_received_qty` | Decimal |
| 20 | `cfmAuxReceivedQty` | 确认已领件数 | `cfm_aux_received_qty` | Decimal |
| 21 | `cfmExcessRecipientQty` | 确认已超领数量 | `cfm_excess_recipient_qty` | Decimal |
| 22 | `cfmExcessAuxQty` | 确认已超领件数 | `cfm_excess_aux_qty` | Decimal |
| 23 | `cfmReceivedKit` | 确认已领套数 | `cfm_received_kit` | Decimal |
| 24 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 25 | `excessAppliedRestQty` | 超额领料申请未出库数量 | `excess_applied_rest_qty` | Decimal |
| 26 | `standardQty` | 标准用量 | `standard_qty` | Decimal |
| 27 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 28 | `bomRequireQty` | BOM需求数量 | `bom_require_qty` | Decimal |
| 29 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 30 | `auxiliaryAppliedRestQuantity` | 领料申请未出库件数 | `aux_applied_rest_qty` | Decimal |
| 31 | `appliedRestQuantity` | 领料申请未出库数量 | `applied_rest_qty` | Decimal |
| 32 | `auxiliaryExcessAppliedRestQty` | 超额领料申请未出库件数 | `aux_excess_applied_rest_qty` | Decimal |
| 33 | `appliedRetQuantity` | 退料申请数量 | `applied_ret_qty` | Decimal |
| 34 | `appliedRetRestQuantity` | 退料申请未退库数量 | `applied_ret_rest_qty` | Decimal |
| 35 | `excessAppliedRetQty` | 超额退料申请数量 | `excess_applied_ret_qty` | Decimal |
| 36 | `osmRecipientQty` | 委外应领数量 | `osm_recipient_qty` | Decimal |
| 37 | `auxiliaryExcessAppliedRetRestQty` | 超额退料申请未退库件数 | `aux_excess_applied_ret_rest_qty` | Decimal |
| 38 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 39 | `auxiliaryExcessAppliedRetQty` | 超额退料申请件数 | `aux_excess_applied_ret_qty` | Decimal |
| 40 | `materialStatus` | 领料状态 | `material_status` | Short |
| 41 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 42 | `entrustSupplyType` | 受托加工供应方式 | `entrust_supply_type` | Short |
| 43 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 44 | `auxiliaryAppliedRetRestQuantity` | 退料申请未退库件数 | `aux_applied_ret_rest_qty` | Decimal |
| 45 | `osmReceivedQty` | 委外已领数量 | `osm_received_qty` | Decimal |
| 46 | `excessAppliedRetRestQty` | 超额退料申请未退库数量 | `excess_applied_ret_rest_qty` | Decimal |
| 47 | `ecnDetailId` | 工程变更行ID | `ecn_detail_id` | Long |
| 48 | `ecnDetails` | 变更详情 | `ecn_details` | String |
| 49 | `ecnId` | 工程变更ID | `ecn_id` | Long |
| 50 | `orderMaterialId` | 订单材料Id | `order_material_id` | Long |
| 51 | `stockSensClue` | 现存量特征敏感线索 | `stockSensClue` | String |
| 52 | `auxiliaryReplenishAdjustQuantity` | 补货调整件数 | `auxiliary_replenish_adjust_quantity` | Decimal |
| 53 | `availableQty` | 可用量 | `available_qty` | Decimal |
| 54 | `bomSensitiveUID` | BOM敏感域唯一性ID | `bom_sensitive_uid` | String |
| 55 | `costCenterId` | 成本中心 | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 56 | `doubleReplenish` | 补货倍量 | `double_replenish` | Decimal |
| 57 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 634b3df5-cf95-41de-a57d-61c1db0cac2c |
| 58 | `replenishAdjustQuantity` | 补货调整数量 | `replenish_adjust_quantity` | Decimal |
| 59 | `supplyVirtualAccbodyId` | 供方利润中心 | `supply_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 60 | `id` | ID | `id` | Long |
| 61 | `orderProductId` | 订单成产品id | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 62 | `routingOperationId` | 工艺路线联工序d | `routing_operation_id` | Long |
| 63 | `bomId` | BOMId | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 64 | `materialDefineDts` | 自定义项特征组 | `define_cts` | 5c1d684b-099d-4986-8b6f-6ce0248de8b9 |
| 65 | `routingComponentId` | 工艺路线子件id | `routing_component_id` | Long |
| 66 | `bomMaterialId` | 子件id | `bom_material_id` | f78e2b2f-0634-41d3-a002-c5a68f3e9992 |
| 67 | `alternateId` | 子件替代料关联id | `alternate_id` | d380f5d1-7c66-44c1-9dbb-79d14b79fd93 |
| 68 | `materialId` | 制造物料id | `material_id` | Long |
| 69 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 70 | `skuId` | skuId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 71 | `stockUnitId` | 库存单位ID | `stock_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 72 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 73 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 74 | `fixedQuantity` | 固定用量 | `fixed_quantity` | Short |
| 75 | `numeratorQuantity` | 分子用量 | `numerator_quantity` | Decimal |
| 76 | `denominatorQuantity` | 分母用量 | `denominator_quantity` | Decimal |
| 77 | `scrap` | 子件损耗率% | `scrap` | Decimal |
| 78 | `unitUseQuantity` | 单位使用数量 | `unit_use_quantity` | Decimal |
| 79 | `recipientQuantity` | 应领数量 | `recipient_quantity` | Decimal |
| 80 | `auxiliaryRecipientQuantity` | 应领件数 | `auxiliary_recipient_quantity` | Decimal |
| 81 | `supplyType` | 发料方式 | `supply_type` | String |
| 82 | `orgId` | 库存组织id | `org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 83 | `warehouseId` | 供应仓库id | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 84 | `bomUnitUseQuantity` | 单位使用数量 | `bom_unit_use_quantity` | Decimal |
| 85 | `requirementDate` | 需求日期 | `requirement_date` | DateTime |
| 86 | `receivedQuantity` | 已领数量 | `received_quantity` | Decimal |
| 87 | `auxiliaryReceivedQuantity` | 已领件数 | `auxiliary_received_quantity` | Decimal |
| 88 | `bomAuxiliaryRecipientQty` | 应领件数(BOM单位) | `bom_auxiliary_recipient_qty` | Decimal |
| 89 | `substituteFlag` | 替代标识 | `substitute_flag` | SubstituteFlag |
| 90 | `processSn` | 工序顺序号 | `process_sn` | Decimal |
| 91 | `remark` | 备注 | `remark` | String |
| 92 | `bomUnitId` | BOM单位ID | `bom_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 93 | `pubts` | 时间戳 | `pubts` | DateTime |
| 94 | `processId` | 工序ID | `process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 95 | `bomUnitChangeRate` | BOM单位换算率 | `bom_unit_change_rate` | Decimal |
| 96 | `mainNumeratorQuantity` | 分子用量(主单位) | `main_numerator_quantity` | Decimal |
| 97 | `mainDenominatorQuantity` | 分母用量(主单位) | `main_denominator_quantity` | Decimal |
| 98 | `free1` | 颜色测试 | `free1` | String |
| 99 | `free2` | 测试31 | `free2` | String |
| 100 | `free3` | 定量测试 | `free3` | String |
| 101 | `free4` | 香雪产地 | `free4` | String |
| 102 | `free5` | 组织 | `free5` | String |
| 103 | `free6` | 物料规格6 | `free6` | String |
| 104 | `free7` | 物料规格7 | `free7` | String |
| 105 | `calcCostFlag` | 计算成本 | `calc_cost_flag` | Short |
| 106 | `free8` | 物料规格8 | `free8` | String |
| 107 | `free9` | 物料规格9 | `free9` | String |
| 108 | `free10` | 物料规格10 | `free10` | String |
| 109 | `sourceautoid` | 来源单据孙表id | `source_autoid` | Long |
| 110 | `appliedQuantity` | 已申领数量 | `applied_quantity` | Decimal |
| 111 | `auxiliaryAppliedQuantity` | 已申领件数 | `auxiliary_applied_quantity` | Decimal |
| 112 | `isWholeSet` | 齐套标识 | `is_whole_set` | Boolean |
| 113 | `offOrderPicking` | 表外领料 | `off_order_picking` | Boolean |
| 114 | `truncUp` | 向上取整 | `trunc_up` | Short |
| 115 | `mustLossQuantity` | 固定损耗 | `must_loss_quantity` | Decimal |
| 116 | `lineNo` | 行号 | `line_no` | Decimal |
| 117 | `tranferOutOrgId` | 材料_调出组织id | `transfer_out_org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 118 | `transferOutWarehouseId` | 调出仓库id | `transfer_out_warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 119 | `transferQuantity` | 已调拨数量 | `transfer_quantity` | Decimal |
| 120 | `auxiliaryTransferQuantity` | 已调拨件数 | `auxiliary_transfer_quantity` | Decimal |
| 121 | `currentStockQuantity` | 现存量 | `current_stock_quantity` | Decimal |
| 122 | `verificationQuantity` | 已核销数量 | `verification_quantity` | Decimal |
| 123 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 124 | `reserveid` | 预留对象Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 125 | `usageType` | 用量类型 | `usage_type` | Short |
| 126 | `materialApplyFlag` | 领料申请标识 | `materialapply_flag` | Boolean |
| 127 | `shortageQuantity` | 缺料量 | `shortage_quantity` | Decimal |
| 128 | `auxiliaryAppliedOutStockQuantity` | 已申请出库件数 | `auxiliary_applied_outstock_quantity` | Decimal |
| 129 | `verificationBy` | 核销依据 | `verification_by` | String |
| 130 | `appliedOutStockQuantity` | 已申请出库数量 | `applied_outstock_quantity` | Decimal |
| 131 | `materialOutDate` | 最早领料日期 | `materialout_date` | Date |
| 132 | `bomUnitUseQuantityInloss` | BOM单位使用数量(含损耗) | `bom_unit_use_quantity_inloss` | Decimal |
| 133 | `ecnNo` | 变更单号 | `ecn_no` | String |
| 134 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 135 | `bomUnitUseQuantityNoloss` | BOM单位使用数量(不含损耗) | `bom_unit_use_quantity_noloss` | Decimal |
| 136 | `ecnDetailNo` | 变更单行号 | `ecn_detail_no` | String |
| 137 | `ecnStatus` | 变更状态 | `ecn_status` | Integer |
| 138 | `rowno` | 行号 | `rowno` | Integer |
| 139 | `alternateRatio` | 替代比 | `alternate_ratio` | Decimal |
| 140 | `ecnUser` | 变更人 | `ecn_user` | String |
| 141 | `subcontractSupplyType` | 委外供应方式 | `subcontract_supply_type` | Integer |
| 142 | `auxiliaryVerificationQuantity` | 已核销件数 | `auxiliary_verification_quantity` | Decimal |
| 143 | `ecnTime` | 变更时间 | `ecn_time` | DateTime |
| 144 | `alternateType` | 替代方式 | `alternate_type` | Short |
| 145 | `isPhantom` | 是否虚拟件 | `is_phantom` | Boolean |
| 146 | `bomComponentId` | 物料清单行id | `bom_component_id` | String |
| 147 | `supDirectShip` | 供应商直运 | `sup_direct_ship` | Boolean |
| 148 | `currentSubQty` | 现存件数 | `current_sub_qty` | Decimal |
| 149 | `availableSubQty` | 可用件数 | `available_sub_qty` | Decimal |
| 150 | `orderMaterialAttrextItem` | 材料表自由自定义项 | `` | 1273a2a8-4c8f-42ab-8fe3-a3153a80665b |
| 151 | `orderMaterialExpinfo` | 生产订单材料扩展信息 | `` | 3a4ce930-2d02-42ab-b27a-e8cc92552d02 |
| 152 | `orderMaterialUserdefItem` | 材料表固定自定义项 | `` | bcbf1b11-2213-4c15-bee8-1ded54505b63 |

---

## 关联属性（27个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplyVirtualAccbodyId` | 供方利润中心 | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 2 | `reserveid` | 预留对象Id | `st.reservation.Reservation` | Service |  |
| 3 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 4 | `materialDefineDts` | 自定义项特征组 | `po.order.MaterialDefineCharacteristics` | None |  |
| 5 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 6 | `orderMaterialUserdefItem` | 材料表固定自定义项 | `po.order.OrderMaterialUserdefItem` | None | true |
| 7 | `orgId` | 库存组织id | `org.func.InventoryOrg` | Service |  |
| 8 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 9 | `processId` | 工序ID | `po.order.OrderProcess` | None |  |
| 10 | `orderMaterialAttrextItem` | 材料表自由自定义项 | `po.order.OrderMaterialAttrextItem` | None | true |
| 11 | `skuId` | skuId | `pc.product.ProductSKU` | Service |  |
| 12 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 13 | `bomId` | BOMId | `ed.bom.Bom` | Service |  |
| 14 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 15 | `transferOutWarehouseId` | 调出仓库id | `aa.warehouse.Warehouse` | Service |  |
| 16 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 17 | `orderMaterialExpinfo` | 生产订单材料扩展信息 | `po.order.OrderMaterialExpinfo` | None | true |
| 18 | `tranferOutOrgId` | 材料_调出组织id | `org.func.InventoryOrg` | Service |  |
| 19 | `orderProductId` | 订单成产品id | `po.order.OrderProduct` | None | true |
| 20 | `bomMaterialId` | 子件id | `ed.bom.BomComponent` | Service |  |
| 21 | `alternateId` | 子件替代料关联id | `ed.bom.BomAlternate` | Service |  |
| 22 | `freeCharacteristics` | 自由项特征组 | `po.order.MaterialFreeCharacteristics` | None |  |
| 23 | `warehouseId` | 供应仓库id | `aa.warehouse.Warehouse` | Service |  |
| 24 | `bomUnitId` | BOM单位ID | `pc.unit.Unit` | Service |  |
| 25 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 26 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 27 | `stockUnitId` | 库存单位ID | `pc.unit.Unit` | Service |  |
