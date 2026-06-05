---
tags: ["BIP", "元数据", "数据字典", "PO", "po.finishedreport.FinishedReportSrcDt"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 完工报告来源明细 (`po.finishedreport.FinishedReportSrcDt`)

> PO | 物理表：`po_finished_report_src_dt`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 完工报告来源明细 |
| 物理表 | `po_finished_report_src_dt` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:34:58.2430` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（141个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `autoPush` | 自动下推 | `auto_push` | Boolean |
| 2 | `auxiliaryQuantity` | 完工件数 | `auxiliary_quantity` | Decimal |
| 3 | `batchNo` | 批次号 | `batch_no` | String |
| 4 | `batchNoId` | 批次参照 | `batch_no_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 5 | `bomId` | 物料清单 | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 6 | `bomSensitiveUid` | BOM敏感域唯一性ID | `bom_sensitive_uid` | String |
| 7 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 8 | `changeType` | 换算方式 | `change_type` | String |
| 9 | `costCenterId` | 成本中心ID | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 10 | `define1` | 自定义项1 | `define1` | String |
| 11 | `define10` | 自定义项10 | `define10` | String |
| 12 | `define11` | 自定义项11 | `define11` | String |
| 13 | `define12` | 自定义项12 | `define12` | String |
| 14 | `define13` | 自定义项13 | `define13` | String |
| 15 | `define14` | 自定义项14 | `define14` | String |
| 16 | `define15` | 自定义项15 | `define15` | String |
| 17 | `define16` | 自定义项16 | `define16` | String |
| 18 | `define17` | 自定义项17 | `define17` | String |
| 19 | `define18` | 自定义项18 | `define18` | String |
| 20 | `define19` | 自定义项19 | `define19` | String |
| 21 | `define2` | 自定义项2 | `define2` | String |
| 22 | `define20` | 自定义项20 | `define20` | String |
| 23 | `define21` | 自定义项21 | `define21` | String |
| 24 | `define22` | 自定义项22 | `define22` | String |
| 25 | `define23` | 自定义项23 | `define23` | String |
| 26 | `define24` | 自定义项24 | `define24` | String |
| 27 | `define25` | 自定义项25 | `define25` | String |
| 28 | `define26` | 自定义项26 | `define26` | String |
| 29 | `define27` | 自定义项27 | `define27` | String |
| 30 | `define28` | 自定义项28 | `define28` | String |
| 31 | `define29` | 自定义项29 | `define29` | String |
| 32 | `define3` | 自定义项3 | `define3` | String |
| 33 | `define30` | 自定义项30 | `define30` | String |
| 34 | `define4` | 自定义项4 | `define4` | String |
| 35 | `define5` | 自定义项5 | `define5` | String |
| 36 | `define6` | 自定义项6 | `define6` | String |
| 37 | `define7` | 自定义项7 | `define7` | String |
| 38 | `define8` | 自定义项8 | `define8` | String |
| 39 | `define9` | 自定义项9 | `define9` | String |
| 40 | `demandVirtualAccbodyId` | 需方利润中心ID | `demand_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 41 | `detailLineNo` | 完工报工详情行号 | `detail_line_no` | Decimal |
| 42 | `expirationDate` | 有效期至 | `expiration_date` | Date |
| 43 | `finishDate` | 完工时间 | `finish_date` | DateTime |
| 44 | `finishedReportDetailId` | 完工报工详情id | `finished_report_detail_id` | d8490919-eda7-40f8-a9a3-9869fc46b507 |
| 45 | `finishedReportId` | 完工报工id | `finished_report_id` | 62bd3c56-84e5-4cb6-96af-159c3188b4ef |
| 46 | `firstSource` | 源头单据类型 | `first_source` | String |
| 47 | `firstSourceAutoId` | 源头单据子表id | `first_source_autoid` | Long |
| 48 | `firstSourceLineNo` | 源头单据行号 | `first_source_line_no` | Decimal |
| 49 | `firstUpCode` | 源头单据号 | `first_upcode` | String |
| 50 | `free1` | 规格1 | `free1` | String |
| 51 | `free10` | 规格10 | `free10` | String |
| 52 | `free2` | 规格2 | `free2` | String |
| 53 | `free3` | 规格3 | `free3` | String |
| 54 | `free4` | 规格4 | `free4` | String |
| 55 | `free5` | 规格5 | `free5` | String |
| 56 | `free6` | 规格6 | `free6` | String |
| 57 | `free7` | 规格7 | `free7` | String |
| 58 | `free8` | 规格8 | `free8` | String |
| 59 | `free9` | 规格9 | `free9` | String |
| 60 | `freeCharacteristics` | 自由项特征组 | `free_characteristics` | e2a06728-2cbf-466f-8b28-dc6710c17f43 |
| 61 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 62 | `id` | ID | `id` | Long |
| 63 | `inspection` | 产品检验 | `inspection` | Boolean |
| 64 | `inspectionApplyQty` | 检验申请数量 | `inspection_apply_qty` | Decimal |
| 65 | `inspectionQty` | 检验数量 | `inspection_qty` | Decimal |
| 66 | `lineNo` | 行号 | `line_no` | Decimal |
| 67 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 68 | `materialId` | 制造物料 | `material_id` | Long |
| 69 | `orderByProductId` | 生产订单联副产品id | `order_byProduct_id` | Long |
| 70 | `orderCode` | 生产订单编号 | `order_code` | String |
| 71 | `orderId` | 生产订单id | `order_id` | Long |
| 72 | `orderProductId` | 生产订单行id | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 73 | `orgId` | 库存组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 74 | `procPlanId` | 工序作业计划id | `proc_plan_id` | Long |
| 75 | `procedureReportId` | 报工明细id | `procedure_report_id` | Long |
| 76 | `processFlowId` | 工序流转卡ID | `process_flow_id` | Long |
| 77 | `processFlowPlanId` | 流转卡工序信息ID | `process_flow_plan_id` | Long |
| 78 | `processId` | 工序号ID | `process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 79 | `processSn` | 工序号 | `process_sn` | Decimal |
| 80 | `processTaskId` | 工序任务id | `process_task_id` | String |
| 81 | `produceDate` | 生产日期 | `produce_date` | Date |
| 82 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 83 | `productDefineCharacter` | 完工报告详情自定义项 | `product_define_ct` | 5806d5b0-e827-42a7-a45f-d13f422c23fb |
| 84 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 85 | `productionType` | 产出类型 | `production_type` | String |
| 86 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 87 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 88 | `pubts` | 时间戳 | `pubts` | DateTime |
| 89 | `qualifiedAuxiliaryQuantity` | 合格件数 | `qualified_auxiliary_quantity` | Decimal |
| 90 | `qualifiedQuantity` | 合格数量 | `qualified_quantity` | Decimal |
| 91 | `qualifiedStockAuxiliaryQuantity` | 已合格入库件数 | `qualified_stock_auxiliary_quantity` | Decimal |
| 92 | `qualifiedStockQuantity` | 已合格入库数量 | `qualified_stock_quantity` | Decimal |
| 93 | `quantity` | 完工数量 | `quantity` | Decimal |
| 94 | `remark` | 备注 | `remark` | String |
| 95 | `reportType` | 来源汇报结果 | `report_type` | String |
| 96 | `reserveid` | 跟踪线索Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 97 | `returnAuxiliaryQuantity` | 返工件数 | `return_auxiliary_quantity` | Decimal |
| 98 | `returnProduceAuxiliaryQuantity` | 已返工生产件数 | `return_produce_auxiliary_quantity` | Decimal |
| 99 | `returnProduceQuantity` | 已返工生产数量 | `return_produce_quantity` | Decimal |
| 100 | `returnQuantity` | 返工数量 | `return_quantity` | Decimal |
| 101 | `returnReasonId` | 返工原因 | `return_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 102 | `rowno` | 序号 | `rowno` | Integer |
| 103 | `scrapAuxiliaryQuantity` | 报废件数 | `scrap_auxiliary_quantity` | Decimal |
| 104 | `scrapQuantity` | 报废数量 | `scrap_quantity` | Decimal |
| 105 | `scrapReasonId` | 报废原因 | `scrap_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 106 | `scrapStockAuxiliaryQuantity` | 已报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 107 | `scrapStockQuantity` | 已报废入库数量 | `scrap_stock_quantity` | Decimal |
| 108 | `skuId` | skuId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 109 | `source` | 上游单据类型 | `source` | String |
| 110 | `sourceGrandChildId` | 上游单据孙表id | `source_grandchild_id` | Long |
| 111 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 112 | `sourceOutProdId` | 工序产出表ID | `source_out_prod_id` | Long |
| 113 | `sourceType` | 来源单据类型 | `source_type` | String |
| 114 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 115 | `sourceautoidExt` | 上游单据子表id | `sourceautoid_ext` | Long |
| 116 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 117 | `standardQuantity` | 应完工数量 | `standard_quantity` | Decimal |
| 118 | `stockByInspection` | 根据检验结果入库 | `stock_by_inspection` | Boolean |
| 119 | `stockSensClue` | 现存量特征敏感线索 | `stockSensClue` | String |
| 120 | `supplyVirtualAccbodyId` | 供方利润中心ID | `supply_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 121 | `trackNo` | 跟踪号 | `track_no` | String |
| 122 | `upcode` | 上游单据号 | `upcode` | String |
| 123 | `upsourceautocode` | 上游单据行号 | `upsourceautocode` | Decimal |
| 124 | `upsourcecode` | 上游单据号 | `upsourcecode` | String |
| 125 | `urgentPass` | 紧急放行状态 | `urgent_pass` | Short |
| 126 | `warehouseId` | 预入仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 127 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 128 | `bizDocMainId` | 业务单据Id | `biz_doc_main_id` | Long |
| 129 | `bizDocType` | 业务单据类型 | `biz_doc_type` | String |
| 130 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 131 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 132 | `finishedReportSrcDtExt` | 完工报告来源明细扩展表 | `` | 52a4bf1a-8bb7-4bc6-97cf-98e31a5ba2e9 |
| 133 | `finishedReportSrcDtUserdefItem` | 来源明细固定自定义项 | `` | 4269b1ea-39e0-4d92-8590-2b990be86718 |
| 134 | `finishedReportSrcSn` | 完工报告来源明细序列号 | `` | f8f502ec-1b4c-4504-b3f9-6a6fb3179fde |
| 135 | `firstSourceId` | 源头单据主表id | `first_source_id` | Long |
| 136 | `operationId` | 标准工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 137 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 138 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 139 | `sourceBodyExtItem` | 来源明细自由自定义项 | `` | 2987e3a0-8095-4477-83ad-b89f1e9f5582 |
| 140 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 141 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（29个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `finishedReportDetailId` | 完工报工详情id | `po.finishedreport.FinishedReportDetail` | None |  |
| 2 | `supplyVirtualAccbodyId` | 供方利润中心ID | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 3 | `reserveid` | 跟踪线索Id | `st.reservation.Reservation` | Service |  |
| 4 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 5 | `finishedReportSrcDtUserdefItem` | 来源明细固定自定义项 | `po.finishedreport.FinishedReportSrcDtUserdefItem` | None | true |
| 6 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 7 | `orgId` | 库存组织 | `aa.baseorg.OrgMV` | Service |  |
| 8 | `costCenterId` | 成本中心ID | `bd.costcenter.CostCenter` | Service |  |
| 9 | `processId` | 工序号ID | `po.order.OrderProcess` | None |  |
| 10 | `returnReasonId` | 返工原因 | `aa.reason.Reason` | Service |  |
| 11 | `operationId` | 标准工序ID | `ed.operation.Operation` | Service |  |
| 12 | `sourceBodyExtItem` | 来源明细自由自定义项 | `po.finishedreport.FinishedReportSrcDtExtItem` | None | true |
| 13 | `skuId` | skuId | `pc.product.ProductSKU` | Service |  |
| 14 | `scrapReasonId` | 报废原因 | `aa.reason.Reason` | Service |  |
| 15 | `finishedReportSrcSn` | 完工报告来源明细序列号 | `po.finishedreport.FinishedReportSrcSn` | None | true |
| 16 | `bomId` | 物料清单 | `ed.bom.Bom` | Service |  |
| 17 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 18 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 19 | `productDefineCharacter` | 完工报告详情自定义项 | `po.finishedreport.SourceDefineCharacter` | None |  |
| 20 | `orderProductId` | 生产订单行id | `po.order.OrderProduct` | None |  |
| 21 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 22 | `finishedReportSrcDtExt` | 完工报告来源明细扩展表 | `po.finishedreport.FinishedReportSrcDtExt` | None | true |
| 23 | `demandVirtualAccbodyId` | 需方利润中心ID | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 24 | `batchNoId` | 批次参照 | `st.batchno.Batchno` | Service |  |
| 25 | `freeCharacteristics` | 自由项特征组 | `po.finishedreport.SourceFreeCharacteristics` | None |  |
| 26 | `warehouseId` | 预入仓库 | `aa.warehouse.Warehouse` | Service |  |
| 27 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 28 | `finishedReportId` | 完工报工id | `po.finishedreport.FinishedReport` | None | true |
| 29 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
