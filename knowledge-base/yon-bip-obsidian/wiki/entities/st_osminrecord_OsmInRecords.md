---
tags: [BIP, metadata, st, OsmInRecords]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 委外入库单子表 (st.osminrecord.OsmInRecords)

> Platform: BIP V5 | Module: st | Table: st_osminrecords | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 委外入库单子表 |
| uri | st.osminrecord.OsmInRecords |
| tableName | st_osminrecords |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | st.voucher.UstockVouchLine |
| isBusinessObject | true |
| description | 委外入库单子表 |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (26)

| # | Name | URI |
|---|------|-----|
| 1 | 换算比 (IUOMExchRate) | gscm.itf.IUOMExchRate |
| 2 | 计价换算比 (IUOMPriceExchRate) | gscm.itf.IUOMPriceExchRate |
| 3 | 规格 (FreeItem) | base.itf.FreeItem |
| 4 | 计量单位信息 (IUOMInfo) | voucher.base.IUOMInfo |
| 5 | 原币金额信息 (IOriMoneyInfo) | voucher.base.IOriMoneyInfo |
| 6 | 本币金额信息 (INatMoneyInfo) | voucher.base.INatMoneyInfo |
| 7 | 最高限价控制 (IMaxPriceLimitControl) | st.voucher.IMaxPriceLimitControl |
| 8 | 生单回写 (IBackWrite) | base.itf.IBackWrite |
| 9 | 往来（应收应付）账户 (IContactsAccount) | voucher.base.IContactsAccount |
| 10 | 库存成本信息 (ICostMoneyInfo) | voucher.base.ICostMoneyInfo |
| 11 | 计价单位信息 (IUOMPriceInfo) | voucher.base.IUOMPriceInfo |
| 12 | 是否 (IUnitExchangeType) | pub.uom.IUnitExchangeType |
| 13 | 库存接口 (IInventory) | st.internaltransaction.IInventory |
| 14 | 源头单据信息 (IFirstSourceData) | st.voucher.IFirstSourceData |
| 15 | 库存状态接口 (IStockStatus) | st.stockStatusRecord.IStockStatus |
| 16 | 预留对象相关 (IReservationID) | st.reservation.IReservationID |
| 17 | 后端自动行号接口 (ILineNo) | base.itf.ILineNo |
| 18 | 上游单据行号 (IUpLinenNO) | st.uplineno.IUpLinenNO |
| 19 | 源头单据行号 (FirstupLinenNO) | st.uplineno.FirstupLinenNO |
| 20 | 来源订单行号 (SourceOrderLinenNO) | st.uplineno.SourceOrderLinenNO |
| 21 | 特征适配相关信息 (CharacterInfo) | gscm.itf.CharacterInfo |
| 22 | 租户相关 (ITenant) | base.itf.ITenant |
| 23 | 库存类型对象 (IStockType) | st.stocktype.IStockType |
| 24 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 25 | 项目结构属性 (projectStructureProperties) | BGDM.wbs.projectStructureProperties |
| 26 | 跟踪线索MTO销售订单 (ReservationMtoSalesOrder) | st.inventoryaccounting.ReservationMtoSalesOrder |

---

