---
tags: [BIP, 元数据, 数据字典, tmsp.fundbusinobjarchives.CorporateTradingAccoInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 企业交易账户信息 (`tmsp.fundbusinobjarchives.CorporateTradingAccoInfo`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `tmsp_corporate_trading_acco_info` | 应用: `TMSP`

## 属性（21 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `accentity` | accentity | `accentity` | 60bf293e-5593-454b-be50-5a5fa016e4a6 | `quote` |
| 2 | `accentityCode` | accentity编码 | `accentity_code` | String | `text` |
| 3 | `accoInfocharacterDefine` | accoInfocharacterDefine | `acco_infocharacter_define` | d0cc1326-845b-4f84-8083-ec962ed47775 | `UserDefine` |
| 4 | `accountOpeningInstitutionName` | accountOpeningInstitution名称 | `account_opening_institution_name` | String | `text` |
| 5 | `bfundbusinobjtypename` | bfundbusinobjtypename | `bfundbusinobjtypename` | String | `text` |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 7 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 8 | `currency` | currency | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 9 | `enabled` | enabled | `enabled` | Boolean | `switch` |
| 10 | `id` | ID | `id` | String | `text` |
| 11 | `isused` | 是否used | `isused` | Boolean | `switch` |
| 12 | `mainid` | mainid | `mainid` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 13 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 16 | `remark` | remark | `remark` | String | `text` |
| 17 | `tradingAccount` | tradingAccount | `trading_account` | String | `text` |
| 18 | `tradingAccountId` | tradingAccountID | `trading_account_id` | Long | `long` |
| 19 | `tradingAccountName` | tradingAccount名称 | `trading_account_name` | String | `text` |
| 20 | `tradingAccountOpeningInstitutions` | tradingAccountOpeningInstitutions | `trading_account_opening_institutions` | String | `text` |
| 21 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（7 个）

- `creator` -> `base.user.BipUser` () 
- `modifier` -> `base.user.BipUser` () 
- `currency` -> `bd.currencytenant.CurrencyTenantVO` () [废]
- `accoInfocharacterDefine` -> `tmsp.fundbusinobjarchives.CorporateTradingAccoInfoaccoInfocharacterDefineUserDefine` () [废]
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `mainid` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` (0..n) [废]
- `accentity` -> `org.func.FundsOrg` () [废]
