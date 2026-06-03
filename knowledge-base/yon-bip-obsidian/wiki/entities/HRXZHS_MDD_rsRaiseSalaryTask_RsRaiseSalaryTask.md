---
tags: [BIP, metadata, HRXZHS_MDD, RsRaiseSalaryTask]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 调薪任务 (HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTask)

> Platform: BIP V5 | Table: rs_raise_salary_task | Schema: yonbip-hr-budget

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 调薪任务 |
| uri | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTask |
| tableName | rs_raise_salary_task |
| domain | yonbip-hr-budget |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (5)

| # | Name | URI |
|---|------|-----|
| 1 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 4 | 自动编码 (IAutoCode) | ucfbase.ucfbaseItf.IAutoCode |
| 5 | 审批流信息 (IApprovalFlow) | base.itf.IApprovalFlow |

---

## All Fields (46)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | org | 所属组织 | org | quote | org.func.BaseOrg |  |  | isMasterOrg,nullable |
| 2 | name | 名称 | name | text | String |  |  | nullable |
| 3 | code | 编码 | code | text | String |  |  | isCode,nullable |
| 4 | taskEffectDate | 任务生效时间 | taskEffectDate | text | String |  |  | nullable |
| 5 | schemeId | 方案主键 | scheme_id | quote | HRXZHS_MDD.rsSalaryScheme.RsSalaryScheme |  |  | nullable |
| 6 | allocationStart | 调薪开始时间 | allocation_start | timestamp | Timestamp |  |  | nullable |
| 7 | allocationEnd | 调薪结束时间 | allocation_end | timestamp | Timestamp |  |  | nullable |
| 8 | isApprove | 是否审批 | is_approve | switch | Boolean |  |  | nullable |
| 9 | raiseSalaryEffectDate | 调薪生效日期 | raise_salary_effect_date | timestamp | Timestamp |  |  | nullable |
| 10 | staffJobDate | 人员任职日期 | staff_job_date | timestamp | Timestamp |  |  | nullable |
| 11 | frequencyId | 基准频率主键 | frequency_id | quote | hrcb.common-ref.FrequencyVO |  |  | nullable |
| 12 | currencyType | 币种 | currency_type | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 13 | exchangeRateType | 汇率类型 | exchange_rate_type | quote | bd.exchangeRate.ExchangeRateTypeVO |  |  | nullable |
| 14 | exchangeRateDeadline | 汇率截止日期 | exchange_rate_deadline | text | String |  |  | nullable |
| 15 | memo | 说明 | memo | text | String |  |  | nullable |
| 16 | annex | 附件 | annex | text | String |  |  | nullable |
| 17 | bizRuleId | 业务规则主键 | biz_rule_id | text | String |  |  | nullable |
| 18 | measureBizRuleId | 测算业务规则主键 | measure_biz_rule_id | text | String |  |  | nullable |
| 19 | status | 状态 | status | text | String |  |  | nullable |
| 20 | raiseSalaryTotalAmount | 调薪包总额 | raise_salary_total_amount | number | Decimal |  |  | nullable |
| 21 | raiseSalaryUnits | 调薪单元 | raise_salary_units | text | String |  |  | nullable |
| 22 | raiseSalaryStaffAmount | 调薪人数 | raise_salary_staff_amount | text | String |  |  | nullable |
| 23 | transiTypeId | 交易类型 | TRANSI_TYPE_ID | text | String |  |  | isTransactionType,nullable |
| 24 | transiTypeCode | 交易类型编码 | TRANSI_TYPE_CODE | text | String |  |  | nullable |
| 25 | transiTypeName | 交易类型名称 | TRANSI_TYPE_NAME | text | String |  |  | nullable |
| 26 | isSync | 是否已经同步定调薪档案  | is_sync | int | Integer |  |  | nullable |
| 27 | isWfControlled | 是否审批流控制 | isWfControlled | switch | Boolean |  |  | nullable,reportHide |
| 28 | verifystate | 审批状态 | verifystate | short | Short |  |  | nullable,reportHide |
| 29 | returncount | 退回次数 | returncount | short | Short |  |  | nullable,reportHide |
| 30 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 31 | dr | 逻辑删除标识 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 32 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 33 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 34 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 35 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 36 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 37 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 38 | enable | 启用 | enable | text | String |  |  | nullable |
| 39 | enablets | 启用时间 | enablets | timestamp | Timestamp |  |  | nullable |
| 40 | disablets | 停用时间 | disablets | timestamp | Timestamp |  |  | nullable |
| 41 | RsRaiseSalaryAllocationStaffDetailList | 调薪任务分配人员明细 | - | - | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationStaffDetail |  |  |  |
| 42 | RsRaiseSalaryAllocationUnitList | 调薪任务分配单元 | - | - | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationUnit |  |  |  |
| 43 | RsRaiseSalaryTaskFactoryList | 调薪任务关联影响因素 | - | - | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTaskFactor |  |  |  |
| 44 | RsRaiseSalaryTaskItem | 调薪任务关联调薪项目 | - | - | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTaskItem |  |  |  |
| 45 | RsRaiseSalaryTaskManageStaffList | 调薪任务管理员 | - | - | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTaskManageStaff |  |  |  |
| 46 | RsRaiseSalaryTaskSceneList | 调薪任务关联调薪场景 | - | - | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTaskScene |  |  |  |

---

## Reference Fields (8)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | org | 所属组织 | org | org.func.BaseOrg |
| 2 | schemeId | 方案主键 | scheme_id | HRXZHS_MDD.rsSalaryScheme.RsSalaryScheme |
| 3 | frequencyId | 基准频率主键 | frequency_id | hrcb.common-ref.FrequencyVO |
| 4 | currencyType | 币种 | currency_type | bd.currencytenant.CurrencyTenantVO |
| 5 | exchangeRateType | 汇率类型 | exchange_rate_type | bd.exchangeRate.ExchangeRateTypeVO |
| 6 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 7 | creator | 创建人 | creator | base.user.BipUser |
| 8 | modifier | 修改人 | modifier | base.user.BipUser |

---

## Child Tables (6)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | RsRaiseSalaryAllocationStaffDetailList | 调薪任务分配人员明细 | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationStaffDetail |
| 2 | RsRaiseSalaryTaskManageStaffList | 调薪任务管理员 | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTaskManageStaff |
| 3 | RsRaiseSalaryTaskFactoryList | 调薪任务关联影响因素 | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTaskFactor |
| 4 | RsRaiseSalaryAllocationUnitList | 调薪任务分配单元 | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryAllocationUnit |
| 5 | RsRaiseSalaryTaskItem | 调薪任务关联调薪项目 | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTaskItem |
| 6 | RsRaiseSalaryTaskSceneList | 调薪任务关联调薪场景 | HRXZHS_MDD.rsRaiseSalaryTask.RsRaiseSalaryTaskScene |
