---
tags: [BIP, 元数据, 数据字典, bd.enterprise.OrgFinCashacctVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 企业现金账户 (`bd.enterprise.OrgFinCashacctVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_fin_bankacct` | 应用: `DPMSETL`

## 属性（28 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `sysid` | sysid | `sysid` | String | `text` |
| 2 | `id` | ID | `id` | String | `text` |
| 3 | `code` | 编码 | `code` | String | `text` |
| 4 | `account` | account | `account` | String | `text` |
| 5 | `name` | 名称 | `name` | String | `multiLanguage` |
| 6 | `accountOpenDate` | accountOpen日期 | `accountOpenDate` | DateTime | `timestamp` |
| 7 | `orgid` | orgid | `orgid` | 60bf293e-5593-454b-be50-5a5fa016e4a6 | `quote` |
| 8 | `isdefault` | 是否default | `isdefault` | Boolean | `switch` |
| 9 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 10 | `log` | log | `log` | String | `text` |
| 11 | `description` | description | `description` | String | `multiLanguage` |
| 12 | `enable` | enable | `enable` | Integer | `int` |
| 13 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 14 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 15 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 16 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 17 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 18 | `objid` | objid | `objid` | String | `text` |
| 19 | `defineCharacter` | defineCharacter | `defineCharacter` | d6ce9c8f-6014-4816-adec-c4352e25fa28 | `UserDefine` |
| 20 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 21 | `tenant` | tenant | `tenantid` | String | `text` |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 23 | `acctName` | acct名称 | `acctname` | String | `multiLanguage` |
| 24 | `acctopentype` | acctopentype | `acctopentype` | Integer | `int` |
| 25 | `busiobjFilterKey` | busiobjFilterKey | `busiobj_filterkey` | Integer | `int` |
| 26 | `defines` | defines | `` | 59b1fe8c-d6eb-4578-b239-2a11eb9d1938 | `` |
| 27 | `mainid` | mainid | `bankacct` | String | `text` |
| 28 | `tenantId` | 租户ID | `tenantid` | String | `text` |

## 关联（7 个）

- `creator` -> `base.user.BipUser` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `modifier` -> `base.user.BipUser` () 
- `currency` -> `bd.currencytenant.CurrencyTenantVO` () 
- `defineCharacter` -> `bd.enterprise.OrgFinCashacctVOVODefineCharacter` () 
- `orgid` -> `org.func.FundsOrg` () 
- `defines` -> `bd.enterprise.OrgFinCashacctVODefine` (1) 
