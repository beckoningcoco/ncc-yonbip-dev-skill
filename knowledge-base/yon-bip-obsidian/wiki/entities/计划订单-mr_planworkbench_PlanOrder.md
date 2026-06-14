---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planworkbench.PlanOrder"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划订单 (`mr.planworkbench.PlanOrder`)

> MR | 物理表：`mr_plan_order`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划订单 |
| 物理表 | `mr_plan_order` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:13:04.0930` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（157个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `PlanOrderStatus` | 计划订单状态表 | `` | 52492aff-e750-430c-8c6a-d4fb3ce1f0ad |
| 2 | `actionDate` | 行动日期 | `action_date` | Date |
| 3 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 4 | `assistChangeRate` | 辅计量换算率 | `assist_change_rate` | Decimal |
| 5 | `assistChangeRateDen` | 换算率分母 | `assist_change_rateden` | Decimal |
| 6 | `assistChangeRateNum` | 换算率分子 | `assist_change_ratenum` | Decimal |
| 7 | `assistUnit` | 辅计量单位 | `assist_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 8 | `assistUnitCount` | 辅计量数量 | `assist_quantity` | Decimal |
| 9 | `associationGUID` | 计划订单关联GUID | `association_guid` | String |
| 10 | `auditDate` | 审批日期 | `audit_date` | Date |
| 11 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 12 | `auditor` | 审批人名称 | `auditor` | String |
| 13 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `billTypeCode` | 单据类型编码 | `bill_type_code` | String |
| 15 | `billTypeId` | 单据类型 | `bill_type_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 |
| 16 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 17 | `bomId` | BOM表体ID | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 18 | `bomLineNo` | Bom子件行号 | `bom_line_no` | Decimal |
| 19 | `closePeople` | 关闭人id | `close_people` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `closePeopleName` | 关闭人 | `close_people_name` | String |
| 21 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 22 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 23 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 24 | `cmpAssessResult` | 能力评估结果 | `cmp_assess_result` | String |
| 25 | `cmpCalculateStrategy` | 能力计算策略 | `cmp_calculate_strategy` | String |
| 26 | `code` | 编码 | `code` | String |
| 27 | `collaborationPocode` | 协同源头单据号 | `collaboration_pocode` | String |
| 28 | `collaborationPodetailid` | 协同源头单据行 | `collaboration_podetailid` | Long |
| 29 | `collaborationPoid` | 协同源头单据主表id | `collaboration_poid` | Long |
| 30 | `collaborationPolineno` | 协同源头单据行号 | `collaboration_polineno` | Decimal |
| 31 | `collaborationSource` | 协同源头单据类型 | `collaboration_source` | String |
| 32 | `createDate` | 创建日期 | `create_date` | Date |
| 33 | `createTime` | 创建时间 | `create_time` | DateTime |
| 34 | `createType` | 创建计划类型 | `create_type` | CreateTypeEnum |
| 35 | `creator` | 创建人名称 | `creator` | String |
| 36 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 37 | `customerId` | 客户 | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 38 | `datasub` | 应用来源 | `datasub` | String |
| 39 | `demandOrgId` | 需求组织 | `demand_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 40 | `departmentId` | 生产部门 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 41 | `docDate` | 单据日期 | `doc_date` | DateTime |
| 42 | `dr` | 逻辑删除标记 | `dr` | Short |
| 43 | `entrustedType` | 受托加工类型 | `entrusted_type` | entrustedTypeEnum |
| 44 | `finishDate` | 完工日期 | `finish_date` | Date |
| 45 | `firstSourceDocDate` | 源头单据日期 | `first_source_doc_date` | DateTime |
| 46 | `firstSourceDocId` | 源头单据表id | `first_source_doc_id` | Long |
| 47 | `firstSourceDocLineNo` | 源头单据行号 | `first_source_doc_line_no` | Decimal |
| 48 | `firstSourceDocOrgId` | 源头单据组织 | `first_source_doc_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 49 | `firstsource` | 需求来源类型编码 | `first_source` | String |
| 50 | `firstsourceautoid` | 源头单据子表id | `first_source_autoid` | Long |
| 51 | `firstupcode` | 需求来源单号 | `first_upcode` | String |
| 52 | `free1` | 规格1 | `free1` | String |
| 53 | `free10` | 规格10 | `free10` | String |
| 54 | `free2` | 规格2 | `free2` | String |
| 55 | `free3` | 规格3 | `free3` | String |
| 56 | `free4` | 规格4 | `free4` | String |
| 57 | `free5` | 规格5 | `free5` | String |
| 58 | `free6` | 规格6 | `free6` | String |
| 59 | `free7` | 规格7 | `free7` | String |
| 60 | `free8` | 规格8 | `free8` | String |
| 61 | `free9` | 规格9 | `free9` | String |
| 62 | `freeCharacteristics` | 自由特征组实体 | `free_characteristics` | aa0eb63b-7c50-4ce4-8bae-0cf4eaa1131d |
| 63 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 64 | `id` | ID | `id` | Long |
| 65 | `inputQty` | 计划投入数量 | `input_qty` | Decimal |
| 66 | `invOrgId` | 入库组织 | `inv_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 67 | `isClosed` | 关闭标识 | `is_closed` | Boolean |
| 68 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 69 | `isSafetyStockReq` | 安全库存需求 | `is_safety_stock_req` | Boolean |
| 70 | `isSpecialReq` | 特殊需求 | `is_special_req` | specialReqTypeEnum |
| 71 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 72 | `issuedQuantity` | 已下达数量 | `issued_quantity` | Decimal |
| 73 | `issuedUnAudit` | 已下达订单是否允许弃审 | `issued_unaudit` | Boolean |
| 74 | `llc` | 低阶码 | `llc` | Integer |
| 75 | `lockDate` | 锁定日期 | `lock_Date` | Date |
| 76 | `lockTime` | 锁定时间 | `lock_time` | DateTime |
| 77 | `locker` | 锁定人 | `locker` | String |
| 78 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 79 | `materialId` | 制造物料 | `material_id` | Long |
| 80 | `mergeClues` | 订单合并线索表 | `` | 3fbbb6b9-e49e-4bf4-af4a-37ac589da9e3 |
| 81 | `mergeToOrderId` | 合并后的计划订单id | `merge_to_order_id` | Long |
| 82 | `modifier` | 修改人名称 | `modifier` | String |
| 83 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 84 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 85 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 86 | `oldFinishDate` | 原始完工日期 | `old_finish_date` | DateTime |
| 87 | `oldStartDate` | 原始开工日期 | `old_start_date` | DateTime |
| 88 | `operationException` | 运算异常信息 | `operation_exception` | String |
| 89 | `operationStatus` | 运算状态 | `operation_status` | RunPlanstatus |
| 90 | `orgId` | 计划组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 91 | `organizePlanOrder` | 供应计划订单 | `` | 2bd373cb-59b8-4cd9-83c6-19f85eb9c73a |
| 92 | `originQuantity` | 原始数量 | `origin_quantity` | Decimal |
| 93 | `originalDocId` | 最初展开运行的单据 | `original_doc_id` | Long |
| 94 | `outputQty` | 计划产出数量 | `output_qty` | Decimal |
| 95 | `planOrderAttrextItem` | 子件表自由自定义项 | `` | 797be883-5dcb-409e-8603-a3cd21e40c65 |
| 96 | `planOrderByProduct` | 计划订单联副产品 | `` | b361ed20-0448-4c66-be00-cc155967b710 |
| 97 | `planOrderItems` | 计划订单备料 | `` | 6503f5d1-633e-45d2-86d5-5bd7fceb662c |
| 98 | `planOrderQuantity` | 计划订单扩展表 | `` | 65f25315-2c5c-449b-af96-600bc208777b |
| 99 | `planOrderUserdefItem` | 子件表固定自定义项 | `` | e205508e-20d8-4199-8a33-882d14cfc9d3 |
| 100 | `planParamId` | 计划名称 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 101 | `planParamVersion` | 计划版本 | `plan_param_version` | Integer |
| 102 | `planProperty` | 计划属性 | `plan_property` | PlanPropertyEnum |
| 103 | `planStaffId` | 计划员 | `plan_staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 104 | `planType` | 计划类型 | `plan_type` | PlanTypeAllEnum |
| 105 | `priority` | 优先级 | `priority` | Long |
| 106 | `productId` | product | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 107 | `productionLineId` | 生产线id | `prod_line_id` | 651a9072-79c8-4f70-af37-2eed7063affe |
| 108 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 109 | `pubts` | 时间戳 | `pubts` | DateTime |
| 110 | `purchaseStaffId` | 采购员 | `purchase_staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 111 | `remark` | 备注 | `remark` | String |
| 112 | `reqDate` | 需求日期 | `req_date` | DateTime |
| 113 | `reserveMethod` | 预留方式 | `reserve_method` | ReserveMethodEnum |
| 114 | `reserveid` | 跟踪线索id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 115 | `returncount` | 退回次数 | `returncount` | Short |
| 116 | `rootReqId` | 根需求Id | `root_req_id` | Long |
| 117 | `roughAbilityStatus` | 粗能力状态 | `rough_ability_status` | Short |
| 118 | `routingDetail` | 工序表明细 | `` | db56a42d-44e6-4471-a4a3-a70cdadfb58a |
| 119 | `routingId` | 工艺路线id | `routing_id` | 37955d3b-2143-4a4d-bdd5-0213a13394f5 |
| 120 | `scheduleStatus` | 排产状态 | `schedule_status` | Short |
| 121 | `simulateIdentify` | 模拟标识 | `simulate_identify` | Short |
| 122 | `simulateStatus` | 模拟状态 | `simulate_status` | Integer |
| 123 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 124 | `source` | 上游单据类型 | `source` | String |
| 125 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 126 | `sourceMaterialId` | 源头物料 | `source_material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 127 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 128 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 129 | `srcBomComponentId` | 来源bom子件id | `src_bom_component_id` | f78e2b2f-0634-41d3-a002-c5a68f3e9992 |
| 130 | `srcBomId` | 来源bomid | `src_bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 131 | `srcSourceProductId` | 来源物料id | `src_source_product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 132 | `startDate` | 开工日期 | `start_date` | Date |
| 133 | `status` | 状态 | `status` | PlanStatusEnum |
| 134 | `suggestPlanQuantity` | 主计量数量 | `suggest_plan_quantity` | Decimal |
| 135 | `supplyDirectShip` | 供应商直运标识 | `supply_direct_ship` | Short |
| 136 | `supplyOrgId` | 供应组织 | `supply_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 137 | `supplyType` | 需求的供应类型 | `supply_type` | SupplyTypeEnum |
| 138 | `sysState` | 实体状态 | `sys_state` | EntityState |
| 139 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 140 | `tplid` | 模板id | `tplid` | Long |
| 141 | `trackNumber` | 跟踪号 | `track_number` | String |
| 142 | `transMainRtQuantity` | 已转主计量调拨量 | `trans_main_rt_qty` | Decimal |
| 143 | `transProcessControl` | 拓展是否受审批流控制 | `trans_process_control` | Boolean |
| 144 | `transRtQuantity` | 已转调拨量 | `trans_rt_qty` | Decimal |
| 145 | `transTypeCode` | 交易类型编码 | `trans_type_code` | String |
| 146 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 147 | `uom` | 单位 | `uom` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 148 | `upcode` | 上游单据号 | `upcode` | String |
| 149 | `userDefineCharacter` | 自定义项特征实体 | `user_define_character` | ba75faaf-0ace-4269-bd04-458358f35c39 |
| 150 | `vendorId` | 供应商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 151 | `verifystate` | 审批状态 | `verifystate` | Short |
| 152 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 153 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 154 | `warehouseSupplyId` | 供应仓库id | `warehouse_supply_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 155 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 156 | `wholePushQuantity` | 齐套下达量 | `whole_push_qty` | Decimal |
| 157 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（49个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `planOrderAttrextItem` | 子件表自由自定义项 | `mr.planworkbench.PlanOrderAttrextItem` | None | true |
| 2 | `srcBomId` | 来源bomid | `ed.bom.Bom` | Service |  |
| 3 | `departmentId` | 生产部门 | `aa.baseorg.DeptMV` | Service |  |
| 4 | `srcSourceProductId` | 来源物料id | `pc.product.Product` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `vendorId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 7 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 8 | `purchaseStaffId` | 采购员 | `bd.staff.Staff` | Service |  |
| 9 | `planOrderItems` | 计划订单备料 | `mr.planworkbench.PlanOrderItem` | None | true |
| 10 | `uom` | 单位 | `pc.unit.Unit` | Service |  |
| 11 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 12 | `supplyOrgId` | 供应组织 | `org.func.BaseOrg` | Service |  |
| 13 | `invOrgId` | 入库组织 | `org.func.BaseOrg` | Service |  |
| 14 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 15 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 16 | `warehouseSupplyId` | 供应仓库id | `aa.warehouse.Warehouse` | Service |  |
| 17 | `productId` | product | `pc.product.Product` | Service |  |
| 18 | `organizePlanOrder` | 供应计划订单 | `mr.planworkbench.MultiplantPlanOrder` | None | true |
| 19 | `sourceMaterialId` | 源头物料 | `pc.product.Product` | Service |  |
| 20 | `planOrderQuantity` | 计划订单扩展表 | `mr.planworkbench.PlanOrderQuantity` | None | true |
| 21 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 22 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 23 | `planParamId` | 计划名称 | `mr.planworkbench.PlanParam` | None | true |
| 24 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 25 | `routingId` | 工艺路线id | `ed.routing.Routing` | Service |  |
| 26 | `reserveid` | 跟踪线索id | `st.reservation.Reservation` | Service |  |
| 27 | `userDefineCharacter` | 自定义项特征实体 | `mr.planworkbench.OrderDCT` | None |  |
| 28 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 29 | `routingDetail` | 工序表明细 | `mr.planworkbench.RoutingDetail` | None | true |
| 30 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 31 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 32 | `firstSourceDocOrgId` | 源头单据组织 | `org.func.BaseOrg` | Service |  |
| 33 | `orgId` | 计划组织 | `org.func.BaseOrg` | Service |  |
| 34 | `customerId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 35 | `productionLineId` | 生产线id | `ed.productionline.ProductionLine` | Service |  |
| 36 | `billTypeId` | 单据类型 | `bd.bill.BillTypeVO` | Service |  |
| 37 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 38 | `assistUnit` | 辅计量单位 | `pc.unit.Unit` | Service |  |
| 39 | `bomId` | BOM表体ID | `ed.bom.Bom` | Service |  |
| 40 | `planStaffId` | 计划员 | `bd.staff.Staff` | Service |  |
| 41 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 42 | `mergeClues` | 订单合并线索表 | `mr.planworkbench.OrderMergeClue` | None | true |
| 43 | `demandOrgId` | 需求组织 | `org.func.BaseOrg` | Service |  |
| 44 | `planOrderByProduct` | 计划订单联副产品 | `mr.planworkbench.PlanOrderByProduct` | None | true |
| 45 | `freeCharacteristics` | 自由特征组实体 | `mr.planworkbench.PlanOrderFCT` | None |  |
| 46 | `srcBomComponentId` | 来源bom子件id | `ed.bom.BomComponent` | Service |  |
| 47 | `PlanOrderStatus` | 计划订单状态表 | `mr.planworkbench.PlanOrderStatus` | None | true |
| 48 | `closePeople` | 关闭人id | `base.user.User` | Service |  |
| 49 | `planOrderUserdefItem` | 子件表固定自定义项 | `mr.planworkbench.PlanOrderUserdefItem` | None | true |
