---
tags: [BIP, 元数据, 数据字典, bd.costcenter.CostCenterAccentity]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 共享会计主体 (`bd.costcenter.CostCenterAccentity`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_costcenter_accentity` | 应用: `DPMACCT` | 类型: `Class`

## 属性（16 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `accentity` | accentity | `accentity` | dabb8185-bfd2-4ed3-a721-f5bc5d948246 | `quote` |
| 2 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 4 | `creator` | 创建人 | `creator` | String | `text` |
| 5 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 6 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 7 | `header` | header | `header` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |
| 8 | `id` | ID | `id` | String | `text` |
| 9 | `modifier` | 修改人 | `modifier` | String | `text` |
| 10 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 13 | `org` | org | `orgId` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 15 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 16 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（7 个）

- `org` -> `org.func.BaseOrg` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `header` -> `bd.costcenter.CostCenter` (0..n)
- `accentity` -> `bd.virtualaccbody.VirtualAccbody_view` ()
- `tenant` -> `base.tenant.Tenant` ()
