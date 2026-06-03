---
tags: [BIP, metadata, voucher, SettlementDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售结算单子表 (voucher.settlement.SettlementDetail)

> Platform: BIP V5 | Module: voucher | Table: voucher_settlementdetail | Schema: udinghuo

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 销售结算单子表 |
| uri | voucher.settlement.SettlementDetail |
| tableName | voucher_settlementdetail |
| domain | udinghuo |
| applicationCode | SCMSA |
| superUri | uorder.voucher.UorderVouchLine |
| isBusinessObject | true |
| description | 销售结算单子表 |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (16)

| # | Name | URI |
|---|------|-----|
| 1 | 换算比 (IUOMExchRate) | gscm.itf.IUOMExchRate |
| 2 | 计价换算比 (IUOMPriceExchRate) | gscm.itf.IUOMPriceExchRate |
| 3 | 原币金额信息 (IOriMoneyInfo) | voucher.base.IOriMoneyInfo |
| 4 | 本币金额信息 (INatMoneyInfo) | voucher.base.INatMoneyInfo |
| 5 | 生单回写 (IBackWrite) | base.itf.IBackWrite |
| 6 | 后端自动行号接口 (ILineNo) | base.itf.ILineNo |
| 7 | 规格 (FreeItem) | base.itf.FreeItem |
| 8 | 表体上游单据金额 (IUorderVoucherDetailCredit) | uorder.voucher.IUorderVoucherDetailCredit |
| 9 | 源头单据信息 (IFirstSourceData) | sale.aa.IFirstSourceData |
| 10 | 财务成本中心 (CostCenter) | sale.aa.CostCenter |
| 11 | 财务利润中心 (ProfitCenter) | sale.aa.ProfitCenter |
| 12 | 自定义项(批次) (UserdefItemBatch) | base.itf.UserdefItemBatch |
| 13 | 来源单据行号接口 (IUpLineNo) | sale.aa.IUpLineNo |
| 14 | 子业务源头单据信息 (ISubBusinessSourceData) | sale.aa.ISubBusinessSourceData |
| 15 | 协同单据信息 (ICoSourceData) | sale.aa.ICoSourceData |
| 16 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |

---

## All Fields (185)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | batchId | 批次Id | batchId | quote | st.batchno.Batchno |  |  | nullable |
| 2 | coSourceLineNo | 协同源头单据行号 | coSourceLineNo | number | Decimal |  |  | nullable |
| 3 | define1 | 自定义项1 | define1 | text | String |  |  | isGlobalization,nullable |
| 4 | define10 | 自定义项10 | define10 | text | String |  |  | isGlobalization,nullable |
| 5 | define11 | 自定义项11 | define11 | text | String |  |  | isGlobalization,nullable |
| 6 | define12 | 自定义项12 | define12 | text | String |  |  | isGlobalization,nullable |
| 7 | define13 | 自定义项13 | define13 | text | String |  |  | isGlobalization,nullable |
| 8 | define14 | 自定义项14 | define14 | text | String |  |  | isGlobalization,nullable |
| 9 | define15 | 自定义项15 | define15 | text | String |  |  | isGlobalization,nullable |
| 10 | define16 | 自定义项16 | define16 | text | String |  |  | isGlobalization,nullable |
| 11 | define17 | 自定义项17 | define17 | text | String |  |  | isGlobalization,nullable |
| 12 | define18 | 自定义项18 | define18 | text | String |  |  | isGlobalization,nullable |
| 13 | define19 | 自定义项19 | define19 | text | String |  |  | isGlobalization,nullable |
| 14 | define2 | 自定义项2 | define2 | text | String |  |  | isGlobalization,nullable |
| 15 | define20 | 自定义项20 | define20 | text | String |  |  | isGlobalization,nullable |
| 16 | define21 | 自定义项21 | define21 | text | String |  |  | isGlobalization,nullable |
| 17 | productName | 商品名称 | cProductName | text | String |  |  | nullable |
| 18 | chargeUnitName | 计价单位名称 | cChargeUnitName | text | String |  |  | nullable |
| 19 | checkByRevenueManagement | 收入管理核算 | revmanagecalculate | switch | Boolean |  |  | nullable |
| 20 | warehouse | 仓库 | iwarehouse | quote | aa.warehouse.Warehouse |  |  | nullable |
| 21 | costBillNoType | 结转成本单据 | cost_billno_type | text | String |  |  | nullable |
| 22 | internalSign | 内部交易标识 | internalsign | switch | Boolean |  |  | nullable |
| 23 | excessiveSigning | 超量签收 | excessivesigning | short | Short |  |  | nullable |
| 24 | calBase | 计算基准 | calbase | short | Short |  |  | nullable |
| 25 | orderType | 订单类型 | iordertype | int | Integer |  |  | nullable |
| 26 | workTransferOwner | 工作移交负责人 | work_transfer_owner | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,nullable |
| 27 | favorableRate | 倒扣 | fFavorableRate | number | Decimal |  |  | nullable |
| 28 | saleUserName | 业务员名称 | cSaleUserName | text | String |  |  | nullable |
| 29 | skuCode | 物料SKU编码 | cSkuCode | text | String |  |  | nullable |
| 30 | projectCode | 项目编码 | cProjectCode | text | String |  |  | nullable |
| 31 | merchantAuth | 客户权限 | lineAgentId | quote | pb.dataauth.MerchantAuthDataAuth |  |  | nullable |
| 32 | saleDeptName | 销售部门名称 | cSaleDeptName | text | String |  |  | nullable |
| 33 | productCode | 商品编码 | cProductCode | text | String |  |  | nullable |
| 34 | unitName | 主单位名称 | cUnitName | text | String |  |  | nullable |
| 35 | lineAgentId | 行客户 | lineAgentId | quote | aa.merchant.Merchant |  |  | dataPowerFlag,data_auth,nullable |
| 36 | projectName | 项目名称 | cProjectName | text | String |  |  | nullable |
| 37 | skuName | 物料SKU名称 | cSkuName | text | String |  |  | nullable |
| 38 | linecloser | 关闭人 | linecloser | text | String |  |  | nullable |
| 39 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 40 | orderRebateMoney | 返利整单折扣 | fOrderRebateMoney | number | Decimal |  |  | nullable |
| 41 | define22 | 自定义项22 | define22 | text | String |  |  | isGlobalization,nullable |
| 42 | define23 | 自定义项23 | define23 | text | String |  |  | isGlobalization,nullable |
| 43 | define24 | 自定义项24 | define24 | text | String |  |  | isGlobalization,nullable |
| 44 | define25 | 自定义项25 | define25 | text | String |  |  | isGlobalization,nullable |
| 45 | define26 | 自定义项26 | define26 | text | String |  |  | isGlobalization,nullable |
| 46 | define27 | 自定义项27 | define27 | text | String |  |  | isGlobalization,nullable |
| 47 | define28 | 自定义项28 | define28 | text | String |  |  | isGlobalization,nullable |
| 48 | define29 | 自定义项29 | define29 | text | String |  |  | isGlobalization,nullable |
| 49 | define3 | 自定义项3 | define3 | text | String |  |  | isGlobalization,nullable |
| 50 | define30 | 自定义项30 | define30 | text | String |  |  | isGlobalization,nullable |
| 51 | define4 | 自定义项4 | define4 | text | String |  |  | isGlobalization,nullable |
| 52 | define5 | 自定义项5 | define5 | text | String |  |  | isGlobalization,nullable |
| 53 | define6 | 自定义项6 | define6 | text | String |  |  | isGlobalization,nullable |
| 54 | define7 | 自定义项7 | define7 | text | String |  |  | isGlobalization,nullable |
| 55 | define8 | 自定义项8 | define8 | text | String |  |  | isGlobalization,nullable |
| 56 | define9 | 自定义项9 | define9 | text | String |  |  | isGlobalization,nullable |
| 57 | groupTaskKey | 分组任务KEY | groupTaskKey | text | String |  |  | nullable,reportHide |
| 58 | mainid | 主表ID | mainid | quote | voucher.settlement.Settlement |  |  | nullable |
| 59 | makeRuleCode | 生单规则编号 | makerule_code | text | String |  |  | nullable,reportHide |
| 60 | pubts | 时间戳 | pubuts | timestamp | Timestamp |  |  | nullable,isSyncKey |
| 61 | qtyName | 主计量 | cMasterUnitMeasure | text | String |  |  | nullable |
| 62 | rowno | 序号 | rowno | int | Integer |  |  | isCode,nullable |
| 63 | source | 上游单据类型 | source | text | String |  |  | nullable,reportHide |
| 64 | sourceMainPubts | 时间戳 | sourceMainPubts | timestamp | Timestamp |  |  | nullable,reportHide |
| 65 | sourceOriPrice | 来源行成交价 | fSourceOriPrice | number | Decimal |  |  | nullable |
| 66 | subBusinessSourceType | 子业务源头单据类型 | subBusinessSourceType | text | String |  |  | nullable |
| 67 | uordercorp | 租户 | iCorpId | long | Long |  | Y | nullable,reportHide |
| 68 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 69 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 70 | speciDes | 规格描述 | speciDes | text | String |  |  | nullable |
| 71 | productId | 物料id | iProductId | quote | pc.product.Product |  |  | data_auth,nullable |
| 72 | skuId | skuId | iSkuId | quote | pc.product.ProductSKU |  |  | nullable |
| 73 | agentProductId | 客户商品ID | agentProductId | quote | sa.agent.AgentProductRelation |  |  | data_auth,nullable |
| 74 | free1 | 规格1 | free1 | text | String |  |  | isGlobalization,nullable |
| 75 | free2 | 规格2 | free2 | text | String |  |  | isGlobalization,nullable |
| 76 | free3 | 规格3 | free3 | text | String |  |  | isGlobalization,nullable |
| 77 | free4 | 规格4 | free4 | text | String |  |  | isGlobalization,nullable |
| 78 | free5 | 规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 79 | free6 | 规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 80 | free7 | 规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 81 | free8 | 规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 82 | free9 | 规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 83 | free10 | 规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 84 | invProductTypeAlias | 商品类型 | invProductTypeAlias | text | String |  |  | nullable |
| 85 | invProductType | 商品售卖类型 | invProductType | text | String |  |  | nullable |
| 86 | qty | 数量 | fMasterMeasureQuantity | number | Decimal |  |  | nullable |
| 87 | subQty | 销售数量 | subQty | number | Decimal |  |  | nullable |
| 88 | productAuxUnitId | 销售单位id | iProductAuxUnitId | quote | pc.unit.Unit |  |  | nullable |
| 89 | unitId | 主单位Id | iUnitId | quote | pc.unit.Unit |  |  | nullable |
| 90 | invExchRate | 销售换算率 | invExchRate | number | Decimal |  |  | nullable |
| 91 | chargeUnitId | 计价单位id | iChargeUnitId | quote | pc.unit.Unit |  |  | nullable |
| 92 | priceQty | 计价数量 | iChargeQuantity | number | Decimal |  |  | nullable |
| 93 | bInvoiceAfterReceipt | 签收后开票 | bInvoiceAfterReceipt | switch | Boolean |  |  | nullable |
| 94 | invPriceExchRate | 计价换算率 | iChargeExchRate | number | Decimal |  |  | nullable |
| 95 | signedQty | 累计签收数量 | iSignedQty | number | Decimal |  |  | nullable |
| 96 | signedDiffQty | 累计签收差异数量 | iSignedDiffQty | number | Decimal |  |  | nullable |
| 97 | invoiceQty | 累计开票数量 | invoiceQty | number | Decimal |  |  | nullable |
| 98 | invoiceOriSum | 累计开票含税金额 | invoiceOriSum | number | Decimal |  |  | nullable |
| 99 | closedRowCount | 行关闭数量 | fClosedRowCount | number | Decimal |  |  | nullable |
| 100 | receiverCustId | 收货客户id | iReceiverCust | quote | aa.merchant.Merchant |  |  | data_auth,nullable |
| 101 | saleDeptId | 销售部门id | iSaleDeptId | quote | org.func.BaseOrg |  |  | data_auth,nullable |
| 102 | saleUserId | 销售业务员id | iSaleUserId | quote | bd.staff.Staff |  |  | data_auth,nullable |
| 103 | saleOrgId | 销售组织id | iSaleOrgId | quote | org.func.SalesOrg |  |  | data_auth,nullable |
| 104 | stockOrgId | 库存组织id | iStockOrgId | quote | org.func.InventoryOrg |  |  | data_auth,nullable |
| 105 | priceMark | 价格标识 | bPriceMark | switch | Boolean |  |  | nullable |
| 106 | salePrice | 含税报价 | fSalePrice | number | Decimal |  |  | nullable |
| 107 | saleCost | 报价含税金额 | fSaleCost | number | Decimal |  |  | nullable |
| 108 | oriTaxUnitPrice | 含税单价 | iOrigTaxUnitPrice | number | Decimal |  |  | nullable |
| 109 | oriSum | 含税金额 | iTotalTaxMoney | number | Decimal |  |  | nullable |
| 110 | taxRate | 税率 | fTaxRate | number | Decimal |  |  | nullable |
| 111 | taxId | 税目税率id | iTaxId | quote | archive.taxArchives.TaxRateArchive |  |  | nullable |
| 112 | taxCode | 税率税目编码 | cTaxCode | text | String |  |  | nullable |
| 113 | taxItems | 税目 | cTaxItems | text | String |  |  | nullable |
| 114 | oriTax | 税额 | oriTax | number | Decimal |  |  | nullable |
| 115 | retNotNeedInvoiceQty | 退货不开票数量 | retNotNeedInvoiceQty | number | Decimal |  |  | nullable |
| 116 | auditedReceivedQuantity | 已审签收数量 | auditedReceivedQuantity | number | Decimal |  |  | nullable |
| 117 | oriUnitPrice | 无税单价 | iOrigUnitPrice | number | Decimal |  |  | nullable |
| 118 | diliverStatus | 门户收货状态 | diliverStatus | text | String |  |  | nullable |
| 119 | oriMoney | 无税金额 | iOrigMoney | number | Decimal |  |  | nullable |
| 120 | natTaxUnitPrice | 本币含税单价 | iNatTaxUnitPrice | number | Decimal |  |  | nullable |
| 121 | natUnitPrice | 本币无税单价 | iNatUnitPrice | number | Decimal |  |  | nullable |
| 122 | natMoney | 本币含税金额 | iNatMoney | number | Decimal |  |  | nullable |
| 123 | natSum | 本币无税金额 | iNatTaxMoney | number | Decimal |  |  | nullable |
| 124 | natTax | 本币税额 | iNatTax | number | Decimal |  |  | nullable |
| 125 | discountRate | 扣率% | fDiscountRate | number | Decimal |  |  | nullable |
| 126 | lineDiscountMoney | 扣额 | fLineDiscountMoney | number | Decimal |  |  | nullable |
| 127 | rebateMoney | 返利分摊金额 | fRebateMoney | number | Decimal |  |  | nullable |
| 128 | cashRebateMoney | 返利抵现金额 | fcashRebateMoney | number | Decimal |  |  | nullable |
| 129 | rebateMoneyDomestic | 返利本币分摊金额 | fRebateMoney_domestic | number | Decimal |  |  | nullable |
| 130 | cashRebateMoneyDomestic | 返利本币抵现金额 | fCashRebateMoney_domestic | number | Decimal |  |  | nullable |
| 131 | orderRebateMoneyDomestic | 本币货补分摊金额 | fOrderRebateMoney_domestic | number | Decimal |  |  | nullable |
| 132 | taxIssuedDiscountline | 税票是否开具折扣行 | taxIssuedDiscountline | switch | Boolean |  |  | nullable |
| 133 | isScrap | 是否废品 | isScrap | switch | Boolean |  |  | nullable |
| 134 | isUpdateCost | 是否更新存货 | isUpdateCost | switch | Boolean |  |  | nullable |
| 135 | salesoutAccountingMethod | 出库立账方式 | salesoutAccountingMethod | text | String |  |  | nullable |
| 136 | stockId | 仓库id | iStockId | quote | aa.warehouse.Warehouse |  |  | data_auth,nullable |
| 137 | projectId | 项目id | cProjectId | quote | bd.project.ProjectVO |  |  | data_auth,nullable |
| 138 | consumerProfitCenter | 需方利润中心 | consumer_profit_center | quote | bd.virtualaccbody.VirtualAccbody |  |  | nullable |
| 139 | providerProfitCenter | 供方利润中心 | provider_profit_center | quote | bd.virtualaccbody.VirtualAccbody |  |  | nullable |
| 140 | costCenter | 成本中心 | cost_center | quote | bd.costcenter.CostCenter |  |  | nullable |
| 141 | batchNo | 批次号 | cBatchNo | text | String |  |  | nullable |
| 142 | productDate | 生产日期 | dProductDate | timestamp | Timestamp |  |  | nullable |
| 143 | validDate | 有效期至 | dValidDate | timestamp | Timestamp |  |  | nullable |
| 144 | expireDateNo | 保质期 | iExpireDateNo | int | Integer |  |  | nullable |
| 145 | expireDateUnit | 保质期单位 | cExpireDateUnit | text | String |  |  | nullable |
| 146 | memo | 行备注 | cMemo | text | String |  |  | nullable |
| 147 | upcode | 来源单据编号 | upcode | text | String |  |  | nullable |
| 148 | uplineno | 来源单据行号 | uplineno | number | Decimal |  |  | nullable |
| 149 | contractTpye | 合同类型 | contractTpye | text | String |  |  | nullable |
| 150 | contractLot | 贸易合同批次 | contractLot | text | String |  |  | nullable |
| 151 | deliveryLot | 贸易合同交付批号 | deliveryLot | text | String |  |  | nullable |
| 152 | sourceid | 协同来源单据头id | sourceid | long | Long |  |  | nullable |
| 153 | sourceautoid | 协同来源单据行id | sourceautoid | long | Long |  |  | nullable |
| 154 | rebateDetailId | 返利单表体id | rebateDetailId | long | Long |  |  | nullable |
| 155 | orderId | 订单ID | orderId | long | Long |  |  | nullable |
| 156 | orderDetailId | 订单子表ID | orderDetailId | long | Long |  |  | nullable |
| 157 | orderNo | 订单编号 | cOrderNo | text | String |  |  | nullable |
| 158 | orderDetailLineno | 订单行号 | orderDetailLineno | int | Integer |  |  | nullable |
| 159 | sactId | 合同Id | sactid | long | Long |  |  | nullable |
| 160 | sacoId | 合同行Id | sacoid | long | Long |  |  | nullable |
| 161 | sactCode | 合同编码 | sactcode | text | String |  |  | nullable |
| 162 | sacoLineno | 合同行号 | sacoLineno | int | Integer |  |  | nullable |
| 163 | unitExchangeTypePrice | 浮动(计价) | unitExchangeTypePrice | int | Integer |  |  | nullable |
| 164 | unitExchangeType | 浮动(销售) | unitExchangeType | int | Integer |  |  | nullable |
| 165 | firstsource | 源头单据类型 | firstsource | text | String |  |  | nullable |
| 166 | firstsourceid | 源头单据主表id | firstsourceid | long | Long |  |  | nullable |
| 167 | firstsourceautoid | 源头单据子表id | firstsourceautoid | long | Long |  |  | nullable |
| 168 | firstupcode | 源头单据号 | firstupcode | text | String |  |  | nullable |
| 169 | firstlineno | 源头单据行号 | firstlineno | number | Decimal |  |  | nullable |
| 170 | subBusinessSourceId | 子业务源头单据id | subBusinessSourceId | long | Long |  |  | nullable |
| 171 | subBusinessSourceLineId | 子业务源头单据行id | subBusinessSourceLineId | long | Long |  |  | nullable |
| 172 | subBusinessSourceLineNo | 子业务源头单据行号 | subBusinessSourceLineNo | number | Decimal |  |  | nullable |
| 173 | subBusinessSourceNo | 子业务源头单据号 | subBusinessSourceNo | text | String |  |  | nullable |
| 174 | coSourceType | 协同源头单据类型 | cCoSourceType | text | String |  |  | nullable |
| 175 | coSourceid | 协同源头单据头id | iCoSourceid | long | Long |  |  | nullable |
| 176 | coSourceautoid | 协同源头单据行id | iCoSourceautoid | long | Long |  |  | nullable |
| 177 | coUpcode | 协同源头单据号 | cCoUpcode | text | String |  |  | nullable |
| 178 | settlementDetailCharacteristics | 自由项特征组 | settlementDetailCharacteristics | FreeCT | voucher.settlement.SettlementDetailCharacteristics |  |  | nullable |
| 179 | settlementDetailDefineCharacter | 表体自定义项特征组 | settlementDetailDefineCharacter | UserDefine | voucher.settlement.SettlementDetailDefineCharacter |  |  | nullable |
| 180 | bodyFreeItem | 销售结算表体自由自定义项 | - | - | voucher.settlement.SettlementDetailFreeItem |  |  |  |
| 181 | bodyItem | 销售结算表体自定义项 | - | - | voucher.settlement.SettlementDetailCustomItem |  |  |  |
| 182 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 183 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 184 | invPriceExchRateDen | 计价换算率分母 | invpriceexchrateden | number | Decimal |  |  | nullable |
| 185 | invPriceExchRateNum | 计价换算率分子 | invpriceexchratenum | number | Decimal |  |  | nullable |

---

## Reference Fields (24)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | batchId | 批次Id | batchId | st.batchno.Batchno |
| 2 | warehouse | 仓库 | iwarehouse | aa.warehouse.Warehouse |
| 3 | workTransferOwner | 工作移交负责人 | work_transfer_owner | bd.staff.Staff |
| 4 | merchantAuth | 客户权限 | lineAgentId | pb.dataauth.MerchantAuthDataAuth |
| 5 | lineAgentId | 行客户 | lineAgentId | aa.merchant.Merchant |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 7 | mainid | 主表ID | mainid | voucher.settlement.Settlement |
| 8 | productId | 物料id | iProductId | pc.product.Product |
| 9 | skuId | skuId | iSkuId | pc.product.ProductSKU |
| 10 | agentProductId | 客户商品ID | agentProductId | sa.agent.AgentProductRelation |
| 11 | productAuxUnitId | 销售单位id | iProductAuxUnitId | pc.unit.Unit |
| 12 | unitId | 主单位Id | iUnitId | pc.unit.Unit |
| 13 | chargeUnitId | 计价单位id | iChargeUnitId | pc.unit.Unit |
| 14 | receiverCustId | 收货客户id | iReceiverCust | aa.merchant.Merchant |
| 15 | saleDeptId | 销售部门id | iSaleDeptId | org.func.BaseOrg |
| 16 | saleUserId | 销售业务员id | iSaleUserId | bd.staff.Staff |
| 17 | saleOrgId | 销售组织id | iSaleOrgId | org.func.SalesOrg |
| 18 | stockOrgId | 库存组织id | iStockOrgId | org.func.InventoryOrg |
| 19 | taxId | 税目税率id | iTaxId | archive.taxArchives.TaxRateArchive |
| 20 | stockId | 仓库id | iStockId | aa.warehouse.Warehouse |
| 21 | projectId | 项目id | cProjectId | bd.project.ProjectVO |
| 22 | consumerProfitCenter | 需方利润中心 | consumer_profit_center | bd.virtualaccbody.VirtualAccbody |
| 23 | providerProfitCenter | 供方利润中心 | provider_profit_center | bd.virtualaccbody.VirtualAccbody |
| 24 | costCenter | 成本中心 | cost_center | bd.costcenter.CostCenter |

---

## Child Tables (2)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | bodyItem | 销售结算表体自定义项 | voucher.settlement.SettlementDetailCustomItem |
| 2 | bodyFreeItem | 销售结算表体自由自定义项 | voucher.settlement.SettlementDetailFreeItem |
