---
tags: [BIP, metadata, hrxc, WaPayfileDoc]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 发放单人员档案 (hrxc.payfile.WaPayfileDoc)

> Platform: BIP V5 | Table: wa_payfile_doc | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 发放单人员档案 |
| uri | hrxc.payfile.WaPayfileDoc |
| tableName | wa_payfile_doc |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |
| description | 0 停用 1 启用 |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (5)

| # | Name | URI |
|---|------|-----|
| 1 | 启用 (IEnable) | ucfbase.ucfbaseItf.IEnable |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 4 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 5 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (64)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | pkWaScheme | 薪资方案主键 | PK_WA_SCHEME | text | String |  |  | nullable |
| 2 | dependPayfileId | 依赖发放单主键 | DEPEND_PAYFILE_ID | quote | hrxc.payfile.WaPayfile |  |  | nullable |
| 3 | auditFlag | 审批状态(汇总用) | AUDIT_FLAG | int | Integer |  |  | nullable |
| 4 | calculateFlag | 计算状态 | CALCULATE_FLAG | int | Integer |  |  | nullable |
| 5 | staffId | 人员主键 | STAFF_ID | quote | hred.staff.Staff |  |  | dataAuth,data_auth,nullable |
| 6 | staffCode | 人员编码 | STAFF_CODE | text | String |  |  | nullable |
| 7 | dependApproveSortId | 薪资人与法人组织依赖审核关系主键 | DEPEND_APPROVE_SORT_ID | text | String |  |  | nullable |
| 8 | pkStaffDoc | 发薪人员(薪资档案)主键 | PK_STAFF_DOC | quote | hrxc.salaryPay.WaStaffPayDoc |  |  | nullable |
| 9 | taxOrgId | 法人组织主键 | TAX_ORG_ID | text | String |  |  | nullable |
| 10 | orgId | 组织主键 | ORG_ID | text | String |  |  | nullable |
| 11 | deptId | 部门主键 | DEPT_ID | text | String |  |  | dataAuth,data_auth,nullable |
| 12 | deptName | 部门名称 | DEPT_NAME | text | String |  |  | nullable |
| 13 | isEntry | 新进人员 | isentry | text | String |  |  | nullable |
| 14 | isDimission | 离职人员 | isdimission | text | String |  |  | nullable |
| 15 | isChange | 变动人员 | ischange | text | String |  |  | nullable |
| 16 | choose | 是否本发放单人员 | CHOOSE | int | Integer |  |  | nullable |
| 17 | approveFlag | 审核状态 | APPROVE_FLAG | int | Integer |  |  | nullable |
| 18 | payFlag | 支付状态 | PAY_FLAG | int | Integer |  |  | nullable |
| 19 | overFlag | 结算标注:0未结算,1已结算 | OVER_FLAG | int | Integer |  |  | nullable |
| 20 | beginDate | 分段开始时间 | BEGIN_DATE | date | Date |  |  | nullable |
| 21 | endDate | 分段结束时间 | END_DATE | date | Date |  |  | nullable |
| 22 | auditComment | 审批意见 | AUDIT_COMMENT | text | String |  |  | nullable |
| 23 | approveComment | 审批意见 | APPROVE_COMMENT | text | String |  |  | nullable |
| 24 | projectInSub | 所得项目子项目 | PROJECT_IN_SUB | text | String |  |  | nullable |
| 25 | taxMonth | 纳税月份 | TAX_MONTH | int | Integer |  |  | nullable |
| 26 | taxYear | 纳税年份 | TAX_YEAR | int | Integer |  |  | nullable |
| 27 | mutiProjectIn | 多所得项目 | MUTI_PROJECT_IN | text | String |  |  | nullable |
| 28 | sourceFrom | 来源 | SOURCE_FROM | int | Integer |  |  | nullable |
| 29 | errorType | 异常类型 | ERROR_TYPE | int | Integer |  |  | nullable |
| 30 | order | 发放单人员顺序 | ORDER | int | Integer |  |  | nullable |
| 31 | withHoldingAgentId | 扣缴义务人主键 | with_holding_agent_id | text | String |  |  | nullable |
| 32 | staffJobIdAuth | 任职主键(用于数据权限) | STAFF_JOB_ID | quote | hrxc.salaryPay.StaffJob |  |  | dataAuth,data_auth,nullable |
| 33 | calTime | 计算时间 | cal_time | timestamp | Timestamp |  |  | nullable |
| 34 | approveTime | 审核时间 | approve_time | timestamp | Timestamp |  |  | nullable |
| 35 | staffJobCode | 人员任职编码 | staff_job_code | text | String |  |  | nullable |
| 36 | calculateSeq | 计算顺序序号 | calculate_seq | int | Integer |  |  | nullable |
| 37 | lastCalRecord | 最终计算结果标识 | last_cal_record | int | Integer |  |  | nullable |
| 38 | deptPath1 | 部门路径1 | dept_path_1 | quote | org.func.AdminOrg |  |  | nullable |
| 39 | deptPath2 | 部门路径2 | dept_path_2 | quote | org.func.AdminOrg |  |  | nullable |
| 40 | deptPath3 | 部门路径3 | dept_path_3 | quote | org.func.AdminOrg |  |  | nullable |
| 41 | deptPath4 | 部门路径4 | dept_path_4 | quote | org.func.AdminOrg |  |  | nullable |
| 42 | deptPath5 | 部门路径5 | dept_path_5 | quote | org.func.AdminOrg |  |  | nullable |
| 43 | deptPath6 | 部门路径6 | dept_path_6 | quote | org.func.AdminOrg |  |  | nullable |
| 44 | deptPath7 | 部门路径7 | dept_path_7 | quote | org.func.AdminOrg |  |  | nullable |
| 45 | deptPath8 | 部门路径8 | dept_path_8 | quote | org.func.AdminOrg |  |  | nullable |
| 46 | staffName | 人员名称 | STAFF_NAME | text | String |  |  | nullable |
| 47 | pkWaPayfile | 发放单主键 | PK_WA_PAYFILE | quote | hrxc.payfile.WaPayfile |  |  | nullable |
| 48 | orgName | 组织 | ORG_NAME | text | String |  |  | nullable |
| 49 | staffJobId | 任职 | STAFF_JOB_ID | quote | hred.staff.StaffJob |  |  | dataAuth,data_auth,nullable |
| 50 | parentId | 汇总数据主键 | PARENT_ID | text | String |  |  | nullable |
| 51 | id | 主键 | ID | text | String |  |  | nullable,REF.ID |
| 52 | dr | 逻辑删除标识 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 53 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 54 | ytenant | 租户 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 55 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable |
| 56 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 57 | enable | 启用 | enable | singleOption | bd.systemEnum.sys_intboolean |  |  | nullable,uiDesign |
| 58 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 59 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 60 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable |
| 61 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 62 | yTenantId | 友户通租户主键 | ytenant_id | text | String |  |  | nullable |
| 63 | tenant | 租户主键(旧) | TENANTID | text | String |  | Y | nullable,uiHide |
| 64 | ts | 时间戳(旧) | TS | timestamp | Timestamp |  |  | nullable |

