---
tags: [BIP, 元数据, 数据字典, tmsp.fundbusinobjarchives.FundBusinObjArchives]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 资金业务伙伴 (`tmsp.fundbusinobjarchives.FundBusinObjArchives`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `tmsp_fundbusinobj_archives` | 应用: `TMSP`

## 属性（44 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `accentity` | accentity | `accentity` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | `quote` |
| 2 | `accentitymanage` | accentitymanage | `accentity_manage` | 60bf293e-5593-454b-be50-5a5fa016e4a6 | `quote` |
| 3 | `bankid` | bankid | `bank_id` | b7ee7189-ed97-48d5-91e4-808228664429 | `quote` |
| 4 | `billtype` | billtype | `billtype` | Integer | `int` |
| 5 | `bizPartner` | bizPartner | `biz_partner` | c1627369-6457-4828-883d-756b79bd0f46 | `quote` |
| 6 | `characterDefine` | characterDefine | `character_define` | 6105be7c-3688-47ed-950c-36900e7fba7f | `UserDefine` |
| 7 | `contact` | contact | `contact` | String | `multiLanguage` |
| 8 | `contactnumber` | contactnumber | `contact_number` | String | `text` |
| 9 | `countryregion` | countryregion | `country_region` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 10 | `email` | email | `email` | String | `text` |
| 11 | `enabled` | enabled | `enabled` | Boolean | `switch` |
| 12 | `eventType` | eventType | `event_type` | Short | `short` |
| 13 | `ext` | ext | `ext` | String | `text` |
| 14 | `fundbusinobjtypeid` | fundbusinobjtypeid | `fundbusinobjtype_id` | a1d6f36f-1ea8-46c7-a409-d38a0f14c292 | `quote` |
| 15 | `fundbusinobjtypename` | fundbusinobjtypename | `fundbusinobjtype_name` | String | `multiLanguage` |
| 16 | `idNumber` | idNumber | `id_number` | String | `text` |
| 17 | `isEnd` | 是否End | `isEnd` | Short | `short` |
| 18 | `isprivated` | 是否privated | `isprivated` | Boolean | `switch` |
| 19 | `name` | 名称 | `name` | String | `text` |
| 20 | `openaccountbankid` | openaccountbankid | `openaccountbank_id` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | `quote` |
| 21 | `parent` | parent | `parent_id` | e969728a-efe8-49db-86b0-5f8e18c2f098 | `quote` |
| 22 | `remark` | remark | `remark` | String | `multiLanguage` |
| 23 | `settlemencenter` | settlemencenter | `settlement_center` | c8022140-b5fa-4f19-a0b2-2be0192eac18 | `quote` |
| 24 | `srcitem` | srcitem | `srcitem` | Short | `short` |
| 25 | `unifiedSocialCreditCode` | unifiedSocialCredit编码 | `unified_social_credit_code` | String | `text` |
| 26 | `uses` | uses | `uses` | String | `multiLanguage` |
| 27 | `vouchdate` | vouchdate | `vouchdate` | String | `date` |
| 28 | `code` | 编码 | `code` | String | `text` |
| 29 | `corporateTradingAccoInfoList` | corporateTradingAccoInfoList | `` | 830d7acb-de31-40cd-9b6e-e0537f387767 | `` |
| 30 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 31 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 32 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 33 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 34 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 35 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 36 | `fundBusinObjArchivesItem` | fundBusinObjArchivesItem | `` | c5eba128-e930-4602-897a-30d3a049390e | `` |
| 37 | `id` | ID | `id` | String | `text` |
| 38 | `level` | level | `level` | Integer | `int` |
| 39 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 40 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 41 | `path` | path | `path` | String | `text` |
| 42 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 43 | `sort` | sort | `sort_num` | Integer | `int` |
| 44 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（15 个）

- `parent` -> `tmsp.fundbusinobjarchives.FundBusinObjArchives` () [废]
- `countryregion` -> `bd.country.CountryVO` () [废]
- `creator` -> `base.user.BipUser` () 
- `accentitymanage` -> `org.func.FundsOrg` () [废]
- `bizPartner` -> `base.businesspartner.BusinessPartner` () [废]
- `modifier` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `accentity` -> `aa.baseorg.OrgMV` () [废]
- `openaccountbankid` -> `bd.bank.BankDotVO` () [废]
- `characterDefine` -> `tmsp.fundbusinobjarchives.FundBusinObjArchivescharacterDefineUserDefine` () [废]
- `corporateTradingAccoInfoList` -> `tmsp.fundbusinobjarchives.CorporateTradingAccoInfo` (0..n) 
- `bankid` -> `bd.bank.BankVO` () [废]
- `fundBusinObjArchivesItem` -> `tmsp.fundbusinobjarchives.FundBusinObjArchivesItem` (0..n) 
- `fundbusinobjtypeid` -> `tmsp.fundbusinobjtype.FundBusinObjType` () [废]
- `settlemencenter` -> `org.func.SettlementOrg` () [废]
