---
tags: [BIP, 元数据, 数据字典, bd.costcenter.virtually]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成本中心虚拟父表基本档案 (`bd.costcenter.virtually`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_costcenter_virtually` | 应用: `DPMACCT` | 类型: `Class`

## 属性（15 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 4 | `creator` | 创建人 | `creator` | String | `text` |
| 5 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 6 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 7 | `id` | ID | `id` | Long | `long` |
| 8 | `modifier` | 修改人 | `modifier` | String | `text` |
| 9 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 10 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 12 | `name` | 名称 | `name` | String | `text` |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 14 | `virtually` | virtually | `` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `` |
| 15 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `virtually` -> `bd.costcenter.CostCenter` (0..n)
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
