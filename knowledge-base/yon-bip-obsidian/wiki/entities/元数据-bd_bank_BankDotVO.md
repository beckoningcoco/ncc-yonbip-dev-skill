---
tags: [BIP, 元数据, 数据字典, bd.bank.BankDotVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 银行网点 (`bd.bank.BankDotVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_bank_dot` | 应用: `DPMSETL`

## 属性（39 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |
| 4 | `objid` | objid | `objid` | String | `text` |
| 5 | `country` | country | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 6 | `address` | address | `address` | 878c4138-3b8e-4f44-aee6-d48a42b3bef5 | `quote` |
| 7 | `province` | province | `province` | String | `text` |
| 8 | `city` | city | `city` | String | `text` |
| 9 | `area` | area | `area` | String | `text` |
| 10 | `addressone` | addressone | `addressone` | String | `multiLanguage` |
| 11 | `addresstwo` | addresstwo | `addresstwo` | String | `multiLanguage` |
| 12 | `addressthree` | addressthree | `addressthree` | String | `multiLanguage` |
| 13 | `addressfour` | addressfour | `addressfour` | String | `multiLanguage` |
| 14 | `postcode` | postcode | `postcode` | String | `text` |
| 15 | `bank` | bank | `bank` | b7ee7189-ed97-48d5-91e4-808228664429 | `quote` |
| 16 | `linenumber` | linenumber | `linenumber` | String | `text` |
| 17 | `swiftCode` | swift编码 | `swift_code` | String | `text` |
| 18 | `IBAN` | IBAN | `iban` | String | `text` |
| 19 | `settleorgid` | settleorgid | `settleorgid` | c8022140-b5fa-4f19-a0b2-2be0192eac18 | `quote` |
| 20 | `enable` | enable | `enable` | Short | `short` |
| 21 | `sysid` | sysid | `sysid` | String | `text` |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 23 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |
| 24 | `bankdotid` | bankdotid | `bankdotid` | String | `text` |
| 25 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |
| 26 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |
| 27 | `sourceid` | sourceid | `sourceid` | String | `text` |
| 28 | `name_resid` | name_resid | `name_resid` | String | `text` |
| 29 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 30 | `defineCharacter` | defineCharacter | `defineCharacter` | 87115777-c0f4-46ac-b70d-caa196dd102c | `UserDefine` |
| 31 | `log` | log | `log` | String | `text` |
| 32 | `tenant` | tenant | `tenantid` | String | `text` |
| 33 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 34 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 35 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 36 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 37 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 38 | `defines` | defines | `` | dc5b4760-d257-4149-92b0-5f6feb4c9ef4 | `` |
| 39 | `execStatus` | execStatus | `exec_status` | String | `text` |

## 关联（9 个）

- `country` -> `bd.country.CountryVO` () 
- `bank` -> `bd.bank.BankVO` () 
- `creator` -> `base.user.BipUser` () 
- `address` -> `bd.address.AddressVO` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `modifier` -> `base.user.BipUser` () 
- `settleorgid` -> `org.func.SettlementOrg` () 
- `defineCharacter` -> `bd.bank.BankDotVODefineCharacter` () 
- `defines` -> `bd.bank.BankDotVODefine` (1) 
