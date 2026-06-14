---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.ibuyoffer.CpuPriceQuotationOfferDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 报价单子表 (`sourcing.ibuyoffer.CpuPriceQuotationOfferDetail`)

> ycSouringInquiry | 物理表：`cpu_qtoffer_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报价单子表 |
| 物理表 | `cpu_qtoffer_detail` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:46.3460` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 报价单行ID |

---

## 直接属性（152个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `rowNo` | 行号 | `row_no` | Long |
| 2 | `cpuofferid` | 报价单ID | `cpuofferid` | f481bff4-9adb-490e-997f-bedc510ce69b |
| 3 | `id` | 报价单行ID | `id` | Long |
| 4 | `productName` | 物料名称 | `product_name` | String |
| 5 | `productDescribe` | 物料需求描述 | `product_describe` | String |
| 6 | `productSpec` | 物料规格 | `product_spec` | String |
| 7 | `productType` | 物料型号 | `product_type` | String |
| 8 | `productId` | 外部商品id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 9 | `qoDetailDefineCharacter` | 报价单子表自定义项 | `define_character_id` | 6f361848-a1bc-4887-a724-e44df1d69104 |
| 10 | `memo` | 备注 | `memo` | String |
| 11 | `erpProjectName` | 项目名称 | `erp_project_name` | String |
| 12 | `qtCurrencyNameDiwork` | 报价币种名称 | `qt_currency_name_diwork` | String |
| 13 | `discountTaxType` | 扣税类别 | `discount_tax_type` | String |
| 14 | `taxRateId` | 税率id | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 15 | `taxCodeId` | 税码 | `tax_code_id` | 3f7c3856-5b00-4506-b458-a64eed0d3bfb |
| 16 | `priceWithholdingTax` | 现金代扣税额 | `price_withholding_tax` | Decimal |
| 17 | `accWithholdingTax` | 承兑代扣税额 | `acc_withholding_tax` | Decimal |
| 18 | `paymentWithholdingTax` | 账期代扣税额 | `payment_withholding_tax` | Decimal |
| 19 | `invpurexchrateNum` | 换算率分子 | `invPurExchRatenum` | Decimal |
| 20 | `invpurexchrateDen` | 换算率分母 | `invPurExchRateden` | Decimal |
| 21 | `invpriceexchrateNum` | 计价换算率分子 | `invpriceexchratenum` | Decimal |
| 22 | `invpriceexchrateDen` | 计价换算率分母 | `invpriceexchrateden` | Decimal |
| 23 | `qtCurrencyTypeSignDiwork` | 报价币种符号 | `qt_currency_type_sign_diwork` | String |
| 24 | `qtCurrencyCodeDiwork` | 报价币种编码 | `qt_currency_code_diwork` | String |
| 25 | `tax` | 税额(现金) | `tax` | Decimal |
| 26 | `qtCurrencyIdDiwork` | 报价币种id | `qt_currency_id_diwork` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 27 | `qoDetailFreeCharacteristics` | 报价单子表自由项特征组 | `free_characters_id` | c1e518d4-f732-49f7-a3e2-6d79f113858a |
| 28 | `taxPayment` | 税额(账期) | `tax_payment` | Decimal |
| 29 | `taxAcceptance` | 税额(承兑) | `tax_acceptance` | Decimal |
| 30 | `priceMark` | 价格标识 | `price_mark` | Short |
| 31 | `unitid` | 外部商品单位id | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 32 | `purchaseamount` | 采购数量(不用) | `purchaseamount` | Decimal |
| 33 | `purchaseunitname` | 采购单位 | `purchaseUnitName` | String |
| 34 | `purchaseunitcode` | 采购单位编码 | `purchaseUnitCode` | String |
| 35 | `purchaseunitid` | 采购单位id | `purchaseUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 36 | `invpurexchrate` | 采购换算率 | `invPurExchRate` | Decimal |
| 37 | `purchasenum` | 采购数量 | `purchaseNum` | Decimal |
| 38 | `amount` | 计价数量 | `amount` | Decimal |
| 39 | `unit` | 计价单位 | `unit` | String |
| 40 | `invpriceexchrate` | 计价换算率 | `invPriceExchRate` | Decimal |
| 41 | `mainnum` | 主数量 | `mainNum` | Decimal |
| 42 | `mainunitname` | 主单位 | `mainUnitName` | String |
| 43 | `mainunitcode` | 主单位编码 | `mainUnitCode` | String |
| 44 | `mainunitid` | 主单位id | `mainUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 45 | `invPurExchRateType` | 采购换算率类型 | `invPurExchRateType` | Short |
| 46 | `nmaxPrice` | 最高限价 | `nmax_price` | Decimal |
| 47 | `suppProductName` | 品牌/产地/材质/制造商 | `supp_product_name` | String |
| 48 | `taxrate` | 税率(单位:%) | `taxrate` | String |
| 49 | `price` | 含税单价(现金) | `price` | Decimal |
| 50 | `noTaxPrice` | 无税单价(现金) | `no_tax_price` | Decimal |
| 51 | `acceptancePrice` | 含税单价(承兑) | `acceptance_price` | Decimal |
| 52 | `noTaxAcceptancePrice` | 无税单价(承兑) | `no_tax_acceptance_price` | Decimal |
| 53 | `paymentPrice` | 含税单价(账期) | `payment_price` | Decimal |
| 54 | `noTaxPaymentPrice` | 无税单价(账期) | `no_tax_payment_price` | Decimal |
| 55 | `priceRanking` | 现金含税报价排名 | `price_ranking` | Integer |
| 56 | `noTaxPriceRanking` | 现金无税报价排名 | `no_tax_price_ranking` | Integer |
| 57 | `acceptancePriceRanking` | 承兑含税报价排名 | `acceptance_price_ranking` | Integer |
| 58 | `noTaxAcceptancePriceRanking` | 承兑无税报价排名 | `no_tax_acceptance_price_ranking` | Integer |
| 59 | `paymentPriceRanking` | 账期含税报价排名 | `payment_price_ranking` | Integer |
| 60 | `noTaxPaymentPriceRanking` | 账期无税报价排名 | `no_tax_payment_price_ranking` | Integer |
| 61 | `ordered` | (废弃) | `ordered` | String |
| 62 | `dr` | 删除标志 | `dr` | Short |
| 63 | `noTaxMoney` | 无税金额(现金) | `no_tax_money` | Decimal |
| 64 | `pureqid` | (废弃) | `pureqid` | String |
| 65 | `totalPrice` | 含税金额(现金) | `total_price` | String |
| 66 | `noTaxAcceptanceMny` | 无税金额(承兑) | `no_tax_acceptance_mny` | Decimal |
| 67 | `acceptanceMny` | 含税金额(承兑) | `acceptance_mny` | Decimal |
| 68 | `noTaxPaymentMny` | 无税金额(账期) | `no_tax_payment_mny` | Decimal |
| 69 | `paymentMny` | 含税金额(账期) | `payment_mny` | Decimal |
| 70 | `reqdate` | 需求日期 | `reqdate` | DateTime |
| 71 | `deliveryDate` | 交货期 | `delivery_date` | DateTime |
| 72 | `stockCycle` | 备货周期 | `stock_cycle` | String |
| 73 | `shelfLife` | 质保期(单位:月) | `shelf_life` | Integer |
| 74 | `receivePersonName` | 收货人 | `receive_person_name` | String |
| 75 | `receivePersonId` | 收货人id | `receive_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 76 | `receivePersonTel` | 收货人电话 | `receive_person_tel` | String |
| 77 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 78 | `reqOrgName` | 需求组织 | `req_org_name` | String |
| 79 | `reqdeptName` | 需求部门 | `reqdept_name` | String |
| 80 | `receiveOrgName` | 收货组织名称 | `receive_org_name` | String |
| 81 | `receiveOrgId` | 收货组织id | `receive_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 82 | `refuseQuot` | 拒绝状态 | `refuse_quot` | Boolean |
| 83 | `detailFile` | 报价附件 | `detailFile` | String |
| 84 | `createPin` | 创建人 | `create_pin` | String |
| 85 | `createTime` | 创建时间 | `create_time` | DateTime |
| 86 | `updatePin` | 更新人 | `update_pin` | String |
| 87 | `updateTime` | 更新时间 | `update_time` | Date |
| 88 | `sysVersion` | 版本 | `sys_version` | Integer |
| 89 | `pritemid` | 采购需求行ID | `pritemid` | bac52eb7-97d5-4c52-8a52-cc1d9bf96c66 |
| 90 | `offerId` | 询价单ID | `offer_id` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 |
| 91 | `offerBId` | 询价单行ID | `offer_b_id` | 82d935cb-9072-4a12-b50a-8c1950dfd402 |
| 92 | `reqOrgid` | 采购组织id | `req_orgid` | 14302233-1394-4a70-94e1-bed51636f312 |
| 93 | `planDeptid` | 采购部门ID | `plan_deptid` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 94 | `planDeptName` | 采购部门名称 | `plan_dept_name` | String |
| 95 | `plannerid` | 计划员id | `plannerid` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 96 | `plannerName` | 计划员名称 | `planner_name` | String |
| 97 | `alipriceid` | 1688报价单id | `alipriceid` | String |
| 98 | `suppProductId` | 供应商产品Id | `supp_product_id` | Long |
| 99 | `suppProductUrl` | 供应商产品URL缩略图 | `supp_product_url` | String |
| 100 | `skuId` | 供应商产品 sku id | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 101 | `skuCode` | 供应商产品 sku编码 | `sku_code` | String |
| 102 | `quotaUnit` | 报价单位 | `quota_unit` | String |
| 103 | `exchangeRate` | 单位换算率 | `exchange_rate` | Decimal |
| 104 | `refNo` | 供应商协议号 | `ref_no` | String |
| 105 | `priceValidateDate` | 价格有效期 | `price_validate_date` | DateTime |
| 106 | `status` | 状态 | `status` | String |
| 107 | `quotEnable` | 是否允许报价 | `quot_enable` | Boolean |
| 108 | `lastTalkTotalPrice` | 上轮谈判-现金含税单价 | `last_talk_total_price` | Decimal |
| 109 | `lastTalkNtTotalPrice` | 上轮谈判-现金无税单价 | `last_talk_nt_total_price` | Decimal |
| 110 | `lastTalkAccepPrice` | 上轮谈判-承兑含税单价 | `last_talk_accep_price` | Decimal |
| 111 | `lastTalkPaymPrice` | 上轮谈判-账期含税单价 | `last_talk_paym_price` | Decimal |
| 112 | `lastTalkNtAccepPrice` | 上轮谈判-承兑无税单价 | `last_talk_nt_accep_price` | Decimal |
| 113 | `lastTalkNtPaymPrice` | 上轮谈判-账期无税单价 | `last_talk_nt_paym_price` | Decimal |
| 114 | `lastTalkTotalmny` | 上轮谈判-现金含税总金额 | `last_talk_totalmny` | Decimal |
| 115 | `lastTalkNtTotalmny` | 上轮谈判-现金无税总金额 | `last_talk_nt_totalmny` | Decimal |
| 116 | `lastTalkAccepMny` | 上轮谈判-承兑含税总金额 | `last_talk_accep_mny` | Decimal |
| 117 | `lastTalkNtAccepMny` | 上轮谈判-承兑无税总金额 | `last_talk_nt_accep_mny` | Decimal |
| 118 | `lastTalkPaymMny` | 上轮谈判-账期含税总金额 | `last_talk_paym_mny` | Decimal |
| 119 | `lastTalkNtPaymMny` | 上轮谈判-账期无税总金额 | `last_talk_nt_paym_mny` | Decimal |
| 120 | `firstPrice` | 含税价格(首次保存报价) | `first_price` | Decimal |
| 121 | `firstTotalPrice` | 总报价(首次保存报价) | `first_total_price` | Decimal |
| 122 | `firstNoTaxPrice` | 无税单价(首次保存报价) | `first_no_tax_price` | Decimal |
| 123 | `firstNoTaxMoney` | 无税金额(首次保存报价) | `first_no_tax_money` | Decimal |
| 124 | `unpdReleased` | 未定标释放行标示 | `unpd_released` | Boolean |
| 125 | `adviseTalkAccepPrice` | 谈判参考-承兑-价格 | `advise_talk_accep_price` | Decimal |
| 126 | `adviseTalkPaymPrice` | 谈判参考-账期-价格 | `advise_talk_paym_price` | Decimal |
| 127 | `adviseTalkTotalPrice` | 谈判参考-现金-价格 | `advise_talk_total_price` | Decimal |
| 128 | `talkMemo` | 谈判备注 | `talk_memo` | String |
| 129 | `allowTalkPrice` | 允许谈判报价 | `allow_talk_price` | Boolean |
| 130 | `identityQuantity` | 个性化数量-飞鹤用 | `identity_quantity` | Decimal |
| 131 | `currencyIdDiwork` | 询价币种id | `currency_id_diwork` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 132 | `currencyCodeDiwork` | 询价币种编码 | `currency_code_diwork` | String |
| 133 | `currencyNameDiwork` | 询价币种名称 | `currency_name_diwork` | String |
| 134 | `currencyTypeSignDiwork` | 询价币种符号 | `currency_type_sign_diwork` | String |
| 135 | `rateTypeDiwork` | 汇率类型 | `rate_type_diwork` | String |
| 136 | `exchangeRateDiwork` | 汇率 | `exchange_rate_diwork` | Decimal |
| 137 | `supplyChanged` | 行是否做过定标变更 | `supply_changed` | Boolean |
| 138 | `unitcode` | 采购单位名称(不用) | `unitCode` | String |
| 139 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 140 | `ytenant` | 租户id(新) | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 141 | `ts` | 更新时间 | `ts` | DateTime |
| 142 | `freight` | 运费 | `freight` | Decimal |
| 143 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 144 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 145 | `dimensionPricingId` | 报价ID | `dimension_pricing_id` | efd1e4c5-9da5-490b-acfc-9b097f70f890 |
| 146 | `priceStrategy` | 取价策略id | `price_strategy` | 3dab7aea-9e18-4a82-8712-f029fd1ec393 |
| 147 | `costQuoteGroupId` | 成本项报价组id | `cost_quote_group_id` | 2b728cc3-82ca-4e8f-8b98-49f9f1df7acd |
| 148 | `bodyPriceFreeDefines` | 报价单子表自由自定义项 | `` | 77258646-ca60-4e03-8324-7cffae203b77 |
| 149 | `costs` | 报价子表成本项明细 | `` | 84acddbc-cafb-419a-b8f1-39dd973bcdac |
| 150 | `detailSku` | 报价单子表SKU扩展表 | `` | 1c974b37-f526-407e-9f50-58ad42f31ed3 |
| 151 | `steps` | 报价子表价格阶梯明细 | `` | 353d4244-ebcd-4b39-8c22-e8c178bd0826 |
| 152 | `taxResults` | 计税结果 | `` | 4ea06e52-7148-49d2-931d-c13665ec94c1 |

