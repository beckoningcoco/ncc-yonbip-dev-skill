---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.supplychange.SupplyChange"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 供应商变更受理 (`cpu-supplymgr.supplychange.SupplyChange`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_supplychange` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.supplychange.SupplyChange` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商变更受理 |
| 物理表 | `cpu_supplychange` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `37b4d01f-87e3-4040-83b8-138f7d0b6094` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:52.8060` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 变更单适用范围id |
| 编码 | `supply_change_code` | `supply_change_code` | String | 供应商变更审核单编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:43:54:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202512232026_metadata_cpu-supplymgr-supplychange_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `2ed8563a-d4d8-4472-b105-5222aa8f898d`

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

`BusinessData`, `data_auth`, `doc`

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

## 直接属性（共 142 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | 变更单适用范围id | `id` | Long | `long` |  | ✓ |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 3 | `formCode` | 单据码。特定单据标识使用。例如:1:MDD单据 | `form_code` | Integer | `int` |  | ✓ |
| 4 | `enterpriseId` | 采购商企业id | `pur_enterprise_id` | Long | `long` | ✓ | ✓ |
| 5 | `purEnterpriseName` | 采购商名称 | `pur_enterprise_name` | String | `text` |  | ✓ |
| 6 | `supConOrgId` | 管理组织 | `sup_conorg_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 7 | `supConOrgName` | 管理组织名称 | `sup_conorg_name` | String | `text` |  | ✓ |
| 8 | `supEnterpriseId` | 供应商企业id | `sup_enterprise_id` | Long | `long` |  | ✓ |
| 9 | `supEnterpriseName` | 供应商名称 | `sup_enterprise_name` | String | `multiLanguage` |  | ✓ |
| 10 | `shortName` | 供应商简称 | `short_name` | String | `multiLanguage` |  | ✓ |
| 11 | `supplyDocId` | 供应商档案Id | `supply_doc_id` | Long | `long` |  | ✓ |
| 12 | `vendorip` | 供应商IP | `vendorip` | String | `text` |  | ✓ |
| 13 | `finalApproveUser` | 最终审批人 | `final_approve_user` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 14 | `busPerformanceFilePathOrigin` | 原始经营业绩附件 | `bus_performance_filepath_origin` | String | `text` |  | ✓ |
| 15 | `docVendorOrgs` | 供应商档案原始适用范围组织 | `doc_vendororgs` | String | `text` |  | ✓ |
| 16 | `entProfileFilePathOrigin` | 原始企业介绍附件 | `ent_profile_filepath_origin` | String | `text` |  | ✓ |
| 17 | `filepath1Origin` | 原始自定义附件1 | `filepath1_origin` | String | `text` |  | ✓ |
| 18 | `filepath2Origin` | 原始自定义附件2 | `filepath2_origin` | String | `text` |  | ✓ |
| 19 | `filepath3Origin` | 原始自定义附件3 | `filepath3_origin` | String | `text` |  | ✓ |
| 20 | `filepath4Origin` | 原始自定义附件4 | `filepath4_origin` | String | `text` |  | ✓ |
| 21 | `filepath5Origin` | 原始自定义附件5 | `filepath5_origin` | String | `text` |  | ✓ |
| 22 | `filepath6Origin` | 原始自定义附件6 | `filepath6_origin` | String | `text` |  | ✓ |
| 23 | `filepath7Origin` | 原始自定义附件7 | `filepath7_origin` | String | `text` |  | ✓ |
| 24 | `filepath8Origin` | 原始自定义附件8 | `filepath8_origin` | String | `text` |  | ✓ |
| 25 | `investigationFilePathOrigin` | 原始考察报告附件 | `investigation_filepath_origin` | String | `text` |  | ✓ |
| 26 | `originVendorData` | 档案快照数据 | `origin_vendor_data` | String | `text` |  | ✓ |
| 27 | `finalApproveTime` | 最终审批时间 | `final_approve_time` | DateTime | `timestamp` |  | ✓ |
| 28 | `bEntVerify` | 核实状态 | `bEntVerify` | Integer | `int` |  | ✓ |
| 29 | `isBizLeaderForMe` | 受理人为我 | `is_biz_leader_for_me` | Integer | `int` |  | ✓ |
| 30 | `settlemethod` | 结算方式 | `settle_method` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |  | ✓ |
| 31 | `isSaved` | 采购商是否保存过单据 | `isSaved` | Integer | `int` |  | ✓ |
| 32 | `shipregion` | 运输区域 | `ship_region` | 373171f0-f497-4bab-bda7-ff4b6489c13e | `quote` |  | ✓ |
| 33 | `invoiceBizType` | 开票方式 | `invoice_biz_type` | Short | `short` |  | ✓ |
| 34 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 35 | `supUseorgName` | 使用组织名称 | `sup_useorg_name` | String | `text` |  | ✓ |
| 36 | `vendorTenantId` | 供应商租户id | `vendor_tenant_id` | String | `text` |  | ✓ |
| 37 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 38 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 39 | `supSubmitterid` | 内部申请提交人id | `sup_submitterid` | String | `text` |  | ✓ |
| 40 | `bcoordination` | 是否协同 | `bcoordination` | Integer | `int` |  | ✓ |
| 41 | `priceTag` | 价格标识 | `price_tag` | String | `text` |  | ✓ |
| 42 | `registerCurrencyName` | 注册资金(注册资本)币种名称 | `register_currency_name` | String | `text` |  | ✓ |
| 43 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 44 | `businessStatus` | 变更单状态 | `status` | String | `text` |  | ✓ |
| 45 | `paymentagreement` | 付款协议 | `payment_agreement` | 3cce8052-512e-4e51-9b6e-57adff40948c | `quote` |  | ✓ |
| 46 | `riskScore` | 风险得分 | `risk_score` | Decimal | `number` |  | ✓ |
| 47 | `supChangeChannel` | 变更申请渠道 | `sup_change_channel` | String | `text` |  | ✓ |
| 48 | `bussinessSector` | 业务板块 | `bussiness_sector` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a | `quote` |  | ✓ |
| 49 | `snapshotLink` | 快照链接 | `snapshot_link` | String | `text` |  | ✓ |
| 50 | `transType` | 供应商变更交易类型 | `transType` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 51 | `region` | 注册地区参照名称 | `region` | String | `text` |  | ✓ |
| 52 | `remark` | 备注 | `remark` | String | `multiLanguage` |  | ✓ |
| 53 | `creditServiceDay` | 账期天数(原信用期限) | `credit_service_day` | Integer | `int` |  | ✓ |
| 54 | `admittanceSet` | 准入设置 | `admittance_set_id` | d66c2bff-f84a-45fb-bc7b-c3aaa8228b4c | `quote` |  | ✓ |
| 55 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | ✓ |
| 56 | `supplyChangeCode` | 供应商变更审核单编码 | `supply_change_code` | String | `text` |  | ✓ |
| 57 | `supplyCode` | 供应商编码 | `supply_code` | String | `text` |  | ✓ |
| 58 | `exchangeratetype` | 汇率类型 | `exchange_rate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |  | ✓ |
| 59 | `isMddApprove` | 是否MDD云审提交过。用于区分是否MDD云审单据。 | `isMddApprove` | Integer | `int` |  | ✓ |
| 60 | `changeStrInfo` | 变更字段记录。前端使用 | `change_str_info` | String | `text` |  | ✓ |
| 61 | `supplyType` | 供应商类型 | `supply_type` | String | `text` |  | ✓ |
| 62 | `supplyTypeCode` | 供应商类型 | `supply_type_code` | Short | `short` |  | ✓ |
| 63 | `supplyClassId` | 供应商分类Id | `supply_class_id` | 59ec0b4d-4e38-483d-9bdd-e7aa44176ce8 | `quote` |  | ✓ |
| 64 | `supplyClassName` | 供应商分类名称 | `supply_class_name` | String | `text` |  | ✓ |
| 65 | `platCountryCode` | 国家编码 | `plat_country_code` | String | `text` |  | ✓ |
| 66 | `platCountryId` | 国家id | `plat_country_id` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |  | ✓ |
| 67 | `regionCode` | 注册地区编码 | `region_code` | String | `text` |  | ✓ |
| 68 | `address` | 注册地址 | `address` | String | `text` |  | ✓ |
| 69 | `registerCurrency` | 注册资金币种(平台) | `register_currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 70 | `registerFund` | 注册资金(注册资本),新字段MDD页面中使用。 | `register_fund` | Decimal | `number` |  | ✓ |
| 71 | `artificialPsn` | 法定代表人 | `artificial_psn` | String | `text` |  | ✓ |
| 72 | `email` | 电子邮箱 | `email` | String | `text` |  | ✓ |
| 73 | `fax` | 传真 | `fax` | String | `text` |  | ✓ |
| 74 | `mobile` | 联系电话 | `mobile` | String | `text` |  | ✓ |
| 75 | `creditCode` | 证照号码 | `credit_code` | String | `text` |  | ✓ |
| 76 | `licenseType` | 证照类型 | `license_type` | String | `text` |  | ✓ |
| 77 | `language` | 语言 | `language` | a014aa1b-1f14-4d31-88fb-dcce538d9973 | `quote` |  | ✓ |
| 78 | `timeZone` | 时区 | `time_zone` | String | `text` |  | ✓ |
| 79 | `invoiceVendor` | 开票供应商(采购商选择) | `invoice_vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 80 | `invoiceVendorName` | 开票供应商名称(供应商填写) | `invoice_vendor_name` | String | `text` |  | ✓ |
| 81 | `taxRate` | 开票税率 | `tax_rate` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |  | ✓ |
| 82 | `entType` | 企业类型 | `ent_type` | String | `multipleOption` |  | ✓ |
| 83 | `entProfile` | 企业介绍 | `ent_profile` | String | `text` |  | ✓ |
| 84 | `entProfileFilePath` | 企业介绍附件 | `ent_profile_filepath` | String | `text` |  | ✓ |
| 85 | `foundDate` | 成立日期 | `found_date` | DateTime | `timestamp` |  | ✓ |
| 86 | `busPerformance` | 经营业绩 | `bus_performance` | String | `text` |  | ✓ |
| 87 | `busPerformanceFilePath` | 经营业绩附件 | `bus_performance_filepath` | String | `text` |  | ✓ |
| 88 | `capacity` | 产能供货能力 | `capacity` | String | `text` |  | ✓ |
| 89 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 90 | `supUseOrgId` | 使用组织id | `sup_useorg_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 91 | `supplyChangeType` | 变更申请单类型 | `supply_change_type` | Integer | `int` |  | ✓ |
| 92 | `investigationNotes` | 考察情况说明 | `investigation_notes` | String | `text` |  | ✓ |
| 93 | `investigationFilePath` | 考察报告附件 | `investigation_filepath` | String | `text` |  | ✓ |
| 94 | `serviceRange` | 经营范围 | `service_range` | String | `text` |  | ✓ |
| 95 | `taxPayingCategories` | 纳税类别 | `tax_pay_category` | Short | `short` |  | ✓ |
| 96 | `trade` | 所属行业 | `trade` | Short | `short` |  | ✓ |
| 97 | `vendorAddress` | 通信地址 | `vendor_address` | String | `text` |  | ✓ |
| 98 | `vendorPhone` | 固定电话 | `vendor_phone` | String | `text` |  | ✓ |
| 99 | `vendorWebUrl` | 网站地址 | `vendor_web_url` | String | `text` |  | ✓ |
| 100 | `vendorZipCode` | 邮政编码 | `vendor_zip_code` | String | `text` |  | ✓ |
| 101 | `wechatPublicAccount` | 微信公众号 | `wechat_public_account` | String | `text` |  | ✓ |
| 102 | `useRange` | 适用范围 | `use_range` | String | `text` |  | ✓ |
| 103 | `currency` | 交易币种 | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 104 | `shipvia` | 发运方式 | `shipvia_id` | aa2f6845-347d-499f-a5b2-964b84747d99 | `quote` |  | ✓ |
| 105 | `filepath1` | 自定义附件1 | `filepath1` | String | `text` |  | ✓ |
| 106 | `filepath2` | 自定义附件2 | `filepath2` | String | `text` |  | ✓ |
| 107 | `filepath3` | 自定义附件3 | `filepath3` | String | `text` |  | ✓ |
| 108 | `filepath4` | 自定义附件4 | `filepath4` | String | `text` |  | ✓ |
| 109 | `filepath5` | 自定义附件5 | `filepath5` | String | `text` |  | ✓ |
| 110 | `filepath6` | 自定义附件6 | `filepath6` | String | `text` |  | ✓ |
| 111 | `filepath7` | 自定义附件7 | `filepath7` | String | `text` |  | ✓ |
| 112 | `filepath8` | 自定义附件8 | `filepath8` | String | `text` |  | ✓ |
| 113 | `withdrawTime` | 撤回时间。记录撤回操作发生的时间。 | `withdraw_time` | DateTime | `timestamp` |  | ✓ |
| 114 | `applyDate` | 申请日期 | `apply_date` | DateTime | `timestamp` |  | ✓ |
| 115 | `createTime` | 创建日期 | `createtime` | DateTime | `timestamp` |  | ✓ |
| 116 | `supSubmitter` | 申请人 | `sup_submitter` | String | `text` |  | ✓ |
| 117 | `supMgrOrgName` | 受理组织名称 | `sup_mgrorg_name` | String | `text` |  | ✓ |
| 118 | `userId` | 提交人云采用户ID | `user_id` | Long | `long` |  | ✓ |
| 119 | `userLoginName` | 提交人用户编码 | `user_login_name` | String | `text` |  | ✓ |
| 120 | `rejectReason` | 驳回原因 | `reject_reason` | String | `text` |  | ✓ |
| 121 | `approveDate` | 提交时间 | `approve_date` | DateTime | `timestamp` |  | ✓ |
| 122 | `approveOrgId` | 提交人员工所属组织id | `approve_org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 123 | `supMgrOrgId` | 受理组织 | `sup_mgrorg_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 124 | `approveOrgName` | 提交人员工所属组织名称 | `approve_org_name` | String | `text` |  | ✓ |
| 125 | `approveStatus` | 审批状态 | `approve_status` | String | `text` |  | ✓ |
| 126 | `approverCode` | 提交人用户编码 | `approver_code` | String | `text` |  | ✓ |
| 127 | `approverId` | 提交人员工ID | `approver_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 128 | `approverName` | 提交人 | `approver_name` | String | `text` |  | ✓ |
| 129 | `isApprove` | 是否审批 | `is_approve` | Long | `long` |  | ✓ |
| 130 | `status` | 变更单状态 | `vouch_status` | Integer | `int` |  | ✓ |
| 131 | `buyerTenantId` | 跨租户采购商ID | `buyer_tenant_id` | String | `text` |  | ✓ |
| 132 | `userDefineCharacter` | 供应商变更审核特征自定义项 | `user_define_character` | be44c2f0-2639-4312-bdc2-9c25576eb16a | `UserDefine` |  | ✓ |
| 133 | `ts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 134 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 135 | `addressinfo` | 供应商变更受理地址信息 | `` | 37ecd9e5-cd14-4f21-adb4-6da08d176010 | `` |  |  |
| 136 | `banks` | 供应商变受理银行信息 | `` | 98f3e015-510e-45d1-a9a4-a6238927de75 | `` |  |  |
| 137 | `businessmanagers` | 供应商变更受理业务受理人 | `` | c8e60b8c-538f-4e6c-8b5c-56c3090b8ddb | `` |  |  |
| 138 | `category` | 供应商变更受理主供分类 | `` | a1893435-233d-44a2-b512-230f6d6f8827 | `` |  |  |
| 139 | `defines` | 供应商变更受理自定义项 | `` | f2b6c456-9054-401a-879c-7cd5ffe73283 | `` |  |  |
| 140 | `linkmanPOJOList` | 供应商变更受理联系人信息 | `` | e6cf5162-dd71-40f6-8385-f1370da9dc91 | `` |  |  |
| 141 | `qualifys` | 供应商变更受理资质信息 | `` | 54a0e1fa-0861-40ef-a247-6b80ccf1405a | `` |  |  |
| 142 | `vendorOrgs` | 供应商变更申请适用范围 | `` | 1b936b2a-6833-4469-9971-228eb761ba96 | `` |  |  |

