---
tags: [BIP, 元数据, 数据字典, bd.enterprise.BankAcctLinkedAccVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 数币关联银行账户 (`bd.enterprise.BankAcctLinkedAccVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_bankacct_ctm_linked_bankacct` | 应用: `DPMSETL`

## 属性（11 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 2 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 3 | `currencyId` | currencyID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 4 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 5 | `id` | ID | `id` | String | `text` |
| 6 | `linkedBankAccountId` | linkedBankAccountID | `linked_bank_account_id` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 7 | `mainid` | mainid | `mainid` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 8 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 9 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 10 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 11 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（6 个）

- `creator` -> `base.user.BipUser` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `modifier` -> `base.user.BipUser` () 
- `linkedBankAccountId` -> `bd.enterprise.OrgFinBankacctVO` () 
- `currencyId` -> `bd.currencytenant.CurrencyTenantVO` () 
- `mainid` -> `bd.enterprise.OrgFinBankacctVO` (0..n) 
