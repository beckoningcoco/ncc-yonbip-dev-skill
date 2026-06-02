---
tags: [BIP, 元数据, 数据字典, eeac.fievent.FiEventSubjectCatDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 会计事务科目分类 (`eeac.fievent.FiEventSubjectCatDO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `eac_fi_event_subject_cat` | 应用: `EVNT`

## 属性（18 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `blnSubjectRequired` | blnSubjectRequired | `bln_subject_required` | Boolean | `switch` |
| 2 | `condition` | condition | `condition` | String | `text` |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 4 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 5 | `direction` | direction | `direction` | String | `text` |
| 6 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 7 | `entityMetaUri` | entityMetaUri | `entity_meta_uri` | String | `text` |
| 8 | `fiEventId` | fiEventID | `fi_event_id` | ff8c5979-f9dc-4259-8b9f-6fe69da87bf6 | `quote` |
| 9 | `id` | ID | `id` | String | `text` |
| 10 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 13 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |
| 14 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |
| 15 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |
| 16 | `subjectCatId` | subjectCatID | `subject_cat_id` | b0b86993-75b7-4a08-a66b-8ce4257990ab | `quote` |
| 17 | `subjectField` | subjectField | `subject_field` | String | `text` |
| 18 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `creator` -> `base.user.BipUser` () 
- `subjectCatId` -> `eeac.subjectcategory.SubjectCategoryDO` () [废]
- `modifier` -> `base.user.BipUser` () 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
- `fiEventId` -> `eeac.fievent.FiEventDO` (0..n) [废]
