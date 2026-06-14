---
tags: [BIP, metadata, st, StoreCheckPlanDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 盘点计划子表 (st.storecheckplan.StoreCheckPlanDetail)

> Platform: BIP V5 | Module: st | Table: st_storecheckplan_b | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 盘点计划子表 |
| uri | st.storecheckplan.StoreCheckPlanDetail |
| tableName | st_storecheckplan_b |
| domain | ustock |
| schema | `ustock` |
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

## All Fields (100)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | barcode | 条码 | cBarCode | text | String |  |  | nullable |
| 2 | checkstatus | 盘点状态 | checkstatus | - | st.storecheckplan.BCheckWithRecheck |  |  | nullable |
| 3 | firstuplineno | 源头单据行号 | firstuplineno | number | Decimal |  |  | nullable |
| 4 | price | 实盘价格 | dprice | number | Decimal |  |  | nullable |
| 5 | physinventorystatus | 计划类型 | physinventory_status | - | st.storecheckplan.physinventoryStatus |  |  | nullable |
| 6 | recountindicator | 复盘状态 | recount_indicator | - | st.storecheckplan.recountIndicatorStatus |  |  | nullable |
| 7 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 8 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 9 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 10 | expireDateNo | 保质期 | expireDateNo | int | Integer |  |  | nullable |
| 11 | expireDateUnit | 保质期单位 | expireDateUnit | int | Integer |  |  | nullable |
| 12 | project_code | 项目编码 | cProjectCode | text | String |  |  | nullable |
| 13 | productAuth | 物料权限 | iProductid | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 14 | productskun | 默认SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | nullable |
| 15 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable |
| 16 | storeCheckPlanDetailCharacteristics | 自由项特征组 | storeCheckPlanDetailCharacteristics | FreeCT | st.storecheckplan.StoreCheckPlanDetailCharacteristics |  |  | nullable |
| 17 | storeCheckPlanDetailDefineCharacter | 自定义项特征属性组 | storeCheckPlanDetailDefineCharacter | UserDefine | st.storecheckplan.StoreCheckPlanDetailDefineCharacter |  |  | nullable |
| 18 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 19 | uplineno | 上游单据行号 | uplineno | number | Decimal |  |  | nullable |
| 20 | weight | 实盘重量 | dweight | number | Decimal |  |  | nullable |
| 21 | firstupcode | 源头单据号 | firstupcode | text | String |  |  | nullable |
| 22 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 23 | firstsource | 源头单据类型 | firstsource | text | String |  |  | nullable |
| 24 | firstsourceautoid | 源头单据子表id | firstsourceautoid | long | Long |  |  | nullable |
| 25 | firstsourceid | 源头单据主表id | firstsourceid | long | Long |  |  | nullable |
| 26 | product | 物料id | iProductid | quote | pc.aa.Product |  |  | data_auth,nullable,dataPowerFlag |
| 27 | mainid | 主表id | imainid | quote | st.storecheckplan.StoreCheckPlan |  |  | nullable |
| 28 | productsku | skuid | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable |
| 29 | stockStatusDoc | 库存状态id | stockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 30 | free1 | 颜色 | free1 | text | String |  |  | isGlobalization,nullable |
| 31 | free2 | 测试3 | free2 | text | String |  |  | isGlobalization,nullable |
| 32 | free3 | 定量测试 | free3 | text | String |  |  | isGlobalization,nullable |
| 33 | define1 | 批次属性1 | define1 | text | String |  |  | isGlobalization,nullable |
| 34 | free4 | 香雪产地 | free4 | text | String |  |  | isGlobalization,nullable |
| 35 | define2 | 批次属性2 | define2 | text | String |  |  | isGlobalization,nullable |
| 36 | free5 | 物料规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 37 | define3 | 批次属性3 | define3 | text | String |  |  | isGlobalization,nullable |
| 38 | free6 | 物料规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 39 | define4 | 批次属性4 | define4 | text | String |  |  | isGlobalization,nullable |
| 40 | free7 | 物料规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 41 | define5 | 批次属性5 | define5 | text | String |  |  | isGlobalization,nullable |
| 42 | free8 | 物料规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 43 | define6 | 批次属性6 | define6 | text | String |  |  | isGlobalization,nullable |
| 44 | free9 | 物料规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 45 | define7 | 批次属性7 | define7 | text | String |  |  | isGlobalization,nullable |
| 46 | free10 | 物料规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 47 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 48 | define8 | 批次属性8 | define8 | text | String |  |  | isGlobalization,nullable |
| 49 | define9 | 批次属性9 | define9 | text | String |  |  | isGlobalization,nullable |
| 50 | unit | 主计量id | iunitid | quote | pc.unit.Unit |  |  | nullable |
| 51 | define10 | 批次属性10 | define10 | text | String |  |  | isGlobalization,nullable |
| 52 | unitName | 主计量 | cunitname | text | String |  |  | nullable |
| 53 | accountQty | 账面数量 | daccountqty | number | Decimal |  |  | nullable |
| 54 | define11 | 批次属性11 | define11 | text | String |  |  | isGlobalization,nullable |
| 55 | define12 | 批次属性12 | define12 | text | String |  |  | isGlobalization,nullable |
| 56 | stockUnitId | 存量单位 | stockUnitId | quote | pc.unit.Unit |  |  | nullable |
| 57 | define13 | 批次属性13 | define13 | text | String |  |  | isGlobalization,nullable |
| 58 | number | 实盘件数 | dnumber | number | Decimal |  |  | nullable |
| 59 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 60 | invaliddate | 有效期至 | dInvalidDate | date | Date |  |  | nullable |
| 61 | define14 | 批次属性14 | define14 | text | String |  |  | isGlobalization,nullable |
| 62 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  | nullable |
| 63 | accountNUM | 账面件数 | daccountnum | number | Decimal |  |  | nullable |
| 64 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int | Integer |  |  | nullable |
| 65 | define15 | 批次属性15 | define15 | text | String |  |  | isGlobalization,nullable |
| 66 | project | 项目id | iProject | quote | bd.project.ProjectVO |  |  | dataPowerFlag,data_auth,nullable |
| 67 | rowno | 行号 | rowno | int | Integer |  |  | isCode,nullable |
| 68 | accountWeight | 账面重量 | daccountweight | number | Decimal |  |  | nullable |
| 69 | define16 | 批次属性16 | define16 | text | String |  |  | isGlobalization,nullable |
| 70 | accountPrice | 账面价格 | daccountprice | number | Decimal |  |  | nullable |
| 71 | define17 | 批次属性17 | define17 | text | String |  |  | isGlobalization,nullable |
| 72 | define18 | 批次属性18 | define18 | text | String |  |  | isGlobalization,nullable |
| 73 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 74 | define19 | 批次属性19 | define19 | text | String |  |  | isGlobalization,nullable |
| 75 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 76 | define20 | 批次属性20 | define20 | text | String |  |  | isGlobalization,nullable |
| 77 | reserveid | 预留对象id | reserveid | quote | st.reservation.Reservation |  |  | nullable |
| 78 | define21 | 批次属性21 | define21 | text | String |  |  | isGlobalization,nullable |
| 79 | goodsposition | 货位 | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 80 | define22 | 批次属性22 | define22 | text | String |  |  | isGlobalization,nullable |
| 81 | dexpirydate | 失效日期 | dexpirydate | timestamp | Timestamp |  |  | nullable |
| 82 | define23 | 批次属性23 | define23 | text | String |  |  | isGlobalization,nullable |
| 83 | memo |  备注 | cmemo | text | String |  |  | nullable |
| 84 | define24 | 批次属性24 | define24 | text | String |  |  | isGlobalization,nullable |
| 85 | inventoryowner | 货主对象 | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 86 | define25 | 批次属性25 | define25 | text | String |  |  | isGlobalization,nullable |
| 87 | ownertype | 货权归属 | ownertype | int | Integer |  |  | nullable |
| 88 | define26 | 批次属性26 | define26 | text | String |  |  | isGlobalization,nullable |
| 89 | quantity | 实盘数量 | dquantity | number | Decimal |  |  | nullable |
| 90 | define27 | 批次属性27 | define27 | text | String |  |  | isGlobalization,nullable |
| 91 | sensitiveUID | SKU敏感域唯一性ID | sensitiveUID | text | String |  |  | nullable |
| 92 | define28 | 批次属性28 | define28 | text | String |  |  | isGlobalization,nullable |
| 93 | define29 | 批次属性29 | define29 | text | String |  |  | isGlobalization,nullable |
| 94 | define30 | 批次属性30 | define30 | text | String |  |  | isGlobalization,nullable |
| 95 | defines | 盘点计划子表自由自定义项 | - | - | st.storecheckplan.StoreCheckPlanDetailDefine |  |  |  |
| 96 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 97 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 98 | isStockUnitId | 是否辅计量记结存 | isstockunitid | int | Integer |  |  | nullable |
| 99 | storeCheckPlanDetailCustomItem | 盘点计划子表自定义项 | - | - | st.storecheckplan.StoreCheckPlanDetailCustomItem |  |  |  |
| 100 | storeCheckPlanDetailSNs | 盘点计划序列号 | - | - | st.storecheckplan.StoreCheckPlanDetailSN |  |  |  |

---

## Reference Fields (17)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 2 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 3 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 4 | productAuth | 物料权限 | iProductid | pb.dataauth.ProductDataAuth |
| 5 | productskun | 默认SKUID | iProductSkuid | pc.product.ProductSKU |
| 6 | productn | 物料 | iProductid | pc.product.Product |
| 7 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 8 | product | 物料id | iProductid | pc.aa.Product |
| 9 | mainid | 主表id | imainid | st.storecheckplan.StoreCheckPlan |
| 10 | productsku | skuid | iProductSkuid | pc.aa.ProductSKU |
| 11 | stockStatusDoc | 库存状态id | stockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 12 | unit | 主计量id | iunitid | pc.unit.Unit |
| 13 | stockUnitId | 存量单位 | stockUnitId | pc.unit.Unit |
| 14 | project | 项目id | iProject | bd.project.ProjectVO |
| 15 | reserveid | 预留对象id | reserveid | st.reservation.Reservation |
| 16 | goodsposition | 货位 | iGoodsPositionId | aa.goodsposition.GoodsPosition |
| 17 | inventoryowner | 货主对象 | inventoryowner | st.inventoryowner.InventoryOwner |

---

## Number Fields (20)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | firstuplineno | 源头单据行号 | firstuplineno | number |
| 2 | price | 实盘价格 | dprice | number |
| 3 | expireDateNo | 保质期 | expireDateNo | int |
| 4 | expireDateUnit | 保质期单位 | expireDateUnit | int |
| 5 | uplineno | 上游单据行号 | uplineno | number |
| 6 | weight | 实盘重量 | dweight | number |
| 7 | lineno | 行号 | lineno | number |
| 8 | accountQty | 账面数量 | daccountqty | number |
| 9 | number | 实盘件数 | dnumber | number |
| 10 | invExchRate | 换算率 | invExchRate | number |
| 11 | accountNUM | 账面件数 | daccountnum | number |
| 12 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int |
| 13 | rowno | 行号 | rowno | int |
| 14 | accountWeight | 账面重量 | daccountweight | number |
| 15 | accountPrice | 账面价格 | daccountprice | number |
| 16 | ownertype | 货权归属 | ownertype | int |
| 17 | quantity | 实盘数量 | dquantity | number |
| 18 | invExchRateDen | 换算率分母 | invexchrateden | number |
| 19 | invExchRateNum | 换算率分子 | invexchratenum | number |
| 20 | isStockUnitId | 是否辅计量记结存 | isstockunitid | int |

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
| 1 | storeCheckPlanDetailCustomItem | 盘点计划子表自定义项 | st.storecheckplan.StoreCheckPlanDetailCustomItem |
| 2 | storeCheckPlanDetailSNs | 盘点计划序列号 | st.storecheckplan.StoreCheckPlanDetailSN |
| 3 | defines | 盘点计划子表自由自定义项 | st.storecheckplan.StoreCheckPlanDetailDefine |
