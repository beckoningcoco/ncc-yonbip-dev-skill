---
tags: [BIP, 元数据, 数据字典, bd.costcenter.CostCenter_extend26]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# BIP用户多选引用子实体 (`bd.costcenter.CostCenter_extend26`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `iuap_quotelist_i92076_35254245285954382` | 应用: `DPMACCT` | 类型: `Class`

## 属性（12 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 2 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 3 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 4 | `extend26` | extend26 | `mainid` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 5 | `fkid` | fkid | `fkid_int` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |
| 6 | `id` | ID | `id` | String | `text` |
| 7 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 8 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 9 | `pk_temp` | pk_temp | `pk_temp` | String | `text` |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 11 | `version` | 版本号 | `version` | Integer | `int` |
| 12 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `creator` -> `base.user.BipUser` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
- `extend26` -> `base.user.BipUser` ()
- `fkid` -> `bd.costcenter.CostCenter` (0..n)
