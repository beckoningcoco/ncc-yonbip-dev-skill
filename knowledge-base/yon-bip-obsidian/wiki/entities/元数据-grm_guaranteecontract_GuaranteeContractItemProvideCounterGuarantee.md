---
tags: [BIP, 元数据, 数据字典, grm.guaranteecontract.GuaranteeContractItemProvideCounterGuarantee]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 反担保(提供担保) (`grm.guaranteecontract.GuaranteeContractItemProvideCounterGuarantee`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`grm_guarantee_contract_item_provide_counter_guarantee` | domain：`yonbip-fi-ctmgrm` | 应用：`GRM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 反担保(提供担保) |
| 物理表 | `grm_guarantee_contract_item_provide_counter_guarantee` |
| 数据库 schema | `yonbip-fi-ctmgrm` |
| 所属应用 | `GRM` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `provideCounterCharacterDef` | `` |
| `accentity_guarantor` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `vendor_guarantor` | `yssupplier.aa_vendor` |
| `ytenant_id` | `` |
| `currency` | `bd_currencytenantreflist` |
| `customer_guarantor` | `productcenter.aa_merchantref` |
| `mainid` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `counter_guarantee_type` | `counter_guarantee_type` | `counterGuaranteeType` | 反担保类型 |
| `other_guarantor` | `other_guarantor` | `otherGuarantor` | 出质人/质押人/保证人 |
| `property_right_type_name` | `property_right_type_name` | `propertyRightTypeName` | 物权类别 |
| `property_right_code` | `property_right_code` | `propertyRightCode` | 物权编号 |
| `property_right_name` | `property_right_name` | `propertyRightName` | 物权名称 |
| `guarantee_debtor_type` | `guarantee_debtor_type` | `guaranteeDebtorType` | 反担保人类型 |
| `is_sync` | `is_sync` | `isSync` | 是否协同生成行数据 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 卡片主表关联标识 |
| `customer_guarantor` | `customer_guarantor` | `customerGuarantor` | 出质人/质押人/保证人id |
| `vendor_guarantor` | `vendor_guarantor` | `vendorGuarantor` | 出质人/质押人/保证人id |
| `accentity_guarantor` | `accentity_guarantor` | `accentityGuarantor` | 出质人/质押人/保证人id |
| `currency` | `currency` | `currency` | 币种id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `start_date` | `start_date` | `startDate` | 开始日期 |
| `end_date` | `end_date` | `endDate` | 到期日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 子表id |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mortgage_value` | `mortgage_value` | `mortgageValue` | 抵（质）押金额/保证金额 |
| `mortgageable_value` | `mortgageable_value` | `mortgageableValue` | 可抵（质）押价值 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `provideCounterCharacterDef` | `provideCounterCharacterDef` | `provideCounterCharacterDef` | 反担保(提供担保)自定义项 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
