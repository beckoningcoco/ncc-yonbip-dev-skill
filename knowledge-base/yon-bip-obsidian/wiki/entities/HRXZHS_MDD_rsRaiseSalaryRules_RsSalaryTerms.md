---
tags: [BIP, metadata, HRXZHS_MDD, RsSalaryTerms]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 规则条件 (HRXZHS_MDD.rsRaiseSalaryRules.RsSalaryTerms)

> Platform: BIP V5 | Table: rs_salary_terms | Schema: yonbip-hr-budget

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 规则条件 |
| uri | HRXZHS_MDD.rsRaiseSalaryRules.RsSalaryTerms |
| tableName | rs_salary_terms |
| domain | yonbip-hr-budget |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |

---

## All Fields (23)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | code | 编码 | code | text | String |  |  | nullable |
| 2 | ruleId | 规则主表主键 | rule_id | quote | HRXZHS_MDD.rsRaiseSalaryRules.RsSalaryRule |  |  | nullable |
| 3 | factorId | 影响因素主键 | factor_id | quote | HRXZHS_MDD.rsRaiseSalaryFactors.RsSalaryFactor |  |  | nullable |
| 4 | factorName | 影响因素名称 | factor_name | text | String |  |  | nullable |
| 5 | dataType | 数据类型(0-数值、1-文本、2-日期、3-档案、4-金额) | data_type | int | Integer |  |  | nullable |
| 6 | showOrder | 排序号 | show_order | int | Integer |  |  | nullable |
| 7 | refType | 档案 | ref_type | text | String |  |  | nullable |
| 8 | refTypeName | 档案名称 | ref_type_name | text | String |  |  | nullable |
| 9 | interval | 是否区间(0-否、1-是) | interval | int | Integer |  |  | nullable |
| 10 | defaultValue | 默认取值(0-区间上限、1-中间值、2-区间下限) | default_value | int | Integer |  |  | nullable |
| 11 | currencyId | 币种主键 | currency_id | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 12 | currencyName | 币种名称 | currency_name | text | String |  |  | nullable |
| 13 | tabRefType | 页签参照类型 | tab_ref_type | text | String |  |  | nullable |
| 14 | decimalPlace | 小数位数 | decimal_place | int | Integer |  |  | nullable |
| 15 | id | 主键 | id | text | String |  |  | nullable,uiHide,REF.ID |
| 16 | dr | 逻辑删除标识 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 17 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 18 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 19 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 20 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 21 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 22 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 23 | rsSalaryTermsValues | 规则条件值 | - | - | HRXZHS_MDD.rsRaiseSalaryRules.RsSalaryTermsValue |  |  |  |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ruleId | 规则主表主键 | rule_id | HRXZHS_MDD.rsRaiseSalaryRules.RsSalaryRule |
| 2 | factorId | 影响因素主键 | factor_id | HRXZHS_MDD.rsRaiseSalaryFactors.RsSalaryFactor |
| 3 | currencyId | 币种主键 | currency_id | bd.currencytenant.CurrencyTenantVO |
| 4 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 5 | creator | 创建人 | creator | base.user.BipUser |
| 6 | modifier | 修改人 | modifier | base.user.BipUser |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | rsSalaryTermsValues | 规则条件值 | HRXZHS_MDD.rsRaiseSalaryRules.RsSalaryTermsValue |
