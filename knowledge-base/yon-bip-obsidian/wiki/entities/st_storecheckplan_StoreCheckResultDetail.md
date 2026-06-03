---
tags: [BIP, metadata, st, StoreCheckResultDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 盘点结果子表 (st.storecheckplan.StoreCheckResultDetail)

> Platform: BIP V5 | Module: st | Table: st_storecheckresult_b | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 盘点结果子表 |
| uri | st.storecheckplan.StoreCheckResultDetail |
| tableName | st_storecheckresult_b |
| domain | ustock |
| applicationCode | ST |
| superUri | st.pubstorecheck.PubStoreCheckDetail |
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
| 3 | 租户相关 (ITenant) | base.itf.ITenant |
| 4 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 5 | 项目结构属性 (projectStructureProperties) | BGDM.wbs.projectStructureProperties |

---

## All Fields (112)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | barcode | 条码 | cBarCode | text | String |  |  | nullable |
| 2 | expireDateNo | 保质期 | expireDateNo | int | Integer |  |  | nullable |
| 3 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 4 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 5 | storeCheckResultDetailCharacteristics | 自由项特征组 | storeCheckResultDetailCharacteristics | FreeCT | st.storecheckplan.StoreCheckResultDetailCharacteristics |  |  | nullable |
| 6 | storeCheckResultDetailDefineCharacter | 自定义项特征属性组 | storeCheckResultDetailDefineCharacter | UserDefine | st.storecheckplan.StoreCheckResultDetailDefineCharacter |  |  | nullable |
| 7 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 8 | stockStatusDoc | 库存状态id | stockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 9 | unit | 单位id | iunitid | quote | pc.unit.Unit |  |  | nullable |
| 10 | unitName | 主计量 | cunitname | text | String |  |  | nullable |
| 11 | accountQty | 账面数量 | daccountqty | number | Decimal |  |  | nullable |
| 12 | stockUnitId | 存量单位 | stockUnitId | quote | pc.unit.Unit |  |  | nullable |
| 13 | referencePrice | 参考价格 | fReferencePrice | number | Decimal |  |  | nullable |
| 14 | number | 实盘件数 | dnumber | number | Decimal |  |  | nullable |
| 15 | profitLossReferenceAmount | 盈亏参考金额 | fProfitLossReferenceAmount | number | Decimal |  |  | nullable |
| 16 | mainid | 主表id | imainid | quote | st.storecheckplan.StoreCheckPlan |  |  | nullable |
| 17 | product | 物料id | iProductid | quote | pc.aa.Product |  |  | nullable,dataPowerFlag |
| 18 | productsku | skuid | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable |
| 19 | rowno | 行号 | rowno | int | Integer |  |  | isCode,nullable |
| 20 | checkstatus | 盘点状态 | checkstatus | - | st.storecheckplan.BCheckWithRecheck |  |  | nullable |
| 21 | free1 | 颜色 | free1 | text | String |  |  | isGlobalization,nullable |
| 22 | uplineno | 来源单据行号 | uplineno | number | Decimal |  |  | nullable |
| 23 | free2 | 测试3 | free2 | text | String |  |  | isGlobalization,nullable |
| 24 | free3 | 定量测试 | free3 | text | String |  |  | isGlobalization,nullable |
| 25 | free4 | 香雪产地 | free4 | text | String |  |  | isGlobalization,nullable |
| 26 | free5 | 物料规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 27 | free6 | 物料规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 28 | free7 | 物料规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 29 | free8 | 物料规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 30 | free9 | 物料规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 31 | free10 | 物料规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 32 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 33 | define1 | 批次属性1 | define1 | text | String |  |  | isGlobalization,nullable |
| 34 | define2 | 批次属性2 | define2 | text | String |  |  | isGlobalization,nullable |
| 35 | define3 | 批次属性3 | define3 | text | String |  |  | isGlobalization,nullable |
| 36 | define4 | 批次属性4 | define4 | text | String |  |  | isGlobalization,nullable |
| 37 | define5 | 批次属性5 | define5 | text | String |  |  | isGlobalization,nullable |
| 38 | define6 | 批次属性6 | define6 | text | String |  |  | isGlobalization,nullable |
| 39 | define7 | 批次属性7 | define7 | text | String |  |  | isGlobalization,nullable |
| 40 | define8 | 批次属性8 | define8 | text | String |  |  | isGlobalization,nullable |
| 41 | define9 | 批次属性9 | define9 | text | String |  |  | isGlobalization,nullable |
| 42 | define10 | 批次属性10 | define10 | text | String |  |  | isGlobalization,nullable |
| 43 | define11 | 批次属性11 | define11 | text | String |  |  | isGlobalization,nullable |
| 44 | define12 | 批次属性12 | define12 | text | String |  |  | isGlobalization,nullable |
| 45 | define13 | 批次属性13 | define13 | text | String |  |  | isGlobalization,nullable |
| 46 | define14 | 批次属性14 | define14 | text | String |  |  | isGlobalization,nullable |
| 47 | define15 | 批次属性15 | define15 | text | String |  |  | isGlobalization,nullable |
| 48 | define16 | 批次属性16 | define16 | text | String |  |  | isGlobalization,nullable |
| 49 | define17 | 批次属性17 | define17 | text | String |  |  | isGlobalization,nullable |
| 50 | define18 | 批次属性18 | define18 | text | String |  |  | isGlobalization,nullable |
| 51 | define19 | 批次属性19 | define19 | text | String |  |  | isGlobalization,nullable |
| 52 | define20 | 批次属性20 | define20 | text | String |  |  | isGlobalization,nullable |
| 53 | define21 | 批次属性21 | define21 | text | String |  |  | isGlobalization,nullable |
| 54 | define22 | 批次属性22 | define22 | text | String |  |  | isGlobalization,nullable |
| 55 | define23 | 批次属性23 | define23 | text | String |  |  | isGlobalization,nullable |
| 56 | define24 | 批次属性24 | define24 | text | String |  |  | isGlobalization,nullable |
| 57 | define25 | 批次属性25 | define25 | text | String |  |  | isGlobalization,nullable |
| 58 | define26 | 批次属性26 | define26 | text | String |  |  | isGlobalization,nullable |
| 59 | define27 | 批次属性27 | define27 | text | String |  |  | isGlobalization,nullable |
| 60 | define28 | 批次属性28 | define28 | text | String |  |  | isGlobalization,nullable |
| 61 | define29 | 批次属性29 | define29 | text | String |  |  | isGlobalization,nullable |
| 62 | define30 | 批次属性30 | define30 | text | String |  |  | isGlobalization,nullable |
| 63 | dexpirydate | 失效日期 | dexpirydate | timestamp | Timestamp |  |  | nullable |
| 64 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 65 | invaliddate | 有效期至 | dInvalidDate | date | Date |  |  | nullable |
| 66 | quantity | 实盘数量 | dquantity | number | Decimal |  |  | nullable |
| 67 | accountWeight | 账面重量 | daccountweight | number | Decimal |  |  | nullable |
| 68 | accountPrice | 账面价格 | daccountprice | number | Decimal |  |  | nullable |
| 69 | weight | 实盘重量 | dweight | number | Decimal |  |  | nullable |
| 70 | price | 实盘价格 | dprice | number | Decimal |  |  | nullable |
| 71 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  | nullable |
| 72 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int | Integer |  |  | nullable |
| 73 | accountNUM | 账面件数 | daccountnum | number | Decimal |  |  | nullable |
| 74 | occurredqty | 业务发生数量 | occurredqty | number | Decimal | Y |  |  |
| 75 | occurrednum | 业务发生件数 | occurrednum | number | Decimal | Y |  |  |
| 76 | profitqty | 盘盈数量 | profitqty | number | Decimal |  |  | nullable |
| 77 | lossqty | 盘亏数量 | lossqty | number | Decimal |  |  | nullable |
| 78 | profitnumber | 盘盈件数 | profitnumber | number | Decimal |  |  | nullable |
| 79 | lossnumber | 盈亏件数 | lossnumber | number | Decimal |  |  | nullable |
| 80 | reserveid | 预留对象id | reserveid | quote | st.reservation.Reservation |  |  | nullable |
| 81 | goodsposition | 货位 | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 82 | project | 项目id | iProject | quote | bd.project.ProjectVO |  |  | nullable,dataPowerFlag |
| 83 | inventoryowner | 货主对象 | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 84 | memo | 备注 | cmemo | text | String |  |  | nullable |
| 85 | ownertype | 货权归属 | ownertype | int | Integer |  |  | nullable |
| 86 | markPrice | 建议零售价 | fMarkPrice | number | Decimal |  |  | nullable |
| 87 | accountAmount | 账面金额 | fAccountAmount | number | Decimal |  |  | nullable |
| 88 | amount | 实盘金额 | fAmount | number | Decimal |  |  | nullable |
| 89 | profitLossAmount | 盈亏金额(建议零售价) | fProfitLossAmount | number | Decimal |  |  | nullable |
| 90 | planVarianceRate | 计划盘点差异率% | planVarianceRate | number | Decimal |  |  | nullable |
| 91 | sensitiveUID | SKU敏感域唯一性ID | sensitiveUID | text | String |  |  | nullable |
| 92 | realityVarianceRate | 实际盘点差异率% | realityVarianceRate | number | Decimal |  |  | nullable |
| 93 | varianceRateExceeding | 差异率是否超标 | varianceRateExceeding | switch | Boolean |  |  | nullable |
| 94 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 95 | diffProcessing | 差异处理方式 | diffProcessing | text | String |  |  | nullable |
| 96 | expireDateUnit | 保质期单位 | expireDateUnit | int | Integer |  |  | nullable |
| 97 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 98 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 99 | isStockUnitId | 是否辅计量记结存 | isstockunitid | int | Integer |  |  | nullable |
| 100 | productAuth | 物料权限 | iProductid | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 101 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | nullable,dataPowerFlag |
| 102 | productskun | 默认SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | nullable |
| 103 | project_code | 项目编码 | cProjectCode | text | String |  |  | nullable |
| 104 | resultCustomItem | 盘点结果子表自定义项 | - | - | st.storecheckplan.StoreCheckResultDetailCustomItem |  |  |  |
| 105 | retailMoney | 零售金额 | retailMoney | number | Decimal |  |  | nullable |
| 106 | retailUnitPrice | 零售单价 | retailUnitPrice | number | Decimal |  |  | nullable |
| 107 | serialStockOverQty | 序列号盘盈数量 | over_qty | int | Integer |  |  | nullable |
| 108 | serialStockShortQty | 序列号盘亏数量 | short_qty | int | Integer |  |  | nullable |
| 109 | storeCheckResultDetailSNs | 盘点结果序列号 | - | - | st.storecheckplan.StoreCheckResultDetailSN |  |  |  |
| 110 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 111 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 112 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |

---

## Reference Fields (17)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | stockStatusDoc | 库存状态id | stockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 2 | unit | 单位id | iunitid | pc.unit.Unit |
| 3 | stockUnitId | 存量单位 | stockUnitId | pc.unit.Unit |
| 4 | mainid | 主表id | imainid | st.storecheckplan.StoreCheckPlan |
| 5 | product | 物料id | iProductid | pc.aa.Product |
| 6 | productsku | skuid | iProductSkuid | pc.aa.ProductSKU |
| 7 | reserveid | 预留对象id | reserveid | st.reservation.Reservation |
| 8 | goodsposition | 货位 | iGoodsPositionId | aa.goodsposition.GoodsPosition |
| 9 | project | 项目id | iProject | bd.project.ProjectVO |
| 10 | inventoryowner | 货主对象 | inventoryowner | st.inventoryowner.InventoryOwner |
| 11 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 12 | productAuth | 物料权限 | iProductid | pb.dataauth.ProductDataAuth |
| 13 | productn | 物料 | iProductid | pc.product.Product |
| 14 | productskun | 默认SKUID | iProductSkuid | pc.product.ProductSKU |
| 15 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 16 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 17 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |

---

## Number Fields (37)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | expireDateNo | 保质期 | expireDateNo | int |
| 2 | lineno | 行号 | lineno | number |
| 3 | accountQty | 账面数量 | daccountqty | number |
| 4 | referencePrice | 参考价格 | fReferencePrice | number |
| 5 | number | 实盘件数 | dnumber | number |
| 6 | profitLossReferenceAmount | 盈亏参考金额 | fProfitLossReferenceAmount | number |
| 7 | rowno | 行号 | rowno | int |
| 8 | uplineno | 来源单据行号 | uplineno | number |
| 9 | quantity | 实盘数量 | dquantity | number |
| 10 | accountWeight | 账面重量 | daccountweight | number |
| 11 | accountPrice | 账面价格 | daccountprice | number |
| 12 | weight | 实盘重量 | dweight | number |
| 13 | price | 实盘价格 | dprice | number |
| 14 | invExchRate | 换算率 | invExchRate | number |
| 15 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int |
| 16 | accountNUM | 账面件数 | daccountnum | number |
| 17 | occurredqty | 业务发生数量 | occurredqty | number |
| 18 | occurrednum | 业务发生件数 | occurrednum | number |
| 19 | profitqty | 盘盈数量 | profitqty | number |
| 20 | lossqty | 盘亏数量 | lossqty | number |
| 21 | profitnumber | 盘盈件数 | profitnumber | number |
| 22 | lossnumber | 盈亏件数 | lossnumber | number |
| 23 | ownertype | 货权归属 | ownertype | int |
| 24 | markPrice | 建议零售价 | fMarkPrice | number |
| 25 | accountAmount | 账面金额 | fAccountAmount | number |
| 26 | amount | 实盘金额 | fAmount | number |
| 27 | profitLossAmount | 盈亏金额(建议零售价) | fProfitLossAmount | number |
| 28 | planVarianceRate | 计划盘点差异率% | planVarianceRate | number |
| 29 | realityVarianceRate | 实际盘点差异率% | realityVarianceRate | number |
| 30 | expireDateUnit | 保质期单位 | expireDateUnit | int |
| 31 | invExchRateDen | 换算率分母 | invexchrateden | number |
| 32 | invExchRateNum | 换算率分子 | invexchratenum | number |
| 33 | isStockUnitId | 是否辅计量记结存 | isstockunitid | int |
| 34 | retailMoney | 零售金额 | retailMoney | number |
| 35 | retailUnitPrice | 零售单价 | retailUnitPrice | number |
| 36 | serialStockOverQty | 序列号盘盈数量 | over_qty | int |
| 37 | serialStockShortQty | 序列号盘亏数量 | short_qty | int |

---

## Date Fields (2)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | producedate | 生产日期 | dProduceDate | date |
| 2 | invaliddate | 有效期至 | dInvalidDate | date |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | resultCustomItem | 盘点结果子表自定义项 | st.storecheckplan.StoreCheckResultDetailCustomItem |
| 2 | storeCheckResultDetailSNs | 盘点结果序列号 | st.storecheckplan.StoreCheckResultDetailSN |
