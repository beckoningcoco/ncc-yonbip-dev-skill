---
tags: [BIP, 元数据, 数据字典, BGDM.milestones.milestoneCategory]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 里程碑类别 (`BGDM.milestones.milestoneCategory`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bgdm_milestone_category` | 应用: `BGDM` | 类型: `Class`

## 属性（13 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `name` | 名称 | `name` | String | `text` |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 4 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 5 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 6 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 7 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 8 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 9 | `id` | ID | `id` | String | `text` |
| 10 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 13 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `creator` -> `base.user.BipUser` ()
- `modifier` -> `base.user.BipUser` ()
- `ytenantId` -> `yht.tenant.YhtTenant` ()
