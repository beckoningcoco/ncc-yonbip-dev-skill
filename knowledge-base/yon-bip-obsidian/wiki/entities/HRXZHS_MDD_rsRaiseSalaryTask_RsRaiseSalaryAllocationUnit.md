---
tags: [BIP, metadata, HRXZHS_MDD, RsRaiseSalaryAllocationUnit]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 调薪任务分配单元 (HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationUnit)

> Platform: BIP V5 | Table: rs_raise_salary_task_allocation_unit | Schema: yonbip-hr-budget

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 调薪任务分配单元 |
| uri | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationUnit |
| tableName | rs_raise_salary_task_allocation_unit |
| domain | yonbip-hr-budget |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 4 | 树型结构 (ITree) | base.itf.ITree |

---

## All Fields (39)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | RsRaiseSalaryAllocationUnitSceneAmountList | 分配单元分配负责人 | - | - | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationUnitAllocationPerson |  |  |  |
| 2 | adjustNumberLowerLevel | 调薪人数下级 | adjust_number_lower_level | int | Integer |  |  | nullable |
| 3 | adjustNumberThisLevel | 调薪人数本级 | adjust_number_this_level | int | Integer |  |  | nullable |
| 4 | adjustSalaryAmount | 调薪总额 | adjust_salary_amount | number | Decimal |  |  | nullable |
| 5 | allocatedAmount | 已用额度 | allocated_amount | number | Decimal |  |  | nullable |
| 6 | allocationPerson | 分配负责人id | allocation_person | quote | hred.staff.Staff |  |  | nullable |
| 7 | allocationStatus | 0分配中1已完成 | allocation_status | text | String |  |  | nullable |
| 8 | auditstatus | 审核状态 | auditstatus | int | Integer |  |  | nullable |
| 9 | businessKey | 消息id | business_key | text | String |  |  | nullable |
| 10 | confirmStatus | 0未确认1已确认 | confirm_status | int | Integer |  |  | nullable |
| 11 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 12 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 13 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 14 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 15 | isAllocatingDown | 是否允许向下分配 | is_allocating_down | int | Integer |  |  | nullable |
| 16 | isDept | 是否为部门 | is_dept | int | Integer |  |  | nullable |
| 17 | isEnd | 是否末级 | isEnd | switch | Boolean |  |  | nullable |
| 18 | isExcess | 是否支持超额分配 | is_excess | text | String |  |  | nullable |
| 19 | isInclude | 是否包含下级0否1是 | is_include | int | Integer |  |  | nullable |
| 20 | isIncludeSubordinates | 人员范围是否包含下级 | is_include_subordinates | int | Integer |  |  | nullable |
| 21 | level | 层级 | level | int | Integer |  |  | nullable |
| 22 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 23 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 24 | orgDept | 组织部门Id | org_dept | quote | org.func.AdminOrg |  |  | isMasterOrg,nullable |
| 25 | orgDeptCode | 组织部门编码 | org_dept_code | text | String |  |  | nullable |
| 26 | orgDeptName | 组织部门名称 | org_dept_name | text | String |  |  | nullable |
| 27 | parent | 上级单元 | parent_id | quote | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationUnit |  |  | nullable |
| 28 | parentOrg | 父级orgId | parentOrg | quote | org.func.AdminOrg |  |  | isMasterOrg,nullable |
| 29 | path | 路径 | path | text | String |  |  | nullable |
| 30 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 31 | remainingAmount | 剩余额度 | remaining_amount | number | Decimal |  |  | nullable |
| 32 | remainingAmountIncludingSubordinates | 剩余额度(含下级) | remaining_amount_including_subordinates | number | Decimal |  |  | nullable |
| 33 | rsRaiseSalaryAllocationStaffDetailList | 调薪任务分配人员明细 | - | - | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationStaffDetail |  |  |  |
| 34 | showOrder | 人员范围是否包含下级 | show_order | int | Integer |  |  | nullable |
| 35 | sort | 排序号 | sort_num | int | Integer |  |  | nullable |
| 36 | staffId | 分配负责人id | staff_id | quote | hred.staff.Staff |  |  | nullable |
| 37 | status | 0未提交1已提交2已确认 | status | int | Integer |  |  | nullable |
| 38 | taskId | 任务id | task_id | quote | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTask |  |  | nullable |
| 39 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (9)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | allocationPerson | 分配负责人id | allocation_person | hred.staff.Staff |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | modifier | 修改人 | modifier | base.user.BipUser |
| 4 | orgDept | 组织部门Id | org_dept | org.func.AdminOrg |
| 5 | parent | 上级单元 | parent_id | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationUnit |
| 6 | parentOrg | 父级orgId | parentOrg | org.func.AdminOrg |
| 7 | staffId | 分配负责人id | staff_id | hred.staff.Staff |
| 8 | taskId | 任务id | task_id | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTask |
| 9 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | rsRaiseSalaryAllocationStaffDetailList | 调薪任务分配人员明细 | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationStaffDetail |
| 2 | RsRaiseSalaryAllocationUnitSceneAmountList | 分配单元分配负责人 | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationUnitAllocationPerson |
