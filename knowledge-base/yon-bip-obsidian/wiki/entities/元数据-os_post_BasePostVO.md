---
tags: [BIP, 元数据, 数据字典, os.post.BasePostVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 基准职位 (`os.post.BasePostVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `os_base_post` | 应用: `HRORG` | 类型: `Class`

## 属性（45 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |
| 4 | `orgId` | 组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 5 | `postSequenceId` | postSequenceID | `post_sequence_id` | 15d5b4d6-dff7-43f4-888f-e7819f438f39 | `quote` |
| 6 | `jobtype_id` | jobtype_id | `job_type_id` | b2f08443-e693-453c-a005-3c1dcc11af06 | `quote` |
| 7 | `job_id` | job_id | `duty_id` | 9703c8bf-0092-4566-96bd-933cc03c0acd | `quote` |
| 8 | `jobgrade_id` | jobgrade_id | `jobrank_id` | 7dfa7985-5073-4394-8f4f-cea8d1829b84 | `quote` |
| 9 | `minrank_id` | minrank_id | `minrank_id` | e00dd36a-aace-43d2-9e87-156b36799fef | `quote` |
| 10 | `maxrank_id` | maxrank_id | `maxrank_id` | e00dd36a-aace-43d2-9e87-156b36799fef | `quote` |
| 11 | `majorId` | majorID | `major_id` | 8935eea7-a8ae-456e-85a4-59f1abc98510 | `quote` |
| 12 | `jobDuty` | jobDuty | `jobduty` | String | `text` |
| 13 | `education` | education | `education` | 7d8e412e-5d19-49be-8ce6-3cb86a119303 | `quote` |
| 14 | `degree` | degree | `degree` | 14179483-26fd-4645-9b5d-d839ea01c3b7 | `quote` |
| 15 | `jobTitle` | jobTitle | `job_title` | 0d044175-47e5-4e07-87bd-4ebcc83a16a9 | `quote` |
| 16 | `workExperience` | workExperience | `work_experience` | String | `text` |
| 17 | `workYear` | workYear | `workyear` | String | `text` |
| 18 | `age` | age | `age` | String | `text` |
| 19 | `other` | other | `other` | String | `text` |
| 20 | `user_define_character` | user_define_character | `user_define_character` | 68f2d5c8-33ed-4a3b-b076-2d88811550b6 | `UserDefine` |
| 21 | `attachlist` | attachlist | `attachlist` | String | `text` |
| 22 | `orgGroupId` | orgGroupID | `org_group_id` | String | `text` |
| 23 | `enable` | enable | `enable` | Integer | `int` |
| 24 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 25 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 26 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 27 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 28 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 29 | `name2` | name2 | `name2` | String | `text` |
| 30 | `name3` | name3 | `name3` | String | `text` |
| 31 | `name4` | name4 | `name4` | String | `text` |
| 32 | `name5` | name5 | `name5` | String | `text` |
| 33 | `name6` | name6 | `name6` | String | `text` |
| 34 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |
| 35 | `objid` | objid | `objid` | String | `text` |
| 36 | `distributionSite` | distributionSite | `distribution_site` | 21622298-40b3-4de4-89a6-7b8a4db38679 | `quote` |
| 37 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 38 | `tenant` | tenant | `tenant_id` | String | `text` |
| 39 | `starttime` | starttime | `start_time` | DateTime | `timestamp` |
| 40 | `endtime` | endtime | `end_time` | DateTime | `timestamp` |
| 41 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 42 | `professional` | professional | `professional` | String | `text` |
| 43 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 44 | `effectiveDate` | effectiveDate | `effectivedate` | Date | `date` |
| 45 | `jobKind` | jobKind | `job_kind` | String | `text` |

## 关联（16 个）

- `creator` -> `base.user.BipUser` ()
- `education` -> `hred.education.Education` ()
- `majorId` -> `bd.customerdoc_0024.0024` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `maxrank_id` -> `bd.duty.Grade` ()
- `jobTitle` -> `bd.customerdoc_0011.0011` ()
- `modifier` -> `base.user.BipUser` ()
- `degree` -> `hred.degreefiles.Degreefiles` ()
- `jobtype_id` -> `bd.duty.DutyType` ()
- `orgId` -> `org.func.BaseOrg` ()
- `user_define_character` -> `os.post.BasePostVOTZDefines` ()
- `jobgrade_id` -> `bd.duty.Rank` ()
- `postSequenceId` -> `os.post.PostSequenceVO` ()
- `job_id` -> `bd.duty.Duty` ()
- `distributionSite` -> `hrcb.distributionSite.DistributionSite` ()
- `minrank_id` -> `bd.duty.Grade` ()
