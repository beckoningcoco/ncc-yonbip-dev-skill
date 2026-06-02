---
tags: [BIP, 元数据, 数据字典, aa.store.StoreLabel]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 终端标签 (`aa.store.StoreLabel`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_storelabel` | 应用: `Marketingpublic` | 类型: `Class`

## 属性（16 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `terminal` | terminal | `terminalId` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | `quote` |
| 3 | `label` | label | `labelId` | 65baa6d5-f5e1-486a-a5fe-e9dd532bf8c0 | `quote` |
| 4 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 5 | `labelValueId` | labelValueID | `labelValueId` | d5e6877e-9cc6-44c4-886c-ba1d151fbdd8 | `quote` |
| 6 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 7 | `creator` | 创建人 | `creator` | String | `text` |
| 8 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 9 | `modifier` | 修改人 | `modifier` | String | `text` |
| 10 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 14 | `setlabelType` | setlabelType | `setlabel_type` | Short | `short` |
| 15 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 16 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（7 个）

- `labelValueId` -> `uhybase.labeldoc.LabelValue` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `label` -> `uhybase.labeldoc.labeldoc` ()
- `terminal` -> `aa.store.Store` (0..n)
- `tenant` -> `base.tenant.Tenant` ()
