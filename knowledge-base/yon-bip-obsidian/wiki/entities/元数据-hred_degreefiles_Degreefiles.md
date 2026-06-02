---
tags: [BIP, 元数据, 数据字典, hred.degreefiles.Degreefiles]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 学位档案 (`hred.degreefiles.Degreefiles`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `degreefiles` | 应用: `HRED` | 类型: `Class`

## 属性（30 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `cloudid` | cloudid | `cloudid` | String | `text` |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 3 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 4 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 5 | `log` | log | `log` | String | `text` |
| 6 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 7 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 8 | `sysid` | sysid | `sysid` | String | `text` |
| 9 | `id` | ID | `id` | String | `text` |
| 10 | `ccode` | ccode | `code` | String | `text` |
| 11 | `cname` | cname | `cName` | String | `multiLanguage` |
| 12 | `enable` | enable | `status` | Short | `short` |
| 13 | `disablets` | disablets | `stop_time` | DateTime | `timestamp` |
| 14 | `system` | system | `bsystem` | Short | `short` |
| 15 | `tenant` | tenant | `tenantid` | String | `text` |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 17 | `country` | country | `` | 9d987013-4bd3-40d8-a82e-e284b8c07acf | `` |
| 18 | `description` | description | `description` | String | `multiLanguage` |
| 19 | `distributionSite` | distributionSite | `distribution_site` | 21622298-40b3-4de4-89a6-7b8a4db38679 | `quote` |
| 20 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 21 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 22 | `ispreset` | 是否preset | `ispreset` | Boolean | `switch` |
| 23 | `level` | 层级 | `level` | Integer | `int` |
| 24 | `name` | 名称 | `name` | String | `text` |
| 25 | `parent` | parent | `parent_id` | 14179483-26fd-4645-9b5d-d839ea01c3b7 | `quote` |
| 26 | `path` | path | `path` | String | `text` |
| 27 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 28 | `sortnum` | sortnum | `sortnum` | Integer | `int` |
| 29 | `userDefineCharacter` | userDefineCharacter | `user_define_character` | 96f03020-531a-41aa-ab08-8f1e88490288 | `UserDefine` |
| 30 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（7 个）

- `parent` -> `hred.degreefiles.Degreefiles` ()
- `country` -> `hred.degreefiles.Country` (0..n)
- `creator` -> `base.user.BipUser` ()
- `userDefineCharacter` -> `hred.degreefiles.UserDefineCharacter` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
- `distributionSite` -> `hrcb.distributionSite.DistributionSite` ()
