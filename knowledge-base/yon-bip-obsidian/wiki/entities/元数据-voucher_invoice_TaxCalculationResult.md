---
tags: [BIP, 元数据, 数据字典, voucher.invoice.TaxCalculationResult]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计税结果 (`voucher.invoice.TaxCalculationResult`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tax_calc_result` | domain：`udinghuo` | 应用：`SCMSA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计税结果 |
| 物理表 | `tax_calc_result` |
| domain/服务域 | `udinghuo` |
| 所属应用 | `SCMSA` |
| 直连字段 | 34 个 |
| 子表 | 1 个 |
| 关联引用 | 15 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `TaxResultDetailList` | `voucher.invoice.TaxCalculationResultDetail` | composition |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `tax_bureau_archive_id` | `` |
| `tax_category_archive_id` | `` |
| `tax_code_id` | `` |
| `calc_currency_id` | `` |
| `calculation_component_id` | `` |
| `calculation_input_bid` | `` |
| `taxrate_id` | `` |
| `calculation_input_id` | `` |
| `sourcechild_id` | `` |
| `unit_id` | `` |
| `tax_item_id` | `` |

## 继承接口 (3个, 6字段)

- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 34 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `source_id` | `source_id` | `sourceId` | 上游单据id |
| `source_busi_obj` | `source_busi_obj` | `sourcebusiobj` | 上游业务对象 |

### 引用字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `calc_currency_id` | `calc_currency_id` | `calcCurrencyId` | 计税币种 |
| `calculation_component_id` | `calculation_component_id` | `calculationComponentId` | 计税组件id |
| `calculation_input_bid` | `calculation_input_bid` | `calculationInputBid` | 计税输入明细id |
| `calculation_input_id` | `calculation_input_id` | `calculationInputId` | 计税输入id |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `sourcechild_id` | `sourcechild_id` | `sourcechildId` | 上游单据子表id |
| `tax_bureau_archive_id` | `tax_bureau_archive_id` | `taxBureauArchiveId` | 税制 |
| `tax_category_archive_id` | `tax_category_archive_id` | `taxCategoryArchiveId` | 税种 |
| `tax_code_id` | `tax_code_id` | `taxCodeId` | 税码 |
| `tax_item_id` | `tax_item_id` | `taxItemId` | 税目 |
| `taxrate_id` | `taxrate_id` | `taxrateId` | 税率 |
| `unit_id` | `unit_id` | `unitId` | 计税单位 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rounding_id` | `rounding_id` | `roundingId` | 舍入规则 |
| `with_hold_remit` | `with_hold_remit` | `withholdRemit` | 是否代扣代缴 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `calc_mny` | `calc_mny` | `calcMny` | 计税金额 |
| `calc_qty` | `calc_qty` | `calcQty` | 计税数量 |
| `calc_tax_mny` | `calc_tax_mny` | `calcTaxMny` | 计算税额 |
| `deduct_taxrate_qty` | `deduct_taxrate_qty` | `deductTaxrateQty` | 减免税率值 |
| `fin_deduct_tax_mny` | `fin_deduct_tax_mny` | `finDeductTaxMny` | 最终减免税额 |
| `fin_tax_mny` | `fin_tax_mny` | `finTaxMny` | 最终税额 |
| `taxrate_qty` | `taxrate_qty` | `taxrateQty` | 税率值 |
| `tot_deduct_mny` | `tot_deduct_mny` | `totDeductMny` | 累计减免金额(明细汇总) |
| `tot_deduct_tax_mny` | `tot_deduct_tax_mny` | `totDeductTaxMny` | 累计减免税额(明细汇总) |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `TaxResultDetailList` | 计税结果明细 |

### bigText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `calculation_component_formula` | `calculation_component_formula` | `calculationComponentFormula` | 计税组件表达式 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
