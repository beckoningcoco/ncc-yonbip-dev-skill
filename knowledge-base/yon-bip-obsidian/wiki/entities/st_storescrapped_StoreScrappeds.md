---
tags: [BIP, metadata, st, StoreScrappeds]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 报废子表 (st.storescrapped.StoreScrappeds)

> Platform: BIP V5 | Module: st | Table: st_goodchanges | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 报废子表 |
| uri | st.storescrapped.StoreScrappeds |
| tableName | st_goodchanges |
| domain | ustock |
| applicationCode | ST |
| superUri | st.goodchange.GoodChanges |
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

## All Fields (116)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 2 | org | 组织id | orgId | quote | aa.baseorg.InventoryOrgMV |  |  | nullable |
| 3 | warehouse | 仓库id | iWarehouseId | quote | aa.warehouse.Warehouse |  |  | data_auth,nullable |
| 4 | product | 物料id | iProductid | quote | pc.aa.Product |  |  | data_auth,nullable,dataPowerFlag |
| 5 | wasteMoney | 废品金额 | waste_money | number | Decimal |  |  | nullable |
| 6 | groupTaskKey | 分组任务KEY | groupTaskKey | text | String |  |  | nullable,reportHide |
| 7 | firstuplineno | 源头单据行号 | firstuplineno | number | Decimal |  |  | nullable |
| 8 | goodsposition | 货位 | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 9 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 10 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 11 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 12 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 13 | inventoryowner | 货主对象Id | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 14 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 15 | iPrcsStatus | 加工状态 | iPrcsStatus | - | st.storescrapped.PrcsStatus |  |  | nullable |
| 16 | stockSensClue | 现存量特征敏感线索 | stockSensClue | text | String |  |  | nullable |
| 17 | wasteUnitPrice | 废品单价 | waste_unit_price | number | Decimal |  |  | nullable |
| 18 | productAuth | 物料权限 | iProductid | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 19 | fQuotePrice | 零售价 | fQuotePrice | number | Decimal |  |  | nullable |
| 20 | contactsPieces | 往来件数 | contacts_pieces | number | Decimal |  |  |  |
| 21 | makeMethod | 做法 | makeMethod | text | String |  |  | nullable |
| 22 | contactsQuantity | 往来数量 | contacts_quantity | number | Decimal |  |  |  |
| 23 | productskun | 默认SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | nullable |
| 24 | fQuoteMoney | 零售金额 | fQuoteMoney | number | Decimal |  |  | nullable |
| 25 | wasteWarehouse | 转入废品仓 | iWasteWarehouseId | quote | aa.warehouse.Warehouse |  |  | data_auth,nullable |
| 26 | quantity | 数量 | fQuantity | number | Decimal |  |  | isCalcQty,nullable |
| 27 | sourceMainPubts | 时间戳 | sourceMainPubts | timestamp | Timestamp |  |  | nullable,reportHide |
| 28 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide,notGenerate |
| 29 | stockType | 库存类型 | stockType | quote | st.stocktype.StockType |  |  | nullable |
| 30 | makeMethodAffectingBom | 影响配方的做法 | makeMethodAffectingBom | text | String |  |  | nullable |
| 31 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable |
| 32 | uplineno | 上游单据行号 | uplineno | number | Decimal |  |  | nullable |
| 33 | goodchangesCharacteristics | 自由项特征组 | goodchangesCharacteristics | FreeCT | st.goodchange.GoodChangesCharacteristics |  |  | nullable |
| 34 | goodchangesDefineCharacter | 自定义项特征组 | goodchangesDefineCharacter | UserDefine | st.goodchange.GoodChangesDefineCharacter |  |  | nullable |
| 35 | productsku | 商品SKUid | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable |
| 36 | unit | 单位id | iUnitId | quote | pc.unit.Unit |  |  | nullable |
| 37 | free1 | 商品规格1 | free1 | text | String |  |  | isGlobalization,nullable |
| 38 | free2 | 物料规格2 | free2 | text | String |  |  | isGlobalization,nullable |
| 39 | free3 | 物料规格3 | free3 | text | String |  |  | isGlobalization,nullable |
| 40 | free4 | 商品规格4 | free4 | text | String |  |  | isGlobalization,nullable |
| 41 | free5 | 物料规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 42 | free6 | 物料规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 43 | free7 | 物料规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 44 | free8 | 物料规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 45 | free9 | 物料规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 46 | free10 | 物料规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 47 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 48 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 49 | invaliddate | 有效期至 | dInvalidDate | date | Date |  |  | nullable |
| 50 | recorddate | 入库日期 | dRecordDate | date | Date |  |  | nullable |
| 51 | memo | 备注 | cMemo | text | String |  |  | nullable |
| 52 | mainid | 主表id | iMainId | quote | st.storescrapped.StoreScrapped |  |  | nullable |
| 53 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 54 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 55 | sourceid | 上游单据主表id | sourceid | long | Long |  |  | nullable |
| 56 | sourceautoid | 上游单据子表id | sourceautoid | long | Long |  |  | nullable |
| 57 | source | 上游单据类型 | source | text | String |  |  | nullable,reportHide |
| 58 | upcode | 上游单据号 | upcode | text | String |  |  | nullable |
| 59 | makeRuleCode | 生单规则编号 | makerule_code | text | String |  |  | nullable,reportHide |
| 60 | outgoodsposition | 货位id | iOutGoodsPosition | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 61 | ingoodsposition | 入库货位id | iInGoodsPosition | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 62 | outStockStatusDoc | 来源库存状态id | outStockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 63 | inStockStatusDoc | 目的库存状态id | inStockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 64 | outreserveid | 预留对象id | outreserveid | quote | st.reservation.Reservation |  |  | nullable |
| 65 | inreserveid | 入库预留对象id | inreserveid | quote | st.reservation.Reservation |  |  | nullable |
| 66 | currentqty | 现存量 | fCurrentQty | number | Decimal |  |  | nullable |
| 67 | availableqty | 可用量 | fAvailableQty | number | Decimal |  |  | nullable |
| 68 | currentSubQty | 现存件数 | fCurrentSubQty | number | Decimal |  |  | nullable |
| 69 | availableSubQty | 可用件数 | fAvailableSubQty | number | Decimal |  |  | nullable |
| 70 | qty | 调整数量 | qty | number | Decimal |  |  | nullable |
| 71 | subQty | 调整件数 | subQty | number | Decimal |  |  | nullable |
| 72 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  | nullable |
| 73 | stockUnitId | 库存单位id | stock_unit_id | quote | pc.unit.Unit |  |  | nullable |
| 74 | project | 项目id | iProject | quote | bd.project.ProjectVO |  |  | dataPowerFlag,data_auth,nullable |
| 75 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int | Integer |  |  | nullable |
| 76 | rowno | 行号 | rowno | int | Integer |  |  | isCode,nullable |
| 77 | innoticeqty | 收货预计入库量 | fInnoticeQty | number | Decimal |  |  | nullable |
| 78 | outnoticeqty | 发货预计出库量 | fOutnoticeQty | number | Decimal |  |  | nullable |
| 79 | preretailqty | 订单预计出库量 | fPreretailQty | number | Decimal |  |  | nullable |
| 80 | firstsourceid | 源头单据id | firstsourceid | long | Long |  |  | nullable |
| 81 | firstsourceautoid | 源头单据行id | firstsourceautoid | long | Long |  |  | nullable |
| 82 | firstsource | 源头单据类型 | firstsource | text | String |  |  | nullable |
| 83 | firstupcode | 源头单据号 | firstupcode | text | String |  |  | nullable |
| 84 | bodyItem | 报废子表自定义项 | - | - | st.storescrapped.StoreScrappedsCustomItem |  |  |  |
| 85 | define1 | 自定义项1 | define1 | text | String |  |  | isGlobalization,nullable |
| 86 | define10 | 自定义项10 | define10 | text | String |  |  | isGlobalization,nullable |
| 87 | define11 | 自定义项11 | define11 | text | String |  |  | isGlobalization,nullable |
| 88 | define12 | 自定义项12 | define12 | text | String |  |  | isGlobalization,nullable |
| 89 | define13 | 自定义项13 | define13 | text | String |  |  | isGlobalization,nullable |
| 90 | define14 | 自定义项14 | define14 | text | String |  |  | isGlobalization,nullable |
| 91 | define15 | 自定义项15 | define15 | text | String |  |  | isGlobalization,nullable |
| 92 | define16 | 自定义项16 | define16 | text | String |  |  | isGlobalization,nullable |
| 93 | define17 | 自定义项17 | define17 | text | String |  |  | isGlobalization,nullable |
| 94 | define18 | 自定义项18 | define18 | text | String |  |  | isGlobalization,nullable |
| 95 | define19 | 自定义项19 | define19 | text | String |  |  | isGlobalization,nullable |
| 96 | define2 | 自定义项2 | define2 | text | String |  |  | isGlobalization,nullable |
| 97 | define20 | 自定义项20 | define20 | text | String |  |  | isGlobalization,nullable |
| 98 | define21 | 自定义项21 | define21 | text | String |  |  | isGlobalization,nullable |
| 99 | define22 | 自定义项22 | define22 | text | String |  |  | isGlobalization,nullable |
| 100 | define23 | 自定义项23 | define23 | text | String |  |  | isGlobalization,nullable |
| 101 | define24 | 自定义项24 | define24 | text | String |  |  | isGlobalization,nullable |
| 102 | define25 | 自定义项25 | define25 | text | String |  |  | isGlobalization,nullable |
| 103 | define26 | 自定义项26 | define26 | text | String |  |  | isGlobalization,nullable |
| 104 | define27 | 自定义项27 | define27 | text | String |  |  | isGlobalization,nullable |
| 105 | define28 | 自定义项28 | define28 | text | String |  |  | isGlobalization,nullable |
| 106 | define29 | 自定义项29 | define29 | text | String |  |  | isGlobalization,nullable |
| 107 | define3 | 自定义项3 | define3 | text | String |  |  | isGlobalization,nullable |
| 108 | define30 | 自定义项30 | define30 | text | String |  |  | isGlobalization,nullable |
| 109 | define4 | 自定义项4 | define4 | text | String |  |  | isGlobalization,nullable |
| 110 | define5 | 自定义项5 | define5 | text | String |  |  | isGlobalization,nullable |
| 111 | define6 | 自定义项6 | define6 | text | String |  |  | isGlobalization,nullable |
| 112 | define7 | 自定义项7 | define7 | text | String |  |  | isGlobalization,nullable |
| 113 | define8 | 自定义项8 | define8 | text | String |  |  | isGlobalization,nullable |
| 114 | define9 | 自定义项9 | define9 | text | String |  |  | isGlobalization,nullable |
| 115 | defines | 报废子表自由自定义项 | - | - | st.storescrapped.StoreScrappedsAttrextItem |  |  |  |
| 116 | storeScrappedsSNs | 报废序列号 | - | - | st.storescrapped.StoreScrappedsSN |  |  |  |

---

## Reference Fields (25)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | org | 组织id | orgId | aa.baseorg.InventoryOrgMV |
| 2 | warehouse | 仓库id | iWarehouseId | aa.warehouse.Warehouse |
| 3 | product | 物料id | iProductid | pc.aa.Product |
| 4 | goodsposition | 货位 | iGoodsPositionId | aa.goodsposition.GoodsPosition |
| 5 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 6 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 7 | inventoryowner | 货主对象Id | inventoryowner | st.inventoryowner.InventoryOwner |
| 8 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 9 | productAuth | 物料权限 | iProductid | pb.dataauth.ProductDataAuth |
| 10 | productskun | 默认SKUID | iProductSkuid | pc.product.ProductSKU |
| 11 | wasteWarehouse | 转入废品仓 | iWasteWarehouseId | aa.warehouse.Warehouse |
| 12 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 13 | stockType | 库存类型 | stockType | st.stocktype.StockType |
| 14 | productn | 物料 | iProductid | pc.product.Product |
| 15 | productsku | 商品SKUid | iProductSkuid | pc.aa.ProductSKU |
| 16 | unit | 单位id | iUnitId | pc.unit.Unit |
| 17 | mainid | 主表id | iMainId | st.storescrapped.StoreScrapped |
| 18 | outgoodsposition | 货位id | iOutGoodsPosition | aa.goodsposition.GoodsPosition |
| 19 | ingoodsposition | 入库货位id | iInGoodsPosition | aa.goodsposition.GoodsPosition |
| 20 | outStockStatusDoc | 来源库存状态id | outStockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 21 | inStockStatusDoc | 目的库存状态id | inStockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 22 | outreserveid | 预留对象id | outreserveid | st.reservation.Reservation |
| 23 | inreserveid | 入库预留对象id | inreserveid | st.reservation.Reservation |
| 24 | stockUnitId | 库存单位id | stock_unit_id | pc.unit.Unit |
| 25 | project | 项目id | iProject | bd.project.ProjectVO |

