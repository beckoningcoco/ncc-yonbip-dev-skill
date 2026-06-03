---
tags: [BIP, metadata, st, StoreCheckPrepare]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 盘点准备单主表 (st.storecheckprepare.StoreCheckPrepare)

> Platform: BIP V5 | Module: st | Table: st_storecheckprepare | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 盘点准备单主表 |
| uri | st.storecheckprepare.StoreCheckPrepare |
| tableName | st_storecheckprepare |
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

## All Fields (3)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | details | 盘点准备单子表 | - | - | st.storecheckprepare.StoreCheckPrepareDetail |  |  |  |
| 2 | storeCheckPrepareCustomItem | 盘点准备单主表自定义项 | - | - | st.storecheckprepare.StoreCheckPrepareCustomItem |  |  |  |
| 3 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (1)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | details | 盘点准备单子表 | st.storecheckprepare.StoreCheckPrepareDetail |
| 2 | storeCheckPrepareCustomItem | 盘点准备单主表自定义项 | st.storecheckprepare.StoreCheckPrepareCustomItem |
