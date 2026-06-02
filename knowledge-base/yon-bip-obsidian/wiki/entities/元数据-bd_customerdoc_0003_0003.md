---
tags: [BIP, 元数据, 数据字典, bd.customerdoc_0003.0003]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 婚姻状况 (`bd.customerdoc_0003.0003`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `hred_refer_marital` | 应用: `HRED` | 类型: `Class`

## 属性（35 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `name` | 名称 | `name` | String | `multiLanguage` |
| 3 | `custdocdefid` | custdocdefid | `custdocdefid` | String | `text` |
| 4 | `parentid` | parentid | `parentid` | String | `text` |
| 5 | `orgid` | orgid | `orgid` | 100943a5-df56-4ec1-8105-c4b448afa02b | `quote` |
| 6 | `description` | description | `description` | String | `multiLanguage` |
| 7 | `userDefineCharacter` | userDefineCharacter | `user_define_character` | 4e255ed8-0868-4dc5-b4d8-40c5a7e7f1b7 | `UserDefine` |
| 8 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 9 | `createTime` | 创建时间 | `creationtime` | DateTime | `timestamp` |
| 10 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 11 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |
| 12 | `enable` | enable | `enable` | Integer | `int` |
| 13 | `buid` | buid | `buid` | String | `text` |
| 14 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 15 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 16 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 17 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 18 | `id` | ID | `id` | String | `text` |
| 19 | `innercode` | innercode | `innercode` | String | `text` |
| 20 | `ispreset` | 是否preset | `ispreset` | Boolean | `switch` |
| 21 | `mnecode` | mnecode | `mnecode` | String | `text` |
| 22 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 23 | `objid` | objid | `objid` | String | `text` |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 25 | `shortname` | shortname | `shortname` | String | `text` |
| 26 | `sortnum` | sortnum | `sortnum` | Integer | `int` |
| 27 | `sysid` | sysid | `sysid` | String | `text` |
| 28 | `tenant` | tenant | `tenantid` | String | `text` |
| 29 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 30 | `country` | country | `` | 31a0a500-6ec0-4f3e-b69d-e635908c7fb2 | `` |
| 31 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 32 | `level` | 层级 | `level` | Integer | `int` |
| 33 | `parent` | parent | `parent_id` | String | `text` |
| 34 | `path` | path | `path` | String | `text` |
| 35 | `sort` | 排序 | `sort_num` | Integer | `int` |

## 关联（6 个）

- `country` -> `bd.customerdoc_0003.Country` (0..n)
- `creator` -> `base.user.BipUser` ()
- `userDefineCharacter` -> `bd.customerdoc_0003.UserDefineCharacter` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
- `orgid` -> `org.view.AdminOrgGlobalView` ()
