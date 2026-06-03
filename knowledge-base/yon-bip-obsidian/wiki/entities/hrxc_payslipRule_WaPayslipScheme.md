---
tags: [BIP, metadata, hrxc, WaPayslipScheme]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 工资条方案 (hrxc.payslipRule.WaPayslipScheme)

> Platform: BIP V5 | Table: wa_payslip_scheme | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 工资条方案 |
| uri | hrxc.payslipRule.WaPayslipScheme |
| tableName | wa_payslip_scheme |
| domain | yonbip-hr-paybiz |
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
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 3 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 4 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 5 | 自动编码 (IAutoCode) | ucfbase.ucfbaseItf.IAutoCode |

---

## All Fields (30)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | orgId | 组织主键 | org_id | quote | org.func.AdminOrg |  |  | isMasterOrg,nullable |
| 2 | noticeType | 通知设置 1:发送通知 2:不发送通知 3:发布时需确认 | notice_type | int | Integer |  |  | nullable |
| 3 | schemeAuthId | 方案授权ID | scheme_auth_id | quote | hrxc.scheme.WaSchemeAuth |  |  | nullable |
| 4 | isEnable | 1:启用,0:停用 | is_enable | int | Integer |  |  | nullable |
| 5 | excludeRuleName | 排除人员规则名称 | excludeRule_name | text | String |  |  | nullable |
| 6 | includeRuleName | 适用人员规则名称 | includeRule_name | text | String |  |  | nullable |
| 7 | includeRuleId | 适用人员规则 | includeRule_id | text | String |  |  | nullable |
| 8 | payslipCategoryItemList | 工资条明细设置 | payslipCategoryItemList | quote | hrxc.payslipRule.WaPayslipSchemeCategoryitem |  |  | nullable |
| 9 | payslipTopItemList | 工资条默认项目设置 | payslipTopItemList | quote | hrxc.payslipRule.WaPayslipSchemeTopitem |  |  | nullable |
| 10 | zeroShow | 是否显示零值;1:显示,0:不显示 | zero_show | int | Integer |  |  | nullable |
| 11 | excludeRuleId | 排除人员规则 | excludeRule_id | text | String |  |  | nullable |
| 12 | name | 方案名称 | name | text | String |  |  | nullable |
| 13 | code | 编码 | code | text | String |  |  | isCode,nullable |
| 14 | periodEffective | 生效日期 | period_effective | text | String |  |  | nullable |
| 15 | datasource | 工资条来源 | datasource | int | Integer |  |  | nullable |
| 16 | description | 说明 | description | text | String |  |  | nullable |
| 17 | waSchemeId | 发薪方案id | wa_scheme_id | quote | hrxc.scheme.WaScheme |  |  | nullable |
| 18 | versionId | 发薪方案版本id | version_id | text | String |  |  | nullable |
| 19 | type | 工资单样式设置方式 | type | int | Integer |  |  | nullable |
| 20 | reportId | 工资单样式模版id | report_id | text | String |  |  | nullable |
| 21 | reportName | 工资单样式模版 | report_name | text | String |  |  | nullable |
| 22 | id | id | id | text | String |  |  | nullable,REF.ID,uiHide |
| 23 | dr | 逻辑删除标记 | dr | short | Short |  | Y | notGenerate,nullable,uiHide |
| 24 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 25 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 26 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable,migrationIgnoreRef |
| 27 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 28 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable,migrationIgnoreRef |
| 29 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 30 | tenant | 租户ID | tenant_id | text | String |  | Y | nullable,uiHide |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orgId | 组织主键 | org_id | org.func.AdminOrg |
| 2 | schemeAuthId | 方案授权ID | scheme_auth_id | hrxc.scheme.WaSchemeAuth |
| 3 | waSchemeId | 发薪方案id | wa_scheme_id | hrxc.scheme.WaScheme |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 5 | creator | 创建人 | CREATOR | base.user.BipUser |
| 6 | modifier | 修改人 | MODIFIER | base.user.BipUser |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | payslipCategoryItemList | 工资条明细设置 | hrxc.payslipRule.WaPayslipSchemeCategoryitem |
| 2 | payslipTopItemList | 工资条默认项目设置 | hrxc.payslipRule.WaPayslipSchemeTopitem |
