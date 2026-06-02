---
tags: [BIP, 元数据, 数据字典, os.post.PostSequenceVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 职位序列 (`os.post.PostSequenceVO`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `os_post_sequence` | 应用: `HRORG` | 类型: `Class`

## 属性（30 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |
| 4 | `orgId` | 组织ID | `org_id` | c3b96360-c57f-455b-9728-2ca499d9922a | `quote` |
| 5 | `postFamilyId` | postFamilyID | `post_family_id` | c2de9548-d27f-4d8a-b6af-e15ee01a476f | `quote` |
| 6 | `parent` | parent | `parent_id` | 15d5b4d6-dff7-43f4-888f-e7819f438f39 | `quote` |
| 7 | `user_define_character` | user_define_character | `user_define_character` | 5ae1d556-b339-4ed0-894a-768c16fcb550 | `UserDefine` |
| 8 | `memo` | 备注 | `memo` | String | `text` |
| 9 | `orgGroupId` | orgGroupID | `org_group_id` | String | `text` |
| 10 | `enable` | enable | `enable` | Integer | `int` |
| 11 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 12 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 13 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 15 | `objid` | objid | `objid` | String | `text` |
| 16 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 17 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |
| 18 | `distributionSite` | distributionSite | `distribution_site` | 21622298-40b3-4de4-89a6-7b8a4db38679 | `quote` |
| 19 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 20 | `tenant` | tenant | `tenant_id` | String | `text` |
| 21 | `endtime` | endtime | `end_time` | DateTime | `timestamp` |
| 22 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 23 | `level` | 层级 | `level` | Integer | `int` |
| 24 | `starttime` | starttime | `start_time` | DateTime | `timestamp` |
| 25 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 26 | `sort` | 排序 | `sort_num` | Integer | `int` |
| 27 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |
| 28 | `path` | path | `path` | String | `text` |
| 29 | `jobType` | jobType | `job_type_id` | b2f08443-e693-453c-a005-3c1dcc11af06 | `quote` |
| 30 | `effectiveDate` | effectiveDate | `effectivedate` | Date | `date` |

## 关联（9 个）

- `parent` -> `os.post.PostSequenceVO` ()
- `user_define_character` -> `os.post.PostSequenceVOTZDefines` ()
- `creator` -> `base.user.BipUser` ()
- `postFamilyId` -> `os.post.PostFamilyVO` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `modifier` -> `base.user.BipUser` ()
- `distributionSite` -> `hrcb.distributionSite.DistributionSite` ()
- `jobType` -> `bd.duty.DutyType` ()
- `orgId` -> `org.func.AdminOrg` ()
