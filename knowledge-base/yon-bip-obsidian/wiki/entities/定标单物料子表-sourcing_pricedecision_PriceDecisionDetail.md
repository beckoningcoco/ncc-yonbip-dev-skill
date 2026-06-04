---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.pricedecision.PriceDecisionDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 定标单物料子表 (`sourcing.pricedecision.PriceDecisionDetail`)

> ycSouringInquiry | 物理表：`cpu_pricedecision_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 定标单物料子表 |
| 物理表 | `cpu_pricedecision_detail` |
| 数据库 schema | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:10:48.2730` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 定标单表体ID |

---

## 直接属性（190个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `rowNo` | 行号 | `row_no` | Long |
| 2 | `buyofferRowNo` | 询价单行号 | `buyoffer_row_no` | Long |
| 3 | `productDesc` | 物料的规格描述 | `product_desc` | String |
| 4 | `PriceDecisionDetailFreeCharacteristics` | 定标单子表自由项特征组 | `free_characters_id` | 590d32ba-9b33-43a9-8b44-443bd0773751 |
| 5 | `releasedZnbzbxNums` | 定标单推合同或者订单释放费控数量 | `released_znbzbx_nums` | Decimal |
| 6 | `releasedZnbzbxTaxmny` | 定标单推合同或者订单释放费控含税金额 | `released_znbzbx_taxmny` | Decimal |
| 7 | `purchaseUnitName` | 采购单位名称 | `purchaseUnitName` | String |
| 8 | `purchaseUnitCode` | 采购单位编码 | `purchaseUnitCode` | String |
| 9 | `singleBudgetApplyid` | 单项预算申请单编号 | `single_budget_applyid` | c89a2b73-7637-4642-abc1-c49bf1a5c460 |
| 10 | `purchaseUnitId` | 采购单位ID | `purchaseUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 11 | `singleBudgetApplybid` | 单项预算申请单明细 | `single_budget_applybid` | 0dd17389-d0ee-4f01-b34b-9a17be57afcb |
| 12 | `nnum` | 求购数量 | `nnum` | Decimal |
| 13 | `expenseItemId` | 费用项目 | `expense_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 |
| 14 | `supplierDocId` | 推荐供应商档案ID | `supplier_doc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 15 | `supEnterpriseName` | 推进供应商名称 | `sup_enterprise_name` | String |
| 16 | `targetOrgId` | 目标组织id(合同或订单组织) | `target_org_id` | 8006983d-d605-473b-b0c4-0e9469aaacff |
| 17 | `targetPurUser` | 目标用户ID(合同或订单采购员) | `target_pur_user` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 18 | `reqUapProjectId` | 平台项目档案id | `req_uap_project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 19 | `buyofferType` | 询价单类型 | `buyoffer_type` | String |
| 20 | `supplierBidMoney` | 供应商中标含税总金额 | `supplier_bid_money` | Decimal |
| 21 | `supplierBidNotaxMoney` | 供应商中标无税总金额 | `supplier_bid_notax_money` | Decimal |
| 22 | `strategyId` | 管控策略id | `strategy_id` | da7e5585-8f8c-4510-b005-9e6bcaf6995d |
| 23 | `exchRateOps` | 汇率折算方式 | `exchRateOps` | ExchangeRateMethod |
| 24 | `acceptanceMny` | 承兑金额 | `acceptance_mny` | Decimal |
| 25 | `taxRateId` | 税目id | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 26 | `supplierDocCode` | 供应商档编码 | `supplier_doc_code` | String |
| 27 | `qtCurrencyNameDiwork` | BIP报价币种名称 | `qt_currency_name_diwork` | String |
| 28 | `convertNoTaxPrice` | 折算后本币无税单价 | `convert_notax_price` | Decimal |
| 29 | `discountTaxType` | 扣税类别 | `discount_tax_type` | String |
| 30 | `qtCurrencyTypeSignDiwork` | BIP报价币种符号 | `qt_currency_type_sign_diwork` | String |
| 31 | `materialCode` | 物料编码 | `material_code` | String |
| 32 | `supplierDocName` | 供应商档案名称 | `supplier_doc_name` | String |
| 33 | `tax` | 税额 | `tax` | Decimal |
| 34 | `convertTotalPrice` | 折算后本币金额 | `convert_total_price` | Decimal |
| 35 | `materialName` | 物料名称 | `material_name` | String |
| 36 | `convertPrice` | 折算后本币单价 | `convert_price` | Decimal |
| 37 | `qtCurrencyExchRate` | 比价参考汇率 | `qt_currency_exchrate` | Decimal |
| 38 | `priceMark` | 价格标识 | `price_mark` | Short |
| 39 | `purchaseNum` | 中标采购数量 | `purchaseNum` | Decimal |
| 40 | `quotaNum` | 中标计价数量 | `quota_num` | Decimal |
| 41 | `mainNum` | 中标主数量 | `mainNum` | Decimal |
| 42 | `quotaPercentage` | 配额百分比 | `quota_percentage` | Decimal |
| 43 | `quotaProportion` | 配额比例 | `quota_proportion` | Decimal |
| 44 | `expireDate` | 报价有效期 | `expire_date` | DateTime |
| 45 | `invpurexchrate` | 采购换算率 | `invPurExchRate` | Decimal |
| 46 | `invPriceExchRate` | 计价换算率 | `invPriceExchRate` | Decimal |
| 47 | `mainUnitName` | 主单位名称 | `mainUnitName` | String |
| 48 | `mainUnitCode` | 主单位编码 | `mainUnitCode` | String |
| 49 | `mainUnitId` | 主单位ID | `mainUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 50 | `returnMsg` | 未定标退回原因 | `return_msg` | String |
| 51 | `unitid` | 计价单位ID | `unitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 52 | `unpdReleased` | 未定标释放行标示 | `unpd_released` | Integer |
| 53 | `spec` | 物料规格 | `spec` | String |
| 54 | `cunit` | 计价单位名称 | `cunit` | String |
| 55 | `unitCode` | 计价单位编码 | `unitCode` | String |
| 56 | `model` | 物料型号 | `model` | String |
| 57 | `noTaxPrice` | 中标无税单价 | `no_tax_price` | Decimal |
| 58 | `quotaPrice` | 中标含税单价 | `quota_price` | Decimal |
| 59 | `bidNumType` | 中标类型(现金、承兑、账期) | `bid_num_type` | String |
| 60 | `taxrate` | 税率(%) | `taxrate` | String |
| 61 | `noTaxMoney` | 中标无税金额 | `no_tax_money` | Decimal |
| 62 | `acceptancePrice` | 承兑单价 | `acceptance_price` | Decimal |
| 63 | `quotaMoney` | 中标含税金额 | `quota_money` | Decimal |
| 64 | `suppProductName` | 报价品牌/产品/材质/制造商/ | `supp_product_name` | String |
| 65 | `reqDate` | 需求日期 | `req_date` | DateTime |
| 66 | `reqEndTime` | 需求结束时间 | `req_end_time` | DateTime |
| 67 | `deliveryDate` | 协定到货日期 | `delivery_date` | DateTime |
| 68 | `stockCycle` | 备货周期 | `stock_cycle` | String |
| 69 | `shelfLife` | 质保期 | `shelf_life` | Integer |
| 70 | `supplyPayment` | 付款说明 | `supply_payment` | String |
| 71 | `nmaxPrice` | 最高限价 | `nmax_price` | Decimal |
| 72 | `reqOrgId` | 需求组织ID | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 73 | `reqOrgName` | 需求组织 | `req_org_name` | String |
| 74 | `reqdeptName` | 需求部门 | `reqdept_name` | String |
| 75 | `reqdeptId` | 需求部门ID | `reqdept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 76 | `addressName` | 地址名称 | `address_name` | String |
| 77 | `reqContact` | 需求人 | `req_contact` | String |
| 78 | `reqContactId` | 需求人ID | `req_contact_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 79 | `reqPurUser` | 需求单的采购员 | `req_pur_user` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 80 | `puorgDocName` | 采购组织 | `puorg_doc_name` | String |
| 81 | `puorgDocId` | 采购组织ID | `puorg_doc_id` | 8006983d-d605-473b-b0c4-0e9469aaacff |
| 82 | `receiveOrgName` | 收货组织 | `receive_org_name` | String |
| 83 | `receiveOrgId` | 收货组织ID | `receive_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 84 | `receivePersonName` | 收货人 | `receive_person_name` | String |
| 85 | `receivePersonId` | 收货人ID | `receive_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 86 | `receivePersonTel` | 收货人联系电话 | `receive_person_tel` | String |
| 87 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 88 | `benchmarkType` | 基准价枚举(找钢网) | `benchmark_type` | String |
| 89 | `reqErpRelatedInfo` | ERP相关信息 | `req_erp_related_info` | String |
| 90 | `quotaReason` | 中标理由 | `quota_reason` | String |
| 91 | `PriceDecisionDetailDefineCharacter` | 定标单子表自定义项 | `define_character_id` | cb479358-71b1-4dfd-938c-8db999175230 |
| 92 | `memo` | 备注 | `memo` | String |
| 93 | `status` | 行状态 | `status` | String |
| 94 | `fileId` | 管理附件 | `file_id` | String |
| 95 | `reqCodeErp` | 需求单号 | `req_code_erp` | String |
| 96 | `reqRownoErp` | ERP需求单行号 | `req_rowno_erp` | String |
| 97 | `bidNum` | 投标数量 | `bid_num` | Decimal |
| 98 | `ceilingPrice` | 最高限价 | `ceiling_price` | Decimal |
| 99 | `currency_id` | 询价币种 | `currency_id_diwork` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 100 | `qt_currency_id` | 报价币种ID | `qt_currency_id_diwork` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 101 | `brand` | 品牌厂家(找钢网) | `brand` | String |
| 102 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 103 | `cityId` | 市 | `city_id` | Long |
| 104 | `colligate` | 专家分 | `colligate` | Decimal |
| 105 | `contactinfo` | 联系信息 | `contactinfo` | String |
| 106 | `defprojectRowNo` | 立项行号 | `defproject_row_no` | Long |
| 107 | `districtId` | 区 | `district_id` | Long |
| 108 | `dr` | dr | `dr` | String |
| 109 | `erpProjectId` | erp项目id | `erp_project_id` | String |
| 110 | `erpProjectName` | erp项目名称 | `erp_project_name` | String |
| 111 | `exchangeRate` | 单位换算率 | `exchange_rate` | Decimal |
| 112 | `exchange_rate` | 汇率 | `exchange_rate_diwork` | Decimal |
| 113 | `freight` | 运费 | `freight` | Decimal |
| 114 | `freightRate` | 运费税率 | `freight_rate` | String |
| 115 | `identityQuantity` | 个性化数量-飞鹤用 | `identity_quantity` | Decimal |
| 116 | `ip` | 供应商报价ip地址 | `ip` | String |
| 117 | `isMinPrice` | 是否最低中标单价 | `is_min_price` | String |
| 118 | `isReplace` | 是否代报价 | `is_replace` | Integer |
| 119 | `materialChanged` | 是否绑定物料 | `material_changed` | Integer |
| 120 | `materialOid` | 原始物料信息 | `material_oid` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 121 | `orderSplit` | 订单弹性分单条件标识 | `order_split` | String |
| 122 | `orderSplitName` | 订单弹性分单条件标识名称 | `order_split_name` | String |
| 123 | `convertNoTaxMoney` | 折算询价币中标无税金额 | `convert_notax_money` | Decimal |
| 124 | `orderedNum` | 已执行量 | `orderedNum` | Decimal |
| 125 | `paymentMny` | 账期金额 | `payment_mny` | Decimal |
| 126 | `paymentPrice` | 账期单价 | `payment_price` | Decimal |
| 127 | `priceScore` | 价格分 | `price_score` | Decimal |
| 128 | `priceType` | “报价类型”:选项有“(正式报价:null; 参考转正:1 ; 参考报价:2)” | `price_type` | String |
| 129 | `priceValidateDate` | 价格有效期 | `price_validate_date` | DateTime |
| 130 | `projectMaterialId` | 招标立项子表id | `project_material_id` | Long |
| 131 | `provinceId` | 省 | `province_id` | Long |
| 132 | `pubts` | pubts时间戳 | `pubts` | DateTime |
| 133 | `quality` | 质量要求(找钢网) | `quality` | String |
| 134 | `quotaUnit` | 报价单位 | `quota_unit` | String |
| 135 | `rate_type` | 汇率类型 | `rate_type_diwork` | String |
| 136 | `refNo` | 供应商协议号 | `ref_no` | String |
| 137 | `settlementType` | 结算日枚举(找钢网) | `settlement_type` | String |
| 138 | `skuId` | 商品sku | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 139 | `supbidBid` | 投标单表体id | `supbid_bid` | Long |
| 140 | `supbidHid` | 投标单表头id | `supbid_hid` | Long |
| 141 | `suppOldProductName` | 供应商报价品牌name-飞鹤 | `supp_oldproduc_name` | String |
| 142 | `suppOldProductUrl` | 供应商报价品牌url-飞鹤 | `supp_oldproduc_url` | String |
| 143 | `suppOldproductId` | 供应商报价品牌id-飞鹤 | `supp_oldproduct_id` | Integer |
| 144 | `suppProductCode` | 供应商报价品牌品牌code | `supp_product_code` | String |
| 145 | `suppProductErpid` | 供应商报价品牌品牌erpid | `supp_product_erpid` | String |
| 146 | `suppProductId` | 供应商商品id | `supp_product_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 147 | `suppProductUrl` | 供应商商品url | `supp_product_url` | String |
| 148 | `supplierCode` | 供应商登入用户编码 | `supplier_code` | String |
| 149 | `supplierId` | 供应商登入用户 | `supplier_id` | Long |
| 150 | `supplierPhone` | 供应商登入用户的电话 | `supplier_phone` | String |
| 151 | `supplyChanged` | 行是否做过定标变更 | `supply_changed` | Integer |
| 152 | `supplyChangingDestNums` | 明细行的定标变更中的“新中标供应商”执行数量 | `supply_changing_dest_nums` | Integer |
| 153 | `taxFullMoney` | 含税总价全额预付 | `tax_full_money` | Decimal |
| 154 | `taxFullPrice` | 含税单价全额预付 | `tax_full_price` | Decimal |
| 155 | `taxPartialMoney` | 含税总价部分预付 | `tax_partial_money` | Decimal |
| 156 | `taxPartialPrice` | 含税单价部分预付 | `tax_partial_price` | Decimal |
| 157 | `totalScore` | 总分 | `total_score` | Decimal |
| 158 | `ts` | ts时间戳 | `ts` | DateTime |
| 159 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 160 | `id` | 定标单表体ID | `id` | Long |
| 161 | `cpuPricedecisionId` | 定标单ID | `cpu_pricedecision_id` | 4c65ba32-f884-44bd-ad0d-21414f32c012 |
| 162 | `pritemid` | 需求单ID | `pritemid` | bac52eb7-97d5-4c52-8a52-cc1d9bf96c66 |
| 163 | `buyofferid` | 询价单ID | `buyofferid` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 |
| 164 | `buyofferdetailid` | 询价单表体ID | `buyofferdetailid` | 82d935cb-9072-4a12-b50a-8c1950dfd402 |
| 165 | `materialClassId` | 物料分类ID | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 166 | `materialId` | 物料ID | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 167 | `enterpriseId` | 采购商企业ID | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 168 | `supplierName` | 报价的供应商 | `supplier_name` | String |
| 169 | `materialDesc` | 需求描述 | `material_desc` | String |
| 170 | `quotaofferid` | 报价单ID | `quotaofferid` | f481bff4-9adb-490e-997f-bedc510ce69b |
| 171 | `quotaofferdetailid` | 报价单表体ID | `quotaofferdetailid` | 52035a4f-aa8a-4ec4-8b75-858a5396cca4 |
| 172 | `supEnterpriseId` | 供应商企业ID | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 173 | `costcenterId` | 成本中心id | `costcenter_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 174 | `priceStrategy` | 取价策略id | `price_strategy` | 3dab7aea-9e18-4a82-8712-f029fd1ec393 |
| 175 | `dimensionPricingId` | 报价ID | `dimension_pricing_id` | eb9690f1-b4ed-4223-8ce3-06710f2c6242 |
| 176 | `costQuoteGroupId` | 成本项报价组id | `cost_quote_group_id` | 2b728cc3-82ca-4e8f-8b98-49f9f1df7acd |
| 177 | `bodydefine` | 定标单子表自由自定义项 | `` | ee69f8aa-1a9c-4232-89c5-08de9fb2f422 |
| 178 | `businessType` | 业务类型 | `business_type` | String |
| 179 | `costs` | 定标子表成本项明细 | `` | f73f1f71-0edf-45dd-8732-3d1137af4795 |
| 180 | `detailSku` | 定标单物料子表SKU扩展表 | `` | afacad93-96cd-4fd0-9e43-04f56063f4e4 |
| 181 | `invPriceExchRateDen` | 计价换算率分母 | `invPriceExchRateden` | Decimal |
| 182 | `invPriceExchRateNum` | 计价换算率分子 | `invPriceExchRatenum` | Decimal |
| 183 | `invpurexchrateDen` | 采购换算率分母 | `invPurExchRateden` | Decimal |
| 184 | `invpurexchrateNum` | 采购换算率分子 | `invPurExchRatenum` | Decimal |
| 185 | `lineno` | 行号 | `row_no` | Long |
| 186 | `sourceautoid` | 来源单据子表ID | `sourceautoid` | 0bf5c9da-2727-45a3-a304-2c058121c8a3 |
| 187 | `steps` | 定标子表价格阶梯明细 | `` | af950793-18a0-43b9-8a69-955a017f00bb |
| 188 | `taxCodeId` | 税码 | `tax_code_id` | 3f7c3856-5b00-4506-b458-a64eed0d3bfb |
| 189 | `taxResults` | 计税结果 | `` | 3efd0d21-9ca2-40c5-908e-0084854d42a0 |
| 190 | `withholdingTax` | 代扣税额 | `withholding_tax` | Decimal |

