---
tags: [BIP, 元数据, 数据字典, grm.guaranteecontract.GuaranteeContractItemGetCounterGuarantee]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 反担保(获得担保) (`grm.guaranteecontract.GuaranteeContractItemGetCounterGuarantee`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`grm_guarantee_contract_item_get_counter_guarantee` | domain：`yonbip-fi-ctmgrm` | 应用：`GRM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 反担保(获得担保) |
| 物理表 | `grm_guarantee_contract_item_get_counter_guarantee` |
| 数据库 schema | `yonbip-fi-ctmgrm` |
| 所属应用 | `GRM` |
| 直连字段 | 23 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `property_right` | `grm_propertyrightref` |
| `vendor_guarantee` | `` |
| `org_guarantor` | `bd_accbody` |
| `currency` | `bd_currencytenantreflist` |
| `customer_guarantee` | `` |
| `mainid` | `` |
| `getCounterCharacterDef` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `counter_guarantee_type` | `counter_guarantee_type` | `counterGuaranteeType` | 反担保类型 |
| `counter_debtor_type` | `counter_debtor_type` | `counterDebtorType` | 反担保人类型 |
| `is_sync` | `is_sync` | `isSync` | 是否协同生成行数据 |
| `property_right_code` | `property_right_code` | `propertyRightCode` | 物权编号 |
| `property_right_code_handss` | `property_right_code_handss` | `propertyRightCodeHandss` | 物权编号(手输) |
| `property_right_name` | `property_right_name` | `propertyRightName` | 物权名称 |
| `property_right_type_name` | `property_right_type_name` | `propertyRightTypeName` | 物权类别(手输) |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 卡片主表关联标识 |
| `org_guarantor` | `org_guarantor` | `orgGuarantor` | 出质人/质押人/保证人id |
| `property_right` | `property_right` | `propertyRight` | 物权id |
| `currency` | `currency` | `currency` | 币种id |
| `customer_guarantee` | `customer_guarantee` | `customerGuarantee` | 反担保人(客户) |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `vendor_guarantee` | `vendor_guarantee` | `vendorGuarantee` | 反担保人(供应商) |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `end_date` | `end_date` | `endDate` | 到期日期 |
| `start_date` | `start_date` | `startDate` | 开始日期 |

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
| `mortgageable_value` | `mortgageable_value` | `mortgageableValue` | 可抵押价值 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `getCounterCharacterDef` | `getCounterCharacterDef` | `getCounterCharacterDef` | 反担保(获得担保)自定义项 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
