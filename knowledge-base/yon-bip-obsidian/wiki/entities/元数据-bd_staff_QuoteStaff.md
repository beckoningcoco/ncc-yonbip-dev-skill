---
tags: [BIP, 元数据, 数据字典, bd.staff.QuoteStaff]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 员工引入人员 (`bd.staff.QuoteStaff`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_staff_quote_info` | 应用: `DPMSTF` | 类型: `Class`

## 属性（21 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `staff_id` | staff_id | `staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 3 | `begindate` | begindate | `begindate` | DateTime | `timestamp` |
| 4 | `enddate` | enddate | `enddate` | DateTime | `timestamp` |
| 5 | `org_id` | org_id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 6 | `dept_id` | dept_id | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 7 | `post_id` | post_id | `post_id` | a06cee30-92b1-4a03-b399-3886f55e4ba1 | `quote` |
| 8 | `new_post_id` | new_post_id | `new_post_id` | 71cd20df-9892-415b-a6e1-08304ef52cfb | `quote` |
| 9 | `job_id` | job_id | `job_id` | 9703c8bf-0092-4566-96bd-933cc03c0acd | `quote` |
| 10 | `jobgrade_id` | jobgrade_id | `jobgrade_id` | 7dfa7985-5073-4394-8f4f-cea8d1829b84 | `quote` |
| 11 | `jobrank_id` | jobrank_id | `jobrank_id` | e00dd36a-aace-43d2-9e87-156b36799fef | `quote` |
| 12 | `memo` | 备注 | `memo` | String | `text` |
| 13 | `auto_end` | auto_end | `auto_end` | Boolean | `switch` |
| 14 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 15 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 16 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 19 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 20 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 21 | `user_define_character` | user_define_character | `user_define_character` | 478ff40e-f9a0-42f2-a141-9b9041398b88 | `UserDefine` |

## 关联（12 个）

- `user_define_character` -> `bd.staff.QuoteInfoDefine` ()
- `creator` -> `base.user.BipUser` ()
- `jobgrade_id` -> `bd.duty.Rank` ()
- `post_id` -> `bd.duty.Position` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `jobrank_id` -> `bd.duty.Grade` ()
- `job_id` -> `bd.duty.Duty` ()
- `org_id` -> `org.func.BaseOrg` ()
- `modifier` -> `base.user.BipUser` ()
- `new_post_id` -> `bd.duty.Posts` ()
- `staff_id` -> `bd.staff.Staff` (0..n)
- `dept_id` -> `bd.adminOrg.AdminOrgVO` ()
