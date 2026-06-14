---
tags: [BIP, metadata, st, OthOutRecords]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 其他出库单子表 (st.othoutrecord.OthOutRecords)

> Platform: BIP V5 | Module: st | Table: st_othoutrecords | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 其他出库单子表 |
| uri | st.othoutrecord.OthOutRecords |
| tableName | st_othoutrecords |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | st.voucher.UstockVouchLine |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (27)

| # | Name | URI |
|---|------|-----|
| 1 | 换算比 (IUOMExchRate) | gscm.itf.IUOMExchRate |
| 2 | 规格 (FreeItem) | base.itf.FreeItem |
| 3 | 原币金额信息 (IOriMoneyInfo) | voucher.base.IOriMoneyInfo |
| 4 | 本币金额信息 (INatMoneyInfo) | voucher.base.INatMoneyInfo |
| 5 | 生单回写 (IBackWrite) | base.itf.IBackWrite |
| 6 | 往来（应收应付）账户 (IContactsAccount) | voucher.base.IContactsAccount |
| 7 | 库存成本信息 (ICostMoneyInfo) | voucher.base.ICostMoneyInfo |
| 8 | 计量单位信息 (IUOMInfo) | voucher.base.IUOMInfo |
| 9 | 库存状态接口 (IStockStatus) | st.stockStatusRecord.IStockStatus |
| 10 | 预留对象相关 (IReservationID) | st.reservation.IReservationID |
| 11 | 源头单据信息 (IFirstSourceData) | st.voucher.IFirstSourceData |
| 12 | 是否更新存货成本接口 (IUpdateCost) | st.inventoryaccounting.IUpdateCost |
| 13 | 货主对象 (IInventoryOwner) | st.inventoryowner.IInventoryOwner |
| 14 | 物权转移单回写 (vmiBackWrite) | st.billstate.vmiBackWrite |
| 15 | 货权归属 (IOwnerType) | st.inventoryowner.IOwnerType |
| 16 | 后端自动行号接口 (ILineNo) | base.itf.ILineNo |
| 17 | 上游单据行号 (IUpLinenNO) | st.uplineno.IUpLinenNO |
| 18 | 源头单据行号 (FirstupLinenNO) | st.uplineno.FirstupLinenNO |
| 19 | 来源订单行号 (SourceOrderLinenNO) | st.uplineno.SourceOrderLinenNO |
| 20 | 租户相关 (ITenant) | base.itf.ITenant |
| 21 | 特征适配相关信息 (CharacterInfo) | gscm.itf.CharacterInfo |
| 22 | 零售价格组件 (IRetailPrice) | st.retail.IRetailPrice |
| 23 | 库存类型对象 (IStockType) | st.stocktype.IStockType |
| 24 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 25 | 项目结构属性 (projectStructureProperties) | BGDM.wbs.projectStructureProperties |
| 26 | 跟踪线索MTO销售订单 (ReservationMtoSalesOrder) | st.inventoryaccounting.ReservationMtoSalesOrder |
| 27 | 外部来源行线索 (IOutSysObjLineClue) | base.itf.IOutSysObjLineClue |

---

