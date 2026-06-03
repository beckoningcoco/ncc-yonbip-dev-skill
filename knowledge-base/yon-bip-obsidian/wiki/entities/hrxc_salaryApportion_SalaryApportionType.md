---
tags: [BIP, metadata, hrxc, SalaryApportionType]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资分摊类型 (hrxc.salaryApportion.SalaryApportionType)

> Platform: BIP V5 | Table: wa_salary_apportion_type | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资分摊类型 |
| uri | hrxc.salaryApportion.SalaryApportionType |
| tableName | wa_salary_apportion_type |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (5)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 4 | 树型结构 (ITree) | base.itf.ITree |
| 5 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (31)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | orgId | 组织主键 | BUSIORG | quote | org.func.BaseOrgTimeline |  |  | isMasterOrg,nullable |
| 2 | orgName | 组织名称 | ORG_NAME | text | String |  |  | nullable |
| 3 | orgVId | 时间轴组织主键 | BUSIORGVID | quote | org.func.BaseOrgTimeline |  |  | isMasterOrg,nullable |
| 4 | vocherType | 凭证类型 | vocher_type | text | String |  |  | nullable |
| 5 | name2 | 分摊类型 | TYPE_NAME2 | text | String |  |  | nullable |
| 6 | name3 | 分摊类型 | TYPE_NAME3 | text | String |  |  | nullable |
| 7 | name4 | 分摊类型 | TYPE_NAME4 | text | String |  |  | nullable |
| 8 | name5 | 分摊类型 | TYPE_NAME5 | text | String |  |  | nullable |
| 9 | name6 | 分摊类型 | TYPE_NAME6 | text | String |  |  | nullable |
| 10 | isEnd | 是否结束 | is_end | int | Integer |  |  | nullable |
| 11 | schemeIds | 发薪方案主键 | schemeIds | text | String |  |  | nullable |
| 12 | name | 分摊类型 | TYPE_NAME | multiLanguage | String |  |  | isName,nullable |
| 13 | apportionScale | 分摊比例 | APPORTION_SCALE | number | Decimal |  |  | nullable |
| 14 | parent | 所属上级 | parent_id | quote | hrxc.salaryApportion.SalaryApportionType |  |  | nullable |
| 15 | isShare | 触发方式 | is_share | text | String |  |  | nullable |
| 16 | sort | 排序号 | sort_num | int | Integer |  |  | nullable |
| 17 | level | 层级 | level | int | Integer |  |  | nullable |
| 18 | path | 路径 | path | text | String |  |  | nullable |
| 19 | id | 主键 | ID | text | String |  |  | nullable,isCode,REF.ID |
| 20 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 21 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 22 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 23 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 24 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 25 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 26 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 27 | tenant | 租户主键(旧) | TENANTID | text | String |  | Y | nullable,uiHide |
| 28 | apportionAffects | 薪资分摊影响因素表 | - | - | hrxc.salaryApportion.ApportionAffect |  |  |  |
| 29 | authDetails | 分摊类型授权表 | - | - | hrxc.salaryApportion.SalaryApportionAuth |  |  |  |
| 30 | salaryApportionItems | 薪资分摊项目 | - | - | hrxc.salaryApportion.SalaryApportionItem |  |  |  |
| 31 | salaryDispenses | 薪资分摊已分摊主表 | - | - | hrxc.salaryApportion.SalaryApportionDispense |  |  |  |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orgId | 组织主键 | BUSIORG | org.func.BaseOrgTimeline |
| 2 | orgVId | 时间轴组织主键 | BUSIORGVID | org.func.BaseOrgTimeline |
| 3 | parent | 所属上级 | parent_id | hrxc.salaryApportion.SalaryApportionType |
| 4 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 5 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 6 | modifier | 修改人 | MODIFIER | hred.staff.Staff |

---

## Child Tables (4)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | apportionAffects | 薪资分摊影响因素表 | hrxc.salaryApportion.ApportionAffect |
| 2 | salaryDispenses | 薪资分摊已分摊主表 | hrxc.salaryApportion.SalaryApportionDispense |
| 3 | authDetails | 分摊类型授权表 | hrxc.salaryApportion.SalaryApportionAuth |
| 4 | salaryApportionItems | 薪资分摊项目 | hrxc.salaryApportion.SalaryApportionItem |
