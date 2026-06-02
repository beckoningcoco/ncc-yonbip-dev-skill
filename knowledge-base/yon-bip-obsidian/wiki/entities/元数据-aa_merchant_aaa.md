---
tags: [BIP, 元数据, 数据字典, aa.merchant.aaa]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 扩展 (`aa.merchant.aaa`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `iuap_extend_i92076_aaa` | 应用: `DPMCUS` | 类型: `Class`

## 属性（12 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `extend1` | extend1 | `bigint_1` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 3 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 4 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 5 | `foreignerKey` | foreignerKey | `foreign_key_bigint` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 6 | `id` | ID | `id` | String | `text` |
| 7 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 8 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 9 | `pk_temp` | pk_temp | `pk_temp` | String | `text` |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 11 | `version` | 版本号 | `version` | Integer | `int` |
| 12 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `foreignerKey` -> `aa.merchant.Merchant` (0..n)
- `creator` -> `base.user.BipUser` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
- `extend1` -> `aa.merchant.Merchant` ()
