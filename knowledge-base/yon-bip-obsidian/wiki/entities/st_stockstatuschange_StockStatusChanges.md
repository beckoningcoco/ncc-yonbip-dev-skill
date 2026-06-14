---
tags: [BIP, metadata, st, StockStatusChanges]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 库存状态调整子表 (st.stockstatuschange.StockStatusChanges)

> Platform: BIP V5 | Module: st | Table: st_goodchanges | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 库存状态调整子表 |
| uri | st.stockstatuschange.StockStatusChanges |
| tableName | st_goodchanges |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | st.goodchange.GoodChanges |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (3)

| # | Name | URI |
|---|------|-----|
| 1 | 转换库存类型对象 (IStockTypeChange) | st.stocktype.IStockTypeChange |
| 2 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 3 | 项目结构属性 (projectStructureProperties) | BGDM.wbs.projectStructureProperties |

---

## All Fields (113)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 2 | org | 组织id | orgId | quote | aa.baseorg.InventoryOrgMV |  |  | nullable |
| 3 | warehouse | 仓库id | iWarehouseId | quote | aa.warehouse.Warehouse |  |  | data_auth,nullable,dataPowerFlag |
| 4 | product | 物料id | iProductid | quote | pc.aa.Product |  |  | data_auth,nullable,dataPowerFlag |
| 5 | sourceReserveExpiryDate | 来源预留到期日 | source_reserve_expiry_date | date | Date |  |  | nullable |
| 6 | destinationReserveExpiryDate | 目的预留到期日 | destination_reserve_expiry_date | date | Date |  |  | nullable |
| 7 | stockReserveDays | 现存量预留天数 | stock_reserve_days | int | Integer |  |  | nullable |
| 8 | preStockType | 转换前库存类型 | preStockType | quote | st.stocktype.StockType |  |  | nullable |
| 9 | afterStockType | 转换后库存类型 | afterStockType | quote | st.stocktype.StockType |  |  | nullable |
| 10 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide,notGenerate |
| 11 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 12 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 13 | quantity | 数量 | fQuantity | number | Decimal |  |  | isCalcQty,nullable |
| 14 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable |
| 15 | productAuth | 物料权限 | iProductid | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 16 | productskun | 默认SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | nullable |
| 17 | contactsPieces | 往来件数 | contacts_pieces | number | Decimal |  |  |  |
| 18 | contactsQuantity | 往来数量 | contacts_quantity | number | Decimal |  |  |  |
| 19 | uplineno | 上游单据行号 | uplineno | number | Decimal |  |  | nullable |
| 20 | firstuplineno | 源头单据行号 | firstuplineno | number | Decimal |  |  | nullable |
| 21 | sourceMainPubts | 时间戳 | sourceMainPubts | timestamp | Timestamp |  |  | nullable,reportHide |
| 22 | groupTaskKey | 分组任务KEY | groupTaskKey | text | String |  |  | nullable,reportHide |
| 23 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 24 | stockType | 库存类型 | stockType | quote | st.stocktype.StockType |  |  | nullable |
| 25 | inventoryowner | 货主对象Id | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 26 | goodsposition | 货位 | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 27 | stockSensClue | 存量敏感唯一ID | stockSensClue | text | String |  |  | nullable |
| 28 | goodchangesCharacteristics | 自由项特征组1 | goodchangesCharacteristics | FreeCT | st.goodchange.GoodChangesCharacteristics |  |  | nullable |
| 29 | goodchangesDefineCharacter | 自定义项特征组 | goodchangesDefineCharacter | UserDefine | st.goodchange.GoodChangesDefineCharacter |  |  | nullable |
| 30 | productsku | 商品SKUid | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable |
| 31 | unit | 单位id | iUnitId | quote | pc.unit.Unit |  |  | nullable |
| 32 | free1 | 商品规格1 | free1 | text | String |  |  | isGlobalization,nullable |
| 33 | free2 | 商品规格2 | free2 | text | String |  |  | isGlobalization,nullable |
| 34 | free3 | 商品规格3 | free3 | text | String |  |  | isGlobalization,nullable |
| 35 | free4 | 商品规格4 | free4 | text | String |  |  | isGlobalization,nullable |
| 36 | free5 | 物料规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 37 | free6 | 物料规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 38 | free7 | 物料规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 39 | free8 | 物料规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 40 | free9 | 物料规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 41 | free10 | 物料规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 42 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 43 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 44 | invaliddate | 有效期至 | dInvalidDate | date | Date |  |  | nullable |
| 45 | recorddate | 入库日期 | dRecordDate | date | Date |  |  | nullable |
| 46 | memo | 备注 | cMemo | text | String |  |  | nullable |
| 47 | mainid | 主表id | iMainId | quote | st.stockstatuschange.StockStatusChange |  |  | nullable |
| 48 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 49 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 50 | sourceid | 上游单据主表id | sourceid | long | Long |  |  | nullable |
| 51 | sourceautoid | 上游单据子表id | sourceautoid | long | Long |  |  | nullable |
| 52 | source | 上游单据类型 | source | text | String |  |  | nullable,reportHide |
| 53 | upcode | 上游单据号 | upcode | text | String |  |  | nullable |
| 54 | makeRuleCode | 生单规则编号 | makerule_code | text | String |  |  | nullable,reportHide |
| 55 | outgoodsposition | 货位id | iOutGoodsPosition | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 56 | ingoodsposition | 入库货位id | iInGoodsPosition | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 57 | outStockStatusDoc | 来源库存状态id | outStockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 58 | inStockStatusDoc | 目的库存状态id | inStockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 59 | outreserveid | 来源跟踪线索id | outreserveid | quote | st.reservation.Reservation |  |  | nullable |
| 60 | inreserveid | 目的跟踪线索id | inreserveid | quote | st.reservation.Reservation |  |  | nullable |
| 61 | currentqty | 现存量 | fCurrentQty | number | Decimal |  |  | nullable |
| 62 | availableqty | 可用量 | fAvailableQty | number | Decimal |  |  | nullable |
| 63 | currentSubQty | 现存件数 | fCurrentSubQty | number | Decimal |  |  | nullable |
| 64 | availableSubQty | 可用件数 | fAvailableSubQty | number | Decimal |  |  | nullable |
| 65 | qty | 调整数量 | qty | number | Decimal |  |  | nullable |
| 66 | subQty | 调整件数 | subQty | number | Decimal |  |  | nullable |
| 67 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  | nullable |
| 68 | stockUnitId | 库存单位id | stock_unit_id | quote | pc.unit.Unit |  |  | nullable |
| 69 | project | 项目id | iProject | quote | bd.project.ProjectVO |  |  | dataPowerFlag,data_auth,nullable |
| 70 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int | Integer |  |  | nullable |
| 71 | rowno | 行号 | rowno | int | Integer |  |  | isCode,nullable |
| 72 | innoticeqty | 收货预计入库量 | fInnoticeQty | number | Decimal |  |  | nullable |
| 73 | outnoticeqty | 发货预计出库量 | fOutnoticeQty | number | Decimal |  |  | nullable |
| 74 | preretailqty | 订单预计出库量 | fPreretailQty | number | Decimal |  |  | nullable |
| 75 | firstsourceid | 源头单据id | firstsourceid | long | Long |  |  | nullable |
| 76 | firstsourceautoid | 源头单据行id | firstsourceautoid | long | Long |  |  | nullable |
| 77 | firstsource | 源头单据类型 | firstsource | text | String |  |  | nullable |
| 78 | firstupcode | 源头单据号 | firstupcode | text | String |  |  | nullable |
| 79 | bodyItem | 库存状态调整子表自定义项 | - | - | st.stockstatuschange.StockStatusChangesCustomItem |  |  |  |
| 80 | define1 | 自定义项1 | define1 | text | String |  |  | isGlobalization,nullable |
| 81 | define10 | 自定义项10 | define10 | text | String |  |  | isGlobalization,nullable |
| 82 | define11 | 自定义项11 | define11 | text | String |  |  | isGlobalization,nullable |
| 83 | define12 | 自定义项12 | define12 | text | String |  |  | isGlobalization,nullable |
| 84 | define13 | 自定义项13 | define13 | text | String |  |  | isGlobalization,nullable |
| 85 | define14 | 自定义项14 | define14 | text | String |  |  | isGlobalization,nullable |
| 86 | define15 | 自定义项15 | define15 | text | String |  |  | isGlobalization,nullable |
| 87 | define16 | 自定义项16 | define16 | text | String |  |  | isGlobalization,nullable |
| 88 | define17 | 自定义项17 | define17 | text | String |  |  | isGlobalization,nullable |
| 89 | define18 | 自定义项18 | define18 | text | String |  |  | isGlobalization,nullable |
| 90 | define19 | 自定义项19 | define19 | text | String |  |  | isGlobalization,nullable |
| 91 | define2 | 自定义项2 | define2 | text | String |  |  | isGlobalization,nullable |
| 92 | define20 | 自定义项20 | define20 | text | String |  |  | isGlobalization,nullable |
| 93 | define21 | 自定义项21 | define21 | text | String |  |  | isGlobalization,nullable |
| 94 | define22 | 自定义项22 | define22 | text | String |  |  | isGlobalization,nullable |
| 95 | define23 | 自定义项23 | define23 | text | String |  |  | isGlobalization,nullable |
| 96 | define24 | 自定义项24 | define24 | text | String |  |  | isGlobalization,nullable |
| 97 | define25 | 自定义项25 | define25 | text | String |  |  | isGlobalization,nullable |
| 98 | define26 | 自定义项26 | define26 | text | String |  |  | isGlobalization,nullable |
| 99 | define27 | 自定义项27 | define27 | text | String |  |  | isGlobalization,nullable |
| 100 | define28 | 自定义项28 | define28 | text | String |  |  | isGlobalization,nullable |
| 101 | define29 | 自定义项29 | define29 | text | String |  |  | isGlobalization,nullable |
| 102 | define3 | 自定义项3 | define3 | text | String |  |  | isGlobalization,nullable |
| 103 | define30 | 自定义项30 | define30 | text | String |  |  | isGlobalization,nullable |
| 104 | define4 | 自定义项4 | define4 | text | String |  |  | isGlobalization,nullable |
| 105 | define5 | 自定义项5 | define5 | text | String |  |  | isGlobalization,nullable |
| 106 | define6 | 自定义项6 | define6 | text | String |  |  | isGlobalization,nullable |
| 107 | define7 | 自定义项7 | define7 | text | String |  |  | isGlobalization,nullable |
| 108 | define8 | 自定义项8 | define8 | text | String |  |  | isGlobalization,nullable |
| 109 | define9 | 自定义项9 | define9 | text | String |  |  | isGlobalization,nullable |
| 110 | defines | 库存状态调整子表自由自定义项 | - | - | st.stockstatuschange.StockStatusChangesAttrextItem |  |  |  |
| 111 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 112 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 113 | stockStatusChangesSNs | 库存状态调整序列号 | - | - | st.stockstatuschange.StockStatusChangesSN |  |  |  |

