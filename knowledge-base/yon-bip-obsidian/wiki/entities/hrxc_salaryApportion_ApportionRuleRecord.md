---
tags: [BIP, metadata, hrxc, ApportionRuleRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分摊规则记录 (hrxc.salaryApportion.ApportionRuleRecord)

> Platform: BIP V5 | Table: wa_apportion_rule_record | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 分摊规则记录 |
| uri | hrxc.salaryApportion.ApportionRuleRecord |
| tableName | wa_apportion_rule_record |
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

## All Fields (15)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | rule | 分摊规则 | RULE_ID | quote | hrxc.salaryApportion.ApportionRule |  |  | nullable |
| 2 | ruleStaff | 分摊规则人员 | RULE_STAFF_ID | quote | hrxc.salaryApportion.ApportionRuleStaff |  |  | nullable |
| 3 | period | 期间 | PERIOD | quote | hrxc.period.PeriodDetail |  |  | nullable |
| 4 | payFile | 发放单 | PAY_FILE_ID | quote | hrxc.salaryApportion.SalaryPayfile |  |  | nullable |
| 5 | tenant | 租户主键(旧) | TENANTID | text | String |  | Y | nullable,uiHide |
| 6 | typeId | 分摊类型主键 | TYPE_ID | quote | hrxc.salaryApportion.SalaryApportionType |  |  | nullable |
| 7 | id | 主键 | ID | text | String |  |  | nullable,REF.ID |
| 8 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 9 | pubts | 时间戳 | PUBTS | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 10 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 11 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 12 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 13 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 14 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 15 | yTenantId | 友户通租户主键 | ytenant_id | text | String |  |  | nullable |

---

## Reference Fields (8)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | rule | 分摊规则 | RULE_ID | hrxc.salaryApportion.ApportionRule |
| 2 | ruleStaff | 分摊规则人员 | RULE_STAFF_ID | hrxc.salaryApportion.ApportionRuleStaff |
| 3 | period | 期间 | PERIOD | hrxc.period.PeriodDetail |
| 4 | payFile | 发放单 | PAY_FILE_ID | hrxc.salaryApportion.SalaryPayfile |
| 5 | typeId | 分摊类型主键 | TYPE_ID | hrxc.salaryApportion.SalaryApportionType |
| 6 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 7 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 8 | modifier | 修改人 | MODIFIER | hred.staff.Staff |
