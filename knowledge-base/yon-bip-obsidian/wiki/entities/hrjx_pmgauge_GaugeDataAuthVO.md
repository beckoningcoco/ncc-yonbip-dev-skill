---
tags: [BIP, metadata, hrjx, GaugeDataAuthVO]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 公共考核量表数据权限 (hrjx.pmgauge.GaugeDataAuthVO)

> Platform: BIP V5 | Table: pm_data_auth | Schema: yonbip-hr-pmcore

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 公共考核量表数据权限 |
| uri | hrjx.pmgauge.GaugeDataAuthVO |
| tableName | pm_data_auth |
| domain | yonbip-hr-pmcore |
| applicationCode | HRJX-MDD |
| superUri | ucfbase.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 租户接口 (ITenant) | ucfbase.ucfbaseItf.ITenant |
| 2 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |

---

## All Fields (5)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | id | ID | id | text | String |  |  | nullable,REF.ID,uiHide |
| 2 | orgid | 组织 | orgid | quote | org.func.AdminOrg |  |  | data_auth,nullable |
| 3 | pubts | 时间戳 | pubts | dateTime | Timestamp |  |  | isSyncKey,nullable,uiHide |
| 4 | tenant | 租户ID | tenant_id | text | String |  | Y | nullable,uiHide |
| 5 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (2)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orgid | 组织 | orgid | org.func.AdminOrg |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
