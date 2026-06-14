---
tags: [BIP, metadata, uscmf, LendRecords]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 借用未还单子表 (uscmf.lendrecord.LendRecords)

> Platform: BIP V5 | Module: uscmf | Table: uscmf_lendrecords | Schema: uscmf

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 借用未还单子表 |
| uri | uscmf.lendrecord.LendRecords |
| tableName | uscmf_lendrecords |
| domain | uscmf |
| schema | `ustock` |
| applicationCode | ST |
| superUri | retail.voucher.RetailVouchLine |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (20)

| # | Name | URI |
|---|------|-----|
| 1 | 换算比 (IUOMExchRate) | gscm.itf.IUOMExchRate |
| 2 | 原币金额信息 (IOriMoneyInfo) | voucher.base.IOriMoneyInfo |
| 3 | 库存成本信息 (ICostMoneyInfo) | voucher.base.ICostMoneyInfo |
| 4 | 预留对象相关 (IReservationID) | st.reservation.IReservationID |
| 5 | 源头单据信息 (IFirstSourceData) | retail.voucher.IFirstSourceData |
| 6 | 效期相关 (IExp) | retail.voucher.IExp |
| 7 | 租户相关 (ITenant) | base.itf.ITenant |
| 8 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 9 | 规格 (FreeItem) | base.itf.FreeItem |
| 10 | 后端自动行号接口 (ILineNo) | base.itf.ILineNo |
| 11 | 源头单据行号 (FirstupLinenNO) | st.uplineno.FirstupLinenNO |
| 12 | 本币金额信息 (INatMoneyInfo) | voucher.base.INatMoneyInfo |
| 13 | 生单回写 (IBackWrite) | base.itf.IBackWrite |
| 14 | 库存状态接口 (IStockStatus) | st.stockStatusRecord.IStockStatus |
| 15 | 上游单据行号 (IUpLinenNO) | st.uplineno.IUpLinenNO |
| 16 | 往来（应收应付）账户 (IContactsAccount) | voucher.base.IContactsAccount |
| 17 | 项目结构属性 (projectStructureProperties) | BGDM.wbs.projectStructureProperties |
| 18 | 货主对象 (IInventoryOwner) | st.inventoryowner.IInventoryOwner |
| 19 | 货权归属 (IOwnerType) | st.inventoryowner.IOwnerType |
| 20 | 库存类型对象 (IStockType) | st.stocktype.IStockType |

---

