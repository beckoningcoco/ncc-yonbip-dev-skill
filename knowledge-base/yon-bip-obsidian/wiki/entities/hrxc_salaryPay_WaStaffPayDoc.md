---
tags: [BIP, metadata, hrxc, WaStaffPayDoc]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资档案 (hrxc.salaryPay.WaStaffPayDoc)

> Platform: BIP V5 | Table: wa_staff_pay_doc | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资档案 |
| uri | hrxc.salaryPay.WaStaffPayDoc |
| tableName | wa_staff_pay_doc |
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

## All Fields (49)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | staffId | 员工主键 | STAFF_ID | quote | hred.staff.Staff |  |  | nullable |
| 2 | schemeAuthId | 发薪方案主键 | SCHEME_AUTH_ID | quote | hrxc.scheme.WaSchemeAuth |  |  | nullable |
| 3 | waSchemeName | 薪资方案名称 | WA_SCHEME_NAME | text | String |  |  | nullable |
| 4 | beginDate | 开始时间 | BEGIN_DATE | date | Date |  |  | nullable |
| 5 | endDate | 结束时间 | END_DATE | date | Date |  |  | nullable |
| 6 | deptPath1 | 部门路径1 | STAFFDOC_DEPT_PATH_1 | quote | org.func.AdminOrg |  |  | nullable |
| 7 | deptPath2 | 部门路径2 | STAFFDOC_DEPT_PATH_2 | quote | org.func.AdminOrg |  |  | nullable |
| 8 | deptPath3 | 部门路径3 | STAFFDOC_DEPT_PATH_3 | quote | org.func.AdminOrg |  |  | nullable |
| 9 | deptPath4 | 部门路径4 | STAFFDOC_DEPT_PATH_4 | quote | org.func.AdminOrg |  |  | nullable |
| 10 | deptPath5 | 部门路径5 | STAFFDOC_DEPT_PATH_5 | quote | org.func.AdminOrg |  |  | nullable |
| 11 | deptPath6 | 部门路径6 | STAFFDOC_DEPT_PATH_6 | quote | org.func.AdminOrg |  |  | nullable |
| 12 | deptPath7 | 部门路径7 | STAFFDOC_DEPT_PATH_7 | quote | org.func.AdminOrg |  |  | nullable |
| 13 | deptPath8 | 部门路径8 | STAFFDOC_DEPT_PATH_8 | quote | org.func.AdminOrg |  |  | nullable |
| 14 | staffJobCode | 任职编码 | STAFF_JOB_CODE | text | String |  |  | nullable |
| 15 | staffCode | 员工code | STAFF_CODE | text | String |  |  | nullable |
| 16 | staffName | 员工姓名 | STAFF_NAME | text | String |  |  | nullable |
| 17 | lastFlag | 是否是在当前薪资方案最后一条 | LAST_FLAG | int | Integer |  |  | nullable |
| 18 | staffJobId | 任职主键 | STAFF_JOB_ID | quote | hred.staff.StaffJob |  |  | data_auth,nullable |
| 19 | taxOrgId | 财务组织主键 | TAX_ORG_ID | quote | org.func.AdminOrg |  |  | nullable |
| 20 | taxDeptId | 财务部门主键 | TAX_DEPT_ID | quote | org.func.BaseOrgTimeline |  |  | nullable |
| 21 | taxDeptVid | 财务部门v主键 | TAX_DEPT_VID | quote | org.func.BaseOrgTimeline |  |  | nullable |
| 22 | partFlag | 其他任职 | PART_FLAG | int | Integer |  |  | nullable |
| 23 | orgId | 任职组织主键 | ORG_ID | quote | org.func.AdminOrg |  |  | nullable |
| 24 | perTaxOrgId | 个税申报组织主键 | PER_TAX_ORG_ID | quote | org.func.BaseOrgTimeline |  |  | nullable |
| 25 | orgName | 任职组织 | ORG_NAME | text | String |  |  | nullable |
| 26 | perTaxOrgName | 个税申报组织 | PER_TAX_ORG_NAME | text | String |  |  | nullable |
| 27 | deptId | 任职部门主键 | DEPT_ID | quote | org.func.AdminOrg |  |  | nullable |
| 28 | taxType | 扣税标志 | TAX_TYPE | int | Integer |  |  | nullable |
| 29 | perTaxOrgVid | 个税申报组织v主键 | PER_TAX_ORG_VID | quote | org.func.BaseOrgTimeline |  |  | nullable |
| 30 | deptName | 任职部门 | DEPT_NAME | text | String |  |  | nullable |
| 31 | taxTableId | 税率表主键 | TAX_TABLE_ID | text | String |  |  | nullable |
| 32 | insureId | 险种主键 | INSURE_ID | text | String |  |  | nullable |
| 33 | postId | 职位主键 | POST_ID | text | String |  |  | nullable |
| 34 | isDerate | 减免税 | IS_DERATE | int | Integer |  |  | nullable |
| 35 | postName | 职位 | POST_NAME | text | String |  |  | nullable |
| 36 | derateptg | 减免税比例 | DERATEPTG | number | Decimal |  |  | nullable |
| 37 | extension | 薪资档案表自定义项 | extension | UserDefine | hrxc.salaryPay.WaStaffPayDocCharacteristics |  |  | nullable |
| 38 | mutiProjectIn | 所得项目类型 | MUTI_PROJECT_IN | text | String |  |  | nullable |
| 39 | id | 主键 | ID | text | String |  |  | nullable,REF.ID |
| 40 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 41 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 42 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 43 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 44 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 45 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 46 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 47 | yTenantId | 友户通租户主键 | ytenant_id | text | String |  |  | nullable |
| 48 | tenant | 租户ID | TENANTID | text | String |  | Y | nullable,uiHide |
| 49 | waInsures | 险种 | - | - | hrxc.salaryPay.WaInsure |  |  |  |

