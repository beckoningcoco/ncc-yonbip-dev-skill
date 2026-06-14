---
tags: [BIP, 元数据, 数据字典, znbzbx.pubprepayloanbill.PubPrePayTaxEngineCalResultVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计税税单 (`znbzbx.pubprepayloanbill.PubPrePayTaxEngineCalResultVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_tax_calc_result` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计税税单 |
| 物理表 | `znbz_tax_calc_result` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 33 个 |
| 子表 | 0 个 |
| 关联引用 | 15 个 |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `source_id` | `` |
| `local_currency_id` | `` |
| `ytenant_id` | `` |
| `tax_bureau_archive_id` | `` |
| `tax_category_archive_id` | `` |
| `tax_code_id` | `` |
| `calc_currency_id` | `` |
| `calculation_component_id` | `` |
| `calculation_input_bid` | `` |
| `taxrate_id` | `` |
| `calculation_input_id` | `` |
| `unit_id` | `` |
| `currency_id` | `` |
| `tax_item_id` | `` |
| `tenant_id` | `` |

## 字段列表（按类型分组）

> 共 33 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `source_busi_obj` | `source_busi_obj` | `sourcebusiobj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourcechildId` | 上游单据子表id |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `source_id` | `source_id` | `sourceId` | 对公预付单主表 |
| `calc_currency_id` | `calc_currency_id` | `calcCurrencyId` | 计税币种 |
| `calculation_component_id` | `calculation_component_id` | `calculationComponentId` | 计税组件id |
| `calculation_input_bid` | `calculation_input_bid` | `calculationInputBid` | 计税输入明细id |
| `calculation_input_id` | `calculation_input_id` | `calculationInputId` | 计税输入id |
| `tax_bureau_archive_id` | `tax_bureau_archive_id` | `taxBureauArchiveId` | 税制 |
| `tax_category_archive_id` | `tax_category_archive_id` | `taxCategoryArchiveId` | 税种 |
| `tax_code_id` | `tax_code_id` | `taxCodeId` | 税码 |
| `tax_item_id` | `tax_item_id` | `taxItemId` | 税目 |
| `taxrate_id` | `taxrate_id` | `taxrateId` | 税率 |
| `unit_id` | `unit_id` | `unitId` | 计税单位 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `currency_id` | `currency_id` | `currencyId` | 原币 |
| `local_currency_id` | `local_currency_id` | `localCurrencyId` | 本币 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rounding_id` | `rounding_id` | `roundingId` | 舍入规则 |
| `curr_type` | `curr_type` | `currType` | 计税币种 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 数值字段 (11个)

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
| `local_tax_mny` | `local_tax_mny` | `localTaxMny` | 本币税额 |
| `ori_tax_mny` | `ori_tax_mny` | `oriTaxMny` | 原币税额 |

### bigText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `calculation_component_formula` | `calculation_component_formula` | `calculationComponentFormula` | 计税组件表达式 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