---

## Reference Fields (26)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | org | 组织id | orgId | aa.baseorg.InventoryOrgMV |
| 2 | warehouse | 仓库id | iWarehouseId | aa.warehouse.Warehouse |
| 3 | product | 物料id | iProductid | pc.aa.Product |
| 4 | preStockType | 转换前库存类型 | preStockType | st.stocktype.StockType |
| 5 | afterStockType | 转换后库存类型 | afterStockType | st.stocktype.StockType |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 7 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 8 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 9 | productn | 物料 | iProductid | pc.product.Product |
| 10 | productAuth | 物料权限 | iProductid | pb.dataauth.ProductDataAuth |
| 11 | productskun | 默认SKUID | iProductSkuid | pc.product.ProductSKU |
| 12 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 13 | stockType | 库存类型 | stockType | st.stocktype.StockType |
| 14 | inventoryowner | 货主对象Id | inventoryowner | st.inventoryowner.InventoryOwner |
| 15 | goodsposition | 货位 | iGoodsPositionId | aa.goodsposition.GoodsPosition |
| 16 | productsku | 商品SKUid | iProductSkuid | pc.aa.ProductSKU |
| 17 | unit | 单位id | iUnitId | pc.unit.Unit |
| 18 | mainid | 主表id | iMainId | st.stockstatuschange.StockStatusChange |
| 19 | outgoodsposition | 货位id | iOutGoodsPosition | aa.goodsposition.GoodsPosition |
| 20 | ingoodsposition | 入库货位id | iInGoodsPosition | aa.goodsposition.GoodsPosition |
| 21 | outStockStatusDoc | 来源库存状态id | outStockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 22 | inStockStatusDoc | 目的库存状态id | inStockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 23 | outreserveid | 来源跟踪线索id | outreserveid | st.reservation.Reservation |
| 24 | inreserveid | 目的跟踪线索id | inreserveid | st.reservation.Reservation |
| 25 | stockUnitId | 库存单位id | stock_unit_id | pc.unit.Unit |
| 26 | project | 项目id | iProject | bd.project.ProjectVO |

