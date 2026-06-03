---
tags: [BIP, 元数据, 数据字典, voucher.invoice.SaleInvoiceDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售发票子表 (`voucher.invoice.SaleInvoiceDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`voucher_saleinvoicedetail` | domain：`udinghuo` | 应用：`SCMSA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售发票子表 |
| 物理表 | `voucher_saleinvoicedetail` |
| 数据库 schema | `udinghuo` |
| 所属应用 | `SCMSA` |
| 直连字段 | 234 个 |
| 子表 | 4 个 |
| 关联引用 | 38 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyItem` | `voucher.invoice.SaleInvoiceDetailCustomItem` | composition |
| `bodyFreeItem` | `voucher.invoice.SaleInvoiceDetailFreeItem` | composition |
| `taxResults` | `voucher.invoice.TaxCalculationResult` | composition |
| `paymentExeDetails` | `voucher.invoice.PaymentExeDetail` | composition |

## 关联引用 (38个)

| 字段名 | 引用类型 |
|--------|---------|
| `iSaleOrgId` | `saleOrgref` |
| `activity` | `` |
| `` | `` |
| `saleInvoiceDetailDefineCharacter` | `` |
| `agentProductId` | `sa_agentproductref` |
| `ptoId` | `` |
| `sourceinvdetailid` | `` |
| `wbs` | `` |
| `iReceiveAgreementId` | `` |
| `provider_profit_center` | `finbd.bd_allaccbodyref_inner` |
| `saleInvoiceDetailCharacteristics` | `` |
| `iUnitId` | `productcenter.pc_productassitunitsref` |
| `iBlueInvDetailId` | `` |
| `mainid` | `` |
| `iSkuId` | `productcenter.productskuref` |
| `iProductId` | `productcenter.productref` |
| `work_transfer_owner` | `` |
| `ytenant_id` | `` |
| `lineAgentId` | `` |
| `cost_center` | `finbd.bd_costcenterref` |
| `iSaleDeptId` | `ucf-org-center.bd_adminorgsharetreeref` |
| `sourceinvid` | `` |
| `tax_code_id` | `` |
| `iwarehouse` | `` |
| `consumer_profit_center` | `finbd.bd_allaccbodyref_inner` |
| `iChargeUnitId` | `productcenter.pc_productassitunitsref` |
| `iTaxId` | `` |
| `iReceiverCust` | `productcenter.merchantRef` |
| `iStockOrgId` | `` |
| `iNatCurrentId` | `` |
| `cProjectId` | `ucfbasedoc.bd_outer_projectcardMCref` |
| `iSaleUserId` | `ucf-staff-center.bd_staff_ref` |

## 继承接口 (23个, 90字段)

- **换算比** (`gscm.itf.IUOMExchRate`)
  - `` → ``
  - `invexchrateden` → `invexchrateden`
  - `invexchratenum` → `invexchratenum`
  - `` → ``
  - `` → ``
- **计价换算比** (`gscm.itf.IUOMPriceExchRate`)
  - `` → ``
  - `invpriceexchrateden` → `invpriceexchrateden`
  - `invpriceexchratenum` → `invpriceexchratenum`
  - `` → ``
  - `` → ``
- **原币金额信息** (`voucher.base.IOriMoneyInfo`)
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
- **本币金额信息** (`voucher.base.INatMoneyInfo`)
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
- **生单回写** (`base.itf.IBackWrite`)
  - `groupTaskKey` → `groupTaskKey`
  - `makerule_code` → `makerule_code`
  - `` → ``
  - `` → ``
  - `` → ``
  - `sourceMainPubts` → `sourceMainPubts`
  - `` → ``
- **规格** (`base.itf.FreeItem`)
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
- **表体上游单据金额** (`uorder.voucher.IUorderVoucherDetailCredit`)
  - `fSourceOriPrice` → `fSourceOriPrice`
- **源头单据信息** (`sale.aa.IFirstSourceData`)
  - `firstlineno` → `firstlineno`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
- **后端自动行号接口** (`base.itf.ILineNo`)
  - `lineno` → `lineno`
- **来源单据行号接口** (`sale.aa.IUpLineNo`)
  - `uplineno` → `uplineno`
- **财务成本中心** (`sale.aa.CostCenter`)
  - `cost_center` → `cost_center`
- **财务利润中心** (`sale.aa.ProfitCenter`)
  - `consumer_profit_center` → `consumer_profit_center`
  - `provider_profit_center` → `provider_profit_center`
- **子业务源头单据信息** (`sale.aa.ISubBusinessSourceData`)
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
- **协同单据信息** (`sale.aa.ICoSourceData`)
  - `iCoSourceautoid` → `iCoSourceautoid`
  - `iCoSourceid` → `iCoSourceid`
  - `coSourceLineNo` → `coSourceLineNo`
  - `cCoSourceType` → `cCoSourceType`
  - `cCoUpcode` → `cCoUpcode`
- **结算单单据信息** (`sale.aa.ISettleData`)
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **外部来源行线索** (`base.itf.IOutSysObjLineClue`)
  - `out_sys_lineid` → `out_sys_lineid`
  - `out_sys_rowno` → `out_sys_rowno`
- **PTO信息** (`usp.pto.IProductToOrder`)
  - `ptoCostScrap` → `ptoCostScrap`
  - `ptoHierarchyType` → `ptoHierarchyType`
  - `ptoId` → `ptoId`
  - `ptoPricingMethod` → `ptoPricingMethod`
  - `ptoQty` → `ptoQty`
  - `ptoRowId` → `ptoRowId`
  - `ptoSonQty` → `ptoSonQty`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **贸易路径Id接口** (`sccs.multitrade.ITradeRouteID`)
  - `` → ``
  - `throw_status` → `throw_status`
  - `` → ``
  - `` → ``
- **协同来源单据信息** (`sale.aa.ICollaborationSourceData`)
  - `collaboration_pocode` → `collaboration_pocode`
  - `collaboration_podetailid` → `collaboration_podetailid`
  - `collaboration_poid` → `collaboration_poid`
  - `collaboration_porowno` → `collaboration_porowno`
  - `collaboration_source` → `collaboration_source`
- **预留对象相关** (`st.reservation.IReservationID`)
  - `` → ``
- **签收确认单据信息** (`sale.aa.IReceiptData`)
  - `receiptcode` → `receiptcode`
  - `receiptdetailid` → `receiptdetailid`
  - `receiptid` → `receiptid`
  - `receipt_lineno` → `receipt_lineno`

## 字段列表（按类型分组）

> 共 234 个直连字段

### 文本字段 (61个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cOrderNo` | `cOrderNo` | `orderNo` | 订单号 |
| `` | `firstsource` | `firstsource` | 源头单据类型 |
| `` | `firstupcode` | `firstupcode` | 源头单据号 |
| `cCoSourceType` | `cCoSourceType` | `coSourceType` | 协同源头单据类型 |
| `accountmethod` | `accountmethod` | `accountMethod` | 入账方式 |
| `receiptcode` | `receiptcode` | `receiptCode` | 签收确认单据号 |
| `cost_billno_type` | `cost_billno_type` | `costBillNoType` | 结转成本单据 |
| `collaboration_source` | `collaboration_source` | `collaborationSource` | 协同来源单据类型 |
| `out_sys_rowno` | `out_sys_rowno` | `out_sys_rowno` | 外部来源行号 |
| `idKey` | `idKey` | `idKey` | 行标识 |
| `collaboration_pocode` | `collaboration_pocode` | `collaborationPocode` | 协同来源单据号 |
| `out_sys_lineid` | `out_sys_lineid` | `out_sys_lineid` | 外部来源行 |
| `cCoUpcode` | `cCoUpcode` | `coUpcode` | 协同源头单据号 |
| `invProductTypeAlias` | `invProductTypeAlias` | `invProductTypeAlias` | 商品类型 |
| `` | `subBusinessSourceNo` | `subBusinessSourceNo` | 子业务源头单据号 |
| `` | `subBusinessSourceType` | `subBusinessSourceType` | 子业务源头单据类型 |
| `contractLot` | `contractLot` | `contractLot` | 贸易合同批次 |
| `contractTpye` | `contractTpye` | `contractTpye` | 合同类型 |
| `deliveryLot` | `deliveryLot` | `deliveryLot` | 贸易合同交付批号 |
| `cChargeUnitName` | `cChargeUnitName` | `chargeUnitName` | 计价单位名称 |
| `` | `free1` | `free1` | 规格1 |
| `` | `free10` | `free10` | 规格10 |
| `` | `free2` | `free2` | 规格2 |
| `` | `free3` | `free3` | 规格3 |
| `` | `free4` | `free4` | 规格4 |
| `` | `free5` | `free5` | 规格5 |
| `` | `free6` | `free6` | 规格6 |
| `` | `free7` | `free7` | 规格7 |
| `` | `free8` | `free8` | 规格8 |
| `` | `free9` | `free9` | 规格9 |
| `cProductCode` | `cProductCode` | `productCode` | 商品编码 |
| `cProductName` | `cProductName` | `productName` | 商品名称 |
| `cProjectCode` | `cProjectCode` | `projectCode` | 项目编码 |
| `cProjectName` | `cProjectName` | `projectName` | 项目名称 |
| `cSaleDeptName` | `cSaleDeptName` | `saleDeptName` | 销售部门名称 |
| `cSaleUserName` | `cSaleUserName` | `saleUserName` | 业务员名称 |
| `salesoutAccountingMethod` | `salesoutAccountingMethod` | `salesoutAccountingMethod` | 出库立账方式 |
| `cUnitName` | `cUnitName` | `unitName` | 主单位名称 |
| `cSrcVoucherNo` | `cSrcVoucherNo` | `srcVoucherNo` | 来源单据号 |
| `cSrcVoucherColumnNo` | `cSrcVoucherColumnNo` | `srcVoucherColumnNo` | 来源单据行号 |
| `cSrcVoucherChildColumnNo` | `cSrcVoucherChildColumnNo` | `srcVoucherChildColumnNo` | 来源单据子行号 |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单类型编码 |
| `cSpeciDes` | `cSpeciDes` | `speciDes` | 规格 |
| `cCusProductCode` | `cCusProductCode` | `cusProductCode` | 客户商品编号 |
| `cCusProductName` | `cCusProductName` | `cusProductName` | 客户商品名称 |
| `cCusProductVersion` | `cCusProductVersion` | `cusProductVersion` | 客户商品型号 |
| `cCusSkuCode` | `cCusSkuCode` | `cusSkuCode` | 客户SKU编码 |
| `invProductType` | `invProductType` | `invProductType` | 商品售卖类型 |
| `cBatchNo` | `cBatchNo` | `batchNo` | 批次号 |
| `cTaxCode` | `cTaxCode` | `taxCode` | 税目税率编码 |
| `cTaxItems` | `cTaxItems` | `taxItems` | 税目 |
| `` | `source` | `source` | 来源单据类型 |
| `sactcode` | `sactcode` | `sactCode` | 销售合同编码 |
| `iSaleturnCode` | `iSaleturnCode` | `saleturnCode` | 销售退货code |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `upcode` | `upcode` | `upcode` | 上游单据号(回写接口使用) |
| `cMemo` | `cMemo` | `memo` | 行备注 |
| `carryOverOfCostMethod` | `carryOverOfCostMethod` | `carryOverOfCostMethod` | 结转方式 |
| `salePriceSettlementCode` | `salePriceSettlementCode` | `salePriceSettlementCode` | 销售价格结算单号 |
| `sourceinvno` | `sourceinvno` | `sourceInvNo` | 来源销售发票号 |
| `source_sys` | `source_sys` | `sourcesys` | 来源系统 |

### 引用字段 (32个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `agentProductId` | `agentProductId` | `agentProductId` | 客户商品ID |
| `wbs` | `wbs` | `wbs` | WBS |
| `work_transfer_owner` | `work_transfer_owner` | `workTransferOwner` | 工作移交负责人 |
| `iwarehouse` | `iwarehouse` | `warehouse` | 仓库 |
| `activity` | `activity` | `activity` | 活动 |
| `` | `reserveid` | `reserveid` | 跟踪线索Id |
| `lineAgentId` | `lineAgentId` | `merchantAuth` | 客户权限 |
| `` | `tradeRouteID` | `tradeRouteID` | 贸易路径Id |
| `lineAgentId` | `lineAgentId` | `lineAgentId` | 行客户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `ptoId` | `ptoId` | `ptoId` | PTO件id |
| `iReceiverCust` | `iReceiverCust` | `receiverCustId` | 收货客户 |
| `consumer_profit_center` | `consumer_profit_center` | `consumerProfitCenter` | 需方利润中心 |
| `cost_center` | `cost_center` | `costCenter` | 成本中心 |
| `provider_profit_center` | `provider_profit_center` | `providerProfitCenter` | 供方利润中心 |
| `mainid` | `mainid` | `mainid` | 主体ID |
| `iSaleOrgId` | `iSaleOrgId` | `saleOrgId` | 销售组织Id |
| `iReceiveAgreementId` | `iReceiveAgreementId` | `receiveAgreementId` | 收款协议id |
| `iProductId` | `iProductId` | `productId` | 商品ID |
| `iSkuId` | `iSkuId` | `skuId` | SkuID |
| `cProjectId` | `cProjectId` | `projectId` | 项目id |
| `iUnitId` | `iUnitId` | `unitId` | 主计量单位 |
| `iChargeUnitId` | `iChargeUnitId` | `chargeUnitId` | 计价单位 |
| `iTaxId` | `iTaxId` | `taxId` | 税目Id |
| `iSaleDeptId` | `iSaleDeptId` | `saleDeptId` | 销售部门 |
| `iSaleUserId` | `iSaleUserId` | `saleUserId` | 销售业务员 |
| `iStockOrgId` | `iStockOrgId` | `stockOrgId` | 库存组织id |
| `iNatCurrentId` | `iNatCurrentId` | `natCurrentId` | 本币 |
| `iBlueInvDetailId` | `iBlueInvDetailId` | `blueInvDetailId` | 蓝字发票行Id |
| `sourceinvdetailid` | `sourceinvdetailid` | `sourceInvDetailId` | 来源销售发票行Id |
| `sourceinvid` | `sourceinvid` | `sourceInvId` | 来源销售发票ID |
| `tax_code_id` | `tax_code_id` | `taxCodeId` | 税码 |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `salesoutvouchdate` | `salesoutvouchdate` | `saleSoutVouchDate` | 销售出库单据日期 |
| `pricedate` | `pricedate` | `priceDate` | 定价日期 |
| `iTaxStartDate` | `iTaxStartDate` | `taxStartDate` | 起算日 |
| `iTaxEndDate` | `iTaxEndDate` | `taxEndDate` | 到期日 |

### 布尔字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `revmanagecalculate` | `revmanagecalculate` | `checkByRevenueManagement` | 收入管理核算 |
| `issued_revsettleinfo` | `issued_revsettleinfo` | `issuedRevSettleInfo` | 已生成收入结算信息 |
| `internalsign` | `internalsign` | `internalSign` | 内部交易标识 |
| `isAdvRecInv` | `isAdvRecInv` | `isAdvRecInv` | 预收款开票 |
| `offsetAdvRecInv` | `offsetAdvRecInv` | `offsetAdvRecInv` | 冲抵预收款开票 |
| `taxIssuedDiscountline` | `taxIssuedDiscountline` | `taxIssuedDiscountline` | 税票开具折扣行 |
| `isAccEstimate` | `isAccEstimate` | `isAccEstimate` | 是否应收暂估回冲/调整 |
| `iPriceMark` | `iPriceMark` | `priceMark` | 价格标识 |
| `isUpdateCost` | `isUpdateCost` | `isUpdateCost` | 是否更新存货 |
| `isScrap` | `isScrap` | `isScrap` | 是否废品 |
| `rebateflag` | `rebateflag` | `rebateFlag` | 是否使用返利 |

### 整数 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iordertype` | `iordertype` | `orderType` | 订单类型 |
| `iColumnNo` | `iColumnNo` | `columnNo` | 行号 |
| `unitExchangeType` | `unitExchangeType` | `unitExchangeType` | 浮动(销售) |
| `unitExchangeTypePrice` | `unitExchangeTypePrice` | `unitExchangeTypePrice` | 浮动(计价) |
| `rowno` | `rowno` | `rowno` | 行号 |
| `iTaxControlColumnNo` | `iTaxControlColumnNo` | `taxControlColumnNo` | 税控行行号 |
| `advancepaymentoffsetmethod` | `advancepaymentoffsetmethod` | `advancePaymentOffsetMethod` | 预收款开票冲抵方式 |
| `ptoHierarchyType` | `ptoHierarchyType` | `ptoHierarchyType` | 层级结构类型 |
| `ptoPricingMethod` | `ptoPricingMethod` | `ptoPricingMethod` | 定价方式 |
| `throw_status` | `throw_status` | `throwStatus` | 抛单状态 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `excessivesigning` | `excessivesigning` | `excessiveSigning` | 超量签收 |
| `calbase` | `calbase` | `calBase` | 计算基准 |
| `prepayInvRvnRecogBkgMeth` | `prepayInvRvnRecogBkgMeth` | `prepayInvRvnRecogBkgMeth` | 预收款开票应收入账方式 |
| `` | `isEndTrade` | `isEndTrade` | 是否末级 |

### 长整数 (30个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `orderId` | `orderId` | `orderId` | 订单主表id |
| `orderDetailId` | `orderDetailId` | `orderDetailId` | 订单子表id |
| `` | `firstsourceid` | `firstsourceid` | 源头单据主表id |
| `` | `firstsourceautoid` | `firstsourceautoid` | 源头单据子表id |
| `` | `backSettleDetailId` | `backSettleDetailId` | 结算单子表回写id |
| `` | `backSettleId` | `backSettleId` | 结算单主表回写id |
| `iCoSourceautoid` | `iCoSourceautoid` | `coSourceautoid` | 协同源头单据行id |
| `iCoSourceid` | `iCoSourceid` | `coSourceid` | 协同源头单据头id |
| `receiptdetailid` | `receiptdetailid` | `receiptDetailId` | 签收确认子表id |
| `receiptid` | `receiptid` | `receiptId` | 签收确认主表id |
| `collaboration_poid` | `collaboration_poid` | `collaborationPoid` | 协同来源单据主表id |
| `collaboration_podetailid` | `collaboration_podetailid` | `collaborationPodetailid` | 协同来源单据子表id |
| `offsetId` | `offsetId` | `offsetId` | 冲抵行id |
| `iPriceRecordId` | `iPriceRecordId` | `priceRecordId` | 定价记录id |
| `ptoRowId` | `ptoRowId` | `ptoRowId` | PTO件行id |
| `` | `settleDetailId` | `settleDetailId` | 结算单子表id |
| `` | `settleId` | `settleId` | 结价id |
| `` | `subBusinessSourceId` | `subBusinessSourceId` | 子业务源头单据id |
| `` | `subBusinessSourceLineId` | `subBusinessSourceLineId` | 子业务源头单据行id |
| `iSourceid` | `iSourceid` | `sourceid` | 来源单据ID |
| `iSourceautoid` | `iSourceautoid` | `sourceautoid` | 来源单据子表ID |
| `sactid` | `sactid` | `sactId` | 销售合同表头id |
| `sacoid` | `sacoid` | `sacoId` | 销售合同表体行id |
| `rebateDetailId` | `rebateDetailId` | `rebateDetailId` | 返利单商品表体id |
| `iSaleturnId` | `iSaleturnId` | `saleturnId` | 销售退货表头id |
| `iSaletrunDetailId` | `iSaletrunDetailId` | `saletrunDetailId` | 销售退货表体行id |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |
| `salePriceSettlementDetailId` | `salePriceSettlementDetailId` | `salePriceSettlementDetailId` | 销售价格结算子表ID |
| `salePriceSettlementId` | `salePriceSettlementId` | `salePriceSettlementId` | 销售价格结算单主表ID |

### 数值字段 (73个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `firstlineno` | `firstlineno` | `firstlineno` | 源头单据行号 |
| `fCoPurinvoiceQty` | `fCoPurinvoiceQty` | `coPurinvoiceQty` | 协同采购发票数量 |
| `coSourceLineNo` | `coSourceLineNo` | `coSourceLineNo` | 协同源头单据行号 |
| `receipt_lineno` | `receipt_lineno` | `receiptLineNo` | 签收确认行号 |
| `invoicerebatemoney` | `invoicerebatemoney` | `invoiceRebateMoney` | 发票返利分摊金额 |
| `blueinvlineno` | `blueinvlineno` | `blueInvlineno` | 蓝字发票行号 |
| `totalredqty` | `totalredqty` | `totalRedQty` | 累计红冲数量 |
| `totalredpriceqty` | `totalredpriceqty` | `totalRedPriceQty` | 累计红冲计价数量 |
| `totalredorisum` | `totalredorisum` | `totalRedOrisum` | 累计红冲金额 |
| `fnotaxsaleprice` | `fnotaxsaleprice` | `noTaxSalePrice` | 无税报价 |
| `fnotaxsalecost` | `fnotaxsalecost` | `noTaxSaleCost` | 无税报价金额 |
| `offsetAdvRecInvQty` | `offsetAdvRecInvQty` | `offsetAdvRecInvQty` | 冲抵预收款开票数量 |
| `fFavorableRate` | `fFavorableRate` | `favorableRate` | 倒扣 |
| `offsetAdvRecInvNatMoney` | `offsetAdvRecInvNatMoney` | `offsetAdvRecInvNatMoney` | 冲抵预收款开票本币金额 |
| `offsetNo` | `offsetNo` | `offsetNo` | 冲抵行号 |
| `` | `tradeRouteLineno` | `tradeRouteLineno` | 站点 |
| `offsetAdvRecInvTaxMoney` | `offsetAdvRecInvTaxMoney` | `offsetAdvRecInvTaxMoney` | 冲抵预收款开票税额 |
| `collaboration_porowno` | `collaboration_porowno` | `collaborationPorowno` | 协同来源单据行号 |
| `offsetAdvRecInvNatTaxMoney` | `offsetAdvRecInvNatTaxMoney` | `offsetAdvRecInvNatTaxMoney` | 冲抵预收款开票本币税额 |
| `offsetAdvRecInvMoney` | `offsetAdvRecInvMoney` | `offsetAdvRecInvMoney` | 冲抵预收款开票金额 |
| `orderDetailLineno` | `orderDetailLineno` | `orderDetailLineno` | 订单行号 |
| `ptoCostScrap` | `ptoCostScrap` | `ptoCostScrap` | 成本比例 |
| `ptoQty` | `ptoQty` | `ptoQty` | PTO件底数 |
| `ptoSonQty` | `ptoSonQty` | `ptoSonQty` | PTO子件主数量 |
| `sacoLineno` | `sacoLineno` | `sacoLineno` | 合同行号 |
| `` | `settleDetailLineno` | `settleDetailLineno` | 结算单子表行号 |
| `` | `subBusinessSourceLineNo` | `subBusinessSourceLineNo` | 子业务源头单据行号 |
| `fDiscountRate` | `fDiscountRate` | `discountRate` | 扣率% |
| `fLineDiscountMoney` | `fLineDiscountMoney` | `lineDiscountMoney` | 扣额 |
| `fLineNatDiscountMoney` | `fLineNatDiscountMoney` | `lineNatDiscountMoney` | 本币扣额 |
| `lineno` | `lineno` | `lineno` | 行号 |
| `fSaleCost` | `fSaleCost` | `saleCost` | 含税报价金额 |
| `fSalePrice` | `fSalePrice` | `salePrice` | 含税报价 |
| `qty` | `qty` | `qty` | 数量 |
| `priceQty` | `priceQty` | `priceQty` | 计价数量 |
| `` | `invPriceExchRate` | `invPriceExchRate` | 计价换算率 |
| `` | `subQty` | `subQty` | 销售数量 |
| `` | `invExchRate` | `invExchRate` | 销售换算率 |
| `iOrigUnitPrice` | `iOrigUnitPrice` | `oriUnitPrice` | 无税单价 |
| `iOrigTaxUnitPrice` | `iOrigTaxUnitPrice` | `oriTaxUnitPrice` | 含税单价 |
| `iOrigMoney` | `iOrigMoney` | `oriMoney` | 无税金额 |
| `iOrigTaxMoney` | `iOrigTaxMoney` | `oriSum` | 含税金额 |
| `fSourceOriPrice` | `fSourceOriPrice` | `sourceOriPrice` | 来源行成交价 |
| `iOrigTaxRate` | `iOrigTaxRate` | `taxRate` | 税率% |
| `iOrigTax` | `iOrigTax` | `oriTax` | 税额 |
| `iNatMoney` | `iNatMoney` | `natMoney` | 本币无税金额 |
| `iNatUnitPrice` | `iNatUnitPrice` | `natUnitPrice` | 本币无税单价 |
| `iNatTaxUnitPrice` | `iNatTaxUnitPrice` | `natTaxUnitPrice` | 本币含税单价 |
| `iNatTaxMoney` | `iNatTaxMoney` | `natSum` | 本币含税金额 |
| `iNatTax` | `iNatTax` | `natTax` | 本币税额 |
| `uplineno` | `uplineno` | `uplineno` | 来源单据行号 |
| `iOrigAccReceiveMoney` | `iOrigAccReceiveMoney` | `accOrigReceiveMoney` | 累计核销金额 |
| `iNatAccReceiveMoney` | `iNatAccReceiveMoney` | `natAccReceiveMoney` | 本币累计核销金额 |
| `fRebateMoney` | `fRebateMoney` | `rebateMoney` | 返利分摊金额 |
| `fOrderRebateMoney` | `fOrderRebateMoney` | `orderRebateMoney` | 货补分摊金额 |
| `fcashRebateMoney` | `fcashRebateMoney` | `cashRebateMoney` | 返利直接抵现 |
| `fRebateMoney_domestic` | `fRebateMoney_domestic` | `rebateMoneyDomestic` | 返利本币分摊金额 |
| `fOrderRebateMoney_domestic` | `fOrderRebateMoney_domestic` | `orderRebateMoneyDomestic` | 本币货补分摊金额 |
| `fCashRebateMoney_domestic` | `fCashRebateMoney_domestic` | `cashRebateMoneyDomestic` | 返利本币直接抵现 |
| `issuedTaxMoney` | `issuedTaxMoney` | `issuedTaxMoney` | 已开税票金额 |
| `iAccReceiveQuantity` | `iAccReceiveQuantity` | `accReceiveQuantity` | 累计收款数量 |
| `inspectiondeductqty` | `inspectiondeductqty` | `inspectionDeductQty` | 质检扣重 |
| `invexchrateden` | `invexchrateden` | `invExchRateDen` | 换算率分母 |
| `invexchratenum` | `invexchratenum` | `invExchRateNum` | 换算率分子 |
| `invpriceexchrateden` | `invpriceexchrateden` | `invPriceExchRateDen` | 计价换算率分母 |
| `invpriceexchratenum` | `invpriceexchratenum` | `invPriceExchRateNum` | 计价换算率分子 |
| `issuedTaxAmount` | `issuedTaxAmount` | `issuedTaxAmount` | 开税票税额 |
| `issuedTaxQty` | `issuedTaxQty` | `issuedTaxQty` | 开税票数量 |
| `issuedTaxSum` | `issuedTaxSum` | `issuedTaxSum` | 开税票含税金额 |
| `natwithholdingtax` | `natwithholdingtax` | `natWithholdingTax` | 本币代扣税税额 |
| `oriwithholdingtax` | `oriwithholdingtax` | `oriWithholdingTax` | 代扣税税额 |
| `salePriceSettlementDetailLineno` | `salePriceSettlementDetailLineno` | `salePriceSettlementDetailLineno` | 销售价格结算行号 |
| `sourceinvlineno` | `sourceinvlineno` | `sourceInvLineNo` | 来源销售发票行号 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `saleInvoiceDetailCharacteristics` | `saleInvoiceDetailCharacteristics` | `saleInvoiceDetailCharacteristics` | 自由项特征组 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `saleInvoiceDetailDefineCharacter` | `saleInvoiceDetailDefineCharacter` | `saleInvoiceDetailDefineCharacter` | 自定义项特征属性组 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iInvoiceSource` | `iInvoiceSource` | `invoiceSource` | 来源单据类型 |
| `` | `` | `bodyFreeItem` | 销售发票表体自由自定义项 |
| `` | `` | `bodyItem` | 销售发票表体自定义项 |
| `` | `` | `paymentExeDetails` | 收款执行明细 |
| `` | `` | `taxResults` | 计税结果 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
