---
tags: [BIP, metadata, hred, HrCandidate]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 候选人基本信息 (hred.hrcandidate.HrCandidate)

> Platform: BIP V5 | Table: bd_staff | Schema: hrcloud-staff-mgr

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 候选人基本信息 |
| uri | hred.hrcandidate.HrCandidate |
| tableName | bd_staff |
| domain | hrcloud-staff-mgr |
| applicationCode | HRED |
| superUri | hred.staff.Staff |
| isBusinessObject | true |
| description | 候选人基本信息 |

## Key
| Role | Column |
|------|--------|
| key | id |

---

## All Fields (173)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | name | 姓名 | name | text | String |  |  | isName,nullable |
| 2 | code | 候选人编码 | code | text | String |  |  | REF.CODE,CODE,nullable,isCode |
| 3 | unitId | 组织 | unit_id | quote | org.func.AdminOrg |  |  | isMasterOrg,nullable |
| 4 | deptId | 部门 | dept_id | quote | org.func.AdminOrg |  |  | nullable,uiHide |
| 5 | manageOrg | 人力管理组织 | manage_org | quote | org.func.AdminOrg |  |  | nullable |
| 6 | psnclId | 人员类别 | psncl_id | quote | bd.staff.PsnlCatg |  |  | nullable,uiAssign |
| 7 | postId | 岗位 | post_id | quote | bd.duty.Position |  |  | nullable |
| 8 | jobGradeId | 职级 | jobgrade_id | quote | bd.duty.Rank |  |  | nullable |
| 9 | jobRankId | 职等 | jobrank_id | quote | bd.duty.Grade |  |  | nullable |
| 10 | addrId | 工作地点 | addr_id | quote | hrcm.location.Location |  |  | nullable |
| 11 | joinedDate | 入职日期 | joined_date | date | Date |  |  | nullable |
| 12 | majorcorpid | 合同主体 | majorcorpid | quote | hrcm.contractentity.ContractEntity |  |  | nullable |
| 13 | sameHrCandidateId | 同一候选人 | same_hrCandidate_id | text | String |  |  | nullable |
| 14 | ts | 更新时间 | ts | date | Date |  |  | nullable |
| 15 | retireAdjMon | 退休调整值(月) | retire_adj_mon | int | Integer |  |  | nullable |
| 16 | lastUser | 上次关联用户 | last_user | quote | base.user.BipUser |  |  | nullable |
| 17 | isOnlyChild | 独生子女 | is_only_child | switch | Boolean |  |  | nullable |
| 18 | checkInStatus | 扫码报到状态 | check_in_status | - | hred.hrcandidate.CheckInStatus |  |  | nullable |
| 19 | checkInTime | 扫码报到时间 | check_in_time | timestamp | Timestamp |  |  | nullable |
| 20 | isOuterStaff | 是否外部人员 | is_outer_staff | int | Integer |  |  | nullable,uiHide |
| 21 | candidateStaffCode | 员工编码 | candidate_staff_code | text | String |  |  | nullable |
| 22 | photo | 头像 | photo | image | String |  |  | nullable |
| 23 | firstName | 姓 | first_name | text | String |  |  | nullable |
| 24 | middleName | 中间名 | middle_name | text | String |  |  | nullable |
| 25 | lastName | 名 | last_name | text | String |  |  | nullable |
| 26 | shortName | 姓名简拼 | shortname | text | String |  |  | nullable |
| 27 | englishName | 英文名 | english_name | text | String |  |  | nullable |
| 28 | formerName | 曾用名 | former_name | text | String |  |  | nullable |
| 29 | sex | 性别 | sex | singleOption | hred.staff.sexEnum |  |  | nullable |
| 30 | birthDate | 出生日期 | birthdate | date | Date |  |  | nullable |
| 31 | age | 年龄 | age | int | Integer |  |  | nullable |
| 32 | mobile | 手机号 | mobile | text | String |  |  | nullable |
| 33 | officeTel | 办公电话 | officetel | tel | String |  |  | nullable |
| 34 | certType | 证件类型 | cert_type | quote | bd.IDtype.IDTypeVO |  |  | nullable |
| 35 | certNo | 证件号 | cert_no | text | String |  |  | nullable |
| 36 | documentValidity | 证件有效期 | document_validity | date | Date |  |  | nullable |
| 37 | idCardFront | 身份证国徽面 | id_card_front | image | String |  |  | nullable |
| 38 | idCardReverse | 身份证人像面 | id_card_reverse | image | String |  |  | nullable |
| 39 | email | 工作邮箱 | email | mail | String |  |  | nullable |
| 40 | selfEmail | 个人邮箱 | selfemail | mail | String |  |  | nullable |
| 41 | postcode | 邮政编码 | postcode | text | String |  |  | nullable |
| 42 | linkAddr | 通讯地址 | linkaddr | text | String |  |  | nullable |
| 43 | country | 国籍(地区) | country | quote | bd.country.CountryVO |  |  | nullable |
| 44 | origin | 籍贯 | origin | quote | bd.region.BaseRegionVO |  |  | nullable |
| 45 | characterrpr | 户口性质 | characterrpr | quote | socialmdm.social.HouseholdType |  |  | nullable |
| 46 | permanreside | 户口所在地 | permanreside | quote | bd.region.BaseRegionVO |  |  | nullable |
| 47 | education | 最高学历 | education | quote | hred.education.Education |  |  | nullable |
| 48 | degree | 最高学位 | degree | quote | hred.degreefiles.Degreefiles |  |  | nullable |
| 49 | joinWorkDate | 参加工作日期 | joinworkDate | date | Date |  |  | nullable |
| 50 | workAge | 工龄 | work_age | number | Decimal |  |  | nullable |
| 51 | workAgeAdjType | 工龄调整方式 | workage_adj_type | singleOption | hred.staff.workAgeAdjustType |  |  | nullable |
| 52 | workAgeAdjYea | 调整工龄(年数) | workage_adj_yea | int | Integer |  |  | nullable |
| 53 | workAgeAdjMon | 调整工龄(月数) | workage_adj_mon | int | Integer |  |  | nullable |
| 54 | workAgeAdjDay | 调整工龄(天数) | workage_adj_day | int | Integer |  |  | nullable |
| 55 | birthPlace | 出生地 | birth_place | quote | bd.region.BaseRegionVO |  |  | nullable |
| 56 | nationality | 民族 | nationality | quote | socialmdm.social.Nation |  |  | nullable |
| 57 | political | 政治面貌 | political | quote | bd.customerdoc_0004.0004 |  |  | nullable |
| 58 | joinPolityDate | 加入党团日期 | joinpolitydate | date | Date |  |  | nullable |
| 59 | religion | 宗教信仰 | religion | quote | hred.religion.Religion |  |  | nullable |
| 60 | marital | 婚姻状况 | marital | quote | bd.customerdoc_0003.0003 |  |  | nullable |
| 61 | bloodType | 血型 | bloodtype | quote | socialmdm.social.BloodType |  |  | nullable |
| 62 | hobby | 特长爱好 | hobby | text | String |  |  | nullable |
| 63 | weiXin | 微信 | weixin | text | String |  |  | nullable |
| 64 | qq | QQ | qq | text | String |  |  | nullable |
| 65 | height | 身高 | height | number | Decimal |  |  | nullable |
| 66 | weight | 体重 | weight | number | Decimal |  |  | nullable |
| 67 | annualsalary | 年薪 | annualsalary | number | Decimal |  |  | hide,nullable |
| 68 | salarystructure | 薪资结构 | salarystructure | text | String |  |  | hide,nullable |
| 69 | entrySchemeId | 入职方案 | entry_scheme_id | quote | ss.hrEntryScheme.HrEntryScheme |  |  | nullable |
| 70 | entrySchemeCategoryId | 入职方案类别 | entry_scheme_category_id | quote | ss.schemeCategory.HrEntrySchemeCategory |  |  | nullable,uiAssign |
| 71 | candidateStatus | 候选人状态 | candidate_status | int | Integer |  |  | nullable |
| 72 | candidateSource | 来源渠道 | candidate_source | singleOption | hred.hrcandidate.CandidateSource |  |  | nullable |
| 73 | recruitmenttype | 招聘类型 | recruitmenttype | text | String |  |  | nullable |
| 74 | recruitmentitem | 招聘项目 | recruitmentitem | text | String |  |  | nullable |
| 75 | recruitPostId | 招聘职位 | recruit_post_id | quote | re.recruit.RecruitPostVO |  |  | nullable |
| 76 | staffDefines | 特征 | staff_define | UserDefine | hred.staff.StaffTZDefines |  |  | nullable |
| 77 | attachlist | 附件 | attachlist | attachment | String |  |  | nullable |
| 78 | candidateId | 候选人ID | id | text | String |  |  | nullable |
| 79 | userId | 关联用户 | user_id | text | String |  |  | nullable |
| 80 | hireBillId | OfferID | hire_bill_id | text | String |  |  | nullable |
| 81 | entryBillId | 入职单ID | entry_bill_id | quote | ss.hrEntry.HrEntryBill |  |  | nullable |
| 82 | documenterId | 制单人 | documenter_id | quote | bd.staff.Staff |  |  | dataAuth,data_auth,nullable |
| 83 | qrCodeId | 入职二维码 | qrcode_id | quote | ss.entryqrcode.HrEntryQRCode |  |  | nullable |
| 84 | personnelinformation | 信息采集表链接(外部) | personnelinformation | text | String |  |  | nullable |
| 85 | collectionstatus | 采集状态 | collection_status | text | String |  |  | nullable |
| 86 | examinationresults | 笔试成绩链接 | examinationresults | text | String |  |  | nullable |
| 87 | assessUrl | 测评链接 | assess_url | text | String |  |  | nullable |
| 88 | resumesource | 简历来源 | resumesource | text | String |  |  | nullable |
| 89 | resumeUrl | 简历链接 | resume_url | text | String |  |  | nullable |
| 90 | evaluationUrl | 面试评价链接 | evaluation_url | text | String |  |  | nullable |
| 91 | applyId | 外部系统数据ID | apply_id | text | String |  |  | nullable |
| 92 | secretId | 员工密级 | secret_id | quote | sys.secret.UserSecretObj |  |  | nullable |
| 93 | candidateFlag | 候选人标识 | candidate_flag | switch | Boolean |  |  | nullable,uiHide |
| 94 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 95 | createTime | 创建时间 | creationtime | timestamp | Timestamp |  |  | nullable |
| 96 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 97 | modifyTime | 修改时间 | modifiedtime | timestamp | Timestamp |  |  | nullable |
| 98 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 99 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 100 | cadresShoworder | 干部人员排序 | cadres_showorder | int | Integer |  |  | nullable |
| 101 | iscadre | 干部 | iscadre | switch | Boolean |  |  | nullable |
| 102 | cadreType | 干部分类 | cadre_type | quote | hred.cadreType.CadreType |  |  | nullable |
| 103 | extension | 扩展字段 | jsonextattr | text | String |  |  | nullable |
| 104 | id | ID | id | text | String |  |  | data_auth,nullable,uiHide,dataAuth,REF.ID |
| 105 | formalwage | 转正工资 | formalwage | number | Decimal |  |  | hide,nullable |
| 106 | sysId | 来源系统标识 | sysid | text | String |  |  | nullable |
| 107 | departDate | 离职日期 | depart_date | date | Date |  |  | nullable |
| 108 | nameDefines | 姓名扩展 | name_define | quote | hred.staff.StaffNameTZDefines |  |  | nullable |
| 109 | currentJob | 当前任职 | current_job | quote | hred.staff.StaffJob |  |  | nullable |
| 110 | enable | 人员状态 | enable | singleOption | hred.staff.enable |  |  | nullable |
| 111 | wagegroup | 薪资组 | wagegroup | quote | hrxc.mddGroupDoc.waGroupDoc |  |  | dataAuth,data_auth,nullable |
| 112 | orgId | 所属组织 | org_id | quote | org.func.AdminOrg |  |  | nullable,uiHide |
| 113 | probationwage | 试用期工资 | probationwage | number | Decimal |  |  | hide,nullable |
| 114 | attachIdList | 附件 | attach_id_list | attachment | String |  |  | nullable |
| 115 | linkedIn | 来源领英 | linkedin | text | String |  |  | nullable |
| 116 | tenant | 租户ID | tenantid | text | String |  | Y | nullable,uiHide |
| 117 | ytenant | 租户ID | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 118 | objid | nc主键 | objid | text | String |  |  | nullable |
| 119 | rejectiontimes | 驳回次数 | rejection_times | short | Short |  |  | nullable |
| 120 | rejectionreason | 最新驳回原因 | rejection_reason | text | String |  |  | nullable |
| 121 | delayedRetDate | 预计退休日期 | delayed_ret_date | date | Date |  |  | nullable |
| 122 | bizManTag | 业务员 | biz_man_tag | switch | Boolean |  |  | nullable |
| 123 | shopAssisTag | 是否店员 | shop_assis_tag | switch | Boolean |  |  | nullable |
| 124 | dataCreateSource | 新增来源 | data_create_source | text | String |  |  | deactivated,nullable |
| 125 | dataCreateBillid | 新增来源单据id | data_create_billid | text | String |  |  | deactivated,nullable |
| 126 | yTenantId | 租户ID | ytenant_id | text | String |  |  | nullable,uiHide |
| 127 | aaa000List |  | - | - | hred.hrcandidate.aaa000 |  |  |  |
| 128 | address | 地址信息 | - | - | hred.hrcandidate.Address |  |  |  |
| 129 | ass | 绩效信息 | - | - | hred.hrcandidate.Ass |  |  |  |
| 130 | bankAcct | 银行信息 | - | - | hred.hrcandidate.BankAcct |  |  |  |
| 131 | candidateJob | 候选人任职信息 | - | - | hred.hrcandidate.CandidateJob |  |  |  |
| 132 | cert | 证件信息 | - | - | hred.hrcandidate.Cert |  |  |  |
| 133 | certificate | 证书信息 | - | - | hred.hrcandidate.Certificate |  |  |  |
| 134 | cs1List |  | - | - | hred.hrcandidate.cs1 |  |  |  |
| 135 | ctrt | 合同信息 | - | - | hred.hrcandidate.Ctrt |  |  |  |
| 136 | dotline | 虚线上级 | - | - | hred.hrcandidate.Dotline |  |  |  |
| 137 | edu | 教育信息 | - | - | hred.hrcandidate.Edu |  |  |  |
| 138 | evaluationMessage | 测评信息 | - | - | hred.hrcandidate.EvaluationMessage |  |  |  |
| 139 | globalInfo | 全球化个人信息 | - | - | hred.hrcandidate.GlobalInfo |  |  |  |
| 140 | globalInfoCHN | 中国大陆全球化个人信息 | - | - | hred.hrcandidate.GlobalInfoCHN |  |  |  |
| 141 | globalInfoGBR | 英国全球化个人信息 | - | - | hred.hrcandidate.GlobalInfoGBR |  |  |  |
| 142 | globalInfoHK | 香港全球化个人信息 | - | - | hred.hrcandidate.GlobalInfoHK |  |  |  |
| 143 | globalInfoIND | 印度全球化个人信息 | - | - | hred.hrcandidate.GlobalInfoIND |  |  |  |
| 144 | globalInfoMAS | 马来西亚全球化个人信息 | - | - | hred.hrcandidate.GlobalInfoMAS |  |  |  |
| 145 | globalInfoSIN | 新加坡全球化个人信息 | - | - | hred.hrcandidate.GlobalInfoSIN |  |  |  |
| 146 | globalInfoUSA | 美国全球化个人信息 | - | - | hred.hrcandidate.GlobalInfoUSA |  |  |  |
| 147 | healthSituation | 健康信息 | - | - | hred.hrcandidate.HealthSituation |  |  |  |
| 148 | hi_psndoc_glbdef14List |  | - | - | hred.hrcandidate.hi_psndoc_glbdef14 |  |  |  |
| 149 | hmk01List |  | - | - | hred.hrcandidate.hmk01 |  |  |  |
| 150 | interview | 面试轮次 | - | - | hred.hrcandidate.Interview |  |  |  |
| 151 | langAbility | 语言能力 | - | - | hred.hrcandidate.LangAbility |  |  |  |
| 152 | m0001List |  | - | - | hred.hrcandidate.m0001 |  |  |  |
| 153 | nameWrittenInEnglish | 名（外文写法） | nameWrittenInEnglish | text | String |  |  |  |
| 154 | orgRel | 工作关系 | - | - | hred.hrcandidate.OrgRel |  |  |  |
| 155 | probation | 试用信息 | - | - | hred.hrcandidate.Probation |  |  |  |
| 156 | proqualify | 职业资格 | - | - | hred.hrcandidate.Proqualify |  |  |  |
| 157 | protocol | 协议信息 | - | - | hred.hrcandidate.Protocol |  |  |  |
| 158 | referenceCheck | 背调信息 | - | - | hred.hrcandidate.ReferenceCheck |  |  |  |
| 159 | referenceCheckExternal | 外部背调信息 | - | - | hred.hrcandidate.ReferenceCheckExternal |  |  |  |
| 160 | resume | 履历信息 | - | - | hred.hrcandidate.Resume |  |  |  |
| 161 | reward | 奖励信息 | - | - | hred.hrcandidate.Reward |  |  |  |
| 162 | salarychgDoc | 定薪信息 | - | - | hred.hrcandidate.SalarychgDoc |  |  |  |
| 163 | shsy2025List |  | - | - | hred.hrcandidate.shsy2025 |  |  |  |
| 164 | socialInsurance | 社保增员 | - | - | hred.hrcandidate.SocialInsurance |  |  |  |
| 165 | socialRel | 社会关系 | - | - | hred.hrcandidate.SocialRel |  |  |  |
| 166 | surnameWrittenInEnglish | 姓（外文写法） | surnameWrittenInEnglish | text | String |  |  |  |
| 167 | sybx01List |  | - | - | hred.hrcandidate.sybx01 |  |  |  |
| 168 | techPost | 专业技术职务 | - | - | hred.hrcandidate.TechPost |  |  |  |
| 169 | testlqlList |  | - | - | hred.hrcandidate.testlql |  |  |  |
| 170 | title | 职称信息 | - | - | hred.hrcandidate.Title |  |  |  |
| 171 | train | 培训信息 | - | - | hred.hrcandidate.Train |  |  |  |
| 172 | writtenExamination | 笔试信息 | - | - | hred.hrcandidate.WrittenExamination |  |  |  |
| 173 | yy003List |  | - | - | hred.hrcandidate.yy003 |  |  |  |

