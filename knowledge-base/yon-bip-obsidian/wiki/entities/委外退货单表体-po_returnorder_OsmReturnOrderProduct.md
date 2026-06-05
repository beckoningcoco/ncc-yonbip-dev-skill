---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.returnorder.OsmReturnOrderProduct"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外退货单表体 (`po.returnorder.OsmReturnOrderProduct`)

> OSM | 物理表：`po_osm_arrive_order_product`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外退货单表体 |
| 物理表 | `po_osm_arrive_order_product` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:56:06.2060` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（204个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `acceptQuantity` | 实退数量 | `accept_quantity` | Decimal |
| 2 | `acceptQuantityPU` | 实货计价数量 | `accept_quantity_pu` | Decimal |
| 3 | `acceptSubQuantity` | 实退件数 | `accept_sub_quantity` | Decimal |
| 4 | `arriveOrderId` | 退货单id | `arrive_order_id` | 0dd5fc6f-3df5-4ccb-8f9c-a4e87bd3a5c8 |
| 5 | `arriveQuantity` | 退货数量 | `arrive_quantity` | Decimal |
| 6 | `arriveQuantityPU` | 退货计价数量 | `arrive_quantity_pu` | Decimal |
| 7 | `arriveSubQuantity` | 退货件数 | `arrive_sub_quantity` | Decimal |
| 8 | `auxilaryWarehousingQuantity` | 累计入库件数 | `auxilary_warehousing_quantity` | Decimal |
| 9 | `batchNo` | 批次号 | `batch_no` | String |
| 10 | `batchnoid` | 批次参照 | `batchnoid` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 11 | `byProductProcessWay` | 副产品处理方式 | `by_product_process_way` | String |
| 12 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 13 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 14 | `checkNum` | 累计请检数量 | `check_num` | Decimal |
| 15 | `costCenterId` | 成本中心ID | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 16 | `define1` | 自定义项1 | `define1` | String |
| 17 | `define10` | 自定义项10 | `define10` | String |
| 18 | `define11` | 自定义项11 | `define11` | String |
| 19 | `define12` | 自定义项12 | `define12` | String |
| 20 | `define13` | 自定义项13 | `define13` | String |
| 21 | `define14` | 自定义项14 | `define14` | String |
| 22 | `define15` | 自定义项15 | `define15` | String |
| 23 | `define16` | 自定义项16 | `define16` | String |
| 24 | `define17` | 自定义项17 | `define17` | String |
| 25 | `define18` | 自定义项18 | `define18` | String |
| 26 | `define19` | 自定义项19 | `define19` | String |
| 27 | `define2` | 自定义项2 | `define2` | String |
| 28 | `define20` | 自定义项20 | `define20` | String |
| 29 | `define21` | 自定义项21 | `define21` | String |
| 30 | `define22` | 自定义项22 | `define22` | String |
| 31 | `define23` | 自定义项23 | `define23` | String |
| 32 | `define24` | 自定义项24 | `define24` | String |
| 33 | `define25` | 自定义项25 | `define25` | String |
| 34 | `define26` | 自定义项26 | `define26` | String |
| 35 | `define27` | 自定义项27 | `define27` | String |
| 36 | `define28` | 自定义项28 | `define28` | String |
| 37 | `define29` | 自定义项29 | `define29` | String |
| 38 | `define3` | 自定义项3 | `define3` | String |
| 39 | `define30` | 自定义项30 | `define30` | String |
| 40 | `define4` | 自定义项4 | `define4` | String |
| 41 | `define5` | 自定义项5 | `define5` | String |
| 42 | `define6` | 自定义项6 | `define6` | String |
| 43 | `define7` | 自定义项7 | `define7` | String |
| 44 | `define8` | 自定义项8 | `define8` | String |
| 45 | `define9` | 自定义项9 | `define9` | String |
| 46 | `defineCharacteristicsPro` | 自定义项特征组 | `define_cts` | c8475828-5ba1-4064-9abc-0aa4245a2c65 |
| 47 | `deliveryAuxiliaryQuantity` | 计划到货件数 | `delivery_auxiliary_quantity` | Decimal |
| 48 | `deliveryDate` | 计划到货日期 | `delivery_date` | Date |
| 49 | `deliveryQuantity` | 计划到货数量 | `delivery_quantity` | Decimal |
| 50 | `demandOrgId` | 需求组织 | `demand_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 51 | `demandVirtualAccbodyId` | 需方利润中心ID | `demand_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 52 | `discountTaxType` | 扣税类别 | `discount_tax_type` | DiscountTaxType |
| 53 | `expirationDate` | 有效期至 | `expiration_date` | Date |
| 54 | `expireDateNo` | 保质期 | `expire_date_no` | Decimal |
| 55 | `expireDateUnit` | 保质期单位 | `expire_date_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 56 | `firstLineNo` | 源头单据行号 | `first_line_no` | Decimal |
| 57 | `firstSource` | 源头单据类型 | `first_source` | String |
| 58 | `firstSourceAutoId` | 源头单据子表id | `first_source_autoid` | Long |
| 59 | `firstSourceId` | 源头单据主表id | `first_source_id` | Long |
| 60 | `firstUpCode` | 源头单据号 | `first_upcode` | String |
| 61 | `free1` | 规格1 | `free1` | String |
| 62 | `free10` | 规格10 | `free10` | String |
| 63 | `free2` | 规格2 | `free2` | String |
| 64 | `free3` | 规格3 | `free3` | String |
| 65 | `free4` | 规格4 | `free4` | String |
| 66 | `free5` | 规格5 | `free5` | String |
| 67 | `free6` | 规格6 | `free6` | String |
| 68 | `free7` | 规格7 | `free7` | String |
| 69 | `free8` | 规格8 | `free8` | String |
| 70 | `free9` | 规格9 | `free9` | String |
| 71 | `freeCharacteristics` | 自由项特征组 | `free_cts` | c1015c4c-c5e5-4f21-8aa0-629326822ebf |
| 72 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 73 | `id` | ID | `id` | Long |
| 74 | `inspection` | 检验 | `inspection` | Boolean |
| 75 | `inspectionFinish` | 检验完成 | `inspection_finish` | Boolean |
| 76 | `iomSource` | 接口表来源类型 | `iom_source` | String |
| 77 | `iomSourceautoid` | 接口表来源子表id | `iom_sourceautoid` | String |
| 78 | `iomSourceid` | 接口表来源id | `iom_sourceid` | String |
| 79 | `isPresent` | 赠品 | `is_present` | Boolean |
| 80 | `isTaxPrice` | 价格含税 | `is_taxprice` | Boolean |
| 81 | `kittingCheck` | 齐套检查 | `kitting_check` | Boolean |
| 82 | `kittingCheckLimitWay` | 齐套检查限制方式 | `kitting_check_limit_way` | String |
| 83 | `kittingCheckPoint` | 齐套检查点 | `kitting_check_point` | String |
| 84 | `lineNo` | 行号 | `line_no` | Decimal |
| 85 | `linecloseDate` | 行关闭日期 | `lineclose_date` | DateTime |
| 86 | `linecloseReasonId` | 关闭原因 | `lineclose_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 87 | `linecloseRemark` | 关闭说明 | `lineclose_remark` | String |
| 88 | `linecloseTime` | 行关闭时间 | `lineclose_time` | DateTime |
| 89 | `linecloser` | 行关闭人 | `linecloser` | String |
| 90 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 91 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 92 | `materialId` | 制造物料 | `material_id` | Long |
| 93 | `natMoney` | 本币无税金额 | `natMoney` | Decimal |
| 94 | `natSum` | 本币含税金额 | `natSum` | Decimal |
| 95 | `natTax` | 本币税额 | `natTax` | Decimal |
| 96 | `natTaxUnitPrice` | 本币含税单价 | `natTaxUnitPrice` | Decimal |
| 97 | `natUnitPrice` | 本币无税单价 | `natUnitPrice` | Decimal |
| 98 | `num` | 累计检验数量 | `num` | Decimal |
| 99 | `oriMoney` | 原币无税金额 | `oriMoney` | Decimal |
| 100 | `oriSum` | 原币含税金额 | `oriSum` | Decimal |
| 101 | `oriTax` | 原币税额 | `oriTax` | Decimal |
| 102 | `oriTaxUnitPrice` | 原币含税单价 | `oriTaxUnitPrice` | Decimal |
| 103 | `oriUnitPrice` | 原币无税单价 | `oriUnitPrice` | Decimal |
| 104 | `originCode` | 来源单据号 | `origin_code` | String |
| 105 | `originId` | 来源单据ID | `origin_id` | Long |
| 106 | `originLineCode` | 来源单据行号 | `origin_line_code` | String |
| 107 | `originLineId` | 来源单据行ID | `origin_line_id` | Long |
| 108 | `paymentagrement` | 付款协议 | `iPaymentagrement` | 3cce8052-512e-4e51-9b6e-57adff40948c |
| 109 | `priceChangeType` | 计价换算类型 | `price_change_type` | ChangeType |
| 110 | `priceUnitId` | 计价单位 | `price_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 111 | `produceDate` | 生产日期 | `produce_date` | Date |
| 112 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 113 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 114 | `productionType` | 产出类型 | `production_type` | String |
| 115 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 116 | `pubts` | 时间戳 | `pubts` | DateTime |
| 117 | `qualifiedAuxiliaryQuantity` | 合格件数 | `qualified_auxiliary_quantity` | Decimal |
| 118 | `qualifiedQuantity` | 合格数量 | `qualified_quantity` | Decimal |
| 119 | `rcvAutoVerify` | 入库自动核销 | `rcv_auto_verify` | Boolean |
| 120 | `refuseQuantity` | 拒收数量 | `refuse_quantity` | Decimal |
| 121 | `refuseQuantityPU` | 计价拒收数量 | `refuse_quantity_pu` | Decimal |
| 122 | `refuseSubQuantity` | 拒收件数 | `refuse_sub_quantity` | Decimal |
| 123 | `remark` | 备注 | `remark` | String |
| 124 | `replenishQuantity` | 原单补货数量 | `replenish_quantity` | Decimal |
| 125 | `replenishQuantityPU` | 计价原单补货数量 | `replenish_quantity_pu` | Decimal |
| 126 | `replenishSubQuantity` | 原单补货件数 | `replenish_sub_quantity` | Decimal |
| 127 | `reserveid` | 跟踪线索Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 128 | `returnAuxiliaryQuantity` | 返工件数 | `return_auxiliary_quantity` | Decimal |
| 129 | `returnQuantity` | 返工数量 | `return_quantity` | Decimal |
| 130 | `rowno` | 序号 | `rowno` | Integer |
| 131 | `rtnId` | 回厂单id | `rtn_id` | String |
| 132 | `rtnProductId` | 回厂单产品id | `rtn_product_id` | String |
| 133 | `scrapAuxiliaryQuantity` | 报废件数 | `scrap_auxiliary_quantity` | Decimal |
| 134 | `scrapQuantity` | 报废数量 | `scrap_quantity` | Decimal |
| 135 | `signDate` | 签收时间 | `sign_date` | Date |
| 136 | `signPerson` | 签收人 | `sign_person` | String |
| 137 | `signRemark` | 签收备注 | `sign_remark` | String |
| 138 | `signState` | 签收状态 | `sign_state` | Short |
| 139 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 140 | `source` | 上游单据类型 | `source` | String |
| 141 | `sourceLineNo` | 来源单据行号 | `source_line_no` | Decimal |
| 142 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 143 | `sourceType` | 来源单据类型 | `source_type` | String |
| 144 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 145 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 146 | `stockByInspection` | 根据检验结果入库 | `stock_by_inspection` | Boolean |
| 147 | `stockSensClue` | 现存量特征敏感线索 | `stockSensClue` | String |
| 148 | `subcontractToPrice` | 计价换算率 | `subcontract_to_price` | Decimal |
| 149 | `subcontractUnitId` | 委外单位 | `subcontract_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 150 | `supplyVirtualAccbodyId` | 供方利润中心ID | `supply_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 151 | `taxRate` | 税率 | `taxRate` | Decimal |
| 152 | `taxRateId` | 税率ID(参照) | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 153 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 154 | `upcode` | 上游单据号 | `upcode` | String |
| 155 | `vendorProductCode` | 供应商物料编码 | `vendor_product_code` | String |
| 156 | `vendorProductName` | 供应商物料名称 | `vendor_product_name` | String |
| 157 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 158 | `warehousingQuantity` | 累计入库数量 | `warehousing_quantity` | Decimal |
| 159 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 160 | `associationOsmOrderProductId` | 关联行 | `association_osm_order_product_id` | Long |
| 161 | `checkStatus` | 检验状态 | `check_status` | OsmCheckStatus |
| 162 | `continuousGroup` | 连续委外组号 | `continuous_group` | String |
| 163 | `continuousOsm` | 连续委外 | `continuous_osm` | Boolean |
| 164 | `continuousOsmDealWay` | 连续委外处理方式 | `continuous_osm_deal_way` | Integer |
| 165 | `cooperateDocId` | 协同单id | `cooperate_docid` | Long |
| 166 | `cooperateDocNo` | 协同单号 | `cooperate_docno` | String |
| 167 | `cooperateLineId` | 协同单行id | `cooperate_lineid` | Long |
| 168 | `cooperateLineNo` | 协同单行号 | `cooperate_lineno` | String |
| 169 | `emergepassState` | 紧急放行状态 | `emergepass_state` | Short |
| 170 | `endOp` | 末序 | `end_op` | Boolean |
| 171 | `endOpSn` | 结束工序顺序号 | `end_op_sn` | Decimal |
| 172 | `hasPaymentPlan` | 是否有随单付款计划 | `has_payment_plan` | Boolean |
| 173 | `inspectStatus` | 报检状态 | `inspect_status` | OsmInspectStatus |
| 174 | `isContinuousOsmEnd` | 是否连续委外最后一道工序 | `is_continuous_osm_end` | Boolean |
| 175 | `isUpdateStock` | 是否更新存量 | `is_update_stock` | Boolean |
| 176 | `nextId` | 后序ID | `next_id` | Long |
| 177 | `nextSn` | 后序顺序号 | `next_sn` | Decimal |
| 178 | `nonRecoverableTaxFC` | 本币不可抵扣税额 | `non_recover_tax_fc` | Decimal |
| 179 | `nonRecoverableTaxRate` | 不可抵扣税率 | `non_recover_taxrate` | Decimal |
| 180 | `nonRecoverableTaxTC` | 不可抵扣税额 | `non_recover_tax_tc` | Decimal |
| 181 | `opSn` | 工序顺序号 | `op_sn` | Decimal |
| 182 | `operationId` | 工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 183 | `orderProductAttrextItem` | 表体自由自定义项 | `` | bb10f5a0-47b0-4885-93bf-4f795f82cbaa |
| 184 | `orderProductUserdefItem` | 表体固定自定义项 | `` | 67ec6652-f0db-4b82-a990-e00f3b60bf8d |
| 185 | `osmArriveOrderProductExt` | 委外退货单表体扩展 | `` | 85b9b66f-7b24-4c61-b0dd-f2a3390b4425 |
| 186 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 187 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 188 | `preId` | 前序ID | `pre_id` | Long |
| 189 | `preSn` | 前序顺序号 | `pre_sn` | Decimal |
| 190 | `processRptPoint` | 工序委外产品报告点 | `process_rpt_point` | Short |
| 191 | `productionOrgId` | 生产组织 | `production_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 192 | `returnOrderSn` | 委外退货单序列号 | `` | 6b0fcee1-efb0-454d-a706-4a13bbb84a14 |
| 193 | `sourceGrandchildrenId` | 上游单据孙表id | `source_grandchildrenId` | Long |
| 194 | `sourcePoOrderByproductId` | 来源生产订单产出ID | `source_po_order_byproduct_id` | Long |
| 195 | `sourcePoOrderCode` | 来源生产订单号 | `source_po_order_code` | String |
| 196 | `sourcePoOrderId` | 来源生产订单ID | `source_po_order_id` | Long |
| 197 | `sourcePoOrderProcessId` | 来源生产订单工序ID | `source_po_order_process_id` | Long |
| 198 | `sourcePoOrderProductId` | 来源生产订单行ID | `source_po_order_product_id` | Long |
| 199 | `sourcePoOrderProductRowno` | 来源生产订单行号 | `source_po_order_product_rowno` | Decimal |
| 200 | `sourceSfcProcPlanId` | 来源工序作业计划行ID | `source_sfc_proc_plan_id` | Long |
| 201 | `startOpSn` | 开始工序顺序号 | `start_op_sn` | Decimal |
| 202 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 203 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 204 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（31个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplyVirtualAccbodyId` | 供方利润中心ID | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 2 | `orderProductAttrextItem` | 表体自由自定义项 | `po.returnorder.OsmReturnOrderProductAttrextItem` | None | true |
| 3 | `reserveid` | 跟踪线索Id | `st.reservation.Reservation` | Service |  |
| 4 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 5 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 6 | `expireDateUnit` | 保质期单位 | `pc.unit.Unit` | Service |  |
| 7 | `defineCharacteristicsPro` | 自定义项特征组 | `po.returnorder.ProductDefineCharacteristics` | None |  |
| 8 | `costCenterId` | 成本中心ID | `bd.costcenter.CostCenter` | Service |  |
| 9 | `returnOrderSn` | 委外退货单序列号 | `po.returnorder.OsmReturnOrderSn` | None | true |
| 10 | `operationId` | 工序ID | `ed.operation.Operation` | Service |  |
| 11 | `taxRateId` | 税率ID(参照) | `archive.taxArchives.TaxRateArchive` | Service |  |
| 12 | `paymentagrement` | 付款协议 | `bd.payments.PayAgreement` | Service |  |
| 13 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 14 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 15 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 16 | `priceUnitId` | 计价单位 | `pc.unit.Unit` | Service |  |
| 17 | `batchnoid` | 批次参照 | `st.batchno.Batchno` | Service |  |
| 18 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 19 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 20 | `subcontractUnitId` | 委外单位 | `pc.unit.Unit` | Service |  |
| 21 | `arriveOrderId` | 退货单id | `po.returnorder.OsmReturnOrder` | None | true |
| 22 | `linecloseReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 23 | `demandVirtualAccbodyId` | 需方利润中心ID | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 24 | `demandOrgId` | 需求组织 | `org.func.BaseOrg` | Service |  |
| 25 | `freeCharacteristics` | 自由项特征组 | `po.returnorder.FreeCharacteristics` | None |  |
| 26 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 27 | `orderProductUserdefItem` | 表体固定自定义项 | `po.returnorder.OsmReturnOrderProductUserdefItem` | None | true |
| 28 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 29 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 30 | `productionOrgId` | 生产组织 | `org.func.BaseOrg` | Service |  |
| 31 | `osmArriveOrderProductExt` | 委外退货单表体扩展 | `po.returnorder.OsmReturnOrderProductExt` | None | true |
