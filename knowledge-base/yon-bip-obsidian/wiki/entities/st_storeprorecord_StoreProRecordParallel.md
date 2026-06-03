---
tags: [BIP, metadata, st, StoreProRecordParallel]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 产品入库单主表平行表 (st.storeprorecord.StoreProRecordParallel)

> Platform: BIP V5 | Module: st | Table: st_storeprorecord_parallel | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 产品入库单主表平行表 |
| uri | st.storeprorecord.StoreProRecordParallel |
| tableName | st_storeprorecord_parallel |
| domain | ustock |
| applicationCode | ST |
| superUri | ? |
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

## All Fields (2)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | id | 产品入库单主表id | id | quote | st.storeprorecord.StoreProRecord |  |  | nullable |
| 2 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (2)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | id | 产品入库单主表id | id | st.storeprorecord.StoreProRecord |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
