---
tags: [BIP, 元数据, 数据字典, tmsp.fundbusinobjarchives.FundBusinObjArchivesItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 伙伴银行信息 (`tmsp.fundbusinobjarchives.FundBusinObjArchivesItem`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `tmsp_fundbusinobj_archives_item` | 应用: `TMSP`

## 属性（33 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `accountname` | accountname | `account_name` | String | `text` |
| 2 | `address` | address | `address` | String | `text` |
| 3 | `arthivesItemCharacterDefine` | arthivesItemCharacterDefine | `arthives_item_character_define` | 21113719-d545-4c55-996b-3ee74be93bed | `UserDefine` |
| 4 | `authorizedAcccentity` | authorizedAcccentity | `authorized_acccentity` | String | `text` |
| 5 | `bankaccount` | bankaccount | `bank_account` | String | `text` |
| 6 | `bbankAccountId` | bbankAccountID | `bbank_account_id` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 7 | `bbankCode` | bbank编码 | `bbank_code` | String | `text` |
| 8 | `bbankid` | bbankid | `bbank_id` | b7ee7189-ed97-48d5-91e4-808228664429 | `quote` |
| 9 | `bcountryregion` | bcountryregion | `bcountry_region` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 10 | `benabled` | benabled | `benabled` | Boolean | `switch` |
| 11 | `bfundbusinobjtypename` | bfundbusinobjtypename | `bfundbusinobjtype_name` | String | `text` |
| 12 | `bisprivated` | bisprivated | `bisprivated` | Boolean | `switch` |
| 13 | `bopenaccountbankid` | bopenaccountbankid | `bopenaccountbank_id` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 14 | `bremark` | bremark | `bremark` | String | `text` |
| 15 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 16 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 17 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 18 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 19 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 20 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 21 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 22 | `ext` | ext | `ext` | String | `text` |
| 23 | `iban` | iban | `iban` | String | `text` |
| 24 | `id` | ID | `id` | String | `text` |
| 25 | `isdefaultaccount` | 是否defaultaccount | `isdefaultaccount` | Boolean | `switch` |
| 26 | `isused` | 是否used | `isused` | Boolean | `switch` |
| 27 | `linenumber` | linenumber | `linenumber` | String | `text` |
| 28 | `mainid` | mainid | `mainid` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 29 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 30 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 31 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 32 | `swift` | swift | `swift` | String | `text` |
| 33 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（10 个）

- `bbankid` -> `bd.bank.BankVO` () [废]
- `creator` -> `base.user.BipUser` () 
- `modifier` -> `base.user.BipUser` () 
- `bbankAccountId` -> `bd.enterprise.OrgFinBankacctVO` () [废]
- `bcountryregion` -> `bd.country.CountryVO` () [废]
- `bopenaccountbankid` -> `bd.bank.BankDotVO` () [废]
- `currency` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `arthivesItemCharacterDefine` -> `tmsp.fundbusinobjarchives.FundBusinObjArchivesItemarthivesItemCharacterDefineUserDefine` () [废]
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `mainid` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` (0..n) [废]