---

## Number Fields (24)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | lineno | 行号 | lineno | number |
| 2 | wasteMoney | 废品金额 | waste_money | number |
| 3 | firstuplineno | 源头单据行号 | firstuplineno | number |
| 4 | invExchRateDen | 换算率分母 | invexchrateden | number |
| 5 | invExchRateNum | 换算率分子 | invexchratenum | number |
| 6 | wasteUnitPrice | 废品单价 | waste_unit_price | number |
| 7 | fQuotePrice | 零售价 | fQuotePrice | number |
| 8 | contactsPieces | 往来件数 | contacts_pieces | number |
| 9 | contactsQuantity | 往来数量 | contacts_quantity | number |
| 10 | fQuoteMoney | 零售金额 | fQuoteMoney | number |
| 11 | quantity | 数量 | fQuantity | number |
| 12 | uplineno | 上游单据行号 | uplineno | number |
| 13 | currentqty | 现存量 | fCurrentQty | number |
| 14 | availableqty | 可用量 | fAvailableQty | number |
| 15 | currentSubQty | 现存件数 | fCurrentSubQty | number |
| 16 | availableSubQty | 可用件数 | fAvailableSubQty | number |
| 17 | qty | 调整数量 | qty | number |
| 18 | subQty | 调整件数 | subQty | number |
| 19 | invExchRate | 换算率 | invExchRate | number |
| 20 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int |
| 21 | rowno | 行号 | rowno | int |
| 22 | innoticeqty | 收货预计入库量 | fInnoticeQty | number |
| 23 | outnoticeqty | 发货预计出库量 | fOutnoticeQty | number |
| 24 | preretailqty | 订单预计出库量 | fPreretailQty | number |

---

## Date Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | producedate | 生产日期 | dProduceDate | date |
| 2 | invaliddate | 有效期至 | dInvalidDate | date |
| 3 | recorddate | 入库日期 | dRecordDate | date |

---

## Child Tables (3)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | bodyItem | 报废子表自定义项 | st.storescrapped.StoreScrappedsCustomItem |
| 2 | storeScrappedsSNs | 报废序列号 | st.storescrapped.StoreScrappedsSN |
| 3 | defines | 报废子表自由自定义项 | st.storescrapped.StoreScrappedsAttrextItem |
