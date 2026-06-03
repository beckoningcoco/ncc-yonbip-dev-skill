---
tags: [BIP, 元数据, 数据字典, earap.payable.PayableTaxCalcResult]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计税结果 (`earap.payable.PayableTaxCalcResult`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tax_calc_result` | domain：`yonbip-ec-contract` | 应用：`STB` | 业务对象ID：`d610a7e5-78db-461c-a39c-57d3d42a26b8`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计税结果 |
| 物理表 | `tax_calc_result` |
| 数据库 schema | `yonbip-ec-contract` |
| 所属应用 | `STB` |
| 直连字段 | 52 个 |
| 子表 | 1 个 |
| 关联引用 | 20 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `taxCalcResultDetailItem` | `earap.payable.PayableTaxCalcResultDetail` | composition |

## 关联引用 (20个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `local_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `` | `` |
| `bill_type_id` | `transtype.bd_billtypetreeref` |
| `deduction_type` | `yonbip-fi-taxpubdoc.RefTable_948d15e041` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `tax_bureau_archive_id` | `yonbip-fi-taxpubdoc.RefTable_457b0fd24` |
| `tax_category_archive_id` | `yonbip-fi-taxpubdoc.RefTable_c271791694` |
| `ytenant_id` | `` |
| `tax_code_id` | `yonbip-fi-taxpubdoc.RefTable_832e0ffa60` |
| `calc_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `header_id` | `` |
| `calculation_component_id` | `yonbip-fi-taxpubdoc.RefTable_9ec104ed1` |
| `calculation_input_bid` | `` |
| `taxrate_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `calculation_input_id` | `` |
| `unit_id` | `productcenter.pc_unitref_new` |
| `body_id` | `` |
| `currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `tax_item_id` | `yonbip-fi-taxpubdoc.RefTable_182eb8090` |

## 继承接口 (4个, 14字段)

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
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 52 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxId` | 全局事务ID |
| `line_amount_mark` | `line_amount_mark` | `lineAmountMark` | 行金额标识 |
| `exchange_rate_method` | `exchange_rate_method` | `exchangeRateMethod` | 汇率折算方式 |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `id` | `id` | `id` | 主键 |

### 引用字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `header_id` | `header_id` | `headerId` | 主表ID |
| `bill_type_id` | `bill_type_id` | `billType` | 单据类型 |
| `calc_currency_id` | `calc_currency_id` | `calcCurrencyId` | 计税币种 |
| `calculation_input_id` | `calculation_input_id` | `calculationInputId` | 计税输入 |
| `tax_category_archive_id` | `tax_category_archive_id` | `taxCategoryArchiveId` | 税种 |
| `tax_bureau_archive_id` | `tax_bureau_archive_id` | `taxBureauArchiveId` | 税制 |
| `calculation_input_bid` | `calculation_input_bid` | `calculationInputBid` | 计税输入明细id |
| `tax_item_id` | `tax_item_id` | `taxItemId` | 税目 |
| `taxrate_id` | `taxrate_id` | `taxrateId` | 税率 |
| `tax_code_id` | `tax_code_id` | `taxCodeId` | 税码 |
| `calculation_component_id` | `calculation_component_id` | `calculationComponentId` | 计税组件id |
| `unit_id` | `unit_id` | `unitId` | 计税单位 |
| `deduction_type` | `deduction_type` | `deductionType` | 抵扣类型 |
| `currency_id` | `currency_id` | `currencyId` | 原币 |
| `local_currency_id` | `local_currency_id` | `localCurrencyId` | 本币 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `creator` | `creator` | `creator` | 创建人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `body_id` | `body_id` | `bodyId` | 子表ID |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `with_hold_remit` | `with_hold_remit` | `withholdRemit` | 是否代扣代缴 |
| `curr_type` | `curr_type` | `currType` | 计税币种类型 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 全局事务状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fin_deduct_tax_mny` | `fin_deduct_tax_mny` | `finDeductTaxMny` | 最终减免税额 |
| `deduct_taxrate_qty` | `deduct_taxrate_qty` | `deductTaxrateQty` | 减免税率值 |
| `tot_deduct_mny` | `tot_deduct_mny` | `totDeductMny` | 累计减免金额 |
| `fin_tax_mny` | `fin_tax_mny` | `finTaxMny` | 最终税额 |
| `taxrate_qty` | `taxrate_qty` | `taxrateQty` | 税率值 |
| `calc_qty` | `calc_qty` | `calcQty` | 计税数量 |
| `calc_mny` | `calc_mny` | `calcMny` | 计税金额 |
| `tot_deduct_tax_mny` | `tot_deduct_tax_mny` | `totDeductTaxMny` | 累计减免税额 |
| `calc_tax_mny` | `calc_tax_mny` | `calcTaxMny` | 计算税额 |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `ori_tax_mny` | `ori_tax_mny` | `oriTaxMny` | 原币税额 |
| `local_tax_mny` | `local_tax_mny` | `localTaxMny` | 本币税额 |

### bigText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `calculation_component_formula` | `calculation_component_formula` | `calculationComponentFormula` | 计税组件表达式 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `taxCalcResultDetailItem` | 计税结果明细 |
