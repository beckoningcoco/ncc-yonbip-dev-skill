---
tags: [BIP, metadata, stock, CurrentStock]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 现存量表 (stock.currentstock.CurrentStock)

> Platform: BIP V5 | Module: stock | Table: currentstock | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 现存量表 |
| uri | stock.currentstock.CurrentStock |
| tableName | currentstock |
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
| 6 | 库存状态接口 (IStockStatus) | st.stockStatusRecord.IStockStatus |
| 7 | 预留对象相关 (IReservationID) | st.reservation.IReservationID |
| 8 | 货主对象 (IInventoryOwner) | st.inventoryowner.IInventoryOwner |
| 9 | 库存类型对象 (IStockType) | st.stocktype.IStockType |
| 10 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (110)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | acolytesRemUnit | 辅单位(零头) | acolytesRemUnit | quote | pc.unit.Unit |  |  | nullable |
| 2 | acolytesUnit | 辅单位 | acolytesUnit | quote | pc.unit.Unit |  |  | nullable,skipReferenceCheck |
| 3 | aimequipcard | 资产卡片(发货预计出) | aimequipcard | number | Decimal |  |  | nullable |
| 4 | aimequipcardSubQty | 资产卡片(发货预计出件数) | fAimequipcardSubQty | number | Decimal |  |  | nullable |
| 5 | applyorder | 请购单(订单预计入) | applyorder | number | Decimal |  |  | nullable |
| 6 | applyorderSubQty | 请购单(订单预计入件数) | fApplyorderSubQty | number | Decimal |  |  | nullable |
| 7 | arrivalorder | 采购到货(收货预计入) | arrivalorder | number | Decimal |  |  | nullable |
| 8 | arrivalorderSubQty | 采购到货(收货预计入件数) | fArrivalorderSubQty | number | Decimal |  |  | nullable |
| 9 | availableSubQty | 可用件数 | fAvailableSubQty | number | Decimal |  |  | nullable |
| 10 | availableqty | 可用数量 | fAvailableQty | number | Decimal |  |  | nullable |
| 11 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 12 | batchnoid | 批号 | batchnoid | quote | st.batchno.Batchno |  |  | nullable,skipReferenceCheck |
| 13 | currentStockCharacteristic | 现存量敏感域自由项实体 | currentstock_characteristic | FreeCT | stock.currentstock.CurrentStockCharacteristics |  |  | nullable |
| 14 | currentStockSubQty | 结存件数 | currentStockSubQty | number | Decimal |  |  | nullable |
| 15 | currentSubQty | 现存件数 | fCurrentSubQty | number | Decimal |  |  | nullable |
| 16 | currentqty | 现存数量 | fCurrentQty | number | Decimal |  |  | nullable |
| 17 | custodian | 保管者 | custodianid | quote | st.custodian.Custodian |  |  | nullable,skipReferenceCheck |
| 18 | custodianType | 保管者类型 | custodian_type | text | String |  |  | nullable |
| 19 | delivery | 销售发货单(发货预计出) | delivery | number | Decimal |  |  | nullable |
| 20 | deliverySubQty | 销售发货单(发货预计出件数) | fDeliverySubQty | number | Decimal |  |  | nullable |
| 21 | free1 | 规格1 | free1 | text | String |  |  | isGlobalization,nullable |
| 22 | free10 | 规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 23 | free2 | 规格2 | free2 | text | String |  |  | isGlobalization,nullable |
| 24 | free3 | 规格3 | free3 | text | String |  |  | isGlobalization,nullable |
| 25 | free4 | 规格4 | free4 | text | String |  |  | isGlobalization,nullable |
| 26 | free5 | 规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 27 | free6 | 规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 28 | free7 | 规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 29 | free8 | 规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 30 | free9 | 规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 31 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 32 | innoticeSubQty | 收货预计入库件数 | fInnoticeSubQty | number | Decimal |  |  | nullable |
| 33 | innoticeqty | 收货预计入库数量 | fInnoticeQty | number | Decimal |  |  | nullable |
| 34 | inorderSubQty | 订单预计入库件数 | fInOrderSubQty | number | Decimal |  |  | nullable |
| 35 | inorderqty | 订单预计入库数量 | fInOrderQty | number | Decimal |  |  | nullable |
| 36 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  | nullable |
| 37 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 38 | invStockExchRate | 结存换算率 | invStockExchRate | number | Decimal |  |  | nullable |
| 39 | invaliddate | 失效日期 | dInvalidDate | date | Date |  |  | nullable |
| 40 | inventoryowner | 货主对象Id | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 41 | isCS | 是否寄售库存 | iscs | switch | Boolean |  |  | nullable |
| 42 | materialreq | 领料申请(发货预计出) | materialreq | number | Decimal |  |  | nullable |
| 43 | materialreqSubQty | 领料申请(发货预计出件数) | fMaterialreqSubQty | number | Decimal |  |  | nullable |
| 44 | morphologyconversionout | 形态转换单(发货预计出) | morphologyconversionout | number | Decimal |  |  | nullable |
| 45 | org | 库存组织 | iOrgid | quote | aa.baseorg.OrgMV |  |  | isMasterOrg,nullable,skipReferenceCheck |
| 46 | outnoticeSubQty | 发货预计出库件数 | fOutnoticeSubQty | number | Decimal |  |  | nullable |
| 47 | outnoticeqty | 发货预计出库数量 | fOutnoticeQty | number | Decimal |  |  | nullable |
| 48 | pickingreq | 出库申请(发货预计出) | pickingreq | number | Decimal |  |  | nullable |
| 49 | pickingreqSubQty | 出库申请(发货预计出件数) | fPickingreqSubQty | number | Decimal |  |  | nullable |
| 50 | pofreport | 完工报告(收货预计入) | pofreport | number | Decimal |  |  | nullable |
| 51 | pofreportSubQty | 完工报告(收货预计入件数) | fPofreportSubQty | number | Decimal |  |  | nullable |
| 52 | poin | 生产订单(订单预计入) | poin | number | Decimal |  |  | nullable |
| 53 | poinSubQty | 生产订单(订单预计入件数) | fPoinSubQty | number | Decimal |  |  | nullable |
| 54 | poout | 生产订单(订单预计出) | poout | number | Decimal |  |  | nullable |
| 55 | pooutSubQty | 生产订单(订单预计出件数) | fPooutSubQty | number | Decimal |  |  | nullable |
| 56 | posubarrivalorder | 委外到货单(收货预计入) | posubarrivalorder | number | Decimal |  |  | nullable |
| 57 | posubarrivalorderSubQty | 委外到货单(收货预计入件数) | fPosubarrivalorderSubQty | number | Decimal |  |  | nullable |
| 58 | posubin | 委外订单(订单预计入) | posubin | number | Decimal |  |  | nullable |
| 59 | posubinSubQty | 委外订单(订单预计入件数) | fPosubinSubQty | number | Decimal |  |  | nullable |
| 60 | posubout | 委外订单(订单预计出) | posubout | number | Decimal |  |  | nullable |
| 61 | posuboutSubQty | 委外订单(订单预计出件数) | fPosuboutSubQty | number | Decimal |  |  | nullable |
| 62 | preretailSubQty | 订单预计出库件数 | fPreretailSubQty | number | Decimal |  |  | nullable |
| 63 | preretailqty | 订单预计出库数量 | fPreretailQty | number | Decimal |  |  | nullable |
| 64 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 65 | product | 物料(废弃) | iProductid | quote | pc.aa.Product |  |  | data_auth,nullable,dataPowerFlag,skipReferenceCheck |
| 66 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | data_auth,nullable,skipReferenceCheck |
| 67 | productsku | 默认SKUID(废弃) | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable,skipReferenceCheck |
| 68 | productskun | 默认SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | nullable,skipReferenceCheck |
| 69 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 70 | purchaseorder | 采购订单(订单预计入) | purchaseorder | number | Decimal |  |  | nullable |
| 71 | purchaseorderSubQty | 采购订单(订单预计入件数) | fPurchaseorderSubQty | number | Decimal |  |  | nullable |
| 72 | remExchRate | 辅计量单位(零头)换算率 | remExchRate | number | Decimal |  |  | nullable |
| 73 | reserveExpiryDate | 预留到期日 | reservation_expiry_date | date | Date |  |  | nullable |
| 74 | reservedArrival | 预留收货预计入(收货预计入) | reservedArrival | number | Decimal |  |  | nullable |
| 75 | reservedArrivalSubQty | 预留收货预计入(收货预计入件数) | fReservedArrivalSubQty | number | Decimal |  |  | nullable |
| 76 | reservedShipping | 预留发货预计出(发货预计出) | reservedShipping | number | Decimal |  |  | nullable |
| 77 | reservedShippingSubQty | 预留发货预计出(发货预计出件数) | fReservedShippingSubQty | number | Decimal |  |  | nullable |
| 78 | reserveid | 跟踪线索Id | reserveid | quote | st.reservation.Reservation |  |  | nullable |
| 79 | retailTrade | 零售单(订单预计出) | retailTrade | number | Decimal |  |  | nullable |
| 80 | retailTradeSubQty | 零售单(订单预计出件数) | fRetailTradeSubQty | number | Decimal |  |  | nullable |
| 81 | returnorder | 采购退货(订单预计出) | returnorder | number | Decimal |  |  | nullable |
| 82 | returnorderSubQty | 采购退货(订单预计出件数) | fReturnorderSubQty | number | Decimal |  |  | nullable |
| 83 | salereturn | 销售退货(订单预计入) | salereturn | number | Decimal |  |  | nullable |
| 84 | salereturnSubQty | 销售退货(订单预计入件数) | fSalereturnSubQty | number | Decimal |  |  | nullable |
| 85 | salesorder | 销售订单(订单预计出) | salesorder | number | Decimal |  |  | nullable |
| 86 | salesorderSubQty | 销售订单(订单预计出件数) | fSalesorderSubQty | number | Decimal |  |  | nullable |
| 87 | sensitiveUID | SKU敏感域唯一性ID | sensitiveUID | text | String |  |  | nullable |
| 88 | stockStatusDoc | 库存状态 | stockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 89 | stockType | 库存类型 | stockType | quote | st.stocktype.StockType |  |  | nullable |
| 90 | stockUnitId | 结存单位 | stock_unit_id | quote | pc.unit.Unit |  |  | nullable |
| 91 | store | 门店ID | iStoreID | quote | aa.store.Store |  |  | nullable,skipReferenceCheck |
| 92 | storeinQty | 调出在途量 | fStoreinQty | number | Decimal |  |  | nullable |
| 93 | storenotice | 入库通知(收货预计入) | storenotice | number | Decimal |  |  | nullable |
| 94 | storenoticeSubQty | 入库通知(收货预计入件数) | fStorenoticeSubQty | number | Decimal |  |  | nullable |
| 95 | storetransout | 转库单(发货预计出) | storetransout | number | Decimal |  |  | nullable |
| 96 | storetransoutSubQty | 转库单(发货预计出件数) | fStoretransoutSubQty | number | Decimal |  |  | nullable |
| 97 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 98 | tradedelivery | 电商发货(发货预计出) | tradedelivery | number | Decimal |  |  | nullable |
| 99 | tradedeliverySubQty | 电商发货(发货预计出件数) | fTradedeliverySubQty | number | Decimal |  |  | nullable |
| 100 | tradeorder | 电商订单(订单预计出) | tradeorder | number | Decimal |  |  | nullable |
| 101 | tradeorderSubQty | 电商订单(订单预计出件数) | fTradeorderSubQty | number | Decimal |  |  | nullable |
| 102 | transferapplyin | 调拨订单(订单预计入) | transferapplyin | number | Decimal |  |  | nullable |
| 103 | transferapplyinSubQty | 调拨订单(订单预计入件数) | fTransferapplyinSubQty | number | Decimal |  |  | nullable |
| 104 | transferapplyout | 调拨订单(订单预计出) | transferapplyout | number | Decimal |  |  | nullable |
| 105 | transferapplyoutSubQty | 调拨订单(订单预计出件数) | fTransferapplyoutSubQty | number | Decimal |  |  | nullable |
| 106 | transferreq | 调拨申请(订单预计入) | transferreq | number | Decimal |  |  | nullable |
| 107 | transferreqSubQty | 调拨申请(订单预计入件数) | fTransferreqSubQty | number | Decimal |  |  | nullable |
| 108 | unit | 主计量 | iUnitId | long | Long |  |  | nullable |
| 109 | warehouse | 仓库 | iWarehouseId | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable,skipReferenceCheck |
| 110 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (18)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | acolytesRemUnit | 辅单位(零头) | acolytesRemUnit | pc.unit.Unit |
| 2 | acolytesUnit | 辅单位 | acolytesUnit | pc.unit.Unit |
| 3 | batchnoid | 批号 | batchnoid | st.batchno.Batchno |
| 4 | custodian | 保管者 | custodianid | st.custodian.Custodian |
| 5 | inventoryowner | 货主对象Id | inventoryowner | st.inventoryowner.InventoryOwner |
| 6 | org | 库存组织 | iOrgid | aa.baseorg.OrgMV |
| 7 | product | 物料(废弃) | iProductid | pc.aa.Product |
| 8 | productn | 物料 | iProductid | pc.product.Product |
| 9 | productsku | 默认SKUID(废弃) | iProductSkuid | pc.aa.ProductSKU |
| 10 | productskun | 默认SKUID | iProductSkuid | pc.product.ProductSKU |
| 11 | reserveid | 跟踪线索Id | reserveid | st.reservation.Reservation |
| 12 | stockStatusDoc | 库存状态 | stockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 13 | stockType | 库存类型 | stockType | st.stocktype.StockType |
| 14 | stockUnitId | 结存单位 | stock_unit_id | pc.unit.Unit |
| 15 | store | 门店ID | iStoreID | aa.store.Store |
| 16 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 17 | warehouse | 仓库 | iWarehouseId | aa.warehouse.Warehouse |
| 18 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (71)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | aimequipcard | 资产卡片(发货预计出) | aimequipcard | number |
| 2 | aimequipcardSubQty | 资产卡片(发货预计出件数) | fAimequipcardSubQty | number |
| 3 | applyorder | 请购单(订单预计入) | applyorder | number |
| 4 | applyorderSubQty | 请购单(订单预计入件数) | fApplyorderSubQty | number |
| 5 | arrivalorder | 采购到货(收货预计入) | arrivalorder | number |
| 6 | arrivalorderSubQty | 采购到货(收货预计入件数) | fArrivalorderSubQty | number |
| 7 | availableSubQty | 可用件数 | fAvailableSubQty | number |
| 8 | availableqty | 可用数量 | fAvailableQty | number |
| 9 | currentStockSubQty | 结存件数 | currentStockSubQty | number |
| 10 | currentSubQty | 现存件数 | fCurrentSubQty | number |
| 11 | currentqty | 现存数量 | fCurrentQty | number |
| 12 | delivery | 销售发货单(发货预计出) | delivery | number |
| 13 | deliverySubQty | 销售发货单(发货预计出件数) | fDeliverySubQty | number |
| 14 | innoticeSubQty | 收货预计入库件数 | fInnoticeSubQty | number |
| 15 | innoticeqty | 收货预计入库数量 | fInnoticeQty | number |
| 16 | inorderSubQty | 订单预计入库件数 | fInOrderSubQty | number |
| 17 | inorderqty | 订单预计入库数量 | fInOrderQty | number |
| 18 | invExchRate | 换算率 | invExchRate | number |
| 19 | invExchRateNum | 换算率分子 | invexchratenum | number |
| 20 | invStockExchRate | 结存换算率 | invStockExchRate | number |
| 21 | materialreq | 领料申请(发货预计出) | materialreq | number |
| 22 | materialreqSubQty | 领料申请(发货预计出件数) | fMaterialreqSubQty | number |
| 23 | morphologyconversionout | 形态转换单(发货预计出) | morphologyconversionout | number |
| 24 | outnoticeSubQty | 发货预计出库件数 | fOutnoticeSubQty | number |
| 25 | outnoticeqty | 发货预计出库数量 | fOutnoticeQty | number |
| 26 | pickingreq | 出库申请(发货预计出) | pickingreq | number |
| 27 | pickingreqSubQty | 出库申请(发货预计出件数) | fPickingreqSubQty | number |
| 28 | pofreport | 完工报告(收货预计入) | pofreport | number |
| 29 | pofreportSubQty | 完工报告(收货预计入件数) | fPofreportSubQty | number |
| 30 | poin | 生产订单(订单预计入) | poin | number |
| 31 | poinSubQty | 生产订单(订单预计入件数) | fPoinSubQty | number |
| 32 | poout | 生产订单(订单预计出) | poout | number |
| 33 | pooutSubQty | 生产订单(订单预计出件数) | fPooutSubQty | number |
| 34 | posubarrivalorder | 委外到货单(收货预计入) | posubarrivalorder | number |
| 35 | posubarrivalorderSubQty | 委外到货单(收货预计入件数) | fPosubarrivalorderSubQty | number |
| 36 | posubin | 委外订单(订单预计入) | posubin | number |
| 37 | posubinSubQty | 委外订单(订单预计入件数) | fPosubinSubQty | number |
| 38 | posubout | 委外订单(订单预计出) | posubout | number |
| 39 | posuboutSubQty | 委外订单(订单预计出件数) | fPosuboutSubQty | number |
| 40 | preretailSubQty | 订单预计出库件数 | fPreretailSubQty | number |
| 41 | preretailqty | 订单预计出库数量 | fPreretailQty | number |
| 42 | purchaseorder | 采购订单(订单预计入) | purchaseorder | number |
| 43 | purchaseorderSubQty | 采购订单(订单预计入件数) | fPurchaseorderSubQty | number |
| 44 | remExchRate | 辅计量单位(零头)换算率 | remExchRate | number |
| 45 | reservedArrival | 预留收货预计入(收货预计入) | reservedArrival | number |
| 46 | reservedArrivalSubQty | 预留收货预计入(收货预计入件数) | fReservedArrivalSubQty | number |
| 47 | reservedShipping | 预留发货预计出(发货预计出) | reservedShipping | number |
| 48 | reservedShippingSubQty | 预留发货预计出(发货预计出件数) | fReservedShippingSubQty | number |
| 49 | retailTrade | 零售单(订单预计出) | retailTrade | number |
| 50 | retailTradeSubQty | 零售单(订单预计出件数) | fRetailTradeSubQty | number |
| 51 | returnorder | 采购退货(订单预计出) | returnorder | number |
| 52 | returnorderSubQty | 采购退货(订单预计出件数) | fReturnorderSubQty | number |
| 53 | salereturn | 销售退货(订单预计入) | salereturn | number |
| 54 | salereturnSubQty | 销售退货(订单预计入件数) | fSalereturnSubQty | number |
| 55 | salesorder | 销售订单(订单预计出) | salesorder | number |
| 56 | salesorderSubQty | 销售订单(订单预计出件数) | fSalesorderSubQty | number |
| 57 | storeinQty | 调出在途量 | fStoreinQty | number |
| 58 | storenotice | 入库通知(收货预计入) | storenotice | number |
| 59 | storenoticeSubQty | 入库通知(收货预计入件数) | fStorenoticeSubQty | number |
| 60 | storetransout | 转库单(发货预计出) | storetransout | number |
| 61 | storetransoutSubQty | 转库单(发货预计出件数) | fStoretransoutSubQty | number |
| 62 | tradedelivery | 电商发货(发货预计出) | tradedelivery | number |
| 63 | tradedeliverySubQty | 电商发货(发货预计出件数) | fTradedeliverySubQty | number |
| 64 | tradeorder | 电商订单(订单预计出) | tradeorder | number |
| 65 | tradeorderSubQty | 电商订单(订单预计出件数) | fTradeorderSubQty | number |
| 66 | transferapplyin | 调拨订单(订单预计入) | transferapplyin | number |
| 67 | transferapplyinSubQty | 调拨订单(订单预计入件数) | fTransferapplyinSubQty | number |
| 68 | transferapplyout | 调拨订单(订单预计出) | transferapplyout | number |
| 69 | transferapplyoutSubQty | 调拨订单(订单预计出件数) | fTransferapplyoutSubQty | number |
| 70 | transferreq | 调拨申请(订单预计入) | transferreq | number |
| 71 | transferreqSubQty | 调拨申请(订单预计入件数) | fTransferreqSubQty | number |

---

## Date Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | invaliddate | 失效日期 | dInvalidDate | date |
| 2 | producedate | 生产日期 | dProduceDate | date |
| 3 | reserveExpiryDate | 预留到期日 | reservation_expiry_date | date |
