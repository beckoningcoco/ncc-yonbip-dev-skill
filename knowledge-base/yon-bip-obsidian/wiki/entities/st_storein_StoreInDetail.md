---
tags: [BIP, metadata, st, StoreInDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 调拨入库单子表 (st.storein.StoreInDetail)

> Platform: BIP V5 | Module: st | Table: st_storein_b | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 调拨入库单子表 |
| uri | st.storein.StoreInDetail |
| tableName | st_storein_b |
| domain | ustock |
| applicationCode | ST |
| superUri | st.voucher.UstockVouchLine |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (28)

| # | Name | URI |
|---|------|-----|
| 1 | 换算比 (IUOMExchRate) | gscm.itf.IUOMExchRate |
| 2 | 规格 (FreeItem) | base.itf.FreeItem |
| 3 | 计量单位信息 (IUOMInfo) | voucher.base.IUOMInfo |
| 4 | 原币金额信息 (IOriMoneyInfo) | voucher.base.IOriMoneyInfo |
| 5 | 本币金额信息 (INatMoneyInfo) | voucher.base.INatMoneyInfo |
| 6 | 往来（应收应付）账户 (IContactsAccount) | voucher.base.IContactsAccount |
| 7 | 生单回写 (IBackWrite) | base.itf.IBackWrite |
| 8 | 源头单据信息 (IFirstSourceData) | st.voucher.IFirstSourceData |
| 9 | 库存接口 (IInventory) | st.internaltransaction.IInventory |
| 10 | 调拨源头单据信息 (IFirstSourceData4Transfer) | st.transferapply.IFirstSourceData4Transfer |
| 11 | 库存状态接口 (IStockStatus) | st.stockStatusRecord.IStockStatus |
| 12 | 预留双向 (IReservationInOut) | st.reservation.IReservationInOut |
| 13 | 货主对象 (IInventoryOwner) | st.inventoryowner.IInventoryOwner |
| 14 | 货权归属 (IOwnerType) | st.inventoryowner.IOwnerType |
| 15 | 物权转移单回写 (vmiBackWrite) | st.billstate.vmiBackWrite |
| 16 | 是否更新存货成本接口 (IUpdateCost) | st.inventoryaccounting.IUpdateCost |
| 17 | 后端自动行号接口 (ILineNo) | base.itf.ILineNo |
| 18 | 上游单据行号 (IUpLinenNO) | st.uplineno.IUpLinenNO |
| 19 | 源头单据行号 (FirstupLinenNO) | st.uplineno.FirstupLinenNO |
| 20 | 来源订单行号 (SourceOrderLinenNO) | st.uplineno.SourceOrderLinenNO |
| 21 | 特征适配相关信息 (CharacterInfo) | gscm.itf.CharacterInfo |
| 22 | 租户相关 (ITenant) | base.itf.ITenant |
| 23 | 零售价格组件 (IRetailPrice) | st.retail.IRetailPrice |
| 24 | 库存类型对象 (IStockType) | st.stocktype.IStockType |
| 25 | 来源订单信息 (IOrderSource) | st.orderSource.IOrderSource |
| 26 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 27 | 跟踪线索MTO销售订单 (ReservationMtoSalesOrder) | st.inventoryaccounting.ReservationMtoSalesOrder |
| 28 | 项目结构属性 (projectStructureProperties) | BGDM.wbs.projectStructureProperties |

---

## All Fields (149)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | allTotalInternalNatMoney | 累计内部结算金额本币 | fAllTotalInternalNatMoney | number | Decimal |  |  |  |
| 2 | allTotalInternalOriMoney | 累计内部结算金额原币 | fAllTotalInternalOriMoney | number | Decimal |  |  |  |
| 3 | allTotalInternalQty | 累计待内部结算数量 | fAllTotalInternalQty | number | Decimal |  |  |  |
| 4 | autoCalcCost | 自动计算成本 | autoCalcCost | switch | Boolean |  |  | nullable |
| 5 | groupTaskKey | 分组任务KEY | groupTaskKey | text | String |  |  | nullable,reportHide |
| 6 | natTax | 本币税额 | natTax | number | Decimal |  |  |  |
| 7 | oriMoney | 原币无税金额 | oriMoney | number | Decimal |  |  |  |
| 8 | oriSum | 原币含税金额 | oriSum | number | Decimal |  |  |  |
| 9 | oriTaxUnitPrice | 原币含税单价 | oriTaxUnitPrice | number | Decimal |  |  |  |
| 10 | oriUnitPrice | 原币无税单价 | oriUnitPrice | number | Decimal |  |  |  |
| 11 | product | 物料 | iProductid | quote | pc.aa.Product |  |  | data_auth,nullable,dataPowerFlag |
| 12 | sfee | 累计结算费用 | sfee | number | Decimal |  |  | nullable |
| 13 | expenseNatSum | 费用本币含税金额 | expenseNatSum | number | Decimal |  |  | nullable |
| 14 | expenseNatMoney | 费用本币无税金额 | expenseNatMoney | number | Decimal |  |  | nullable |
| 15 | writeOffQtyTotal | 累计冲销数量 | write_off_qty_total | number | Decimal |  |  | nullable |
| 16 | writeOffUpcode | 冲销单据号 | write_off_upcode | text | String |  |  | nullable |
| 17 | writeOffSourceid | 冲销线索主表id | write_off_sourceid | long | Long |  |  | nullable |
| 18 | writeOffSourceautoid | 冲销线索子表id | write_off_sourceautoid | long | Long |  |  | nullable |
| 19 | writeOffUplineno | 冲销单据行号 | write_off_uplineno | number | Decimal |  |  | nullable |
| 20 | inCustodian | 调入保管者 | inCustodianid | quote | st.custodian.Custodian |  |  | nullable |
| 21 | inCustodianType | 调入保管者类型 | inCustodian_type | text | String |  |  | nullable |
| 22 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable |
| 23 | productAuth | 物料权限 | iProductid | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 24 | productsku | 默认SKUID | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable |
| 25 | productskun | 默认SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | nullable |
| 26 | mtoSalesOrderCode | MTO销售订单单据号 | mtoSalesOrderCode | text | String |  |  | nullable |
| 27 | mtoSalesOrderId | MTO销售订单主表id | mtoSalesOrderId | long | Long |  |  | nullable |
| 28 | mtoSalesOrderLineId | MTO销售订单行id | mtoSalesOrderLineId | long | Long |  |  | nullable |
| 29 | mtoSalesOrderLineNo | MTO销售订单行号 | mtoSalesOrderLineNo | number | Decimal |  |  | nullable |
| 30 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 31 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 32 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 33 | sourceMainPubts | 时间戳 | sourceMainPubts | timestamp | Timestamp |  |  | nullable,reportHide |
| 34 | stockSensClue | 现存量特征敏感线索 | stockSensClue | text | String |  |  | nullable |
| 35 | storeInDetailCharacteristics | 自由项特征组 | storeInDetailCharacteristics | FreeCT | st.storein.StoreInDetailCharacteristics |  |  | nullable |
| 36 | storeInDetailDefineCharacter | 自定义项特征组 | storeInDetailDefineCharacter | UserDefine | st.storein.StoreInDetailDefineCharacter |  |  | nullable |
| 37 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 38 | isScrap | 是否废品 | isScrap | switch | Boolean |  |  | nullable |
| 39 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 40 | establishedCardQty | 已建卡数量 | fEstablishedCardQty | number | Decimal |  |  | nullable |
| 41 | free1 | 物料规格1 | free1 | text | String |  |  | isGlobalization,nullable |
| 42 | free2 | 物料规格2 | free2 | text | String |  |  | isGlobalization,nullable |
| 43 | free3 | 物料规格3 | free3 | text | String |  |  | isGlobalization,nullable |
| 44 | free4 | 物料规格4 | free4 | text | String |  |  | isGlobalization,nullable |
| 45 | free5 | 物料规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 46 | free6 | 物料规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 47 | free7 | 物料规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 48 | free8 | 物料规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 49 | free9 | 物料规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 50 | free10 | 物料规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 51 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 52 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 53 | invaliddate | 有效期至 | dInvalidDate | date | Date |  |  | nullable |
| 54 | inventoryowner | 货主对象 | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 55 | ownertype | 货权归属 | ownertype | int | Integer |  |  | nullable |
| 56 | propertyRightsTransferred | 已货权转移 | propertyRightsTransferred | switch | Boolean |  |  | nullable |
| 57 | isUpdateCost | 更新存货成本 | isUpdateCost | switch | Boolean |  |  | nullable |
| 58 | contactsQuantity | 应收数量 | dqty | number | Decimal |  |  | nullable |
| 59 | contactsPieces | 应收件数 | dnum | number | Decimal |  |  | nullable |
| 60 | qty | 数量 | dinqty | number | Decimal |  |  | nullable,isCalcQty |
| 61 | unit | 主计量id | iunitid | quote | pc.unit.Unit |  |  | nullable |
| 62 | mainid | 主表id | imainid | quote | st.storein.StoreIn |  |  | nullable |
| 63 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  | nullable |
| 64 | subQty | 件数 | subQty | number | Decimal |  |  | nullable |
| 65 | stockUnitId | 库存单位id | stockUnitId | quote | pc.unit.Unit |  |  | nullable |
| 66 | recorddate | 入库日期 | drecorddate | date | Date |  |  | nullable |
| 67 | rowno | 行号 | rowno | int | Integer |  |  | isCode,nullable |
| 68 | srcBillRow | 来源行ID | csrcbillbid | text | String |  |  | nullable |
| 69 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 70 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 71 | costprice | 成本价 | costprice | number | Decimal |  |  | nullable |
| 72 | costmoney | 成本金额_备用 | costmoney | number | Decimal |  |  | nullable |
| 73 | natUnitPrice | 成本单价 | natUnitPrice | number | Decimal |  |  |  |
| 74 | natMoney | 成本金额 | natMoney | number | Decimal |  |  |  |
| 75 | natTaxUnitPrice | 含税单价 | natTaxUnitPrice | number | Decimal |  |  |  |
| 76 | natSum | 含税金额 | natSum | number | Decimal |  |  |  |
| 77 | oriTax | 税额 | oriTax | number | Decimal |  |  |  |
| 78 | taxRate | 税率 | taxRate | number | Decimal |  |  |  |
| 79 | goodsposition | 货位id | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 80 | stockStatusDoc | 库存状态 | stockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 81 | outreserveid | 调出预留对象 | outreserveid | quote | st.reservation.Reservation |  |  | nullable |
| 82 | inreserveid | 调入预留对象 | inreserveid | quote | st.reservation.Reservation |  |  | nullable |
| 83 | project | 项目id | iProject | quote | bd.project.ProjectVO |  |  | dataPowerFlag,data_auth,nullable |
| 84 | source | 上游单据类型 | source | text | String |  |  | nullable,reportHide |
| 85 | firstsource4transfer | 调拨源头单据类型 | firstsource4transfer | text | String |  |  | nullable |
| 86 | firstsourceid4transfer | 调拨源头单据主表id | firstsourceid4transfer | long | Long |  |  | nullable |
| 87 | sourceid | 上游单据主表id | sourceid | long | Long |  |  | nullable |
| 88 | sourceautoid | 上游单据子表id | sourceautoid | long | Long |  |  | nullable |
| 89 | firstsourceautoid4transfer | 调拨源头单据子表id | firstsourceautoid4transfer | long | Long |  |  | nullable |
| 90 | upcode | 上游单据号 | upcode | text | String |  |  | nullable |
| 91 | firstupcode4transfer | 调拨源头单据号 | firstupcode4transfer | text | String |  |  | nullable |
| 92 | makeRuleCode | 生单规则编号 | makerule_code | text | String |  |  | nullable,reportHide |
| 93 | firstsource | 调拨订单类型 | firstsource | text | String |  |  | nullable |
| 94 | firstsourceid | 调拨订单主表id | firstsourceid | long | Long |  |  | nullable |
| 95 | firstsourceautoid | 调拨订单子表id | firstsourceautoid | long | Long |  |  | nullable |
| 96 | uplineno | 来源单据行号 | uplineno | number | Decimal |  |  | nullable |
| 97 | firstupcode | 调拨订单单号 | firstupcode | text | String |  |  | nullable |
| 98 | sourceOrderlineno | 来源订单行号 | sourceOrderlineno | number | Decimal |  |  | nullable |
| 99 | firstuplineno | 调拨订单行号 | firstuplineno | number | Decimal |  |  | nullable |
| 100 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int | Integer |  |  | nullable |
| 101 | memo | 备注 | cmemo | text | String |  |  | nullable |
| 102 | allTotalInternalUnit | 累计内部结算数量 | fAllTotalInternalUnit | number | Decimal |  |  |  |
| 103 | pickreqId | 领料申请主表id | pickreq_id | long | Long |  |  | nullable |
| 104 | pickreqAutoid | 领料申请子表id | pickreq_autoid | long | Long |  |  | nullable |
| 105 | stockType | 库存类型ID | stockType | quote | st.stocktype.StockType |  |  | nullable |
| 106 | retailUnitPrice | 零售单价 | retailUnitPrice | number | Decimal |  |  | nullable |
| 107 | retailMoney | 零售金额 | retailMoney | number | Decimal |  |  | nullable |
| 108 | orderSource | 来源订单类型 | orderSource | text | String |  |  | nullable |
| 109 | orderCode | 来源订单号 | orderCode | text | String |  |  | nullable |
| 110 | orderSourceid | 来源订单ID | orderSourceid | long | Long |  |  | nullable |
| 111 | orderSourceautoid | 来源订单行ID | orderSourceautoid | long | Long |  |  | nullable |
| 112 | orderSourceGrandchildrenId | 来源订单孙ID | orderSourceGrandchildrenId | long | Long |  |  | nullable |
| 113 | bodyItem | 调拨入库单子表自定义项 | - | - | st.storein.StoreInDetailCustomItem |  |  |  |
| 114 | bodyParallel | 调拨入库单子表平行表 | - | - | st.storein.StoreInDetailParallel |  |  |  |
| 115 | define1 | 自定义项1 | define1 | text | String |  |  | isGlobalization,nullable |
| 116 | define10 | 自定义项10 | define10 | text | String |  |  | isGlobalization,nullable |
| 117 | define11 | 自定义项11 | define11 | text | String |  |  | isGlobalization,nullable |
| 118 | define12 | 自定义项12 | define12 | text | String |  |  | isGlobalization,nullable |
| 119 | define13 | 自定义项13 | define13 | text | String |  |  | isGlobalization,nullable |
| 120 | define14 | 自定义项14 | define14 | text | String |  |  | isGlobalization,nullable |
| 121 | define15 | 自定义项15 | define15 | text | String |  |  | isGlobalization,nullable |
| 122 | define16 | 自定义项16 | define16 | text | String |  |  | isGlobalization,nullable |
| 123 | define17 | 自定义项17 | define17 | text | String |  |  | isGlobalization,nullable |
| 124 | define18 | 自定义项18 | define18 | text | String |  |  | isGlobalization,nullable |
| 125 | define19 | 自定义项19 | define19 | text | String |  |  | isGlobalization,nullable |
| 126 | define2 | 自定义项2 | define2 | text | String |  |  | isGlobalization,nullable |
| 127 | define20 | 自定义项20 | define20 | text | String |  |  | isGlobalization,nullable |
| 128 | define21 | 自定义项21 | define21 | text | String |  |  | isGlobalization,nullable |
| 129 | define22 | 自定义项22 | define22 | text | String |  |  | isGlobalization,nullable |
| 130 | define23 | 自定义项23 | define23 | text | String |  |  | isGlobalization,nullable |
| 131 | define24 | 自定义项24 | define24 | text | String |  |  | isGlobalization,nullable |
| 132 | define25 | 自定义项25 | define25 | text | String |  |  | isGlobalization,nullable |
| 133 | define26 | 自定义项26 | define26 | text | String |  |  | isGlobalization,nullable |
| 134 | define27 | 自定义项27 | define27 | text | String |  |  | isGlobalization,nullable |
| 135 | define28 | 自定义项28 | define28 | text | String |  |  | isGlobalization,nullable |
| 136 | define29 | 自定义项29 | define29 | text | String |  |  | isGlobalization,nullable |
| 137 | define3 | 自定义项3 | define3 | text | String |  |  | isGlobalization,nullable |
| 138 | define30 | 自定义项30 | define30 | text | String |  |  | isGlobalization,nullable |
| 139 | define4 | 自定义项4 | define4 | text | String |  |  | isGlobalization,nullable |
| 140 | define5 | 自定义项5 | define5 | text | String |  |  | isGlobalization,nullable |
| 141 | define6 | 自定义项6 | define6 | text | String |  |  | isGlobalization,nullable |
| 142 | define7 | 自定义项7 | define7 | text | String |  |  | isGlobalization,nullable |
| 143 | define8 | 自定义项8 | define8 | text | String |  |  | isGlobalization,nullable |
| 144 | define9 | 自定义项9 | define9 | text | String |  |  | isGlobalization,nullable |
| 145 | defines | 调拨出库单子表自由自定义项 | - | - | st.storein.StoreInDetailAttrextItem |  |  |  |
| 146 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 147 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 148 | sourceStoreOutIsUpdateCost | 调出单行的更新存货成本(仅财务事项过账可用_不存储数据) | sourceStoreOutIsUpdateCost | switch | Boolean |  |  | nullable |
| 149 | storeInDetailSNs | 调拨入库单序列号 | - | - | st.storein.StoreInDetailSN |  |  |  |

---

## Reference Fields (20)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | product | 物料 | iProductid | pc.aa.Product |
| 2 | inCustodian | 调入保管者 | inCustodianid | st.custodian.Custodian |
| 3 | productn | 物料 | iProductid | pc.product.Product |
| 4 | productAuth | 物料权限 | iProductid | pb.dataauth.ProductDataAuth |
| 5 | productsku | 默认SKUID | iProductSkuid | pc.aa.ProductSKU |
| 6 | productskun | 默认SKUID | iProductSkuid | pc.product.ProductSKU |
| 7 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 8 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 9 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 10 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 11 | inventoryowner | 货主对象 | inventoryowner | st.inventoryowner.InventoryOwner |
| 12 | unit | 主计量id | iunitid | pc.unit.Unit |
| 13 | mainid | 主表id | imainid | st.storein.StoreIn |
| 14 | stockUnitId | 库存单位id | stockUnitId | pc.unit.Unit |
| 15 | goodsposition | 货位id | iGoodsPositionId | aa.goodsposition.GoodsPosition |
| 16 | stockStatusDoc | 库存状态 | stockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 17 | outreserveid | 调出预留对象 | outreserveid | st.reservation.Reservation |
| 18 | inreserveid | 调入预留对象 | inreserveid | st.reservation.Reservation |
| 19 | project | 项目id | iProject | bd.project.ProjectVO |
| 20 | stockType | 库存类型ID | stockType | st.stocktype.StockType |

---

## Number Fields (40)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | allTotalInternalNatMoney | 累计内部结算金额本币 | fAllTotalInternalNatMoney | number |
| 2 | allTotalInternalOriMoney | 累计内部结算金额原币 | fAllTotalInternalOriMoney | number |
| 3 | allTotalInternalQty | 累计待内部结算数量 | fAllTotalInternalQty | number |
| 4 | natTax | 本币税额 | natTax | number |
| 5 | oriMoney | 原币无税金额 | oriMoney | number |
| 6 | oriSum | 原币含税金额 | oriSum | number |
| 7 | oriTaxUnitPrice | 原币含税单价 | oriTaxUnitPrice | number |
| 8 | oriUnitPrice | 原币无税单价 | oriUnitPrice | number |
| 9 | sfee | 累计结算费用 | sfee | number |
| 10 | expenseNatSum | 费用本币含税金额 | expenseNatSum | number |
| 11 | expenseNatMoney | 费用本币无税金额 | expenseNatMoney | number |
| 12 | writeOffQtyTotal | 累计冲销数量 | write_off_qty_total | number |
| 13 | writeOffUplineno | 冲销单据行号 | write_off_uplineno | number |
| 14 | mtoSalesOrderLineNo | MTO销售订单行号 | mtoSalesOrderLineNo | number |
| 15 | lineno | 行号 | lineno | number |
| 16 | establishedCardQty | 已建卡数量 | fEstablishedCardQty | number |
| 17 | ownertype | 货权归属 | ownertype | int |
| 18 | contactsQuantity | 应收数量 | dqty | number |
| 19 | contactsPieces | 应收件数 | dnum | number |
| 20 | qty | 数量 | dinqty | number |
| 21 | invExchRate | 换算率 | invExchRate | number |
| 22 | subQty | 件数 | subQty | number |
| 23 | rowno | 行号 | rowno | int |
| 24 | costprice | 成本价 | costprice | number |
| 25 | costmoney | 成本金额_备用 | costmoney | number |
| 26 | natUnitPrice | 成本单价 | natUnitPrice | number |
| 27 | natMoney | 成本金额 | natMoney | number |
| 28 | natTaxUnitPrice | 含税单价 | natTaxUnitPrice | number |
| 29 | natSum | 含税金额 | natSum | number |
| 30 | oriTax | 税额 | oriTax | number |
| 31 | taxRate | 税率 | taxRate | number |
| 32 | uplineno | 来源单据行号 | uplineno | number |
| 33 | sourceOrderlineno | 来源订单行号 | sourceOrderlineno | number |
| 34 | firstuplineno | 调拨订单行号 | firstuplineno | number |
| 35 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int |
| 36 | allTotalInternalUnit | 累计内部结算数量 | fAllTotalInternalUnit | number |
| 37 | retailUnitPrice | 零售单价 | retailUnitPrice | number |
| 38 | retailMoney | 零售金额 | retailMoney | number |
| 39 | invExchRateDen | 换算率分母 | invexchrateden | number |
| 40 | invExchRateNum | 换算率分子 | invexchratenum | number |

---

## Date Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | producedate | 生产日期 | dProduceDate | date |
| 2 | invaliddate | 有效期至 | dInvalidDate | date |
| 3 | recorddate | 入库日期 | drecorddate | date |

---

## Child Tables (4)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | bodyItem | 调拨入库单子表自定义项 | st.storein.StoreInDetailCustomItem |
| 2 | storeInDetailSNs | 调拨入库单序列号 | st.storein.StoreInDetailSN |
| 3 | bodyParallel | 调拨入库单子表平行表 | st.storein.StoreInDetailParallel |
| 4 | defines | 调拨出库单子表自由自定义项 | st.storein.StoreInDetailAttrextItem |
