---
tags: [BIP, metadata, voucher, SaleReturnDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 退货单详情 (voucher.salereturn.SaleReturnDetail)

> Platform: BIP V5 | Module: voucher | Table: salereturndetail | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 退货单详情 |
| uri | voucher.salereturn.SaleReturnDetail |
| tableName | salereturndetail |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | uorder.voucher.UorderVouchLine |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (25)

| # | Name | URI |
|---|------|-----|
| 1 | 换算比 (IUOMExchRate) | gscm.itf.IUOMExchRate |
| 2 | 计价换算比 (IUOMPriceExchRate) | gscm.itf.IUOMPriceExchRate |
| 3 | 逻辑删除相关 (Deletable) | base.itf.Deletable |
| 4 | 计量单位信息 (IUOMInfo) | voucher.base.IUOMInfo |
| 5 | 计价单位信息 (IUOMPriceInfo) | voucher.base.IUOMPriceInfo |
| 6 | 成本核算单价金额接口 (INatPriceMoney) | voucher.base.INatPriceMoney |
| 7 | 原币金额信息 (IOriMoneyInfo) | voucher.base.IOriMoneyInfo |
| 8 | 本币金额信息 (INatMoneyInfo) | voucher.base.INatMoneyInfo |
| 9 | 表体上游单据金额 (IUorderVoucherDetailCredit) | uorder.voucher.IUorderVoucherDetailCredit |
| 10 | 生单回写 (IBackWrite) | base.itf.IBackWrite |
| 11 | 应付金额 (IRealMoney) | uorder.voucher.IRealMoney |
| 12 | 源头单据信息 (IFirstSourceData) | sale.aa.IFirstSourceData |
| 13 | 自定义项(批次) (UserdefItemBatch) | base.itf.UserdefItemBatch |
| 14 | 预留对象相关 (IReservationID) | st.reservation.IReservationID |
| 15 | 后端自动行号接口 (ILineNo) | base.itf.ILineNo |
| 16 | 来源单据行号接口 (IUpLineNo) | sale.aa.IUpLineNo |
| 17 | 财务成本中心 (CostCenter) | sale.aa.CostCenter |
| 18 | 财务利润中心 (ProfitCenter) | sale.aa.ProfitCenter |
| 19 | 子业务源头单据信息 (ISubBusinessSourceData) | sale.aa.ISubBusinessSourceData |
| 20 | 协同单据信息 (ICoSourceData) | sale.aa.ICoSourceData |
| 21 | PTO信息 (IProductToOrder) | usp.pto.IProductToOrder |
| 22 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 23 | 项目结构属性 (projectStructureProperties) | BGDM.wbs.projectStructureProperties |
| 24 | 贸易路径Id接口 (ITradeRouteID) | sccs.multitrade.ITradeRouteID |
| 25 | 协同来源单据信息 (ICollaborationSourceData) | sale.aa.ICollaborationSourceData |

---

## All Fields (247)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | consumerProfitCenter | 需方利润中心 | consumer_profit_center | quote | bd.virtualaccbody.VirtualAccbody |  |  | nullable |
| 2 | contractLot | 贸易合同批次 | contractLot | text | String |  |  | nullable |
| 3 | contractTpye | 合同类型 | contractTpye | text | String |  |  | nullable |
| 4 | costCenter | 成本中心 | cost_center | quote | bd.costcenter.CostCenter |  |  | nullable |
| 5 | deliverier | 发货人 | cDeliverier | text | String |  |  | nullable |
| 6 | deliverierId | 发货人 | iDeliverier | quote | aa.merchant.AddressInfo |  |  | nullable |
| 7 | deliveryAddress | 退货地址 | iDeliveryAddress | text | String |  |  | nullable |
| 8 | deliveryCustId | 退货客户 | iDeliveryCust | quote | aa.merchant.Merchant |  |  | data_auth,nullable |
| 9 | deliveryLot | 贸易合同交付批号 | deliveryLot | text | String |  |  | nullable |
| 10 | deliveryMobile | 发货人电话 | iDeliveryMobile | text | String |  |  | nullable |
| 11 | deliveryTelePhone | 发货人固定电话 | iDeliveryTelePhone | text | String |  |  | nullable |
| 12 | distributionSide | 配送方 | distributionSide | text | String |  |  | nullable |
| 13 | endAreaId | 目的地运输区域 | endAreaId | quote | base.shipregion.ShipRegion |  |  | nullable |
| 14 | loadModeId | 装载方式 | loadModeId | quote | base.loadway.LoadWay |  |  | nullable |
| 15 | logisticsOrgId | 物流组织 | logisticsOrgId | quote | org.func.LogisticsOrg |  |  | nullable |
| 16 | planTransRouteId | 计划运输路线 | planTransRouteId | quote | usp.plantransportroute.PlanTransportRoute |  |  | nullable |
| 17 | qtyName | 主计量单位名称 | qtyName | text | String |  |  | nullable |
| 18 | totalOrderSupplyAgainQty | 累计新单补货数量 | fTotalOrderSupplyAgainQty | number | Decimal |  |  | nullable |
| 19 | outStockQty | 检验可出库数量 | outStockQty | number | Decimal |  |  | nullable |
| 20 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 21 | shortageRate | 短装率% | shortageRate | number | Decimal |  |  | nullable |
| 22 | saleOutClose | 出库关闭 | cSaleOutClose | switch | Boolean |  |  | nullable |
| 23 | orderQtyRebateMoney | 数量货补分摊金额 | forderqtyrebatemoney | number | Decimal |  |  | nullable |
| 24 | checkByRevenueManagement | 收入管理核算 | revmanagecalculate | switch | Boolean |  |  | nullable |
| 25 | excessiveSigning | 超量签收 | excessivesigning | short | Short |  |  | nullable |
| 26 | custodianType | 保管者类型 | custodiantype | text | String |  |  | nullable |
| 27 | custodian | 保管者 | custodian | quote | st.custodian.Custodian |  |  | nullable |
| 28 | tradeRouteLineno | 站点 | tradeRouteLineno | number | Decimal |  |  | nullable |
| 29 | productLineId | 产品线id | iProductLineId | quote | pc.productline.ProductLine |  |  | nullable |
| 30 | isEndTrade | 是否末级 | isEndTrade | short | Short |  |  | nullable |
| 31 | inspectionType | 检验 | inspectionType | switch | Boolean |  |  | nullable |
| 32 | subBusinessSourceId | 子业务源头单据id | subBusinessSourceId | long | Long |  |  | nullable |
| 33 | productCode | 商品编码 | cProductCode | text | String |  |  | nullable |
| 34 | saleOutStatus | 出库状态 | cSaleOutStatus | text | String |  |  | nullable |
| 35 | ptoQty | PTO件底数 | ptoQty | number | Decimal |  |  | nullable |
| 36 | ptoCostScrap | 成本比例 | ptoCostScrap | number | Decimal |  |  | nullable |
| 37 | taxItems | 税目 | cTaxItems | text | String |  |  | nullable |
| 38 | ptoRowId | PTO件行id | ptoRowId | long | Long |  |  | nullable |
| 39 | goodsPositionId | 货位id | goodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 40 | coSourceLineNo | 协同源头单据行号 | coSourceLineNo | number | Decimal |  |  | nullable |
| 41 | taxCode | 税目税率编码 | cTaxCode | text | String |  |  | nullable |
| 42 | subBusinessSourceLineNo | 子业务源头单据行号 | subBusinessSourceLineNo | number | Decimal |  |  | nullable |
| 43 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 44 | coSourceType | 协同源头单据类型 | cCoSourceType | text | String |  |  | nullable |
| 45 | subBusinessSourceType | 子业务源头单据类型 | subBusinessSourceType | text | String |  |  | nullable |
| 46 | sacoLineno | 合同行号 | sacoLineno | number | Decimal |  |  | nullable |
| 47 | totalCoordReStockQty | 累计协同退库数量 | totalCoordReStockQty | number | Decimal |  |  | nullable |
| 48 | coSourceid | 协同源头单据头id | iCoSourceid | long | Long |  |  | nullable |
| 49 | ptoId | PTO件id | ptoId | quote | pc.product.Product |  |  | nullable |
| 50 | totalPlCheckQty | 累计请检数量 | totalPlCheckQty | number | Decimal |  |  | nullable |
| 51 | coSourceautoid | 协同源头单据行id | iCoSourceautoid | long | Long |  |  | nullable |
| 52 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 53 | productName | 商品名称 | cProductName | text | String |  |  | nullable |
| 54 | collaborationSource | 协同来源单据类型 | collaboration_source | text | String |  |  | nullable |
| 55 | isExpiryDateManage | 是否生效日期管理 | bExpiryDateManage | switch | Boolean |  |  | nullable |
| 56 | expireDateNo | 有效期 | iExpireDateNo | int | Integer |  |  | nullable |
| 57 | orderDetailLineno | 订单行号 | orderDetailLineno | number | Decimal |  |  | nullable |
| 58 | mtoPolicy | MTO策略 | mtoPolicy | switch | Boolean |  |  | nullable |
| 59 | favorableRate | 倒扣 | fFavorableRate | number | Decimal |  |  | nullable |
| 60 | newOrderSupplyAgain | 是否新单补货 | bNewOrderSupplyAgain | switch | Boolean |  |  | nullable |
| 61 | ptoSonQty | PTO子件主数量 | ptoSonQty | number | Decimal |  |  | nullable |
| 62 | notStockQty | 检验不可出库数量 | notStockQty | number | Decimal |  |  | nullable |
| 63 | productLineName | 产品线名称 | cProductLineName | text | String |  |  | nullable |
| 64 | expireDateUnit | 有效期单位 | cExpireDateUnit | text | String |  |  | nullable |
| 65 | isBatchManage | 是否批次管理 | bBatchManage | switch | Boolean |  |  | nullable |
| 66 | isUpdateStock | 是否更新存量 | isUpdateStock | switch | Boolean |  |  | nullable |
| 67 | productUnitName | 计价单位 | cProductUnitName | text | String |  |  | nullable |
| 68 | totalInspectQty | 累计检验数量 | totalInspectQty | number | Decimal |  |  | nullable |
| 69 | tradeRouteID | 贸易路径Id | tradeRouteID | quote | sccs.multitrade.TradeRoute |  |  | nullable |
| 70 | productAuxUnitName | 辅助计量单位名称 | cProductAuxUnitName | text | String |  |  | nullable |
| 71 | subBusinessSourceLineId | 子业务源头单据行id | subBusinessSourceLineId | long | Long |  |  | nullable |
| 72 | subBusinessSourceNo | 子业务源头单据号 | subBusinessSourceNo | text | String |  |  | nullable |
| 73 | coUpcode | 协同源头单据号 | cCoUpcode | text | String |  |  | nullable |
| 74 | overflowRate | 溢装率% | overflowRate | number | Decimal |  |  | nullable |
| 75 | providerProfitCenter | 供方利润中心 | provider_profit_center | quote | bd.virtualaccbody.VirtualAccbody |  |  | nullable |
| 76 | saleReturnDetailCharacteristics | 自由项特征组 | saleReturnDetailCharacteristics | FreeCT | voucher.salereturn.SaleReturnDetailCharacteristics |  |  | nullable |
| 77 | saleReturnDetailDefineCharacter | 自定义项特征属性组 | saleReturnDetailDefineCharacter | UserDefine | voucher.salereturn.SaleReturnDetailDefineCharacter |  |  | nullable |
| 78 | shipPointId | 收货点 | shipPointId | quote | usp.sendAndReceiveSite.SendAndReceiveSite |  |  | nullable |
| 79 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 80 | saleReturnId | 退货单Id | iSaleReturnId | quote | voucher.salereturn.SaleReturn |  |  | nullable |
| 81 | saleReturnNo | 退货单号 | cSaleReturnNo | text | String |  |  | nullable |
| 82 | orderNo | 源头订单号 | cOrderNo | text | String |  |  | nullable |
| 83 | orderDetailId | 订单行id | iOrderDetailId | long | Long |  |  | nullable |
| 84 | orderDetailIdKey | 订单行idkey | cOrderDetailIdKey | text | String |  |  | nullable |
| 85 | sourceid | 来源单据ID | sourceid | long | Long |  |  | nullable |
| 86 | sourceautoid | 来源单据子表ID | iDeliveryDetailId | long | Long |  |  | nullable |
| 87 | source | 来源单据类型 | source | text | String |  |  | nullable,reportHide |
| 88 | makeRuleCode | 生单类型编码 | makerule_code | text | String |  |  | nullable,reportHide |
| 89 | upcode | 来源单据号 | cDeliveryNo | text | String |  |  | nullable |
| 90 | productId | 商品id | iProductId | quote | pc.product.Product |  |  | data_auth,nullable |
| 91 | skuId | 商品skuId | iSKUId | quote | pc.product.ProductSKU |  |  | nullable |
| 92 | specDescription | 规格 | cSpecDescription | text | String |  |  | nullable |
| 93 | projectId | 项目id | cProjectId | quote | bd.project.ProjectVO |  |  | data_auth,nullable |
| 94 | unitExchangeType | 浮动换算率(销售) | unitExchangeType | int | Integer |  |  | nullable |
| 95 | unitExchangeTypePrice | 浮动换算率(计价) | unitExchangeTypePrice | int | Integer |  |  | nullable |
| 96 | invExchRate | 销售换算率 | invExchRate | number | Decimal |  |  | nullable |
| 97 | subQty | 退货销售数量 | iAuxUnitQuantity | number | Decimal |  |  | nullable |
| 98 | invPriceExchRate | 计价换算率 | invPriceExchRate | number | Decimal |  |  | nullable |
| 99 | priceQty | 退货计价数量 | fReturnQuantity | number | Decimal |  |  | nullable |
| 100 | qty | 退货数量 | qty | number | Decimal |  |  | nullable |
| 101 | oriUnitPrice | 无税单价 | oriUnitPrice | number | Decimal |  |  | nullable |
| 102 | salePrice | 含税单价 | fSalePrice | number | Decimal |  |  | nullable |
| 103 | oriTaxUnitPrice | 含税成交价 | fTransactionPrice | number | Decimal |  |  | nullable |
| 104 | oriSum | 含税金额 | fSalePayMoney | number | Decimal |  |  | nullable |
| 105 | taxRate | 税率 | taxRate | number | Decimal |  |  | nullable |
| 106 | taxId | 税目税率id | cTaxId | quote | archive.taxArchives.TaxRateArchive |  |  | nullable |
| 107 | oriTax | 税额 | oriTax | number | Decimal |  |  | nullable |
| 108 | oriMoney | 无税金额 | oriMoney | number | Decimal |  |  | nullable |
| 109 | stockId | 仓库ID | iStockId | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 110 | stockOrgId | 库存组织id | iStockOrgId | quote | org.func.InventoryOrg |  |  | data_auth,nullable |
| 111 | natUnitPrice | 本币无税单价 | natUnitPrice | number | Decimal |  |  | nullable |
| 112 | natTaxUnitPrice | 本币含税单价 | natTaxUnitPrice | number | Decimal |  |  | nullable |
| 113 | natTax | 本币税额 | natTax | number | Decimal |  |  | nullable |
| 114 | natMoney | 本币无税金额 | natMoney | number | Decimal |  |  | nullable |
| 115 | natSum | 本币含税金额 | natSum | number | Decimal |  |  | nullable |
| 116 | saleReturnDepartmentId | 退货部门id | iSaleReturnDepartmentId | quote | bd.adminOrg.DeptOrgVO |  |  | nullable |
| 117 | realMoney | 应付金额 | fRealMoney | number | Decimal |  |  | nullable |
| 118 | invoiceQty | 累计开票数量 | fInvoiceQty | number | Decimal |  |  | nullable |
| 119 | invoiceOriSum | 累计含税开票金额 | fInvoiceMoney | number | Decimal |  |  | nullable |
| 120 | totalOutStockQuantity | 累计出库数量 | fOutStockQuantity | number | Decimal |  |  | nullable |
| 121 | totalOutStockSubQty | 累计出库件数 | fTotalOutStockSubQty | number | Decimal |  |  | nullable |
| 122 | totalOutStockOriTaxMoney | 累计出库含税金额 | fTotalOutStockOriTaxMoney | number | Decimal |  |  | nullable |
| 123 | totalOutStockOriMoney | 累计出库无税金额 | fTotalOutStockOriMoney | number | Decimal |  |  | nullable |
| 124 | totalOutStockOriTax | 累计出库税额 | fTotalOutStockOriTax | number | Decimal |  |  | nullable |
| 125 | batchNo | 批次 | cBatchNo | text | String |  |  | nullable |
| 126 | productDate | 生产日期 | dProductDate | date | Date |  |  | nullable |
| 127 | invalidDate | 有效期至 | dInvalidDate | date | Date |  |  | nullable |
| 128 | iProductAuxUnitId | 销售单位id | iProductAuxUnitId | quote | pc.unit.Unit |  |  | nullable |
| 129 | iProductUnitId | 计价单位id | iProductUnitId | quote | pc.unit.Unit |  |  | nullable |
| 130 | masterUnitId | 主计量单位id | iMasterUnitId | quote | pc.unit.Unit |  |  | nullable |
| 131 | bizId | 供应商id | iBizId | long | Long |  |  | nullable |
| 132 | bizName | 供应商名称 | cBizName | text | String |  |  | nullable |
| 133 | orderProductType | 商品类型 | cOrderProductType | text | String |  |  | nullable |
| 134 | groupId | 分组id | iGroupId | long | Long |  |  | nullable |
| 135 | bizProductId | 商家商品id | iBizProductId | long | Long |  |  | nullable |
| 136 | salesOrgId | 销售组织id | iSalesOrgId | quote | org.func.SalesOrg |  |  | nullable |
| 137 | enable | 是否有效状态 | bEnable | switch | Boolean |  |  | nullable |
| 138 | createdDate | 创建日期 | dCreatedDate | date | Date |  |  | nullable |
| 139 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 140 | uplineno | 来源单据行号 | uplineno | number | Decimal |  |  | nullable |
| 141 | retNotNeedInvoiceQty | 退货不开票数量-废弃 | fRetNotNeedInvoiceQty | number | Decimal |  |  | nullable |
| 142 | firstsourceid | 源头单据主表id | firstsourceid | long | Long |  |  | nullable |
| 143 | firstsourceautoid | 源头单据子表id | firstsourceautoid | long | Long |  |  | nullable |
| 144 | firstsource | 源头单据类型 | firstsource | text | String |  |  | nullable |
| 145 | firstupcode | 源头单据号 | firstupcode | text | String |  |  | nullable |
| 146 | oriTaxUnitOffer | 含税报价 | fOriTaxUnitOffer | number | Decimal |  |  | nullable |
| 147 | lineSaleCost | 报价含税金额 | fLineSaleCost | number | Decimal |  |  | nullable |
| 148 | priceMark | 价格标识 | iPriceMark | switch | Boolean |  |  | nullable |
| 149 | discountRate | 扣率% | fDiscountRate | number | Decimal |  |  | nullable |
| 150 | lineDiscountMoney | 扣额 | fLineDiscountMoney | number | Decimal |  |  | nullable |
| 151 | lineNatDiscountMoney | 本币扣额 | fLineNatDiscountMoney | number | Decimal |  |  | nullable |
| 152 | firstlineno | 源头单据行号 | firstlineno | number | Decimal |  |  | nullable |
| 153 | salesOutRowNo | 出库单据行号 | salesOutRowNo | int | Integer |  |  | nullable |
| 154 | salesOutDetailId | 出库单据子表id | salesOutDetailId | long | Long |  |  | nullable |
| 155 | salesOutId | 出库单据id | salesOutId | long | Long |  |  | nullable |
| 156 | salesOutCode | 出库单据编号 | salesOutCode | text | String |  |  | nullable |
| 157 | agentProductId | 客户商品ID | agentProductId | quote | sa.agent.AgentProductRelation |  |  | nullable |
| 158 | isAllowOrginReplenish | 是否允许原单补货 | isAllowOrginReplenish | switch | Boolean |  |  | nullable |
| 159 | originalOrderSupplyAgain | 是否原单补货 | bOriginalOrderSupplyAgain | switch | Boolean |  |  | nullable |
| 160 | batchId | 批次id | iBatchId | quote | st.batchno.Batchno |  |  | nullable |
| 161 | define1 | 批次属性1 | define1 | text | String |  |  | isGlobalization,nullable |
| 162 | define2 | 批次属性2 | define2 | text | String |  |  | isGlobalization,nullable |
| 163 | define3 | 批次属性3 | define3 | text | String |  |  | isGlobalization,nullable |
| 164 | define4 | 批次属性4 | define4 | text | String |  |  | isGlobalization,nullable |
| 165 | define5 | 批次属性5 | define5 | text | String |  |  | isGlobalization,nullable |
| 166 | define6 | 批次属性6 | define6 | text | String |  |  | isGlobalization,nullable |
| 167 | define7 | 批次属性7 | define7 | text | String |  |  | isGlobalization,nullable |
| 168 | define8 | 批次属性8 | define8 | text | String |  |  | isGlobalization,nullable |
| 169 | define9 | 批次属性9 | define9 | text | String |  |  | isGlobalization,nullable |
| 170 | define10 | 批次属性10 | define10 | text | String |  |  | isGlobalization,nullable |
| 171 | define11 | 批次属性11 | define11 | text | String |  |  | isGlobalization,nullable |
| 172 | define12 | 批次属性12 | define12 | text | String |  |  | isGlobalization,nullable |
| 173 | define13 | 批次属性13 | define13 | text | String |  |  | isGlobalization,nullable |
| 174 | define14 | 批次属性14 | define14 | text | String |  |  | isGlobalization,nullable |
| 175 | define15 | 批次属性15 | define15 | text | String |  |  | isGlobalization,nullable |
| 176 | define16 | 批次属性16 | define16 | text | String |  |  | isGlobalization,nullable |
| 177 | define17 | 批次属性17 | define17 | text | String |  |  | isGlobalization,nullable |
| 178 | define18 | 批次属性18 | define18 | text | String |  |  | isGlobalization,nullable |
| 179 | define19 | 批次属性19 | define19 | text | String |  |  | isGlobalization,nullable |
| 180 | define20 | 批次属性20 | define20 | text | String |  |  | isGlobalization,nullable |
| 181 | define21 | 批次属性21 | define21 | text | String |  |  | isGlobalization,nullable |
| 182 | define22 | 批次属性22 | define22 | text | String |  |  | isGlobalization,nullable |
| 183 | define23 | 批次属性23 | define23 | text | String |  |  | isGlobalization,nullable |
| 184 | define24 | 批次属性24 | define24 | text | String |  |  | isGlobalization,nullable |
| 185 | define25 | 批次属性25 | define25 | text | String |  |  | isGlobalization,nullable |
| 186 | define26 | 批次属性26 | define26 | text | String |  |  | isGlobalization,nullable |
| 187 | define27 | 批次属性27 | define27 | text | String |  |  | isGlobalization,nullable |
| 188 | define28 | 批次属性28 | define28 | text | String |  |  | isGlobalization,nullable |
| 189 | define29 | 批次属性29 | define29 | text | String |  |  | isGlobalization,nullable |
| 190 | define30 | 批次属性30 | define30 | text | String |  |  | isGlobalization,nullable |
| 191 | sactId | 销售合同表头id | sactid | long | Long |  |  | nullable |
| 192 | sacoId | 销售合同表体行id | sacoid | long | Long |  |  | nullable |
| 193 | sactCode | 销售合同编码 | sactcode | text | String |  |  | nullable |
| 194 | totalOutStockPriceQty | 累计出库计价数量 | fTotalOutStockPriceQty | number | Decimal |  |  | nullable |
| 195 | isUpdateCost | 是否更新存货 | isUpdateCost | switch | Boolean |  |  | nullable |
| 196 | isScrap | 是否废品 | isScrap | switch | Boolean |  |  | nullable |
| 197 | reserveid | 预留id | reserveid | quote | st.reservation.Reservation |  |  | nullable |
| 198 | reserveidDemandtype | 需求跟踪方式 | reserveidDemandtype | text | String |  |  | nullable |
| 199 | isreserve | 是否预留 | isreserve | switch | Boolean |  |  | nullable |
| 200 | isSkuReserve | 商品是否预留 | isSkuReserve | switch | Boolean |  |  | nullable |
| 201 | rebateMoney | 返利分摊金额 | fRebateMoney | number | Decimal |  |  | nullable |
| 202 | orderRebateMoney | 货补分摊金额 | fOrderRebateMoney | number | Decimal |  |  | nullable |
| 203 | cashRebateMoney | 返利直接抵现 | fcashRebateMoney | number | Decimal |  |  | nullable |
| 204 | rebateMoneyDomestic | 返利本币分摊金额 | fRebateMoney_domestic | number | Decimal |  |  | nullable |
| 205 | orderRebateMoneyDomestic | 本币货补分摊金额 | fOrderRebateMoney_domestic | number | Decimal |  |  | nullable |
| 206 | cashRebateMoneyDomestic | 返利本币直接抵现 | fCashRebateMoney_domestic | number | Decimal |  |  | nullable |
| 207 | rebateFlag | 是否使用返利 | rebateflag | switch | Boolean |  |  | nullable |
| 208 | isDeleted | 是否删除 | iDeleted | short | Short |  | Y | nullable |
| 209 | id | 表体行ID | id | long | Long |  |  | nullable,REF.ID |
| 210 | orderId | 订单主表id | iOrderId | long | Long |  |  | nullable |
| 211 | idKey | 行标识 | idKey | text | String |  |  | nullable |
| 212 | rebateDetailId | 返利单商品表体id | rebateDetailId | long | Long |  |  | nullable |
| 213 | productAuth | 物料权限 | iProductId | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 214 | erpCode | U8的ERP编码 | cErpCode | text | String |  |  | nullable |
| 215 | oldSalePayMoney | 历史小计 | oldSalePayMoney | number | Decimal |  |  | nullable |
| 216 | takeStockId | 收货仓库Id | iTakeStockId | long | Long |  |  | nullable |
| 217 | groupTaskKey | 分组任务KEY | groupTaskKey | text | String |  |  | nullable,reportHide |
| 218 | sourceOriPrice | 来源行成交价 | fSourceOriPrice | number | Decimal |  |  | nullable |
| 219 | settlementOrgId | 财务组织id | iSettlementOrgId | quote | org.func.FinanceOrg |  |  | data_auth,nullable |
| 220 | sourceMainPubts | 时间戳 | sourceMainPubts | timestamp | Timestamp |  |  | nullable,reportHide |
| 221 | alreadyQuantity | 已退货数量 | alreadyQuantity | number | Decimal |  |  | nullable |
| 222 | oldTransactionPrice | 历史成交价 | oldTransactionPrice | number | Decimal |  |  | nullable |
| 223 | rowno | 行号 | rowno | int | Integer |  |  | isCode,nullable |
| 224 | uordercorp | 租户 | iCorpId | long | Long |  | Y | nullable,reportHide |
| 225 | stockOutSysKey | 仓库唯一key | stockOutSysKey | text | String |  |  | nullable |
| 226 | conversionRate | 主辅换算率 | iConversionRate | number | Decimal |  |  | nullable |
| 227 | freeTaxUnitOffer | 无税报价 | fFreeTaxUnitOffer | number | Decimal |  |  | nullable |
| 228 | freeLineSaleCost | 报价无税金额 | fFreeLineSaleCost | number | Decimal |  |  | nullable |
| 229 | rebateEqMoney | 返利等价金额 | fRebateEqMoney | number | Decimal |  |  | nullable |
| 230 | rebateEqPrice | 返利等价单价 | fRebateEqPrice | number | Decimal |  |  | nullable |
| 231 | memo | 行备注 | cMemo | text | String |  |  | nullable |
| 232 | auxUnitQuantity | 辅计量数量 | iAuxUnitQuantity | number | Decimal |  |  | nullable |
| 233 | bodyFreeItem | 退货单表体自由自定义项 | - | - | voucher.salereturn.SaleReturnDetailFreeDefine |  |  |  |
| 234 | bodyItem | 退货单表体自定义项 | - | - | voucher.salereturn.SaleReturnDetailDefine |  |  |  |
| 235 | collaborationPocode | 协同来源单据号 | collaboration_pocode | text | String |  |  | nullable |
| 236 | collaborationPodetailid | 协同来源单据子表id | collaboration_podetailid | long | Long |  |  | nullable |
| 237 | collaborationPoid | 协同来源单据主表id | collaboration_poid | long | Long |  |  | nullable |
| 238 | collaborationPorowno | 协同来源单据行号 | collaboration_porowno | number | Decimal |  |  | nullable |
| 239 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 240 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 241 | invPriceExchRateDen | 计价换算率分母 | invpriceexchrateden | number | Decimal |  |  | nullable |
| 242 | invPriceExchRateNum | 计价换算率分子 | invpriceexchratenum | number | Decimal |  |  | nullable |
| 243 | ptoHierarchyType | 层级结构类型 | ptoHierarchyType | int | Integer |  |  | nullable |
| 244 | ptoPricingMethod | 定价方式 | ptoPricingMethod | int | Integer |  |  | nullable |
| 245 | returnQuantity | 退货数量 | fReturnQuantity | number | Decimal |  |  | nullable |
| 246 | throwStatus | 抛单状态 | throw_status | int | Integer |  |  | nullable |
| 247 | totalPurchaseReturnQty | 累计采购退货数量 | totalpurchasereturnqty | number | Decimal |  |  | nullable |

---

## Reference Fields (35)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | consumerProfitCenter | 需方利润中心 | consumer_profit_center | bd.virtualaccbody.VirtualAccbody |
| 2 | costCenter | 成本中心 | cost_center | bd.costcenter.CostCenter |
| 3 | deliverierId | 发货人 | iDeliverier | aa.merchant.AddressInfo |
| 4 | deliveryCustId | 退货客户 | iDeliveryCust | aa.merchant.Merchant |
| 5 | endAreaId | 目的地运输区域 | endAreaId | base.shipregion.ShipRegion |
| 6 | loadModeId | 装载方式 | loadModeId | base.loadway.LoadWay |
| 7 | logisticsOrgId | 物流组织 | logisticsOrgId | org.func.LogisticsOrg |
| 8 | planTransRouteId | 计划运输路线 | planTransRouteId | usp.plantransportroute.PlanTransportRoute |
| 9 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 10 | custodian | 保管者 | custodian | st.custodian.Custodian |
| 11 | productLineId | 产品线id | iProductLineId | pc.productline.ProductLine |
| 12 | goodsPositionId | 货位id | goodsPositionId | aa.goodsposition.GoodsPosition |
| 13 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 14 | ptoId | PTO件id | ptoId | pc.product.Product |
| 15 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 16 | tradeRouteID | 贸易路径Id | tradeRouteID | sccs.multitrade.TradeRoute |
| 17 | providerProfitCenter | 供方利润中心 | provider_profit_center | bd.virtualaccbody.VirtualAccbody |
| 18 | shipPointId | 收货点 | shipPointId | usp.sendAndReceiveSite.SendAndReceiveSite |
| 19 | saleReturnId | 退货单Id | iSaleReturnId | voucher.salereturn.SaleReturn |
| 20 | productId | 商品id | iProductId | pc.product.Product |
| 21 | skuId | 商品skuId | iSKUId | pc.product.ProductSKU |
| 22 | projectId | 项目id | cProjectId | bd.project.ProjectVO |
| 23 | taxId | 税目税率id | cTaxId | archive.taxArchives.TaxRateArchive |
| 24 | stockId | 仓库ID | iStockId | aa.warehouse.Warehouse |
| 25 | stockOrgId | 库存组织id | iStockOrgId | org.func.InventoryOrg |
| 26 | saleReturnDepartmentId | 退货部门id | iSaleReturnDepartmentId | bd.adminOrg.DeptOrgVO |
| 27 | iProductAuxUnitId | 销售单位id | iProductAuxUnitId | pc.unit.Unit |
| 28 | iProductUnitId | 计价单位id | iProductUnitId | pc.unit.Unit |
| 29 | masterUnitId | 主计量单位id | iMasterUnitId | pc.unit.Unit |
| 30 | salesOrgId | 销售组织id | iSalesOrgId | org.func.SalesOrg |
| 31 | agentProductId | 客户商品ID | agentProductId | sa.agent.AgentProductRelation |
| 32 | batchId | 批次id | iBatchId | st.batchno.Batchno |
| 33 | reserveid | 预留id | reserveid | st.reservation.Reservation |
| 34 | productAuth | 物料权限 | iProductId | pb.dataauth.ProductDataAuth |
| 35 | settlementOrgId | 财务组织id | iSettlementOrgId | org.func.FinanceOrg |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | bodyItem | 退货单表体自定义项 | voucher.salereturn.SaleReturnDetailDefine |
| 2 | bodyFreeItem | 退货单表体自由自定义项 | voucher.salereturn.SaleReturnDetailFreeDefine |
