---
tags: [BIP, metadata, st, StoreProRecords]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 产品入库子表 (st.storeprorecord.StoreProRecords)

> Platform: BIP V5 | Module: st | Table: st_storeprorecords | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 产品入库子表 |
| uri | st.storeprorecord.StoreProRecords |
| tableName | st_storeprorecords |
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
| 3 | 生单回写 (IBackWrite) | base.itf.IBackWrite |
| 4 | 原币金额信息 (IOriMoneyInfo) | voucher.base.IOriMoneyInfo |
| 5 | 本币金额信息 (INatMoneyInfo) | voucher.base.INatMoneyInfo |
| 6 | 计量单位信息 (IUOMInfo) | voucher.base.IUOMInfo |
| 7 | 材料出和产品入公共体 (IMODetailCommon) | st.materialout.IMODetailCommon |
| 8 | 成本核算单价金额接口 (INatPriceMoney) | voucher.base.INatPriceMoney |
| 9 | 往来（应收应付）账户 (IContactsAccount) | voucher.base.IContactsAccount |
| 10 | 库存成本信息 (ICostMoneyInfo) | voucher.base.ICostMoneyInfo |
| 11 | 源头单据信息 (IFirstSourceData) | st.voucher.IFirstSourceData |
| 12 | 库存接口 (IInventory) | st.internaltransaction.IInventory |
| 13 | 生产订单信息 (IManufactureOrderInfo) | st.storeprorecord.IManufactureOrderInfo |
| 14 | 库存状态接口 (IStockStatus) | st.stockStatusRecord.IStockStatus |
| 15 | 预留对象相关 (IReservationID) | st.reservation.IReservationID |
| 16 | 后端自动行号接口 (ILineNo) | base.itf.ILineNo |
| 17 | 上游单据行号 (IUpLinenNO) | st.uplineno.IUpLinenNO |
| 18 | 源头单据行号 (FirstupLinenNO) | st.uplineno.FirstupLinenNO |
| 19 | 来源订单行号 (SourceOrderLinenNO) | st.uplineno.SourceOrderLinenNO |
| 20 | 特征适配相关信息 (CharacterInfo) | gscm.itf.CharacterInfo |
| 21 | 租户相关 (ITenant) | base.itf.ITenant |
| 22 | 库存类型对象 (IStockType) | st.stocktype.IStockType |
| 23 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 24 | 制造多来源信息 (IBizDocInfo) | st.storeprorecord.IBizDocInfo |
| 25 | 跟踪线索MTO销售订单 (ReservationMtoSalesOrder) | st.inventoryaccounting.ReservationMtoSalesOrder |
| 26 | 项目结构属性 (projectStructureProperties) | BGDM.wbs.projectStructureProperties |
| 27 | 外部来源行线索 (IOutSysObjLineClue) | base.itf.IOutSysObjLineClue |

---

