---
tags: [BIP, 元数据, 数据字典, aa.vendor.VendorExtend]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 供应商业务属性(管理组织) (`aa.vendor.VendorExtend`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_vendorextend_new` | domain：`yssupplier` | 应用：`DPMSPL` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商业务属性(管理组织) |
| 物理表 | `aa_vendorextend_new` |
| domain/服务域 | `yssupplier` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `DPMSPL` |
| 直连字段 | 76 个 |
| 子表 | 0 个 |
| 关联引用 | 33 个 |

## 关联引用 (33个)

| 字段名 | 引用类型 |
|--------|---------|
| `lifecycleStatus` | `yssupplier.aa_supplyabilitylist_business_ref` |
| `cooperationLevel` | `yssupplier.aa_supplyabilitylist_cooperation_ref` |
| `iSettleMethodId` | `yssupplier.aa_settlemethodref` |
| `internationalTradTerms` | `` |
| `` | `` |
| `accountingStaff` | `` |
| `paymentMethod2` | `` |
| `internationalTradTerms2` | `` |
| `paymentMethod5` | `` |
| `paymentMethod4` | `` |
| `iVendorId` | `` |
| `paymentMethod3` | `` |
| `iShipregionId` | `productcenter.base_shipregionref` |
| `iVendorOrgId` | `aa_adminorgrangeref` |
| `iCurrencyId` | `ucfbasedoc.bd_currencytenantref` |
| `iInvoiceVendorId` | `yssupplier.aa_vendorCreatorref` |
| `iPaymentAgreementId` | `ucfbasedoc.bd_payagreementref` |
| `iDepartmentId` | `ucf-org-center.bd_dept_list_ref` |
| `paymentTerms` | `` |
| `tenant_id` | `` |
| `iDeliveryVendorId` | `yssupplier.aa_vendorCreatorref` |
| `cBelongMerchant` | `productcenter.aa_merchantinorganizationref` |
| `transactionCurrency` | `` |
| `org` | `aa_adminorgrangeref` |
| `ytenant_id` | `` |
| `iShipViaId` | `yssupplier.aa_sendtranswayref` |
| `vendorExtendCharacterDefine` | `` |
| `iPersonId` | `ucf-staff-center.bd_staff_ref` |
| `cBelongOrg` | `aa_adminorgrangeref` |
| `paymentMethod` | `` |
| `cExchangeratetypeId` | `ucfbasedoc.bd_exchangeratetyperef` |
| `iTaxItem` | `yonbip-fi-taxpubdoc.RefTable_839443ba26` |

## 继承接口 (5个, 13字段)

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
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 76 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cHelpCode` | `cHelpCode` | `helpcode` | 供应商助记码 |
| `blackReason` | `blackReason` | `blackReason` | 加入黑名单原因 |
| `price_tag` | `price_tag` | `priceTag` | 价格标识 |
| `cCurrencyName` | `cCurrencyName` | `currencyname` | 交易币种名称 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `eva_ability_name` | `eva_ability_name` | `evaAbilityName` | 评价等级体系名称 |
| `ability_detial_name` | `ability_detial_name` | `abilityDetialName` | 评价等级名称 |
| `eva_source_Billname` | `eva_source_Billname` | `evaSourceBillname` | 评价来源名称 |
| `freeze_step` | `freeze_step` | `freezeStep` | 冻结环节 |
| `purchaseInterfaceFeedback` | `purchaseInterfaceFeedback` | `purchaseInterfaceFeedback` | 采购接口反馈 |
| `erpCode` | `erpCode` | `erpCode` | 商家编码 |
| `customerInterfaceFeedback` | `customerInterfaceFeedback` | `customerInterfaceFeedback` | 客商接口反馈 |

### 引用字段 (32个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cBelongOrg` | `cBelongOrg` | `belongOrg` | 所属组织 |
| `iVendorId` | `iVendorId` | `vendor` | 供应商档案主键 |
| `iInvoiceVendorId` | `iInvoiceVendorId` | `invoicevendor` | 开票供应商 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `lifecycleStatus` | `lifecycleStatus` | `lifecycleStatus` | 生命周期状态 |
| `cooperationLevel` | `cooperationLevel` | `cooperationLevel` | 合作等级 |
| `org` | `org` | `org` | 使用组织 |
| `iTaxItem` | `iTaxItem` | `taxitems` | 税目税率主键 |
| `iPaymentAgreementId` | `iPaymentAgreementId` | `paymentagreement` | 付款协议 |
| `paymentTerms` | `paymentTerms` | `paymentTerms` | 默认付款条件(供应商) |
| `cExchangeratetypeId` | `cExchangeratetypeId` | `exchangeratetype` | 汇率类型 |
| `iSettleMethodId` | `iSettleMethodId` | `settlemethod` | 结算方式 |
| `iCurrencyId` | `iCurrencyId` | `currency` | 交易币种 |
| `transactionCurrency` | `transactionCurrency` | `transactionCurrency` | 默认交易货币 |
| `iDepartmentId` | `iDepartmentId` | `department` | 专管部门 |
| `iPersonId` | `iPersonId` | `person` | 专管业务员 |
| `accountingStaff` | `accountingStaff` | `accountingStaff` | 会计职员 |
| `iShipViaId` | `iShipViaId` | `shipvia` | 发运方式 |
| `iDeliveryVendorId` | `iDeliveryVendorId` | `deliveryvendor` | 发货供应商 |
| `iShipregionId` | `iShipregionId` | `shipregion` | 运输区域 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `internationalTradTerms` | `internationalTradTerms` | `internationalTradTerms` | 默认国际贸易条件 |
| `internationalTradTerms2` | `internationalTradTerms2` | `internationalTradTerms2` | 默认国际贸易条件2 |
| `paymentMethod` | `paymentMethod` | `paymentMethod` | 默认支付方式 |
| `paymentMethod2` | `paymentMethod2` | `paymentMethod2` | 默认支付方式2 |
| `paymentMethod3` | `paymentMethod3` | `paymentMethod3` | 默认支付方式3 |
| `paymentMethod4` | `paymentMethod4` | `paymentMethod4` | 默认支付方式4 |
| `paymentMethod5` | `paymentMethod5` | `paymentMethod5` | 默认支付方式5 |
| `cBelongMerchant` | `cBelongMerchant` | `belongMerchant` | 所属商家 |
| `iVendorOrgId` | `iVendorOrgId` | `vendororg` | 供应商适用范围表主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `eva_update_date` | `eva_update_date` | `evaUpdateDate` | 评价结果更新时间 |

### 布尔字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `financial_synergy` | `financial_synergy` | `financialSynergy` | 财务协同 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |
| `ability_status` | `ability_status` | `abilityStatus` | 是否合格 |
| `purchaseFreezeMark` | `purchaseFreezeMark` | `purchaseFreezeMark` | 采购冻结标识 |
| `purchaseIsTransfer` | `purchaseIsTransfer` | `purchaseIsTransfer` | 采购是否传输 |
| `receiptInvoiceVerification` | `receiptInvoiceVerification` | `receiptInvoiceVerification` | 基于收货的发票校验 |
| `serviceBillingVerification` | `serviceBillingVerification` | `serviceBillingVerification` | 基于服务的开票校验 |
| `customerFreezingSign` | `customerFreezingSign` | `customerFreezingSign` | 客商冻结标识 |
| `customerIsTransfer` | `customerIsTransfer` | `customerIsTransfer` | 客商是否传输 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `invoice_biz_type` | `invoice_biz_type` | `invoiceBizType` | 开票方式 |
| `eva_source_type` | `eva_source_type` | `evaSourceType` | 评价类型 |
| `cAccessStatus` | `cAccessStatus` | `accessstatus` | 供应商合作状态 |
| `bFreezeStatus` | `bFreezeStatus` | `freezestatus` | 风险状态 |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 供应商业务属性主键 |
| `iCreditServiceDay` | `iCreditServiceDay` | `creditServiceDay` | 账期天数(原信用期限) |
| `eva_ability_id` | `eva_ability_id` | `evaAbility` | 评价等级体系ID |
| `ability_detial_id` | `ability_detial_id` | `abilityDetial` | 评价等级ID |
| `eva_source_billid` | `eva_source_billid` | `evaSourceBillid` | 评价来源 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fTaxRate` | `fTaxRate` | `taxrate` | 进项税率 |
| `eva_score` | `eva_score` | `evaScore` | 评价得分 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cSimpleName` | `cSimpleName` | `simplename` | 供应商简称 |
| `cRemark` | `cRemark` | `remark` | 备注 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vendorExtendCharacterDefine` | `vendorExtendCharacterDefine` | `vendorExtendCharacterDefine` | 供应商业务信息特征自定义项 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `blackTime` | `blackTime` | `blackTime` | 加入黑名单时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
