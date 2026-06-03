---
tags: [BIP, metadata, hrxc, StaffCostCenter]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 员工成本中心表 (hrxc.salaryApportion.StaffCostCenter)

> Platform: BIP V5 | Table: staff_cost_center | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 员工成本中心表 |
| uri | hrxc.salaryApportion.StaffCostCenter |
| tableName | staff_cost_center |
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

## All Fields (11)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 2 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 3 | docDetails | 员工成本中心档案明细表 | - | - | hrxc.salaryApportion.StaffCostCenterDocDetail |  |  |  |
| 4 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 5 | id | 主键 | id | long | Long |  |  | nullable,REF.ID |
| 6 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 7 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 8 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 9 | ruleDetails | 员工分摊规则 | - | - | hrxc.salaryApportion.StaffApportionRuleDetail |  |  |  |
| 10 | staffId | 员工ID | staff_id | quote | hred.staff.Staff |  |  | data_auth,nullable |
| 11 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | creator | 创建人 | creator | base.user.BipUser |
| 2 | modifier | 修改人 | modifier | base.user.BipUser |
| 3 | staffId | 员工ID | staff_id | hred.staff.Staff |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | docDetails | 员工成本中心档案明细表 | hrxc.salaryApportion.StaffCostCenterDocDetail |
| 2 | ruleDetails | 员工分摊规则 | hrxc.salaryApportion.StaffApportionRuleDetail |
