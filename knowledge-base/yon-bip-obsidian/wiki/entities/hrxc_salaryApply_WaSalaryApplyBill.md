---
tags: [BIP, metadata, hrxc, WaSalaryApplyBill]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 定调薪申请 (hrxc.salaryApply.WaSalaryApplyBill)

> Platform: BIP V5 | Table: wa_salary_apply_bill | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 定调薪申请 |
| uri | hrxc.salaryApply.WaSalaryApplyBill |
| tableName | wa_salary_apply_bill |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (6)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 3 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 4 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 5 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |
| 6 | 自动编码 (IAutoCode) | ucfbase.ucfbaseItf.IAutoCode |

---

## All Fields (53)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | status | 单据状态 | status | short | Short |  |  | nullable |
| 2 | tenant | tenant | TENANTID | text | String |  | Y | nullable,uiHide |
| 3 | billTypeId | 单据类型ID | bill_type_id | quote | bd.bill.BillTypeVO |  |  | nullable |
| 4 | transiTypeCode | 交易类型编码 | transi_type_code | text | String |  |  | nullable |
| 5 | dept | 所属部门 | DEPT_ID | quote | bd.adminOrg.AdminOrgVO |  |  | nullable |
| 6 | orgvid | 时间轴所属组织 | ORG_VID | quote | org.func.BaseOrgTimeline |  |  | nullable |
| 7 | approveComment | 审批意见 | APPROVE_COMMENT | text | String |  |  | nullable |
| 8 | approveDate | 审批时间 | APPROVE_DATE | date | Date |  |  | nullable |
| 9 | approveResult | 审批结果0-通过 1-不通过 | APPROVE_RESULT | int | Integer |  |  | nullable |
| 10 | approveSalary | 审批金额 | APPROVE_SALARY | number | Decimal |  |  | nullable |
| 11 | approveType | 审批类型0-直批 1-审批流 | APPROVE_TYPE | int | Integer |  |  | nullable |
| 12 | approveUser | 审批人 | APPROVE_USER_ID | quote | base.user.BipUser |  |  | nullable |
| 13 | businessTypeId | 业务类型主键 | BUSINESS_TYPE_ID | text | String |  |  | nullable |
| 14 | categoryCode | 服务目录code | CATEGORY_CODE | text | String |  |  | nullable |
| 15 | instanceId | 流程实例主键 | INSTANCE_ID | text | String |  |  | nullable |
| 16 | submitDate | 提交日期 | SUBMIT_DATE | date | Date |  |  | nullable |
| 17 | sourceFrom | 来源 | source_from | int | Integer |  |  | nullable |
| 18 | rpaMessage | RPA处理信息 | rpa_message | text | String |  |  | nullable |
| 19 | billFormType | 单据类型 | bill_form_type | int | Integer |  |  | nullable |
| 20 | sourceId | 源单据主键 | source_id | text | String |  |  | nullable |
| 21 | taxCurrId | 币种 | TAX_CURR_ID | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 22 | frequency | 频率 | FREQUENCY_ID | quote | hrcb.common-ref.FrequencyVO |  |  | nullable |
| 23 | preSalarySum | 原金额 | PRE_SALARY_SUM | number | Decimal |  |  | nullable |
| 24 | businessRuleId | 业务规则主键 | BUSINESS_RULE_ID | text | String |  |  | nullable |
| 25 | changeFrom | 单据来源 | change_from | int | Integer |  |  | nullable |
| 26 | sourceBillCode | 关联单据 | source_bill_code | text | String |  |  | nullable |
| 27 | extension | 定调薪申请表特征组实体 | extension | UserDefine | hrxc.salaryApply.WaSalaryApplyBillCharacteristics |  |  | nullable |
| 28 | billTypeCode | 单据类型编码 | bill_type_code | text | String |  |  | nullable |
| 29 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 30 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 31 | deptvid | 时间轴所属部门 | DEPT_VID | quote | bd.adminOrg.AdminOrgVOTimeline |  |  | nullable |
| 32 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 33 | code | 单据编码 | BILL_CODE | text | String |  |  | isCode,nullable |
| 34 | billState | 单据状态 | BILL_STATE | int | Integer |  |  | nullable |
| 35 | applyUser | 申请人ID | APPLY_USER_ID | quote | base.user.BipUser |  |  | data_auth,migrationIgnoreRef,nullable |
| 36 | approvalSalarySum | 审批金额 | APPROVAL_SALARY_SUM | number | Decimal |  |  | nullable |
| 37 | billName | 申请单名称 | BILL_NAME | multiLanguage | String |  |  | isName,nullable,s_mul_language |
| 38 | org | 组织ID | ORG_ID | quote | org.func.BaseOrg |  |  | isMasterOrg,nullable |
| 39 | applySalarySum | 申请金额 | APPLY_SALARY_SUM | number | Decimal |  |  | nullable |
| 40 | refFile | 依据文件 | REF_FILE | text | String |  |  | nullable |
| 41 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 42 | applyDate | 申请日期 | APPLY_DATE | date | Date |  |  | nullable |
| 43 | transiTypeId | 交易类型ID | transi_type_id | quote | bd.bill.TransType |  |  | data_auth,isTransactionType,nullable |
| 44 | isNotify | 通知员工 | IS_NOTIFY | int | Integer |  |  | nullable |
| 45 | id | 主键 | ID | text | String |  |  | nullable,uiHide,REF.ID |
| 46 | dr | 逻辑删除标识 | DR | short | Short |  | Y | nullable,uiHide,notGenerate |
| 47 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 48 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | data_auth,nullable |
| 49 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 50 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable |
| 51 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 52 | applyDetails | 定调薪申请明细表 | - | - | hrxc.salaryApply.WaSalaryApplyDetail |  |  |  |
| 53 | applyPlans | 定调薪薪酬计划申请 | - | - | hrxc.salaryApply.WaSalaryApplyPlanBill |  |  |  |

---

## Reference Fields (13)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | billTypeId | 单据类型ID | bill_type_id | bd.bill.BillTypeVO |
| 2 | dept | 所属部门 | DEPT_ID | bd.adminOrg.AdminOrgVO |
| 3 | orgvid | 时间轴所属组织 | ORG_VID | org.func.BaseOrgTimeline |
| 4 | approveUser | 审批人 | APPROVE_USER_ID | base.user.BipUser |
| 5 | taxCurrId | 币种 | TAX_CURR_ID | bd.currencytenant.CurrencyTenantVO |
| 6 | frequency | 频率 | FREQUENCY_ID | hrcb.common-ref.FrequencyVO |
| 7 | deptvid | 时间轴所属部门 | DEPT_VID | bd.adminOrg.AdminOrgVOTimeline |
| 8 | applyUser | 申请人ID | APPLY_USER_ID | base.user.BipUser |
| 9 | org | 组织ID | ORG_ID | org.func.BaseOrg |
| 10 | transiTypeId | 交易类型ID | transi_type_id | bd.bill.TransType |
| 11 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 12 | creator | 创建人 | CREATOR | base.user.BipUser |
| 13 | modifier | 修改人 | MODIFIER | base.user.BipUser |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | applyPlans | 定调薪薪酬计划申请 | hrxc.salaryApply.WaSalaryApplyPlanBill |
| 2 | applyDetails | 定调薪申请明细表 | hrxc.salaryApply.WaSalaryApplyDetail |
