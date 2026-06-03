---
tags: [BIP, metadata, st, StoreCheckPrepareDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 盘点准备单子表 (st.storecheckprepare.StoreCheckPrepareDetail)

> Platform: BIP V5 | Module: st | Table: st_storecheckprepare_b | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 盘点准备单子表 |
| uri | st.storecheckprepare.StoreCheckPrepareDetail |
| tableName | st_storecheckprepare_b |
| domain | ustock |
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
| 1 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 2 | define1 | 自定义项1 | define1 | text | String |  |  | isGlobalization,nullable |
| 3 | define10 | 自定义项10 | define10 | text | String |  |  | isGlobalization,nullable |
| 4 | define11 | 自定义项11 | define11 | text | String |  |  | isGlobalization,nullable |
| 5 | define12 | 自定义项12 | define12 | text | String |  |  | isGlobalization,nullable |
| 6 | define13 | 自定义项13 | define13 | text | String |  |  | isGlobalization,nullable |
| 7 | define14 | 自定义项14 | define14 | text | String |  |  | isGlobalization,nullable |
| 8 | define15 | 自定义项15 | define15 | text | String |  |  | isGlobalization,nullable |
| 9 | define16 | 自定义项16 | define16 | text | String |  |  | isGlobalization,nullable |
| 10 | define17 | 自定义项17 | define17 | text | String |  |  | isGlobalization,nullable |
| 11 | define18 | 自定义项18 | define18 | text | String |  |  | isGlobalization,nullable |
| 12 | define19 | 自定义项19 | define19 | text | String |  |  | isGlobalization,nullable |
| 13 | define2 | 自定义项2 | define2 | text | String |  |  | isGlobalization,nullable |
| 14 | define20 | 自定义项20 | define20 | text | String |  |  | isGlobalization,nullable |
| 15 | define21 | 自定义项21 | define21 | text | String |  |  | isGlobalization,nullable |
| 16 | define22 | 自定义项22 | define22 | text | String |  |  | isGlobalization,nullable |
| 17 | define23 | 自定义项23 | define23 | text | String |  |  | isGlobalization,nullable |
| 18 | define24 | 自定义项24 | define24 | text | String |  |  | isGlobalization,nullable |
| 19 | define25 | 自定义项25 | define25 | text | String |  |  | isGlobalization,nullable |
| 20 | define26 | 自定义项26 | define26 | text | String |  |  | isGlobalization,nullable |
| 21 | define27 | 自定义项27 | define27 | text | String |  |  | isGlobalization,nullable |
| 22 | define28 | 自定义项28 | define28 | text | String |  |  | isGlobalization,nullable |
| 23 | define29 | 自定义项29 | define29 | text | String |  |  | isGlobalization,nullable |
| 24 | define3 | 自定义项3 | define3 | text | String |  |  | isGlobalization,nullable |
| 25 | define30 | 自定义项30 | define30 | text | String |  |  | isGlobalization,nullable |
| 26 | define4 | 自定义项4 | define4 | text | String |  |  | isGlobalization,nullable |
| 27 | define5 | 自定义项5 | define5 | text | String |  |  | isGlobalization,nullable |
| 28 | define6 | 自定义项6 | define6 | text | String |  |  | isGlobalization,nullable |
| 29 | define7 | 自定义项7 | define7 | text | String |  |  | isGlobalization,nullable |
| 30 | define8 | 自定义项8 | define8 | text | String |  |  | isGlobalization,nullable |
| 31 | define9 | 自定义项9 | define9 | text | String |  |  | isGlobalization,nullable |
| 32 | free1 | 规格1 | free1 | text | String |  |  | isGlobalization,nullable |
| 33 | free10 | 规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 34 | free2 | 规格2 | free2 | text | String |  |  | isGlobalization,nullable |
| 35 | free3 | 规格3 | free3 | text | String |  |  | isGlobalization,nullable |
| 36 | free4 | 规格4 | free4 | text | String |  |  | isGlobalization,nullable |
| 37 | free5 | 规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 38 | free6 | 规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 39 | free7 | 规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 40 | free8 | 规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 41 | free9 | 规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 42 | goodsposition | 货位 | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable,reportHide |
| 43 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 44 | invaliddate | 失效日期 | dInvalidDate | date | Date |  |  | nullable |
| 45 | memo | 备注 | cMemo | text | String |  |  | nullable |
| 46 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 47 | product | 物料 | iProductid | quote | pc.aa.Product |  |  | dataPowerFlag,data_auth,nullable |
| 48 | productsku | 物料SKU | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable |
| 49 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 50 | rowno | 序号 | rowno | int | Integer |  |  | isCode,nullable |
| 51 | storeCheckPrepareDetailCustomItem | 盘点准备单子表自定义项 | - | - | st.storecheckprepare.StoreCheckPrepareDetailCustomItem |  |  |  |
| 52 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (4)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | goodsposition | 货位 | iGoodsPositionId | aa.goodsposition.GoodsPosition |
| 2 | product | 物料 | iProductid | pc.aa.Product |
| 3 | productsku | 物料SKU | iProductSkuid | pc.aa.ProductSKU |
| 4 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (1)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | rowno | 序号 | rowno | int |

---

## Date Fields (2)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | invaliddate | 失效日期 | dInvalidDate | date |
| 2 | producedate | 生产日期 | dProduceDate | date |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | storeCheckPrepareDetailCustomItem | 盘点准备单子表自定义项 | st.storecheckprepare.StoreCheckPrepareDetailCustomItem |
