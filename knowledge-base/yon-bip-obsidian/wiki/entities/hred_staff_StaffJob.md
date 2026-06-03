---
tags: [BIP, metadata, hred, StaffJob]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 任职信息 (hred.staff.StaffJob)

> Platform: BIP V5 | Table: bd_staff_job | Schema: hrcloud-staff-mgr

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 任职信息 |
| uri | hred.staff.StaffJob |
| tableName | bd_staff_job |
| domain | hrcloud-staff-mgr |
| applicationCode | HRED |
| superUri | hred.staff.IDataCreateSource |
| isBusinessObject | true |
| description | 任职信息 |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 3 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 4 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |

---

## All Fields (97)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | compensateDuration | 离职通知补偿时长 | compensate_duration | int | Integer |  |  |  |
| 2 | withoutNotice | 特殊离职无通知期 | without_notice | singleOption | unitfyEnum.LOCHK.ir56_exist_share_sub |  |  |  |
| 3 | noticeEndDate | 代通知金计至日期 | notice_end_date | date | String |  |  |  |
| 4 | resignNoticeUnit | 转正后离职通知期（单位） | resign_notice_unit | singleOption | unitfyEnum.LOCHK.resign_notice_unit |  |  |  |
| 5 | compensateDurationUnit | 离职通知补偿（单位） | compensate_duration_unit | singleOption | unitfyEnum.LOCHK.resign_notice_unit |  |  |  |
| 6 | resignNoticeParty | 离职通知补偿方 | resign_notice_party | singleOption | unitfyEnum.LOCHK.resign_notice_party |  |  |  |
| 7 | resignNoticeDate | 离职通知日 | resign_notice_date | date | String |  |  |  |
| 8 | resignNoticePeriod | 转正后离职通知期 | resign_notice_period | int | Integer |  |  |  |
| 9 | longServicePay | 是否包含遣散费及长期服务金 | long_service_pay | singleOption | unitfyEnum.LOCHK.empf_long_service_pay |  |  |  |
| 10 | serviceYear | 服务年资 | service_year | number | Decimal |  |  |  |
| 11 | beginDate | 开始日期 | begindate | date | Date |  |  | nullable |
| 12 | endDate | 结束日期 | enddate | date | Date |  |  | nullable |
| 13 | trnsEvent | 变动事件 | trnsevent | singleOption | hred.staff.changeEvent |  |  | nullable |
| 14 | trnsType | 变动类型 | trnstype | quote | bd.bill.TransType |  |  | nullable |
| 15 | trnsReason | 变动原因 | trnsreason | quote | hrem.staffdoc.ChgReason |  |  | nullable |
| 16 | orgId | 组织 | org_id | quote | org.func.AdminOrg |  |  | dataAuth,data_auth,isMasterOrg,nullable |
| 17 | deptId | 部门 | dept_id | quote | bd.adminOrg.AdminOrgVO |  |  | dataAuth,data_auth |
| 18 | isweaken | 档案关系弱化 | isweaken | switch | Boolean |  |  | nullable |
| 19 | otherJobType | 其他任职类型 | other_job_type | singleOption | hred.staff.otherJobTypeEnum |  |  | nullable |
| 20 | postId | 岗位 | post_id | quote | bd.duty.Position |  |  | nullable |
| 21 | newPostId | 职位 | new_post_id | quote | bd.duty.Posts |  |  | nullable |
| 22 | jobId | 职务 | job_id | quote | bd.duty.Duty |  |  | nullable |
| 23 | jobGradeId | 职级 | jobgrade_id | quote | bd.duty.Rank |  |  | nullable |
| 24 | jobMgrGradeId | 管理职级 | jobmgrgrade_id | quote | bd.duty.Rank |  |  | nullable |
| 25 | jobRankId | 职等 | jobrank_id | quote | bd.duty.Grade |  |  | nullable |
| 26 | psnclId | 人员类别 | psncl_id | quote | bd.staff.PsnlCatg |  |  | dataAuth,data_auth,nullable |
| 27 | empform | 用工形式 | empform | quote | hred.employment.Empform |  |  | nullable |
| 28 | postStatus | 在岗状态 | poststatus | quote | hred.postState.PostState |  |  | nullable |
| 29 | addrId | 工作地点 | addr_id | quote | hrcm.location.Location |  |  | dataAuth,data_auth,nullable |
| 30 | director | 主管 | director | quote | hred.staff.Staff |  |  | nullable |
| 31 | staffFte | 全时当量 | staff_fte | text | String |  |  | nullable |
| 32 | wageGroup | 薪资组 | wagegroup | quote | hrxc.mddGroupDoc.waGroupDoc |  |  | dataAuth,data_auth,nullable |
| 33 | country | 国家/地区 | country | quote | bd.country.CountryVO |  |  | nullable |
| 34 | timezone | 时区 | timezone | text | String |  |  | nullable |
| 35 | memo | 备注 | memo | bigText | String |  |  | nullable |
| 36 | dispositon | 离职去向 | dispositon | quote | bd.customerdoc_0021.0021 |  |  | nullable |
| 37 | disexplain | 离职说明 | disexplain | text | String |  |  | nullable |
| 38 | newAttachment | 附件 | new_attachment | attachment | String |  |  | nullable |
| 39 | staffJobDefines | 特征 | staffJob_define | UserDefine | hred.staff.StaffJobTZDefines |  |  | nullable |
| 40 | staffId | 人员ID | staff_id | quote | hred.staff.Staff |  |  | nullable |
| 41 | id | ID | id | text | String |  |  | jointUnique,data_auth,nullable,uiHide,REF.ID |
| 42 | isMainJob | 是否主职 | ismainjob | switch | Boolean |  |  | nullable |
| 43 | endFlag | 是否生效中 | endflag | switch | Boolean |  |  | nullable,uiHide |
| 44 | staffjobCode | 任职编码 | staffjob_code | text | String |  |  | nullable |
| 45 | lastestjob | 是否当前最新 | lastestjob | switch | Boolean |  |  | nullable |
| 46 | enable | 任职生效状态 | enable | int | Integer |  |  | nullable |
| 47 | orgRelId | 工作关系ID | orgrel_id | quote | hred.staff.StaffOrgRel |  |  | nullable,uiHide |
| 48 | lastFlag | 是否工作关系内最新 | lastflag | switch | Boolean |  |  | nullable,uiHide |
| 49 | showOrder | 排序号 | showorder | int | Integer |  |  | nullable |
| 50 | effectiveNumber | 生效序号 | effective_number | int | Integer |  |  | nullable |
| 51 | recordNum | 记录序号 | recordnum | int | Integer |  |  | nullable,uiHide |
| 52 | staffjobId | 任职ID | staffjob_id | text | String |  |  | dataAuth,data_auth,nullable |
| 53 | assgId | 任职组ID | assg_id | int | Integer |  |  | nullable,uiHide |
| 54 | isCadre | 干部 | is_cadre | switch | Boolean |  |  | nullable |
| 55 | localOrgId | 人力管理组织 | local_org_id | quote | org.func.BaseOrg |  |  | nullable |
| 56 | account_org_id | 会计主体 | account_org_id | quote | org.func.FinanceOrg |  |  | dataAuth,data_auth,nullable |
| 57 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 58 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable |
| 59 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 60 | modifyTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable |
| 61 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 62 | orgVid | 组织(时间轴) | org_vid | quote | bd.adminOrg.AdminOrgVOTimeline |  |  | nullable |
| 63 | deptVid | 部门(时间轴) | dept_vid | quote | bd.adminOrg.AdminOrgVOTimeline |  |  | nullable |
| 64 | localOrgVid | 人力管理组织(时间轴) | local_org_vid | quote | org.func.BaseOrg |  |  | nullable |
| 65 | postVid | 岗位(时间轴) | post_vid | quote | bd.duty.PositionTimeLine |  |  | hide,nullable |
| 66 | newPostVid | 职位(时间轴) | new_post_vid | quote | bd.duty.PostsTimeLine |  |  | hide,nullable |
| 67 | jobGradeVid | 职级(时间轴) | jobgrade_vid | quote | bd.duty.RankTimeLine |  |  | hide,nullable |
| 68 | jobVid | 职务(时间轴) | job_vid | quote | bd.duty.DutyTimeLine |  |  | hide,nullable |
| 69 | jobRankVid | 职等(时间轴) | jobrank_vid | quote | bd.duty.GradeTimeLine |  |  | hide,nullable |
| 70 | jobTypeVid | 职务类别(时间轴) | jobtype_vid | quote | bd.duty.DutyTypeTimeLine |  |  | hide,nullable |
| 71 | jobTypeId | 职务类别 | jobtype_id | quote | bd.duty.DutyType |  |  | nullable |
| 72 | partTypeStatus | 任职状态 | part_type_status | - | hred.staff.partTypeStatus |  |  | nullable |
| 73 | planEndDate | 预计结束日期 | plan_enddate | date | Date |  |  | nullable |
| 74 | dataCreateBillid | 新增来源单据id | data_create_billid | text | String |  |  | deactivated,nullable |
| 75 | businessOrg | 其他业务归属组织 | business_org | quote | org.func.BaseOrg |  |  | nullable |
| 76 | businessDept | 其他业务归属部门 | business_dept | quote | org.func.BaseOrg |  |  | nullable |
| 77 | partTypeFixId | 任职类型维护ID | part_type_fix_id | text | String |  |  | nullable |
| 78 | extension | 扩展字段 | jsonextattr | text | String |  |  | nullable |
| 79 | outerJobInfo | 集团外任职信息 | outer_job_info | text | String |  |  | nullable |
| 80 | partType | 其他任职原因 | parttype | quote | bd.customerdoc_0030.0030 |  |  | nullable |
| 81 | entryProFlag | 入职进度标识 | entry_pro_flag | text | String |  |  | nullable |
| 82 | sysid | 来源系统标识 | sysid | text | String |  |  | nullable |
| 83 | belongJob | 所属任职 | belong_job | quote | hred.staff.StaffJob |  |  | nullable |
| 84 | bmLocation | 社保缴纳地 | bmlocation | quote | hrcm.location.Location |  |  | nullable |
| 85 | oriBillType | 来源单据类型 | oribill_type | text | String |  |  | nullable,uiHide |
| 86 | objId | 混合云ID | objid | text | String |  |  | nullable |
| 87 | oriBillId | 来源单据主键 | oribill_id | text | String |  |  | nullable,uiHide |
| 88 | dataCreateSource | 新增来源 | data_create_source | text | String |  |  | deactivated,nullable |
| 89 | name | 任职编码 | staffjob_code | text | String |  |  | nullable |
| 90 | businessTypeScope | 任职类型 | business_type_scope | - | hred.staff.businessTypeScope |  |  | nullable |
| 91 | waStruct | 薪资结构 | wastruct | text | String |  |  | nullable |
| 92 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 93 | tenant | 租户ID | tenantid | text | String |  | Y | nullable,uiHide |
| 94 | yTenantId | 租户ID | ytenant_id | text | String |  |  | nullable,uiHide |
| 95 | ytenant | 租户ID | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 96 | staffJobVODefine | 任职信息自定义项表 | - | - | hred.staff.StaffJobVODefine |  |  |  |
| 97 | staffSort | 员工列表排序 | - | - | hred.staff.StaffSort |  |  |  |

