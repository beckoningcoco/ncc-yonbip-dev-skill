---
tags: [BIP, 元数据, 数据字典, marketing.cpq.OptionalQuotationVoucher]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 配置报价清单关联单据 (`marketing.cpq.OptionalQuotationVoucher`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`optionalquotationvoucher` | domain：`marketingbill` | 应用：`CPQ` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 配置报价清单关联单据 |
| 物理表 | `optionalquotationvoucher` |
| 数据库 schema | `marketingbill` |
| 所属应用 | `CPQ` |
| 直连字段 | 42 个 |
| 子表 | 2 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `voucherGroupDetails` | `marketing.cpq.OptionalQuotationVoucherDetail` | composition |
| `voucherGroups` | `marketing.cpq.OptionalQuotationVoucherGroup` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `nat_currency` | `` |
| `` | `` |
| `voucher_character` | `` |
| `optionalQuotationId` | `` |
| `ytenant_id` | `` |
| `stockId` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 42 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `voucherType` | `voucherType` | `voucherType` | 来源单据类型 |
| `voucherNum` | `voucherNum` | `voucherNum` | 来源单据号 |
| `voucherDetailNum` | `voucherDetailNum` | `voucherDetailNum` | 来源单据行号 |
| `taxItems` | `taxItems` | `taxItems` | 税目 |
| `profit` | `profit` | `profit` | 盈利情况 |
| `voucherVersion` | `voucherVersion` | `voucherVersion` | 版本 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `optionalQuotationId` | `optionalQuotationId` | `optionalQuotationId` | 配置报价清单 |
| `nat_currency` | `nat_currency` | `natCurrency` | 本币 |
| `stockId` | `stockId` | `stockId` | 仓库 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `voucherId` | `voucherId` | `voucherId` | 来源单据ID |
| `voucherDetailId` | `voucherDetailId` | `voucherDetailId` | 来源单据行ID |

### 数值字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nat_tax_unit_price` | `nat_tax_unit_price` | `natTaxUnitPrice` | 本币含税成交单价 |
| `ori_tax_unit_price` | `ori_tax_unit_price` | `oriTaxUnitPrice` | 含税成交单价 |
| `ori_sum` | `ori_sum` | `oriSum` | 含税成交金额 |
| `nat_unit_price` | `nat_unit_price` | `natUnitPrice` | 本币无税成交单价 |
| `ori_unit_price` | `ori_unit_price` | `oriUnitPrice` | 无税成交单价 |
| `ori_money` | `ori_money` | `oriMoney` | 未税成交金额 |
| `exch_rate` | `exch_rate` | `exchRate` | 汇率 |
| `nat_sum` | `nat_sum` | `natSum` | 本币含税成交金额 |
| `nat_money` | `nat_money` | `natMoney` | 本币未税成交金额 |
| `base_ori_sum` | `base_ori_sum` | `baseOriSum` | 基价含税成交金额 |
| `base_ori_money` | `base_ori_money` | `baseOriMoney` | 基价未税成交金额 |
| `base_nat_sum` | `base_nat_sum` | `baseNatSum` | 基价本币含税成交金额 |
| `base_nat_money` | `base_nat_money` | `baseNatMoney` | 基价本币未税成交金额 |
| `taxRate` | `taxRate` | `taxRate` | 税率 |
| `taxAmount` | `taxAmount` | `taxAmount` | 税额 |
| `materialCost` | `materialCost` | `materialCost` | 材料成本 |
| `outsourcingProcessingFee` | `outsourcingProcessingFee` | `outsourcingProcessingFee` | 委外加工费 |
| `laborCost` | `laborCost` | `laborCost` | 人工费 |
| `manufacturingCost` | `manufacturingCost` | `manufacturingCost` | 制造费 |
| `totalCost` | `totalCost` | `totalCost` | 总成本 |
| `totalPrepaidExpenses` | `totalPrepaidExpenses` | `totalPrepaidExpenses` | 总待摊费用 |
| `totalCostAndExpenses` | `totalCostAndExpenses` | `totalCostAndExpenses` | 总成本与费用 |
| `estimatedGrossProfit` | `estimatedGrossProfit` | `estimatedGrossProfit` | 预估毛利 |
| `estimatedGrossProfitMargin` | `estimatedGrossProfitMargin` | `estimatedGrossProfitMargin` | 预估毛利率% |
| `priceQty` | `priceQty` | `priceQty` | 计价数量 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `voucher_character` | `voucher_character` | `voucherCharacter` | 配置报价清单关联单据特征 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `voucherGroupDetails` | 配置报价清单关联单据报价详情 |
| `` | `` | `voucherGroups` | 配置报价清单关联单据本币分组报价信息 |
