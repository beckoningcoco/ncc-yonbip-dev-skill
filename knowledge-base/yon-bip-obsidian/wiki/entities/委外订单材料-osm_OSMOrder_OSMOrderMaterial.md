---
tags: ["BIP", "元数据", "数据字典", "OSM", "osm.OSMOrder.OSMOrderMaterial"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外订单材料 (`osm.OSMOrder.OSMOrderMaterial`)

> OSM | 物理表：`po_order_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外订单材料 |
| 物理表 | `po_order_material` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:56:34.6870` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（150个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `addByAutoBackFlush` | 是否入库倒冲自动添加 | `add_by_auto_back_flush` | Boolean |
| 2 | `alternateGroupNo` | 替代组号 | `alternate_group_no` | String |
| 3 | `alternateId` | 替代料Id | `alternate_id` | d380f5d1-7c66-44c1-9dbb-79d14b79fd93 |
| 4 | `alternateRatio` | 替代比 | `alternate_ratio` | Decimal |
| 5 | `alternateSequence` | 替代顺序 | `alternate_sequence` | Long |
| 6 | `alternateType` | 替代方式(作废) | `alternate_type` | Short |
| 7 | `alternateUsageRate` | 使用比例 | `alternate_usage_rate` | Decimal |
| 8 | `appliedKit` | 已申领套数 | `applied_kit` | Decimal |
| 9 | `appliedOutStockQuantity` | 已申请出库数量 | `applied_outstock_quantity` | Decimal |
| 10 | `appliedQuantity` | 已申请数量 | `applied_quantity` | Decimal |
| 11 | `auxiliaryAppliedOutStockQuantity` | 已申请出库件数 | `auxiliary_applied_outstock_quantity` | Decimal |
| 12 | `auxiliaryAppliedQuantity` | 已申请件数 | `auxiliary_applied_quantity` | Decimal |
| 13 | `auxiliaryExcessAppliedQty` | 已超额申请件数 | `auxiliary_excess_applied_qty` | Decimal |
| 14 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 15 | `standardQty` | 标准用量 | `standard_qty` | Decimal |
| 16 | `materialVerifStatus` | 材料核销状态 | `material_verif_status` | MaterialVerifiStatus |
| 17 | `bomRequireQty` | BOM需求数量 | `bom_require_qty` | Decimal |
| 18 | `excessAppliedRestQty` | 超额领料申请未出库数量 | `excess_applied_rest_qty` | Decimal |
| 19 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 20 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 21 | `auxiliaryAppliedRestQuantity` | 领料申请未出库件数 | `aux_applied_rest_qty` | Decimal |
| 22 | `appliedRestQuantity` | 领料申请未出库数量 | `applied_rest_qty` | Decimal |
| 23 | `auxiliaryExcessAppliedRestQty` | 超额领料申请未出库件数 | `aux_excess_applied_rest_qty` | Decimal |
| 24 | `auxiliaryAppliedRetQuantity` | 退料申请件数 | `aux_applied_ret_qty` | Decimal |
| 25 | `appliedRetQuantity` | 退料申请数量 | `applied_ret_qty` | Decimal |
| 26 | `appliedRetRestQuantity` | 退料申请未退库数量 | `applied_ret_rest_qty` | Decimal |
| 27 | `excessAppliedRetQty` | 超额退料申请数量 | `excess_applied_ret_qty` | Decimal |
| 28 | `osmRecipientQty` | 委外应领数量 | `osm_recipient_qty` | Decimal |
| 29 | `auxiliaryExcessAppliedRetRestQty` | 超额退料申请未退库件数 | `aux_excess_applied_ret_rest_qty` | Decimal |
| 30 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 31 | `auxiliaryExcessAppliedRetQty` | 超额退料申请件数 | `aux_excess_applied_ret_qty` | Decimal |
| 32 | `materialStatus` | 领料状态 | `material_status` | Short |
| 33 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 34 | `entrustSupplyType` | 受托加工供应方式 | `entrust_supply_type` | Short |
| 35 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 36 | `auxiliaryAppliedRetRestQuantity` | 退料申请未退库件数 | `aux_applied_ret_rest_qty` | Decimal |
| 37 | `osmReceivedQty` | 委外已领数量 | `osm_received_qty` | Decimal |
| 38 | `excessAppliedRetRestQty` | 超额退料申请未退库数量 | `excess_applied_ret_rest_qty` | Decimal |
| 39 | `auxiliaryExcessRecipientQty` | 已超领件数 | `auxiliary_excess_recipient_qty` | Decimal |
| 40 | `auxiliaryReceivedQuantity` | 已领件量 | `auxiliary_received_quantity` | Decimal |
| 41 | `auxiliaryRecipientQuantity` | 应领件数 | `auxiliary_recipient_quantity` | Decimal |
| 42 | `auxiliaryReplenishAdjustQuantity` | 补货调整件数 | `auxiliary_replenish_adjust_quantity` | Decimal |
| 43 | `auxiliaryTransferQuantity` | 已调拨件数 | `auxiliary_transfer_quantity` | Decimal |
| 44 | `auxiliaryVerificationQuantity` | 已核销件数 | `auxiliary_verification_quantity` | Decimal |
| 45 | `availableQty` | 可用量 | `available_qty` | Decimal |
| 46 | `availableSubQty` | 可用件数 | `available_sub_qty` | Decimal |
| 47 | `bomAuxiliaryRecipientQty` | 应领件数(BOM单位) | `bom_auxiliary_recipient_qty` | Decimal |
| 48 | `bomComponentId` | 物料清单行id | `bom_component_id` | String |
| 49 | `bomId` | 物料清单 | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 50 | `bomMaterialId` | 子件Id | `bom_material_id` | f78e2b2f-0634-41d3-a002-c5a68f3e9992 |
| 51 | `bomSensitiveUID` | BOM敏感域唯一性ID | `bom_sensitive_uid` | String |
| 52 | `bomUnitChangeRate` | BOM单位换算率 | `bom_unit_change_rate` | Decimal |
| 53 | `bomUnitId` | BOM单位 | `bom_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 54 | `bomUnitUseQuantity` | 单位使用数量(BOM单位) | `bom_unit_use_quantity` | Decimal |
| 55 | `bomUnitUseQuantityInloss` | BOM单位使用数量(含损耗) | `bom_unit_use_quantity_inloss` | Decimal |
| 56 | `bomUnitUseQuantityNoloss` | BOM单位使用数量(不含损耗) | `bom_unit_use_quantity_noloss` | Decimal |
| 57 | `calcCostFlag` | 计算成本 | `calc_cost_flag` | Short |
| 58 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 59 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 60 | `costCenterId` | 成本中心 | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 61 | `currentStockQuantity` | 现存量 | `current_stock_quantity` | Decimal |
| 62 | `currentSubQty` | 现存件数 | `current_sub_qty` | Decimal |
| 63 | `denominatorQuantity` | 分母用量(BOM单位) | `denominator_quantity` | Decimal |
| 64 | `doubleReplenish` | 补货倍量 | `double_replenish` | Decimal |
| 65 | `ecnDetailId` | 工程变更行ID | `ecn_detail_id` | Long |
| 66 | `ecnDetailNo` | 工程变更行号 | `ecn_detail_no` | String |
| 67 | `ecnDetails` | 变更详情 | `ecn_details` | String |
| 68 | `ecnId` | 工程变更ID | `ecn_id` | Long |
| 69 | `ecnNo` | 工程变更单号 | `ecn_no` | String |
| 70 | `ecnStatus` | 变更状态 | `ecn_status` | Integer |
| 71 | `ecnTime` | 变更时间 | `ecn_time` | DateTime |
| 72 | `ecnUser` | 变更人 | `ecn_user` | String |
| 73 | `excessAppliedQty` | 已超额申请数量 | `excess_applied_qty` | Decimal |
| 74 | `excessRecipientQty` | 已超领数量 | `excess_recipient_qty` | Decimal |
| 75 | `externalSystemAutoId` | 外部系统材料ID | `external_system_auto_id` | String |
| 76 | `fixedQuantity` | 固定用量 | `fixed_quantity` | Short |
| 77 | `free1` | 规格1 | `free1` | String |
| 78 | `free10` | 规格10 | `free10` | String |
| 79 | `free2` | 规格2 | `free2` | String |
| 80 | `free3` | 规格3 | `free3` | String |
| 81 | `free4` | 规格4 | `free4` | String |
| 82 | `free5` | 规格5 | `free5` | String |
| 83 | `free6` | 规格6 | `free6` | String |
| 84 | `free7` | 规格7 | `free7` | String |
| 85 | `free8` | 规格8 | `free8` | String |
| 86 | `free9` | 规格9 | `free9` | String |
| 87 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 634b3df5-cf95-41de-a57d-61c1db0cac2c |
| 88 | `id` | ID | `id` | Long |
| 89 | `isKeyMaterial` | 替代基准料 | `is_key_material` | Boolean |
| 90 | `isMainMaterial` | 主料 | `is_main_material` | Boolean |
| 91 | `isPhantom` | 是否虚拟件子件 | `is_phantom` | Boolean |
| 92 | `isWholeSet` | 齐套 | `is_whole_set` | Boolean |
| 93 | `lineNo` | 行号 | `line_no` | Decimal |
| 94 | `mainDenominatorQuantity` | 分母用量(主单位) | `main_denominator_quantity` | Decimal |
| 95 | `mainNumeratorQuantity` | 分子用量(主单位) | `main_numerator_quantity` | Decimal |
| 96 | `materialApplyFlag` | 领料申请标识 | `materialapply_flag` | Boolean |
| 97 | `materialDefineDts` | 自定义项特征组 | `define_cts` | 5c1d684b-099d-4986-8b6f-6ce0248de8b9 |
| 98 | `materialId` | 制造物料 | `material_id` | Long |
| 99 | `materialOutDate` | 最早领料日期 | `materialout_date` | Date |
| 100 | `mustLossQuantity` | 固定损耗 | `must_loss_quantity` | Decimal |
| 101 | `numeratorQuantity` | 分子用量(BOM单位) | `numerator_quantity` | Decimal |
| 102 | `offOrderPicking` | 表外领料 | `off_order_picking` | Boolean |
| 103 | `orderMaterialId` | 订单材料Id | `order_material_id` | Long |
| 104 | `orderProductId` | 成品id | `order_product_id` | 7d39c327-90bf-4f63-b030-c953035dd99e |
| 105 | `orgId` | 库存组织 | `org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 106 | `processId` | 工序ID | `process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 107 | `processSn` | 工序顺序号 | `process_sn` | Decimal |
| 108 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 109 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 110 | `pubts` | 时间戳 | `pubts` | DateTime |
| 111 | `receivedKit` | 已领套数 | `received_kit` | Decimal |
| 112 | `receivedQuantity` | 已领数量 | `received_quantity` | Decimal |
| 113 | `recipientQuantity` | 应领数量 | `recipient_quantity` | Decimal |
| 114 | `remark` | 备注 | `remark` | String |
| 115 | `replenishAdjustQuantity` | 补货调整数量 | `replenish_adjust_quantity` | Decimal |
| 116 | `requirementDate` | 需求日期 | `requirement_date` | DateTime |
| 117 | `reserveid` | 跟踪线索Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 118 | `routingComponentId` | 工艺路线备料id | `routing_component_id` | Long |
| 119 | `routingOperationId` | 工艺路线工序id | `routing_operation_id` | Long |
| 120 | `rowno` | 序号 | `rowno` | Integer |
| 121 | `scrap` | 子件耗损率% | `scrap` | Decimal |
| 122 | `shortageQuantity` | 缺料量 | `shortage_quantity` | Decimal |
| 123 | `skuId` | skuId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 124 | `sourceautoid` | 来源单据孙表id | `source_autoid` | Long |
| 125 | `stockSensClue` | 现存量特征敏感线索 | `stockSensClue` | String |
| 126 | `stockUnitId` | 库存单位 | `stock_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 127 | `subcontractSupplyType` | 委外供应方式 | `subcontract_supply_type` | Integer |
| 128 | `substituteFlag` | 替代标识 | `substitute_flag` | SubstituteFlag |
| 129 | `supDirectShip` | 供应商直运 | `sup_direct_ship` | Boolean |
| 130 | `supplyType` | 发料方式 | `supply_type` | String |
| 131 | `supplyVirtualAccbodyId` | 供方利润中心 | `supply_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 132 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 133 | `tranferOutOrgId` | 调出组织 | `transfer_out_org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 134 | `transferOutWarehouseId` | 调出仓库 | `transfer_out_warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 135 | `transferQuantity` | 已调拨数量 | `transfer_quantity` | Decimal |
| 136 | `truncUp` | 向上取整 | `trunc_up` | Short |
| 137 | `unitUseQuantity` | 单位使用数量(主单位) | `unit_use_quantity` | Decimal |
| 138 | `usageType` | 用量类型(作废) | `usage_type` | Short |
| 139 | `verificationBy` | 核销依据 | `verification_by` | String |
| 140 | `verificationQuantity` | 已核销数量 | `verification_quantity` | Decimal |
| 141 | `warehouseId` | 供应仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 142 | `cfmAuxReceivedQty` | 确认已领件数 | `cfm_aux_received_qty` | Decimal |
| 143 | `cfmExcessAuxQty` | 确认已超领件数 | `cfm_excess_aux_qty` | Decimal |
| 144 | `cfmExcessRecipientQty` | 确认已超领数量 | `cfm_excess_recipient_qty` | Decimal |
| 145 | `cfmReceivedKit` | 确认已领套数 | `cfm_received_kit` | Decimal |
| 146 | `cfmReceivedQty` | 确认已领数量 | `cfm_received_qty` | Decimal |
| 147 | `collaborationMaterialId` | 协同源头材料行id | `collaboration_material_id` | Long |
| 148 | `collaborationMaterialLineNo` | 协同源头材料行号 | `collaboration_material_line_no` | Decimal |
| 149 | `collaborationType` | 材料协同方式 | `collaboration_type` | Short |
| 150 | `orderMaterialExpinfo` | 委外订单材料扩展信息 | `` | b09df1cb-73e1-4f02-9c8e-c559bc663066 |

---

## 关联属性（25个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplyVirtualAccbodyId` | 供方利润中心 | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 2 | `reserveid` | 跟踪线索Id | `st.reservation.Reservation` | Service |  |
| 3 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 4 | `materialDefineDts` | 自定义项特征组 | `po.order.MaterialDefineCharacteristics` | None |  |
| 5 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 6 | `orgId` | 库存组织 | `org.func.InventoryOrg` | Service |  |
| 7 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 8 | `processId` | 工序ID | `po.order.OrderProcess` | None |  |
| 9 | `skuId` | skuId | `pc.product.ProductSKU` | Service |  |
| 10 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 11 | `bomId` | 物料清单 | `ed.bom.Bom` | Service |  |
| 12 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 13 | `transferOutWarehouseId` | 调出仓库 | `aa.warehouse.Warehouse` | Service |  |
| 14 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 15 | `orderMaterialExpinfo` | 委外订单材料扩展信息 | `osm.OSMOrder.OSMOrderMaterialExpinfo` | None | true |
| 16 | `tranferOutOrgId` | 调出组织 | `org.func.InventoryOrg` | Service |  |
| 17 | `orderProductId` | 成品id | `osm.OSMOrder.OSMOrderProduct` | None | true |
| 18 | `bomMaterialId` | 子件Id | `ed.bom.BomComponent` | Service |  |
| 19 | `alternateId` | 替代料Id | `ed.bom.BomAlternate` | Service |  |
| 20 | `freeCharacteristics` | 自由项特征组 | `po.order.MaterialFreeCharacteristics` | None |  |
| 21 | `warehouseId` | 供应仓库 | `aa.warehouse.Warehouse` | Service |  |
| 22 | `bomUnitId` | BOM单位 | `pc.unit.Unit` | Service |  |
| 23 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 24 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 25 | `stockUnitId` | 库存单位 | `pc.unit.Unit` | Service |  |
