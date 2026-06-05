---
tags: ["BIP", "元数据", "数据字典", "PO", "po.order.OrderProduct"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 生产订单产品 (`po.order.OrderProduct`)

> PO | 物理表：`po_order_product`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 生产订单产品 |
| 物理表 | `po_order_product` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:23:10.6520` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 行号 |

---

## 直接属性（196个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `firstlineno` | 源头单据行号 | `first_line_no` | Decimal |
| 4 | `sourcelineno` | 来源单据行号 | `source_line_no` | Decimal |
| 5 | `firstsourceid` | 源头单据主表id | `first_source_id` | Long |
| 6 | `mergeOrderFlag` | 订单合并标识 | `merge_order_flag` | Boolean |
| 7 | `offChartReceiptIsAllowed` | 允许表外产出 | `off_chart_receipt_is_allowed` | Boolean |
| 8 | `scrapRepAuxQty` | 报废补单件数 | `scrap_rep_aux_qty` | Decimal |
| 9 | `scrapReplenishQty` | 报废补单数量 | `scrap_replenish_qty` | Decimal |
| 10 | `stockSensClue` | 现存量特征敏感线索 | `stockSensClue` | String |
| 11 | `availableQty` | 可用量 | `available_qty` | Decimal |
| 12 | `availableSubQty` | 可用件数 | `available_sub_qty` | Decimal |
| 13 | `pubts` | pubts | `pubts` | DateTime |
| 14 | `bomSensitiveUID` | BOM敏感域唯一性ID | `bom_sensitive_uid` | String |
| 15 | `costCenterId` | 成本中心 | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 16 | `automaticMaterialPreparation` | 自动展开备料 | `automatic_material_preparation` | Boolean |
| 17 | `currentStockQuantity` | 现存量 | `current_stock_quantity` | Decimal |
| 18 | `currentSubQty` | 现存件数 | `current_sub_qty` | Decimal |
| 19 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 20 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 21 | `ulRate` | 上限比例 | `ul_rate` | Decimal |
| 22 | `bizOrderProductId` | 业务订单行Id | `biz_order_product_id` | Long |
| 23 | `bizOrderId` | 业务订单Id | `biz_order_id` | Long |
| 24 | `reserveid_reservecust` | 客户 | `reserveid_reservecust` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 25 | `lineClose` | 行关闭 | `line_close` | Short |
| 26 | `collaborationSource` | 协同源头单据类型 | `collaboration_source` | String |
| 27 | `collaborationPolineno` | 协同源头单据行号 | `collaboration_polineno` | Decimal |
| 28 | `collaborationPocode` | 协同源头单据号 | `collaboration_pocode` | String |
| 29 | `collaborationPoid` | 协同源头单据主表id | `collaboration_poid` | Long |
| 30 | `collaborationPodetailid` | 协同源头单据行 | `collaboration_podetailid` | Long |
| 31 | `scrapNoStockQty` | 报废不入库数量 | `scrap_no_stock_qty` | Decimal |
| 32 | `scrapNoStockAuxQty` | 报废不入库件数 | `scrap_no_stock_aux_qty` | Decimal |
| 33 | `cfmIncomingQty` | 确认累计入库数量 | `cfm_incoming_qty` | Decimal |
| 34 | `cfmIncomingAuxQty` | 确认累计入库件数 | `cfm_incoming_auxqty` | Decimal |
| 35 | `cfmScrapStockQty` | 确认报废入库数量 | `cfm_scrapstock_qty` | Decimal |
| 36 | `cfmScrapStockAuxQty` | 确认报废入库件数 | `cfm_scrapstock_auxqty` | Decimal |
| 37 | `printCount` | 打印次数 | `printCount` | Integer |
| 38 | `syncStatus` | 同步标识 | `sync_status` | Short |
| 39 | `sourceGrandchildrenId` | 上游单据孙表id | `source_grandchildrenId` | Long |
| 40 | `srcBomVendorId` | 来源bom委外商 | `src_bom_vendor_id` | Long |
| 41 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 42 | `dailyschQuantity` | 排产数量 | `dailysch_quantity` | Decimal |
| 43 | `enableSfcMaterial` | 车间领料 | `enable_sfc_material` | Short |
| 44 | `dailyschConquantity` | 排产确认数量 | `dailysch_conquantity` | Decimal |
| 45 | `entrustCustomer` | 受托客户 | `entrust_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 46 | `retMaterialApplyFlag` | 退料申请标识 | `ret_material_apply_flag` | Short |
| 47 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 48 | `dailyschStatus` | 排产状态 | `dailysch_status` | Short |
| 49 | `freeCharacteristics` | 自由项特征组 | `free_cts` | a69e9a50-bde6-4402-9b4a-2cbe66a69974 |
| 50 | `lineNo` | 行号 | `line_no` | Decimal |
| 51 | `materialApplyStatus` | 领料申请状态 | `material_apply_status` | Short |
| 52 | `materialStatus` | 领料状态 | `material_status` | Short |
| 53 | `productDefineDts` | 自定义项特征组 | `define_cts` | af36ba15-a610-458f-8443-27bc95538f93 |
| 54 | `virtualAccbodyId` | 利润中心 | `virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 55 | `batchNoId` | 批次号ID | `batch_no_id` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 56 | `remark` | 备注 | `remark` | String |
| 57 | `id` | ID | `id` | Long |
| 58 | `orderId` | 单据id | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 59 | `materialId` | 制造物料id | `material_id` | Long |
| 60 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 61 | `skuId` | skuId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 62 | `linecloseRemark` | 关闭说明 | `lineclose_remark` | String |
| 63 | `productionUnitId` | 生产单位ID | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 64 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 65 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 66 | `quantity` | 生产数量 | `quantity` | Decimal |
| 67 | `mrpQuantity` | 净算量 | `mrp_quantity` | Decimal |
| 68 | `auxiliaryQuantity` | 生产件数 | `auxiliary_quantity` | Decimal |
| 69 | `bomUnitId` | BOM单位ID | `bom_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 70 | `startDate` | 开工日期 | `start_date` | DateTime |
| 71 | `finishDate` | 完工日期 | `finish_date` | DateTime |
| 72 | `bomSelect` | BOM选择 | `bom_select` | String |
| 73 | `bomId` | bomId | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 74 | `scrap` | 废品率% | `scrap` | Decimal |
| 75 | `warehouseId` | 预入仓库id | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 76 | `bomUnitChangeRate` | BOM单位换算率 | `bom_unit_change_rate` | Decimal |
| 77 | `projectId` | 项目Id | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 78 | `bomQuantity` | 生产数量(bom单位) | `bom_quantity` | Decimal |
| 79 | `trackNumber` | 跟踪号 | `track_number` | String |
| 80 | `incomingQuantity` | 累计入库数量 | `incoming_quantity` | Decimal |
| 81 | `incomingAuxiliaryQuantity` | 累计入库件数 | `incoming_auxiliary_quantity` | Decimal |
| 82 | `firstsource` | 源头单据类型 | `first_source` | String |
| 83 | `firstupcode` | 源头单据号 | `first_upcode` | String |
| 84 | `firstsourceautoid` | 源头单据子表id | `first_source_autoid` | Long |
| 85 | `sourceType` | 来源单据类型 | `source_type` | String |
| 86 | `source` | 来源单据类型(推拉单) | `source` | String |
| 87 | `sourceid` | 来源单据主表id | `sourceid` | Long |
| 88 | `upcode` | 来源单据号 | `upcode` | String |
| 89 | `sourceautoid` | 来源单据子表id | `sourceautoid` | Long |
| 90 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 91 | `salesOrderId` | 销售订单id | `sales_order_id` | c7c0beb4-f830-486d-83e1-51072b319fd2 |
| 92 | `finishedWorkApplyStatus` | 完工申报状态 | `finished_work_apply_status` | Short |
| 93 | `storeUpDate` | 最近入库日期 | `storeup_date` | Date |
| 94 | `linecloser` | 行关闭人 | `linecloser` | String |
| 95 | `linecloseTime` | 行关闭时间 | `lineclose_time` | DateTime |
| 96 | `linecloseDate` | 行关闭日期 | `lineclose_date` | Date |
| 97 | `enableSFCPlan` | 启用车间计划 | `enable_sfc_plan` | Boolean |
| 98 | `procPlanCreateOpty` | 工序作业计划创建时机 | `proc_plan_create_opty` | String |
| 99 | `processMode` | 加工组织模式 | `process_mode` | String |
| 100 | `free1` | 颜色测试 | `free1` | String |
| 101 | `free2` | 测试31 | `free2` | String |
| 102 | `free3` | 定量测试 | `free3` | String |
| 103 | `free4` | 香雪产地 | `free4` | String |
| 104 | `free5` | 组织 | `free5` | String |
| 105 | `free6` | 物料规格6 | `free6` | String |
| 106 | `free7` | 物料规格7 | `free7` | String |
| 107 | `free8` | 物料规格8 | `free8` | String |
| 108 | `free9` | 物料规格9 | `free9` | String |
| 109 | `free10` | 物料规格10 | `free10` | String |
| 110 | `scrapProcessQuantity` | 报废已处理数量 | `scrap_process_quantity` | Decimal |
| 111 | `scrapProcessAuxiliaryQuantity` | 报废已处理件数 | `scrap_process_auxiliary_quantity` | Decimal |
| 112 | `completedQuantity` | 已完工数量 | `completed_quantity` | Decimal |
| 113 | `completedAuxiliaryQuantity` | 已完工件数 | `completed_auxiliary_quantity` | Decimal |
| 114 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 115 | `qualifiedQuantity` | 合格数量 | `qualified_quantity` | Decimal |
| 116 | `qualifiedAuxiliaryQuantity` | 合格件数 | `qualified_auxiliary_quantity` | Decimal |
| 117 | `scrapQuantity` | 报废数量 | `scrap_quantity` | Decimal |
| 118 | `scrapAuxiliaryQuantity` | 报废件数 | `scrap_auxiliary_quantity` | Decimal |
| 119 | `returnQuantity` | 返工数量 | `return_quantity` | Decimal |
| 120 | `returnAuxiliaryQuantity` | 返工件数 | `return_auxiliary_quantity` | Decimal |
| 121 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 122 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 123 | `completedFlag` | 完工报告 | `completed_flag` | Boolean |
| 124 | `materialApplyFlag` | 领料申请 | `material_apply_flag` | Boolean |
| 125 | `financeStatus` | 财务关闭 | `finance_status` | Short |
| 126 | `financeCloseTime` | 财务关闭时间 | `finance_close_time` | DateTime |
| 127 | `startQuantity` | 开工数量 | `start_quantity` | Decimal |
| 128 | `isHold` | 挂起状态 | `is_hold` | Boolean |
| 129 | `orgId` | 库存组织id | `org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 130 | `linecloseReasonId` | 行关闭原因ID | `lineclose_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 131 | `bomUseType` | 用途 | `bom_use_type` | b4c8abe8-998a-421e-b12a-bf6b14121b4d |
| 132 | `batchNo` | 批次号 | `batch_no` | String |
| 133 | `produceDate` | 生产日期 | `produce_date` | Date |
| 134 | `expirationDate` | 有效期至 | `expiration_date` | Date |
| 135 | `reserveid` | 预留对象ID | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 136 | `routingId` | 工艺路线ID | `routing_id` | 37955d3b-2143-4a4d-bdd5-0213a13394f5 |
| 137 | `isPushProcedurePlan` | 已转工序计划 | `is_push_procedure_plan` | Boolean |
| 138 | `realFinishStatus` | 行完工 | `real_finish_status` | Boolean |
| 139 | `realFinishUser` | 完工人 | `real_finish_user` | String |
| 140 | `realFinishUserId` | 完工人ID | `real_finish_userId` | Long |
| 141 | `realFinishDate` | 实际完工日期 | `real_finish_date` | Date |
| 142 | `realFinishTime` | 实际完工时间 | `real_finish_time` | DateTime |
| 143 | `isWholeScrap` | 整单报废 | `is_whole_scrap` | Boolean |
| 144 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 145 | `startAuxiliaryQuantity` | 已开工件数 | `start_auxiliary_quantity` | Decimal |
| 146 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 147 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 148 | `rowno` | 行号 | `rowno` | Integer |
| 149 | `completedIncomingQuantity` | 已完工入库数量 | `completed_incoming_quantity` | Decimal |
| 150 | `define1` | 批次属性1 | `define1` | String |
| 151 | `define2` | 批次属性2 | `define2` | String |
| 152 | `define3` | 批次属性3 | `define3` | String |
| 153 | `define4` | 批次属性4 | `define4` | String |
| 154 | `define5` | 批次属性5 | `define5` | String |
| 155 | `define6` | 批次属性6 | `define6` | String |
| 156 | `define7` | 批次属性7 | `define7` | String |
| 157 | `define8` | 批次属性8 | `define8` | String |
| 158 | `define9` | 批次属性9 | `define9` | String |
| 159 | `define10` | 批次属性10 | `define10` | String |
| 160 | `define11` | 批次属性11 | `define11` | String |
| 161 | `define12` | 批次属性12 | `define12` | String |
| 162 | `define13` | 批次属性13 | `define13` | String |
| 163 | `define14` | 批次属性14 | `define14` | String |
| 164 | `define15` | 批次属性15 | `define15` | String |
| 165 | `define16` | 批次属性16 | `define16` | String |
| 166 | `define17` | 批次属性17 | `define17` | String |
| 167 | `define18` | 批次属性18 | `define18` | String |
| 168 | `define19` | 批次属性19 | `define19` | String |
| 169 | `define20` | 批次属性20 | `define20` | String |
| 170 | `define21` | 批次属性21 | `define21` | String |
| 171 | `define22` | 批次属性22 | `define22` | String |
| 172 | `define23` | 批次属性23 | `define23` | String |
| 173 | `define24` | 批次属性24 | `define24` | String |
| 174 | `define25` | 批次属性25 | `define25` | String |
| 175 | `define26` | 批次属性26 | `define26` | String |
| 176 | `define27` | 批次属性27 | `define27` | String |
| 177 | `define28` | 批次属性28 | `define28` | String |
| 178 | `define29` | 批次属性29 | `define29` | String |
| 179 | `define30` | 批次属性30 | `define30` | String |
| 180 | `planOrderType` | 计划订单类型 | `plan_order_type` | Short |
| 181 | `mainFormulaId` | 配方 | `mainformula_id` | fa7b101c-5065-4f13-88d2-e6742dadb164 |
| 182 | `orderActivity` | 资源 | `` | 95fe7f6b-b857-4ce8-8d7f-8f57160c967b |
| 183 | `orderByProduct` | 生产订单联副产品 | `` | 4b08ee17-121c-4d32-9d32-e896d0d3a395 |
| 184 | `orderMaterial` | 生产订单材料 | `` | 1b1bb4a9-8a2a-44af-9c61-f22d398ec0b7 |
| 185 | `orderOpSequence` | 工序序列 | `` | c89032db-c707-4a7d-84ef-bdd29d142856 |
| 186 | `orderProcess` | 工序 | `` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 187 | `orderProductAttrextItem` | 产品表自由自定义项 | `` | da728803-0108-4773-a150-7fa1c52c2db9 |
| 188 | `orderProductExpinfo` | 生产订单产品扩展信息 | `` | f8ffffab-9883-405b-9484-cbade5f06fe5 |
| 189 | `orderProductHoldinfo` | 生产订单产品挂起信息 | `` | fac26a3c-21a9-4e12-87eb-dadcdce9dcaf |
| 190 | `orderProductSrcinfo` | 生产订单产品来源信息 | `` | 7b95604f-0936-4926-8c90-c8503611a920 |
| 191 | `orderProductStartinfo` | 生产订单开工记录表 | `` | c8e6c836-fe4c-4125-8475-32162658d0a1 |
| 192 | `orderProductUserdefItem` | 产品表固定自定义项 | `` | 442156bf-b544-4b41-964a-ce47fc331994 |
| 193 | `orderSn` | 生产订单序列号 | `` | abfd4107-fdab-43aa-9a5d-15678d6e60e8 |
| 194 | `orderSubcontractProduct` | 委外产品信息 | `` | 60173f24-36ed-4f78-80ee-1f96492c7065 |
| 195 | `orderSubcontractProductConsult` | 委外产品协同信息 | `` | 095522af-b597-4311-a113-8a0cf55f3dfe |
| 196 | `orderSubcontractProductExt` | 委外产品扩展信息 | `` | 47609e4d-5bb6-4d1c-b362-ef1ce5d4ef72 |

---

## 关联属性（42个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `salesOrderId` | 销售订单id | `voucher.order.Order` | Service |  |
| 2 | `orderSubcontractProductExt` | 委外产品扩展信息 | `po.order.SubcontractProductExt` | None | true |
| 3 | `orderProductAttrextItem` | 产品表自由自定义项 | `po.order.OrderProductAttrextItem` | None | true |
| 4 | `routingId` | 工艺路线ID | `ed.routing.Routing` | Service |  |
| 5 | `reserveid` | 预留对象ID | `st.reservation.Reservation` | Service |  |
| 6 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 7 | `orderId` | 单据id | `po.order.Order` | None | true |
| 8 | `orderSn` | 生产订单序列号 | `po.order.OrderSn` | None | true |
| 9 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 10 | `productDefineDts` | 自定义项特征组 | `po.order.ProductDefineCharacteristics` | None |  |
| 11 | `orderProductSrcinfo` | 生产订单产品来源信息 | `po.order.OrderProductSrcinfo` | None | true |
| 12 | `orderProductStartinfo` | 生产订单开工记录表 | `po.order.OrderProductStartinfo` | None | true |
| 13 | `bomUseType` | 用途 | `ed.usetype.UseType` | Service |  |
| 14 | `orgId` | 库存组织id | `org.func.InventoryOrg` | Service |  |
| 15 | `mainFormulaId` | 配方 | `ed.mainformula.MainFormula` | Service |  |
| 16 | `orderProductHoldinfo` | 生产订单产品挂起信息 | `po.order.OrderProductHoldinfo` | None | true |
| 17 | `entrustCustomer` | 受托客户 | `aa.merchant.Merchant` | Service |  |
| 18 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | Service |  |
| 19 | `orderProcess` | 工序 | `po.order.OrderProcess` | None | true |
| 20 | `orderOpSequence` | 工序序列 | `po.order.OrderOpSequence` | None | true |
| 21 | `orderByProduct` | 生产订单联副产品 | `po.order.OrderByProduct` | None | true |
| 22 | `skuId` | skuId | `pc.product.ProductSKU` | Service |  |
| 23 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 24 | `bomId` | bomId | `ed.bom.Bom` | Service |  |
| 25 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 26 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 27 | `orderSubcontractProduct` | 委外产品信息 | `po.order.SubcontractProduct` | None | true |
| 28 | `virtualAccbodyId` | 利润中心 | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 29 | `orderActivity` | 资源 | `po.order.OrderActivity` | None | true |
| 30 | `linecloseReasonId` | 行关闭原因ID | `aa.reason.Reason` | Service |  |
| 31 | `productionUnitId` | 生产单位ID | `pc.unit.Unit` | Service |  |
| 32 | `orderSubcontractProductConsult` | 委外产品协同信息 | `po.order.SubcontractProductConsult` | None | true |
| 33 | `batchNoId` | 批次号ID | `st.batchno.Batchno` | Service |  |
| 34 | `freeCharacteristics` | 自由项特征组 | `po.order.ProductFreeCharacteristics` | None |  |
| 35 | `warehouseId` | 预入仓库id | `aa.warehouse.Warehouse` | Service |  |
| 36 | `orderMaterial` | 生产订单材料 | `po.order.OrderMaterial` | None | true |
| 37 | `orderProductUserdefItem` | 产品表固定自定义项 | `po.order.OrderProductUserdefItem` | None | true |
| 38 | `bomUnitId` | BOM单位ID | `pc.unit.Unit` | Service |  |
| 39 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 40 | `projectId` | 项目Id | `bd.project.ProjectVO` | Service |  |
| 41 | `orderProductExpinfo` | 生产订单产品扩展信息 | `po.order.OrderProductExpinfo` | None | true |
| 42 | `reserveid_reservecust` | 客户 | `aa.merchant.Merchant` | Service |  |
