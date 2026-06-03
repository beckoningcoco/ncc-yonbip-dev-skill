---
tags: [BIP, metadata, voucher, OrderChangeDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 变更单商品表 (voucher.orderchange.OrderChangeDetail)

> Platform: BIP V5 | Module: voucher | Table: orderchangedetail | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 变更单商品表 |
| uri | voucher.orderchange.OrderChangeDetail |
| tableName | orderchangedetail |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | voucher.order.OrderDetail |
| isBusinessObject | true |
| description | 变更单商品表 |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (4)

| # | Name | URI |
|---|------|-----|
| 1 | 源头单据信息 (IFirstSourceData) | sale.aa.IFirstSourceData |
| 2 | 来源单据行号接口 (IUpLineNo) | sale.aa.IUpLineNo |
| 3 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 4 | 项目结构属性 (projectStructureProperties) | BGDM.wbs.projectStructureProperties |

---

## All Fields (326)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | productCode | 商品编码 | cProductCode | text | String |  |  | nullable |
| 2 | productName | 商品名称 | cProductName | text | String |  |  | nullable |
| 3 | productId | 商品id | iProductId | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable,REF.ID |
| 4 | skuCode | sku编码 | cSkuCode | text | String |  |  | nullable |
| 5 | skuId | skuId | iSKUId | quote | pc.product.ProductSKU |  |  | nullable,REF.ID |
| 6 | orderProductType | 商品售卖类型 | cOrderProductType | text | String |  |  | nullable,REF.ID |
| 7 | qtyName | 主计量 | cMasterUnitMeasure | text | String |  |  | nullable |
| 8 | productUnitName | 计价单位 | cProductUnitName | text | String |  |  | nullable |
| 9 | productAuxUnitName | 辅计量单位 | cProductAuxUnitName | text | String |  |  | nullable |
| 10 | subQty | 销售数量 | iAuxUnitQuantity | number | Decimal |  |  | nullable |
| 11 | priceQty | 计价数量 | iQuantity | number | Decimal |  |  | nullable |
| 12 | qty | 数量 | fMasterMeasureQuantity | number | Decimal |  |  | nullable |
| 13 | unitExchangeType | 浮动(计价) | unitExchangeType | int | Integer |  |  | nullable,REF.ID |
| 14 | unitExchangeTypePrice | 浮动(销售) | unitExchangeTypePrice | int | Integer |  |  | nullable,REF.ID |
| 15 | invExchRate | 销售换算率 | fAuxExchangeRate | number | Decimal |  |  | nullable |
| 16 | invPriceExchRate | 计价换算率 | fMainExchangeRate | number | Decimal |  |  | nullable |
| 17 | conversionRate | 主辅换算率 | iConversionRate | number | Decimal |  |  | nullable |
| 18 | iProductAuxUnitId | 销售单位id | iProductAuxUnitId | quote | pc.unit.Unit |  |  | nullable |
| 19 | iProductUnitId | 计价单位id | iProductUnitId | quote | pc.unit.Unit |  |  | nullable |
| 20 | masterUnitId | 主计量单位id | iMasterUnitId | quote | pc.unit.Unit |  |  | nullable |
| 21 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 22 | rowno | 行号 | rowno | int | Integer |  |  | isCode,nullable |
| 23 | settlementOrgId | 开票组织 | iSettlementOrgId | quote | org.func.FinanceOrg |  |  | data_auth,nullable |
| 24 | stockOrgId | 库存组织id | iStockOrgId | quote | org.func.InventoryOrg |  |  | data_auth,nullable |
| 25 | stockName | 仓库名称 | cStockName | text | String |  |  | nullable |
| 26 | stockId | 仓库ID | iStockId | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable,REF.ID |
| 27 | overflowRate | 溢装率% | overflowRate | number | Decimal |  |  | nullable |
| 28 | shortageRate | 短装率% | shortageRate | number | Decimal |  |  | nullable |
| 29 | priceMark | 价格标识 | iPriceMark | switch | Boolean |  |  | nullable |
| 30 | prodPrice | 基础报价 | fProdPrice | number | Decimal |  |  | nullable |
| 31 | prodCost | 基础报价金额 | fProdCost | number | Decimal |  |  | nullable |
| 32 | isAdvRecInv | 预收款开票 | isAdvRecInv | switch | Boolean |  |  | nullable |
| 33 | preGProfit | 行预估毛利 | preGProfit | number | Decimal |  |  | nullable |
| 34 | orderPurchaseCoQty | 协同采购数量 | fOrderPurchaseCoQty | number | Decimal |  |  | nullable |
| 35 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 36 | offsetNatAdvRecInvMoney | 累计冲抵本币预收款开票金额 | offsetNatAdvRecInvMoney | number | Decimal |  |  | nullable |
| 37 | advRecInvTaxMoney | 累计预收款开票税额 | advRecInvTaxMoney | number | Decimal |  |  | nullable |
| 38 | tradeRouteLineno | 站点 | tradeRouteLineno | number | Decimal |  |  | nullable |
| 39 | productLineId | 产品线id | iProductLineId | quote | pc.productline.ProductLine |  |  | nullable |
| 40 | isEndTrade | 是否末级 | isEndTrade | short | Short |  |  | nullable |
| 41 | ptoQty | PTO件底数 | ptoQty | number | Decimal |  |  | nullable |
| 42 | ptoCostScrap | 成本比例 | ptoCostScrap | number | Decimal |  |  | nullable |
| 43 | ptoRowId | PTO件行id | ptoRowId | long | Long |  |  | nullable |
| 44 | collaborationPoid | 协同来源单据主表id | collaboration_poid | long | Long |  |  | nullable |
| 45 | natTaxPayEMoney | 行应付费用本币含税金额 | natTaxPayEMoney | number | Decimal |  |  | nullable |
| 46 | offsetAdvRecInvMoney | 累计冲抵预收款开票金额 | offsetAdvRecInvMoney | number | Decimal |  |  | nullable |
| 47 | out_sys_lineid | 外部来源行 | out_sys_lineid | text | String |  |  | nullable |
| 48 | lineCloseReason | 订单行关闭原因 | lineCloseReason | text | String |  |  | nullable |
| 49 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | nullable,uiHide,notGenerate |
| 50 | natPayEMoney | 行应付费用本币无税金额 | natPayEMoney | number | Decimal |  |  | nullable |
| 51 | natTaxReceiEMoney | 行应收费用本币含税金额 | natTaxReceiEMoney | number | Decimal |  |  | nullable |
| 52 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 53 | preGProfitRate | 行预估毛利率% | preGProfitRate | number | Decimal |  |  | nullable |
| 54 | collaborationSource | 协同来源单据类型 | collaboration_source | text | String |  |  | nullable |
| 55 | offsetAdvRecInvQty | 累计冲抵预收款开票数量 | offsetAdvRecInvQty | number | Decimal |  |  | nullable |
| 56 | natAdvRecInvTaxMoney | 累计本币预收款开票税额 | natAdvRecInvTaxMoney | number | Decimal |  |  | nullable |
| 57 | mtoPolicy | MTO策略 | mtoPolicy | switch | Boolean |  |  | nullable |
| 58 | ptoSonQty | PTO子件主数量 | ptoSonQty | number | Decimal |  |  | nullable |
| 59 | productLineName | 产品线名称 | cProductLineName | text | String |  |  | nullable |
| 60 | inquiry | 是否取价 | inquiry | switch | Boolean |  |  | nullable |
| 61 | natReceiEMoney | 行应收费用本币无税金额 | natReceiEMoney | number | Decimal |  |  | nullable |
| 62 | offsetAdvRecInvTaxMoney | 累计冲抵预收款开票税额 | offsetAdvRecInvTaxMoney | number | Decimal |  |  | nullable |
| 63 | advRecInvQty | 累计预收款开票数量 | advRecInvQty | number | Decimal |  |  | nullable |
| 64 | offsetNatAdvRecInvTaxMoney | 累计冲抵本币预收款开票税额 | offsetNatAdvRecInvTaxMoney | number | Decimal |  |  | nullable |
| 65 | out_sys_rowno | 外部来源行号 | out_sys_rowno | text | String |  |  | nullable |
| 66 | cusFavorableRate | 报价倒扣 | fCusFavorableRate | number | Decimal |  |  | nullable |
| 67 | natAdvRecInvMoney | 累计本币预收款开票金额 | natAdvRecInvMoney | number | Decimal |  |  | nullable |
| 68 | points | 积分分摊 | iPoints | int | Integer |  |  | nullable |
| 69 | variantconfigctsId | 特征选配单id | variantconfigctsId | long | Long |  |  | nullable |
| 70 | closedCount | 行关闭主数量 | fClosedCount | number | Decimal |  |  | nullable |
| 71 | tradeRouteID | 贸易路径Id | tradeRouteID | quote | sccs.multitrade.TradeRoute |  |  | nullable |
| 72 | collaborationPorowno | 协同来源单据行号 | collaboration_porowno | number | Decimal |  |  | nullable |
| 73 | collaborationPocode | 协同来源单据号 | collaboration_pocode | text | String |  |  | nullable |
| 74 | collaborationPodetailid | 协同来源单据子表id | collaboration_podetailid | long | Long |  |  | nullable |
| 75 | receiveCode | 收货地址编码 | iReceiveCode | text | String |  |  | nullable |
| 76 | advRecInvMoney | 累计预收款开票金额 | advRecInvMoney | number | Decimal |  |  | nullable |
| 77 | cusDiscountRate | 报价扣率% | fCusDiscountRate | number | Decimal |  |  | nullable |
| 78 | cusDiscountMoney | 报价扣额 | fCusDiscountMoney | number | Decimal |  |  | nullable |
| 79 | saleCost | 折后报价金额 | fSaleCost | number | Decimal |  |  | nullable |
| 80 | salePrice | 折后含税报价 | fSalePrice | number | Decimal |  |  | nullable |
| 81 | noTaxSalePrice | 无税报价 | fNoTaxSalePrice | number | Decimal |  |  | nullable |
| 82 | noTaxSaleCost | 报价无税金额 | fNoTaxSaleCost | number | Decimal |  |  | nullable |
| 83 | oriTaxUnitPrice | 含税成交价 | fTransactionPrice | number | Decimal |  |  | nullable |
| 84 | oriSum | 含税金额 | fSalePayMoney | number | Decimal |  |  | nullable |
| 85 | taxRate | 税率 | fTaxRate | number | Decimal |  |  | nullable |
| 86 | taxItems | 税目 | cTaxItems | text | String |  |  | nullable,REF.ID |
| 87 | taxCode | 税目税率编码 | cTaxCode | text | String |  |  | nullable,REF.ID |
| 88 | taxId | 税目税率id | cTaxId | quote | archive.taxArchives.TaxRateArchive |  |  | nullable |
| 89 | oriTax | 税额 | oriTax | number | Decimal |  |  | nullable |
| 90 | oriUnitPrice | 原币无税单价 | oriUnitPrice | number | Decimal |  |  | nullable |
| 91 | oriMoney | 原币无税金额 | oriMoney | number | Decimal |  |  | nullable |
| 92 | marketPricie | 物料/sku 价格 | fMarketPricie | number | Decimal |  |  | nullable |
| 93 | particularlyMoney | 特殊优惠 | fParticularlyMoney | number | Decimal |  |  | nullable |
| 94 | promotionMoney | 优惠金额 | fPromotionMoney | number | Decimal |  |  | nullable |
| 95 | orderRebateMoney | 货补分摊金额 | fOrderRebateMoney | number | Decimal |  |  | nullable |
| 96 | rebateMoney | 返利分摊金额 | fRebateMoney | number | Decimal |  |  | nullable |
| 97 | cashRebateMoney | 返利直接抵现 | fcashRebateMoney | number | Decimal |  |  | nullable |
| 98 | natCurrency | 本币pk | cDomesticPk | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 99 | natTax | 本币税额 | natTax | number | Decimal |  |  | nullable |
| 100 | natSum | 本币含税金额 | natSum | number | Decimal |  |  | nullable |
| 101 | natMoney | 本币无税金额 | natMoney | number | Decimal |  |  | nullable |
| 102 | natTaxUnitPrice | 本币含税单价 | natTaxUnitPrice | number | Decimal |  |  | nullable |
| 103 | natUnitPrice | 本币无税单价 | natUnitPrice | number | Decimal |  |  | nullable |
| 104 | ordRealMoney | 应收金额 | fOrdRealMoney | number | Decimal |  |  | nullable |
| 105 | closedSumMoney | 关闭总金额 | fClosedSumMoney | number | Decimal |  |  | nullable |
| 106 | closedRowCount | 行关闭数量 | fClosedRowCount | number | Decimal |  |  | nullable |
| 107 | linecloseTime | 行关闭时间 | lineclose_time | timestamp | Timestamp |  |  | nullable,reportHide |
| 108 | linecloser | 行关闭人 | linecloser | text | String |  |  | isGlobalization,nullable |
| 109 | natTaxExpenses | 行费用本币含税金额 | natTaxExpenses | number | Decimal |  |  | nullable |
| 110 | natTaxIncludedExpenses | 行费用本币分摊含税金额 | natTaxIncludedExpenses | number | Decimal |  |  | nullable |
| 111 | costAmt | 成本金额 | fCostAmt | number | Decimal |  |  | nullable |
| 112 | costCurrency | 成本币种pk | cCostCurrencyPK | quote | bd.currencytenant.CurrencyTenantVO |  |  | nullable |
| 113 | costCurrencyCode | 成本币种简称 | cCostCurrencyCode | text | String |  |  | nullable |
| 114 | costCurrencyName | 成本币种 | cCostCurrencyName | text | String |  |  | nullable |
| 115 | costId | 成本价格记录id | cCostId | text | String |  |  | nullable |
| 116 | costPrice | 成本价 | fCostPrice | number | Decimal |  |  | nullable |
| 117 | lowestPrice | 最低售价 | fLowestPrice | number | Decimal |  |  | nullable |
| 118 | isParticipateRebate | 是否可参与返利计算 | isParticipateRebate | switch | Boolean |  |  | nullable |
| 119 | projectId | 项目id | cProjectId | quote | bd.project.ProjectVO |  |  | dataPowerFlag,data_auth,nullable,REF.ID |
| 120 | consumerProfitCenter | 需方利润中心 | consumer_profit_center | quote | bd.virtualaccbody.VirtualAccbody |  |  | nullable |
| 121 | costCenter | 成本中心 | cost_center | quote | bd.costcenter.CostCenter |  |  | nullable |
| 122 | providerProfitCenter | 供方利润中心 | provider_profit_center | quote | bd.virtualaccbody.VirtualAccbody |  |  | nullable |
| 123 | planIdForDeliveryArr | 发货计划行id标识 | planIdForDeliveryArr | long | Long |  |  | nullable |
| 124 | productId_pbatchName | 商品包装单位 | productId_pbatchName | text | String |  |  | nullable,REF.ID |
| 125 | productId_priceListFlag | 价表取价标记 | productId_priceListFlag | text | String |  |  | nullable,REF.ID |
| 126 | ptoId | pto件id | ptoId | quote | pc.product.Product |  |  | nullable |
| 127 | taxIssuedDiscountline | 税票开具折扣行 | taxIssuedDiscountline | switch | Boolean |  |  | nullable |
| 128 | totalOutStockOriMoney | 累计出库无税金额 | fTotalOutStockOriMoney | number | Decimal |  |  | nullable |
| 129 | totalOutStockOriTaxMoney | 累计出库金额 | fOutBoundSumMoney | number | Decimal |  |  | nullable |
| 130 | totalOutStockPriceQty | 累计出库计价数量 | fTotalOutStockPriceQty | number | Decimal |  |  | nullable |
| 131 | auditCount | 累计发货已审数量 | fAuditCount | number | Decimal |  |  | nullable |
| 132 | invoiceOriSum | 已开票金额(原币含税金额) | invoiceOriSum | number | Decimal |  |  | nullable |
| 133 | invoiceQty | 已开票数量(主数量) | invoiceQty | number | Decimal |  |  | nullable |
| 134 | projectSettlementQty | 项目已结算数量 | fProjectSettlementQty | number | Decimal |  |  | nullable |
| 135 | reSendPriceQty | 退货待发计价数量 | fReSendPriceQty | number | Decimal |  |  | nullable |
| 136 | returnPreSendQty | 退货待发数量 | fReturnPreSendQty | number | Decimal |  |  | nullable |
| 137 | sendPayMoney | 已审核发金额 | aSalePayMoney | number | Decimal |  |  | nullable |
| 138 | sendPlanQty | 累计发货计划数量 | fsendPlanQty | number | Decimal |  |  | nullable |
| 139 | sendQty | 累计已发货数量 | fSendQty | number | Decimal |  |  | nullable |
| 140 | takeQuantity | 累计签收数量 | tQuantity | number | Decimal |  |  | nullable |
| 141 | takeSalePayMoney | 累计签收金额 | tSalePayMoney | number | Decimal |  |  | nullable |
| 142 | totalOutStockQuantity | 累计出库主数量 | fOutBoundQty | number | Decimal |  |  | nullable |
| 143 | totalOutStockSubQty | 累计出库件数 | fTotalOutStockSubQty | number | Decimal |  |  | nullable |
| 144 | totalSubcontractApplyQty | 累计下达委外申请量 | fTotalSubcontractApplyQty | number | Decimal |  |  | nullable |
| 145 | totalSubcontractOrderQty | 累计下达委外订单量 | fTotalSubcontractOrderQty | number | Decimal |  |  | nullable |
| 146 | totalVarianceQty | 累计签收差异数量 | totalVarianceQty | number | Decimal |  |  | nullable |
| 147 | orderOutPut | 累计下达生产量 | fOrderOutPut | number | Decimal |  |  | nullable |
| 148 | orderPurchaseQty | 累计采购数量 | fOrderPurchaseQty | number | Decimal |  |  | nullable |
| 149 | sendQuantity | 已审核发数量 | aQuantity | number | Decimal |  |  | nullable |
| 150 | sendSubQty | 已发货销售数量 | fSendSubQty | number | Decimal |  |  | nullable |
| 151 | sendPriceQty | 累计已发货计价数量 | fSendPriceQty | number | Decimal |  |  | nullable |
| 152 | receiveCount | 已收数量 | fReceiveCount | number | Decimal |  |  | nullable |
| 153 | returnQty | 退货数量 | fReturnQty | number | Decimal |  |  | nullable |
| 154 | invoicePriceQty | 累计开票计价数量 | invoicePriceQty | number | Decimal |  |  | nullable |
| 155 | distributionSide | 配送方 | distributionSide | text | String |  |  | nullable |
| 156 | variantConfiguration | 选配物料id | variantConfiguration | quote | vc.variantConfiguration.VariantConfiguration |  |  | nullable |
| 157 | optionCharacteristics | 选配特征组 | optionCharacteristics | OptionCT | voucher.orderchange.OptionCharacteristics |  |  | nullable |
| 158 | orderDetailCharacteristics | 自由项特征组 | orderDetailCharacteristics | FreeCT | voucher.orderchange.OrderChangeDetailCharacteristics |  |  | nullable |
| 159 | orderDetailDefineCharacter | 表体自定义项特征组 | orderDetailDefineCharacter | UserDefine | voucher.orderchange.OrderDetailDefineCharacter |  |  | nullable |
| 160 | stockSensClue | 现存量特征敏感线索 | stockSensClue | text | String |  |  | nullable |
| 161 | EstiDeliveryCreateDate | 预计发货单创建日期 | EstiDeliveryCreateDate | date | Date |  |  | nullable |
| 162 | loadDate | 装载日期 | loadDate | date | Date |  |  | nullable |
| 163 | loadModeId | 装载方式 | loadModeId | quote | base.loadway.LoadWay |  |  | nullable |
| 164 | logisticsOrgId | 物流组织 | logisticsOrgId | quote | org.func.LogisticsOrg |  |  | nullable |
| 165 | planArrivalDate | 计划到货日期 | planArrivalDate | date | Date |  |  | nullable |
| 166 | planTransCompleteDate | 运输计划完成日期 | planTransCompleteDate | date | Date |  |  | nullable |
| 167 | planTransRouteId | 计划运输路线 | planTransRouteId | quote | usp.plantransportroute.PlanTransportRoute |  |  | nullable |
| 168 | shipPointId | 发货点 | shipPointId | quote | usp.sendAndReceiveSite.SendAndReceiveSite |  |  | nullable |
| 169 | startAreaId | 始发地运输区域 | startAreaId | quote | base.shipregion.ShipRegion |  |  | nullable |
| 170 | wopStrateDate | 仓储开始日期 | wopStrateDate | date | Date |  |  | nullable |
| 171 | code | 订单变更号 | cOrderNo | text | String |  |  | nullable |
| 172 | idKey | 行标识 | idKey | text | String |  |  | nullable |
| 173 | erpCode | skuERP编码 | cErpCode | text | String |  |  | nullable |
| 174 | outSysKey | 接口标识 | cOutSysKey | text | String |  |  | nullable |
| 175 | specDescription | 规格 | cSpecDescription | text | String |  |  | nullable,REF.ID |
| 176 | free1 | 物料规格1 | free1 | text | String |  |  | isGlobalization,nullable |
| 177 | free2 | 物料规格2 | free2 | text | String |  |  | isGlobalization,nullable |
| 178 | free3 | 物料规格3 | free3 | text | String |  |  | isGlobalization,nullable |
| 179 | free4 | 物料规格4 | free4 | text | String |  |  | isGlobalization,nullable |
| 180 | free5 | 物料规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 181 | free6 | 物料规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 182 | free7 | 物料规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 183 | free8 | 物料规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 184 | free9 | 物料规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 185 | free10 | 物料规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 186 | transactionTypeId | 交易类型 | iTransactionTypeId | quote | bd.bill.TransType |  |  | nullable,REF.ID |
| 187 | pointsMoney | 积分抵扣金额 | fPointsMoney | number | Decimal |  |  | nullable |
| 188 | shoppingCartId | 购物车id | iShoppingCartId | long | Long |  |  | nullable,REF.ID |
| 189 | groupId | 分组Id | iGroupId | long | Long |  |  | nullable |
| 190 | rebateReturnProductId | 返货单商品id | iRebateReturnProductId | quote | voucher.rebate.RebateReturnProduct |  |  | nullable |
| 191 | mutualActivities | 活动的对象,用于校验互斥活动 | cMutualActivities | text | String |  |  | nullable |
| 192 | activities | 包含的类型,用于校验互斥 | cActivities | text | String |  |  | nullable |
| 193 | bizId | 商家id | iBizId | long | Long |  |  | nullable,REF.ID |
| 194 | salesOrgId | 销售组织id | iSalesOrgId | quote | org.func.SalesOrg |  |  | nullable,REF.ID |
| 195 | saleDepartmentId | 销售部门id | iSaleDepartmentId | quote | bd.adminOrg.DeptOrgVO |  |  | dataPowerFlag,data_auth,nullable,REF.ID |
| 196 | bizProductId | 商家商品id | iBizProductId | long | Long |  |  | nullable,REF.ID |
| 197 | bizSkuId | 商家skuid | iBizSkuId | long | Long |  |  | nullable,REF.ID |
| 198 | orderDetailPrice | 订单变更金额 | iOrderDetailPriceId | quote | voucher.order.OrderDetailPrice |  |  | nullable |
| 199 | iDeleted | 是否删除 | iDeleted | short | Short |  |  | nullable,REF.ID |
| 200 | cBizName | 供应商名称 | cBizName | text | String |  |  | nullable |
| 201 | receivedBilling | 签收后开票 | receivedBilling | switch | Boolean |  |  | nullable |
| 202 | memo | 行备注 | cMemo | text | String |  |  | nullable |
| 203 | consignTime | 计划发货日期 | dConsignTime | date | Date |  |  | nullable |
| 204 | makeRuleCode | 生单规则编码 | makerule_code | text | String |  |  | nullable,reportHide |
| 205 | hopeReceiveDate | 希望到货日期 | dHopeReceiveDate | date | Date |  |  | nullable |
| 206 | batchNo | 批次号 | cBatchNo | text | String |  |  | nullable |
| 207 | expireDateNo | 保质期 | iExpireDateNo | int | Integer |  |  | nullable |
| 208 | isBatchManage | 是否批次管理 | isBatchManage | switch | Boolean |  |  | nullable,REF.ID |
| 209 | expireDateUnit | 保质期单位 | cExpireDateUnit | text | String |  |  | nullable |
| 210 | productDate | 生产日期 | dProductDate | timestamp | Timestamp |  |  | nullable |
| 211 | invalidDate | 有效期至 | dValidDate | timestamp | Timestamp |  |  | nullable |
| 212 | define1 | 批次属性1 | define1 | text | String |  |  | isGlobalization,nullable |
| 213 | define2 | 批次属性2 | define2 | text | String |  |  | isGlobalization,nullable |
| 214 | define3 | 批次属性3 | define3 | text | String |  |  | isGlobalization,nullable |
| 215 | define4 | 批次属性4 | define4 | text | String |  |  | isGlobalization,nullable |
| 216 | define5 | 批次属性5 | define5 | text | String |  |  | isGlobalization,nullable |
| 217 | define6 | 批次属性6 | define6 | text | String |  |  | isGlobalization,nullable |
| 218 | define7 | 批次属性7 | define7 | text | String |  |  | isGlobalization,nullable |
| 219 | define8 | 批次属性8 | define8 | text | String |  |  | isGlobalization,nullable |
| 220 | define9 | 批次属性9 | define9 | text | String |  |  | isGlobalization,nullable |
| 221 | define10 | 批次属性10 | define10 | text | String |  |  | isGlobalization,nullable |
| 222 | define11 | 批次属性11 | define11 | text | String |  |  | isGlobalization,nullable |
| 223 | define12 | 批次属性12 | define12 | text | String |  |  | isGlobalization,nullable |
| 224 | define13 | 批次属性13 | define13 | text | String |  |  | isGlobalization,nullable |
| 225 | define14 | 批次属性14 | define14 | text | String |  |  | isGlobalization,nullable |
| 226 | define15 | 批次属性15 | define15 | text | String |  |  | isGlobalization,nullable |
| 227 | define16 | 批次属性16 | define16 | text | String |  |  | isGlobalization,nullable |
| 228 | define17 | 批次属性17 | define17 | text | String |  |  | isGlobalization,nullable |
| 229 | define18 | 批次属性18 | define18 | text | String |  |  | isGlobalization,nullable |
| 230 | define19 | 批次属性19 | define19 | text | String |  |  | isGlobalization,nullable |
| 231 | define20 | 批次属性20 | define20 | text | String |  |  | isGlobalization,nullable |
| 232 | define21 | 批次属性21 | define21 | text | String |  |  | isGlobalization,nullable |
| 233 | define22 | 批次属性22 | define22 | text | String |  |  | isGlobalization,nullable |
| 234 | define23 | 批次属性23 | define23 | text | String |  |  | isGlobalization,nullable |
| 235 | define24 | 批次属性24 | define24 | text | String |  |  | isGlobalization,nullable |
| 236 | define25 | 批次属性25 | define25 | text | String |  |  | isGlobalization,nullable |
| 237 | define26 | 批次属性26 | define26 | text | String |  |  | isGlobalization,nullable |
| 238 | define27 | 批次属性27 | define27 | text | String |  |  | isGlobalization,nullable |
| 239 | define28 | 批次属性28 | define28 | text | String |  |  | isGlobalization,nullable |
| 240 | define29 | 批次属性29 | define29 | text | String |  |  | isGlobalization,nullable |
| 241 | define30 | 批次属性30 | define30 | text | String |  |  | isGlobalization,nullable |
| 242 | batchId | 批次id | iBatchId | quote | st.batchno.Batchno |  |  | nullable,skipReferenceCheck |
| 243 | agentProductId | 客户商品ID | agentProductId | quote | sa.agent.AgentProductRelation |  |  | nullable |
| 244 | isreserve | 是否预留 | isreserve | switch | Boolean |  |  | nullable |
| 245 | reserveid | 预留id | reserveid | quote | st.reservation.Reservation |  |  | nullable |
| 246 | reserveidDemandtype | 需求跟踪方式 | reserveidDemandtype | text | String |  |  | nullable |
| 247 | isSkuReserve | 商品是否预留 | isSkuReserve | switch | Boolean |  |  | nullable |
| 248 | id | 主体ID | id | long | Long |  |  | nullable,REF.ID |
| 249 | orderId | 订单变更ID | iorderId | quote | voucher.orderchange.OrderChange |  |  | nullable,REF.ID |
| 250 | suite_amount | 套件数量 | suite_amount | number | Decimal |  |  | nullable |
| 251 | suiteSon_amount | 套内子件数量 | suiteSon_amount | number | Decimal |  |  | nullable |
| 252 | suiteQuotePrice | 套件报价价格 | cSuiteQuotePrice | number | Decimal |  |  | nullable |
| 253 | suiteGroup | 套件组号 | suiteGroup | text | String |  |  | nullable |
| 254 | suiteId | 套件id | suiteId | quote | ec.suiteGoodsInfo.EcSuiteGoods |  |  | nullable |
| 255 | suiteSon_priceWeight | 金额权重比% | suiteSon_priceWeight | number | Decimal |  |  | nullable |
| 256 | isUserAddGiveaway | 是否手工赠品 | isUserAddGiveaway | switch | Boolean |  |  | nullable |
| 257 | version | 未定义名称 | version | short | Short |  |  | nullable,REF.ID |
| 258 | productAuth | 物料权限 | iProductId | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 259 | cProductOutSysKey | 未定义名称 | cProductOutSysKey | text | String |  |  | nullable |
| 260 | groupTaskKey | 分组任务KEY | groupTaskKey | text | String |  |  | nullable,reportHide |
| 261 | cSkuOutSysKey | 未定义名称 | cSkuOutSysKey | text | String |  |  | nullable |
| 262 | coordinationQuantity | 协同量 | coordinationQuantity | number | Decimal |  |  | nullable |
| 263 | uordercorp | 租户 | iCorpId | long | Long |  | Y | nullable,reportHide |
| 264 | fMarketPrice | 未定义名称 | fMarketPrice | long | Long |  |  | nullable,REF.ID |
| 265 | canSendQty | 可发货数量 | canSendQty | number | Decimal |  |  | nullable |
| 266 | isDeleted | 逻辑删除标记 | iDeleted | switch | Boolean |  | Y | nullable |
| 267 | groupIndex | 分组顺序 | iGroupIndex | long | Long |  |  | nullable |
| 268 | sourceMainPubts | 时间戳 | sourceMainPubts | timestamp | Timestamp |  |  | nullable,reportHide |
| 269 | receiverCustId | 收货客户 | iReceiverCust | quote | aa.merchant.Merchant |  |  | dataPowerFlag,data_auth,nullable |
| 270 | receiveStoreId | 收货终端网点 | iReceiveStore | quote | aa.store.Store |  |  | nullable |
| 271 | receiverId | 收货人 | iReceiver | quote | aa.merchant.AddressInfo |  |  | nullable |
| 272 | receiveAddress | 收货地址 | iReceiveAddress | text | String |  |  | nullable |
| 273 | receiver | 收货人 | cReceiver | text | String |  |  | nullable |
| 274 | receiveMobile | 收货电话 | iReceiveMobile | text | String |  |  | nullable |
| 275 | receiveZipCode | 收货人邮编 | iReceiveZipCode | text | String |  |  | nullable |
| 276 | receiveTelePhone | 收货人固定电话 | iReceiveTelePhone | text | String |  |  | nullable |
| 277 | merchAddrAutoSynFlag | 收货信息自动建档 | iMerchAddrAutoSynFlag | switch | Boolean |  |  | nullable |
| 278 | source | 来源单据类型 | cSourceType | text | String |  |  | nullable,reportHide |
| 279 | uplineno | 来源单据行号 | uplineno | number | Decimal |  |  | nullable |
| 280 | firstsourceautoid | 源头单据子表id | firstsourceautoid | long | Long |  |  | nullable |
| 281 | firstsource | 源头单据类型 | firstsource | text | String |  |  | nullable |
| 282 | firstupcode | 源头单据号 | firstupcode | text | String |  |  | nullable |
| 283 | firstlineno | 源头单据行号 | firstlineno | number | Decimal |  |  | nullable |
| 284 | firstsourceid | 源头单据主表id | firstsourceid | long | Long |  |  | nullable |
| 285 | contractTpye | 合同类型 | contractTpye | text | String |  |  | nullable |
| 286 | sactCode | 销售合同编码 | sactcode | text | String |  |  | nullable |
| 287 | sacoLineno | 合同行号 | sacoLineno | number | Decimal |  |  | nullable |
| 288 | sactId | 销售合同表头id | sactid | long | Long |  |  | nullable |
| 289 | sacoId | 销售合同表体行id | sacoid | long | Long |  |  | nullable |
| 290 | originalOrderId | 原单id | iOriginalOrderId | quote | voucher.order.Order |  |  | nullable |
| 291 | contractLot | 贸易合同批次 | contractLot | text | String |  |  | nullable |
| 292 | deliveryLot | 贸易合同交付批号 | deliveryLot | text | String |  |  | nullable |
| 293 | sourceType | 协同来源单据类型 | cSourceType | text | String |  |  | nullable |
| 294 | upcode | 协同来源单据号 | csynSourceNo | text | String |  |  | nullable |
| 295 | sourceid | 协同来源单据头id | iSourceid | long | Long |  |  | nullable |
| 296 | sourceautoid | 协同来源单据行id | iSourceautoid | long | Long |  |  | nullable |
| 297 | coSourceType | 协同源头单据类型 | cCoSourceType | text | String |  |  | nullable |
| 298 | coSourceautoid | 协同源头单据行id | iCoSourceautoid | long | Long |  |  | nullable |
| 299 | coSourceid | 协同源头单据头id | iCoSourceid | long | Long |  |  | nullable |
| 300 | coUpcode | 协同源头单据号 | cCoUpcode | text | String |  |  | nullable |
| 301 | coSourceLineNo | 协同源头单据行号 | coSourceLineNo | number | Decimal |  |  | nullable |
| 302 | subBusinessSourceId | 子业务源头单据id | subBusinessSourceId | long | Long |  |  | nullable |
| 303 | subBusinessSourceLineId | 子业务源头单据行id | subBusinessSourceLineId | long | Long |  |  | nullable |
| 304 | subBusinessSourceLineNo | 子业务源头单据行号 | subBusinessSourceLineNo | number | Decimal |  |  | nullable |
| 305 | subBusinessSourceNo | 子业务源头单据号 | subBusinessSourceNo | text | String |  |  | nullable |
| 306 | subBusinessSourceType | 子业务源头单据类型 | subBusinessSourceType | text | String |  |  | nullable |
| 307 | originalOrderDetailId | 原单id | iOriginalOrderDetailId | quote | voucher.order.OrderDetail |  |  | nullable |
| 308 | createDate | 创建时间 | dCreated | timestamp | Timestamp |  |  | nullable |
| 309 | iOrgId | 组织ID | iOrgId | quote | org.func.BaseOrg |  |  | nullable |
| 310 | dCreatedTime | 创建时间 | dCreatedTime | date | Date |  |  | nullable,REF.ID |
| 311 | dModifyTime | 修改时间 | dModifyTime | timestamp | Timestamp |  |  | nullable |
| 312 | cCreator | 创建人 | cCreator | text | String |  |  | nullable |
| 313 | cModifier | 修改人 | cModifier | text | String |  |  | nullable |
| 314 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 315 | bodyFreeItem | 变更单表体自由自定义项 | - | - | voucher.orderchange.OrderChangeDetailFreeDefine |  |  |  |
| 316 | bodyItem | 变更单表体自定义项 | - | - | voucher.orderchange.OrderChangeDetailDefine |  |  |  |
| 317 | detailDeliveryPlans | 销售订单变更发货计划 | - | - | voucher.orderchange.OrderChangeDetailDeliveryPlan |  |  |  |
| 318 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 319 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 320 | invPriceExchRateDen | 计价换算率分母 | invpriceexchrateden | number | Decimal |  |  | nullable |
| 321 | invPriceExchRateNum | 计价换算率分子 | invpriceexchratenum | number | Decimal |  |  | nullable |
| 322 | orderDetailPrices | 变更单商品金额 | - | - | voucher.orderchange.OrderChangeDetailPrice |  |  |  |
| 323 | orderProductApportions | 订单变更分摊 | - | - | voucher.orderchange.OrderChangeProductApportion |  |  |  |
| 324 | ptoHierarchyType | 层级结构类型 | ptoHierarchyType | int | Integer |  |  | nullable |
| 325 | ptoPricingMethod | 定价方式 | ptoPricingMethod | int | Integer |  |  | nullable |
| 326 | throwStatus | 抛单状态 | throw_status | int | Integer |  |  | nullable |

---

## Reference Fields (44)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | productId | 商品id | iProductId | pc.product.Product |
| 2 | skuId | skuId | iSKUId | pc.product.ProductSKU |
| 3 | iProductAuxUnitId | 销售单位id | iProductAuxUnitId | pc.unit.Unit |
| 4 | iProductUnitId | 计价单位id | iProductUnitId | pc.unit.Unit |
| 5 | masterUnitId | 主计量单位id | iMasterUnitId | pc.unit.Unit |
| 6 | settlementOrgId | 开票组织 | iSettlementOrgId | org.func.FinanceOrg |
| 7 | stockOrgId | 库存组织id | iStockOrgId | org.func.InventoryOrg |
| 8 | stockId | 仓库ID | iStockId | aa.warehouse.Warehouse |
| 9 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 10 | productLineId | 产品线id | iProductLineId | pc.productline.ProductLine |
| 11 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 12 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 13 | tradeRouteID | 贸易路径Id | tradeRouteID | sccs.multitrade.TradeRoute |
| 14 | taxId | 税目税率id | cTaxId | archive.taxArchives.TaxRateArchive |
| 15 | natCurrency | 本币pk | cDomesticPk | bd.currencytenant.CurrencyTenantVO |
| 16 | costCurrency | 成本币种pk | cCostCurrencyPK | bd.currencytenant.CurrencyTenantVO |
| 17 | projectId | 项目id | cProjectId | bd.project.ProjectVO |
| 18 | consumerProfitCenter | 需方利润中心 | consumer_profit_center | bd.virtualaccbody.VirtualAccbody |
| 19 | costCenter | 成本中心 | cost_center | bd.costcenter.CostCenter |
| 20 | providerProfitCenter | 供方利润中心 | provider_profit_center | bd.virtualaccbody.VirtualAccbody |
| 21 | ptoId | pto件id | ptoId | pc.product.Product |
| 22 | variantConfiguration | 选配物料id | variantConfiguration | vc.variantConfiguration.VariantConfiguration |
| 23 | loadModeId | 装载方式 | loadModeId | base.loadway.LoadWay |
| 24 | logisticsOrgId | 物流组织 | logisticsOrgId | org.func.LogisticsOrg |
| 25 | planTransRouteId | 计划运输路线 | planTransRouteId | usp.plantransportroute.PlanTransportRoute |
| 26 | shipPointId | 发货点 | shipPointId | usp.sendAndReceiveSite.SendAndReceiveSite |
| 27 | startAreaId | 始发地运输区域 | startAreaId | base.shipregion.ShipRegion |
| 28 | transactionTypeId | 交易类型 | iTransactionTypeId | bd.bill.TransType |
| 29 | rebateReturnProductId | 返货单商品id | iRebateReturnProductId | voucher.rebate.RebateReturnProduct |
| 30 | salesOrgId | 销售组织id | iSalesOrgId | org.func.SalesOrg |
| 31 | saleDepartmentId | 销售部门id | iSaleDepartmentId | bd.adminOrg.DeptOrgVO |
| 32 | orderDetailPrice | 订单变更金额 | iOrderDetailPriceId | voucher.order.OrderDetailPrice |
| 33 | batchId | 批次id | iBatchId | st.batchno.Batchno |
| 34 | agentProductId | 客户商品ID | agentProductId | sa.agent.AgentProductRelation |
| 35 | reserveid | 预留id | reserveid | st.reservation.Reservation |
| 36 | orderId | 订单变更ID | iorderId | voucher.orderchange.OrderChange |
| 37 | suiteId | 套件id | suiteId | ec.suiteGoodsInfo.EcSuiteGoods |
| 38 | productAuth | 物料权限 | iProductId | pb.dataauth.ProductDataAuth |
| 39 | receiverCustId | 收货客户 | iReceiverCust | aa.merchant.Merchant |
| 40 | receiveStoreId | 收货终端网点 | iReceiveStore | aa.store.Store |
| 41 | receiverId | 收货人 | iReceiver | aa.merchant.AddressInfo |
| 42 | originalOrderId | 原单id | iOriginalOrderId | voucher.order.Order |
| 43 | originalOrderDetailId | 原单id | iOriginalOrderDetailId | voucher.order.OrderDetail |
| 44 | iOrgId | 组织ID | iOrgId | org.func.BaseOrg |

---

## Child Tables (5)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | detailDeliveryPlans | 销售订单变更发货计划 | voucher.orderchange.OrderChangeDetailDeliveryPlan |
| 2 | bodyItem | 变更单表体自定义项 | voucher.orderchange.OrderChangeDetailDefine |
| 3 | bodyFreeItem | 变更单表体自由自定义项 | voucher.orderchange.OrderChangeDetailFreeDefine |
| 4 | orderDetailPrices | 变更单商品金额 | voucher.orderchange.OrderChangeDetailPrice |
| 5 | orderProductApportions | 订单变更分摊 | voucher.orderchange.OrderChangeProductApportion |
