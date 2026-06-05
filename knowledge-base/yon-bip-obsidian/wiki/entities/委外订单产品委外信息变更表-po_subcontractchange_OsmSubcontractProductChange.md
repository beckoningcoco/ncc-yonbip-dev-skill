---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.subcontractchange.OsmSubcontractProductChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外订单产品委外信息变更表 (`po.subcontractchange.OsmSubcontractProductChange`)

> OSM | 物理表：`osm_order_product_subcontract_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外订单产品委外信息变更表 |
| 物理表 | `osm_order_product_subcontract_change` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:58:23.7670` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 874c6c6f-0c0e-4582-800e-77098c273c53 | id |

---

## 直接属性（146个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `acceptQuantity` | 累计实收数量 | `accept_quantity` | Decimal |
| 2 | `acceptSubQuantity` | 累计实收件数 | `accept_sub_quantity` | Decimal |
| 3 | `arriveQuantity` | 累计到货数量 | `arrive_quantity` | Decimal |
| 4 | `arriveStatus` | 到货状态 | `arrive_status` | Short |
| 5 | `arriveSubQuantity` | 累计到货件数 | `arrive_sub_quantity` | Decimal |
| 6 | `associationOsmOrderProductId` | 关联行 | `association_osm_order_product_id` | Long |
| 7 | `cfmReturnQuantityMU` | 确认累计退库数量(主单位) | `cfm_return_quantity_mu` | Decimal |
| 8 | `cfmReturnQuantitySU` | 确认累计退库数量(委外单位) | `cfm_return_quantity_su` | Decimal |
| 9 | `continuousGroup` | 连续委外组号 | `continuous_group` | String |
| 10 | `continuousOsm` | 连续委外 | `continuous_osm` | Boolean |
| 11 | `cooperateDocId` | 协同单id | `cooperate_docid` | Long |
| 12 | `cooperateDocNo` | 协同单号 | `cooperate_docno` | String |
| 13 | `cooperateLineId` | 协同单行id | `cooperate_lineid` | Long |
| 14 | `cooperateLineNo` | 协同单行号 | `cooperate_lineno` | String |
| 15 | `costCenterId` | 成本中心ID | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 16 | `deliveryDate` | 交货日期 | `delivery_date` | Date |
| 17 | `demandChangeType` | 需求换算类型 | `demand_change_type` | ChangeType |
| 18 | `demandDepartmentId` | 需求部门 | `demand_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 19 | `demandOperatorId` | 需求人员 | `demand_operator_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 20 | `demandOrgId` | 需求组织 | `demand_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 21 | `demandQuantityDU` | 需求件数 | `demand_quantity_du` | Decimal |
| 22 | `demandQuantityMU` | 需求数量 | `demand_quantity_mu` | Decimal |
| 23 | `demandToPurchase` | 需求换算率 | `demand_to_purchase` | Decimal |
| 24 | `demandUnitId` | 需求单位 | `demand_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 25 | `demandVirtualAccbodyId` | 需方利润中心ID | `demand_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 26 | `discountTaxType` | 扣税类别 | `discount_tax_type` | DiscountTaxType |
| 27 | `endOp` | 末序 | `end_op` | Boolean |
| 28 | `endOpSn` | 结束工序顺序号 | `end_op_sn` | Decimal |
| 29 | `erpReqId` | Erp申请单主表id | `erp_req_id` | String |
| 30 | `erpReqLineId` | Erp申请单子表id | `erp_req_line_id` | String |
| 31 | `expenseNatMoney` | 本币费用无税金额 | `expense_nat_money` | Decimal |
| 32 | `expenseNatSum` | 本币费用含税金额 | `expense_nat_sum` | Decimal |
| 33 | `expenseOriMoney` | 原币费用无税金额 | `expense_ori_money` | Decimal |
| 34 | `expenseOriSum` | 原币费用含税金额 | `expense_ori_sum` | Decimal |
| 35 | `hasPaymentPlan` | 是否有随单付款计划 | `has_payment_plan` | Boolean |
| 36 | `id` | id | `id` | 874c6c6f-0c0e-4582-800e-77098c273c53 |
| 37 | `inStockedMoneyFC` | 累计入库金额(本币) | `instocked_money_fc` | Decimal |
| 38 | `inStockedMoneyTC` | 累计入库金额(交易币) | `instocked_money_tc` | Decimal |
| 39 | `incomingQuantityNoArrive` | 累计入库数量(无到货环节) | `incoming_quantity_no_arrive` | Decimal |
| 40 | `incomingQuantitySUNoArrive` | 累计入库件数(无到货环节) | `incoming_quantity_su_no_arrive` | Decimal |
| 41 | `invoiceStatus` | 发票状态 | `invoice_status` | Short |
| 42 | `invoicedMoneyFC` | 累计开票金额(本币) | `invoiced_money_fc` | Decimal |
| 43 | `invoicedMoneyTC` | 累计开票金额(交易币) | `invoiced_money_tc` | Decimal |
| 44 | `invoicedQuantityMU` | 累计开票数量(主单位) | `invoiced_quantity_mu` | Decimal |
| 45 | `invoicedQuantityPU` | 累计开票数量(计价单位) | `invoiced_quantity_pu` | Decimal |
| 46 | `isContinuousOsmEnd` | 是否连续委外最后一道工序 | `is_continuous_osm_end` | Boolean |
| 47 | `isPresent` | 赠品 | `is_present` | Boolean |
| 48 | `isTaxPrice` | 价格含税 | `is_taxprice` | Boolean |
| 49 | `isUpdateStock` | 是否更新存量 | `is_update_stock` | Boolean |
| 50 | `lineAttach` | 附件 | `line_attach` | String |
| 51 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 52 | `materialVerifStatus` | 材料核销状态 | `material_verif_status` | Short |
| 53 | `natMoney` | 本币无税金额 | `natMoney` | Decimal |
| 54 | `natSum` | 本币含税金额 | `natSum` | Decimal |
| 55 | `natTax` | 本币税额 | `natTax` | Decimal |
| 56 | `natTaxUnitPrice` | 本币含税单价 | `natTaxUnitPrice` | Decimal |
| 57 | `natUnitPrice` | 本币无税单价 | `natUnitPrice` | Decimal |
| 58 | `nextId` | 后序ID | `next_id` | Long |
| 59 | `nextSn` | 后序顺序号 | `next_sn` | Decimal |
| 60 | `noRequireCheck` | 不需要委外核销 | `no_require_check` | Short |
| 61 | `noTaxPriceCat` | 无税单价(取价) | `notax_price_cat` | Decimal |
| 62 | `nonRecoverableTaxFC` | 本币不可抵扣税额 | `non_recover_tax_fc` | Decimal |
| 63 | `nonRecoverableTaxRate` | 不可抵扣税率 | `non_recover_taxrate` | Decimal |
| 64 | `nonRecoverableTaxTC` | 不可抵扣税额 | `non_recover_tax_tc` | Decimal |
| 65 | `opSn` | 工序顺序号 | `op_sn` | Decimal |
| 66 | `operationId` | 工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 67 | `oriMoney` | 原币无税金额 | `oriMoney` | Decimal |
| 68 | `oriSum` | 原币含税金额 | `oriSum` | Decimal |
| 69 | `oriTax` | 原币税额 | `oriTax` | Decimal |
| 70 | `oriTaxUnitPrice` | 原币含税单价 | `oriTaxUnitPrice` | Decimal |
| 71 | `oriUnitPrice` | 原币无税单价 | `oriUnitPrice` | Decimal |
| 72 | `originalOrderId` | 原单id | `original_order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 73 | `originalOrderProductId` | 原单产品id | `original_subcontract_product_id` | 60173f24-36ed-4f78-80ee-1f96492c7065 |
| 74 | `payedMoneyFC` | 累计付款金额(本币) | `payed_money_fc` | Decimal |
| 75 | `payedMoneyTC` | 累计付款金额(交易币) | `payed_money_tc` | Decimal |
| 76 | `payedQuantityMU` | 累计付款数量(主单位) | `payed_quantity_mu` | Decimal |
| 77 | `payedQuantityPU` | 累计付款数量(计价单位) | `payed_quantity_pu` | Decimal |
| 78 | `paymentFC` | 应付金额(本币) | `payment_fc` | Decimal |
| 79 | `paymentProcessTotalFc` | 本币付款流程总金额 | `payment_process_total_fc` | Decimal |
| 80 | `paymentProcessTotalTc` | 付款流程总金额 | `payment_process_total_tc` | Decimal |
| 81 | `paymentStatus` | 付款状态 | `payment_status` | Short |
| 82 | `paymentTC` | 应付金额(交易币) | `payment_tc` | Decimal |
| 83 | `preId` | 前序ID | `pre_id` | Long |
| 84 | `preSn` | 前序顺序号 | `pre_sn` | Decimal |
| 85 | `priceChangeType` | 计价换算类型 | `price_change_type` | ChangeType |
| 86 | `priceSource` | 价格来源 | `price_source` | PriceSource |
| 87 | `priceUnitId` | 计价单位 | `price_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 88 | `processRptPoint` | 工序委外产品报告点 | `process_rpt_point` | Short |
| 89 | `productAuth` | 物料权限 | `subcontract_product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 90 | `productionOrgId` | 生产组织 | `production_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 91 | `projectMaterialDetailId` | 项目物资清单明细ID | `project_material_detail_id` | String |
| 92 | `puReqId` | 采购需求id | `pu_req_id` | Long |
| 93 | `puReqNo` | 采购需求单号 | `pu_req_no` | String |
| 94 | `purContractId` | 采购合同Id | `pur_contract_id` | Long |
| 95 | `purContractItemClass` | 采购合同物料分类 | `pur_ct_item_class` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 96 | `purContractLineId` | 采购合同行Id | `pur_contract_line_id` | Long |
| 97 | `purContractLineNo` | 采购合同行号 | `pur_contract_line_no` | Long |
| 98 | `purContractNo` | 采购合同号 | `pur_contract_no` | String |
| 99 | `rcvAddrType` | 收货地址类型 | `rcv_addr_type` | Integer |
| 100 | `rcvCustomer` | 收货客户 | `rcv_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 101 | `rcvVendor` | 收货委外商 | `rcv_vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 102 | `refuseQuantity` | 累计拒收数量 | `refuse_quantity` | Decimal |
| 103 | `refuseSubQuantity` | 累计拒收件数 | `refuse_sub_quantity` | Decimal |
| 104 | `replenishQuantity` | 拒收需补货数量 | `replenish_quantity` | Decimal |
| 105 | `replenishSubQuantity` | 拒收需补货件数 | `replenish_sub_quantity` | Decimal |
| 106 | `requestedPaymentFC` | 累计付款申请金额(本币) | `requested_payment_fc` | Decimal |
| 107 | `requestedPaymentTC` | 累计付款申请金额(交易币) | `requested_payment_tc` | Decimal |
| 108 | `returnQtyMU` | 累计退货数量 | `return_qty_mu` | Decimal |
| 109 | `returnQtyNoOutMU` | 累计退货未退库数量 | `return_qty_no_out_mu` | Decimal |
| 110 | `returnQuantityMU` | 累计退库数量(主单位) | `return_quantity_mu` | Decimal |
| 111 | `returnQuantitySU` | 累计退库数量(委外单位) | `return_quantity_su` | Decimal |
| 112 | `sourcePoOrderCode` | 来源生产订单号 | `source_po_order_code` | String |
| 113 | `sourcePoOrderId` | 来源生产订单ID | `source_po_order_id` | Long |
| 114 | `sourcePoOrderProcessId` | 来源生产订单工序ID | `source_po_order_process_id` | Long |
| 115 | `sourcePoOrderProductId` | 来源生产订单行ID | `source_po_order_product_id` | Long |
| 116 | `sourcePoOrderProductRowno` | 来源生产订单行号 | `source_po_order_product_rowno` | Decimal |
| 117 | `sourceSfcProcPlanId` | 来源工序作业计划行ID | `source_sfc_proc_plan_id` | Long |
| 118 | `srId` | 委外申请单Id | `sr_id` | Long |
| 119 | `srLineId` | 委外申请单行Id | `sr_line_id` | Long |
| 120 | `srLineNo` | 委外申请单行号 | `sr_line_no` | Decimal |
| 121 | `srNo` | 委外申请单号 | `sr_no` | String |
| 122 | `startOpSn` | 开始工序顺序号 | `start_op_sn` | Decimal |
| 123 | `subcontractMaterialId` | 制造物料 | `subcontract_material_id` | Long |
| 124 | `subcontractProductId` | 物料Id | `subcontract_product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 125 | `subcontractQuantityMU` | 委外数量 | `subcontract_quantity_mu` | Decimal |
| 126 | `subcontractQuantityPU` | 计价数量 | `subcontract_quantity_pu` | Decimal |
| 127 | `subcontractQuantitySU` | 委外件数 | `subcontract_quantity_su` | Decimal |
| 128 | `subcontractSkuId` | SKU | `subcontract_sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 129 | `subcontractToPrice` | 计价换算率 | `subcontract_to_price` | Decimal |
| 130 | `subcontractUnitId` | 委外单位 | `subcontract_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 131 | `supplyVirtualAccbodyId` | 供方利润中心ID | `supply_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 132 | `taxCodeId` | 税码 | `tax_code_id` | 3f7c3856-5b00-4506-b458-a64eed0d3bfb |
| 133 | `taxPriceCat` | 含税单价(取价) | `tax_price_cat` | Decimal |
| 134 | `taxRate` | 税率 | `taxRate` | Decimal |
| 135 | `taxRateId` | 税目 | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 136 | `tcOrgAccountSon` | 跨组织委外结算 | `tc_org_account_son` | Short |
| 137 | `tcOrgIdSon` | 收票组织 | `tc_org_id_son` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 |
| 138 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 139 | `throwStatus` | 抛转状态 | `throw_status` | ThrowStatus |
| 140 | `totalPaymentFC` | 累计付款金额(本币) | `total_payment_fc` | Decimal |
| 141 | `totalPaymentTC` | 累计付款金额(交易币) | `total_payment_tc` | Decimal |
| 142 | `tradePath` | 贸易路径 | `trade_path` | c69f1d6a-783c-4f79-b446-b4da14cb7fff |
| 143 | `vendorProductCode` | 供应商物料编码 | `vendor_product_code` | String |
| 144 | `vendorProductName` | 供应商物料名称 | `vendor_product_name` | String |
| 145 | `verificationStatus` | 核销状态 | `verification_status` | Short |
| 146 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（27个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplyVirtualAccbodyId` | 供方利润中心ID | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 2 | `originalOrderId` | 原单id | `po.order.Order` | None |  |
| 3 | `costCenterId` | 成本中心ID | `bd.costcenter.CostCenter` | Service |  |
| 4 | `demandOperatorId` | 需求人员 | `bd.staff.Staff` | Service |  |
| 5 | `subcontractSkuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 6 | `operationId` | 工序ID | `ed.operation.Operation` | Service |  |
| 7 | `id` | id | `po.subcontractchange.OsmOrderProductChange` | None | true |
| 8 | `taxRateId` | 税目 | `archive.taxArchives.TaxRateArchive` | Service |  |
| 9 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 10 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
| 11 | `priceUnitId` | 计价单位 | `pc.unit.Unit` | Service |  |
| 12 | `originalOrderProductId` | 原单产品id | `po.order.SubcontractProduct` | None |  |
| 13 | `demandUnitId` | 需求单位 | `pc.unit.Unit` | Service |  |
| 14 | `purContractItemClass` | 采购合同物料分类 | `pc.cls.ManagementClass` | Service |  |
| 15 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 16 | `rcvCustomer` | 收货客户 | `aa.merchant.Merchant` | Service |  |
| 17 | `subcontractUnitId` | 委外单位 | `pc.unit.Unit` | Service |  |
| 18 | `demandDepartmentId` | 需求部门 | `aa.baseorg.DeptMV` | Service |  |
| 19 | `taxCodeId` | 税码 | `taxpubdoc.taxengine.TaxCode` | Service |  |
| 20 | `demandVirtualAccbodyId` | 需方利润中心ID | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 21 | `demandOrgId` | 需求组织 | `org.func.BaseOrg` | Service |  |
| 22 | `tradePath` | 贸易路径 | `sccs.multitrade.TradeRoute` | Service |  |
| 23 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 24 | `tcOrgIdSon` | 收票组织 | `org.func.FinanceOrg` | Service |  |
| 25 | `subcontractProductId` | 物料Id | `pc.product.Product` | Service |  |
| 26 | `rcvVendor` | 收货委外商 | `aa.vendor.Vendor` | Service |  |
| 27 | `productionOrgId` | 生产组织 | `org.func.BaseOrg` | Service |  |