## All Fields (147)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | allTotalInternalNatMoney | 累计内部结算金额本币 | fAllTotalInternalNatMoney | number | Decimal |  |  |  |
| 2 | allTotalInternalOriMoney | 累计内部结算金额原币 | fAllTotalInternalOriMoney | number | Decimal |  |  |  |
| 3 | allTotalInternalQty | 累计待内部结算数量 | fAllTotalInternalQty | number | Decimal |  |  |  |
| 4 | allTotalInternalUnit | 累计内部结算数量主计量 | fAllTotalInternalUnit | number | Decimal |  |  |  |
| 5 | autoCalcCost | 自动计算成本 | autoCalcCost | switch | Boolean |  |  |  |
| 6 | firstsource | 源头单据类型 | firstsource | text | String |  |  | nullable |
| 7 | firstsourceautoid | 源头单据子表id | firstsourceautoid | long | Long |  |  | nullable |
| 8 | firstsourceid | 源头单据主表id | firstsourceid | long | Long |  |  | nullable |
| 9 | firstupcode | 源头单据号 | firstupcode | text | String |  |  | nullable |
| 10 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 11 | storeproType | 入库类型 | store_pro_type | text | String |  |  | nullable |
| 12 | mtoSalesOrderCode | MTO销售订单单据号 | mtoSalesOrderCode | text | String |  |  | nullable |
| 13 | operationId | 工序 | operation_id | quote | ed.operation.Operation |  |  | nullable |
| 14 | mtoSalesOrderId | MTO销售订单主表id | mtoSalesOrderId | long | Long |  |  | nullable |
| 15 | processSn | 工序顺序号 | process_sn | number | Decimal |  |  | nullable |
| 16 | mtoSalesOrderLineId | MTO销售订单行id | mtoSalesOrderLineId | long | Long |  |  | nullable |
| 17 | mtoSalesOrderLineNo | MTO销售订单行号 | mtoSalesOrderLineNo | number | Decimal |  |  | nullable |
| 18 | osminrecordAutoid | 委外入库单行id | osminrecord_autoid | long | Long |  |  | nullable |
| 19 | productAuth | 物料权限 | iProductid | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 20 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 21 | out_sys_rowno | 外部来源行号 | out_sys_rowno | text | String |  |  | nullable |
| 22 | out_sys_lineid | 外部来源行 | out_sys_lineid | text | String |  |  | nullable |
| 23 | productskun | 默认SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | nullable |
| 24 | bizDocType | 业务单据类型 | biz_docType | text | String |  |  | nullable |
| 25 | osminrecordId | 委外入库单id | osminrecord_id | long | Long |  |  | nullable |
| 26 | bizDocId | 业务单据id | biz_docId | long | Long |  |  | nullable |
| 27 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 28 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable |
| 29 | groupTaskKey | 分组任务KEY | groupTaskKey | text | String |  |  | nullable,reportHide |
| 30 | insresSourceId | 质检结果上游id | insresSourceId | text | String |  |  | nullable |
| 31 | product | 物料id | iProductid | quote | pc.aa.Product |  |  | data_auth,nullable,dataPowerFlag |
| 32 | materialoutId | 倒冲生成的材料出库单据id | materialoutId | long | Long |  |  | nullable |
| 33 | natSum | 本币含税金额 | natSum | number | Decimal |  |  |  |
| 34 | natTax | 本币税额 | natTax | number | Decimal |  |  |  |
| 35 | natTaxUnitPrice | 本币含税单价 | natTaxUnitPrice | number | Decimal |  |  |  |
| 36 | oriMoney | 原币无税金额 | oriMoney | number | Decimal |  |  |  |
| 37 | oriSum | 原币含税金额 | oriSum | number | Decimal |  |  |  |
| 38 | oriTax | 原币税额 | oriTax | number | Decimal |  |  |  |
| 39 | oriTaxUnitPrice | 原币含税单价 | oriTaxUnitPrice | number | Decimal |  |  |  |
| 40 | oriUnitPrice | 原币无税单价 | oriUnitPrice | number | Decimal |  |  |  |
| 41 | rowno | 序号 | rowno | int | Integer |  |  | isCode,nullable |
| 42 | sourceMainPubts | 时间戳 | sourceMainPubts | timestamp | Timestamp |  |  | nullable,reportHide |
| 43 | stockSensClue | 现存量特征敏感线索 | stockSensClue | text | String |  |  | nullable |
| 44 | storeProRecordsDefineCharacter | 自定义项特征属性组 | storeProRecordsDefineCharacter | UserDefine | st.storeprorecord.StoreProRecordsDefineCharacter |  |  | nullable |
| 45 | taxRate | 税率 | taxRate | number | Decimal |  |  |  |
| 46 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 47 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 48 | isScrap | 是否废品 | isScrap | switch | Boolean |  |  | nullable |
| 49 | makeproduct | 制造的物料id | make_product | long | Long |  |  | nullable |
| 50 | sourceautodate | 来源单据子表时间戳 | sourceautodate | date | Date |  |  | nullable |
| 51 | storeProRecordsCharacteristics | 自由项特征组 | storeProRecordsCharacteristics | FreeCT | st.storeprorecord.StoreProRecordsCharacteristics |  |  | nullable |
| 52 | free1 | 颜色 | free1 | text | String |  |  | isGlobalization,nullable |
| 53 | free2 | 测试3 | free2 | text | String |  |  | isGlobalization,nullable |
| 54 | free3 | 定量测试 | free3 | text | String |  |  | isGlobalization,nullable |
| 55 | free4 | 香雪产地 | free4 | text | String |  |  | isGlobalization,nullable |
| 56 | free5 | 物料规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 57 | free6 | 物料规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 58 | free7 | 物料规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 59 | free8 | 物料规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 60 | free9 | 物料规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 61 | free10 | 物料规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 62 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 63 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 64 | invaliddate | 有效期至 | dInvalidDate | date | Date |  |  | nullable |
| 65 | reserveid | 预留对象id | reserveid | quote | st.reservation.Reservation |  |  | nullable |
| 66 | stockStatusDoc | 库存状态id | stockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 67 | qty | 数量 | qty | number | Decimal |  |  | nullable |
| 68 | unit | 单位id | iUnitId | quote | pc.unit.Unit | Y |  |  |
| 69 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  | nullable |
| 70 | unitExchangeType | 库存单位转换率的换算方式 | unitExchangeType | int | Integer |  |  | nullable |
| 71 | subQty | 件数 | subQty | number | Decimal |  |  | nullable |
| 72 | stockUnitId | 库存单位id | stock_unit_id | quote | pc.unit.Unit | Y |  |  |
| 73 | goodsposition | 货位id | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 74 | costUnitPrice | 单价 | cost_unit_price | number | Decimal |  |  |  |
| 75 | costMoney | 金额 | cost_money | number | Decimal |  |  |  |
| 76 | natUnitPrice | 成本单价 | natUnitPrice | number | Decimal |  |  |  |
| 77 | natMoney | 成本金额 | natMoney | number | Decimal |  |  |  |
| 78 | contactsQuantity | 应收数量 | contacts_quantity | number | Decimal |  |  |  |
| 79 | contactsPieces | 应收件数 | contacts_pieces | number | Decimal |  |  |  |
| 80 | project | 项目id | iProject | quote | bd.project.ProjectVO |  |  | dataPowerFlag,data_auth,nullable |
| 81 | recorddate | 入库日期 | dRecordDate | date | Date |  |  | nullable |
| 82 | memo | 备注 | cMemo | text | String |  |  | nullable |
| 83 | incomingQuantity | 累计入库数量 | incoming_quantity | number | Decimal |  |  | nullable |
| 84 | sourceid | 上游单据主表id | sourceid | long | Long |  |  | nullable |
| 85 | sourceautoid | 上游单据子表id | sourceautoid | long | Long |  |  | nullable |
| 86 | sourceGrandchildrenId | 来源单据孙表id | source_grandchildrenId | long | Long |  |  | nullable |
| 87 | source | 来源单据类型 | source | text | String |  |  | nullable,reportHide |
| 88 | upcode | 来源单据号 | upcode | text | String |  |  | nullable |
| 89 | makeRuleCode | 生单规则编号 | makerule_code | text | String |  |  | nullable,reportHide |
| 90 | mrpQuantity | 净算量 | mrp_quantity | number | Decimal |  |  | nullable |
| 91 | mainid | 主表id | iMainId | quote | st.storeprorecord.StoreProRecord |  |  | nullable |
| 92 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 93 | uplineno | 来源单据行号 | uplineno | number | Decimal |  |  | nullable |
| 94 | sourceOrderlineno | 来源订单行号 | sourceOrderlineno | number | Decimal |  |  | nullable |
| 95 | firstuplineno | 源头单据行号 | firstuplineno | number | Decimal |  |  | nullable |
| 96 | productsku | 商品SKUid | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable |
| 97 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 98 | moid | 生产订单主表id | mo_id | long | Long |  |  | nullable |
| 99 | moautoid | 生产订单子表id | mo_autoid | long | Long |  |  | nullable |
| 100 | mocode | 来源订单号 | mo_code | text | String |  |  | nullable |
| 101 | mograndsonid | 生产订单孙表id | mo_grandsonid | long | Long |  |  | nullable |
| 102 | mosource | 来源订单类型 | mo_source | text | String |  |  | nullable |
| 103 | productionType | 产出类型 | production_type | text | String |  |  | nullable |
| 104 | qmsResultId | 检验结果id | qmsResultId | text | String |  |  | nullable |
| 105 | stockType | 库存类型ID | stockType | quote | st.stocktype.StockType |  |  | nullable |
| 106 | StoreProRecordsSNs | 产品入库单序列号 | - | - | st.storeprorecord.StoreProRecordsSN |  |  |  |
| 107 | bodyItem | 产品入库单子表自定义项 | - | - | st.storeprorecord.StoreProRecordsCustomItem |  |  |  |
| 108 | bodyParallel | 产品入库单子表平行表 | - | - | st.storeprorecord.StoreProRecordsParallel |  |  |  |
| 109 | define1 | 自定义项1 | define1 | text | String |  |  | isGlobalization,nullable |
| 110 | define10 | 自定义项10 | define10 | text | String |  |  | isGlobalization,nullable |
| 111 | define11 | 自定义项11 | define11 | text | String |  |  | isGlobalization,nullable |
| 112 | define12 | 自定义项12 | define12 | text | String |  |  | isGlobalization,nullable |
| 113 | define13 | 自定义项13 | define13 | text | String |  |  | isGlobalization,nullable |
| 114 | define14 | 自定义项14 | define14 | text | String |  |  | isGlobalization,nullable |
| 115 | define15 | 自定义项15 | define15 | text | String |  |  | isGlobalization,nullable |
| 116 | define16 | 自定义项16 | define16 | text | String |  |  | isGlobalization,nullable |
| 117 | define17 | 自定义项17 | define17 | text | String |  |  | isGlobalization,nullable |
| 118 | define18 | 自定义项18 | define18 | text | String |  |  | isGlobalization,nullable |
| 119 | define19 | 自定义项19 | define19 | text | String |  |  | isGlobalization,nullable |
| 120 | define2 | 自定义项2 | define2 | text | String |  |  | isGlobalization,nullable |
| 121 | define20 | 自定义项20 | define20 | text | String |  |  | isGlobalization,nullable |
| 122 | define21 | 自定义项21 | define21 | text | String |  |  | isGlobalization,nullable |
| 123 | define22 | 自定义项22 | define22 | text | String |  |  | isGlobalization,nullable |
| 124 | define23 | 自定义项23 | define23 | text | String |  |  | isGlobalization,nullable |
| 125 | define24 | 自定义项24 | define24 | text | String |  |  | isGlobalization,nullable |
| 126 | define25 | 自定义项25 | define25 | text | String |  |  | isGlobalization,nullable |
| 127 | define26 | 自定义项26 | define26 | text | String |  |  | isGlobalization,nullable |
| 128 | define27 | 自定义项27 | define27 | text | String |  |  | isGlobalization,nullable |
| 129 | define28 | 自定义项28 | define28 | text | String |  |  | isGlobalization,nullable |
| 130 | define29 | 自定义项29 | define29 | text | String |  |  | isGlobalization,nullable |
| 131 | define3 | 自定义项3 | define3 | text | String |  |  | isGlobalization,nullable |
| 132 | define30 | 自定义项30 | define30 | text | String |  |  | isGlobalization,nullable |
| 133 | define4 | 自定义项4 | define4 | text | String |  |  | isGlobalization,nullable |
| 134 | define5 | 自定义项5 | define5 | text | String |  |  | isGlobalization,nullable |
| 135 | define6 | 自定义项6 | define6 | text | String |  |  | isGlobalization,nullable |
| 136 | define7 | 自定义项7 | define7 | text | String |  |  | isGlobalization,nullable |
| 137 | define8 | 自定义项8 | define8 | text | String |  |  | isGlobalization,nullable |
| 138 | define9 | 自定义项9 | define9 | text | String |  |  | isGlobalization,nullable |
| 139 | defines | 产品入库单子表自由自定义项 | - | - | st.storeprorecord.StoreProRecordsDefine |  |  |  |
| 140 | destroySimpleResult | 破坏性检验 | destroySimpleResult | int | Integer |  |  | nullable |
| 141 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 142 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 143 | writeOffQtyTotal | 累计冲销数量 | write_off_qty_total | number | Decimal |  |  | nullable |
| 144 | writeOffSourceautoid | 冲销线索子表id | write_off_sourceautoid | long | Long |  |  | nullable |
| 145 | writeOffSourceid | 冲销线索主表id | write_off_sourceid | long | Long |  |  | nullable |
| 146 | writeOffUpcode | 冲销单据号 | write_off_upcode | text | String |  |  | nullable |
| 147 | writeOffUplineno | 冲销单据行号 | write_off_uplineno | number | Decimal |  |  | nullable |

