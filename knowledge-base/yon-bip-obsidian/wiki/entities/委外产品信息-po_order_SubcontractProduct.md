---
tags: ["BIP", "元数据", "数据字典", "PO", "po.order.SubcontractProduct"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外产品信息 (`po.order.SubcontractProduct`)

> PO | 物理表：`po_order_product_subcontract`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外产品信息 |
| 物理表 | `po_order_product_subcontract` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:25:54.1900` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | 8eadf170-a715-41e1-b654-51ef707f7e90 | 订单产品id |

---

## 直接属性（153个）

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
| 35 | `free1` | 规格1 | `free1` | String |
| 36 | `free10` | 规格10 | `free10` | String |
| 37 | `free2` | 规格2 | `free2` | String |
| 38 | `free3` | 规格3 | `free3` | String |
| 39 | `free4` | 规格4 | `free4` | String |
| 40 | `free5` | 规格5 | `free5` | String |
| 41 | `free6` | 规格6 | `free6` | String |
| 42 | `free7` | 规格7 | `free7` | String |
| 43 | `free8` | 规格8 | `free8` | String |
| 44 | `free9` | 规格9 | `free9` | String |
| 45 | `hasPaymentPlan` | 是否有随单付款计划 | `has_payment_plan` | Boolean |
| 46 | `id` | 订单产品id | `id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 47 | `inStockedMoneyFC` | 累计入库金额(本币) | `instocked_money_fc` | Decimal |
| 48 | `inStockedMoneyTC` | 累计入库金额(交易币) | `instocked_money_tc` | Decimal |
| 49 | `incomingQuantityNoArrive` | 累计入库数量(无到货环节) | `incoming_quantity_no_arrive` | Decimal |
| 50 | `incomingQuantitySUNoArrive` | 累计入库件数(无到货环节) | `incoming_quantity_su_no_arrive` | Decimal |
| 51 | `invoiceStatus` | 发票状态 | `invoice_status` | Short |
| 52 | `invoicedMoneyFC` | 累计开票金额(本币) | `invoiced_money_fc` | Decimal |
| 53 | `invoicedMoneyTC` | 累计开票金额(交易币) | `invoiced_money_tc` | Decimal |
| 54 | `invoicedQuantityMU` | 累计开票数量(主单位) | `invoiced_quantity_mu` | Decimal |
| 55 | `invoicedQuantityPU` | 累计开票数量(计价单位) | `invoiced_quantity_pu` | Decimal |
| 56 | `isContinuousOsmEnd` | 是否连续委外最后一道工序 | `is_continuous_osm_end` | Boolean |
| 57 | `isPresent` | 赠品 | `is_present` | Boolean |
| 58 | `isTaxPrice` | 价格含税 | `is_taxprice` | Boolean |
| 59 | `isUpdateStock` | 是否更新存量 | `is_update_stock` | Boolean |
| 60 | `lineAttach` | 附件 | `line_attach` | String |
| 61 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 62 | `materialVerifStatus` | 材料核销状态 | `material_verif_status` | MaterialVerifiStatus |
| 63 | `natMoney` | 本币无税金额 | `natMoney` | Decimal |
| 64 | `natSum` | 本币含税金额 | `natSum` | Decimal |
| 65 | `natTax` | 本币税额 | `natTax` | Decimal |
| 66 | `natTaxUnitPrice` | 本币含税单价 | `natTaxUnitPrice` | Decimal |
| 67 | `natUnitPrice` | 本币无税单价 | `natUnitPrice` | Decimal |
| 68 | `nextId` | 后序ID | `next_id` | Long |
| 69 | `nextSn` | 后序顺序号 | `next_sn` | Decimal |
| 70 | `noRequireCheck` | 不需要委外核销 | `no_require_check` | Short |
| 71 | `noTaxPriceCat` | 无税单价(取价) | `notax_price_cat` | Decimal |
| 72 | `nonRecoverableTaxFC` | 本币不可抵扣税额 | `non_recover_tax_fc` | Decimal |
| 73 | `nonRecoverableTaxRate` | 不可抵扣税率 | `non_recover_taxrate` | Decimal |
| 74 | `nonRecoverableTaxTC` | 不可抵扣税额 | `non_recover_tax_tc` | Decimal |
| 75 | `opSn` | 工序顺序号 | `op_sn` | Decimal |
| 76 | `operationId` | 工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 77 | `oriMoney` | 原币无税金额 | `oriMoney` | Decimal |
| 78 | `oriSum` | 原币含税金额 | `oriSum` | Decimal |
| 79 | `oriTax` | 原币税额 | `oriTax` | Decimal |
| 80 | `oriTaxUnitPrice` | 原币含税单价 | `oriTaxUnitPrice` | Decimal |
| 81 | `oriUnitPrice` | 原币无税单价 | `oriUnitPrice` | Decimal |
| 82 | `payedMoneyFC` | 累计付款金额(本币) | `payed_money_fc` | Decimal |
| 83 | `payedMoneyTC` | 累计付款金额(交易币) | `payed_money_tc` | Decimal |
| 84 | `payedQuantityMU` | 累计付款数量(主单位) | `payed_quantity_mu` | Decimal |
| 85 | `payedQuantityPU` | 累计付款数量(计价单位) | `payed_quantity_pu` | Decimal |
| 86 | `paymentFC` | 应付金额(本币) | `payment_fc` | Decimal |
| 87 | `paymentProcessTotalFc` | 本币付款流程总金额 | `payment_process_total_fc` | Decimal |
| 88 | `paymentProcessTotalTc` | 付款流程总金额 | `payment_process_total_tc` | Decimal |
| 89 | `paymentStatus` | 付款状态 | `payment_status` | Short |
| 90 | `paymentTC` | 应付金额(交易币) | `payment_tc` | Decimal |
| 91 | `preId` | 前序ID | `pre_id` | Long |
| 92 | `preSn` | 前序顺序号 | `pre_sn` | Decimal |
| 93 | `priceChangeType` | 计价换算类型 | `price_change_type` | ChangeType |
| 94 | `priceSource` | 价格来源 | `price_source` | PriceSource |
| 95 | `priceUnitId` | 计价单位 | `price_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 96 | `processRptPoint` | 工序委外产品报告点 | `process_rpt_point` | Short |
| 97 | `productAuth` | 物料权限 | `subcontract_product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 98 | `productionOrgId` | 生产组织 | `production_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 99 | `projectMaterialDetailId` | 项目物资清单明细ID | `project_material_detail_id` | String |
| 100 | `puReqId` | 采购需求id | `pu_req_id` | Long |
| 101 | `puReqNo` | 采购需求单号 | `pu_req_no` | String |
| 102 | `purContractId` | 采购合同Id | `pur_contract_id` | Long |
| 103 | `purContractItemClass` | 采购合同物料分类 | `pur_ct_item_class` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 104 | `purContractLineId` | 采购合同行Id | `pur_contract_line_id` | Long |
| 105 | `purContractLineNo` | 采购合同行号 | `pur_contract_line_no` | Long |
| 106 | `purContractNo` | 采购合同号 | `pur_contract_no` | String |
| 107 | `rcvAddrType` | 收货地址类型 | `rcv_addr_type` | Integer |
| 108 | `rcvCustomer` | 收货客户 | `rcv_customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 109 | `rcvVendor` | 收货委外商 | `rcv_vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 110 | `refuseQuantity` | 累计拒收数量 | `refuse_quantity` | Decimal |
| 111 | `refuseSubQuantity` | 累计拒收件数 | `refuse_sub_quantity` | Decimal |
| 112 | `replenishQuantity` | 拒收需补货数量 | `replenish_quantity` | Decimal |
| 113 | `replenishSubQuantity` | 拒收需补货件数 | `replenish_sub_quantity` | Decimal |
| 114 | `requestedPaymentFC` | 累计付款申请金额(本币) | `requested_payment_fc` | Decimal |
| 115 | `requestedPaymentTC` | 累计付款申请金额(交易币) | `requested_payment_tc` | Decimal |
| 116 | `returnQtyMU` | 累计退货数量 | `return_qty_mu` | Decimal |
| 117 | `returnQtyNoOutMU` | 累计退货未退库数量 | `return_qty_no_out_mu` | Decimal |
| 118 | `returnQuantityMU` | 累计退库数量(主单位) | `return_quantity_mu` | Decimal |
| 119 | `returnQuantitySU` | 累计退库数量(委外单位) | `return_quantity_su` | Decimal |
| 120 | `sourcePoOrderCode` | 来源生产订单号 | `source_po_order_code` | String |
| 121 | `sourcePoOrderId` | 来源生产订单ID | `source_po_order_id` | Long |
| 122 | `sourcePoOrderProcessId` | 来源生产订单工序ID | `source_po_order_process_id` | Long |
| 123 | `sourcePoOrderProductId` | 来源生产订单行ID | `source_po_order_product_id` | Long |
| 124 | `sourcePoOrderProductRowno` | 来源生产订单行号 | `source_po_order_product_rowno` | Decimal |
| 125 | `sourceSfcProcPlanId` | 来源工序作业计划ID | `source_sfc_proc_plan_id` | Long |
| 126 | `srId` | 委外申请单Id | `sr_id` | Long |
| 127 | `srLineId` | 委外申请单行Id | `sr_line_id` | Long |
| 128 | `srLineNo` | 委外申请单行号 | `sr_line_no` | Decimal |
| 129 | `srNo` | 委外申请单号 | `sr_no` | String |
| 130 | `startOpSn` | 开始工序顺序号 | `start_op_sn` | Decimal |
| 131 | `subcontractMaterialId` | 制造物料 | `subcontract_material_id` | Long |
| 132 | `subcontractProductId` | 物料Id | `subcontract_product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 133 | `subcontractQuantityMU` | 委外数量 | `subcontract_quantity_mu` | Decimal |
| 134 | `subcontractQuantityPU` | 计价数量 | `subcontract_quantity_pu` | Decimal |
| 135 | `subcontractQuantitySU` | 委外件数 | `subcontract_quantity_su` | Decimal |
| 136 | `subcontractSkuId` | SKU | `subcontract_sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 137 | `subcontractToPrice` | 计价换算率 | `subcontract_to_price` | Decimal |
| 138 | `subcontractUnitId` | 委外单位 | `subcontract_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 139 | `supplyVirtualAccbodyId` | 供方利润中心ID | `supply_virtual_accbody_id` | e33ec72a-3857-4167-89e2-a437168ed3bb |
| 140 | `taxPriceCat` | 含税单价(取价) | `tax_price_cat` | Decimal |
| 141 | `taxRate` | 税率 | `taxRate` | Decimal |
| 142 | `taxRateId` | 税目 | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 143 | `tcOrgAccountSon` | 跨组织委外结算 | `tc_org_account_son` | Short |
| 144 | `tcOrgIdSon` | 收票组织 | `tc_org_id_son` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 |
| 145 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 146 | `throwStatus` | 抛转状态 | `throw_status` | ThrowStatus |
| 147 | `totalPaymentFC` | 累计付款金额(本币) | `total_payment_fc` | Decimal |
| 148 | `totalPaymentTC` | 累计付款金额(交易币) | `total_payment_tc` | Decimal |
| 149 | `tradePath` | 贸易路径 | `trade_path` | c69f1d6a-783c-4f79-b446-b4da14cb7fff |
| 150 | `vendorProductCode` | 供应商物料编码 | `vendor_product_code` | String |
| 151 | `vendorProductName` | 供应商物料名称 | `vendor_product_name` | String |
| 152 | `verificationStatus` | 核销状态 | `verification_status` | Short |
| 153 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（24个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplyVirtualAccbodyId` | 供方利润中心ID | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 2 | `priceUnitId` | 计价单位 | `pc.unit.Unit` | Service |  |
| 3 | `demandUnitId` | 需求单位 | `pc.unit.Unit` | Service |  |
| 4 | `purContractItemClass` | 采购合同物料分类 | `pc.cls.ManagementClass` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `rcvCustomer` | 收货客户 | `aa.merchant.Merchant` | Service |  |
| 7 | `subcontractUnitId` | 委外单位 | `pc.unit.Unit` | Service |  |
| 8 | `demandDepartmentId` | 需求部门 | `aa.baseorg.DeptMV` | Service |  |
| 9 | `demandVirtualAccbodyId` | 需方利润中心ID | `bd.virtualaccbody.VirtualAccbody` | Service |  |
| 10 | `demandOrgId` | 需求组织 | `org.func.BaseOrg` | Service |  |
| 11 | `costCenterId` | 成本中心ID | `bd.costcenter.CostCenter` | Service |  |
| 12 | `demandOperatorId` | 需求人员 | `bd.staff.Staff` | Service |  |
| 13 | `tradePath` | 贸易路径 | `sccs.multitrade.TradeRoute` | Service |  |
| 14 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 15 | `subcontractSkuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 16 | `operationId` | 工序ID | `ed.operation.Operation` | Service |  |
| 17 | `tcOrgIdSon` | 收票组织 | `org.func.FinanceOrg` | Service |  |
| 18 | `id` | 订单产品id | `po.order.OrderProduct` | None | true |
| 19 | `subcontractProductId` | 物料Id | `pc.product.Product` | Service |  |
| 20 | `taxRateId` | 税目 | `archive.taxArchives.TaxRateArchive` | Service |  |
| 21 | `rcvVendor` | 收货委外商 | `aa.vendor.Vendor` | Service |  |
| 22 | `productionOrgId` | 生产组织 | `org.func.BaseOrg` | Service |  |
| 23 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 24 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
