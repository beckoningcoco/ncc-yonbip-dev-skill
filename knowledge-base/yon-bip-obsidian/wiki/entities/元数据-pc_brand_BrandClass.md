---
tags: [BIP, 元数据, 数据字典, pc.brand.BrandClass]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 品牌分组 (`pc.brand.BrandClass`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `brandclass` | 应用: `GZTBDM` | 类型: `Class`

## 属性（24 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `code` | 编码 | `brandclass_code` | String | `text` |
| 3 | `name` | 名称 | `brandclass_name` | String | `multiLanguage` |
| 4 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 5 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |
| 6 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |
| 7 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |
| 8 | `sociCoreArchive` | sociCoreArchive | `sociCoreArchive_id` | Long | `long` |
| 9 | `brandclassAbbr` | brandclassAbbr | `brandclass_abbr` | String | `multiLanguage` |
| 10 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 11 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 12 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 13 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 15 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 16 | `creator` | 创建人 | `creator` | String | `text` |
| 17 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 18 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 19 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 20 | `modifier` | 修改人 | `modifier` | String | `text` |
| 21 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 22 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 23 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 24 | `brands` | brands | `` | 75116b40-efe4-455e-b62d-d56ac4811eb1 | `` |

## 关联（5 个）

- `brands` -> `pc.brand.Brand` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `tenant` -> `base.tenant.Tenant` ()
