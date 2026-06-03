---
tags: [BIP, metadata, st, ReturnApplys]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 退货申请单子表 (st.returnapply.ReturnApplys)

> Platform: BIP V5 | Module: st | Table: st_returnapplys | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 退货申请单子表 |
| uri | st.returnapply.ReturnApplys |
| tableName | st_returnapplys |
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

## All Fields (58)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | approveNum | 已批复数量 | dapprovenum | number | Decimal |  |  | nullable |
| 2 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 3 | bodyItem | 退货申请单子表自定义项 | - | - | st.returnapply.ReturnApplysCustomItem |  |  |  |
| 4 | define1 | 自定义项1 | define1 | text | String |  |  | isGlobalization,nullable |
| 5 | define10 | 自定义项10 | define10 | text | String |  |  | isGlobalization,nullable |
| 6 | define11 | 自定义项11 | define11 | text | String |  |  | isGlobalization,nullable |
| 7 | define12 | 自定义项12 | define12 | text | String |  |  | isGlobalization,nullable |
| 8 | define13 | 自定义项13 | define13 | text | String |  |  | isGlobalization,nullable |
| 9 | define14 | 自定义项14 | define14 | text | String |  |  | isGlobalization,nullable |
| 10 | define15 | 自定义项15 | define15 | text | String |  |  | isGlobalization,nullable |
| 11 | define16 | 自定义项16 | define16 | text | String |  |  | isGlobalization,nullable |
| 12 | define17 | 自定义项17 | define17 | text | String |  |  | isGlobalization,nullable |
| 13 | define18 | 自定义项18 | define18 | text | String |  |  | isGlobalization,nullable |
| 14 | define19 | 自定义项19 | define19 | text | String |  |  | isGlobalization,nullable |
| 15 | define2 | 自定义项2 | define2 | text | String |  |  | isGlobalization,nullable |
| 16 | define20 | 自定义项20 | define20 | text | String |  |  | isGlobalization,nullable |
| 17 | define21 | 自定义项21 | define21 | text | String |  |  | isGlobalization,nullable |
| 18 | define22 | 自定义项22 | define22 | text | String |  |  | isGlobalization,nullable |
| 19 | define23 | 自定义项23 | define23 | text | String |  |  | isGlobalization,nullable |
| 20 | define24 | 自定义项24 | define24 | text | String |  |  | isGlobalization,nullable |
| 21 | define25 | 自定义项25 | define25 | text | String |  |  | isGlobalization,nullable |
| 22 | define26 | 自定义项26 | define26 | text | String |  |  | isGlobalization,nullable |
| 23 | define27 | 自定义项27 | define27 | text | String |  |  | isGlobalization,nullable |
| 24 | define28 | 自定义项28 | define28 | text | String |  |  | isGlobalization,nullable |
| 25 | define29 | 自定义项29 | define29 | text | String |  |  | isGlobalization,nullable |
| 26 | define3 | 自定义项3 | define3 | text | String |  |  | isGlobalization,nullable |
| 27 | define30 | 自定义项30 | define30 | text | String |  |  | isGlobalization,nullable |
| 28 | define4 | 自定义项4 | define4 | text | String |  |  | isGlobalization,nullable |
| 29 | define5 | 自定义项5 | define5 | text | String |  |  | isGlobalization,nullable |
| 30 | define6 | 自定义项6 | define6 | text | String |  |  | isGlobalization,nullable |
| 31 | define7 | 自定义项7 | define7 | text | String |  |  | isGlobalization,nullable |
| 32 | define8 | 自定义项8 | define8 | text | String |  |  | isGlobalization,nullable |
| 33 | define9 | 自定义项9 | define9 | text | String |  |  | isGlobalization,nullable |
| 34 | free1 | 规格1 | free1 | text | String |  |  | isGlobalization,nullable |
| 35 | free10 | 规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 36 | free2 | 规格2 | free2 | text | String |  |  | isGlobalization,nullable |
| 37 | free3 | 规格3 | free3 | text | String |  |  | isGlobalization,nullable |
| 38 | free4 | 规格4 | free4 | text | String |  |  | isGlobalization,nullable |
| 39 | free5 | 规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 40 | free6 | 规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 41 | free7 | 规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 42 | free8 | 规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 43 | free9 | 规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 44 | goodsposition | 货位 | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable,reportHide |
| 45 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 46 | invaliddate | 失效日期 | dInvalidDate | date | Date |  |  | nullable |
| 47 | mainid | mainid | iMainId | quote | st.returnapply.ReturnApply |  |  | nullable |
| 48 | markPrice | 建议零售价 | markPrice | number | Decimal |  |  | nullable |
| 49 | memo | 备注 | cMemo | text | String |  |  | nullable |
| 50 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 51 | product | 物料 | iProductid | quote | pc.aa.Product |  |  | nullable,dataPowerFlag |
| 52 | productsku | 默认SKUID | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable |
| 53 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 54 | quantity | 数量 | fQuantity | number | Decimal |  |  | nullable |
| 55 | rowno | 序号 | rowno | int | Integer |  |  | isCode,nullable |
| 56 | unit | 单位id | iUnitId | quote | pc.unit.Unit |  |  | nullable |
| 57 | unitName | 单位 | cUnitName | text | String |  |  | nullable |
| 58 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (6)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | goodsposition | 货位 | iGoodsPositionId | aa.goodsposition.GoodsPosition |
| 2 | mainid | mainid | iMainId | st.returnapply.ReturnApply |
| 3 | product | 物料 | iProductid | pc.aa.Product |
| 4 | productsku | 默认SKUID | iProductSkuid | pc.aa.ProductSKU |
| 5 | unit | 单位id | iUnitId | pc.unit.Unit |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (4)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | approveNum | 已批复数量 | dapprovenum | number |
| 2 | markPrice | 建议零售价 | markPrice | number |
| 3 | quantity | 数量 | fQuantity | number |
| 4 | rowno | 序号 | rowno | int |

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
| 1 | bodyItem | 退货申请单子表自定义项 | st.returnapply.ReturnApplysCustomItem |
