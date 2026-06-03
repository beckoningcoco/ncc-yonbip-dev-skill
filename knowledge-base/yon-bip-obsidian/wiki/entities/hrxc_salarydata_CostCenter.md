---
tags: [BIP, metadata, hrxc, CostCenter]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成本中心 (hrxc.salarydata.CostCenter)

> Platform: BIP V5 | Table: cost_center | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 成本中心 |
| uri | hrxc.salarydata.CostCenter |
| tableName | cost_center |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (12)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | staffId | 员工主键 | staff_id | quote | hred.staff.Staff |  |  | nullable |
| 2 | staffJobCode | 员工任职编码 | staff_job_code | text | String |  |  | nullable |
| 3 | beginDate | 开始时间 | begin_date | timestamp | Timestamp |  |  | nullable |
| 4 | endDate | 结束时间 | end_date | timestamp | Timestamp |  |  | nullable |
| 5 | taxOrgId | 财务组织主键 | tax_org_id | quote | org.func.AdminOrg |  |  | nullable |
| 6 | taxDeptId | 财务部门主键 | tax_dept_id | quote | org.func.BaseOrgTimeline |  |  | nullable |
| 7 | taxDeptVid | 财务部门V主键 | tax_dept_vid | quote | org.func.BaseOrgTimeline |  |  | nullable |
| 8 | extension | 成本中心表特征组实体 | extension | UserDefine | hrxc.salarydata.CostCenterCharacteristics |  |  | nullable |
| 9 | id | 主键 | ID | long | Long |  |  | nullable,REF.ID |
| 10 | dr | 逻辑删除标识 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 11 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 12 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | staffId | 员工主键 | staff_id | hred.staff.Staff |
| 2 | taxOrgId | 财务组织主键 | tax_org_id | org.func.AdminOrg |
| 3 | taxDeptId | 财务部门主键 | tax_dept_id | org.func.BaseOrgTimeline |
| 4 | taxDeptVid | 财务部门V主键 | tax_dept_vid | org.func.BaseOrgTimeline |
| 5 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
