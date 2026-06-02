---
tags: [BIP, 元数据, 数据字典, aa.vendor.VendorBank]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 供应商银行 (`aa.vendor.VendorBank`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_vendorbank` | 应用: `DPMSPL` | 类型: `Class`

## 属性（29 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `vendor` | vendor | `iVendorId` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 3 | `elecBillBankNode` | elecBillBankNode | `elecBillBankNode` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 4 | `enterMode` | enterMode | `enter_mode` | String | `text` |
| 5 | `entBank` | entBank | `entBank` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 6 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 7 | `receiveAddress` | receiveAddress | `receiveAddress` | String | `multiLanguage` |
| 8 | `bankAccountFile` | bankAccountFile | `bank_account_file` | String | `text` |
| 9 | `country` | country | `iCountryId` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 10 | `province` | province | `cProvince` | String | `text` |
| 11 | `currency` | currency | `iCurrencyId` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 12 | `bank` | bank | `iBankId` | b7ee7189-ed97-48d5-91e4-808228664429 | `quote` |
| 13 | `openaccountbank` | openaccountbank | `iOpenAccountBankId` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 14 | `account` | account | `cAccount` | String | `text` |
| 15 | `accountname` | accountname | `cAccountName` | String | `multiLanguage` |
| 16 | `correspondentcode` | correspondentcode | `cCorrespondentCode` | String | `text` |
| 17 | `accountType` | accountType | `iAccountType` | Integer | `int` |
| 18 | `defaultbank` | defaultbank | `bDefaultBank` | Boolean | `switch` |
| 19 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 20 | `memo` | 备注 | `cmemo` | String | `multiLanguage` |
| 21 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 23 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 24 | `region` | region | `cRegion` | String | `text` |
| 25 | `regionCode` | region编码 | `cRegionCode` | String | `text` |
| 26 | `bankFilePath` | bankFilePath | `bank_file_path` | String | `text` |
| 27 | `vendorBankCharacterDefine` | vendorBankCharacterDefine | `vendorBankCharacterDefine` | 293239f5-502d-4152-a654-27266cf3f2f8 | `UserDefine` |
| 28 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 29 | `defines` | defines | `` | 02db3290-29bd-44e2-93b2-dfa85d228193 | `` |

## 关联（11 个）

- `country` -> `bd.country.CountryVO` ()
- `bank` -> `bd.bank.BankVO` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `vendor` -> `aa.vendor.Vendor` (0..n)
- `openaccountbank` -> `bd.bank.BankDotVO` ()
- `vendorBankCharacterDefine` -> `aa.vendor.VendorBankCharacterDefine` ()
- `currency` -> `bd.currencytenant.CurrencyTenantVO` ()
- `entBank` -> `bd.enterprise.OrgFinBankacctVO` ()
- `tenant` -> `base.tenant.Tenant` ()
- `elecBillBankNode` -> `bd.bank.BankDotVO` ()
- `defines` -> `aa.vendor.VendorBankDefine` (1)
