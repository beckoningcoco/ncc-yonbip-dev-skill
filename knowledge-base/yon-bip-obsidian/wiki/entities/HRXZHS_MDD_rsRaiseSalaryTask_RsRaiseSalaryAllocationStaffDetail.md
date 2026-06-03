---
tags: [BIP, metadata, HRXZHS_MDD, RsRaiseSalaryAllocationStaffDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 调薪任务分配人员明细 (HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationStaffDetail)

> Platform: BIP V5 | Table: rs_raise_salary_task_allocation_staff_detail | Schema: yonbip-hr-budget

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 调薪任务分配人员明细 |
| uri | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationStaffDetail |
| tableName | rs_raise_salary_task_allocation_staff_detail |
| domain | yonbip-hr-budget |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |

---

## All Fields (29)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | taskId | 任务主键 | task_id | quote | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTask |  |  | nullable |
| 2 | staffId | 人员主键 | staff_id | quote | hred.staff.Staff |  |  | nullable |
| 3 | allocationUnitId | 分配单元主键 | allocation_unit_id | quote | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationUnit |  |  | nullable |
| 4 | org | 组织主键 | org | quote | org.func.AdminOrg |  |  | isMasterOrg,nullable |
| 5 | dept | 部门主键 | dept | quote | org.func.AdminOrg |  |  | isMasterOrg,nullable |
| 6 | isSalaryAdjustment | 是否参与调薪0否1是 | is_salary_adjustment | int | Integer |  |  | nullable |
| 7 | isOccupyRaiseSalary | 是否占用调薪额度0否1是 | is_occupy_raise_salary | int | Integer |  |  | nullable |
| 8 | isOccupyMeasureAmount | 是否占用测算额度0否1是 | is_occupy_measure_amount | int | Integer |  |  | nullable |
| 9 | isContributeAmount | 是否贡献额度0否1是 | is_contribute_amount | int | Integer |  |  | nullable |
| 10 | salaryAdjustmentPackageAmount | 调薪额度 | salary_adjustment_package_amount | number | Decimal |  |  | nullable |
| 11 | generalTuningAmount | 普调额度 | general_tuning_amount | number | Decimal |  |  | nullable |
| 12 | promotionAmount | 晋升额度 | promotion_amount | number | Decimal |  |  | nullable |
| 13 | specialScenarioAmount | 特殊场景额度 | special_scenario_amount | number | Decimal |  |  | nullable |
| 14 | showOrder | 排序号 | show_order | int | Integer |  |  | nullable |
| 15 | jobId | 任职主键 | job_id | text | String |  |  | nullable |
| 16 | frequencyId | 基准频率主键 | frequency_id | quote | hrcb.common-ref.FrequencyVO |  |  | nullable |
| 17 | currency | 币种 | currency | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 18 | adjustRadio | 建议调薪比例 | adjust_radio | text | String |  |  | nullable |
| 19 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 20 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 21 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 22 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 23 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 24 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 25 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 26 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 27 | RsRaiseSalaryAllocationStaffDetailFactorList | 调薪任务分配人员影响因素 | - | - | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationStaffDetailFactor |  |  |  |
| 28 | RsRaiseSalaryAllocationStaffDetailItemList | 调薪任务分配人员明细项目 | - | - | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationStaffDetailItem |  |  |  |
| 29 | RsRaiseSalaryAllocationStaffDetailScene | 调薪任务分配人员调薪场景明细项目 | - | - | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationStaffDetailScene |  |  |  |

---

## Reference Fields (10)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | taskId | 任务主键 | task_id | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTask |
| 2 | staffId | 人员主键 | staff_id | hred.staff.Staff |
| 3 | allocationUnitId | 分配单元主键 | allocation_unit_id | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationUnit |
| 4 | org | 组织主键 | org | org.func.AdminOrg |
| 5 | dept | 部门主键 | dept | org.func.AdminOrg |
| 6 | frequencyId | 基准频率主键 | frequency_id | hrcb.common-ref.FrequencyVO |
| 7 | currency | 币种 | currency | bd.currencytenant.CurrencyTenantVO |
| 8 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 9 | creator | 创建人 | creator | base.user.BipUser |
| 10 | modifier | 修改人 | modifier | base.user.BipUser |

---

## Child Tables (3)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | RsRaiseSalaryAllocationStaffDetailItemList | 调薪任务分配人员明细项目 | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationStaffDetailItem |
| 2 | RsRaiseSalaryAllocationStaffDetailScene | 调薪任务分配人员调薪场景明细项目 | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationStaffDetailScene |
| 3 | RsRaiseSalaryAllocationStaffDetailFactorList | 调薪任务分配人员影响因素 | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationStaffDetailFactor |
