---
tags: [BIP, metadata, st, StoreCheckCustomItem]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 主表自定义项 (st.storecheck.StoreCheckCustomItem)

> Platform: BIP V5 | Module: st | Table: st_storecheck_customitem | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 主表自定义项 |
| uri | st.storecheck.StoreCheckCustomItem |
| tableName | st_storecheck_customitem |
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
| 1 | 自定义项 (CustomItem) | base.itf.CustomItem |
| 2 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (32)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | define1 | 自定义项1 | define1 | text | String |  |  | isGlobalization,nullable |
| 2 | define10 | 自定义项10 | define10 | text | String |  |  | isGlobalization,nullable |
| 3 | define11 | 自定义项11 | define11 | text | String |  |  | isGlobalization,nullable |
| 4 | define12 | 自定义项12 | define12 | text | String |  |  | isGlobalization,nullable |
| 5 | define13 | 自定义项13 | define13 | text | String |  |  | isGlobalization,nullable |
| 6 | define14 | 自定义项14 | define14 | text | String |  |  | isGlobalization,nullable |
| 7 | define15 | 自定义项15 | define15 | text | String |  |  | isGlobalization,nullable |
| 8 | define16 | 自定义项16 | define16 | text | String |  |  | isGlobalization,nullable |
| 9 | define17 | 自定义项17 | define17 | text | String |  |  | isGlobalization,nullable |
| 10 | define18 | 自定义项18 | define18 | text | String |  |  | isGlobalization,nullable |
| 11 | define19 | 自定义项19 | define19 | text | String |  |  | isGlobalization,nullable |
| 12 | define2 | 自定义项2 | define2 | text | String |  |  | isGlobalization,nullable |
| 13 | define20 | 自定义项20 | define20 | text | String |  |  | isGlobalization,nullable |
| 14 | define21 | 自定义项21 | define21 | text | String |  |  | isGlobalization,nullable |
| 15 | define22 | 自定义项22 | define22 | text | String |  |  | isGlobalization,nullable |
| 16 | define23 | 自定义项23 | define23 | text | String |  |  | isGlobalization,nullable |
| 17 | define24 | 自定义项24 | define24 | text | String |  |  | isGlobalization,nullable |
| 18 | define25 | 自定义项25 | define25 | text | String |  |  | isGlobalization,nullable |
| 19 | define26 | 自定义项26 | define26 | text | String |  |  | isGlobalization,nullable |
| 20 | define27 | 自定义项27 | define27 | text | String |  |  | isGlobalization,nullable |
| 21 | define28 | 自定义项28 | define28 | text | String |  |  | isGlobalization,nullable |
| 22 | define29 | 自定义项29 | define29 | text | String |  |  | isGlobalization,nullable |
| 23 | define3 | 自定义项3 | define3 | text | String |  |  | isGlobalization,nullable |
| 24 | define30 | 自定义项30 | define30 | text | String |  |  | isGlobalization,nullable |
| 25 | define4 | 自定义项4 | define4 | text | String |  |  | isGlobalization,nullable |
| 26 | define5 | 自定义项5 | define5 | text | String |  |  | isGlobalization,nullable |
| 27 | define6 | 自定义项6 | define6 | text | String |  |  | isGlobalization,nullable |
| 28 | define7 | 自定义项7 | define7 | text | String |  |  | isGlobalization,nullable |
| 29 | define8 | 自定义项8 | define8 | text | String |  |  | isGlobalization,nullable |
| 30 | define9 | 自定义项9 | define9 | text | String |  |  | isGlobalization,nullable |
| 31 | id | 盘点单主表id | id | quote | st.storecheck.StoreCheck |  |  | nullable,REF.ID |
| 32 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (2)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | id | 盘点单主表id | id | st.storecheck.StoreCheck |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
