---
tags: [BIP, 元数据, 数据字典, base.character.Characteristics]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 特征组 (`base.character.Characteristics`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `base_characteristics` | 应用: `CHARACTER` | 类型: `Class`

## 属性（23 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `characteristicsType` | characteristicsType | `iCharacteristicsTypeId` | d4536390-1a46-49d5-8ffe-04412bfeb6d7 | `quote` |
| 2 | `code` | 编码 | `cCode` | String | `text` |
| 3 | `characterDomainId` | characterDomainID | `character_domain_id` | f62237fd-379b-49df-be61-9a5f588cc3a5 | `quote` |
| 4 | `comment` | comment | `cComment` | String | `multiLanguage` |
| 5 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 7 | `creator` | 创建人 | `creator` | String | `text` |
| 8 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 9 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 10 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 11 | `id` | ID | `id` | Long | `long` |
| 12 | `modifier` | 修改人 | `modifier` | String | `text` |
| 13 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 16 | `name` | 名称 | `cName` | String | `multiLanguage` |
| 17 | `order` | order | `iOrder` | Integer | `int` |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 19 | `status` | 状态 | `status` | Integer | `int` |
| 20 | `syncStatus` | syncStatus | `sync_status` | Integer | `int` |
| 21 | `taskId` | taskID | `last_task_id` | String | `text` |
| 22 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 23 | `characteristicsRelations` | characteristicsRelations | `` | cee65cbc-dfdf-46fd-894f-0202b993f534 | `` |

## 关联（6 个）

- `characteristicsRelations` -> `base.character.CharacteristicsRelation` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `characterDomainId` -> `base.character.CharacterDomain` ()
- `characteristicsType` -> `base.character.CharacteristicsType` ()
