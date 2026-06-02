---
tags: [BIP, 元数据, 数据字典, epub.sourceapplication.SourceApplication]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 来源应用列表 (`epub.sourceapplication.SourceApplication`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `epub_source_application` | 应用: `FP`

## 属性（28 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |
| 4 | `createDate` | create日期 | `create_date` | Date | `date` |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 6 | `creator` | 创建人 | `creator` | String | `text` |
| 7 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 8 | `domainCode` | domain编码 | `category` | String | `text` |
| 9 | `domainName` | domain名称 | `category_name` | String | `multiLanguage` |
| 10 | `frameWork` | frameWork | `frame_work` | Integer | `int` |
| 11 | `mappingapplication` | mappingapplication | `src_app_id` | String | `text` |
| 12 | `modifier` | 修改人 | `modifier` | String | `text` |
| 13 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 14 | `modifyDate` | modify日期 | `modify_date` | Date | `date` |
| 15 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 17 | `sortnum` | sortnum | `sort_num` | Integer | `int` |
| 18 | `stoptime` | stoptime | `stop_time` | DateTime | `timestamp` |
| 19 | `tenant` | tenant | `tenant_id` | Long | `long` |
| 20 | `mappingapplicationdomain` | mappingapplicationdomain | `mapping_application_domain` | String | `multiLanguage` |
| 21 | `categoryName` | category名称 | `category_name` | String | `text` |
| 22 | `category` | category | `category` | String | `text` |
| 23 | `system` | system | `system` | Boolean | `switch` |
| 24 | `stopstatus` | stopstatus | `stopstatus` | Boolean | `switch` |
| 25 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |
| 26 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |
| 27 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |
| 28 | `ytenant` | ytenant | `ytenant_id` | String | `text` |

## 关联（2 个）

- `creatorId` -> `base.user.User` () 
- `modifierId` -> `base.user.User` () 
