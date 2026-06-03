---
tags: [BIP, metadata, hrxc, WaScheme]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资方案主表 (hrxc.scheme.WaScheme)

> Platform: BIP V5 | Table: wa_scheme | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资方案主表 |
| uri | hrxc.scheme.WaScheme |
| tableName | wa_scheme |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (7)

| # | Name | URI |
|---|------|-----|
| 1 | 自动编号 (IAutoCode) | voucher.base.IAutoCode |
| 2 | 启用 (IEnable) | ucfbase.ucfbaseItf.IEnable |
| 3 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 4 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 5 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 6 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 7 | 自动编码 (IAutoCode) | ucfbase.ucfbaseItf.IAutoCode |

---

## All Fields (43)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | busiOrg | 组织Id | BUSIORG | quote | org.func.AdminOrg |  |  | nullable |
| 2 | newOrgOid | 组织oid | new_org_oid | quote | org.func.BaseOrgTimeline |  |  | migrationIgnoreRef,nullable |
| 3 | code | 方案编码 | CODE | text | String |  |  | REF.CODE,CODE,nullable,isCode |
| 4 | country | 国家地区ID | country | quote | bd.country.CountryVO |  |  | migrationIgnoreRef,nullable |
| 5 | shareType | 0:不共享 1:直接下级 2:所有下级 | SHARE_TYPE | text | String |  |  | nullable |
| 6 | scopeType | 核算范围类型 0:核算范围scopeStr,1:核算范围业务规则 | SCOPE_TYPE | text | String |  |  | nullable |
| 7 | waSchemeCharacteristics | 发薪方案特征组 | wa_scheme_define_character | UserDefine | hrxc.scheme.WaSchemeCharacteristics |  |  | nullable |
| 8 | settlementFlag | 是否离职结薪 | settlement_flag | int | Integer |  |  | nullable |
| 9 | automaticMatchingFlag | 自动匹配发薪人员 | AUTOMATIC_MATCHING_FLAG | int | Integer |  |  | nullable |
| 10 | name | 方案名称 | NAME | multiLanguage | String |  |  | nullable |
| 11 | taxCurrId | 币种ID | TAX_CURR_ID | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 12 | deductionWay | 扣税方式 | DEDUCTION_WAY | text | String |  |  | nullable |
| 13 | projectIn | 所得项目 | PROJECT_IN | text | String |  |  | nullable |
| 14 | exchangeRateType | 汇率类型ID | EXCHANGE_RATE_TYPE | quote | bd.exchangeRate.ExchangeRateTypeVO |  |  | nullable |
| 15 | periodRuleId | 期间方案 | PERIOD_RULE_ID | quote | hrxc.period.PeriodRule |  |  | nullable |
| 16 | startPeriod | 起始期间ID | START_PERIOD | quote | hrxc.period.PeriodDetail |  |  | nullable |
| 17 | quotationDate | 汇率截至日期 | QUOTATION_DATE | int | Integer |  |  | nullable |
| 18 | schemeType | 方案类型 | SCHEME_TYPE | text | String |  |  | nullable |
| 19 | effectPeriod | 生效期间ID | EFFECT_PERIOD | quote | hrxc.period.PeriodDetail |  |  | nullable |
| 20 | taxTable | 税率表ID | TAX_TABLE | text | String |  |  | nullable |
| 21 | multiProjectIn | 所得项目 | multi_project_in | text | String |  |  | nullable |
| 22 | approveFlag | 需要审批 | APPROVE_FLAG | text | String |  |  | nullable |
| 23 | memo | 方案说明 | MEMO | text | String |  |  | nullable |
| 24 | id | 主键 | ID | text | String |  |  | nullable,uiHide,REF.ID |
| 25 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 26 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 27 | ytenant | 租户 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 28 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable |
| 29 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 30 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable |
| 31 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 32 | enable | 是否启用 | ENABLE | int | Integer |  |  | nullable,uiDesign |
| 33 | enablets | 启用时间 | enablets | dateTime | Timestamp |  |  | nullable |
| 34 | disablets | 停用时间 | disablets | dateTime | Timestamp |  |  | nullable |
| 35 | tenant | 租户id | TENANTID | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 36 | yTenantId | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  |  | nullable |
| 37 | calculateScopeConfigs | 发薪方案计算取值范围 | - | - | hrxc.scheme.WaSchemeCalculateScopeConfig |  |  |  |
| 38 | schemeAuths | 薪资方案授权 | - | - | hrxc.scheme.WaSchemeAuth |  |  |  |
| 39 | schemeItemPayslips | 发薪项目工资单项目设置 | - | - | hrxc.scheme.WaSchemeItemPayslip |  |  |  |
| 40 | schemeItems | 薪资方案项目 | - | - | hrxc.scheme.WaSchemeItem |  |  |  |
| 41 | schemePowers | 薪资方案授权 | - | - | hrxc.scheme.WaSchemePower |  |  |  |
| 42 | schemeScopes | 薪资方案适用范围 | - | - | hrxc.scheme.WaSchemeScope |  |  |  |
| 43 | schemeVersions | 薪资方案版本 | - | - | hrxc.scheme.WaSchemeVersion |  |  |  |

---

## Reference Fields (13)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | busiOrg | 组织Id | BUSIORG | org.func.AdminOrg |
| 2 | newOrgOid | 组织oid | new_org_oid | org.func.BaseOrgTimeline |
| 3 | country | 国家地区ID | country | bd.country.CountryVO |
| 4 | taxCurrId | 币种ID | TAX_CURR_ID | bd.currencytenant.CurrencyTenantVO |
| 5 | exchangeRateType | 汇率类型ID | EXCHANGE_RATE_TYPE | bd.exchangeRate.ExchangeRateTypeVO |
| 6 | periodRuleId | 期间方案 | PERIOD_RULE_ID | hrxc.period.PeriodRule |
| 7 | startPeriod | 起始期间ID | START_PERIOD | hrxc.period.PeriodDetail |
| 8 | effectPeriod | 生效期间ID | EFFECT_PERIOD | hrxc.period.PeriodDetail |
| 9 | ytenant | 租户 | ytenant_id | yht.tenant.YhtTenant |
| 10 | creator | 创建人 | CREATOR | base.user.BipUser |
| 11 | modifier | 修改人 | MODIFIER | base.user.BipUser |
| 12 | tenant | 租户id | TENANTID | yht.tenant.YhtTenant |
| 13 | yTenantId | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (7)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | schemeVersions | 薪资方案版本 | hrxc.scheme.WaSchemeVersion |
| 2 | schemePowers | 薪资方案授权 | hrxc.scheme.WaSchemePower |
| 3 | schemeAuths | 薪资方案授权 | hrxc.scheme.WaSchemeAuth |
| 4 | calculateScopeConfigs | 发薪方案计算取值范围 | hrxc.scheme.WaSchemeCalculateScopeConfig |
| 5 | schemeScopes | 薪资方案适用范围 | hrxc.scheme.WaSchemeScope |
| 6 | schemeItems | 薪资方案项目 | hrxc.scheme.WaSchemeItem |
| 7 | schemeItemPayslips | 发薪项目工资单项目设置 | hrxc.scheme.WaSchemeItemPayslip |
