---
tags: [BIP, 元数据, 数据字典, bd, bd.period.AccPeriodScheme]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 会计日历 (`bd.period.AccPeriodScheme`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_accperiodscheme` | 应用: `FP`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 全部属性（27 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `code` | 编码 | `code` | String | `text` | false | true |
| 2 | `name` | 名称 | `name` | String | `multiLanguage` | false | true |
| 3 | `objId` | objID | `obj_id` | String | `text` | false | true |
| 4 | `periodClass` | periodClass | `periodClass` | PeriodType | `` | false | true |
| 5 | `startyear` | startyear | `startyear` | String | `text` | false | true |
| 6 | `periodcount` | periodcount | `periodcount` | String | `text` | false | true |
| 7 | `periodqcount` | periodqcount | `periodqcount` | String | `text` | false | true |
| 8 | `periodhcount` | periodhcount | `periodhcount` | String | `text` | false | true |
| 9 | `description` | description | `description` | String | `text` | false | true |
| 10 | `startdate` | startdate | `startdate` | Date | `date` | false | true |
| 11 | `system` | system | `system` | Boolean | `switch` | false | true |
| 12 | `owerorg` | owerorg | `owerorg` | dabb8185-bfd2-4ed3-a721-f5bc5d948246 | `quote` | false | true |
| 13 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 15 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 16 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 17 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 18 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 19 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 20 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 21 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 22 | `periodyear` | periodyear | `` | c1fb756f-95cc-4faf-b1bf-7cea0aa99973 | `` |  |  |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 24 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |  | true |
| 25 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |  | true |
| 26 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 27 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |

## 关联属性（6 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 2 | `owerorg` | `bd.virtualaccbody.VirtualAccbody_view` | `owerorg` |  |  |  |
| 3 | `periodyear` | `bd.period.PeriodYear` | `` | 0..n | Y |  |
| 4 | `creatorId` | `base.user.User` | `creatorId` |  |  |  |
| 5 | `modifierId` | `base.user.User` | `modifierId` |  |  |  |
| 6 | `tenant` | `base.tenant.Tenant` | `tenant_id` |  |  |  |

## 依赖接口（4 个）

- `ITenant` → `base.itf.ITenant` (v73)
- `IYTenant` → `ucfbase.ucfbaseItf.IYTenant` (v40)
- `IStopping` → `base.itf.IStopping` (v111)
- `IAuditInfo` → `base.itf.IAuditInfo` (v340)

## SQL 示例

```sql
SELECT code, name, obj_id, periodClass, startyear, periodcount, periodqcount, periodhcount
FROM bd_accperiodscheme
```