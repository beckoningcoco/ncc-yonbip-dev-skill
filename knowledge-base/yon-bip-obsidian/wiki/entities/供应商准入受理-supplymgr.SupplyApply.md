---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.supplymgr.SupplyApply"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商准入受理 (`cpu-supplymgr.supplymgr.SupplyApply`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_supplyapply` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.supplymgr.SupplyApply` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商准入受理 |
| 物理表 | `cpu_supplyapply` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `34fee587-2149-45df-8513-d2f905871220` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:54.4200` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `supply_code` | `supply_code` | String | 供应商编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:45:50:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202601081236_metadata_cpu-supplymgr-supplymgr_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `a9ad68b9-7194-4753-98bc-0f3ac24b1466`

## 业务场景

- `print`
- `UITemplate`
- `DataAuth`
- `imextmp`
- `report`
- `dataPrivacy`
- `ruleengine`
- `userdefine`
- `msgtemplate`
- `api`
- `bpm`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `data_auth`, `isMain`, `doc`, `skipReferenceCheck`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 企业ID (`IEnterprise`) | `cpu-base.itf.IEnterprise` | 7 | 1 |
| 2 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 3 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |
| 4 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 5 | 统一租户接口(扩展) (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |

---

## 直接属性（共 192 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 3 | `formCode` | 单据码 | `form_code` | Integer | `int` |  | ✓ |
| 4 | `enterpriseId` | 采购商企业ID | `pur_enterprise_id` | Long | `long` | ✓ | ✓ |
| 5 | `purEnterpriseId` | 采购商企业ID | `pur_enterprise_id` | Long | `long` |  | ✓ |
| 6 | `purEnterpriseName` | 采购商企业名称 | `pur_enterprise_name` | String | `text` |  | ✓ |
| 7 | `supConOrgId` | 管理组织 | `sup_conorg_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 8 | `supConOrgName` | 管理组织名称 | `sup_conorg_name` | String | `text` |  | ✓ |
| 9 | `supplyCode` | 供应商编码 | `supply_code` | String | `text` |  | ✓ |
| 10 | `supEnterpriseId` | 供应商企业ID | `sup_enterprise_id` | Long | `long` |  | ✓ |
| 11 | `supEnterpriseName` | 供应商名称 | `sup_enterprise_name` | String | `multiLanguage` |  | ✓ |
| 12 | `supEnterpriseName2` | 供应商名称(英文) | `sup_enterprise_name2` | String | `text` |  | ✓ |
| 13 | `supEnterpriseName3` | 供应商名称(繁体中文) | `sup_enterprise_name3` | String | `text` |  | ✓ |
| 14 | `shortName` | 供应商简称 | `short_name` | String | `multiLanguage` |  | ✓ |
| 15 | `supplyDocId` | 供应商档案ID | `supply_doc_id` | Long | `long` |  | ✓ |
| 16 | `supplyType` | 供应商类型 | `supply_type` | String | `text` |  | ✓ |
| 17 | `supplyTypeCode` | 供应商类型编码 | `supply_type_code` | Short | `short` |  | ✓ |
| 18 | `settlemethod` | 结算方式 | `settle_method` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |  | ✓ |
| 19 | `bEntVerify` | 核实状态 | `bEntVerify` | Integer | `int` |  | ✓ |
| 20 | `invitation` | 供应商邀约单 | `invitation_id` | 36bcf7fc-1170-46a4-8f8d-905ab5d6fcac | `quote` |  | ✓ |
| 21 | `invitationinfo` | 供应商邀约信息 | `invitationinfo_id` | 09c74868-6530-4884-b393-18859ac5ce25 | `quote` |  | ✓ |
| 22 | `vendorip` | 供应商IP | `vendorip` | String | `text` |  | ✓ |
| 23 | `settleMethodId` | 结算方式 | `settlemethod` | String | `text` |  | ✓ |
| 24 | `isSaved` | 采购商是否保存过单据 | `isSaved` | Integer | `int` |  | ✓ |
| 25 | `shipregion` | 运输区域 | `ship_region` | 373171f0-f497-4bab-bda7-ff4b6489c13e | `quote` |  | ✓ |
| 26 | `invoiceBizType` | 开票方式 | `invoice_biz_type` | Short | `short` |  | ✓ |
| 27 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 28 | `vendorTenantId` | 供应商租户id | `vendor_tenant_id` | String | `text` |  | ✓ |
| 29 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 30 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 31 | `supSubmitterid` | 内部准入申请人id | `sup_submitterid` | String | `text` |  | ✓ |
| 32 | `bcoordination` | 协同 | `bcoordination` | Integer | `int` |  | ✓ |
| 33 | `priceTag` | 价格标识 | `price_tag` | String | `text` |  | ✓ |
| 34 | `isBizLeaderForMe` | 受理人为我 | `is_biz_leader_for_me` | Integer | `int` |  | ✓ |
| 35 | `registerCurrencyName` | 注册资金(注册资本)币种名称 | `register_currency_name` | String | `text` |  | ✓ |
| 36 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 37 | `businessStatus` | 准入状态 | `status` | String | `text` |  | ✓ |
| 38 | `entRelationUrl` | 企业关系 | `ent_relation_url` | String | `text` |  | ✓ |
| 39 | `paymentagreement` | 付款协议 | `payment_agreement` | 3cce8052-512e-4e51-9b6e-57adff40948c | `quote` |  | ✓ |
| 40 | `riskScore` | 风险得分 | `risk_score` | Decimal | `number` |  | ✓ |
| 41 | `bussinessSector` | 业务板块 | `bussiness_sector` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a | `quote` |  | ✓ |
| 42 | `snapshotLink` | 快照链接 | `snapshot_link` | String | `text` |  | ✓ |
| 43 | `transType` | 供应商准入交易类型 | `transType` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 44 | `region` | 注册地区名称 | `region` | String | `text` |  | ✓ |
| 45 | `remark` | 备注 | `remark` | String | `multiLanguage` |  | ✓ |
| 46 | `creditServiceDay` | 账期天数(原信用期限) | `credit_service_day` | Long | `long` |  | ✓ |
| 47 | `admittanceSet` | 准入设置 | `admittance_set_id` | d66c2bff-f84a-45fb-bc7b-c3aaa8228b4c | `quote` |  | ✓ |
| 48 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | ✓ |
| 49 | `exchangeratetype` | 汇率类型 | `exchange_rate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |  | ✓ |
| 50 | `isMddApprove` | 是否MDD云审提交过。用于区分是否MDD云审单据。 | `isMddApprove` | Integer | `int` |  | ✓ |
| 51 | `supplyClassId` | 供应商分类ID | `supply_class_id` | 59ec0b4d-4e38-483d-9bdd-e7aa44176ce8 | `quote` |  | ✓ |
| 52 | `supplyClassName` | 供应商分类名称 | `supply_class_name` | String | `text` |  | ✓ |
| 53 | `countryId` | 国家ID | `country_id` | Long | `long` |  | ✓ |
| 54 | `countryName` | 国家名称 | `country_name` | String | `text` |  | ✓ |
| 55 | `platCountryCode` | 国家编码 | `plat_country_code` | String | `text` |  | ✓ |
| 56 | `platCountryId` | 国家地区ID | `plat_country_id` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |  | ✓ |
| 57 | `provinceId` | 注册地省 | `province_id` | Long | `long` |  | ✓ |
| 58 | `registerAddress` | 注册地址 | `register_address` | String | `text` |  | ✓ |
| 59 | `cityId` | 企业注册地市 | `city_id` | Long | `long` |  | ✓ |
| 60 | `districtId` | 企业注册地区ID | `district_id` | Long | `long` |  | ✓ |
| 61 | `regionCode` | 注册地区ID | `region_code` | String | `text` |  | ✓ |
| 62 | `address` | 注册地址 | `address` | String | `text` |  | ✓ |
| 63 | `entNature` | 企业性质 | `ent_nature` | String | `text` |  | ✓ |
| 64 | `registerCurrency` | 注册资本币种ID | `register_currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 65 | `registerFund` | 注册资本 | `register_fund` | Decimal | `number` |  | ✓ |
| 66 | `artificialPsn` | 法定代表人 | `artificial_psn` | String | `text` |  | ✓ |
| 67 | `artificialPsnPhone` | 法人代表手机 | `artificial_psn_phone` | String | `text` |  | ✓ |
| 68 | `linkman` | 联系人名称 | `linkman` | String | `text` |  | ✓ |
| 69 | `phone` | 电话 | `phone` | String | `text` |  | ✓ |
| 70 | `email` | 电子邮箱 | `email` | String | `text` |  | ✓ |
| 71 | `fax` | 传真 | `fax` | String | `text` |  | ✓ |
| 72 | `mobile` | 联系电话 | `mobile` | String | `text` |  | ✓ |
| 73 | `zipcode` | 邮编 | `zipcode` | String | `text` |  | ✓ |
| 74 | `paperType` | 证件类型 | `paper_type` | String | `text` |  | ✓ |
| 75 | `creditCode` | 证照号码 | `credit_code` | String | `text` |  | ✓ |
| 76 | `licenseType` | 证照类型 | `license_type` | String | `text` |  | ✓ |
| 77 | `basisCurrency` | 注册资金本币类别 | `basis_currency` | String | `text` |  | ✓ |
| 78 | `originalCurrency` | 注册资金币别 | `original_currency` | String | `text` |  | ✓ |
| 79 | `registerMny` | 注册资金 | `register_mny` | String | `text` |  | ✓ |
| 80 | `registerMnyCurrency` | 注册资金本币 | `register_mny_currency` | String | `text` |  | ✓ |
| 81 | `supplyCategorys` | 供应品类 | `supply_categorys` | String | `text` |  | ✓ |
| 82 | `taxType` | 纳税规模 | `tax_type` | String | `text` |  | ✓ |
| 83 | `language` | 语言ID | `language` | a014aa1b-1f14-4d31-88fb-dcce538d9973 | `quote` |  | ✓ |
| 84 | `timeZone` | 时区ID | `time_zone` | String | `text` |  | ✓ |
| 85 | `invoiceVendor` | 开票供应商ID | `invoice_vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 86 | `invoiceVendorName` | 开票名称 | `invoice_vendor_name` | String | `text` |  | ✓ |
| 87 | `taxRate` | 开票税率ID | `tax_rate` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |  | ✓ |
| 88 | `ycnCode` | YCN编码 | `ycn_code` | String | `text` |  | ✓ |
| 89 | `entType` | 企业类型 | `ent_type` | String | `multipleOption` |  | ✓ |
| 90 | `entProfile` | 企业介绍 | `ent_profile` | String | `text` |  | ✓ |
| 91 | `entProfileFilePath` | 企业介绍附件 | `ent_profile_filepath` | String | `text` |  | ✓ |
| 92 | `foundDate` | 成立日期 | `found_date` | DateTime | `timestamp` |  | ✓ |
| 93 | `busPerformance` | 经营业绩 | `bus_performance` | String | `text` |  | ✓ |
| 94 | `busPerformanceFilePath` | 经营业绩附件 | `bus_performance_filepath` | String | `text` |  | ✓ |
| 95 | `capacity` | 产能/供货能力 | `capacity` | String | `text` |  | ✓ |
| 96 | `memo` | 其他说明信息 | `memo` | String | `text` |  | ✓ |
| 97 | `cooperationTime` | 首次合作日期 | `cooperation_time` | Date | `date` |  | ✓ |
| 98 | `investigationNotes` | 考察情况说明 | `investigation_notes` | String | `text` |  | ✓ |
| 99 | `investigationFilePath` | 考察报告附件 | `investigation_filepath` | String | `text` |  | ✓ |
| 100 | `serviceRange` | 经营范围 | `service_range` | String | `text` |  | ✓ |
| 101 | `taxPayingCategories` | 纳税类别 | `tax_pay_category` | Short | `short` |  | ✓ |
| 102 | `trade` | 所属行业 | `trade` | Short | `short` |  | ✓ |
| 103 | `vendorAddress` | 通信地址 | `vendor_address` | String | `text` |  | ✓ |
| 104 | `vendorPhone` | 固定电话 | `vendor_phone` | String | `text` |  | ✓ |
| 105 | `vendorWebUrl` | 网站地址 | `vendor_web_url` | String | `text` |  | ✓ |
| 106 | `vendorZipCode` | 邮政编码 | `vendor_zip_code` | String | `text` |  | ✓ |
| 107 | `wechatPublicAccount` | 微信公众号 | `wechat_public_account` | String | `text` |  | ✓ |
| 108 | `applySource` | 供应商来源 | `apply_source` | String | `text` |  | ✓ |
| 109 | `currency` | 交易币种ID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 110 | `shipvia` | 发运方式ID | `shipvia_id` | aa2f6845-347d-499f-a5b2-964b84747d99 | `quote` |  | ✓ |
| 111 | `filepath1` | 附件1 | `filepath1` | String | `text` |  | ✓ |
| 112 | `filepath2` | 附件2 | `filepath2` | String | `text` |  | ✓ |
| 113 | `filepath3` | 附件3 | `filepath3` | String | `text` |  | ✓ |
| 114 | `filepath4` | 附件4 | `filepath4` | String | `text` |  | ✓ |
| 115 | `filepath5` | 附件5 | `filepath5` | String | `text` |  | ✓ |
| 116 | `filepath6` | 附件6 | `filepath6` | String | `text` |  | ✓ |
| 117 | `filepath7` | 附件7 | `filepath7` | String | `text` |  | ✓ |
| 118 | `filepath8` | 附件8 | `filepath8` | String | `text` |  | ✓ |
| 119 | `mergedEnterpriseName` | 合并供应商名称 | `merged_enterprise_name` | String | `text` |  | ✓ |
| 120 | `mergedSupConOrgName` | 合并供应商管理组织 | `merged_sup_con_org_name` | String | `text` |  | ✓ |
| 121 | `ERPStatus` | 推送ERP状态 | `ERP_Status` | String | `text` |  | ✓ |
| 122 | `acceptancePeriod` | 账期天数 | `acceptance_period` | Long | `long` |  | ✓ |
| 123 | `applyDate` | 申请日期 | `apply_date` | DateTime | `timestamp` |  | ✓ |
| 124 | `createTime` | 单据创建日期 | `createtime` | DateTime | `timestamp` |  | ✓ |
| 125 | `supApplyChannel` | 申请渠道 | `sup_apply_channel` | String | `text` |  | ✓ |
| 126 | `supSubmitter` | 供应商提单人 | `sup_submitter` | String | `text` |  | ✓ |
| 127 | `purSubmitter` | 采购商提单人 | `pur_submitter` | String | `text` |  | ✓ |
| 128 | `supMgrOrgName` | 受理组织名称 | `sup_mgrorg_name` | String | `text` |  | ✓ |
| 129 | `userId` | 提交云审用户 | `user_id` | Long | `long` |  | ✓ |
| 130 | `userLoginName` | 提交云审用户登陆名 | `user_login_name` | String | `text` |  | ✓ |
| 131 | `userOrgId` | 提交人组织Id | `user_org_id` | String | `text` |  | ✓ |
| 132 | `rejectReason` | 驳回原因 | `reject_reason` | String | `text` |  | ✓ |
| 133 | `approveDate` | 审核时间 | `approve_date` | DateTime | `timestamp` |  | ✓ |
| 134 | `approveOrgId` | 审核组织ID | `approve_org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 135 | `supMgrOrgId` | 受理组织 | `sup_mgrorg_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 136 | `approveOrgName` | 审核组织名称 | `approve_org_name` | String | `text` |  | ✓ |
| 137 | `approveStatus` | 审批状态 | `approve_status` | String | `text` |  | ✓ |
| 138 | `approverCode` | 审核人编码 | `approver_code` | String | `text` |  | ✓ |
| 139 | `approverId` | 审核人ID | `approver_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 140 | `approverName` | 审计信息审核人名称 | `approver_name` | String | `text` |  | ✓ |
| 141 | `finalApproveTime` | 最终审批时间 | `final_approve_time` | DateTime | `timestamp` |  | ✓ |
| 142 | `finalApproveUser` | 最终审批人 | `final_approve_user` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 143 | `isApprove` | 是否审批 | `is_approve` | Long | `long` |  | ✓ |
| 144 | `isTempSave` | 记录暂存状态 | `is_temp_save` | String | `text` |  | ✓ |
| 145 | `busLicenceNum` | 营业执照号 | `bus_licence_num` | String | `text` |  | ✓ |
| 146 | `bank` | 开户银行 | `bank` | String | `text` |  | ✓ |
| 147 | `bankAccountLink` | 银行联行号 | `bank_account_link` | String | `text` |  | ✓ |
| 148 | `accountName` | 银行账号名称 | `account_name` | String | `text` |  | ✓ |
| 149 | `bankAcount` | 银行账号 | `bank_acount` | String | `text` |  | ✓ |
| 150 | `bankAcountOwner` | 银行账号开户人 | `bank_acount_owner` | String | `text` |  | ✓ |
| 151 | `bankCode` | 银行编号 | `bank_code` | String | `text` |  | ✓ |
| 152 | `bankCurrency` | 默认银行币种ID | `bank_currency` | String | `text` |  | ✓ |
| 153 | `bankCurrencyName` | 默认银行币种名称 | `bank_currency_name` | String | `text` |  | ✓ |
| 154 | `busCertificate` | 经营许可证 | `bus_certificate` | String | `text` |  | ✓ |
| 155 | `organizationCode` | 组织机构代码 | `organization_code` | String | `text` |  | ✓ |
| 156 | `bankIbanCode` | 默认银行IBAN码 | `bank_ibancode` | String | `text` |  | ✓ |
| 157 | `taxRegistration` | 税务登记证 | `tax_registration` | String | `text` |  | ✓ |
| 158 | `bankId` | 开户银行ID | `bank_id` | String | `text` |  | ✓ |
| 159 | `mergedEnterpriseCode` | 合并供应商编码 | `merged_enterprise_code` | String | `text` |  | ✓ |
| 160 | `bankSwiftCode` | 默认银行SWIFT码 | `bank_swiftcode` | String | `text` |  | ✓ |
| 161 | `bankType` | 银行类别 | `bank_type` | String | `text` |  | ✓ |
| 162 | `bankTypeName` | 银行类别名称 | `bank_type_name` | String | `text` |  | ✓ |
| 163 | `status` | 单据状态 | `vouch_status` | Integer | `int` |  | ✓ |
| 164 | `buyerTenantId` | 跨租户采购商ID | `buyer_tenant_id` | String | `text` |  | ✓ |
| 165 | `customCategory1Id` | 自定义供应商分类1ID | `custom_category1_id` | Long | `long` |  | ✓ |
| 166 | `customCategory1Name` | 自定义供应商分类1名称 | `custom_category1_name` | String | `text` |  | ✓ |
| 167 | `customCategory2Id` | 自定义供应商分类2ID | `custom_category2_id` | Long | `long` |  | ✓ |
| 168 | `customCategory2Name` | 自定义供应商分类2名称 | `custom_category2_name` | String | `text` |  | ✓ |
| 169 | `bankCountry` | 威立雅银行国家 | `bank_country` | String | `text` |  | ✓ |
| 170 | `bnppPaymentTypeName` | 法巴银行付款类型名称 | `bnpp_payment_type_name` | String | `text` |  | ✓ |
| 171 | `cheque` | 支票 | `cheque` | String | `text` |  | ✓ |
| 172 | `defineId` | 默认银行自定义子表ID | `defineid` | Long | `long` |  | ✓ |
| 173 | `isSuperviseApprove` | 是否需要合规部审批 | `is_superviseapprove` | String | `text` |  | ✓ |
| 174 | `toThirdSystem` | 威立雅同步到第三方系统标识 | `to_third_system` | String | `text` |  | ✓ |
| 175 | `bnppPaymentType` | 法巴银行付款类型 | `bnpp_payment_type` | String | `text` |  | ✓ |
| 176 | `supEnglishName` | 供应商英文名称 | `sup_englishname` | String | `text` |  | ✓ |
| 177 | `receiptEmail` | 收款邮箱 | `receipt_email` | String | `text` |  | ✓ |
| 178 | `settleMethodCode` | 结算方式编码 | `settlemethod_code` | String | `text` |  | ✓ |
| 179 | `settleMethodName` | 结算方式名称 | `settlemethod_name` | String | `text` |  | ✓ |
| 180 | `userDefineCharacter` | 供应商准入审核单自定义项 | `user_define_character` | 4b68205e-8016-465b-a25b-a59afb326c83 | `UserDefine` |  | ✓ |
| 181 | `ts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 182 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 183 | `addressinfo` | 供应商准入受理地址信息 | `` | e700eb3b-35e0-48a5-afbb-542ae5d20a95 | `` |  |  |
| 184 | `banks` | 供应商准入受理银行信息 | `` | 26004e51-73f8-45ae-a702-4183d05671a0 | `` |  |  |
| 185 | `businessmanagers` | 供应商准入受理业务受理人 | `` | e92d2abb-a1af-4d7d-9b39-1d9274226975 | `` |  |  |
| 186 | `category` | 供应商准入受理主供分类 | `` | 1484b573-eb5d-4648-be7d-e344b0532b87 | `` |  |  |
| 187 | `defines` | 供应商准入准入受理自定义项 | `` | cf82243d-5333-4010-b2ca-51f0d7b7b563 | `` |  |  |
| 188 | `invitationPromoter` | 邀请人 | `invitation_promoter` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 189 | `linkmanPOJOList` | 供应商准入受理联系人信息 | `` | 99d79834-9e9f-4d9b-9e7c-bcacc16cabcc | `` |  |  |
| 190 | `qualifys` | 供应商准入受理资质信息 | `` | 58446b66-fb54-4666-a241-f087f43ad813 | `` |  |  |
| 191 | `submitUser` | 提单人 | `submit_user` | String | `text` |  | ✓ |
| 192 | `vendorOrgs` | 供应商准入受理适用范围 | `` | a47f1095-f5b7-4c13-af00-eb3e4c959996 | `` |  |  |

---

## 关联属性（共 33 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `qualifys` | 供应商准入受理资质信息 | `cpu-supplymgr.supplymgr.SupplyApplyQualify` | `` | qualifys → supplyApplyId | 0..n | true | None |  |
| 2 | `userDefineCharacter` | 供应商准入审核单自定义项 | `cpu-supplymgr.supplymgr.SupplyApplyUserDefineCharacter` | `user_define_character` |  →  |  |  | None |  |
| 3 | `invoiceVendor` | 开票供应商ID | `aa.vendor.Vendor` | `invoice_vendor` |  →  |  |  | Service |  |
| 4 | `settlemethod` | 结算方式 | `aa.settlemethod.SettleMethod` | `settle_method` |  →  |  |  | Service |  |
| 5 | `businessmanagers` | 供应商准入受理业务受理人 | `cpu-supplymgr.supplymgr.SupplyApplyBusinessmanager` | `` | businessmanagers → supplyApplyId | 0..n | true | None |  |
| 6 | `language` | 语言ID | `bd.timezonelanguage.LanguageVO` | `language` |  →  |  |  | Service |  |
| 7 | `invitationinfo` | 供应商邀约信息 | `cpu-supplymgr.invitation.InvitationInfo` | `invitationinfo_id` |  →  |  |  | None |  |
| 8 | `defines` | 供应商准入准入受理自定义项 | `cpu-supplymgr.supplymgr.SupplyApplyDefine` | `` | defines → id | 1 | true | None | ⚠️ |
| 9 | `admittanceSet` | 准入设置 | `cpu-supplymgr.applyset.AdmittanceSet` | `admittance_set_id` |  →  |  |  | None |  |
| 10 | `registerCurrency` | 注册资本币种ID | `bd.currencytenant.CurrencyTenantVO` | `register_currency` |  →  |  |  | Service |  |
| 11 | `addressinfo` | 供应商准入受理地址信息 | `cpu-supplymgr.supplymgr.SupplyApplyAddress` | `` | addressinfo → supplyApplyId | 0..n | true | None |  |
| 12 | `vendorOrgs` | 供应商准入受理适用范围 | `cpu-supplymgr.supplymgr.SupplyApplyVendorOrg` | `` | vendorOrgs → supplyApplyId | 0..n | true | None |  |
| 13 | `shipregion` | 运输区域 | `base.shipregion.ShipRegion` | `ship_region` |  →  |  |  | Service |  |
| 14 | `currency` | 交易币种ID | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |  →  |  |  | Service |  |
| 15 | `paymentagreement` | 付款协议 | `bd.payments.PayAgreement` | `payment_agreement` |  →  |  |  | Service |  |
| 16 | `supMgrOrgId` | 受理组织 | `bd.adminOrg.BaseOrgVO` | `sup_mgrorg_id` |  →  |  |  | Service |  |
| 17 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 18 | `banks` | 供应商准入受理银行信息 | `cpu-supplymgr.supplymgr.SupplyApplyBank` | `` | banks → supplyApplyId | 0..n | true | None |  |
| 19 | `approverId` | 审核人ID | `bd.staff.Staff` | `approver_id` |  →  |  |  | Service |  |
| 20 | `invitation` | 供应商邀约单 | `cpu-supplymgr.invitation.Invitation` | `invitation_id` |  →  |  |  | None |  |
| 21 | `bussinessSector` | 业务板块 | `bctask.basedoc.CustomerDocVO` | `bussiness_sector` |  →  |  |  | Service |  |
| 22 | `platCountryId` | 国家地区ID | `bd.country.CountryVO` | `plat_country_id` |  →  |  |  | Service |  |
| 23 | `supplyClassId` | 供应商分类ID | `aa.vendorclass.VendorClass` | `supply_class_id` |  →  |  |  | Service |  |
| 24 | `supConOrgId` | 管理组织 | `bd.adminOrg.BaseOrgVO` | `sup_conorg_id` |  →  |  |  | Service |  |
| 25 | `invitationPromoter` | 邀请人 | `bd.staff.Staff` | `invitation_promoter` |  →  |  |  | Service |  |
| 26 | `approveOrgId` | 审核组织ID | `bd.adminOrg.BaseOrgVO` | `approve_org_id` |  →  |  |  | Service |  |
| 27 | `taxRate` | 开票税率ID | `archive.taxArchives.TaxRateArchive` | `tax_rate` |  →  |  |  | Service |  |
| 28 | `shipvia` | 发运方式ID | `aa.sendtrans.SendTransWay` | `shipvia_id` |  →  |  |  | Service |  |
| 29 | `finalApproveUser` | 最终审批人 | `base.user.BipUser` | `final_approve_user` |  →  |  |  | Service |  |
| 30 | `transType` | 供应商准入交易类型 | `bd.bill.TransType` | `transType` |  →  |  |  | Service |  |
| 31 | `exchangeratetype` | 汇率类型 | `bd.exchangeRate.ExchangeRateTypeVO` | `exchange_rate_type` |  →  |  |  | Service |  |
| 32 | `category` | 供应商准入受理主供分类 | `cpu-supplymgr.supplymgr.SupplyApplyCategory` | `` | category → supplyApplyId | 0..n | true | None |  |
| 33 | `linkmanPOJOList` | 供应商准入受理联系人信息 | `cpu-supplymgr.supplymgr.SupplyApplyLinkmanPOJO` | `` | linkmanPOJOList → supplyApplyId | 0..n | true | None |  |

### Composition（子表）

- **qualifys**: `qualifys` → `cpu-supplymgr.supplymgr.SupplyApplyQualify` | 0..n
- **businessmanagers**: `businessmanagers` → `cpu-supplymgr.supplymgr.SupplyApplyBusinessmanager` | 0..n
- **defines**: `defines` → `cpu-supplymgr.supplymgr.SupplyApplyDefine` | 1 ⚠️ 已废弃
- **addressinfo**: `addressinfo` → `cpu-supplymgr.supplymgr.SupplyApplyAddress` | 0..n
- **vendorOrgs**: `vendorOrgs` → `cpu-supplymgr.supplymgr.SupplyApplyVendorOrg` | 0..n
- **banks**: `banks` → `cpu-supplymgr.supplymgr.SupplyApplyBank` | 0..n
- **category**: `category` → `cpu-supplymgr.supplymgr.SupplyApplyCategory` | 0..n
- **linkmanPOJOList**: `linkmanPOJOList` → `cpu-supplymgr.supplymgr.SupplyApplyLinkmanPOJO` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `invoiceVendor` (开票供应商ID) | `aa.vendor.Vendor` | `invoice_vendor` |
| `settlemethod` (结算方式) | `aa.settlemethod.SettleMethod` | `settle_method` |
| `language` (语言ID) | `bd.timezonelanguage.LanguageVO` | `language` |
| `registerCurrency` (注册资本币种ID) | `bd.currencytenant.CurrencyTenantVO` | `register_currency` |
| `shipregion` (运输区域) | `base.shipregion.ShipRegion` | `ship_region` |
| `currency` (交易币种ID) | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |
| `paymentagreement` (付款协议) | `bd.payments.PayAgreement` | `payment_agreement` |
| `supMgrOrgId` (受理组织) | `bd.adminOrg.BaseOrgVO` | `sup_mgrorg_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `approverId` (审核人ID) | `bd.staff.Staff` | `approver_id` |
| `bussinessSector` (业务板块) | `bctask.basedoc.CustomerDocVO` | `bussiness_sector` |
| `platCountryId` (国家地区ID) | `bd.country.CountryVO` | `plat_country_id` |
| `supplyClassId` (供应商分类ID) | `aa.vendorclass.VendorClass` | `supply_class_id` |
| `supConOrgId` (管理组织) | `bd.adminOrg.BaseOrgVO` | `sup_conorg_id` |
| `invitationPromoter` (邀请人) | `bd.staff.Staff` | `invitation_promoter` |
| `approveOrgId` (审核组织ID) | `bd.adminOrg.BaseOrgVO` | `approve_org_id` |
| `taxRate` (开票税率ID) | `archive.taxArchives.TaxRateArchive` | `tax_rate` |
| `shipvia` (发运方式ID) | `aa.sendtrans.SendTransWay` | `shipvia_id` |
| `finalApproveUser` (最终审批人) | `base.user.BipUser` | `final_approve_user` |
| `transType` (供应商准入交易类型) | `bd.bill.TransType` | `transType` |
| `exchangeratetype` (汇率类型) | `bd.exchangeRate.ExchangeRateTypeVO` | `exchange_rate_type` |
