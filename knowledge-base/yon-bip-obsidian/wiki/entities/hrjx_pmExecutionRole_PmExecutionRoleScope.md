---
tags: [BIP, metadata, hrjx, PmExecutionRoleScope]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 执行角色适用范围 (hrjx.pmExecutionRole.PmExecutionRoleScope)

> Platform: BIP V5 | Table: pm_execution_role_scope | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 执行角色适用范围 |
| uri | hrjx.pmExecutionRole.PmExecutionRoleScope |
| tableName | pm_execution_role_scope |
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

## All Fields (9)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | id | id | id | long | Long |  |  | nullable,REF.ID |
| 2 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 3 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 4 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 5 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 6 | orgid | 组织ID | orgid | quote | org.func.AdminOrg |  |  | nullable |
| 7 | pmExecutionRoleId | 执行角色id | execution_role_id | quote | hrjx.pmExecutionRole.PmExecutionRole |  |  | nullable |
| 8 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 9 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | modifier | 修改人 | modifier | base.user.BipUser |
| 3 | orgid | 组织ID | orgid | org.func.AdminOrg |
| 4 | pmExecutionRoleId | 执行角色id | execution_role_id | hrjx.pmExecutionRole.PmExecutionRole |
| 5 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
