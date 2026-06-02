---
tags: [BIP, 元数据, 数据字典, eeac.subjectcategory.SubjectCategoryInfluenceFactorDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 科目分类影响因素 (`eeac.subjectcategory.SubjectCategoryInfluenceFactorDO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBip），不适用于 NCC / NC Cloud 高级版。
> 物理表: `epub_subject_cat_influence` | 应用: `EVNT`

## 属性（11 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `blnDefault` | blnDefault | `bln_default` | Boolean | `switch` |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 3 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 4 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 5 | `id` | ID | `id` | String | `text` |
| 6 | `influenceFactorId` | influenceFactorID | `influence_factor_id` | e81adbf5-4b6e-44c8-ae1a-a1cbeea85d48 | `quote` |
| 7 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 8 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 10 | `subjectCategoryId` | subjectCategoryID | `subject_cat_id` | b0b86993-75b7-4a08-a66b-8ce4257990ab | `quote` |
| 11 | `ytenantId` | ytenantID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（5 个）

- `influenceFactorId` -> `eeac.influencefactorsetting.InfluenceFactorDO` () 
- `creator` -> `base.user.BipUser` () 
- `modifier` -> `base.user.BipUser` () 
- `subjectCategoryId` -> `eeac.subjectcategory.SubjectCategoryDO` (0..n) 
- `ytenantId` -> `yht.tenant.YhtTenant` () 
