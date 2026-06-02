---
tags: [BIP, 元数据, 数据字典, bd.region.BaseRegionStatusVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 行政区划状态 (`bd.region.BaseRegionStatusVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_baseregion_status` | 应用: `DPMPI` | 类型: `Class`

## 属性（11 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `objid` | objid | `objid` | String | `text` |
| 3 | `baseregionId` | baseregionID | `baseregion_id` | 95577e23-979f-4f09-a629-61fea93e576d | `quote` |
| 4 | `enable` | enable | `enable` | Integer | `int` |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 6 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 7 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 8 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 10 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |

## 关联（4 个）

- `baseregionId` -> `bd.region.BaseRegionVO` (0..n)
- `creator` -> `base.user.BipUser` ()
- `modifier` -> `base.user.BipUser` ()
- `ytenantId` -> `yht.tenant.YhtTenant` ()