---

## 关联属性（共 31 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `qualifys` | 供应商变更受理资质信息 | `cpu-supplymgr.supplychange.SupplyChangeQualify` | `` | qualifys → supplyChangeId | 0..n | true | None |  |
| 2 | `userDefineCharacter` | 供应商变更审核特征自定义项 | `cpu-supplymgr.supplychange.SupplyChangeUserDefineCharacter` | `user_define_character` |  →  |  |  | None |  |
| 3 | `invoiceVendor` | 开票供应商(采购商选择) | `aa.vendor.Vendor` | `invoice_vendor` |  →  |  |  | Service |  |
| 4 | `settlemethod` | 结算方式 | `aa.settlemethod.SettleMethod` | `settle_method` |  →  |  |  | Service |  |
| 5 | `businessmanagers` | 供应商变更受理业务受理人 | `cpu-supplymgr.supplychange.SupplyChangeBusinessmanager` | `` | businessmanagers → supplyChangeId | 0..n | true | None |  |
| 6 | `language` | 语言 | `bd.timezonelanguage.LanguageVO` | `language` |  →  |  |  | Service |  |
| 7 | `defines` | 供应商变更受理自定义项 | `cpu-supplymgr.supplychange.SupplyChangeDefine` | `` | defines → id | 1 | true | None | ⚠️ |
| 8 | `supUseOrgId` | 使用组织id | `bd.adminOrg.BaseOrgVO` | `sup_useorg_id` |  →  |  |  | Service |  |
| 9 | `admittanceSet` | 准入设置 | `cpu-supplymgr.applyset.AdmittanceSet` | `admittance_set_id` |  →  |  |  | None |  |
| 10 | `registerCurrency` | 注册资金币种(平台) | `bd.currencytenant.CurrencyTenantVO` | `register_currency` |  →  |  |  | Service |  |
| 11 | `addressinfo` | 供应商变更受理地址信息 | `cpu-supplymgr.supplychange.SupplyChangeAddress` | `` | addressinfo → supplyChangeId | 0..n | true | None |  |
| 12 | `vendorOrgs` | 供应商变更申请适用范围 | `cpu-supplymgr.supplychange.SupplyChangeVendorOrg` | `` | vendorOrgs → supplyChangeId | 0..n | true | None |  |
| 13 | `shipregion` | 运输区域 | `base.shipregion.ShipRegion` | `ship_region` |  →  |  |  | Service |  |
| 14 | `currency` | 交易币种 | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |  →  |  |  | Service |  |
| 15 | `paymentagreement` | 付款协议 | `bd.payments.PayAgreement` | `payment_agreement` |  →  |  |  | Service |  |
| 16 | `supMgrOrgId` | 受理组织 | `bd.adminOrg.BaseOrgVO` | `sup_mgrorg_id` |  →  |  |  | Service |  |
| 17 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 18 | `banks` | 供应商变受理银行信息 | `cpu-supplymgr.supplychange.SupplyChangeBank` | `` | banks → supplyChangeId | 0..n | true | None |  |
| 19 | `approverId` | 提交人员工ID | `bd.staff.Staff` | `approver_id` |  →  |  |  | Service |  |
| 20 | `bussinessSector` | 业务板块 | `bctask.basedoc.CustomerDocVO` | `bussiness_sector` |  →  |  |  | Service |  |
| 21 | `platCountryId` | 国家id | `bd.country.CountryVO` | `plat_country_id` |  →  |  |  | Service |  |
| 22 | `supplyClassId` | 供应商分类Id | `aa.vendorclass.VendorClass` | `supply_class_id` |  →  |  |  | Service |  |
| 23 | `supConOrgId` | 管理组织 | `bd.adminOrg.BaseOrgVO` | `sup_conorg_id` |  →  |  |  | Service |  |
| 24 | `approveOrgId` | 提交人员工所属组织id | `bd.adminOrg.BaseOrgVO` | `approve_org_id` |  →  |  |  | Service |  |
| 25 | `taxRate` | 开票税率 | `archive.taxArchives.TaxRateArchive` | `tax_rate` |  →  |  |  | Service |  |
| 26 | `shipvia` | 发运方式 | `aa.sendtrans.SendTransWay` | `shipvia_id` |  →  |  |  | Service |  |
| 27 | `finalApproveUser` | 最终审批人 | `base.user.BipUser` | `final_approve_user` |  →  |  |  | Service |  |
| 28 | `transType` | 供应商变更交易类型 | `bd.bill.TransType` | `transType` |  →  |  |  | Service |  |
| 29 | `exchangeratetype` | 汇率类型 | `bd.exchangeRate.ExchangeRateTypeVO` | `exchange_rate_type` |  →  |  |  | Service |  |
| 30 | `category` | 供应商变更受理主供分类 | `cpu-supplymgr.supplychange.SupplyChangeCategory` | `` | category → supplyChangeId | 0..n | true | None |  |
| 31 | `linkmanPOJOList` | 供应商变更受理联系人信息 | `cpu-supplymgr.supplychange.SupplyChangeLinkmanPOJO` | `` | linkmanPOJOList → supplyChangeId | 0..n | true | None |  |