---

## Reference Fields (40)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | trnsType | 变动类型 | trnstype | bd.bill.TransType |
| 2 | trnsReason | 变动原因 | trnsreason | hrem.staffdoc.ChgReason |
| 3 | orgId | 组织 | org_id | org.func.AdminOrg |
| 4 | deptId | 部门 | dept_id | bd.adminOrg.AdminOrgVO |
| 5 | postId | 岗位 | post_id | bd.duty.Position |
| 6 | newPostId | 职位 | new_post_id | bd.duty.Posts |
| 7 | jobId | 职务 | job_id | bd.duty.Duty |
| 8 | jobGradeId | 职级 | jobgrade_id | bd.duty.Rank |
| 9 | jobMgrGradeId | 管理职级 | jobmgrgrade_id | bd.duty.Rank |
| 10 | jobRankId | 职等 | jobrank_id | bd.duty.Grade |
| 11 | psnclId | 人员类别 | psncl_id | bd.staff.PsnlCatg |
| 12 | empform | 用工形式 | empform | hred.employment.Empform |
| 13 | postStatus | 在岗状态 | poststatus | hred.postState.PostState |
| 14 | addrId | 工作地点 | addr_id | hrcm.location.Location |
| 15 | director | 主管 | director | hred.staff.Staff |
| 16 | wageGroup | 薪资组 | wagegroup | hrxc.mddGroupDoc.waGroupDoc |
| 17 | country | 国家/地区 | country | bd.country.CountryVO |
| 18 | dispositon | 离职去向 | dispositon | bd.customerdoc_0021.0021 |
| 19 | staffId | 人员ID | staff_id | hred.staff.Staff |
| 20 | orgRelId | 工作关系ID | orgrel_id | hred.staff.StaffOrgRel |
| 21 | localOrgId | 人力管理组织 | local_org_id | org.func.BaseOrg |
| 22 | account_org_id | 会计主体 | account_org_id | org.func.FinanceOrg |
| 23 | creator | 创建人 | creator | base.user.BipUser |
| 24 | modifier | 修改人 | modifier | base.user.BipUser |
| 25 | orgVid | 组织(时间轴) | org_vid | bd.adminOrg.AdminOrgVOTimeline |
| 26 | deptVid | 部门(时间轴) | dept_vid | bd.adminOrg.AdminOrgVOTimeline |
| 27 | localOrgVid | 人力管理组织(时间轴) | local_org_vid | org.func.BaseOrg |
| 28 | postVid | 岗位(时间轴) | post_vid | bd.duty.PositionTimeLine |
| 29 | newPostVid | 职位(时间轴) | new_post_vid | bd.duty.PostsTimeLine |
| 30 | jobGradeVid | 职级(时间轴) | jobgrade_vid | bd.duty.RankTimeLine |
| 31 | jobVid | 职务(时间轴) | job_vid | bd.duty.DutyTimeLine |
| 32 | jobRankVid | 职等(时间轴) | jobrank_vid | bd.duty.GradeTimeLine |
| 33 | jobTypeVid | 职务类别(时间轴) | jobtype_vid | bd.duty.DutyTypeTimeLine |
| 34 | jobTypeId | 职务类别 | jobtype_id | bd.duty.DutyType |
| 35 | businessOrg | 其他业务归属组织 | business_org | org.func.BaseOrg |
| 36 | businessDept | 其他业务归属部门 | business_dept | org.func.BaseOrg |
| 37 | partType | 其他任职原因 | parttype | bd.customerdoc_0030.0030 |
| 38 | belongJob | 所属任职 | belong_job | hred.staff.StaffJob |
| 39 | bmLocation | 社保缴纳地 | bmlocation | hrcm.location.Location |
| 40 | ytenant | 租户ID | ytenant_id | yht.tenant.YhtTenant |

