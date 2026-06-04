---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "cpu-contract.salecontractnew.SaleContractBodyChangeVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售合同表体物料 (`cpu-contract.salecontractnew.SaleContractBodyChangeVO`)

> ycBusinessCenter | 物理表：`cpu_sale_ct_material_history`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售合同表体物料 |
| 物理表 | `cpu_sale_ct_material_history` |
| 数据库 schema | `cpu-contract` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:24.9310` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（110个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `materialClassName` | 物料分类名称 | `material_class_name` | String |
| 3 | `materialId` | 采购商物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 4 | `externalFileId` | 对外附件 | `external_file_id` | String |
| 5 | `mainMetrologyId` | 主计量单位id | `main_metrology_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 6 | `mainMetrologyCode` | 主计量单位code | `main_metrology_code` | String |
| 7 | `unitCode` | 计价单位code | `unit_code` | String |
| 8 | `purchaseUnitCode` | 采购单位code | `purchase_unit_code` | String |
| 9 | `materialClassId` | 采购商物料分类id | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 10 | `costTemplateId` | 成本项报价模版ID | `cost_template_id` | 89305c8c-fd63-410b-a9d4-4a1dde15ef7a |
| 11 | `descrMaterialMark` | 描述性物料标识:1是,0否 | `descr_material_mark` | Integer |
| 12 | `lineStatus` | 行状态 | `line_status` | Short |
| 13 | `lineno` | 行号 | `lineno` | Decimal |
| 14 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 15 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 16 | `isOnShelf` | 超市上架 | `is_on_shelf` | Boolean |
| 17 | `processesId` | 工序ID | `processes_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 18 | `pubts` | 时间戳 | `ts` | DateTime |
| 19 | `dr` | dr | `dr` | Integer |
| 20 | `saleContractId` | 销售合同主表id | `sale_contract_id` | fc6e46f3-a338-4c53-b55a-2c3336f30dd0 |
| 21 | `skuId` | 商品skuid | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 22 | `reqUapProjectId` | 平台项目档案id | `req_uap_project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 23 | `saleCtDetailDefineCharacter` | 自定义项特征属性组 | `define_character` | f7191633-6293-4361-a7b7-c9e6294ce6bc |
| 24 | `materialName` | 采购商物料名称 | `material_name` | String |
| 25 | `formulaId` | 价格公式id | `formula_id` | 97790819-6d1f-4b4b-8d1c-f6d78b6531e4 |
| 26 | `formulaName` | 价格公式 | `formula_name` | String |
| 27 | `saleContractHistoryId` | 合同历史主表id | `sale_contract_history_id` | 0916e926-2a68-41cc-8d23-29075405e8de |
| 28 | `saleCtDetailFreeCharacteristics` | 自由项特征组实体 | `instance_id` | 7c929d82-c8d5-45c9-82e3-b7f0e25dcd89 |
| 29 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 30 | `costQuoteGroupId` | 成本项报价组id | `cost_quote_group_id` | 2b728cc3-82ca-4e8f-8b98-49f9f1df7acd |
| 31 | `materialCode` | 物料编码 | `material_code` | String |
| 32 | `spec` | 规格 | `spec` | String |
| 33 | `model` | 型号 | `model` | String |
| 34 | `materialDesc` | 物料描述 | `material_desc` | String |
| 35 | `brand` | 品牌 | `brand` | String |
| 36 | `purchaseNum` | 采购数量 | `purchase_num` | Decimal |
| 37 | `planArriveDate` | 计划交货日期 | `plan_arrive_date` | DateTime |
| 38 | `purchaseUnitName` | 采购单位 | `purchase_unit_name` | String |
| 39 | `materialClassCode` | 采购商物料分类编码 | `material_class_code` | String |
| 40 | `num` | 计价数量 | `num` | Decimal |
| 41 | `productId` | 商品id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 42 | `purchaseExchRate` | 采购换算率 | `purchase_exch_rate` | Decimal |
| 43 | `unit` | 计价单位 | `unit` | String |
| 44 | `mainNum` | 主数量 | `main_num` | Decimal |
| 45 | `mainMetrologyName` | 主计量单位 | `main_metrology_name` | String |
| 46 | `productName` | 商品sku详细属性信息 | `product_name` | String |
| 47 | `priceExchRate` | 计价换算率 | `price_exch_rate` | Decimal |
| 48 | `overExecRate` | 超量执行比例 | `over_exec_rate` | Decimal |
| 49 | `skuUrl` | 商品图片 | `sku_url` | String |
| 50 | `enableExecNum` | 可执行数量 | `enable_exec_num` | Decimal |
| 51 | `reqOrgId` | 需求组织id | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 52 | `reqOrgName` | 需求公司名称 | `req_org_name` | String |
| 53 | `purchaseUnitId` | 采购单位id | `purchase_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 54 | `unitid` | 计价单位id | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 55 | `enterpriseId` | 所属租户id | `enterprise_id` | Long |
| 56 | `price` | 无税单价 | `price` | Decimal |
| 57 | `taxPrice` | 含税单价 | `tax_price` | Decimal |
| 58 | `taxrate` | 税率 | `taxrate` | Decimal |
| 59 | `erpCtbid` | erp合同子表id(pk) | `erp_ct_bid` | String |
| 60 | `money` | 无税金额合计 | `money` | Decimal |
| 61 | `taxMoney` | 含税金额 | `tax_money` | Decimal |
| 62 | `accomplishedQuantity` | 已下单主数量 | `accomplished_quantity` | Decimal |
| 63 | `priceValidateStartdate` | 价格有效期(起) | `price_validate_startdate` | DateTime |
| 64 | `priceValidateDate` | 价格有效期(止) | `price_validate_date` | DateTime |
| 65 | `addressName` | 参考地区 | `address_name` | String |
| 66 | `gift` | 赠品 | `gift` | String |
| 67 | `receiveOrgName` | 收货组织 | `receive_org_name` | String |
| 68 | `purContractMaterialId` | 采购合同物料表id | `pur_contract_material_id` | Long |
| 69 | `receivePersonName` | 收货人 | `receive_person_name` | String |
| 70 | `discountTaxType` | 扣税类别 | `discount_tax_type` | Integer |
| 71 | `receivePersonTel` | 联系电话 | `receive_person_tel` | String |
| 72 | `deliveryAddress` | 收货地址 | `delivery_address` | String |
| 73 | `refNo` | 区分这个需求是哪一个分包商提的 | `ref_no` | String |
| 74 | `priceMark` | 价格标识 | `price_mark` | Integer |
| 75 | `benchmarkType` | 找钢网基准价参考 | `benchmark_type` | String |
| 76 | `settlementType` | 找钢网结算基准日 | `settlement_type` | String |
| 77 | `province_id` | 找钢网参考地区-省 | `province_id` | Long |
| 78 | `city_id` | 找钢网参考地区-市 | `city_id` | Long |
| 79 | `memo` | 备注 | `memo` | String |
| 80 | `purContractMaterialHistoryId` | 采购合同物料历史表id | `pur_contract_material_history_id` | Long |
| 81 | `district_id` | 找钢网参考地区-区 | `district_id` | Long |
| 82 | `saleCtHistoryDetailDefineCharacter` | 销售物料历史表特征 | `define_character` | ab4828a0-4755-419b-a893-aa27beb1eb90 |
| 83 | `saleCtHistoryDetailFreeCharacteristics` | 销售物料历史表特征free | `instance_id` | b3f70088-a51a-4e83-b3e0-d26e0cd2ddbb |
| 84 | `taxFullPrice` | 找钢网全额预付单价 | `tax_full_price` | Decimal |
| 85 | `taxFullMoney` | 找钢网全额预付金额 | `tax_full_money` | Decimal |
| 86 | `taxPartialPrice` | 找钢网部分预付单价 | `tax_partial_price` | Decimal |
| 87 | `taxPartialMoney` | 找钢网部分预付金额 | `tax_partial_money` | Decimal |
| 88 | `taxlessFullPrice` | 无税单价全额预付 | `taxless_full_price` | Decimal |
| 89 | `taxlessFullMoney` | 无税总价全额预付 | `taxless_full_money` | Decimal |
| 90 | `taxlessPartialPrice` | 无税单价部分预付 | `taxless_partial_price` | Decimal |
| 91 | `taxlessPartialMoney` | 无税总价部分预付 | `taxless_partial_money` | Decimal |
| 92 | `receiveOrgId` | 收货组织id | `receive_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 93 | `receivePersonId` | 收货人id | `receive_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 94 | `changingAction` | 变更动作:终止合同、变更合同 | `changing_action` | String |
| 95 | `changingInfo` | 变更信息 | `changing_info` | String |
| 96 | `qualitypriceId` | 优质优价方案id | `qualityprice_id` | c7cc8895-2b03-4c7d-a327-da6e09410f76 |
| 97 | `priceStrategy` | 取价策略id | `price_strategy` | 3dab7aea-9e18-4a82-8712-f029fd1ec393 |
| 98 | `dimensionPricingId` | 价格目录数据id | `dimension_pricing_id` | String |
| 99 | `defines` | 销售合同表体物料自定义项 | `` | aafdc8f0-e75f-4727-a523-d6b88b7921c9 |
| 100 | `lineCloseReason` | 行关闭原因 | `line_close_reason` | String |
| 101 | `linecloseTime` | 行关闭时间 | `lineclose_time` | DateTime |
| 102 | `linecloser` | 行关闭人 | `linecloser` | String |
| 103 | `natWithholdingTax` | 本币代扣税额 | `nat_withholding_tax` | Decimal |
| 104 | `occupiedByProductSupply` | 下推商品供货清单状态 | `occupied_by_product_supply` | String |
| 105 | `oriWithholdingTax` | 代扣税额 | `ori_withholding_tax` | Decimal |
| 106 | `priceExchRateDen` | 计价换算率分母 | `price_exch_rateden` | Decimal |
| 107 | `priceExchRateNum` | 计价换算率分子 | `price_exch_ratenum` | Decimal |
| 108 | `purchaseExchRateDen` | 采购换算率分母 | `purchase_exch_rateden` | Decimal |
| 109 | `purchaseExchRateNum` | 采购换算率分子 | `purchase_exch_ratenum` | Decimal |
| 110 | `taxCodeId` | 税码 | `tax_code_id` | 3f7c3856-5b00-4506-b458-a64eed0d3bfb |

---

## 关联属性（26个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `saleCtHistoryDetailFreeCharacteristics` | 销售物料历史表特征free | `cpu-contract.salecontractnew.SaleCtHistoryCharacteristicsDefine` | None |  |
| 2 | `processesId` | 工序ID | `ed.operation.Operation` | Service |  |
| 3 | `saleContractHistoryId` | 合同历史主表id | `cpu-contract.salecontractnew.SaleContractChangeVO` | None | true |
| 4 | `saleContractId` | 销售合同主表id | `cpu-contract.salecontract.SaleContractVO` | None |  |
| 5 | `defines` | 销售合同表体物料自定义项 | `cpu-contract.salecontractnew.SaleContractBodyHistoryVODefine` | None | true |
| 6 | `priceStrategy` | 取价策略id | `aa.pricestrategy.PriceStrategy` | Service |  |
| 7 | `reqOrgId` | 需求组织id | `org.func.BaseOrg` | Service |  |
| 8 | `skuId` | 商品skuid | `pc.product.ProductSKU` | Service |  |
| 9 | `saleCtDetailFreeCharacteristics` | 自由项特征组实体 | `cpu-contract.salecontract.SaleCtCharacteristicsDefine` | None |  |
| 10 | `purchaseUnitId` | 采购单位id | `pc.unit.Unit` | Service |  |
| 11 | `reqUapProjectId` | 平台项目档案id | `bd.project.ProjectVO` | Service |  |
| 12 | `receiveOrgId` | 收货组织id | `org.func.BaseOrg` | Service |  |
| 13 | `saleCtDetailDefineCharacter` | 自定义项特征属性组 | `cpu-contract.salecontract.SaleCtCharacterDefine` | None |  |
| 14 | `materialClassId` | 采购商物料分类id | `pc.cls.ManagementClass` | Service |  |
| 15 | `productId` | 商品id | `pc.product.Product` | Service |  |
| 16 | `costQuoteGroupId` | 成本项报价组id | `aa.costquote.CpuCostPricing` | Service |  |
| 17 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 18 | `costTemplateId` | 成本项报价模版ID | `aa.costitem.CostItemTemplate` | Service |  |
| 19 | `materialId` | 采购商物料id | `pc.product.Product` | Service |  |
| 20 | `taxCodeId` | 税码 | `taxpubdoc.taxengine.TaxCode` | Service |  |
| 21 | `mainMetrologyId` | 主计量单位id | `pc.unit.Unit` | Service |  |
| 22 | `saleCtHistoryDetailDefineCharacter` | 销售物料历史表特征 | `cpu-contract.salecontractnew.SaleCtHistoryCharacterDefine` | None |  |
| 23 | `receivePersonId` | 收货人id | `bd.staff.Staff` | Service |  |
| 24 | `formulaId` | 价格公式id | `aa.priceformula.PriceFormula` | Service |  |
| 25 | `unitid` | 计价单位id | `pc.unit.Unit` | Service |  |
| 26 | `qualitypriceId` | 优质优价方案id | `aa.qualitypricescheme.QualitypriceScheme` | Service |  |
