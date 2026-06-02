---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, bd.payments.PayAgreementDefineCharacter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 付款协议自定义项 (`bd.payments.PayAgreementDefineCharacter`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_payagreement_character_define` | 应用: `DPMSETL`

## 属性（4 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 2 | `id` | ID | `id` | String | `text` |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 4 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（1 个）

- `ytenant` -> `yht.tenant.YhtTenant` () 
