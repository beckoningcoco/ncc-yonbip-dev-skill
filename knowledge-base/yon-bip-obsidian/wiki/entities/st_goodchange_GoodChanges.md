---
tags: [BIP, metadata, st, GoodChanges]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 调整单子表 (st.goodchange.GoodChanges)

> Platform: BIP V5 | Module: st | Table: st_goodchanges | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 调整单子表 |
| uri | st.goodchange.GoodChanges |
| tableName | st_goodchanges |
| domain | ustock |
| applicationCode | ST |
| superUri | st.voucher.UstockVouchLine |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (19)

| # | Name | URI |
|---|------|-----|
| 1 | 换算比 (IUOMExchRate) | gscm.itf.IUOMExchRate |
| 2 | 规格 (FreeItem) | base.itf.FreeItem |
| 3 | 往来（应收应付）账户 (IContactsAccount) | voucher.base.IContactsAccount |
| 4 | 公共体 (IMODetailCommon) | st.goodchange.IMODetailCommon |
| 5 | 计量单位信息 (IUOMInfo) | voucher.base.IUOMInfo |
| 6 | 来源单据信息 (ISourceData) | st.voucher.ISourceData |
| 7 | 源头单据信息 (IFirstSourceData) | st.voucher.IFirstSourceData |
| 8 | 库存状态双向接口 (IStockStatusInandOut) | st.stockStatusRecord.IStockStatusInandOut |
| 9 | 预留双向 (IReservationInOut) | st.reservation.IReservationInOut |
| 10 | 后端自动行号接口 (ILineNo) | base.itf.ILineNo |
| 11 | 上游单据行号 (IUpLinenNO) | st.uplineno.IUpLinenNO |
| 12 | 源头单据行号 (FirstupLinenNO) | st.uplineno.FirstupLinenNO |
| 13 | 生单回写 (IBackWrite) | base.itf.IBackWrite |
| 14 | 租户相关 (ITenant) | base.itf.ITenant |
| 15 | 特征适配相关信息 (CharacterInfo) | gscm.itf.CharacterInfo |
| 16 | 库存类型对象 (IStockType) | st.stocktype.IStockType |
| 17 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 18 | 项目结构属性 (projectStructureProperties) | BGDM.wbs.projectStructureProperties |
| 19 | 货主对象 (IInventoryOwner) | st.inventoryowner.IInventoryOwner |

---

