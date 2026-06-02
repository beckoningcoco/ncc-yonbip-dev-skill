---
tags: [BIP, 元数据, 数据字典, PRJC.projectParticipant.ProjectParticipant]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目参与单位 (`PRJC.projectParticipant.ProjectParticipant`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `prjc_project_participant` | 应用: `PRJC` | 类型: `Class`

## 属性（26 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `country` | country | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 3 | `customerId` | customerID | `customer_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 4 | `name` | 名称 | `name` | String | `text` |
| 5 | `participantRole` | participantRole | `participant_role` | 2ef64001-4415-4e55-92d6-94367551f619 | `quoteList` |
| 6 | `partnerType` | partnerType | `partner_type` | partnerType | `singleOption` |
| 7 | `remark` | remark | `remark` | String | `text` |
| 8 | `searchCode` | search编码 | `search_code` | String | `text` |
| 9 | `shortName` | short名称 | `short_name` | String | `text` |
| 10 | `supplierId` | supplierID | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 11 | `timeZone` | timeZone | `time_zone` | d1fdfce1-1be1-4427-84ef-d8e0f8f96230 | `quote` |
| 12 | `unit` | unit | `unit` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 13 | `ProjectParticipantItemList` | ProjectParticipantItemList | `` | a536faf4-b99c-4a1c-8e82-a926e46fab8f | `` |
| 14 | `ProjectParticipantOrgList` | ProjectParticipantOrgList | `` | 665d0b8d-df50-430b-b8e9-01b1a282bd23 | `` |
| 15 | `ProjectParticipant_participantRoleList` | ProjectParticipant_participantRoleList | `` | 02f31edd-3b3b-42c3-92c3-e965c6e920cb | `` |
| 16 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 17 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 18 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 19 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 20 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 21 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 22 | `id` | ID | `id` | String | `text` |
| 23 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 24 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 25 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 26 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（12 个）

- `ProjectParticipantOrgList` -> `PRJC.projectParticipant.ProjectParticipantOrg` (0..n)
- `country` -> `bd.country.CountryVO` ()
- `unit` -> `org.func.BaseOrg` ()
- `creator` -> `base.user.BipUser` ()
- `supplierId` -> `aa.vendor.Vendor` ()
- `modifier` -> `base.user.BipUser` ()
- `ProjectParticipantItemList` -> `PRJC.projectParticipant.ProjectParticipantItem` (0..n)
- `customerId` -> `aa.merchant.Merchant` ()
- `timeZone` -> `bd.timezonelanguage.NewTimeZoneVO` ()
- `ProjectParticipant_participantRoleList` -> `PRJC.projectParticipant.ProjectParticipant_participantRole` (0..n)
- `ytenantId` -> `yht.tenant.YhtTenant` ()
- `participantRole` -> `PRJC.participantrole.ParticipantRole` ()
