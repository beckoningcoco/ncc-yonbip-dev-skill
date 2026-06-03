---
tags: [BIP, metadata, hrxc, WaSchemeItemPayslip]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 发薪项目工资单项目设置 (hrxc.scheme.WaSchemeItemPayslip)

> Platform: BIP V5 | Table: wa_scheme_item_payslip | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 发薪项目工资单项目设置 |
| uri | hrxc.scheme.WaSchemeItemPayslip |
| tableName | wa_scheme_item_payslip |
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

## All Fields (15)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | busiOrg | 组织 | BUSIORG | quote | org.func.BaseOrg |  |  | isMasterOrg,nullable |
| 2 | itemId | 项目主键 | ITEM_ID | quote | hrxc.scheme.WaSchemeItem |  |  | nullable |
| 3 | schemeId | 方案主键 | SCHEME_ID | quote | hrxc.scheme.WaScheme |  |  | nullable |
| 4 | showOrder | 显示顺序 | SHOW_ORDER | int | Integer |  |  | nullable |
| 5 | versionId | 版本主键 | VERSION_ID | quote | hrxc.scheme.WaSchemeVersion |  |  | nullable |
| 6 | id | 主键 | ID | text | String |  |  | nullable,uiHide,REF.ID |
| 7 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 8 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,uiHide,isSyncKey |
| 9 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 10 | creator | 创建人 | CREATOR | quote | base.user.BipUser |  |  | nullable |
| 11 | createTime | 创建时间 | CREATIONTIME | timestamp | Timestamp |  |  | nullable |
| 12 | modifier | 修改人 | MODIFIER | quote | base.user.BipUser |  |  | nullable |
| 13 | modifyTime | 修改时间 | MODIFIEDTIME | timestamp | Timestamp |  |  | nullable |
| 14 | yTenantId | 友户通租户主键 | ytenant_id | quote | yht.tenant.YhtTenant |  |  | nullable |
| 15 | tenant | 租户主键(旧) | TENANTID | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide |

---

## Reference Fields (9)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | busiOrg | 组织 | BUSIORG | org.func.BaseOrg |
| 2 | itemId | 项目主键 | ITEM_ID | hrxc.scheme.WaSchemeItem |
| 3 | schemeId | 方案主键 | SCHEME_ID | hrxc.scheme.WaScheme |
| 4 | versionId | 版本主键 | VERSION_ID | hrxc.scheme.WaSchemeVersion |
| 5 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 6 | creator | 创建人 | CREATOR | base.user.BipUser |
| 7 | modifier | 修改人 | MODIFIER | base.user.BipUser |
| 8 | yTenantId | 友户通租户主键 | ytenant_id | yht.tenant.YhtTenant |
| 9 | tenant | 租户主键(旧) | TENANTID | yht.tenant.YhtTenant |