## All Fields (108)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | firstuplineno | 源头单据行号 | firstuplineno | number | Decimal |  |  | nullable |
| 2 | goodchangesCharacteristics | 自由项特征组 | goodchangesCharacteristics | FreeCT | st.goodchange.GoodChangesCharacteristics |  |  | nullable |
| 3 | goodsposition | 货位 | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 4 | groupTaskKey | 分组任务KEY | groupTaskKey | text | String |  |  | nullable,reportHide |
| 5 | quantity | 数量 | fQuantity | number | Decimal |  |  | isCalcQty,nullable |
| 6 | sourceMainPubts | 时间戳 | sourceMainPubts | timestamp | Timestamp |  |  | nullable,reportHide |
| 7 | goodchangesDefineCharacter | 自定义项特征组 | goodchangesDefineCharacter | UserDefine | st.goodchange.GoodChangesDefineCharacter |  |  | nullable |
| 8 | stockSensClue | 现存量特征敏感线索 | stockSensClue | text | String |  |  | nullable |
| 9 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable |
| 10 | productAuth | 物料权限 | iProductid | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 11 | productskun | 默认SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | nullable |
| 12 | stockType | 库存类型 | stockType | quote | st.stocktype.StockType |  |  | nullable |
| 13 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 14 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 15 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 16 | inventoryowner | 货主对象Id | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 17 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 18 | uplineno | 上游单据行号 | uplineno | number | Decimal |  |  | nullable |
| 19 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 20 | org | 组织id | orgId | quote | aa.baseorg.InventoryOrgMV |  |  | nullable |
| 21 | warehouse | 仓库id | iWarehouseId | quote | aa.warehouse.Warehouse |  |  | nullable |
| 22 | product | 物料id | iProductid | quote | pc.aa.Product |  |  | data_auth,nullable,dataPowerFlag |
| 23 | productsku | 商品SKUid | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable |
| 24 | unit | 单位id | iUnitId | quote | pc.unit.Unit |  |  | nullable |
| 25 | free1 | 颜色 | free1 | text | String |  |  | isGlobalization,nullable |
| 26 | free2 | 测试3 | free2 | text | String |  |  | isGlobalization,nullable |
| 27 | free3 | 定量测试 | free3 | text | String |  |  | isGlobalization,nullable |
| 28 | free4 | 香雪产地 | free4 | text | String |  |  | isGlobalization,nullable |
| 29 | free5 | 物料规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 30 | free6 | 物料规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 31 | free7 | 物料规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 32 | free8 | 物料规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 33 | free9 | 物料规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 34 | free10 | 物料规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 35 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 36 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 37 | invaliddate | 有效期至 | dInvalidDate | date | Date |  |  | nullable |
| 38 | recorddate | 入库日期 | dRecordDate | date | Date |  |  | nullable |
| 39 | memo | 备注 | cMemo | text | String |  |  | nullable |
| 40 | mainid | 主表id | iMainId | quote | st.goodchange.GoodChange |  |  | nullable |
| 41 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 42 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 43 | sourceid | 上游单据主表id | sourceid | long | Long |  |  | nullable |
| 44 | sourceautoid | 上游单据子表id | sourceautoid | long | Long |  |  | nullable |
| 45 | source | 上游单据类型 | source | text | String |  |  | nullable,reportHide |
| 46 | upcode | 上游单据号 | upcode | text | String |  |  | nullable |
| 47 | makeRuleCode | 生单规则编号 | makerule_code | text | String |  |  | nullable,reportHide |
| 48 | outgoodsposition | 货位id | iOutGoodsPosition | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 49 | ingoodsposition | 入库货位id | iInGoodsPosition | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 50 | outStockStatusDoc | 来源库存状态id | outStockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 51 | inStockStatusDoc | 目的库存状态id | inStockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 52 | contactsQuantity | 应收数量 | contacts_quantity | number | Decimal |  |  |  |
| 53 | contactsPieces | 应收件数 | contacts_pieces | number | Decimal |  |  |  |
| 54 | outreserveid | 来源预留对象id | outreserveid | quote | st.reservation.Reservation |  |  | nullable |
| 55 | inreserveid | 目的预留对象id | inreserveid | quote | st.reservation.Reservation |  |  | nullable |
| 56 | currentqty | 现存量 | fCurrentQty | number | Decimal |  |  | nullable |
| 57 | availableqty | 可用量 | fAvailableQty | number | Decimal |  |  | nullable |
| 58 | currentSubQty | 现存件数 | fCurrentSubQty | number | Decimal |  |  | nullable |
| 59 | availableSubQty | 可用件数 | fAvailableSubQty | number | Decimal |  |  | nullable |
| 60 | qty | 调整数量 | qty | number | Decimal |  |  | nullable |
| 61 | subQty | 调整件数 | subQty | number | Decimal |  |  | nullable |
| 62 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  | nullable |
| 63 | stockUnitId | 库存单位id | stock_unit_id | quote | pc.unit.Unit |  |  | nullable |
| 64 | project | 项目id | iProject | quote | bd.project.ProjectVO |  |  | dataPowerFlag,data_auth,nullable |
| 65 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int | Integer |  |  | nullable |
| 66 | rowno | 行号 | rowno | int | Integer |  |  | isCode,nullable |
| 67 | innoticeqty | 收货预计入库量 | fInnoticeQty | number | Decimal |  |  | nullable |
| 68 | outnoticeqty | 发货预计出库量 | fOutnoticeQty | number | Decimal |  |  | nullable |
| 69 | preretailqty | 订单预计出库量 | fPreretailQty | number | Decimal |  |  | nullable |
| 70 | firstsourceid | 源头单据id | firstsourceid | long | Long |  |  | nullable |
| 71 | firstsourceautoid | 源头单据行id | firstsourceautoid | long | Long |  |  | nullable |
| 72 | firstsource | 源头单据类型 | firstsource | text | String |  |  | nullable |
| 73 | firstupcode | 源头单据号 | firstupcode | text | String |  |  | nullable |
| 74 | bodyItem | 货位调整单子表自定义项 | - | - | st.goodchange.GoodChangesCustomItem |  |  |  |
| 75 | define1 | 自定义项1 | define1 | text | String |  |  | isGlobalization,nullable |
| 76 | define10 | 自定义项10 | define10 | text | String |  |  | isGlobalization,nullable |
| 77 | define11 | 自定义项11 | define11 | text | String |  |  | isGlobalization,nullable |
| 78 | define12 | 自定义项12 | define12 | text | String |  |  | isGlobalization,nullable |
| 79 | define13 | 自定义项13 | define13 | text | String |  |  | isGlobalization,nullable |
| 80 | define14 | 自定义项14 | define14 | text | String |  |  | isGlobalization,nullable |
| 81 | define15 | 自定义项15 | define15 | text | String |  |  | isGlobalization,nullable |
| 82 | define16 | 自定义项16 | define16 | text | String |  |  | isGlobalization,nullable |
| 83 | define17 | 自定义项17 | define17 | text | String |  |  | isGlobalization,nullable |
| 84 | define18 | 自定义项18 | define18 | text | String |  |  | isGlobalization,nullable |
| 85 | define19 | 自定义项19 | define19 | text | String |  |  | isGlobalization,nullable |
| 86 | define2 | 自定义项2 | define2 | text | String |  |  | isGlobalization,nullable |
| 87 | define20 | 自定义项20 | define20 | text | String |  |  | isGlobalization,nullable |
| 88 | define21 | 自定义项21 | define21 | text | String |  |  | isGlobalization,nullable |
| 89 | define22 | 自定义项22 | define22 | text | String |  |  | isGlobalization,nullable |
| 90 | define23 | 自定义项23 | define23 | text | String |  |  | isGlobalization,nullable |
| 91 | define24 | 自定义项24 | define24 | text | String |  |  | isGlobalization,nullable |
| 92 | define25 | 自定义项25 | define25 | text | String |  |  | isGlobalization,nullable |
| 93 | define26 | 自定义项26 | define26 | text | String |  |  | isGlobalization,nullable |
| 94 | define27 | 自定义项27 | define27 | text | String |  |  | isGlobalization,nullable |
| 95 | define28 | 自定义项28 | define28 | text | String |  |  | isGlobalization,nullable |
| 96 | define29 | 自定义项29 | define29 | text | String |  |  | isGlobalization,nullable |
| 97 | define3 | 自定义项3 | define3 | text | String |  |  | isGlobalization,nullable |
| 98 | define30 | 自定义项30 | define30 | text | String |  |  | isGlobalization,nullable |
| 99 | define4 | 自定义项4 | define4 | text | String |  |  | isGlobalization,nullable |
| 100 | define5 | 自定义项5 | define5 | text | String |  |  | isGlobalization,nullable |
| 101 | define6 | 自定义项6 | define6 | text | String |  |  | isGlobalization,nullable |
| 102 | define7 | 自定义项7 | define7 | text | String |  |  | isGlobalization,nullable |
| 103 | define8 | 自定义项8 | define8 | text | String |  |  | isGlobalization,nullable |
| 104 | define9 | 自定义项9 | define9 | text | String |  |  | isGlobalization,nullable |
| 105 | defines | 货位调整单子表自由自定义项 | - | - | st.goodchange.GoodChangesAttrextItem |  |  |  |
| 106 | goodChangesSNs | 货位调整单序列号 | - | - | st.goodchange.GoodChangesSN |  |  |  |
| 107 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 108 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |

