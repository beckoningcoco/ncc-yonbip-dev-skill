---
tags: [BIP, metadata, voucher, DeliveryDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 发货单详情 (voucher.delivery.DeliveryDetail)

> Platform: BIP V5 | Module: voucher | Table: deliverydetail | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 发货单详情 |
| uri | voucher.delivery.DeliveryDetail |
| tableName | deliverydetail |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | uorder.voucher.UorderBizObject |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (30)

| # | Name | URI |
|---|------|-----|
| 1 | 计价换算比 (IUOMPriceExchRate) | gscm.itf.IUOMPriceExchRate |
| 2 | 换算比 (IUOMExchRate) | gscm.itf.IUOMExchRate |
| 3 | 生单回写 (IBackWrite) | base.itf.IBackWrite |
| 4 | 发票回写接口 (IInvoiceReWrite) | uorder.voucher.IInvoiceReWrite |
| 5 | 应付金额 (IRealMoney) | uorder.voucher.IRealMoney |
| 6 | 表体上游单据金额 (IUorderVoucherDetailCredit) | uorder.voucher.IUorderVoucherDetailCredit |
| 7 | 逻辑删除相关 (Deletable) | base.itf.Deletable |
| 8 | U订货租户相关 (IUordercorp) | base.itf.IUordercorp |
| 9 | 原币金额信息 (IOriMoneyInfo) | voucher.base.IOriMoneyInfo |
| 10 | 计价单位信息 (IUOMPriceInfo) | voucher.base.IUOMPriceInfo |
| 11 | 计量单位信息 (IUOMInfo) | voucher.base.IUOMInfo |
| 12 | 本币金额信息 (INatMoneyInfo) | voucher.base.INatMoneyInfo |
| 13 | 源头单据信息 (IFirstSourceData) | sale.aa.IFirstSourceData |
| 14 | 预留对象相关 (IReservationID) | st.reservation.IReservationID |
| 15 | 后端自动行号接口 (ILineNo) | base.itf.ILineNo |
| 16 | 来源单据行号接口 (IUpLineNo) | sale.aa.IUpLineNo |
| 17 | 财务成本中心 (CostCenter) | sale.aa.CostCenter |
| 18 | 财务利润中心 (ProfitCenter) | sale.aa.ProfitCenter |
| 19 | 伙伴表体接口 (ICustLine) | uorder.voucher.ICustLine |
| 20 | 特征适配相关信息 (CharacterInfo) | gscm.itf.CharacterInfo |
| 21 | 子业务源头单据信息 (ISubBusinessSourceData) | sale.aa.ISubBusinessSourceData |
| 22 | 协同单据信息 (ICoSourceData) | sale.aa.ICoSourceData |
| 23 | 自定义项(批次) (UserdefItemBatch) | base.itf.UserdefItemBatch |
| 24 | PTO信息 (IProductToOrder) | usp.pto.IProductToOrder |
| 25 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 26 | 项目结构属性 (projectStructureProperties) | BGDM.wbs.projectStructureProperties |
| 27 | 贸易路径Id接口 (ITradeRouteID) | sccs.multitrade.ITradeRouteID |
| 28 | 协同来源单据信息 (ICollaborationSourceData) | sale.aa.ICollaborationSourceData |
| 29 | 货主对象 (IInventoryOwner) | st.inventoryowner.IInventoryOwner |
| 30 | 货权归属 (IOwnerType) | st.inventoryowner.IOwnerType |

---

## All Fields (261)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | planIdForDeliveryArr | 发货计划行id标识 | planIdForDeliveryArr | long | Long |  |  | nullable |
| 2 | stockSensClue | 现存量特征敏感线索 | stockSensClue | text | String |  |  | nullable |
| 3 | consumerProfitCenter | 需方利润中心 | consumer_profit_center | quote | bd.virtualaccbody.VirtualAccbody |  |  | nullable |
| 4 | contractLot | 贸易合同批次 | contractLot | text | String |  |  | nullable |
| 5 | contractTpye | 合同类型 | contractTpye | text | String |  |  | nullable |
| 6 | corpContactUserName | 业务员姓名 | cCorpContactUserName | text | String |  |  | nullable |
| 7 | costCenter | 成本中心 | cost_center | quote | bd.costcenter.CostCenter |  |  | nullable |
| 8 | deliveryDetailCharacteristics | 自由项特征组 | deliveryDetailCharacteristics | FreeCT | voucher.delivery.DeliveryDetailCharacteristics |  |  | nullable |
| 9 | deliveryDetailDefineCharacter | 自定义项特征属性组 | deliveryDetailDefineCharacter | UserDefine | voucher.delivery.DeliveryDetailDefineCharacter |  |  | nullable |
| 10 | deliveryLot | 贸易合同交付批号 | deliveryLot | text | String |  |  | nullable |
| 11 | detailSaleDepartmentName | 销售部门 | cSaleDepartmentName | text | String |  |  | nullable |
| 12 | detailSalesOrgName | 销售组织 | cSalesOrgName | text | String |  |  | nullable |
| 13 | detailSettlementOrgName | 财务组织 | cSettlementOrgName | text | String |  |  | nullable |
| 14 | detailStockOrgName | 库存组织 | cStockOrgName | text | String |  |  | nullable |
| 15 | merchAddrAutoSynFlag | 收货信息自动建档 | iMerchAddrAutoSynFlag | switch | Boolean |  |  | nullable |
| 16 | overflowRate | 溢装率% | overflowRate | number | Decimal |  |  | nullable |
| 17 | productAuxUnitName | 辅助计量单位名称 | cProductAuxUnitName | text | String |  |  | nullable |
| 18 | productCode | 商品编码 | cProductCode | text | String |  |  | nullable |
| 19 | productName | 商品名称 | cProductName | text | String |  |  | nullable |
| 20 | productUnitName | 计价单位名称 | cProductUnitName | text | String |  |  | nullable |
| 21 | projectCode | 项目编码 | cProjectCode | text | String |  |  | nullable |
| 22 | projectId | 项目projectId | cProjectId | quote | bd.project.ProjectVO |  |  | dataPowerFlag,data_auth,nullable |
| 23 | projectName | 项目名称 | cProjectName | text | String |  |  | nullable |
| 24 | providerProfitCenter | 供方利润中心 | provider_profit_center | quote | bd.virtualaccbody.VirtualAccbody |  |  | nullable |
| 25 | checkByRevenueManagement | 收入管理核算 | revmanagecalculate | switch | Boolean |  |  | nullable |
| 26 | qualityCertificateFlag | 已生成质证书 | qualityCertificateFlag | switch | Boolean |  |  | nullable |
| 27 | throwStatus | 抛单状态 | throw_status | int | Integer |  |  | nullable |
| 28 | excessiveSigning | 超量签收 | excessivesigning | short | Short |  |  | nullable |
| 29 | inventoryowner | 货主对象Id | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 30 | ownertype | 货权归属 | ownertype | int | Integer |  |  | nullable |
| 31 | emergePassApplyQty | 紧急放行申请数量 | emergepassapplyqty | number | Decimal |  |  | nullable |
| 32 | outStockQty | 检验可出库数量 | outStockQty | number | Decimal |  |  | nullable |
| 33 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 34 | tradeRouteLineno | 站点 | tradeRouteLineno | number | Decimal |  |  | nullable |
| 35 | isEndTrade | 是否末级 | isEndTrade | short | Short |  |  | nullable |
| 36 | inspectionType | 检验 | inspectionType | switch | Boolean |  |  | nullable |
| 37 | subBusinessSourceId | 子业务源头单据id | subBusinessSourceId | long | Long |  |  | nullable |
| 38 | ptoQty | PTO件底数 | ptoQty | number | Decimal |  |  | nullable |
| 39 | ptoCostScrap | 成本比例 | ptoCostScrap | number | Decimal |  |  | nullable |
| 40 | ptoRowId | PTO件行id | ptoRowId | long | Long |  |  | nullable |
| 41 | goodsPositionId | 货位id | goodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 42 | collaborationPoid | 协同来源单据主表id | collaboration_poid | long | Long |  |  | nullable |
| 43 | coSourceLineNo | 协同源头单据行号 | coSourceLineNo | number | Decimal |  |  | nullable |
| 44 | subBusinessSourceLineNo | 子业务源头单据行号 | subBusinessSourceLineNo | number | Decimal |  |  | nullable |
| 45 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 46 | coSourceType | 协同源头单据类型 | cCoSourceType | text | String |  |  | nullable |
| 47 | subBusinessSourceType | 子业务源头单据类型 | subBusinessSourceType | text | String |  |  | nullable |
| 48 | sacoLineno | 合同行号 | sacoLineno | number | Decimal |  |  | nullable |
| 49 | emergePassClearanceQty | 紧急放行通过数量 | emergepassclearanceqty | number | Decimal |  |  | nullable |
| 50 | coSourceid | 协同源头单据头id | iCoSourceid | long | Long |  |  | nullable |
| 51 | ptoId | PTO件id | ptoId | quote | pc.product.Product |  |  | nullable |
| 52 | totalPlCheckQty | 累计请检数量 | totalPlCheckQty | number | Decimal |  |  | nullable |
| 53 | coSourceautoid | 协同源头单据行id | iCoSourceautoid | long | Long |  |  | nullable |
| 54 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 55 | collaborationSource | 协同来源单据类型 | collaboration_source | text | String |  |  | nullable |
| 56 | orderDetailLineno | 订单行号 | orderDetailLineno | number | Decimal |  |  | nullable |
| 57 | favorableRate | 倒扣 | fFavorableRate | number | Decimal |  |  | nullable |
| 58 | ptoSonQty | PTO子件主数量 | ptoSonQty | number | Decimal |  |  | nullable |
| 59 | notStockQty | 检验不可出库数量 | notStockQty | number | Decimal |  |  | nullable |
| 60 | taxIssuedDiscountline | 税票开具折扣行 | taxIssuedDiscountline | switch | Boolean |  |  | nullable |
| 61 | emergePassStatus | 紧急放行状态 | emergePassStatus | short | Short |  |  | nullable |
| 62 | totalInspectQty | 累计检验数量 | totalInspectQty | number | Decimal |  |  | nullable |
| 63 | tradeRouteID | 贸易路径Id | tradeRouteID | quote | sccs.multitrade.TradeRoute |  |  | nullable |
| 64 | collaborationPorowno | 协同来源单据行号 | collaboration_porowno | number | Decimal |  |  | nullable |
| 65 | subBusinessSourceLineId | 子业务源头单据行id | subBusinessSourceLineId | long | Long |  |  | nullable |
| 66 | collaborationPocode | 协同来源单据号 | collaboration_pocode | text | String |  |  | nullable |
| 67 | subBusinessSourceNo | 子业务源头单据号 | subBusinessSourceNo | text | String |  |  | nullable |
| 68 | coUpcode | 协同源头单据号 | cCoUpcode | text | String |  |  | nullable |
| 69 | collaborationPodetailid | 协同来源单据子表id | collaboration_podetailid | long | Long |  |  | nullable |
| 70 | receiveCode | 收货地址编码 | iReceiveCode | text | String |  |  | nullable |
| 71 | qtyName | 主计量单位(201907011 add 适配 u8c) | cMasterUnitMeasure | text | String |  |  | nullable |
| 72 | receiveAddress | 收货地址 | iReceiveAddress | text | String |  |  | nullable |
| 73 | receiveMobile | 收货电话 | iReceiveMobile | text | String |  |  | nullable |
| 74 | receiveStoreId | 收货终端网点 | iReceiveStore | quote | aa.store.Store |  |  | nullable |
| 75 | receiveTelePhone | 收货人固定电话 | iReceiveTelePhone | text | String |  |  | nullable |
| 76 | receiveZipCode | 收货人邮编 | iReceiveZipCode | text | String |  |  | nullable |
| 77 | receiver | 收货人 | cReceiver | text | String |  |  | nullable |
| 78 | receiverCustId | 收货客户 | iReceiverCust | quote | aa.merchant.Merchant |  |  | dataPowerFlag,data_auth,nullable |
| 79 | receiverId | 收货人 | iReceiver | quote | aa.merchant.AddressInfo |  |  | nullable |
| 80 | skuCode | 商品sku编码 | cSkuCode | text | String |  |  | nullable |
| 81 | stockName | 发货仓库 | cStockName | text | String |  |  | nullable |
| 82 | detailDeliveryplanId | 上游发货计划id | iDeliveryplanId | long | Long |  |  | nullable |
| 83 | discountRate | 扣率 | fDiscountRate | number | Decimal |  |  | nullable |
| 84 | lineDiscountMoney | 扣额 | fLineDiscountMoney | number | Decimal |  |  | nullable |
| 85 | lineNatDiscountMoney | 本币扣额 | fLineNatDiscountMoney | number | Decimal |  |  | nullable |
| 86 | lineSaleCost | 含税报价金额 | fLineSaleCost | number | Decimal |  |  | nullable |
| 87 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 88 | oriTaxUnitOffer | 含税报价 | fOriTaxUnitOffer | number | Decimal |  |  | nullable |
| 89 | deliveryId | 发货单ID | iDeliveryId | quote | voucher.delivery.DeliveryVoucher |  |  | nullable |
| 90 | orderNo | 来源单据号 | cOrderNo | text | String |  |  | nullable |
| 91 | orderDetailId | 来源单据行id | iOrderDetailId | long | Long |  |  | nullable |
| 92 | orderDetailIdKey | 来源单据idkey | cOrderDetailIdKey | text | String |  |  | nullable |
| 93 | sourceid | 来源单据ID | sourceid | long | Long |  |  | nullable |
| 94 | sourceautoid | 来源单据子表ID | sourceautoid | long | Long |  |  | nullable |
| 95 | source | 来源单据类型 | source | text | String |  |  | nullable,reportHide |
| 96 | makeRuleCode | 生单类型编码 | makerule_code | text | String |  |  | nullable,reportHide |
| 97 | upcode | 来源单据号 | cSrcVoucherNo | text | String |  |  | nullable |
| 98 | erpCode | erp编码 | cErpCode | text | String |  |  | nullable |
| 99 | skuId | SKUId | iSKUId | quote | pc.product.ProductSKU |  |  | nullable |
| 100 | specDescription | 规格 | cSpecDescription | text | String |  |  | nullable |
| 101 | subQty | 发货数量 | iAuxUnitQuantity | number | Decimal |  |  | nullable |
| 102 | invExchRate | 销售换算率 | fAuxExchangeRate | number | Decimal |  |  | nullable |
| 103 | productAuxUnitId | 销售单位id | iProductAuxUnitId | quote | pc.unit.Unit |  |  | nullable |
| 104 | priceQty | 计价数量 | iSendQuantity | number | Decimal |  |  | nullable |
| 105 | invPriceExchRate | 计价换算率 | fMainExchangeRate | number | Decimal |  |  | nullable |
| 106 | productUnitId | 计价单位id | iProductUnitId | quote | pc.unit.Unit |  |  | nullable |
| 107 | masterUnitId | 主计量单位id | iMasterUnitId | quote | pc.unit.Unit |  |  | nullable |
| 108 | qty | 数量 | fMasterMeasureQuantity | number | Decimal |  |  | nullable |
| 109 | salePrice | 含税原始报价 | fSalePrice | number | Decimal |  |  | nullable |
| 110 | oriTaxUnitPrice | 含税单价 | fTransactionPrice | number | Decimal |  |  | nullable |
| 111 | oriSum | 含税金额 | fSalePayMoney | number | Decimal |  |  | nullable |
| 112 | orderProductType | 商品售卖类型 | cOrderProductType | text | String |  |  | nullable |
| 113 | idKey | idKey | idKey | text | String |  |  | nullable |
| 114 | groupId | 分组ID | iGroupId | long | Long |  |  | nullable |
| 115 | productId | 商品id | iProductId | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable |
| 116 | outSysKey | 接口标识 | cOutSysKey | text | String |  |  | nullable |
| 117 | created | 创建时间 | dCreated | date | Date |  |  | nullable |
| 118 | sendDate | 计划发货日期 | dSendDate | date | Date |  |  | nullable |
| 119 | stockId | 发货仓库id | iStockId | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 120 | invalidDate | 有效期至 | dValidDate | timestamp | Timestamp |  |  | nullable |
| 121 | batchNo | 批次号 | cBatchNo | text | String |  |  | nullable |
| 122 | productDate | 生产日期 | dProductDate | timestamp | Timestamp |  |  | nullable |
| 123 | isBatchManage | 是否批次管理 | bBatchManage | switch | Boolean |  |  | nullable |
| 124 | isExpiryDateManage | 是否有效期管理 | bExpiryDateManage | switch | Boolean |  |  | nullable |
| 125 | expireDateNo | 保质期 | iExpireDateNo | int | Integer |  |  | nullable |
| 126 | expireDateUnit | 保质期单位 | cExpireDateUnit | text | String |  |  | nullable |
| 127 | batchId | 批次id | iBatchId | quote | st.batchno.Batchno |  |  | nullable |
| 128 | remark | 行备注 | cRemark | text | String |  |  | nullable |
| 129 | enable | 是否有效 | bEnable | switch | Boolean |  |  | nullable |
| 130 | bizProductId | 商家商品id | iBizProductId | long | Long |  |  | nullable |
| 131 | pubts | 时间戳(表体) | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 132 | corpContact | 销售业务员 | iCorpContactId | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,nullable |
| 133 | corpContactUserErpCode | 业务员erp编码 | cCorpContactUserErpCode | text | String |  |  | nullable |
| 134 | detailStockOrgId | 库存组织id | iStockOrgId | quote | org.func.InventoryOrg |  |  | nullable |
| 135 | detailSettlementOrgId | 开票组织id | iSettlementOrgId | quote | org.func.FinanceOrg |  |  | dataPowerFlag,data_auth,nullable |
| 136 | detailSalesOrgId | 销售组织 | iSalesOrgId | quote | org.func.SalesOrg |  |  | dataPowerFlag,data_auth,nullable |
| 137 | detailSaleDepartmentId | 销售部门id | iSaleDepartmentId | quote | bd.adminOrg.DeptOrgVO |  |  | dataPowerFlag,data_auth,nullable |
| 138 | taxItems | 税目 | cTaxItems | text | String |  |  | nullable |
| 139 | taxRate | 税率 | fTaxRate | number | Decimal |  |  | nullable |
| 140 | taxCode | 税率编码 | cTaxCode | text | String |  |  | nullable |
| 141 | taxId | 税目税率id | iTaxId | quote | archive.taxArchives.TaxRateArchive |  |  | nullable |
| 142 | unitExchangeType | 浮动换算率(销售) | unitExchangeType | int | Integer |  |  | nullable |
| 143 | unitExchangeTypePrice | 浮动换算率(计价) | unitExchangeTypePrice | int | Integer |  |  | nullable |
| 144 | totalOutStockQuantity | 累计出库数量 | fOutStockQuantity | number | Decimal |  |  | nullable |
| 145 | totalOutStockSubQty | 累计出库件数 | fTotalOutStockSubQty | number | Decimal |  |  | nullable |
| 146 | totalOutStockOriTaxMoney | 累计出库含税金额 | fTotalOutStockOriTaxMoney | number | Decimal |  |  | nullable |
| 147 | totalOutStockOriMoney | 累计出库无税金额 | fTotalOutStockOriMoney | number | Decimal |  |  | nullable |
| 148 | totalOutStockOriTax | 累计出库税额 | fTotalOutStockOriTax | number | Decimal |  |  | nullable |
| 149 | invoiceQty | 累计开票数量 | fInvoiceQty | number | Decimal |  |  | nullable |
| 150 | invoiceOriSum | 累计开票含税金额 | fInvoiceOriSum | number | Decimal |  |  | nullable |
| 151 | totalSaleInvoiceOriMoney | 累计开票无税金额 | fTotalSaleInvoiceOriMoney | number | Decimal |  |  | nullable |
| 152 | totalSaleInvoiceOriTax | 累计开票税额 | fTotalSaleInvoiceOriTax | number | Decimal |  |  | nullable |
| 153 | uplineno | 来源单据行号 | uplineno | number | Decimal |  |  | nullable |
| 154 | actDelivQty | 实发数量-废弃 | actDelivQty | number | Decimal |  |  | nullable |
| 155 | actDelivSubQty | 实发销售数量-废弃 | actDelivSubQty | number | Decimal |  |  | nullable |
| 156 | actDelivPriceQty | 实发计价数量-废弃 | actDelivPriceQty | number | Decimal |  |  | nullable |
| 157 | isUpdateCost | 是否更新存货 | isUpdateCost | switch | Boolean |  |  | nullable |
| 158 | isScrap | 是否废品 | isScrap | switch | Boolean |  |  | nullable |
| 159 | receivedBilling | 签收后开票 | receivedBilling | switch | Boolean |  |  | nullable |
| 160 | loadModeId | 装载方式id | loadModeId | quote | base.loadway.LoadWay |  |  | nullable |
| 161 | tailDifferenceMoney | 尾差金额 | fTailDifferenceMoney | number | Decimal |  |  | nullable |
| 162 | sourceOriPrice | 来源含税单价 | fSourceOriPrice | number | Decimal |  |  | nullable |
| 163 | define1 | 批次属性1 | define1 | text | String |  |  | isGlobalization,nullable |
| 164 | define2 | 批次属性2 | define2 | text | String |  |  | isGlobalization,nullable |
| 165 | define3 | 批次属性3 | define3 | text | String |  |  | isGlobalization,nullable |
| 166 | define4 | 批次属性4 | define4 | text | String |  |  | isGlobalization,nullable |
| 167 | define5 | 批次属性5 | define5 | text | String |  |  | isGlobalization,nullable |
| 168 | define6 | 批次属性6 | define6 | text | String |  |  | isGlobalization,nullable |
| 169 | define7 | 批次属性7 | define7 | text | String |  |  | isGlobalization,nullable |
| 170 | define8 | 批次属性8 | define8 | text | String |  |  | isGlobalization,nullable |
| 171 | define9 | 批次属性9 | define9 | text | String |  |  | isGlobalization,nullable |
| 172 | define10 | 批次属性10 | define10 | text | String |  |  | isGlobalization,nullable |
| 173 | define11 | 批次属性11 | define11 | text | String |  |  | isGlobalization,nullable |
| 174 | define12 | 批次属性12 | define12 | text | String |  |  | isGlobalization,nullable |
| 175 | define13 | 批次属性13 | define13 | text | String |  |  | isGlobalization,nullable |
| 176 | define14 | 批次属性14 | define14 | text | String |  |  | isGlobalization,nullable |
| 177 | define15 | 批次属性15 | define15 | text | String |  |  | isGlobalization,nullable |
| 178 | define16 | 批次属性16 | define16 | text | String |  |  | isGlobalization,nullable |
| 179 | define17 | 批次属性17 | define17 | text | String |  |  | isGlobalization,nullable |
| 180 | priceMark | 价格标识 | iPriceMark | switch | Boolean |  |  | nullable |
| 181 | define18 | 批次属性18 | define18 | text | String |  |  | isGlobalization,nullable |
| 182 | define19 | 批次属性19 | define19 | text | String |  |  | isGlobalization,nullable |
| 183 | define20 | 批次属性20 | define20 | text | String |  |  | isGlobalization,nullable |
| 184 | define21 | 批次属性21 | define21 | text | String |  |  | isGlobalization,nullable |
| 185 | define22 | 批次属性22 | define22 | text | String |  |  | isGlobalization,nullable |
| 186 | define23 | 批次属性23 | define23 | text | String |  |  | isGlobalization,nullable |
| 187 | define24 | 批次属性24 | define24 | text | String |  |  | isGlobalization,nullable |
| 188 | define25 | 批次属性25 | define25 | text | String |  |  | isGlobalization,nullable |
| 189 | define26 | 批次属性26 | define26 | text | String |  |  | isGlobalization,nullable |
| 190 | define27 | 批次属性27 | define27 | text | String |  |  | isGlobalization,nullable |
| 191 | define28 | 批次属性28 | define28 | text | String |  |  | isGlobalization,nullable |
| 192 | define29 | 批次属性29 | define29 | text | String |  |  | isGlobalization,nullable |
| 193 | define30 | 批次属性30 | define30 | text | String |  |  | isGlobalization,nullable |
| 194 | realMoney | 应付金额 | fRealMoney | number | Decimal |  |  | nullable |
| 195 | totalVarianceQty | 累计签收差异数量 | totalVarianceQty | number | Decimal |  |  | nullable |
| 196 | firstlineno | 源头单据行号 | firstlineno | number | Decimal |  |  | nullable |
| 197 | agentProductId | 客户商品ID | agentProductId | quote | sa.agent.AgentProductRelation |  |  | nullable |
| 198 | firstsourceid | 源头单据主表id | firstsourceid | long | Long |  |  | nullable |
| 199 | firstsourceautoid | 源头单据子表id | firstsourceautoid | long | Long |  |  | nullable |
| 200 | firstsource | 源头单据类型 | firstsource | text | String |  |  | nullable |
| 201 | firstupcode | 源头单据号 | firstupcode | text | String |  |  | nullable |
| 202 | sactId | 合同ID | sactid | long | Long |  |  | nullable |
| 203 | sacoId | 合同行ID | sacoid | long | Long |  |  | nullable |
| 204 | sactCode | 合同编码 | sactcode | text | String |  |  | nullable |
| 205 | totalOutStockPriceQty | 累计出库计价数量 | fTotalOutStockPriceQty | number | Decimal |  |  | nullable |
| 206 | isreserve | 是否预留 | isreserve | switch | Boolean |  |  | nullable |
| 207 | reserveid | 预留id | reserveid | quote | st.reservation.Reservation |  |  | nullable |
| 208 | reserveidDemandtype | 需求跟踪方式 | reserveidDemandtype | text | String |  |  | nullable |
| 209 | isSkuReserve | 商品是否预留 | isSkuReserve | switch | Boolean |  |  | nullable |
| 210 | rebateMoney | 返利分摊金额 | fRebateMoney | number | Decimal |  |  | nullable |
| 211 | orderRebateMoney | 货补分摊金额 | fOrderRebateMoney | number | Decimal |  |  | nullable |
| 212 | cashRebateMoney | 返利直接抵现 | fcashRebateMoney | number | Decimal |  |  | nullable |
| 213 | rebateFlag | 是否使用返利 | rebateflag | switch | Boolean |  |  | nullable |
| 214 | stopQty | 终止数量 | stopQty | number | Decimal |  |  | nullable |
| 215 | stopSubQty | 终止销售数量 | stopSubQty | number | Decimal |  |  | nullable |
| 216 | stopPriceQty | 终止计价数量 | stopPriceQty | number | Decimal |  |  | nullable |
| 217 | stopMoney | 终止含税金额 | stopMoney | number | Decimal |  |  | nullable |
| 218 | stopper | 终止人 | cStopper | text | String |  |  | nullable |
| 219 | stopTime | 终止时间 | dStop_time | timestamp | Timestamp |  |  | nullable |
| 220 | id | 主体ID | id | long | Long |  |  | nullable,REF.ID |
| 221 | orderId | 来源订单id | iOrderId | long | Long |  |  | nullable |
| 222 | rebateDetailId | 返利单商品表体id | rebateDetailId | long | Long |  |  | nullable |
| 223 | saleReturnQty | 累计退货数量 | fSaleReturnQty | number | Decimal |  |  | nullable |
| 224 | natSum | 本币含税金额 | natSum | number | Decimal |  |  | nullable |
| 225 | productAuth | 物料权限 | iProductId | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 226 | isDeleted | 逻辑删除标记 | iDeleted | switch | Boolean |  | Y | nullable |
| 227 | saleReturnMoney | 累计退货含税金额 | fSaleReturnMoney | number | Decimal |  |  | nullable |
| 228 | natMoney | 本币无税金额 | natMoney | number | Decimal |  |  | nullable |
| 229 | groupTaskKey | 分组任务KEY | groupTaskKey | text | String |  |  | nullable,reportHide |
| 230 | deliveredQuantity | 已发货数量 | deliveredQuantity | number | Decimal |  |  | nullable |
| 231 | sendQuantity | 发货数量 | iSendQuantity | number | Decimal |  |  | nullable |
| 232 | receivedQuantity | 已收货数量 | iReceivedQuantity | number | Decimal |  |  | nullable |
| 233 | deliveryStockId | 收货仓库id | iDeliveryStockId | long | Long |  |  | nullable |
| 234 | natUnitPrice | 本币无税单价 | natUnitPrice | number | Decimal |  |  | nullable |
| 235 | sourceMainPubts | 时间戳 | sourceMainPubts | timestamp | Timestamp |  |  | nullable,reportHide |
| 236 | totalSaleInvoiceOriTaxMoney | 累计开票含税金额 | fTotalSaleInvoiceOriTaxMoney | number | Decimal |  |  | nullable |
| 237 | natTaxUnitPrice | 本币含税单价 | natTaxUnitPrice | number | Decimal |  |  | nullable |
| 238 | oriTax | 原币税额 | oriTax | number | Decimal |  |  | nullable |
| 239 | deliveryDetailPrice | 发货单行金额 | iDeliveryDetailPriceId | quote | voucher.delivery.DeliveryDetailPrice |  |  | nullable |
| 240 | totalSaleInvoiceQuantity | 累计开票数量-废弃 | fTotalSaleInvoiceQuantity | number | Decimal |  |  | nullable |
| 241 | deliveryStockName | 收货仓库 | cDeliveryStockName | text | String |  |  | nullable |
| 242 | uordercorp | 租户 | iCorpId | long | Long |  | Y | nullable,reportHide |
| 243 | natTax | 本币税额 | natTax | number | Decimal |  |  | nullable |
| 244 | oriUnitPrice | 原币无税单价 | oriUnitPrice | number | Decimal |  |  | nullable |
| 245 | oriMoney | 原币无税金额 | oriMoney | number | Decimal |  |  | nullable |
| 246 | saleCost | 合计金额 | fSaleCost | number | Decimal |  |  | nullable |
| 247 | conversionRate | 换算率 | iConversionRate | number | Decimal |  |  | nullable |
| 248 | auxUnitQuantity | 辅计量数量 | iAuxUnitQuantity | number | Decimal |  |  | nullable |
| 249 | bodyFreeItem | 销售发货单表体自由自定义项 | - | - | voucher.delivery.DeliveryDetailFreeItem |  |  |  |
| 250 | bodyItem | 销售发货单表体自定义项 | - | - | voucher.delivery.DeliveryDetailCustomItem |  |  |  |
| 251 | deliveryDetailPrices | 发货单行金额 | - | - | voucher.delivery.DeliveryDetailPrice |  |  |  |
| 252 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 253 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 254 | invPriceExchRateDen | 计价换算率分母 | invpriceexchrateden | number | Decimal |  |  | nullable |
| 255 | invPriceExchRateNum | 计价换算率分子 | invpriceexchratenum | number | Decimal |  |  | nullable |
| 256 | ptoHierarchyType | 层级结构类型 | ptoHierarchyType | int | Integer |  |  | nullable |
| 257 | ptoPricingMethod | 定价方式 | ptoPricingMethod | int | Integer |  |  | nullable |
| 258 | salePayMoney | 金额小计 | fSalePayMoney | number | Decimal |  |  | nullable |
| 259 | totalSettledOriSum | 累计价格结算含税金额 | totalsettledorisum | number | Decimal |  |  | nullable |
| 260 | totalSettledQuantity | 累计价格结算数量 | totalsettledquantity | number | Decimal |  |  | nullable |
| 261 | transactionPrice | 成交价 | fTransactionPrice | number | Decimal |  |  | nullable |

---

## Reference Fields (33)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | consumerProfitCenter | 需方利润中心 | consumer_profit_center | bd.virtualaccbody.VirtualAccbody |
| 2 | costCenter | 成本中心 | cost_center | bd.costcenter.CostCenter |
| 3 | projectId | 项目projectId | cProjectId | bd.project.ProjectVO |
| 4 | providerProfitCenter | 供方利润中心 | provider_profit_center | bd.virtualaccbody.VirtualAccbody |
| 5 | inventoryowner | 货主对象Id | inventoryowner | st.inventoryowner.InventoryOwner |
| 6 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 7 | goodsPositionId | 货位id | goodsPositionId | aa.goodsposition.GoodsPosition |
| 8 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 9 | ptoId | PTO件id | ptoId | pc.product.Product |
| 10 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 11 | tradeRouteID | 贸易路径Id | tradeRouteID | sccs.multitrade.TradeRoute |
| 12 | receiveStoreId | 收货终端网点 | iReceiveStore | aa.store.Store |
| 13 | receiverCustId | 收货客户 | iReceiverCust | aa.merchant.Merchant |
| 14 | receiverId | 收货人 | iReceiver | aa.merchant.AddressInfo |
| 15 | deliveryId | 发货单ID | iDeliveryId | voucher.delivery.DeliveryVoucher |
| 16 | skuId | SKUId | iSKUId | pc.product.ProductSKU |
| 17 | productAuxUnitId | 销售单位id | iProductAuxUnitId | pc.unit.Unit |
| 18 | productUnitId | 计价单位id | iProductUnitId | pc.unit.Unit |
| 19 | masterUnitId | 主计量单位id | iMasterUnitId | pc.unit.Unit |
| 20 | productId | 商品id | iProductId | pc.product.Product |
| 21 | stockId | 发货仓库id | iStockId | aa.warehouse.Warehouse |
| 22 | batchId | 批次id | iBatchId | st.batchno.Batchno |
| 23 | corpContact | 销售业务员 | iCorpContactId | bd.staff.Staff |
| 24 | detailStockOrgId | 库存组织id | iStockOrgId | org.func.InventoryOrg |
| 25 | detailSettlementOrgId | 开票组织id | iSettlementOrgId | org.func.FinanceOrg |
| 26 | detailSalesOrgId | 销售组织 | iSalesOrgId | org.func.SalesOrg |
| 27 | detailSaleDepartmentId | 销售部门id | iSaleDepartmentId | bd.adminOrg.DeptOrgVO |
| 28 | taxId | 税目税率id | iTaxId | archive.taxArchives.TaxRateArchive |
| 29 | loadModeId | 装载方式id | loadModeId | base.loadway.LoadWay |
| 30 | agentProductId | 客户商品ID | agentProductId | sa.agent.AgentProductRelation |
| 31 | reserveid | 预留id | reserveid | st.reservation.Reservation |
| 32 | productAuth | 物料权限 | iProductId | pb.dataauth.ProductDataAuth |
| 33 | deliveryDetailPrice | 发货单行金额 | iDeliveryDetailPriceId | voucher.delivery.DeliveryDetailPrice |

---

## Child Tables (3)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | deliveryDetailPrices | 发货单行金额 | voucher.delivery.DeliveryDetailPrice |
| 2 | bodyItem | 销售发货单表体自定义项 | voucher.delivery.DeliveryDetailCustomItem |
| 3 | bodyFreeItem | 销售发货单表体自由自定义项 | voucher.delivery.DeliveryDetailFreeItem |
