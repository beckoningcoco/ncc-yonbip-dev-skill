---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, aa.reason.Reason]
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
# 原因档案 (`aa.reason.Reason`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_reason` | 应用: `DPMSI`

## 属性（20 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `reason` | reason | `reason` | String | `multiLanguage` |
| 3 | `reasonType` | reasonType | `reasonType` | Long | `long` |
| 4 | `iOrder` | iOrder | `ordernum` | Integer | `int` |
| 5 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 6 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 7 | `sourcetype` | sourcetype | `sourcetype` | Integer | `int` |
| 8 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 9 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 10 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 12 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 13 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 14 | `modifier` | 修改人 | `modifier` | String | `text` |
| 15 | `modifyDate` | modify日期 | `modify_date` | Date | `date` |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 17 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 18 | `creator` | 创建人 | `creator` | String | `text` |
| 19 | `createDate` | create日期 | `create_date` | Date | `date` |
| 20 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |

## 关联（4 个）

- `ytenant` -> `yht.tenant.YhtTenant` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `tenant` -> `base.tenant.Tenant` () 
