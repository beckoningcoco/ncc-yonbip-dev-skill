---
tags: [BIP, metadata, hrxc, WaPaybankConfigGroup]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资发放设置主表 (hrxc.payDeferral.WaPaybankConfigGroup)

> Platform: BIP V5 | Table: wa_paybank_config_group | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资发放设置主表 |
| uri | hrxc.payDeferral.WaPaybankConfigGroup |
| tableName | wa_paybank_config_group |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (26)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | staffId | 员工主键 | staff_id | quote | bd.staff.StaffNew |  |  | dataAuth,data_auth,nullable |
| 2 | staffJobId | 任职组织主键 | staff_job_id | quote | hred.staff.StaffJob |  |  | nullable |
| 3 | payOrg | 所属组织Id | pay_org | quote | org.func.AdminOrg |  |  | nullable |
| 4 | lastFlag | 最新标识 | last_flag | int | Integer |  |  | nullable |
| 5 | orgId | 任职组织Id | org_id | quote | org.func.AdminOrg |  |  | nullable |
| 6 | deptId | 任职部门Id | dept_id | quote | org.func.AdminOrg |  |  | nullable |
| 7 | staffCode | 人员编码 | staff_code | text | String |  |  | nullable |
| 8 | staffName | 员工姓名 | staff_name | text | String |  |  | nullable |
| 9 | mainJob | 任职类型:1主职,0兼职 | main_job | int | Integer |  |  | nullable |
| 10 | changeReason | 变更原因 | change_reason | text | String |  |  | nullable |
| 11 | enable | 启用状态(0未启用、1-已启用) | enable | short | Short |  |  | nullable |
| 12 | effectiveDate | 生效日期 | effective_date | date | Date |  |  | nullable |
| 13 | version | 版本(示例:版本1、版本2...etc) | version | text | String |  |  | nullable |
| 14 | endDate | 结束日期 | end_date | date | Date |  |  | nullable |
| 15 | staffJobCode | 任职编码 | staff_job_code | text | String |  |  | nullable |
| 16 | id | 主键 | id | text | String |  |  | nullable,uiHide,REF.ID |
| 17 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 18 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 19 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable |
| 20 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 21 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable |
| 22 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 23 | yTenantId | 友户通租户主键 | ytenant_id | text | String |  |  | nullable |
| 24 | tenant | 租户主键(旧) | TENANTID | text | String |  | Y | nullable,uiHide |
| 25 | configItemList | 薪资发放设置 | - | - | hrxc.payDeferral.WaPaybankConfig |  |  |  |
| 26 | extension | 薪资支付明细特征组实体 | extension | UserDefine | hrxc.payDeferral.waPaybankConfigGroupCharacteristics |  |  | nullable |

---

## Reference Fields (8)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | staffId | 员工主键 | staff_id | bd.staff.StaffNew |
| 2 | staffJobId | 任职组织主键 | staff_job_id | hred.staff.StaffJob |
| 3 | payOrg | 所属组织Id | pay_org | org.func.AdminOrg |
| 4 | orgId | 任职组织Id | org_id | org.func.AdminOrg |
| 5 | deptId | 任职部门Id | dept_id | org.func.AdminOrg |
| 6 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 7 | creator | 创建人 | CREATOR | base.user.BipUser |
| 8 | modifier | 修改人 | MODIFIER | base.user.BipUser |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | configItemList | 薪资发放设置 | hrxc.payDeferral.WaPaybankConfig |
