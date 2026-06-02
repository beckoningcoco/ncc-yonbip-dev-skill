---
tags: [BIP, 元数据, 数据字典, aa.merchant.AgentFinancial]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 银行信息 (`aa.merchant.AgentFinancial`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `agentfinancialnew` | 应用: `DPMCUS` | 类型: `Class`

## 属性（26 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `merchantId` | merchantID | `imerchantId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 3 | `agentFinancialDefine` | agentFinancialDefine | `` | d02c1fb6-f3cb-4370-8b38-d65b5efac84f | `` |
| 4 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 5 | `country` | country | `iCountryId` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 6 | `province` | province | `iProvinceId` | 0d98e246-387e-4239-a8da-c372e94fff77 | `quote` |
| 7 | `orgFinBankAcct` | orgFinBankAcct | `org_fin_ban_acct` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 8 | `currency` | currency | `iCurrencyId` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 9 | `accountType` | accountType | `iAccountType` | Integer | `int` |
| 10 | `bank` | bank | `iBankId` | b7ee7189-ed97-48d5-91e4-808228664429 | `quote` |
| 11 | `openBank` | openBank | `iOpenBankId` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 12 | `bankAccount` | bankAccount | `cBankAccount` | String | `text` |
| 13 | `bankAccountName` | bankAccount名称 | `cBankAccountName` | String | `multiLanguage` |
| 14 | `jointLineNo` | jointLineNo | `cJointLineNo` | String | `text` |
| 15 | `isDefault` | 是否Default | `defaultBank` | Boolean | `switch` |
| 16 | `agentBankForElectronic` | agentBankForElectronic | `agentBankForElectronic` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 17 | `remarks` | remarks | `cRemarks` | String | `text` |
| 18 | `accountOpeningDate` | accountOpeningDate | `account_open_date` | Date | `date` |
| 19 | `swiftCode` | swift编码 | `swiftCode` | String | `text` |
| 20 | `accountOpeningAddress` | accountOpeningAddress | `account_opening_address` | String | `multiLanguage` |
| 21 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 22 | `agentFinancialCharacter` | agentFinancialCharacter | `agent_financial_character` | 5938c901-f3ea-4425-82e3-c34b8b86bf6f | `UserDefine` |
| 23 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 25 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 26 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |

## 关联（12 个）

- `agentBankForElectronic` -> `bd.bank.BankDotVO` ()
- `agentFinancialDefine` -> `aa.merchant.AgentFinancialDefine` (1)
- `country` -> `bd.country.CountryVO` ()
- `agentFinancialCharacter` -> `aa.merchant.AgentFinancialCharacter` ()
- `bank` -> `bd.bank.BankVO` ()
- `province` -> `aa.regioncorp.RegionCorp` ()
- `merchantId` -> `aa.merchant.Merchant` (0..n)
- `openBank` -> `bd.bank.BankDotVO` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `orgFinBankAcct` -> `bd.enterprise.OrgFinBankacctVO` ()
- `currency` -> `bd.currencytenant.CurrencyTenantVO` ()
- `tenant` -> `base.tenant.Tenant` ()
