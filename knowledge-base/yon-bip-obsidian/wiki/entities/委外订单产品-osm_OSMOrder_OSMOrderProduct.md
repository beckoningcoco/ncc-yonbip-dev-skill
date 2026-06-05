---
tags: ["BIP", "元数据", "数据字典", "OSM", "osm.OSMOrder.OSMOrderProduct"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外订单产品 (`osm.OSMOrder.OSMOrderProduct`)

> OSM | 物理表：`po_order_product`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外订单产品 |
| 物理表 | `po_order_product` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:56:37.8180` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（189个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `automaticMaterialPreparation` | 自动展开备料 | `automatic_material_preparation` | Boolean |
| 2 | `auxiliaryQuantity` | 生产件数 | `auxiliary_quantity` | Decimal |
| 3 | `availableQty` | 可用量 | `available_qty` | Decimal |
| 4 | `availableSubQty` | 可用件数 | `available_sub_qty` | Decimal |
| 5 | `batchNo` | 批次号 | `batch_no` | String |
| 6 | `batchNoId` | 批次参照 | `batch_no_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 7 | `bomId` | 物料清单 | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 8 | `bomQuantity` | BOM单位数量 | `bom_quantity` | Decimal |
| 9 | `bomSelect` | BOM选择 | `bom_select` | String |
| 10 | `bomSensitiveUID` | BOM敏感域唯一性ID | `bom_sensitive_uid` | String |
| 11 | `bomUnitChangeRate` | BOM单位换算率 | `bom_unit_change_rate` | Decimal |
| 12 | `bomUnitId` | BOM单位 | `bom_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 13 | `bomUseType` | BOM用途 | `bom_use_type` | b4c8abe8-998a-421e-b12a-bf6b14121b4d |
| 14 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 15 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 16 | `completedAuxiliaryQuantity` | 已完工件数 | `completed_auxiliary_quantity` | Decimal |
| 17 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 18 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 19 | `ulRate` | 上限比例 | `ul_rate` | Decimal |
| 20 | `bizOrderProductId` | 业务订单行Id | `biz_order_product_id` | Long |
| 21 | `bizOrderId` | 业务订单Id | `biz_order_id` | Long |
| 22 | `reserveid_reservecust` | 客户 | `reserveid_reservecust` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 23 | `lineClose` | 行关闭 | `line_close` | Short |
| 24 | `collaborationSource` | 协同源头单据类型 | `collaboration_source` | String |
| 25 | `collaborationPolineno` | 协同源头单据行号 | `collaboration_polineno` | Decimal |
| 26 | `collaborationPocode` | 协同源头单据号 | `collaboration_pocode` | String |
| 27 | `collaborationPoid` | 协同源头单据主表id | `collaboration_poid` | Long |
| 28 | `collaborationPodetailid` | 协同源头单据行 | `collaboration_podetailid` | Long |
| 29 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 30 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 31 | `cfmIncomingQty` | 确认累计入库数量 | `cfm_incoming_qty` | Decimal |
| 32 | `cfmIncomingAuxQty` | 确认累计入库件数 | `cfm_incoming_auxqty` | Decimal |
| 33 | `cfmScrapStockQty` | 确认报废入库数量 | `cfm_scrapstock_qty` | Decimal |
| 34 | `cfmScrapStockAuxQty` | 确认报废入库件数 | `cfm_scrapstock_auxqty` | Decimal |
| 35 | `printCount` | 打印次数 | `printCount` | Integer |
| 36 | `entrustCustomer` | 受托客户 | `entrust_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 37 | `retMaterialApplyFlag` | 退料申请标识 | `ret_material_apply_flag` | Short |
| 38 | `syncStatus` | 同步标识 | `sync_status` | Short |
| 39 | `sourceGrandchildrenId` | 上游单据孙表id | `source_grandchildrenId` | Long |
| 40 | `srcBomVendorId` | 来源bom委外商 | `src_bom_vendor_id` | Long |
| 41 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 42 | `dailyschQuantity` | 排产数量 | `dailysch_quantity` | Decimal |
| 43 | `enableSfcMaterial` | 车间领料 | `enable_sfc_material` | Short |
| 44 | `dailyschConquantity` | 排产确认数量 | `dailysch_conquantity` | Decimal |
| 45 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 46 | `dailyschStatus` | 排产状态 | `dailysch_status` | Short |
| 47 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 48 | `completedFlag` | 完工报告标识 | `completed_flag` | Boolean |
| 49 | `completedIncomingQuantity` | 已完工入库数量(不使用) | `completed_incoming_quantity` | Decimal |
| 50 | `completedQuantity` | 已完工数量 | `completed_quantity` | Decimal |
| 51 | `costCenterId` | 成本中心 | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 52 | `currentStockQuantity` | 现存量 | `current_stock_quantity` | Decimal |
| 53 | `currentSubQty` | 现存件数 | `current_sub_qty` | Decimal |
| 54 | `define1` | 自定义项1 | `define1` | String |
| 55 | `define10` | 自定义项10 | `define10` | String |
| 56 | `define11` | 自定义项11 | `define11` | String |
| 57 | `define12` | 自定义项12 | `define12` | String |
| 58 | `define13` | 自定义项13 | `define13` | String |
| 59 | `define14` | 自定义项14 | `define14` | String |
| 60 | `define15` | 自定义项15 | `define15` | String |
| 61 | `define16` | 自定义项16 | `define16` | String |
| 62 | `define17` | 自定义项17 | `define17` | String |
| 63 | `define18` | 自定义项18 | `define18` | String |
| 64 | `define19` | 自定义项19 | `define19` | String |
| 65 | `define2` | 自定义项2 | `define2` | String |
| 66 | `define20` | 自定义项20 | `define20` | String |
| 67 | `define21` | 自定义项21 | `define21` | String |
| 68 | `define22` | 自定义项22 | `define22` | String |
| 69 | `define23` | 自定义项23 | `define23` | String |
| 70 | `define24` | 自定义项24 | `define24` | String |
| 71 | `define25` | 自定义项25 | `define25` | String |
| 72 | `define26` | 自定义项26 | `define26` | String |
| 73 | `define27` | 自定义项27 | `define27` | String |
| 74 | `define28` | 自定义项28 | `define28` | String |
| 75 | `define29` | 自定义项29 | `define29` | String |
| 76 | `define3` | 自定义项3 | `define3` | String |
| 77 | `define30` | 自定义项30 | `define30` | String |
| 78 | `define4` | 自定义项4 | `define4` | String |
| 79 | `define5` | 自定义项5 | `define5` | String |
| 80 | `define6` | 自定义项6 | `define6` | String |
| 81 | `define7` | 自定义项7 | `define7` | String |
| 82 | `define8` | 自定义项8 | `define8` | String |
| 83 | `define9` | 自定义项9 | `define9` | String |
| 84 | `enableSFCPlan` | 启用车间计划 | `enable_sfc_plan` | Boolean |
| 85 | `expirationDate` | 有效期至 | `expiration_date` | Date |
| 86 | `financeCloseTime` | 财务关闭时间 | `finance_close_time` | DateTime |
| 87 | `financeStatus` | 财务关闭 | `finance_status` | Short |
| 88 | `finishDate` | 完工日期 | `finish_date` | DateTime |
| 89 | `finishedWorkApplyStatus` | 完工申报状态 | `finished_work_apply_status` | Short |
| 90 | `firstlineno` | 源头单据行号 | `first_line_no` | Decimal |
| 91 | `firstsource` | 源头单据类型 | `first_source` | String |
| 92 | `firstsourceautoid` | 源头单据子表id | `first_source_autoid` | Long |
| 93 | `firstsourceid` | 源头单据主表id | `first_source_id` | Long |
| 94 | `firstupcode` | 源头单据号 | `first_upcode` | String |
| 95 | `free1` | 规格1 | `free1` | String |
| 96 | `free10` | 规格10 | `free10` | String |
| 97 | `free2` | 规格2 | `free2` | String |
| 98 | `free3` | 规格3 | `free3` | String |
| 99 | `free4` | 规格4 | `free4` | String |
| 100 | `free5` | 规格5 | `free5` | String |
| 101 | `free6` | 规格6 | `free6` | String |
| 102 | `free7` | 规格7 | `free7` | String |
| 103 | `free8` | 规格8 | `free8` | String |
| 104 | `free9` | 规格9 | `free9` | String |
| 105 | `freeCharacteristics` | 自由项特征组 | `free_cts` | a69e9a50-bde6-4402-9b4a-2cbe66a69974 |
| 106 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 107 | `id` | ID | `id` | Long |
| 108 | `incomingAuxiliaryQuantity` | 累计入库件数 | `incoming_auxiliary_quantity` | Decimal |
| 109 | `incomingQuantity` | 累计入库数量 | `incoming_quantity` | Decimal |
| 110 | `isHold` | 挂起状态 | `is_hold` | Boolean |
| 111 | `isPushProcedurePlan` | 已转工序计划 | `is_push_procedure_plan` | Boolean |
| 112 | `isWholeScrap` | 整单报废 | `is_whole_scrap` | Boolean |
| 113 | `lineNo` | 行号 | `line_no` | Decimal |
| 114 | `linecloseDate` | 行关闭日期 | `lineclose_date` | Date |
| 115 | `linecloseReasonId` | 关闭原因 | `lineclose_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 116 | `linecloseRemark` | 关闭说明 | `lineclose_remark` | String |
| 117 | `linecloseTime` | 行关闭时间 | `lineclose_time` | DateTime |
| 118 | `linecloser` | 行关闭人 | `linecloser` | String |
| 119 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 120 | `materialApplyFlag` | 领料申请标识 | `material_apply_flag` | Boolean |
| 121 | `materialApplyStatus` | 领料申请状态 | `material_apply_status` | Short |
| 122 | `materialId` | 制造物料 | `material_id` | Long |
| 123 | `materialStatus` | 领料状态 | `material_status` | Short |
| 124 | `mergeOrderFlag` | 订单合并标识 | `merge_order_flag` | Boolean |
| 125 | `mrpQuantity` | 净算量 | `mrp_quantity` | Decimal |
| 126 | `offChartReceiptIsAllowed` | 允许表外产出 | `off_chart_receipt_is_allowed` | Boolean |
| 127 | `orderId` | 生产订单id | `order_id` | 823b74a3-0ec8-440f-91a3-fdf94ae2f1bd |
| 128 | `orgId` | 库存组织 | `org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 129 | `planOrderType` | 计划订单类型 | `plan_order_type` | Short |
| 130 | `procPlanCreateOpty` | 工序作业计划创建时机 | `proc_plan_create_opty` | String |
| 131 | `processMode` | 加工组织模式 | `process_mode` | String |
| 132 | `produceDate` | 生产日期 | `produce_date` | Date |
| 133 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 134 | `productDefineDts` | 自定义项特征组 | `define_cts` | af36ba15-a610-458f-8443-27bc95538f93 |
| 135 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 136 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 137 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 138 | `pubts` | 时间戳 | `pubts` | DateTime |
| 139 | `qualifiedAuxiliaryQuantity` | 合格件数 | `qualified_auxiliary_quantity` | Decimal |
| 140 | `qualifiedQuantity` | 合格数量 | `qualified_quantity` | Decimal |
| 141 | `quantity` | 生产数量 | `quantity` | Decimal |
| 142 | `realFinishDate` | 实际完工日期 | `real_finish_date` | Date |
| 143 | `realFinishStatus` | 完工状态 | `real_finish_status` | Boolean |
| 144 | `realFinishTime` | 实际完工时间 | `real_finish_time` | DateTime |
| 145 | `realFinishUser` | 完工人 | `real_finish_user` | String |
| 146 | `realFinishUserId` | 完工人ID | `real_finish_userId` | Long |
| 147 | `remark` | 备注 | `remark` | String |
| 148 | `reserveid` | 跟踪线索Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 149 | `returnAuxiliaryQuantity` | 返工件数 | `return_auxiliary_quantity` | Decimal |
| 150 | `returnQuantity` | 返工数量 | `return_quantity` | Decimal |
| 151 | `routingId` | 工艺路线 | `routing_id` | 37955d3b-2143-4a4d-bdd5-0213a13394f5 |
| 152 | `rowno` | 序号 | `rowno` | Integer |
| 153 | `salesOrderId` | 销售订单 | `sales_order_id` | c7c0beb4-f830-486d-83e1-51072b319fd2 |
| 154 | `scrap` | 废品率% | `scrap` | Decimal |
| 155 | `scrapAuxiliaryQuantity` | 报废件数 | `scrap_auxiliary_quantity` | Decimal |
| 156 | `scrapProcessAuxiliaryQuantity` | 报废已处理件数 | `scrap_process_auxiliary_quantity` | Decimal |
| 157 | `scrapProcessQuantity` | 报废已处理数量 | `scrap_process_quantity` | Decimal |
| 158 | `scrapQuantity` | 报废数量 | `scrap_quantity` | Decimal |
| 159 | `scrapRepAuxQty` | 报废补单件数 | `scrap_rep_aux_qty` | Decimal |
| 160 | `scrapReplenishQty` | 报废补单数量 | `scrap_replenish_qty` | Decimal |
| 161 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 162 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 163 | `skuId` | skuId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 164 | `source` | 上游单据类型 | `source` | String |
| 165 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 166 | `sourceType` | 来源单据类型 | `source_type` | String |
| 167 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 168 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 169 | `sourcelineno` | 来源单据行号 | `source_line_no` | Decimal |
| 170 | `startAuxiliaryQuantity` | 已开工件数 | `start_auxiliary_quantity` | Decimal |
| 171 | `startDate` | 开工日期 | `start_date` | DateTime |
| 172 | `startQuantity` | 已开工数量 | `start_quantity` | Decimal |
| 173 | `stockSensClue` | 现存量特征敏感线索 | `stockSensClue` | String |
| 174 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 175 | `storeUpDate` | 最近入库日期 | `storeup_date` | Date |
| 176 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 177 | `trackNumber` | 跟踪号 | `track_number` | String |
| 178 | `upcode` | 上游单据号 | `upcode` | String |
| 179 | `virtualAccbodyId` | 利润中心 | `virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 180 | `warehouseId` | 预入仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 181 | `mainFormulaId` | 配方 | `mainformula_id` | fa7b101c-5065-4f13-88d2-e6742dadb164 |
| 182 | `orderByProduct` | 委外订单联副产品 | `` | 815c3a03-9e21-40c0-baa1-08961b64fc38 |
| 183 | `orderMaterial` | 委外订单材料 | `` | 5c389e25-419a-44f6-abfe-4d997d1fcf20 |
| 184 | `orderProcess` | 委外订单工序 | `` | fcd91951-f31d-4736-b1c2-5c0cc3af4b5b |
| 185 | `orderProductExpinfo` | 委外订单产品扩展信息 | `` | e6e5e335-dd52-4c68-868c-784450b4f5b2 |
| 186 | `orderSubcontractProduct` | 委外产品信息 | `` | ab95a5c6-818f-497d-b639-907f54048553 |
| 187 | `orderSubcontractProductConsult` | 委外产品协同信息 | `` | 1d88d5c4-ecb5-411a-bce0-9319a6eabe0a |
| 188 | `orderSubcontractProductExt` | 委外产品扩展信息 | `` | d8676ddf-f209-456b-8ce1-9ed44adfceb2 |
| 189 | `taxResults` | 计税结果 | `` | b28c91f4-8d91-45bd-8236-7bbb3fc1d43a |

---

## 关联属性（35个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `salesOrderId` | 销售订单 | `voucher.order.Order` | Service |  |
| 2 | `orderSubcontractProductExt` | 委外产品扩展信息 | `osm.OSMOrder.OSMSubcontractProductExt` | None | true |
| 3 | `routingId` | 工艺路线 | `ed.routing.Routing` | Service |  |
| 4 | `reserveid` | 跟踪线索Id | `st.reservation.Reservation` | Service |  |
| 5 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 6 | `orderId` | 生产订单id | `osm.OSMOrder.OSMOrder` | None | true |
| 7 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 8 | `productDefineDts` | 自定义项特征组 | `po.order.ProductDefineCharacteristics` | None |  |
| 9 | `bomUseType` | BOM用途 | `ed.usetype.UseType` | Service |  |
| 10 | `orgId` | 库存组织 | `org.func.InventoryOrg` | Service |  |
| 11 | `mainFormulaId` | 配方 | `ed.mainformula.MainFormula` | Service |  |
| 12 | `entrustCustomer` | 受托客户 | `aa.merchant.Merchant` | Service |  |
| 13 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 14 | `orderProcess` | 委外订单工序 | `osm.OSMOrder.OSMOrderProcess` | None | true |
| 15 | `orderByProduct` | 委外订单联副产品 | `osm.OSMOrder.OSMOrderByProduct` | None | true |
| 16 | `skuId` | skuId | `pc.product.ProductSKU` | Service |  |
| 17 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 18 | `bomId` | 物料清单 | `ed.bom.Bom` | Service |  |
| 19 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 20 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 21 | `orderSubcontractProduct` | 委外产品信息 | `osm.OSMOrder.OSMSubcontractProduct` | None | true |
| 22 | `virtualAccbodyId` | 利润中心 | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 23 | `linecloseReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 24 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 25 | `orderSubcontractProductConsult` | 委外产品协同信息 | `osm.OSMOrder.OSMSubcontractProductConsult` | None | true |
| 26 | `taxResults` | 计税结果 | `osm.OSMOrder.TaxCalculationResult` | None | true |
| 27 | `batchNoId` | 批次参照 | `st.batchno.Batchno` | Service |  |
| 28 | `freeCharacteristics` | 自由项特征组 | `po.order.ProductFreeCharacteristics` | None |  |
| 29 | `warehouseId` | 预入仓库 | `aa.warehouse.Warehouse` | Service |  |
| 30 | `orderMaterial` | 委外订单材料 | `osm.OSMOrder.OSMOrderMaterial` | None | true |
| 31 | `bomUnitId` | BOM单位 | `pc.unit.Unit` | Service |  |
| 32 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 33 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 34 | `orderProductExpinfo` | 委外订单产品扩展信息 | `osm.OSMOrder.OSMOrderProductExpinfo` | None | true |
| 35 | `reserveid_reservecust` | 客户 | `aa.merchant.Merchant` | Service |  |
