---
tags: [BIP, 元数据, 数据字典, base.businesspartner.BusinessPartner]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务伙伴 (`base.businesspartner.BusinessPartner`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`base_businesspartner` | domain：`productcenter` | 应用：`DPMBP` | 业务对象ID：`5ca8a7b7-2027-4866-b29c-9e44f4611b0e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务伙伴 |
| 物理表 | `base_businesspartner` |
| 数据库 schema | `productcenter` |
| 所属应用 | `DPMBP` |
| 直连字段 | 53 个 |
| 子表 | 5 个 |
| 关联引用 | 17 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `partnerCapitalComparisons` | `base.businesspartner.PartnerCapitalComparison` | composition |
| `partnerBankDatas` | `base.businesspartner.BankData` | composition |
| `partnerVendorComparisons` | `base.businesspartner.PartnerVendorComparison` | composition |
| `partnerMerchantComparisons` | `base.businesspartner.PartnerMerchantComparison` | composition |
| `partnerRoleClasses` | `base.businesspartner.RoleClass` | composition |

## 关联引用 (17个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `ucfbasedoc.bd_countryref` |
| `parent_id` | `productcenter.base_businesspartnerref` |
| `` | `` |
| `ytenant_id` | `` |
| `timeZone` | `ucfbasedoc.bd_timezoneref` |
| `language` | `ucfbasedoc.bd_languageref` |
| `business_partner_character_def` | `` |
| `org_group_id` | `` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `internal_org_Id` | `` |
| `tenant_id` | `` |

## 继承接口 (6个, 13字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 53 个直连字段

### 文本字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 编码 |
| `erpCode` | `erpCode` | `erpCode` | 外部编码 |
| `searchcode` | `searchcode` | `searchcode` | 助记码 |
| `new_time_zone_id` | `new_time_zone_id` | `newTimeZone` | 时区(夏令时) |
| `creditCode` | `creditCode` | `creditCode` | 证照号码 |
| `legalPerson` | `legalPerson` | `legalPerson` | 法人/负责人 |
| `legalPersonIdNo` | `legalPersonIdNo` | `legalPersonIdNo` | 法人/负责人身份证号 |
| `mobile` | `mobile` | `mobile` | 手机号 |
| `money` | `money` | `money` | 注册资金(万元) |
| `regionId` | `regionId` | `regionId` | 注册地区 |
| `regAddress` | `regAddress` | `regAddress` | 注册地址 |
| `contactName` | `contactName` | `contactName` | 联系人 |
| `contactTel` | `contactTel` | `contactTel` | 联系电话 |
| `fax` | `fax` | `fax` | 传真 |
| `email` | `email` | `email` | 邮箱 |
| `postalCode` | `postalCode` | `postalCode` | 邮编 |
| `website` | `website` | `website` | 网址 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `parent_id` | `parent_id` | `parent` | 上级伙伴 |
| `country` | `country` | `country` | 国家/地区 |
| `language` | `language` | `language` | 语言 |
| `internal_org_Id` | `internal_org_Id` | `internalOrgId` | 内部组织 |
| `currency` | `currency` | `currency` | 注册资金币种 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |
| `timeZone` | `timeZone` | `timeZone` | 时区(废弃) |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `org_group_id` | `org_group_id` | `orgGroupId` | 组织组 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `financial_synergy_flag` | `financial_synergy_flag` | `financialSynergyFlag` | 是否财务协同 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 删除状态 |

### other (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `partnerRoleClasses` | 角色类别 |
| `partnerType` | `partnerType` | `partnerType` | 伙伴类型 |
| `status` | `status` | `status` | 启用状态 |
| `licenseType` | `licenseType` | `licenseType` | 证照类型 |
| `` | `` | `partnerCapitalComparisons` | 业务伙伴资金业务对象对照 |
| `` | `` | `partnerVendorComparisons` | 业务伙伴供应商对照 |
| `` | `` | `partnerMerchantComparisons` | 业务伙伴客户对照 |
| `` | `` | `partnerBankDatas` | 银行信息(废弃) |

### multiLanguage (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `shortname` | `shortname` | `shortname` | 简称 |
| `comment` | `comment` | `comment` | 备注 |
| `scope` | `scope` | `scope` | 经营范围 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `business_partner_character_def` | `business_partner_character_def` | `businessPartnerCharacterDef` | 业务伙伴自定义项 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `buildDate` | `buildDate` | `buildDate` | 成立日期 |
| `businessterm` | `businessterm` | `businessterm` | 营业期限至 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
