---
tags: [BIP, metadata, st, StoreCheckDifferenceDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 盘点差异单子表 (st.storecheckdifference.StoreCheckDifferenceDetail)

> Platform: BIP V5 | Module: st | Table: st_storecheckresult_b | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 盘点差异单子表 |
| uri | st.storecheckdifference.StoreCheckDifferenceDetail |
| tableName | st_storecheckresult_b |
| domain | ustock |
| applicationCode | ST |
| superUri | st.pubstorecheckdifference.PubStoreCheckDifferenceDetail |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (5)

| # | Name | URI |
|---|------|-----|
| 1 | 后端自动行号接口 (ILineNo) | base.itf.ILineNo |
| 2 | 上游单据行号 (IUpLinenNO) | st.uplineno.IUpLinenNO |
| 3 | 源头单据行号 (FirstupLinenNO) | st.uplineno.FirstupLinenNO |
| 4 | 租户相关 (ITenant) | base.itf.ITenant |
| 5 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (118)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | sensitiveUID | SKU敏感域唯一性ID | sensitiveUID | text | String |  |  | nullable |
| 2 | accountAmount | 账面金额 | fAccountAmount | number | Decimal |  |  | nullable |
| 3 | accountPrice | 账面价格 | daccountprice | number | Decimal |  |  | nullable |
| 4 | accountWeight | 账面重量 | daccountweight | number | Decimal |  |  | nullable |
| 5 | amount | 实盘金额 | fAmount | number | Decimal |  |  | nullable |
| 6 | barcode | 条码 | cBarCode | text | String |  |  | nullable |
| 7 | checkstatus | 盘点状态 | checkstatus | - | st.storecheckdifference.BCheckWithRecheckDifference |  |  | nullable |
| 8 | diffProcessing | 差异处理方式 | diffProcessing | text | String |  |  | nullable |
| 9 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 10 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable |
| 11 | productskun | 默认SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | nullable |
| 12 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 13 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 14 | dexpirydate | 失效日期 | dexpirydate | timestamp | Timestamp |  |  | nullable |
| 15 | expireDateNo | 保质期 | expireDateNo | int | Integer |  |  | nullable |
| 16 | expireDateUnit | 保质期单位 | expireDateUnit | int | Integer |  |  | nullable |
| 17 | markPrice | 建议零售价 | fMarkPrice | number | Decimal |  |  | nullable |
| 18 | price | 实盘价格 | dprice | number | Decimal |  |  | nullable |
| 19 | productAuth | 物料权限 | iProductid | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 20 | profitLossAmount | 盈亏金额 | fProfitLossAmount | number | Decimal |  |  | nullable |
| 21 | project_code | 项目编码 | cProjectCode | text | String |  |  | nullable |
| 22 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 23 | storeCheckResultDetailCharacteristics | 自由项特征组 | storeCheckResultDetailCharacteristics | FreeCT | st.storecheckdifference.StoreCheckDifferenceDetailCharacteristics |  |  | nullable |
| 24 | storeCheckResultDetailDefineCharacter | 自定义项特征属性组 | storeCheckResultDetailDefineCharacter | UserDefine | st.storecheckdifference.StoreCheckDifferenceDetailDefineCharacter |  |  | nullable |
| 25 | weight | 实盘重量 | dweight | number | Decimal |  |  | nullable |
| 26 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 27 | upcode | 来源单据号 | upcode | text | String |  |  | nullable |
| 28 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 29 | mainid | 主表ID | imainid | quote | st.storecheckdifference.StoreCheckDifference |  |  | nullable |
| 30 | product | 物料ID | iProductid | quote | pc.aa.Product |  |  | data_auth,nullable,dataPowerFlag |
| 31 | productsku | 物料SKUID | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable |
| 32 | unit | 主计量ID | iunitid | quote | pc.unit.Unit |  |  | nullable |
| 33 | stockUnitId | 库存单位ID | stockUnitId | quote | pc.unit.Unit |  |  | nullable |
| 34 | unitName | 主计量 | cunitname | text | String |  |  | nullable |
| 35 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 36 | invaliddate | 有效期至 | dInvalidDate | date | Date |  |  | nullable |
| 37 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 38 | rowno | 行号 | rowno | int | Integer |  |  | isCode,nullable |
| 39 | goodsposition | 货位ID | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 40 | firstuplineno | 源头单据行号 | firstuplineno | number | Decimal |  |  | nullable |
| 41 | uplineno | 来源单据行号 | uplineno | number | Decimal |  |  | nullable |
| 42 | stockStatusDoc | 库存状态ID | stockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 43 | reserveid | 预留对象ID | reserveid | quote | st.reservation.Reservation |  |  | nullable |
| 44 | project | 项目id | iProject | quote | bd.project.ProjectVO |  |  | dataPowerFlag,data_auth,nullable |
| 45 | profitlossqty | 盈亏数量 | profitlossqty | number | Decimal |  |  | nullable |
| 46 | profitlossnumber | 盈亏件数 | profitlossnumber | number | Decimal |  |  | nullable |
| 47 | quantity | 实盘数量 | dquantity | number | Decimal |  |  | nullable |
| 48 | number | 实盘件数 | dnumber | number | Decimal |  |  | nullable |
| 49 | accountQty | 账面数量 | daccountqty | number | Decimal |  |  | nullable |
| 50 | lossnumber | 盘亏件数 | lossnumber | number | Decimal |  |  | nullable |
| 51 | profitnumber | 盘盈件数 | profitnumber | number | Decimal |  |  | nullable |
| 52 | lossqty | 盘亏数量 | lossqty | number | Decimal |  |  | nullable |
| 53 | profitqty | 盘盈数量 | profitqty | number | Decimal |  |  | nullable |
| 54 | accountNUM | 账面件数 | daccountnum | number | Decimal |  |  | nullable |
| 55 | occurredqty | 业务发生数量 | occurredqty | number | Decimal |  |  | nullable |
| 56 | occurrednum | 业务发生件数 | occurrednum | number | Decimal |  |  | nullable |
| 57 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  | nullable |
| 58 | unitExchangeType | 换算方式 | unitExchangeType | int | Integer |  |  | nullable |
| 59 | referencePrice | 参考价格 | fReferencePrice | number | Decimal |  |  | nullable |
| 60 | memo | 备注 | cmemo | text | String |  |  | nullable |
| 61 | profitLossReferenceAmount | 盈亏参考金额 | fProfitLossReferenceAmount | number | Decimal |  |  | nullable |
| 62 | free1 | 颜色 | free1 | text | String |  |  | isGlobalization,nullable |
| 63 | free2 | 物料规格2 | free2 | text | String |  |  | isGlobalization,nullable |
| 64 | free3 | 物料规格3 | free3 | text | String |  |  | isGlobalization,nullable |
| 65 | free4 | 香雪产地 | free4 | text | String |  |  | isGlobalization,nullable |
| 66 | free5 | 物料规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 67 | free6 | 物料规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 68 | free7 | 物料规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 69 | free8 | 物料规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 70 | free9 | 物料规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 71 | free10 | 物料规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 72 | sourceid | 来源单据主表id | sourceid | long | Long |  |  | nullable |
| 73 | sourceautoid | 来源单据子表id | sourceautoid | long | Long |  |  | nullable |
| 74 | source | 来源单据类型 | source | text | String |  |  | nullable |
| 75 | inventoryowner | 货主对象 | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 76 | ownertype | 货权归属 | ownertype | int | Integer |  |  | nullable |
| 77 | planVarianceRate | 计划盘点差异率% | planVarianceRate | number | Decimal |  |  | nullable |
| 78 | realityVarianceRate | 实际盘点差异率% | realityVarianceRate | number | Decimal |  |  | nullable |
| 79 | varianceRateExceeding | 差异率是否超标 | varianceRateExceeding | switch | Boolean |  |  | nullable |
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
| 110 | defines | 盘点差异子表自由自定义项 | - | - | st.storecheckdifference.StoreCheckDifferenceDetailDefine |  |  |  |
| 111 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 112 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 113 | isStockUnitId | 是否辅计量记结存 | isstockunitid | int | Integer |  |  | nullable |
| 114 | serialStockOverQty | 序列号盘盈数量 | over_qty | int | Integer |  |  | nullable |
| 115 | serialStockShortQty | 序列号盘亏数量 | short_qty | int | Integer |  |  | nullable |
| 116 | storeCheckDifferenceDetailCustomItem | 盘点差异单子表自定义项 | - | - | st.storecheckdifference.StoreCheckDifferenceDetailCustomItem |  |  |  |
| 117 | storeCheckDifferenceDetailSNs | 盘点差异单子表序列号 | - | - | st.storecheckdifference.StoreCheckDifferenceDetailSN |  |  |  |
| 118 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |

---

## Reference Fields (17)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 2 | productn | 物料 | iProductid | pc.product.Product |
| 3 | productskun | 默认SKUID | iProductSkuid | pc.product.ProductSKU |
| 4 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 5 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 6 | productAuth | 物料权限 | iProductid | pb.dataauth.ProductDataAuth |
| 7 | mainid | 主表ID | imainid | st.storecheckdifference.StoreCheckDifference |
| 8 | product | 物料ID | iProductid | pc.aa.Product |
| 9 | productsku | 物料SKUID | iProductSkuid | pc.aa.ProductSKU |
| 10 | unit | 主计量ID | iunitid | pc.unit.Unit |
| 11 | stockUnitId | 库存单位ID | stockUnitId | pc.unit.Unit |
| 12 | goodsposition | 货位ID | iGoodsPositionId | aa.goodsposition.GoodsPosition |
| 13 | stockStatusDoc | 库存状态ID | stockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 14 | reserveid | 预留对象ID | reserveid | st.reservation.Reservation |
| 15 | project | 项目id | iProject | bd.project.ProjectVO |
| 16 | inventoryowner | 货主对象 | inventoryowner | st.inventoryowner.InventoryOwner |
| 17 | tenant | 租户 | tenant_id | base.tenant.Tenant |

---

## Number Fields (38)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | accountAmount | 账面金额 | fAccountAmount | number |
| 2 | accountPrice | 账面价格 | daccountprice | number |
| 3 | accountWeight | 账面重量 | daccountweight | number |
| 4 | amount | 实盘金额 | fAmount | number |
| 5 | expireDateNo | 保质期 | expireDateNo | int |
| 6 | expireDateUnit | 保质期单位 | expireDateUnit | int |
| 7 | markPrice | 建议零售价 | fMarkPrice | number |
| 8 | price | 实盘价格 | dprice | number |
| 9 | profitLossAmount | 盈亏金额 | fProfitLossAmount | number |
| 10 | weight | 实盘重量 | dweight | number |
| 11 | lineno | 行号 | lineno | number |
| 12 | rowno | 行号 | rowno | int |
| 13 | firstuplineno | 源头单据行号 | firstuplineno | number |
| 14 | uplineno | 来源单据行号 | uplineno | number |
| 15 | profitlossqty | 盈亏数量 | profitlossqty | number |
| 16 | profitlossnumber | 盈亏件数 | profitlossnumber | number |
| 17 | quantity | 实盘数量 | dquantity | number |
| 18 | number | 实盘件数 | dnumber | number |
| 19 | accountQty | 账面数量 | daccountqty | number |
| 20 | lossnumber | 盘亏件数 | lossnumber | number |
| 21 | profitnumber | 盘盈件数 | profitnumber | number |
| 22 | lossqty | 盘亏数量 | lossqty | number |
| 23 | profitqty | 盘盈数量 | profitqty | number |
| 24 | accountNUM | 账面件数 | daccountnum | number |
| 25 | occurredqty | 业务发生数量 | occurredqty | number |
| 26 | occurrednum | 业务发生件数 | occurrednum | number |
| 27 | invExchRate | 换算率 | invExchRate | number |
| 28 | unitExchangeType | 换算方式 | unitExchangeType | int |
| 29 | referencePrice | 参考价格 | fReferencePrice | number |
| 30 | profitLossReferenceAmount | 盈亏参考金额 | fProfitLossReferenceAmount | number |
| 31 | ownertype | 货权归属 | ownertype | int |
| 32 | planVarianceRate | 计划盘点差异率% | planVarianceRate | number |
| 33 | realityVarianceRate | 实际盘点差异率% | realityVarianceRate | number |
| 34 | invExchRateDen | 换算率分母 | invexchrateden | number |
| 35 | invExchRateNum | 换算率分子 | invexchratenum | number |
| 36 | isStockUnitId | 是否辅计量记结存 | isstockunitid | int |
| 37 | serialStockOverQty | 序列号盘盈数量 | over_qty | int |
| 38 | serialStockShortQty | 序列号盘亏数量 | short_qty | int |

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
| 1 | storeCheckDifferenceDetailCustomItem | 盘点差异单子表自定义项 | st.storecheckdifference.StoreCheckDifferenceDetailCustomItem |
| 2 | storeCheckDifferenceDetailSNs | 盘点差异单子表序列号 | st.storecheckdifference.StoreCheckDifferenceDetailSN |
| 3 | defines | 盘点差异子表自由自定义项 | st.storecheckdifference.StoreCheckDifferenceDetailDefine |
