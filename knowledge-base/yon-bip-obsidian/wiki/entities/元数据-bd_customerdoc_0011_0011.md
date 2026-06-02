---
tags: [BIP, 元数据, 数据字典, bd.customerdoc_0011.0011]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 专业技术职务 (`bd.customerdoc_0011.0011`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `hred_refer_proftechpost` | 应用: `HRED` | 类型: `Class`

## 属性（31 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `name` | 名称 | `name` | String | `multiLanguage` |
| 3 | `custdocdefid` | custdocdefid | `custdocdefid` | String | `text` |
| 4 | `parentid` | parentid | `parentid` | String | `text` |
| 5 | `orgid` | orgid | `orgid` | 100943a5-df56-4ec1-8105-c4b448afa02b | `quote` |
| 6 | `description` | description | `description` | String | `multiLanguage` |
| 7 | `userDefineCharacter` | userDefineCharacter | `user_define_character` | 4952b5cc-8efc-421b-b1cf-00c21c8f2f82 | `UserDefine` |
| 8 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 9 | `createTime` | 创建时间 | `creationtime` | DateTime | `timestamp` |
| 10 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 11 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |
| 12 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 13 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 14 | `enable` | enable | `enable` | Integer | `int` |
| 15 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 16 | `id` | ID | `id` | String | `text` |
| 17 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 18 | `ispreset` | 是否preset | `ispreset` | Boolean | `switch` |
| 19 | `level` | 层级 | `level` | Integer | `int` |
| 20 | `log` | log | `log` | String | `text` |
| 21 | `objid` | objid | `objid` | String | `text` |
| 22 | `parent` | parent | `parent_id` | 0d044175-47e5-4e07-87bd-4ebcc83a16a9 | `quote` |
| 23 | `path` | path | `path` | String | `text` |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 25 | `shortname` | shortname | `shortname` | String | `text` |
| 26 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 27 | `sortnum` | sortnum | `sortnum` | Integer | `int` |
| 28 | `sysid` | sysid | `sysid` | String | `text` |
| 29 | `tenant` | tenant | `tenantid` | String | `text` |
| 30 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 31 | `country` | country | `` | 8b08af0b-fc4b-4d8f-80ef-96d007193518 | `` |

## 关联（7 个）

- `parent` -> `bd.customerdoc_0011.0011` ()
- `country` -> `bd.customerdoc_0011.Country` (0..n)
- `creator` -> `base.user.BipUser` ()
- `userDefineCharacter` -> `bd.customerdoc_0011.UserDefineCharacter` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
- `orgid` -> `org.view.AdminOrgGlobalView` ()
