---
tags: [BIP, 元数据, 数据字典, eeac.fiservice.FiServiceDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 财务服务 (`eeac.fiservice.FiServiceDO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `eac_fi_service` | 应用: `EVNT`

## 属性（34 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `appCode` | app编码 | `app_code` | String | `text` |
| 2 | `appId` | appID | `app_id` | d5737052-9d1e-4cfa-9cab-bee31d88dd8b | `quote` |
| 3 | `blnStdProduct` | blnStdProduct | `bln_std_product` | Boolean | `switch` |
| 4 | `blnUserDef` | blnUserDef | `bln_user_def` | Boolean | `switch` |
| 5 | `cancelClass` | cancelClass | `cancel_class` | String | `text` |
| 6 | `cancelPersistenceClass` | cancelPersistenceClass | `cancel_persistence_class` | String | `text` |
| 7 | `cancelPersistenceUri` | cancelPersistenceUri | `cancel_persistence_uri` | String | `text` |
| 8 | `cancelSdkClass` | cancelSdkClass | `cancel_sdk_class` | String | `text` |
| 9 | `cancelSdkPersistenceClass` | cancelSdkPersistenceClass | `cancel_sdk_persistence_class` | String | `text` |
| 10 | `cancelUri` | cancelUri | `cancel_uri` | String | `text` |
| 11 | `code` | 编码 | `code` | String | `text` |
| 12 | `domainCode` | domain编码 | `domain_code` | String | `text` |
| 13 | `domainKey` | domainKey | `domain_key` | String | `text` |
| 14 | `execClass` | execClass | `exec_class` | String | `text` |
| 15 | `execSdkClass` | execSdkClass | `exec_sdk_class` | String | `text` |
| 16 | `execUri` | execUri | `exec_uri` | String | `text` |
| 17 | `interfaceType` | interfaceType | `interface_type` | String | `text` |
| 18 | `name` | 名称 | `name` | String | `multiLanguage` |
| 19 | `orderNo` | orderNo | `order_no` | Integer | `int` |
| 20 | `persistenceClass` | persistenceClass | `persistence_class` | String | `text` |
| 21 | `persistenceSdkClass` | persistenceSdkClass | `persistence_sdk_class` | String | `text` |
| 22 | `persistenceUri` | persistenceUri | `persistence_uri` | String | `text` |
| 23 | `queryPeriodStatusUri` | queryPeriodStatusUri | `query_period_status_uri` | String | `text` |
| 24 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |
| 25 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |
| 26 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |
| 27 | `id` | ID | `id` | String | `text` |
| 28 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 29 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 30 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 31 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 32 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 33 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 34 | `dr` | 逻辑删除 | `dr` | Short | `short` |

## 关联（4 个）

- `creator` -> `base.user.BipUser` () 
- `appId` -> `epub.sourceapplication.SourceApplication` () [废]
- `modifier` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
