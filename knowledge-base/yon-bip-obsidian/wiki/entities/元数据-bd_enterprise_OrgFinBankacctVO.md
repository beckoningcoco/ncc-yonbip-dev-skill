---
tags: [BIP, 元数据, 数据字典, bd.enterprise.OrgFinBankacctVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 企业资金账户 (`bd.enterprise.OrgFinBankacctVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_fin_bankacct` | 应用: `DPMSETL`

## 属性（47 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `account` | account | `account` | String | `text` |
| 4 | `name` | 名称 | `name` | String | `multiLanguage` |
| 5 | `accountLevel` | accountLevel | `account_level` | String | `singleOption` |
| 6 | `ctmDirectLinkFlag` | ctmDirectLinkFlag | `ctm_direct_link_flag` | Boolean | `switch` |
| 7 | `busiobjFilterKey` | busiobjFilterKey | `busiobj_filterkey` | Integer | `int` |
| 8 | `ctmAccountOpenFlag` | ctmAccountOpenFlag | `ctm_account_open_flag` | Boolean | `switch` |
| 9 | `acctopentype` | acctopentype | `acctopentype` | Integer | `int` |
| 10 | `acctType` | acctType | `accttype` | Integer | `int` |
| 11 | `accountNature` | accountNature | `accountNature` | Integer | `int` |
| 12 | `settleorgid` | settleorgid | `settleorgid` | c8022140-b5fa-4f19-a0b2-2be0192eac18 | `quote` |
| 13 | `accountPurpose` | accountPurpose | `account_purpose` | 6e200813-f353-480a-9b2f-4508a4a09266 | `quote` |
| 14 | `orgid` | orgid | `orgid` | 60bf293e-5593-454b-be50-5a5fa016e4a6 | `quote` |
| 15 | `accountOrgId` | accountOrgID | `account_org_id` | 4928db62-a46d-4829-a26a-1de4bb3bf98c | `quote` |
| 16 | `bank` | bank | `bank` | b7ee7189-ed97-48d5-91e4-808228664429 | `quote` |
| 17 | `lineNumber` | lineNumber | `linenumber` | String | `text` |
| 18 | `accountOpenDate` | accountOpen日期 | `accountOpenDate` | DateTime | `timestamp` |
| 19 | `taxRegistration` | taxRegistration | `tax_registration` | Boolean | `switch` |
| 20 | `acctstatus` | acctstatus | `acctstatus` | Integer | `int` |
| 21 | `accountClosureDate` | accountClosure日期 | `accountClosureDate` | DateTime | `timestamp` |
| 22 | `acctName` | acct名称 | `acctname` | String | `multiLanguage` |
| 23 | `bankProvince` | bankProvince | `bankprovince` | 95577e23-979f-4f09-a629-61fea93e576d | `quote` |
| 24 | `bankCity` | bankCity | `bankcity` | 95577e23-979f-4f09-a629-61fea93e576d | `quote` |
| 25 | `bankNumber` | bankNumber | `banknumber` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 26 | `parent` | parent | `parent` | fbc20885-a507-45bd-a986-74d3fc28d38a | `quote` |
| 27 | `orgGroupId` | orgGroupID | `org_group_id` | 44210b7f-0ffa-4cf9-be11-8fdfa006a2ae | `quote` |
| 28 | `description` | description | `description` | String | `multiLanguage` |
| 29 | `log` | log | `log` | String | `text` |
| 30 | `sysid` | sysid | `sysid` | String | `text` |
| 31 | `acctStatementDirection` | acctStatementDirection | `acctStatementDirection` | Integer | `int` |
| 32 | `defineCharacter` | defineCharacter | `defineCharacter` | aa8b61a0-91c5-4590-8295-7f819f572ad6 | `UserDefine` |
| 33 | `enable` | enable | `enable` | Integer | `int` |
| 34 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 35 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 36 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 37 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 38 | `objid` | objid | `objid` | String | `text` |
| 39 | `original` | original | `original` | Integer | `int` |
| 40 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 41 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 42 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 43 | `tenant` | tenant | `tenantid` | String | `text` |
| 44 | `agentBank` | agentBank | `agent_bank` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 45 | `currencyList` | currencyList | `` | ca2768f5-3665-469a-ac93-5800e4148596 | `` |
| 46 | `defines` | defines | `` | ea73a065-fb7f-453d-911a-c333a473ba99 | `` |
| 47 | `linkedAccountList` | linkedAccountList | `` | 148c1902-064a-4e89-8f2f-7100062322fb | `` |

## 关联（18 个）

- `bankNumber` -> `bd.bank.BankDotVO` () 
- `parent` -> `bd.enterprise.OrgFinBankacctVO` () 
- `creator` -> `base.user.BipUser` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `modifier` -> `base.user.BipUser` () 
- `linkedAccountList` -> `bd.enterprise.BankAcctLinkedAccVO` (0..n) 
- `currencyList` -> `bd.enterprise.BankAcctCurrencyVO` (0..n) 
- `orgid` -> `org.func.FundsOrg` () 
- `bankCity` -> `bd.region.BaseRegionVO` () 
- `defines` -> `bd.enterprise.OrgFinBankacctVODefine` (1) 
- `agentBank` -> `bd.bank.BankDotVO` () 
- `bank` -> `bd.bank.BankVO` () 
- `orgGroupId` -> `bd.puborggroup.PubOrgGroup` () 
- `accountPurpose` -> `bd.enterprise.AccountPurposeVO` () 
- `settleorgid` -> `org.func.SettlementOrg` () 
- `accountOrgId` -> `bd.adminOrg.FinanceOrgVO` () 
- `bankProvince` -> `bd.region.BaseRegionVO` () 
- `defineCharacter` -> `bd.enterprise.OrgFinBankacctVODefineCharacter` () 
