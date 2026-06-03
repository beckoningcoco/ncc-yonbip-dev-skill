---
tags: [BIP, metadata, st, StoreCheckRealityDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 实盘子表 (st.storecheckreality.StoreCheckRealityDetail)

> Platform: BIP V5 | Module: st | Table: st_storecheckreality_b | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 实盘子表 |
| uri | st.storecheckreality.StoreCheckRealityDetail |
| tableName | st_storecheckreality_b |
| domain | ustock |
| applicationCode | ST |
| superUri | st.pubstorecheck.PubStoreCheckDetail |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (7)

| # | Name | URI |
|---|------|-----|
| 1 | 源头单据信息 (IFirstSourceData) | st.voucher.IFirstSourceData |
| 2 | 后端自动行号接口 (ILineNo) | base.itf.ILineNo |
| 3 | 上游单据行号 (IUpLinenNO) | st.uplineno.IUpLinenNO |
| 4 | 源头单据行号 (FirstupLinenNO) | st.uplineno.FirstupLinenNO |
| 5 | 租户相关 (ITenant) | base.itf.ITenant |
| 6 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 7 | 项目结构属性 (projectStructureProperties) | BGDM.wbs.projectStructureProperties |

---

## All Fields (104)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | sensitiveUID | SKU敏感域唯一性ID | sensitiveUID | text | String |  |  | nullable |
| 2 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 3 | abandoned | 作废 | abandoned | int | Integer |  |  | nullable |
| 4 | abandonedIds | 被该商品行作废的实盘单子表主键 | abandonedIds | text | String |  |  | nullable |
| 5 | isStockcheck | 已盘 | is_stockcheck | switch | Boolean |  |  | nullable |
| 6 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 7 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 8 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 9 | expireDateNo | 保质期 | expireDateNo | int | Integer |  |  | nullable |
| 10 | expireDateUnit | 保质期单位 | expireDateUnit | int | Integer |  |  | nullable |
| 11 | project_code | 项目编码 | cProjectCode | text | String |  |  | nullable |
| 12 | productAuth | 物料权限 | iProductid | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 13 | productskun | 默认SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | nullable |
| 14 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable |
| 15 | lossnumber | 盘亏件数 | lossnumber | number | Decimal |  |  | nullable |
| 16 | lossqty | 盘亏数量 | lossqty | number | Decimal |  |  | nullable |
| 17 | profitnumber | 盘盈件数 | profitnumber | number | Decimal |  |  | nullable |
| 18 | profitqty | 盘盈数量 | profitqty | number | Decimal |  |  | nullable |
| 19 | product | 物料id | iProductid | quote | pc.aa.Product |  |  | data_auth,nullable,dataPowerFlag |
| 20 | storeCheckRealityDetailCharacteristics | 自由项特征组 | storeCheckRealityDetailCharacteristics | FreeCT | st.storecheckreality.StoreCheckRealityDetailCharacteristics |  |  | nullable |
| 21 | storeCheckRealityDetailDefineCharacter | 自定义项特征属性组 | storeCheckRealityDetailDefineCharacter | UserDefine | st.storecheckreality.StoreCheckRealityDetailDefineCharacter |  |  | nullable |
| 22 | firstupcode | 源头单据号 | firstupcode | text | String |  |  | nullable |
| 23 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 24 | firstsource | 源头单据类型 | firstsource | text | String |  |  | nullable |
| 25 | firstsourceautoid | 源头单据子表id | firstsourceautoid | long | Long |  |  | nullable |
| 26 | firstsourceid | 源头单据主表id | firstsourceid | long | Long |  |  | nullable |
| 27 | mainid | 主表id | imainid | quote | st.storecheckreality.StoreCheckReality |  |  | nullable |
| 28 | rowno | 行号 | rowno | int | Integer |  |  | isCode,nullable |
| 29 | firstuplineno | 源头单据行号 | firstuplineno | number | Decimal |  |  | nullable |
| 30 | stockStatusDoc | 库存状态id | stockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 31 | uplineno | 来源单据行号 | uplineno | number | Decimal |  |  | nullable |
| 32 | productsku | skuid | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable |
| 33 | reserveid | 预留对象id | reserveid | quote | st.reservation.Reservation |  |  | nullable |
| 34 | free1 | 颜色 | free1 | text | String |  |  | isGlobalization,nullable |
| 35 | free2 | 测试3 | free2 | text | String |  |  | isGlobalization,nullable |
| 36 | free3 | 定量测试 | free3 | text | String |  |  | isGlobalization,nullable |
| 37 | free4 | 香雪产地 | free4 | text | String |  |  | isGlobalization,nullable |
| 38 | free5 | 物料规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 39 | free6 | 物料规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 40 | free7 | 物料规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 41 | free8 | 物料规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 42 | define1 | q111 | define1 | text | String |  |  | isGlobalization,nullable |
| 43 | free9 | 物料规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 44 | define2 | 批次属性2 | define2 | text | String |  |  | isGlobalization,nullable |
| 45 | free10 | 物料规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 46 | barcode | 条码 | cBarCode | text | String |  |  | nullable |
| 47 | define3 | 批次属性3 | define3 | text | String |  |  | isGlobalization,nullable |
| 48 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 49 | define4 | 批次属性4 | define4 | text | String |  |  | isGlobalization,nullable |
| 50 | define5 | 批次属性5 | define5 | text | String |  |  | isGlobalization,nullable |
| 51 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 52 | define6 | 批次属性6 | define6 | text | String |  |  | isGlobalization,nullable |
| 53 | invaliddate | 有效期至 | dInvalidDate | date | Date |  |  | nullable |
| 54 | define7 | 批次属性7 | define7 | text | String |  |  | isGlobalization,nullable |
| 55 | dexpirydate | 失效日期 | dexpirydate | timestamp | Timestamp |  |  | nullable |
| 56 | accountQty | 账面数量 | daccountqty | number | Decimal |  |  | nullable |
| 57 | define8 | 批次属性8 | define8 | text | String |  |  | isGlobalization,nullable |
| 58 | accountWeight | 账面重量 | daccountweight | number | Decimal |  |  | nullable |
| 59 | define9 | 批次属性9 | define9 | text | String |  |  | isGlobalization,nullable |
| 60 | define10 | 批次属性10 | define10 | text | String |  |  | isGlobalization,nullable |
| 61 | unit | 主计量id | iunitid | quote | pc.unit.Unit |  |  | nullable |
| 62 | define11 | 批次属性11 | define11 | text | String |  |  | isGlobalization,nullable |
| 63 | unitName | 主计量 | cunitname | text | String |  |  | nullable |
| 64 | define12 | 批次属性12 | define12 | text | String |  |  | isGlobalization,nullable |
| 65 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  | nullable |
| 66 | accountNUM | 账面件数 | daccountnum | number | Decimal |  |  | nullable |
| 67 | define13 | 批次属性13 | define13 | text | String |  |  | isGlobalization,nullable |
| 68 | define14 | 批次属性14 | define14 | text | String |  |  | isGlobalization,nullable |
| 69 | stockUnitId | 库存主计量 | stockUnitId | quote | pc.unit.Unit |  |  | nullable |
| 70 | accountPrice | 账面价格 | daccountprice | number | Decimal |  |  | nullable |
| 71 | define15 | 批次属性15 | define15 | text | String |  |  | isGlobalization,nullable |
| 72 | define16 | 批次属性16 | define16 | text | String |  |  | isGlobalization,nullable |
| 73 | quantity | 实盘数量 | dquantity | number | Decimal | Y |  | nullable |
| 74 | define17 | 批次属性17 | define17 | text | String |  |  | isGlobalization,nullable |
| 75 | weight | 实盘重量 | dweight | number | Decimal |  |  | nullable |
| 76 | define18 | 批次属性18 | define18 | text | String |  |  | isGlobalization,nullable |
| 77 | number | 实盘件数 | dnumber | number | Decimal |  |  | nullable |
| 78 | define19 | 批次属性19 | define19 | text | String |  |  | isGlobalization,nullable |
| 79 | price | 实盘价格 | dprice | number | Decimal |  |  | nullable |
| 80 | define20 | 批次属性20 | define20 | text | String |  |  | isGlobalization,nullable |
| 81 | goodsposition | 货位 | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 82 | define21 | 批次属性21 | define21 | text | String |  |  | isGlobalization,nullable |
| 83 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 84 | define22 | 批次属性22 | define22 | text | String |  |  | isGlobalization,nullable |
| 85 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 86 | define23 | 批次属性23 | define23 | text | String |  |  | isGlobalization,nullable |
| 87 | memo | 备注 | cmemo | text | String |  |  | nullable |
| 88 | define24 | 批次属性24 | define24 | text | String |  |  | isGlobalization,nullable |
| 89 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int | Integer |  |  | nullable |
| 90 | define25 | 批次属性25 | define25 | text | String |  |  | isGlobalization,nullable |
| 91 | project | 项目id | iProject | quote | bd.project.ProjectVO |  |  | dataPowerFlag,data_auth,nullable |
| 92 | define26 | 批次属性26 | define26 | text | String |  |  | isGlobalization,nullable |
| 93 | inventoryowner | 货主对象 | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 94 | define27 | 批次属性27 | define27 | text | String |  |  | isGlobalization,nullable |
| 95 | ownertype | 货权归属 | ownertype | int | Integer |  |  | nullable |
| 96 | define28 | 批次属性28 | define28 | text | String |  |  | isGlobalization,nullable |
| 97 | define29 | 批次属性29 | define29 | text | String |  |  | isGlobalization,nullable |
| 98 | define30 | 批次属性30 | define30 | text | String |  |  | isGlobalization,nullable |
| 99 | defines | 实盘单子表自由自定义项 | - | - | st.storecheckreality.StoreCheckRealityDetailDefine |  |  |  |
| 100 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 101 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 102 | isStockUnitId | 是否辅计量记结存 | isstockunitid | int | Integer |  |  | nullable |
| 103 | storeCheckRealityDetailCustomItem | 实盘子表自定义项 | - | - | st.storecheckreality.StoreCheckRealityDetailCustomItem |  |  |  |
| 104 | storeCheckRealityDetailSNs | 实盘序列号 | - | - | st.storecheckreality.StoreCheckRealityDetailSN |  |  |  |

---

## Reference Fields (17)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 2 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 3 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 4 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 5 | productAuth | 物料权限 | iProductid | pb.dataauth.ProductDataAuth |
| 6 | productskun | 默认SKUID | iProductSkuid | pc.product.ProductSKU |
| 7 | productn | 物料 | iProductid | pc.product.Product |
| 8 | product | 物料id | iProductid | pc.aa.Product |
| 9 | mainid | 主表id | imainid | st.storecheckreality.StoreCheckReality |
| 10 | stockStatusDoc | 库存状态id | stockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 11 | productsku | skuid | iProductSkuid | pc.aa.ProductSKU |
| 12 | reserveid | 预留对象id | reserveid | st.reservation.Reservation |
| 13 | unit | 主计量id | iunitid | pc.unit.Unit |
| 14 | stockUnitId | 库存主计量 | stockUnitId | pc.unit.Unit |
| 15 | goodsposition | 货位 | iGoodsPositionId | aa.goodsposition.GoodsPosition |
| 16 | project | 项目id | iProject | bd.project.ProjectVO |
| 17 | inventoryowner | 货主对象 | inventoryowner | st.inventoryowner.InventoryOwner |

---

## Number Fields (25)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | abandoned | 作废 | abandoned | int |
| 2 | expireDateNo | 保质期 | expireDateNo | int |
| 3 | expireDateUnit | 保质期单位 | expireDateUnit | int |
| 4 | lossnumber | 盘亏件数 | lossnumber | number |
| 5 | lossqty | 盘亏数量 | lossqty | number |
| 6 | profitnumber | 盘盈件数 | profitnumber | number |
| 7 | profitqty | 盘盈数量 | profitqty | number |
| 8 | lineno | 行号 | lineno | number |
| 9 | rowno | 行号 | rowno | int |
| 10 | firstuplineno | 源头单据行号 | firstuplineno | number |
| 11 | uplineno | 来源单据行号 | uplineno | number |
| 12 | accountQty | 账面数量 | daccountqty | number |
| 13 | accountWeight | 账面重量 | daccountweight | number |
| 14 | invExchRate | 换算率 | invExchRate | number |
| 15 | accountNUM | 账面件数 | daccountnum | number |
| 16 | accountPrice | 账面价格 | daccountprice | number |
| 17 | quantity | 实盘数量 | dquantity | number |
| 18 | weight | 实盘重量 | dweight | number |
| 19 | number | 实盘件数 | dnumber | number |
| 20 | price | 实盘价格 | dprice | number |
| 21 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int |
| 22 | ownertype | 货权归属 | ownertype | int |
| 23 | invExchRateDen | 换算率分母 | invexchrateden | number |
| 24 | invExchRateNum | 换算率分子 | invexchratenum | number |
| 25 | isStockUnitId | 是否辅计量记结存 | isstockunitid | int |

---

## Date Fields (2)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | producedate | 生产日期 | dProduceDate | date |
| 2 | invaliddate | 有效期至 | dInvalidDate | date |

---

## Child Tables (3)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | storeCheckRealityDetailCustomItem | 实盘子表自定义项 | st.storecheckreality.StoreCheckRealityDetailCustomItem |
| 2 | storeCheckRealityDetailSNs | 实盘序列号 | st.storecheckreality.StoreCheckRealityDetailSN |
| 3 | defines | 实盘单子表自由自定义项 | st.storecheckreality.StoreCheckRealityDetailDefine |
