---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "check.salecheckbill.SaleCheckBillMaterialVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售对账单孙表 (`check.salecheckbill.SaleCheckBillMaterialVO`)

> ycSaleCoor | 物理表：`sale_checkbill_m`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售对账单孙表 |
| 物理表 | `sale_checkbill_m` |
| domain/服务域 | `cpu-cooperation` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:05.9060` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `checkbill_mid` | String | id |

---

## 直接属性（268个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `SaleCheckBillMaterialVODefineCharacter` | 自定义项特征属性 | `sale_check_bill_material_define_character` | d638069e-6c67-4bf9-9166-935d373a78cd |
| 2 | `SaleCheckBillMaterialVOFreeCharacteristics` | 自由项特征组实体 | `sale_checkbill_free_characteristics` | e120d4d9-277b-410c-8625-1eeb4ba7fa8b |
| 3 | `createDate` | 创建日期 | `create_date` | Date |
| 4 | `createTime` | 创建时间 | `create_time` | DateTime |
| 5 | `creator` | 创建人名称 | `creator` | String |
| 6 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `dr` | 删除标识 | `dr` | Integer |
| 8 | `modifier` | 修改人名称 | `modifier` | String |
| 9 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 12 | `hstoId` | 仓库id | `hsto_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 13 | `receiveOrgName` | 收货组织 | `receive_org_name` | String |
| 14 | `receiveOrg` | 收货组织 | `receive_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 15 | `ajustNum` | 调整数量 | `ajust_num` | Decimal |
| 16 | `puOrgName` | 采购单据组织名称 | `pu_org_name` | String |
| 17 | `matchId` | 采购销售单据匹配id | `match_id` | 3cf2adf0-16c3-4d8e-a9d5-69583d569914 |
| 18 | `matchBid` | 采购销售单据匹配bid | `match_bid` | ab07448d-8aa8-4c93-9981-1d80f2638c0e |
| 19 | `tenantId` | 供应商租户id{cpu_auth.cpu_enterprise} | `tenant_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 20 | `pkOrg` | 采购组织id{org_orgs} | `pk_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 21 | `orgCode` | orgCode | `org_code` | String |
| 22 | `orgName` | 组织名称 | `org_name` | String |
| 23 | `puPkOrg` | 采购单据组织id{org_orgs} | `pu_pk_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 24 | `puOrgCode` | 采购组织编码 | `pu_org_code` | String |
| 25 | `puBillId` | 采购 单据id | `pu_bill_id` | String |
| 26 | `calculationPattern` | 计算基准 | `calculation_pattern` | Integer |
| 27 | `puWareClassId` | 物料分类 | `pu_ware_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 28 | `puWareClassCode` | 物料分类编码 | `pu_ware_class_code` | String |
| 29 | `puWareClassName` | 物料分类名称 | `pu_ware_class_name` | String |
| 30 | `sourceTransName` | 来源交易类型名称 | `source_trans_name` | String |
| 31 | `formulaId` | 价格公式ID | `formula_id` | 97790819-6d1f-4b4b-8d1c-f6d78b6531e4 |
| 32 | `formulaCode` | 价格公式编码 | `formula_code` | String |
| 33 | `formulaName` | 价格公式名称 | `formula_name` | String |
| 34 | `formulaShow` | 价格公式 | `formula_show` | String |
| 35 | `formulaCalculation` | 价格公式算式 | `formula_calculation` | String |
| 36 | `checkUnit` | 商品单位 | `check_unit` | String |
| 37 | `ctjlCode` | 合同台账编号 | `ctjl_code` | String |
| 38 | `costcenterId` | 成本中心主键 | `costcenter_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 39 | `costcenterName` | 成本中心 | `costcenter_name` | String |
| 40 | `expenseItemId` | 费用项目主键 | `expense_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 |
| 41 | `expenseItemName` | 费用项目 | `expense_item_name` | String |
| 42 | `ctjlId` | 合同台账主键 | `ctjl_id` | Long |
| 43 | `period` | 阶段 | `period` | String |
| 44 | `confirmNum` | 确认数量 | `confirm_num` | Decimal |
| 45 | `payRatio` | 付款比例 | `pay_ratio` | Decimal |
| 46 | `invoiceStatus` | 开票状态 | `invoice_status` | String |
| 47 | `puTaxRateId` | 原税目 | `pu_taxrate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 48 | `adjustTaxRateId` | 调整税目 | `adjust_taxrate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 49 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 50 | `mainNumBeforeSettlement` | 价格结算前数量 | `main_num_before_pettlement` | Decimal |
| 51 | `priceNumBeforeSettlement` | 价格结算前计价数量 | `price_num_before_pettlement` | Decimal |
| 52 | `purNumBeforeSettlement` | 价格结算前采购数量 | `pur_num_before_pettlement` | Decimal |
| 53 | `clutteredMainNum` | 扣杂数量 | `cluttered_main_num` | Decimal |
| 54 | `clutteredPriceNum` | 扣杂计价数量 | `cluttered_price_num` | Decimal |
| 55 | `taxMnyBeforeSettlement` | 价格结算前含税金额 | `tax_mny_before_pettlement` | Decimal |
| 56 | `mnyBeforeSettlement` | 价格结算前无税金额 | `mny_before_pettlement` | Decimal |
| 57 | `taxPriceBeforeSettlement` | 价格结算前含税单价 | `tax_price_before_pettlement` | Decimal |
| 58 | `priceBeforeSettlement` | 价格结算前无税单价 | `price_before_pettlement` | Decimal |
| 59 | `batchno` | 批次号 | `batchno` | String |
| 60 | `checkRecordId` | 检验记录主键 | `check_record_id` | Long |
| 61 | `qualityPriceSchemeId` | 优质优价方案主键 | `quality_price_scheme_id` | c7cc8895-2b03-4c7d-a327-da6e09410f76 |
| 62 | `qualityPriceSchemeName` | 优质优价方案 | `quality_price_scheme_name` | String |
| 63 | `sourceBillBid` | 来源单据子表主键 | `source_bill_bid` | Long |
| 64 | `priceRecordId` | 取价主键 | `price_record_id` | Long |
| 65 | `priceRowno` | 价格结算子表行号 | `price_rowno` | Integer |
| 66 | `erpSourceBillType` | ERP来源单据类型 | `erp_source_bill_type` | String |
| 67 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 68 | `wbsName` | WBS任务 | `wbs_name` | String |
| 69 | `wbsCode` | WBS任务编码 | `wbs_code` | String |
| 70 | `activity` | 活动主键 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 71 | `activityName` | 活动 | `activity_name` | String |
| 72 | `activityCode` | 活动编码 | `activity_code` | String |
| 73 | `actualTax` | 实对税额 | `actual_tax` | Decimal |
| 74 | `actualPrice` | 实对无税单价 | `actual_price` | Decimal |
| 75 | `actualTaxprice` | 实对含税单价 | `actual_taxprice` | Decimal |
| 76 | `operationId` | 工序 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 77 | `operationName` | 工序名称 | `operation_name` | String |
| 78 | `operationCode` | 工序编码 | `operation_code` | String |
| 79 | `erpOrderCode` | ERP订单号 | `erp_order_code` | String |
| 80 | `advanceInvoiceMainNum` | 提前开票主数量 | `advance_invoice_main_num` | Decimal |
| 81 | `advanceInvoicePurNum` | 提前开票采购数量 | `advance_invoice_pur_num` | Decimal |
| 82 | `advanceInvoiceNum` | 提前开票计价数量 | `advance_invoice_num` | Decimal |
| 83 | `advanceInvoiceTaxMny` | 提前开票含税金额 | `advance_invoice_tax_mny` | Decimal |
| 84 | `advanceInvoiceMny` | 提前开票无税金额 | `advance_invoice_mny` | Decimal |
| 85 | `erpInvoicedMainNum` | ERP已开票主数量 | `erp_invoiced_main_num` | Decimal |
| 86 | `erpInvoicedNum` | ERP已开票计价数量 | `erp_invoiced_num` | Decimal |
| 87 | `erpInvoicedPurNum` | ERP已开票采购数量 | `erp_invoiced_pur_num` | Decimal |
| 88 | `erpInvoicedTaxMny` | ERP已开票含税金额 | `erp_invoiced_tax_mny` | Decimal |
| 89 | `erpInvoicedMny` | ERP已开票无税金额 | `erp_invoiced_mny` | Decimal |
| 90 | `puBillBid` | 采购单据表体id | `pu_bill_bid` | String |
| 91 | `puWareCunit` | 采购单据单位 | `pu_ware_cunit` | String |
| 92 | `puWareImgurl` | 采购单据物料图片url | `pu_ware_imgurl` | String |
| 93 | `mainUnitCode` | 主单位编码 | `main_unit_code` | String |
| 94 | `mainUnit` | 主单位id | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 95 | `purUnit` | 采购单位id | `pur_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 96 | `purUnitCode` | 采购单位编码 | `pur_unit_code` | String |
| 97 | `priceUnit` | 计价单位id | `price_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 98 | `priceUnitCode` | 计价单位编码 | `price_unit_code` | String |
| 99 | `skuId` | 物料SKU id {productsku} | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 100 | `salePkOrg` | 销售组织 | `sale_pk_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 101 | `saleOrgCode` | saleOrgCode | `sale_org_code` | String |
| 102 | `saleOrgName` | 销售组织名称 | `sale_org_name` | String |
| 103 | `saleBillId` | 销售单据id | `sale_bill_id` | String |
| 104 | `saleBillBid` | 销售单据表体id | `sale_bill_bid` | String |
| 105 | `saleOuterBid` | 销售单据记采购单据表体id | `sale_outer_bid` | String |
| 106 | `saleNum` | 销售数量 | `sale_num` | Decimal |
| 107 | `saleMny` | 销售无税金额 | `sale_mny` | Decimal |
| 108 | `saleTaxmny` | 销售含税金额 | `sale_taxmny` | Decimal |
| 109 | `saleTax` | 销售税额 | `sale_tax` | Decimal |
| 110 | `salePrice` | 销售无税单价 | `sale_price` | Decimal |
| 111 | `saleTaxprice` | 销售含税单价 | `sale_taxprice` | Decimal |
| 112 | `saleTaxrate` | 销售税率 | `sale_taxrate` | Decimal |
| 113 | `saleWareId` | 销售商品id | `sale_ware_id` | String |
| 114 | `puOuterId` | 销售订单id | `pu_outer_id` | String |
| 115 | `saleWareCode` | 销售商品编码 | `sale_ware_code` | String |
| 116 | `saleWareName` | 销售商品名称 | `sale_ware_name` | String |
| 117 | `saleWareCunit` | 销售单位 | `sale_ware_cunit` | String |
| 118 | `saleWareImgurl` | 销售商品图片url | `sale_ware_imgurl` | String |
| 119 | `pubts` | 时间戳 | `ts` | DateTime |
| 120 | `puWareId` | 采购单据物料id{cpu_material.cpu_material} | `pu_ware_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 121 | `id` | id | `checkbill_mid` | String |
| 122 | `checkbillBid` | 对账单子表id | `checkbill_bid` | String |
| 123 | `puPriceFloatValue` | 浮动金额 浮动比例 | `pu_price_float_value` | Decimal |
| 124 | `checkbillId` | 对账单id{yuncai_check.sale_checkbill} | `checkbill_id` | eb98f64a-4bef-4ee9-b533-1996de0de769 |
| 125 | `puConfirmBrand` | 签收品牌 | `pu_confirm_brand` | String |
| 126 | `status` | 匹配状态(0:自动匹配,1:自动数量金额不匹配,2:自动状态不匹配,3:没有匹配信息,4:单据未匹配) | `status` | String |
| 127 | `puBaseTaxprice` | 基准价 | `pu_base_taxprice` | Decimal |
| 128 | `relateId` | 采购对账单id | `relate_id` | String |
| 129 | `relateBid` | 采购对账单子表id | `relate_bid` | String |
| 130 | `relateMid` | 采购对账单孙表id | `relate_mid` | String |
| 131 | `projectId` | 项目id | `project_id` | String |
| 132 | `ytenant` | ytenantId | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 133 | `erpProjectId` | 项目ERPID | `erp_project_id` | String |
| 134 | `answer` | 回复状态(0:保存,1:确认,2:拒绝) | `answer` | String |
| 135 | `isLeave` | 是否遗留 | `is_leave` | String |
| 136 | `biztype` | 对账业务类型 | `biztype` | String |
| 137 | `sourceBillCode` | 来源单据号 | `source_bill_code` | String |
| 138 | `sourceRowno` | 来源单据行号 | `source_rowno` | String |
| 139 | `sourceTranstype` | 来源单据交易类型 | `source_transtype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 140 | `sourceBillDate` | 来源单据日期 | `source_bill_date` | Date |
| 141 | `taxtypeFlag` | 扣税类别 | `taxtype_flag` | String |
| 142 | `priceMark` | 价格标识 | `price_mark` | String |
| 143 | `hstoName` | 仓库名称 | `hsto_name` | String |
| 144 | `wareSkuCode` | 商品SKU编码 | `ware_sku_code` | String |
| 145 | `wareSkuName` | 商品SKU名称 | `ware_sku_name` | String |
| 146 | `puWareCode` | 采购单据物料编码 | `pu_ware_code` | String |
| 147 | `puWareName` | 物料名称 | `pu_ware_name` | String |
| 148 | `puMaterialSpec` | 物料规格 | `pu_material_spec` | String |
| 149 | `puMaterialModel` | 物料型号 | `pu_material_model` | String |
| 150 | `deliveryBrand` | 发货品牌 | `delivery_brand` | String |
| 151 | `skuCode` | 物料sku编码 | `sku_code` | String |
| 152 | `skuName` | 物料sku名称 | `sku_name` | String |
| 153 | `skuSpec` | SKU规格说明 | `sku_spec` | String |
| 154 | `skuModel` | SKU型号 | `sku_model` | String |
| 155 | `specNames` | SKU规格 | `spec_names` | String |
| 156 | `mainUnitName` | 主单位名称 | `main_unit_name` | String |
| 157 | `purUnitName` | 采购单位名称 | `pur_unit_name` | String |
| 158 | `invPurExchRate` | 采购单位换算率 | `inv_pur_exch_rate` | Decimal |
| 159 | `priceUnitName` | 计价单位名称 | `price_unit_name` | String |
| 160 | `invPriceExchRate` | 计价单位换算率 | `inv_price_exch_rate` | Decimal |
| 161 | `reqId` | 需求id | `req_id` | String |
| 162 | `puNum` | 计价数量 | `pu_num` | Decimal |
| 163 | `puPurNum` | 采购数量 | `pu_pur_num` | Decimal |
| 164 | `puMainNum` | 主数量 | `pu_main_num` | Decimal |
| 165 | `puOriginalTaxprice` | 原含税单价 | `pu_original_taxprice` | Decimal |
| 166 | `puGoodstatus` | 采购单据状态 | `pu_goodstatus` | String |
| 167 | `saleBilltype` | 销售单据类型 | `sale_billtype` | String |
| 168 | `puOriginalPrice` | 原无税单价 | `pu_original_price` | Decimal |
| 169 | `puTaxrate` | 采购税率 | `pu_taxrate` | Decimal |
| 170 | `puPkSupplier` | 供应商档案id{cpu_basedoc.cpu_supplydoc} | `pu_pk_supplier` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 171 | `ajustTaxprice` | 调整含税价格 | `ajust_taxprice` | Decimal |
| 172 | `puTaxprice` | 采购含税单价 | `pu_taxprice` | Decimal |
| 173 | `contractId` | 合同id | `contract_id` | String |
| 174 | `puSupplierCode` | 供应商档案code | `pu_supplier_code` | String |
| 175 | `ajustPrice` | 调整无税价格 | `ajust_price` | Decimal |
| 176 | `puPrice` | 采购无税单价 | `pu_price` | Decimal |
| 177 | `puSupplierName` | 采购供应商名称 | `pu_supplier_name` | String |
| 178 | `ajustTaxrate` | 调整税率 | `ajust_taxrate` | Decimal |
| 179 | `ajustTax` | 调整税额 | `ajust_tax` | Decimal |
| 180 | `orderId` | 订单id | `order_id` | String |
| 181 | `puPkInvoicevendor` | 开票供应商pk | `pu_pk_invoicevendor` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 182 | `puTax` | 采购税额 | `pu_tax` | Decimal |
| 183 | `puInvoicevendorCode` | 开票供应商编码 | `pu_invoicevendor_code` | String |
| 184 | `puTaxmny` | 采购含税金额 | `pu_taxmny` | Decimal |
| 185 | `arriveorderId` | 到货单id | `arriveorder_id` | String |
| 186 | `puInvoicevendorName` | 开票供应商名称 | `pu_invoicevendor_name` | String |
| 187 | `puMny` | 采购无税金额 | `pu_mny` | Decimal |
| 188 | `puSupplierTenantId` | 供应商租户id{cpu_auth.cpu_enterprise} | `pu_supplier_tenant_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 189 | `chargebackTaxmny` | 品质扣款含税金额 | `chargeback_taxmny` | Decimal |
| 190 | `puIsLeave` | 采购是否遗留 | `pu_is_leave` | Boolean |
| 191 | `ajustTaxmny` | 调整含税金额 | `ajust_taxmny` | Decimal |
| 192 | `puPriceType` | 价格类型 | `pu_price_type` | String |
| 193 | `chargebackMny` | 品质扣款无税金额 | `chargeback_mny` | Decimal |
| 194 | `puSignTime` | 签收时间 | `pu_sign_time` | DateTime |
| 195 | `ajustMny` | 调整无税金额 | `ajust_mny` | Decimal |
| 196 | `deliveryorderId` | 发货单id | `deliveryorder_id` | String |
| 197 | `isDeliveryBrand` | 是否允许反馈发货品牌 | `is_delivery_brand` | Boolean |
| 198 | `puDeductionTaxmny` | 采购扣款含税金额 | `pu_deduction_taxmny` | Decimal |
| 199 | `puDef1` | 原子表自定义项1 | `pu_def1` | String |
| 200 | `puDeductionMny` | 采购扣款无税金额 | `pu_deduction_mny` | Decimal |
| 201 | `puDef2` | 原子表自定义项2 | `pu_def2` | String |
| 202 | `actualTaxmny` | 实对含税金额 | `actual_taxmny` | Decimal |
| 203 | `puDef3` | 原子表自定义项3 | `pu_def3` | String |
| 204 | `actualMny` | 实对无税金额 | `actual_mny` | Decimal |
| 205 | `puDef4` | 原子表自定义项4 | `pu_def4` | String |
| 206 | `refuseReason` | 拒绝原因 | `refuse_reason` | String |
| 207 | `puDef5` | 原子表自定义项5 | `pu_def5` | String |
| 208 | `accInvoiceNum` | 累计开票数量 | `acc_invoice_num` | Decimal |
| 209 | `puErpFanaceorgOid` | ERP财务组织 | `pu_erp_fanaceorg_oid` | String |
| 210 | `accInvoiceMainNum` | 已开票主数量 | `acc_invoice_main_num` | Decimal |
| 211 | `puErpFanaceorgVid` | ERP财务组织 | `pu_erp_fanaceorg_vid` | String |
| 212 | `accInvoicePurNum` | 已开票采购数量 | `acc_invoice_pur_num` | Decimal |
| 213 | `puHfanorgCode` | 财务组织编码 | `pu_hfanorg_code` | String |
| 214 | `accApplyNum` | 已开销售发票未发布计价数量 | `acc_apply_num` | Decimal |
| 215 | `puHfanorgName` | 财务组织名称 | `pu_hfanorg_name` | String |
| 216 | `accApplyMainNum` | 销售发票未发布主数量 | `acc_apply_main_num` | Decimal |
| 217 | `puHfanorgId` | 财务组织Id | `pu_hfanorg_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 218 | `accApplyPurNum` | 销售发票未发布采购数量 | `acc_apply_pur_num` | Decimal |
| 219 | `ctrantypename` | 入库交易类型 | `ctrantypename` | String |
| 220 | `accInvoiceTaxmny` | 累计开票含税金额 | `acc_invoice_taxmny` | Decimal |
| 221 | `ctrantypeid` | 入库交易类型id | `ctrantypeid` | String |
| 222 | `accInvoiceMny` | 累计开票无税金额 | `acc_invoice_mny` | Decimal |
| 223 | `vtrantypecode` | 入库交易类型code | `vtrantypecode` | String |
| 224 | `accApplyTaxmny` | 累计申请含税金额 | `acc_apply_taxmny` | Decimal |
| 225 | `businessProcess` | ERP业务流程 | `business_process` | String |
| 226 | `accApplyMny` | 累计申请无税金额 | `acc_apply_mny` | Decimal |
| 227 | `projectCode` | 项目编码 | `project_code` | String |
| 228 | `puBizflowId` | 业务流程id | `pu_bizflow_id` | String |
| 229 | `projectName` | 项目名称 | `project_name` | String |
| 230 | `memo` | 备注 | `memo` | String |
| 231 | `deptId` | 采购部门id | `dept_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 232 | `purchaserName` | 采购员名称 | `purchaser_name` | String |
| 233 | `contractBillno` | 合同号 | `contract_billno` | String |
| 234 | `purPersonId` | 采购员id | `pur_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 235 | `orderCode` | 订单号 | `order_code` | String |
| 236 | `hstoCode` | 仓库编码 | `hsto_code` | String |
| 237 | `arriveorderCode` | 到货单号 | `arriveorder_code` | String |
| 238 | `puOuterCode` | 销售订单号 | `pu_outer_code` | String |
| 239 | `puBilldate` | 采购单据日期 | `pu_billdate` | Date |
| 240 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 241 | `deliveryorderCode` | 发货单号 | `deliveryorder_code` | String |
| 242 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 243 | `deliveryNum` | 发货数量 | `delivery_num` | Decimal |
| 244 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 245 | `contractBid` | 合同行id | `contract_bid` | String |
| 246 | `orderBid` | 订单行id | `order_bid` | String |
| 247 | `arriveorderBid` | 到货单行id | `arriveorder_bid` | String |
| 248 | `puOuterBid` | 采购单据记销售单据表体id | `pu_outer_bid` | String |
| 249 | `deliveryorderBId` | 发货单行id | `deliveryorder_bid` | String |
| 250 | `erpOrderBid` | ERP订单行id | `erp_order_bid` | String |
| 251 | `erpArriveorderBid` | ERP到货单行id | `erp_arriveorder_bid` | String |
| 252 | `puBizflowName` | 流程名称 | `pu_bizflow_name` | String |
| 253 | `sourceMemo` | 来源表头备注 | `source_memo` | String |
| 254 | `sourceMemob` | 来源表体备注 | `source_memo_b` | String |
| 255 | `purdeptName` | 采购部门名称 | `purdept_name` | String |
| 256 | `defines` | 销售对账单孙表自由自定义项 | `` | cfb57b11-5e4a-4d88-8fd8-3f789a8d3faa |
| 257 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 258 | `invPriceExchRateDen` | 计价单位换算率分母 | `invpriceexchrateden` | Decimal |
| 259 | `invPriceExchRateNum` | 计价单位换算率分子 | `invpriceexchratenum` | Decimal |
| 260 | `invPurExchRateDen` | 采购单位换算率分母 | `inv_pur_exch_rateden` | Decimal |
| 261 | `invPurExchRateNum` | 采购单位换算率分子 | `inv_pur_exch_ratenum` | Decimal |
| 262 | `lineno` | 行号 | `lineno` | Decimal |
| 263 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 264 | `source` | 上游单据类型 | `source` | String |
| 265 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 266 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 267 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 268 | `upcode` | 上游单据号 | `upcode` | String |

