---
tags: [BIP, 元数据, 数据字典, bd, bd.businessstep.BusinessPhase]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 业务阶段 (`bd.businessstep.BusinessPhase`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_business_phase` | 应用: `BMMMM`

## 全部属性（18 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `applicationCode` | application编码 | `applicationCode` | String | `text` |  | true |
| 2 | `billTypeId` | billTypeID | `bill_type_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` | true | false |
| 3 | `code` | 编码 | `code` | String | `text` | true | false |
| 4 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | true |
| 5 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 6 | `dr` | dr | `dr` | Integer | `int` |  | true |
| 7 | `enable` | enable | `enable` | Integer | `int` |  | true |
| 8 | `id` | 主键ID | `id` | String | `text` |  | true |
| 9 | `iorder` | iorder | `iorder` | String | `text` |  | true |
| 10 | `microServiceCode` | microService编码 | `micro_service_code` | String | `text` |  | true |
| 11 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | true |
| 13 | `name` | 名称 | `name` | String | `multiLanguage` | true | false |
| 14 | `phaseLevel` | phaseLevel | `phase_level` | Integer | `int` |  | true |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 16 | `sourceId` | sourceID | `sourceid` | String | `text` |  | true |
| 17 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 18 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true |

## 关联属性（5 个）

- `creator` -> `base.user.BipUser` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
- `ytenantId` -> `yht.tenant.YhtTenant` ()
- `billTypeId` -> `bd.bill.BillTypeVO` ()

```sql
SELECT applicationCode, bill_type_id, code, create_time, creator, dr FROM bd_business_phase
```