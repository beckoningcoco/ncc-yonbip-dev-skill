---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.arriveorder.OsmArriveOrderProduct"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外到货单表体 (`po.arriveorder.OsmArriveOrderProduct`)

> OSM | 物理表：`po_osm_arrive_order_product`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外到货单表体 |
| 物理表 | `po_osm_arrive_order_product` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:55:58.8500` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（204个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `expireDateNo` | 保质期 | `expire_date_no` | Decimal |
| 2 | `expireDateUnit` | 保质期单位 | `expire_date_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 3 | `firstSourceId` | 源头单据主表id | `first_source_id` | Long |
| 4 | `linecloseDate` | 行关闭日期 | `lineclose_date` | DateTime |
| 5 | `linecloseReasonId` | 关闭原因 | `lineclose_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 6 | `linecloseRemark` | 关闭说明 | `lineclose_remark` | String |
| 7 | `linecloseTime` | 行关闭时间 | `lineclose_time` | DateTime |
| 8 | `linecloser` | 行关闭人 | `linecloser` | String |
| 9 | `originCode` | 来源单据号 | `origin_code` | String |
| 10 | `originId` | 来源单据ID | `origin_id` | Long |
| 11 | `originLineCode` | 来源单据行号 | `origin_line_code` | String |
| 12 | `originLineId` | 来源单据行ID | `origin_line_id` | Long |
| 13 | `paymentagrement` | 付款协议 | `iPaymentagrement` | 3cce8052-512e-4e51-9b6e-57adff40948c |
| 14 | `rtnId` | 回厂单id | `rtn_id` | String |
| 15 | `rtnProductId` | 回厂单产品id | `rtn_product_id` | String |
| 16 | `signDate` | 签收时间 | `sign_date` | Date |
| 17 | `signPerson` | 签收人 | `sign_person` | String |
| 18 | `signRemark` | 签收备注 | `sign_remark` | String |
| 19 | `preSn` | 前序顺序号 | `pre_sn` | Decimal |
| 20 | `nextId` | 后序ID | `next_id` | Long |
| 21 | `processRptPoint` | 工序委外产品报告点 | `process_rpt_point` | Short |
| 22 | `checkStatus` | 检验状态 | `check_status` | OsmCheckStatus |
| 23 | `inspectStatus` | 报检状态 | `inspect_status` | OsmInspectStatus |
| 24 | `isUpdateStock` | 是否更新存量 | `is_update_stock` | Boolean |
| 25 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 26 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 27 | `cooperateDocNo` | 协同单号 | `cooperate_docno` | String |
| 28 | `cooperateDocId` | 协同单id | `cooperate_docid` | Long |
| 29 | `cooperateLineNo` | 协同单行号 | `cooperate_lineno` | String |
| 30 | `cooperateLineId` | 协同单行id | `cooperate_lineid` | Long |
| 31 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 32 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 33 | `sourcePoOrderProductRowno` | 来源生产订单行号 | `source_po_order_product_rowno` | Decimal |
| 34 | `emergepassState` | 紧急放行状态 | `emergepass_state` | Short |
| 35 | `continuousGroup` | 连续委外组号 | `continuous_group` | String |
| 36 | `continuousOsm` | 连续委外 | `continuous_osm` | Boolean |
| 37 | `opSn` | 工序顺序号 | `op_sn` | Decimal |
| 38 | `preId` | 前序ID | `pre_id` | Long |
| 39 | `sourcePoOrderId` | 来源生产订单ID | `source_po_order_id` | Long |
| 40 | `sourceGrandchildrenId` | 上游单据孙表id | `source_grandchildrenId` | Long |
| 41 | `operationId` | 工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 42 | `isContinuousOsmEnd` | 是否连续委外最后一道工序 | `is_continuous_osm_end` | Boolean |
| 43 | `sourceSfcProcPlanId` | 来源工序作业计划行ID | `source_sfc_proc_plan_id` | Long |
| 44 | `hasPaymentPlan` | 是否有随单付款计划 | `has_payment_plan` | Boolean |
| 45 | `nonRecoverableTaxRate` | 不可抵扣税率 | `non_recover_taxrate` | Decimal |
| 46 | `startOpSn` | 开始工序顺序号 | `start_op_sn` | Decimal |
| 47 | `sourcePoOrderProductId` | 来源生产订单行ID | `source_po_order_product_id` | Long |
| 48 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 49 | `nonRecoverableTaxTC` | 不可抵扣税额 | `non_recover_tax_tc` | Decimal |
| 50 | `endOpSn` | 结束工序顺序号 | `end_op_sn` | Decimal |
| 51 | `continuousOsmDealWay` | 连续委外处理方式 | `continuous_osm_deal_way` | Integer |
| 52 | `productionOrgId` | 生产组织 | `production_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 53 | `sourcePoOrderCode` | 来源生产订单号 | `source_po_order_code` | String |
| 54 | `nextSn` | 后序顺序号 | `next_sn` | Decimal |
| 55 | `endOp` | 末序 | `end_op` | Boolean |
| 56 | `sourcePoOrderProcessId` | 来源生产订单工序ID | `source_po_order_process_id` | Long |
| 57 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 58 | `associationOsmOrderProductId` | 关联行 | `association_osm_order_product_id` | Long |
| 59 | `nonRecoverableTaxFC` | 本币不可抵扣税额 | `non_recover_tax_fc` | Decimal |
| 60 | `sourcePoOrderByproductId` | 来源生产订单产出ID | `source_po_order_byproduct_id` | Long |
| 61 | `signState` | 签收状态 | `sign_state` | Short |
| 62 | `taxRate` | 税率 | `taxRate` | Decimal |
| 63 | `stockSensClue` | 现存量特征敏感线索 | `stockSensClue` | String |
| 64 | `costCenterId` | 成本中心ID | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 65 | `demandVirtualAccbodyId` | 需方利润中心ID | `demand_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 66 | `supplyVirtualAccbodyId` | 供方利润中心ID | `supply_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 67 | `defineCharacteristicsPro` | 自定义项特征组 | `define_cts` | cf101fc2-730c-4257-b6a2-1d7de1da31d0 |
| 68 | `deliveryAuxiliaryQuantity` | 计划到货件数 | `delivery_auxiliary_quantity` | Decimal |
| 69 | `deliveryQuantity` | 计划到货数量 | `delivery_quantity` | Decimal |
| 70 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 69b2ddb3-3789-4545-9e6a-4ac69ab753fa |
| 71 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 72 | `iomSource` | 接口表来源类型 | `iom_source` | String |
| 73 | `iomSourceautoid` | 接口表来源子表id | `iom_sourceautoid` | String |
| 74 | `iomSourceid` | 接口表来源id | `iom_sourceid` | String |
| 75 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 76 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 77 | `pubts` | 时间戳 | `pubts` | DateTime |
| 78 | `rowno` | 序号 | `rowno` | Integer |
| 79 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 80 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 81 | `id` | id | `id` | Long |
| 82 | `lineNo` | 行号 | `line_no` | Decimal |
| 83 | `arriveOrderId` | 主表id | `arrive_order_id` | 909977d4-00ec-42e2-b2b2-bba9c6b697dc |
| 84 | `demandOrgId` | 需求组织id | `demand_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 85 | `materialId` | 制造物料id | `material_id` | Long |
| 86 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 87 | `skuId` | SKUId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 88 | `productionType` | 产出类型 | `production_type` | String |
| 89 | `vendorProductCode` | 供应商物料编码 | `vendor_product_code` | String |
| 90 | `vendorProductName` | 供应商物料名称 | `vendor_product_name` | String |
| 91 | `warehouseId` | 仓库id | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 92 | `isPresent` | 赠品 | `is_present` | Boolean |
| 93 | `arriveQuantity` | 到货数量 | `arrive_quantity` | Decimal |
| 94 | `acceptQuantity` | 实收数量 | `accept_quantity` | Decimal |
| 95 | `refuseQuantity` | 拒收数量 | `refuse_quantity` | Decimal |
| 96 | `replenishQuantity` | 拒收需补货数量 | `replenish_quantity` | Decimal |
| 97 | `arriveSubQuantity` | 到货件数 | `arrive_sub_quantity` | Decimal |
| 98 | `acceptSubQuantity` | 实收件数 | `accept_sub_quantity` | Decimal |
| 99 | `refuseSubQuantity` | 拒收件数 | `refuse_sub_quantity` | Decimal |
| 100 | `replenishSubQuantity` | 拒收需补货件数 | `replenish_sub_quantity` | Decimal |
| 101 | `subcontractUnitId` | 委外单位ID | `subcontract_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 102 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 103 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 104 | `arriveQuantityPU` | 计价到货数量 | `arrive_quantity_pu` | Decimal |
| 105 | `acceptQuantityPU` | 计价实收数量 | `accept_quantity_pu` | Decimal |
| 106 | `refuseQuantityPU` | 计价拒收数量 | `refuse_quantity_pu` | Decimal |
| 107 | `replenishQuantityPU` | 计价拒收需补货数量 | `replenish_quantity_pu` | Decimal |
| 108 | `priceUnitId` | 计价单位ID | `price_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 109 | `subcontractToPrice` | 计价换算率 | `subcontract_to_price` | Decimal |
| 110 | `priceChangeType` | 计价换算方式 | `price_change_type` | ChangeType |
| 111 | `batchnoid` | 批号Id | `batchnoid` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 112 | `batchNo` | 批号 | `batch_no` | String |
| 113 | `define1` | 批次属性1 | `define1` | String |
| 114 | `define2` | 批次属性2 | `define2` | String |
| 115 | `define3` | 批次属性3 | `define3` | String |
| 116 | `define4` | 批次属性4 | `define4` | String |
| 117 | `define5` | 批次属性5 | `define5` | String |
| 118 | `define6` | 批次属性6 | `define6` | String |
| 119 | `define7` | 批次属性7 | `define7` | String |
| 120 | `define8` | 批次属性8 | `define8` | String |
| 121 | `define9` | 批次属性9 | `define9` | String |
| 122 | `define10` | 批次属性10 | `define10` | String |
| 123 | `define11` | 批次属性11 | `define11` | String |
| 124 | `define12` | 批次属性12 | `define12` | String |
| 125 | `define13` | 批次属性13 | `define13` | String |
| 126 | `define14` | 批次属性14 | `define14` | String |
| 127 | `define15` | 批次属性15 | `define15` | String |
| 128 | `define16` | 批次属性16 | `define16` | String |
| 129 | `define17` | 批次属性17 | `define17` | String |
| 130 | `define18` | 批次属性18 | `define18` | String |
| 131 | `define19` | 批次属性19 | `define19` | String |
| 132 | `define20` | 批次属性20 | `define20` | String |
| 133 | `define21` | 批次属性21 | `define21` | String |
| 134 | `define22` | 批次属性22 | `define22` | String |
| 135 | `define23` | 批次属性23 | `define23` | String |
| 136 | `define24` | 批次属性24 | `define24` | String |
| 137 | `define25` | 批次属性25 | `define25` | String |
| 138 | `define26` | 批次属性26 | `define26` | String |
| 139 | `define27` | 批次属性27 | `define27` | String |
| 140 | `define28` | 批次属性28 | `define28` | String |
| 141 | `define29` | 批次属性29 | `define29` | String |
| 142 | `define30` | 批次属性30 | `define30` | String |
| 143 | `produceDate` | 生产日期 | `produce_date` | Date |
| 144 | `expirationDate` | 有效期至 | `expiration_date` | Date |
| 145 | `isTaxPrice` | 价格含税 | `is_taxprice` | Boolean |
| 146 | `oriTaxUnitPrice` | 含税单价 | `oriTaxUnitPrice` | Decimal |
| 147 | `oriUnitPrice` | 未税单价 | `oriUnitPrice` | Decimal |
| 148 | `oriMoney` | 未税金额 | `oriMoney` | Decimal |
| 149 | `oriSum` | 含税金额 | `oriSum` | Decimal |
| 150 | `oriTax` | 税额 | `oriTax` | Decimal |
| 151 | `taxRateId` | 税率id | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 152 | `natTaxUnitPrice` | 本币含税单价 | `natTaxUnitPrice` | Decimal |
| 153 | `natUnitPrice` | 本币未税单价 | `natUnitPrice` | Decimal |
| 154 | `natMoney` | 本币未税金额 | `natMoney` | Decimal |
| 155 | `natSum` | 本币含税金额 | `natSum` | Decimal |
| 156 | `natTax` | 本币税额 | `natTax` | Decimal |
| 157 | `warehousingQuantity` | 累计入库数量 | `warehousing_quantity` | Decimal |
| 158 | `auxilaryWarehousingQuantity` | 累计入库件数 | `auxilary_warehousing_quantity` | Decimal |
| 159 | `rcvAutoVerify` | 入库自动核销 | `rcv_auto_verify` | Boolean |
| 160 | `firstSource` | 源头单据类型 | `first_source` | String |
| 161 | `firstUpCode` | 源头单据号 | `first_upcode` | String |
| 162 | `firstLineNo` | 源头单据行号 | `first_line_no` | Decimal |
| 163 | `firstSourceAutoId` | 源头单据子表id | `first_source_autoid` | Long |
| 164 | `sourceType` | 来源单据类型 | `source_type` | String |
| 165 | `source` | 来源单据类型(推拉单) | `source` | String |
| 166 | `sourceid` | 来源单据主表id | `sourceid` | Long |
| 167 | `upcode` | 来源单据号 | `upcode` | String |
| 168 | `sourceautoid` | 来源单据子表id | `sourceautoid` | Long |
| 169 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 170 | `sourceLineNo` | 来源单据行号 | `source_line_no` | Decimal |
| 171 | `deliveryDate` | 计划到货日期 | `delivery_date` | Date |
| 172 | `projectId` | 项目Id | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 173 | `reserveid` | 需求对象Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 174 | `discountTaxType` | 扣税类别 | `discount_tax_type` | DiscountTaxType |
| 175 | `kittingCheck` | 齐套检查 | `kitting_check` | Boolean |
| 176 | `kittingCheckPoint` | 齐套检查点 | `kitting_check_point` | String |
| 177 | `remark` | 备注 | `remark` | String |
| 178 | `free1` | 物料规格1 | `free1` | String |
| 179 | `free2` | 物料规格2 | `free2` | String |
| 180 | `free3` | 物料规格3 | `free3` | String |
| 181 | `free4` | 物料规格4 | `free4` | String |
| 182 | `kittingCheckLimitWay` | 齐套检查限制方式 | `kitting_check_limit_way` | String |
| 183 | `free5` | 物料规格5 | `free5` | String |
| 184 | `inspection` | 检验 | `inspection` | Boolean |
| 185 | `free6` | 物料规格6 | `free6` | String |
| 186 | `inspectionFinish` | 检验完成 | `inspection_finish` | Boolean |
| 187 | `free7` | 物料规格7 | `free7` | String |
| 188 | `stockByInspection` | 根据检验结果入库 | `stock_by_inspection` | Boolean |
| 189 | `checkNum` | 累计请检数量 | `check_num` | Decimal |
| 190 | `free8` | 物料规格8 | `free8` | String |
| 191 | `free9` | 物料规格9 | `free9` | String |
| 192 | `num` | 累计检验数量 | `num` | Decimal |
| 193 | `free10` | 物料规格10 | `free10` | String |
| 194 | `qualifiedQuantity` | 合格数量 | `qualified_quantity` | Decimal |
| 195 | `qualifiedAuxiliaryQuantity` | 合格件数 | `qualified_auxiliary_quantity` | Decimal |
| 196 | `scrapQuantity` | 报废数量 | `scrap_quantity` | Decimal |
| 197 | `scrapAuxiliaryQuantity` | 报废件数 | `scrap_auxiliary_quantity` | Decimal |
| 198 | `returnQuantity` | 返工数量 | `return_quantity` | Decimal |
| 199 | `returnAuxiliaryQuantity` | 返工件数 | `return_auxiliary_quantity` | Decimal |
| 200 | `byProductProcessWay` | 副产品处理方式 | `by_product_process_way` | String |
| 201 | `arriveOrderSn` | 委外到货单序列号 | `` | 51931135-9bfb-421a-9d67-41c2cc949f5e |
| 202 | `orderProductAttrextItem` | 表体自由自定义项 | `` | 15268d2a-a65d-4e74-832a-92319b617c45 |
| 203 | `orderProductUserdefItem` | 表体固定自定义项 | `` | b6302bff-9c9b-46da-8a8e-c8b0fd9c60ed |
| 204 | `osmArriveOrderProductExt` | 委外到货单表体扩展 | `` | 7da970b5-2d7e-4dfe-920b-66bf098d9acb |

---

## 关联属性（31个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplyVirtualAccbodyId` | 供方利润中心ID | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 2 | `orderProductAttrextItem` | 表体自由自定义项 | `po.arriveorder.OsmArriveOrderProductAttrextItem` | None | true |
| 3 | `reserveid` | 需求对象Id | `st.reservation.Reservation` | Service |  |
| 4 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 5 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 6 | `expireDateUnit` | 保质期单位 | `pc.unit.Unit` | Service |  |
| 7 | `defineCharacteristicsPro` | 自定义项特征组 | `po.arriveorder.ProductDefineCharacteristics` | None |  |
| 8 | `costCenterId` | 成本中心ID | `bd.costcenter.CostCenter` | Service |  |
| 9 | `operationId` | 工序ID | `ed.operation.Operation` | Service |  |
| 10 | `taxRateId` | 税率id | `archive.taxArchives.TaxRateArchive` | Service |  |
| 11 | `paymentagrement` | 付款协议 | `bd.payments.PayAgreement` | Service |  |
| 12 | `skuId` | SKUId | `pc.product.ProductSKU` | Service |  |
| 13 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 14 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 15 | `priceUnitId` | 计价单位ID | `pc.unit.Unit` | Service |  |
| 16 | `batchnoid` | 批号Id | `st.batchno.Batchno` | Service |  |
| 17 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 18 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 19 | `subcontractUnitId` | 委外单位ID | `pc.unit.Unit` | Service |  |
| 20 | `arriveOrderId` | 主表id | `po.arriveorder.OsmArriveOrder` | None | true |
| 21 | `linecloseReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 22 | `arriveOrderSn` | 委外到货单序列号 | `po.arriveorder.OsmArriveOrderSn` | None | true |
| 23 | `demandVirtualAccbodyId` | 需方利润中心ID | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 24 | `demandOrgId` | 需求组织id | `org.func.BaseOrg` | Service |  |
| 25 | `freeCharacteristics` | 自由项特征组 | `po.arriveorder.FreeCharacteristics` | None |  |
| 26 | `warehouseId` | 仓库id | `aa.warehouse.Warehouse` | Service |  |
| 27 | `orderProductUserdefItem` | 表体固定自定义项 | `po.arriveorder.OsmArriveOrderProductUserdefItem` | None | true |
| 28 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 29 | `projectId` | 项目Id | `bd.project.ProjectVO` | Service |  |
| 30 | `productionOrgId` | 生产组织 | `org.func.BaseOrg` | Service |  |
| 31 | `osmArriveOrderProductExt` | 委外到货单表体扩展 | `po.arriveorder.OsmArriveOrderProductExt` | None | true |