---

## 关联属性（29个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bodyPriceFreeDefines` | 报价单子表自由自定义项 | `sourcing.ibuyoffer.PriceQuotationOfferDetailFreeDefine` | None | true |
| 2 | `qoDetailDefineCharacter` | 报价单子表自定义项 | `sourcing.ibuyoffer.CpuPriceQuotationOfferDetailDefineCharacter` | None |  |
| 3 | `priceStrategy` | 取价策略id | `aa.pricestrategy.PriceStrategy` | Service |  |
| 4 | `offerBId` | 询价单行ID | `sourcing.ibuyoffer.BuyOfferBodyVO` | None |  |
| 5 | `currencyIdDiwork` | 询价币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 6 | `taxRateId` | 税率id | `archive.taxArchives.TaxRateArchive` | Service |  |
| 7 | `skuId` | 供应商产品 sku id | `pc.product.ProductSKU` | Service |  |
| 8 | `cpuofferid` | 报价单ID | `sourcing.ibuyoffer.CpuPriceQuotationOffer` | None | true |
| 9 | `costs` | 报价子表成本项明细 | `sourcing.ibuyoffer.CpuPriceBodyCost` | None | true |
| 10 | `receiveOrgId` | 收货组织id | `org.func.BaseOrg` | Service |  |
| 11 | `planDeptid` | 采购部门ID | `bd.adminOrg.AdminOrgVO` | Service |  |
| 12 | `productId` | 外部商品id | `pc.product.Product` | Service |  |
| 13 | `costQuoteGroupId` | 成本项报价组id | `aa.costquote.CpuCostPricing` | Service |  |
| 14 | `ytenant` | 租户id(新) | `yht.tenant.YhtTenant` | Service |  |
| 15 | `detailSku` | 报价单子表SKU扩展表 | `sourcing.ibuyoffer.CpuQtOfferDetailSkuext` | None | true |
| 16 | `taxCodeId` | 税码 | `taxpubdoc.taxengine.TaxCode` | Service |  |
| 17 | `steps` | 报价子表价格阶梯明细 | `sourcing.ibuyoffer.CpuPriceBodyStep` | None | true |
| 18 | `taxResults` | 计税结果 | `sourcing.ibuyoffer.TaxCalculationResult` | None | true |
| 19 | `dimensionPricingId` | 报价ID | `aa.quotation.BiQuotationHead` | Service |  |
| 20 | `receivePersonId` | 收货人id | `bd.staff.Staff` | Service |  |
| 21 | `plannerid` | 计划员id | `bd.staff.Staff` | Service |  |
| 22 | `qtCurrencyIdDiwork` | 报价币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 23 | `qoDetailFreeCharacteristics` | 报价单子表自由项特征组 | `sourcing.ibuyoffer.CpuPriceQuotationOfferDetailFreeCharacters` | None |  |
| 24 | `offerId` | 询价单ID | `sourcing.ibuyoffer.BuyOfferVO` | None |  |
| 25 | `pritemid` | 采购需求行ID | `sourcing.pureq.IpuPuReq` | None |  |
| 26 | `unitid` | 外部商品单位id | `pc.unit.Unit` | Service |  |
| 27 | `mainunitid` | 主单位id | `pc.unit.Unit` | Service |  |
| 28 | `reqOrgid` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 29 | `purchaseunitid` | 采购单位id | `pc.unit.Unit` | Service |  |
