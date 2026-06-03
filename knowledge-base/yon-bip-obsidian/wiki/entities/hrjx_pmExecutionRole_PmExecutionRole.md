---
tags: [BIP, metadata, hrjx, PmExecutionRole]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 执行角色 (hrjx.pmExecutionRole.PmExecutionRole)

> Platform: BIP V5 | Table: pm_execution_role | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 执行角色 |
| uri | hrjx.pmExecutionRole.PmExecutionRole |
| tableName | pm_execution_role |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |
| description | 0 停用 1 启用 |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 启用 (IEnable) | ucfbase.ucfbaseItf.IEnable |
| 2 | 自动编号 (IAutoCode) | voucher.base.IAutoCode |
| 3 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 4 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (19)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | code | 角色编码 | code | text | String |  |  | CODE,isCode,nullable,REF.CODE |
| 2 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 3 | name | 角色名称 | name | multiLanguage | String |  |  | isName,nullable |
| 4 | orgid | 所属组织id | orgid | quote | org.func.AdminOrg |  |  | isMasterOrg,nullable |
| 5 | pullType | 获取方式 | pull_type | int | Integer |  |  | nullable |
| 6 | description | 角色描述 | description | multiLanguage | String |  |  | nullable |
| 7 | enable | 状态 | enable | singleOption | bd.systemEnum.sys_intboolean |  |  | nullable,uiDesign |
| 8 | ruleId | 业务规则ID | rule_id | quote | hrcb.rule_bizrule.BizRule |  |  | nullable |
| 9 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 10 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 11 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 12 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 13 | isSys | 是否系统预置 | is_sys | int | Integer |  |  | nullable |
| 14 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 15 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 16 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 17 | scopeList | 执行角色适用范围 | - | - | hrjx.pmExecutionRole.PmExecutionRoleScope |  |  |  |
| 18 | staffList | 执行角色指定人员 | - | - | hrjx.pmExecutionRole.PmExecutionRoleStaff |  |  |  |
| 19 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orgid | 所属组织id | orgid | org.func.AdminOrg |
| 2 | ruleId | 业务规则ID | rule_id | hrcb.rule_bizrule.BizRule |
| 3 | creator | 创建人 | creator | base.user.BipUser |
| 4 | modifier | 修改人 | modifier | base.user.BipUser |
| 5 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Enum Fields (1)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | enable | 状态 | enable | bd.systemEnum.sys_intboolean |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | scopeList | 执行角色适用范围 | hrjx.pmExecutionRole.PmExecutionRoleScope |
| 2 | staffList | 执行角色指定人员 | hrjx.pmExecutionRole.PmExecutionRoleStaff |

---

## Enum Value Details

### 状态 (enable) -> enable
> Enum: bd.systemEnum.sys_intboolean

| code | value | name |
|------|-------|------|
| 0 | 0 | 停用 |
| 1 | 1 | 启用 |
