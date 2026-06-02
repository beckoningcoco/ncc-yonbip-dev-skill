---
tags: [BIP, 元数据, 数据字典, bd.costcenter.CostCenterClass]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成本中心类别 (`bd.costcenter.CostCenterClass`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_costcenter_class` | 应用: `DPMACCT` | 类型: `Class`

## 属性（21 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 4 | `creator` | 创建人 | `creator` | String | `text` |
| 5 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 6 | `description` | description | `description` | String | `text` |
| 7 | `disablets` | disablets | `disablets` | DateTime | `timestamp` |
| 8 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 9 | `enable` | enable | `enable` | Boolean | `switch` |
| 10 | `enablets` | enablets | `enablets` | DateTime | `timestamp` |
| 11 | `id` | ID | `id` | Long | `long` |
| 12 | `modifier` | 修改人 | `modifier` | String | `text` |
| 13 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 16 | `name` | 名称 | `name` | String | `multiLanguage` |
| 17 | `objid` | objid | `objid` | String | `text` |
| 18 | `preset` | preset | `preset` | Boolean | `switch` |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 20 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 21 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `tenant` -> `base.tenant.Tenant` ()
