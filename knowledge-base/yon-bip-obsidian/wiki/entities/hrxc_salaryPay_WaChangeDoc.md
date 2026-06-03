---
tags: [BIP, metadata, hrxc, WaChangeDoc]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资变动档案 (hrxc.salaryPay.WaChangeDoc)

> Platform: BIP V5 | Table: wa_changedoc | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资变动档案 |
| uri | hrxc.salaryPay.WaChangeDoc |
| tableName | wa_changedoc |
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

## All Fields (38)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | pkWaItem | 项目主键 | PK_WA_ITEM | text | String |  |  | nullable |
| 2 | waItemName | 项目名称 | WA_ITEM_NAME | text | String |  |  | nullable |
| 3 | staffId | 员工主键 | STAFF_ID | text | String |  |  | nullable |
| 4 | staffCode | 员工code | STAFF_CODE | text | String |  |  | nullable |
| 5 | staffName | 员工姓名 | STAFF_NAME | text | String |  |  | nullable |
| 6 | staffJobId | 任职主键 | STAFF_JOB_ID | text | String |  |  | nullable |
| 7 | isMainJob |  | ismainjob | int | Integer |  |  | nullable |
| 8 | orgId |  | ORG_ID | text | String |  |  | nullable |
| 9 | deptId |  | DEPT_ID | text | String |  |  | nullable |
| 10 | beginDate | 开始日期 | BEGIN_DATE | date | Date |  |  | nullable |
| 11 | endDate | 结束日期 | END_DATE | date | Date |  |  | nullable |
| 12 | negotiation | 是否是谈判工资 0:否 1:是 | NEGOTIATION | int | Integer |  |  | nullable |
| 13 | isLegal |  | IS_LEGAL | int | Integer |  |  | nullable |
| 14 | businessTypeId |  | BUSINESS_TYPE_ID | text | String |  |  | nullable |
| 15 | salaryStandardTypeName | 薪资标准类别名称 | SALARY_STANDARD_TYPE_NAME | text | String |  |  | nullable |
| 16 | salaryStandardType | 薪资标准类别 | SALARY_STANDARD_TYPE | text | String |  |  | nullable |
| 17 | salaryStandard | 薪资标准 | SALARY_STANDARD | text | String |  |  | nullable |
| 18 | salaryStandardName | 薪资标准名称 | SALARY_STANDARD_NAME | text | String |  |  | nullable |
| 19 | salary | 薪资 | salary | number | Decimal |  |  | nullable |
| 20 | salaryLevelScope | 薪资级别金额范围 | SALARY_LEVEL_SCOPE | text | String |  |  | nullable |
| 21 | salaryChangeReason | 定调薪原因 | SALARY_CHANGE_REASON | text | String |  |  | nullable |
| 22 | salaryChangeDate | 定调薪日期 | SALARY_CHANGE_DATE | date | Date |  |  | nullable |
| 23 | gradeVersionId | 薪资标准版本ID | GRADE_VERSION_ID | text | String |  |  | nullable |
| 24 | baseSalaryStandard | 基准薪资标准 | BASE_SALARY_STANDARD | text | String |  |  | nullable |
| 25 | changeType | 变动类型:岗位变化、学历变化、知浮固定、奖惩、转正定级、人工纠错、标准调整、其他 | CHANGE_TYPE | int | Integer |  |  | nullable |
| 26 | lastFlag | 是否是最新的方案(变更历史用)1-是 0-否 | LAST_FLAG | int | Integer |  |  | nullable |
| 27 | changeForm | 来源:0-申请单 1-档案 | CHANGE_FROM | int | Integer |  |  | nullable |
| 28 | salaryUpdateReason | 来源:0-申请单 1-档案 | SALARY_UPDATE_REASON | text | String |  |  | nullable |
| 29 | id | 主键 | ID | text | String |  |  | nullable,REF.ID |
| 30 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 31 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 32 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 33 | creator | 创建人 | CREATOR | quote | hred.staff.Staff |  |  | nullable |
| 34 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 35 | modifier | 修改人 | MODIFIER | quote | hred.staff.Staff |  |  | nullable |
| 36 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 37 | yTenantId | 友户通租户主键 | ytenant_id | text | String |  |  | nullable |
| 38 | tenant | 租户主键(旧) | TENANTID | text | String |  | Y | nullable,uiHide |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 2 | creator | 创建人 | CREATOR | hred.staff.Staff |
| 3 | modifier | 修改人 | MODIFIER | hred.staff.Staff |
