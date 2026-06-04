---
tags: ["BIP", "元数据", "数据字典", "ycPurchaseSynergy", "check.checkpool.GodownEntryDetailVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 对账事项表体 (`check.checkpool.GodownEntryDetailVO`)

> ycPurchaseSynergy | 物理表：`cpu_godownentry_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 对账事项表体 |
| 物理表 | `cpu_godownentry_detail` |
| 数据库 schema | `cpu-cooperation` |
| 所属应用 | `ycPurchaseSynergy` |
| 构建时间 | `2026-06-04 23:32:21.7290` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（242个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `actualInPurNum` | 实收采购数量 | `actual_in_pur_num` | Decimal |
| 2 | `GodownEntryDetailVOFreeCharacteristics` | 自由项特征组实体 | `godown_entry_detail_free_characteristics` | 8e995667-c522-42a4-a5c6-9806ab1d9643 |
| 3 | `GodownEntryDetailVODefineCharacter` | 表体自定义项特征属性 | `godown_entry_detail_define_character` | 050e0497-ecc4-4749-9f17-11126c8b65c1 |
| 4 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 5 | `dr` | 删除标识 | `dr` | Integer |
| 6 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 7 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 8 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 10 | `id` | ID | `id` | Long |
| 11 | `erpGodownBrowno` | 对应上游表体行号 | `erp_godown_browno` | String |
| 12 | `erpMaterialId` | 对应erp物料主键 | `erp_material_id` | String |
| 13 | `materialCode` | 物料编码 | `material_code` | String |
| 14 | `materialName` | 物料名称 | `material_name` | String |
| 15 | `materialSkuId` | 物料SKU | `material_sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 16 | `materialSkuCode` | 物料sku编码 | `material_sku_code` | String |
| 17 | `materialSkuName` | 物料sku名称 | `material_sku_name` | String |
| 18 | `erpMaterialSpe` | erp物料规格 | `erp_material_spe` | String |
| 19 | `erpUnit` | erp单位 | `erp_unit` | String |
| 20 | `godownNum` | 可开票数量 | `godown_num` | Decimal |
| 21 | `checkRecordId` | 检验记录主键 | `check_record_id` | Long |
| 22 | `batchno` | 批次号 | `batchno` | String |
| 23 | `erpOrderCode` | ERP订单号 | `erp_order_code` | String |
| 24 | `prepaidDeductedMainNum` | 提前开票已扣主数量 | `prepaid_deducted_main_num` | Decimal |
| 25 | `prepaidDeductedTaxMny` | 提前开票已扣含税金额 | `prepaid_deducted_tax_mny` | Decimal |
| 26 | `prepaidDeductedMny` | 提前开票已扣无税金额 | `prepaid_deducted_mny` | Decimal |
| 27 | `advanceInvoiceMainNum` | 提前开票主数量 | `advance_invoice_main_num` | Decimal |
| 28 | `advanceInvoicePurNum` | 提前开票采购数量 | `advance_invoice_pur_num` | Decimal |
| 29 | `advanceInvoiceNum` | 提前开票计价数量 | `advance_invoice_num` | Decimal |
| 30 | `advanceInvoiceTaxMny` | 提前开票含税金额 | `advance_invoice_tax_mny` | Decimal |
| 31 | `advanceInvoiceMny` | 提前开票无税金额 | `advance_invoice_mny` | Decimal |
| 32 | `saleinvoiceTaxMny` | 销售发票未发布含税金额 | `saleinvoice_tax_mny` | Decimal |
| 33 | `saleinvoiceMny` | 销售发票未发布无税金额 | `saleinvoice_mny` | Decimal |
| 34 | `actualTaxMny` | 实收含税金额 | `actual_taxmny` | Decimal |
| 35 | `actualMny` | 实收无税金额 | `actual_mny` | Decimal |
| 36 | `actualTax` | 实收税额 | `actual_tax` | Decimal |
| 37 | `erpInvoicedMainNum` | ERP已开票主数量 | `erp_invoiced_main_num` | Decimal |
| 38 | `erpInvoicedNum` | ERP已开票计价数量 | `erp_invoiced_num` | Decimal |
| 39 | `erpInvoicedPurNum` | ERP已开票采购数量 | `erp_invoiced_pur_num` | Decimal |
| 40 | `erpInvoicedTaxMny` | ERP已开票含税金额 | `erp_invoiced_tax_mny` | Decimal |
| 41 | `erpInvoicedMny` | ERP已开票无税金额 | `erp_invoiced_mny` | Decimal |
| 42 | `calculationPattern` | 计算基准 | `calculation_pattern` | Integer |
| 43 | `warehouseId` | 仓库ID | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 44 | `warehouseName` | 仓库名称 | `warehouse_name` | String |
| 45 | `warehouseCode` | 仓库编码 | `warehouse_code` | String |
| 46 | `activity` | 活动主键 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 47 | `mnyBeforeSettlement` | 价格结算前无税金额 | `mny_before_pettlement` | Decimal |
| 48 | `ctjlId` | 合同台账主键 | `ctjl_id` | Long |
| 49 | `priceRecordId` | 取价主键 | `price_record_id` | Long |
| 50 | `operationCode` | 工序编码 | `operation_code` | String |
| 51 | `expenseItemName` | 费用项目 | `expense_item_name` | String |
| 52 | `activityCode` | 活动编码 | `activity_code` | String |
| 53 | `confirmNum` | 确认数量 | `confirm_num` | Decimal |
| 54 | `qualityPriceSchemeId` | 优质优价方案主键 | `quality_price_scheme_id` | c7cc8895-2b03-4c7d-a327-da6e09410f76 |
| 55 | `erpSourceBillType` | ERP来源单据类型 | `erp_source_bill_type` | String |
| 56 | `payRatio` | 付款比例 | `pay_ratio` | Decimal |
| 57 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 58 | `priceNumBeforeSettlement` | 价格结算前计价数量 | `price_num_before_pettlement` | Decimal |
| 59 | `mainNumBeforeSettlement` | 价格结算前数量 | `main_num_before_pettlement` | Decimal |
| 60 | `clutteredPriceNum` | 扣杂计价数量 | `cluttered_price_num` | Decimal |
| 61 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 62 | `wbsName` | WBS任务 | `wbs_name` | String |
| 63 | `costcenterId` | 成本中心主键 | `costcenter_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 64 | `taxRateId` | 税目 | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 65 | `period` | 阶段 | `period` | String |
| 66 | `activityName` | 活动 | `activity_name` | String |
| 67 | `materialClassCode` | 物料分类编码 | `material_class_code` | String |
| 68 | `purNumBeforeSettlement` | 价格结算前采购数量 | `pur_num_before_pettlement` | Decimal |
| 69 | `priceRowno` | 价格结算子表行号 | `price_rowno` | Integer |
| 70 | `priceBeforeSettlement` | 价格结算前无税单价 | `price_before_pettlement` | Decimal |
| 71 | `costcenterName` | 成本中心 | `costcenter_name` | String |
| 72 | `operationId` | 工序 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 73 | `ctjlCode` | 合同台账编号 | `ctjl_code` | String |
| 74 | `materialClassId` | 物料分类 | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 75 | `checkUnit` | 商品单位 | `check_unit` | String |
| 76 | `expenseItemId` | 费用项目主键 | `expense_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 |
| 77 | `isAllowSupplier` | 是否允许供应商发起对账 | `is_allow_supplier` | String |
| 78 | `materialClassName` | 物料分类名称 | `material_class_name` | String |
| 79 | `wbsCode` | WBS任务编码 | `wbs_code` | String |
| 80 | `taxPriceBeforeSettlement` | 价格结算前含税单价 | `tax_price_before_pettlement` | Decimal |
| 81 | `sourceBillBid` | 来源单据子表主键 | `source_bill_bid` | Long |
| 82 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 83 | `qualityPriceSchemeName` | 优质优价方案 | `quality_price_scheme_name` | String |
| 84 | `operationName` | 工序名称 | `operation_name` | String |
| 85 | `clutteredMainNum` | 扣杂数量 | `cluttered_main_num` | Decimal |
| 86 | `taxMnyBeforeSettlement` | 价格结算前含税金额 | `tax_mny_before_pettlement` | Decimal |
| 87 | `erpSourceType` | 来源单据类型 | `erp_source_type` | String |
| 88 | `erpSourceHno` | 来源单据号 | `erp_source_hno` | String |
| 89 | `erpFirstbillType` | 源头单据类型 | `erp_firstbill_type` | String |
| 90 | `erpFirstbillHno` | 源头单据号 | `erp_firstbill_hno` | String |
| 91 | `erpFirstbillBno` | 源头单据表体行号 | `erp_firstbill_bno` | String |
| 92 | `erpStockwh` | 库存仓库 | `erp_stockwh` | String |
| 93 | `godownBdate` | 入库时间 | `godown_bdate` | DateTime |
| 94 | `erpMainUnit` | 主单位 | `erp_main_unit` | String |
| 95 | `mainPrice` | 主无税单价 | `main_price` | Decimal |
| 96 | `mainTaxPrice` | 主含税单价 | `main_tax_price` | Decimal |
| 97 | `calCostMny` | 计成本金额 | `cal_cost_mny` | Decimal |
| 98 | `calTaxMny` | 计税金额 | `cal_tax_mny` | Decimal |
| 99 | `erpOrderId` | ERP订单id | `erp_order_id` | String |
| 100 | `erpOrderBid` | ERP订单行id | `erp_order_bid` | String |
| 101 | `erpArriveorderId` | ERP到货单id | `erp_arriveorder_id` | String |
| 102 | `erpArriveorderBid` | ERP到货单行id | `erp_arriveorder_bid` | String |
| 103 | `changestdRate` | 折本汇率 | `changestd_rate` | String |
| 104 | `changeRate` | 换算率 | `change_rate` | String |
| 105 | `erpReqwh` | 需求仓库 | `erp_reqwh` | String |
| 106 | `bodyReturnReasn` | 退货理由 | `body_return_reasn` | String |
| 107 | `erpFirsttransType` | 源头交易类型 | `erp_firsttrans_type` | String |
| 108 | `erpSourcetransType` | 来源交易类型 | `erp_sourcetrans_type` | String |
| 109 | `stkwhcode` | 库存仓库编码 | `stkwhcode` | String |
| 110 | `stkwhname` | 库存仓库名称 | `stkwhname` | String |
| 111 | `materialId` | 物料主键 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 112 | `unitCode` | 单位编码 | `unit_code` | String |
| 113 | `erpSourceBno` | 来源单据行号 | `erp_source_bno` | String |
| 114 | `mainUnitCode` | 主单位编码 | `main_unit_code` | String |
| 115 | `taxtypeFlag` | 扣税类别 | `taxtype_flag` | String |
| 116 | `purUnit` | 采购单位id | `pur_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 117 | `purUnitCode` | 采购单位编码 | `pur_unit_code` | String |
| 118 | `priceMark` | 价格标识 | `price_mark` | String |
| 119 | `purUnitName` | 采购单位名称 | `pur_unit_name` | String |
| 120 | `currencyCode` | 币种编码 | `currency_code` | String |
| 121 | `currencyName` | 币种名称 | `currency_name` | String |
| 122 | `contractBillno` | 合同号 | `contract_billno` | String |
| 123 | `bcompCode` | 公司编码 | `bcomp_code` | String |
| 124 | `bcompName` | 公司名称 | `bcomp_name` | String |
| 125 | `orderCode` | 订单号 | `order_code` | String |
| 126 | `reqStkorgCode` | 需求库存组织编码 | `req_stkorg_code` | String |
| 127 | `arriveorderCode` | 到货单号 | `arriveorder_code` | String |
| 128 | `reqStkorgName` | 需求库存组织名称 | `req_stkorg_name` | String |
| 129 | `reqwhCode` | 需求仓库编码 | `reqwh_code` | String |
| 130 | `wareSkuName` | 商品SKU名称 | `ware_sku_name` | String |
| 131 | `reqwhName` | 需求仓库名称 | `reqwh_name` | String |
| 132 | `pubts` | 时间戳 | `ts` | DateTime |
| 133 | `wareSkuCode` | 商品SKU编码 | `ware_sku_code` | String |
| 134 | `actualInNum` | 实收数量 | `actual_in_num` | Decimal |
| 135 | `actualInMainNum` | 实收主数量 | `actual_in_main_num` | Decimal |
| 136 | `invoicedRealMainNum` | 累计开票数量(主单位) | `invoiced_real_main_num` | Decimal |
| 137 | `invoicedMny` | 累计开票金额 | `invoiced_mny` | Decimal |
| 138 | `invoicedTaxMny` | 累计开票含税金额 | `invoiced_tax_mny` | Decimal |
| 139 | `materialSpec` | 物料规格 | `material_spec` | String |
| 140 | `materialModel` | 物料型号 | `material_model` | String |
| 141 | `confirmBrand` | 品牌 | `confirm_brand` | String |
| 142 | `checkStatus` | 核对状态 | `check_status` | String |
| 143 | `deliveryorderCode` | 发货单号 | `deliveryorder_code` | String |
| 144 | `checkStatusBefore` | 对账修改前状态 | `check_status_before` | String |
| 145 | `detailCheckUserId` | 对账人ID | `detail_check_user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 146 | `detailCheckUserName` | 对账人名称 | `detail_check_user_name` | String |
| 147 | `detailCheckStaupdUserId` | 操作人ID | `detail_check_staupd_userid` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 148 | `detailCheckStaupdUserName` | 操作人名称 | `detail_check_staupd_username` | String |
| 149 | `mainUnitName` | 主单位 | `main_unit_name` | String |
| 150 | `currencyId` | 币种ID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 151 | `currencySymbol` | 币种符号 | `currency_symbol` | String |
| 152 | `invPurExchRate` | 采购单位换算率 | `inv_pur_exch_rate` | Decimal |
| 153 | `detailBillcode` | 对账单号 | `detail_billcode` | String |
| 154 | `invoiceBizTypeCode` | 发票方式: 1-先货后票 2-货票同行 3-先票后货 | `invoice_biz_type_code` | Integer |
| 155 | `unitName` | 计价单位 | `unit_name` | String |
| 156 | `invPriceExchRate` | 计价换算率 | `inv_price_exch_rate` | Decimal |
| 157 | `invoiceNo` | 发票号 | `invoice_no` | String |
| 158 | `signnum` | 签收数量 | `signnum` | Decimal |
| 159 | `totalNum` | 计价数量 | `total_num` | Decimal |
| 160 | `diffReceivedNum` | 收货差异数量 | `diff_received_num` | Decimal |
| 161 | `totalPurNum` | 采购数量 | `total_pur_num` | Decimal |
| 162 | `taxAmount` | 税额 | `tax_amount` | Decimal |
| 163 | `totalMainNum` | 主数量 | `total_main_num` | Decimal |
| 164 | `deliveryBrand` | 发货品牌 | `delivery_brand` | String |
| 165 | `taxRate` | 税率 | `tax_rate` | String |
| 166 | `upcode` | 上游单据号 | `upcode` | String |
| 167 | `taxPrice` | 含税单价 | `tax_price` | Decimal |
| 168 | `source` | 上游单据类型 | `source` | String |
| 169 | `price` | 无税单价 | `price` | Decimal |
| 170 | `taxMny` | 含税金额 | `tax_mny` | Decimal |
| 171 | `mny` | 无税金额 | `mny` | Decimal |
| 172 | `chargebackTaxMny` | 品质扣款含税金额 | `chargeback_tax_mny` | Decimal |
| 173 | `chargebackMny` | 品质扣款无税金额 | `chargeback_mny` | Decimal |
| 174 | `invoicedNum` | 已开票计价数量 | `invoiced_num` | Decimal |
| 175 | `invoicedMainNum` | 已开票主数量 | `invoiced_main_num` | Decimal |
| 176 | `invoicedPurNum` | 已开票采购数量 | `invoiced_pur_num` | Decimal |
| 177 | `puinvoiceNum` | 采购发票计价数量 | `puinvoice_num` | Decimal |
| 178 | `puinvoiceMainNum` | 采购发票主数量 | `puinvoice_main_num` | Decimal |
| 179 | `puinvoicePurNum` | 采购发票采购数量 | `puinvoice_pur_num` | Decimal |
| 180 | `saleinvoiceNum` | 销售发票未发布计价数量 | `saleinvoice_num` | Decimal |
| 181 | `saleinvoiceMainNum` | 销售发票未发布主数量 | `saleinvoice_main_num` | Decimal |
| 182 | `saleinvoicePurNum` | 销售发票未发布采购数量 | `saleinvoice_pur_num` | Decimal |
| 183 | `noInvoicedNum` | 可开票计价数量 | `no_invoiced_num` | Decimal |
| 184 | `godownMainNum` | 可开票主数量 | `godown_main_num` | Decimal |
| 185 | `godownPurNum` | 可开票采购数量 | `godown_pur_num` | Decimal |
| 186 | `detailBalanceStatus` | 对账状态 | `detail_balance_status` | String |
| 187 | `detailCheckDate` | 对账日期 | `detail_check_date` | DateTime |
| 188 | `detailCheckStaupdDate` | 操作时间 | `detail_check_staupd_date` | DateTime |
| 189 | `deliveryMainNum` | 发货主数量 | `delivery_main_num` | Decimal |
| 190 | `deliveryPurNum` | 发货采购数量 | `delivery_pur_num` | Decimal |
| 191 | `deliveryNum` | 发货数量 | `delivery_num` | Decimal |
| 192 | `projectCode` | 项目编码 | `project_code` | String |
| 193 | `memo` | 表体备注 | `bmemo` | String |
| 194 | `projectName` | 项目名称 | `project_name` | String |
| 195 | `reqStkorgId` | 需求库存组织主键 | `req_stkorg_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 196 | `formulaId` | 价格公式ID | `formula_id` | 97790819-6d1f-4b4b-8d1c-f6d78b6531e4 |
| 197 | `formulaCode` | 价格公式编码 | `formula_code` | String |
| 198 | `formulaName` | 价格公式名称 | `formula_name` | String |
| 199 | `formulaShow` | 价格公式 | `formula_show` | String |
| 200 | `formulaCalculation` | 价格公式算式 | `formula_calculation` | String |
| 201 | `unitid` | 计价单位id | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 202 | `mainUnitid` | 主单位id | `main_unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 203 | `arriveorderId` | 到货单id | `arriveorder_id` | Long |
| 204 | `arriveorderDetailId` | 到货单行id | `arriveorder_detail_id` | Long |
| 205 | `pritemId` | 采购需求id | `pritemid` | Long |
| 206 | `saleOrderCode` | 销售订单号 | `saleorder_code` | String |
| 207 | `contractId` | 采购合同id | `contract_id` | Long |
| 208 | `contractmaterialId` | 采购合同物料id | `contractmaterial_id` | Long |
| 209 | `createTime` | 创建时间 | `create_time` | DateTime |
| 210 | `deliveryorderId` | 发货主键 | `deliveryorder_id` | Long |
| 211 | `deliveryorderdetailId` | 发货表体主键 | `deliveryorderdetail_id` | Long |
| 212 | `erpCompanyBid` | ERP公司主键 | `erp_company_bid` | String |
| 213 | `erpCompanyBvid` | ERP公司版本主键 | `erp_company_bvid` | String |
| 214 | `erpCurrencyId` | erp币种id | `erp_currency_id` | String |
| 215 | `erpFirstbillBid` | 源头单据表体主键 | `erp_firstbill_bid` | String |
| 216 | `erpFirstbillHid` | 源头单据表头主键 | `erp_firstbill_hid` | String |
| 217 | `erpGodownBid` | 对应erp入库单表体主键 | `erp_godown_bid` | String |
| 218 | `erpGodownHid` | 对应erp入库单表头主键 | `erp_godown_hid` | String |
| 219 | `erpMaterialVid` | erp物料VID | `erp_material_vid` | String |
| 220 | `erpProjectId` | 项目ERPID | `erp_project_id` | String |
| 221 | `erpReqstoorgId` | 需求库存组织id | `erp_reqstoorg_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 222 | `erpReqstoorgVid` | 需求库存组织vid | `erp_reqstoorg_vid` | String |
| 223 | `erpSourceBid` | 来源单据表体行主键 | `erp_source_bid` | String |
| 224 | `erpSourceHid` | 来源单据表头主键 | `erp_source_hid` | String |
| 225 | `erpSupplyBid` | 供应商 | `erp_supply_bid` | String |
| 226 | `godownentryId` | 对账池主表id | `godownentry_id` | 3cf2adf0-16c3-4d8e-a9d5-69583d569914 |
| 227 | `orderId` | 采购订单id | `order_id` | Long |
| 228 | `orderDetailId` | 采购订单明细id | `order_detail_id` | Long |
| 229 | `projectId` | 项目id | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 230 | `saleOrderId` | 云采销售订单id | `sale_order_id` | Long |
| 231 | `saleorderDetailId` | 云采销售订单明细id | `saleorder_detail_id` | Long |
| 232 | `sourceautoid` | 上游单据子表id | `sourceautoid` | String |
| 233 | `sourceid` | 上游单据主表id | `sourceid` | String |
| 234 | `bCost` | 影响成本 | `b_cost` | Boolean |
| 235 | `defines` | 对账事项表体自定义项 | `` | c933e4dc-07e1-468a-8aa7-daf557891a9f |
| 236 | `expenseAccountMethod` | 立账方式 | `expense_account_method` | String |
| 237 | `invPriceExchRateDen` | 计价单位换算率分母 | `invpriceexchrateden` | Decimal |
| 238 | `invPriceExchRateNum` | 计价单位换算率分子 | `invpriceexchratenum` | Decimal |
| 239 | `invPurExchRateDen` | 采购单位换算率分母 | `inv_pur_exch_rateden` | Decimal |
| 240 | `invPurExchRateNum` | 采购单位换算率分子 | `inv_pur_exch_ratenum` | Decimal |
| 241 | `lineno` | 行号 | `lineno` | Decimal |
| 242 | `makeruleCode` | 生单规则编号 | `makerule_code` | String |

---

## 关联属性（26个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `expenseItemId` | 费用项目主键 | `bd.expenseitem.ExpenseItem` | Service |  |
| 2 | `activity` | 活动主键 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 3 | `detailCheckUserId` | 对账人ID | `bd.staff.Staff` | Service |  |
| 4 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 5 | `GodownEntryDetailVODefineCharacter` | 表体自定义项特征属性 | `check.checkpool.UserDefineDteailCharacteristics` | None |  |
| 6 | `defines` | 对账事项表体自定义项 | `check.checkpool.GodownEntryDetailVODefine` | None | true |
| 7 | `costcenterId` | 成本中心主键 | `bd.costcenter.CostCenter` | Service |  |
| 8 | `qualityPriceSchemeId` | 优质优价方案主键 | `aa.qualitypricescheme.QualitypriceScheme` | Service |  |
| 9 | `operationId` | 工序 | `ed.operation.Operation` | Service |  |
| 10 | `erpReqstoorgId` | 需求库存组织id | `org.func.BaseOrg` | Service |  |
| 11 | `currencyId` | 币种ID | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 12 | `taxRateId` | 税目 | `archive.taxArchives.TaxRateArchive` | Service |  |
| 13 | `detailCheckStaupdUserId` | 操作人ID | `bd.staff.Staff` | Service |  |
| 14 | `GodownEntryDetailVOFreeCharacteristics` | 自由项特征组实体 | `check.checkpool.FreePropertyCharacteristics` | None |  |
| 15 | `materialClassId` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
| 16 | `materialSkuId` | 物料SKU | `pc.product.ProductSKU` | Service |  |
| 17 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 18 | `materialId` | 物料主键 | `pc.product.Product` | Service |  |
| 19 | `formulaId` | 价格公式ID | `aa.priceformula.PriceFormula` | Service |  |
| 20 | `reqStkorgId` | 需求库存组织主键 | `org.func.BaseOrg` | Service |  |
| 21 | `warehouseId` | 仓库ID | `aa.warehouse.Warehouse` | Service |  |
| 22 | `unitid` | 计价单位id | `pc.unit.Unit` | Service |  |
| 23 | `godownentryId` | 对账池主表id | `check.checkpool.GodownEntryVO` | None | true |
| 24 | `projectId` | 项目id | `bd.project.ProjectVO` | Service |  |
| 25 | `purUnit` | 采购单位id | `pc.unit.Unit` | Service |  |
| 26 | `mainUnitid` | 主单位id | `pc.unit.Unit` | Service |  |
