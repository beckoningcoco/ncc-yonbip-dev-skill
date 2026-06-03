---
tags: [BIP, metadata, hrxc, WaSalaryApplyPlanBill]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 定调薪薪酬计划申请 (hrxc.salaryApply.WaSalaryApplyPlanBill)

> Platform: BIP V5 | Table: wa_salary_apply_plan_bill | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 定调薪薪酬计划申请 |
| uri | hrxc.salaryApply.WaSalaryApplyPlanBill |
| tableName | wa_salary_apply_plan_bill |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |

---

## All Fields (31)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | applyBill | 薪资申请主键 | APPLY_BILL_ID | quote | hrxc.salaryApply.WaSalaryApplyBill |  |  | nullable |
| 2 | preSalaryPlanId | 原薪资计划主键 | pre_salary_plan_id | quote | hrxc.salaryplans.SalaryPlan |  |  | nullable |
| 3 | salaryPlanId | 申请薪资计划主键 | salary_plan_id | quote | hrxc.salaryplans.SalaryPlan |  |  | nullable |
| 4 | staffId | 员工主键 | staff_id | quote | hred.staff.Staff |  |  | nullable |
| 5 | applyPlanDate | 申请生效日期 | apply_plan_date | date | Date |  |  | nullable |
| 6 | changeReason | 变动原因 | change_reason | text | String |  |  | nullable |
| 7 | extension | 定调薪薪酬计划申请表特征组实体 | extension | UserDefine | hrxc.salaryApply.WaSalaryApplyPlanBillCharacteristics |  |  | nullable |
| 8 | preSalaryStandard | 原薪资标准 | pre_salary_standard | quote | hrxc.grade.WaGradeCriterion |  |  | nullable |
| 9 | adjustedSalaryStandard | 申请薪资标准 | adjusted_salary_standard | quote | hrxc.grade.WaGradeCriterion |  |  | nullable |
| 10 | staffJobCode | 任职编码 | staff_job_code | text | String |  |  | nullable |
| 11 | approveSalaryPlanId | 审批薪资计划 | approve_salary_plan_id | quote | hrxc.salaryplans.SalaryPlan |  |  | nullable |
| 12 | approveSalaryStandard | 审批薪资标准 | approve_salary_standard | quote | hrxc.grade.WaGradeCriterion |  |  | nullable |
| 13 | id | 主键 | ID | long | Long |  |  | nullable,uiHide,REF.ID |
| 14 | dr | 逻辑删除标识 | DR | short | Short |  | Y | nullable,uiHide,notGenerate |
| 15 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 16 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 17 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 18 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 19 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 20 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 21 | tenant | 租户主键(旧) | TENANTID | text | String |  |  | nullable |
| 22 | applyStandardGroupId | 申请薪资标准分组id | apply_standard_group_id | long | Long |  |  | nullable |
| 23 | approveStandardGroupId | 审批薪资标准分组id | approve_standard_group_id | long | Long |  |  | nullable |
| 24 | dept | 部门Id | dept_id | quote | bd.adminOrg.AdminOrgVO |  |  | dataAuth,data_auth,nullable |
| 25 | deptvid | 时间轴部门Id | dept_vid | quote | bd.adminOrg.AdminOrgVOTimeline |  |  | nullable |
| 26 | details | 定调薪申请明细表 | - | - | hrxc.salaryApply.WaSalaryApplyDetail |  |  |  |
| 27 | isMainJob | 人员是否是主职(1:主职 0:兼职) | ismainjob | int | Integer |  |  | nullable |
| 28 | org | 组织Id | org_id | quote | org.func.BaseOrg |  |  | isMasterOrg,nullable |
| 29 | orgvid | 时间轴组织Id | org_vid | quote | org.func.BaseOrgTimeline |  |  | nullable |
| 30 | preStandardGroupId | 原薪资标准分组id | pre_standard_group_id | long | Long |  |  | nullable |
| 31 | staffJobId | 人员任职主键 | staff_job_id | quote | hred.staff.StaffJob |  |  | nullable |

---

## Reference Fields (16)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | applyBill | 薪资申请主键 | APPLY_BILL_ID | hrxc.salaryApply.WaSalaryApplyBill |
| 2 | preSalaryPlanId | 原薪资计划主键 | pre_salary_plan_id | hrxc.salaryplans.SalaryPlan |
| 3 | salaryPlanId | 申请薪资计划主键 | salary_plan_id | hrxc.salaryplans.SalaryPlan |
| 4 | staffId | 员工主键 | staff_id | hred.staff.Staff |
| 5 | preSalaryStandard | 原薪资标准 | pre_salary_standard | hrxc.grade.WaGradeCriterion |
| 6 | adjustedSalaryStandard | 申请薪资标准 | adjusted_salary_standard | hrxc.grade.WaGradeCriterion |
| 7 | approveSalaryPlanId | 审批薪资计划 | approve_salary_plan_id | hrxc.salaryplans.SalaryPlan |
| 8 | approveSalaryStandard | 审批薪资标准 | approve_salary_standard | hrxc.grade.WaGradeCriterion |
| 9 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 10 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 11 | modifier | 修改人 | MODIFIER | hred.staff.Staff |
| 12 | dept | 部门Id | dept_id | bd.adminOrg.AdminOrgVO |
| 13 | deptvid | 时间轴部门Id | dept_vid | bd.adminOrg.AdminOrgVOTimeline |
| 14 | org | 组织Id | org_id | org.func.BaseOrg |
| 15 | orgvid | 时间轴组织Id | org_vid | org.func.BaseOrgTimeline |
| 16 | staffJobId | 人员任职主键 | staff_job_id | hred.staff.StaffJob |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | details | 定调薪申请明细表 | hrxc.salaryApply.WaSalaryApplyDetail |
