---
tags: [BIP, 元数据, 数据字典, crmc.custdoc.CustDoc]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 基础档案 (`crmc.custdoc.CustDoc`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `crmc_cust_doc` | 应用: `CRMC` | 类型: `Class`

## 属性（25 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `name` | 名称 | `name` | String | `multiLanguage` |
| 3 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 4 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 5 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 6 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 7 | `displayCode` | display编码 | `displaycode` | String | `text` |
| 8 | `enumType` | enumType | `enumtype` | String | `text` |
| 9 | `isEnum` | 是否Enum | `isenum` | Boolean | `switch` |
| 10 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 11 | `displayField` | displayField | `displayfield` | String | `text` |
| 12 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 13 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 14 | `docType` | docType | `doc_type` | String | `singleOption` |
| 15 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 16 | `isPreset` | 是否Preset | `is_preset` | Boolean | `switch` |
| 17 | `id` | ID | `id` | Long | `long` |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 19 | `creator` | 创建人 | `creator` | String | `text` |
| 20 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 21 | `modifier` | 修改人 | `modifier` | String | `text` |
| 22 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 23 | `depict` | depict | `depict` | String | `text` |
| 24 | `displaySort` | displaySort | `display_sort` | Integer | `int` |
| 25 | `orgList` | orgList | `` | 5a29346c-f9b8-4ece-b51a-5fea73c311a5 | `` |

## 关联（5 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `orgList` -> `crmc.custdoc.CustDocOrg` (0..n)
- `tenant` -> `base.tenant.Tenant` ()
