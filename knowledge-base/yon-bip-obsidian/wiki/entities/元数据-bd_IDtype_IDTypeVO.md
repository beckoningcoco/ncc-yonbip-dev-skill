---
tags: [BIP, 元数据, 数据字典, bd, bd.IDtype.IDTypeVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 证件类型 (`bd.IDtype.IDTypeVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_idtype` | 应用: `DPMSTF`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 全部属性（27 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 2 | `dr` | 逻辑删除 | `dr` | Short | `short` |  | true |
| 3 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 4 | `name2` | name2 | `name2` | String | `text` |  | true |
| 5 | `name3` | name3 | `name3` | String | `text` |  | true |
| 6 | `name4` | name4 | `name4` | String | `text` |  | true |
| 7 | `name5` | name5 | `name5` | String | `text` |  | true |
| 8 | `name6` | name6 | `name6` | String | `text` |  | true |
| 9 | `name_resid` | name_resid | `name_resid` | String | `text` |  | true |
| 10 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 11 | `name` | 名称 | `name` | String | `multiLanguage` |  | true |
| 12 | `code` | 编码 | `code` | String | `text` |  | true |
| 13 | `id` | 主键ID | `id` | String | `text` |  | true |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | true |
| 15 | `sysid` | sysid | `sysid` | String | `text` |  | true |
| 16 | `enable` | enable | `enable` | Integer | `int` |  | true |
| 17 | `countryList` | countryList | `` | 96a13a80-714c-4f2d-985b-a392d3e4260d | `` |  |  |
| 18 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | true |
| 19 | `description` | description | `description` | String | `multiLanguage` |  | true |
| 20 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |  | true |
| 21 | `distributionSite` | distributionSite | `distribution_site` | String | `text` |  | true |
| 22 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |  | true |
| 23 | `ispreset` | 是否preset | `ispreset` | Boolean | `switch` |  | true |
| 24 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | true |
| 25 | `objid` | objid | `objid` | String | `text` |  | true |
| 26 | `sortnum` | sortnum | `sortnum` | Integer | `int` |  | true |
| 27 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |

## 关联属性（5 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `creator` | `base.user.BipUser` | `creator` |  |  |  |
| 2 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 3 | `modifier` | `base.user.BipUser` | `modifier` |  |  |  |
| 4 | `countryList` | `bd.IDtype.IDTypeVOCountry` | `` | 0..n | Y |  |
| 5 | `tenant` | `yht.tenant.YhtTenant` | `tenantid` |  |  |  |

## 依赖接口（5 个）

- `IEnable` → `ucfbase.ucfbaseItf.IEnable` (v141)
- `IYTenant` → `ucfbase.ucfbaseItf.IYTenant` (v40)
- `IAuditInfo` → `ucfbase.ucfbaseItf.IAuditInfo` (v192)
- `LogicDelete` → `ucfbase.ucfbaseItf.LogicDelete` (v74)
- `BasedocITenant` → `basedoc.basedocItf.BasedocITenant` (v103)

## SQL 示例

```sql
SELECT creator, dr, modifier, name2, name3, name4, name5, name6
FROM bd_idtype
```