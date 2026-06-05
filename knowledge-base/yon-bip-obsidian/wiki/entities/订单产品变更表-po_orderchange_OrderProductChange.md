---
tags: ["BIP", "元数据", "数据字典", "PO", "po.orderchange.OrderProductChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 订单产品变更表 (`po.orderchange.OrderProductChange`)

> PO | 物理表：`po_order_product_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 订单产品变更表 |
| 物理表 | `po_order_product_change` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:33:52.3450` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 变更单产品ID |
| 编码 | `rowno` | Integer | 行号 |

---

## 直接属性（193个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `firstlineno` | 源头单据行号 | `first_line_no` | Decimal |
| 2 | `firstsourceid` | 源头单据主表id | `first_source_id` | Long |
| 3 | `mergeOrderFlag` | 订单合并标识 | `merge_order_flag` | Boolean |
| 4 | `offChartReceiptIsAllowed` | 允许表外产出 | `off_chart_receipt_is_allowed` | Boolean |
| 5 | `scrapRepAuxQty` | 报废补单件数 | `scrap_rep_aux_qty` | Decimal |
| 6 | `scrapReplenishQty` | 报废补单数量 | `scrap_replenish_qty` | Decimal |
| 7 | `sourcelineno` | 来源单据行号 | `source_line_no` | Decimal |
| 8 | `completedAuxiliaryQuantity` | 已完工件数 | `completed_auxiliary_quantity` | Decimal |
| 9 | `completedIncomingQuantity` | 已完工入库数量(不使用) | `completed_incoming_quantity` | Decimal |
| 10 | `completedQuantity` | 已完工数量 | `completed_quantity` | Decimal |
| 11 | `define1` | 自定义项1 | `define1` | String |
| 12 | `define10` | 自定义项10 | `define10` | String |
| 13 | `define11` | 自定义项11 | `define11` | String |
| 14 | `define12` | 自定义项12 | `define12` | String |
| 15 | `define13` | 自定义项13 | `define13` | String |
| 16 | `define14` | 自定义项14 | `define14` | String |
| 17 | `syncStatus` | 同步标识 | `sync_status` | Short |
| 18 | `sourceGrandchildrenId` | 上游单据孙表id | `source_grandchildrenId` | Long |
| 19 | `closeApply` | 关闭申请 | `close_apply` | Short |
| 20 | `ulRate` | 上限比例 | `ul_rate` | Decimal |
| 21 | `bizOrderProductId` | 业务订单行Id | `biz_order_product_id` | Long |
| 22 | `bizOrderId` | 业务订单Id | `biz_order_id` | Long |
| 23 | `reserveid_reservecust` | 客户 | `reserveid_reservecust` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 24 | `lineClose` | 行关闭 | `line_close` | Short |
| 25 | `collaborationSource` | 协同源头单据类型 | `collaboration_source` | String |
| 26 | `collaborationPolineno` | 协同源头单据行号 | `collaboration_polineno` | Decimal |
| 27 | `collaborationPocode` | 协同源头单据号 | `collaboration_pocode` | String |
| 28 | `collaborationPoid` | 协同源头单据主表id | `collaboration_poid` | Long |
| 29 | `collaborationPodetailid` | 协同源头单据行 | `collaboration_podetailid` | Long |
| 30 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 31 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 32 | `cfmIncomingQty` | 确认累计入库数量 | `cfm_incoming_qty` | Decimal |
| 33 | `cfmIncomingAuxQty` | 确认累计入库件数 | `cfm_incoming_auxqty` | Decimal |
| 34 | `cfmScrapStockQty` | 确认报废入库数量 | `cfm_scrapstock_qty` | Decimal |
| 35 | `cfmScrapStockAuxQty` | 确认报废入库件数 | `cfm_scrapstock_auxqty` | Decimal |
| 36 | `printCount` | 打印次数 | `printCount` | Integer |
| 37 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 38 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 39 | `srcBomVendorId` | 来源bom委外商 | `src_bom_vendor_id` | Long |
| 40 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 41 | `dailyschQuantity` | 排产数量 | `dailysch_quantity` | Decimal |
| 42 | `enableSfcMaterial` | 车间领料 | `enable_sfc_material` | Short |
| 43 | `dailyschConquantity` | 排产确认数量 | `dailysch_conquantity` | Decimal |
| 44 | `entrustCustomer` | 受托客户 | `entrust_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 45 | `retMaterialApplyFlag` | 退料申请标识 | `ret_material_apply_flag` | Short |
| 46 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 47 | `dailyschStatus` | 排产状态 | `dailysch_status` | Short |
| 48 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 49 | `define15` | 自定义项15 | `define15` | String |
| 50 | `define16` | 自定义项16 | `define16` | String |
| 51 | `define17` | 自定义项17 | `define17` | String |
| 52 | `define18` | 自定义项18 | `define18` | String |
| 53 | `define19` | 自定义项19 | `define19` | String |
| 54 | `define2` | 自定义项2 | `define2` | String |
| 55 | `define20` | 自定义项20 | `define20` | String |
| 56 | `define21` | 自定义项21 | `define21` | String |
| 57 | `define22` | 自定义项22 | `define22` | String |
| 58 | `define23` | 自定义项23 | `define23` | String |
| 59 | `define24` | 自定义项24 | `define24` | String |
| 60 | `define25` | 自定义项25 | `define25` | String |
| 61 | `define26` | 自定义项26 | `define26` | String |
| 62 | `define27` | 自定义项27 | `define27` | String |
| 63 | `define28` | 自定义项28 | `define28` | String |
| 64 | `define29` | 自定义项29 | `define29` | String |
| 65 | `define3` | 自定义项3 | `define3` | String |
| 66 | `define30` | 自定义项30 | `define30` | String |
| 67 | `define4` | 自定义项4 | `define4` | String |
| 68 | `define5` | 自定义项5 | `define5` | String |
| 69 | `define6` | 自定义项6 | `define6` | String |
| 70 | `define7` | 自定义项7 | `define7` | String |
| 71 | `define8` | 自定义项8 | `define8` | String |
| 72 | `define9` | 自定义项9 | `define9` | String |
| 73 | `incomingAuxiliaryQuantity` | 累计入库件数 | `incoming_auxiliary_quantity` | Decimal |
| 74 | `incomingQuantity` | 累计入库数量 | `incoming_quantity` | Decimal |
| 75 | `isPushProcedurePlan` | 已转工序计划 | `is_push_procedure_plan` | Boolean |
| 76 | `isWholeScrap` | 整单报废 | `is_whole_scrap` | Boolean |
| 77 | `planOrderType` | 计划订单类型 | `plan_order_type` | Short |
| 78 | `pubts` | 时间戳 | `pubts` | DateTime |
| 79 | `qualifiedAuxiliaryQuantity` | 合格件数 | `qualified_auxiliary_quantity` | Decimal |
| 80 | `qualifiedQuantity` | 合格数量 | `qualified_quantity` | Decimal |
| 81 | `realFinishDate` | 实际完工日期 | `real_finish_date` | Date |
| 82 | `realFinishStatus` | 行完工 | `real_finish_status` | Boolean |
| 83 | `realFinishTime` | 实际完工时间 | `real_finish_time` | DateTime |
| 84 | `realFinishUser` | 完工人 | `real_finish_user` | String |
| 85 | `realFinishUserId` | 完工人ID | `real_finish_userId` | Long |
| 86 | `returnAuxiliaryQuantity` | 返工件数 | `return_auxiliary_quantity` | Decimal |
| 87 | `returnQuantity` | 返工数量 | `return_quantity` | Decimal |
| 88 | `scrapAuxiliaryQuantity` | 报废件数 | `scrap_auxiliary_quantity` | Decimal |
| 89 | `scrapQuantity` | 报废数量 | `scrap_quantity` | Decimal |
| 90 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 91 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 92 | `batchNoId` | 批次号ID | `batch_no_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 93 | `productDefineDts` | 自定义项特征组 | `define_cts` | 2707d8d2-04df-4810-9cdc-8ec420b73bb7 |
| 94 | `automaticMaterialPreparation` | 自动展开备料 | `automatic_material_preparation` | Boolean |
| 95 | `stockSensClue` | 现存量特征敏感线索 | `stockSensClue` | String |
| 96 | `bomSensitiveUID` | BOM敏感域唯一性ID | `bom_sensitive_uid` | String |
| 97 | `originalOrderId` | 原单表头ID | `original_order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 98 | `costCenterId` | 成本中心 | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 99 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 0f213a8c-d121-480b-b029-cd86a61a4278 |
| 100 | `linecloseRemark` | 关闭说明 | `lineclose_remark` | String |
| 101 | `materialApplyStatus` | 领料申请状态 | `material_apply_status` | Short |
| 102 | `materialStatus` | 领料状态 | `material_status` | Short |
| 103 | `orgId` | 库存组织id | `org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 104 | `scrapProcessAuxiliaryQuantity` | 报废已处理件数 | `scrap_process_auxiliary_quantity` | Decimal |
| 105 | `virtualAccbodyId` | 利润中心 | `virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 106 | `bomQuantity` | BOM单位数量 | `bom_quantity` | Decimal |
| 107 | `bomUnitChangeRate` | BOM单位换算率 | `bom_unit_change_rate` | Decimal |
| 108 | `bomUnitId` | BOM单位 | `bom_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 109 | `enableSFCPlan` | 启用车间计划 | `enable_sfc_plan` | Boolean |
| 110 | `procPlanCreateOpty` | 工序作业计划创建时机 | `proc_plan_create_opty` | String |
| 111 | `processMode` | 加工组织模式 | `process_mode` | String |
| 112 | `scrapProcessQuantity` | 报废已处理数量 | `scrap_process_quantity` | Decimal |
| 113 | `id` | 变更单产品ID | `id` | Long |
| 114 | `orderId` | 变更单表头id | `order_id` | e0df1fb7-d2e6-48c0-81ff-a63755cac604 |
| 115 | `originalOrderProductId` | 原单产品ID | `original_order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 116 | `materialId` | 制造物料id | `material_id` | Long |
| 117 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 118 | `skuId` | skuId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 119 | `productionUnitId` | 生产单位ID | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 120 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 121 | `remark` | 备注 | `remark` | String |
| 122 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 123 | `quantity` | 生产数量 | `quantity` | Decimal |
| 124 | `mrpQuantity` | 净算量 | `mrp_quantity` | Decimal |
| 125 | `auxiliaryQuantity` | 生产件数 | `auxiliary_quantity` | Decimal |
| 126 | `startDate` | 开工日期 | `start_date` | DateTime |
| 127 | `finishDate` | 完工日期 | `finish_date` | DateTime |
| 128 | `bomSelect` | BOM选择 | `bom_select` | String |
| 129 | `bomId` | bomId | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 130 | `scrap` | 废品率% | `scrap` | Decimal |
| 131 | `warehouseId` | 预入仓库id | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 132 | `projectId` | 项目Id | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 133 | `trackNumber` | 跟踪号 | `track_number` | String |
| 134 | `firstsource` | 源头单据类型 | `first_source` | String |
| 135 | `firstupcode` | 源头单据号 | `first_upcode` | String |
| 136 | `firstsourceautoid` | 源头单据子表id | `first_source_autoid` | Long |
| 137 | `currentStockQuantity` | 现存量 | `current_stock_quantity` | Decimal |
| 138 | `sourceType` | 来源单据类型 | `source_type` | String |
| 139 | `availableQty` | 可用量 | `available_qty` | Decimal |
| 140 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 141 | `source` | 来源单据类型(推拉单) | `source` | String |
| 142 | `currentSubQty` | 现存件数 | `current_sub_qty` | Decimal |
| 143 | `sourceid` | 来源单据主表id | `sourceid` | Long |
| 144 | `availableSubQty` | 可用件数 | `available_sub_qty` | Decimal |
| 145 | `upcode` | 来源单据号 | `upcode` | String |
| 146 | `sourceautoid` | 来源单据子表id | `sourceautoid` | Long |
| 147 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 148 | `salesOrderId` | 销售订单id | `sales_order_id` | c7c0beb4-f830-486d-83e1-51072b319fd2 |
| 149 | `storeUpDate` | 最近入库日期 | `storeup_date` | Date |
| 150 | `linecloser` | 行关闭人 | `linecloser` | String |
| 151 | `linecloseTime` | 行关闭时间 | `lineclose_time` | DateTime |
| 152 | `linecloseDate` | 行关闭日期 | `lineclose_date` | Date |
| 153 | `completedFlag` | 完工报告 | `completed_flag` | Boolean |
| 154 | `materialApplyFlag` | 领料申请 | `material_apply_flag` | Boolean |
| 155 | `free1` | 颜色测试 | `free1` | String |
| 156 | `free2` | 测试31 | `free2` | String |
| 157 | `free3` | 定量测试 | `free3` | String |
| 158 | `free4` | 香雪产地 | `free4` | String |
| 159 | `free5` | 组织 | `free5` | String |
| 160 | `free6` | 物料规格6 | `free6` | String |
| 161 | `free7` | 物料规格7 | `free7` | String |
| 162 | `free8` | 物料规格8 | `free8` | String |
| 163 | `free9` | 物料规格9 | `free9` | String |
| 164 | `free10` | 物料规格10 | `free10` | String |
| 165 | `startQuantity` | 开工数量 | `start_quantity` | Decimal |
| 166 | `isHold` | 挂起状态 | `is_hold` | Boolean |
| 167 | `linecloseReasonId` | 行关闭原因ID | `lineclose_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 168 | `bomUseType` | 用途 | `bom_use_type` | b4c8abe8-998a-421e-b12a-bf6b14121b4d |
| 169 | `lineNo` | 行号 | `line_no` | Decimal |
| 170 | `batchNo` | 批次号 | `batch_no` | String |
| 171 | `produceDate` | 生产日期 | `produce_date` | Date |
| 172 | `expirationDate` | 有效期至 | `expiration_date` | Date |
| 173 | `reserveid` | 预留对象ID | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 174 | `routingId` | 工艺路线ID | `routing_id` | 37955d3b-2143-4a4d-bdd5-0213a13394f5 |
| 175 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 176 | `startAuxiliaryQuantity` | 已开工件数 | `start_auxiliary_quantity` | Decimal |
| 177 | `financeCloseTime` | 财务关闭时间 | `finance_close_time` | DateTime |
| 178 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 179 | `financeStatus` | 财务关闭 | `finance_status` | Short |
| 180 | `finishedWorkApplyStatus` | 完工申报状态 | `finished_work_apply_status` | Short |
| 181 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 182 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 183 | `rowno` | 行号 | `rowno` | Integer |
| 184 | `mainFormulaId` | 配方 | `mainformula_id` | fa7b101c-5065-4f13-88d2-e6742dadb164 |
| 185 | `orderActivityChange` | 订单资源变更表 | `` | 7f81897d-6611-4659-80f7-23e6a16e1e65 |
| 186 | `orderByProductChange` | 订单联副变更表 | `` | 236649bc-8ef7-4f6f-b4ce-91c94361b699 |
| 187 | `orderMaterialChange` | 订单材料变更表 | `` | c7f77b78-a15f-46c8-93f6-37e561e44844 |
| 188 | `orderOpSequenceChange` | 工序序列变更表 | `` | edba6d4e-befe-41a6-97c7-a890f1ecc5fc |
| 189 | `orderProcessChange` | 订单工序变更表 | `` | 78b6bc65-ade6-4025-86dc-5f8573ef518d |
| 190 | `orderProductChangeAttrextItem` | 产品表自由自定义项 | `` | 740ae960-66c2-48c5-b202-cce6a0964bb2 |
| 191 | `orderProductExpinfo` | 生产订单变更产品扩展信息 | `` | 9f017b5f-7ce0-4ef9-8f0d-bc144df5c80d |
| 192 | `orderProductUserdefItem` | 产品表固定自定义项 | `` | f4685b13-7e65-4b9d-91fe-86d736366077 |
| 193 | `orderSnChange` | 生产订单变更序列号 | `` | e560e5a4-f03e-457f-a13f-a012aab2a049 |

---

## 关联属性（38个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `salesOrderId` | 销售订单id | `voucher.order.Order` | Service |  |
| 2 | `orderByProductChange` | 订单联副变更表 | `po.orderchange.OrderByProductChange` | None | true |
| 3 | `routingId` | 工艺路线ID | `ed.routing.Routing` | Service |  |
| 4 | `reserveid` | 预留对象ID | `st.reservation.Reservation` | Service |  |
| 5 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 6 | `orderId` | 变更单表头id | `po.orderchange.OrderChange` | None | true |
| 7 | `orderSnChange` | 生产订单变更序列号 | `po.orderchange.OrderSnChange` | None | true |
| 8 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 9 | `productDefineDts` | 自定义项特征组 | `po.orderchange.ProductChangeDefineCharacteristics` | None |  |
| 10 | `bomUseType` | 用途 | `ed.usetype.UseType` | Service |  |
| 11 | `orgId` | 库存组织id | `org.func.InventoryOrg` | Service |  |
| 12 | `mainFormulaId` | 配方 | `ed.mainformula.MainFormula` | Service |  |
| 13 | `originalOrderId` | 原单表头ID | `po.order.Order` | None |  |
| 14 | `entrustCustomer` | 受托客户 | `aa.merchant.Merchant` | Service |  |
| 15 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 16 | `orderMaterialChange` | 订单材料变更表 | `po.orderchange.OrderMaterialChange` | None | true |
| 17 | `skuId` | skuId | `pc.product.ProductSKU` | Service |  |
| 18 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 19 | `bomId` | bomId | `ed.bom.Bom` | Service |  |
| 20 | `originalOrderProductId` | 原单产品ID | `po.order.OrderProduct` | None |  |
| 21 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 22 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 23 | `virtualAccbodyId` | 利润中心 | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 24 | `orderProductChangeAttrextItem` | 产品表自由自定义项 | `po.orderchange.OrderProductChangeAttrextItem` | None | true |
| 25 | `linecloseReasonId` | 行关闭原因ID | `aa.reason.Reason` | Service |  |
| 26 | `productionUnitId` | 生产单位ID | `pc.unit.Unit` | Service |  |
| 27 | `orderActivityChange` | 订单资源变更表 | `po.orderchange.OrderActivityChange` | None | true |
| 28 | `batchNoId` | 批次号ID | `st.batchno.Batchno` | Service |  |
| 29 | `orderProcessChange` | 订单工序变更表 | `po.orderchange.OrderProcessChange` | None | true |
| 30 | `freeCharacteristics` | 自由项特征组 | `po.orderchange.ProductFreeCharacteristics` | None |  |
| 31 | `warehouseId` | 预入仓库id | `aa.warehouse.Warehouse` | Service |  |
| 32 | `orderProductUserdefItem` | 产品表固定自定义项 | `po.orderchange.OrderProductChangeDefine` | None | true |
| 33 | `orderOpSequenceChange` | 工序序列变更表 | `po.orderchange.OrderOpSequenceChange` | None | true |
| 34 | `bomUnitId` | BOM单位 | `pc.unit.Unit` | Service |  |
| 35 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 36 | `projectId` | 项目Id | `bd.project.ProjectVO` | Service |  |
| 37 | `orderProductExpinfo` | 生产订单变更产品扩展信息 | `po.orderchange.OrderProductChangeExpinfo` | None | true |
| 38 | `reserveid_reservecust` | 客户 | `aa.merchant.Merchant` | Service |  |