---

## Reference Fields (38)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | unitId | 组织 | unit_id | org.func.AdminOrg |
| 2 | deptId | 部门 | dept_id | org.func.AdminOrg |
| 3 | manageOrg | 人力管理组织 | manage_org | org.func.AdminOrg |
| 4 | psnclId | 人员类别 | psncl_id | bd.staff.PsnlCatg |
| 5 | postId | 岗位 | post_id | bd.duty.Position |
| 6 | jobGradeId | 职级 | jobgrade_id | bd.duty.Rank |
| 7 | jobRankId | 职等 | jobrank_id | bd.duty.Grade |
| 8 | addrId | 工作地点 | addr_id | hrcm.location.Location |
| 9 | majorcorpid | 合同主体 | majorcorpid | hrcm.contractentity.ContractEntity |
| 10 | lastUser | 上次关联用户 | last_user | base.user.BipUser |
| 11 | certType | 证件类型 | cert_type | bd.IDtype.IDTypeVO |
| 12 | country | 国籍(地区) | country | bd.country.CountryVO |
| 13 | origin | 籍贯 | origin | bd.region.BaseRegionVO |
| 14 | characterrpr | 户口性质 | characterrpr | socialmdm.social.HouseholdType |
| 15 | permanreside | 户口所在地 | permanreside | bd.region.BaseRegionVO |
| 16 | education | 最高学历 | education | hred.education.Education |
| 17 | degree | 最高学位 | degree | hred.degreefiles.Degreefiles |
| 18 | birthPlace | 出生地 | birth_place | bd.region.BaseRegionVO |
| 19 | nationality | 民族 | nationality | socialmdm.social.Nation |
| 20 | political | 政治面貌 | political | bd.customerdoc_0004.0004 |
| 21 | religion | 宗教信仰 | religion | hred.religion.Religion |
| 22 | marital | 婚姻状况 | marital | bd.customerdoc_0003.0003 |
| 23 | bloodType | 血型 | bloodtype | socialmdm.social.BloodType |
| 24 | entrySchemeId | 入职方案 | entry_scheme_id | ss.hrEntryScheme.HrEntryScheme |
| 25 | entrySchemeCategoryId | 入职方案类别 | entry_scheme_category_id | ss.schemeCategory.HrEntrySchemeCategory |
| 26 | recruitPostId | 招聘职位 | recruit_post_id | re.recruit.RecruitPostVO |
| 27 | entryBillId | 入职单ID | entry_bill_id | ss.hrEntry.HrEntryBill |
| 28 | documenterId | 制单人 | documenter_id | bd.staff.Staff |
| 29 | qrCodeId | 入职二维码 | qrcode_id | ss.entryqrcode.HrEntryQRCode |
| 30 | secretId | 员工密级 | secret_id | sys.secret.UserSecretObj |
| 31 | creator | 创建人 | creator | base.user.BipUser |
| 32 | modifier | 修改人 | modifier | base.user.BipUser |
| 33 | cadreType | 干部分类 | cadre_type | hred.cadreType.CadreType |
| 34 | nameDefines | 姓名扩展 | name_define | hred.staff.StaffNameTZDefines |
| 35 | currentJob | 当前任职 | current_job | hred.staff.StaffJob |
| 36 | wagegroup | 薪资组 | wagegroup | hrxc.mddGroupDoc.waGroupDoc |
| 37 | orgId | 所属组织 | org_id | org.func.AdminOrg |
| 38 | ytenant | 租户ID | ytenant_id | yht.tenant.YhtTenant |

