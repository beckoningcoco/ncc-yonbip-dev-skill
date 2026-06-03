---
tags: [BIP, metadata, hrjx, PmExecutionRoleStaff]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 执行角色指定人员 (hrjx.pmExecutionRole.PmExecutionRoleStaff)

> Platform: BIP V5 | Table: pm_execution_role_staff | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 执行角色指定人员 |
| uri | hrjx.pmExecutionRole.PmExecutionRoleStaff |
| tableName | pm_execution_role_staff |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (10)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 2 | staffid | 员工id | staff_id | quote | hred.staff.Staff |  |  | nullable |
| 3 | staffJobId | 任职id | staffjob_id | quote | hred.staff.StaffJob |  |  | nullable |
| 4 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 5 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 6 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 7 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 8 | pmExecutionRoleId | 执行角色id | execution_role_id | quote | hrjx.pmExecutionRole.PmExecutionRole |  |  | nullable |
| 9 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 10 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | staffid | 员工id | staff_id | hred.staff.Staff |
| 2 | staffJobId | 任职id | staffjob_id | hred.staff.StaffJob |
| 3 | creator | 创建人 | creator | base.user.BipUser |
| 4 | modifier | 修改人 | modifier | base.user.BipUser |
| 5 | pmExecutionRoleId | 执行角色id | execution_role_id | hrjx.pmExecutionRole.PmExecutionRole |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