### Composition（子表）

- **qualifys**: `qualifys` → `cpu-supplymgr.supplychange.SupplyChangeQualify` | 0..n
- **businessmanagers**: `businessmanagers` → `cpu-supplymgr.supplychange.SupplyChangeBusinessmanager` | 0..n
- **defines**: `defines` → `cpu-supplymgr.supplychange.SupplyChangeDefine` | 1 ⚠️ 已废弃
- **addressinfo**: `addressinfo` → `cpu-supplymgr.supplychange.SupplyChangeAddress` | 0..n
- **vendorOrgs**: `vendorOrgs` → `cpu-supplymgr.supplychange.SupplyChangeVendorOrg` | 0..n
- **banks**: `banks` → `cpu-supplymgr.supplychange.SupplyChangeBank` | 0..n
- **category**: `category` → `cpu-supplymgr.supplychange.SupplyChangeCategory` | 0..n
- **linkmanPOJOList**: `linkmanPOJOList` → `cpu-supplymgr.supplychange.SupplyChangeLinkmanPOJO` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `invoiceVendor` (开票供应商(采购商选择)) | `aa.vendor.Vendor` | `invoice_vendor` |
| `settlemethod` (结算方式) | `aa.settlemethod.SettleMethod` | `settle_method` |
| `language` (语言) | `bd.timezonelanguage.LanguageVO` | `language` |
| `supUseOrgId` (使用组织id) | `bd.adminOrg.BaseOrgVO` | `sup_useorg_id` |
| `registerCurrency` (注册资金币种(平台)) | `bd.currencytenant.CurrencyTenantVO` | `register_currency` |
| `shipregion` (运输区域) | `base.shipregion.ShipRegion` | `ship_region` |
| `currency` (交易币种) | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |
| `paymentagreement` (付款协议) | `bd.payments.PayAgreement` | `payment_agreement` |
| `supMgrOrgId` (受理组织) | `bd.adminOrg.BaseOrgVO` | `sup_mgrorg_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `approverId` (提交人员工ID) | `bd.staff.Staff` | `approver_id` |
| `bussinessSector` (业务板块) | `bctask.basedoc.CustomerDocVO` | `bussiness_sector` |
| `platCountryId` (国家id) | `bd.country.CountryVO` | `plat_country_id` |
| `supplyClassId` (供应商分类Id) | `aa.vendorclass.VendorClass` | `supply_class_id` |
| `supConOrgId` (管理组织) | `bd.adminOrg.BaseOrgVO` | `sup_conorg_id` |
| `approveOrgId` (提交人员工所属组织id) | `bd.adminOrg.BaseOrgVO` | `approve_org_id` |
| `taxRate` (开票税率) | `archive.taxArchives.TaxRateArchive` | `tax_rate` |
| `shipvia` (发运方式) | `aa.sendtrans.SendTransWay` | `shipvia_id` |
| `finalApproveUser` (最终审批人) | `base.user.BipUser` | `final_approve_user` |
| `transType` (供应商变更交易类型) | `bd.bill.TransType` | `transType` |
| `exchangeratetype` (汇率类型) | `bd.exchangeRate.ExchangeRateTypeVO` | `exchange_rate_type` |
