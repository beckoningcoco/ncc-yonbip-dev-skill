---
tags: [BIP, metadata, HRXZHS_MDD, RsSalarySchemeItem]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 方案关联调薪项目 (HRXZHS_MDD.rsSalaryScheme.RsSalarySchemeItem)

> Platform: BIP V5 | Table: rs_salary_scheme_item | Schema: yonbip-hr-budget

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 方案关联调薪项目 |
| uri | HRXZHS_MDD.rsSalaryScheme.RsSalarySchemeItem |
| tableName | rs_salary_scheme_item |
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

## All Fields (15)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | schemeId | 方案主键 | scheme_id | quote | HRXZHS_MDD.rsSalaryScheme.RsSalaryScheme |  |  | nullable |
| 2 | itemId | 调薪项目主键 | item_id | quote | hrxc.publicItem.WaItem |  |  | nullable |
| 3 | showOrder | 排序号 | show_order | int | Integer |  |  | nullable |
| 4 | ruleSetType | 调薪额度规则设置 | rule_set_type | int | Integer |  |  | nullable |
| 5 | bizRuleId | 业务规则主键 | biz_rule_id | text | String |  |  | nullable |
| 6 | bizRuleName | 业务规则名称 | biz_rule_name | text | String |  |  | nullable |
| 7 | factorId | 引用的影响因素 | factor_id | text | String |  |  | nullable |
| 8 | id | 主键 | id | text | String |  |  | nullable,REF.ID,uiHide |
| 9 | dr | 逻辑删除标识 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 10 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 11 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 12 | creator | 创建人 | creator | quote | base.user.BipUser |  |  | nullable |
| 13 | createTime | 创建时间 | create_time | dateTime | Timestamp |  |  | nullable |
| 14 | modifier | 修改人 | modifier | quote | base.user.BipUser |  |  | nullable |
| 15 | modifyTime | 修改时间 | modify_time | dateTime | Timestamp |  |  | nullable |

---

## Reference Fields (5)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | schemeId | 方案主键 | scheme_id | HRXZHS_MDD.rsSalaryScheme.RsSalaryScheme |
| 2 | itemId | 调薪项目主键 | item_id | hrxc.publicItem.WaItem |
| 3 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 4 | creator | 创建人 | creator | base.user.BipUser |
| 5 | modifier | 修改人 | modifier | base.user.BipUser |