---

## Enum Fields (7)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | withoutNotice | 特殊离职无通知期 | without_notice | ir56_exist_share_sub |
| 2 | resignNoticeUnit | 转正后离职通知期（单位） | resign_notice_unit | resign_notice_unit |
| 3 | compensateDurationUnit | 离职通知补偿（单位） | compensate_duration_unit | resign_notice_unit |
| 4 | resignNoticeParty | 离职通知补偿方 | resign_notice_party | resign_notice_party |
| 5 | longServicePay | 是否包含遣散费及长期服务金 | long_service_pay | empf_long_service_pay |
| 6 | trnsEvent | 变动事件 | trnsevent | hred.staff.changeEvent |
| 7 | otherJobType | 其他任职类型 | other_job_type | hred.staff.otherJobTypeEnum |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | staffJobVODefine | 任职信息自定义项表 | hred.staff.StaffJobVODefine |
| 2 | staffSort | 员工列表排序 | hred.staff.StaffSort |

---

## Enum Value Details

### 特殊离职无通知期 (withoutNotice) -> without_notice
> Enum: unitfyEnum.LOCHK.ir56_exist_share_sub

| code | value | name |
|------|-------|------|
| 0 | 0 | 否 |
| 1 | 1 | 是 |

### 转正后离职通知期（单位） (resignNoticeUnit) -> resign_notice_unit
> Enum: unitfyEnum.LOCHK.resign_notice_unit