## All Fields (141)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | firstuplineno | 源头单据行号 | firstuplineno | number | Decimal |  |  | nullable |
| 2 | isReturn | 是否未还 | isReturn | int | Integer |  |  | nullable |
| 3 | lendRecordsCharacter | 自定义项特征属性组 | lendRecordsCharacter | UserDefine | uscmf.lendrecord.LendRecordsCharacter |  |  | nullable |
| 4 | lendRecordsCharacteristics | 自由特征组 | lendRecordsCharacteristics | FreeCT | uscmf.lendrecord.LendRecordsCharacteristics |  |  | nullable |
| 5 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 6 | store | 终端网点 | storeId | quote | aa.store.Store |  |  | nullable |
| 7 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 8 | uplineno | 上游单据行号 | uplineno | number | Decimal |  |  | nullable |
| 9 | warningThreshold | 临期预警天数 | warningThreshold | text | String |  |  | nullable |
| 10 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 11 | productskun | SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | nullable |
| 12 | returnDifferenceFlag | 差异归还标识 | return_difference_flag | short | Short |  |  | nullable |
| 13 | inventoryowner | 货主对象Id | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 14 | ownertype | 货权归属 | ownertype | int | Integer |  |  | nullable |
| 15 | stockType | 库存类型 | stockType | quote | st.stocktype.StockType |  |  | nullable |
| 16 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 17 | transPurchaseQuantity | 转采购数量 | transPurchaseQuantity | number | Decimal |  |  | nullable |
| 18 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 19 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable |
| 20 | transPurchasePieces | 转采购件数 | transPurchasePieces | number | Decimal |  |  | nullable |
| 21 | product | 物料id | iProductid | quote | pc.aa.Product |  |  | nullable,dataPowerFlag |
| 22 | productsku | SKUid | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable |
| 23 | unit | 单位id | iUnitId | quote | pc.unit.Unit |  |  | nullable |
| 24 | mainid | 主表id | iMainId | quote | uscmf.lendrecord.LendRecord |  |  | nullable |
| 25 | qty | 数量 | qty | number | Decimal |  |  | nullable |
| 26 | free1 | 物料规格1 | free1 | text | String |  |  | isGlobalization,nullable |
| 27 | free2 | 物料规格2 | free2 | text | String |  |  | isGlobalization,nullable |
| 28 | free3 | 物料规格3 | free3 | text | String |  |  | isGlobalization,nullable |
| 29 | free4 | 物料规格4 | free4 | text | String |  |  | isGlobalization,nullable |
| 30 | free5 | 物料规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 31 | free6 | 物料规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 32 | free7 | 物料规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 33 | free8 | 物料规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 34 | free9 | 物料规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 35 | free10 | 物料规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 36 | batchno | 批号 | sBatchNo | text | String |  |  | nullable |
| 37 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 38 | invaliddate | 有效期至 | dInvalidDate | date | Date |  |  | nullable |
| 39 | recorddate | 出库日期 | dRecordDate | date | Date |  |  | nullable |
| 40 | memo | 备注 | cMemo | text | String |  |  | nullable |
| 41 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 42 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 43 | sourceid | 上游单据主表id | sourceid | long | Long |  |  | nullable |
| 44 | sourceautoid | 上游单据子表id | sourceautoid | long | Long |  |  | nullable |
| 45 | source | 上游单据类型 | source | text | String |  |  | nullable,reportHide |
| 46 | upcode | 上游单据号 | upcode | text | String |  |  | nullable |
| 47 | makeRuleCode | 生单规则编号 | makerule_code | text | String |  |  | nullable,reportHide |
| 48 | expReturnDate | 预计归还日期 | expReturnDate | date | Date |  |  | nullable |
| 49 | transUnit | 转换单位 | transCustomer | text | String |  |  | nullable |
| 50 | transType | 转换类型 | transType | text | String |  |  | nullable |
| 51 | transDate | 转换日期 | transDate | date | Date |  |  | nullable |
| 52 | transQuantity | 转换数量 | transQuantity | number | Decimal |  |  | nullable |
| 53 | transPieces | 转换件数 | transPieces | number | Decimal |  |  | nullable |
| 54 | returnDate | 归还日期 | returnDate | date | Date |  |  | nullable |
| 55 | returnQuantity | 累计已归还数量 | returnQuantity | number | Decimal |  |  | nullable |
| 56 | returnPieces | 累计已归还件数 | returnPieces | number | Decimal |  |  | nullable |
| 57 | transSaleQuantity | 累计转销售数量 | transSaleQuantity | number | Decimal |  |  | nullable |
| 58 | transSalePieces | 累计转销售件数 | transSalePieces | number | Decimal |  |  | nullable |
| 59 | transGiftQuantity | 累计转赠品数量 | transGiftQuantity | number | Decimal |  |  | nullable |
| 60 | transGiftPieces | 累计转赠品件数 | transGiftPieces | number | Decimal |  |  | nullable |
| 61 | transComsumptionQuantity | 累计转耗用数量 | transComsumptionQuantity | number | Decimal |  |  | nullable |
| 62 | transComsumptionPieces | 累计转耗用件数 | transComsumptionPieces | number | Decimal |  |  | nullable |
| 63 | transBorrowQuantity | 累计转借用数量 | transBorrowQuantity | number | Decimal |  |  | nullable |
| 64 | transBorrowPieces | 累计转借用件数 | transBorrowPieces | number | Decimal |  |  | nullable |
| 65 | noReturnQuantity | 未归还数量 | noReturnQuantity | number | Decimal |  |  | nullable |
| 66 | noReturnPieces | 未归还件数 | noReturnPieces | number | Decimal |  |  | nullable |
| 67 | srcOutType | 来源交易类型的出库类型 | srcOutType | text | String |  |  | nullable |
| 68 | srcBillType | 来源单据类型 | cSrcBillType | text | String |  |  | nullable |
| 69 | srcBusType | 上游单据交易类型 | srcBusType | quote | bd.bill.TransType |  |  | nullable |
| 70 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  | nullable |
| 71 | contactsQuantity | 应发数量 | contacts_quantity | number | Decimal |  |  |  |
| 72 | subQty | 件数 | subQty | number | Decimal |  |  | nullable |
| 73 | stockUnitId | 库存单位id | stock_unit_id | quote | pc.unit.Unit |  |  | nullable |
| 74 | contactsPieces | 应发件数 | contacts_pieces | number | Decimal |  |  |  |
| 75 | isScrap | 是否废品 | isScrap | switch | Boolean |  |  | nullable |
| 76 | unitExchangeType | 换算方式 | unitExchangeType | int | Integer |  |  | nullable |
| 77 | costMoney | 成本金额 | cost_money | number | Decimal |  |  |  |
| 78 | proratadistribution | 分摊比例 | proratadistribution | number | Decimal |  |  | nullable |
| 79 | natSum | 本币含税金额 | natSum | number | Decimal |  |  |  |
| 80 | autoCalcCost | 自动计算成本 | autoCalcCost | switch | Boolean |  |  |  |
| 81 | reserveid | 预留对象Id | reserveid | quote | st.reservation.Reservation |  |  | nullable,skipReferenceCheck |
| 82 | stockStatusDoc | 库存状态 | stockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 83 | oriSum | 原币含税金额 | oriSum | number | Decimal |  |  |  |
| 84 | natMoney | 本币无税金额 | natMoney | number | Decimal |  |  |  |
| 85 | project | 项目id | iProject | quote | bd.project.ProjectVO |  |  | data_auth,nullable |
| 86 | groupTaskKey | 分组任务KEY | groupTaskKey | text | String |  |  | nullable,reportHide |
| 87 | project_code | 项目编码 | cProjectCode | text | String |  |  | nullable |
| 88 | group_number | 组号 | group_number | int | Integer |  |  | nullable |
| 89 | oriTaxUnitPrice | 原币含税单价 | oriTaxUnitPrice | number | Decimal |  |  |  |
| 90 | natUnitPrice | 本币无税单价 | natUnitPrice | number | Decimal |  |  |  |
| 91 | sourceMainPubts | 时间戳 | sourceMainPubts | timestamp | Timestamp |  |  | nullable,reportHide |
| 92 | natTaxUnitPrice | 本币含税单价 | natTaxUnitPrice | number | Decimal |  |  |  |
| 93 | oriTax | 原币税额 | oriTax | number | Decimal |  |  |  |
| 94 | rowno | 行号 | rowno | int | Integer |  |  | isCode,nullable |
| 95 | natTax | 本币税额 | natTax | number | Decimal |  |  |  |
| 96 | goodsposition | 货位 | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable,reportHide |
| 97 | oriUnitPrice | 原币无税单价 | oriUnitPrice | number | Decimal |  |  |  |
| 98 | taxRate | 税率 | taxRate | number | Decimal |  |  |  |
| 99 | oriMoney | 原币无税金额 | oriMoney | number | Decimal |  |  |  |
| 100 | assetsStatus | 资产状态 | assets_status | text | String |  |  | nullable |
| 101 | assetsCode | 资产编码 | assets_code | text | String |  |  | nullable |
| 102 | costUnitPrice | 成本单价 | cost_unit_price | number | Decimal |  |  |  |
| 103 | firstsourceid | 源头单据主表id | firstsourceid | long | Long |  |  | nullable |
| 104 | firstsourceautoid | 源头单据子表id | firstsourceautoid | long | Long |  |  | nullable |
| 105 | firstsource | 源头单据类型 | firstsource | text | String |  |  | nullable |
| 106 | firstupcode | 源头单据号 | firstupcode | text | String |  |  | nullable |
| 107 | bodyItem | 借用未还单子表自定义项 | - | - | uscmf.lendrecord.LendRecordsCustomItem |  |  |  |
| 108 | define1 | 自定义项1 | define1 | text | String |  |  | isGlobalization,nullable |
| 109 | define10 | 自定义项10 | define10 | text | String |  |  | isGlobalization,nullable |
| 110 | define11 | 自定义项11 | define11 | text | String |  |  | isGlobalization,nullable |
| 111 | define12 | 自定义项12 | define12 | text | String |  |  | isGlobalization,nullable |
| 112 | define13 | 自定义项13 | define13 | text | String |  |  | isGlobalization,nullable |
| 113 | define14 | 自定义项14 | define14 | text | String |  |  | isGlobalization,nullable |
| 114 | define15 | 自定义项15 | define15 | text | String |  |  | isGlobalization,nullable |
| 115 | define16 | 自定义项16 | define16 | text | String |  |  | isGlobalization,nullable |
| 116 | define17 | 自定义项17 | define17 | text | String |  |  | isGlobalization,nullable |
| 117 | define18 | 自定义项18 | define18 | text | String |  |  | isGlobalization,nullable |
| 118 | define19 | 自定义项19 | define19 | text | String |  |  | isGlobalization,nullable |
| 119 | define2 | 自定义项2 | define2 | text | String |  |  | isGlobalization,nullable |
| 120 | define20 | 自定义项20 | define20 | text | String |  |  | isGlobalization,nullable |
| 121 | define21 | 自定义项21 | define21 | text | String |  |  | isGlobalization,nullable |
| 122 | define22 | 自定义项22 | define22 | text | String |  |  | isGlobalization,nullable |
| 123 | define23 | 自定义项23 | define23 | text | String |  |  | isGlobalization,nullable |
| 124 | define24 | 自定义项24 | define24 | text | String |  |  | isGlobalization,nullable |
| 125 | define25 | 自定义项25 | define25 | text | String |  |  | isGlobalization,nullable |
| 126 | define26 | 自定义项26 | define26 | text | String |  |  | isGlobalization,nullable |
| 127 | define27 | 自定义项27 | define27 | text | String |  |  | isGlobalization,nullable |
| 128 | define28 | 自定义项28 | define28 | text | String |  |  | isGlobalization,nullable |
| 129 | define29 | 自定义项29 | define29 | text | String |  |  | isGlobalization,nullable |
| 130 | define3 | 自定义项3 | define3 | text | String |  |  | isGlobalization,nullable |
| 131 | define30 | 自定义项30 | define30 | text | String |  |  | isGlobalization,nullable |
| 132 | define4 | 自定义项4 | define4 | text | String |  |  | isGlobalization,nullable |
| 133 | define5 | 自定义项5 | define5 | text | String |  |  | isGlobalization,nullable |
| 134 | define6 | 自定义项6 | define6 | text | String |  |  | isGlobalization,nullable |
| 135 | define7 | 自定义项7 | define7 | text | String |  |  | isGlobalization,nullable |
| 136 | define8 | 自定义项8 | define8 | text | String |  |  | isGlobalization,nullable |
| 137 | define9 | 自定义项9 | define9 | text | String |  |  | isGlobalization,nullable |
| 138 | defines | 借用未还单子表自由自定义项 | - | - | uscmf.lendrecord.LendRecordsDefine |  |  |  |
| 139 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 140 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 141 | lendRecordsSNs | 借用未还单序列号 | - | - | uscmf.lendrecord.LendRecordsSN |  |  |  |