---

## Reference Fields (21)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | staffId | 员工主键 | STAFF_ID | hred.staff.Staff |
| 2 | schemeAuthId | 发薪方案主键 | SCHEME_AUTH_ID | hrxc.scheme.WaSchemeAuth |
| 3 | deptPath1 | 部门路径1 | STAFFDOC_DEPT_PATH_1 | org.func.AdminOrg |
| 4 | deptPath2 | 部门路径2 | STAFFDOC_DEPT_PATH_2 | org.func.AdminOrg |
| 5 | deptPath3 | 部门路径3 | STAFFDOC_DEPT_PATH_3 | org.func.AdminOrg |
| 6 | deptPath4 | 部门路径4 | STAFFDOC_DEPT_PATH_4 | org.func.AdminOrg |
| 7 | deptPath5 | 部门路径5 | STAFFDOC_DEPT_PATH_5 | org.func.AdminOrg |
| 8 | deptPath6 | 部门路径6 | STAFFDOC_DEPT_PATH_6 | org.func.AdminOrg |
| 9 | deptPath7 | 部门路径7 | STAFFDOC_DEPT_PATH_7 | org.func.AdminOrg |
| 10 | deptPath8 | 部门路径8 | STAFFDOC_DEPT_PATH_8 | org.func.AdminOrg |
| 11 | staffJobId | 任职主键 | STAFF_JOB_ID | hred.staff.StaffJob |
| 12 | taxOrgId | 财务组织主键 | TAX_ORG_ID | org.func.AdminOrg |
| 13 | taxDeptId | 财务部门主键 | TAX_DEPT_ID | org.func.BaseOrgTimeline |
| 14 | taxDeptVid | 财务部门v主键 | TAX_DEPT_VID | org.func.BaseOrgTimeline |
| 15 | orgId | 任职组织主键 | ORG_ID | org.func.AdminOrg |
| 16 | perTaxOrgId | 个税申报组织主键 | PER_TAX_ORG_ID | org.func.BaseOrgTimeline |
| 17 | deptId | 任职部门主键 | DEPT_ID | org.func.AdminOrg |
| 18 | perTaxOrgVid | 个税申报组织v主键 | PER_TAX_ORG_VID | org.func.BaseOrgTimeline |
| 19 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 20 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 21 | modifier | 修改人 | MODIFIER | hred.staff.Staff |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | waInsures | 险种 | hrxc.salaryPay.WaInsure |
