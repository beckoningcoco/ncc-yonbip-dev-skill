---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planworkbench.OrganizePlanOrder"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 多组织需求计划订单 (`mr.planworkbench.OrganizePlanOrder`)

> MR | 物理表：`mr_plan_order`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 多组织需求计划订单 |
| 物理表 | `mr_plan_order` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:33.1990` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（150个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `actionDate` | 行动日期 | `action_date` | Date |
| 2 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 3 | `assistChangeRate` | 辅计量换算率 | `assist_change_rate` | Decimal |
| 4 | `assistChangeRateDen` | 换算率分母 | `assist_change_rateden` | Decimal |
| 5 | `assistChangeRateNum` | 换算率分子 | `assist_change_ratenum` | Decimal |
| 6 | `assistUnit` | 辅计量单位 | `assist_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 7 | `assistUnitCount` | 辅计量数量 | `assist_quantity` | Decimal |
| 8 | `associationGUID` | 计划订单关联GUID | `association_guid` | String |
| 9 | `auditDate` | 审批日期 | `audit_date` | Date |
| 10 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 11 | `auditor` | 审批人名称 | `auditor` | String |
| 12 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `billTypeCode` | 单据类型编码 | `bill_type_code` | String |
| 14 | `billTypeId` | 单据类型 | `bill_type_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 |
| 15 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 16 | `bomId` | BOM表体ID | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 17 | `bomLineNo` | Bom子件行号 | `bom_line_no` | Decimal |
| 18 | `closePeople` | 关闭人id | `close_people` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `closePeopleName` | 关闭人 | `close_people_name` | String |
| 20 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 21 | `closeRemark` | 关闭说明 | `close_remark` | String |
| 22 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 23 | `cmpAssessResult` | 能力评估结果 | `cmp_assess_result` | String |
| 24 | `cmpCalculateStrategy` | 能力计算策略 | `cmp_calculate_strategy` | String |
| 25 | `code` | 编码 | `code` | String |
| 26 | `collaborationPocode` | 协同源头单据号 | `collaboration_pocode` | String |
| 27 | `collaborationPodetailid` | 协同源头单据行 | `collaboration_podetailid` | Long |
| 28 | `collaborationPoid` | 协同源头单据主表id | `collaboration_poid` | Long |
| 29 | `collaborationPolineno` | 协同源头单据行号 | `collaboration_polineno` | Decimal |
| 30 | `collaborationSource` | 协同源头单据类型 | `collaboration_source` | String |
| 31 | `createDate` | 创建日期 | `create_date` | Date |
| 32 | `createTime` | 创建时间 | `create_time` | DateTime |
| 33 | `createType` | 创建计划类型 | `create_type` | CreateTypeEnum |
| 34 | `creator` | 创建人名称 | `creator` | String |
| 35 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 36 | `customerId` | 客户 | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 37 | `datasub` | 应用来源 | `datasub` | String |
| 38 | `demandOrgId` | 需求组织 | `demand_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 39 | `departmentId` | 生产部门 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 40 | `docDate` | 单据日期 | `doc_date` | DateTime |
| 41 | `dr` | 逻辑删除标记 | `dr` | Short |
| 42 | `entrustedType` | 受托加工类型 | `entrusted_type` | entrustedTypeEnum |
| 43 | `finishDate` | 完工日期 | `finish_date` | Date |
| 44 | `firstSourceDocDate` | 源头单据日期 | `first_source_doc_date` | DateTime |
| 45 | `firstSourceDocId` | 源头单据表id | `first_source_doc_id` | Long |
| 46 | `firstSourceDocLineNo` | 源头单据行号 | `first_source_doc_line_no` | Decimal |
| 47 | `firstSourceDocOrgId` | 源头单据组织 | `first_source_doc_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 48 | `firstsource` | 需求来源类型编码 | `first_source` | String |
| 49 | `firstsourceautoid` | 源头单据子表id | `first_source_autoid` | Long |
| 50 | `firstupcode` | 需求来源单号 | `first_upcode` | String |
| 51 | `free1` | 规格1 | `free1` | String |
| 52 | `free10` | 规格10 | `free10` | String |
| 53 | `free2` | 规格2 | `free2` | String |
| 54 | `free3` | 规格3 | `free3` | String |
| 55 | `free4` | 规格4 | `free4` | String |
| 56 | `free5` | 规格5 | `free5` | String |
| 57 | `free6` | 规格6 | `free6` | String |
| 58 | `free7` | 规格7 | `free7` | String |
| 59 | `free8` | 规格8 | `free8` | String |
| 60 | `free9` | 规格9 | `free9` | String |
| 61 | `freeCharacteristics` | 自由特征组实体 | `free_characteristics` | aa0eb63b-7c50-4ce4-8bae-0cf4eaa1131d |
| 62 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 63 | `id` | ID | `id` | Long |
| 64 | `inputQty` | 计划投入数量 | `input_qty` | Decimal |
| 65 | `invOrgId` | 入库组织 | `inv_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 66 | `isClosed` | 关闭标识 | `is_closed` | Boolean |
| 67 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 68 | `isSafetyStockReq` | 安全库存需求 | `is_safety_stock_req` | Boolean |
| 69 | `isSpecialReq` | 特殊需求 | `is_special_req` | specialReqTypeEnum |
| 70 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 71 | `issuedQuantity` | 已下达数量 | `issued_quantity` | Decimal |
| 72 | `issuedUnAudit` | 已下达订单是否允许弃审 | `issued_unaudit` | Boolean |
| 73 | `llc` | 低阶码 | `llc` | Integer |
| 74 | `lockDate` | 锁定日期 | `lock_Date` | Date |
| 75 | `lockTime` | 锁定时间 | `lock_time` | DateTime |
| 76 | `locker` | 锁定人 | `locker` | String |
| 77 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 78 | `materialId` | 制造物料 | `material_id` | Long |
| 79 | `mergeToOrderId` | 合并后的计划订单id | `merge_to_order_id` | Long |
| 80 | `modifier` | 修改人名称 | `modifier` | String |
| 81 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 82 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 83 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 84 | `oldFinishDate` | 原始完工日期 | `old_finish_date` | DateTime |
| 85 | `oldStartDate` | 原始开工日期 | `old_start_date` | DateTime |
| 86 | `operationException` | 运算异常信息 | `operation_exception` | String |
| 87 | `operationStatus` | 运算状态 | `operation_status` | RunPlanstatus |
| 88 | `orgId` | 计划组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 89 | `organizePlanOrder` | 多工厂计划订单拓展 | `` | 61d1d47c-2d5d-49fc-9ddc-aef08a8a56fe |
| 90 | `originQuantity` | 原始数量 | `origin_quantity` | Decimal |
| 91 | `originalDocId` | 最初展开运行的单据 | `original_doc_id` | Long |
| 92 | `outputQty` | 计划产出数量 | `output_qty` | Decimal |
| 93 | `planOrderQuantity` | 组织间需求十一大量扩展 | `` | 657d9464-faaa-40a6-b5d5-b60929b16b88 |
| 94 | `planParamId` | 计划名称 | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 95 | `planParamVersion` | 计划版本 | `plan_param_version` | Integer |
| 96 | `planProperty` | 计划属性 | `plan_property` | PlanPropertyEnum |
| 97 | `planStaffId` | 计划员 | `plan_staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 98 | `planType` | 计划类型 | `plan_type` | PlanTypeAllEnum |
| 99 | `priority` | 优先级 | `priority` | Long |
| 100 | `productId` | product | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 101 | `productionLineId` | 生产线id | `prod_line_id` | 651a9072-79c8-4f70-af37-2eed7063affe |
| 102 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 103 | `pubts` | 时间戳 | `pubts` | DateTime |
| 104 | `purchaseStaffId` | 采购员 | `purchase_staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 105 | `remark` | 备注 | `remark` | String |
| 106 | `reqDate` | 需求日期 | `req_date` | DateTime |
| 107 | `reserveMethod` | 预留方式 | `reserve_method` | ReserveMethodEnum |
| 108 | `reserveid` | 跟踪线索id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 109 | `returncount` | 退回次数 | `returncount` | Short |
| 110 | `rootReqId` | 根需求Id | `root_req_id` | Long |
| 111 | `roughAbilityStatus` | 粗能力状态 | `rough_ability_status` | Short |
| 112 | `routingId` | 工艺路线id | `routing_id` | 37955d3b-2143-4a4d-bdd5-0213a13394f5 |
| 113 | `scheduleStatus` | 排产状态 | `schedule_status` | Short |
| 114 | `simulateIdentify` | 模拟标识 | `simulate_identify` | Short |
| 115 | `simulateStatus` | 模拟状态 | `simulate_status` | Integer |
| 116 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 117 | `source` | 上游单据类型 | `source` | String |
| 118 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 119 | `sourceMaterialId` | 源头物料 | `source_material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 120 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 121 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 122 | `srcBomComponentId` | 来源bom子件id | `src_bom_component_id` | f78e2b2f-0634-41d3-a002-c5a68f3e9992 |
| 123 | `srcBomId` | 来源bomid | `src_bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 124 | `srcSourceProductId` | 来源物料id | `src_source_product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 125 | `startDate` | 开工日期 | `start_date` | Date |
| 126 | `status` | 状态 | `status` | PlanStatusEnum |
| 127 | `suggestPlanQuantity` | 主计量数量 | `suggest_plan_quantity` | Decimal |
| 128 | `supplyDirectShip` | 供应商直运标识 | `supply_direct_ship` | Short |
| 129 | `supplyOrgId` | 供应组织 | `supply_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 130 | `supplyType` | 需求的供应类型 | `supply_type` | SupplyTypeEnum |
| 131 | `sysState` | 实体状态 | `sys_state` | EntityState |
| 132 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 133 | `tplid` | 模板id | `tplid` | Long |
| 134 | `trackNumber` | 跟踪号 | `track_number` | String |
| 135 | `transMainRtQuantity` | 已转主计量调拨量 | `trans_main_rt_qty` | Decimal |
| 136 | `transProcessControl` | 拓展是否受审批流控制 | `trans_process_control` | Boolean |
| 137 | `transRtQuantity` | 已转调拨量 | `trans_rt_qty` | Decimal |
| 138 | `transTypeCode` | 交易类型编码 | `trans_type_code` | String |
| 139 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 140 | `uom` | 单位 | `uom` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 141 | `upcode` | 上游单据号 | `upcode` | String |
| 142 | `userDefineCharacter` | 自定义项特征实体 | `user_define_character` | ba75faaf-0ace-4269-bd04-458358f35c39 |
| 143 | `vendorId` | 供应商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 144 | `verifystate` | 审批状态 | `verifystate` | Short |
| 145 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 146 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 147 | `warehouseSupplyId` | 供应仓库id | `warehouse_supply_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 148 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 149 | `wholePushQuantity` | 齐套下达量 | `whole_push_qty` | Decimal |
| 150 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（42个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `routingId` | 工艺路线id | `ed.routing.Routing` | Service |  |
| 2 | `reserveid` | 跟踪线索id | `st.reservation.Reservation` | Service |  |
| 3 | `srcBomId` | 来源bomid | `ed.bom.Bom` | Service |  |
| 4 | `userDefineCharacter` | 自定义项特征实体 | `mr.planworkbench.OrderDCT` | None |  |
| 5 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 6 | `departmentId` | 生产部门 | `aa.baseorg.DeptMV` | Service |  |
| 7 | `srcSourceProductId` | 来源物料id | `pc.product.Product` | Service |  |
| 8 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 10 | `vendorId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 11 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 12 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 13 | `firstSourceDocOrgId` | 源头单据组织 | `org.func.BaseOrg` | Service |  |
| 14 | `purchaseStaffId` | 采购员 | `bd.staff.Staff` | Service |  |
| 15 | `orgId` | 计划组织 | `org.func.BaseOrg` | Service |  |
| 16 | `uom` | 单位 | `pc.unit.Unit` | Service |  |
| 17 | `customerId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 18 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 19 | `supplyOrgId` | 供应组织 | `org.func.BaseOrg` | Service |  |
| 20 | `invOrgId` | 入库组织 | `org.func.BaseOrg` | Service |  |
| 21 | `productionLineId` | 生产线id | `ed.productionline.ProductionLine` | Service |  |
| 22 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 23 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 24 | `billTypeId` | 单据类型 | `bd.bill.BillTypeVO` | Service |  |
| 25 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 26 | `warehouseSupplyId` | 供应仓库id | `aa.warehouse.Warehouse` | Service |  |
| 27 | `assistUnit` | 辅计量单位 | `pc.unit.Unit` | Service |  |
| 28 | `bomId` | BOM表体ID | `ed.bom.Bom` | Service |  |
| 29 | `productId` | product | `pc.product.Product` | Service |  |
| 30 | `planStaffId` | 计划员 | `bd.staff.Staff` | Service |  |
| 31 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 32 | `organizePlanOrder` | 多工厂计划订单拓展 | `mr.planworkbench.ExtendsOrganizePlanOrder` | None | true |
| 33 | `sourceMaterialId` | 源头物料 | `pc.product.Product` | Service |  |
| 34 | `planOrderQuantity` | 组织间需求十一大量扩展 | `mr.planworkbench.OrganizePlanOrderQuantity` | None | true |
| 35 | `demandOrgId` | 需求组织 | `org.func.BaseOrg` | Service |  |
| 36 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 37 | `freeCharacteristics` | 自由特征组实体 | `mr.planworkbench.PlanOrderFCT` | None |  |
| 38 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 39 | `srcBomComponentId` | 来源bom子件id | `ed.bom.BomComponent` | Service |  |
| 40 | `planParamId` | 计划名称 | `mr.planworkbench.PlanParam` | None |  |
| 41 | `closePeople` | 关闭人id | `base.user.User` | Service |  |
| 42 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
