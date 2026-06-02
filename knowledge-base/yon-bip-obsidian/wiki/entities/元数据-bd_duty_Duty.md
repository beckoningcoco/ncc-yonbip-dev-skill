---
tags: [BIP, 元数据, 数据字典, bd.duty.Duty]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 职务 (`bd.duty.Duty`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_duty` | 应用: `DPMSTF` | 类型: `Class`

## 属性（52 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |
| 4 | `org_id` | org_id | `org_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 5 | `jobtype_id` | jobtype_id | `jobtype_id` | b2f08443-e693-453c-a005-3c1dcc11af06 | `quote` |
| 6 | `jobgrade_id` | jobgrade_id | `jobgrade_id` | 7dfa7985-5073-4394-8f4f-cea8d1829b84 | `quote` |
| 7 | `maxrank_id` | maxrank_id | `maxrank_id` | e00dd36a-aace-43d2-9e87-156b36799fef | `quote` |
| 8 | `minrank_id` | minrank_id | `minrank_id` | e00dd36a-aace-43d2-9e87-156b36799fef | `quote` |
| 9 | `duties` | duties | `duties` | String | `text` |
| 10 | `maxage` | maxage | `maxage` | Integer | `int` |
| 11 | `minage` | minage | `minage` | Integer | `int` |
| 12 | `professional` | professional | `professional` | String | `text` |
| 13 | `degree` | degree | `degree` | String | `text` |
| 14 | `reqedu` | reqedu | `reqedu` | String | `text` |
| 15 | `reqsex` | reqsex | `reqsex` | String | `text` |
| 16 | `reqworktime` | reqworktime | `reqworktime` | Integer | `int` |
| 17 | `sysid` | sysid | `sysid` | String | `text` |
| 18 | `reqexp` | reqexp | `reqexp` | String | `text` |
| 19 | `reqcert` | reqcert | `reqcert` | String | `text` |
| 20 | `user_define_character` | user_define_character | `user_define_character` | 9b40ca9d-41ec-4b90-85fb-c5cb94082cd6 | `UserDefine` |
| 21 | `memo` | 备注 | `memo` | String | `multiLanguage` |
| 22 | `orgGroupId` | orgGroupID | `org_group_id` | String | `text` |
| 23 | `enable` | enable | `enable` | Integer | `int` |
| 24 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 25 | `createTime` | 创建时间 | `creationtime` | DateTime | `timestamp` |
| 26 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 27 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |
| 28 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 29 | `name2` | name2 | `name2` | String | `text` |
| 30 | `name3` | name3 | `name3` | String | `text` |
| 31 | `name4` | name4 | `name4` | String | `text` |
| 32 | `name5` | name5 | `name5` | String | `text` |
| 33 | `name6` | name6 | `name6` | String | `text` |
| 34 | `memo2` | memo2 | `memo2` | String | `text` |
| 35 | `memo3` | memo3 | `memo3` | String | `text` |
| 36 | `memo4` | memo4 | `memo4` | String | `text` |
| 37 | `memo5` | memo5 | `memo5` | String | `text` |
| 38 | `memo6` | memo6 | `memo6` | String | `text` |
| 39 | `ts` | ts | `ts` | DateTime | `timestamp` |
| 40 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 41 | `objid` | objid | `objid` | String | `text` |
| 42 | `businessid` | businessid | `businessid` | String | `text` |
| 43 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |
| 44 | `distributionSite` | distributionSite | `distribution_site` | String | `text` |
| 45 | `log` | log | `log` | String | `text` |
| 46 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 47 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 48 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 49 | `starttime` | starttime | `start_time` | DateTime | `timestamp` |
| 50 | `endtime` | endtime | `end_time` | DateTime | `timestamp` |
| 51 | `bu_id` | bu_id | `bu_id` | String | `text` |
| 52 | `defines` | defines | `` | ee1c06f1-d114-415b-9b63-aba3b4032e06 | `` |

## 关联（11 个）

- `user_define_character` -> `bd.duty.DutyDefineCharacter` ()
- `creator` -> `base.user.BipUser` ()
- `jobgrade_id` -> `bd.duty.Rank` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `maxrank_id` -> `bd.duty.Grade` ()
- `org_id` -> `bd.adminOrg.AdminOrgVO` ()
- `modifier` -> `base.user.BipUser` ()
- `minrank_id` -> `bd.duty.Grade` ()
- `jobtype_id` -> `bd.duty.DutyType` ()
- `tenant` -> `yht.tenant.YhtTenant` ()
- `defines` -> `bd.duty.DutyDefine` (1)
