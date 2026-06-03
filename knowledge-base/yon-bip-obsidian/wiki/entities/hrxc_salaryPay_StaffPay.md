---
tags: [BIP, metadata, hrxc, StaffPay]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 发薪人员 (hrxc.salaryPay.StaffPay)

> Platform: BIP V5 | Table: bd_staff_wa | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 发薪人员 |
| uri | hrxc.salaryPay.StaffPay |
| tableName | bd_staff_wa |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | bd_staffb_id |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 4 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (65)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | code | 人员编码 | code | text | String |  |  | isCode,nullable |
| 2 | name | 姓名 | name | text | String |  |  | nullable |
| 3 | ssStaffJobId | 任职id | ss_staff_job_id | quote | hred.staff.StaffJob |  |  | nullable |
| 4 | beginDate | 入职日期 | begindate | date | Date |  |  | nullable |
| 5 | orgId | 组织id | orgid | quote | org.func.BaseOrgTimeline |  |  | isMasterOrg,nullable |
| 6 | orgVid | 所属组织v主键 | orgvid | quote | org.func.BaseOrgTimeline |  |  | isMasterOrg,nullable |
| 7 | corpName | 组织名称 | corpname | text | String |  |  | nullable |
| 8 | deptVid | 所属部门v主键 | deptvid | quote | org.func.BaseOrgTimeline |  |  | dataAuth,data_auth,nullable |
| 9 | postId | 职位主键 | postid | text | String |  |  | nullable |
| 10 | bdStaffbEnable | 在职状态 | bd_staffb_enable | int | Integer |  |  | nullable |
| 11 | psnclId | 人员类别主键 | psnclid | text | String |  |  | nullable |
| 12 | ssStaffJobbTrnsEvent | 人员状态,4表示离职 | ss_staff_jobb_trnsevent | int | Integer |  |  | nullable |
| 13 | lastFlag | 是否为最新任职,1为最新 | lastflag | int | Integer |  |  | nullable |
| 14 | endFlag | 此条任职信息是否结束,1为结束,0为未结束 | endflag | int | Integer |  |  | nullable |
| 15 | showOrder | 人员顺序号  | showorder | text | String |  |  | nullable |
| 16 | version | 最新版本号 | version | long | Long |  |  | nullable |
| 17 | bankId | 代发银行主键 | bank_id | text | String |  |  | nullable |
| 18 | ssStaffJobbBeginDate | 任职开始日期 | ss_staff_jobb_begindate | date | Date |  |  | nullable |
| 19 | ssStaffJobbEndDate | 任职结束日期 | ss_staff_jobb_enddate | date | Date |  |  | nullable |
| 20 | ssStaffJobbJobrankId | 职等主键 | ss_staff_jobb_jobrankid | text | String |  |  | dataAuth,data_auth,nullable |
| 21 | ssStaffJobbobgradeid | 职级主键 | ss_staff_jobb_jobgradeid | text | String |  |  | nullable |
| 22 | partType | 其他任职(兼职)类型主键 | parttype | text | String |  |  | nullable |
| 23 | partTypeName | 其他任职(兼职)类型名称 | parttype_name | text | String |  |  | nullable |
| 24 | newPostId | 职位(人力新版本) | new_post_id | text | String |  |  | nullable |
| 25 | newPostName | 职位名称(人力新版本) | new_post_name | text | String |  |  | nullable |
| 26 | localOrgId | 人力管理组织 | local_org_id | quote | org.func.BaseOrg |  |  | nullable |
| 27 | localOrgVid | 时间轴人力管理组织 | local_org_vid | quote | org.func.BaseOrg |  |  | nullable |
| 28 | orgrelId | 组织关系主键 | orgrel_id | text | String |  |  | nullable |
| 29 | bdPsnlCatgId | 员工类别主键 | bd_psnl_catg_id | text | String |  |  | nullable |
| 30 | ssStaffOrgrelEnddate | 员工组织关系结束时间 | ss_staff_orgrel_enddate | date | Date |  |  | nullable |
| 31 | ssStaffOrgrelLastflag | 员工组织关系lastflag | ss_staff_orgrel_lastflag | int | Integer |  |  | nullable |
| 32 | ssStaffJobbTrnstype | 任职变动类型 | ss_staff_jobb_trnstype | text | String |  |  | nullable |
| 33 | wageGroup | 薪资组 | wagegroup | text | String |  |  | nullable |
| 34 | latestJob | 最新任职(主任职最新,兼职同lastflag),来自员工任职 | latest_job | int | Integer |  |  | nullable |
| 35 | staffJobCode | 任职编码 | staff_job_code | text | String |  |  | nullable |
| 36 | deptSort | 部门排序码 | dept_sort | int | Integer |  |  | nullable |
| 37 | orgSort | 组织排序码 | org_sort | int | Integer |  |  | nullable |
| 38 | orgCodeSort | 组织编码排序码 | org_code_sort | int | Integer |  |  | nullable |
| 39 | staffJobId | 任职主键(用于数据权限) | ss_staff_job_id | quote | hrxc.salaryPay.StaffJob |  |  | dataAuth,data_auth,nullable |
| 40 | psnclName | 人员类别 | psnclname | text | String |  |  | nullable |
| 41 | isMainJob | 是否主职 | ismainjob | int | Integer |  |  | nullable |
| 42 | ssStaffJobbJobTypeId | 职务类别 | ss_staff_jobb_jobtypeid | text | String |  |  | nullable |
| 43 | deptId | 部门主键 | deptid | quote | org.func.BaseOrgTimeline |  |  | dataAuth,data_auth,nullable |
| 44 | deptName | 部门 | deptname | text | String |  |  | nullable |
| 45 | endDate | 离职日期 | enddate | date | Date |  |  | nullable |
| 46 | devliveryBank | 代发银行 | devlivery_bank | text | String |  |  | nullable |
| 47 | bankNumber | 银行账号 | bank_number | text | String |  |  | nullable |
| 48 | jobTypeIdShowname | 职务类别 | jobTypeId_showname | text | String |  |  | nullable |
| 49 | jobName | 职务 | jobname | text | String |  |  | nullable |
| 50 | postName | 岗位 | postname | text | String |  |  | nullable |
| 51 | jobGradeIdShowname | 职级 | jobGradeId_showname | text | String |  |  | nullable |
| 52 | jobRankIdShowname | 职等 | jobRankId_showname | text | String |  |  | nullable |
| 53 | id | ID | bd_staffb_id | text | String |  |  | data_auth,nullable,REF.ID |
| 54 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 55 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 56 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 57 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 58 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 59 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 60 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 61 | yTenantId | 友户通租户主键 | ytenant_id | text | String |  |  | nullable |
| 62 | tenant | 租户 | tenantid | text | String |  | Y | nullable,uiHide |
| 63 | extension | 发薪人员特征组实体 | extension | UserDefine | hrxc.salaryPay.BdStaffPayDocCharacteristics |  |  | nullable |
| 64 | waChangeDocs | 薪资变动档案 | - | - | hrxc.salaryPay.WaChangeDoc |  |  |  |
| 65 | waStaffPayDocs | 薪资档案 | - | - | hrxc.salaryPay.WaStaffPayDoc |  |  |  |

---

## Reference Fields (11)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ssStaffJobId | 任职id | ss_staff_job_id | hred.staff.StaffJob |
| 2 | orgId | 组织id | orgid | org.func.BaseOrgTimeline |
| 3 | orgVid | 所属组织v主键 | orgvid | org.func.BaseOrgTimeline |
| 4 | deptVid | 所属部门v主键 | deptvid | org.func.BaseOrgTimeline |
| 5 | localOrgId | 人力管理组织 | local_org_id | org.func.BaseOrg |
| 6 | localOrgVid | 时间轴人力管理组织 | local_org_vid | org.func.BaseOrg |
| 7 | staffJobId | 任职主键(用于数据权限) | ss_staff_job_id | hrxc.salaryPay.StaffJob |
| 8 | deptId | 部门主键 | deptid | org.func.BaseOrgTimeline |
| 9 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 10 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 11 | modifier | 修改人 | MODIFIER | hred.staff.Staff |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | waChangeDocs | 薪资变动档案 | hrxc.salaryPay.WaChangeDoc |
| 2 | waStaffPayDocs | 薪资档案 | hrxc.salaryPay.WaStaffPayDoc |
