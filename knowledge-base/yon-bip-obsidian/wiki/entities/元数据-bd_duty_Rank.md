---
tags: [BIP, 元数据, 数据字典, bd, bd.duty.Rank]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 职级 (`bd.duty.Rank`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_rank` | 应用: `DPMSTF`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 全部属性（42 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | String | `text` |  | true |
| 2 | `code` | 编码 | `code` | String | `text` | true | false |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` | false | true |
| 4 | `org_id` | org_id | `org_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | true |
| 5 | `ranktype_id` | ranktype_id | `ranktype_id` | b5f4c40b-1358-4722-a759-06891ee69b00 | `quote` |  | true |
| 6 | `maxrank_id` | maxrank_id | `maxrank_id` | e00dd36a-aace-43d2-9e87-156b36799fef | `quote` |  | true |
| 7 | `minrank_id` | minrank_id | `minrank_id` | e00dd36a-aace-43d2-9e87-156b36799fef | `quote` |  | true |
| 8 | `memo` | 备注 | `memo` | String | `multiLanguage` |  | true |
| 9 | `user_define_character` | user_define_character | `user_define_character` | 2415227a-7b7b-4654-89a5-9ded4fc59715 | `UserDefine` |  | true |
| 10 | `orderNo` | orderNo | `order_no` | Long | `long` |  | true |
| 11 | `enable` | enable | `enable` | Integer | `int` | true | false |
| 12 | `orgGroupId` | orgGroupID | `org_group_id` | String | `text` |  | true |
| 13 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 14 | `createTime` | 创建时间 | `creationtime` | DateTime | `timestamp` |  | true |
| 15 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 16 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |  | true |
| 17 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 18 | `name2` | name2 | `name2` | String | `text` |  | true |
| 19 | `name3` | name3 | `name3` | String | `text` |  | true |
| 20 | `name4` | name4 | `name4` | String | `text` |  | true |
| 21 | `name5` | name5 | `name5` | String | `text` |  | true |
| 22 | `name6` | name6 | `name6` | String | `text` |  | true |
| 23 | `memo2` | memo2 | `memo2` | String | `text` |  | true |
| 24 | `memo3` | memo3 | `memo3` | String | `text` |  | true |
| 25 | `memo4` | memo4 | `memo4` | String | `text` |  | true |
| 26 | `memo5` | memo5 | `memo5` | String | `text` |  | true |
| 27 | `memo6` | memo6 | `memo6` | String | `text` |  | true |
| 28 | `ts` | ts | `ts` | DateTime | `timestamp` |  | false |
| 29 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 30 | `objid` | objid | `objid` | String | `text` |  | true |
| 31 | `businessid` | businessid | `businessid` | String | `text` |  | true |
| 32 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |  | true |
| 33 | `distributionSite` | distributionSite | `distribution_site` | String | `text` |  | true |
| 34 | `log` | log | `log` | String | `text` |  | true |
| 35 | `dr` | 逻辑删除 | `dr` | Integer | `int` |  | true |
| 36 | `tenantid` | tenantid | `tenantid` | String | `text` |  | true |
| 37 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 38 | `starttime` | starttime | `start_time` | DateTime | `timestamp` |  | true |
| 39 | `endtime` | endtime | `end_time` | DateTime | `timestamp` |  | true |
| 40 | `jobtype_id` | jobtype_id | `jobtype_id` | b2f08443-e693-453c-a005-3c1dcc11af06 | `quote` | false | true |
| 41 | `sysid` | sysid | `sysid` | String | `text` |  | true |
| 42 | `bu_id` | bu_id | `bu_id` | String | `text` |  | true |

## 关联属性（10 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `user_define_character` | `bd.duty.RankTZDefines` | `user_define_character` |  |  |  |
| 2 | `creator` | `base.user.BipUser` | `creator` |  |  |  |
| 3 | `ranktype_id` | `bd.ranktype.RankType` | `ranktype_id` |  |  |  |
| 4 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 5 | `maxrank_id` | `bd.duty.Grade` | `maxrank_id` |  |  |  |
| 6 | `org_id` | `bd.adminOrg.AdminOrgVO` | `org_id` |  |  |  |
| 7 | `modifier` | `base.user.BipUser` | `modifier` |  |  |  |
| 8 | `minrank_id` | `bd.duty.Grade` | `minrank_id` |  |  |  |
| 9 | `jobtype_id` | `bd.duty.DutyType` | `jobtype_id` |  |  |  |
| 10 | `tenant` | `yht.tenant.YhtTenant` | `tenantid` |  |  |  |

## 依赖接口（8 个）

- `BasedocIState` → `basedoc.basedocItf.BasedocIState` (v101)
- `BasedocITenant` → `basedoc.basedocItf.BasedocITenant` (v103)
- `ISystemInfo` → `bd.itf.ISystemInfo` (v77)
- `ITimeLineDoc` → `hred.itf.ITimeLineDoc` (v75)
- `IAutoCode` → `voucher.base.IAutoCode` (v49)
- `IYTenant` → `ucfbase.ucfbaseItf.IYTenant` (v40)
- `LogicDelete` → `basedoc.basedocItf.LogicDelete` (v31)
- `IAuditInfo` → `ucfbase.ucfbaseItf.IAuditInfo` (v192)

## SQL 示例

```sql
SELECT id, code, name, org_id, ranktype_id, maxrank_id, minrank_id, memo
FROM bd_rank
```