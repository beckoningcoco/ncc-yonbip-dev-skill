---
tags: [BIP, metadata, hred, StaffBaseinfoModify]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 基本信息变更单 (hred.staffmodify.StaffBaseinfoModify)

> Platform: BIP V5 | Table: bd_staff_baseinfo_modify | Schema: hrcloud-staff-mgr

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 基本信息变更单 |
| uri | hred.staffmodify.StaffBaseinfoModify |
| tableName | bd_staff_baseinfo_modify |
| domain | hrcloud-staff-mgr |
| applicationCode | HRED |
| superUri | hred.staff.Staff |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (1)

| # | Name | URI |
|---|------|-----|
| 1 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |

---

## All Fields (177)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | id | 手工码 | id | text | String |  |  | jointUnique,nullable,uiHide,dataAuth,REF.ID |
| 2 | createTime | 变更日期 | creationtime | timestamp | Timestamp |  |  | nullable |
| 3 | ytenant | 租户 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 4 | verifystate | 审核状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 5 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 6 | attachIdList | 附件ID列表 | attach_id_list | attachment | String |  |  | nullable |
| 7 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 8 | staffDefines | 新版自定义 | staff_define | UserDefine | hred.staffmodify.StaffTZDefines |  |  | nullable |
| 9 | originTzId | 原始特征id | origin_tz_id | text | String |  |  | nullable |
| 10 | approvalAttachments | 审批附件 | approval_attachments | attachment | String |  |  | nullable |
| 11 | formerName | 曾用名 | former_name | text | String |  |  | nullable |
| 12 | currentJob | 当前任职 | current_job | quote | hred.staff.StaffJob |  |  | nullable |
| 13 | postId | 岗位 | post_id | quote | bd.duty.Position |  |  | nullable |
| 14 | snapshotId | 变更前快照 | snapshot_id | text | String |  |  | nullable |
| 15 | billState | 领域单据状态 | bill_state | short | Short |  |  | nullable |
| 16 | yTenantId | 租户ID | ytenant_id | text | String |  |  | nullable,uiHide |
| 17 | workAgeAdjYea | 调整工龄(年数) | workage_adj_yea | int | Integer |  |  | nullable |
| 18 | workAgeAdjMon | 调整工龄(月数) | workage_adj_mon | int | Integer |  |  | nullable |
| 19 | workAgeAdjDay | 调整工龄(天数) | workage_adj_day | int | Integer |  |  | nullable |
| 20 | workAgeAdjType | 工龄调整方式 | workage_adj_type | singleOption | hred.staff.workAgeAdjustType |  |  | nullable |
| 21 | lastUser | 上次关联用户 | last_user | quote | base.user.BipUser |  |  | nullable |
| 22 | isOnlyChild | 独生子女 | is_only_child | switch | Boolean |  |  | nullable |
| 23 | ts | 更新时间 | ts | date | Date |  |  | nullable |
| 24 | retireAdjMon | 退休调整值(月) | retire_adj_mon | int | Integer |  |  | nullable |
| 25 | jobGradeId | 职级 | jobgrade_id | quote | bd.duty.Rank |  |  | nullable |
| 26 | isOuterStaff | 是否外部人员 | is_outer_staff | int | Integer |  |  | nullable,uiHide |
| 27 | addrId | 工作地点 | addr_id | quote | hrcm.location.Location |  |  | nullable |
| 28 | iscadre | 干部 | iscadre | switch | Boolean |  |  | nullable |
| 29 | cadreType | 干部分类 | cadre_type | quote | hred.cadreType.CadreType |  |  | nullable |
| 30 | cadresShoworder | 干部人员排序 | cadres_showorder | int | Integer |  |  | nullable |
| 31 | secretId | 员工密级 | secret_id | quote | sys.secret.UserSecretObj |  |  | nullable |
| 32 | objid | nc主键 | objid | text | String |  |  | nullable |
| 33 | manageOrg | 管理单位 | manage_org | quote | org.func.AdminOrg |  |  | nullable |
| 34 | rejectionreason | 最新驳回原因 | rejection_reason | text | String |  |  | nullable |
| 35 | collectionstatus | 采集状态 | collection_status | text | String |  |  | nullable |
| 36 | rejectiontimes | 驳回次数 | rejection_times | short | Short |  |  | nullable |
| 37 | candidateFlag | 候选人标识 | candidate_flag | switch | Boolean |  |  | nullable,uiHide |
| 38 | wagegroup | 薪资组 | wagegroup | quote | hrxc.mddGroupDoc.waGroupDoc |  |  | dataAuth,data_auth,nullable |
| 39 | delayedRetDate | 预计退休日期 | delayed_ret_date | date | Date |  |  | nullable |
| 40 | dataCreateSource | 新增来源 | data_create_source | text | String |  |  | deactivated,nullable |
| 41 | dataCreateBillid | 新增来源单据id | data_create_billid | text | String |  |  | deactivated,nullable |
| 42 | englishName | 英文名 | english_name | text | String |  |  | nullable |
| 43 | documentValidity | 证件有效期 | document_validity | date | Date |  |  | nullable |
| 44 | postcode | 邮政编码 | postcode | text | String |  |  | nullable |
| 45 | height | 身高 | height | number | Decimal |  |  | nullable |
| 46 | weight | 体重 | weight | number | Decimal |  |  | nullable |
| 47 | religion | 宗教信仰 | religion | quote | hred.religion.Religion |  |  | nullable |
| 48 | hobby | 特长爱好 | hobby | text | String |  |  | nullable |
| 49 | birthPlace | 出生地 | birth_place | quote | bd.region.BaseRegionVO |  |  | nullable |
| 50 | iicBillId | 采集通知id | iic_bill_id | text | String |  |  | nullable |
| 51 | joinedDate | 入职日期 | joined_date | date | Date |  |  | nullable |
| 52 | departDate | 离职日期 | depart_date | date | Date |  |  | nullable |
| 53 | jobRankId | 职等 | jobrank_id | quote | bd.duty.Grade |  |  | nullable |
| 54 | nameDefines | 姓名扩展 | name_define | quote | hred.staffmodify.StaffNameModify |  |  | nullable |
| 55 | idCardFront | 身份证国徽面 | id_card_front | image | String |  |  | nullable |
| 56 | idCardReverse | 身份证人像面 | id_card_reverse | image | String |  |  | nullable |
| 57 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 58 | extension | 扩展字段 | jsonextattr | text | String |  |  | nullable |
| 59 | sysId | 系统标识 | sysid | text | String |  |  | nullable |
| 60 | workAge | 工龄 | work_age | number | Decimal |  |  | nullable |
| 61 | proceState | 流程中状态 | proce_state | text | String |  |  | nullable |
| 62 | modifyMaxSecretLevel | 单据子集最高密级 | modify_max_secret_level | quote | sys.secret.SecretModel |  |  | nullable |
| 63 | sourceBill | 来源单据 | source_bill | text | String |  |  | nullable |
| 64 | age | 年龄 | age | int | Integer |  |  | nullable |
| 65 | modifyTime | 修改日期 | modifiedtime | timestamp | Timestamp |  |  | nullable |
| 66 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 67 | photo | 头像 | photo | image | String |  |  | nullable |
| 68 | code | 单据编码 | code | text | String |  |  | REF.CODE,CODE,nullable,isCode |
| 69 | status | 单据状态 | status | short | Short |  |  | nullable |
| 70 | staffCode | 编码 | staff_code | text | String |  |  | nullable,uiHide |
| 71 | name | 姓名 | name | text | String |  |  | isName,nullable |
| 72 | firstName | 姓 | first_name | text | String |  |  | nullable |
| 73 | middleName | 中间名 | middle_name | text | String |  |  | nullable |
| 74 | lastName | 名 | last_name | text | String |  |  | nullable |
| 75 | certType | 证件类型id | cert_type | quote | bd.IDtype.IDTypeVO |  |  | nullable |
| 76 | certNo | 证件号 | cert_no | text | String |  |  | nullable |
| 77 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 78 | sex | 性别 | sex | singleOption | hred.staff.sexEnum |  |  | nullable |
| 79 | birthDate | 出生日期 | birthdate | date | Date |  |  | nullable |
| 80 | mobile | 手机号 | mobile | text | String |  |  | nullable |
| 81 | officeTel | 办公电话 | officetel | tel | String |  |  | nullable |
| 82 | email | 邮箱 | email | mail | String |  |  | nullable |
| 83 | selfEmail | 个人邮箱 | selfemail | mail | String |  |  | nullable |
| 84 | joinWorkDate | 参加工作日期 | joinworkDate | date | Date |  |  | nullable |
| 85 | linkAddr | 通讯地址 | linkaddr | text | String |  |  | nullable |
| 86 | education | 学历ID | education | quote | hred.education.Education |  |  | nullable |
| 87 | degree | 学位ID | degree | quote | hred.degreefiles.Degreefiles |  |  | nullable |
| 88 | marital | 婚姻状况ID | marital | quote | bd.customerdoc_0003.0003 |  |  | nullable |
| 89 | bloodType | 血型ID | bloodtype | quote | socialmdm.social.BloodType |  |  | nullable |
| 90 | characterrpr | 户口性质ID | characterrpr | quote | socialmdm.social.HouseholdType |  |  | nullable |
| 91 | permanreside | 户口所在地ID | permanreside | quote | bd.region.BaseRegionVO |  |  | nullable |
| 92 | political | 政治面貌ID | political | quote | bd.customerdoc_0004.0004 |  |  | nullable |
| 93 | joinPolityDate | 加入党团时间 | joinpolitydate | date | Date |  |  | nullable |
| 94 | nationality | 民族ID | nationality | quote | socialmdm.social.Nation |  |  | nullable |
| 95 | country | 国籍地区ID | country | quote | bd.country.CountryVO |  |  | nullable |
| 96 | origin | 籍贯ID | origin | quote | bd.region.BaseRegionVO |  |  | nullable |
| 97 | qq | QQ | qq | text | String |  |  | nullable |
| 98 | weiXin | 微信 | weixin | text | String |  |  | nullable |
| 99 | linkedIn | 领英 | linkedin | text | String |  |  | nullable |
| 100 | bizManTag | 业务员 | biz_man_tag | switch | Boolean |  |  | nullable |
| 101 | shopAssisTag | 是否店员 | shop_assis_tag | switch | Boolean |  |  | nullable |
| 102 | orgId | 公司 | org_id | quote | org.func.AdminOrg |  |  | nullable,uiHide |
| 103 | enable | 人员状态 | enable | singleOption | hred.staff.enable |  |  | nullable |
| 104 | userId | 关联用户 | user_id | quote | base.user.BipUser |  |  | nullable |
| 105 | shortName | 姓名简拼 | shortname | text | String |  |  | nullable |
| 106 | tenant | 租户ID | tenantid | text | String |  | Y | nullable,uiHide |
| 107 | majorcorpid | 合同主体单位 | majorcorpid | quote | hrcm.contractentity.ContractEntity |  |  | nullable |
| 108 | psnclId | 员工类别 | psncl_id | quote | bd.staff.PsnlCatg |  |  | data_auth,nullable,uiAssign |
| 109 | deptId | 部门 | dept_id | quote | org.func.AdminOrg |  |  | data_auth,nullable,uiHide |
| 110 | unitId | 组织 | unit_id | quote | org.func.AdminOrg |  |  | isMasterOrg,nullable |
| 111 | billTypeId | 单据类型ID | bill_type_id | quote | bd.bill.BillTypeVO |  |  | nullable |
| 112 | originId | 变更来源 | origin_id | text | String |  |  | nullable |
| 113 | operStatus | 操作类型 | oper_status | text | String |  |  | nullable |
| 114 | billTypeCode | 单据类型编码 | bill_type_code | text | String |  |  | nullable |
| 115 | transiTypeId | 交易类型ID | transi_type_id | quote | bd.bill.TransType |  |  | isTransactionType,nullable |
| 116 | transiTypeCode | 交易类型编码 | transi_type_code | text | String |  |  | nullable |
| 117 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 118 | staffId | 员工信息ID | staff_id | quote | hred.staff.Staff |  |  | data_auth,nullable |
| 119 | attachlist | 附件 | attachlist | attachment | String |  |  | nullable |
| 120 | aaa000List |  | - | - | hred.staffmodify.aaa000 |  |  |  |
| 121 | abc0000List |  | - | - | hred.staffmodify.abc0000 |  |  |  |
| 122 | cs1List |  | - | - | hred.staffmodify.cs1 |  |  |  |
| 123 | csList |  | - | - | hred.staffmodify.cs |  |  |  |
| 124 | gj100List |  | - | - | hred.staffmodify.gj100 |  |  |  |
| 125 | hi_psndoc_glbdef14List |  | - | - | hred.staffmodify.hi_psndoc_glbdef14 |  |  |  |
| 126 | hrzd002List |  | - | - | hred.staffmodify.hrzd002 |  |  |  |
| 127 | jkxxList |  | - | - | hred.staffmodify.jkxx |  |  |  |
| 128 | m0001List |  | - | - | hred.staffmodify.m0001 |  |  |  |
| 129 | nameWrittenInEnglish | 名（外文写法） | nameWrittenInEnglish | text | String |  |  |  |
| 130 | salary_informationList |  | - | - | hred.staffmodify.salary_information |  |  |  |
| 131 | shsy2025List |  | - | - | hred.staffmodify.shsy2025 |  |  |  |
| 132 | staffAbroadModify | 因私出国信息变更单 | - | - | hred.staffmodify.StaffAbroadModify |  |  |  |
| 133 | staffAddressModify | 地址信息变更单 | - | - | hred.staffmodify.StaffAddressModify |  |  |  |
| 134 | staffAssModify | 绩效记录变更单 | - | - | hred.staffmodify.StaffAssModify |  |  |  |
| 135 | staffBankacctModify | 银行账户变更单 | - | - | hred.staffmodify.StaffBankacctModify |  |  |  |
| 136 | staffCadreModify | 干部任职信息变更单 | - | - | hred.staffmodify.StaffCadreModify |  |  |  |
| 137 | staffCertModify | 证件信息变更单 | - | - | hred.staffmodify.StaffCertModify |  |  |  |
| 138 | staffCertificateModify | 证书子集变更单 | - | - | hred.staffmodify.StaffCertificateModify |  |  |  |
| 139 | staffCtrtModify | 合同信息变更单 | - | - | hred.staffmodify.StaffCtrtModify |  |  |  |
| 140 | staffDirectiorSupervisorModify | 董监高信息变更单 | - | - | hred.staffmodify.StaffDirectiorSupervisorModify |  |  |  |
| 141 | staffDotlineModify | 虚线上级变更单 | - | - | hred.staffmodify.StaffDotlineModify |  |  |  |
| 142 | staffEduModify | 教育信息变更单 | - | - | hred.staffmodify.StaffEduModify |  |  |  |
| 143 | staffGlobalInfoModify | 全球化个人信息 | - | - | hred.staffmodify.StaffGlobalInfoModify |  |  |  |
| 144 | staffGlobalInfoModifyCHN | 中国大陆全球化个人信息 | - | - | hred.staffmodify.StaffGlobalInfoModifyCHN |  |  |  |
| 145 | staffGlobalInfoModifyGBR | 英国全球化个人信息 | - | - | hred.staffmodify.StaffGlobalInfoModifyGBR |  |  |  |
| 146 | staffGlobalInfoModifyHK | 香港全球化个人信息 | - | - | hred.staffmodify.StaffGlobalInfoModifyHK |  |  |  |
| 147 | staffGlobalInfoModifyIND | 印度全球化个人信息 | - | - | hred.staffmodify.StaffGlobalInfoModifyIND |  |  |  |
| 148 | staffGlobalInfoModifyMAS | 马来西亚全球化个人信息 | - | - | hred.staffmodify.StaffGlobalInfoModifyMAS |  |  |  |
| 149 | staffGlobalInfoModifySIN | 新加坡全球化个人信息 | - | - | hred.staffmodify.StaffGlobalInfoModifySIN |  |  |  |
| 150 | staffGlobalInfoModifyUSA | 美国全球化个人信息 | - | - | hred.staffmodify.StaffGlobalInfoModifyUSA |  |  |  |
| 151 | staffHealthSituationModify | 健康信息变更单 | - | - | hred.staffmodify.StaffHealthSituationModify |  |  |  |
| 152 | staffIr56Modify | IR56信息变更单 | - | - | hred.staffmodify.StaffIr56Modify |  |  |  |
| 153 | staffJobModify | 任职信息变更单 | - | - | hred.staffmodify.StaffJobModify |  |  |  |
| 154 | staffLangabilityModify | 语言能力变更单 | - | - | hred.staffmodify.StaffLangabilityModify |  |  |  |
| 155 | staffLeadershipTradeModify | 党组/工会信息变更单 | - | - | hred.staffmodify.StaffLeadershipTradeModify |  |  |  |
| 156 | staffNameModify | 姓名变更单 | - | - | hred.staffmodify.StaffNameModify |  |  |  |
| 157 | staffOrgrelModify | 工作关系变更单 | - | - | hred.staffmodify.StaffOrgrelModify |  |  |  |
| 158 | staffPoliticalOutlookModify | 政治面貌变更单 | - | - | hred.staffmodify.StaffPoliticalOutlookModify |  |  |  |
| 159 | staffProbationModify | 试用信息变更单 | - | - | hred.staffmodify.StaffProbationModify |  |  |  |
| 160 | staffProjectJobModify | 项目任职信息变更单 | - | - | hred.staffmodify.StaffProjectJobModify |  |  |  |
| 161 | staffProqualifyModify | 职业资格变更单 | - | - | hred.staffmodify.StaffProqualifyModify |  |  |  |
| 162 | staffProtocolModify | 协议信息变更单 | - | - | hred.staffmodify.StaffProtocolModify |  |  |  |
| 163 | staffPtJobModify | 其他任职信息变更单 | - | - | hred.staffmodify.StaffPtJobModify |  |  |  |
| 164 | staffPunishmentModify | 惩处信息变更单 | - | - | hred.staffmodify.StaffPunishmentModify |  |  |  |
| 165 | staffResumeModify | 履历信息变更单 | - | - | hred.staffmodify.StaffResumeModify |  |  |  |
| 166 | staffRewardModify | 奖励情况变更单 | - | - | hred.staffmodify.StaffRewardModify |  |  |  |
| 167 | staffSocialrelModify | 社会关系变更单 | - | - | hred.staffmodify.StaffSocialrelModify |  |  |  |
| 168 | staffSocietyEmploymentModify | 社会任职信息变更单 | - | - | hred.staffmodify.StaffSocietyEmploymentModify |  |  |  |
| 169 | staffTechpostModify | 专业技术职务变更单 | - | - | hred.staffmodify.StaffTechpostModify |  |  |  |
| 170 | staffTitleModify | 职称记录变更单 | - | - | hred.staffmodify.StaffTitleModify |  |  |  |
| 171 | staffTrainModify | 培训记录变更单 | - | - | hred.staffmodify.StaffTrainModify |  |  |  |
| 172 | staffTrialEvaluationModify | 试用考核结果变更单 | - | - | hred.staffmodify.StaffTrialEvaluationModify |  |  |  |
| 173 | staffVODefine | 变更单基本信息自定义项表 | - | - | hred.staffmodify.StaffBaseinfoModifyDefine |  |  |  |
| 174 | surnameWrittenInEnglish | 姓（外文写法） | surnameWrittenInEnglish | text | String |  |  |  |
| 175 | sybx01List |  | - | - | hred.staffmodify.sybx01 |  |  |  |
| 176 | testlqlList |  | - | - | hred.staffmodify.testlql |  |  |  |
| 177 | yy003List |  | - | - | hred.staffmodify.yy003 |  |  |  |

