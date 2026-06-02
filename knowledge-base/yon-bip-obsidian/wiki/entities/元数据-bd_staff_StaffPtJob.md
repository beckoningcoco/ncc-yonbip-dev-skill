---
tags: [BIP, 元数据, 数据字典, bd.staff.StaffPtJob]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 员工兼职 (`bd.staff.StaffPtJob`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_staff_ptjob` | 应用: `DPMSTF` | 类型: `Class`

## 属性（35 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `begindate` | begindate | `begindate` | DateTime | `timestamp` |
| 2 | `enddate` | enddate | `enddate` | DateTime | `timestamp` |
| 3 | `org_id` | org_id | `org_id` | c3b96360-c57f-455b-9728-2ca499d9922a | `quote` |
| 4 | `dept_id` | dept_id | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 5 | `psncl_id` | psncl_id | `psncl_id` | 03a11361-aad7-416c-95cd-ccd64f14d503 | `quote` |
| 6 | `new_post_id` | new_post_id | `new_post_id` | 71cd20df-9892-415b-a6e1-08304ef52cfb | `quote` |
| 7 | `post_id` | post_id | `post_id` | a06cee30-92b1-4a03-b399-3886f55e4ba1 | `quote` |
| 8 | `job_id` | job_id | `job_id` | 9703c8bf-0092-4566-96bd-933cc03c0acd | `quote` |
| 9 | `jobgrade_id` | jobgrade_id | `jobgrade_id` | 7dfa7985-5073-4394-8f4f-cea8d1829b84 | `quote` |
| 10 | `jobrank_id` | jobrank_id | `jobrank_id` | e00dd36a-aace-43d2-9e87-156b36799fef | `quote` |
| 11 | `director` | director | `director` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 12 | `responsibilities` | responsibilities | `responsibilities` | String | `text` |
| 13 | `memo` | 备注 | `memo` | String | `text` |
| 14 | `user_define_character` | user_define_character | `user_define_character` | e46d5dec-4222-49f1-8ca0-aacc72e20ffc | `UserDefine` |
| 15 | `showorder` | showorder | `showorder` | Integer | `int` |
| 16 | `enable` | enable | `enable` | Integer | `int` |
| 17 | `account_org_id` | account_org_id | `account_org_id` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` |
| 18 | `staff_id` | staff_id | `staff_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 19 | `id` | ID | `id` | String | `text` |
| 20 | `sysid` | sysid | `sysid` | String | `text` |
| 21 | `objid` | objid | `objid` | String | `text` |
| 22 | `businessid` | businessid | `businessid` | String | `text` |
| 23 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |
| 24 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 25 | `jsonextattr` | jsonextattr | `jsonextattr` | String | `text` |
| 26 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 27 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 28 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |
| 29 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 30 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 31 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 32 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 33 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 34 | `ts` | ts | `ts` | DateTime | `timestamp` |
| 35 | `ptjobdefines` | ptjobdefines | `` | e6013ff0-e7e1-4a06-ad96-ea3880779995 | `` |

## 关联（17 个）

- `creator` -> `base.user.BipUser` ()
- `jobrank_id` -> `bd.duty.Grade` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `director` -> `bd.staff.Staff` ()
- `modifier` -> `base.user.BipUser` ()
- `ptjobdefines` -> `bd.staff.StaffPtJobDefine` (1)
- `account_org_id` -> `org.func.FinanceOrg` ()
- `psncl_id` -> `bd.staff.PsnlCatg` ()
- `user_define_character` -> `bd.staff.StaffPtJobDefineCharacter` ()
- `jobgrade_id` -> `bd.duty.Rank` ()
- `post_id` -> `bd.duty.Position` ()
- `job_id` -> `bd.duty.Duty` ()
- `org_id` -> `org.func.AdminOrg` ()
- `new_post_id` -> `bd.duty.Posts` ()
- `staff_id` -> `bd.staff.Staff` (0..n)
- `dept_id` -> `bd.adminOrg.AdminOrgVO` ()
- `tenant` -> `yht.tenant.YhtTenant` ()
