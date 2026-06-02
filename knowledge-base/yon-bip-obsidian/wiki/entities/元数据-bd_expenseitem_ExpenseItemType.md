---
tags: [BIP, 元数据, 数据字典, bd, bd.expenseitem.ExpenseItemType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 费用项目类别 (`bd.expenseitem.ExpenseItemType`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_expenseitemtype` | 应用: `DPMACCT`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 全部属性（28 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 2 | `code` | 编码 | `code` | String | `text` | false | true |
| 3 | `remark` | remark | `remark` | String | `text` | false | true |
| 4 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 5 | `dr` | 逻辑删除 | `dr` | Short | `short` |  | true |
| 6 | `name` | 名称 | `name` | String | `multiLanguage` | false | true |
| 7 | `objid` | objid | `obj_id` | String | `text` | false | true |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 9 | `accentity` | accentity | `accentity` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` | false | true |
| 10 | `expenseitemtype` | expenseitemtype | `expenseitemtype` | f21b5eab-a129-49f6-ae72-9f9a2f415134 | `quote` | false | true |
| 11 | `enabled` | enabled | `enabled` | Boolean | `switch` | false | true |
| 12 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 13 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 16 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 17 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 18 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 19 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 20 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |  | true |
| 21 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |  | true |
| 22 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 23 | `character` | character | `character` | b914a4c3-e7db-4291-9712-0e6d81672058 | `UserDefine` | false | true |
| 24 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |  | true |
| 25 | `level` | level | `level` | Integer | `int` |  | true |
| 26 | `parent` | parent | `parent` | f21b5eab-a129-49f6-ae72-9f9a2f415134 | `quote` | false | true |
| 27 | `path` | path | `path` | String | `text` |  | true |
| 28 | `sort` | sort | `sort_num` | Integer | `int` |  | true |

## 关联属性（8 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `parent` | `bd.expenseitem.ExpenseItemType` | `parent` |  |  |  |
| 2 | `character` | `bd.expenseitem.expenseitemTypeCharacter` | `character` |  |  |  |
| 3 | `expenseitemtype` | `bd.expenseitem.ExpenseItemType` | `expenseitemtype` |  |  |  |
| 4 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 5 | `creatorId` | `base.user.User` | `creatorId` |  |  |  |
| 6 | `modifierId` | `base.user.User` | `modifierId` |  |  |  |
| 7 | `accentity` | `org.func.BaseOrg` | `accentity` |  |  |  |
| 8 | `tenant` | `base.tenant.Tenant` | `tenant_id` |  |  |  |

## 依赖接口（7 个）

- `IAuditInfo` → `base.itf.IAuditInfo` (v340)
- `IYTenant` → `ucfbase.ucfbaseItf.IYTenant` (v40)
- `ITenant` → `base.itf.ITenant` (v73)
- `ITree` → `ucfbase.ucfbaseItf.ITree` (v339)
- `ITree` → `base.itf.ITree` (v231)
- `IStopping` → `base.itf.IStopping` (v111)
- `LogicDelete` → `ucfbase.ucfbaseItf.LogicDelete` (v74)

## SQL 示例

```sql
SELECT id, code, remark, ytenant_id, dr, name, obj_id, pubts
FROM bd_expenseitemtype
```