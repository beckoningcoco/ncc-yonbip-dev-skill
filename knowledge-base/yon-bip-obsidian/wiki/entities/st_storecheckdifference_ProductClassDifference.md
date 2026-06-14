---
tags: [BIP, metadata, st, ProductClassDifference]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 盘点品类 (st.storecheckdifference.ProductClassDifference)

> Platform: BIP V5 | Module: st | Table: st_storecheckplan_productclass | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 盘点品类 |
| uri | st.storecheckdifference.ProductClassDifference |
| tableName | st_storecheckplan_productclass |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (1)

| # | Name | URI |
|---|------|-----|
| 1 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (5)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 2 | mainidinclass | 盘点差异单主表id | mainidinclass | quote | st.storecheckdifference.StoreCheckDifference |  |  | nullable |
| 3 | productClass | 盘点品类 | productclass | quote | pc.cls.ManagementClass |  |  | nullable |
| 4 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 5 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (3)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | mainidinclass | 盘点差异单主表id | mainidinclass | st.storecheckdifference.StoreCheckDifference |
| 2 | productClass | 盘点品类 | productclass | pc.cls.ManagementClass |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
