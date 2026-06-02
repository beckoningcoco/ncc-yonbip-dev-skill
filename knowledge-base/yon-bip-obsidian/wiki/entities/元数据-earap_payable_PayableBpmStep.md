---
tags: [BIP, 元数据, 数据字典, earap.payable.PayableBpmStep]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 应付结算清单业务阶段信息 (`earap.payable.PayableBpmStep`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `ap_payable_b_bpmstep` | 应用: `STB`

## 属性（15 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `headerId` | headerID | `header_id` | 404676ad-786c-4ee3-9996-66b853d3bebe | `quote` |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 3 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 4 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 5 | `flag` | flag | `flag` | String | `text` |
| 6 | `id` | ID | `id` | String | `text` |
| 7 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 8 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 9 | `processinstId` | processinstID | `processinstid` | String | `text` |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 11 | `stepId` | stepID | `stepid` | 9bcecb5a-ff80-4e82-9b49-67af93c7db82 | `quote` |
| 12 | `stepLastModify` | stepLastModify | `stepcode_lastmodify` | DateTime | `dateTime` |
| 13 | `stepparam` | stepparam | `stepparam` | String | `text` |
| 14 | `taskId` | taskID | `taskid` | String | `text` |
| 15 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `creator` -> `base.user.BipUser` () 
- `modifier` -> `base.user.BipUser` () 
- `stepId` -> `bd.businessstep.BusinessStep` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `headerId` -> `earap.payable.PayableHeader` (0..n) [废]
