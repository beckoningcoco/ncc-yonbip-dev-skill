---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.deliveryorder.DeliveryOrderDetailVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 发货单详情 (`cpu-order.deliveryorder.DeliveryOrderDetailVO`)

> ycSaleCoor | 物理表：`cpu_deliveryorder_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 发货单详情 |
| 物理表 | `cpu_deliveryorder_detail` |
| 数据库 schema | `cpu-order` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:16.3630` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 发货单详情id |

---

## 直接属性（199个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `deliveryOrderDetailDefineCharacter` | 自定义项特征属性组 | `define_character` | 90f477ac-ff3c-498c-90e4-bc0955951d95 |
| 2 | `deliveryOrderDetailFreeCharacteristics` | 自由项特征组实体 | `instance_id` | 72cfa448-ed0d-43c8-9b38-7e9e6e653a93 |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `dr` | 删除标识 | `dr` | Integer |
| 5 | `erpMaterialId` | 附件 | `erp_material_id` | String |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 7 | `lineNum` | 行号 | `line_num` | Integer |
| 8 | `saleOrderCodeLineNum` | 销售订单_行号 | `sale_order_code_line_num` | String |
| 9 | `orderCodeLineNum` | 采购订单_行号 | `order_code_line_num` | String |
| 10 | `contractBillno` | 合同编号 | `contract_billno` | String |
| 11 | `contractRownum` | 合同子表行号 | `contract_rownum` | Long |
| 12 | `materialCode` | 物料编码 | `material_code` | String |
| 13 | `materialSpec` | 规格 | `material_spec` | String |
| 14 | `materialModel` | 型号 | `material_model` | String |
| 15 | `outsourcer` | 委外商 | `outsourcer` | String |
| 16 | `logisticalComp` | 物流公司 | `logistical_comp` | String |
| 17 | `logisticalCode` | 物流单号 | `logistical_code` | String |
| 18 | `logisticalCompCode` | 物流公司代码 | `logistical_comp_code` | String |
| 19 | `mainActualNum` | 实际到货主数量 | `main_actual_num` | Decimal |
| 20 | `boxedNum` | 已装箱数量 | `boxed_num` | Decimal |
| 21 | `commodityUnit` | 商品单位 | `commodity_unit` | String |
| 22 | `priceActualNum` | 实际到货计价数量 | `price_actual_num` | Decimal |
| 23 | `purchaseActualNum` | 实际到货采购数量 | `purchase_actual_num` | Decimal |
| 24 | `maindiffActualNum` | 实际到货差异主数量 | `main_diff_actual_num` | Decimal |
| 25 | `pricediffActualNum` | 实际到货差异计价数量 | `price_diff_actual_num` | Decimal |
| 26 | `purchasediffActualNum` | 实际到货差异采购数量 | `purchase_diff_actual_num` | Decimal |
| 27 | `ts` | 时间戳 | `ts` | DateTime |
| 28 | `upLineno` | 上游单据行号 | `up_lineno` | Decimal |
| 29 | `pubts` | 时间戳 | `ts` | DateTime |
| 30 | `purchaseActualReceivedNum` | 实收采购数量 | `pur_act_rec_num` | Decimal |
| 31 | `priceActualReceivedNum` | 实收计价数量 | `price_act_rec_num` | Decimal |
| 32 | `purchaseReplenishNum` | 需补货采购数量 | `pur_replenish_num` | Decimal |
| 33 | `priceReplenishNum` | 需补货计价数量 | `price_replenish_num` | Decimal |
| 34 | `purchaseAcceptReceivedNum` | 入库采购数量 | `pur_inwh_num` | Decimal |
| 35 | `priceAcceptReceivedNum` | 入库计价数量 | `price_inwh_num` | Decimal |
| 36 | `diffPurchaseActualReceivedNum` | 实收采购差异数量 | `diff_pur_act_rec_num` | Decimal |
| 37 | `diffPurchaseAcceptReceivedNum` | 入库采购差异数量 | `diff_pur_inwh_num` | Decimal |
| 38 | `diffPriceActualReceivedNum` | 实收计价差异数量 | `diff_price_act_rec_num` | Decimal |
| 39 | `diffPriceAcceptReceivedNum` | 入库计价差异数量 | `diff_price_inwh_num` | Decimal |
| 40 | `operationId` | 工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 41 | `opSn` | 工序顺序号 | `op_sn` | Decimal |
| 42 | `operationName` | 工序名称 | `operation_name` | String |
| 43 | `operationCode` | 工序编码 | `operation_code` | String |
| 44 | `erpOrderNo` | ERP采购订单号 | `erp_order_no` | String |
| 45 | `defaultBarcodePackingQuantity` | 默认条码包装量 | `barcode_packing_quantity` | Decimal |
| 46 | `generatedBarcodeNum` | 已生码数量 | `generated_barcode_num` | Decimal |
| 47 | `generatedBarcodeQty` | 已生码个数 | `generated_barcode_qty` | Decimal |
| 48 | `taxRateId` | 税率 | `tax_rate_id` | 01e7528c-c35c-4d33-b2aa-382b4b4f4534 |
| 49 | `taxType` | 扣税类别 | `tax_type` | String |
| 50 | `ticketOrgName` | 收票组织名称 | `ticket_org_name` | String |
| 51 | `outsourcerId` | 委外商主键 | `outsourcer_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 52 | `invoiceMainQuantity` | 已开票主数量 | `invoice_main_quantity` | Decimal |
| 53 | `ticketOrgCode` | 收票组织编码 | `ticket_org_code` | String |
| 54 | `isOutsourceCollaborate` | 是否与委外商协同 | `is_outsource_collaborate` | Boolean |
| 55 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 56 | `signatory` | 签收方 | `signatory` | String |
| 57 | `productPuType` | 物料采购类型 | `product_pu_type` | String |
| 58 | `invoicePriceQuantity` | 已开票计价数量 | `invoice_price_quantity` | Decimal |
| 59 | `lineno` | 行号 | `lineno` | Decimal |
| 60 | `upcode` | 上游单据号 | `upcode` | String |
| 61 | `invoicePurQuantity` | 已开票采购数量 | `invoice_pur_quantity` | Decimal |
| 62 | `priceMark` | 价格标识 | `price_mark` | String |
| 63 | `skuCode` | 商品sku的编码 | `sku_code` | String |
| 64 | `productImgUrl` | 展示商品的图片URL | `product_img_url` | String |
| 65 | `productSubject` | 商品描述(用于展示,可包含规格信息,SKU信息,价格库存等信息) | `product_subject` | String |
| 66 | `confirmBrand` | 品牌 | `confirm_brand` | String |
| 67 | `purEnterpriseName` | 收货企业 | `pur_enterprise_name` | String |
| 68 | `purchaseOrgName` | 采购组织 | `pur_org_name` | String |
| 69 | `arrPlanId` | 到货计划单主表id | `arrPlan_id` | Long |
| 70 | `periodQuality` | 有效期间 | `period_quality` | Integer |
| 71 | `periodQualityType` | 有效期间类型 | `period_quality_type` | Integer |
| 72 | `productionDate` | 生产日期 | `production_date` | DateTime |
| 73 | `expirationDate` | 失效日期 | `expiration_date` | DateTime |
| 74 | `batchNo` | 生产批号 | `batch_no` | String |
| 75 | `materialName` | 产品名称 | `material_name` | String |
| 76 | `isBarcodeMng` | 条码管理 | `is_barcode_mng` | Integer |
| 77 | `isSerialnoMng` | 序列号管理 | `is_serialno_mng` | Integer |
| 78 | `serialNo` | 序列号 | `serial_no` | String |
| 79 | `purchaseNum` | 发货数量 | `purchase_num` | Decimal |
| 80 | `purchaseUnitName` | 发货单位 | `purchase_unit_name` | String |
| 81 | `purchaseExchRate` | 发货换算率 | `purchase_exch_rate` | Decimal |
| 82 | `mainNum` | 发货主数量 | `main_num` | Decimal |
| 83 | `mainMetrologyName` | 主计量 | `main_metrology_name` | String |
| 84 | `num` | 发货计价数量 | `num` | Decimal |
| 85 | `unit` | 计价单位 | `unit` | String |
| 86 | `materialDesc` | 产品描述 | `material_desc` | String |
| 87 | `priceExchRate` | 计价换算率 | `price_exch_rate` | Decimal |
| 88 | `planArrivalDate` | 计划到货时间 | `plan_arrive_date` | DateTime |
| 89 | `receiveMan` | 收货人 | `receive_man` | String |
| 90 | `recAddress` | 收货地址 | `rec_address` | String |
| 91 | `diffCustomerAcceptReceivedNum` | 入库差异主数量 | `diff_cus_acp_rec_num` | Decimal |
| 92 | `customerActualReceivedNum` | 实收数量 | `cus_act_rec_num` | Decimal |
| 93 | `replenishNum` | 需补货数量 | `replenish_num` | Decimal |
| 94 | `customerAcceptReceivedNum` | 入库数量 | `cus_acp_rec_num` | Decimal |
| 95 | `diffCustomerActualReceivedNum` | 实收差异主数量 | `diff_cus_act_rec_num` | Decimal |
| 96 | `taxPrice` | 含税单价 | `tax_price` | Decimal |
| 97 | `deliveryBrand` | 发货品牌 | `delivery_brand` | String |
| 98 | `packingSpec` | 包装规格 | `packing_spec` | String |
| 99 | `recvstoorgName` | 收货仓库 | `recvstoorg_name` | String |
| 100 | `contactWay` | 联系方式 | `contact_way` | String |
| 101 | `projectName` | 需求项目 | `project_name` | String |
| 102 | `invoiceNo` | 发票号 | `invoice_no` | String |
| 103 | `bmemo` | 发货备注 | `bmemo` | String |
| 104 | `receiveMemo` | 收货备注 | `receive_memo` | String |
| 105 | `receiveAddr` | 收货地址 | `receive_addr` | String |
| 106 | `taxAmount` | 含税金额 | `tax_amount` | Decimal |
| 107 | `orderId` | 来源-云采采购订单id | `order_id` | Long |
| 108 | `invoiceTaxAmount` | 已开票含税金额 | `invoice_tax_amount` | Decimal |
| 109 | `purEnterpriseId` | 采购商租户id | `pur_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 110 | `recvstoorgId` | 收货库存组织主键 | `recvstoorg_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 111 | `recvstor` | 收货仓库 | `recvstor` | String |
| 112 | `status` | 状态(多单合并成一个发货单,故把状态放明细行上)0,待发布;1,发货中;2,已妥投;3,已签收;4,拒签;7,部分签收 | `status` | String |
| 113 | `projectId` | 项目id | `project_id` | Long |
| 114 | `mainMetrologyId` | 主单位id | `main_metrology_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 115 | `id` | 发货单详情id | `id` | Long |
| 116 | `outerOrderId` | 对应发货单outerOrderId | `outer_order_id` | String |
| 117 | `mainMetrologyCode` | 主单位code | `main_metrology_code` | String |
| 118 | `outerId` | 对应发货单outerId | `outer_id` | String |
| 119 | `purchaseOrgId` | 采购组织id | `purchaseorg_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 120 | `reqPuorgDocId` | 请购组织ID | `req_puorg_doc_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 121 | `orderCode` | 采购订单号 | `order_code` | String |
| 122 | `skuId` | 商品sku的id | `sku_id` | Long |
| 123 | `isBatchMng` | 是否批次管理 | `is_batch_mng` | Integer |
| 124 | `invoiceRecOrgCode` | 收票组织编码 | `invoice_rec_org_code` | String |
| 125 | `arriveOrderId` | 到货单id | `arriveorder_id` | Long |
| 126 | `deliverynum` | 累计发货数量 | `deliverynum` | Decimal |
| 127 | `invoiceAmount` | 已开票无税金额 | `invoice_amount` | Decimal |
| 128 | `rateType` | 汇率类型 | `rate_type` | String |
| 129 | `contractMaterialId` | 合同子表id | `contractMaterial_id` | Long |
| 130 | `amount` | 无税金额 | `amount` | Decimal |
| 131 | `reqPudepDocId` | 请购组织ID | `req_pudep_doc_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 132 | `arriveOrderCode` | 到货单号 | `arriveorder_code` | String |
| 133 | `reqPuorgDocName` | 请购组织名称 | `req_puorg_doc_name` | String |
| 134 | `saleOrderId` | 来源-云采销售订单id | `sale_order_id` | Long |
| 135 | `saleOrderCode` | 销售订单号 | `sale_order_code` | String |
| 136 | `purchaseId` | 采购员Id | `purchase_id` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |
| 137 | `deliveryOrderId` | 发货单id | `deliveryorder_id` | 12b75182-bf0e-426e-8c2c-10c46b3177f6 |
| 138 | `invoiceRecOrgName` | 收票组织名称 | `invoice_rec_org_name` | String |
| 139 | `reqReturnQuantity` | 请求退货数量 | `req_return_quantity` | Decimal |
| 140 | `accomplishedMainNum` | 已执行主单位数量 | `accomplished_main_num` | Decimal |
| 141 | `pkInvoiceRecOrg` | 收票组织pk | `pk_invoice_rec_org` | String |
| 142 | `delplanDetailId` | 交货计划单表体ID | `delplan_detail_id` | Long |
| 143 | `saleOrderDetailId` | 销售订单子表id | `saleorder_detail_id` | Long |
| 144 | `materialBrand` | 物料品牌 | `material_brand` | String |
| 145 | `storageId` | 仓库id | `storage_id` | String |
| 146 | `isVerifyCert` | 是否验证注册证 | `is_verify_cert` | Integer |
| 147 | `price` | 无税单价 | `price` | Decimal |
| 148 | `currencyId` | 币种Id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 149 | `inwhnum` | 入库数量 | `inwhnum` | Decimal |
| 150 | `signnum` | 签收数量 | `signnum` | Decimal |
| 151 | `blargess` |  | `blargess` | Boolean |
| 152 | `contractId` | 合同id | `contract_id` | Long |
| 153 | `unitCode` | 计价单位code | `unit_code` | String |
| 154 | `consignee_info` | 收货人信息 | `consignee_info` | String |
| 155 | `inwhAmount` | 已入库含税金额 | `inwh_amount` | Decimal |
| 156 | `purchaseUnitCode` | 采购单位code | `purchase_unit_code` | String |
| 157 | `invSupEnterpriseId` | 开票供应商 | `inv_sup_enterprise_id` | Long |
| 158 | `currencyName` | 币种名称 | `currency_name` | String |
| 159 | `isVerifyAuthorization` | 是否验证授权书 | `is_verify_authorization` | Integer |
| 160 | `supEnterpriseId` | 供应商 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 161 | `purchaseName` | 采购员名称 | `purchase_name` | String |
| 162 | `skuValue` | 商品sku详细属性信息 | `sku_value` | String |
| 163 | `invoiceQuantity` | 已开票数量 | `invoice_quantity` | Decimal |
| 164 | `accomplishedPurchaseNum` | 已执行采购单位数量 | `accomplished_purchase_num` | Decimal |
| 165 | `delplanNo` | 交货计划单号 | `delplan_no` | String |
| 166 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 167 | `isPeriodMng` | 是否保质期管理 | `is_period_mng` | Integer |
| 168 | `outerDetailId` | 对应发货单outerDetailId | `outer_detail_id` | String |
| 169 | `projectCode` | 项目编码 | `project_code` | String |
| 170 | `currencySymbol` | 币种符号 | `currency_symbol` | String |
| 171 | `ticketOrgId` | 收票组织 | `ticket_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 172 | `rejectedInvoiceQuantity` | 已退票数量 | `rejected_invoice_quantity` | Decimal |
| 173 | `tax` | 税额 | `tax` | Decimal |
| 174 | `purchaseUnitId` | 采购单位id | `purchase_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 175 | `reqPudepDocName` | 请购部门名称 | `req_pudep_doc_name` | String |
| 176 | `returnQuantity` | 已退货数量 | `return_quantity` | Decimal |
| 177 | `projectDocIdStr` | 平台项目档案id | `project_doc_idstr` | String |
| 178 | `rate` | 汇率 | `rate` | Decimal |
| 179 | `purnum` | 采购需求总数量w | `purnum` | Decimal |
| 180 | `outerOrderDetailId` | 外部订单明细id | `outer_order_detail_id` | String |
| 181 | `inwhTaxAmount` | 已入库含税金额 | `inwh_tax_amount` | Decimal |
| 182 | `orderDetailId` | 订单详情id | `order_detail_id` | Long |
| 183 | `taxrate` | 税率 | `taxrate` | Decimal |
| 184 | `deliveryOrderType` | 收货单类别 | `deliveryorder_type` | String |
| 185 | `unitid` | 计价单位id | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 186 | `delplanId` | 交货计划单表头ID | `delplan_id` | Long |
| 187 | `arriveOrderDetailId` | 到货单明细行id | `arriveorder_detail_id` | Long |
| 188 | `fileId` | 附件id | `file_id` | String |
| 189 | `currencyCode` | 币种编号 | `currency_code` | String |
| 190 | `productId` | 商品(SKU)id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 191 | `boxingRecords` | 发货单装箱记录孙表 | `` | 7f12cf87-46f3-42b4-b665-b01ba1e9d35d |
| 192 | `defines` | 发货单表体自定义项 | `` | e4971732-0abf-447e-a33d-af779a9ce733 |
| 193 | `detailBarcodes` | 发货单条码子表 | `` | f67b84b4-0f92-4199-9ffd-6eaae0536363 |
| 194 | `detailHealth` | 发货单医疗拓展表 | `` | 9debecfc-3338-4815-841c-e7377d94b323 |
| 195 | `detailParallel` | 发货单子表拓展 | `` | d356420c-70d5-4376-89ca-6ee35a3d7ce0 |
| 196 | `priceExchRateDen` | 计价换算率分母 | `price_exch_rateden` | Decimal |
| 197 | `priceExchRateNum` | 计价换算率分子 | `price_exch_ratenum` | Decimal |
| 198 | `purchaseExchRateDen` | 发货换算率分母 | `purchase_exch_rateden` | Decimal |
| 199 | `purchaseExchRateNum` | 发货换算率分子 | `purchase_exch_ratenum` | Decimal |

---

## 关联属性（26个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `purchaseId` | 采购员Id | `cpu-privilege.user.MgrUser` | Service |  |
| 2 | `reqPuorgDocId` | 请购组织ID | `org.func.BaseOrg` | Service |  |
| 3 | `boxingRecords` | 发货单装箱记录孙表 | `cpu-order.deliveryorder.DeliveryOrderBoxingRecordVO` | None | true |
| 4 | `defines` | 发货单表体自定义项 | `cpu-order.deliveryorder.DeliveryOrderDetailVODefine` | None | true |
| 5 | `reqPudepDocId` | 请购组织ID | `org.func.BaseOrg` | Service |  |
| 6 | `detailBarcodes` | 发货单条码子表 | `cpu-order.deliveryorder.DeliveryOrderDetailBarcodeVO` | None | true |
| 7 | `ticketOrgId` | 收票组织 | `org.func.BaseOrg` | Service |  |
| 8 | `operationId` | 工序ID | `ed.operation.Operation` | Service |  |
| 9 | `currencyId` | 币种Id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 10 | `taxRateId` | 税率 | `bd.taxrate.TaxRateVO` | Service |  |
| 11 | `detailParallel` | 发货单子表拓展 | `cpu-order.deliveryorder.DeliveryOrderDetailParallelVO` | None | true |
| 12 | `deliveryOrderDetailDefineCharacter` | 自定义项特征属性组 | `cpu-order.deliveryorder.DeliveryOrderCharacterDefine` | None |  |
| 13 | `deliveryOrderId` | 发货单id | `cpu-order.deliveryorder.DeliveryOrderVO` | None | true |
| 14 | `purchaseUnitId` | 采购单位id | `pc.unit.Unit` | Service |  |
| 15 | `productId` | 商品(SKU)id | `pc.product.Product` | Service |  |
| 16 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 17 | `detailHealth` | 发货单医疗拓展表 | `cpu-order.deliveryorder.DeliveryOrderDetailHealthVO` | None | true |
| 18 | `recvstoorgId` | 收货库存组织主键 | `org.func.BaseOrg` | Service |  |
| 19 | `purchaseOrgId` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 20 | `materialId` | 物料id | `pc.product.Product` | Service |  |
| 21 | `purEnterpriseId` | 采购商租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 22 | `mainMetrologyId` | 主单位id | `pc.unit.Unit` | Service |  |
| 23 | `supEnterpriseId` | 供应商 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 24 | `unitid` | 计价单位id | `pc.unit.Unit` | Service |  |
| 25 | `outsourcerId` | 委外商主键 | `aa.vendor.Vendor` | Service |  |
| 26 | `deliveryOrderDetailFreeCharacteristics` | 自由项特征组实体 | `cpu-order.deliveryorder.DeliveryOrderCharacteristicsDefine` | None |  |