## All Fields (205)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | byProLineNum | 对应副产品行数 | by_pro_line_num | int | Integer |  |  | nullable |
| 2 | collaborationRecnc | 协同对账 | collaborationRecnc | switch | Boolean |  |  | nullable |
| 3 | oriCostMoney | 原币成本金额 | ori_cost_money | number | Decimal |  |  | nullable |
| 4 | oriCostUnitPrice | 原币成本单价 | ori_cost_unit_price | number | Decimal |  |  | nullable |
| 5 | productAuth | 物料权限 | iProductid | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 6 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable |
| 7 | productskun | 默认SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | nullable |
| 8 | recncStatus | 对账状态 | recncStatus | singleOption | String |  |  | nullable |
| 9 | srcOrderGrandLineNo | 来源订单联副产品行 | src_order_grand_line_no | number | Decimal |  |  | nullable |
| 10 | upGrandLineNo | 来源单据联副产品行 | up_grand_line_no | number | Decimal |  |  | nullable |
| 11 | allTotalInternalNatMoney | 累计内部结算金额本币 | fAllTotalInternalNatMoney | number | Decimal |  |  |  |
| 12 | allTotalInternalOriMoney | 累计内部结算金额原币 | fAllTotalInternalOriMoney | number | Decimal |  |  |  |
| 13 | allTotalInternalQty | 累计待内部结算数量 | fAllTotalInternalQty | number | Decimal |  |  |  |
| 14 | allTotalInternalUnit | 累计内部结算数量主计量 | fAllTotalInternalUnit | number | Decimal |  |  |  |
| 15 | project_code | 项目编码 | cProjectCode | text | String |  |  | nullable |
| 16 | product | 物料 | iProductid | quote | pc.aa.Product |  |  | data_auth,nullable,dataPowerFlag |
| 17 | productsku | 默认SKUID | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable |
| 18 | hasPaymentPlan | 是否有随单付款计划 | has_payment_plan | switch | Boolean |  |  | nullable |
| 19 | unDeductTax | 本币不可抵扣税额 | unDeductTax | number | Decimal |  |  | nullable |
| 20 | oriUnDeductTax | 原币不可抵扣税额 | oriUnDeductTax | number | Decimal |  |  | nullable |
| 21 | unDeductTaxRate | 不可抵扣税率 | unDeductTaxRate | number | Decimal |  |  | nullable |
| 22 | opSn | 工序顺序号 | op_sn | number | Decimal |  |  | nullable |
| 23 | operationId | 工序 | operation_id | quote | ed.operation.Operation |  |  | nullable |
| 24 | endOp | 末序 | end_op | switch | Boolean |  |  | nullable |
| 25 | sourcePoOrderCode | 生产订单号 | source_po_order_code | text | String |  |  | nullable |
| 26 | sourcePoOrderProductRowno | 生产订单行号 | source_po_order_product_rowno | text | String |  |  | nullable |
| 27 | sourcePoOrderId | 生产产订单ID | source_po_order_id | long | Long |  |  | nullable |
| 28 | sourcePoOrderProductId | 生产订单行ID | source_po_order_product_id | long | Long |  |  | nullable |
| 29 | sourcePoOrderProcessId | 来源生产订单工序 | source_po_order_process_id | long | Long |  |  | nullable |
| 30 | sourceSfcProcPlanId | 来源工序作业计划 | source_sfc_proc_plan_id | long | Long |  |  | nullable |
| 31 | sourcePoOrderByproductId | 生产订单产出ID | source_po_order_byproduct_id | long | Long |  |  | nullable |
| 32 | continuousOsm | 连续委外 | continuous_osm | switch | Boolean |  |  | nullable |
| 33 | startOpSn | 开始工序顺序号 | start_op_sn | number | Decimal |  |  | nullable |
| 34 | endOpSn | 结束工序顺序号 | end_op_sn | number | Decimal |  |  | nullable |
| 35 | continuousOsmDealWay | 连续委外处理方式 | continuous_osm_deal_way | int | Integer |  |  | nullable |
| 36 | isContinuousOsmEnd | 是否连续委外最后一道工序 | is_continuous_osm_end | switch | Boolean |  |  | nullable |
| 37 | continuousGroup | 连续委外组号 | continuous_group | text | String |  |  | nullable |
| 38 | processRptPoint | 工序委外产品报告点 | process_rpt_point | int | Integer |  |  | nullable |
| 39 | mtoSalesOrderCode | MTO销售订单单据号 | mtoSalesOrderCode | text | String |  |  | nullable |
| 40 | mtoSalesOrderId | MTO销售订单主表id | mtoSalesOrderId | long | Long |  |  | nullable |
| 41 | mtoSalesOrderLineId | MTO销售订单行id | mtoSalesOrderLineId | long | Long |  |  | nullable |
| 42 | mtoSalesOrderLineNo | MTO销售订单行号 | mtoSalesOrderLineNo | number | Decimal |  |  | nullable |
| 43 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 44 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 45 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 46 | collaborationPocode | 协同来源单据编码 | collaboration_pocode | text | String |  |  | isRedundant,nullable |
| 47 | collaborationPodetailid | 协同来源单据行 | collaboration_podetailid | long | Long |  |  | isRedundant,nullable |
| 48 | collaborationPoid | 协同来源单据主表id | collaboration_poid | long | Long |  |  | isRedundant,nullable |
| 49 | collaborationSource | 协同来源单据类型 | collaboration_source | text | String |  |  | isRedundant,nullable |
| 50 | discountTaxType | 扣税类别 | discountTaxType | text | String |  |  | nullable |
| 51 | groupTaskKey | 分组任务KEY | groupTaskKey | text | String |  |  | nullable,reportHide |
| 52 | incomingQuantity | 累计入库数量 | incoming_quantity | number | Decimal |  |  | isRedundant,nullable |
| 53 | insresSourceId | 质检结果上游id | insresSourceId | text | String |  |  | nullable |
| 54 | isNotInvoice | 不开票 | isNotInvoice | switch | Boolean |  |  | nullable |
| 55 | isVerification | 核销标识 | is_verification | int | Integer |  |  | nullable |
| 56 | makeproduct | 制造部门使用的物料id | make_product | long | Long |  |  | nullable |
| 57 | mrpQuantity | 净算量 | mrp_quantity | number | Decimal |  |  | isRedundant,nullable |
| 58 | osmInRecordsDefineCharacter | 自定义项特征属性组 | osmInRecordsDefineCharacter | UserDefine | st.osminrecord.OsmInRecordsDefineCharacter |  |  | nullable |
| 59 | partyResponsible | 责任方 | partyResponsible | text | String |  |  | nullable |
| 60 | poRowno | 订单行号 | po_rowno | text | String |  |  | nullable |
| 61 | priceWhitTaxFlag | 价格含税 | price_whit_tax_flag | switch | Boolean |  |  | nullable |
| 62 | qmsResultId | 质检结果id | qmsResultId | text | String |  |  | nullable |
| 63 | recvMaterOutQty | 累计领料单数 | iRecMaterOutQty | int | Integer |  |  | nullable |
| 64 | sourceGrandchildrenId | 上游单据孙表id | source_grandchildrenId | long | Long |  |  | nullable |
| 65 | sourceMainPubts | 时间戳 | sourceMainPubts | timestamp | Timestamp |  |  | nullable,reportHide |
| 66 | sourceRowno | 上游单据行号 | source_rowno | text | String |  |  | nullable |
| 67 | stockSensClue | 现存量特征敏感线索 | stockSensClue | text | String |  |  | nullable |
| 68 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 69 | totalOutStockQuantity | 累计出库数量 | fOutStockQuantity | number | Decimal |  |  | isRedundant,nullable |
| 70 | totalOutStockSubQty | 累计出库件数 | fTotalOutStockSubQty | number | Decimal |  |  | isRedundant,nullable |
| 71 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 72 | isScrap | 是否废品 | isScrap | switch | Boolean |  |  | nullable |
| 73 | mainid | 主表id | iMainId | quote | st.osminrecord.OsmInRecord |  |  | nullable |
| 74 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 75 | rowno | 行号 | rowno | int | Integer |  |  | isCode,nullable |
| 76 | productionType | 产出类型 | production_type | int | Integer |  |  | nullable |
| 77 | osmType | 委外类型 | osm_type | int | Integer |  |  | nullable |
| 78 | productDesc | 物料描述 | productDesc | text | String |  |  | isRedundant,nullable |
| 79 | establishedCardQty | 已建卡数量 | fEstablishedCardQty | number | Decimal |  |  | isRedundant,nullable |
| 80 | osmInRecordsCharacteristics | 自由项特征组 | osmInRecordsCharacteristics | FreeCT | st.osminrecord.OsmInRecordsCharacteristics |  |  | nullable |
| 81 | free1 | 颜色 | free1 | text | String |  |  | isGlobalization,nullable |
| 82 | free2 | 测试3 | free2 | text | String |  |  | isGlobalization,nullable |
| 83 | free3 | 定量测试 | free3 | text | String |  |  | isGlobalization,nullable |
| 84 | free4 | 香雪产地 | free4 | text | String |  |  | isGlobalization,nullable |
| 85 | free5 | 物料规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 86 | free6 | 物料规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 87 | free7 | 物料规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 88 | free8 | 物料规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 89 | free9 | 物料规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 90 | free10 | 物料规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 91 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 92 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 93 | invaliddate | 有效期至 | dInvalidDate | date | Date |  |  | nullable |
| 94 | qty | 数量 | qty | number | Decimal |  |  | nullable |
| 95 | unit | 单位id | iUnitId | quote | pc.unit.Unit |  |  | nullable |
| 96 | invExchRate | 库存换算率 | invExchRate | number | Decimal |  |  | nullable |
| 97 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int | Integer |  |  |  |
| 98 | subQty | 件数 | subQty | number | Decimal |  |  | nullable |
| 99 | stockUnitId | 库存单位id | stock_unit_id | quote | pc.unit.Unit |  |  | nullable |
| 100 | goodsposition | 货位id | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 101 | reserveid | 预留对象id | reserveid | quote | st.reservation.Reservation |  |  | nullable |
| 102 | stockStatusDoc | 库存状态id | stockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 103 | contactsQuantity | 应收数量 | contacts_quantity | number | Decimal |  |  |  |
| 104 | contactsPieces | 应收件数 | contacts_pieces | number | Decimal |  |  |  |
| 105 | unitExchangeTypePrice | 计价换算率换算方式 | unitExchangeTypePrice | int | Integer |  |  |  |
| 106 | priceQty | 计价数量 | priceQty | number | Decimal |  |  | nullable |
| 107 | invPriceExchRate | 计价换算率 | invPriceExchRate | number | Decimal |  |  | nullable |
| 108 | priceUOM | 计价单位id | oPriceUOM | quote | pc.unit.Unit |  |  | nullable |
| 109 | isGiftProduct | 赠品 | isGiftProduct | switch | Boolean |  |  | nullable |
| 110 | oriUnitPrice | 无税单价 | oriUnitPrice | number | Decimal |  |  |  |
| 111 | oriTaxUnitPrice | 含税单价 | oriTaxUnitPrice | number | Decimal |  |  |  |
| 112 | oriMoney | 无税金额 | oriMoney | number | Decimal |  |  |  |
| 113 | oriSum | 含税金额 | oriSum | number | Decimal |  |  |  |
| 114 | oriTax | 税额 | oriTax | number | Decimal |  |  |  |
| 115 | taxRate | 税率 | taxRate | number | Decimal |  |  |  |
| 116 | taxitems | 税目id | iTaxItems | quote | archive.taxArchives.TaxRateArchive |  |  | nullable |
| 117 | natUnitPrice | 本币无税单价 | natUnitPrice | number | Decimal |  |  |  |
| 118 | natTaxUnitPrice | 本币含税单价 | natTaxUnitPrice | number | Decimal |  |  |  |
| 119 | natMoney | 本币无税金额 | natMoney | number | Decimal |  |  |  |
| 120 | natSum | 本币含税金额 | natSum | number | Decimal |  |  |  |
| 121 | natTax | 本币税额 | natTax | number | Decimal |  |  |  |
| 122 | autoCalcCost | 自动计算成本 | autoCalcCost | switch | Boolean |  |  |  |
| 123 | costMoney | 成本金额 | cost_money | number | Decimal |  |  |  |
| 124 | costUnitPrice | 成本单价 | cost_unit_price | number | Decimal |  |  |  |
| 125 | aprice | 暂估单价 | faprice | number | Decimal |  |  | nullable |
| 126 | amoney | 暂估金额 | famoney | number | Decimal |  |  | nullable |
| 127 | maxLimitPrice | 最高限价 | maxLimitPrice | number | Decimal |  |  | nullable |
| 128 | memo | 备注 | cMemo | text | String |  |  | nullable |
| 129 | totalBillOriSum | 累计开票含税金额 | totalBillOriSum | number | Decimal |  |  | nullable |
| 130 | totalBillNatSum | 累计开票本币含税金额 | totalBillNatSum | number | Decimal |  |  | nullable |
| 131 | billSubQty | 累计开票件数 | fbillSubQty | number | Decimal |  |  | nullable |
| 132 | billqty | 累计开票数量 | fbillqty | number | Decimal |  |  | nullable |
| 133 | sqty | 累计结算数量 | fsqty | number | Decimal |  |  | nullable |
| 134 | smoney | 累计结算金额 | fsmoney | number | Decimal |  |  | nullable |
| 135 | sfee | 累计结算费用 | fsfee | number | Decimal |  |  | nullable |
| 136 | sumamoney | 累积结算暂估金额 | fsumamoney | number | Decimal |  |  | nullable |
| 137 | sdate | 结算日期 | dsdate | date | Date |  |  | nullable |
| 138 | recorddate | 入库日期 | dRecordDate | date | Date |  |  | nullable |
| 139 | project | 项目id | iProject | quote | bd.project.ProjectVO |  |  | dataPowerFlag,data_auth,nullable |
| 140 | makeRuleCode | 生单规则编号 | makerule_code | text | String |  |  | nullable,reportHide |
| 141 | sourceid | 上游单据主表id | sourceid | long | Long |  |  | nullable |
| 142 | sourceautoid | 上游单据子表id | sourceautoid | long | Long |  |  | nullable |
| 143 | poid | 来源单据 | poid | quote | osm.OSMOrder.OSMOrder |  |  | nullable |
| 144 | podetailid | 来源单据行 | podetailid | quote | osm.OSMOrder.OSMSubcontractProduct |  |  | nullable |
| 145 | uplineno | 来源单据行号 | uplineno | number | Decimal |  |  | nullable |
| 146 | firstsourceid | 源头单据主表id | firstsourceid | long | Long |  |  | nullable |
| 147 | sourceOrderlineno | 来源订单行号 | sourceOrderlineno | number | Decimal |  |  | nullable |
| 148 | firstsourceautoid | 源头单据子表id | firstsourceautoid | long | Long |  |  | nullable |
| 149 | firstuplineno | 源头单据行号 | firstuplineno | number | Decimal |  |  | nullable |
| 150 | source | 上游单据类型 | source | text | String |  |  | nullable,reportHide |
| 151 | upcode | 上游单据号 | upcode | text | String |  |  | nullable |
| 152 | firstsource | 源头单据类型 | firstsource | text | String |  |  | nullable |
| 153 | pocode | 委外订单编码 | pocode | text | String |  |  | nullable |
| 154 | firstupcode | 源头单据号 | firstupcode | text | String |  |  | nullable |
| 155 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 156 | stockType | 库存类型ID | stockType | quote | st.stocktype.StockType |  |  | nullable |
| 157 | bodyItem | 委外入库单子表自定义项 | - | - | st.osminrecord.OsmInRecordsCustomItem |  |  |  |
| 158 | bodyParallel | 委外入库单子表平行表 | - | - | st.osminrecord.OsmInRecordsParallel |  |  |  |
| 159 | define1 | 自定义项1 | define1 | text | String |  |  | isGlobalization,nullable |
| 160 | define10 | 自定义项10 | define10 | text | String |  |  | isGlobalization,nullable |
| 161 | define11 | 自定义项11 | define11 | text | String |  |  | isGlobalization,nullable |
| 162 | define12 | 自定义项12 | define12 | text | String |  |  | isGlobalization,nullable |
| 163 | define13 | 自定义项13 | define13 | text | String |  |  | isGlobalization,nullable |
| 164 | define14 | 自定义项14 | define14 | text | String |  |  | isGlobalization,nullable |
| 165 | define15 | 自定义项15 | define15 | text | String |  |  | isGlobalization,nullable |
| 166 | define16 | 自定义项16 | define16 | text | String |  |  | isGlobalization,nullable |
| 167 | define17 | 自定义项17 | define17 | text | String |  |  | isGlobalization,nullable |
| 168 | define18 | 自定义项18 | define18 | text | String |  |  | isGlobalization,nullable |
| 169 | define19 | 自定义项19 | define19 | text | String |  |  | isGlobalization,nullable |
| 170 | define2 | 自定义项2 | define2 | text | String |  |  | isGlobalization,nullable |
| 171 | define20 | 自定义项20 | define20 | text | String |  |  | isGlobalization,nullable |
| 172 | define21 | 自定义项21 | define21 | text | String |  |  | isGlobalization,nullable |
| 173 | define22 | 自定义项22 | define22 | text | String |  |  | isGlobalization,nullable |
| 174 | define23 | 自定义项23 | define23 | text | String |  |  | isGlobalization,nullable |
| 175 | define24 | 自定义项24 | define24 | text | String |  |  | isGlobalization,nullable |
| 176 | define25 | 自定义项25 | define25 | text | String |  |  | isGlobalization,nullable |
| 177 | define26 | 自定义项26 | define26 | text | String |  |  | isGlobalization,nullable |
| 178 | define27 | 自定义项27 | define27 | text | String |  |  | isGlobalization,nullable |
| 179 | define28 | 自定义项28 | define28 | text | String |  |  | isGlobalization,nullable |
| 180 | define29 | 自定义项29 | define29 | text | String |  |  | isGlobalization,nullable |
| 181 | define3 | 自定义项3 | define3 | text | String |  |  | isGlobalization,nullable |
| 182 | define30 | 自定义项30 | define30 | text | String |  |  | isGlobalization,nullable |
| 183 | define4 | 自定义项4 | define4 | text | String |  |  | isGlobalization,nullable |
| 184 | define5 | 自定义项5 | define5 | text | String |  |  | isGlobalization,nullable |
| 185 | define6 | 自定义项6 | define6 | text | String |  |  | isGlobalization,nullable |
| 186 | define7 | 自定义项7 | define7 | text | String |  |  | isGlobalization,nullable |
| 187 | define8 | 自定义项8 | define8 | text | String |  |  | isGlobalization,nullable |
| 188 | define9 | 自定义项9 | define9 | text | String |  |  | isGlobalization,nullable |
| 189 | defines | 委外入库单子表自由自定义项 | - | - | st.osminrecord.OsmInRecordsDefine |  |  |  |
| 190 | expenseNatMoney | 费用本币无税金额 | expense_nat_money | number | Decimal |  |  | nullable |
| 191 | expenseNatSum | 费用本币含税金额 | expense_nat_sum | number | Decimal |  |  | nullable |
| 192 | expenseOriMoney | 费用无税金额 | expense_ori_money | number | Decimal |  |  | nullable |
| 193 | expenseOriSum | 费用含税金额 | expense_ori_sum | number | Decimal |  |  | nullable |
| 194 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 195 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 196 | invPriceExchRateDen | 计价换算率分母 | invpriceexchrateden | number | Decimal |  |  | nullable |
| 197 | invPriceExchRateNum | 计价换算率分子 | invpriceexchratenum | number | Decimal |  |  | nullable |
| 198 | osmInRecordsSNs | 委外入库单序列号 | - | - | st.osminrecord.OsmInRecordsSN |  |  |  |
| 199 | paymentExeDetail | 付款执行明细孙表(新架构) | - | - | st.osminrecord.PaymentExeDetail |  |  |  |
| 200 | reverseInvoiceQty | 累计发票红冲数量 | reverseInvoiceQty | number | Decimal |  |  | nullable |
| 201 | writeOffQtyTotal | 累计冲销数量 | write_off_qty_total | number | Decimal |  |  | nullable |
| 202 | writeOffSourceautoid | 冲销线索子表id | write_off_sourceautoid | long | Long |  |  | nullable |
| 203 | writeOffSourceid | 冲销线索主表id | write_off_sourceid | long | Long |  |  | nullable |
| 204 | writeOffUpcode | 冲销单据号 | write_off_upcode | text | String |  |  | nullable |
| 205 | writeOffUplineno | 冲销单据行号 | write_off_uplineno | number | Decimal |  |  | nullable |

