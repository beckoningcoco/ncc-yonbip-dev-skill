---
tags: [BIP, metadata, hrxc, SalaryApportionAuth]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分摊类型授权表 (hrxc.salaryApportion.SalaryApportionAuth)

> Platform: BIP V5 | Table: wa_salary_apportion_auth | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 分摊类型授权表 |
| uri | hrxc.salaryApportion.SalaryApportionAuth |
| tableName | wa_salary_apportion_auth |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
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

## All Fields (11)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | typeId | 企业级分摊类型主键 | type_id | quote | hrxc.salaryApportion.SalaryApportionType |  |  | nullable |
| 2 | authTypeId | 组织级分摊类型主键 | auth_type_id | quote | hrxc.salaryApportion.SalaryApportionType |  |  | nullable |
| 3 | authOrgId | 授权组织 | auth_org_id | quote | org.func.BaseOrg |  |  | nullable |
| 4 | id | 主键 | ID | text | String |  |  | nullable,REF.ID |
| 5 | dr | 逻辑删除标识 | dr | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 6 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 7 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 8 | creator | 创建人 | creator | quote | hred.staff.Staff |  |  | nullable |
| 9 | createTime | 创建时间 | create_time | timestamp | Timestamp |  |  | nullable |
| 10 | modifier | 修改人 | modifier | quote | hred.staff.Staff |  |  | nullable |
| 11 | modifyTime | 修改时间 | modify_time | timestamp | Timestamp |  |  | nullable |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | typeId | 企业级分摊类型主键 | type_id | hrxc.salaryApportion.SalaryApportionType |
| 2 | authTypeId | 组织级分摊类型主键 | auth_type_id | hrxc.salaryApportion.SalaryApportionType |
| 3 | authOrgId | 授权组织 | auth_org_id | org.func.BaseOrg |
| 4 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 5 | creator | 创建人 | creator | hred.staff.Staff |
| 6 | modifier | 修改人 | modifier | hred.staff.Staff |
