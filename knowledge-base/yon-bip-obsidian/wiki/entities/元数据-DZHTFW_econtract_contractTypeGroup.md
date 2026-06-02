---
tags: [BIP, 元数据, 数据字典, DZHTFW.econtract.contractTypeGroup]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 合同类型分组 (`DZHTFW.econtract.contractTypeGroup`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `clm_contract_group` | 应用: `DZHTFW`

## 属性（18 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `enableState` | enableState | `enable_state` | String | `text` |
| 2 | `memo` | 备注 | `memo` | String | `text` |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |
| 4 | `outerSysId` | outerSysID | `outer_sys_id` | String | `text` |
| 5 | `parent` | parent | `parent_id` | 4c202967-83b6-4bc2-8c87-739ebb342000 | `quote` |
| 6 | `remark` | remark | `remark` | String | `multiLanguage` |
| 7 | `id` | ID | `id` | String | `text` |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 10 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 11 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 13 | `isEnd` | 是否End | `ifend` | Short | `short` |
| 14 | `level` | level | `level` | Integer | `int` |
| 15 | `path` | path | `path` | String | `text` |
| 16 | `sort` | sort | `sort_num` | Integer | `int` |
| 17 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 18 | `dr` | 逻辑删除 | `dr` | Short | `short` |

## 关联（4 个）

- `parent` -> `DZHTFW.econtract.contractTypeGroup` () [废]
- `creator` -> `base.user.BipUser` () 
- `modifier` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
