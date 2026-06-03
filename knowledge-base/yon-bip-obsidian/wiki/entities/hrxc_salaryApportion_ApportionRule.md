---
tags: [BIP, metadata, hrxc, ApportionRule]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分摊规则 (hrxc.salaryApportion.ApportionRule)

> Platform: BIP V5 | Table: wa_apportion_rule | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 分摊规则 |
| uri | hrxc.salaryApportion.ApportionRule |
| tableName | wa_apportion_rule |
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

## All Fields (18)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | orgId | 组织主键 | ORG_ID | quote | org.func.BaseOrgTimeline |  |  | isMasterOrg,nullable |
| 2 | code | 编码 | CODE | text | String |  |  | isCode,nullable |
| 3 | name | 分摊类型 | NAME | multiLanguage | String |  |  | isName,nullable |
| 4 | vocherType | 凭证类型 | VOCHER_TYPE | text | String |  |  | nullable |
| 5 | pkWaScheme | 发薪方案 | SCHEME_AUTH_ID | quote | hrxc.scheme.WaSchemeAuth |  |  | nullable |
| 6 | period | 发薪期间 | PAY_PERIOD | quote | hrxc.period.PeriodDetail |  |  | nullable |
| 7 | enable | 启用1,停用0  | ENABLE | int | Integer |  |  | nullable |
| 8 | id | 主键 | ID | text | String |  |  | nullable,REF.ID |
| 9 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 10 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 11 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 12 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 13 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 14 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 15 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 16 | tenant | 租户主键(旧) | TENANTID | text | String |  | Y | nullable,uiHide |
| 17 | records | 分摊规则记录 | - | - | hrxc.salaryApportion.ApportionRuleRecord |  |  |  |
| 18 | staffDetails | 分摊人员表 | - | - | hrxc.salaryApportion.ApportionRuleStaff |  |  |  |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orgId | 组织主键 | ORG_ID | org.func.BaseOrgTimeline |
| 2 | pkWaScheme | 发薪方案 | SCHEME_AUTH_ID | hrxc.scheme.WaSchemeAuth |
| 3 | period | 发薪期间 | PAY_PERIOD | hrxc.period.PeriodDetail |
| 4 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 5 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 6 | modifier | 修改人 | MODIFIER | hred.staff.Staff |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | records | 分摊规则记录 | hrxc.salaryApportion.ApportionRuleRecord |
| 2 | staffDetails | 分摊人员表 | hrxc.salaryApportion.ApportionRuleStaff |
