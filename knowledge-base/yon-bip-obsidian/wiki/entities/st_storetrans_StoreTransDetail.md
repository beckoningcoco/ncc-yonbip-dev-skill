---
tags: [BIP, metadata, st, StoreTransDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 转库单子表 (st.storetrans.StoreTransDetail)

> Platform: BIP V5 | Module: st | Table: st_storetrans_b | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 转库单子表 |
| uri | st.storetrans.StoreTransDetail |
| tableName | st_storetrans_b |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | st.voucher.UstockVouchLine |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (15)

| # | Name | URI |
|---|------|-----|
| 1 | 特征适配相关信息 (CharacterInfo) | gscm.itf.CharacterInfo |
| 2 | 换算比 (IUOMExchRate) | gscm.itf.IUOMExchRate |
| 3 | 规格 (FreeItem) | base.itf.FreeItem |
| 4 | 计量单位信息 (IUOMInfo) | voucher.base.IUOMInfo |
| 5 | 往来（应收应付）账户 (IContactsAccount) | voucher.base.IContactsAccount |
| 6 | 是否 (IUnitExchangeType) | pub.uom.IUnitExchangeType |
| 7 | 库存状态双向接口 (IStockStatusInandOut) | st.stockStatusRecord.IStockStatusInandOut |
| 8 | 货主对象 (IInventoryOwner) | st.inventoryowner.IInventoryOwner |
| 9 | 货权归属 (IOwnerType) | st.inventoryowner.IOwnerType |
| 10 | 后端自动行号接口 (ILineNo) | base.itf.ILineNo |
| 11 | 租户相关 (ITenant) | base.itf.ITenant |
| 12 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 13 | 项目结构属性 (projectStructureProperties) | BGDM.wbs.projectStructureProperties |
| 14 | 预留对象相关 (IReservationID) | st.reservation.IReservationID |
| 15 | 生单回写 (IBackWrite) | base.itf.IBackWrite |

---

## All Fields (98)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | storetransDefineCharacter | 自定义项特征属性组 | storetransDefineCharacter | UserDefine | st.storetrans.StoretransDefineCharacter |  |  | nullable |
| 2 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 3 | inventoryowner | 货主对象Id | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 4 | unitName | 单位名称 | cunitname | text | String |  |  | nullable |
| 5 | project_code | 项目编码 | cProjectCode | text | String |  |  | nullable |
| 6 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable |
| 7 | productAuth | 物料权限 | iProductid | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 8 | productskun | 默认SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | nullable |
| 9 | reserveid | 跟踪线索Id | reserveid | quote | st.reservation.Reservation |  |  | nullable |
| 10 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 11 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 12 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 13 | sourceid | 上游单据主表id | sourceid | long | Long |  |  | nullable |
| 14 | sourceautoid | 上游单据子表id | sourceautoid | long | Long |  |  | nullable |
| 15 | source | 上游单据类型 | source | text | String |  |  | nullable,reportHide |
| 16 | upcode | 上游单据号 | upcode | text | String |  |  | nullable |
| 17 | makeRuleCode | 生单规则编号 | makerule_code | text | String |  |  | nullable,reportHide |
| 18 | sourceMainPubts | 时间戳 | sourceMainPubts | timestamp | Timestamp |  |  | nullable,reportHide |
| 19 | groupTaskKey | 分组任务KEY | groupTaskKey | text | String |  |  | nullable,reportHide |
| 20 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 21 | ownertype | 货权归属 | ownertype | int | Integer |  |  | nullable |
| 22 | rowno | 序号 | rowno | int | Integer |  |  | isCode,nullable |
| 23 | storetransCharacteristics | 自由项特征组 | storetransCharacteristics | FreeCT | st.storetrans.StoretransCharacteristics |  |  | nullable |
| 24 | unitExchangeTypePrice | 计价单位转换率的换算方式 | unitExchangeTypePrice | int | Integer |  |  |  |
| 25 | mainid | 主表id | imainid | quote | st.storetrans.StoreTrans |  |  | nullable |
| 26 | product | 物料id | iProductid | quote | pc.aa.Product |  |  | data_auth,nullable,dataPowerFlag |
| 27 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 28 | outStockStatusDoc | 出库库存状态 | outStockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 29 | goodsposition | 出库货位id | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 30 | inStockStatusDoc | 入库库存状态 | inStockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 31 | ingoodsposition | 入库货位id | ingoodsposition | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 32 | free1 | 颜色 | free1 | text | String |  |  | isGlobalization,nullable |
| 33 | free2 | 测试3 | free2 | text | String |  |  | isGlobalization,nullable |
| 34 | free3 | 定量测试 | free3 | text | String |  |  | isGlobalization,nullable |
| 35 | free4 | 香雪产地 | free4 | text | String |  |  | isGlobalization,nullable |
| 36 | free5 | 物料规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 37 | free6 | 物料规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 38 | free7 | 物料规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 39 | free8 | 物料规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 40 | free9 | 物料规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 41 | free10 | 物料规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 42 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 43 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 44 | invaliddate | 有效期至 | dInvalidDate | date | Date |  |  | nullable |
| 45 | productsku | skuid | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable |
| 46 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 47 | contactsQuantity | 应收数量 | contacts_quantity | number | Decimal |  |  |  |
| 48 | contactsPieces | 应收件数 | contacts_pieces | number | Decimal |  |  |  |
| 49 | qty | 数量 | qty | number | Decimal |  |  | nullable |
| 50 | unit | 单位id | iunitid | quote | pc.unit.Unit |  |  | nullable |
| 51 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  | nullable |
| 52 | subQty | 件数 | subQty | number | Decimal |  |  | nullable |
| 53 | stockUnitId | 库存单位id | stock_unit_id | quote | pc.unit.Unit |  |  | nullable |
| 54 | project | 项目id | iProject | quote | bd.project.ProjectVO |  |  | dataPowerFlag,data_auth,nullable |
| 55 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int | Integer |  |  |  |
| 56 | memo | 备注 | cMemo | text | String |  |  | nullable |
| 57 | bodyParallel | 转库单子表平行表 | - | - | st.storetrans.StoreTransDetailParallel |  |  |  |
| 58 | define1 | 自定义项1 | define1 | text | String |  |  | isGlobalization,nullable |
| 59 | define10 | 自定义项10 | define10 | text | String |  |  | isGlobalization,nullable |
| 60 | define11 | 自定义项11 | define11 | text | String |  |  | isGlobalization,nullable |
| 61 | define12 | 自定义项12 | define12 | text | String |  |  | isGlobalization,nullable |
| 62 | define13 | 自定义项13 | define13 | text | String |  |  | isGlobalization,nullable |
| 63 | define14 | 自定义项14 | define14 | text | String |  |  | isGlobalization,nullable |
| 64 | define15 | 自定义项15 | define15 | text | String |  |  | isGlobalization,nullable |
| 65 | define16 | 自定义项16 | define16 | text | String |  |  | isGlobalization,nullable |
| 66 | define17 | 自定义项17 | define17 | text | String |  |  | isGlobalization,nullable |
| 67 | define18 | 自定义项18 | define18 | text | String |  |  | isGlobalization,nullable |
| 68 | define19 | 自定义项19 | define19 | text | String |  |  | isGlobalization,nullable |
| 69 | define2 | 自定义项2 | define2 | text | String |  |  | isGlobalization,nullable |
| 70 | define20 | 自定义项20 | define20 | text | String |  |  | isGlobalization,nullable |
| 71 | define21 | 自定义项21 | define21 | text | String |  |  | isGlobalization,nullable |
| 72 | define22 | 自定义项22 | define22 | text | String |  |  | isGlobalization,nullable |
| 73 | define23 | 自定义项23 | define23 | text | String |  |  | isGlobalization,nullable |
| 74 | define24 | 自定义项24 | define24 | text | String |  |  | isGlobalization,nullable |
| 75 | define25 | 自定义项25 | define25 | text | String |  |  | isGlobalization,nullable |
| 76 | define26 | 自定义项26 | define26 | text | String |  |  | isGlobalization,nullable |
| 77 | define27 | 自定义项27 | define27 | text | String |  |  | isGlobalization,nullable |
| 78 | define28 | 自定义项28 | define28 | text | String |  |  | isGlobalization,nullable |
| 79 | define29 | 自定义项29 | define29 | text | String |  |  | isGlobalization,nullable |
| 80 | define3 | 自定义项3 | define3 | text | String |  |  | isGlobalization,nullable |
| 81 | define30 | 自定义项30 | define30 | text | String |  |  | isGlobalization,nullable |
| 82 | define4 | 自定义项4 | define4 | text | String |  |  | isGlobalization,nullable |
| 83 | define5 | 自定义项5 | define5 | text | String |  |  | isGlobalization,nullable |
| 84 | define6 | 自定义项6 | define6 | text | String |  |  | isGlobalization,nullable |
| 85 | define7 | 自定义项7 | define7 | text | String |  |  | isGlobalization,nullable |
| 86 | define8 | 自定义项8 | define8 | text | String |  |  | isGlobalization,nullable |
| 87 | define9 | 自定义项9 | define9 | text | String |  |  | isGlobalization,nullable |
| 88 | defines | 转库单子表自由自定义项 | - | - | st.storetrans.StoreTransDetailAttrextItem |  |  |  |
| 89 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 90 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 91 | stockSensClue | 现存量特征敏感线索 | stockSensClue | text | String |  |  | nullable |
| 92 | storeTransDetailCustomItem | 子表自定义项 | - | - | st.storetrans.StoreTransDetailCustomItem |  |  |  |
| 93 | storeTransDetailSNs | 转库单序列号 | - | - | st.storetrans.StoreTransDetailSN |  |  |  |
| 94 | writeOffQtyTotal | 累计冲销数量 | write_off_qty_total | number | Decimal |  |  | nullable |
| 95 | writeOffSourceautoid | 冲销线索子表id | write_off_sourceautoid | long | Long |  |  | nullable |
| 96 | writeOffSourceid | 冲销线索主表id | write_off_sourceid | long | Long |  |  | nullable |
| 97 | writeOffUpcode | 冲销单据号 | write_off_upcode | text | String |  |  | nullable |
| 98 | writeOffUplineno | 冲销单据行号 | write_off_uplineno | number | Decimal |  |  | nullable |

---

## Reference Fields (19)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 2 | inventoryowner | 货主对象Id | inventoryowner | st.inventoryowner.InventoryOwner |
| 3 | productn | 物料 | iProductid | pc.product.Product |
| 4 | productAuth | 物料权限 | iProductid | pb.dataauth.ProductDataAuth |
| 5 | productskun | 默认SKUID | iProductSkuid | pc.product.ProductSKU |
| 6 | reserveid | 跟踪线索Id | reserveid | st.reservation.Reservation |
| 7 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 8 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 9 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 10 | mainid | 主表id | imainid | st.storetrans.StoreTrans |
| 11 | product | 物料id | iProductid | pc.aa.Product |
| 12 | outStockStatusDoc | 出库库存状态 | outStockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 13 | goodsposition | 出库货位id | iGoodsPositionId | aa.goodsposition.GoodsPosition |
| 14 | inStockStatusDoc | 入库库存状态 | inStockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 15 | ingoodsposition | 入库货位id | ingoodsposition | aa.goodsposition.GoodsPosition |
| 16 | productsku | skuid | iProductSkuid | pc.aa.ProductSKU |
| 17 | unit | 单位id | iunitid | pc.unit.Unit |
| 18 | stockUnitId | 库存单位id | stock_unit_id | pc.unit.Unit |
| 19 | project | 项目id | iProject | bd.project.ProjectVO |

---

## Number Fields (14)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | lineno | 行号 | lineno | number |
| 2 | ownertype | 货权归属 | ownertype | int |
| 3 | rowno | 序号 | rowno | int |
| 4 | unitExchangeTypePrice | 计价单位转换率的换算方式 | unitExchangeTypePrice | int |
| 5 | contactsQuantity | 应收数量 | contacts_quantity | number |
| 6 | contactsPieces | 应收件数 | contacts_pieces | number |
| 7 | qty | 数量 | qty | number |
| 8 | invExchRate | 换算率 | invExchRate | number |
| 9 | subQty | 件数 | subQty | number |
| 10 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int |
| 11 | invExchRateDen | 换算率分母 | invexchrateden | number |
| 12 | invExchRateNum | 换算率分子 | invexchratenum | number |
| 13 | writeOffQtyTotal | 累计冲销数量 | write_off_qty_total | number |
| 14 | writeOffUplineno | 冲销单据行号 | write_off_uplineno | number |

---

## Date Fields (2)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | producedate | 生产日期 | dProduceDate | date |
| 2 | invaliddate | 有效期至 | dInvalidDate | date |

---

## Child Tables (4)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | storeTransDetailCustomItem | 子表自定义项 | st.storetrans.StoreTransDetailCustomItem |
| 2 | bodyParallel | 转库单子表平行表 | st.storetrans.StoreTransDetailParallel |
| 3 | storeTransDetailSNs | 转库单序列号 | st.storetrans.StoreTransDetailSN |
| 4 | defines | 转库单子表自由自定义项 | st.storetrans.StoreTransDetailAttrextItem |