---

## Enum Fields (4)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | sex | 性别 | sex | hred.staff.sexEnum |
| 2 | workAgeAdjType | 工龄调整方式 | workage_adj_type | hred.staff.workAgeAdjustType |
| 3 | candidateSource | 来源渠道 | candidate_source | hred.hrcandidate.CandidateSource |
| 4 | enable | 人员状态 | enable | hred.staff.enable |

---

## Child Tables (45)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | ass | 绩效信息 | hred.hrcandidate.Ass |
| 2 | healthSituation | 健康信息 | hred.hrcandidate.HealthSituation |
| 3 | certificate | 证书信息 | hred.hrcandidate.Certificate |
| 4 | bankAcct | 银行信息 | hred.hrcandidate.BankAcct |
| 5 | referenceCheckExternal | 外部背调信息 | hred.hrcandidate.ReferenceCheckExternal |
| 6 | cert | 证件信息 | hred.hrcandidate.Cert |
| 7 | globalInfoGBR | 英国全球化个人信息 | hred.hrcandidate.GlobalInfoGBR |
| 8 | title | 职称信息 | hred.hrcandidate.Title |
| 9 | referenceCheck | 背调信息 | hred.hrcandidate.ReferenceCheck |
| 10 | proqualify | 职业资格 | hred.hrcandidate.Proqualify |
| 11 | salarychgDoc | 定薪信息 | hred.hrcandidate.SalarychgDoc |
| 12 | sybx01List | - | hred.hrcandidate.sybx01 |
| 13 | writtenExamination | 笔试信息 | hred.hrcandidate.WrittenExamination |
| 14 | protocol | 协议信息 | hred.hrcandidate.Protocol |
| 15 | probation | 试用信息 | hred.hrcandidate.Probation |
| 16 | evaluationMessage | 测评信息 | hred.hrcandidate.EvaluationMessage |
| 17 | dotline | 虚线上级 | hred.hrcandidate.Dotline |
| 18 | globalInfoUSA | 美国全球化个人信息 | hred.hrcandidate.GlobalInfoUSA |
| 19 | testlqlList | - | hred.hrcandidate.testlql |
| 20 | yy003List | - | hred.hrcandidate.yy003 |
| 21 | ctrt | 合同信息 | hred.hrcandidate.Ctrt |
| 22 | socialInsurance | 社保增员 | hred.hrcandidate.SocialInsurance |
| 23 | train | 培训信息 | hred.hrcandidate.Train |
| 24 | reward | 奖励信息 | hred.hrcandidate.Reward |
| 25 | resume | 履历信息 | hred.hrcandidate.Resume |
| 26 | hmk01List | - | hred.hrcandidate.hmk01 |
| 27 | address | 地址信息 | hred.hrcandidate.Address |
| 28 | cs1List | - | hred.hrcandidate.cs1 |
| 29 | globalInfoIND | 印度全球化个人信息 | hred.hrcandidate.GlobalInfoIND |
| 30 | globalInfoMAS | 马来西亚全球化个人信息 | hred.hrcandidate.GlobalInfoMAS |
| 31 | langAbility | 语言能力 | hred.hrcandidate.LangAbility |
| 32 | shsy2025List | - | hred.hrcandidate.shsy2025 |
| 33 | m0001List | - | hred.hrcandidate.m0001 |
| 34 | globalInfoSIN | 新加坡全球化个人信息 | hred.hrcandidate.GlobalInfoSIN |
| 35 | hi_psndoc_glbdef14List | - | hred.hrcandidate.hi_psndoc_glbdef14 |
| 36 | globalInfoCHN | 中国大陆全球化个人信息 | hred.hrcandidate.GlobalInfoCHN |
| 37 | socialRel | 社会关系 | hred.hrcandidate.SocialRel |
| 38 | orgRel | 工作关系 | hred.hrcandidate.OrgRel |
| 39 | globalInfoHK | 香港全球化个人信息 | hred.hrcandidate.GlobalInfoHK |
| 40 | edu | 教育信息 | hred.hrcandidate.Edu |
| 41 | globalInfo | 全球化个人信息 | hred.hrcandidate.GlobalInfo |
| 42 | techPost | 专业技术职务 | hred.hrcandidate.TechPost |
| 43 | candidateJob | 候选人任职信息 | hred.hrcandidate.CandidateJob |
| 44 | interview | 面试轮次 | hred.hrcandidate.Interview |
| 45 | aaa000List | - | hred.hrcandidate.aaa000 |

---

## Enum Value Details

### 性别 (sex) -> sex
> Enum: hred.staff.sexEnum

| code | value | name |
|------|-------|------|
| 0 | 0 | 未知 |
| 1 | 1 | 男 |
| 2 | 2 | 女 |

### 工龄调整方式 (workAgeAdjType) -> workage_adj_type
> Enum: hred.staff.workAgeAdjustType

| code | value | name |
|------|-------|------|
| 0 | 0 | 减少 |
| 1 | 1 | 增加 |

### 来源渠道 (candidateSource) -> candidate_source
> Enum: hred.hrcandidate.CandidateSource

| code | value | name |
|------|-------|------|
| 1 | 1 | 入职服务中心 |
| 2 | 2 | 扫码入职 |
| 3 | 3 | Offer管理中心 |
| 4 | 4 | 新增候选人 |
| 5 | 5 | 其他 |

### 人员状态 (enable) -> enable
> Enum: hred.staff.enable

| code | value | name |
|------|-------|------|
| 0 | 0 | 初始态 |
| 1 | 1 | 在职 |
| 2 | 2 | 非在职 |
