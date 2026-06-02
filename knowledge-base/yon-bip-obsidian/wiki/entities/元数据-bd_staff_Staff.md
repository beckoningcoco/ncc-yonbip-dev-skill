---
tags: [BIP, 元数据, 数据字典, bd, bd.staff.Staff]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 员工 (`bd.staff.Staff`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_staff` | 应用: `DPMSTF` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 员工 |
| 物理表 | `bd_staff` |
| 应用 | `DPMSTF` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-05-23 00:36:48:000
- 安装来源: `/app/iuap_cloud_basedoc/mdd-org-staff-parent/mdd-org-staff-bootstrap/scripts/db/patch/mongodb/V7_R0_2507/20260515/0010_iuap_common/DML/0270_iuap_metadata/20260414/0002_bd_staff/202604201053_metadata_bd-staff_delta.zip`

## 术语标记

`isAssigned`, `isExtend`, `MasterData`, `report`, `state_tag`

## 依赖接口（8 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| BasedocITenant (`BasedocITenant`) | `basedoc.basedocItf.BasedocITenant` | 103 | 1 |
| BasedocIState (`BasedocIState`) | `basedoc.basedocItf.BasedocIState` | 101 | 1 |
| ISystemInfo (`ISystemInfo`) | `bd.itf.ISystemInfo` | 77 | 5 |
| IAuditInfo (`IAuditInfo`) | `bd.itf.IAuditInfo` | 75 | 4 |
| IAuto编码 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| LogicDelete (`LogicDelete`) | `basedoc.basedocItf.LogicDelete` | 31 | 0 |
| LogicDelete (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 全部属性（80 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `photo` | photo | `photo` | String | `text` | false | true |
| 2 | `name` | 名称 | `name` | String | `text` | true | false |
| 3 | `code` | 编码 | `code` | String | `text` | true | false |
| 4 | `shortname` | shortname | `shortname` | String | `text` | false | true |
| 5 | `cert_type` | ert_type | `cert_type` | 59ff90b4-adcb-4cf7-942f-8fa060e22943 | `quote` | false | true |
| 6 | `cert_no` | ert_no | `cert_no` | String | `text` | false | true |
| 7 | `birthdate` | birthdate | `birthdate` | Date | `date` | false | true |
| 8 | `sex` | sex | `sex` | Integer | `int` | false | true |
| 9 | `email` | 邮箱 | `email` | String | `text` | false | true |
| 10 | `mobile` | 手机号 | `mobile` | String | `text` | false | true |
| 11 | `current_job` | urrent_job | `current_job` | 76db97b3-04ef-4b53-9cc1-35edab1586ba | `quote` | false | true |
| 12 | `officetel` | officetel | `officetel` | String | `text` | false | true |
| 13 | `biz_man_tag` | biz_man_tag | `biz_man_tag` | Boolean | `switch` | false | true |
| 14 | `shop_assis_tag` | shop_assis_tag | `shop_assis_tag` | Boolean | `switch` | false | true |
| 15 | `remark` | 备注 | `remark` | String | `text` | false | true |
| 16 | `enable` | enable | `enable` | Integer | `int` | false | true |
| 17 | `user_id` | user_id | `user_id` | String | `text` | false | true |
| 18 | `is_outer_staff` | 是否_outer_staff | `is_outer_staff` | Integer | `int` | false | true |
| 19 | `ordernumber` | ordernumber | `ordernumber` | Integer | `int` | false | true |
| 20 | `user_define_character` | user_define_character | `user_define_character` | da2c9039-3d71-437c-b445-533a2a2163fa | `UserDefine` | false | true |
| 21 | `id` | 主键ID | `id` | String | `text` | false | true |
| 22 | `businessid` | businessid | `businessid` | String | `text` | false | true |
| 23 | `synchts` | synchts | `synchts` | DateTime | `timestamp` | false | true |
| 24 | `objid` | objid | `objid` | String | `text` | false | true |
| 25 | `userrlatid` | userrlatid | `userrlatid` | String | `text` | false | true |
| 26 | `sysid` | sysid | `sysid` | String | `text` | false | true |
| 27 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` | false | true |
| 28 | `createTime` | 创建时间 | `creationtime` | DateTime | `timestamp` | false | true |
| 29 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` | false | true |
| 30 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` | false | true |
| 31 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` | false | true |
| 32 | `tenantid` | tenantid | `tenantid` | String | `text` | false | true |
| 33 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 34 | `dr` | 逻辑删除 | `dr` | Integer | `int` |  | false |
| 35 | `ts` | ts | `ts` | DateTime | `timestamp` |  | false |
| 36 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 37 | `org_id` | org_id | `org_id` | String | `text` | false | true |
| 38 | `name2` | name2 | `name2` | String | `text` | false | true |
| 39 | `name3` | name3 | `name3` | String | `text` | false | true |
| 40 | `name4` | name4 | `name4` | String | `text` | false | true |
| 41 | `name5` | name5 | `name5` | String | `text` | false | true |
| 42 | `name6` | name6 | `name6` | String | `text` | false | true |
| 43 | `unit_id` | unit_id | `unit_id` | c3b96360-c57f-455b-9728-2ca499d9922a | `quote` | false | true |
| 44 | `dept_id` | ept_id(日期) | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` | false | true |
| 45 | `jobgrade_id` | jobgrade_id | `jobgrade_id` | 7dfa7985-5073-4394-8f4f-cea8d1829b84 | `quote` | false | true |
| 46 | `post_id` | post_id | `post_id` | a06cee30-92b1-4a03-b399-3886f55e4ba1 | `quote` | false | true |
| 47 | `psncl_id` | psncl_id | `psncl_id` | 03a11361-aad7-416c-95cd-ccd64f14d503 | `quote` | false | true |
| 48 | `jobrank_id` | jobrank_id | `jobrank_id` | e00dd36a-aace-43d2-9e87-156b36799fef | `quote` | false | true |
| 49 | `bloodtype` | bloodtype | `bloodtype` | String | `text` | false | true |
| 50 | `creationtime` | reationtime | `creationtime` | DateTime | `timestamp` | false | true |
| 51 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` | false | true |
| 52 | `bu_id` | bu_id | `bu_id` | String | `text` | false | true |
| 53 | `addr_id` | addr_id | `addr_id` | 95256905-1d37-4ca6-a37f-ddbdab4d1c25 | `quote` | false | true |
| 54 | `characterrpr` | haracterrpr | `characterrpr` | 30bb2bbb-5903-4ab9-b806-eda3d3cd86fb | `quote` | false | true |
| 55 | `degree` | egree(日期) | `degree` | 06cea802-4237-4a00-9e90-ea9b48236892 | `quote` | false | true |
| 56 | `education` | education | `education` | e0ee0128-06d8-4e1a-b440-63f6ca95fa2e | `quote` | false | true |
| 57 | `joinpolitydate` | joinpolitydate | `joinpolitydate` | Date | `date` | false | true |
| 58 | `joinworkdate` | joinworkdate | `joinworkdate` | Date | `date` | false | true |
| 59 | `jsonextattr` | jsonextattr | `jsonextattr` | String | `text` | false | true |
| 60 | `linkaddr` | linkaddr | `linkaddr` | String | `text` | false | true |
| 61 | `linkedin` | linkedin | `linkedin` | String | `text` | false | true |
| 62 | `majorcorpid` | majorcorpid | `majorcorpid` | a754b1bb-3377-4617-922e-a6108548cd73 | `quote` | false | true |
| 63 | `marital` | marital | `marital` | 2c294cd9-fcec-4c4f-99e5-4b55534a08e0 | `quote` | false | true |
| 64 | `nationality` | nationality | `nationality` | 4eb1b162-f46d-4a74-857a-10880d5a0f89 | `quote` | false | true |
| 65 | `origin` | origin | `origin` | 95577e23-979f-4f09-a629-61fea93e576d | `quote` | false | true |
| 66 | `permanreside` | permanreside | `permanreside` | 985b8390-5d0f-404c-a925-053bf0189831 | `quote` | false | true |
| 67 | `political` | political | `political` | 5d917a02-153f-4482-b3dc-b445e7639ca3 | `quote` | false | true |
| 68 | `country` | ountry | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` | false | true |
| 69 | `selfemail` | selfemail | `selfemail` | String | `text` | false | true |
| 70 | `wagegroup` | wagegroup | `wagegroup` | 37a55216-a021-4ef3-ad48-ae1e5afe49c6 | `quote` | false | true |
| 71 | `qq` | qq | `qq` | String | `text` | false | true |
| 72 | `weixin` | weixin | `weixin` | String | `text` | false | true |
| 73 | `log` | log | `log` | String | `text` | false | true |
| 74 | `bankAcctList` | bankAcctList | `` | e1db328d-c25b-49de-8aad-33400dc10e4b | `` |  |  |
| 75 | `candidate_flag` | andidate_flag | `candidate_flag` | Boolean | `switch` |  | true |
| 76 | `defines` | efines(日期) | `` | 55ffeac8-d461-4013-b0e4-ade76a4a279a | `` |  |  |
| 77 | `jobList` | jobList | `` | 444aac2f-8f76-4062-aa37-ad70c40e8a47 | `` |  |  |
| 78 | `mainJobList` | mainJobList | `` | 76db97b3-04ef-4b53-9cc1-35edab1586ba | `` |  |  |
| 79 | `ptJobList` | ptJobList | `` | 84250da8-0997-4588-8ad0-eb355ac7c384 | `` |  |  |
| 80 | `quoteInfo` | quoteInfo | `` | d655813e-de4d-46a5-bf6c-e6015d822279 | `` |  |  |

## 关联属性（31 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `country` | ountry | `bd.country.CountryVO` | `country` | 外键 |  |  | Service | true |
| 2 | `cert_type` | ert_type | `bd.IDtype.IDTypeVO` | `cert_type` | 外键 |  |  | None |  |
| 3 | `education` | education | `socialmdm.social.EduQualification` | `education` | 外键 |  |  | Service | true |
| 4 | `mainJobList` | mainJobList | `bd.staff.StaffMainJob` | `` | mainJobList → staff_id | 1..n | Y | None |  |
| 5 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` | 外键 |  |  | Service |  |
| 6 | `origin` | origin | `bd.region.BaseRegionVO` | `origin` | 外键 |  |  | Service | true |
| 7 | `political` | political | `bd.customerdoc_0004.0004` | `political` | 外键 |  |  | Service | true |
| 8 | `majorcorpid` | majorcorpid | `hrcm.contractentity.ContractEntity` | `majorcorpid` | 外键 |  |  | Service |  |
| 9 | `psncl_id` | psncl_id | `bd.staff.PsnlCatg` | `psncl_id` | 外键 |  |  | None |  |
| 10 | `defines` | efines(日期) | `bd.staff.StaffDefine` | `` | defines → id | 1 | Y | None |  |
| 11 | `bankAcctList` | bankAcctList | `bd.staff.StaffBankAcct` | `` | bankAcctList → staff_id | 0..n | Y | None |  |
| 12 | `characterrpr` | haracterrpr | `socialmdm.social.HouseholdType` | `characterrpr` | 外键 |  |  | Service | true |
| 13 | `user_define_character` | user_define_character | `bd.staff.StaffDefineCharacter` | `user_define_character` | 外键 |  |  | None |  |
| 14 | `jobgrade_id` | jobgrade_id | `bd.duty.Rank` | `jobgrade_id` | 外键 |  |  | None |  |
| 15 | `quoteInfo` | quoteInfo | `bd.staff.QuoteStaff` | `` | quoteInfo → staff_id | 0..n | Y | None |  |
| 16 | `unit_id` | unit_id | `org.func.AdminOrg` | `unit_id` | 外键 |  |  | Service |  |
| 17 | `tenant` | tenant | `yht.tenant.YhtTenant` | `tenantid` | 外键 |  |  | Service |  |
| 18 | `creator` | 创建人 | `base.user.BipUser` | `creator` | 外键 |  |  | Service |  |
| 19 | `jobrank_id` | jobrank_id | `bd.duty.Grade` | `jobrank_id` | 外键 |  |  | None |  |
| 20 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 21 | `degree` | egree(日期) | `socialmdm.social.Degree` | `degree` | 外键 |  |  | Service | true |
| 22 | `wagegroup` | wagegroup | `hrxc.mddGroupDoc.waGroupDoc` | `wagegroup` | 外键 |  |  | Service |  |
| 23 | `current_job` | urrent_job | `bd.staff.StaffMainJob` | `current_job` | 外键 |  |  | None |  |
| 24 | `ptJobList` | ptJobList | `bd.staff.StaffPtJob` | `` | ptJobList → staff_id | 0..n | Y | None |  |
| 25 | `permanreside` | permanreside | `socialmdm.social.SpiderBase` | `permanreside` | 外键 |  |  | Service | true |
| 26 | `marital` | marital | `bd.customerdoc_0003.0003` | `marital` | 外键 |  |  | Service | true |
| 27 | `nationality` | nationality | `socialmdm.social.Nation` | `nationality` | 外键 |  |  | Service | true |
| 28 | `post_id` | post_id | `bd.duty.Position` | `post_id` | 外键 |  |  | None |  |
| 29 | `dept_id` | ept_id(日期) | `bd.adminOrg.AdminOrgVO` | `dept_id` | 外键 |  |  | Service |  |
| 30 | `jobList` | jobList | `bd.staff.StaffJob` | `` | jobList → staff_id | 0..n | Y | None |  |
| 31 | `addr_id` | addr_id | `hrcm.location.Location` | `addr_id` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT photo, name, code, shortname, cert_type, cert_no, birthdate, sex
FROM bd_staff
```