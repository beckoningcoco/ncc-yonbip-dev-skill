---
tags: [BIP, 元数据, 数据字典, cust.customeraddapply.CustomerAddApply]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户申请 (`cust.customeraddapply.CustomerAddApply`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_customeraddapply_merchant` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：`8ad761a4-83d5-4268-962e-07f4e097ceea`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户申请 |
| 物理表 | `cust_customeraddapply_merchant` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CUST` |
| 直连字段 | 171 个 |
| 子表 | 16 个 |
| 关联引用 | 64 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `merchantRole` | `cust.customeraddapply.MerchantRoleInfo` | composition |
| `invoicingCustomerss` | `cust.customeraddapply.InvoicingCustomers` | composition |
| `merchantCharacterEntity` | `cust.customeraddapply.MerchantCharacterEntity` | composition |
| `merchantsManager` | `cust.customeraddapply.MerchantsManager` | composition |
| `principals` | `cust.customeraddapply.Principal` | composition |
| `merchantAgentFinancialInfos` | `cust.customeraddapply.AgentFinancial` | composition |
| `effectiveScopes` | `cust.customeraddapply.EffectiveScope` | composition |
| `merchantAgentInvoiceInfos` | `cust.customeraddapply.AgentInvoice` | composition |
| `merchantQualificationDocuments` | `cust.customeraddapply.MerchantQualificationDocument` | composition |
| `merchantApplyRanges` | `cust.customeraddapply.MerchantApplyRange` | composition |
| `merchantContacterInfos` | `cust.customeraddapply.Contacter` | composition |
| `customerAddApplyParticipantList` | `cust.customeraddapply.CustomerAddApplyParticipant` | composition |
| `merchantAddressInfos` | `cust.customeraddapply.AddressInfo` | composition |
| `merchantAppliedDetail` | `cust.customeraddapply.MerchantApplyRangeDetail` | composition |
| `customerAreas` | `cust.customeraddapply.CustomerArea` | composition |
| `affiliatePartnerList` | `cust.customeraddapply.AffiliatePartner` | composition |

## 关联引用 (64个)

| 字段名 | 引用类型 |
|--------|---------|
| `cCountry` | `ucfbasedoc.bd_countryref` |
| `` | `` |
| `apply_suppliers` | `yssupplier.aa_vendor` |
| `cSuppliers` | `yssupplier.aa_vendor` |
| `ochannCustomerIndustry_id` | `productcenter.aa_customertraderef` |
| `iChannelTypeId` | `productcenter.aa_channeltyperef` |
| `cLanguageId` | `ucfbasedoc.bd_languageref` |
| `cParentManageOrg` | `ucf-org-center.bd_salesorg_na` |
| `ochanncprofesssalesman` | `ucf-staff-center.bd_staff_ref` |
| `oCustomerClass_id` | `productcenter.aa_custcategoryref` |
| `clueId` | `yycrm.sfa_clueref` |
| `ochannCustomerArea_id` | `productcenter.aa_salearearef` |
| `orgId` | `ucf-org-center.org_unit_tree_ref` |
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `customerAddApplyCharacter` | `` |
| `oCustomerIndustry_id` | `productcenter.aa_customertraderef` |
| `cTimeZoneId` | `ucfbasedoc.bd_timezoneref` |
| `salearea` | `productcenter.aa_salearearef` |
| `oCustomerArea_id` | `productcenter.aa_salearearef` |
| `oChannCustomerClass_id` | `productcenter.aa_custcategoryref` |
| `transType` | `transtype.bd_billtyperef` |
| `iParentCustomer` | `yycrm.cust_customernoauthref` |
| `createMerchant` | `ucf-org-center.org_pure_tree_ref` |
| `partnertype` | `yycrm.prm_partnertyperef` |
| `partner_dept` | `` |
| `regularchangecustomer` | `yycrm.cust_customerref` |
| `areaFormat` | `` |
| `businessPartner` | `` |
| `oChannCustomerLevel_id` | `productcenter.aa_customerlevelref` |
| `industry` | `productcenter.aa_customertraderef` |
| `createOrg` | `ucf-org-center.org_pure_tree_ref` |
| `cInvoicingCustomers` | `yycrm.cust_customerref` |
| `cEnterNatureId` | `ucfbasedoc.bd_enterprisenatureref` |
| `ochanncspecialmanagementdep` | `ucf-org-center.bd_adminorgsharetreeref` |
| `ytenant_id` | `` |
| `org` | `ucf-org-center.bd_salesorg_na` |
| `terminal` | `yycrm.dsfa_storeterminal` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `bustype` | `transtype.bd_billtyperef` |
| `oCustomerLevel_id` | `productcenter.aa_customerlevelref` |
| `partner_person` | `ucf-staff-center.bd_outerstaff_info` |
| `partner` | `yycrm.cust_customerref` |
| `iCustID` | `yycrm.cust_customerref` |
| `task_id` | `yycrm.act_taskref` |
| `customer` | `yycrm.cust_customerref` |

## 继承接口 (7个, 22字段)

- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **数字营销数据权限** (`crmc.base.IDataPermissions`)
  - `dept` → `dept`
  - `org` → `org`
  - `ower` → `ower`
  - `salearea` → `salearea`

## 字段列表（按类型分组）

> 共 171 个直连字段

### 文本字段 (71个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `merchant_logo` | `merchant_logo` | `merchantLogo` | LOGO |
| `custcode` | `custcode` | `code` | 申请编码 |
| `path` | `path` | `path` | 上级客户路径 |
| `cSearchAddress` | `cSearchAddress` | `searchAddress` | 搜索地址 |
| `dataStatus` | `dataStatus` | `dataStatus` | 数据状态 |
| `crepresentativename` | `crepresentativename` | `representativeName` | 法定代表人章签署人 |
| `cofficialemail` | `cofficialemail` | `officialEmail` | 公章签署人邮箱 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `business_information` | `business_information` | `businessInformation` | 工商备注信息 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `cofficialname` | `cofficialname` | `officialName` | 公章签署人 |
| `cFullName` | `cFullName` | `cFullName` | 伙伴用户姓名 |
| `bustypeextenum` | `bustypeextenum` | `bustypeExtEnum` | 交易类型枚举值 |
| `usebillnum` | `usebillnum` | `useBillNum` | 单据加载模板 |
| `cRegion` | `cRegion` | `region` | 所在地区 |
| `crepresentativeemail` | `crepresentativeemail` | `representativeEmail` | 法定代表人章签署人邮箱 |
| `applycustomer` | `applycustomer` | `applyCustomer` | 客户 |
| `cRegAddress` | `cRegAddress` | `regAddress` | 注册地址 |
| `cofficialmobile` | `cofficialmobile` | `officialMobile` | 公章签署人手机 |
| `crepresentativemobile` | `crepresentativemobile` | `representativeMobile` | 法定代表人章签署人手机 |
| `cYhtTenant` | `cYhtTenant` | `yhttenant` | 友互通id |
| `sourceDataId` | `sourceDataId` | `sourceDataId` | 客户档案子表ID |
| `custname` | `custname` | `custName` | 申请客户名称 |
| `reason` | `reason` | `applyReason` | 申请原因 |
| `cCode` | `cCode` | `custCode` | 客户编码 |
| `applydesc` | `applydesc` | `applyDesc` | 申请原因 |
| `cApplyEmail` | `cApplyEmail` | `applyEmail` | 客户用户邮箱 |
| `cCountryCode` | `cCountryCode` | `countryCode` | 手机号国际区号 |
| `erpCode` | `erpCode` | `erpCode` | 外部编码 |
| `cMobile` | `cMobile` | `mobile` | 客户用户手机 |
| `cEmail` | `cEmail` | `email` | 邮箱 |
| `` | `creator` | `creator` | 创建人 |
| `new_time_zone_id` | `new_time_zone_id` | `newTimeZone` | 时区 |
| `largeText1` | `largeText1` | `largeText1` | 大文本域1 |
| `largeText2` | `largeText2` | `largeText2` | 大文本域2 |
| `largeText3` | `largeText3` | `largeText3` | 大文本域3 |
| `largeText4` | `largeText4` | `largeText4` | 大文本域4 |
| `largeText5` | `largeText5` | `largeText5` | 大文本域5 |
| `cEnterpriseName` | `cEnterpriseName` | `enterpriseName` | 企业名称 |
| `leaderName` | `leaderName` | `leaderName` | 法人代表 |
| `leaderNameIdNo` | `leaderNameIdNo` | `leaderNameIdNo` | 法人代表身份证号 |
| `cPersonName` | `cPersonName` | `personName` | 姓名 |
| `idNo` | `idNo` | `idNo` | 身份证号 |
| `cOrgName` | `cOrgName` | `orgName` | 组织名称 |
| `cCreditCode` | `cCreditCode` | `creditCode` | 统一社会信用代码 |
| `cPersonCharge` | `cPersonCharge` | `personCharge` | 负责人 |
| `cPersonChargeIdNo` | `cPersonChargeIdNo` | `personChargeIdNo` | 负责人身份证号 |
| `front_id_card` | `front_id_card` | `frontIdCard` | 法人证件 |
| `back_id_card` | `back_id_card` | `backIdCard` | 法人证件 |
| `business_license` | `business_license` | `businessLicenseNew` | 营业执照 |
| `org_certificate` | `org_certificate` | `orgCertificate` | 组织证件 |
| `cFrontIdNo` | `cFrontIdNo` | `frontIdNo` | 法人证件 |
| `cBackIdNo` | `cBackIdNo` | `backIdNo` | 身份证背面 |
| `cBusinessLicense` | `cBusinessLicense` | `businessLicense` | 营业执照 |
| `logo` | `logo` | `logo` | logo |
| `cOrgIdNo` | `cOrgIdNo` | `orgIdNo` | 组织相关证件 |
| `cBusinessLicenseNo` | `cBusinessLicenseNo` | `businessLicenseNo` | 经营许可证号 |
| `cRegionCode` | `cRegionCode` | `regionCode` | 注册地区 |
| `fax` | `fax` | `fax` | 传真 |
| `cPostCode` | `cPostCode` | `postCode` | 邮编 |
| `contactName` | `contactName` | `contactName` | 联系人 |
| `contactTel` | `contactTel` | `contactTel` | 联系电话 |
| `cCurrencyCode` | `cCurrencyCode` | `currencyCode` | 注册资金币种 |
| `cMoney` | `cMoney` | `money` | 注册资金 |
| `cYearMoney` | `cYearMoney` | `yearMoney` | 年营业额 |
| `cWebsite` | `cWebsite` | `website` | 网址 |
| `cWid` | `cWid` | `wid` | 微信公众号 |
| `certificate` | `certificate` | `certificate` | 证件证书 |
| `cFullName` | `cFullName` | `fullName` | 伙伴用户姓名 |
| `sourceType` | `sourceType` | `sourceType` | 核实数据来源类型 |
| `verfiyId` | `verfiyId` | `verfiyId` | 核实主键 |

### 引用字段 (47个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `industry` | `industry` | `industry` | 行业ID |
| `bustype` | `bustype` | `bustype` | 申请类型id |
| `org` | `org` | `org` | 申请组织id |
| `ower` | `ower` | `ower` | 申请人员id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `apply_suppliers` | `apply_suppliers` | `applySuppliers` | 申请供应商 |
| `terminal` | `terminal` | `terminal` | 来源营销网点 |
| `task_id` | `task_id` | `taskId` | 任务 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `createOrg` | `createOrg` | `orgId` | 创建组织 |
| `oCustomerLevel_id` | `oCustomerLevel_id` | `customerLevel` | 客户级别 |
| `iCustID` | `iCustID` | `cust` | 伙伴 |
| `iChannelTypeId` | `iChannelTypeId` | `channelType` | 渠道类型 |
| `ochanncprofesssalesman` | `ochanncprofesssalesman` | `channProfessSalesman` | 渠道专管业务员 |
| `clueId` | `clueId` | `clue` | 来源线索 |
| `areaFormat` | `areaFormat` | `areaFormat` | 区域格式 |
| `businessPartner` | `businessPartner` | `businessPartner` | 业务伙伴 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `ochanncspecialmanagementdep` | `ochanncspecialmanagementdep` | `channSpecialManagementDep` | 渠道专管部门 |
| `customer` | `customer` | `customer` | 申请客户 |
| `dept` | `dept` | `dept` | 申请部门id |
| `salearea` | `salearea` | `saleArea` | 申请区域id |
| `partner` | `partner` | `partner` | 申请伙伴id |
| `regularchangecustomer` | `regularchangecustomer` | `regularchangecustomer` | 申请客户 |
| `partner_person` | `partner_person` | `partnerPerson` | 申请伙伴人员id |
| `transType` | `transType` | `transType` | 客户类型 |
| `` | `creatorId` | `creatorId` | 创建人ID |
| `partnertype` | `partnertype` | `partnerType` | 申请伙伴类型id |
| `createOrg` | `createOrg` | `createOrg` | 管理组织ID |
| `createMerchant` | `createMerchant` | `createMerchant` | 创建商家 |
| `cCountry` | `cCountry` | `country` | 国家id |
| `cInvoicingCustomers` | `cInvoicingCustomers` | `invoicingCustomers` | 开票客户id |
| `cSuppliers` | `cSuppliers` | `suppliers` | 对应供应商id |
| `orgId` | `orgId` | `internalOrgId` | 组织ID |
| `oCustomerClass_id` | `oCustomerClass_id` | `customerClass` | 客户分类ID |
| `oCustomerIndustry_id` | `oCustomerIndustry_id` | `customerIndustry` | 客户行业ID |
| `cTimeZoneId` | `cTimeZoneId` | `timeZone` | 时区id |
| `cLanguageId` | `cLanguageId` | `language` | 语言id |
| `iParentCustomer` | `iParentCustomer` | `parentCustomer` | 上级客户id |
| `oChannCustomerClass_id` | `oChannCustomerClass_id` | `channCustomerClass` | 渠道客户分类ID |
| `oChannCustomerLevel_id` | `oChannCustomerLevel_id` | `channCustomerLevel` | 渠道客户级别ID |
| `ochannCustomerArea_id` | `ochannCustomerArea_id` | `channCustomerArea` | 渠道客户区域ID |
| `ochannCustomerIndustry_id` | `ochannCustomerIndustry_id` | `channCustomerIndustry` | 渠道客户行业ID |
| `oCustomerArea_id` | `oCustomerArea_id` | `customerArea` | 销售区域ID |
| `cEnterNatureId` | `cEnterNatureId` | `enterNature` | 企业性质id |
| `cParentManageOrg` | `cParentManageOrg` | `parentManageOrg` | 上级发展组织id |
| `partner_dept` | `partner_dept` | `partnerDept` | 伙伴部门 |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `retailInvestors` | `retailInvestors` | `retailInvestors` | 散户 |
| `internalOrg` | `internalOrg` | `internalOrg` | 是否内部组织 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 枚举字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `source` | `source` | `source` | 申请来源 |
| `verifystate` | `verifystate` | `verifystate` | 审批状态 |
| `customer_source` | `customer_source` | `customerSource` | 客户来源 |
| `iCreatorType` | `iCreatorType` | `creatorType` | 创建者类型 |
| `channelCertificationStatus` | `channelCertificationStatus` | `channelCertificationStatus` | 渠道认证状态 |
| `iMerchantType` | `iMerchantType` | `merchantType` | 客户类型 |
| `iVerfyMark` | `iVerfyMark` | `verfyMark` | 核实状态 |
| `iTaxPayingCate` | `iTaxPayingCate` | `taxPayingCategories` | 纳税类别 |
| `enterpriseNature` | `enterpriseNature` | `enterpriseNature` | 企业类型 |
| `licensetype` | `licensetype` | `licenseType` | 证照类型 |
| `cScopeModel` | `cScopeModel` | `scopeModel` | 经营模式 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `status` | `status` | `status` | 状态 |
| `` | `returncount` | `returncount` | 退回次数 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `attachmentGroupId` | `attachmentGroupId` | `attachmentGroupId` | 附件分组 |
| `cPeopleNum` | `cPeopleNum` | `peopleNum` | 员工人数 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iLNG` | `iLNG` | `longitude` | 经度 |
| `iLAT` | `iLAT` | `latitude` | 纬度 |

### timestamp (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `applytime` | `applytime` | `applyTime` | 申请日期 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `cbusinessterm` | `cbusinessterm` | `businessterm` | 营业期限至 |
| `cBuildTime` | `cBuildTime` | `buildTime` | 成立时间 |

### multipleOption (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cBusinessRole` | `cBusinessRole` | `businessRole` | 业务角色 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `customerAddApplyCharacter` | `customerAddApplyCharacter` | `customerAddApplyCharacter` | 自定义项特征组 |

### multiLanguage (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cName` | `cName` | `name` | 客户名称 |
| `shortName` | `shortName` | `shortname` | 客户简称 |
| `cAddress` | `cAddress` | `address` | 详细地址 |
| `cScope` | `cScope` | `scope` | 经营范围 |

### other (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `affiliatePartnerList` | 归属伙伴 |
| `` | `` | `customerAddApplyParticipantList` | 客户申请参与人 |
| `` | `` | `customerAreas` | 申请单销售区域 |
| `` | `` | `effectiveScopes` | 生效范围 |
| `` | `` | `invoicingCustomerss` | 申请单开票客户 |
| `` | `` | `merchantAddressInfos` | 申请单地址信息 |
| `` | `` | `merchantAgentFinancialInfos` | 申请单银行信息 |
| `` | `` | `merchantAgentInvoiceInfos` | 申请单发票信息 |
| `` | `` | `merchantAppliedDetail` | 客户适用范围详情 |
| `` | `` | `merchantApplyRanges` | 客户适用范围 |
| `` | `` | `merchantCharacterEntity` | 客户基本信息特征实体 |
| `` | `` | `merchantContacterInfos` | 申请单联系人信息 |
| `` | `` | `merchantQualificationDocuments` | 客户资质文件管理 |
| `` | `` | `merchantRole` | 客户角色信息 |
| `` | `` | `merchantsManager` | 管理员 |
| `` | `` | `principals` | 申请单负责人类型 |
