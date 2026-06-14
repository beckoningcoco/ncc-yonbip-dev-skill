---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "cpu-contract.salecontract.SaleContractBodyVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售合同表体物料 (`cpu-contract.salecontract.SaleContractBodyVO`)

> ycBusinessCenter | 物理表：`cpu_sale_ct_material`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售合同表体物料 |
| 物理表 | `cpu_sale_ct_material` |
| domain/服务域 | `cpu-contract` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:43:15.3650` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（106个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `saleCtDetailDefineCharacter` | 自定义项特征属性组 | `define_character` | f7191633-6293-4361-a7b7-c9e6294ce6bc |
| 2 | `saleCtDetailFreeCharacteristics` | 自由项特征组实体 | `instance_id` | 7c929d82-c8d5-45c9-82e3-b7f0e25dcd89 |
| 3 | `qualitypriceId` | 优质优价 | `qualityprice_id` | c7cc8895-2b03-4c7d-a327-da6e09410f76 |
| 4 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 5 | `dr` | dr | `dr` | Integer |
| 6 | `erpCtbid` | erp合同子表id(pk) | `erp_ct_bid` | String |
| 7 | `formulaId` | 价格公式id | `formula_id` | 97790819-6d1f-4b4b-8d1c-f6d78b6531e4 |
| 8 | `formulaName` | 价格公式 | `formula_name` | String |
| 9 | `isOnShelf` | 超市上架 | `is_on_shelf` | Boolean |
| 10 | `descrMaterialMark` | 描述性物料标识:1是,0否 | `descr_material_mark` | Integer |
| 11 | `occupiedByProductSupply` | 下推商品供货清单状态 | `occupied_by_product_supply` | String |
| 12 | `lineCloseReason` | 行关闭原因 | `line_close_reason` | String |
| 13 | `priceExchRateNum` | 计价换算率分子 | `price_exch_ratenum` | Decimal |
| 14 | `priceExchRateDen` | 计价换算率分母 | `price_exch_rateden` | Decimal |
| 15 | `purchaseExchRateNum` | 采购换算率分子 | `purchase_exch_ratenum` | Decimal |
| 16 | `purchaseExchRateDen` | 采购换算率分母 | `purchase_exch_rateden` | Decimal |
| 17 | `linecloser` | 行关闭人 | `linecloser` | String |
| 18 | `linecloseTime` | 行关闭时间 | `lineclose_time` | DateTime |
| 19 | `lineStatus` | 行状态 | `line_status` | Short |
| 20 | `lineno` | 行号 | `lineno` | Decimal |
| 21 | `costTemplateId` | 成本项报价模版ID | `cost_template_id` | 89305c8c-fd63-410b-a9d4-4a1dde15ef7a |
| 22 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 23 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 24 | `processesId` | 工序ID | `processes_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 25 | `pubts` | 时间戳 | `ts` | DateTime |
| 26 | `skuId` | 商品skuid | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 27 | `reqUapProjectId` | 平台项目档案id | `req_uap_project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 28 | `dimensionPricingId` | 价格目录数据id | `dimension_pricing_id` | String |
| 29 | `discountTaxType` | 扣税类别 | `discount_tax_type` | Integer |
| 30 | `externalFileId` | 对外附件 | `external_file_id` | String |
| 31 | `priceStrategy` | 取价策略 | `price_strategy` | 3dab7aea-9e18-4a82-8712-f029fd1ec393 |
| 32 | `costQuoteGroupId` | 成本项报价组id | `cost_quote_group_id` | 2b728cc3-82ca-4e8f-8b98-49f9f1df7acd |
| 33 | `planArriveDate` | 计划交货日期 | `plan_arrive_date` | DateTime |
| 34 | `priceMark` | 价格标识 | `price_mark` | Integer |
| 35 | `id` | ID | `id` | Long |
| 36 | `priceExchRate` | 计价换算率 | `price_exch_rate` | Decimal |
| 37 | `purchaseExchRate` | 采购换算率 | `purchase_exch_rate` | Decimal |
| 38 | `purchaseUnitCode` | 采购单位code | `purchase_unit_code` | String |
| 39 | `saleContractId` | 销售合同主表id | `sale_contract_id` | fc6e46f3-a338-4c53-b55a-2c3336f30dd0 |
| 40 | `unitCode` | 计价单位code | `unit_code` | String |
| 41 | `materialId` | 采购商物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 42 | `materialName` | 采购商物料名称 | `material_name` | String |
| 43 | `materialClassId` | 采购商物料分类id | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 44 | `materialClassName` | 物料分类名称 | `material_class_name` | String |
| 45 | `materialClassCode` | 采购商物料分类编码 | `material_class_code` | String |
| 46 | `productId` | 商品id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 47 | `productName` | 商品sku详细属性信息 | `product_name` | String |
| 48 | `skuUrl` | 商品图片 | `sku_url` | String |
| 49 | `reqOrgId` | 需求组织id | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 50 | `reqOrgName` | 需求公司名称 | `req_org_name` | String |
| 51 | `memo` | 备注 | `memo` | String |
| 52 | `enterpriseId` | 所属租户id | `enterprise_id` | Long |
| 53 | `price` | 无税单价 | `price` | Decimal |
| 54 | `taxPrice` | 含税单价 | `tax_price` | Decimal |
| 55 | `num` | 数量 | `num` | Decimal |
| 56 | `unit` | 计价单位 | `unit` | String |
| 57 | `money` | 无税金额 | `money` | Decimal |
| 58 | `taxMoney` | 含税金额 | `tax_money` | Decimal |
| 59 | `deliveryAddress` | 物料收货地址 | `delivery_address` | String |
| 60 | `taxrate` | 税率 | `taxrate` | Decimal |
| 61 | `purContractMaterialId` | 采购合同物料表id | `pur_contract_material_id` | Long |
| 62 | `priceValidateDate` | 价格有效期 | `price_validate_date` | DateTime |
| 63 | `refNo` | 区分这个需求是哪一个分包商提的 | `ref_no` | String |
| 64 | `brand` | 找钢网品牌 | `brand` | String |
| 65 | `benchmarkType` | 找钢网基准价参考 | `benchmark_type` | String |
| 66 | `settlementType` | 找钢网结算基准日 | `settlement_type` | String |
| 67 | `province_id` | 找钢网参考地区-省 | `province_id` | Long |
| 68 | `city_id` | 找钢网参考地区-市 | `city_id` | Long |
| 69 | `district_id` | 找钢网参考地区-区 | `district_id` | Long |
| 70 | `spec` | 规格 | `spec` | String |
| 71 | `model` | 型号 | `model` | String |
| 72 | `purchaseUnitId` | 采购单位id | `purchase_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 73 | `taxFullPrice` | 找钢网全额预付单价 | `tax_full_price` | Decimal |
| 74 | `unitid` | 计价单位id | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 75 | `accomplishedQuantity` | 已下单主数量 | `accomplished_quantity` | Decimal |
| 76 | `taxFullMoney` | 找钢网全额预付金额 | `tax_full_money` | Decimal |
| 77 | `taxPartialPrice` | 找钢网部分预付单价 | `tax_partial_price` | Decimal |
| 78 | `taxPartialMoney` | 找钢网部分预付金额 | `tax_partial_money` | Decimal |
| 79 | `addressName` | 找钢网参考地区显示 | `address_name` | String |
| 80 | `materialCode` | 物料编码 | `material_code` | String |
| 81 | `taxlessFullPrice` | 无税单价全额预付 | `taxless_full_price` | Decimal |
| 82 | `taxlessFullMoney` | 无税总价全额预付 | `taxless_full_money` | Decimal |
| 83 | `taxlessPartialPrice` | 无税单价部分预付 | `taxless_partial_price` | Decimal |
| 84 | `taxlessPartialMoney` | 无税总价部分预付 | `taxless_partial_money` | Decimal |
| 85 | `receiveOrgId` | 收货组织id | `receive_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 86 | `receiveOrgName` | 收货组织名称 | `receive_org_name` | String |
| 87 | `receivePersonId` | 收货人id | `receive_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 88 | `receivePersonName` | 收货人姓名 | `receive_person_name` | String |
| 89 | `receivePersonTel` | 收货人电话 | `receive_person_tel` | String |
| 90 | `overExecRate` | 超量执行比例 | `over_exec_rate` | Decimal |
| 91 | `enableExecNum` | 可执行数量 | `enable_exec_num` | Decimal |
| 92 | `changingAction` | 变更动作:终止合同、变更合同 | `changing_action` | String |
| 93 | `changingInfo` | 变更信息 | `changing_info` | String |
| 94 | `materialDesc` | 物料描述 | `material_desc` | String |
| 95 | `priceValidateStartdate` | 价格有效期开始时间 | `price_validate_startdate` | DateTime |
| 96 | `purchaseNum` | 采购数量 | `purchase_num` | Decimal |
| 97 | `purchaseUnitName` | 采购单位name | `purchase_unit_name` | String |
| 98 | `gift` | 赠品 | `gift` | String |
| 99 | `mainNum` | 主数量 | `main_num` | Decimal |
| 100 | `mainMetrologyId` | 主计量单位id | `main_metrology_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 101 | `mainMetrologyName` | 主计量单位name | `main_metrology_name` | String |
| 102 | `mainMetrologyCode` | 主计量单位code | `main_metrology_code` | String |
| 103 | `defines` | 销售合同表体物料自定义项 | `` | 7ca625be-9482-4e8a-baf2-e34751fbb982 |
| 104 | `natWithholdingTax` | 本币代扣税额 | `nat_withholding_tax` | Decimal |
| 105 | `oriWithholdingTax` | 代扣税额 | `ori_withholding_tax` | Decimal |
| 106 | `taxCodeId` | 税码 | `tax_code_id` | 3f7c3856-5b00-4506-b458-a64eed0d3bfb |

---

## 关联属性（23个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `processesId` | 工序ID | `ed.operation.Operation` | Service |  |
| 2 | `saleCtDetailFreeCharacteristics` | 自由项特征组实体 | `cpu-contract.salecontract.SaleCtCharacteristicsDefine` | None |  |
| 3 | `purchaseUnitId` | 采购单位id | `pc.unit.Unit` | Service |  |
| 4 | `reqUapProjectId` | 平台项目档案id | `bd.project.ProjectVO` | Service |  |
| 5 | `receiveOrgId` | 收货组织id | `org.func.BaseOrg` | Service |  |
| 6 | `saleCtDetailDefineCharacter` | 自定义项特征属性组 | `cpu-contract.salecontract.SaleCtCharacterDefine` | None |  |
| 7 | `materialClassId` | 采购商物料分类id | `pc.cls.ManagementClass` | Service |  |
| 8 | `productId` | 商品id | `pc.product.Product` | Service |  |
| 9 | `costQuoteGroupId` | 成本项报价组id | `aa.costquote.CpuCostPricing` | Service |  |
| 10 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 11 | `costTemplateId` | 成本项报价模版ID | `aa.costitem.CostItemTemplate` | Service |  |
| 12 | `materialId` | 采购商物料id | `pc.product.Product` | Service |  |
| 13 | `taxCodeId` | 税码 | `taxpubdoc.taxengine.TaxCode` | Service |  |
| 14 | `saleContractId` | 销售合同主表id | `cpu-contract.salecontract.SaleContractVO` | None | true |
| 15 | `mainMetrologyId` | 主计量单位id | `pc.unit.Unit` | Service |  |
| 16 | `defines` | 销售合同表体物料自定义项 | `cpu-contract.salecontract.SaleContractBodyVODefine` | None | true |
| 17 | `priceStrategy` | 取价策略 | `aa.pricestrategy.PriceStrategy` | Service |  |
| 18 | `receivePersonId` | 收货人id | `bd.staff.Staff` | Service |  |
| 19 | `formulaId` | 价格公式id | `aa.priceformula.PriceFormula` | Service |  |
| 20 | `unitid` | 计价单位id | `pc.unit.Unit` | Service |  |
| 21 | `reqOrgId` | 需求组织id | `org.func.BaseOrg` | Service |  |
| 22 | `qualitypriceId` | 优质优价 | `aa.qualitypricescheme.QualitypriceScheme` | Service |  |
| 23 | `skuId` | 商品skuid | `pc.product.ProductSKU` | Service |  |
