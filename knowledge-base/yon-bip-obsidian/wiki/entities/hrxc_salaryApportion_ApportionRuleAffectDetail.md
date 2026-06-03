---
tags: [BIP, metadata, hrxc, ApportionRuleAffectDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分摊人员影响因素表 (hrxc.salaryApportion.ApportionRuleAffectDetail)

> Platform: BIP V5 | Table: wa_apportion_rule_staff_affect_detail | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 分摊人员影响因素表 |
| uri | hrxc.salaryApportion.ApportionRuleAffectDetail |
| tableName | wa_apportion_rule_staff_affect_detail |
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

## All Fields (20)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | ruleStaffId | 主表手工码 | RULE_STAFF_ID | quote | hrxc.salaryApportion.ApportionRuleStaff |  |  | nullable |
| 2 | staff | 员工主键 | STAFF_ID | text | String |  |  | nullable |
| 3 | staffJob | 任职信息主键 | STAFF_JOB_ID | text | String |  |  | nullable |
| 4 | orgId | 组织主键 | ORG_ID | quote | org.func.BaseOrgTimeline |  |  | isMasterOrg,nullable |
| 5 | deptId | 部门id | DEPT_ID | text | String |  |  | nullable |
| 6 | userProject | 项目id | USER_PROJECT | text | String |  |  | nullable |
| 7 | itemId | 薪资项目id | ITEM_ID | text | String |  |  | nullable |
| 8 | psnclId | 人员类别id | PSNCL_ID | text | String |  |  | nullable |
| 9 | character | 特征id | CHARACTER_ID | text | String |  |  | nullable |
| 10 | apportionScale | 分摊比例 | APPORTION_SCALE | number | Decimal |  |  | nullable |
| 11 | period | 期间Id | PAY_PERIOD | quote | hrxc.period.PeriodDetail |  |  | nullable |
| 12 | id | id | ID | text | String |  |  | nullable,REF.ID |
| 13 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 14 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 15 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 16 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 17 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 18 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 19 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 20 | tenant | 租户主键(旧) | TENANTID | text | String |  | Y | nullable,uiHide |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ruleStaffId | 主表手工码 | RULE_STAFF_ID | hrxc.salaryApportion.ApportionRuleStaff |
| 2 | orgId | 组织主键 | ORG_ID | org.func.BaseOrgTimeline |
| 3 | period | 期间Id | PAY_PERIOD | hrxc.period.PeriodDetail |
| 4 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 5 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 6 | modifier | 修改人 | MODIFIER | hred.staff.Staff |
