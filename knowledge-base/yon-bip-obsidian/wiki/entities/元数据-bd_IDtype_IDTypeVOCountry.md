---
tags: [BIP, 元数据, 数据字典, bd.IDtype.IDTypeVOCountry]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 国家地区 (`bd.IDtype.IDTypeVOCountry`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_idtype_country` | 应用: `DPMSTF` | 类型: `Class`

## 属性（13 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id_type_id` | id_type_id | `id_type_id` | 59ff90b4-adcb-4cf7-942f-8fa060e22943 | `quote` |
| 2 | `country` | country | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 3 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 4 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 5 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 6 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 7 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 8 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 9 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 10 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 11 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 12 | `id` | ID | `id` | String | `text` |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |

## 关联（5 个）

- `country` -> `bd.country.CountryVO` ()
- `creator` -> `base.user.BipUser` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
- `id_type_id` -> `bd.IDtype.IDTypeVO` (0..n)
