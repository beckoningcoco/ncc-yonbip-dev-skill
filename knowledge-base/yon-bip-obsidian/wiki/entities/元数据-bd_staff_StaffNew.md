---
tags: [BIP, 元数据, 数据字典, bd.staff.StaffNew]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 员工(新) (`bd.staff.StaffNew`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_staff` | 应用: `DPMSTF` | 类型: `Class`

## 属性（77 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `photo` | photo | `photo` | String | `text` |
| 2 | `name` | 名称 | `name` | String | `text` |
| 3 | `shortname` | shortname | `shortname` | String | `text` |
| 4 | `code` | 编码 | `code` | String | `text` |
| 5 | `cert_type` | cert_type | `cert_type` | 59ff90b4-adcb-4cf7-942f-8fa060e22943 | `quote` |
| 6 | `cert_no` | cert_no | `cert_no` | String | `text` |
| 7 | `current_job` | current_job | `current_job` | 76db97b3-04ef-4b53-9cc1-35edab1586ba | `quote` |
| 8 | `sex` | sex | `sex` | Integer | `int` |
| 9 | `birthdate` | birthdate | `birthdate` | Date | `date` |
| 10 | `mobile` | mobile | `mobile` | String | `text` |
| 11 | `email` | email | `email` | String | `text` |
| 12 | `officetel` | officetel | `officetel` | String | `text` |
| 13 | `shop_assis_tag` | shop_assis_tag | `shop_assis_tag` | Boolean | `switch` |
| 14 | `biz_man_tag` | biz_man_tag | `biz_man_tag` | Boolean | `switch` |
| 15 | `enable` | enable | `enable` | Integer | `int` |
| 16 | `remark` | remark | `remark` | String | `text` |
| 17 | `user_define_character` | user_define_character | `user_define_character` | da2c9039-3d71-437c-b445-533a2a2163fa | `UserDefine` |
| 18 | `ordernumber` | ordernumber | `ordernumber` | Integer | `int` |
| 19 | `user_id` | user_id | `user_id` | String | `text` |
| 20 | `id` | ID | `id` | String | `text` |
| 21 | `userrlatid` | userrlatid | `userrlatid` | String | `text` |
| 22 | `objid` | objid | `objid` | String | `text` |
| 23 | `bu_id` | bu_id | `bu_id` | String | `text` |
| 24 | `businessid` | businessid | `businessid` | String | `text` |
| 25 | `sysid` | sysid | `sysid` | String | `text` |
| 26 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |
| 27 | `tenantid` | tenantid | `tenantid` | String | `text` |
| 28 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 29 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 30 | `createTime` | 创建时间 | `creationtime` | DateTime | `timestamp` |
| 31 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 32 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |
| 33 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 34 | `is_outer_staff` | 是否_outer_staff | `is_outer_staff` | Integer | `int` |
| 35 | `unit_id` | unit_id | `unit_id` | c3b96360-c57f-455b-9728-2ca499d9922a | `quote` |
| 36 | `dept_id` | dept_id | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |
| 37 | `dr` | 逻辑删除 | `dr` | Integer | `int` |
| 38 | `org_id` | org_id | `org_id` | String | `text` |
| 39 | `log` | log | `log` | String | `text` |
| 40 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 41 | `ts` | ts | `ts` | DateTime | `timestamp` |
| 42 | `country` | country | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 43 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |
| 44 | `education` | education | `education` | e0ee0128-06d8-4e1a-b440-63f6ca95fa2e | `quote` |
| 45 | `political` | political | `political` | 5d917a02-153f-4482-b3dc-b445e7639ca3 | `quote` |
| 46 | `name2` | name2 | `name2` | String | `text` |
| 47 | `name3` | name3 | `name3` | String | `text` |
| 48 | `name4` | name4 | `name4` | String | `text` |
| 49 | `name5` | name5 | `name5` | String | `text` |
| 50 | `name6` | name6 | `name6` | String | `text` |
| 51 | `psncl_id` | psncl_id | `psncl_id` | 03a11361-aad7-416c-95cd-ccd64f14d503 | `quote` |
| 52 | `jobgrade_id` | jobgrade_id | `jobgrade_id` | 7dfa7985-5073-4394-8f4f-cea8d1829b84 | `quote` |
| 53 | `addr_id` | addr_id | `addr_id` | 95256905-1d37-4ca6-a37f-ddbdab4d1c25 | `quote` |
| 54 | `majorcorpid` | majorcorpid | `majorcorpid` | a754b1bb-3377-4617-922e-a6108548cd73 | `quote` |
| 55 | `post_id` | post_id | `post_id` | a06cee30-92b1-4a03-b399-3886f55e4ba1 | `quote` |
| 56 | `jobrank_id` | jobrank_id | `jobrank_id` | e00dd36a-aace-43d2-9e87-156b36799fef | `quote` |
| 57 | `wagegroup` | wagegroup | `wagegroup` | 37a55216-a021-4ef3-ad48-ae1e5afe49c6 | `quote` |
| 58 | `bloodtype` | bloodtype | `bloodtype` | String | `text` |
| 59 | `qq` | qq | `qq` | String | `text` |
| 60 | `degree` | degree | `degree` | 06cea802-4237-4a00-9e90-ea9b48236892 | `quote` |
| 61 | `joinworkdate` | joinworkdate | `joinworkdate` | Date | `date` |
| 62 | `permanreside` | permanreside | `permanreside` | 985b8390-5d0f-404c-a925-053bf0189831 | `quote` |
| 63 | `weixin` | weixin | `weixin` | String | `text` |
| 64 | `nationality` | nationality | `nationality` | 4eb1b162-f46d-4a74-857a-10880d5a0f89 | `quote` |
| 65 | `origin` | origin | `origin` | 95577e23-979f-4f09-a629-61fea93e576d | `quote` |
| 66 | `linkedin` | linkedin | `linkedin` | String | `text` |
| 67 | `characterrpr` | characterrpr | `characterrpr` | 30bb2bbb-5903-4ab9-b806-eda3d3cd86fb | `quote` |
| 68 | `joinpolitydate` | joinpolitydate | `joinpolitydate` | Date | `date` |
| 69 | `modifiedtime` | modifiedtime | `modifiedtime` | Date | `date` |
| 70 | `selfemail` | selfemail | `selfemail` | String | `text` |
| 71 | `linkaddr` | linkaddr | `linkaddr` | String | `text` |
| 72 | `jsonextattr` | jsonextattr | `jsonextattr` | String | `text` |
| 73 | `marital` | marital | `marital` | 2c294cd9-fcec-4c4f-99e5-4b55534a08e0 | `quote` |
| 74 | `candidate_flag` | candidate_flag | `candidate_flag` | Boolean | `switch` |
| 75 | `mainJobList` | mainJobList | `` | 2ebd4f69-7558-48d0-a38d-fdedcabdf921 | `` |
| 76 | `outerStaffInfo` | outerStaffInfo | `` | 028ec646-cf5e-4c41-830d-053dfe730127 | `` |
| 77 | `quoteInfo` | quoteInfo | `` | 2e5aa220-4623-44bf-b49e-27d37a27b5c3 | `` |

## 关联（28 个）

- `country` -> `bd.country.CountryVO` ()
- `cert_type` -> `bd.IDtype.IDTypeVO` ()
- `education` -> `socialmdm.social.EduQualification` ()
- `mainJobList` -> `bd.staff.StaffNewJob` (0..n)
- `modifier` -> `base.user.BipUser` ()
- `origin` -> `bd.region.BaseRegionVO` ()
- `political` -> `bd.customerdoc_0004.0004` ()
- `majorcorpid` -> `hrcm.contractentity.ContractEntity` ()
- `psncl_id` -> `bd.staff.PsnlCatg` ()
- `outerStaffInfo` -> `bd.staff.outerinfo` (0..n)
- `characterrpr` -> `socialmdm.social.HouseholdType` ()
- `user_define_character` -> `bd.staff.StaffDefineCharacter` ()
- `jobgrade_id` -> `bd.duty.Rank` ()
- `quoteInfo` -> `bd.staff.QuoteStaffNew` (0..n)
- `unit_id` -> `org.func.AdminOrg` ()
- `tenant` -> `yht.tenant.YhtTenant` ()
- `creator` -> `base.user.BipUser` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `jobrank_id` -> `bd.duty.Grade` ()
- `degree` -> `socialmdm.social.Degree` ()
- `wagegroup` -> `hrxc.mddGroupDoc.waGroupDoc` ()
- `current_job` -> `bd.staff.StaffMainJob` ()
- `permanreside` -> `socialmdm.social.SpiderBase` ()
- `marital` -> `bd.customerdoc_0003.0003` ()
- `nationality` -> `socialmdm.social.Nation` ()
- `post_id` -> `bd.duty.Position` ()
- `dept_id` -> `bd.adminOrg.AdminOrgVO` ()
- `addr_id` -> `hrcm.location.Location` ()