---

## 关联属性（48个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `expenseItemId` | 费用项目 | `bd.expenseitem.ExpenseItem` | Service |  |
| 2 | `supplierDocId` | 推荐供应商档案ID | `aa.vendor.Vendor` | Service |  |
| 3 | `targetPurUser` | 目标用户ID(合同或订单采购员) | `bd.staff.Staff` | Service |  |
| 4 | `qt_currency_id` | 报价币种ID | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 5 | `reqdeptId` | 需求部门ID | `bd.adminOrg.AdminOrgVO` | Service |  |
| 6 | `singleBudgetApplybid` | 单项预算申请单明细 | `znbzbx.memoapply.MemoApplyBVO` | Service |  |
| 7 | `cpuPricedecisionId` | 定标单ID | `sourcing.pricedecision.PriceDecision` | None | true |
| 8 | `costcenterId` | 成本中心id | `bd.costcenter.CostCenter` | Service |  |
| 9 | `priceStrategy` | 取价策略id | `aa.pricestrategy.PriceStrategy` | Service |  |
| 10 | `targetOrgId` | 目标组织id(合同或订单组织) | `bd.adminOrg.PurchaseOrgVO` | Service |  |
| 11 | `suppProductId` | 供应商商品id | `aa.vendor.Vendor` | Service |  |
| 12 | `strategyId` | 管控策略id | `sourcing.businessRuleSolution.BusinessRuleControlStrategy` | Service |  |
| 13 | `reqPurUser` | 需求单的采购员 | `bd.staff.Staff` | Service |  |
| 14 | `reqOrgId` | 需求组织ID | `org.func.BaseOrg` | Service |  |
| 15 | `taxRateId` | 税目id | `archive.taxArchives.TaxRateArchive` | Service |  |
| 16 | `skuId` | 商品sku | `pc.product.ProductSKU` | Service |  |
| 17 | `mainUnitId` | 主单位ID | `pc.unit.Unit` | Service |  |
| 18 | `buyofferdetailid` | 询价单表体ID | `sourcing.ibuyoffer.BuyOfferBodyVO` | None |  |
| 19 | `costs` | 定标子表成本项明细 | `sourcing.pricedecision.PriceDecisionBodyCost` | None | true |
| 20 | `purchaseUnitId` | 采购单位ID | `pc.unit.Unit` | Service |  |
| 21 | `reqUapProjectId` | 平台项目档案id | `bd.project.ProjectVO` | Service |  |
| 22 | `PriceDecisionDetailDefineCharacter` | 定标单子表自定义项 | `sourcing.pricedecision.PriceDecisionDetailDefineCharacter` | None |  |
| 23 | `receiveOrgId` | 收货组织ID | `org.func.BaseOrg` | Service |  |
| 24 | `materialClassId` | 物料分类ID | `pc.cls.ManagementClass` | Service |  |
| 25 | `PriceDecisionDetailFreeCharacteristics` | 定标单子表自由项特征组 | `sourcing.pricedecision.PriceDecisionDetailFreeCharacters` | None |  |
| 26 | `costQuoteGroupId` | 成本项报价组id | `aa.costquote.CpuCostPricing` | Service |  |
| 27 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 28 | `detailSku` | 定标单物料子表SKU扩展表 | `sourcing.pricedecision.BodySkuVO` | None | true |
| 29 | `bodydefine` | 定标单子表自由自定义项 | `sourcing.pricedecision.PriceDecisionDetailDefine` | None | true |
| 30 | `materialOid` | 原始物料信息 | `pc.product.Product` | Service |  |
| 31 | `materialId` | 物料ID | `pc.product.Product` | Service |  |
| 32 | `reqContactId` | 需求人ID | `bd.staff.Staff` | Service |  |
| 33 | `taxCodeId` | 税码 | `taxpubdoc.taxengine.TaxCode` | Service |  |
| 34 | `steps` | 定标子表价格阶梯明细 | `sourcing.pricedecision.PriceDecisionBodyStep` | None | true |
| 35 | `taxResults` | 计税结果 | `sourcing.pricedecision.TaxCalculationResult` | None | true |
| 36 | `singleBudgetApplyid` | 单项预算申请单编号 | `znbzbx.memoapply.MemoApplyVO` | Service |  |
| 37 | `dimensionPricingId` | 报价ID | `aa.pricecenter.BiPriceEntity` | Service |  |
| 38 | `buyofferid` | 询价单ID | `sourcing.ibuyoffer.BuyOfferVO` | None |  |
| 39 | `receivePersonId` | 收货人ID | `bd.staff.Staff` | Service |  |
| 40 | `puorgDocId` | 采购组织ID | `bd.adminOrg.PurchaseOrgVO` | Service |  |
| 41 | `sourceautoid` | 来源单据子表ID | `sourcing.pricecomparison.CpuPreQtoffer` | None |  |
| 42 | `quotaofferid` | 报价单ID | `sourcing.ibuyoffer.CpuPriceQuotationOffer` | None |  |
| 43 | `pritemid` | 需求单ID | `sourcing.pureq.IpuPuReq` | None |  |
| 44 | `supEnterpriseId` | 供应商企业ID | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 45 | `unitid` | 计价单位ID | `pc.unit.Unit` | Service |  |
| 46 | `enterpriseId` | 采购商企业ID | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 47 | `quotaofferdetailid` | 报价单表体ID | `sourcing.ibuyoffer.CpuPriceQuotationOfferDetail` | None |  |
| 48 | `currency_id` | 询价币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
