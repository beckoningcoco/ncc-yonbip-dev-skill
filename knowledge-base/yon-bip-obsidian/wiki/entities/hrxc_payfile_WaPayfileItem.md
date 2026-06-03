---
tags: [BIP, metadata, hrxc, WaPayfileItem]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 发薪项目 (hrxc.payfile.WaPayfileItem)

> Platform: BIP V5 | Table: wa_payfile_item | Schema: yonbip-hr-paybiz

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 发薪项目 |
| uri | hrxc.payfile.WaPayfileItem |
| tableName | wa_payfile_item |
| domain | yonbip-hr-paybiz |
| applicationCode | HRXZHS_MDD |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | ID |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 2 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 3 | 逻辑删除相关 (LogicDelete) | ucfbase.ucfbaseItf.LogicDelete |

---

## All Fields (10)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | pkPayfile | 薪资发放单 | PK_PAYFILE | quote | hrxc.payfile.WaPayfile |  |  | nullable |
| 2 | pkWaSchemeItem | 薪资发放项目主键 | PK_WA_SCHEME_ITEM | quote | hrxc.scheme.WaSchemeItem |  |  | nullable |
| 3 | ownershipTable | 薪资项目所在表 | ownership_table | text | String |  |  | nullable |
| 4 | formula | 公式 | FORMULA | text | String |  |  | nullable |
| 5 | id | 主键 | ID | text | String |  |  | nullable,REF.ID |
| 6 | dr | 逻辑删除标识 | DR | int | Integer |  | Y | nullable,uiHide,notGenerate |
| 7 | pubts | 时间戳 | TS | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 8 | ytenant | 租户主键 | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 9 | tenant | 租户主键(旧) | TENANTID | text | String |  | Y | nullable,uiHide |
| 10 | yTenantId | 友户通租户主键 | ytenant_id | text | String |  |  | nullable |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | pkPayfile | 薪资发放单 | PK_PAYFILE | hrxc.payfile.WaPayfile |
| 2 | pkWaSchemeItem | 薪资发放项目主键 | PK_WA_SCHEME_ITEM | hrxc.scheme.WaSchemeItem |
| 3 | ytenant | 租户主键 | ytenant_id | yht.tenant.YhtTenant |
