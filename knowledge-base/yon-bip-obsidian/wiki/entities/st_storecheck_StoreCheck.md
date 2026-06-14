---
tags: [BIP, metadata, st, StoreCheck]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 盘点单主表 (st.storecheck.StoreCheck)

> Platform: BIP V5 | Module: st | Table: st_storecheck | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 盘点单主表 |
| uri | st.storecheck.StoreCheck |
| tableName | st_storecheck |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | ? |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 表头整单合计信息 (IHeadTotalData) | retail.voucher.IHeadTotalData |
| 2 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (4)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | totalQuantity | 整单数量 | fTotalQuantity | number | Decimal |  |  | nullable,reportHide |
| 2 | details | 盘点单子表 | - | - | st.storecheck.StoreCheckDetail |  |  |  |
| 3 | storeCheckCustomItem | 主表自定义项 | - | - | st.storecheck.StoreCheckCustomItem |  |  |  |
| 4 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (1)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (1)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | totalQuantity | 整单数量 | fTotalQuantity | number |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | storeCheckCustomItem | 主表自定义项 | st.storecheck.StoreCheckCustomItem |
| 2 | details | 盘点单子表 | st.storecheck.StoreCheckDetail |
