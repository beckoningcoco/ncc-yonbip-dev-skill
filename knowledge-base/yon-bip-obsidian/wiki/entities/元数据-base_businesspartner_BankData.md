---
tags: [BIP, 元数据, 数据字典, base.businesspartner.BankData]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 银行信息(废弃) (`base.businesspartner.BankData`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `base_bankdata` | 应用: `DPMBP` | 类型: `Class`

## 属性（20 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `partnerId` | partnerID | `partnerId` | c1627369-6457-4828-883d-756b79bd0f46 | `quote` |
| 3 | `country` | country | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 4 | `province` | province | `province` | 0d98e246-387e-4239-a8da-c372e94fff77 | `quote` |
| 5 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 6 | `accountType` | accountType | `accountType` | Integer | `int` |
| 7 | `bank` | bank | `bank` | b7ee7189-ed97-48d5-91e4-808228664429 | `quote` |
| 8 | `openBank` | openBank | `openBank` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 9 | `bankAccount` | bankAccount | `bankAccount` | String | `text` |
| 10 | `bankAccountName` | bankAccount名称 | `bankAccountName` | String | `text` |
| 11 | `jointLineNo` | jointLineNo | `jointLineNo` | String | `text` |
| 12 | `isDefault` | 是否Default | `isDefault` | Boolean | `switch` |
| 13 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 14 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 15 | `comment` | comment | `comment` | String | `multiLanguage` |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 17 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 18 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 19 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 20 | `erpCode` | erp编码 | `erpCode` | String | `text` |

## 关联（8 个）

- `country` -> `bd.country.CountryVO` ()
- `bank` -> `bd.bank.BankVO` ()
- `province` -> `aa.regioncorp.RegionCorp` ()
- `openBank` -> `bd.bank.BankDotVO` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `currency` -> `bd.currencytenant.CurrencyTenantVO` ()
- `partnerId` -> `base.businesspartner.BusinessPartner` (0..n)
- `tenant` -> `base.tenant.Tenant` ()