---

## Reference Fields (19)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | store | 终端网点 | storeId | aa.store.Store |
| 2 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 3 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 4 | productskun | SKUID | iProductSkuid | pc.product.ProductSKU |
| 5 | inventoryowner | 货主对象Id | inventoryowner | st.inventoryowner.InventoryOwner |
| 6 | stockType | 库存类型 | stockType | st.stocktype.StockType |
| 7 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 8 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 9 | productn | 物料 | iProductid | pc.product.Product |
| 10 | product | 物料id | iProductid | pc.aa.Product |
| 11 | productsku | SKUid | iProductSkuid | pc.aa.ProductSKU |
| 12 | unit | 单位id | iUnitId | pc.unit.Unit |
| 13 | mainid | 主表id | iMainId | uscmf.lendrecord.LendRecord |
| 14 | srcBusType | 上游单据交易类型 | srcBusType | bd.bill.TransType |
| 15 | stockUnitId | 库存单位id | stock_unit_id | pc.unit.Unit |
| 16 | reserveid | 预留对象Id | reserveid | st.reservation.Reservation |
| 17 | stockStatusDoc | 库存状态 | stockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 18 | project | 项目id | iProject | bd.project.ProjectVO |
| 19 | goodsposition | 货位 | iGoodsPositionId | aa.goodsposition.GoodsPosition |

