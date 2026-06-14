---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.subcontractchange.OsmOrderProductChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外订单产品变更表 (`po.subcontractchange.OsmOrderProductChange`)

> OSM | 物理表：`osm_order_product_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外订单产品变更表 |
| 物理表 | `osm_order_product_change` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:57:23.9970` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 变更单产品id |
| 编码 | `rowno` | Integer | 行号 |

---

## 直接属性（192个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `automaticMaterialPreparation` | 自动展开备料 | `automatic_material_preparation` | Boolean |
| 2 | `batchNoId` | 批次参照 | `batch_no_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 3 | `define1` | 自定义项1 | `define1` | String |
| 4 | `define10` | 自定义项10 | `define10` | String |
| 5 | `define11` | 自定义项11 | `define11` | String |
| 6 | `define12` | 自定义项12 | `define12` | String |
| 7 | `define13` | 自定义项13 | `define13` | String |
| 8 | `define14` | 自定义项14 | `define14` | String |
| 9 | `define15` | 自定义项15 | `define15` | String |
| 10 | `define16` | 自定义项16 | `define16` | String |
| 11 | `define17` | 自定义项17 | `define17` | String |
| 12 | `define18` | 自定义项18 | `define18` | String |
| 13 | `define19` | 自定义项19 | `define19` | String |
| 14 | `define2` | 自定义项2 | `define2` | String |
| 15 | `define20` | 自定义项20 | `define20` | String |
| 16 | `define21` | 自定义项21 | `define21` | String |
| 17 | `define22` | 自定义项22 | `define22` | String |
| 18 | `define23` | 自定义项23 | `define23` | String |
| 19 | `srcBomVendorId` | 来源bom委外商 | `src_bom_vendor_id` | Long |
| 20 | `syncStatus` | 同步标识 | `sync_status` | Short |
| 21 | `sourceGrandchildrenId` | 上游单据孙表id | `source_grandchildrenId` | Long |
| 22 | `enableSfcMaterial` | 车间领料 | `enable_sfc_material` | Short |
| 23 | `dailyschQuantity` | 排产数量 | `dailysch_quantity` | Decimal |
| 24 | `dailyschConquantity` | 排产确认数量 | `dailysch_conquantity` | Decimal |
| 25 | `dailyschStatus` | 排产状态 | `dailysch_status` | Short |
| 26 | `retMaterialApplyFlag` | 退料申请标识 | `ret_material_apply_flag` | Short |
| 27 | `entrustCustomer` | 受托客户 | `entrust_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 28 | `ulRate` | 上限比例 | `ul_rate` | Decimal |
| 29 | `bizOrderProductId` | 业务订单行Id | `biz_order_product_id` | Long |
| 30 | `bizOrderId` | 业务订单Id | `biz_order_id` | Long |
| 31 | `reserveid_reservecust` | 客户 | `reserveid_reservecust` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 32 | `lineClose` | 行关闭 | `line_close` | Short |
| 33 | `collaborationSource` | 协同源头单据类型 | `collaboration_source` | String |
| 34 | `collaborationPolineno` | 协同源头单据行号 | `collaboration_polineno` | Decimal |
| 35 | `collaborationPocode` | 协同源头单据号 | `collaboration_pocode` | String |
| 36 | `collaborationPoid` | 协同源头单据主表id | `collaboration_poid` | Long |
| 37 | `collaborationPodetailid` | 协同源头单据行 | `collaboration_podetailid` | Long |
| 38 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 39 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 40 | `cfmIncomingQty` | 确认累计入库数量 | `cfm_incoming_qty` | Decimal |
| 41 | `cfmIncomingAuxQty` | 确认累计入库件数 | `cfm_incoming_auxqty` | Decimal |
| 42 | `cfmScrapStockQty` | 确认报废入库数量 | `cfm_scrapstock_qty` | Decimal |
| 43 | `cfmScrapStockAuxQty` | 确认报废入库件数 | `cfm_scrapstock_auxqty` | Decimal |
| 44 | `printCount` | 打印次数 | `printCount` | Integer |
| 45 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 46 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 47 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 48 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 49 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 50 | `define24` | 自定义项24 | `define24` | String |
| 51 | `define25` | 自定义项25 | `define25` | String |
| 52 | `define26` | 自定义项26 | `define26` | String |
| 53 | `define27` | 自定义项27 | `define27` | String |
| 54 | `define28` | 自定义项28 | `define28` | String |
| 55 | `define29` | 自定义项29 | `define29` | String |
| 56 | `define3` | 自定义项3 | `define3` | String |
| 57 | `define30` | 自定义项30 | `define30` | String |
| 58 | `define4` | 自定义项4 | `define4` | String |
| 59 | `define5` | 自定义项5 | `define5` | String |
| 60 | `define6` | 自定义项6 | `define6` | String |
| 61 | `define7` | 自定义项7 | `define7` | String |
| 62 | `define8` | 自定义项8 | `define8` | String |
| 63 | `define9` | 自定义项9 | `define9` | String |
| 64 | `finishedWorkApplyStatus` | 完工申报状态 | `finished_work_apply_status` | Short |
| 65 | `firstlineno` | 源头单据行号 | `first_line_no` | Decimal |
| 66 | `firstsourceid` | 源头单据主表id | `first_source_id` | Long |
| 67 | `incomingAuxiliaryQuantity` | 累计入库件数 | `incoming_auxiliary_quantity` | Decimal |
| 68 | `incomingQuantity` | 累计入库数量 | `incoming_quantity` | Decimal |
| 69 | `mergeOrderFlag` | 订单合并标识 | `merge_order_flag` | Boolean |
| 70 | `offChartReceiptIsAllowed` | 允许表外产出 | `off_chart_receipt_is_allowed` | Boolean |
| 71 | `planOrderType` | 计划订单类型 | `plan_order_type` | Short |
| 72 | `scrapRepAuxQty` | 报废补单件数 | `scrap_rep_aux_qty` | Decimal |
| 73 | `scrapReplenishQty` | 报废补单数量 | `scrap_replenish_qty` | Decimal |
| 74 | `sourcelineno` | 来源单据行号 | `source_line_no` | Decimal |
| 75 | `stockSensClue` | 现存量特征敏感线索 | `stockSensClue` | String |
| 76 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 77 | `availableQty` | 可用量 | `available_qty` | Decimal |
| 78 | `availableSubQty` | 可用件数 | `available_sub_qty` | Decimal |
| 79 | `bomSensitiveUID` | BOM敏感域唯一性ID | `bom_sensitive_uid` | String |
| 80 | `costCenterId` | 成本中心 | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 81 | `currentStockQuantity` | 现存量 | `current_stock_quantity` | Decimal |
| 82 | `currentSubQty` | 现存件数 | `current_sub_qty` | Decimal |
| 83 | `productDefineDts` | 自定义项特征组 | `define_cts` | f4791bf2-e0cb-421f-b515-e45c6c0cd05e |
| 84 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 659358a8-0f02-41a3-9a95-25039c96e92f |
| 85 | `linecloseRemark` | 关闭说明 | `lineclose_remark` | String |
| 86 | `materialApplyStatus` | 领料申请状态 | `material_apply_status` | Short |
| 87 | `materialStatus` | 领料状态 | `material_status` | Short |
| 88 | `scrapProcessAuxiliaryQuantity` | 报废已处理件数 | `scrap_process_auxiliary_quantity` | Decimal |
| 89 | `virtualAccbodyId` | 利润中心 | `virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 90 | `bomQuantity` | BOM单位数量 | `bom_quantity` | Decimal |
| 91 | `bomUnitChangeRate` | BOM单位换算率 | `bom_unit_change_rate` | Decimal |
| 92 | `bomUnitId` | BOM单位 | `bom_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 93 | `enableSFCPlan` | 启用车间计划 | `enable_sfc_plan` | Boolean |
| 94 | `procPlanCreateOpty` | 工序作业计划创建时机 | `proc_plan_create_opty` | String |
| 95 | `processMode` | 加工组织模式 | `process_mode` | String |
| 96 | `scrapProcessQuantity` | 报废已处理数量 | `scrap_process_quantity` | Decimal |
| 97 | `id` | 变更单产品id | `id` | Long |
| 98 | `orderId` | 变更单表头id | `order_id` | dadfc2eb-7638-4b21-95b9-e274fb4fe84d |
| 99 | `originalOrderId` | 原单表头id | `original_order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 100 | `originalOrderProductId` | 原单产品id | `original_order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 101 | `materialId` | 制造物料id | `material_id` | Long |
| 102 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 103 | `skuId` | SKU编码id | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 104 | `bomId` | bomId | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 105 | `changeRate` | 委外换算率 | `change_rate` | Decimal |
| 106 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 107 | `mrpQuantity` | 净算量 | `mrp_quantity` | Decimal |
| 108 | `startDate` | 开工日期 | `start_date` | DateTime |
| 109 | `reserveid` | 需求对象Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 110 | `orgId` | 收货组织id | `org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 111 | `warehouseId` | 仓库Id | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 112 | `remark` | 备注 | `remark` | String |
| 113 | `scrap` | 废品率 | `scrap` | Decimal |
| 114 | `finishDate` | 完工日期 | `finish_date` | DateTime |
| 115 | `firstsource` | 源头单据类型 | `first_source` | String |
| 116 | `firstupcode` | 源头单据号 | `first_upcode` | String |
| 117 | `firstsourceautoid` | 源头单据子表id | `first_source_autoid` | Long |
| 118 | `sourceType` | 来源单据类型 | `source_type` | String |
| 119 | `source` | 来源单据类型(推拉单) | `source` | String |
| 120 | `sourceid` | 来源单据主表id | `sourceid` | Long |
| 121 | `upcode` | 来源单据号 | `upcode` | String |
| 122 | `sourceautoid` | 来源单据子表id | `sourceautoid` | Long |
| 123 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 124 | `salesOrderId` | 销售订单id | `sales_order_id` | c7c0beb4-f830-486d-83e1-51072b319fd2 |
| 125 | `storeUpDate` | 最近入库日期 | `storeup_date` | Date |
| 126 | `isHold` | 挂起状态 | `is_hold` | Boolean |
| 127 | `linecloser` | 行关闭人 | `linecloser` | String |
| 128 | `linecloseTime` | 行关闭时间 | `lineclose_time` | DateTime |
| 129 | `linecloseDate` | 行关闭日期 | `lineclose_date` | Date |
| 130 | `linecloseReasonId` | 行关闭原因ID | `lineclose_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 131 | `free1` | 物料规格1 | `free1` | String |
| 132 | `free2` | 物料规格2 | `free2` | String |
| 133 | `free3` | 物料规格3 | `free3` | String |
| 134 | `free4` | 香雪产地 | `free4` | String |
| 135 | `free5` | 组织 | `free5` | String |
| 136 | `free6` | 物料规格6 | `free6` | String |
| 137 | `free7` | 物料规格7 | `free7` | String |
| 138 | `free8` | 物料规格8 | `free8` | String |
| 139 | `free9` | 物料规格9 | `free9` | String |
| 140 | `free10` | 物料规格10 | `free10` | String |
| 141 | `scrapQuantity` | 报废数量 | `scrap_quantity` | Decimal |
| 142 | `trackNumber` | 跟踪号 | `track_number` | String |
| 143 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 144 | `startAuxiliaryQuantity` | 已开工件数 | `start_auxiliary_quantity` | Decimal |
| 145 | `financeCloseTime` | 财务关闭时间 | `finance_close_time` | DateTime |
| 146 | `pubts` | 时间戳 | `pubts` | DateTime |
| 147 | `materialApplyFlag` | 领料申请标识 | `material_apply_flag` | Boolean |
| 148 | `realFinishTime` | 实际完工时间 | `real_finish_time` | DateTime |
| 149 | `bomUseType` | BOM用途 | `bom_use_type` | b4c8abe8-998a-421e-b12a-bf6b14121b4d |
| 150 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 151 | `produceDate` | 生产日期 | `produce_date` | Date |
| 152 | `lineNo` | 行号 | `line_no` | Decimal |
| 153 | `bomSelect` | BOM选择 | `bom_select` | String |
| 154 | `batchNo` | 批次号 | `batch_no` | String |
| 155 | `qualifiedAuxiliaryQuantity` | 合格件数 | `qualified_auxiliary_quantity` | Decimal |
| 156 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 157 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 158 | `financeStatus` | 财务关闭 | `finance_status` | Short |
| 159 | `routingId` | 工艺路线 | `routing_id` | 37955d3b-2143-4a4d-bdd5-0213a13394f5 |
| 160 | `expirationDate` | 有效期至 | `expiration_date` | Date |
| 161 | `qualifiedQuantity` | 合格数量 | `qualified_quantity` | Decimal |
| 162 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 163 | `returnQuantity` | 返工数量 | `return_quantity` | Decimal |
| 164 | `isWholeScrap` | 整单报废 | `is_whole_scrap` | Boolean |
| 165 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 166 | `completedAuxiliaryQuantity` | 已完工件数 | `completed_auxiliary_quantity` | Decimal |
| 167 | `returnAuxiliaryQuantity` | 返工件数 | `return_auxiliary_quantity` | Decimal |
| 168 | `isPushProcedurePlan` | 已转工序计划 | `is_push_procedure_plan` | Boolean |
| 169 | `rowno` | 行号 | `rowno` | Integer |
| 170 | `realFinishUserId` | 完工人ID | `real_finish_userId` | Long |
| 171 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 172 | `completedFlag` | 完工报告标识 | `completed_flag` | Boolean |
| 173 | `auxiliaryQuantity` | 生产件数 | `auxiliary_quantity` | Decimal |
| 174 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 175 | `completedIncomingQuantity` | 已完工入库数量 | `completed_incoming_quantity` | Decimal |
| 176 | `realFinishUser` | 完工人 | `real_finish_user` | String |
| 177 | `realFinishStatus` | 完工状态 | `real_finish_status` | Boolean |
| 178 | `completedQuantity` | 已完工数量 | `completed_quantity` | Decimal |
| 179 | `realFinishDate` | 实际完工日期 | `real_finish_date` | Date |
| 180 | `scrapAuxiliaryQuantity` | 报废件数 | `scrap_auxiliary_quantity` | Decimal |
| 181 | `quantity` | 生产数量 | `quantity` | Decimal |
| 182 | `startQuantity` | 已开工数量 | `start_quantity` | Decimal |
| 183 | `mainFormulaId` | 配方 | `mainformula_id` | fa7b101c-5065-4f13-88d2-e6742dadb164 |
| 184 | `orderByProductChange` | 委外订单联副变更表 | `` | 9c8336c4-8fb2-48e2-94b6-927b809815a0 |
| 185 | `orderMaterialChange` | 委外订单材料变更表 | `` | bd2bffb9-e476-482e-8840-b1ecff203c73 |
| 186 | `orderProcessChange` | 委外订单工序变更表 | `` | f2bef16f-2113-415c-95e6-d2ab075ae716 |
| 187 | `orderProductAttrextItem` | 产品表自由自定义项 | `` | cdbc8a58-56b7-4fd1-8ca5-817fe04ab53a |
| 188 | `orderProductExpinfo` | 委外订单产品变更扩展信息 | `` | bd3c8adb-bd74-44b2-94cc-b0f3c1c1287d |
| 189 | `orderProductUserdefItem` | 委外产品表固定自定义项 | `` | ffd55997-6ba4-4d88-a246-9fe7ffebd5b0 |
| 190 | `orderSubcontractProduct` | 委外订单产品委外信息变更表 | `` | 6b8d35c0-79e0-4e76-87ba-5e6d9ec53247 |
| 191 | `orderSubcontractProductConsult` | 委外订单产品委外协同信息变更表 | `` | 43f409cb-34ca-4b3d-bebf-7fb5b74c4b4b |
| 192 | `orderSubcontractProductExt` | 委外订单产品委外扩展信息变更表 | `` | d888f2f4-1d82-4dba-91c5-24f774ccc881 |

