---
tags: [BIP, metadata, st, StoreCheckDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 盘点单子表 (st.storecheck.StoreCheckDetail)

> Platform: BIP V5 | Module: st | Table: st_storecheck_b | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 盘点单子表 |
| uri | st.storecheck.StoreCheckDetail |
| tableName | st_storecheck_b |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | retail.voucher.RetailVouchLine |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (2)

| # | Name | URI |
|---|------|-----|
| 1 | 规格 (FreeItem) | base.itf.FreeItem |
| 2 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (52)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | product | 商品id | iProductid | quote | pc.aa.Product |  |  | dataPowerFlag,data_auth,nullable |
| 2 | productsku | skuid | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable |
| 3 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 4 | define1 | q111 | define1 | text | String |  |  | isGlobalization,nullable |
| 5 | define2 | 批次属性2 | define2 | text | String |  |  | isGlobalization,nullable |
| 6 | define3 | 批次属性3 | define3 | text | String |  |  | isGlobalization,nullable |
| 7 | define4 | 批次属性4 | define4 | text | String |  |  | isGlobalization,nullable |
| 8 | define5 | 批次属性5 | define5 | text | String |  |  | isGlobalization,nullable |
| 9 | define6 | 批次属性6 | define6 | text | String |  |  | isGlobalization,nullable |
| 10 | define7 | 批次属性7 | define7 | text | String |  |  | isGlobalization,nullable |
| 11 | define8 | 批次属性8 | define8 | text | String |  |  | isGlobalization,nullable |
| 12 | define9 | 批次属性9 | define9 | text | String |  |  | isGlobalization,nullable |
| 13 | define10 | 批次属性10 | define10 | text | String |  |  | isGlobalization,nullable |
| 14 | define11 | 批次属性11 | define11 | text | String |  |  | isGlobalization,nullable |
| 15 | define12 | 批次属性12 | define12 | text | String |  |  | isGlobalization,nullable |
| 16 | define13 | 批次属性13 | define13 | text | String |  |  | isGlobalization,nullable |
| 17 | define14 | 批次属性14 | define14 | text | String |  |  | isGlobalization,nullable |
| 18 | define15 | 批次属性15 | define15 | text | String |  |  | isGlobalization,nullable |
| 19 | define16 | 批次属性16 | define16 | text | String |  |  | isGlobalization,nullable |
| 20 | define17 | 批次属性17 | define17 | text | String |  |  | isGlobalization,nullable |
| 21 | define18 | 批次属性18 | define18 | text | String |  |  | isGlobalization,nullable |
| 22 | define19 | 批次属性19 | define19 | text | String |  |  | isGlobalization,nullable |
| 23 | define20 | 批次属性20 | define20 | text | String |  |  | isGlobalization,nullable |
| 24 | define21 | 批次属性21 | define21 | text | String |  |  | isGlobalization,nullable |
| 25 | define22 | 批次属性22 | define22 | text | String |  |  | isGlobalization,nullable |
| 26 | define23 | 批次属性23 | define23 | text | String |  |  | isGlobalization,nullable |
| 27 | define24 | 批次属性24 | define24 | text | String |  |  | isGlobalization,nullable |
| 28 | define25 | 批次属性25 | define25 | text | String |  |  | isGlobalization,nullable |
| 29 | define26 | 批次属性26 | define26 | text | String |  |  | isGlobalization,nullable |
| 30 | define27 | 批次属性27 | define27 | text | String |  |  | isGlobalization,nullable |
| 31 | define28 | 批次属性28 | define28 | text | String |  |  | isGlobalization,nullable |
| 32 | define29 | 批次属性29 | define29 | text | String |  |  | isGlobalization,nullable |
| 33 | define30 | 批次属性30 | define30 | text | String |  |  | isGlobalization,nullable |
| 34 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 35 | invaliddate | 失效日期 | dInvalidDate | date | Date |  |  | nullable |
| 36 | rowno | 行号 | rowno | int | Integer |  |  | isCode,nullable |
| 37 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 38 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 39 | memo | 备注 | cMemo | text | String |  |  | nullable |
| 40 | free1 | 颜色 | free1 | text | String |  |  | isGlobalization,nullable |
| 41 | free2 | 测试3 | free2 | text | String |  |  | isGlobalization,nullable |
| 42 | free3 | 定量测试 | free3 | text | String |  |  | isGlobalization,nullable |
| 43 | free4 | 香雪产地 | free4 | text | String |  |  | isGlobalization,nullable |
| 44 | free5 | 物料规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 45 | free6 | 物料规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 46 | free7 | 物料规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 47 | free8 | 物料规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 48 | free9 | 物料规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 49 | free10 | 物料规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 50 | goodsposition | 货位 | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable,reportHide |
| 51 | storeCheckDetailCustomItem | 子表自定义项 | - | - | st.storecheck.StoreCheckDetailCustomItem |  |  |  |
| 52 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | product | 商品id | iProductid | pc.aa.Product |
| 2 | productsku | skuid | iProductSkuid | pc.aa.ProductSKU |
| 3 | goodsposition | 货位 | iGoodsPositionId | aa.goodsposition.GoodsPosition |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (1)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | rowno | 行号 | rowno | int |

---

## Date Fields (2)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | producedate | 生产日期 | dProduceDate | date |
| 2 | invaliddate | 失效日期 | dInvalidDate | date |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | storeCheckDetailCustomItem | 子表自定义项 | st.storecheck.StoreCheckDetailCustomItem |
