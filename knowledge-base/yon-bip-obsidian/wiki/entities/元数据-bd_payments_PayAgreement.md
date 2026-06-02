---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, bd.payments.PayAgreement]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
parent_entity: st.purinrecord.PurInRecord
---
# 付款协议 (`bd.payments.PayAgreement`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_payagreement` | 应用: `DPMSETL`

## 属性（29 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `paymentDates` | paymentDates | `` | d0985843-1843-42de-b0f6-da39ae7c6a4d | `` |
| 2 | `id` | ID | `id` | Long | `long` |
| 3 | `orgId` | orgID | `manageorg` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 4 | `code` | 编码 | `cCode` | String | `text` |
| 5 | `name` | 名称 | `cName` | String | `multiLanguage` |
| 6 | `objid` | objid | `objid` | String | `text` |
| 7 | `enableStartDate` | enableStart日期 | `enablestartdate` | Date | `date` |
| 8 | `enableEndDate` | enableEnd日期 | `enableenddate` | Date | `date` |
| 9 | `instalment` | instalment | `instalment` | Boolean | `switch` |
| 10 | `oadayConfirmType` | oadayConfirmType | `oadayConfirmType` | Integer | `int` |
| 11 | `expiredayConfirmType` | expiredayConfirmType | `expiredayConfirmType` | Integer | `int` |
| 12 | `comment` | comment | `cComment` | String | `text` |
| 13 | `prePayType` | prePayType | `prePayType` | Integer | `int` |
| 14 | `enable` | enable | `enable` | Integer | `int` |
| 15 | `order` | order | `iorder` | Integer | `int` |
| 16 | `orgGroupId` | orgGroupID | `org_group_id` | 44210b7f-0ffa-4cf9-be11-8fdfa006a2ae | `quote` |
| 17 | `log` | log | `log` | String | `text` |
| 18 | `sysid` | sysid | `sysid` | String | `text` |
| 19 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 21 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 22 | `defineCharacter` | defineCharacter | `defineCharacter` | de45e9f7-0155-40d7-a032-913ae3a3acde | `UserDefine` |
| 23 | `tenant` | tenant | `tenantid` | String | `text` |
| 24 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 25 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 26 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 27 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 28 | `defines` | defines | `` | 41977f13-8157-49cd-ba6b-f6f6e2738ce2 | `` |
| 29 | `execStatus` | execStatus | `exec_status` | String | `text` |

## 关联（8 个）

- `creator` -> `base.user.BipUser` () 
- `paymentDates` -> `bd.payments.PaymentDate` (0..n) 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `orgGroupId` -> `bd.puborggroup.PubOrgGroup` () 
- `modifier` -> `base.user.BipUser` () 
- `defineCharacter` -> `bd.payments.PayAgreementDefineCharacter` () 
- `orgId` -> `org.func.BaseOrg` () 
- `defines` -> `bd.payments.PayAgreementDefine` (1) 