---

## Number Fields (46)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | firstuplineno | 源头单据行号 | firstuplineno | number |
| 2 | isReturn | 是否未还 | isReturn | int |
| 3 | lineno | 行号 | lineno | number |
| 4 | uplineno | 上游单据行号 | uplineno | number |
| 5 | returnDifferenceFlag | 差异归还标识 | return_difference_flag | short |
| 6 | ownertype | 货权归属 | ownertype | int |
| 7 | transPurchaseQuantity | 转采购数量 | transPurchaseQuantity | number |
| 8 | transPurchasePieces | 转采购件数 | transPurchasePieces | number |
| 9 | qty | 数量 | qty | number |
| 10 | transQuantity | 转换数量 | transQuantity | number |
| 11 | transPieces | 转换件数 | transPieces | number |
| 12 | returnQuantity | 累计已归还数量 | returnQuantity | number |
| 13 | returnPieces | 累计已归还件数 | returnPieces | number |
| 14 | transSaleQuantity | 累计转销售数量 | transSaleQuantity | number |
| 15 | transSalePieces | 累计转销售件数 | transSalePieces | number |
| 16 | transGiftQuantity | 累计转赠品数量 | transGiftQuantity | number |
| 17 | transGiftPieces | 累计转赠品件数 | transGiftPieces | number |
| 18 | transComsumptionQuantity | 累计转耗用数量 | transComsumptionQuantity | number |
| 19 | transComsumptionPieces | 累计转耗用件数 | transComsumptionPieces | number |
| 20 | transBorrowQuantity | 累计转借用数量 | transBorrowQuantity | number |
| 21 | transBorrowPieces | 累计转借用件数 | transBorrowPieces | number |
| 22 | noReturnQuantity | 未归还数量 | noReturnQuantity | number |
| 23 | noReturnPieces | 未归还件数 | noReturnPieces | number |
| 24 | invExchRate | 换算率 | invExchRate | number |
| 25 | contactsQuantity | 应发数量 | contacts_quantity | number |
| 26 | subQty | 件数 | subQty | number |
| 27 | contactsPieces | 应发件数 | contacts_pieces | number |
| 28 | unitExchangeType | 换算方式 | unitExchangeType | int |
| 29 | costMoney | 成本金额 | cost_money | number |
| 30 | proratadistribution | 分摊比例 | proratadistribution | number |
| 31 | natSum | 本币含税金额 | natSum | number |
| 32 | oriSum | 原币含税金额 | oriSum | number |
| 33 | natMoney | 本币无税金额 | natMoney | number |
| 34 | group_number | 组号 | group_number | int |
| 35 | oriTaxUnitPrice | 原币含税单价 | oriTaxUnitPrice | number |
| 36 | natUnitPrice | 本币无税单价 | natUnitPrice | number |
| 37 | natTaxUnitPrice | 本币含税单价 | natTaxUnitPrice | number |
| 38 | oriTax | 原币税额 | oriTax | number |
| 39 | rowno | 行号 | rowno | int |
| 40 | natTax | 本币税额 | natTax | number |
| 41 | oriUnitPrice | 原币无税单价 | oriUnitPrice | number |
| 42 | taxRate | 税率 | taxRate | number |
| 43 | oriMoney | 原币无税金额 | oriMoney | number |
| 44 | costUnitPrice | 成本单价 | cost_unit_price | number |
| 45 | invExchRateDen | 换算率分母 | invexchrateden | number |
| 46 | invExchRateNum | 换算率分子 | invexchratenum | number |

---

## Date Fields (6)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | producedate | 生产日期 | dProduceDate | date |
| 2 | invaliddate | 有效期至 | dInvalidDate | date |
| 3 | recorddate | 出库日期 | dRecordDate | date |
| 4 | expReturnDate | 预计归还日期 | expReturnDate | date |
| 5 | transDate | 转换日期 | transDate | date |
| 6 | returnDate | 归还日期 | returnDate | date |

---

## Child Tables (3)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | bodyItem | 借用未还单子表自定义项 | uscmf.lendrecord.LendRecordsCustomItem |
| 2 | lendRecordsSNs | 借用未还单序列号 | uscmf.lendrecord.LendRecordsSN |
| 3 | defines | 借用未还单子表自由自定义项 | uscmf.lendrecord.LendRecordsDefine |