---

## Reference Fields (22)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | productAuth | 物料权限 | iProductid | pb.dataauth.ProductDataAuth |
| 2 | productn | 物料 | iProductid | pc.product.Product |
| 3 | productskun | 默认SKUID | iProductSkuid | pc.product.ProductSKU |
| 4 | product | 物料 | iProductid | pc.aa.Product |
| 5 | productsku | 默认SKUID | iProductSkuid | pc.aa.ProductSKU |
| 6 | operationId | 工序 | operation_id | ed.operation.Operation |
| 7 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 8 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 9 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 10 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 11 | mainid | 主表id | iMainId | st.osminrecord.OsmInRecord |
| 12 | unit | 单位id | iUnitId | pc.unit.Unit |
| 13 | stockUnitId | 库存单位id | stock_unit_id | pc.unit.Unit |
| 14 | goodsposition | 货位id | iGoodsPositionId | aa.goodsposition.GoodsPosition |
| 15 | reserveid | 预留对象id | reserveid | st.reservation.Reservation |
| 16 | stockStatusDoc | 库存状态id | stockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 17 | priceUOM | 计价单位id | oPriceUOM | pc.unit.Unit |
| 18 | taxitems | 税目id | iTaxItems | archive.taxArchives.TaxRateArchive |
| 19 | project | 项目id | iProject | bd.project.ProjectVO |
| 20 | poid | 来源单据 | poid | osm.OSMOrder.OSMOrder |
| 21 | podetailid | 来源单据行 | podetailid | osm.OSMOrder.OSMSubcontractProduct |
| 22 | stockType | 库存类型ID | stockType | st.stocktype.StockType |

