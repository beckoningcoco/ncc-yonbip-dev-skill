---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, st.stockStatusRecord.stockStatusRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 库存状态主表 (`st.stockStatusRecord.stockStatusRecord`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_stockstatusrecord` | 应用: `ST`

## 属性（22 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `statusName` | status名称 | `status_name` | String | `multiLanguage` |
| 4 | `statusType` | statusType | `status_type` | String | `text` |
| 5 | `stockAvailable` | stockAvailable | `stock_available` | Boolean | `switch` |
| 6 | `description` | description | `description` | String | `multiLanguage` |
| 7 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 8 | `system` | system | `system` | Boolean | `switch` |
| 9 | `createDate` | create日期 | `create_date` | Date | `date` |
| 10 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 11 | `creator` | 创建人 | `creator` | String | `text` |
| 12 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 13 | `isdefault` | 是否default | `isdefault` | Boolean | `switch` |
| 14 | `modifier` | 修改人 | `modifier` | String | `text` |
| 15 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 16 | `modifyDate` | modify日期 | `modify_date` | Date | `date` |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 18 | `name` | 名称 | `status_name` | String | `text` |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 20 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 21 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 22 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `ytenant` -> `yht.tenant.YhtTenant` () 
- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
- `tenant` -> `base.tenant.Tenant` () 
