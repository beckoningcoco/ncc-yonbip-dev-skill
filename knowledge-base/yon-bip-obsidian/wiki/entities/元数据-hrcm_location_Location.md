---
tags: [BIP, 元数据, 数据字典, hrcm, hrcm.location.Location]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 工作地点 (`hrcm.location.Location`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `cs_location` | 应用: `HRCM`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 全部属性（37 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | String | `text` |  | true |
| 2 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | true |
| 3 | `code` | 编码 | `code` | String | `text` |  | true |
| 4 | `isDeleted` | 是否Deleted | `dr` | Boolean | `switch` |  | true |
| 5 | `permanreside` | permanreside | `permanreside` | 95577e23-979f-4f09-a629-61fea93e576d | `quote` |  | true |
| 6 | `distributionSite` | distributionSite | `distribution_site` | 21622298-40b3-4de4-89a6-7b8a4db38679 | `quote` |  | true |
| 7 | `name2` | name2 | `name2` | String | `text` |  | true |
| 8 | `name3` | name3 | `name3` | String | `text` |  | true |
| 9 | `name4` | name4 | `name4` | String | `text` |  | true |
| 10 | `name5` | name5 | `name5` | String | `text` |  | true |
| 11 | `name6` | name6 | `name6` | String | `text` |  | true |
| 12 | `parent` | parent | `parent_id` | 95256905-1d37-4ca6-a37f-ddbdab4d1c25 | `quote` |  | true |
| 13 | `address` | address | `address` | String | `text` |  | true |
| 14 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |  | true |
| 15 | `tenant` | tenant | `tenantid` | String | `text` |  | true |
| 16 | `country` | country | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |  | true |
| 17 | `timezone` | timezone | `timezone` | String | `text` |  | true |
| 18 | `userDefineCharacter001` | userDefineCharacter001 | `userDefineCharacter001` | b9c8122c-9896-4253-8a62-1ab11d83394b | `UserDefine` |  | true |
| 19 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 20 | `creatorName` | creator名称 | `creator` | String | `text` |  | true |
| 21 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 22 | `modifierName` | modifier名称 | `modifier` | String | `text` |  | true |
| 23 | `enablets` | enablets | `enablets` | DateTime | `timestamp` | false | true |
| 24 | `disablets` | disablets | `disablets` | DateTime | `timestamp` | false | true |
| 25 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 26 | `level` | level | `level` | Integer | `int` |  | true |
| 27 | `path` | path | `path` | String | `text` |  | true |
| 28 | `sort` | sort | `sort_num` | Integer | `int` |  | true |
| 29 | `dr` | 逻辑删除 | `dr` | Short | `short` |  | true |
| 30 | `name` | 名称 | `name` | String | `multiLanguage` |  | true |
| 31 | `memo` | 备注 | `memo` | String | `text` |  | true |
| 32 | `enable` | enable | `enable` | Boolean | `switch` | false | true |
| 33 | `creator` | 创建人 | `creatorYhtId` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 34 | `createTime` | 创建时间 | `creationtime` | DateTime | `timestamp` |  | true |
| 35 | `modifier` | 修改人 | `modifierYhtId` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 36 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |  | true |
| 37 | `LocationScopeOrg` | LocationScopeOrg | `` | 3aecc5d2-232a-4e50-b563-a5ccac6c32d9 | `` |  |  |

## 关联属性（11 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `permanreside` | `bd.region.BaseRegionVO` | `permanreside` |  |  |  |
| 2 | `LocationScopeOrg` | `hrcm.location.LocationScopeOrg` | `` | 0..n | Y |  |
| 3 | `country` | `bd.country.CountryVO` | `country` |  |  |  |
| 4 | `parent` | `hrcm.location.Location` | `parent_id` |  |  |  |
| 5 | `creator` | `base.user.BipUser` | `creatorYhtId` |  |  |  |
| 6 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 7 | `modifier` | `base.user.BipUser` | `modifierYhtId` |  |  |  |
| 8 | `distributionSite` | `hrcb.distributionSite.DistributionSite` | `distribution_site` |  |  |  |
| 9 | `creatorId` | `base.user.User` | `creatorId` |  |  |  |
| 10 | `modifierId` | `base.user.User` | `modifierId` |  |  |  |
| 11 | `userDefineCharacter001` | `hrcm.location.userDefineCharacter001` | `userDefineCharacter001` |  |  |  |

## 依赖接口（7 个）

- `IEnable` → `hrcm.common.IEnable` (v96)
- `ITenant` → `ucfbase.ucfbaseItf.ITenant` (v77)
- `IYTenant` → `ucfbase.ucfbaseItf.IYTenant` (v40)
- `ITree` → `ucfbase.ucfbaseItf.ITree` (v339)
- `IAuditInfo` → `ucfbase.ucfbaseItf.IAuditInfo` (v192)
- `LogicDelete` → `ucfbase.ucfbaseItf.LogicDelete` (v74)
- `IDistributionSource` → `hrbase.hrbaseItf.IDistributionSource` (v1)

## SQL 示例

```sql
SELECT id, ts, code, dr, permanreside, distribution_site, name2, name3
FROM cs_location
```