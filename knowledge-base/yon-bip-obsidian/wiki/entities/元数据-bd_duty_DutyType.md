---
tags: [BIP, 元数据, 数据字典, bd.duty.DutyType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 职务类别 (`bd.duty.DutyType`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_duty_type` | 应用: `DPMSTF` | 类型: `Class`

## 属性（38 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |
| 4 | `org_id` | org_id | `org_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 5 | `parentid` | parentid | `parentid` | b2f08443-e693-453c-a005-3c1dcc11af06 | `quote` |
| 6 | `memo` | 备注 | `memo` | String | `multiLanguage` |
| 7 | `sysid` | sysid | `sysid` | String | `text` |
| 8 | `user_define_character` | user_define_character | `user_define_character` | db106423-2022-4051-827c-569567bea49f | `UserDefine` |
| 9 | `enable` | enable | `enable` | Integer | `int` |
| 10 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 11 | `createTime` | 创建时间 | `creationtime` | DateTime | `timestamp` |
| 12 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 13 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |
| 14 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 15 | `name2` | name2 | `name2` | String | `text` |
| 16 | `name3` | name3 | `name3` | String | `text` |
| 17 | `name4` | name4 | `name4` | String | `text` |
| 18 | `name5` | name5 | `name5` | String | `text` |
| 19 | `name6` | name6 | `name6` | String | `text` |
| 20 | `ts` | ts | `ts` | DateTime | `timestamp` |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 22 | `objid` | objid | `objid` | String | `text` |
| 23 | `businessid` | businessid | `businessid` | String | `text` |
| 24 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |
| 25 | `distributionSite` | distributionSite | `distribution_site` | String | `text` |
| 26 | `log` | log | `log` | String | `text` |
| 27 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 28 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 29 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 30 | `ranktype_id` | ranktype_id | `ranktype_id` | b5f4c40b-1358-4722-a759-06891ee69b00 | `quote` |
| 31 | `parent` | parent | `parent_id` | String | `text` |
| 32 | `level` | 层级 | `level` | Integer | `int` |
| 33 | `path` | path | `path` | String | `text` |
| 34 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 35 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 36 | `starttime` | starttime | `start_time` | DateTime | `timestamp` |
| 37 | `endtime` | endtime | `end_time` | DateTime | `timestamp` |
| 38 | `bu_id` | bu_id | `bu_id` | String | `text` |

## 关联（8 个）

- `user_define_character` -> `bd.duty.DutyTypeTZDefines` ()
- `creator` -> `base.user.BipUser` ()
- `ranktype_id` -> `bd.ranktype.RankType` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `org_id` -> `bd.adminOrg.AdminOrgVO` ()
- `modifier` -> `base.user.BipUser` ()
- `parentid` -> `bd.duty.DutyType` ()
- `tenant` -> `yht.tenant.YhtTenant` ()
