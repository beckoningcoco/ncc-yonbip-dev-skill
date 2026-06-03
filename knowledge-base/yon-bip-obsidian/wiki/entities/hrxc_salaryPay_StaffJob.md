---
tags: [BIP, metadata, hrxc, StaffJob]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 任职 (hrxc.salaryPay.StaffJob)

> Platform: BIP V5 | Table: bd_staff_wa | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 任职 |
| uri | hrxc.salaryPay.StaffJob |
| tableName | bd_staff_wa |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ss_staff_job_id |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 4 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (61)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | stafffId | 人员主键 | bd_staffb_id | text | String |  |  | nullable |
| 2 | code | 人员编码 | code | text | String |  |  | isCode,nullable |
| 3 | name | 人员名称 | name | text | String |  |  | nullable |
| 4 | bdStaffbEnable | 启用状态 | bd_staffb_enable | int | Integer |  |  | nullable |
| 5 | corpName | 组织名称 | corpname | text | String |  |  | nullable |
| 6 | deptId | 所属部门 | deptid | quote | org.func.BaseOrgTimeline |  |  | data_auth,nullable |
| 7 | deptVid | 所属部门v主键 | deptvid | quote | org.func.BaseOrgTimeline |  |  | data_auth,nullable |
| 8 | deptName | 部门名称 | deptname | text | String |  |  | nullable |
| 9 | psnclId | 人员类别主键 | psnclid | text | String |  |  | nullable |
| 10 | psnclName | 人员类别名称 | psnclname | text | String |  |  | nullable |
| 11 | postId | 职位主键 | postid | text | String |  |  | nullable |
| 12 | postName | 职位名称 | postname | text | String |  |  | nullable |
| 13 | isMainJob | 是否主职,1主职,0兼职 | ismainjob | int | Integer |  |  | nullable |
| 14 | orgId | 所属组织 | orgid | quote | org.func.BaseOrgTimeline |  |  | isMasterOrg,nullable |
| 15 | orgVid | 所属组织v主键 | orgvid | quote | org.func.BaseOrgTimeline |  |  | isMasterOrg,nullable |
| 16 | ssStaffJobbTrnsEvent | 人员状态,4表示离职 | ss_staff_jobb_trnsevent | int | Integer |  |  | nullable |
| 17 | lastFlag | 是否为最新任职,1为最新 | lastflag | int | Integer |  |  | nullable |
| 18 | endFlag | 此条任职信息是否结束,1为结束,0为未结束 | endflag | int | Integer |  |  | nullable |
| 19 | showOrder | 人员顺序号  | showorder | text | String |  |  | nullable |
| 20 | beginDate | 入职日期 | begindate | date | Date |  |  | nullable |
| 21 | endDate | 离职日期 | enddate | date | Date |  |  | nullable |
| 22 | ssStaffJobbJobTypeId | 职务类别主键 | ss_staff_jobb_jobtypeid | text | String |  |  | nullable |
| 23 | tenant | 租户 | tenantid | text | String |  | Y | nullable,uiHide |
| 24 | version | 最新版本号 | version | long | Long |  |  | nullable |
| 25 | bankId | 代发银行主键 | bank_id | text | String |  |  | nullable |
| 26 | devliveryBank | 代发银行 | devlivery_bank | text | String |  |  | nullable |
| 27 | bankNumber | 银行账号 | bank_number | text | String |  |  | nullable |
| 28 | ssStaffJobbBeginDate | 任职开始日期 | ss_staff_jobb_begindate | date | Date |  |  | nullable |
| 29 | ssStaffJobbEndDate | 任职结束日期 | ss_staff_jobb_enddate | date | Date |  |  | nullable |
| 30 | jobGradeIdShowname | 职级 | jobGradeId_showname | text | String |  |  | nullable |
| 31 | jobRankIdShowname | 职等 | jobRankId_showname | text | String |  |  | nullable |
| 32 | jobName | 职务 | jobname | text | String |  |  | nullable |
| 33 | ssStaffJobbJobrankId | 职等主键 | ss_staff_jobb_jobrankid | text | String |  |  | data_auth,nullable |
| 34 | ssStaffJobbobgradeid | 职级主键 | ss_staff_jobb_jobgradeid | quote | bd.duty.Rank |  |  | nullable |
| 35 | jobTypeIdShowname | 职务类别 | jobTypeId_showname | text | String |  |  | nullable |
| 36 | partType | 其他任职(兼职)类型主键 | parttype | text | String |  |  | nullable |
| 37 | partTypeName | 其他任职(兼职)类型名称 | parttype_name | text | String |  |  | nullable |
| 38 | newPostId | 新职位 | new_post_id | text | String |  |  | nullable |
| 39 | newPostName | 新职位名称 | new_post_name | text | String |  |  | nullable |
| 40 | localOrgId | 人力管理组织 | local_org_id | quote | org.func.BaseOrg |  |  | nullable |
| 41 | localOrgVid | 时间轴人力管理组织 | local_org_vid | quote | org.func.BaseOrg |  |  | nullable |
| 42 | orgrelId | 组织关系主键 | orgrel_id | text | String |  |  | nullable |
| 43 | bdPsnlCatgId | 员工类别主键 | bd_psnl_catg_id | text | String |  |  | nullable |
| 44 | ssStaffOrgrelEnddate | 员工组织关系结束时间 | ss_staff_orgrel_enddate | date | Date |  |  | nullable |
| 45 | ssStaffOrgrelLastflag | 员工组织关系lastflag | ss_staff_orgrel_lastflag | int | Integer |  |  | nullable |
| 46 | ssStaffJobbTrnstype | 任职变动类型 | ss_staff_jobb_trnstype | text | String |  |  | nullable |
| 47 | wageGroup | 薪资组 | wagegroup | text | String |  |  | nullable |
| 48 | latestJob | 最新任职(主任职最新,兼职同lastflag),来自员工任职 | latest_job | int | Integer |  |  | nullable |
| 49 | staffJobCode | 任职编码 | staff_job_code | text | String |  |  | nullable |
| 50 | deptSort | 部门排序码 | dept_sort | int | Integer |  |  | nullable |
| 51 | orgSort | 组织排序码 | org_sort | int | Integer |  |  | nullable |
| 52 | orgCodeSort | 组织编码排序码 | org_code_sort | int | Integer |  |  | nullable |
| 53 | id | 主键 | ss_staff_job_id | quote | hred.staff.StaffJob |  |  | nullable,REF.ID |
| 54 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 55 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 56 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 57 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 58 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 59 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 60 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 61 | yTenantId | 友户通租户主键 | ytenant_id | text | String |  |  | nullable |

---

## Reference Fields (11)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | deptId | 所属部门 | deptid | org.func.BaseOrgTimeline |
| 2 | deptVid | 所属部门v主键 | deptvid | org.func.BaseOrgTimeline |
| 3 | orgId | 所属组织 | orgid | org.func.BaseOrgTimeline |
| 4 | orgVid | 所属组织v主键 | orgvid | org.func.BaseOrgTimeline |
| 5 | ssStaffJobbobgradeid | 职级主键 | ss_staff_jobb_jobgradeid | bd.duty.Rank |
| 6 | localOrgId | 人力管理组织 | local_org_id | org.func.BaseOrg |
| 7 | localOrgVid | 时间轴人力管理组织 | local_org_vid | org.func.BaseOrg |
| 8 | id | 主键 | ss_staff_job_id | hred.staff.StaffJob |
| 9 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 10 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 11 | modifier | 修改人 | MODIFIER | hred.staff.Staff |
