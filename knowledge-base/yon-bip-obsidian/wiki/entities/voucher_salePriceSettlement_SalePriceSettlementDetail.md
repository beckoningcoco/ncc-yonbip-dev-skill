---
tags: [BIP, metadata, voucher, SalePriceSettlementDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售价格结算单明细 (voucher.salePriceSettlement.SalePriceSettlementDetail)

> Platform: BIP V5 | Module: voucher | Table: voucher_salepricesettlementdetail | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 销售价格结算单明细 |
| uri | voucher.salePriceSettlement.SalePriceSettlementDetail |
| tableName | voucher_salepricesettlementdetail |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | uorder.voucher.UorderVouchLine |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (13)

| # | Name | URI |
|---|------|-----|
| 1 | 财务成本中心 (CostCenter) | sale.aa.CostCenter |
| 2 | 财务利润中心 (ProfitCenter) | sale.aa.ProfitCenter |
| 3 | 后端自动行号接口 (ILineNo) | base.itf.ILineNo |
| 4 | 签收确认单据信息 (IReceiptData) | sale.aa.IReceiptData |
| 5 | 来源单据行号接口 (IUpLineNo) | sale.aa.IUpLineNo |
| 6 | 源头单据信息 (IFirstSourceData) | sale.aa.IFirstSourceData |
| 7 | 协同单据信息 (ICoSourceData) | sale.aa.ICoSourceData |
| 8 | 协同来源单据信息 (ICollaborationSourceData) | sale.aa.ICollaborationSourceData |
| 9 | 子业务源头单据信息 (ISubBusinessSourceData) | sale.aa.ISubBusinessSourceData |
| 10 | 统一租户接口 (IYTenant) | ucfbase.ucfbaseItf.IYTenant |
| 11 | 生单回写 (IBackWrite) | base.itf.IBackWrite |
| 12 | 换算比 (IUOMExchRate) | gscm.itf.IUOMExchRate |
| 13 | 计价换算比 (IUOMPriceExchRate) | gscm.itf.IUOMPriceExchRate |

---

## All Fields (159)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | mainid | 主表ID | mainid | quote | voucher.salePriceSettlement.SalePriceSettlement |  |  | nullable |
| 2 | productId | 商品Id | productid | quote | pc.product.Product |  |  | data_auth,nullable |
| 3 | skuId | skuId | skuid | quote | pc.product.ProductSKU |  |  | nullable |
| 4 | agentProductId | 客户商品对照 | agentproductid | quote | sa.agent.AgentProductRelation |  |  | nullable |
| 5 | salePriceSettlementDetailCharacteristics | 自由项特征组 | salepricesettlementdetailcharacteristics | FreeCT | voucher.salePriceSettlement.SalePriceSettlementDetailCharacteristics |  |  | nullable |
| 6 | invProductType | 商品售卖类型 | invproducttype | text | String |  |  | nullable |
| 7 | qualityPriceSchemeId | 优质优价方案 | qualitypriceschemeid | quote | aa.qualitypricescheme.QualitypriceScheme |  |  | nullable |
| 8 | calculateSource | 结算计量来源 | calculatesource | text | String |  |  | nullable |
| 9 | checkSource | 结算检验来源 | checksource | text | String |  |  | nullable |
| 10 | baseOriUnitPrice | 基准单价 | baseoriunitprice | number | Decimal |  |  | nullable |
| 11 | baseOriSum | 基准金额 | baseorisum | number | Decimal |  |  | nullable |
| 12 | basePriceQty | 基准计价数量 | basepriceqty | number | Decimal |  |  | nullable |
| 13 | inspectionDeductQty | 质检扣重 | inspectiondeductqty | number | Decimal |  |  | nullable |
| 14 | inspectionDeductPrice | 质检扣价 | inspectiondeductprice | number | Decimal |  |  | nullable |
| 15 | settlementQty | 结算数量 | settlementqty | number | Decimal |  |  | nullable |
| 16 | settlementSubQty | 结算销售数量 | settlementsubqty | number | Decimal |  |  | nullable |
| 17 | settlementPriceQty | 结算计价数量 | settlementpriceqty | number | Decimal |  |  | nullable |
| 18 | settlementOriTaxUnitPrice | 结算含税单价 | settlementoritaxunitprice | number | Decimal |  |  | nullable |
| 19 | settlementOriUnitPrice | 结算无税单价 | settlementoriunitprice | number | Decimal |  |  | nullable |
| 20 | settlementOriSum | 结算含税金额 | settlementorisum | number | Decimal |  |  | nullable |
| 21 | settlementOriMoney | 结算无税金额 | settlementorimoney | number | Decimal |  |  | nullable |
| 22 | settlementOriTax | 结算税额 | settlementoritax | number | Decimal |  |  | nullable |
| 23 | settlementNatTaxUnitPrice | 本币结算含税单价 | settlementnattaxunitprice | number | Decimal |  |  | nullable |
| 24 | settlementNatUnitPrice | 本币结算无税单价 | settlementnatunitprice | number | Decimal |  |  | nullable |
| 25 | settlementNatSum | 本币结算含税金额 | settlementnatsum | number | Decimal |  |  | nullable |
| 26 | settlementNatMoney | 本币结算无税金额 | settlementnatmoney | number | Decimal |  |  | nullable |
| 27 | settlementNatTax | 本币结算税额 | settlementnattax | number | Decimal |  |  | nullable |
| 28 | unitId | 主计量单位Id | unitid | quote | pc.unit.Unit |  |  | nullable |
| 29 | receivedQty | 签收数量 | receivedqty | number | Decimal |  |  | nullable |
| 30 | qty | 数量 | mastermeasurequantity | number | Decimal |  |  | nullable |
| 31 | chargeUnitId | 计价单位Id | chargeunitid | quote | pc.unit.Unit |  |  | nullable |
| 32 | priceQty | 计价数量 | priceqty | number | Decimal |  |  | nullable |
| 33 | invPriceExchRate | 计价换算率 | invpriceexchrate | number | Decimal |  |  | nullable |
| 34 | salesUnitId | 销售单位Id | salesunitid | quote | pc.unit.Unit |  |  | nullable |
| 35 | subQty | 销售数量 | subqty | number | Decimal |  |  | nullable |
| 36 | invExchRate | 销售换算率 | invexchrate | number | Decimal |  |  | nullable |
| 37 | unitExchangeTypePrice | 浮动(计价) | unitExchangeTypePrice | int | Integer |  |  | nullable |
| 38 | unitExchangeType | 浮动(销售) | unitExchangeType | int | Integer |  |  | nullable |
| 39 | totalInvoiceQty | 累计开票数量 | totalinvoiceqty | number | Decimal |  |  | nullable |
| 40 | totalInvoicePriceQty | 累计开票计价数量 | totalinvoicepriceqty | number | Decimal |  |  | nullable |
| 41 | totalInvoiceOriSum | 累计开票含税金额 | totalinvoiceorisum | number | Decimal |  |  | nullable |
| 42 | merchantId | 客户Id | merchantid | quote | aa.merchant.Merchant |  |  | data_auth,nullable |
| 43 | receiverMerchantId | 收货客户Id | receivermerchantid | quote | aa.merchant.Merchant |  |  | data_auth,nullable |
| 44 | saleDepartmentId | 销售部门Id | saledepartmentid | quote | bd.adminOrg.DeptOrgVO |  |  | data_auth,nullable |
| 45 | saleCorpContactId | 销售业务员Id | salecorpcontactid | quote | bd.staff.Staff |  |  | data_auth,nullable |
| 46 | salesOrgId | 销售组织Id | salesorgid | quote | org.func.SalesOrg |  |  | data_auth,nullable |
| 47 | stockOrgId | 库存组织Id | stockorgid | quote | org.func.InventoryOrg |  |  | data_auth,nullable |
| 48 | priceMark | 价格标识 | pricemark | switch | Boolean |  |  | nullable |
| 49 | priceDate | 定价日期 | pricedate | date | Date |  |  | nullable |
| 50 | salePrice | 含税报价 | saleprice | number | Decimal |  |  | nullable |
| 51 | saleCost | 含税报价金额 | salecost | number | Decimal |  |  | nullable |
| 52 | oriTaxUnitPrice | 含税单价 | oritaxunitprice | number | Decimal |  |  | nullable |
| 53 | oriSum | 含税金额 | orisum | number | Decimal |  |  | nullable |
| 54 | taxRate | 税率 | taxrate | number | Decimal |  |  | nullable |
| 55 | taxId | 税目税率id | taxid | quote | archive.taxArchives.TaxRateArchive |  |  | nullable |
| 56 | taxItems | 税目 | taxitems | text | String |  |  | nullable |
| 57 | taxCode | 税目税率编码 | taxcode | text | String |  |  | nullable |
| 58 | oriTax | 税额 | oritax | number | Decimal |  |  | nullable |
| 59 | oriUnitPrice | 无税单价 | oriunitprice | number | Decimal |  |  | nullable |
| 60 | oriMoney | 无税金额 | orimoney | number | Decimal |  |  | nullable |
| 61 | natTaxUnitPrice | 本币含税单价 | nattaxunitprice | number | Decimal |  |  | nullable |
| 62 | natUnitPrice | 本币无税单价 | natunitprice | number | Decimal |  |  | nullable |
| 63 | natMoney | 本币无税金额 | natmoney | number | Decimal |  |  | nullable |
| 64 | natSum | 本币含税金额 | natsum | number | Decimal |  |  | nullable |
| 65 | natTax | 本币税额 | nattax | number | Decimal |  |  | nullable |
| 66 | discountRate | 扣率 | discountrate | number | Decimal |  |  | nullable |
| 67 | lineDiscountMoney | 扣额 | linediscountmoney | number | Decimal |  |  | nullable |
| 68 | rebateMoney | 返利分摊金额 | rebatemoney | number | Decimal |  |  | nullable |
| 69 | cashRebateMoney | 返利抵现金额 | cashrebatemoney | number | Decimal |  |  | nullable |
| 70 | cashRebateMoneyDomestic | 返利本币抵现金额 | cashrebatemoneydomestic | number | Decimal |  |  | nullable |
| 71 | rebateMoneyDomestic | 返利本币分摊金额 | rebatemoneydomestic | number | Decimal |  |  | nullable |
| 72 | isTaxIssuedDiscountLine | 税票是否开具折扣行 | istaxissueddiscountline | switch | Boolean |  |  | nullable |
| 73 | accountMethod | 入账方式 | accountmethod | text | String |  |  | nullable |
| 74 | isUpdateCost | 是否更新存货 | isupdatecost | switch | Boolean |  |  | nullable |
| 75 | salesoutAccountingMethod | 出库立账方式 | salesoutaccountingmethod | text | String |  |  | nullable |
| 76 | costBillNoType | 结转成本单据 | costbillnotype | text | String |  |  | nullable |
| 77 | carryOverMethod | 结转方式 | carryovermethod | text | String |  |  | nullable |
| 78 | salesOutSourceSys | 出库单来源系统 | salesoutsourcesys | text | String |  |  | nullable |
| 79 | checkByRevenueManagement | 收入管理核算 | revmanagecalculate | switch | Boolean |  |  | nullable |
| 80 | projectId | 项目Id | projectid | quote | bd.project.ProjectVO |  |  | data_auth,nullable |
| 81 | warehouse | 仓库 | warehouse | quote | aa.warehouse.Warehouse |  |  | nullable |
| 82 | batchNo | 批号 | batchno | text | String |  |  | nullable |
| 83 | batchId | 批次Id | batchid | quote | st.batchno.Batchno |  |  | nullable |
| 84 | productDate | 生产日期 | productdate | timestamp | Timestamp |  |  | nullable |
| 85 | validDate | 有效期至 | validdate | timestamp | Timestamp |  |  | nullable |
| 86 | expireDateNo | 保质期 | expiredateno | int | Integer |  |  | nullable |
| 87 | expireDateUnit | 保质期单位 | expiredateunit | text | String |  |  | nullable |
| 88 | excessiveSigning | 超量签收 | excessivesigning | short | Short |  |  | nullable |
| 89 | memo | 行备注 | memo | text | String |  |  | nullable |
| 90 | receiveAgreementId | 收款协议id | ireceiveagreementid | quote | bd.receivables.ReceiveAgreement |  |  | nullable |
| 91 | contractTpye | 合同类型 | contracttpye | text | String |  |  | nullable |
| 92 | sactId | 销售合同表头id | sactid | long | Long |  |  | nullable |
| 93 | sacoId | 销售合同表体行id | sacoid | long | Long |  |  | nullable |
| 94 | sactCode | 销售合同编码 | sactcode | text | String |  |  | nullable |
| 95 | sacoLineno | 销售合同行号 | sacolineno | number | Decimal |  |  | nullable |
| 96 | orderId | 销售订单主表id | orderid | long | Long |  |  | nullable |
| 97 | orderDetailId | 销售订单子表id | orderdetailid | long | Long |  |  | nullable |
| 98 | orderNo | 销售订单编码 | orderno | text | String |  |  | nullable |
| 99 | orderDetailLineno | 销售订单行号 | orderdetaillineno | number | Decimal |  |  | nullable |
| 100 | salesOutId | 出库单主表 | salesoutid | long | Long |  |  | nullable |
| 101 | salesOutsId | 出库单子表id | salesoutsid | long | Long |  |  | nullable |
| 102 | salesOutNo | 出库单编码 | salesoutno | text | String |  |  | nullable |
| 103 | salesOutsLineno | 出库单行号 | salesoutslineno | number | Decimal |  |  | nullable |
| 104 | contractLot | 贸易合同批次 | contractlot | text | String |  |  | nullable |
| 105 | contractDeliveryLot | 贸易合同交付批号 | contractdeliverylot | text | String |  |  | nullable |
| 106 | salePriceSettlementDetailDefineCharacter | 自定义项特征属性组 | salepricesettlementdetaildefinecharacter | UserDefine | voucher.salePriceSettlement.SalePriceSettlementDetailDefineCharacter |  |  | nullable |
| 107 | totalInspectionDeductQty | 累计开票质检扣重 | totalinspectiondeductqty | number | Decimal |  |  | nullable |
| 108 | costCenter | 成本中心 | cost_center | quote | bd.costcenter.CostCenter |  |  | nullable |
| 109 | providerProfitCenter | 供方利润中心 | provider_profit_center | quote | bd.virtualaccbody.VirtualAccbody |  |  | nullable |
| 110 | consumerProfitCenter | 需方利润中心 | consumer_profit_center | quote | bd.virtualaccbody.VirtualAccbody |  |  | nullable |
| 111 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 112 | receiptCode | 签收确认单据号 | receiptcode | text | String |  |  | nullable |
| 113 | receiptId | 签收确认主表id | receiptid | long | Long |  |  | nullable |
| 114 | receiptDetailId | 签收确认子表id | receiptdetailid | long | Long |  |  | nullable |
| 115 | receiptLineNo | 签收确认行号 | receipt_lineno | number | Decimal |  |  | nullable |
| 116 | uplineno | 来源单据行号 | uplineno | number | Decimal |  |  | nullable |
| 117 | firstsourceid | 源头单据主表id | firstsourceid | long | Long |  |  | nullable |
| 118 | firstsourceautoid | 源头单据子表id | firstsourceautoid | long | Long |  |  | nullable |
| 119 | firstsource | 源头单据类型 | firstsource | text | String |  |  | nullable |
| 120 | firstupcode | 源头单据号 | firstupcode | text | String |  |  | nullable |
| 121 | firstlineno | 源头单据行号 | firstlineno | number | Decimal |  |  | nullable |
| 122 | coSourceid | 协同源头单据头id | iCoSourceid | long | Long |  |  | nullable |
| 123 | coSourceLineNo | 协同源头单据行号 | coSourceLineNo | number | Decimal |  |  | nullable |
| 124 | coSourceautoid | 协同源头单据行id | iCoSourceautoid | long | Long |  |  | nullable |
| 125 | coSourceType | 协同源头单据类型 | cCoSourceType | text | String |  |  | nullable |
| 126 | coUpcode | 协同源头单据号 | cCoUpcode | text | String |  |  | nullable |
| 127 | collaborationSource | 协同来源单据类型 | collaboration_source | text | String |  |  | nullable |
| 128 | collaborationPocode | 协同来源单据号 | collaboration_pocode | text | String |  |  | nullable |
| 129 | collaborationPoid | 协同来源单据主表id | collaboration_poid | long | Long |  |  | nullable |
| 130 | collaborationPorowno | 协同来源单据行号 | collaboration_porowno | number | Decimal |  |  | nullable |
| 131 | collaborationPodetailid | 协同来源单据子表id | collaboration_podetailid | long | Long |  |  | nullable |
| 132 | subBusinessSourceNo | 子业务源头单据号 | subBusinessSourceNo | text | String |  |  | nullable |
| 133 | subBusinessSourceLineNo | 子业务源头单据行号 | subBusinessSourceLineNo | number | Decimal |  |  | nullable |
| 134 | subBusinessSourceId | 子业务源头单据id | subBusinessSourceId | long | Long |  |  | nullable |
| 135 | subBusinessSourceLineId | 子业务源头单据行id | subBusinessSourceLineId | long | Long |  |  | nullable |
| 136 | subBusinessSourceType | 子业务源头单据类型 | subBusinessSourceType | text | String |  |  | nullable |
| 137 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant | Y | Y | notGenerate,nullable,uiHide |
| 138 | sourceid | 上游单据主表id | sourceid | long | Long |  |  | nullable |
| 139 | sourceautoid | 上游单据子表id | sourceautoid | long | Long |  |  | nullable |
| 140 | source | 上游单据类型 | source | text | String |  |  | nullable,reportHide |
| 141 | upcode | 上游单据号 | upcode | text | String |  |  | nullable |
| 142 | makeRuleCode | 生单规则编号 | makerule_code | text | String |  |  | nullable,reportHide |
| 143 | sourceMainPubts | 时间戳 | sourceMainPubts | timestamp | Timestamp |  |  | nullable,reportHide |
| 144 | groupTaskKey | 分组任务KEY | groupTaskKey | text | String |  |  | nullable,reportHide |
| 145 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 146 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 147 | invPriceExchRateDen | 计价换算率分母 | invpriceexchrateden | number | Decimal |  |  | nullable |
| 148 | invPriceExchRateNum | 计价换算率分子 | invpriceexchratenum | number | Decimal |  |  | nullable |
| 149 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 150 | uordercorp | 租户 | iCorpId | long | Long |  | Y | nullable,reportHide |
| 151 | rowno | 序号 | rowno | int | Integer |  |  | isCode,nullable |
| 152 | id | 主键 | id | long | Long |  |  | nullable,REF.ID |
| 153 | deliveryDetailId | 发货单子表id | deliverydetailid | long | Long |  |  | nullable |
| 154 | deliveryDetailLineno | 发货单行号 | deliverydetaillineno | number | Decimal |  |  | nullable |
| 155 | deliveryId | 发货单主表id | deliveryid | long | Long |  |  | nullable |
| 156 | deliveryNo | 发货单编码 | deliveryno | text | String |  |  | nullable |
| 157 | idKey | 行标识 | idKey | text | String |  |  | nullable |
| 158 | inspectionType | 检验 | inspectiontype | int | Integer |  |  | nullable |
| 159 | priceRecordId | 取价id | pricerecordid | long | Long |  |  | nullable |

---

## Reference Fields (23)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | mainid | 主表ID | mainid | voucher.salePriceSettlement.SalePriceSettlement |
| 2 | productId | 商品Id | productid | pc.product.Product |
| 3 | skuId | skuId | skuid | pc.product.ProductSKU |
| 4 | agentProductId | 客户商品对照 | agentproductid | sa.agent.AgentProductRelation |
| 5 | qualityPriceSchemeId | 优质优价方案 | qualitypriceschemeid | aa.qualitypricescheme.QualitypriceScheme |
| 6 | unitId | 主计量单位Id | unitid | pc.unit.Unit |
| 7 | chargeUnitId | 计价单位Id | chargeunitid | pc.unit.Unit |
| 8 | salesUnitId | 销售单位Id | salesunitid | pc.unit.Unit |
| 9 | merchantId | 客户Id | merchantid | aa.merchant.Merchant |
| 10 | receiverMerchantId | 收货客户Id | receivermerchantid | aa.merchant.Merchant |
| 11 | saleDepartmentId | 销售部门Id | saledepartmentid | bd.adminOrg.DeptOrgVO |
| 12 | saleCorpContactId | 销售业务员Id | salecorpcontactid | bd.staff.Staff |
| 13 | salesOrgId | 销售组织Id | salesorgid | org.func.SalesOrg |
| 14 | stockOrgId | 库存组织Id | stockorgid | org.func.InventoryOrg |
| 15 | taxId | 税目税率id | taxid | archive.taxArchives.TaxRateArchive |
| 16 | projectId | 项目Id | projectid | bd.project.ProjectVO |
| 17 | warehouse | 仓库 | warehouse | aa.warehouse.Warehouse |
| 18 | batchId | 批次Id | batchid | st.batchno.Batchno |
| 19 | receiveAgreementId | 收款协议id | ireceiveagreementid | bd.receivables.ReceiveAgreement |
| 20 | costCenter | 成本中心 | cost_center | bd.costcenter.CostCenter |
| 21 | providerProfitCenter | 供方利润中心 | provider_profit_center | bd.virtualaccbody.VirtualAccbody |
| 22 | consumerProfitCenter | 需方利润中心 | consumer_profit_center | bd.virtualaccbody.VirtualAccbody |
| 23 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
