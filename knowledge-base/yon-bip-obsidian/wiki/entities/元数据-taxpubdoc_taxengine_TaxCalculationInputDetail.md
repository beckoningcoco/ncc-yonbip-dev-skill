---
tags: [BIP, 元数据, 数据字典, taxpubdoc.taxengine.TaxCalculationInputDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计税输入明细 (`taxpubdoc.taxengine.TaxCalculationInputDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tax_calc_input_b` | domain：`yonbip-fi-taxpubdoc` | 应用：`DPMTAX` | 业务对象ID：`3f94a0e6-2b63-4846-92f3-691818172b8e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计税输入明细 |
| 物理表 | `tax_calc_input_b` |
| domain/服务域 | `yonbip-fi-taxpubdoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMTAX` |
| 直连字段 | 55 个 |
| 子表 | 0 个 |
| 关联引用 | 16 个 |

## 关联引用 (16个)

| 字段名 | 引用类型 |
|--------|---------|
| `hid` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `product_class_id` | `productcenter.pc_managementclassref` |
| `local_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `define_term` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `relief_tax_code_id` | `yonbip-fi-taxpubdoc.RefTable_d3df771b94` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.baseProductRef` |
| `tax_code_id` | `yonbip-fi-taxpubdoc.RefTable_832e0ffa60` |
| `receiver_country` | `ucfbasedoc.bd_countryref` |
| `warehouse_id` | `productcenter.aa_warehouse` |
| `delivery_country` | `ucfbasedoc.bd_countryref` |
| `unit_id` | `productcenter.pc_unitref` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `currency_id` | `ucfbasedoc.bd_currencytenantref` |

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

> 共 55 个直连字段

### 文本字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `line_amount_mark` | `line_amount_mark` | `lineAmountMark` | 行金额标识 |
| `receiver_address` | `receiver_address` | `receiverAddress` | 收货地址(市县) |
| `delivery_postcode` | `delivery_postcode` | `deliveryPostcode` | 发货邮编 |
| `receiver_postcode` | `receiver_postcode` | `receiverPostcode` | 收货邮编 |
| `mar_class_code` | `mar_class_code` | `marClassCode` | 商品分类编码 |
| `delivery_address` | `delivery_address` | `deliveryAddress` | 发货地址(市县) |
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

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `local_currency_id` | `local_currency_id` | `localCurrencyId` | 本币 |
| `currency_id` | `currency_id` | `currencyId` | 原币 |
| `hid` | `hid` | `hid` | 计税输入 |
| `product_class_id` | `product_class_id` | `productClassId` | 物料分类 |
| `delivery_country` | `delivery_country` | `deliveryCountry` | 发货国家/地区 |
| `warehouse_id` | `warehouse_id` | `warehouseId` | 仓库 |
| `material_id` | `material_id` | `materialId` | 物料 |
| `unit_id` | `unit_id` | `unitId` | 单位 |
| `receiver_country` | `receiver_country` | `receiverCountry` | 收货国家/地区 |
| `relief_tax_code_id` | `relief_tax_code_id` | `reliefTaxCodeId` | 减免税码 |
| `tax_code_id` | `tax_code_id` | `taxCodeId` | 税码 |
| `currency` | `currency` | `currency` | 币种 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `calc_tax_date` | `calc_tax_date` | `calcTaxDate` | 计税日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate_method` | `exchange_rate_method` | `exchangeRateMethod` | 汇率折算方式 |
| `curr_type` | `curr_type` | `currType` | 计税币种 |
| `price_mark` | `price_mark` | `priceMark` | 价格标识 |
| `direct_delivery` | `direct_delivery` | `directDelivery` | 是否直接交货 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `discount_amount` | `discount_amount` | `discountAmount` | 行折扣额 |
| `unit_price` | `unit_price` | `unitPrice` | 单价 |
| `hsje` | `hsje` | `hsje` | 含税金额 |
| `hsdj` | `hsdj` | `hsdj` | 含税单价 |
| `money` | `money` | `money` | 无税金额 |
| `cost_price` | `cost_price` | `costPrice` | 成本价 |
| `dj` | `dj` | `dj` | 无税单价 |
| `qty` | `qty` | `qty` | 数量 |
| `discount_money` | `discount_money` | `discountMoney` | 折扣金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define_term` | `define_term` | `defineTerm` | 自定义特征项 |
