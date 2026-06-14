---
tags: [BIP, metadata, sn, SNstateReport]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 序列号状态档案 (sn.serialnumber.SNstateReport)

> Platform: BIP V5 | Module: sn | Table: sn_state | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 序列号状态档案 |
| uri | sn.serialnumber.SNstateReport |
| tableName | sn_state |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | base.entity.BizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (10)

| # | Name | URI |
|---|------|-----|
| 1 | 租户相关 (ITenant) | base.itf.ITenant |
| 2 | 规格 (FreeItem) | base.itf.FreeItem |
| 3 | 商品相关 (IProduct) | st.voucher.IProduct |
| 4 | 商品sku相关 (IProductSku) | st.voucher.IProductSku |
| 5 | 效期相关 (IExp) | scmbd.voucher.IExp |
| 6 | 批次相关 (IBatch) | scmbd.voucher.IBatch |
| 7 | 预留对象相关 (IReservationID) | st.reservation.IReservationID |
| 8 | 货主对象 (IInventoryOwner) | st.inventoryowner.IInventoryOwner |
| 9 | 货权归属 (IOwnerType) | st.inventoryowner.IOwnerType |
| 10 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (65)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 2 | createDate | 创建日期 | createdate | date | Date |  |  | nullable |
| 3 | createTime | 创建时间 | createTime | timestamp | Timestamp |  |  | nullable |
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
| 44 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 45 | invaliddate | 失效日期 | dInvalidDate | date | Date |  |  | nullable |
| 46 | inventoryowner | 货主对象Id | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 47 | location | 货位 | ilocationid | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 48 | org | 库存组织 | iOrgid | quote | aa.baseorg.InventoryOrgMV |  |  | isMasterOrg,nullable |
| 49 | ownertype | 货权归属 | ownertype | int | Integer |  |  | nullable |
| 50 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 51 | product | 物料 | iProductid | quote | pc.product.Product |  |  | data_auth,nullable,dataPowerFlag |
| 52 | productsku | 默认SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | isRedundant,nullable |
| 53 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 54 | reserveid | 跟踪线索Id | reserveid | quote | st.reservation.Reservation |  |  | nullable |
| 55 | sn | 序列号 | csn_code | text | String |  |  | nullable |
| 56 | snCharacter | 序列号自由项特征组 | sn_state_character_id | FreeCT | sn.serialnumber.SNstateCharacter |  |  | nullable |
| 57 | snCustomItems | 序列号属性 | - | - | sn.serialnumber.SNCustomItemReport |  |  |  |
| 58 | snstate | 序列号状态 | cSNstate | text | String |  |  | nullable |
| 59 | stockStatusDoc | 库存状态 | stockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 60 | stocksensitive_uid | 存量敏感域唯一性ID | stock_character_uid | text | String |  |  | nullable |
| 61 | store | 门店ID | iStoreID | quote | aa.store.Store |  |  | dataPowerFlag,data_auth,nullable |
| 62 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 63 | updatecount | 序列号更新次数 | iUpdateCount | int | Integer |  |  | nullable |
| 64 | warehouse | 仓库 | iWarehouseId | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 65 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (11)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | inventoryowner | 货主对象Id | inventoryowner | st.inventoryowner.InventoryOwner |
| 2 | location | 货位 | ilocationid | aa.goodsposition.GoodsPosition |
| 3 | org | 库存组织 | iOrgid | aa.baseorg.InventoryOrgMV |
| 4 | product | 物料 | iProductid | pc.product.Product |
| 5 | productsku | 默认SKUID | iProductSkuid | pc.product.ProductSKU |
| 6 | reserveid | 跟踪线索Id | reserveid | st.reservation.Reservation |
| 7 | stockStatusDoc | 库存状态 | stockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 8 | store | 门店ID | iStoreID | aa.store.Store |
| 9 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 10 | warehouse | 仓库 | iWarehouseId | aa.warehouse.Warehouse |
| 11 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (2)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | ownertype | 货权归属 | ownertype | int |
| 2 | updatecount | 序列号更新次数 | iUpdateCount | int |

---

## Date Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | createDate | 创建日期 | createdate | date |
| 2 | invaliddate | 失效日期 | dInvalidDate | date |
| 3 | producedate | 生产日期 | dProduceDate | date |

---

## Child Tables (1)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | snCustomItems | 序列号属性 | sn.serialnumber.SNCustomItemReport |
