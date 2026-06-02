---
tags: [BIP, 元数据, 数据字典, aa, aa.merchant.Merchant]
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

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `merchant` | 应用: `DPMCUS` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户档案 |
| 物理表 | `merchant` |
| 应用 | `DPMCUS` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `cCode` | |

## 部署信息

- 部署时间: 2026-05-22 23:00:20:000
- 安装来源: `/app/ugoods/upc/src/upc-server/scripts/db/patch/mongodb/V7_R0_2507/0002_customer/0010_iuap_common/DML/0270_iuap_metadata/20260515-itr/202603241821_metadata_aa-merchant_delta.zip`

## 术语标记

`isBusinessLog`, `isAssigned`, `isExtend`, `data_auth`, `isMultiCodeRule`, `MasterData`, `report`, `doc`, `DirectConnection`, `isUseCondition`

## 依赖接口（6 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| ITenant (`ITenant`) | `base.itf.ITenant` | 73 | 1 |
| IAuto编码 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| IErp编码 (`IErpCode`) | `base.itf.IErpCode` | 73 | 1 |
| ISocialMcType(类型) (`ISocialMcType`) | `bd.social.ISocialMcType` | 977 | 3 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（132 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` | false | true |
| 2 | `createOrg` | reateOrg | `createOrg` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` | false | true |
| 3 | `createMerchant` | reateMerchant | `createMerchant` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` | false | true |
| 4 | `transType` | transType(类型) | `transType` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` | false | true |
| 5 | `code` | 编码 | `cCode` | String | `text` | true | false |
| 6 | `name` | 名称 | `cName` | String | `multiLanguage` | true | false |
| 7 | `erpCode` | erp编码 | `erpCode` | String | `text` |  | true |
| 8 | `shortname` | shortname | `shortName` | String | `multiLanguage` | false | true |
| 9 | `businessPartner` | businessPartner | `businessPartner` | c1627369-6457-4828-883d-756b79bd0f46 | `quote` | false | true |
| 10 | `country` | ountry | `cCountry` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` | false | true |
| 11 | `language` | language | `cLanguageId` | a014aa1b-1f14-4d31-88fb-dcce538d9973 | `quote` | false | true |
| 12 | `newTimeZone` | newTimeZone | `new_time_zone_id` | String | `text` | false | true |
| 13 | `parentCustomer` | parentCustomer | `iParentCustomer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` | false | true |
| 14 | `path` | path | `path` | String | `text` | false | true |
| 15 | `suppliers` | suppliers | `cSuppliers` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` | false | true |
| 16 | `retailInvestors` | retailInvestors | `retailInvestors` | Boolean | `switch` | false | true |
| 17 | `internalOrg` | nternalOrg(ID) | `internalOrg` | Boolean | `switch` | false | true |
| 18 | `internalOrgId` | internalOrgId | `orgId` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` | false |  |
| 19 | `taxPayingCategories` | taxPayingCategories | `iTaxPayingCate` | TaxPayingCate | `` | false | true |
| 20 | `customerIndustry` | ustomerIndustry | `oCustomerIndustry_id` | 51a01b3e-039a-4bb1-84e2-9c711c34d9e8 | `quote` | false | true |
| 21 | `customerClass` | ustomerClass | `oCustomerClass_id` | 3198ce2d-0e64-462d-bacf-54d18171756a | `quote` | false | true |
| 22 | `developmentPartner` | evelopmentPartner(日期) | `development_partner` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` | false | true |
| 23 | `isFinancialSynergy` | 是否FinancialSynergy | `is_financial_synergy` | String | `text` | false | true |
| 24 | `parentManageOrg` | parentManageOrg | `cParentManageOrg` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` | false | true |
| 25 | `merchantCharacter` | merchantCharacter | `merchant_character` | 0e8b0c52-4ed1-455b-b76a-14b2a0616c2a | `UserDefine` | false | true |
| 26 | `largeText1` | largeText1 | `largeText1` | String | `text` | false | true |
| 27 | `largeText2` | largeText2 | `largeText2` | String | `text` | false | true |
| 28 | `largeText3` | largeText3 | `largeText3` | String | `text` | false | true |
| 29 | `largeText4` | largeText4 | `largeText4` | String | `text` | false | true |
| 30 | `largeText5` | largeText5 | `largeText5` | String | `text` | false | true |
| 31 | `verfyMark` | verfyMark | `iVerfyMark` | VerifyingState | `` | false | true |
| 32 | `merchantLogo` | merchantLogo | `merchant_logo` | String | `text` | false | true |
| 33 | `enterpriseNature` | enterpriseNature | `enterpriseNature` | EnterpriseNature | `` | false | true |
| 34 | `enterpriseName` | enterprise名称 | `cEnterpriseName` | String | `text` | false | true |
| 35 | `licenseType` | licenseType(类型) | `licensetype` | LicenseType | `` | false | true |
| 36 | `creditCode` | credit编码 | `cCreditCode` | String | `text` | false | true |
| 37 | `leaderName` | leader名称 | `leaderName` | String | `text` | false | true |
| 38 | `leaderNameIdNo` | leaderNameIdNo | `leaderNameIdNo` | String | `text` | false | true |
| 39 | `businessLicenseNew` | businessLicenseNew | `business_license` | String | `text` | false | true |
| 40 | `businessLicenseNo` | businessLicenseNo | `cBusinessLicenseNo` | String | `text` | false | true |
| 41 | `orgName` | 组织名称 | `cOrgName` | String | `text` | false | true |
| 42 | `personCharge` | personCharge | `cPersonCharge` | String | `text` | false | true |
| 43 | `personChargeIdNo` | personChargeIdNo | `cPersonChargeIdNo` | String | `text` | false | true |
| 44 | `orgCertificate` | orgCertificate | `org_certificate` | String | `text` | false | true |
| 45 | `personName` | person名称 | `cPersonName` | String | `text` | false | true |
| 46 | `frontIdCard` | rontIdCard(金额) | `front_id_card` | String | `text` | false | true |
| 47 | `backIdCard` | backIdCard | `back_id_card` | String | `text` | false | true |
| 48 | `businessterm` | businessterm | `cbusinessterm` | DateTime | `timestamp` | false | true |
| 49 | `regionCode` | region编码 | `cRegionCode` | String | `text` | false | true |
| 50 | `address` | 地址 | `cAddress` | String | `multiLanguage` | false | true |
| 51 | `longitude` | 经度 | `iLNG` | Decimal | `number` | false | true |
| 52 | `latitude` | 纬度 | `iLAT` | Decimal | `number` | false | true |
| 53 | `contactName` | contact名称 | `contactName` | String | `text` | false | true |
| 54 | `contactTel` | ontactTel | `contactTel` | String | `text` | false | true |
| 55 | `email` | 邮箱 | `cEmail` | String | `text` | false | true |
| 56 | `fax` | 传真 | `fax` | String | `text` | false | true |
| 57 | `buildTime` | buildTime(时间) | `cBuildTime` | DateTime | `timestamp` | false | true |
| 58 | `enterNature` | enterNature | `cEnterNatureId` | 8fd11da6-9dee-455a-a9cd-81c1868f12ad | `quote` | false | true |
| 59 | `currencyCode` | 币种编码 | `cCurrencyCode` | String | `text` | false | true |
| 60 | `money` | money | `cMoney` | String | `text` | false | true |
| 61 | `peopleNum` | peopleNum | `cPeopleNum` | Long | `long` | false | true |
| 62 | `scopeModel` | scopeModel | `cScopeModel` | ScopeModel | `` | false | true |
| 63 | `yearMoney` | yearMoney | `cYearMoney` | String | `text` | false | true |
| 64 | `scope` | scope | `cScope` | String | `multiLanguage` | false | true |
| 65 | `website` | website | `cWebsite` | String | `text` | false | true |
| 66 | `wid` | wid | `cWid` | String | `text` | false | true |
| 67 | `postCode` | 邮政编码 | `cPostCode` | String | `text` | false | true |
| 68 | `certificate` | ertificate | `certificate` | String | `text` | false | true |
| 69 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |  | true |
| 70 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |  | true |
| 71 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |  | true |
| 72 | `customerLevel` | ustomerLevel | `oCustomerLevel_id` | 40e121d8-8927-4bf1-ba4f-22a7b9f7b3b5 | `quote` | false | true |
| 73 | `customerArea` | ustomerArea | `oCustomerArea_id` | 75fb7b76-fdb5-4e87-ab0d-e4215a299634 | `quote` | false | true |
| 74 | `invoicingCustomers` | nvoicingCustomers(ID) | `cInvoicingCustomers` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` | false | true |
| 75 | `merchantType` | 客户类型 | `iMerchantType` | MerchantType | `` | false | true |
| 76 | `isExistPotential` | 是否ExistPotential | `is_exist_potential` | String | `text` | false | true |
| 77 | `creatorType` | creatorType(类型) | `iCreatorType` | CreatorType | `` | false | true |
| 78 | `channProfessSalesman` | hannProfessSalesman | `ochanncprofesssalesman` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` | false | true |
| 79 | `channSpecialManagementDep` | hannSpecialManagementDep | `ochanncspecialmanagementdep` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` | false | true |
| 80 | `channelCertificationStatus` | channelCertificationStatus(状态) | `channelCertificationStatus` | ChannelCertificationStatus | `` | false | true |
| 81 | `maxChannelLevel` | maxChannelLevel | `max_channel_level` | Integer | `int` | false | true |
| 82 | `miniChannelLevel` | miniChannelLevel | `mini_channel_level` | Integer | `int` | false | true |
| 83 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 84 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 85 | `yhttenant` | yhttenant | `cYhtTenant` | String | `text` | false | true |
| 86 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 87 | `orgId` | 组织ID | `createOrg` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` | false | true |
| 88 | `timeZone` | timeZone | `cTimeZoneId` | ff57c966-b826-4a94-a5f6-1599c1fe4eb3 | `quote` | false | true |
| 89 | `channCustomerClass` | hannCustomerClass | `oChannCustomerClass_id` | 3198ce2d-0e64-462d-bacf-54d18171756a | `quote` | false | true |
| 90 | `channCustomerIndustry` | hannCustomerIndustry | `ochannCustomerIndustry_id` | 51a01b3e-039a-4bb1-84e2-9c711c34d9e8 | `quote` | false | true |
| 91 | `channCustomerLevel` | hannCustomerLevel | `oChannCustomerLevel_id` | 40e121d8-8927-4bf1-ba4f-22a7b9f7b3b5 | `quote` | false | true |
| 92 | `channCustomerArea` | hannCustomerArea | `ochannCustomerArea_id` | 75fb7b76-fdb5-4e87-ab0d-e4215a299634 | `quote` | false | true |
| 93 | `logo` | logo | `logo` | String | `text` | false | true |
| 94 | `idNo` | dNo(ID) | `idNo` | String | `text` | false | true |
| 95 | `businessLicense` | businessLicense | `cBusinessLicense` | String | `text` | false | true |
| 96 | `orgIdNo` | orgIdNo | `cOrgIdNo` | String | `text` | false | true |
| 97 | `frontIdNo` | rontIdNo(金额) | `cFrontIdNo` | String | `text` | false | true |
| 98 | `backIdNo` | backIdNo | `cBackIdNo` | String | `text` | false | true |
| 99 | `channelType` | channelType(类型) | `iChannelTypeId` | Long | `long` | false | true |
| 100 | `region` | region | `cRegion` | String | `text` | false | true |
| 101 | `regAddress` | regAddress | `cRegAddress` | String | `text` | false | true |
| 102 | `searchAddress` | searchAddress | `cSearchAddress` | String | `text` | false | true |
| 103 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 104 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 105 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 106 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 107 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 108 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 109 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 110 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 111 | `aaaList` | aaaList | `` | 9943f4b5-da14-45bf-88fd-492b7e8e39e3 | `` |  |  |
| 112 | `customerAreas` | ustomerAreas | `` | 978ad259-ade5-4fb3-8aba-cecf550ec9d6 | `` |  |  |
| 113 | `customerDefine` | ustomerDefine | `` | 4b822431-d3fe-439e-ac84-18185ace55ca | `` |  |  |
| 114 | `invoicingCustomerss` | nvoicingCustomerss(ID) | `` | d26147af-40a2-464a-a1d5-ff65a15918d3 | `` |  |  |
| 115 | `merchantAddressInfos` | merchantAddressInfos | `` | 9fcf5601-f03e-4437-8377-1b82efea453a | `` |  |  |
| 116 | `merchantAgentFinancialInfos` | merchantAgentFinancialInfos | `` | 60cc421e-5605-475b-a829-02fd75c0b189 | `` |  |  |
| 117 | `merchantAgentInvoiceInfos` | merchantAgentInvoiceInfos | `` | b238b7af-54b1-428d-a4d8-0e481d9f293e | `` |  |  |
| 118 | `merchantAppliedDetail` | merchantAppliedDetail | `` | 0b0dd8bc-6aa8-4eed-96d2-4a105e8df8fc | `` |  |  |
| 119 | `merchantAppliedDetailExt` | merchantAppliedDetailExt | `` | 0b0dd8bc-6aa8-4eed-96d2-4a105e8df8fc | `` |  |  |
| 120 | `merchantApplyRangeExts` | merchantApplyRangeExts | `` | b023ebd3-0f7f-4a9a-a28b-32183b1b8022 | `` |  |  |
| 121 | `merchantApplyRanges` | merchantApplyRanges | `` | c6b2ce53-9c17-45ca-b313-c775c94bc001 | `` |  |  |
| 122 | `merchantAttachments` | merchantAttachments | `` | da955a31-14f0-4c55-8e13-c23ad5a8bddc | `` |  |  |
| 123 | `merchantBusinessRoleTime` | merchantBusinessRoleTime(时间) | `` | 0d8c8c5e-fce7-48a0-aa35-bc8701532a19 | `` |  |  |
| 124 | `merchantContacterInfos` | merchantContacterInfos | `` | 7733d1db-8871-437a-ba65-dbcad95bf0bc | `` |  |  |
| 125 | `merchantDefine` | merchantDefine | `` | ef31eb30-aa72-4be9-936b-a83a8eca3c2c | `` |  |  |
| 126 | `merchantDetails` | merchantDetails | `` | 1f145dee-55c4-4ad6-a699-873c8ecc096e | `` |  |  |
| 127 | `merchantQualificationDocuments` | merchantQualificationDocuments | `` | e473ae79-34ff-40ed-87f6-932e4e4b8a1a | `` |  |  |
| 128 | `merchantRole` | merchantRole | `` | 335d4846-0a52-482f-9222-45fdc0f13ab7 | `` |  |  |
| 129 | `merchantStaff` | merchantStaff | `` | 089a0289-d807-41d2-b5b3-531043e06b62 | `` |  |  |
| 130 | `merchantsManager` | merchantsManager | `` | fc0e69d2-011e-45e6-b09a-b61a901323aa | `` |  |  |
| 131 | `newPageList` | newPageList | `` | 6237e572-122c-4e59-ae88-e3e24263448e | `` |  |  |
| 132 | `principals` | principals | `` | 7fdf2726-3ab2-4540-aa0c-4856d76467af | `` |  |  |

## 关联属性（52 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `country` | ountry | `bd.country.CountryVO` | `cCountry` | 外键 |  |  | Service |  |
| 2 | `invoicingCustomerss` | nvoicingCustomerss(ID) | `aa.merchant.InvoicingCustomers` | `` | invoicingCustomerss → merchantId | 0..n | Y | None |  |
| 3 | `suppliers` | suppliers | `aa.vendor.Vendor` | `cSuppliers` | 外键 |  |  | Service |  |
| 4 | `channCustomerIndustry` | hannCustomerIndustry | `aa.customertrade.CustomerTrade` | `ochannCustomerIndustry_id` | 外键 |  |  | None | true |
| 5 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 6 | `language` | language | `bd.timezonelanguage.LanguageVO` | `cLanguageId` | 外键 |  |  | Service |  |
| 7 | `parentManageOrg` | parentManageOrg | `bd.adminOrg.BaseOrgVO` | `cParentManageOrg` | 外键 |  |  | Service |  |
| 8 | `channProfessSalesman` | hannProfessSalesman | `bd.staff.Staff` | `ochanncprofesssalesman` | 外键 |  |  | Service | true |
| 9 | `merchantQualificationDocuments` | merchantQualificationDocuments | `aa.merchant.MerchantQualificationDocument` | `` | merchantQualificationDocuments → merchantId | 0..n | Y | None |  |
| 10 | `customerDefine` | ustomerDefine | `aa.merchant.CustomerDefine` | `` | customerDefine → merchantId | 1 | Y | None |  |
| 11 | `newPageList` | newPageList | `aa.merchant.newPage` | `` | newPageList → foreignerKey | 0..n | Y | None |  |
| 12 | `merchantContacterInfos` | merchantContacterInfos | `aa.merchant.Contacter` | `` | merchantContacterInfos → merchantId | 0..n | Y | None |  |
| 13 | `customerClass` | ustomerClass | `aa.custcategory.CustCategory` | `oCustomerClass_id` | 外键 |  |  | None |  |
| 14 | `channCustomerArea` | hannCustomerArea | `aa.salearea.SaleArea` | `ochannCustomerArea_id` | 外键 |  |  | None | true |
| 15 | `internalOrgId` | internalOrgId | `org.func.BaseOrg` | `orgId` | 外键 |  |  | Service |  |
| 16 | `merchantStaff` | merchantStaff | `aa.merchant.MerchantStaff` | `` | merchantStaff → merchantId | 0..n | Y | None |  |
| 17 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | None |  |
| 18 | `merchantRole` | merchantRole | `aa.merchant.MerchantRoleInfo` | `` | merchantRole → merchantId | 1 | Y | None |  |
| 19 | `merchantAppliedDetailExt` | merchantAppliedDetailExt | `aa.merchant.MerchantApplyRangeDetail` | `` | merchantAppliedDetailExt → id | 0..n | Y | None |  |
| 20 | `customerIndustry` | ustomerIndustry | `aa.customertrade.CustomerTrade` | `oCustomerIndustry_id` | 外键 |  |  | None |  |
| 21 | `timeZone` | timeZone | `bd.timezonelanguage.TimeZoneVO` | `cTimeZoneId` | 外键 |  |  | Service | true |
| 22 | `customerArea` | ustomerArea | `aa.salearea.SaleArea` | `oCustomerArea_id` | 外键 |  |  | None | true |
| 23 | `merchantsManager` | merchantsManager | `aa.merchant.MerchantsManager` | `` | merchantsManager → merchantId | 1 | Y | None |  |
| 24 | `developmentPartner` | evelopmentPartner(日期) | `aa.merchant.Merchant` | `development_partner` | 外键 |  |  | None |  |
| 25 | `merchantAgentFinancialInfos` | merchantAgentFinancialInfos | `aa.merchant.AgentFinancial` | `` | merchantAgentFinancialInfos → merchantId | 0..n | Y | None |  |
| 26 | `merchantAgentInvoiceInfos` | merchantAgentInvoiceInfos | `aa.merchant.AgentInvoice` | `` | merchantAgentInvoiceInfos → merchantId | 0..n | Y | None |  |
| 27 | `channCustomerClass` | hannCustomerClass | `aa.custcategory.CustCategory` | `oChannCustomerClass_id` | 外键 |  |  | None | true |
| 28 | `transType` | transType(类型) | `bd.bill.TransType` | `transType` | 外键 |  |  | Service |  |
| 29 | `merchantAttachments` | merchantAttachments | `aa.merchant.MerchantAttachment` | `` | merchantAttachments → merchantId | 0..n | Y | None |  |
| 30 | `parentCustomer` | parentCustomer | `aa.merchant.Merchant` | `iParentCustomer` | 外键 |  |  | None |  |
| 31 | `merchantAppliedDetail` | merchantAppliedDetail | `aa.merchant.MerchantApplyRangeDetail` | `` | merchantAppliedDetail → id | 0..n | Y | None |  |
| 32 | `createMerchant` | reateMerchant | `bd.adminOrg.BaseOrgVO` | `createMerchant` | 外键 |  |  | Service |  |
| 33 | `aaaList` | aaaList | `aa.merchant.aaa` | `` | aaaList → foreignerKey | 0..n | Y | None |  |
| 34 | `merchantBusinessRoleTime` | merchantBusinessRoleTime(时间) | `aa.merchant.MerchantBusinessRoleTime` | `` | merchantBusinessRoleTime → merchantId | 0..n | Y | None |  |
| 35 | `businessPartner` | businessPartner | `base.businesspartner.BusinessPartner` | `businessPartner` | 外键 |  |  | None |  |
| 36 | `channCustomerLevel` | hannCustomerLevel | `aa.agentlevel.AgentLevel` | `oChannCustomerLevel_id` | 外键 |  |  | None | true |
| 37 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 38 | `principals` | principals | `aa.merchant.Principal` | `` | principals → merchantId | 0..n | Y | None |  |
| 39 | `merchantApplyRangeExts` | merchantApplyRangeExts | `aa.merchant.MerchantApplyRangeExt` | `` | merchantApplyRangeExts → merchantId | 0..n | Y | None |  |
| 40 | `orgId` | 组织ID | `bd.adminOrg.BaseOrgVO` | `createOrg` | 外键 |  |  | Service |  |
| 41 | `invoicingCustomers` | nvoicingCustomers(ID) | `aa.merchant.Merchant` | `cInvoicingCustomers` | 外键 |  |  | None | true |
| 42 | `enterNature` | enterNature | `bd.enterprise.EnterpriseNatureVO` | `cEnterNatureId` | 外键 |  |  | Service |  |
| 43 | `customerAreas` | ustomerAreas | `aa.merchant.CustomerArea` | `` | customerAreas → merchantId | 0..n | Y | None |  |
| 44 | `merchantCharacter` | merchantCharacter | `aa.merchant.MerchantCharacter` | `merchant_character` | 外键 |  |  | None |  |
| 45 | `createOrg` | reateOrg | `bd.adminOrg.BaseOrgVO` | `createOrg` | 外键 |  |  | Service |  |
| 46 | `channSpecialManagementDep` | hannSpecialManagementDep | `bd.adminOrg.AdminOrgVO` | `ochanncspecialmanagementdep` | 外键 |  |  | Service | true |
| 47 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 48 | `merchantDetails` | merchantDetails | `aa.merchant.MerchantDetail` | `` | merchantDetails → merchantId | 0..n | Y | None |  |
| 49 | `merchantDefine` | merchantDefine | `aa.merchant.MerchantDefine` | `` | merchantDefine → id | 1 | Y | None |  |
| 50 | `customerLevel` | ustomerLevel | `aa.agentlevel.AgentLevel` | `oCustomerLevel_id` | 外键 |  |  | None |  |
| 51 | `merchantApplyRanges` | merchantApplyRanges | `aa.merchant.MerchantApplyRange` | `` | merchantApplyRanges → merchantId | 1..n | Y | None |  |
| 52 | `merchantAddressInfos` | merchantAddressInfos | `aa.merchant.AddressInfo` | `` | merchantAddressInfos → merchantId | 0..n | Y | None |  |

---

## SQL 示例

```sql
SELECT id, createOrg, createMerchant, transType, cCode, cName, erpCode, shortName
FROM merchant
```