---
tags: [BIP, metadata, hrxc, ApportionRuleStaff]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分摊人员表 (hrxc.salaryApportion.ApportionRuleStaff)

> Platform: BIP V5 | Table: wa_apportion_rule_staff | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 分摊人员表 |
| uri | hrxc.salaryApportion.ApportionRuleStaff |
| tableName | wa_apportion_rule_staff |
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
| 1 | staff | 人员主键 | STAFF_ID | quote | hred.staff.Staff |  |  | nullable |
| 2 | ruleId | 规则主键 | RULE_ID | quote | hrxc.salaryApportion.ApportionRule |  |  | nullable |
| 3 | id | 手工码 | ID | text | String |  |  | nullable,REF.ID |
| 4 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 5 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 6 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 7 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 8 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 9 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 10 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 11 | tenant | 租户主键(旧) | TENANTID | text | String |  | Y | nullable,uiHide |
| 12 | affectDetails | 分摊人员影响因素表 | - | - | hrxc.salaryApportion.ApportionRuleAffectDetail |  |  |  |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | staff | 人员主键 | STAFF_ID | hred.staff.Staff |
| 2 | ruleId | 规则主键 | RULE_ID | hrxc.salaryApportion.ApportionRule |
| 3 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 4 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 5 | modifier | 修改人 | MODIFIER | hred.staff.Staff |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | affectDetails | 分摊人员影响因素表 | hrxc.salaryApportion.ApportionRuleAffectDetail |
