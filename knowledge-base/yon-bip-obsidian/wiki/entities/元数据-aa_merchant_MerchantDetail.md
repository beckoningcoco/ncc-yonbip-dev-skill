---
tags: [BIP, 元数据, 数据字典, aa.merchant.MerchantDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户适用范围组详情 (`aa.merchant.MerchantDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`merchant_detail` | domain：`productcenter` | 应用：`DPMCUS` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户适用范围组详情 |
| 物理表 | `merchant_detail` |
| 数据库 schema | `productcenter` |
| 所属应用 | `DPMCUS` |
| 直连字段 | 44 个 |
| 子表 | 1 个 |
| 关联引用 | 20 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `merchantDetailForCrm` | `aa.merchant.MerchantDetailForCRM` | composition |

## 关联引用 (20个)

| 字段名 | 引用类型 |
|--------|---------|
| `merchant_type_id` | `productcenter.aa_customerTyperef` |
| `shipment_method_id` | `productcenter.aa_sendtranswayref` |
| `ytenant_id` | `` |
| `belong_org_id` | `productcenter.aa_adminorgqueryref` |
| `layoff_id` | `` |
| `merchant_apply_range_group_id` | `` |
| `belong_merchant_id` | `productcenter.aa_adminorgqueryref` |
| `delivery_warehouse_id` | `productcenter.aa_warehouse` |
| `` | `` |
| `merchant_detail_character` | `` |
| `merchant_level_id` | `productcenter.aa_customerlevelref` |
| `exchange_rate_type_Id` | `ucfbasedoc.bd_exchangeratetyperef` |
| `merchant_id` | `` |
| `settlement_method_id` | `productcenter.aa_settlemethodref` |
| `collection_agreement_id` | `ucfbasedoc.bd_receiveagreementref` |
| `tax_rate_id` | `yonbip-fi-taxpubdoc.RefTable_839443ba26` |
| `transaction_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `tenant_id` | `` |

## 继承接口 (6个, 16字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **锁定信息** (`base.itf.ILock`)
  - `lock_Date` → `lock_Date`
  - `locker` → `locker`
  - `lock_time` → `lock_time`

## 字段列表（按类型分组）

> 共 44 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `erpCode` | `erpCode` | `erpCode` | ERP编码 |
| `search_code` | `search_code` | `searchCode` | 助记码 |
| `is_trade_customers` | `is_trade_customers` | `isTradeCustomers` | 是否交易客户 |
| `org_default_address` | `org_default_address` | `orgDefaultAddress` | 组织默认地址 |
| `freeze_link` | `freeze_link` | `freezeLink` | 冻结环节 |
| `locker` | `locker` | `locker` | 锁定人 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `merchant_id` | `merchant_id` | `merchantId` | 客户 |
| `belong_org_id` | `belong_org_id` | `belongOrgId` | 使用组织 |
| `belong_merchant_id` | `belong_merchant_id` | `belongMerchantId` | 所属商家 |
| `merchant_level_id` | `merchant_level_id` | `merchantLevelId` | 客户级别 |
| `merchant_type_id` | `merchant_type_id` | `merchantTypeId` | 销售渠道 |
| `delivery_warehouse_id` | `delivery_warehouse_id` | `deliveryWarehouseId` | 发货仓库 |
| `transaction_currency_id` | `transaction_currency_id` | `transactionCurrencyId` | 交易币种 |
| `exchange_rate_type_Id` | `exchange_rate_type_Id` | `exchangeRateTypeId` | 汇率类型 |
| `tax_rate_id` | `tax_rate_id` | `taxRateId` | 销项税率 |
| `collection_agreement_id` | `collection_agreement_id` | `collectionAgreementId` | 收款协议 |
| `settlement_method_id` | `settlement_method_id` | `settlementMethodId` | 结算方式 |
| `shipment_method_id` | `shipment_method_id` | `shipmentMethodId` | 发运方式 |
| `layoff_id` | `layoff_id` | `layoffId` | 停用人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `merchant_apply_range_group_id` | `merchant_apply_range_group_id` | `merchantApplyRangeGroupId` | 客户适用范围组(废弃) |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `lock_Date` | `lock_Date` | `lockDate` | 锁定日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |
| `is_creator` | `is_creator` | `isCreator` | 是否为管理组织创建 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `credit_service_day_id` | `credit_service_day_id` | `creditServiceDayId` | 信用期限 |
| `cPriceMarking` | `cPriceMarking` | `priceMarking` | 价格标识 |
| `sign_back` | `sign_back` | `signBack` | 需要签回 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pay_way` | `pay_way` | `payWay` | 支付方式 |
| `frozen_state` | `frozen_state` | `frozenState` | 冻结状态 |
| `` | `` | `merchantDetailForCrm` | 客户适用范围组详情(CRM) |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `merchant_detail_character` | `merchant_detail_character` | `merchantApplyRangeDetailCharacter` | 客户业务信息自定义项 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `lock_time` | `lock_time` | `lockTime` | 锁定时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
