---
tags: [BIP, 元数据, 数据字典, bd.ranktype.RankType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 职级类别 (`bd.ranktype.RankType`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_rank_type` | 应用: `DPMSTF` | 类型: `Class`

## 属性（23 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |
| 4 | `org_id` | org_id | `org_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 5 | `user_define_character` | user_define_character | `user_define_character` | 1670b0da-d6f2-4f95-a0f4-19dfe57cdc5e | `UserDefine` |
| 6 | `memo` | 备注 | `memo` | String | `multiLanguage` |
| 7 | `enable` | enable | `enable` | Integer | `int` |
| 8 | `sysid` | sysid | `sysid` | String | `text` |
| 9 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 10 | `createTime` | 创建时间 | `creationtime` | DateTime | `timestamp` |
| 11 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 12 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |
| 13 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 14 | `ts` | ts | `ts` | DateTime | `timestamp` |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 16 | `objid` | objid | `objid` | String | `text` |
| 17 | `distributionSite` | distributionSite | `distribution_site` | String | `text` |
| 18 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 19 | `starttime` | starttime | `start_time` | DateTime | `timestamp` |
| 20 | `endtime` | endtime | `end_time` | DateTime | `timestamp` |
| 21 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 22 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 23 | `defines` | defines | `` | 3c94d5fa-ce3f-41b3-b9ec-d8148f609866 | `` |

## 关联（7 个）

- `user_define_character` -> `bd.ranktype.RankTypeTZDefines` ()
- `creator` -> `base.user.BipUser` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `org_id` -> `bd.adminOrg.AdminOrgVO` ()
- `modifier` -> `base.user.BipUser` ()
- `tenant` -> `yht.tenant.YhtTenant` ()
- `defines` -> `bd.ranktype.RankTypeDefine` (1)