---

## Reference Fields (37)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ytenant | 租户 | ytenant_id | yht.tenant.YhtTenant |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | currentJob | 当前任职 | current_job | hred.staff.StaffJob |
| 4 | postId | 岗位 | post_id | bd.duty.Position |
| 5 | lastUser | 上次关联用户 | last_user | base.user.BipUser |
| 6 | jobGradeId | 职级 | jobgrade_id | bd.duty.Rank |
| 7 | addrId | 工作地点 | addr_id | hrcm.location.Location |
| 8 | cadreType | 干部分类 | cadre_type | hred.cadreType.CadreType |
| 9 | secretId | 员工密级 | secret_id | sys.secret.UserSecretObj |
| 10 | manageOrg | 管理单位 | manage_org | org.func.AdminOrg |
| 11 | wagegroup | 薪资组 | wagegroup | hrxc.mddGroupDoc.waGroupDoc |
| 12 | religion | 宗教信仰 | religion | hred.religion.Religion |
| 13 | birthPlace | 出生地 | birth_place | bd.region.BaseRegionVO |
| 14 | jobRankId | 职等 | jobrank_id | bd.duty.Grade |
| 15 | nameDefines | 姓名扩展 | name_define | hred.staffmodify.StaffNameModify |
| 16 | modifyMaxSecretLevel | 单据子集最高密级 | modify_max_secret_level | sys.secret.SecretModel |
| 17 | modifier | 修改人 | modifier | base.user.BipUser |
| 18 | certType | 证件类型id | cert_type | bd.IDtype.IDTypeVO |
| 19 | education | 学历ID | education | hred.education.Education |
| 20 | degree | 学位ID | degree | hred.degreefiles.Degreefiles |
| 21 | marital | 婚姻状况ID | marital | bd.customerdoc_0003.0003 |
| 22 | bloodType | 血型ID | bloodtype | socialmdm.social.BloodType |
| 23 | characterrpr | 户口性质ID | characterrpr | socialmdm.social.HouseholdType |
| 24 | permanreside | 户口所在地ID | permanreside | bd.region.BaseRegionVO |
| 25 | political | 政治面貌ID | political | bd.customerdoc_0004.0004 |
| 26 | nationality | 民族ID | nationality | socialmdm.social.Nation |
| 27 | country | 国籍地区ID | country | bd.country.CountryVO |
| 28 | origin | 籍贯ID | origin | bd.region.BaseRegionVO |
| 29 | orgId | 公司 | org_id | org.func.AdminOrg |
| 30 | userId | 关联用户 | user_id | base.user.BipUser |
| 31 | majorcorpid | 合同主体单位 | majorcorpid | hrcm.contractentity.ContractEntity |
| 32 | psnclId | 员工类别 | psncl_id | bd.staff.PsnlCatg |
| 33 | deptId | 部门 | dept_id | org.func.AdminOrg |
| 34 | unitId | 组织 | unit_id | org.func.AdminOrg |
| 35 | billTypeId | 单据类型ID | bill_type_id | bd.bill.BillTypeVO |
| 36 | transiTypeId | 交易类型ID | transi_type_id | bd.bill.TransType |
| 37 | staffId | 员工信息ID | staff_id | hred.staff.Staff |

