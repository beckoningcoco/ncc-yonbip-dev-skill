---
tags: [BIP, metadata, hrxc, WaSalaryApplyDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 定调薪申请明细表 (hrxc.salaryApply.WaSalaryApplyDetail)

> Platform: BIP V5 | Table: wa_salary_apply_detail | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 定调薪申请明细表 |
| uri | hrxc.salaryApply.WaSalaryApplyDetail |
| tableName | wa_salary_apply_detail |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 3 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 4 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |

---

## All Fields (62)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | applyBill | 定调薪申请单主表主键 | APPLY_BILL_ID | quote | hrxc.salaryApply.WaSalaryApplyBill |  |  | nullable |
| 2 | staff | 员工ID | STAFF_ID | quote | hred.staff.Staff |  |  | dataAuth,data_auth,nullable |
| 3 | staffJobId | 任职id | STAFF_JOB_ID | quote | hred.staff.StaffJob |  |  | nullable |
| 4 | preFrequency | 原薪资频率 | PRE_FREQUENCY_ID | quote | hrcb.common-ref.FrequencyVO |  |  | nullable |
| 5 | applyFrequency | 申请频率 | APPLY_FREQUENCY_ID | quote | hrcb.common-ref.FrequencyVO |  |  | nullable |
| 6 | approveFrequency | 审批频率 | APPROVE_FREQUENCY_ID | quote | hrcb.common-ref.FrequencyVO |  |  | nullable |
| 7 | isStopSalary | 停薪 | IS_STOP_SALARY | int | Integer |  |  | nullable |
| 8 | applySource | 申请薪资来源:0-申请单 1-档案  2-录用单 | APPLY_SOURCE | int | Integer |  |  | nullable |
| 9 | approveSource | 审批薪资来源:0-申请单 1-档案  2-录用单 | APPROVE_SOURCE | int | Integer |  |  | nullable |
| 10 | preSource | 原薪资来源:0-申请单 1-档案  2-录用单 | PRE_SOURCE | int | Integer |  |  | nullable |
| 11 | applyProbationSalary | 申请薪资是否试用期工资 0-否 1-是 | APPLY_PROBATION_SALARY | int | Integer |  |  | nullable |
| 12 | approveProbationSalary | 审批薪资是否试用期工资 0-否 1-是 | APPROVE_PROBATION_SALARY | int | Integer |  |  | nullable |
| 13 | preProbationSalary | 原薪资是否试用期工资 0-否 1-是:0-申请单 1-档案  2-录用单 | PRE_PROBATION_SALARY | int | Integer |  |  | nullable |
| 14 | applyProbationSalaryRatio | 申请薪资试用期比例 | APPLY_PROBATION_SALARY_RATIO | int | Integer |  |  | nullable |
| 15 | approveProbationSalaryRatio | 审批薪资试用期比例 | APPROVE_PROBATION_SALARY_RATIO | int | Integer |  |  | nullable |
| 16 | preProbationSalaryRatio | 原薪资试用期比例 | PRE_PROBATION_SALARY_RATIO | int | Integer |  |  | nullable |
| 17 | applyFullSalary | 申请薪资转正工资 | APPLY_FULL_SALARY | number | Decimal |  |  | nullable |
| 18 | approveFullSalary | 审批薪资转正工资 | APPROVE_FULL_SALARY | number | Decimal |  |  | nullable |
| 19 | preFullSalary | 原薪资转正工资 | PRE_FULL_SALARY | number | Decimal |  |  | nullable |
| 20 | extension | 定调薪申请明细表特征组实体 | extension | UserDefine | hrxc.salaryApply.WaSalaryApplyDetailCharacteristics |  |  | nullable |
| 21 | applyPlanBill | 薪酬计划申请主键 | apply_plan_bill_id | quote | hrxc.salaryApply.WaSalaryApplyPlanBill |  |  | nullable |
| 22 | preSalaryPlanId | 原薪资计划 | pre_salary_plan_id | quote | hrxc.salaryplans.SalaryPlan |  |  | nullable |
| 23 | applySalaryPlanId | 调整后薪资计划 | apply_salary_plan_id | quote | hrxc.salaryplans.SalaryPlan |  |  | nullable |
| 24 | approveSalaryPlanId | 审批薪资计划 | approve_salary_plan_id | quote | hrxc.salaryplans.SalaryPlan |  |  | nullable |
| 25 | org | 任职组织 | ORG_ID | quote | org.func.BaseOrg |  |  | isMasterOrg,nullable |
| 26 | dept | 部门ID | DEPT_ID | quote | bd.adminOrg.AdminOrgVO |  |  | dataAuth,data_auth,nullable |
| 27 | orgvid | 任职组织 | ORG_VID | quote | org.func.BaseOrgTimeline |  |  | nullable |
| 28 | deptvid | 部门ID | DEPT_VID | quote | bd.adminOrg.AdminOrgVOTimeline |  |  | nullable |
| 29 | salaryItem | 薪资项目ID | SALARY_ITEM_ID | quote | hrxc.publicItem.WaItem |  |  | nullable |
| 30 | isMainJob | 兼职 | ismainjob | int | Integer |  |  | nullable |
| 31 | effectiveDate | 生效日期 | EFFECTIVE_DATE | date | Date |  |  | nullable |
| 32 | preGradeVersion | 原薪资标准版本ID | PRE_GRADE_VERSION_ID | quote | hrxc.grade.WaGradeVersion |  |  | nullable |
| 33 | preNegotiation | 原谈判工资 | PRE_NEGOTIATION | int | Integer |  |  | nullable |
| 34 | preSalaryStandardType | 原薪资标准类别ID | PRE_SALARY_STANDARD_TYPE | quote | hrxc.grade.WaGrade |  |  | nullable |
| 35 | preSalaryStandard | 原薪资标准ID | PRE_SALARY_STANDARD | quote | hrxc.grade.WaGradeCriterion |  |  | nullable |
| 36 | preSalaryLevelSum | 原标准金额 | PRE_SALARY_LEVEL_SUM | text | String |  |  | nullable |
| 37 | preSalary | 原发薪金额 | PRE_SALARY | number | Decimal |  |  | nullable |
| 38 | applyNegotiation | 谈判工资 | APPLY_NEGOTIATION | int | Integer |  |  | nullable |
| 39 | applySalaryStandardType | 薪资标准类别ID | APPLY_SALARY_STANDARD_TYPE | quote | hrxc.grade.WaGrade |  |  | nullable |
| 40 | applyGradeVersion | 申请薪资标准版本ID | APPLY_GRADE_VERSION_ID | quote | hrxc.grade.WaGradeVersion |  |  | nullable |
| 41 | applySalaryStandard | 薪资标准 | APPLY_SALARY_STANDARD | quote | hrxc.grade.WaGradeCriterion |  |  | nullable |
| 42 | applySalaryLevelSum | 标准金额 | APPLY_SALARY_LEVEL_SUM | text | String |  |  | nullable |
| 43 | applySalary | 发薪金额 | APPLY_SALARY | number | Decimal |  |  | nullable |
| 44 | changeReason | 变动原因 | CHANGE_REASON | text | String |  |  | nullable |
| 45 | approveNegotiation | 审批谈判工资 | APPROVE_NEGOTIATION | int | Integer |  |  | nullable |
| 46 | approveSalaryStandardType | 审批薪资标准类别ID | APPROVE_SALARY_STANDARD_TYPE | quote | hrxc.grade.WaGrade |  |  | nullable |
| 47 | approveSalaryStandard | 审批薪资标准 | APPROVE_SALARY_STANDARD | quote | hrxc.grade.WaGradeCriterion |  |  | nullable |
| 48 | approveSalaryLevelSum | 审批标准金额 | APPROVE_SALARY_LEVEL_SUM | text | String |  |  | nullable |
| 49 | approveSalary | 审批发薪金额 | APPROVE_SALARY | number | Decimal |  |  | nullable |
| 50 | approveGradeVersion | 审批申请薪资标准版本ID | APPROVE_GRADE_VERSION_ID | quote | hrxc.grade.WaGradeVersion |  |  | nullable |
| 51 | salaryApplyNoSumFlag | 定调薪申请不汇总标识 | salary_apply_no_sum_flag | int | Integer |  |  | nullable |
| 52 | id | ID | ID | text | String |  |  | nullable,uiHide,REF.ID |
| 53 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 54 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 55 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 56 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 57 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 58 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 59 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 60 | tenant | 租户主键(旧) | TENANTID | text | String |  | Y | nullable,uiHide |
| 61 | isPrePlan | 是否为原薪资计划 | is_prePlan | int | Integer |  |  | nullable |
| 62 | isRelatedSalaryStandard | 是否关联薪资标准表 | is_related_salaryStandard | int | Integer |  |  | nullable |

---

## Reference Fields (27)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | applyBill | 定调薪申请单主表主键 | APPLY_BILL_ID | hrxc.salaryApply.WaSalaryApplyBill |
| 2 | staff | 员工ID | STAFF_ID | hred.staff.Staff |
| 3 | staffJobId | 任职id | STAFF_JOB_ID | hred.staff.StaffJob |
| 4 | preFrequency | 原薪资频率 | PRE_FREQUENCY_ID | hrcb.common-ref.FrequencyVO |
| 5 | applyFrequency | 申请频率 | APPLY_FREQUENCY_ID | hrcb.common-ref.FrequencyVO |
| 6 | approveFrequency | 审批频率 | APPROVE_FREQUENCY_ID | hrcb.common-ref.FrequencyVO |
| 7 | applyPlanBill | 薪酬计划申请主键 | apply_plan_bill_id | hrxc.salaryApply.WaSalaryApplyPlanBill |
| 8 | preSalaryPlanId | 原薪资计划 | pre_salary_plan_id | hrxc.salaryplans.SalaryPlan |
| 9 | applySalaryPlanId | 调整后薪资计划 | apply_salary_plan_id | hrxc.salaryplans.SalaryPlan |
| 10 | approveSalaryPlanId | 审批薪资计划 | approve_salary_plan_id | hrxc.salaryplans.SalaryPlan |
| 11 | org | 任职组织 | ORG_ID | org.func.BaseOrg |
| 12 | dept | 部门ID | DEPT_ID | bd.adminOrg.AdminOrgVO |
| 13 | orgvid | 任职组织 | ORG_VID | org.func.BaseOrgTimeline |
| 14 | deptvid | 部门ID | DEPT_VID | bd.adminOrg.AdminOrgVOTimeline |
| 15 | salaryItem | 薪资项目ID | SALARY_ITEM_ID | hrxc.publicItem.WaItem |
| 16 | preGradeVersion | 原薪资标准版本ID | PRE_GRADE_VERSION_ID | hrxc.grade.WaGradeVersion |
| 17 | preSalaryStandardType | 原薪资标准类别ID | PRE_SALARY_STANDARD_TYPE | hrxc.grade.WaGrade |
| 18 | preSalaryStandard | 原薪资标准ID | PRE_SALARY_STANDARD | hrxc.grade.WaGradeCriterion |
| 19 | applySalaryStandardType | 薪资标准类别ID | APPLY_SALARY_STANDARD_TYPE | hrxc.grade.WaGrade |
| 20 | applyGradeVersion | 申请薪资标准版本ID | APPLY_GRADE_VERSION_ID | hrxc.grade.WaGradeVersion |
| 21 | applySalaryStandard | 薪资标准 | APPLY_SALARY_STANDARD | hrxc.grade.WaGradeCriterion |
| 22 | approveSalaryStandardType | 审批薪资标准类别ID | APPROVE_SALARY_STANDARD_TYPE | hrxc.grade.WaGrade |
| 23 | approveSalaryStandard | 审批薪资标准 | APPROVE_SALARY_STANDARD | hrxc.grade.WaGradeCriterion |
| 24 | approveGradeVersion | 审批申请薪资标准版本ID | APPROVE_GRADE_VERSION_ID | hrxc.grade.WaGradeVersion |
| 25 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 26 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 27 | modifier | 修改人 | MODIFIER | hred.staff.Staff |
