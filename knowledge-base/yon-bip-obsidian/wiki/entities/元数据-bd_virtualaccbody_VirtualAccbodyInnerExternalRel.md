---
tags: [BIP, 元数据, 数据字典, bd.virtualaccbody.VirtualAccbodyInnerExternalRel]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会计主体对内对外关系 (`bd.virtualaccbody.VirtualAccbodyInnerExternalRel`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_virtualaccbody_innerexternal_rel` | 应用: `DPMACCT` | 类型: `Class`

## 属性（18 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `accentity` | accentity | `accentity` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 3 | `innerExternal` | innerExternal | `inner_external` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 4 | `innerExternalType` | innerExternalType | `inner_external_type` | Integer | `int` |
| 5 | `creator` | 创建人 | `creator` | String | `text` |
| 6 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 7 | `modifier` | 修改人 | `modifier` | String | `text` |
| 8 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 9 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 10 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 12 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 13 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 14 | `bdefault` | bdefault | `bdefault` | Boolean | `switch` |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 16 | `rowno` | rowno | `rowno` | Integer | `int` |
| 17 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 18 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（6 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `accentity` -> `bd.virtualaccbody.VirtualAccbody` (0..n)
- `tenant` -> `base.tenant.Tenant` ()
- `innerExternal` -> `bd.virtualaccbody.VirtualAccbody` ()
