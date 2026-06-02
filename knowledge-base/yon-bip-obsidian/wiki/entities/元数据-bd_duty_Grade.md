---
tags: [BIP, 元数据, 数据字典, bd, bd.duty.Grade]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 职等 (`bd.duty.Grade`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_grade` | 应用: `DPMSTF`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 全部属性（38 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | String | `text` |  | true |
| 2 | `code` | 编码 | `code` | String | `text` | true | false |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` | false | true |
| 4 | `org_id` | org_id | `org_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | true |
| 5 | `memo` | 备注 | `memo` | String | `multiLanguage` |  | true |
| 6 | `user_define_character` | user_define_character | `user_define_character` | 191188e3-fdfd-41e4-82fe-31a1930c7840 | `UserDefine` |  | true |
| 7 | `jobrankorder` | jobrankorder | `jobrankorder` | Integer | `int` |  | true |
| 8 | `enable` | enable | `enable` | Integer | `int` | true | false |
| 9 | `sysid` | sysid | `sysid` | String | `text` |  | true |
| 10 | `orgGroupId` | orgGroupID | `org_group_id` | String | `text` |  | true |
| 11 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 12 | `createTime` | 创建时间 | `creationtime` | DateTime | `dateTime` |  | true |
| 13 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 14 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime | `dateTime` |  | true |
| 15 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 16 | `name2` | name2 | `name2` | String | `text` |  | true |
| 17 | `name3` | name3 | `name3` | String | `text` |  | true |
| 18 | `name4` | name4 | `name4` | String | `text` |  | true |
| 19 | `name5` | name5 | `name5` | String | `text` |  | true |
| 20 | `name6` | name6 | `name6` | String | `text` |  | true |
| 21 | `memo2` | memo2 | `memo2` | String | `text` |  | true |
| 22 | `memo3` | memo3 | `memo3` | String | `text` |  | true |
| 23 | `memo4` | memo4 | `memo4` | String | `text` |  | true |
| 24 | `memo5` | memo5 | `memo5` | String | `text` |  | true |
| 25 | `memo6` | memo6 | `memo6` | String | `text` |  | true |
| 26 | `ts` | ts | `ts` | DateTime | `timestamp` |  | false |
| 27 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 28 | `objid` | objid | `objid` | String | `text` |  | true |
| 29 | `businessid` | businessid | `businessid` | String | `text` |  | true |
| 30 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |  | true |
| 31 | `distributionSite` | distributionSite | `distribution_site` | String | `text` |  | true |
| 32 | `log` | log | `log` | String | `text` |  | true |
| 33 | `dr` | 逻辑删除 | `dr` | Integer | `int` |  | true |
| 34 | `tenantid` | tenantid | `tenantid` | String | `text` |  | true |
| 35 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 36 | `bu_id` | bu_id | `bu_id` | String | `text` |  | true |
| 37 | `starttime` | starttime | `start_time` | DateTime | `timestamp` |  | true |
| 38 | `endtime` | endtime | `end_time` | DateTime | `timestamp` |  | true |

## 关联属性（6 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `user_define_character` | `bd.duty.GradeTZDefines` | `user_define_character` |  |  |  |
| 2 | `creator` | `base.user.BipUser` | `creator` |  |  |  |
| 3 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 4 | `org_id` | `bd.adminOrg.AdminOrgVO` | `org_id` |  |  |  |
| 5 | `modifier` | `base.user.BipUser` | `modifier` |  |  |  |
| 6 | `tenant` | `yht.tenant.YhtTenant` | `tenantid` |  |  |  |

## 依赖接口（8 个）

- `BasedocIState` → `basedoc.basedocItf.BasedocIState` (v101)
- `BasedocITenant` → `basedoc.basedocItf.BasedocITenant` (v103)
- `ISystemInfo` → `bd.itf.ISystemInfo` (v77)
- `ITimeLineDoc` → `hred.itf.ITimeLineDoc` (v75)
- `IYTenant` → `ucfbase.ucfbaseItf.IYTenant` (v40)
- `LogicDelete` → `basedoc.basedocItf.LogicDelete` (v31)
- `IAutoCode` → `voucher.base.IAutoCode` (v49)
- `IAuditInfo` → `ucfbase.ucfbaseItf.IAuditInfo` (v192)

## SQL 示例

```sql
SELECT id, code, name, org_id, memo, user_define_character, jobrankorder, enable
FROM bd_grade
```