---

## Reference Fields (24)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | goodsposition | 货位 | iGoodsPositionId | aa.goodsposition.GoodsPosition |
| 2 | productn | 物料 | iProductid | pc.product.Product |
| 3 | productAuth | 物料权限 | iProductid | pb.dataauth.ProductDataAuth |
| 4 | productskun | 默认SKUID | iProductSkuid | pc.product.ProductSKU |
| 5 | stockType | 库存类型 | stockType | st.stocktype.StockType |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 7 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 8 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 9 | inventoryowner | 货主对象Id | inventoryowner | st.inventoryowner.InventoryOwner |
| 10 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 11 | org | 组织id | orgId | aa.baseorg.InventoryOrgMV |
| 12 | warehouse | 仓库id | iWarehouseId | aa.warehouse.Warehouse |
| 13 | product | 物料id | iProductid | pc.aa.Product |
| 14 | productsku | 商品SKUid | iProductSkuid | pc.aa.ProductSKU |
| 15 | unit | 单位id | iUnitId | pc.unit.Unit |
| 16 | mainid | 主表id | iMainId | st.goodchange.GoodChange |
| 17 | outgoodsposition | 货位id | iOutGoodsPosition | aa.goodsposition.GoodsPosition |
| 18 | ingoodsposition | 入库货位id | iInGoodsPosition | aa.goodsposition.GoodsPosition |
| 19 | outStockStatusDoc | 来源库存状态id | outStockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 20 | inStockStatusDoc | 目的库存状态id | inStockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 21 | outreserveid | 来源预留对象id | outreserveid | st.reservation.Reservation |
| 22 | inreserveid | 目的预留对象id | inreserveid | st.reservation.Reservation |
| 23 | stockUnitId | 库存单位id | stock_unit_id | pc.unit.Unit |
| 24 | project | 项目id | iProject | bd.project.ProjectVO |

