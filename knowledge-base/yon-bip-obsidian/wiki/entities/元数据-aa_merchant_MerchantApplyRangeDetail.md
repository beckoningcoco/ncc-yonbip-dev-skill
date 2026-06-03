---
tags: [BIP, 元数据, 数据字典, aa.merchant.MerchantApplyRangeDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# (停用)客户适用范围详情 (`aa.merchant.MerchantApplyRangeDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`merchantapplyrangedetail` | domain：`productcenter` | 应用：`DPMCUS` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | (停用)客户适用范围详情 |
| 物理表 | `merchantapplyrangedetail` |
| 数据库 schema | `productcenter` |
| 所属应用 | `DPMCUS` |
| 直连字段 | 57 个 |
| 子表 | 0 个 |
| 关联引用 | 25 个 |

## 关联引用 (25个)

| 字段名 | 引用类型 |
|--------|---------|
| `layoff_id` | `` |
| `` | `` |
| `cSpecialManagementDep` | `ucf-org-center.bd_admindepttreeviewref` |
| `cSettlementMethod` | `productcenter.aa_settlemethodref` |
| `merchant_detail_character` | `` |
| `iShipmentMethodId` | `productcenter.aa_sendtranswayref` |
| `iCustomerTypeId` | `productcenter.aa_customerTyperef` |
| `recent_follower` | `` |
| `id` | `` |
| `tenant_id` | `` |
| `cBelongMerchant` | `productcenter.aa_adminorgqueryref` |
| `cTransactionCurrency` | `ucfbasedoc.bd_currencytenantref` |
| `cProfessSalesman` | `ucf-staff-center.bd_staff_ref` |
| `ytenant_id` | `` |
| `merchantApplyRangeId` | `productcenter.aa_adminorgqueryref` |
| `oCustomerArea_id` | `productcenter.aa_salearearef` |
| `oCustomerLevel_id` | `productcenter.aa_customerlevelref` |
| `apply_person` | `` |
| `cCollectionAgreement` | `ucfbasedoc.bd_receiveagreementref` |
| `iTaxRate` | `ucfbasedoc.bd_taxrate` |
| `cDeliveryWarehouse` | `productcenter.aa_warehouse` |
| `cBelongOrg` | `productcenter.aa_adminorgqueryref` |
| `cExchangeratetypeId` | `ucfbasedoc.bd_exchangeratetyperef` |

## 继承接口 (6个, 16字段)

- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
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
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 57 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `searchCode` | `searchCode` | `searchcode` | 助记码 |
| `is_trade_customers` | `is_trade_customers` | `isTradeCustomers` | 是否交易客户 |
| `orgdefaultaddress` | `orgdefaultaddress` | `orgDefaultAddress` | 组织默认地址 |
| `cfreezinglink` | `cfreezinglink` | `freezingLink` | 冻结环节 |
| `erpCode` | `erpCode` | `erpCode` | 商家编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `locker` | `locker` | `locker` | 锁定人 |
| `recent_follow_content` | `recent_follow_content` | `recentFollowContent` | 最近跟进内容 |
| `deleteLog` | `deleteLog` | `deleteLog` | 逻辑操作日志 |
| `cyhtUserId` | `cyhtUserId` | `yhtUserId` | 友互通用户标识 |

### 引用字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 客户id |
| `merchantApplyRangeId` | `merchantApplyRangeId` | `merchantApplyRangeId` | 主键 |
| `merchantApplyRangeId` | `merchantApplyRangeId` | `merchantApplyRangeExtId` | 客户分配范围扩展ID |
| `cBelongOrg` | `cBelongOrg` | `belongOrg` | 所属组织 |
| `cBelongMerchant` | `cBelongMerchant` | `belongMerchant` | 所属商家 |
| `oCustomerLevel_id` | `oCustomerLevel_id` | `customerLevel` | 客户级别 |
| `iCustomerTypeId` | `iCustomerTypeId` | `customerType` | 销售渠道 |
| `cDeliveryWarehouse` | `cDeliveryWarehouse` | `deliveryWarehouse` | 发货仓库 |
| `cTransactionCurrency` | `cTransactionCurrency` | `transactionCurrency` | 交易币种 |
| `cExchangeratetypeId` | `cExchangeratetypeId` | `exchangeratetype` | 汇率类型 |
| `iTaxRate` | `iTaxRate` | `taxRate` | 销项税率 |
| `cCollectionAgreement` | `cCollectionAgreement` | `collectionAgreement` | 收款协议 |
| `cSettlementMethod` | `cSettlementMethod` | `settlementMethod` | 结算方式 |
| `iShipmentMethodId` | `iShipmentMethodId` | `shipmentMethod` | 发运方式 |
| `oCustomerArea_id` | `oCustomerArea_id` | `customerArea` | 销售区域 |
| `cProfessSalesman` | `cProfessSalesman` | `professSalesman` | 专管业务员 |
| `cSpecialManagementDep` | `cSpecialManagementDep` | `specialManagementDep` | 专管部门 |
| `layoff_id` | `layoff_id` | `layoffId` | 停用人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `apply_person` | `apply_person` | `applyPerson` | 申领人 |
| `recent_follower` | `recent_follower` | `recentFollower` | 最近跟进人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `lock_Date` | `lock_Date` | `lockDate` | 锁定日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bSignBack` | `bSignBack` | `signBack` | 签收后开票 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCreditServiceDay` | `iCreditServiceDay` | `creditServiceDay` | 信用期限 |
| `cPriceMarking` | `cPriceMarking` | `priceMarking` | 价格标识 |
| `apply_status` | `apply_status` | `applyStatus` | 申领状态 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clueId` | `clueId` | `clue` | 来源线索 |
| `sourceOfTheHighSeas` | `sourceOfTheHighSeas` | `sourceOfTheHighSeas` | 来源公海 |
| `highSeas` | `highSeas` | `highSeas` | 所属公海 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cPayWay` | `cPayWay` | `payway` | 支付方式 |
| `bfrozenstate` | `bfrozenstate` | `frozenState` | 冻结状态 |
| `internationaltradeterms` | `internationaltradeterms` | `internationalTradeTerms` | 国际贸易条款 |
| `logicallyDeleteType` | `logicallyDeleteType` | `logicallyDeleteType` | 逻辑删除类型 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `merchant_detail_character` | `merchant_detail_character` | `merchantApplyRangeDetailCharacter` | 业务信息自定义项 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `lock_time` | `lock_time` | `lockTime` | 锁定时间 |
| `apply_time` | `apply_time` | `applyTime` | 申领时间 |
