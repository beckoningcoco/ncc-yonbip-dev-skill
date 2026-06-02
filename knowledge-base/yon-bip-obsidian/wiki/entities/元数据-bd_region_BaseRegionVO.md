---
tags: [BIP, 元数据, 数据字典, bd, bd.region.BaseRegionVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 行政区划 (`bd.region.BaseRegionVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_baseregion` | 应用: `DPMPI`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 全部属性（27 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | String | `text` |  | true |
| 2 | `code` | 编码 | `code` | String | `text` | false | true |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` | false | true |
| 4 | `enName` | en名称 | `en_name` | String | `text` | false | true |
| 5 | `parentCode` | parent编码 | `parent_code` | String | `text` | false | true |
| 6 | `objid` | objid | `objid` | String | `text` | false | true |
| 7 | `ispreset` | 是否preset | `ispreset` | Integer | `int` | false | true |
| 8 | `parent` | parent | `parent_id` | 95577e23-979f-4f09-a629-61fea93e576d | `quote` | false | true |
| 9 | `level` | level | `level` | Integer | `int` |  | true |
| 10 | `pathName` | path名称 | `path_name` | String | `multiLanguage` | false | true |
| 11 | `countryCode` | 国家编码 | `country_code` | String | `text` | false | true |
| 12 | `slyCode` | sly编码 | `sly_code` | String | `text` | false | true |
| 13 | `sysid` | sysid | `sysid` | String | `text` |  | true |
| 14 | `isEnd` | 是否End | `isEnd` | Integer | `int` | false | true |
| 15 | `enable` | enable | `enable` | Integer | `int` | false | true |
| 16 | `sort` | sort | `sort_num` | String | `text` | false | true |
| 17 | `path` | path | `path` | String | `text` |  | true |
| 18 | `dr` | 逻辑删除 | `dr` | Integer | `int` |  | true |
| 19 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | false | true |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 21 | `log` | log | `log` | String | `text` | false | true |
| 22 | `tenant` | tenant | `tenantid` | String | `text` | false | true |
| 23 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 24 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | true |
| 25 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 26 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | true |
| 27 | `BaseRegionStatusVOList` | BaseRegionStatusVOList | `` | 273e77c8-be84-404a-8916-fc525e541a93 | `` |  |  |

## 关联属性（5 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `parent` | `bd.region.BaseRegionVO` | `parent_id` |  |  |  |
| 2 | `creator` | `base.user.BipUser` | `creator` |  |  |  |
| 3 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 4 | `modifier` | `base.user.BipUser` | `modifier` |  |  |  |
| 5 | `BaseRegionStatusVOList` | `bd.region.BaseRegionStatusVO` | `` | 0..n | Y |  |

## 依赖接口（5 个）

- `BasedocIState` → `basedoc.basedocItf.BasedocIState` (v101)
- `ITree` → `ucfbase.ucfbaseItf.ITree` (v339)
- `IYTenant` → `ucfbase.ucfbaseItf.IYTenant` (v40)
- `LogicDelete` → `basedoc.basedocItf.LogicDelete` (v31)
- `IAuditInfo` → `iuap.busiObj.IAuditInfo` (v679)

## SQL 示例

```sql
SELECT id, code, name, en_name, parent_code, objid, ispreset, parent_id
FROM bd_baseregion
```