## All Fields (145)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | budgetMoney | 预算金额 | budgetMoney | number | Decimal |  |  | nullable |
| 2 | budgetUnitPrice | 预算单价 | budgetUnitPrice | number | Decimal |  |  | nullable |
| 3 | expenseItems | 费用项目 | expenseItems | quote | bd.expenseitem.ExpenseItem |  |  | nullable |
| 4 | groupTaskKey | 分组任务KEY | groupTaskKey | text | String |  |  | nullable,reportHide |
| 5 | othOutRecordsDefineCharacter | 自定义项特征属性组 | othOutRecordsDefineCharacter | UserDefine | st.othoutrecord.OthOutRecordsDefineCharacter |  |  | nullable |
| 6 | rowno | 序号 | rowno | int | Integer |  |  | isCode,nullable |
| 7 | sourceMainPubts | 时间戳 | sourceMainPubts | timestamp | Timestamp |  |  | nullable,reportHide |
| 8 | stockSensClue | 现存量特征敏感线索 | stockSensClue | text | String |  |  | nullable |
| 9 | project_code | 项目编码 | cProjectCode | text | String |  |  | nullable |
| 10 | product | 物料 | iProductid | quote | pc.aa.Product |  |  | data_auth,nullable,dataPowerFlag |
| 11 | qmsResultId | 质检结果行id | qmsResultId | text | String |  |  | nullable |
| 12 | insresSourceId | 质检结果上游id | insresSourceId | text | String |  |  | nullable |
| 13 | writeOffUpcode | 冲销单据号 | write_off_upcode | text | String |  |  | nullable |
| 14 | writeOffSourceid | 冲销线索主表id | write_off_sourceid | long | Long |  |  | nullable |
| 15 | writeOffSourceautoid | 冲销线索子表id | write_off_sourceautoid | long | Long |  |  | nullable |
| 16 | writeOffUplineno | 冲销单据行号 | write_off_uplineno | number | Decimal |  |  | nullable |
| 17 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable |
| 18 | productAuth | 物料权限 | iProductid | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 19 | productsku | 默认SKUID | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable |
| 20 | productskun | 默认SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | nullable |
| 21 | mtoSalesOrderCode | MTO销售订单单据号 | mtoSalesOrderCode | text | String |  |  | nullable |
| 22 | mtoSalesOrderId | MTO销售订单主表id | mtoSalesOrderId | long | Long |  |  | nullable |
| 23 | mtoSalesOrderLineId | MTO销售订单行id | mtoSalesOrderLineId | long | Long |  |  | nullable |
| 24 | mtoSalesOrderLineNo | MTO销售订单行号 | mtoSalesOrderLineNo | number | Decimal |  |  | nullable |
| 25 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 26 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 27 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 28 | out_sys_rowno | 外部来源行号 | out_sys_rowno | text | String |  |  | nullable |
| 29 | out_sys_lineid | 外部来源行 | out_sys_lineid | text | String |  |  | nullable |
| 30 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 31 | isUpdateCost | 是否更新存货成本 | isUpdateCost | switch | Boolean |  |  | nullable |
| 32 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 33 | proratadistribution | 分摊比例 | proratadistribution | number | Decimal |  |  | nullable |
| 34 | inventoryowner | 货主对象 | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 35 | mainid | 主表id | iMainId | quote | st.othoutrecord.OthOutRecord |  |  | nullable |
| 36 | isScrap | 是否废品 | isScrap | switch | Boolean |  |  | nullable |
| 37 | assetsStatus | 资产状态 | assets_status | text | String |  |  | nullable |
| 38 | othOutRecordsCharacteristics | 自由项特征组 | othOutRecordsCharacteristics | FreeCT | st.othoutrecord.OthOutRecordsCharacteristics |  |  | nullable |
| 39 | returnDate | 预计归还日期 | return_date | date | Date |  |  | nullable |
| 40 | free1 | 物料规格1 | free1 | text | String |  |  | isGlobalization,nullable |
| 41 | free2 | 物料规格2 | free2 | text | String |  |  | isGlobalization,nullable |
| 42 | free3 | 物料规格3 | free3 | text | String |  |  | isGlobalization,nullable |
| 43 | free4 | 物料规格4 | free4 | text | String |  |  | isGlobalization,nullable |
| 44 | free5 | 物料规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 45 | free6 | 物料规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 46 | free7 | 物料规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 47 | free8 | 物料规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 48 | free9 | 物料规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 49 | free10 | 物料规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 50 | assetsCode | 资产编码 | assets_code | text | String |  |  | nullable |
| 51 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 52 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 53 | invaliddate | 有效期至 | dInvalidDate | date | Date |  |  | nullable |
| 54 | ownertype | 货权归属 | ownertype | int | Integer |  |  | nullable |
| 55 | propertyRightsTransferred | 已货权转移 | propertyRightsTransferred | switch | Boolean |  |  | nullable |
| 56 | contactsQuantity | 应发数量 | contacts_quantity | number | Decimal |  |  |  |
| 57 | contactsPieces | 应发件数 | contacts_pieces | number | Decimal |  |  |  |
| 58 | qty | 数量 | qty | number | Decimal |  |  | nullable |
| 59 | unit | 单位id | iUnitId | quote | pc.unit.Unit |  |  | nullable |
| 60 | recorddate | 出库日期 | dRecordDate | date | Date |  |  | nullable |
| 61 | subQty | 件数 | subQty | number | Decimal |  |  | nullable |
| 62 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  | nullable |
| 63 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int | Integer |  |  | nullable |
| 64 | stockUnitId | 库存单位id | stock_unit_id | quote | pc.unit.Unit |  |  | nullable |
| 65 | stockStatusDoc | 库存状态id | stockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 66 | goodsposition | 货位id | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 67 | reserveid | 预留对象id | reserveid | quote | st.reservation.Reservation |  |  | nullable |
| 68 | costMoney | 成本金额_备用 | cost_money | number | Decimal |  |  |  |
| 69 | costUnitPrice | 成本单价_备用 | cost_unit_price | number | Decimal |  |  |  |
| 70 | natUnitPrice | 成本单价 | natUnitPrice | number | Decimal |  |  |  |
| 71 | natTaxUnitPrice | 本币含税单价 | natTaxUnitPrice | number | Decimal |  |  |  |
| 72 | natMoney | 成本金额 | natMoney | number | Decimal |  |  |  |
| 73 | natSum | 本币含税金额 | natSum | number | Decimal |  |  |  |
| 74 | natTax | 本币税额 | natTax | number | Decimal |  |  |  |
| 75 | oriUnitPrice | 原币无税单价 | oriUnitPrice | number | Decimal |  |  |  |
| 76 | oriTaxUnitPrice | 原币含税单价 | oriTaxUnitPrice | number | Decimal |  |  |  |
| 77 | oriMoney | 原币无税金额 | oriMoney | number | Decimal |  |  |  |
| 78 | oriSum | 原币含税金额 | oriSum | number | Decimal |  |  |  |
| 79 | oriTax | 原币税额 | oriTax | number | Decimal |  |  |  |
| 80 | taxRate | 税率 | taxRate | number | Decimal |  |  |  |
| 81 | group_number | 组号 | group_number | int | Integer |  |  | nullable |
| 82 | project | 项目id | iProject | quote | bd.project.ProjectVO |  |  | dataPowerFlag,data_auth,nullable |
| 83 | sourceid | 上游单据主表id | sourceid | long | Long |  |  | nullable |
| 84 | sourceautoid | 上游单据子表id | sourceautoid | long | Long |  |  | nullable |
| 85 | source | 上游单据类型 | source | text | String |  |  | nullable,reportHide |
| 86 | upcode | 上游单据号 | upcode | text | String |  |  | nullable |
| 87 | makeRuleCode | 生单规则编号 | makerule_code | text | String |  |  | nullable,reportHide |
| 88 | autoCalcCost | 自动计算成本 | autoCalcCost | switch | Boolean |  |  |  |
| 89 | memo | 备注 | cMemo | text | String |  |  | nullable |
| 90 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 91 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 92 | sourceOrderlineno | 来源订单行号 | sourceOrderlineno | number | Decimal |  |  | nullable |
| 93 | firstuplineno | 源头单据行号 | firstuplineno | number | Decimal |  |  | nullable |
| 94 | uplineno | 来源单据行号 | uplineno | number | Decimal |  |  | nullable |
| 95 | firstupcode | 源头单据号 | firstupcode | text | String |  |  | nullable |
| 96 | firstsource | 源头单据类型 | firstsource | text | String |  |  | nullable |
| 97 | firstsourceautoid | 源头单据子表id | firstsourceautoid | long | Long |  |  | nullable |
| 98 | firstsourceid | 源头单据主表id | firstsourceid | long | Long |  |  | nullable |
| 99 | stockType | 库存类型ID | stockType | quote | st.stocktype.StockType |  |  | nullable |
| 100 | retailUnitPrice | 零售单价 | retailUnitPrice | number | Decimal |  |  | nullable |
| 101 | retailMoney | 零售金额 | retailMoney | number | Decimal |  |  | nullable |
| 102 | bodyItem | 其他出库单子表自定义项 | - | - | st.othoutrecord.OthOutRecordsCustomItem |  |  |  |
| 103 | bodyParallel | 其他出库单子表平行表 | - | - | st.othoutrecord.OthOutRecordsParallel |  |  |  |
| 104 | define1 | 自定义项1 | define1 | text | String |  |  | isGlobalization,nullable |
| 105 | define10 | 自定义项10 | define10 | text | String |  |  | isGlobalization,nullable |
| 106 | define11 | 自定义项11 | define11 | text | String |  |  | isGlobalization,nullable |
| 107 | define12 | 自定义项12 | define12 | text | String |  |  | isGlobalization,nullable |
| 108 | define13 | 自定义项13 | define13 | text | String |  |  | isGlobalization,nullable |
| 109 | define14 | 自定义项14 | define14 | text | String |  |  | isGlobalization,nullable |
| 110 | define15 | 自定义项15 | define15 | text | String |  |  | isGlobalization,nullable |
| 111 | define16 | 自定义项16 | define16 | text | String |  |  | isGlobalization,nullable |
| 112 | define17 | 自定义项17 | define17 | text | String |  |  | isGlobalization,nullable |
| 113 | define18 | 自定义项18 | define18 | text | String |  |  | isGlobalization,nullable |
| 114 | define19 | 自定义项19 | define19 | text | String |  |  | isGlobalization,nullable |
| 115 | define2 | 自定义项2 | define2 | text | String |  |  | isGlobalization,nullable |
| 116 | define20 | 自定义项20 | define20 | text | String |  |  | isGlobalization,nullable |
| 117 | define21 | 自定义项21 | define21 | text | String |  |  | isGlobalization,nullable |
| 118 | define22 | 自定义项22 | define22 | text | String |  |  | isGlobalization,nullable |
| 119 | define23 | 自定义项23 | define23 | text | String |  |  | isGlobalization,nullable |
| 120 | define24 | 自定义项24 | define24 | text | String |  |  | isGlobalization,nullable |
| 121 | define25 | 自定义项25 | define25 | text | String |  |  | isGlobalization,nullable |
| 122 | define26 | 自定义项26 | define26 | text | String |  |  | isGlobalization,nullable |
| 123 | define27 | 自定义项27 | define27 | text | String |  |  | isGlobalization,nullable |
| 124 | define28 | 自定义项28 | define28 | text | String |  |  | isGlobalization,nullable |
| 125 | define29 | 自定义项29 | define29 | text | String |  |  | isGlobalization,nullable |
| 126 | define3 | 自定义项3 | define3 | text | String |  |  | isGlobalization,nullable |
| 127 | define30 | 自定义项30 | define30 | text | String |  |  | isGlobalization,nullable |
| 128 | define4 | 自定义项4 | define4 | text | String |  |  | isGlobalization,nullable |
| 129 | define5 | 自定义项5 | define5 | text | String |  |  | isGlobalization,nullable |
| 130 | define6 | 自定义项6 | define6 | text | String |  |  | isGlobalization,nullable |
| 131 | define7 | 自定义项7 | define7 | text | String |  |  | isGlobalization,nullable |
| 132 | define8 | 自定义项8 | define8 | text | String |  |  | isGlobalization,nullable |
| 133 | define9 | 自定义项9 | define9 | text | String |  |  | isGlobalization,nullable |
| 134 | defines | 其他出库单子表自由自定义项 | - | - | st.othoutrecord.OthOutRecordsDefine |  |  |  |
| 135 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 136 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 137 | othOutRecordsSNs | 其他出库单序列号 | - | - | st.othoutrecord.OthOutRecordsSN |  |  |  |
| 138 | relatedMorphInCount | 同组入库明细行个数 | related_morphin_count | int | Integer |  |  | nullable |
| 139 | sourceStoreBillType | 源入库单据类型 | source_store_bill_type | text | String |  |  | nullable |
| 140 | triggerSource | 触发单据类型 | triggersource | text | String |  |  | nullable |
| 141 | triggerSourceCode | 触发单据编码 | triggersourcecode | text | String |  |  | nullable |
| 142 | triggerSourceDetailId | 触发单据行ID | triggersourcedetailid | long | Long |  |  | nullable |
| 143 | triggerSourceId | 触发单据主表ID | triggersourceid | long | Long |  |  | nullable |
| 144 | triggerSourceLineno | 触发单据行号 | triggersourcelineno | number | Decimal |  |  | nullable |
| 145 | writeOffQtyTotal | 累计冲销数量 | write_off_qty_total | number | Decimal |  |  | nullable |

