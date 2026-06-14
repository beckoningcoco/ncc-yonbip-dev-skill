---
tags: [BIP, 元数据, 数据字典, aa.merchant.Merchant]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户档案 (`aa.merchant.Merchant`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`merchant` | domain：`productcenter` | 应用：`DPMCUS` | 业务对象ID：`82a351fe-54db-4478-87c5-2b8f965f9fec`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户档案 |
| 物理表 | `merchant` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `DPMCUS` |
| 直连字段 | 132 个 |
| 子表 | 22 个 |
| 关联引用 | 52 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `merchantRole` | `aa.merchant.MerchantRoleInfo` | composition |
| `invoicingCustomerss` | `aa.merchant.InvoicingCustomers` | composition |
| `merchantAppliedDetailExt` | `aa.merchant.MerchantApplyRangeDetail` | composition |
| `aaaList` | `aa.merchant.aaa` | composition |
| `merchantBusinessRoleTime` | `aa.merchant.MerchantBusinessRoleTime` | composition |
| `merchantsManager` | `aa.merchant.MerchantsManager` | composition |
| `principals` | `aa.merchant.Principal` | composition |
| `merchantAgentFinancialInfos` | `aa.merchant.AgentFinancial` | composition |
| `merchantAgentInvoiceInfos` | `aa.merchant.AgentInvoice` | composition |
| `merchantDetails` | `aa.merchant.MerchantDetail` | composition |
| `merchantApplyRangeExts` | `aa.merchant.MerchantApplyRangeExt` | composition |
| `merchantDefine` | `aa.merchant.MerchantDefine` | composition |
| `merchantQualificationDocuments` | `aa.merchant.MerchantQualificationDocument` | composition |
| `customerDefine` | `aa.merchant.CustomerDefine` | composition |
| `merchantApplyRanges` | `aa.merchant.MerchantApplyRange` | composition |
| `newPageList` | `aa.merchant.newPage` | composition |
| `merchantContacterInfos` | `aa.merchant.Contacter` | composition |
| `merchantAddressInfos` | `aa.merchant.AddressInfo` | composition |
| `merchantAttachments` | `aa.merchant.MerchantAttachment` | composition |
| `merchantAppliedDetail` | `aa.merchant.MerchantApplyRangeDetail` | composition |
| `customerAreas` | `aa.merchant.CustomerArea` | composition |
| `merchantStaff` | `aa.merchant.MerchantStaff` | composition |

## 关联引用 (52个)

| 字段名 | 引用类型 |
|--------|---------|
| `cCountry` | `ucfbasedoc.bd_countryref` |
| `` | `` |
| `cSuppliers` | `yssupplier.aa_vendor` |
| `ochannCustomerIndustry_id` | `productcenter.aa_customertraderef` |
| `cLanguageId` | `ucfbasedoc.bd_languageref` |
| `cParentManageOrg` | `productcenter.aa_adminorgrangeref` |
| `ochanncprofesssalesman` | `ucf-staff-center.bd_staff_ref` |
| `oCustomerClass_id` | `productcenter.aa_custcategoryref` |
| `ochannCustomerArea_id` | `productcenter.aa_salearearef` |
| `orgId` | `productcenter.aa_financeorgref` |
| `tenant_id` | `` |
| `oCustomerIndustry_id` | `productcenter.aa_customertraderef` |
| `cTimeZoneId` | `ucfbasedoc.bd_timezoneref` |
| `oCustomerArea_id` | `productcenter.aa_salearearef` |
| `development_partner` | `productcenter.aa_merchantisolationref` |
| `oChannCustomerClass_id` | `productcenter.aa_custcategoryref` |
| `transType` | `transtype.bd_billtyperef` |
| `iParentCustomer` | `productcenter.aa_merchantref` |
| `createMerchant` | `productcenter.aa_adminorgref` |
| `businessPartner` | `productcenter.base_businesspartnerref` |
| `oChannCustomerLevel_id` | `productcenter.aa_customerlevelref` |
| `createOrg` | `ucf-org-center.org_pure_table_ref` |
| `cInvoicingCustomers` | `productcenter.aa_merchantref` |
| `cEnterNatureId` | `ucfbasedoc.bd_enterprisenatureref` |
| `merchant_character` | `` |
| `ochanncspecialmanagementdep` | `ucf-org-center.admin_dept_tree_ref` |
| `ytenant_id` | `` |
| `oCustomerLevel_id` | `productcenter.aa_customerlevelref` |

## 继承接口 (6个, 15字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
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
- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 132 个直连字段

### 文本字段 (51个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCode` | `cCode` | `code` | 客户编码 |
| `erpCode` | `erpCode` | `erpCode` | 外部编码 |
| `new_time_zone_id` | `new_time_zone_id` | `newTimeZone` | 时区 |
| `path` | `path` | `path` | 上级客户路径 |
| `is_financial_synergy` | `is_financial_synergy` | `isFinancialSynergy` | 是否财务协同 |
| `largeText1` | `largeText1` | `largeText1` | 大文本域1 |
| `largeText2` | `largeText2` | `largeText2` | 大文本域2 |
| `largeText3` | `largeText3` | `largeText3` | 大文本域3 |
| `largeText4` | `largeText4` | `largeText4` | 大文本域4 |
| `largeText5` | `largeText5` | `largeText5` | 大文本域5 |
| `merchant_logo` | `merchant_logo` | `merchantLogo` | LOGO |
| `cEnterpriseName` | `cEnterpriseName` | `enterpriseName` | 企业名称 |
| `cCreditCode` | `cCreditCode` | `creditCode` | 证照号码 |
| `leaderName` | `leaderName` | `leaderName` | 法人代表 |
| `leaderNameIdNo` | `leaderNameIdNo` | `leaderNameIdNo` | 法人代表身份证号 |
| `business_license` | `business_license` | `businessLicenseNew` | 营业执照 |
| `cBusinessLicenseNo` | `cBusinessLicenseNo` | `businessLicenseNo` | 经营许可证号 |
| `cOrgName` | `cOrgName` | `orgName` | 组织名称 |
| `cPersonCharge` | `cPersonCharge` | `personCharge` | 负责人 |
| `cPersonChargeIdNo` | `cPersonChargeIdNo` | `personChargeIdNo` | 负责人身份证号 |
| `org_certificate` | `org_certificate` | `orgCertificate` | 组织相关证件 |
| `cPersonName` | `cPersonName` | `personName` | 姓名 |
| `front_id_card` | `front_id_card` | `frontIdCard` | 身份证件正面 |
| `back_id_card` | `back_id_card` | `backIdCard` | 身份证件反面 |
| `cRegionCode` | `cRegionCode` | `regionCode` | 注册地区编码 |
| `contactName` | `contactName` | `contactName` | 联系人 |
| `contactTel` | `contactTel` | `contactTel` | 联系电话 |
| `cEmail` | `cEmail` | `email` | 邮箱 |
| `fax` | `fax` | `fax` | 传真 |
| `cCurrencyCode` | `cCurrencyCode` | `currencyCode` | 注册资金币种 |
| `cMoney` | `cMoney` | `money` | 注册资金 |
| `cYearMoney` | `cYearMoney` | `yearMoney` | 年营业额 |
| `cWebsite` | `cWebsite` | `website` | 网址 |
| `cWid` | `cWid` | `wid` | 微信公众号 |
| `cPostCode` | `cPostCode` | `postCode` | 邮编 |
| `certificate` | `certificate` | `certificate` | 证照证书 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源 |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `is_exist_potential` | `is_exist_potential` | `isExistPotential` | 是否存在潜客 |
| `cYhtTenant` | `cYhtTenant` | `yhttenant` | 租户(废弃) |
| `logo` | `logo` | `logo` | logo(废弃) |
| `idNo` | `idNo` | `idNo` | 身份证号(废弃) |
| `cBusinessLicense` | `cBusinessLicense` | `businessLicense` | 营业执照(废弃) |
| `cOrgIdNo` | `cOrgIdNo` | `orgIdNo` | 组织相关证件(废弃) |
| `cFrontIdNo` | `cFrontIdNo` | `frontIdNo` | 法人证件正面(废弃) |
| `cBackIdNo` | `cBackIdNo` | `backIdNo` | 法人证件反面(废弃) |
| `cRegion` | `cRegion` | `region` | 所在地区(废弃) |
| `cRegAddress` | `cRegAddress` | `regAddress` | 注册地址(废弃) |
| `cSearchAddress` | `cSearchAddress` | `searchAddress` | 搜索地址(废弃) |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (29个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `createOrg` | `createOrg` | `createOrg` | 管理组织 |
| `createMerchant` | `createMerchant` | `createMerchant` | 创建商家 |
| `transType` | `transType` | `transType` | 客户类型 |
| `businessPartner` | `businessPartner` | `businessPartner` | 业务伙伴 |
| `cCountry` | `cCountry` | `country` | 国家/地区 |
| `cLanguageId` | `cLanguageId` | `language` | 语言 |
| `iParentCustomer` | `iParentCustomer` | `parentCustomer` | 上级客户 |
| `cSuppliers` | `cSuppliers` | `suppliers` | 对应供应商 |
| `orgId` | `orgId` | `internalOrgId` | 内部组织 |
| `oCustomerIndustry_id` | `oCustomerIndustry_id` | `customerIndustry` | 客户行业 |
| `oCustomerClass_id` | `oCustomerClass_id` | `customerClass` | 客户分类 |
| `development_partner` | `development_partner` | `developmentPartner` | 发展伙伴 |
| `cParentManageOrg` | `cParentManageOrg` | `parentManageOrg` | 上级发展组织 |
| `cEnterNatureId` | `cEnterNatureId` | `enterNature` | 企业性质 |
| `oCustomerLevel_id` | `oCustomerLevel_id` | `customerLevel` | 客户级别 |
| `oCustomerArea_id` | `oCustomerArea_id` | `customerArea` | 客户区域 |
| `cInvoicingCustomers` | `cInvoicingCustomers` | `invoicingCustomers` | 开票客户 |
| `ochanncprofesssalesman` | `ochanncprofesssalesman` | `channProfessSalesman` | 渠道专管业务员 |
| `ochanncspecialmanagementdep` | `ochanncspecialmanagementdep` | `channSpecialManagementDep` | 渠道专管部门 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |
| `createOrg` | `createOrg` | `orgId` | 管理组织(废弃) |
| `cTimeZoneId` | `cTimeZoneId` | `timeZone` | 时区(废弃) |
| `oChannCustomerClass_id` | `oChannCustomerClass_id` | `channCustomerClass` | 渠道客户分类(废弃) |
| `ochannCustomerIndustry_id` | `ochannCustomerIndustry_id` | `channCustomerIndustry` | 渠道客户行业(废弃) |
| `oChannCustomerLevel_id` | `oChannCustomerLevel_id` | `channCustomerLevel` | 渠道客户级别(废弃) |
| `ochannCustomerArea_id` | `ochannCustomerArea_id` | `channCustomerArea` | 渠道客户区域(废弃) |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `retailInvestors` | `retailInvestors` | `retailInvestors` | 是否散户 |
| `internalOrg` | `internalOrg` | `internalOrg` | 是否内部组织 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |
| `max_channel_level` | `max_channel_level` | `maxChannelLevel` | 最高渠道层级 |
| `mini_channel_level` | `mini_channel_level` | `miniChannelLevel` | 最低渠道层级 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `cPeopleNum` | `cPeopleNum` | `peopleNum` | 员工人数 |
| `iChannelTypeId` | `iChannelTypeId` | `channelType` | 渠道类型(废弃) |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iLNG` | `iLNG` | `longitude` | 经度 |
| `iLAT` | `iLAT` | `latitude` | 纬度 |

### multiLanguage (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cName` | `cName` | `name` | 客户名称 |
| `shortName` | `shortName` | `shortname` | 客户简称 |
| `cAddress` | `cAddress` | `address` | 详细地址 |
| `cScope` | `cScope` | `scope` | 经营范围 |

### other (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iTaxPayingCate` | `iTaxPayingCate` | `taxPayingCategories` | 纳税类别 |
| `iVerfyMark` | `iVerfyMark` | `verfyMark` | 核实状态 |
| `enterpriseNature` | `enterpriseNature` | `enterpriseNature` | 企业类型 |
| `licensetype` | `licensetype` | `licenseType` | 证照类型 |
| `cScopeModel` | `cScopeModel` | `scopeModel` | 经营模式 |
| `iMerchantType` | `iMerchantType` | `merchantType` | 客户类别 |
| `iCreatorType` | `iCreatorType` | `creatorType` | 创建者类型 |
| `channelCertificationStatus` | `channelCertificationStatus` | `channelCertificationStatus` | 渠道认证状态 |
| `` | `` | `aaaList` |  |
| `` | `` | `customerAreas` | 销售区域 |
| `` | `` | `customerDefine` | 客户(自定义项)表(废弃) |
| `` | `` | `invoicingCustomerss` | 开票客户 |
| `` | `` | `merchantAddressInfos` | 地址信息 |
| `` | `` | `merchantAgentFinancialInfos` | 银行信息 |
| `` | `` | `merchantAgentInvoiceInfos` | 发票信息 |
| `` | `` | `merchantAppliedDetail` | (停用)客户适用范围详情 |
| `` | `` | `merchantAppliedDetailExt` | (停用)客户适用范围详情 |
| `` | `` | `merchantApplyRangeExts` | 客户分配关系(CRM) |
| `` | `` | `merchantApplyRanges` | 客户适用范围 |
| `` | `` | `merchantAttachments` | 证照证书附件 |
| `` | `` | `merchantBusinessRoleTime` | 业务角色时间 |
| `` | `` | `merchantContacterInfos` | 联系人信息 |
| `` | `` | `merchantDefine` | 客户档案自定义项(废弃) |
| `` | `` | `merchantDetails` | 客户适用范围组详情 |
| `` | `` | `merchantQualificationDocuments` | 客户资质文件管理 |
| `` | `` | `merchantRole` | 客户角色信息 |
| `` | `` | `merchantStaff` | 客户员工 |
| `` | `` | `merchantsManager` | 客户管理员 |
| `` | `` | `newPageList` |  |
| `` | `` | `principals` | 负责人 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `merchant_character` | `merchant_character` | `merchantCharacter` | 基本信息自定义项 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cbusinessterm` | `cbusinessterm` | `businessterm` | 营业期限至 |
| `cBuildTime` | `cBuildTime` | `buildTime` | 成立时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
