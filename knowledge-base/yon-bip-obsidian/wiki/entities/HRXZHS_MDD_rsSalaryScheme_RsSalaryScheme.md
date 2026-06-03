---
tags: [BIP, metadata, HRXZHS_MDD, RsSalaryScheme]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 调薪方案主表 (HRXZHS_MDD.rsSalaryScheme.RsSalaryScheme)

> Platform: BIP V5 | Table: rs_salary_scheme | Schema: yonbip-hr-budget

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 调薪方案主表 |
| uri | HRXZHS_MDD.rsSalaryScheme.RsSalaryScheme |
| tableName | rs_salary_scheme |
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
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 4 | 自动编码 (IAutoCode) | ucfbase.ucfbaseItf.IAutoCode |
| 5 | 启用 (IEnable) | ucfbase.ucfbaseItf.IEnable |

---

## All Fields (29)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | name | 名称 | name | multiLanguage | String |  |  | nullable |
| 2 | code | 编码 | code | text | String |  |  | isCode,nullable |
| 3 | org | 组织 | org | quote | org.func.BaseOrg |  |  | data_auth,isMasterOrg,nullable |
| 4 | orgCode | 组织编码 | org_code | text | String |  |  | nullable |
| 5 | frequencyId | 基准频率 | frequency_id | quote | hrcb.common-ref.FrequencyVO |  |  | nullable |
| 6 | currency | 本币 | currency | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 7 | exchangeRateType | 汇率类型 | exchange_rate_type | quote | bd.exchangeRate.ExchangeRateTypeVO |  |  | nullable |
| 8 | exchangeRateDeadline | 汇率截止日期 | exchange_rate_deadline | int | Integer |  |  | nullable |
| 9 | memo | 说明 | memo | text | String |  |  | nullable |
| 10 | newFlag | 最新版本标识(1是,0否) | new_flag | text | String |  |  | nullable |
| 11 | version | 版本名称 | version | text | String |  |  | nullable |
| 12 | effectiveDate | 生效日期 | effective_date | date | Date |  |  | nullable |
| 13 | expireDate | 失效日期 | expire_date | date | Date |  |  | nullable |
| 14 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 15 | dr | 逻辑删除标识 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 16 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 17 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 18 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 19 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 20 | enable | 启用 | enable | singleOption | bd.systemEnum.sys_intboolean |  |  | nullable,uiDesign |
| 21 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 22 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 23 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 24 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 25 | RsSalarySchemeFactorList | 方案关联影响因素 | - | - | HRXZHS_MDD.rsSalaryScheme.RsSalarySchemeFactor |  |  |  |
| 26 | RsSalarySchemeHRList | 方案关联调薪HR | - | - | HRXZHS_MDD.rsSalaryScheme.RsSalarySchemeHR |  |  |  |
| 27 | RsSalarySchemeItemList | 方案关联调薪项目 | - | - | HRXZHS_MDD.rsSalaryScheme.RsSalarySchemeItem |  |  |  |
| 28 | RsSalarySchemeManagerList | 方案关联管理员 | - | - | HRXZHS_MDD.rsSalaryScheme.RsSalarySchemeManager |  |  |  |
| 29 | RsSalarySchemeSceneList | 方案关联调薪场景 | - | - | HRXZHS_MDD.rsSalaryScheme.RsSalarySchemeScene |  |  |  |

---

## Reference Fields (7)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | org | 组织 | org | org.func.BaseOrg |
| 2 | frequencyId | 基准频率 | frequency_id | hrcb.common-ref.FrequencyVO |
| 3 | currency | 本币 | currency | bd.currencytenant.CurrencyTenantVO |
| 4 | exchangeRateType | 汇率类型 | exchange_rate_type | bd.exchangeRate.ExchangeRateTypeVO |
| 5 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 6 | creator | 创建人 | creator | base.user.BipUser |
| 7 | modifier | 修改人 | modifier | base.user.BipUser |

---

## Enum Fields (1)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | enable | 启用 | enable | bd.systemEnum.sys_intboolean |

---

## Child Tables (5)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | RsSalarySchemeFactorList | 方案关联影响因素 | HRXZHS_MDD.rsSalaryScheme.RsSalarySchemeFactor |
| 2 | RsSalarySchemeSceneList | 方案关联调薪场景 | HRXZHS_MDD.rsSalaryScheme.RsSalarySchemeScene |
| 3 | RsSalarySchemeHRList | 方案关联调薪HR | HRXZHS_MDD.rsSalaryScheme.RsSalarySchemeHR |
| 4 | RsSalarySchemeItemList | 方案关联调薪项目 | HRXZHS_MDD.rsSalaryScheme.RsSalarySchemeItem |
| 5 | RsSalarySchemeManagerList | 方案关联管理员 | HRXZHS_MDD.rsSalaryScheme.RsSalarySchemeManager |

---

## Enum Value Details

### 启用 (enable) -> enable
> Enum: bd.systemEnum.sys_intboolean

| code | value | name |
|------|-------|------|
| 0 | 0 | 停用 |
| 1 | 1 | 启用 |
