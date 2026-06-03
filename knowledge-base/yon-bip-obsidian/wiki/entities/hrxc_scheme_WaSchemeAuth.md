---
tags: [BIP, metadata, hrxc, WaSchemeAuth]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 薪资方案授权 (hrxc.scheme.WaSchemeAuth)

> Platform: BIP V5 | Table: wa_scheme_auth | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 薪资方案授权 |
| uri | hrxc.scheme.WaSchemeAuth |
| tableName | wa_scheme_auth |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 审计信息 (IAuditInfo) | ucfbase.ucfbaseItf.IAuditInfo |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |
| 4 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (19)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | schemeId | 方案主键 | SCHEME_ID | quote | hrxc.scheme.WaScheme |  |  | nullable |
| 2 | authBusiorg | 授权组织Id | AUTH_BUSIORG | quote | org.func.AdminOrg |  |  | isMasterOrg,nullable |
| 3 | scopeStr | 核算范围 | SCOPE_STR | text | String |  |  | nullable |
| 4 | name | name | NAME | multiLanguage | String |  |  | nullable |
| 5 | code | code | code | text | String |  |  | nullable |
| 6 | scopeBusinessRuleId | 核算范围业务规则id | scope_business_rule_id | quote | hrcb.rule_bizrule.BizRule |  |  | nullable |
| 7 | newOrgOid | 授权组织Id | new_org_oid | quote | org.func.BaseOrgTimeline |  |  | migrationIgnoreRef,nullable |
| 8 | id | ID | ID | text | String |  |  | nullable,uiHide,REF.ID |
| 9 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 10 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 11 | ytenant | 租户 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 12 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable |
| 13 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 14 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable |
| 15 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 16 | yTenantId | 友户通租户主键 | ytenant_id | quote | yht.tenant.YhtTenant |  |  | nullable |
| 17 | tenant | 租户主键(旧) | TENANTID | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |
| 18 | automaticMatchingFlag | 自动匹配发薪人员 | AUTOMATIC_MATCHING_FLAG | int | Integer |  |  | nullable |
| 19 | enable | 0:不启用 1:启用 | ENABLE | int | Integer |  |  | nullable |

---

## Reference Fields (9)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | schemeId | 方案主键 | SCHEME_ID | hrxc.scheme.WaScheme |
| 2 | authBusiorg | 授权组织Id | AUTH_BUSIORG | org.func.AdminOrg |
| 3 | scopeBusinessRuleId | 核算范围业务规则id | scope_business_rule_id | hrcb.rule_bizrule.BizRule |
| 4 | newOrgOid | 授权组织Id | new_org_oid | org.func.BaseOrgTimeline |
| 5 | ytenant | 租户 | ytenant_id | yht.tenant.YhtTenant |
| 6 | creator | 创建人 | CREATOR | base.user.BipUser |
| 7 | modifier | 修改人 | MODIFIER | base.user.BipUser |
| 8 | yTenantId | 友户通租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 9 | tenant | 租户主键(旧) | TENANTID | yht.tenant.YhtTenant |