---

## Enum Fields (3)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | workAgeAdjType | 工龄调整方式 | workage_adj_type | hred.staff.workAgeAdjustType |
| 2 | sex | 性别 | sex | hred.staff.sexEnum |
| 3 | enable | 人员状态 | enable | hred.staff.enable |

---

## Child Tables (56)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | staffIr56Modify | IR56信息变更单 | hred.staffmodify.StaffIr56Modify |
| 2 | staffTechpostModify | 专业技术职务变更单 | hred.staffmodify.StaffTechpostModify |
| 3 | staffGlobalInfoModifyCHN | 中国大陆全球化个人信息 | hred.staffmodify.StaffGlobalInfoModifyCHN |
| 4 | staffProqualifyModify | 职业资格变更单 | hred.staffmodify.StaffProqualifyModify |
| 5 | staffDotlineModify | 虚线上级变更单 | hred.staffmodify.StaffDotlineModify |
| 6 | staffLeadershipTradeModify | 党组/工会信息变更单 | hred.staffmodify.StaffLeadershipTradeModify |
| 7 | staffCertificateModify | 证书子集变更单 | hred.staffmodify.StaffCertificateModify |
| 8 | staffEduModify | 教育信息变更单 | hred.staffmodify.StaffEduModify |
| 9 | staffProjectJobModify | 项目任职信息变更单 | hred.staffmodify.StaffProjectJobModify |
| 10 | salary_informationList | - | hred.staffmodify.salary_information |
| 11 | testlqlList | - | hred.staffmodify.testlql |
| 12 | staffHealthSituationModify | 健康信息变更单 | hred.staffmodify.StaffHealthSituationModify |
| 13 | staffTitleModify | 职称记录变更单 | hred.staffmodify.StaffTitleModify |
| 14 | hrzd002List | - | hred.staffmodify.hrzd002 |
| 15 | yy003List | - | hred.staffmodify.yy003 |
| 16 | staffDirectiorSupervisorModify | 董监高信息变更单 | hred.staffmodify.StaffDirectiorSupervisorModify |
| 17 | staffTrialEvaluationModify | 试用考核结果变更单 | hred.staffmodify.StaffTrialEvaluationModify |
| 18 | staffJobModify | 任职信息变更单 | hred.staffmodify.StaffJobModify |
| 19 | staffGlobalInfoModifyHK | 香港全球化个人信息 | hred.staffmodify.StaffGlobalInfoModifyHK |
| 20 | shsy2025List | - | hred.staffmodify.shsy2025 |
| 21 | staffGlobalInfoModify | 全球化个人信息 | hred.staffmodify.StaffGlobalInfoModify |
| 22 | staffLangabilityModify | 语言能力变更单 | hred.staffmodify.StaffLangabilityModify |
| 23 | staffCtrtModify | 合同信息变更单 | hred.staffmodify.StaffCtrtModify |
| 24 | staffResumeModify | 履历信息变更单 | hred.staffmodify.StaffResumeModify |
| 25 | staffVODefine | 变更单基本信息自定义项表 | hred.staffmodify.StaffBaseinfoModifyDefine |
| 26 | staffPoliticalOutlookModify | 政治面貌变更单 | hred.staffmodify.StaffPoliticalOutlookModify |
| 27 | staffOrgrelModify | 工作关系变更单 | hred.staffmodify.StaffOrgrelModify |
| 28 | staffCadreModify | 干部任职信息变更单 | hred.staffmodify.StaffCadreModify |
| 29 | staffPunishmentModify | 惩处信息变更单 | hred.staffmodify.StaffPunishmentModify |
| 30 | staffGlobalInfoModifyMAS | 马来西亚全球化个人信息 | hred.staffmodify.StaffGlobalInfoModifyMAS |
| 31 | staffGlobalInfoModifyIND | 印度全球化个人信息 | hred.staffmodify.StaffGlobalInfoModifyIND |
| 32 | jkxxList | - | hred.staffmodify.jkxx |
| 33 | staffBankacctModify | 银行账户变更单 | hred.staffmodify.StaffBankacctModify |
| 34 | staffPtJobModify | 其他任职信息变更单 | hred.staffmodify.StaffPtJobModify |
| 35 | staffAddressModify | 地址信息变更单 | hred.staffmodify.StaffAddressModify |
| 36 | csList | - | hred.staffmodify.cs |
| 37 | staffSocietyEmploymentModify | 社会任职信息变更单 | hred.staffmodify.StaffSocietyEmploymentModify |
| 38 | staffAssModify | 绩效记录变更单 | hred.staffmodify.StaffAssModify |
| 39 | staffAbroadModify | 因私出国信息变更单 | hred.staffmodify.StaffAbroadModify |
| 40 | sybx01List | - | hred.staffmodify.sybx01 |
| 41 | staffGlobalInfoModifySIN | 新加坡全球化个人信息 | hred.staffmodify.StaffGlobalInfoModifySIN |
| 42 | staffCertModify | 证件信息变更单 | hred.staffmodify.StaffCertModify |
| 43 | cs1List | - | hred.staffmodify.cs1 |
| 44 | m0001List | - | hred.staffmodify.m0001 |
| 45 | gj100List | - | hred.staffmodify.gj100 |
| 46 | staffProtocolModify | 协议信息变更单 | hred.staffmodify.StaffProtocolModify |
| 47 | hi_psndoc_glbdef14List | - | hred.staffmodify.hi_psndoc_glbdef14 |
| 48 | staffGlobalInfoModifyUSA | 美国全球化个人信息 | hred.staffmodify.StaffGlobalInfoModifyUSA |
| 49 | staffSocialrelModify | 社会关系变更单 | hred.staffmodify.StaffSocialrelModify |
| 50 | abc0000List | - | hred.staffmodify.abc0000 |
| 51 | staffNameModify | 姓名变更单 | hred.staffmodify.StaffNameModify |
| 52 | staffProbationModify | 试用信息变更单 | hred.staffmodify.StaffProbationModify |
| 53 | staffGlobalInfoModifyGBR | 英国全球化个人信息 | hred.staffmodify.StaffGlobalInfoModifyGBR |
| 54 | staffTrainModify | 培训记录变更单 | hred.staffmodify.StaffTrainModify |
| 55 | aaa000List | - | hred.staffmodify.aaa000 |
| 56 | staffRewardModify | 奖励情况变更单 | hred.staffmodify.StaffRewardModify |

---

## Enum Value Details

### 工龄调整方式 (workAgeAdjType) -> workage_adj_type
> Enum: hred.staff.workAgeAdjustType

| code | value | name |
|------|-------|------|
| 0 | 0 | 减少 |
| 1 | 1 | 增加 |

### 性别 (sex) -> sex
> Enum: hred.staff.sexEnum

| code | value | name |
|------|-------|------|
| 0 | 0 | 未知 |
| 1 | 1 | 男 |
| 2 | 2 | 女 |

### 人员状态 (enable) -> enable
> Enum: hred.staff.enable

| code | value | name |
|------|-------|------|
| 0 | 0 | 初始态 |
| 1 | 1 | 在职 |
| 2 | 2 | 非在职 |