---

## Enum Fields (1)

| # | name | displayName | columnName | enumType |
|---|------|-------------|------------|----------|
| 1 | recncStatus | 对账状态 | recncStatus | String |

---

## Number Fields (76)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | byProLineNum | 对应副产品行数 | by_pro_line_num | int |
| 2 | oriCostMoney | 原币成本金额 | ori_cost_money | number |
| 3 | oriCostUnitPrice | 原币成本单价 | ori_cost_unit_price | number |
| 4 | srcOrderGrandLineNo | 来源订单联副产品行 | src_order_grand_line_no | number |
| 5 | upGrandLineNo | 来源单据联副产品行 | up_grand_line_no | number |
| 6 | allTotalInternalNatMoney | 累计内部结算金额本币 | fAllTotalInternalNatMoney | number |
| 7 | allTotalInternalOriMoney | 累计内部结算金额原币 | fAllTotalInternalOriMoney | number |
| 8 | allTotalInternalQty | 累计待内部结算数量 | fAllTotalInternalQty | number |
| 9 | allTotalInternalUnit | 累计内部结算数量主计量 | fAllTotalInternalUnit | number |
| 10 | unDeductTax | 本币不可抵扣税额 | unDeductTax | number |
| 11 | oriUnDeductTax | 原币不可抵扣税额 | oriUnDeductTax | number |
| 12 | unDeductTaxRate | 不可抵扣税率 | unDeductTaxRate | number |
| 13 | opSn | 工序顺序号 | op_sn | number |
| 14 | startOpSn | 开始工序顺序号 | start_op_sn | number |
| 15 | endOpSn | 结束工序顺序号 | end_op_sn | number |
| 16 | continuousOsmDealWay | 连续委外处理方式 | continuous_osm_deal_way | int |
| 17 | processRptPoint | 工序委外产品报告点 | process_rpt_point | int |
| 18 | mtoSalesOrderLineNo | MTO销售订单行号 | mtoSalesOrderLineNo | number |
| 19 | incomingQuantity | 累计入库数量 | incoming_quantity | number |
| 20 | isVerification | 核销标识 | is_verification | int |
| 21 | mrpQuantity | 净算量 | mrp_quantity | number |
| 22 | recvMaterOutQty | 累计领料单数 | iRecMaterOutQty | int |
| 23 | totalOutStockQuantity | 累计出库数量 | fOutStockQuantity | number |
| 24 | totalOutStockSubQty | 累计出库件数 | fTotalOutStockSubQty | number |
| 25 | lineno | 行号 | lineno | number |
| 26 | rowno | 行号 | rowno | int |
| 27 | productionType | 产出类型 | production_type | int |
| 28 | osmType | 委外类型 | osm_type | int |
| 29 | establishedCardQty | 已建卡数量 | fEstablishedCardQty | number |
| 30 | qty | 数量 | qty | number |
| 31 | invExchRate | 库存换算率 | invExchRate | number |
| 32 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int |
| 33 | subQty | 件数 | subQty | number |
| 34 | contactsQuantity | 应收数量 | contacts_quantity | number |
| 35 | contactsPieces | 应收件数 | contacts_pieces | number |
| 36 | unitExchangeTypePrice | 计价换算率换算方式 | unitExchangeTypePrice | int |
| 37 | priceQty | 计价数量 | priceQty | number |
| 38 | invPriceExchRate | 计价换算率 | invPriceExchRate | number |
| 39 | oriUnitPrice | 无税单价 | oriUnitPrice | number |
| 40 | oriTaxUnitPrice | 含税单价 | oriTaxUnitPrice | number |
| 41 | oriMoney | 无税金额 | oriMoney | number |
| 42 | oriSum | 含税金额 | oriSum | number |
| 43 | oriTax | 税额 | oriTax | number |
| 44 | taxRate | 税率 | taxRate | number |
| 45 | natUnitPrice | 本币无税单价 | natUnitPrice | number |
| 46 | natTaxUnitPrice | 本币含税单价 | natTaxUnitPrice | number |
| 47 | natMoney | 本币无税金额 | natMoney | number |
| 48 | natSum | 本币含税金额 | natSum | number |
| 49 | natTax | 本币税额 | natTax | number |
| 50 | costMoney | 成本金额 | cost_money | number |
| 51 | costUnitPrice | 成本单价 | cost_unit_price | number |
| 52 | aprice | 暂估单价 | faprice | number |
| 53 | amoney | 暂估金额 | famoney | number |
| 54 | maxLimitPrice | 最高限价 | maxLimitPrice | number |
| 55 | totalBillOriSum | 累计开票含税金额 | totalBillOriSum | number |
| 56 | totalBillNatSum | 累计开票本币含税金额 | totalBillNatSum | number |
| 57 | billSubQty | 累计开票件数 | fbillSubQty | number |
| 58 | billqty | 累计开票数量 | fbillqty | number |
| 59 | sqty | 累计结算数量 | fsqty | number |
| 60 | smoney | 累计结算金额 | fsmoney | number |
| 61 | sfee | 累计结算费用 | fsfee | number |
| 62 | sumamoney | 累积结算暂估金额 | fsumamoney | number |
| 63 | uplineno | 来源单据行号 | uplineno | number |
| 64 | sourceOrderlineno | 来源订单行号 | sourceOrderlineno | number |
| 65 | firstuplineno | 源头单据行号 | firstuplineno | number |
| 66 | expenseNatMoney | 费用本币无税金额 | expense_nat_money | number |
| 67 | expenseNatSum | 费用本币含税金额 | expense_nat_sum | number |
| 68 | expenseOriMoney | 费用无税金额 | expense_ori_money | number |
| 69 | expenseOriSum | 费用含税金额 | expense_ori_sum | number |
| 70 | invExchRateDen | 换算率分母 | invexchrateden | number |
| 71 | invExchRateNum | 换算率分子 | invexchratenum | number |
| 72 | invPriceExchRateDen | 计价换算率分母 | invpriceexchrateden | number |
| 73 | invPriceExchRateNum | 计价换算率分子 | invpriceexchratenum | number |
| 74 | reverseInvoiceQty | 累计发票红冲数量 | reverseInvoiceQty | number |
| 75 | writeOffQtyTotal | 累计冲销数量 | write_off_qty_total | number |
| 76 | writeOffUplineno | 冲销单据行号 | write_off_uplineno | number |

---

## Date Fields (4)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | producedate | 生产日期 | dProduceDate | date |
| 2 | invaliddate | 有效期至 | dInvalidDate | date |
| 3 | sdate | 结算日期 | dsdate | date |
| 4 | recorddate | 入库日期 | dRecordDate | date |

---

## Child Tables (5)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | bodyItem | 委外入库单子表自定义项 | st.osminrecord.OsmInRecordsCustomItem |
| 2 | paymentExeDetail | 付款执行明细孙表(新架构) | st.osminrecord.PaymentExeDetail |
| 3 | bodyParallel | 委外入库单子表平行表 | st.osminrecord.OsmInRecordsParallel |
| 4 | osmInRecordsSNs | 委外入库单序列号 | st.osminrecord.OsmInRecordsSN |
| 5 | defines | 委外入库单子表自由自定义项 | st.osminrecord.OsmInRecordsDefine |

---

## Enum Value Details