---

## Reference Fields (18)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 2 | operationId | 工序 | operation_id | ed.operation.Operation |
| 3 | productAuth | 物料权限 | iProductid | pb.dataauth.ProductDataAuth |
| 4 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 5 | productskun | 默认SKUID | iProductSkuid | pc.product.ProductSKU |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 7 | productn | 物料 | iProductid | pc.product.Product |
| 8 | product | 物料id | iProductid | pc.aa.Product |
| 9 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 10 | reserveid | 预留对象id | reserveid | st.reservation.Reservation |
| 11 | stockStatusDoc | 库存状态id | stockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 12 | unit | 单位id | iUnitId | pc.unit.Unit |
| 13 | stockUnitId | 库存单位id | stock_unit_id | pc.unit.Unit |
| 14 | goodsposition | 货位id | iGoodsPositionId | aa.goodsposition.GoodsPosition |
| 15 | project | 项目id | iProject | bd.project.ProjectVO |
| 16 | mainid | 主表id | iMainId | st.storeprorecord.StoreProRecord |
| 17 | productsku | 商品SKUid | iProductSkuid | pc.aa.ProductSKU |
| 18 | stockType | 库存类型ID | stockType | st.stocktype.StockType |

---

## Number Fields (37)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | allTotalInternalNatMoney | 累计内部结算金额本币 | fAllTotalInternalNatMoney | number |
| 2 | allTotalInternalOriMoney | 累计内部结算金额原币 | fAllTotalInternalOriMoney | number |
| 3 | allTotalInternalQty | 累计待内部结算数量 | fAllTotalInternalQty | number |
| 4 | allTotalInternalUnit | 累计内部结算数量主计量 | fAllTotalInternalUnit | number |
| 5 | processSn | 工序顺序号 | process_sn | number |
| 6 | mtoSalesOrderLineNo | MTO销售订单行号 | mtoSalesOrderLineNo | number |
| 7 | natSum | 本币含税金额 | natSum | number |
| 8 | natTax | 本币税额 | natTax | number |
| 9 | natTaxUnitPrice | 本币含税单价 | natTaxUnitPrice | number |
| 10 | oriMoney | 原币无税金额 | oriMoney | number |
| 11 | oriSum | 原币含税金额 | oriSum | number |
| 12 | oriTax | 原币税额 | oriTax | number |
| 13 | oriTaxUnitPrice | 原币含税单价 | oriTaxUnitPrice | number |
| 14 | oriUnitPrice | 原币无税单价 | oriUnitPrice | number |
| 15 | rowno | 序号 | rowno | int |
| 16 | taxRate | 税率 | taxRate | number |
| 17 | lineno | 行号 | lineno | number |
| 18 | qty | 数量 | qty | number |
| 19 | invExchRate | 换算率 | invExchRate | number |
| 20 | unitExchangeType | 库存单位转换率的换算方式 | unitExchangeType | int |
| 21 | subQty | 件数 | subQty | number |
| 22 | costUnitPrice | 单价 | cost_unit_price | number |
| 23 | costMoney | 金额 | cost_money | number |
| 24 | natUnitPrice | 成本单价 | natUnitPrice | number |
| 25 | natMoney | 成本金额 | natMoney | number |
| 26 | contactsQuantity | 应收数量 | contacts_quantity | number |
| 27 | contactsPieces | 应收件数 | contacts_pieces | number |
| 28 | incomingQuantity | 累计入库数量 | incoming_quantity | number |
| 29 | mrpQuantity | 净算量 | mrp_quantity | number |
| 30 | uplineno | 来源单据行号 | uplineno | number |
| 31 | sourceOrderlineno | 来源订单行号 | sourceOrderlineno | number |
| 32 | firstuplineno | 源头单据行号 | firstuplineno | number |
| 33 | destroySimpleResult | 破坏性检验 | destroySimpleResult | int |
| 34 | invExchRateDen | 换算率分母 | invexchrateden | number |
| 35 | invExchRateNum | 换算率分子 | invexchratenum | number |
| 36 | writeOffQtyTotal | 累计冲销数量 | write_off_qty_total | number |
| 37 | writeOffUplineno | 冲销单据行号 | write_off_uplineno | number |

---

## Date Fields (4)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | sourceautodate | 来源单据子表时间戳 | sourceautodate | date |
| 2 | producedate | 生产日期 | dProduceDate | date |
| 3 | invaliddate | 有效期至 | dInvalidDate | date |
| 4 | recorddate | 入库日期 | dRecordDate | date |

---

## Child Tables (4)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | bodyItem | 产品入库单子表自定义项 | st.storeprorecord.StoreProRecordsCustomItem |
| 2 | bodyParallel | 产品入库单子表平行表 | st.storeprorecord.StoreProRecordsParallel |
| 3 | StoreProRecordsSNs | 产品入库单序列号 | st.storeprorecord.StoreProRecordsSN |
| 4 | defines | 产品入库单子表自由自定义项 | st.storeprorecord.StoreProRecordsDefine |
