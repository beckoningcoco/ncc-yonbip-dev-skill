---
tags: [BIP, metadata, HRXZHS_MDD, RsSalarySchemeFactor]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 方案关联影响因素 (HRXZHS_MDD.rsSalaryScheme.RsSalarySchemeFactor)

> Platform: BIP V5 | Table: rs_salary_scheme_factor | Schema: yonbip-hr-budget

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 方案关联影响因素 |
| uri | HRXZHS_MDD.rsSalaryScheme.RsSalarySchemeFactor |
| tableName | rs_salary_scheme_factor |
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
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 3 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |

---

## All Fields (11)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | schemeId | 方案主键 | scheme_id | quote | HRXZHS_MDD.rsSalaryScheme.RsSalaryScheme |  |  | nullable |
| 2 | factorId | 影响因素主键 | factor_id | quote | HRXZHS_MDD.rsRaiseSalaryFactors.RsSalaryFactor |  |  | nullable |
| 3 | showOrder | 排序号 | show_order | int | Integer |  |  | nullable |
| 4 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 5 | dr | 逻辑删除标识 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 6 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 7 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 8 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 9 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 10 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 11 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | schemeId | 方案主键 | scheme_id | HRXZHS_MDD.rsSalaryScheme.RsSalaryScheme |
| 2 | factorId | 影响因素主键 | factor_id | HRXZHS_MDD.rsRaiseSalaryFactors.RsSalaryFactor |
| 3 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 4 | creator | 创建人 | creator | base.user.BipUser |
| 5 | modifier | 修改人 | modifier | base.user.BipUser |
