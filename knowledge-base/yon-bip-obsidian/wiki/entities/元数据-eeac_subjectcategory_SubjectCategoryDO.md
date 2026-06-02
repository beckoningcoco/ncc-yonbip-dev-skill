---
tags: [BIP, 元数据, 数据字典, eeac.subjectcategory.SubjectCategoryDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 科目分类 (`eeac.subjectcategory.SubjectCategoryDO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `epub_subject_cat` | 应用: `EVNT`

## 属性（22 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `accbookId` | accbookID | `accbook_id` | 5df8e763-5595-4a87-9ff9-a7ac3bd1e81e | `quote` |
| 2 | `accbookTypeId` | accbookTypeID | `accbook_type_id` | 9e073034-63ae-4aba-a113-1b28396f35e6 | `quote` |
| 3 | `accentityId` | accentityID | `accentity_id` | dabb8185-bfd2-4ed3-a721-f5bc5d948246 | `quote` |
| 4 | `blnUserDef` | blnUserDef | `bln_user_def` | Boolean | `switch` |
| 5 | `code` | 编码 | `code` | String | `text` |
| 6 | `fiServiceId` | fiServiceID | `fi_service_id` | e69ffd9f-7d8c-4b02-b8ae-3ee7aa18b2b2 | `quote` |
| 7 | `id` | ID | `id` | String | `text` |
| 8 | `name` | 名称 | `name` | String | `multiLanguage` |
| 9 | `remarks` | remarks | `remarks` | String | `multiLanguage` |
| 10 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |
| 11 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |
| 12 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |
| 13 | `sysId` | sysID | `sys_id` | String | `text` |
| 14 | `usingStatus` | usingStatus | `using_status` | String | `text` |
| 15 | `bodies` | bodies | `` | 620aeaf6-cf81-481e-8a8e-44bc6ba8114f | `` |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 17 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 18 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 19 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 20 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 21 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 22 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（8 个）

- `fiServiceId` -> `eeac.fiservice.FiServiceDO` () [废]
- `creator` -> `base.user.BipUser` () 
- `accbookId` -> `epub.accountbook.AccountBook` () [废]
- `accentityId` -> `bd.virtualaccbody.VirtualAccbody_view` () [废]
- `bodies` -> `eeac.subjectcategory.SubjectCategoryInfluenceFactorDO` (0..n) 
- `modifier` -> `base.user.BipUser` () 
- `accbookTypeId` -> `epub.accountbooktype.AccountBookType` () [废]
- `ytenantId` -> `yht.tenant.YhtTenant` () 
