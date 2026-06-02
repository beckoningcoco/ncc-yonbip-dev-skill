---
tags: [BIP, 元数据, 数据字典, bd.virtualaccbody.VirtualAccbodyTreeMember]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会计主体树成员 (`bd.virtualaccbody.VirtualAccbodyTreeMember`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_virtualaccbody_tree_member` | 应用: `DPMACCT` | 类型: `Class`

## 属性（20 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `accentity` | accentity | `accentity` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 2 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 4 | `creator` | 创建人 | `creator` | String | `text` |
| 5 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 6 | `displayOrder` | displayOrder | `display_order` | Integer | `int` |
| 7 | `id` | ID | `id` | String | `text` |
| 8 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 9 | `level` | 层级 | `level` | Integer | `int` |
| 10 | `modifier` | 修改人 | `modifier` | String | `text` |
| 11 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 12 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 14 | `parent` | parent | `parent_id` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |
| 15 | `path` | path | `path` | String | `text` |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 17 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 18 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 19 | `treeVid` | treeVid | `tree_vid` | String | `text` |
| 20 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（6 个）

- `parent` -> `bd.virtualaccbody.VirtualAccbody` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `accentity` -> `bd.virtualaccbody.VirtualAccbody` (0..n)
- `tenant` -> `base.tenant.Tenant` ()
