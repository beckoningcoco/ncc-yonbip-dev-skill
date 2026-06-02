---
tags: [BIP, 元数据, 数据字典, bd.enterprise.BankAcctCurrencyVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 企业资金账户币种 (`bd.enterprise.BankAcctCurrencyVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_bankacct_currency` | 应用: `DPMSETL`

## 属性（18 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `iban` | iban | `iban` | String | `text` |
| 3 | `characterDefine` | characterDefine | `character_define` | 1b9fb0f9-44a4-492c-88eb-1961ef2429ee | `UserDefine` |
| 4 | `freezeControl` | freezeControl | `freeze_control` | String | `singleOption` |
| 5 | `frozenMoney` | frozenMoney | `frozen_amount` | Decimal | `number` |
| 6 | `frozenState` | frozenState | `frozen_state` | String | `singleOption` |
| 7 | `bankacct` | bankacct | `bankacct` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 8 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 9 | `isdefault` | 是否default | `isdefault` | Boolean | `switch` |
| 10 | `enable` | enable | `enable` | Integer | `int` |
| 11 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 12 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 13 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 14 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 15 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 16 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 17 | `tenant` | tenant | `tenantid` | String | `text` |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |

## 关联（6 个）

- `creator` -> `base.user.BipUser` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `modifier` -> `base.user.BipUser` () 
- `bankacct` -> `bd.enterprise.OrgFinBankacctVO` (0..n) 
- `currency` -> `bd.currencytenant.CurrencyTenantVO` () 
- `characterDefine` -> `bd.enterprise.BankAcctCurrencyVODefineCharacter` () 
