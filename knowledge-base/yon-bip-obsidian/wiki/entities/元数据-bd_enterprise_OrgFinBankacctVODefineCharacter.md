---
tags: [BIP, 元数据, 数据字典, bd.enterprise.OrgFinBankacctVODefineCharacter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 企业资金账户自定义项 (`bd.enterprise.OrgFinBankacctVODefineCharacter`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_fin_bankacct_character_define` | 应用: `DPMSETL`

## 属性（5 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `BANK` | BANK | `vcol1` | BAnk_yt | `singleOption` |
| 2 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 3 | `id` | ID | `id` | String | `text` |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 5 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（1 个）

- `ytenant` -> `yht.tenant.YhtTenant` () 
