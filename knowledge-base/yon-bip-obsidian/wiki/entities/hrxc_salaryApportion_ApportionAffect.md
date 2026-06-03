---
tags: [BIP, metadata, hrxc, ApportionAffect]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资分摊影响因素表 (hrxc.salaryApportion.ApportionAffect)

> Platform: BIP V5 | Table: wa_salary_apportion_affect | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资分摊影响因素表 |
| uri | hrxc.salaryApportion.ApportionAffect |
| tableName | wa_salary_apportion_affect |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
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
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 4 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (12)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | typeId | 分摊类型主键 | TYPE_ID | quote | hrxc.salaryApportion.SalaryApportionType |  |  | nullable |
| 2 | affectKey | 影响因素KEY | AFFECT_KEY | text | String |  |  | nullable |
| 3 | showOrder | 展示顺序 | SHOW_ORDER | text | String |  |  | nullable |
| 4 | id | 主键 | ID | text | String |  |  | nullable,REF.ID |
| 5 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 6 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 7 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 8 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 9 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 10 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 11 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 12 | tenant | 租户主键(旧) | TENANTID | text | String |  | Y | nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | typeId | 分摊类型主键 | TYPE_ID | hrxc.salaryApportion.SalaryApportionType |
| 2 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 3 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 4 | modifier | 修改人 | MODIFIER | hred.staff.Staff |
