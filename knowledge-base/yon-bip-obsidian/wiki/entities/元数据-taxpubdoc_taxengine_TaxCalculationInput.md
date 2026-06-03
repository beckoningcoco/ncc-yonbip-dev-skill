---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxengine.TaxCalculationInput]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计税输入 (`taxpubdoc.taxengine.TaxCalculationInput`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tax_calc_input` | domain：`yonbip-fi-taxpubdoc` | 应用：`DPMTAX` | 业务对象ID：`3f94a0e6-2b63-4846-92f3-691818172b8e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计税输入 |
| 物理表 | `tax_calc_input` |
| 数据库 schema | `yonbip-fi-taxpubdoc` |
| 所属应用 | `DPMTAX` |
| 直连字段 | 58 个 |
| 子表 | 1 个 |
| 关联引用 | 20 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `TaxCalculationInputDetailList` | `taxpubdoc.taxengine.TaxCalculationInputDetail` | composition |

## 关联引用 (20个)

| 字段名 | 引用类型 |
|--------|---------|
| `invoice_receipt_address` | `productcenter.pc_addressarchivesref` |
| `billtype_id` | `ucfbasedoc.bd_billtypetreeref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `invoice_receipt_country` | `ucfbasedoc.bd_countryref` |
| `invoice_country` | `ucfbasedoc.bd_countryref` |
| `local_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `define_term` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `org_country` | `ucfbasedoc.bd_countryref` |
| `vendor_id` | `yssupplier.aa_vendor` |
| `` | `` |
| `ytenant_id` | `` |
| `customer_tax_country` | `ucfbasedoc.bd_countryref` |
| `receiver_country` | `ucfbasedoc.bd_countryref` |
| `warehouse_id` | `productcenter.aa_warehouse` |
| `delivery_country` | `ucfbasedoc.bd_countryref` |
| `customer_id` | `productcenter.aa_invoicemerchantref` |
| `vendor_tax_country` | `ucfbasedoc.bd_countryref` |
| `currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `transtype_id` | `ucfbasedoc.bd_billtyperef` |

## 继承接口 (5个, 19字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 58 个直连字段

### 文本字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `invoice_address` | `invoice_address` | `invoiceAddress` | 开票方地址(市县) |
| `customer_tax_number` | `customer_tax_number` | `customerTaxNumber` | 客户税务登记编码 |
| `receiver_address` | `receiver_address` | `receiverAddress` | 收货地址(市县) |
| `receiver_postcode` | `receiver_postcode` | `receiverPostcode` | 收货邮编 |
| `invoice_postcode` | `invoice_postcode` | `invoicePostcode` | 开票方邮编 |
| `taxpayer_type` | `taxpayer_type` | `taxpayerType` | 组织纳税人类型 |
| `vendor_tax_number` | `vendor_tax_number` | `vendorTaxNumber` | 供应商税务登记编号 |
| `delivery_address` | `delivery_address` | `deliveryAddress` | 发货地址(市县) |
| `invoice_receipt_postcode` | `invoice_receipt_postcode` | `invoiceReceiptPostcode` | 受票方邮编 |
| `delivery_postcode` | `delivery_postcode` | `deliveryPostcode` | 发货邮编 |
| `exchange_rate_method` | `exchange_rate_method` | `exchangeRateMethod` | 汇率折算方式 |
| `id` | `id` | `id` | 主键 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |

### 引用字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `invoice_receipt_address` | `invoice_receipt_address` | `invoiceReceiptAddress` | 受票方地址(市县) |
| `vendor_tax_country` | `vendor_tax_country` | `vendorTaxCountry` | 供应商税务登记国家/地区 |
| `customer_id` | `customer_id` | `customerId` | 客户 |
| `billtype_id` | `billtype_id` | `billtypeId` | 单据类型 |
| `warehouse_id` | `warehouse_id` | `warehouseId` | 仓库 |
| `delivery_country` | `delivery_country` | `deliveryCountry` | 发货国家/地区 |
| `invoice_receipt_country` | `invoice_receipt_country` | `invoiceReceiptCountry` | 受票方国家/地区 |
| `transtype_id` | `transtype_id` | `transtypeId` | 交易类型 |
| `invoice_country` | `invoice_country` | `invoiceCountry` | 开票方国家/地区 |
| `customer_tax_country` | `customer_tax_country` | `customerTaxCountry` | 客户税务登记国家/地区 |
| `currency_id` | `currency_id` | `currencyId` | 原币 |
| `receiver_country` | `receiver_country` | `receiverCountry` | 收货国家/地区 |
| `vendor_id` | `vendor_id` | `vendorId` | 供应商 |
| `org_country` | `org_country` | `orgCountry` | 组织税务登记国家/地区 |
| `local_currency_id` | `local_currency_id` | `localCurrencyId` | 本币 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `currency_convert_date` | `currency_convert_date` | `currencyConvertDate` | 汇率转换日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `trans_date` | `trans_date` | `transDate` | 交易日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tax_price_flag` | `tax_price_flag` | `taxPriceFlag` | 价格标识 |
| `tax_acc_type` | `tax_acc_type` | `taxAccType` | 精度类型 |
| `direct_delivery` | `direct_delivery` | `directDelivery` | 是否直接交货 |
| `insider_trading` | `insider_trading` | `insiderTrading` | 是否内部交易 |
| `tax_calc_method` | `tax_calc_method` | `taxCalcMethod` | 计税方式 |
| `curr_type` | `curr_type` | `currType` | 计税币种 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define_term` | `define_term` | `defineTerm` | 自定义特征项 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `TaxCalculationInputDetailList` | 计税输入明细 |
