---
tags: [BIP, metadata, HRXZHS_MDD, RsSalaryRule]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 规则主表 (HRXZHS_MDD.rsRaiseSalaryRules.RsSalaryRule)

> Platform: BIP V5 | Table: rs_salary_rule | Schema: yonbip-hr-budget

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 规则主表 |
| uri | HRXZHS_MDD.rsRaiseSalaryRules.RsSalaryRule |
| tableName | rs_salary_rule |
| domain | yonbip-hr-budget |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 4 | 自动编码 (IAutoCode) | ucfbase.ucfbaseItf.IAutoCode |

---

## All Fields (24)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | code | 编码 | code | text | String |  |  | isCode,nullable |
| 2 | name | 名称 | name | multiLanguage | String |  |  | nullable |
| 3 | orgId | 所属组织 | org_id | quote | org.func.BaseOrg |  |  | data_auth,nullable |
| 4 | typeId | 规则分类 | type_id | quote | HRXZHS_MDD.rsRaiseSalaryRules.RsSalaryType |  |  | nullable |
| 5 | countryId | 国家/地区 | country_id | quote | bd.country.CountryVO |  |  | nullable |
| 6 | applScene | 应用场景 | appl_scene | int | Integer |  |  | nullable |
| 7 | bizScene | 业务场景 | biz_scene | int | Integer |  |  | nullable |
| 8 | enable | 启用状态 | enable | int | Integer |  |  | nullable |
| 9 | effectiveDate | 生效日期 | effective_date | date | Date |  |  | nullable |
| 10 | endDate | 结束日期 | end_date | date | Date |  |  | nullable |
| 11 | newFlag | 最新版本标识 | new_flag | int | Integer |  |  | nullable |
| 12 | version | 版本 | version | text | String |  |  | nullable |
| 13 | memo | 说明 | memo | text | String |  |  | nullable |
| 14 | valueRule | 取值规则 | value_rule | int | Integer |  |  | nullable |
| 15 | id | 主键 | id | text | String |  |  | nullable,uiHide,REF.ID |
| 16 | dr | 逻辑删除标识 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 17 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 18 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 19 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 20 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 21 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 22 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |
| 23 | rsSalaryResults | 规则结果 | - | - | HRXZHS_MDD.rsRaiseSalaryRules.RsSalaryResult |  |  |  |
| 24 | rsSalaryTerms | 规则条件 | - | - | HRXZHS_MDD.rsRaiseSalaryRules.RsSalaryTerms |  |  |  |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orgId | 所属组织 | org_id | org.func.BaseOrg |
| 2 | typeId | 规则分类 | type_id | HRXZHS_MDD.rsRaiseSalaryRules.RsSalaryType |
| 3 | countryId | 国家/地区 | country_id | bd.country.CountryVO |
| 4 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 5 | creator | 创建人 | creator | base.user.BipUser |
| 6 | modifier | 修改人 | modifier | base.user.BipUser |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | rsSalaryResults | 规则结果 | HRXZHS_MDD.rsRaiseSalaryRules.RsSalaryResult |
| 2 | rsSalaryTerms | 规则条件 | HRXZHS_MDD.rsRaiseSalaryRules.RsSalaryTerms |