---

## 关联属性（38个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `checkbillId` | 对账单id{yuncai_check.sale_checkbill} | `check.salecheckbill.SaleCheckBillVO` | None | true |
| 2 | `expenseItemId` | 费用项目主键 | `bd.expenseitem.ExpenseItem` | Service |  |
| 3 | `salePkOrg` | 销售组织 | `org.func.BaseOrg` | Service |  |
| 4 | `hstoId` | 仓库id | `aa.warehouse.Warehouse` | Service |  |
| 5 | `activity` | 活动主键 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 6 | `SaleCheckBillMaterialVOFreeCharacteristics` | 自由项特征组实体 | `check.salecheckbill.FreePropertyCharacteristics` | None |  |
| 7 | `SaleCheckBillMaterialVODefineCharacter` | 自定义项特征属性 | `check.salecheckbill.UserDefinemateriaListCharacteristics` | None |  |
| 8 | `puWareClassId` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
| 9 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 10 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 11 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 12 | `matchBid` | 采购销售单据匹配bid | `check.checkpool.GodownEntryDetailVO` | None |  |
| 13 | `puPkSupplier` | 供应商档案id{cpu_basedoc.cpu_supplydoc} | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 14 | `defines` | 销售对账单孙表自由自定义项 | `check.salecheckbill.SaleCheckbillMVOFreeDefine` | None | true |
| 15 | `costcenterId` | 成本中心主键 | `bd.costcenter.CostCenter` | Service |  |
| 16 | `qualityPriceSchemeId` | 优质优价方案主键 | `aa.qualitypricescheme.QualitypriceScheme` | Service |  |
| 17 | `puHfanorgId` | 财务组织Id | `org.func.BaseOrg` | Service |  |
| 18 | `operationId` | 工序 | `ed.operation.Operation` | Service |  |
| 19 | `sourceTranstype` | 来源单据交易类型 | `bd.bill.TransType` | Service |  |
| 20 | `matchId` | 采购销售单据匹配id | `check.checkpool.GodownEntryVO` | None |  |
| 21 | `puPkOrg` | 采购单据组织id{org_orgs} | `org.func.BaseOrg` | Service |  |
| 22 | `skuId` | 物料SKU id {productsku} | `pc.product.ProductSKU` | Service |  |
| 23 | `priceUnit` | 计价单位id | `pc.unit.Unit` | Service |  |
| 24 | `purPersonId` | 采购员id | `bd.staff.Staff` | Service |  |
| 25 | `mainUnit` | 主单位id | `pc.unit.Unit` | Service |  |
| 26 | `puWareId` | 采购单据物料id{cpu_material.cpu_material} | `pc.product.Product` | Service |  |
| 27 | `ytenant` | ytenantId | `yht.tenant.YhtTenant` | Service |  |
| 28 | `deptId` | 采购部门id | `org.func.BaseOrg` | Service |  |
| 29 | `puTaxRateId` | 原税目 | `archive.taxArchives.TaxRateArchive` | Service |  |
| 30 | `adjustTaxRateId` | 调整税目 | `archive.taxArchives.TaxRateArchive` | Service |  |
| 31 | `formulaId` | 价格公式ID | `aa.priceformula.PriceFormula` | Service |  |
| 32 | `pkOrg` | 采购组织id{org_orgs} | `org.func.BaseOrg` | Service |  |
| 33 | `tenantId` | 供应商租户id{cpu_auth.cpu_enterprise} | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 34 | `receiveOrg` | 收货组织 | `org.func.BaseOrg` | Service |  |
| 35 | `puSupplierTenantId` | 供应商租户id{cpu_auth.cpu_enterprise} | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 36 | `puPkInvoicevendor` | 开票供应商pk | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 37 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 38 | `purUnit` | 采购单位id | `pc.unit.Unit` | Service |  |
