---
tags: [BIP, metadata, HRXZHS_MDD, RsRaiseSalaryTaskFactor]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 调薪任务关联影响因素 (HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTaskFactor)

> Platform: BIP V5 | Table: rs_raise_salary_task_factor | Schema: yonbip-hr-budget

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 调薪任务关联影响因素 |
| uri | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTaskFactor |
| tableName | rs_raise_salary_task_factor |
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

## All Fields (16)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | factorId | 影响因素主键 | factorId | quote | HRXZHS_MDD.rsRaiseSalaryFactors.RsSalaryFactor |  |  | nullable |
| 2 | taskId | 任务主键 | task_id | quote | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTask |  |  | nullable |
| 3 | org | 组织主键 | org | text | String |  |  | nullable |
| 4 | allocationPersonPower | 分配负责人操作权限(O仅查看1不可看) | allocation_person_power | int | Integer |  |  | nullable |
| 5 | approvePersonPower | 审批人操作权限(O仅查看1不可看) | approve_person_power | int | Integer |  |  | nullable |
| 6 | showOrder | 排序号 | show_order | int | Integer |  |  | nullable |
| 7 | source | 数据来源 | source | int | Integer |  |  | nullable |
| 8 | memo | 说明 | memo | text | String |  |  | nullable |
| 9 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 10 | dr | 逻辑删除标识 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 11 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 12 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 13 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 14 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 15 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 16 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | factorId | 影响因素主键 | factorId | HRXZHS_MDD.rsRaiseSalaryFactors.RsSalaryFactor |
| 2 | taskId | 任务主键 | task_id | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTask |
| 3 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 4 | creator | 创建人 | creator | base.user.BipUser |
| 5 | modifier | 修改人 | modifier | base.user.BipUser |
