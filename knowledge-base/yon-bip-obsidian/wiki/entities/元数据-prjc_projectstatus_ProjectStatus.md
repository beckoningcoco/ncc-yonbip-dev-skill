---
tags: [BIP, 元数据, 数据字典, prjc, prjc.projectstatus.ProjectStatus]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 项目状态档案 (`prjc.projectstatus.ProjectStatus`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `prjc_projectstatus` | 应用: `PRJC`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |

## 全部属性（16 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `code` | 编码 | `code` | String | `text` | false | true |
| 2 | `defaultFlag` | defaultFlag | `default_flag` | pm_default_flag | `singleOption` | false | true |
| 3 | `memo` | 备注 | `memo` | String | `text` | false | true |
| 4 | `name` | 名称 | `name` | String | `multiLanguage` | false | true |
| 5 | `statusType` | statusType | `status_type` | Integer | `int` | false | true |
| 6 | `id` | 主键ID | `id` | String | `text` |  | true |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |  | true |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | true |
| 9 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 10 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | true |
| 12 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |  | true |
| 13 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |  | true |
| 14 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |  | true |
| 15 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true |
| 16 | `dr` | 逻辑删除 | `dr` | Short | `short` |  | true |

## 关联属性（3 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `creator` | `base.user.BipUser` | `creator` |  |  |  |
| 2 | `modifier` | `base.user.BipUser` | `modifier` |  |  |  |
| 3 | `ytenantId` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |

## 依赖接口（5 个）

- `IEnable` → `iuap.busiObj.IEnable` (v508)
- `IAuditInfo` → `iuap.busiObj.IAuditInfo` (v679)
- `IEnable` → `ucfbase.ucfbaseItf.IEnable` (v141)
- `IYTenant` → `iuap.busiObj.IYTenant` (v214)
- `LogicDelete` → `iuap.busiObj.LogicDelete` (v211)

## SQL 示例

```sql
SELECT code, default_flag, memo, name, status_type, id, pubts, create_time
FROM prjc_projectstatus
```