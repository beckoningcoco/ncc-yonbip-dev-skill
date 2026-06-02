---
tags: [BIP, 元数据, 数据字典, socialmdm.social.Nation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 民族 (`socialmdm.social.Nation`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mdm_nationtb` | 应用: `HRED` | 类型: `Class`

## 属性（27 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `naid` | naid | `naid` | String | `text` |
| 2 | `updateAt` | updateAt | `update_at` | String | `text` |
| 3 | `ytenantId` | ytenantID | `ytenant_id` | String | `text` |
| 4 | `sysid` | sysid | `sys_id` | String | `text` |
| 5 | `userDefineCharacter` | userDefineCharacter | `user_define_character` | 19ddfc5b-4881-46c1-9740-0463221e2de9 | `UserDefine` |
| 6 | `code` | 编码 | `code` | String | `text` |
| 7 | `treeRefForeignKey` | treeRefForeignKey | `treeref_foreignkey` | String | `text` |
| 8 | `name` | 名称 | `name` | String | `multiLanguage` |
| 9 | `nameResId` | nameResID | `name_resid` | String | `text` |
| 10 | `id` | ID | `pk_mdm` | String | `text` |
| 11 | `mdmParentCode` | mdmParent编码 | `mdm_parentcode` | String | `text` |
| 12 | `description` | description | `description` | String | `multiLanguage` |
| 13 | `sortnum` | sortnum | `sortnum` | Integer | `int` |
| 14 | `mdmCode` | mdm编码 | `mdm_code` | String | `text` |
| 15 | `ispreset` | 是否preset | `ispreset` | Boolean | `switch` |
| 16 | `country` | country | `` | 0c22ce74-1f98-43b8-8295-334e0100108b | `` |
| 17 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 18 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 19 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 20 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 21 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 22 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 23 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 24 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 25 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 26 | `tenant` | tenant | `tenant_id` | String | `text` |
| 27 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `country` -> `hred.ethnicgroup.Country` (0..n)
- `creator` -> `base.user.BipUser` ()
- `userDefineCharacter` -> `hred.ethnicgroup.UserDefineCharacter` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
