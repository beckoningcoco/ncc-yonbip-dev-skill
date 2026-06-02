---
tags: [BIP, 元数据, 数据字典, socialmdm.social.HouseholdType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 户口性质 (`socialmdm.social.HouseholdType`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mdm_householdtypetbcode` | 应用: `HRED` | 类型: `Class`

## 属性（31 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `mdmSeal` | mdmSeal | `mdm_seal` | Integer | `int` |
| 2 | `linkFieldValue` | linkFieldValue | `link_fieldvalue` | String | `text` |
| 3 | `updateAt` | updateAt | `update_at` | String | `text` |
| 4 | `mdmCode` | mdm编码 | `mdm_code` | String | `text` |
| 5 | `nameResId` | nameResID | `name_resid` | String | `text` |
| 6 | `treeParentId` | treeParentID | `treeparentid` | String | `text` |
| 7 | `description` | description | `description` | String | `multiLanguage` |
| 8 | `treeMasterId` | treeMasterID | `treemasterid` | String | `text` |
| 9 | `name` | 名称 | `name` | String | `multiLanguage` |
| 10 | `ytenantId` | ytenantID | `ytenant_id` | String | `text` |
| 11 | `treeRefForeignKey` | treeRefForeignKey | `treeref_foreignkey` | String | `text` |
| 12 | `ispreset` | 是否preset | `ispreset` | Boolean | `switch` |
| 13 | `sortnum` | sortnum | `sortnum` | Integer | `int` |
| 14 | `code` | 编码 | `code` | String | `text` |
| 15 | `id` | ID | `pk_mdm` | String | `text` |
| 16 | `mdmParentCode` | mdmParent编码 | `mdm_parentcode` | String | `text` |
| 17 | `userDefineCharacter` | userDefineCharacter | `user_define_character` | 8e0bd013-a83d-4615-892b-6ee4f5173418 | `UserDefine` |
| 18 | `hid` | hid | `hid` | String | `text` |
| 19 | `mdmDuplicate` | mdmDuplicate | `mdm_duplicate` | Integer | `int` |
| 20 | `sysid` | sysid | `sys_id` | String | `text` |
| 21 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 22 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 23 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 24 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 25 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 26 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 27 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 28 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 29 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 30 | `tenant` | tenant | `tenant_id` | String | `text` |
| 31 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `creator` -> `base.user.BipUser` ()
- `userDefineCharacter` -> `hred.residregistnat.UserDefineCharacter` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
