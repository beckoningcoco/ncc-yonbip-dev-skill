---
tags: [BIP, 元数据, 数据字典, aa.regioncorp.RegionCorp]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 地址档案 (`aa.regioncorp.RegionCorp`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `regioncorp` | 应用: `DPMSI` | 类型: `Class`

## 属性（32 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `regionCorpSubData` | regionCorpSubData | `` | c4fee6a2-33a4-48ac-81ce-9e3b45ce59e5 | `` |
| 2 | `cityCode` | city编码 | `cityCode` | String | `text` |
| 3 | `code` | 编码 | `cCode` | String | `text` |
| 4 | `id` | ID | `id` | Long | `long` |
| 5 | `initDataEnd` | initDataEnd | `initDataEnd` | Boolean | `switch` |
| 6 | `isCashOnDelivery` | 是否CashOnDelivery | `isCashOnDelivery` | Boolean | `switch` |
| 7 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 8 | `keyWord` | keyWord | `keyWord` | String | `multiLanguage` |
| 9 | `level` | 层级 | `levelType` | Integer | `int` |
| 10 | `mergerName` | merger名称 | `mergerName` | String | `text` |
| 11 | `name` | 名称 | `name` | String | `multiLanguage` |
| 12 | `order` | order | `ordernum` | Integer | `int` |
| 13 | `parent` | parent | `iParentId` | 0d98e246-387e-4239-a8da-c372e94fff77 | `quote` |
| 14 | `parentCode` | parent编码 | `parentCode` | String | `text` |
| 15 | `path` | path | `cPath` | String | `text` |
| 16 | `showName` | show名称 | `showName` | String | `multiLanguage` |
| 17 | `sourcetype` | sourcetype | `sourcetype` | Boolean | `switch` |
| 18 | `zipCode` | zip编码 | `zipCode` | String | `text` |
| 19 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 20 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 21 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 22 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 23 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 24 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 25 | `creator` | 创建人 | `creator` | String | `text` |
| 26 | `modifier` | 修改人 | `modifier` | String | `text` |
| 27 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 28 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 29 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 30 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 31 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 32 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |

## 关联（6 个）

- `parent` -> `aa.regioncorp.RegionCorp` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `regionCorpSubData` -> `aa.regioncorp.RegionCorpSubData` (0..n)
- `tenant` -> `base.tenant.Tenant` ()
