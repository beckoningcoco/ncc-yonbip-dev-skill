---
tags: [BIP, 元数据, 数据字典, bd.customerdoc_0024.0024]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 专业类别 (`bd.customerdoc_0024.0024`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `hred_refer_majorcategory` | 应用: `HRED` | 类型: `Class`

## 属性（35 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `sortnum` | sortnum | `sortnum` | Integer | `int` |
| 2 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 3 | `mnecode` | mnecode | `mnecode` | String | `text` |
| 4 | `parent` | parent | `parent_id` | 8935eea7-a8ae-456e-85a4-59f1abc98510 | `quote` |
| 5 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 6 | `path` | path | `path` | String | `text` |
| 7 | `objid` | objid | `objid` | String | `text` |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 9 | `tenant` | tenant | `tenantid` | String | `text` |
| 10 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 11 | `level` | 层级 | `level` | Integer | `int` |
| 12 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 13 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 14 | `orgid` | orgid | `orgid` | 100943a5-df56-4ec1-8105-c4b448afa02b | `quote` |
| 15 | `innercode` | innercode | `innercode` | String | `text` |
| 16 | `buid` | buid | `buid` | String | `text` |
| 17 | `ispreset` | 是否preset | `ispreset` | Boolean | `switch` |
| 18 | `enable` | enable | `enable` | Integer | `int` |
| 19 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 20 | `code` | 编码 | `code` | String | `text` |
| 21 | `name` | 名称 | `name` | String | `multiLanguage` |
| 22 | `shortname` | shortname | `shortname` | String | `text` |
| 23 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 24 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 25 | `parentid` | parentid | `parentid` | String | `text` |
| 26 | `description` | description | `description` | String | `multiLanguage` |
| 27 | `sysid` | sysid | `sysid` | String | `text` |
| 28 | `custdocdefid` | custdocdefid | `custdocdefid` | String | `text` |
| 29 | `id` | ID | `id` | String | `text` |
| 30 | `country` | country | `` | 62661199-d1e6-43bc-97e4-a7976b7cef72 | `` |
| 31 | `createTime` | 创建时间 | `creationtime` | DateTime | `timestamp` |
| 32 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 33 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 34 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |
| 35 | `userDefineCharacter` | userDefineCharacter | `user_define_character` | 4540b9cd-1022-486b-bf21-adf7cbde007a | `UserDefine` |

## 关联（7 个）

- `parent` -> `bd.customerdoc_0024.0024` ()
- `country` -> `bd.customerdoc_0024.Country` (0..n)
- `creator` -> `base.user.BipUser` ()
- `userDefineCharacter` -> `bd.customerdoc_0024.UserDefineCharacter` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
- `orgid` -> `org.view.AdminOrgGlobalView` ()
