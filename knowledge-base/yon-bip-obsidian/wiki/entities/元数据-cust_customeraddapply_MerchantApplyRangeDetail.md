---
tags: [BIP, 元数据, 数据字典, cust.customeraddapply.MerchantApplyRangeDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户适用范围详情 (`cust.customeraddapply.MerchantApplyRangeDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_customeraddapply_merchantapply_rangedetail` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户适用范围详情 |
| 物理表 | `cust_customeraddapply_merchantapply_rangedetail` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CUST` |
| 直连字段 | 52 个 |
| 子表 | 0 个 |
| 关联引用 | 26 个 |

## 关联引用 (26个)

| 字段名 | 引用类型 |
|--------|---------|
| `layoff_id` | `` |
| `` | `` |
| `cSpecialManagementDep` | `` |
| `highSeas` | `` |
| `cSettlementMethod` | `` |
| `merchant_detail_character` | `` |
| `iShipmentMethodId` | `` |
| `iCustomerTypeId` | `` |
| `recent_follower` | `` |
| `clueId` | `` |
| `id` | `` |
| `sourceOfTheHighSeas` | `` |
| `cBelongMerchant` | `` |
| `cTransactionCurrency` | `` |
| `cProfessSalesman` | `` |
| `ytenant_id` | `` |
| `merchantApplyRangeId` | `` |
| `oCustomerArea_id` | `` |
| `oCustomerLevel_id` | `` |
| `apply_person` | `` |
| `cCollectionAgreement` | `ucfbasedoc.bd_receiveagreementref` |
| `iTaxRate` | `` |
| `cDeliveryWarehouse` | `` |
| `cBelongOrg` | `` |
| `cExchangeratetypeId` | `` |

## 继承接口 (5个, 15字段)

- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
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

> 共 52 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `searchCode` | `searchCode` | `searchcode` | 助记码 |
| `cyhtUserId` | `cyhtUserId` | `yhtUserId` | 友互通用户标识 |
| `cfreezinglink` | `cfreezinglink` | `freezingLink` | 冻结环节 |
| `orgdefaultaddress` | `orgdefaultaddress` | `orgDefaultAddress` | 组织默认地址 |
| `is_trade_customers` | `is_trade_customers` | `isTradeCustomers` | 是否交易客户 |
| `recent_follow_content` | `recent_follow_content` | `recentFollowContent` | 最近跟进内容 |
| `erpCode` | `erpCode` | `erpCode` | 商家编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `locker` | `locker` | `locker` | 锁定人 |

### 引用字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 客户ID |
| `merchantApplyRangeId` | `merchantApplyRangeId` | `merchantApplyRangeId` | 客户分配范围ID |
| `cBelongOrg` | `cBelongOrg` | `belongOrg` | 所属组织 |
| `cBelongMerchant` | `cBelongMerchant` | `belongMerchant` | 所属商家 |
| `cSpecialManagementDep` | `cSpecialManagementDep` | `specialManagementDep` | 专管部门 |
| `cProfessSalesman` | `cProfessSalesman` | `professSalesman` | 专管业务员 |
| `cTransactionCurrency` | `cTransactionCurrency` | `transactionCurrency` | 交易币种 |
| `iTaxRate` | `iTaxRate` | `taxRate` | 销项税率 |
| `cDeliveryWarehouse` | `cDeliveryWarehouse` | `deliveryWarehouse` | 发货仓库 |
| `cCollectionAgreement` | `cCollectionAgreement` | `collectionAgreement` | 收款协议 |
| `cSettlementMethod` | `cSettlementMethod` | `settlementMethod` | 结算方式 |
| `iShipmentMethodId` | `iShipmentMethodId` | `shipmentMethod` | 发运方式 |
| `oCustomerArea_id` | `oCustomerArea_id` | `customerArea` | 销售区域 |
| `oCustomerLevel_id` | `oCustomerLevel_id` | `customerLevel` | 客户级别 |
| `cExchangeratetypeId` | `cExchangeratetypeId` | `exchangeratetype` | 汇率类型 |
| `iCustomerTypeId` | `iCustomerTypeId` | `customerType` | 销售渠道 |
| `highSeas` | `highSeas` | `highSeas` | 所属公海 |
| `sourceOfTheHighSeas` | `sourceOfTheHighSeas` | `sourceOfTheHighSeas` | 来源公海 |
| `clueId` | `clueId` | `clue` | 来源线索 |
| `apply_person` | `apply_person` | `applyPerson` | 申领人 |
| `recent_follower` | `recent_follower` | `recentFollower` | 最近跟进人 |
| `layoff_id` | `layoff_id` | `layoffId` | 停用人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `lock_Date` | `lock_Date` | `lockDate` | 锁定日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bSignBack` | `bSignBack` | `signBack` | 需要签回 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cPayWay` | `cPayWay` | `payway` | 支付方式 |
| `bfrozenstate` | `bfrozenstate` | `frozenState` | 冻结状态 |
| `internationaltradeterms` | `internationaltradeterms` | `internationalTradeTerms` | 国际贸易条款 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCreditServiceDay` | `iCreditServiceDay` | `creditServiceDay` | 信用期限 |
| `apply_status` | `apply_status` | `applyStatus` | 申领状态 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `apply_time` | `apply_time` | `applyTime` | 申领时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `lock_time` | `lock_time` | `lockTime` | 锁定时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `merchant_detail_character` | `merchant_detail_character` | `merchantApplyRangeDetailCharacter` | 业务信息自定义项 |
