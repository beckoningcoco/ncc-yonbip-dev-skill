---
tags: [BIP, 元数据, 数据字典, pc.product.product_waima]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 外码 (`pc.product.product_waima`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `iuap_extend_i92076_product_waima` | 应用: `GZTBDM` | 类型: `Class`

## 属性（15 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `extend1` | extend1 | `string_0` | String | `text` |
| 2 | `extend2` | extend2 | `string_1` | String | `text` |
| 3 | `extend3` | extend3 | `string_2` | String | `text` |
| 4 | `extend4` | extend4 | `string_3` | String | `text` |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 6 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 7 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 8 | `foreignerKey` | foreignerKey | `foreign_key_bigint` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 9 | `id` | ID | `id` | String | `text` |
| 10 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 12 | `pk_temp` | pk_temp | `pk_temp` | String | `text` |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 14 | `version` | 版本号 | `version` | Integer | `int` |
| 15 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `foreignerKey` -> `pc.product.Product` (0..n)
- `creator` -> `base.user.BipUser` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