---

## Reference Fields (19)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | expenseItems | 费用项目 | expenseItems | bd.expenseitem.ExpenseItem |
| 2 | product | 物料 | iProductid | pc.aa.Product |
| 3 | productn | 物料 | iProductid | pc.product.Product |
| 4 | productAuth | 物料权限 | iProductid | pb.dataauth.ProductDataAuth |
| 5 | productsku | 默认SKUID | iProductSkuid | pc.aa.ProductSKU |
| 6 | productskun | 默认SKUID | iProductSkuid | pc.product.ProductSKU |
| 7 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 8 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 9 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 10 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 11 | inventoryowner | 货主对象 | inventoryowner | st.inventoryowner.InventoryOwner |
| 12 | mainid | 主表id | iMainId | st.othoutrecord.OthOutRecord |
| 13 | unit | 单位id | iUnitId | pc.unit.Unit |
| 14 | stockUnitId | 库存单位id | stock_unit_id | pc.unit.Unit |
| 15 | stockStatusDoc | 库存状态id | stockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 16 | goodsposition | 货位id | iGoodsPositionId | aa.goodsposition.GoodsPosition |
| 17 | reserveid | 预留对象id | reserveid | st.reservation.Reservation |
| 18 | project | 项目id | iProject | bd.project.ProjectVO |
| 19 | stockType | 库存类型ID | stockType | st.stocktype.StockType |

