---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.saleorder.SaleOrderDetailVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售订单表体 (`cpu-order.saleorder.SaleOrderDetailVO`)

> ycSaleCoor | 物理表：`cpu_sale_order_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售订单表体 |
| 物理表 | `cpu_sale_order_detail` |
| 数据库 schema | `cpu-order` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:27.1350` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（253个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `saleOrderDetailDefineCharacter` | 自定义项特征属性组 | `defineCharacter` | 27d7fcf6-2585-47bf-95b0-47188b1075a5 |
| 2 | `saleOrderDetailFreeCharacteristics` | 自由项特征组实体 | `instance_id` | 7743899c-c14e-4143-a121-995b9a09a288 |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 4 | `dr` | 删除标志 | `dr` | Integer |
| 5 | `formulaCode` | 价格公式编码 | `formula_code` | String |
| 6 | `formulaId` | 价格公式ID | `formula_id` | Long |
| 7 | `formulaName` | 价格公式名称 | `formula_name` | String |
| 8 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 9 | `materialCode` | 物料编码 | `material_code` | String |
| 10 | `modifier` | 修改人 | `modifier` | String |
| 11 | `productModel` | 产品型号 | `product_model` | String |
| 12 | `productSpec` | 产品规格 | `product_spec` | String |
| 13 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 14 | `ts` | 时间戳 | `ts` | DateTime |
| 15 | `ytenant` | 租户编码 | `ytenant_id` | String |
| 16 | `lineNum` | 行号 | `line_num` | String |
| 17 | `suppProductUrl` | 供应商商品图片url | `supp_product_url` | String |
| 18 | `changeMaterialCode` | 变更物料编码 | `change_material_code` | String |
| 19 | `changeProductName` | 变更物料名称 | `change_product_name` | String |
| 20 | `gmtCreate` | 创建时间 | `gmt_create` | DateTime |
| 21 | `productName` | 商品名称 | `product_name` | String |
| 22 | `deliveredPriceNum` | 已发货计价数量 | `delivered_price_num` | Decimal |
| 23 | `pubts` | 时间戳 | `ts` | DateTime |
| 24 | `purDeliveredNum` | 发货已发布采购数量 | `pur_delivered_num` | Decimal |
| 25 | `recvstorId` | 仓库档案ID | `recvstor_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 26 | `taxWithheld` | 代扣税税额 | `tax_withheld` | Decimal |
| 27 | `priceExchRateNum` | 计价换算率分子 | `price_exch_ratenum` | Decimal |
| 28 | `priceExchRateDen` | 计价换算率分母 | `price_exch_rateden` | Decimal |
| 29 | `purchaseExchRateNum` | 采购换算率分子 | `purchase_exch_ratenum` | Decimal |
| 30 | `purchaseExchRateDen` | 采购换算率分母 | `purchase_exch_rateden` | Decimal |
| 31 | `isServiceMaterial` | 物料类型 | `is_service_material` | Integer |
| 32 | `targetBillId` | 目标单据id | `target_bill_Id` | String |
| 33 | `targetDetailBillId` | 目标单据子表id | `target_detail_bill_id` | String |
| 34 | `mallOrderId` | 超市订单id | `mall_order_id` | a5e54491-d54a-45d6-9800-4557b5d7b306 |
| 35 | `mallOrderDetailId` | 超市订单id | `mall_order_detail_id` | a6cf30ba-d19e-40fb-83d2-615ee56f6f85 |
| 36 | `commodityUnit` | 商品单位 | `commodity_unit` | String |
| 37 | `mainActualNum` | 实际到货主数量 | `main_actual_num` | Decimal |
| 38 | `priceActualNum` | 实际到货计价数量 | `price_actual_num` | Decimal |
| 39 | `purchaseActualNum` | 实际到货采购数量 | `purchase_actual_num` | Decimal |
| 40 | `maindiffActualNum` | 实际到货差异主数量 | `main_diff_actual_num` | Decimal |
| 41 | `pricediffActualNum` | 实际到货差异计价数量 | `price_diff_actual_num` | Decimal |
| 42 | `purchasediffActualNum` | 实际到货差异采购数量 | `purchase_diff_actual_num` | Decimal |
| 43 | `defaultBarcodePackingQuantity` | 默认条码包装量 | `barcode_packing_quantity` | Decimal |
| 44 | `generatedBarcodeNum` | 已生码数量 | `generated_barcode_num` | Decimal |
| 45 | `generatedBarcodeQty` | 已生码个数 | `generated_barcode_qty` | Decimal |
| 46 | `boxedNum` | 已装箱数量 | `boxed_num` | Decimal |
| 47 | `priceDeliveredNum` | 发货已发布计价数量 | `price_delivered_num` | Decimal |
| 48 | `purchaseActualReceivedNum` | 实收采购数量 | `pur_act_rec_num` | Decimal |
| 49 | `priceActualReceivedNum` | 实收计价数量 | `price_act_rec_num` | Decimal |
| 50 | `totalPurchaseReplenishNum` | 拒收需补货采购数量 | `pur_total_replenish_num` | Decimal |
| 51 | `totalPriceReplenishNum` | 拒收需补货计价数量 | `price_total_replenish_num` | Decimal |
| 52 | `diffPriceAcceptReceivedNum` | 入库差异计价数量 | `diff_price_inwh_num` | Decimal |
| 53 | `diffPurchaseAcceptReceivedNum` | 入库差异采购数量 | `diff_pur_inwh_num` | Decimal |
| 54 | `purchaseAcceptReceivedNum` | 入库采购数量 | `pur_inwh_num` | Decimal |
| 55 | `priceAcceptReceivedNum` | 入库计价数量 | `price_inwh_num` | Decimal |
| 56 | `diffPurchaseActualReceivedNum` | 实收采购差异数量 | `diff_pur_act_rec_num` | Decimal |
| 57 | `diffPriceActualReceivedNum` | 实收计价差异数量 | `diff_price_act_rec_num` | Decimal |
| 58 | `outsourcer` | 委外商 | `outsourcer` | String |
| 59 | `confirmTaxRate` | 确认税率 | `confirm_taxrate` | Decimal |
| 60 | `diffLetPassedNum` | 放行差异数量 | `diff_letpassed_num` | Decimal |
| 61 | `ticketOrgName` | 收票组织名称 | `ticket_org_name` | String |
| 62 | `ticketOrgCode` | 收票组织编码 | `ticket_org_code` | String |
| 63 | `applyLetPassedMainNum` | 放行主数量 | `apply_letpassed_main_num` | Decimal |
| 64 | `applyLetPassedNum` | 放行数量 | `apply_letpassed_num` | Decimal |
| 65 | `isNeedLetPass` | 是否需放行验收 | `is_need_letpass` | Boolean |
| 66 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 67 | `letPassType` | 放行类型 | `letpass_type` | String |
| 68 | `lineno` | 行号 | `lineno` | Decimal |
| 69 | `confirmTaxRateId` | 确认税目 | `confirm_taxrate_id` | 01e7528c-c35c-4d33-b2aa-382b4b4f4534 |
| 70 | `priceMark` | 价格标识 | `price_mark` | String |
| 71 | `taxRateId` | 税目 | `taxrate_id` | 01e7528c-c35c-4d33-b2aa-382b4b4f4534 |
| 72 | `taxType` | 扣税类别 | `tax_type` | String |
| 73 | `upperLimitRatio` | 超发上限比例(%) | `upper_limit_ratio` | Decimal |
| 74 | `outsourcerId` | 委外商主键 | `outsourcer_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 75 | `status` | 发货状态 | `status` | String |
| 76 | `letPassNoteStatus` | 放行状态 | `letpass_note_status` | String |
| 77 | `deliveredMainNum` | 已发货主数量 | `delivered_main_num` | Decimal |
| 78 | `isOutsourceCollaborate` | 是否与委外商协同 | `is_outsource_collaborate` | Boolean |
| 79 | `productSelection` | 商品选配 | `product_selection` | String |
| 80 | `signatory` | 签收方 | `signatory` | String |
| 81 | `productPuType` | 物料采购类型 | `product_pu_type` | String |
| 82 | `appliedLetPassMainNum` | 已申请放行主数量 | `applied_letpass_main_num` | Decimal |
| 83 | `diffLetPassedMainNum` | 放行差异主数量 | `diff_letpassed_main_num` | Decimal |
| 84 | `fileId` | 附件 | `fileId` | String |
| 85 | `appliedLetPassNum` | 已申请放行数量 | `applied_letpass_num` | Decimal |
| 86 | `deliveredPurchaseNum` | 已发货采购数量 | `delivered_purchase_num` | Decimal |
| 87 | `ticketOrgId` | 收票组织 | `ticket_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 88 | `changeProductSpec` | 变更物料规格 | `change_product_spec` | String |
| 89 | `orderOtherId` | 订单编号(来源于其他系统) | `order_other_id` | String |
| 90 | `changeProductModel` | 变更物料型号 | `change_product_model` | String |
| 91 | `productDescribe` | 商品描述 | `product_describe` | String |
| 92 | `requireBrand` | 要求品牌 | `require_brand` | String |
| 93 | `confirmBrand` | 供方确认品牌 | `confirm_brand` | String |
| 94 | `changeBrand` | 变更品牌 | `change_brand` | String |
| 95 | `manageFileId` | 管理附件 | `manage_file_id` | String |
| 96 | `projectName` | 项目名称 | `project_name` | String |
| 97 | `projectCode` | 项目编码 | `project_code` | String |
| 98 | `purchaseNum` | 采购单位数量 | `purchase_num` | Decimal |
| 99 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 100 | `purOrderId` | 采购订单id | `pur_order_id` | Long |
| 101 | `conPurQuantity` | 确认采购数量 | `con_pur_quantity` | Decimal |
| 102 | `changePurQuantity` | 变更采购数量 | `change_pur_quantity` | Decimal |
| 103 | `purchaseUnitName` | 采购单位名称 | `purchase_unit_name` | String |
| 104 | `purchaseExchRate` | 采购换算率 | `purchase_exch_rate` | Decimal |
| 105 | `mainNum` | 主单位数量 | `main_num` | Decimal |
| 106 | `conMainQuantity` | 确认主数量 | `con_main_quantity` | Decimal |
| 107 | `changeMainQuantity` | 变更主数量 | `change_main_quantity` | Decimal |
| 108 | `mainMetrologyName` | 主单位名称 | `main_metrology_name` | String |
| 109 | `quantity` | 数量 | `quantity` | Decimal |
| 110 | `conQuantity` | 确认数量 | `con_quantity` | Decimal |
| 111 | `changeQuantity` | 变更数量 | `change_quantity` | Decimal |
| 112 | `unit` | 单位 | `unit` | String |
| 113 | `priceExchRate` | 计价换算率 | `price_exch_rate` | Decimal |
| 114 | `deliveredNum` | 已发货数量 | `delivered_num` | Decimal |
| 115 | `customerActualReceivedNum` | 客户实收数量 | `cus_act_rec_num` | Decimal |
| 116 | `diffCustomerActualReceivedNum` | 客户实收数量差异 | `diff_cus_act_rec_num` | Decimal |
| 117 | `returnPurInwhnum` | 退库数量 | `return_pur_inwhnum` | Decimal |
| 118 | `returnPurPriceInwhnum` | 退库计价数量 | `return_pur_price_inwhnum` | Decimal |
| 119 | `returnReplenishMainNum` | 退库需补货主数量 | `return_replenish_main_num` | Decimal |
| 120 | `returnReplenishNum` | 退库需补货数量 | `return_replenish_num` | Decimal |
| 121 | `returnReplenishPriceNum` | 退库需补货计价数量 | `return_replenish_price_num` | Decimal |
| 122 | `returnPurMainInwhnum` | 退库主数量 | `return_pur_main_inwhnum` | Decimal |
| 123 | `totalReplenishNum` | 实收需补货主数量 | `total_replenish_num` | Decimal |
| 124 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 125 | `customerAcceptReceivedNum` | 客户验收数量 | `cus_acp_rec_num` | Decimal |
| 126 | `diffCustomerAcceptReceivedNum` | 客户验收数量差异 | `diff_cus_acp_rec_num` | Decimal |
| 127 | `financeOrg` | 财务组织 | `finance_org` | String |
| 128 | `price` | 无税单价 | `price` | Decimal |
| 129 | `floatMoney` | 浮动金额 | `float_money` | Decimal |
| 130 | `floatProp` | 浮动比例 | `float_prop` | String |
| 131 | `taxPrice` | 含税单价 | `tax_price` | Decimal |
| 132 | `conPrice` | 确认无税价格 | `con_price` | Decimal |
| 133 | `conTaxPrice` | 确认含税单价 | `con_tax_price` | Decimal |
| 134 | `taxrate` | 税率 | `taxrate` | Decimal |
| 135 | `amount` | 金额 | `amount` | Decimal |
| 136 | `taxAmount` | 含税金额 | `tax_amount` | Decimal |
| 137 | `formulaCalculation` | 价格公式算式 | `formula_calculation` | String |
| 138 | `formulaShow` | 价格公式 | `formula_show` | String |
| 139 | `isBarcodeMng` | 是否条码管理 | `is_barcode_mng` | Integer |
| 140 | `planDeliverDate` | 计划收货日期 | `plan_deliver_date` | DateTime |
| 141 | `confirmArriveDate` | 确认到货日期 | `confirm_arrive_date` | DateTime |
| 142 | `changePlanDeliverDate` | 变更计划到货日期 | `change_plan_deliver_date` | DateTime |
| 143 | `recv_orgname` | 收货组织名称 | `recv_orgname` | String |
| 144 | `deliverAddress` | 收货地址 | `deliver_address` | String |
| 145 | `recPeople` | 收货人 | `rec_people` | String |
| 146 | `contactWay` | 联系方式 | `contact_way` | String |
| 147 | `recvstor` | 收货仓库名称 | `recvstor` | String |
| 148 | `contractRowNum` | 销售合同行号 | `contract_rownum` | Long |
| 149 | `contractBillno` | 合同号 | `contract_billno` | String |
| 150 | `memo` | 备注 | `memo` | String |
| 151 | `changeMemo` | 变更备注 | `change_memo` | String |
| 152 | `giftsFlag` | 赠品标识 | `gifts_flag` | String |
| 153 | `fisactive` | 订单行激活、关闭状态 | `fisactive` | String |
| 154 | `rowConMessage` | 标题确认信息状态 | `row_con_message` | String |
| 155 | `actualMoney` | 实价 | `actual_money` | Decimal |
| 156 | `rowRefReaStatus` | 表体拒绝理由状态 | `row_ref_rea_status` | String |
| 157 | `rowRefuseReason` | 表体拒绝理由 | `row_refuse_reason` | String |
| 158 | `executionStatusCode` | 订单执行状态编码 | `execution_status_code` | String |
| 159 | `executionStatus` | 订单执行状态名称 | `execution_status` | String |
| 160 | `istorestatus` | 订单执行情况维护 | `istorestatus` | String |
| 161 | `productIid` | 物料/产品ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 162 | `buyofferdetailid` | 询价单id | `buyofferdetailid` | Long |
| 163 | `contractMaterialId` | 采购合同物料id | `contractmaterial_id` | Long |
| 164 | `purOrderDetailId` | 采购订单子表id | `pur_order_detail_id` | Long |
| 165 | `benchmarkType` | 基准价参考 | `benchmark_type` | String |
| 166 | `settlementType` | 结算基准日 | `settlement_type` | String |
| 167 | `isArrivePlan` | 是否到货计划:0-否;1-是 | `is_arrive_plan` | Boolean |
| 168 | `refArea` | 参考地区 | `ref_area` | String |
| 169 | `id` | ID | `id` | Long |
| 170 | `orderDetailId` | 订单明细ID(来源于外系统) | `order_detail_id` | String |
| 171 | `confirmQuantity` | 确认数量 | `confirm_quantity` | Decimal |
| 172 | `totalDelivQuantity` | 累计发货数量 | `total_deliv_quantity` | Decimal |
| 173 | `confirmPrice` | 确认单价 | `confirm_price` | Decimal |
| 174 | `currencyCode` | 货币code | `currency_code` | String |
| 175 | `unitid` | 计价单位Id | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 176 | `unitCode` | 计价单位编码 | `unit_code` | String |
| 177 | `discountPrice` | 折后价格 | `discount_price` | Decimal |
| 178 | `confirmAmount` | 确认产品金额(供应方) | `confirm_amount` | Decimal |
| 179 | `discount` | 折扣率 | `discount` | Decimal |
| 180 | `orderId` | 销售订单id | `order_id` | 411548cf-a4fa-45ff-934f-06be5c9ddd04 |
| 181 | `gmtModified` | 修改时间 | `gmt_modified` | DateTime |
| 182 | `pricedecisionid` | 定价单主表id | `pricedecisionid` | Long |
| 183 | `pricedecidetailid` | 定价单子表id | `pricedecidetailid` | Long |
| 184 | `creator` | 创建人 | `creator` | String |
| 185 | `deliverEnterpriseId` | 收货单位id | `deliver_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 186 | `deliverEnterprise` | 收货单位id | `deliver_enterprise` | String |
| 187 | `pritemId` | 需求单的id | `pritemid` | String |
| 188 | `suppProductId` | 供应商商品id | `supp_product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 189 | `suppProductName` | 供应商商品名称 | `supp_product_name` | String |
| 190 | `skuId` | 物料SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 191 | `skuCode` | 商品sku的skucode | `sku_code` | String |
| 192 | `skuValue` | 商品sku详细属性信息 | `sku_value` | String |
| 193 | `reqOrgId` | 需求组织ID | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 194 | `line_no` | 对应电商用 | `line_no` | Integer |
| 195 | `refNo` | 到货情况 | `ref_no` | String |
| 196 | `materialBrand` | 物料品牌 | `material_brand` | String |
| 197 | `orderCodeLineNum` | 采购订单-行号 | `order_code_line_num` | String |
| 198 | `recv_org` | 收货组织ID | `recv_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 199 | `changeProductIid` | 变更物料Id | `change_product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 200 | `changeUnit` | 变更物料单位 | `change_unit` | String |
| 201 | `changeActive` | 变更动作 | `change_active` | String |
| 202 | `changePrice` | 变更无税单价 | `change_price` | Decimal |
| 203 | `changeTaxPrice` | 变更含税单价 | `change_tax_price` | Decimal |
| 204 | `blargess` | 赠品 | `blargess` | Boolean |
| 205 | `isMaterialClass` | 是否物料分类合同 | `is_material_class` | String |
| 206 | `materialclassId` | 物料分类id | `materialclass_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 207 | `materialclassName` | 物料分类名称 | `materialclass_name` | String |
| 208 | `materialclassCode` | 物料分类编码 | `materialclass_code` | String |
| 209 | `receivePersonId` | 收货人id | `receive_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 210 | `reqDate` | 需求时间 | `req_date` | DateTime |
| 211 | `reqErpRelatedInfo` | ERP相关信息 | `req_erp_related_info` | String |
| 212 | `returnQuantity` | 已退货数量 | `return_quantity` | Decimal |
| 213 | `isPeriodMng` | 是否保质期管理 | `is_period_mng` | Integer |
| 214 | `isSerialnoMng` | 是否序列号管理 | `is_serialno_mng` | Integer |
| 215 | `isBatchMng` | 是否批次管理 | `is_batch_mng` | Integer |
| 216 | `isVerifyCert` | 是否验证注册证 | `is_verify_cert` | Integer |
| 217 | `isVerifyAuthorization` | 是否验证授权书 | `is_verify_authorization` | Integer |
| 218 | `purPersonCode` | 工号 | `pur_person_code` | String |
| 219 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 220 | `upcode` | 上游单据号 | `upcode` | String |
| 221 | `source` | 上游单据类型 | `source` | String |
| 222 | `materialInfo` | 物料冗余信息 | `material_info` | String |
| 223 | `recvstorCode` | 收货仓库code | `recvstor_code` | String |
| 224 | `recOrgCode` | 收货组织编码 | `rec_org_code` | String |
| 225 | `requireBrandId` | 要求品牌品牌id | `require_brand_id` | Long |
| 226 | `requireBrandCode` | 要求品牌code | `require_brand_code` | String |
| 227 | `requireBrandErpId` | 要求品牌erpid | `require_brand_erp_id` | String |
| 228 | `confirmBrandId` | 确认品牌品牌id | `confirm_brand_id` | Long |
| 229 | `confirmBrandCode` | 确认品牌code | `confirm_brand_code` | String |
| 230 | `confirmBrandErpId` | 确认品牌erpid | `confirm_brand_erp_id` | String |
| 231 | `tax` | 税额 | `tax` | Decimal |
| 232 | `closeOrderReason` | 订单关闭理由 | `close_order_reason` | String |
| 233 | `changeBrandId` | 变更品牌品牌id | `change_brand_id` | Integer |
| 234 | `changeBrandCode` | 变更品牌编码 | `change_brand_code` | String |
| 235 | `changeBrandErpId` | 变更品牌erpid | `change_brand_erp_id` | String |
| 236 | `arriveClose` | 到货关闭 | `arrive_close` | Integer |
| 237 | `paymentClose` | 付款关闭 | `payment_close` | Integer |
| 238 | `godownClose` | 入库关闭 | `godown_close` | Integer |
| 239 | `invoiceClose` | 开票关闭 | `invoice_close` | Integer |
| 240 | `finalClose` | 最终关闭 | `final_close` | Integer |
| 241 | `contractId` | 采购合同id | `contract_id` | Long |
| 242 | `projectId` | 项目档案id | `project_id` | Long |
| 243 | `purchaseUnitId` | 采购单位id | `purchase_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 244 | `purchaseUnitCode` | 采购单位code | `purchase_unit_code` | String |
| 245 | `accomplishedPurchaseNum` | 已执行采购单位数量 | `accomplished_purchase_num` | Decimal |
| 246 | `mainMetrologyId` | 主单位id | `main_metrology_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 247 | `mainMetrologyCode` | 主单位code | `main_metrology_code` | String |
| 248 | `accomplishedMainNum` | 已执行主单位数量 | `accomplished_main_num` | Decimal |
| 249 | `boxingRecords` | 销售订单装箱记录孙表 | `` | 852d2588-7284-411d-bfda-a3f7be37d565 |
| 250 | `defines` | 销售订单表体自定义项 | `` | 0f372ca6-c70a-4b09-8a6c-42593f33c686 |
| 251 | `detailParallel` | 销售订单子表拓展 | `` | 0667c4a0-850b-40c6-965c-829699725948 |
| 252 | `paymentProgressACKs` | 销售订单进度确认执行孙表 | `` | 8a4787fc-f267-4e90-b81a-1cd9c245f580 |
| 253 | `saleOrderDetailHealth` | 销售订单医疗子表 | `` | ccdfa8fd-5d2c-4c82-a22e-4348ee9782cd |

---

## 关联属性（27个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `changeProductIid` | 变更物料Id | `pc.product.Product` | Service |  |
| 2 | `mallOrderId` | 超市订单id | `mall.mallofficeorder.MallOrder` | Service |  |
| 3 | `orderId` | 销售订单id | `cpu-order.saleorder.SaleOrderVO` | None | true |
| 4 | `paymentProgressACKs` | 销售订单进度确认执行孙表 | `cpu-order.saleorder.SaleOrdersPaymentProgressAck` | None | true |
| 5 | `boxingRecords` | 销售订单装箱记录孙表 | `cpu-order.saleorder.SaleOrderBoxingRecordVO` | None | true |
| 6 | `defines` | 销售订单表体自定义项 | `cpu-order.saleorder.SaleOrderDetailVODefine` | None | true |
| 7 | `suppProductId` | 供应商商品id | `pc.product.Product` | Service |  |
| 8 | `saleOrderDetailDefineCharacter` | 自定义项特征属性组 | `cpu-order.saleorder.SaleOrderCharacterDefine` | None |  |
| 9 | `ticketOrgId` | 收票组织 | `org.func.BaseOrg` | Service |  |
| 10 | `materialclassId` | 物料分类id | `pc.cls.ManagementClass` | Service |  |
| 11 | `reqOrgId` | 需求组织ID | `org.func.BaseOrg` | Service |  |
| 12 | `taxRateId` | 税目 | `bd.taxrate.TaxRateVO` | Service |  |
| 13 | `detailParallel` | 销售订单子表拓展 | `cpu-order.saleorder.SaleOrderDetailParallelVO` | None | true |
| 14 | `recvstorId` | 仓库档案ID | `aa.warehouse.Warehouse` | Service |  |
| 15 | `skuId` | 物料SKU | `pc.product.ProductSKU` | Service |  |
| 16 | `purchaseUnitId` | 采购单位id | `pc.unit.Unit` | Service |  |
| 17 | `deliverEnterpriseId` | 收货单位id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 18 | `productIid` | 物料/产品ID | `pc.product.Product` | Service |  |
| 19 | `saleOrderDetailHealth` | 销售订单医疗子表 | `cpu-order.saleorder.SaleOrderDetailHealthVO` | None | true |
| 20 | `mallOrderDetailId` | 超市订单id | `mall.mallofficeorder.OrderDetail` | Service |  |
| 21 | `mainMetrologyId` | 主单位id | `pc.unit.Unit` | Service |  |
| 22 | `receivePersonId` | 收货人id | `bd.staff.Staff` | Service |  |
| 23 | `confirmTaxRateId` | 确认税目 | `bd.taxrate.TaxRateVO` | Service |  |
| 24 | `saleOrderDetailFreeCharacteristics` | 自由项特征组实体 | `cpu-order.saleorder.SaleOrderCharacteristicsDefine` | None |  |
| 25 | `unitid` | 计价单位Id | `pc.unit.Unit` | Service |  |
| 26 | `outsourcerId` | 委外商主键 | `aa.vendor.Vendor` | Service |  |
| 27 | `recv_org` | 收货组织ID | `org.func.BaseOrg` | Service |  |
