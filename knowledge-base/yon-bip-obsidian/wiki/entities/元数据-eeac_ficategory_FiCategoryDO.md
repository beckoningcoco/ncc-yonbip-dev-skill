---
tags: [BIP, 元数据, 数据字典, eeac.ficategory.FiCategoryDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 会计事务类别 (`eeac.ficategory.FiCategoryDO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `eac_fi_event_cat` | 应用: `EVNT`

## 属性（19 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `blnUserDef` | blnUserDef | `bln_user_def` | Boolean | `switch` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `fiServiceId` | fiServiceID | `fi_service_id` | e69ffd9f-7d8c-4b02-b8ae-3ee7aa18b2b2 | `quote` |
| 4 | `name` | 名称 | `name` | String | `multiLanguage` |
| 5 | `remarks` | remarks | `remarks` | String | `text` |
| 6 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |
| 7 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |
| 8 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |
| 9 | `sortNum` | sortNum | `sort_num` | Integer | `int` |
| 10 | `sysId` | sysID | `sys_id` | String | `text` |
| 11 | `usingStatus` | usingStatus | `using_status` | String | `text` |
| 12 | `id` | ID | `id` | String | `text` |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 15 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 16 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 18 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 19 | `dr` | 逻辑删除 | `dr` | Short | `short` |

## 关联（4 个）

- `fiServiceId` -> `eeac.fiservice.FiServiceDO` () [废]
- `creator` -> `base.user.BipUser` () 
- `modifier` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