| code | value | name |
|------|-------|------|
| D | D | 天 |
| M | M | 月 |

### 离职通知补偿（单位） (compensateDurationUnit) -> compensate_duration_unit
> Enum: unitfyEnum.LOCHK.resign_notice_unit

| code | value | name |
|------|-------|------|
| D | D | 天 |
| M | M | 月 |

### 离职通知补偿方 (resignNoticeParty) -> resign_notice_party
> Enum: unitfyEnum.LOCHK.resign_notice_party

| code | value | name |
|------|-------|------|
| EE | EE | 雇员 |
| ER | ER | 雇主 |

### 是否包含遣散费及长期服务金 (longServicePay) -> long_service_pay
> Enum: unitfyEnum.LOCHK.empf_long_service_pay

| code | value | name |
|------|-------|------|
| L | L | 长期服务金申请 |
| S | S | 遣散费申请 |

### 变动事件 (trnsEvent) -> trnsevent
> Enum: hred.staff.changeEvent

| code | value | name |
|------|-------|------|
| 11 | 11 | 挂职开始 |
| 12 | 12 | 挂职变更 |
| 13 | 13 | 挂职结束 |
| 14 | 14 | 外派开始 |
| 15 | 15 | 外派变更 |
| 16 | 16 | 外派结束 |
| 17 | 17 | 轮岗开始 |
| 18 | 18 | 轮岗变更 |
| 19 | 19 | 轮岗结束 |
| 1 | 1 | 入职 |
| 2 | 2 | 转正 |
| 3 | 3 | 调动 |
| 4 | 4 | 离职 |
| 5 | 5 | 兼职开始 |
| 6 | 6 | 兼职变更 |
| 7 | 7 | 兼职结束 |
| 8 | 8 | 借调开始 |
| 9 | 9 | 借调变更 |
| 10 | 10 | 借调结束 |

### 其他任职类型 (otherJobType) -> other_job_type
> Enum: hred.staff.otherJobTypeEnum

| code | value | name |
|------|-------|------|
| 1 | 1 | 兼职 |
| 2 | 2 | 借调 |
| 3 | 3 | 挂职 |
| 4 | 4 | 外派 |
| 5 | 5 | 轮岗 |