---

## Number Fields (21)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | lineno | 行号 | lineno | number |
| 2 | stockReserveDays | 现存量预留天数 | stock_reserve_days | int |
| 3 | quantity | 数量 | fQuantity | number |
| 4 | contactsPieces | 往来件数 | contacts_pieces | number |
| 5 | contactsQuantity | 往来数量 | contacts_quantity | number |
| 6 | uplineno | 上游单据行号 | uplineno | number |
| 7 | firstuplineno | 源头单据行号 | firstuplineno | number |
| 8 | currentqty | 现存量 | fCurrentQty | number |
| 9 | availableqty | 可用量 | fAvailableQty | number |
| 10 | currentSubQty | 现存件数 | fCurrentSubQty | number |
| 11 | availableSubQty | 可用件数 | fAvailableSubQty | number |
| 12 | qty | 调整数量 | qty | number |
| 13 | subQty | 调整件数 | subQty | number |
| 14 | invExchRate | 换算率 | invExchRate | number |
| 15 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int |
| 16 | rowno | 行号 | rowno | int |
| 17 | innoticeqty | 收货预计入库量 | fInnoticeQty | number |
| 18 | outnoticeqty | 发货预计出库量 | fOutnoticeQty | number |
| 19 | preretailqty | 订单预计出库量 | fPreretailQty | number |
| 20 | invExchRateDen | 换算率分母 | invexchrateden | number |
| 21 | invExchRateNum | 换算率分子 | invexchratenum | number |

---

## Date Fields (5)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | sourceReserveExpiryDate | 来源预留到期日 | source_reserve_expiry_date | date |
| 2 | destinationReserveExpiryDate | 目的预留到期日 | destination_reserve_expiry_date | date |
| 3 | producedate | 生产日期 | dProduceDate | date |
| 4 | invaliddate | 有效期至 | dInvalidDate | date |
| 5 | recorddate | 入库日期 | dRecordDate | date |

---

## Child Tables (3)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | stockStatusChangesSNs | 库存状态调整序列号 | st.stockstatuschange.StockStatusChangesSN |
| 2 | bodyItem | 库存状态调整子表自定义项 | st.stockstatuschange.StockStatusChangesCustomItem |
| 3 | defines | 库存状态调整子表自由自定义项 | st.stockstatuschange.StockStatusChangesAttrextItem |