---

## 关联属性（38个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `salesOrderId` | 销售订单id | `voucher.order.Order` | Service |  |
| 2 | `orderSubcontractProductExt` | 委外订单产品委外扩展信息变更表 | `po.subcontractchange.OsmSubcontractProductExtChange` | None | true |
| 3 | `orderByProductChange` | 委外订单联副变更表 | `po.subcontractchange.OsmOrderByProductChange` | None | true |
| 4 | `orderProductAttrextItem` | 产品表自由自定义项 | `po.subcontractchange.OsmOrderProductChangeAttrextItem` | None | true |
| 5 | `routingId` | 工艺路线 | `ed.routing.Routing` | Service |  |
| 6 | `reserveid` | 需求对象Id | `st.reservation.Reservation` | Service |  |
| 7 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 8 | `orderId` | 变更单表头id | `po.subcontractchange.OsmOrderChange` | None | true |
| 9 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 10 | `productDefineDts` | 自定义项特征组 | `po.subcontractchange.OsmOrderProductChangeDefineCharacteristics` | None |  |
| 11 | `bomUseType` | BOM用途 | `ed.usetype.UseType` | Service |  |
| 12 | `orgId` | 收货组织id | `org.func.InventoryOrg` | Service |  |
| 13 | `mainFormulaId` | 配方 | `ed.mainformula.MainFormula` | Service |  |
| 14 | `originalOrderId` | 原单表头id | `po.order.Order` | None |  |
| 15 | `entrustCustomer` | 受托客户 | `aa.merchant.Merchant` | Service |  |
| 16 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 17 | `orderMaterialChange` | 委外订单材料变更表 | `po.subcontractchange.OsmOrderMaterialChange` | None | true |
| 18 | `skuId` | SKU编码id | `pc.product.ProductSKU` | Service |  |
| 19 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 20 | `bomId` | bomId | `ed.bom.Bom` | Service |  |
| 21 | `originalOrderProductId` | 原单产品id | `po.order.OrderProduct` | None |  |
| 22 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 23 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 24 | `orderSubcontractProduct` | 委外订单产品委外信息变更表 | `po.subcontractchange.OsmSubcontractProductChange` | None | true |
| 25 | `virtualAccbodyId` | 利润中心 | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 26 | `linecloseReasonId` | 行关闭原因ID | `aa.reason.Reason` | Service |  |
| 27 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 28 | `orderSubcontractProductConsult` | 委外订单产品委外协同信息变更表 | `po.subcontractchange.OsmSubcontractProductConsultChange` | None | true |
| 29 | `batchNoId` | 批次参照 | `st.batchno.Batchno` | Service |  |
| 30 | `orderProcessChange` | 委外订单工序变更表 | `po.subcontractchange.OsmOrderProcessChange` | None | true |
| 31 | `freeCharacteristics` | 自由项特征组 | `po.subcontractchange.ProductFreeCharacteristics` | None |  |
| 32 | `warehouseId` | 仓库Id | `aa.warehouse.Warehouse` | Service |  |
| 33 | `orderProductUserdefItem` | 委外产品表固定自定义项 | `po.subcontractchange.OsmOrderProductChangeDefine` | None | true |
| 34 | `bomUnitId` | BOM单位 | `pc.unit.Unit` | Service |  |
| 35 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 36 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 37 | `orderProductExpinfo` | 委外订单产品变更扩展信息 | `po.subcontractchange.OsmOrderProductChangeExpinfo` | None | true |
| 38 | `reserveid_reservecust` | 客户 | `aa.merchant.Merchant` | Service |  |
