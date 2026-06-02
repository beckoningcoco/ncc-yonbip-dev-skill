---
tags: [BIP, 元数据, 数据字典, aa, aa.vendor.Vendor]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 供应商 (`aa.vendor.Vendor`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_vendor` | 应用: `DPMSPL`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 全部属性（116 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 2 | `code` | 编码 | `code` | String | `text` |  | true |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |  | true |
| 4 | `nameAlias` | nameAlias | `nameAlias` | String | `text` |  | true |
| 5 | `org` | org | `iOrgId` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | true |
| 6 | `vendorclass` | vendorclass | `iclass_id` | 59ec0b4d-4e38-483d-9bdd-e7aa44176ce8 | `quote` |  | true |
| 7 | `taxPayingCategories` | taxPayingCategories | `iTaxPayingCate` | TaxPayingCate | `` |  | true |
| 8 | `country` | country | `iCountryId` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |  | true |
| 9 | `language` | language | `cLanguageId` | a014aa1b-1f14-4d31-88fb-dcce538d9973 | `quote` |  | true |
| 10 | `timeZone` | timeZone | `cTimeZoneId` | String | `text` |  | true |
| 11 | `epCompanyId` | epCompanyID | `epCompanyId` | String | `text` |  | true |
| 12 | `insuredNum` | insuredNum | `insuredNum` | Integer | `int` |  | true |
| 13 | `paidFund` | paidFund | `paidFund` | Decimal | `number` |  | true |
| 14 | `crowd` | crowd | `crowd` | ca82de16-8b6a-4e94-b113-2d9d13f82f22 | `quote` |  | true |
| 15 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |  | true |
| 16 | `bEntVerify` | bEntVerify | `bEntVerify` | Integer | `int` |  | true |
| 17 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |  | true |
| 18 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |  | true |
| 19 | `transType` | transType | `transType` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | true |
| 20 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true |
| 21 | `correspondingorg` | correspondingorg | `iCorrespondingOrgId` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | true |
| 22 | `correspondingcust` | correspondingcust | `iCorrespondingCustId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | true |
| 23 | `parentVendor` | parentVendor | `iParentVendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | true |
| 24 | `retailInvestors` | retailInvestors | `retailInvestors` | Boolean | `switch` |  | true |
| 25 | `businessPartner` | businessPartner | `businessPartner` | c1627369-6457-4828-883d-756b79bd0f46 | `quote` |  | true |
| 26 | `applyDate` | applyDate | `apply_date` | DateTime | `timestamp` |  | true |
| 27 | `approveDate` | approveDate | `approve_date` | DateTime | `timestamp` |  | true |
| 28 | `supplyType` | supplyType | `supply_type` | Short | `short` |  | true |
| 29 | `licenseType` | licenseType | `license_type` | String | `text` |  | true |
| 30 | `creditcode` | creditcode | `cCreditCode` | String | `text` |  | true |
| 31 | `registerFund` | registerFund | `registerfund` | Decimal | `number` |  | true |
| 32 | `basisCurrencyRegisterfund` | basisCurrencyRegisterfund | `basis_currency_registerfund` | Decimal | `number` |  | true |
| 33 | `registerCurrency` | registerCurrency | `register_currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | true |
| 34 | `basisCurrency` | basisCurrency | `basis_currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | true |
| 35 | `companytype` | companytype | `cCompanyType` | String | `text` |  | true |
| 36 | `foundDate` | foundDate | `found_date` | DateTime | `timestamp` |  | true |
| 37 | `legalBody` | legalBody | `legalbody` | String | `text` |  | true |
| 38 | `contactphone` | contactphone | `cContactPhone` | String | `text` |  | true |
| 39 | `regionCode` | 区域编码 | `cRegionCode` | String | `text` |  | true |
| 40 | `region` | region | `cRegion` | Long | `long` |  | true |
| 41 | `address` | address | `cVendorRegisterAddress` | String | `text` |  | true |
| 42 | `serviceRange` | serviceRange | `service_range` | String | `text` |  | true |
| 43 | `vendorphone` | vendorphone | `cVendorPhone` | String | `text` |  | true |
| 44 | `vendoraddress` | vendoraddress | `cVendorAddress` | String | `text` |  | true |
| 45 | `vendorzipcode` | vendorzipcode | `cVendorZipCode` | String | `text` |  | true |
| 46 | `vendoremail` | vendoremail | `cVendorEmail` | String | `text` |  | true |
| 47 | `wechatpublicaccount` | wechatpublicaccount | `cWechatPublicAccount` | String | `text` |  | true |
| 48 | `vendorfax` | vendorfax | `vendor_fax` | String | `text` |  | true |
| 49 | `trade` | trade | `trade` | Short | `short` |  | true |
| 50 | `cooperationdate` | cooperationdate | `cCooperationDate` | Date | `date` |  | true |
| 51 | `extSystemMemberId` | extSystemMemberID | `extsystemmemberid` | String | `text` |  | true |
| 52 | `extSystemCode` | extSystem编码 | `extsystemcode` | Short | `short` |  | true |
| 53 | `datasource` | datasource | `cDataSource` | String | `text` |  | true |
| 54 | `relationTenantId` | relationTenantID | `cRelationTenantId` | String | `text` |  | true |
| 55 | `relationEnterpriseId` | relationEnterpriseID | `nRelationEnterpriseId` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | true |
| 56 | `ycnCode` | ycn编码 | `ycn_code` | String | `text` |  | true |
| 57 | `bcoordination` | bcoordination | `bcoordination` | Integer | `int` |  | true |
| 58 | `relationTenantUserCode` | relationTenantUser编码 | `relation_tenant_usercode` | String | `text` |  | true |
| 59 | `tenantErrorMsg` | tenantErrorMsg | `tenant_error_msg` | String | `text` |  | true |
| 60 | `erpCode` | erp编码 | `cErpCode` | String | `text` |  | true |
| 61 | `syncErpFlag` | syncErpFlag | `sync_erp_flag` | Boolean | `switch` |  | true |
| 62 | `syncErpTime` | syncErpTime | `sync_erp_time` | DateTime | `timestamp` |  | true |
| 63 | `applySource` | applySource | `apply_source` | String | `text` |  | true |
| 64 | `capacity` | capacity | `capacity` | String | `text` |  | true |
| 65 | `investigationNotes` | investigationNotes | `investigation_notes` | String | `text` |  | true |
| 66 | `entProfile` | entProfile | `ent_profile` | String | `text` |  | true |
| 67 | `busPerformance` | busPerformance | `bus_performance` | String | `text` |  | true |
| 68 | `entProfileFilePath` | entProfileFilePath | `ent_profile_filepath` | String | `text` |  | true |
| 69 | `busPerformanceFilePath` | busPerformanceFilePath | `bus_performance_filepath` | String | `text` |  | true |
| 70 | `investigationFilePath` | investigationFilePath | `investigation_filepath` | String | `text` |  | true |
| 71 | `freezestatus` | freezestatus | `bFreezeStatus` | Boolean | `switch` |  | true |
| 72 | `accessstatus` | accessstatus | `cAccessStatus` | Short | `short` |  | true |
| 73 | `yhttenant` | yhttenant | `cYhtTenant` | String | `text` |  | true |
| 74 | `financeAccessStatus` | financeAccessStatus | `finance_access_status` | Integer | `int` |  | true |
| 75 | `mgtType` | mgtType | `mgt_type` | Short | `short` |  | true |
| 76 | `orgId` | orgID | `iOrgId` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | true |
| 77 | `reReject` | reReject | `re_reject` | String | `text` |  | true |
| 78 | `reRejectDate` | reRejectDate | `re_reject_date` | Date | `date` |  | true |
| 79 | `reRejectPerson` | reRejectPerson | `re_reject_person` | String | `text` |  | true |
| 80 | `reRejectStatus` | reRejectStatus | `re_reject_status` | Integer | `int` |  | true |
| 81 | `supplyApplyId` | supplyApplyID | `supplyapply_id` | Long | `long` |  | true |
| 82 | `transactions` | transactions | `cTransactions` | String | `text` |  | true |
| 83 | `cust` | cust | `iCustID` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | true |
| 84 | `internalunit` | internalunit | `bInternalUnit` | Boolean | `switch` |  | true |
| 85 | `contact` | contact | `cContact` | String | `text` |  | true |
| 86 | `contactmobile` | contactmobile | `cContactMobile` | String | `text` |  | true |
| 87 | `vendorWebUrl` | vendorWebUrl | `vendor_web_url` | String | `text` |  | true |
| 88 | `remark` | remark | `cRemark` | String | `text` |  | true |
| 89 | `channelId` | channelID | `channel_id` | Long | `long` |  | true |
| 90 | `creatorType` | creatorType | `iCreatorType` | CreatorType | `` |  | true |
| 91 | `ecotypesincevfive` | ecotypesincevfive | `ecotypesincevfive` | String | `text` |  | true |
| 92 | `customCategory1Id` | customCategory1ID | `custom_category1_id` | Long | `long` |  | true |
| 93 | `customCategory2Id` | customCategory2ID | `custom_category2_id` | Long | `long` |  | true |
| 94 | `filepath1` | filepath1 | `filepath1` | String | `text` |  | true |
| 95 | `filepath2` | filepath2 | `filepath2` | String | `text` |  | true |
| 96 | `filepath3` | filepath3 | `filepath3` | String | `text` |  | true |
| 97 | `filepath4` | filepath4 | `filepath4` | String | `text` |  | true |
| 98 | `filepath5` | filepath5 | `filepath5` | String | `text` |  | true |
| 99 | `filepath6` | filepath6 | `filepath6` | String | `text` |  | true |
| 100 | `filepath7` | filepath7 | `filepath7` | String | `text` |  | true |
| 101 | `filepath8` | filepath8 | `filepath8` | String | `text` |  | true |
| 102 | `taxitems` | taxitems | `iTaxItems` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |  | true |
| 103 | `dr` | 逻辑删除 | `dr` | Short | `short` |  | true |
| 104 | `vendorCharacterDefine` | vendorCharacterDefine | `vendorCharacterDefine` | ec579199-c722-4eda-878e-20dcd9ddb0bd | `UserDefine` |  | true |
| 105 | `entRelationshipId` | entRelationshipID | `ent_relationship_id` | Long | `long` |  | true |
| 106 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 107 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 108 | `customItems` | customItems | `` | 7814b25d-9150-481d-9f4a-4fd1a80c5fd2 | `` |  |  |
| 109 | `vendorAddresses` | vendorAddresses | `` | 454acb9a-6245-41e4-bddc-7fc0b8f793ca | `` |  |  |
| 110 | `vendorApplyRange` | vendorApplyRange | `` | 884766bb-f155-42a2-93fd-2e90d1903c9a | `` |  |  |
| 111 | `vendorDefine` | vendorDefine | `` | c0903186-e966-4680-8762-67f15af752d9 | `` |  |  |
| 112 | `vendorOrgs` | vendorOrgs | `` | 884766bb-f155-42a2-93fd-2e90d1903c9a | `` |  |  |
| 113 | `vendorQualifies` | vendorQualifies | `` | 0f7a2fa8-9a02-448c-add7-b42a0a42668f | `` |  |  |
| 114 | `vendorbanks` | vendorbanks | `` | 4b6dcfa2-1d07-407d-a35a-9b219fadf37c | `` |  |  |
| 115 | `vendorcontactss` | vendorcontactss | `` | b94fa77c-2f2b-464c-96fb-d028543825ee | `` |  |  |
| 116 | `vendorextends` | vendorextends | `` | f244fb70-c449-4372-bee2-10af091e696b | `` |  |  |

## 关联属性（28 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `country` | `bd.country.CountryVO` | `iCountryId` |  |  |  |
| 2 | `vendorQualifies` | `aa.vendor.VendorQualify` | `` | 0..n | Y |  |
| 3 | `businessPartner` | `base.businesspartner.BusinessPartner` | `businessPartner` |  |  |  |
| 4 | `crowd` | `aa.vendor.Crowd` | `crowd` |  |  |  |
| 5 | `vendorcontactss` | `aa.vendor.VendorContacts` | `` | 0..n | Y |  |
| 6 | `language` | `bd.timezonelanguage.LanguageVO` | `cLanguageId` |  |  |  |
| 7 | `relationEnterpriseId` | `cpu-privilege.enterprise.EnterprisePOJO` | `nRelationEnterpriseId` |  |  |  |
| 8 | `orgId` | `bd.adminOrg.BaseOrgVO` | `iOrgId` |  |  |  |
| 9 | `registerCurrency` | `bd.currencytenant.CurrencyTenantVO` | `register_currency` |  |  |  |
| 10 | `basisCurrency` | `bd.currencytenant.CurrencyTenantVO` | `basis_currency` |  |  |  |
| 11 | `vendorOrgs` | `aa.vendor.VendorOrg` | `` | 0..n | Y | true |
| 12 | `customItems` | `aa.vendor.VendorCustomItem` | `` | 1 | Y | true |
| 13 | `vendorApplyRange` | `aa.vendor.VendorOrg` | `` | 0..n | Y |  |
| 14 | `tenant` | `base.tenant.Tenant` | `tenant_id` |  |  |  |
| 15 | `vendorextends` | `aa.vendor.VendorExtend` | `` | 1 | Y |  |
| 16 | `vendorbanks` | `aa.vendor.VendorBank` | `` | 0..n | Y |  |
| 17 | `org` | `bd.adminOrg.BaseOrgVO` | `iOrgId` |  |  |  |
| 18 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 19 | `correspondingcust` | `aa.merchant.Merchant` | `iCorrespondingCustId` |  |  |  |
| 20 | `vendorclass` | `aa.vendorclass.VendorClass` | `iclass_id` |  |  |  |
| 21 | `transType` | `bd.bill.TransType` | `transType` |  |  |  |
| 22 | `correspondingorg` | `bd.adminOrg.BaseOrgVO` | `iCorrespondingOrgId` |  |  |  |
| 23 | `parentVendor` | `aa.vendor.Vendor` | `iParentVendor` |  |  |  |
| 24 | `vendorCharacterDefine` | `aa.vendor.VendorCharacterDefine` | `vendorCharacterDefine` |  |  |  |
| 25 | `vendorDefine` | `aa.vendor.VendorDefine` | `` | 1 | Y | true |
| 26 | `cust` | `aa.merchant.Merchant` | `iCustID` |  |  |  |
| 27 | `taxitems` | `archive.taxArchives.TaxRateArchive` | `iTaxItems` |  |  |  |
| 28 | `vendorAddresses` | `aa.vendor.VendorAddress` | `` | 0..n | Y |  |

## 依赖接口（4 个）

- `IErpCode` → `base.itf.IErpCode` (v73)
- `IAutoCode` → `voucher.base.IAutoCode` (v49)
- `ISocialMcType` → `bd.social.ISocialMcType` (v977)
- `IYTenantExt` → `ucfbase.ucfbaseItf.IYTenantExt` (v24)

## SQL 示例

```sql
SELECT id, code, name, nameAlias, iOrgId, iclass_id, iTaxPayingCate, iCountryId
FROM aa_vendor
```