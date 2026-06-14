---
tags: ["BIP", "元数据", "数据字典", "po.refuseorder.OsmRefuseOrderProduct"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外拒收单表体 (`po.refuseorder.OsmRefuseOrderProduct`)

>  | 物理表：`po_osm_arrive_order_product`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外拒收单表体 |
| 物理表 | `po_osm_arrive_order_product` |
| domain/服务域 | `productionorder` |
| 所属应用 | `` |
| 构建时间 | `2026-06-05 09:56:01.9290` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（201个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `acceptQuantity` | 实收数量 | `accept_quantity` | Decimal |
| 2 | `acceptQuantityPU` | 计价实收数量 | `accept_quantity_pu` | Decimal |
| 3 | `acceptSubQuantity` | 实收件数 | `accept_sub_quantity` | Decimal |
| 4 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 5 | `arriveOrderId` | 拒收单ID | `arrive_order_id` | e74836be-703e-4918-a8ec-1e6b74efdb95 |
| 6 | `arriveQuantity` | 拒收数量 | `arrive_quantity` | Decimal |
| 7 | `arriveQuantityPU` | 拒收计价数量 | `arrive_quantity_pu` | Decimal |
| 8 | `arriveSubQuantity` | 拒收件数 | `arrive_sub_quantity` | Decimal |
| 9 | `associationOsmOrderProductId` | 关联行 | `association_osm_order_product_id` | Long |
| 10 | `auxilaryWarehousingQuantity` | 累计入库件数 | `auxilary_warehousing_quantity` | Decimal |
| 11 | `batchNo` | 批次号 | `batch_no` | String |
| 12 | `batchnoid` | 批次参照 | `batchnoid` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 13 | `byProductProcessWay` | 副产品处理方式 | `by_product_process_way` | String |
| 14 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 15 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 16 | `checkNum` | 累计请检数量 | `check_num` | Decimal |
| 17 | `checkStatus` | 检验状态 | `check_status` | OsmCheckStatus |
| 18 | `continuousGroup` | 连续委外组号 | `continuous_group` | String |
| 19 | `continuousOsm` | 连续委外 | `continuous_osm` | Boolean |
| 20 | `continuousOsmDealWay` | 连续委外处理方式 | `continuous_osm_deal_way` | Integer |
| 21 | `cooperateDocId` | 协同单id | `cooperate_docid` | Long |
| 22 | `cooperateDocNo` | 协同单号 | `cooperate_docno` | String |
| 23 | `cooperateLineId` | 协同单行id | `cooperate_lineid` | Long |
| 24 | `cooperateLineNo` | 协同单行号 | `cooperate_lineno` | String |
| 25 | `costCenterId` | 成本中心ID | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 26 | `define1` | 自定义项1 | `define1` | String |
| 27 | `define10` | 自定义项10 | `define10` | String |
| 28 | `define11` | 自定义项11 | `define11` | String |
| 29 | `define12` | 自定义项12 | `define12` | String |
| 30 | `define13` | 自定义项13 | `define13` | String |
| 31 | `define14` | 自定义项14 | `define14` | String |
| 32 | `define15` | 自定义项15 | `define15` | String |
| 33 | `define16` | 自定义项16 | `define16` | String |
| 34 | `define17` | 自定义项17 | `define17` | String |
| 35 | `define18` | 自定义项18 | `define18` | String |
| 36 | `define19` | 自定义项19 | `define19` | String |
| 37 | `define2` | 自定义项2 | `define2` | String |
| 38 | `define20` | 自定义项20 | `define20` | String |
| 39 | `define21` | 自定义项21 | `define21` | String |
| 40 | `define22` | 自定义项22 | `define22` | String |
| 41 | `define23` | 自定义项23 | `define23` | String |
| 42 | `define24` | 自定义项24 | `define24` | String |
| 43 | `define25` | 自定义项25 | `define25` | String |
| 44 | `define26` | 自定义项26 | `define26` | String |
| 45 | `define27` | 自定义项27 | `define27` | String |
| 46 | `define28` | 自定义项28 | `define28` | String |
| 47 | `define29` | 自定义项29 | `define29` | String |
| 48 | `define3` | 自定义项3 | `define3` | String |
| 49 | `define30` | 自定义项30 | `define30` | String |
| 50 | `define4` | 自定义项4 | `define4` | String |
| 51 | `define5` | 自定义项5 | `define5` | String |
| 52 | `define6` | 自定义项6 | `define6` | String |
| 53 | `define7` | 自定义项7 | `define7` | String |
| 54 | `define8` | 自定义项8 | `define8` | String |
| 55 | `define9` | 自定义项9 | `define9` | String |
| 56 | `defineCharacteristicsPro` | 自定义项特征组 | `define_cts` | 877ca3d1-d932-4bde-9792-e7c3c0192aed |
| 57 | `deliveryAuxiliaryQuantity` | 计划到货件数 | `delivery_auxiliary_quantity` | Decimal |
| 58 | `deliveryDate` | 计划到货日期 | `delivery_date` | Date |
| 59 | `deliveryQuantity` | 计划到货数量 | `delivery_quantity` | Decimal |
| 60 | `demandOrgId` | 需求组织 | `demand_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 61 | `demandVirtualAccbodyId` | 需方利润中心ID | `demand_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 62 | `discountTaxType` | 扣税类别 | `discount_tax_type` | DiscountTaxType |
| 63 | `emergepassState` | 紧急放行状态 | `emergepass_state` | Short |
| 64 | `endOp` | 末序 | `end_op` | Boolean |
| 65 | `endOpSn` | 结束工序顺序号 | `end_op_sn` | Decimal |
| 66 | `expirationDate` | 有效期至 | `expiration_date` | Date |
| 67 | `expireDateNo` | 保质期 | `expire_date_no` | Decimal |
| 68 | `expireDateUnit` | 保质期单位 | `expire_date_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 69 | `firstLineNo` | 源头单据行号 | `first_line_no` | Decimal |
| 70 | `firstSource` | 源头单据类型 | `first_source` | String |
| 71 | `firstSourceAutoId` | 源头单据子表id | `first_source_autoid` | Long |
| 72 | `firstSourceId` | 源头单据主表id | `first_source_id` | Long |
| 73 | `firstUpCode` | 源头单据号 | `first_upcode` | String |
| 74 | `free1` | 规格1 | `free1` | String |
| 75 | `free10` | 规格10 | `free10` | String |
| 76 | `free2` | 规格2 | `free2` | String |
| 77 | `free3` | 规格3 | `free3` | String |
| 78 | `free4` | 规格4 | `free4` | String |
| 79 | `free5` | 规格5 | `free5` | String |
| 80 | `free6` | 规格6 | `free6` | String |
| 81 | `free7` | 规格7 | `free7` | String |
| 82 | `free8` | 规格8 | `free8` | String |
| 83 | `free9` | 规格9 | `free9` | String |
| 84 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 125300bf-db78-4aa1-8d68-9f7629d980bd |
| 85 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 86 | `hasPaymentPlan` | 是否有随单付款计划 | `has_payment_plan` | Boolean |
| 87 | `id` | ID | `id` | Long |
| 88 | `inspectStatus` | 报检状态 | `inspect_status` | OsmInspectStatus |
| 89 | `inspection` | 检验 | `inspection` | Boolean |
| 90 | `inspectionFinish` | 检验完成 | `inspection_finish` | Boolean |
| 91 | `iomSource` | 接口表来源类型 | `iom_source` | String |
| 92 | `iomSourceautoid` | 接口表来源子表id | `iom_sourceautoid` | String |
| 93 | `iomSourceid` | 接口表来源id | `iom_sourceid` | String |
| 94 | `isContinuousOsmEnd` | 是否连续委外最后一道工序 | `is_continuous_osm_end` | Boolean |
| 95 | `isPresent` | 赠品 | `is_present` | Boolean |
| 96 | `isTaxPrice` | 价格含税 | `is_taxprice` | Boolean |
| 97 | `isUpdateStock` | 是否更新存量 | `is_update_stock` | Boolean |
| 98 | `kittingCheck` | 齐套检查 | `kitting_check` | Boolean |
| 99 | `kittingCheckLimitWay` | 齐套检查限制方式 | `kitting_check_limit_way` | String |
| 100 | `kittingCheckPoint` | 齐套检查点 | `kitting_check_point` | String |
| 101 | `lineNo` | 行号 | `line_no` | Decimal |
| 102 | `linecloseDate` | 行关闭日期 | `lineclose_date` | DateTime |
| 103 | `linecloseReasonId` | 关闭原因 | `lineclose_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 104 | `linecloseRemark` | 关闭说明 | `lineclose_remark` | String |
| 105 | `linecloseTime` | 行关闭时间 | `lineclose_time` | DateTime |
| 106 | `linecloser` | 行关闭人 | `linecloser` | String |
| 107 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 108 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 109 | `materialId` | 制造物料 | `material_id` | Long |
| 110 | `natMoney` | 本币无税金额 | `natMoney` | Decimal |
| 111 | `natSum` | 本币含税金额 | `natSum` | Decimal |
| 112 | `natTax` | 本币税额 | `natTax` | Decimal |
| 113 | `natTaxUnitPrice` | 本币含税单价 | `natTaxUnitPrice` | Decimal |
| 114 | `natUnitPrice` | 本币无税单价 | `natUnitPrice` | Decimal |
| 115 | `nextId` | 后序ID | `next_id` | Long |
| 116 | `nextSn` | 后序顺序号 | `next_sn` | Decimal |
| 117 | `nonRecoverableTaxFC` | 本币不可抵扣税额 | `non_recover_tax_fc` | Decimal |
| 118 | `nonRecoverableTaxRate` | 不可抵扣税率 | `non_recover_taxrate` | Decimal |
| 119 | `nonRecoverableTaxTC` | 不可抵扣税额 | `non_recover_tax_tc` | Decimal |
| 120 | `num` | 累计检验数量 | `num` | Decimal |
| 121 | `opSn` | 工序顺序号 | `op_sn` | Decimal |
| 122 | `operationId` | 工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 123 | `oriMoney` | 原币无税金额 | `oriMoney` | Decimal |
| 124 | `oriSum` | 原币含税金额 | `oriSum` | Decimal |
| 125 | `oriTax` | 原币税额 | `oriTax` | Decimal |
| 126 | `oriTaxUnitPrice` | 原币含税单价 | `oriTaxUnitPrice` | Decimal |
| 127 | `oriUnitPrice` | 原币无税单价 | `oriUnitPrice` | Decimal |
| 128 | `originCode` | 来源单据号 | `origin_code` | String |
| 129 | `originId` | 来源单据ID | `origin_id` | Long |
| 130 | `originLineCode` | 来源单据行号 | `origin_line_code` | String |
| 131 | `originLineId` | 来源单据行ID | `origin_line_id` | Long |
| 132 | `osmRefuseOrderProductExt` | 委外拒收单表体扩展 | `` | 3e6c9ba9-8743-495b-99d3-658966a564e5 |
| 133 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 134 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 135 | `paymentagrement` | 付款协议 | `iPaymentagrement` | 3cce8052-512e-4e51-9b6e-57adff40948c |
| 136 | `preId` | 前序ID | `pre_id` | Long |
| 137 | `preSn` | 前序顺序号 | `pre_sn` | Decimal |
| 138 | `priceChangeType` | 计价换算类型 | `price_change_type` | ChangeType |
| 139 | `priceUnitId` | 计价单位 | `price_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 140 | `processRptPoint` | 工序委外产品报告点 | `process_rpt_point` | Short |
| 141 | `produceDate` | 生产日期 | `produce_date` | Date |
| 142 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 143 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 144 | `productionOrgId` | 生产组织 | `production_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 145 | `productionType` | 产出类型 | `production_type` | String |
| 146 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 147 | `pubts` | 时间戳 | `pubts` | DateTime |
| 148 | `qualifiedAuxiliaryQuantity` | 合格件数 | `qualified_auxiliary_quantity` | Decimal |
| 149 | `qualifiedQuantity` | 合格数量 | `qualified_quantity` | Decimal |
| 150 | `rcvAutoVerify` | 入库自动核销 | `rcv_auto_verify` | Boolean |
| 151 | `refuseQuantity` | 拒收数量 | `refuse_quantity` | Decimal |
| 152 | `refuseQuantityPU` | 计价拒收数量 | `refuse_quantity_pu` | Decimal |
| 153 | `refuseSubQuantity` | 拒收件数 | `refuse_sub_quantity` | Decimal |
| 154 | `remark` | 备注 | `remark` | String |
| 155 | `replenishQuantity` | 拒收需补货数量 | `replenish_quantity` | Decimal |
| 156 | `replenishQuantityPU` | 计价拒收需补货数量 | `replenish_quantity_pu` | Decimal |
| 157 | `replenishSubQuantity` | 拒收需补货件数 | `replenish_sub_quantity` | Decimal |
| 158 | `reserveid` | 跟踪线索Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 159 | `returnAuxiliaryQuantity` | 返工件数 | `return_auxiliary_quantity` | Decimal |
| 160 | `returnQuantity` | 返工数量 | `return_quantity` | Decimal |
| 161 | `rowno` | 序号 | `rowno` | Integer |
| 162 | `rtnId` | 回厂单id | `rtn_id` | String |
| 163 | `rtnProductId` | 回厂单产品id | `rtn_product_id` | String |
| 164 | `scrapAuxiliaryQuantity` | 报废件数 | `scrap_auxiliary_quantity` | Decimal |
| 165 | `scrapQuantity` | 报废数量 | `scrap_quantity` | Decimal |
| 166 | `signDate` | 签收时间 | `sign_date` | Date |
| 167 | `signPerson` | 签收人 | `sign_person` | String |
| 168 | `signRemark` | 签收备注 | `sign_remark` | String |
| 169 | `signState` | 签收状态 | `sign_state` | Short |
| 170 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 171 | `source` | 上游单据类型 | `source` | String |
| 172 | `sourceGrandchildrenId` | 上游单据孙表id | `source_grandchildrenId` | Long |
| 173 | `sourceLineNo` | 来源单据行号 | `source_line_no` | Decimal |
| 174 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 175 | `sourcePoOrderByproductId` | 来源生产订单产出ID | `source_po_order_byproduct_id` | Long |
| 176 | `sourcePoOrderCode` | 来源生产订单号 | `source_po_order_code` | String |
| 177 | `sourcePoOrderId` | 来源生产订单ID | `source_po_order_id` | Long |
| 178 | `sourcePoOrderProcessId` | 来源生产订单工序ID | `source_po_order_process_id` | Long |
| 179 | `sourcePoOrderProductId` | 来源生产订单行ID | `source_po_order_product_id` | Long |
| 180 | `sourcePoOrderProductRowno` | 来源生产订单行号 | `source_po_order_product_rowno` | Decimal |
| 181 | `sourceSfcProcPlanId` | 来源工序作业计划行ID | `source_sfc_proc_plan_id` | Long |
| 182 | `sourceType` | 来源单据类型 | `source_type` | String |
| 183 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 184 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 185 | `startOpSn` | 开始工序顺序号 | `start_op_sn` | Decimal |
| 186 | `stockByInspection` | 根据检验结果入库 | `stock_by_inspection` | Boolean |
| 187 | `stockSensClue` | 现存量特征敏感线索 | `stockSensClue` | String |
| 188 | `stockStatus` | 入库状态 | `stock_status` | Short |
| 189 | `subcontractToPrice` | 计价换算率 | `subcontract_to_price` | Decimal |
| 190 | `subcontractUnitId` | 委外单位 | `subcontract_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 191 | `supplyVirtualAccbodyId` | 供方利润中心ID | `supply_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 192 | `taxRate` | 税率 | `taxRate` | Decimal |
| 193 | `taxRateId` | 税率ID（参照） | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 194 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 195 | `upcode` | 上游单据号 | `upcode` | String |
| 196 | `vendorProductCode` | 供应商物料编码 | `vendor_product_code` | String |
| 197 | `vendorProductName` | 供应商物料名称 | `vendor_product_name` | String |
| 198 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 199 | `warehousingQuantity` | 累计入库数量 | `warehousing_quantity` | Decimal |
| 200 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 201 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（28个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplyVirtualAccbodyId` | 供方利润中心ID | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 2 | `reserveid` | 跟踪线索Id | `st.reservation.Reservation` | Service |  |
| 3 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 4 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 5 | `expireDateUnit` | 保质期单位 | `pc.unit.Unit` | Service |  |
| 6 | `defineCharacteristicsPro` | 自定义项特征组 | `po.refuseorder.ProductDefineCharacteristics` | None |  |
| 7 | `costCenterId` | 成本中心ID | `bd.costcenter.CostCenter` | Service |  |
| 8 | `operationId` | 工序ID | `ed.operation.Operation` | Service |  |
| 9 | `taxRateId` | 税率ID（参照） | `archive.taxArchives.TaxRateArchive` | Service |  |
| 10 | `paymentagrement` | 付款协议 | `bd.payments.PayAgreement` | Service |  |
| 11 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 12 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 13 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 14 | `priceUnitId` | 计价单位 | `pc.unit.Unit` | Service |  |
| 15 | `batchnoid` | 批次参照 | `st.batchno.Batchno` | Service |  |
| 16 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 17 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 18 | `subcontractUnitId` | 委外单位 | `pc.unit.Unit` | Service |  |
| 19 | `arriveOrderId` | 拒收单ID | `po.refuseorder.OsmRefuseOrder` | None | true |
| 20 | `linecloseReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 21 | `demandVirtualAccbodyId` | 需方利润中心ID | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 22 | `osmRefuseOrderProductExt` | 委外拒收单表体扩展 | `po.refuseorder.OsmRefuseOrderProductExt` | None | true |
| 23 | `demandOrgId` | 需求组织 | `org.func.BaseOrg` | Service |  |
| 24 | `freeCharacteristics` | 自由项特征组 | `po.refuseorder.FreeCharacteristics` | None |  |
| 25 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 26 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 27 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 28 | `productionOrgId` | 生产组织 | `org.func.BaseOrg` | Service |  |
