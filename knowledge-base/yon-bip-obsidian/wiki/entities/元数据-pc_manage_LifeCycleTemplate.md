---
tags: [BIP, 元数据, 数据字典, pc.manage.LifeCycleTemplate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 生命周期模板 (`pc.manage.LifeCycleTemplate`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `pc_lifecyc_tpl` | 应用: `GZTBDM` | 类型: `Class`

## 属性（24 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |
| 4 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 5 | `systemFlag` | systemFlag | `system_flag` | Integer | `int` |
| 6 | `stopstatus` | stopstatus | `stopstatus` | Integer | `int` |
| 7 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 8 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |
| 9 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |
| 10 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |
| 11 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 12 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 14 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 15 | `creator` | 创建人 | `creator` | String | `text` |
| 16 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 17 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 18 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 19 | `modifier` | 修改人 | `modifier` | String | `text` |
| 20 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 21 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 22 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 23 | `lifeCycleDetail` | lifeCycleDetail | `` | 98436616-03ae-4082-866f-2955fd4753c7 | `` |
| 24 | `microServiceCode` | microService编码 | `micro_service_code` | String | `text` |

## 关联（5 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `lifeCycleDetail` -> `pc.manage.LifeCycleDetail` (0..n)
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `tenant` -> `base.tenant.Tenant` ()
