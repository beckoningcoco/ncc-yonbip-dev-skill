---
tags: [BIP, metadata, hrxc, WaSalaryAccountGroupVersion]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资核算组版本 (hrxc.salaryAccount.WaSalaryAccountGroupVersion)

> Platform: BIP V5 | Table: wa_salary_account_group_version | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资核算组版本 |
| uri | hrxc.salaryAccount.WaSalaryAccountGroupVersion |
| tableName | wa_salary_account_group_version |
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
| 2 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 3 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (13)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 2 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 3 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 4 | effectDate | 生效时间 | EFFECT_DATE | timestamp | Timestamp |  |  | nullable |
| 5 | id | id | ID | long | Long |  |  | nullable,uiHide,REF.ID |
| 6 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 7 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 8 | pubts | ts | pubts | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 9 | salaryGroupId | 薪资核算组id | salary_group_id | quote | hrxc.salaryAccount.WaSalaryAccountGroup |  |  | nullable |
| 10 | scopeList | 薪资核算组范围 | - | - | hrxc.salaryAccount.WaSalaryAccountGroupScope |  |  |  |
| 11 | scopeType | 规则类型 | SCOPE_TYPE | int | Integer |  |  | nullable |
| 12 | yTenantId | 租户 | ytenant_id | text | String |  |  | nullable |
| 13 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | modifier | 修改人 | modifier | base.user.BipUser |
| 3 | salaryGroupId | 薪资核算组id | salary_group_id | hrxc.salaryAccount.WaSalaryAccountGroup |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | scopeList | 薪资核算组范围 | hrxc.salaryAccount.WaSalaryAccountGroupScope |
