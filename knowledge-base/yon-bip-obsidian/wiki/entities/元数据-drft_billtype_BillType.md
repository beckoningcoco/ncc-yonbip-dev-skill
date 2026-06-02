---
tags: [BIP, 元数据, 数据字典, drft.billtype.BillType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 票据类型 (`drft.billtype.BillType`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `drft_billtype` | 应用: `DRFT`

## 属性（23 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `billsourcetype` | billsourcetype | `billsourcetype` | Short | `short` |
| 2 | `name` | 名称 | `name` | String | `multiLanguage` |
| 3 | `supticketcatecory` | supticketcatecory | `supticketcatecory` | Short | `short` |
| 4 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 5 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 7 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 8 | `billtypeno` | billtypeno | `billtypeno` | String | `text` |
| 9 | `billtypename` | billtypename | `billtypename` | String | `multiLanguage` |
| 10 | `billbtype` | billbtype | `billbtype` | BillbType | `` |
| 11 | `payperiodunit` | payperiodunit | `payperiodunit` | PayPeriodUnit | `` |
| 12 | `paymentdate` | paymentdate | `paymentdate` | String | `text` |
| 13 | `description` | description | `description` | String | `multiLanguage` |
| 14 | `iselecbill` | 是否elecbill | `iselecbill` | NoteFlag | `` |
| 15 | `isEnabled` | 是否Enabled | `isEnabled` | Boolean | `switch` |
| 16 | `id` | ID | `id` | Long | `long` |
| 17 | `creator` | 创建人 | `creator` | String | `text` |
| 18 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 19 | `createDate` | createDate | `create_date` | Date | `date` |
| 20 | `modifier` | 修改人 | `modifier` | String | `text` |
| 21 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 22 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 23 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `ytenant` -> `yht.tenant.YhtTenant` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `tenant` -> `base.tenant.Tenant` () 
