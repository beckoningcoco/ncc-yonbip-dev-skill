---
tags: [BIP, 元数据, 数据字典, eeac.fievent.FiEventDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 会计事务 (`eeac.fievent.FiEventDO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `eac_fi_event` | 应用: `EVNT`

## 属性（50 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `billNum` | billNum | `bill_num` | String | `text` |
| 2 | `blnCopy` | blnCopy | `bln_copy` | Boolean | `switch` |
| 3 | `blnInvokeFiService` | blnInvokeFiService | `bln_invoke_fi_service` | Boolean | `switch` |
| 4 | `blnPeriodBegin` | blnPeriodBegin | `bln_period_begin` | Boolean | `switch` |
| 5 | `blnPreview` | blnPreview | `bln_preview` | Boolean | `switch` |
| 6 | `blnUserDef` | blnUserDef | `bln_user_def` | Boolean | `switch` |
| 7 | `blnsrcVoucher` | blnsrcVoucher | `bln_src_voucher` | Boolean | `switch` |
| 8 | `busiObjMetaUri` | busiObjMetaUri | `busi_obj_meta_uri` | String | `text` |
| 9 | `cancelClass` | cancelClass | `cancel_class` | String | `text` |
| 10 | `cancelPersistenceClass` | cancelPersistenceClass | `cancel_persistence_class` | String | `text` |
| 11 | `cancelPersistenceUri` | cancelPersistenceUri | `cancel_persistence_uri` | String | `text` |
| 12 | `cancelSdkClass` | cancelSdkClass | `cancel_sdk_class` | String | `text` |
| 13 | `cancelSdkPersistenceClass` | cancelSdkPersistenceClass | `cancel_sdk_persistence_class` | String | `text` |
| 14 | `cancelUri` | cancelUri | `cancel_uri` | String | `text` |
| 15 | `code` | 编码 | `code` | String | `text` |
| 16 | `domainKey` | domainKey | `domain_key` | String | `text` |
| 17 | `execClass` | execClass | `exec_class` | String | `text` |
| 18 | `execSdkClass` | execSdkClass | `exec_sdk_class` | String | `text` |
| 19 | `execUri` | execUri | `exec_uri` | String | `text` |
| 20 | `fiEventCatId` | fiEventCatID | `fi_event_cat_id` | 700bc4e3-d00f-4779-bc49-b300fb516271 | `quote` |
| 21 | `fiServiceId` | fiServiceID | `fi_service_id` | e69ffd9f-7d8c-4b02-b8ae-3ee7aa18b2b2 | `quote` |
| 22 | `genVoucherStatus` | genVoucherStatus | `gen_voucher_status` | String | `text` |
| 23 | `industryId` | industryID | `industry_id` | String | `text` |
| 24 | `interfaceType` | interfaceType | `interface_type` | String | `text` |
| 25 | `name` | 名称 | `name` | String | `multiLanguage` |
| 26 | `orgTypeId` | orgTypeID | `org_type_id` | String | `text` |
| 27 | `pageType` | pageType | `page_type` | String | `text` |
| 28 | `parent` | parent | `parent_id` | ff8c5979-f9dc-4259-8b9f-6fe69da87bf6 | `quote` |
| 29 | `persistenceClass` | persistenceClass | `persistence_class` | String | `text` |
| 30 | `persistenceSdkClass` | persistenceSdkClass | `persistence_sdk_class` | String | `text` |
| 31 | `persistenceUri` | persistenceUri | `persistence_uri` | String | `text` |
| 32 | `postingDateField` | postingDateField | `posting_date_field` | String | `text` |
| 33 | `remarks` | remarks | `remarks` | String | `text` |
| 34 | `serviceCode` | service编码 | `service_code` | String | `text` |
| 35 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |
| 36 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |
| 37 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |
| 38 | `sortNum` | sortNum | `sort_num` | Integer | `int` |
| 39 | `sysId` | sysID | `sys_id` | String | `text` |
| 40 | `usingStatus` | usingStatus | `using_status` | String | `text` |
| 41 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 42 | `vouchparams` | vouchparams | `` | 1d0ab0c6-173f-4c86-9191-d97c11adb0f6 | `` |
| 43 | `bodies` | bodies | `` | 500e9d31-2cd7-4194-ada0-9b2c10e6707a | `` |
| 44 | `id` | ID | `id` | String | `text` |
| 45 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 46 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 47 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 48 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 49 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 50 | `dr` | 逻辑删除 | `dr` | Short | `short` |

## 关联（8 个）

- `fiServiceId` -> `eeac.fiservice.FiServiceDO` () [废]
- `parent` -> `eeac.fievent.FiEventDO` () [废]
- `creator` -> `base.user.BipUser` () 
- `bodies` -> `eeac.fievent.FiEventSubjectCatDO` (0..n) 
- `modifier` -> `base.user.BipUser` () 
- `vouchparams` -> `eeac.fievent.FiEventVouchParamsDO` (0..n) 
- `fiEventCatId` -> `eeac.ficategory.FiCategoryDO` () [废]
- `ytenantId` -> `yht.tenant.YhtTenant` () [废]
