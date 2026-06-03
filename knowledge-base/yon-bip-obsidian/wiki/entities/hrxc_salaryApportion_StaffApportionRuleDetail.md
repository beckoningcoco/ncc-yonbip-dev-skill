---
tags: [BIP, metadata, hrxc, StaffApportionRuleDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 员工分摊规则 (hrxc.salaryApportion.StaffApportionRuleDetail)

> Platform: BIP V5 | Table: staff_apportion_rule_detail | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 员工分摊规则 |
| uri | hrxc.salaryApportion.StaffApportionRuleDetail |
| tableName | staff_apportion_rule_detail |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (19)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | apportionAmount | 分摊金额 | apportion_amount | number | Decimal |  |  | nullable |
| 2 | apportionScale | 分摊比例 | apportion_scale | number | Decimal |  |  | nullable |
| 3 | apportionType | 分摊方式 | apportion_type | int | Integer |  |  | nullable |
| 4 | beginDate | 开始日期 | begin_date | timestamp | Timestamp |  |  | nullable |
| 5 | costCenterId | 成本中心档案ID | cost_center_id | quote | hrxc.salaryApportion.StaffCostCenter |  |  | nullable |
| 6 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 7 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 8 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 9 | endDate | 结束日期 | end_date | timestamp | Timestamp |  |  | nullable |
| 10 | financeOrgId | 财务组织ID | finance_org_id | quote | org.func.FinanceOrg |  |  | nullable |
| 11 | id | 主键 | id | long | Long |  |  | nullable,REF.ID |
| 12 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 13 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 14 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 15 | ruleAffectDetails | 员工分摊规则影响因素明细 | - | - | hrxc.salaryApportion.StaffApportionRuleAffectDetail |  |  |  |
| 16 | salaryItemId | 薪资项目id | salary_item_id | quote | hrxc.publicItem.WaItem |  |  | nullable |
| 17 | staffId | 员工ID | staff_id | text | String |  |  | nullable |
| 18 | tailProcessFlag | 尾差处理标记 | tail_process_flag | int | Integer |  |  | nullable |
| 19 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | costCenterId | 成本中心档案ID | cost_center_id | hrxc.salaryApportion.StaffCostCenter |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | financeOrgId | 财务组织ID | finance_org_id | org.func.FinanceOrg |
| 4 | modifier | 修改人 | modifier | base.user.BipUser |
| 5 | salaryItemId | 薪资项目id | salary_item_id | hrxc.publicItem.WaItem |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | ruleAffectDetails | 员工分摊规则影响因素明细 | hrxc.salaryApportion.StaffApportionRuleAffectDetail |
