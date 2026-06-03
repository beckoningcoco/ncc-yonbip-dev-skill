---
tags: [BIP, metadata, hrxc, StaffCostCenterDocDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 员工成本中心档案明细表 (hrxc.salaryApportion.StaffCostCenterDocDetail)

> Platform: BIP V5 | Table: staff_cost_center_doc_detail | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 员工成本中心档案明细表 |
| uri | hrxc.salaryApportion.StaffCostCenterDocDetail |
| tableName | staff_cost_center_doc_detail |
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

## All Fields (16)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | apportionScale | 分摊比例 | apportion_scale | number | Decimal |  |  | nullable |
| 2 | beginDate | 开始日期 | begin_date | date | Date |  |  | nullable |
| 3 | costCenterId | 成本中心档案ID | cost_center_id | quote | hrxc.salaryApportion.StaffCostCenter |  |  | nullable |
| 4 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 5 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 6 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 7 | endDate | 结束日期 | end_date | date | Date |  |  | nullable |
| 8 | financeDeptId | 财务部门ID | finance_dept_id | quote | org.func.AdminOrg |  |  | nullable |
| 9 | financeOrgId | 财务组织ID | finance_org_id | quote | org.func.FinanceOrg |  |  | nullable |
| 10 | id | 主键 | id | long | Long |  |  | nullable,REF.ID |
| 11 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 12 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 13 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 14 | staffId | 员工ID | staff_id | text | String |  |  | nullable |
| 15 | tailProcessFlag | 尾差处理标记 | tail_process_flag | int | Integer |  |  | nullable |
| 16 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | costCenterId | 成本中心档案ID | cost_center_id | hrxc.salaryApportion.StaffCostCenter |
| 2 | creator | 创建人 | creator | base.user.BipUser |
| 3 | financeDeptId | 财务部门ID | finance_dept_id | org.func.AdminOrg |
| 4 | financeOrgId | 财务组织ID | finance_org_id | org.func.FinanceOrg |
| 5 | modifier | 修改人 | modifier | base.user.BipUser |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