---

## Reference Fields (17)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | dependPayfileId | 依赖发放单主键 | DEPEND_PAYFILE_ID | hrxc.payfile.WaPayfile |
| 2 | staffId | 人员主键 | STAFF_ID | hred.staff.Staff |
| 3 | pkStaffDoc | 发薪人员(薪资档案)主键 | PK_STAFF_DOC | hrxc.salaryPay.WaStaffPayDoc |
| 4 | staffJobIdAuth | 任职主键(用于数据权限) | STAFF_JOB_ID | hrxc.salaryPay.StaffJob |
| 5 | deptPath1 | 部门路径1 | dept_path_1 | org.func.AdminOrg |
| 6 | deptPath2 | 部门路径2 | dept_path_2 | org.func.AdminOrg |
| 7 | deptPath3 | 部门路径3 | dept_path_3 | org.func.AdminOrg |
| 8 | deptPath4 | 部门路径4 | dept_path_4 | org.func.AdminOrg |
| 9 | deptPath5 | 部门路径5 | dept_path_5 | org.func.AdminOrg |
| 10 | deptPath6 | 部门路径6 | dept_path_6 | org.func.AdminOrg |
| 11 | deptPath7 | 部门路径7 | dept_path_7 | org.func.AdminOrg |
| 12 | deptPath8 | 部门路径8 | dept_path_8 | org.func.AdminOrg |
| 13 | pkWaPayfile | 发放单主键 | PK_WA_PAYFILE | hrxc.payfile.WaPayfile |
| 14 | staffJobId | 任职 | STAFF_JOB_ID | hred.staff.StaffJob |
| 15 | ytenant | 租户 | ytenant_id | yht.tenant.YhtTenant |
| 16 | creator | 创建人 | CREATOR | base.user.BipUser |
| 17 | modifier | 修改人 | MODIFIER | base.user.BipUser |

---

## Enum Fields (1)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | enable | 启用 | enable | bd.systemEnum.sys_intboolean |

---

## Enum Value Details

### 启用 (enable) -> enable
> Enum: bd.systemEnum.sys_intboolean

| code | value | name |
|------|-------|------|
| 0 | 0 | 停用 |
| 1 | 1 | 启用 |
