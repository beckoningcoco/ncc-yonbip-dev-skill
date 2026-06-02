---
tags: [BIP, 元数据, 数据字典, bd.paymenttype.PaymentTypeVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 款项类型 (`bd.paymenttype.PaymentTypeVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_paymenttype` | 应用: `DPMACCT`

## 属性（25 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `name` | 名称 | `name` | String | `multiLanguage` |
| 3 | `applicationscope` | applicationscope | `applications_cope` | String | `text` |
| 4 | `checkshouldpay` | checkshouldpay | `check_should_pay` | Boolean | `switch` |
| 5 | `prepaystatus` | prepaystatus | `prepay_status` | Boolean | `switch` |
| 6 | `currentaccount` | currentaccount | `currentaccount` | Boolean | `switch` |
| 7 | `system` | system | `system` | Boolean | `switch` |
| 8 | `sortnum` | sortnum | `sortnum` | Integer | `int` |
| 9 | `desc` | desc | `desc` | String | `text` |
| 10 | `character` | character | `character` | 13cdcef4-3c26-473e-82c0-84380a3687e9 | `UserDefine` |
| 11 | `createDate` | createDate | `create_date` | Date | `date` |
| 12 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 13 | `creator` | 创建人 | `creator` | String | `text` |
| 14 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 15 | `id` | ID | `id` | Long | `long` |
| 16 | `modifier` | 修改人 | `modifier` | String | `text` |
| 17 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 18 | `modifyDate` | modifyDate | `modify_date` | Date | `date` |
| 19 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 20 | `objid` | objid | `obj_id` | String | `text` |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 22 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 23 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 24 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 25 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `character` -> `bd.paymenttype.PaymentTypeCharacter` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `tenant` -> `base.tenant.Tenant` () 