---

## Number Fields (38)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | budgetMoney | 预算金额 | budgetMoney | number |
| 2 | budgetUnitPrice | 预算单价 | budgetUnitPrice | number |
| 3 | rowno | 序号 | rowno | int |
| 4 | writeOffUplineno | 冲销单据行号 | write_off_uplineno | number |
| 5 | mtoSalesOrderLineNo | MTO销售订单行号 | mtoSalesOrderLineNo | number |
| 6 | lineno | 行号 | lineno | number |
| 7 | proratadistribution | 分摊比例 | proratadistribution | number |
| 8 | ownertype | 货权归属 | ownertype | int |
| 9 | contactsQuantity | 应发数量 | contacts_quantity | number |
| 10 | contactsPieces | 应发件数 | contacts_pieces | number |
| 11 | qty | 数量 | qty | number |
| 12 | subQty | 件数 | subQty | number |
| 13 | invExchRate | 换算率 | invExchRate | number |
| 14 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int |
| 15 | costMoney | 成本金额_备用 | cost_money | number |
| 16 | costUnitPrice | 成本单价_备用 | cost_unit_price | number |
| 17 | natUnitPrice | 成本单价 | natUnitPrice | number |
| 18 | natTaxUnitPrice | 本币含税单价 | natTaxUnitPrice | number |
| 19 | natMoney | 成本金额 | natMoney | number |
| 20 | natSum | 本币含税金额 | natSum | number |
| 21 | natTax | 本币税额 | natTax | number |
| 22 | oriUnitPrice | 原币无税单价 | oriUnitPrice | number |
| 23 | oriTaxUnitPrice | 原币含税单价 | oriTaxUnitPrice | number |
| 24 | oriMoney | 原币无税金额 | oriMoney | number |
| 25 | oriSum | 原币含税金额 | oriSum | number |
| 26 | oriTax | 原币税额 | oriTax | number |
| 27 | taxRate | 税率 | taxRate | number |
| 28 | group_number | 组号 | group_number | int |
| 29 | sourceOrderlineno | 来源订单行号 | sourceOrderlineno | number |
| 30 | firstuplineno | 源头单据行号 | firstuplineno | number |
| 31 | uplineno | 来源单据行号 | uplineno | number |
| 32 | retailUnitPrice | 零售单价 | retailUnitPrice | number |
| 33 | retailMoney | 零售金额 | retailMoney | number |
| 34 | invExchRateDen | 换算率分母 | invexchrateden | number |
| 35 | invExchRateNum | 换算率分子 | invexchratenum | number |
| 36 | relatedMorphInCount | 同组入库明细行个数 | related_morphin_count | int |
| 37 | triggerSourceLineno | 触发单据行号 | triggersourcelineno | number |
| 38 | writeOffQtyTotal | 累计冲销数量 | write_off_qty_total | number |

---

## Date Fields (4)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | returnDate | 预计归还日期 | return_date | date |
| 2 | producedate | 生产日期 | dProduceDate | date |
| 3 | invaliddate | 有效期至 | dInvalidDate | date |
| 4 | recorddate | 出库日期 | dRecordDate | date |

---

## Child Tables (4)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | othOutRecordsSNs | 其他出库单序列号 | st.othoutrecord.OthOutRecordsSN |
| 2 | bodyItem | 其他出库单子表自定义项 | st.othoutrecord.OthOutRecordsCustomItem |
| 3 | bodyParallel | 其他出库单子表平行表 | st.othoutrecord.OthOutRecordsParallel |
| 4 | defines | 其他出库单子表自由自定义项 | st.othoutrecord.OthOutRecordsDefine |
