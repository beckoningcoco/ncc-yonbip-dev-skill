---
tags: ["BIP", "元数据", "数据字典", "PO", "po.finishedreport.FinishedReportDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 完工报告详情 (`po.finishedreport.FinishedReportDetail`)

> PO | 物理表：`po_finished_report_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 完工报告详情 |
| 物理表 | `po_finished_report_detail` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:34:49.3150` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 行号 |

---

## 直接属性（162个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `autoPush` | 自动下推 | `auto_push` | Boolean |
| 2 | `firstSourceLineNo` | 源头单据行号 | `first_source_line_no` | Decimal |
| 3 | `orderByProductId` | 生产订单联副产品id | `order_byProduct_id` | 4b08ee17-121c-4d32-9d32-e896d0d3a395 |
| 4 | `orderCode` | 生产订单编号 | `order_code` | String |
| 5 | `processFlowId` | 工序流转卡ID | `process_flow_id` | Long |
| 6 | `processFlowPlanId` | 流转卡工序信息ID | `process_flow_plan_id` | Long |
| 7 | `processId` | 工序号ID | `process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 8 | `processSn` | 工序号 | `process_sn` | Decimal |
| 9 | `reportType` | 来源汇报结果 | `report_type` | String |
| 10 | `sourceOutProdId` | 工序产出表ID | `source_out_prod_id` | Long |
| 11 | `stockSensClue` | 现存量特征敏感线索 | `stockSensClue` | String |
| 12 | `bomSensitiveUid` | BOM敏感域唯一性ID | `bom_sensitive_uid` | String |
| 13 | `costCenterId` | 成本中心ID | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 14 | `freeCharacteristics` | 自由项特征组 | `free_characteristics` | bc68c2c7-6232-4374-ac48-bb007ebb62d0 |
| 15 | `firstCheck` | 首检 | `first_check` | String |
| 16 | `isSerialNoManage` | 序列号管理 | `is_serial_no_manage` | Boolean |
| 17 | `firstSourceId` | 源头单据主表id | `first_source_id` | Long |
| 18 | `bizDocMainId` | 业务单据Id | `biz_doc_main_id` | Long |
| 19 | `osmInRecordsId` | 委外入库单产品行Id | `osm_in_records_id` | Long |
| 20 | `osmInRecordId` | 委外入库单Id | `osm_in_record_id` | Long |
| 21 | `inspectionDate` | 检验日期 | `inspection_date` | Date |
| 22 | `urgentApplyQty` | 紧急放行申请数量 | `urgent_apply_qty` | Decimal |
| 23 | `urgentQty` | 紧急放行通过数量 | `urgent_qty` | Decimal |
| 24 | `operationId` | 标准工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 25 | `scrapReplenishQty` | 报废补单数量 | `scrap_replenish_qty` | Decimal |
| 26 | `scrapRepAuxQty` | 报废补单件数 | `scrap_rep_aux_qty` | Decimal |
| 27 | `offChartReceipt` | 表外产出 | `off_chart_receipt` | Boolean |
| 28 | `inspectionApplyStatus` | 检验申请状态 | `inspection_apply_status` | Short |
| 29 | `inspectionStatus` | 检验状态 | `inspection_status` | Short |
| 30 | `bizDocType` | 业务单据类型 | `biz_doc_type` | String |
| 31 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 32 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 33 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 34 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 35 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 36 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 37 | `productDefineCharacter` | 自定义项特征属性组 | `product_define_ct` | 2244bdfe-20e6-418a-a543-782acfc50f61 |
| 38 | `supplyVirtualAccbodyId` | 供方利润中心ID | `supply_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 39 | `inspection` | 产品检验 | `inspection` | Boolean |
| 40 | `inspectionApplyQty` | 检验申请数量 | `inspection_apply_qty` | Decimal |
| 41 | `inspectionQty` | 检验数量 | `inspection_qty` | Decimal |
| 42 | `processTaskId` | 工序任务id | `process_task_id` | String |
| 43 | `stockByInspection` | 根据检验结果入库 | `stock_by_inspection` | Boolean |
| 44 | `urgentPass` | 紧急放行状态 | `urgent_pass` | Short |
| 45 | `id` | ID | `id` | Long |
| 46 | `finishedReportId` | 单据id | `finished_report_id` | 62bd3c56-84e5-4cb6-96af-159c3188b4ef |
| 47 | `materialId` | 制造物料id | `material_id` | Long |
| 48 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 49 | `skuId` | skuId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 50 | `finishDate` | 完工时间 | `finish_date` | DateTime |
| 51 | `productionUnitId` | 生产单位ID | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 52 | `standardQuantity` | 应完工数量 | `standard_quantity` | Decimal |
| 53 | `quantity` | 完工数量 | `quantity` | Decimal |
| 54 | `batchNoId` | 批次号 | `batch_no_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 55 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 56 | `changeType` | 换算方式 | `change_type` | String |
| 57 | `auxiliaryQuantity` | 完工件数 | `auxiliary_quantity` | Decimal |
| 58 | `orgId` | 库存组织id | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 59 | `warehouseId` | 预入仓库id | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 60 | `batchNo` | 批次号 | `batch_no` | String |
| 61 | `qualifiedQuantity` | 合格数量 | `qualified_quantity` | Decimal |
| 62 | `qualifiedAuxiliaryQuantity` | 合格件数 | `qualified_auxiliary_quantity` | Decimal |
| 63 | `returnQuantity` | 返工数量 | `return_quantity` | Decimal |
| 64 | `returnAuxiliaryQuantity` | 返工件数 | `return_auxiliary_quantity` | Decimal |
| 65 | `returnReasonId` | 返工原因ID | `return_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 66 | `scrapQuantity` | 报废数量 | `scrap_quantity` | Decimal |
| 67 | `scrapAuxiliaryQuantity` | 报废件数 | `scrap_auxiliary_quantity` | Decimal |
| 68 | `scrapReasonId` | 报废原因ID | `scrap_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 69 | `sourceType` | 来源单据类型 | `source_type` | String |
| 70 | `source` | 来源单据类型(推拉单) | `source` | String |
| 71 | `sourceid` | 来源单据主表id | `sourceid` | Long |
| 72 | `upcode` | 来源单据号 | `upcode` | String |
| 73 | `sourceautoid` | 来源单据子表id | `sourceautoid` | Long |
| 74 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 75 | `firstSource` | 源头单据类型 | `first_source` | String |
| 76 | `firstUpCode` | 源头单据号 | `first_upcode` | String |
| 77 | `firstSourceAutoId` | 源头单据子表id | `first_source_autoid` | Long |
| 78 | `trackNo` | 跟踪号 | `track_no` | String |
| 79 | `projectId` | 项目Id | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 80 | `qualifiedStockQuantity` | 已合格入库数量 | `qualified_stock_quantity` | Decimal |
| 81 | `qualifiedStockAuxiliaryQuantity` | 已合格入库件数 | `qualified_stock_auxiliary_quantity` | Decimal |
| 82 | `scrapStockQuantity` | 已报废入库数量 | `scrap_stock_quantity` | Decimal |
| 83 | `scrapStockAuxiliaryQuantity` | 已报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 84 | `returnProduceQuantity` | 已返工生产数量 | `return_produce_quantity` | Decimal |
| 85 | `returnProduceAuxiliaryQuantity` | 已返工生产件数 | `return_produce_auxiliary_quantity` | Decimal |
| 86 | `remark` | 备注 | `remark` | String |
| 87 | `sourceGrandChildId` | 来源单据孙表id | `source_grandchild_id` | Long |
| 88 | `free1` | 颜色测试 | `free1` | String |
| 89 | `free2` | 测试31 | `free2` | String |
| 90 | `free3` | 定量测试 | `free3` | String |
| 91 | `free4` | 香雪产地 | `free4` | String |
| 92 | `free5` | 组织 | `free5` | String |
| 93 | `free6` | 物料规格6 | `free6` | String |
| 94 | `free7` | 物料规格7 | `free7` | String |
| 95 | `free8` | 物料规格8 | `free8` | String |
| 96 | `free9` | 物料规格9 | `free9` | String |
| 97 | `free10` | 物料规格10 | `free10` | String |
| 98 | `define1` | 批次属性1 | `define1` | String |
| 99 | `define2` | 批次属性2 | `define2` | String |
| 100 | `define3` | 批次属性3 | `define3` | String |
| 101 | `define4` | 批次属性4 | `define4` | String |
| 102 | `define5` | 批次属性5 | `define5` | String |
| 103 | `define6` | 批次属性6 | `define6` | String |
| 104 | `define7` | 批次属性7 | `define7` | String |
| 105 | `define8` | 批次属性8 | `define8` | String |
| 106 | `define9` | 批次属性9 | `define9` | String |
| 107 | `define10` | 批次属性10 | `define10` | String |
| 108 | `define11` | 批次属性11 | `define11` | String |
| 109 | `define12` | 批次属性12 | `define12` | String |
| 110 | `define13` | 批次属性13 | `define13` | String |
| 111 | `define14` | 批次属性14 | `define14` | String |
| 112 | `define15` | 批次属性15 | `define15` | String |
| 113 | `define16` | 批次属性16 | `define16` | String |
| 114 | `define17` | 批次属性17 | `define17` | String |
| 115 | `define18` | 批次属性18 | `define18` | String |
| 116 | `define19` | 批次属性19 | `define19` | String |
| 117 | `define20` | 批次属性20 | `define20` | String |
| 118 | `define21` | 批次属性21 | `define21` | String |
| 119 | `define22` | 批次属性22 | `define22` | String |
| 120 | `define23` | 批次属性23 | `define23` | String |
| 121 | `define24` | 批次属性24 | `define24` | String |
| 122 | `define25` | 批次属性25 | `define25` | String |
| 123 | `define26` | 批次属性26 | `define26` | String |
| 124 | `define27` | 批次属性27 | `define27` | String |
| 125 | `define28` | 批次属性28 | `define28` | String |
| 126 | `define29` | 批次属性29 | `define29` | String |
| 127 | `define30` | 批次属性30 | `define30` | String |
| 128 | `productionType` | 产出类型 | `production_type` | String |
| 129 | `lineNo` | 行号 | `line_no` | Decimal |
| 130 | `produceDate` | 生产日期 | `produce_date` | Date |
| 131 | `expirationDate` | 有效期至 | `expiration_date` | Date |
| 132 | `sourceautoidExt` | 来源单据子表id(冗余) | `sourceautoid_ext` | Long |
| 133 | `reserveid` | 预留对象ID | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 134 | `bomId` | BOMId | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 135 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 136 | `pubts` | 时间戳 | `pubts` | DateTime |
| 137 | `procedureReportId` | 报工明细id | `procedure_report_id` | Long |
| 138 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 139 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 140 | `rowno` | 行号 | `rowno` | Integer |
| 141 | `procPlanId` | 工序计划id | `proc_plan_id` | Long |
| 142 | `orderId` | 生产订单id | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 143 | `orderProductId` | 生产订单产品id | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 144 | `demandVirtualAccbodyId` | 需方利润中心ID | `demand_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 145 | `upsourcecode` | 上游单据号 | `upsourcecode` | String |
| 146 | `upsourceautocode` | 上游单据行号 | `upsourceautocode` | Decimal |
| 147 | `bodyExtItem` | 表体自由自定义项 | `` | 8eb736c2-4480-47fd-9779-f578a5884483 |
| 148 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 149 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 150 | `closeReleaseQty` | 关闭释放完工量 | `close_release_qty` | Integer |
| 151 | `destructiveInspectAuxQty` | 破坏性检验件数 | `destructive_inspect_aux_qty` | Decimal |
| 152 | `destructiveInspectQty` | 破坏性检验数量 | `destructive_inspect_qty` | Decimal |
| 153 | `finishedReportDetailExt` | 完工报告产品扩展表 | `` | eee6b91f-2733-4b0f-916a-6a1c8a180f40 |
| 154 | `finishedReportDetailUserdefItem` | 表体固定自定义项 | `` | a98a1327-7ea5-47b6-a1d6-267e89a39d3d |
| 155 | `finishedReportSn` | 完工报告序列号 | `` | d804ba18-1217-4e27-931b-02b02d79f7bb |
| 156 | `inspectionCtrlPoint` | 检验控制点 | `inspection_ctrl_point` | String |
| 157 | `isClose` | 行关闭 | `is_close` | Integer |
| 158 | `linecloseDate` | 行关闭日期 | `lineclose_date` | DateTime |
| 159 | `linecloseReasonId` | 关闭原因 | `lineclose_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 160 | `linecloseRemark` | 关闭说明 | `lineclose_remark` | String |
| 161 | `linecloseTime` | 行关闭时间 | `lineclose_time` | DateTime |
| 162 | `linecloser` | 行关闭人 | `linecloser` | String |

---

## 关联属性（31个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplyVirtualAccbodyId` | 供方利润中心ID | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 2 | `reserveid` | 预留对象ID | `st.reservation.Reservation` | Service |  |
| 3 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 4 | `orderId` | 生产订单id | `po.order.Order` | None |  |
| 5 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 6 | `orgId` | 库存组织id | `aa.baseorg.OrgMV` | Service |  |
| 7 | `finishedReportDetailUserdefItem` | 表体固定自定义项 | `po.finishedreport.FinishedReportDetailUserdefItem` | None | true |
| 8 | `costCenterId` | 成本中心ID | `bd.costcenter.CostCenter` | Service |  |
| 9 | `processId` | 工序号ID | `po.order.OrderProcess` | None |  |
| 10 | `returnReasonId` | 返工原因ID | `aa.reason.Reason` | Service |  |
| 11 | `operationId` | 标准工序ID | `ed.operation.Operation` | Service |  |
| 12 | `skuId` | skuId | `pc.product.ProductSKU` | Service |  |
| 13 | `scrapReasonId` | 报废原因ID | `aa.reason.Reason` | Service |  |
| 14 | `bomId` | BOMId | `ed.bom.Bom` | Service |  |
| 15 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 16 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 17 | `productDefineCharacter` | 自定义项特征属性组 | `po.finishedreport.ProductDefineCharacter` | None |  |
| 18 | `orderProductId` | 生产订单产品id | `po.order.OrderProduct` | None |  |
| 19 | `linecloseReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 20 | `productionUnitId` | 生产单位ID | `pc.unit.Unit` | Service |  |
| 21 | `demandVirtualAccbodyId` | 需方利润中心ID | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 22 | `finishedReportDetailExt` | 完工报告产品扩展表 | `po.finishedreport.FinishedReportDetailExt` | None | true |
| 23 | `batchNoId` | 批次号 | `st.batchno.Batchno` | Service |  |
| 24 | `freeCharacteristics` | 自由项特征组 | `po.finishedreport.ProductFreeCharacteristics` | None |  |
| 25 | `orderByProductId` | 生产订单联副产品id | `po.order.OrderByProduct` | None |  |
| 26 | `warehouseId` | 预入仓库id | `aa.warehouse.Warehouse` | Service |  |
| 27 | `bodyExtItem` | 表体自由自定义项 | `po.finishedreport.FinishedReportDetailExtItem` | None | true |
| 28 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 29 | `finishedReportId` | 单据id | `po.finishedreport.FinishedReport` | None | true |
| 30 | `finishedReportSn` | 完工报告序列号 | `po.finishedreport.FinishedReportSn` | None | true |
| 31 | `projectId` | 项目Id | `bd.project.ProjectVO` | Service |  |
