---
tags: ["BIP", "元数据", "数据字典", "ycPurchaseSynergy", "check.pucheckbill.PuCheckMaterialVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购对账单孙表 (`check.pucheckbill.PuCheckMaterialVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPurchaseSynergy 模块实体元数据字典。
> 物理表：`pu_checkbill_m` | 所属应用：`ycPurchaseSynergy`
> 来源：元数据API `queryByUri` 返回的 `check.pucheckbill.PuCheckMaterialVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购对账单孙表 |
| 物理表 | `pu_checkbill_m` |
| domain/服务域 | `cpu-cooperation` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycPurchaseSynergy` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:29:58.4230` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `checkbill_mid` | `checkbill_mid` | String | id |

## 部署信息

- **部署时间**: 2026-05-23 00:06:27:000
- **安装来源**: `/app/data_scripts/cpu-cooperation-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_cpu_cooperation/0010_iuap_common/DML/0270_iuap_metadata/202603/202603042123_metadata_check-pucheckbill_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `6132f0a5-04f1-489e-80ec-c098f8d42919`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `data_auth`

## 约束

- **migration_id** (MetaClassPrimary): id — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 生单回写 (`IBackWrite`) | `base.itf.IBackWrite` | 254 | 7 |
| 2 | 后端自动行号接口 (`ILineNo`) | `base.itf.ILineNo` | 1 | 1 |
| 3 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 4 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 5 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |

---

## 直接属性（共 273 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `PuCheckMaterialVODefineCharacter` | 表体自定义项特征属性 | `pu_check_material_define_character` | e598da5e-b2f5-4af0-8d46-2b14eddcd2e4 | `UserDefine` |  | ✓ |
| 2 | `PuCheckMaterialVOFreeCharacteristics` | 自由项特征组实体 | `pu_checkbill_free_characteristics` | a9cda7f9-9f06-43f9-8480-7623a29fbbb0 | `FreeCT` |  | ✓ |
| 3 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 4 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 6 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 7 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 8 | `currencyName` | 币种名称 | `currency_name` | String | `text` |  | ✓ |
| 9 | `dr` | 删除标识 | `dr` | Integer | `int` |  | ✓ |
| 10 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 11 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 12 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 14 | `id` | id | `checkbill_mid` | String | `text` |  | ✓ |
| 15 | `answer` | 回复状态(0:保存,1:确认,2:拒绝) | `answer` | String | `singleOption` |  | ✓ |
| 16 | `isLeave` | 是否遗留 | `is_leave` | String | `singleOption` |  | ✓ |
| 17 | `biztype` | 来源单据类型 | `biztype` | String | `singleOption` |  | ✓ |
| 18 | `sourceBillCode` | 来源单据号 | `source_bill_code` | String | `text` |  | ✓ |
| 19 | `sourceTranstype` | 来源单据交易类型 | `source_transtype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 20 | `sourceBillDate` | 来源单据日期 | `source_bill_date` | Date | `date` |  | ✓ |
| 21 | `taxtypeFlag` | 扣税类别 | `taxtype_flag` | String | `singleOption` |  | ✓ |
| 22 | `priceMark` | 价格标识 | `price_mark` | String | `singleOption` |  | ✓ |
| 23 | `receiveOrg` | 收货组织 | `receive_org` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 24 | `erpTransName` | ERP交易类型名称 | `erp_trans_name` | String | `text` |  | ✓ |
| 25 | `activity` | 活动主键 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |  | ✓ |
| 26 | `sourceTransName` | 来源交易类型名称 | `source_trans_name` | String | `text` |  | ✓ |
| 27 | `calculationPattern` | 计算基准 | `calculation_pattern` | Integer | `int` |  | ✓ |
| 28 | `hstoId` | 仓库id | `hsto_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |  | ✓ |
| 29 | `erpOrderCode` | ERP订单号 | `erp_order_code` | String | `text` |  | ✓ |
| 30 | `advanceInvoiceMainNum` | 提前开票主数量 | `advance_invoice_main_num` | Decimal | `number` |  | ✓ |
| 31 | `advanceInvoicePurNum` | 提前开票采购数量 | `advance_invoice_pur_num` | Decimal | `number` |  | ✓ |
| 32 | `advanceInvoiceNum` | 提前开票计价数量 | `advance_invoice_num` | Decimal | `number` |  | ✓ |
| 33 | `advanceInvoiceTaxMny` | 提前开票含税金额 | `advance_invoice_tax_mny` | Decimal | `number` |  | ✓ |
| 34 | `advanceInvoiceMny` | 提前开票无税金额 | `advance_invoice_mny` | Decimal | `number` |  | ✓ |
| 35 | `erpInvoicedMainNum` | ERP已开票主数量 | `erp_invoiced_main_num` | Decimal | `number` |  | ✓ |
| 36 | `erpInvoicedNum` | ERP已开票计价数量 | `erp_invoiced_num` | Decimal | `number` |  | ✓ |
| 37 | `erpInvoicedPurNum` | ERP已开票采购数量 | `erp_invoiced_pur_num` | Decimal | `number` |  | ✓ |
| 38 | `erpInvoicedTaxMny` | ERP已开票含税金额 | `erp_invoiced_tax_mny` | Decimal | `number` |  | ✓ |
| 39 | `erpInvoicedMny` | ERP已开票无税金额 | `erp_invoiced_mny` | Decimal | `number` |  | ✓ |
| 40 | `actualPrice` | 实对无税单价 | `actual_price` | Decimal | `number` |  | ✓ |
| 41 | `operationCode` | 工序编码 | `operation_code` | String | `text` |  | ✓ |
| 42 | `activityCode` | 活动编码 | `activity_code` | String | `text` |  | ✓ |
| 43 | `actualTax` | 实对税额 | `actual_tax` | Decimal | `number` |  | ✓ |
| 44 | `puWareClassName` | 物料分类名称 | `pu_ware_class_name` | String | `text` |  | ✓ |
| 45 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |  | ✓ |
| 46 | `wbsName` | WBS任务 | `wbs_name` | String | `text` |  | ✓ |
| 47 | `activityName` | 活动 | `activity_name` | String | `text` |  | ✓ |
| 48 | `puWareClassId` | 物料分类 | `pu_ware_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |  | ✓ |
| 49 | `puWareClassCode` | 物料分类编码 | `pu_ware_class_code` | String | `text` |  | ✓ |
| 50 | `operationId` | 工序 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 | `quote` |  | ✓ |
| 51 | `actualTaxprice` | 实对含税单价 | `actual_taxprice` | Decimal | `number` |  | ✓ |
| 52 | `wbsCode` | WBS任务编码 | `wbs_code` | String | `text` |  | ✓ |
| 53 | `operationName` | 工序名称 | `operation_name` | String | `text` |  | ✓ |
| 54 | `formulaId` | 价格公式ID | `formula_id` | 97790819-6d1f-4b4b-8d1c-f6d78b6531e4 | `quote` |  | ✓ |
| 55 | `checkRecordId` | 检验记录主键 | `check_record_id` | Long | `long` |  | ✓ |
| 56 | `formulaName` | 价格公式名称 | `formula_name` | String | `text` |  | ✓ |
| 57 | `batchno` | 批次号 | `batchno` | String | `text` |  | ✓ |
| 58 | `mnyBeforeSettlement` | 价格结算前无税金额 | `mny_before_pettlement` | Decimal | `number` |  | ✓ |
| 59 | `ctjlId` | 合同台账主键 | `ctjl_id` | Long | `long` |  | ✓ |
| 60 | `priceRecordId` | 取价主键 | `price_record_id` | Long | `long` |  | ✓ |
| 61 | `expenseItemName` | 费用项目 | `expense_item_name` | String | `text` |  | ✓ |
| 62 | `confirmNum` | 确认数量 | `confirm_num` | Decimal | `number` |  | ✓ |
| 63 | `qualityPriceSchemeId` | 优质优价方案主键 | `quality_price_scheme_id` | c7cc8895-2b03-4c7d-a327-da6e09410f76 | `quote` |  | ✓ |
| 64 | `erpSourceBillType` | ERP来源单据类型 | `erp_source_bill_type` | String | `text` |  | ✓ |
| 65 | `payRatio` | 付款比例 | `pay_ratio` | Decimal | `number` |  | ✓ |
| 66 | `formulaShow` | 价格公式 | `formula_show` | String | `text` |  | ✓ |
| 67 | `priceNumBeforeSettlement` | 价格结算前计价数量 | `price_num_before_pettlement` | Decimal | `number` |  | ✓ |
| 68 | `mainNumBeforeSettlement` | 价格结算前数量 | `main_num_before_pettlement` | Decimal | `number` |  | ✓ |
| 69 | `clutteredPriceNum` | 扣杂计价数量 | `cluttered_price_num` | Decimal | `number` |  | ✓ |
| 70 | `puTaxRateId` | 原税目 | `pu_taxrate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |  | ✓ |
| 71 | `costcenterId` | 成本中心主键 | `costcenter_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |  | ✓ |
| 72 | `period` | 阶段 | `period` | String | `singleOption` |  | ✓ |
| 73 | `purNumBeforeSettlement` | 价格结算前采购数量 | `pur_num_before_pettlement` | Decimal | `number` |  | ✓ |
| 74 | `formulaCode` | 价格公式编码 | `formula_code` | String | `text` |  | ✓ |
| 75 | `priceRowno` | 价格结算子表行号 | `price_rowno` | Integer | `int` |  | ✓ |
| 76 | `priceBeforeSettlement` | 价格结算前无税单价 | `price_before_pettlement` | Decimal | `number` |  | ✓ |
| 77 | `formulaCalculation` | 价格公式算式 | `formula_calculation` | String | `text` |  | ✓ |
| 78 | `costcenterName` | 成本中心 | `costcenter_name` | String | `text` |  | ✓ |
| 79 | `ctjlCode` | 合同台账编号 | `ctjl_code` | String | `text` |  | ✓ |
| 80 | `checkUnit` | 商品单位 | `check_unit` | String | `text` |  | ✓ |
| 81 | `expenseItemId` | 费用项目id | `expense_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |  | ✓ |
| 82 | `adjustTaxRateId` | 调整税目 | `adjust_taxrate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |  | ✓ |
| 83 | `erpTransCode` | ERP交易类型编码 | `erp_trans_code` | String | `text` |  | ✓ |
| 84 | `taxPriceBeforeSettlement` | 价格结算前含税单价 | `tax_price_before_pettlement` | Decimal | `number` |  | ✓ |
| 85 | `sourceBillBid` | 来源单据子表主键 | `source_bill_bid` | Long | `long` |  | ✓ |
| 86 | `purchaseType` | 采购类型 | `purchase_type` | String | `singleOption` |  | ✓ |
| 87 | `qualityPriceSchemeName` | 优质优价方案 | `quality_price_scheme_name` | String | `text` |  | ✓ |
| 88 | `clutteredMainNum` | 扣杂数量 | `cluttered_main_num` | Decimal | `number` |  | ✓ |
| 89 | `invoiceStatus` | 开票状态 | `invoice_status` | String | `singleOption` |  | ✓ |
| 90 | `taxMnyBeforeSettlement` | 价格结算前含税金额 | `tax_mny_before_pettlement` | Decimal | `number` |  | ✓ |
| 91 | `hstoCode` | 仓库编码 | `hsto_code` | String | `text` |  | ✓ |
| 92 | `hstoName` | 仓库名称 | `hsto_name` | String | `text` |  | ✓ |
| 93 | `pkOrg` | 采购组织id{org_orgs} | `pk_org` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 94 | `orgCode` | orgCode | `org_code` | String | `text` |  | ✓ |
| 95 | `orgName` | 组织名称 | `org_name` | String | `text` |  | ✓ |
| 96 | `puWareCode` | 采购单据物料编码 | `pu_ware_code` | String | `text` |  | ✓ |
| 97 | `puWareName` | 物料名称 | `pu_ware_name` | String | `text` |  | ✓ |
| 98 | `puWareCunit` | 采购单据单位 | `pu_ware_cunit` | String | `text` |  | ✓ |
| 99 | `puWareImgurl` | 采购单据物料图片url | `pu_ware_imgurl` | String | `text` |  | ✓ |
| 100 | `puPuWareId` | 采购单据物料id{cpu_material.cpu_material} | `pu_pu_ware_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 101 | `puMaterialSpec` | 物料规格 | `pu_material_spec` | String | `text` |  | ✓ |
| 102 | `wareSkuCode` | 商品SKU编码 | `ware_sku_code` | String | `text` |  | ✓ |
| 103 | `puMaterialModel` | 物料型号 | `pu_material_model` | String | `text` |  | ✓ |
| 104 | `wareSkuName` | 商品SKU名称 | `ware_sku_name` | String | `text` |  | ✓ |
| 105 | `deliveryBrand` | 发货品牌 | `delivery_brand` | String | `text` |  | ✓ |
| 106 | `skuId` | 物料SKU id {productsku} | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |  | ✓ |
| 107 | `skuCode` | 物料sku编码 | `sku_code` | String | `text` |  | ✓ |
| 108 | `skuName` | 物料sku名称 | `sku_name` | String | `text` |  | ✓ |
| 109 | `skuModel` | SKU型号 | `sku_model` | String | `text` |  | ✓ |
| 110 | `specNames` | SKU规格 | `spec_names` | String | `text` |  | ✓ |
| 111 | `skuSpec` | SKU规格说明 | `sku_spec` | String | `text` |  | ✓ |
| 112 | `mainUnit` | 主单位id | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 113 | `mainUnitCode` | 主单位编码 | `main_unit_code` | String | `text` |  | ✓ |
| 114 | `mainUnitName` | 主单位名称 | `main_unit_name` | String | `text` |  | ✓ |
| 115 | `purUnit` | 采购单位id | `pur_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 116 | `purUnitCode` | 采购单位编码 | `pur_unit_code` | String | `text` |  | ✓ |
| 117 | `purUnitName` | 采购单位名称 | `pur_unit_name` | String | `text` |  | ✓ |
| 118 | `invPriceExchRate` | 计价单位换算率 | `inv_price_exch_rate` | Decimal | `number` |  | ✓ |
| 119 | `invPurExchRate` | 采购单位换算率 | `inv_pur_exch_rate` | Decimal | `number` |  | ✓ |
| 120 | `priceUnit` | 计价单位id | `price_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 121 | `priceUnitCode` | 计价单位编码 | `price_unit_code` | String | `text` |  | ✓ |
| 122 | `priceUnitName` | 计价单位名称 | `price_unit_name` | String | `text` |  | ✓ |
| 123 | `puNum` | 计价数量 | `pu_num` | Decimal | `number` |  | ✓ |
| 124 | `puMainNum` | 主数量 | `pu_main_num` | Decimal | `number` |  | ✓ |
| 125 | `puPurNum` | 采购数量 | `pu_pur_num` | Decimal | `number` |  | ✓ |
| 126 | `puOriginalPrice` | 原无税单价 | `pu_original_price` | Decimal | `number` |  | ✓ |
| 127 | `puOriginalTaxprice` | 原含税单价 | `pu_original_taxprice` | Decimal | `number` |  | ✓ |
| 128 | `puTaxrate` | 采购税率 | `pu_taxrate` | Decimal | `number` |  | ✓ |
| 129 | `puPrice` | 采购无税单价 | `pu_price` | Decimal | `number` |  | ✓ |
| 130 | `puTaxprice` | 采购含税单价 | `pu_taxprice` | Decimal | `number` |  | ✓ |
| 131 | `ajustTaxrate` | 调整税率 | `ajust_taxrate` | Decimal | `number` |  | ✓ |
| 132 | `puMny` | 应对无税金额 | `pu_mny` | Decimal | `number` |  | ✓ |
| 133 | `puTaxmny` | 应对含税金额 | `pu_taxmny` | Decimal | `number` |  | ✓ |
| 134 | `puTax` | 采购税额 | `pu_tax` | Decimal | `number` |  | ✓ |
| 135 | `ajustMny` | 调整无税金额 | `ajust_mny` | Decimal | `number` |  | ✓ |
| 136 | `ajustTaxmny` | 调整含税金额 | `ajust_taxmny` | Decimal | `number` |  | ✓ |
| 137 | `chargebackTaxmny` | 品质扣款含税金额 | `chargeback_taxmny` | Decimal | `number` |  | ✓ |
| 138 | `chargebackMny` | 品质扣款无税金额 | `chargeback_mny` | Decimal | `number` |  | ✓ |
| 139 | `puDeductionTaxmny` | 采购扣款含税金额 | `pu_deduction_taxmny` | Decimal | `number` |  | ✓ |
| 140 | `puDeductionMny` | 采购扣款无税金额 | `pu_deduction_mny` | Decimal | `number` |  | ✓ |
| 141 | `actualNum` | 实对数量 | `actual_num` | Decimal | `number` |  | ✓ |
| 142 | `actualMainNum` | 实对主数量 | `actual_main_num` | Decimal | `number` |  | ✓ |
| 143 | `actualPurNum` | 实对采购数量 | `actual_pur_num` | Decimal | `number` |  | ✓ |
| 144 | `actualMny` | 实对无税金额 | `actual_mny` | Decimal | `number` |  | ✓ |
| 145 | `actualTaxmny` | 实对含税金额 | `actual_taxmny` | Decimal | `number` |  | ✓ |
| 146 | `refuseReason` | 拒绝原因 | `refuse_reason` | String | `text` |  | ✓ |
| 147 | `accInvoiceMainNum` | 已开票主数量 | `acc_invoice_main_num` | Decimal | `number` |  | ✓ |
| 148 | `accInvoicePurNum` | 已开票采购数量 | `acc_invoice_pur_num` | Decimal | `number` |  | ✓ |
| 149 | `accInvoiceNum` | 累计开票数量 | `acc_invoice_num` | Decimal | `number` |  | ✓ |
| 150 | `accApplyNum` | 销售发票未发布数量 | `acc_apply_num` | Decimal | `number` |  | ✓ |
| 151 | `accApplyMainNum` | 销售发票未发布主数量 | `acc_apply_main_num` | Decimal | `number` |  | ✓ |
| 152 | `accApplyPurNum` | 销售发票未发布采购数量 | `acc_apply_pur_num` | Decimal | `number` |  | ✓ |
| 153 | `accInvoiceMny` | 累计开票无税金额 | `acc_invoice_mny` | Decimal | `number` |  | ✓ |
| 154 | `accInvoiceTaxmny` | 累计开票含税金额 | `acc_invoice_taxmny` | Decimal | `number` |  | ✓ |
| 155 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 156 | `status` | 匹配状态(0:自动匹配,1:自动数量金额不匹配,2:自动状态不匹配,3:没有匹配信息,4:单据未匹配) | `status` | String | `text` |  | ✓ |
| 157 | `relateId` | 关联销售对账单id{yuncai_check.sale_checkbill} | `relate_id` | String | `text` |  | ✓ |
| 158 | `relateBid` | 关联销售对账单子表id{yuncai_check.sale_checkbill_b} | `relate_bid` | String | `text` |  | ✓ |
| 159 | `relateMid` | 关联销售对账单孙表id{yuncai_check.sale_checkbill_m} | `relate_mid` | String | `text` |  | ✓ |
| 160 | `ajustPrice` | 调整无税价格 | `ajust_price` | Decimal | `number` |  | ✓ |
| 161 | `ajustTaxprice` | 调整含税价格 | `ajust_taxprice` | Decimal | `number` |  | ✓ |
| 162 | `ajustTax` | 调整税额 | `ajust_tax` | Decimal | `number` |  | ✓ |
| 163 | `ajustNum` | 调整数量 | `ajust_num` | Decimal | `number` |  | ✓ |
| 164 | `matchId` | 采购销售单据匹配id | `match_id` | 3cf2adf0-16c3-4d8e-a9d5-69583d569914 | `quote` |  | ✓ |
| 165 | `matchBid` | 采购销售单据匹配bid | `match_bid` | ab07448d-8aa8-4c93-9981-1d80f2638c0e | `quote` |  | ✓ |
| 166 | `accApplyMny` | 累计申请无税金额 | `acc_apply_mny` | Decimal | `number` |  | ✓ |
| 167 | `accApplyTaxmny` | 累计申请含税金额 | `acc_apply_taxmny` | Decimal | `number` |  | ✓ |
| 168 | `tenantId` | 采购商商租户id{cpu_auth.cpu_enterprise} | `tenant_id` | String | `text` |  | ✓ |
| 169 | `puPkOrg` | 采购单据组织id{org_orgs} | `pu_pk_org` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 170 | `puOrgCode` | puOrgCode | `pu_org_code` | String | `text` |  | ✓ |
| 171 | `puOrgName` | 采购单据组织名称 | `pu_org_name` | String | `text` |  | ✓ |
| 172 | `puBillId` | 采购 单据id | `pu_bill_id` | String | `text` |  | ✓ |
| 173 | `puBillBid` | 采购单据表体id | `pu_bill_bid` | String | `text` |  | ✓ |
| 174 | `salePkOrg` | 销售组织id | `sale_pk_org` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 175 | `saleOrgCode` | 销售组织编码 | `sale_org_code` | String | `text` |  | ✓ |
| 176 | `saleOrgName` | 销售组织名称 | `sale_org_name` | String | `text` |  | ✓ |
| 177 | `saleBillId` | 销售单据id | `sale_bill_id` | String | `text` |  | ✓ |
| 178 | `saleBillBid` | 销售单据表体id | `sale_bill_bid` | String | `text` |  | ✓ |
| 179 | `saleOuterBid` | 销售单据记采购单据表体id | `sale_outer_bid` | String | `text` |  | ✓ |
| 180 | `saleNum` | 销售数量 | `sale_num` | Decimal | `number` |  | ✓ |
| 181 | `saleMny` | 销售无税金额 | `sale_mny` | Decimal | `number` |  | ✓ |
| 182 | `saleTaxmny` | 销售含税金额 | `sale_taxmny` | Decimal | `number` |  | ✓ |
| 183 | `saleTax` | 销售税额 | `sale_tax` | Decimal | `number` |  | ✓ |
| 184 | `salePrice` | 销售无税单价 | `sale_price` | Decimal | `number` |  | ✓ |
| 185 | `saleTaxprice` | 销售含税单价 | `sale_taxprice` | Decimal | `number` |  | ✓ |
| 186 | `saleTaxrate` | 销售税率 | `sale_taxrate` | Decimal | `number` |  | ✓ |
| 187 | `saleWareId` | 销售商品id | `sale_ware_id` | String | `text` |  | ✓ |
| 188 | `saleWareCode` | 销售商品编码 | `sale_ware_code` | String | `text` |  | ✓ |
| 189 | `saleWareName` | 销售商品名称 | `sale_ware_name` | String | `text` |  | ✓ |
| 190 | `saleWareCunit` | 销售单位 | `sale_ware_cunit` | String | `text` |  | ✓ |
| 191 | `saleWareImgurl` | 销售商品图片url | `sale_ware_imgurl` | String | `text` |  | ✓ |
| 192 | `puPriceFloatValue` | 浮动金额 浮动比例 | `pu_price_float_value` | Decimal | `number` |  | ✓ |
| 193 | `puConfirmBrand` | 签收品牌 | `pu_confirm_brand` | String | `text` |  | ✓ |
| 194 | `puBaseTaxprice` | 基准价 | `pu_base_taxprice` | Decimal | `number` |  | ✓ |
| 195 | `orderCode` | 订单号 | `order_code` | String | `text` |  | ✓ |
| 196 | `deliveryorderCode` | 发货单编码 | `deliveryorder_code` | String | `text` |  | ✓ |
| 197 | `contractBillno` | 合同号 | `contract_billno` | String | `text` |  | ✓ |
| 198 | `currencyId` | 币种id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 199 | `currencyCode` | 币种编码 | `currency_code` | String | `text` |  | ✓ |
| 200 | `currencySymbol` | 币种符号 | `currency_symbol` | String | `text` |  | ✓ |
| 201 | `sourceCheckbillMid` | erp对账单物料明细id | `source_checkbill_mid` | String | `text` |  | ✓ |
| 202 | `sourceRowno` | 来源单据行号 | `source_rowno` | String | `text` |  | ✓ |
| 203 | `ytenant` | ytenantId | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 204 | `projectId` | 项目id | `project_id` | String | `text` |  | ✓ |
| 205 | `projectCode` | 项目编码 | `project_code` | String | `text` |  | ✓ |
| 206 | `projectName` | 项目名称 | `project_name` | String | `text` |  | ✓ |
| 207 | `erpProjectId` | 项目ERPID | `erp_project_id` | String | `text` |  | ✓ |
| 208 | `arriveorderCode` | 到货单号 | `arriveorder_code` | String | `text` |  | ✓ |
| 209 | `contractId` | 合同id | `contract_id` | String | `text` |  | ✓ |
| 210 | `contractBid` | 合同行id | `contract_bid` | String | `text` |  | ✓ |
| 211 | `orderId` | 订单id | `order_id` | String | `text` |  | ✓ |
| 212 | `orderBid` | 订单行id | `order_bid` | String | `text` |  | ✓ |
| 213 | `arriveorderId` | 到货单id | `arriveorder_id` | String | `text` |  | ✓ |
| 214 | `arriveorderBid` | 到货单行id | `arriveorder_bid` | String | `text` |  | ✓ |
| 215 | `puOuterCode` | 销售订单号 | `pu_outer_code` | String | `text` |  | ✓ |
| 216 | `puOuterId` | 销售订单id | `pu_outer_id` | String | `text` |  | ✓ |
| 217 | `puOuterBid` | 销售订单行id | `pu_outer_bid` | String | `text` |  | ✓ |
| 218 | `deliveryorderId` | 发货单id | `deliveryorder_id` | String | `text` |  | ✓ |
| 219 | `deliveryorderBId` | 发货单行id | `deliveryorder_bid` | String | `text` |  | ✓ |
| 220 | `erpOrderBid` | ERP订单行id | `erp_order_bid` | String | `text` |  | ✓ |
| 221 | `erpArriveorderBid` | ERP到货单行id | `erp_arriveorder_bid` | String | `text` |  | ✓ |
| 222 | `deliveryNum` | 发货数量 | `delivery_num` | Decimal | `number` |  | ✓ |
| 223 | `checkbillId` | 对账单id | `checkbill_id` | 0e70a14d-2339-4067-9754-340c3292e12b | `quote` |  | ✓ |
| 224 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 225 | `reqId` | 需求id | `req_id` | String | `text` |  | ✓ |
| 226 | `puGoodstatus` | 采购单据 状态 | `pu_goodstatus` | String | `text` |  | ✓ |
| 227 | `saleBilltype` | 销售单据类型 | `sale_billtype` | String | `text` |  | ✓ |
| 228 | `puPkSupplier` | 供应商档案id{cpu_basedoc.cpu_supplydoc} | `pu_pk_supplier` | Long | `long` |  | ✓ |
| 229 | `puSupplierCode` | 供应商档案code | `pu_supplier_code` | String | `text` |  | ✓ |
| 230 | `puSupplierName` | 采购供应商名称 | `pu_supplier_name` | String | `text` |  | ✓ |
| 231 | `puPkInvoicevendor` | 开票供应商pk | `pu_pk_invoicevendor` | String | `text` |  | ✓ |
| 232 | `puInvoicevendorCode` | 开票供应商编码 | `pu_invoicevendor_code` | String | `text` |  | ✓ |
| 233 | `puInvoicevendorName` | 开票供应商名称 | `pu_invoicevendor_name` | String | `text` |  | ✓ |
| 234 | `puSupplierTenantId` | 供应商租户id{cpu_auth.cpu_enterprise} | `pu_supplier_tenant_id` | String | `text` |  | ✓ |
| 235 | `puIsLeave` | 采购是否遗留 | `pu_is_leave` | Boolean | `switch` |  | ✓ |
| 236 | `puPriceType` | 价格类型 | `pu_price_type` | String | `text` |  | ✓ |
| 237 | `puSignTime` | 签收时间 | `pu_sign_time` | DateTime | `timestamp` |  | ✓ |
| 238 | `isDeliveryBrand` | 是否允许反馈发货品牌 | `is_delivery_brand` | Boolean | `switch` |  | ✓ |
| 239 | `puDef1` | 原子表自定义项1 | `pu_def1` | String | `text` |  | ✓ |
| 240 | `puDef2` | 原子表自定义项2 | `pu_def2` | String | `text` |  | ✓ |
| 241 | `puDef3` | 原子表自定义项3 | `pu_def3` | String | `text` |  | ✓ |
| 242 | `puDef4` | 原子表自定义项4 | `pu_def4` | String | `text` |  | ✓ |
| 243 | `puDef5` | 原子表自定义项5 | `pu_def5` | String | `text` |  | ✓ |
| 244 | `puErpFanaceorgOid` | ERP财务组织 | `pu_erp_fanaceorg_oid` | String | `text` |  | ✓ |
| 245 | `puErpFanaceorgVid` | ERP财务组织 | `pu_erp_fanaceorg_vid` | String | `text` |  | ✓ |
| 246 | `puHfanorgCode` | 财务组织编码 | `pu_hfanorg_code` | String | `text` |  | ✓ |
| 247 | `puHfanorgName` | 财务组织名称 | `pu_hfanorg_name` | String | `text` |  | ✓ |
| 248 | `puHfanorgId` | 财务组织Id | `pu_hfanorg_id` | String | `text` |  | ✓ |
| 249 | `ctrantypename` | 入库交易类型 | `ctrantypename` | String | `text` |  | ✓ |
| 250 | `ctrantypeid` | 入库交易类型id | `ctrantypeid` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 251 | `vtrantypecode` | 入库交易类型code | `vtrantypecode` | String | `text` |  | ✓ |
| 252 | `businessProcess` | ERP业务流程 | `business_process` | String | `text` |  | ✓ |
| 253 | `puBizflowName` | 流程名称 | `pu_bizflow_name` | String | `text` |  | ✓ |
| 254 | `puBizflowId` | 业务流程id | `pu_bizflow_id` | String | `text` |  | ✓ |
| 255 | `sourceMemo` | 来源表头备注 | `source_memo` | String | `text` |  | ✓ |
| 256 | `sourceMemob` | 来源表体备注 | `source_memo_b` | String | `text` |  | ✓ |
| 257 | `deptId` | 采购部门id | `dept_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 258 | `purPersonId` | 采购员id | `pur_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 259 | `puBilldate` | 采购单据日期 | `pu_billdate` | Date | `date` |  | ✓ |
| 260 | `freeDefine` | 采购对账单孙表自由自定义项表 | `` | 5da50cab-1753-4e0a-a244-12f4024a2372 | `` |  |  |
| 261 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String | `text` |  | ✓ |
| 262 | `integrationType` | 集成类型 | `integration_type` | String | `text` |  | ✓ |
| 263 | `invPriceExchRateDen` | 计价单位换算率分母 | `invpriceexchrateden` | Decimal | `number` |  | ✓ |
| 264 | `invPriceExchRateNum` | 计价单位换算率分子 | `invpriceexchratenum` | Decimal | `number` |  | ✓ |
| 265 | `invPurExchRateDen` | 采购单位换算率分母 | `inv_pur_exch_rateden` | Decimal | `number` |  | ✓ |
| 266 | `invPurExchRateNum` | 采购单位换算率分子 | `inv_pur_exch_ratenum` | Decimal | `number` |  | ✓ |
| 267 | `lineno` | 行号 | `lineno` | Decimal | `number` |  | ✓ |
| 268 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String | `text` |  | ✓ |
| 269 | `source` | 上游单据类型 | `source` | String | `text` |  | ✓ |
| 270 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime | `timestamp` |  | ✓ |
| 271 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long | `long` |  | ✓ |
| 272 | `sourceid` | 上游单据主表id | `sourceid` | Long | `long` |  | ✓ |
| 273 | `upcode` | 上游单据号 | `upcode` | String | `text` |  | ✓ |

---

## 关联属性（共 34 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `checkbillId` | 对账单id | `check.pucheckbill.PuCheckBillVO` | `checkbill_id` | materiaList → checkbillId | 1..n | true | None |  |
| 2 | `expenseItemId` | 费用项目id | `bd.expenseitem.ExpenseItem` | `expense_item_id` |  →  |  |  | Service |  |
| 3 | `salePkOrg` | 销售组织id | `org.func.BaseOrg` | `sale_pk_org` |  →  |  |  | Service |  |
| 4 | `hstoId` | 仓库id | `aa.warehouse.Warehouse` | `hsto_id` |  →  |  |  | Service |  |
| 5 | `puPuWareId` | 采购单据物料id{cpu_material.cpu_material} | `pc.product.Product` | `pu_pu_ware_id` |  →  |  |  | Service |  |
| 6 | `activity` | 活动主键 | `pgrm.projecttask.ProjectScheduleTask` | `activity` |  →  |  |  | Service |  |
| 7 | `puWareClassId` | 物料分类 | `pc.cls.ManagementClass` | `pu_ware_class_id` |  →  |  |  | Service |  |
| 8 | `creatorId` | 创建人 | `base.user.User` | `creatorId` |  →  |  |  | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | `modifierId` |  →  |  |  | Service |  |
| 10 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | `wbs` |  →  |  |  | Service |  |
| 11 | `matchBid` | 采购销售单据匹配bid | `check.checkpool.GodownEntryDetailVO` | `match_bid` |  →  |  |  | None |  |
| 12 | `costcenterId` | 成本中心主键 | `bd.costcenter.CostCenter` | `costcenter_id` |  →  |  |  | Service |  |
| 13 | `qualityPriceSchemeId` | 优质优价方案主键 | `aa.qualitypricescheme.QualitypriceScheme` | `quality_price_scheme_id` |  →  |  |  | Service |  |
| 14 | `operationId` | 工序 | `ed.operation.Operation` | `operation_id` |  →  |  |  | Service |  |
| 15 | `PuCheckMaterialVODefineCharacter` | 表体自定义项特征属性 | `check.pucheckbill.UserDefinemateriaListCharacteristics` | `pu_check_material_define_character` |  →  |  |  | None |  |
| 16 | `currencyId` | 币种id | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |  →  |  |  | Service |  |
| 17 | `sourceTranstype` | 来源单据交易类型 | `bd.bill.TransType` | `source_transtype` |  →  |  |  | Service |  |
| 18 | `matchId` | 采购销售单据匹配id | `check.checkpool.GodownEntryVO` | `match_id` |  →  |  |  | None |  |
| 19 | `puPkOrg` | 采购单据组织id{org_orgs} | `org.func.BaseOrg` | `pu_pk_org` |  →  |  |  | Service |  |
| 20 | `skuId` | 物料SKU id {productsku} | `pc.product.ProductSKU` | `sku_id` |  →  |  |  | Service |  |
| 21 | `priceUnit` | 计价单位id | `pc.unit.Unit` | `price_unit` |  →  |  |  | Service |  |
| 22 | `purPersonId` | 采购员id | `bd.staff.Staff` | `pur_person_id` |  →  |  |  | Service |  |
| 23 | `mainUnit` | 主单位id | `pc.unit.Unit` | `main_unit` |  →  |  |  | Service |  |
| 24 | `ctrantypeid` | 入库交易类型id | `bd.bill.TransType` | `ctrantypeid` |  →  |  |  | Service |  |
| 25 | `ytenant` | ytenantId | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 26 | `deptId` | 采购部门id | `org.func.BaseOrg` | `dept_id` |  →  |  |  | Service |  |
| 27 | `puTaxRateId` | 原税目 | `archive.taxArchives.TaxRateArchive` | `pu_taxrate_id` |  →  |  |  | Service |  |
| 28 | `adjustTaxRateId` | 调整税目 | `archive.taxArchives.TaxRateArchive` | `adjust_taxrate_id` |  →  |  |  | Service |  |
| 29 | `formulaId` | 价格公式ID | `aa.priceformula.PriceFormula` | `formula_id` |  →  |  |  | Service |  |
| 30 | `pkOrg` | 采购组织id{org_orgs} | `org.func.BaseOrg` | `pk_org` |  →  |  |  | Service |  |
| 31 | `freeDefine` | 采购对账单孙表自由自定义项表 | `check.pucheckbill.PuCheckBillMFreeDefine` | `` | freeDefine → id | 1 | true | None | ⚠️ |
| 32 | `PuCheckMaterialVOFreeCharacteristics` | 自由项特征组实体 | `check.pucheckbill.FreePropertyCharacteristics` | `pu_checkbill_free_characteristics` |  →  |  |  | None |  |
| 33 | `receiveOrg` | 收货组织 | `org.func.BaseOrg` | `receive_org` |  →  |  |  | Service |  |
| 34 | `purUnit` | 采购单位id | `pc.unit.Unit` | `pur_unit` |  →  |  |  | Service |  |

### Composition（子表）

- **checkbillId**: `materiaList` → `check.pucheckbill.PuCheckBillVO` | 1..n
- **freeDefine**: `freeDefine` → `check.pucheckbill.PuCheckBillMFreeDefine` | 1 ⚠️ 已废弃

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `expenseItemId` (费用项目id) | `bd.expenseitem.ExpenseItem` | `expense_item_id` |
| `salePkOrg` (销售组织id) | `org.func.BaseOrg` | `sale_pk_org` |
| `hstoId` (仓库id) | `aa.warehouse.Warehouse` | `hsto_id` |
| `puPuWareId` (采购单据物料id{cpu_material.cpu_material}) | `pc.product.Product` | `pu_pu_ware_id` |
| `activity` (活动主键) | `pgrm.projecttask.ProjectScheduleTask` | `activity` |
| `puWareClassId` (物料分类) | `pc.cls.ManagementClass` | `pu_ware_class_id` |
| `creatorId` (创建人) | `base.user.User` | `creatorId` |
| `modifierId` (修改人) | `base.user.User` | `modifierId` |
| `wbs` (WBS) | `BGDM.wbs.wbs_doc` | `wbs` |
| `costcenterId` (成本中心主键) | `bd.costcenter.CostCenter` | `costcenter_id` |
| `qualityPriceSchemeId` (优质优价方案主键) | `aa.qualitypricescheme.QualitypriceScheme` | `quality_price_scheme_id` |
| `operationId` (工序) | `ed.operation.Operation` | `operation_id` |
| `currencyId` (币种id) | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |
| `sourceTranstype` (来源单据交易类型) | `bd.bill.TransType` | `source_transtype` |
| `puPkOrg` (采购单据组织id{org_orgs}) | `org.func.BaseOrg` | `pu_pk_org` |
| `skuId` (物料SKU id {productsku}) | `pc.product.ProductSKU` | `sku_id` |
| `priceUnit` (计价单位id) | `pc.unit.Unit` | `price_unit` |
| `purPersonId` (采购员id) | `bd.staff.Staff` | `pur_person_id` |
| `mainUnit` (主单位id) | `pc.unit.Unit` | `main_unit` |
| `ctrantypeid` (入库交易类型id) | `bd.bill.TransType` | `ctrantypeid` |
| `ytenant` (ytenantId) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `deptId` (采购部门id) | `org.func.BaseOrg` | `dept_id` |
| `puTaxRateId` (原税目) | `archive.taxArchives.TaxRateArchive` | `pu_taxrate_id` |
| `adjustTaxRateId` (调整税目) | `archive.taxArchives.TaxRateArchive` | `adjust_taxrate_id` |
| `formulaId` (价格公式ID) | `aa.priceformula.PriceFormula` | `formula_id` |
| `pkOrg` (采购组织id{org_orgs}) | `org.func.BaseOrg` | `pk_org` |
| `receiveOrg` (收货组织) | `org.func.BaseOrg` | `receive_org` |
| `purUnit` (采购单位id) | `pc.unit.Unit` | `pur_unit` |
