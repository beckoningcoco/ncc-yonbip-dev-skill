---
tags: [BIP, 元数据, 数据字典, bd.staff.PsnlCatg]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 员工类别 (`bd.staff.PsnlCatg`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_psnl_catg` | 应用: `DPMSTF` | 类型: `Class`

## 属性（39 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `bu_id` | bu_id | `bu_id` | String | `text` |
| 2 | `businessid` | businessid | `businessid` | String | `text` |
| 3 | `cltype` | cltype | `cltype` | Integer | `int` |
| 4 | `code` | 编码 | `code` | String | `text` |
| 5 | `country` | country | `country` | b3429f8e-f5f1-4d41-8caf-be62768f2cdb | `quote` |
| 6 | `countryList` | countryList | `` | b3429f8e-f5f1-4d41-8caf-be62768f2cdb | `` |
| 7 | `createTime` | 创建时间 | `creationtime` | DateTime | `timestamp` |
| 8 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 9 | `defines` | defines | `` | 58084c6b-6815-4e0a-9e96-6a112356c5dc | `` |
| 10 | `distributionSite` | distributionSite | `distribution_site` | String | `text` |
| 11 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 12 | `enable` | enable | `enable` | Integer | `int` |
| 13 | `id` | ID | `id` | String | `text` |
| 14 | `innercode` | innercode | `innercode` | String | `text` |
| 15 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 16 | `level` | 层级 | `level` | Integer | `int` |
| 17 | `log` | log | `log` | String | `text` |
| 18 | `memo` | 备注 | `memo` | String | `text` |
| 19 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 20 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |
| 21 | `name` | 名称 | `name` | String | `multiLanguage` |
| 22 | `name2` | name2 | `name2` | String | `text` |
| 23 | `name3` | name3 | `name3` | String | `text` |
| 24 | `name4` | name4 | `name4` | String | `text` |
| 25 | `name5` | name5 | `name5` | String | `text` |
| 26 | `name6` | name6 | `name6` | String | `text` |
| 27 | `objid` | objid | `objid` | String | `text` |
| 28 | `parent` | parent | `parentid` | 03a11361-aad7-416c-95cd-ccd64f14d503 | `quote` |
| 29 | `parentid` | parentid | `parentid` | 03a11361-aad7-416c-95cd-ccd64f14d503 | `quote` |
| 30 | `path` | path | `path` | String | `text` |
| 31 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 32 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 33 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |
| 34 | `sysid` | sysid | `sysid` | String | `text` |
| 35 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 36 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 37 | `ts` | ts | `ts` | DateTime | `timestamp` |
| 38 | `user_define_character` | user_define_character | `user_define_character` | 197de504-4c3d-4300-ad71-73d1d8c0c42e | `UserDefine` |
| 39 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（10 个）

- `country` -> `bd.staff.PsnlCatgCountry` ()
- `parent` -> `bd.staff.PsnlCatg` ()
- `user_define_character` -> `bd.staff.PsnlCatgDefineCharacter` ()
- `creator` -> `base.user.BipUser` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
- `countryList` -> `bd.staff.PsnlCatgCountry` (0..n)
- `parentid` -> `bd.staff.PsnlCatg` ()
- `tenant` -> `yht.tenant.YhtTenant` ()
- `defines` -> `bd.staff.PsnlCatgDefine` (1)
