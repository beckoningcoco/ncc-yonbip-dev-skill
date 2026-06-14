---
tags: [BIP, 元数据, 数据字典, aa.vendor.Vendor]
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

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_vendor` | domain：`yssupplier` | 应用：`DPMSPL` | 业务对象ID：`e56acd7d-c869-426e-8fac-9b1dbac0cd94`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商 |
| 物理表 | `aa_vendor` |
| domain/服务域 | `yssupplier` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `DPMSPL` |
| 直连字段 | 116 个 |
| 子表 | 9 个 |
| 关联引用 | 28 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `vendorQualifies` | `aa.vendor.VendorQualify` | composition |
| `vendorOrgs` | `aa.vendor.VendorOrg` | composition |
| `vendorcontactss` | `aa.vendor.VendorContacts` | composition |
| `customItems` | `aa.vendor.VendorCustomItem` | composition |
| `vendorApplyRange` | `aa.vendor.VendorOrg` | composition |
| `vendorDefine` | `aa.vendor.VendorDefine` | composition |
| `vendorextends` | `aa.vendor.VendorExtend` | composition |
| `vendorbanks` | `aa.vendor.VendorBank` | composition |
| `vendorAddresses` | `aa.vendor.VendorAddress` | composition |

## 关联引用 (28个)

| 字段名 | 引用类型 |
|--------|---------|
| `iCountryId` | `ucfbasedoc.bd_countryref` |
| `` | `` |
| `businessPartner` | `productcenter.base_businesspartnerref` |
| `crowd` | `` |
| `cLanguageId` | `ucfbasedoc.bd_languageref` |
| `nRelationEnterpriseId` | `cpu-pubapp.cpu_enterprise_ref_list` |
| `iOrgId` | `yssupplier.aa_adminorgref` |
| `register_currency` | `ucfbasedoc.bd_currencytenantref` |
| `basis_currency` | `ucfbasedoc.bd_currencytenantref` |
| `tenant_id` | `` |
| `ytenant_id` | `` |
| `iCorrespondingCustId` | `productcenter.aa_merchantinorganizationref` |
| `iclass_id` | `yssupplier.aa_vendorclassificationref` |
| `transType` | `transtype.bd_billtyperef` |
| `iCorrespondingOrgId` | `ucf-org-center.org_fun_filter_list_ref` |
| `iParentVendor` | `yssupplier.aa_vendorCreatorref` |
| `vendorCharacterDefine` | `` |
| `iCustID` | `productcenter.aa_merchantinorganizationref` |
| `iTaxItems` | `yonbip-fi-taxpubdoc.RefTable_839443ba26` |

## 继承接口 (4个, 6字段)

- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 116 个直连字段

### 文本字段 (52个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 供应商编码 |
| `nameAlias` | `nameAlias` | `nameAlias` | 供应商别名 |
| `cTimeZoneId` | `cTimeZoneId` | `timeZone` | 时区主键 |
| `epCompanyId` | `epCompanyId` | `epCompanyId` | 企业画像企业id |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源id |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `license_type` | `license_type` | `licenseType` | 证照类型 |
| `cCreditCode` | `cCreditCode` | `creditcode` | 证照号码 |
| `cCompanyType` | `cCompanyType` | `companytype` | 企业类型 |
| `legalbody` | `legalbody` | `legalBody` | 法定代表人 |
| `cContactPhone` | `cContactPhone` | `contactphone` | 联系电话 |
| `cRegionCode` | `cRegionCode` | `regionCode` | 注册地区编码 |
| `cVendorRegisterAddress` | `cVendorRegisterAddress` | `address` | 注册地址 |
| `service_range` | `service_range` | `serviceRange` | 经营范围 |
| `cVendorPhone` | `cVendorPhone` | `vendorphone` | 固定电话 |
| `cVendorAddress` | `cVendorAddress` | `vendoraddress` | 通信地址 |
| `cVendorZipCode` | `cVendorZipCode` | `vendorzipcode` | 邮政编码 |
| `cVendorEmail` | `cVendorEmail` | `vendoremail` | 电子邮箱 |
| `cWechatPublicAccount` | `cWechatPublicAccount` | `wechatpublicaccount` | 微信公众号 |
| `vendor_fax` | `vendor_fax` | `vendorfax` | 传真 |
| `extsystemmemberid` | `extsystemmemberid` | `extSystemMemberId` | 来源系统主键 |
| `cDataSource` | `cDataSource` | `datasource` | 档案来源 |
| `cRelationTenantId` | `cRelationTenantId` | `relationTenantId` | 关联租户主键 |
| `ycn_code` | `ycn_code` | `ycnCode` | YCN码 |
| `relation_tenant_usercode` | `relation_tenant_usercode` | `relationTenantUserCode` | 账号 |
| `tenant_error_msg` | `tenant_error_msg` | `tenantErrorMsg` | 生成租户失败原因 |
| `cErpCode` | `cErpCode` | `erpCode` | ERP编码 |
| `apply_source` | `apply_source` | `applySource` | 供应商来源 |
| `capacity` | `capacity` | `capacity` | 产能/供货能力 |
| `investigation_notes` | `investigation_notes` | `investigationNotes` | 考察情况说明 |
| `ent_profile` | `ent_profile` | `entProfile` | 企业介绍 |
| `bus_performance` | `bus_performance` | `busPerformance` | 经营业绩 |
| `ent_profile_filepath` | `ent_profile_filepath` | `entProfileFilePath` | 企业介绍附件 |
| `bus_performance_filepath` | `bus_performance_filepath` | `busPerformanceFilePath` | 经营业绩附件 |
| `investigation_filepath` | `investigation_filepath` | `investigationFilePath` | 考察报告附件 |
| `cYhtTenant` | `cYhtTenant` | `yhttenant` | 对应企业主键 |
| `re_reject` | `re_reject` | `reReject` | 二次审核驳回原因 |
| `re_reject_person` | `re_reject_person` | `reRejectPerson` | 二次审核驳回人 |
| `cTransactions` | `cTransactions` | `transactions` | 交易方式 |
| `cContact` | `cContact` | `contact` | 联系人 |
| `cContactMobile` | `cContactMobile` | `contactmobile` | 移动电话 |
| `vendor_web_url` | `vendor_web_url` | `vendorWebUrl` | 网站地址 |
| `cRemark` | `cRemark` | `remark` | 备注 |
| `ecotypesincevfive` | `ecotypesincevfive` | `ecotypesincevfive` | 经济类型 |
| `filepath1` | `filepath1` | `filepath1` | 附件1 |
| `filepath2` | `filepath2` | `filepath2` | 附件2 |
| `filepath3` | `filepath3` | `filepath3` | 附件3 |
| `filepath4` | `filepath4` | `filepath4` | 附件4 |
| `filepath5` | `filepath5` | `filepath5` | 附件5 |
| `filepath6` | `filepath6` | `filepath6` | 附件6 |
| `filepath7` | `filepath7` | `filepath7` | 附件7 |
| `filepath8` | `filepath8` | `filepath8` | 附件8 |

### 引用字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iOrgId` | `iOrgId` | `org` | 管理组织主键 |
| `iclass_id` | `iclass_id` | `vendorclass` | 所属分类主键 |
| `iCountryId` | `iCountryId` | `country` | 国家地区主键 |
| `cLanguageId` | `cLanguageId` | `language` | 语言主键 |
| `crowd` | `crowd` | `crowd` | 组织群 |
| `transType` | `transType` | `transType` | 交易类型 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `iCorrespondingOrgId` | `iCorrespondingOrgId` | `correspondingorg` | 对应组织主键 |
| `iCorrespondingCustId` | `iCorrespondingCustId` | `correspondingcust` | 对应客户主键 |
| `iParentVendor` | `iParentVendor` | `parentVendor` | 上级供应商主键 |
| `businessPartner` | `businessPartner` | `businessPartner` | 业务伙伴ID |
| `register_currency` | `register_currency` | `registerCurrency` | 注册资本币种主键 |
| `basis_currency` | `basis_currency` | `basisCurrency` | 注册资本币种主键(本币) |
| `nRelationEnterpriseId` | `nRelationEnterpriseId` | `relationEnterpriseId` | 关联企业主键 |
| `iOrgId` | `iOrgId` | `orgId` | 创建组织id |
| `iCustID` | `iCustID` | `cust` | 所属商家主键 |
| `iTaxItems` | `iTaxItems` | `taxitems` | 税目 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCooperationDate` | `cCooperationDate` | `cooperationdate` | 首次合作日期 |
| `re_reject_date` | `re_reject_date` | `reRejectDate` | 二次审核驳回日期 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `retailInvestors` | `retailInvestors` | `retailInvestors` | 散户 |
| `sync_erp_flag` | `sync_erp_flag` | `syncErpFlag` | 是否同步ERP |
| `bFreezeStatus` | `bFreezeStatus` | `freezestatus` | 冻结状态 |
| `bInternalUnit` | `bInternalUnit` | `internalunit` | 是否内部单位 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `insuredNum` | `insuredNum` | `insuredNum` | 参保人数 |
| `bEntVerify` | `bEntVerify` | `bEntVerify` | 核实状态 |
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |
| `bcoordination` | `bcoordination` | `bcoordination` | 是否协同 |
| `finance_access_status` | `finance_access_status` | `financeAccessStatus` | 供应链金融开通状态 |
| `re_reject_status` | `re_reject_status` | `reRejectStatus` | 二次审核驳回状态 |

### 短整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `supply_type` | `supply_type` | `supplyType` | 供应商类型 |
| `trade` | `trade` | `trade` | 所属行业 |
| `extsystemcode` | `extsystemcode` | `extSystemCode` | 来源系统编码 |
| `cAccessStatus` | `cAccessStatus` | `accessstatus` | 准入状态 |
| `mgt_type` | `mgt_type` | `mgtType` | 管理方式 |
| `dr` | `dr` | `dr` | 删除标识 |

### 长整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 供应商档案主键 |
| `cRegion` | `cRegion` | `region` | 注册地区 |
| `supplyapply_id` | `supplyapply_id` | `supplyApplyId` | 准入申请单id |
| `channel_id` | `channel_id` | `channelId` | 供应商渠道 |
| `custom_category1_id` | `custom_category1_id` | `customCategory1Id` | 自定义等级1 |
| `custom_category2_id` | `custom_category2_id` | `customCategory2Id` | 自定义等级2 |
| `ent_relationship_id` | `ent_relationship_id` | `entRelationshipId` | 关系表id |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `paidFund` | `paidFund` | `paidFund` | 实缴资金 |
| `registerfund` | `registerfund` | `registerFund` | 注册资本 |
| `basis_currency_registerfund` | `basis_currency_registerfund` | `basisCurrencyRegisterfund` | 注册资本(本币) |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 供应商名称 |

### other (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iTaxPayingCate` | `iTaxPayingCate` | `taxPayingCategories` | 纳税类别 |
| `iCreatorType` | `iCreatorType` | `creatorType` | 创建者类型 |
| `` | `` | `customItems` | 供应商属性 |
| `` | `` | `vendorAddresses` | 供应商地址 |
| `` | `` | `vendorApplyRange` | 适用范围-弃用 |
| `` | `` | `vendorDefine` | 供应商自定义项 |
| `` | `` | `vendorOrgs` | 适用范围-弃用 |
| `` | `` | `vendorQualifies` | 供应商资质 |
| `` | `` | `vendorbanks` | 供应商银行 |
| `` | `` | `vendorcontactss` | 供应商联系人 |
| `` | `` | `vendorextends` | 供应商业务属性(管理组织) |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `apply_date` | `apply_date` | `applyDate` | 申请时间 |
| `approve_date` | `approve_date` | `approveDate` | 审批时间 |
| `found_date` | `found_date` | `foundDate` | 成立日期 |
| `sync_erp_time` | `sync_erp_time` | `syncErpTime` | 同步ERP时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vendorCharacterDefine` | `vendorCharacterDefine` | `vendorCharacterDefine` | 供应商自定义项 |