---

## Number Fields (20)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | firstuplineno | 源头单据行号 | firstuplineno | number |
| 2 | quantity | 数量 | fQuantity | number |
| 3 | uplineno | 上游单据行号 | uplineno | number |
| 4 | lineno | 行号 | lineno | number |
| 5 | contactsQuantity | 应收数量 | contacts_quantity | number |
| 6 | contactsPieces | 应收件数 | contacts_pieces | number |
| 7 | currentqty | 现存量 | fCurrentQty | number |
| 8 | availableqty | 可用量 | fAvailableQty | number |
| 9 | currentSubQty | 现存件数 | fCurrentSubQty | number |
| 10 | availableSubQty | 可用件数 | fAvailableSubQty | number |
| 11 | qty | 调整数量 | qty | number |
| 12 | subQty | 调整件数 | subQty | number |
| 13 | invExchRate | 换算率 | invExchRate | number |
| 14 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int |
| 15 | rowno | 行号 | rowno | int |
| 16 | innoticeqty | 收货预计入库量 | fInnoticeQty | number |
| 17 | outnoticeqty | 发货预计出库量 | fOutnoticeQty | number |
| 18 | preretailqty | 订单预计出库量 | fPreretailQty | number |
| 19 | invExchRateDen | 换算率分母 | invexchrateden | number |
| 20 | invExchRateNum | 换算率分子 | invexchratenum | number |

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
| 1 | bodyItem | 货位调整单子表自定义项 | st.goodchange.GoodChangesCustomItem |
| 2 | goodChangesSNs | 货位调整单序列号 | st.goodchange.GoodChangesSN |
| 3 | defines | 货位调整单子表自由自定义项 | st.goodchange.GoodChangesAttrextItem |
