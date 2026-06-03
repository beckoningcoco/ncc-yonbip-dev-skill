---
tags: [BIP, 元数据, 数据字典, voucher.order.OrderDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 订单详情 (`voucher.order.OrderDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`orderdetail` | domain：`udinghuo` | 应用：`SCMSA` | 业务对象ID：`6fb7330b-6ca0-4a34-b8dd-77e5a1ede3ff`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 订单详情 |
| 物理表 | `orderdetail` |
| 数据库 schema | `udinghuo` |
| 所属应用 | `SCMSA` |
| 直连字段 | 324 个 |
| 子表 | 5 个 |
| 关联引用 | 50 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `detailDeliveryPlans` | `voucher.order.OrderDetailDeliveryPlan` | composition |
| `bodyItem` | `voucher.order.OrderDetailDefine` | composition |
| `bodyFreeItem` | `voucher.order.OrderDetailFreeDefine` | composition |
| `orderDetailPrices` | `voucher.order.OrderDetailPrice` | composition |
| `orderProductApportions` | `voucher.order.OrderProductApportion` | composition |

## 关联引用 (50个)

| 字段名 | 引用类型 |
|--------|---------|
| `iOrderDetailPriceId` | `` |
| `iorderId` | `` |
| `orderDetailDefineCharacter` | `` |
| `ptoId` | `` |
| `wbs` | `` |
| `iOrgId` | `` |
| `iRebateReturnProductId` | `` |
| `shipPointId` | `uscmpub.usp_sendandreceivesiteref` |
| `provider_profit_center` | `finbd.bd_allaccbodyref_inner` |
| `cDomesticPk` | `` |
| `iReceiver` | `` |
| `logisticsOrgId` | `ucf-staff-center.bd_logisticsorg` |
| `iSKUId` | `productcenter.productskuref` |
| `suiteId` | `` |
| `` | `` |
| `iProductId` | `productcenter.productref` |
| `cost_center` | `finbd.bd_costcenterref` |
| `iMasterUnitId` | `` |
| `iReceiveStore` | `yxybase.aa_storeterminal` |
| `iSaleDepartmentId` | `` |
| `cTaxId` | `` |
| `iSettlementOrgId` | `udinghuo.financeOrgref` |
| `loadModeId` | `productcenter.base_loadwayref` |
| `cProjectId` | `ucfbasedoc.bd_outer_projectcardMCref` |
| `iProductAuxUnitId` | `productcenter.pc_productassitunitsref` |
| `activity` | `` |
| `agentProductId` | `` |
| `planTransRouteId` | `uscmpub.usp_plantransportrouteref` |
| `iBatchId` | `` |
| `variantConfiguration` | `` |
| `iProductLineId` | `` |
| `startAreaId` | `productcenter.base_shipregionref` |
| `iTransactionTypeId` | `` |
| `ytenant_id` | `` |
| `orderDetailCharacteristics` | `` |
| `consumer_profit_center` | `finbd.bd_allaccbodyref_inner` |
| `optionCharacteristics` | `` |
| `iStockId` | `udinghuo.aa_warehouseref` |
| `iReceiverCust` | `productcenter.merchantRef` |
| `iStockOrgId` | `udinghuo.stockOrgref` |
| `cCostCurrencyPK` | `ucfbasedoc.bd_currencytenantref` |
| `iProductUnitId` | `productcenter.pc_productassitunitsref` |
| `iSalesOrgId` | `` |

## 继承接口 (31个, 140字段)

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
- **生单回写** (`base.itf.IBackWrite`)
  - `groupTaskKey` → `groupTaskKey`
  - `makerule_code` → `makerule_code`
  - `` → ``
  - `` → ``
  - `` → ``
  - `sourceMainPubts` → `sourceMainPubts`
  - `` → ``
- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **社会化协同** (`base.itf.ISocialCoordination`)
  - `` → ``
- **计量单位信息** (`voucher.base.IUOMInfo`)
  - `` → ``
  - `` → ``
  - `` → ``
- **计价单位信息** (`voucher.base.IUOMPriceInfo`)
  - `` → ``
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
- **发票回写接口** (`uorder.voucher.IInvoiceReWrite`)
  - `invoiceOriSum` → `invoiceOriSum`
  - `invoiceQty` → `invoiceQty`
- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **源头单据信息** (`sale.aa.IFirstSourceData`)
  - `firstlineno` → `firstlineno`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
- **行关闭信息** (`base.itf.ILineClosing`)
  - `linecloser` → `linecloser`
  - `lineclose_time` → `lineclose_time`
- **预留对象相关** (`st.reservation.IReservationID`)
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
- **套件信息** (`sale.aa.ISuiteInfo`)
  - `suiteGroup` → `suiteGroup`
  - `suiteId` → `suiteId`
  - `cSuiteQuotePrice` → `cSuiteQuotePrice`
  - `suiteSon_amount` → `suiteSon_amount`
  - `suiteSon_priceWeight` → `suiteSon_priceWeight`
  - `suite_amount` → `suite_amount`
- **后端自动行号接口** (`base.itf.ILineNo`)
  - `lineno` → `lineno`
- **来源单据行号接口** (`sale.aa.IUpLineNo`)
  - `uplineno` → `uplineno`
- **伙伴表体接口** (`uorder.voucher.ICustLine`)
  - `iMerchAddrAutoSynFlag` → `iMerchAddrAutoSynFlag`
  - `iReceiveAddress` → `iReceiveAddress`
  - `iReceiveCode` → `iReceiveCode`
  - `iReceiveMobile` → `iReceiveMobile`
  - `cReceiver` → `cReceiver`
  - `iReceiverCust` → `iReceiverCust`
  - `iReceiver` → `iReceiver`
  - `iReceiveStore` → `iReceiveStore`
  - `iReceiveTelePhone` → `iReceiveTelePhone`
  - `iReceiveZipCode` → `iReceiveZipCode`
- **财务成本中心** (`sale.aa.CostCenter`)
  - `cost_center` → `cost_center`
- **财务利润中心** (`sale.aa.ProfitCenter`)
  - `consumer_profit_center` → `consumer_profit_center`
  - `provider_profit_center` → `provider_profit_center`
- **特征适配相关信息** (`gscm.itf.CharacterInfo`)
  - `stockSensClue` → `stockSensClue`
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
- **自定义项(批次)** (`base.itf.UserdefItemBatch`)
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
- **PTO信息** (`usp.pto.IProductToOrder`)
  - `ptoCostScrap` → `ptoCostScrap`
  - `ptoHierarchyType` → `ptoHierarchyType`
  - `ptoId` → `ptoId`
  - `ptoPricingMethod` → `ptoPricingMethod`
  - `ptoQty` → `ptoQty`
  - `ptoRowId` → `ptoRowId`
  - `ptoSonQty` → `ptoSonQty`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **外部来源行线索** (`base.itf.IOutSysObjLineClue`)
  - `out_sys_lineid` → `out_sys_lineid`
  - `out_sys_rowno` → `out_sys_rowno`
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

## 字段列表（按类型分组）

> 共 324 个直连字段

### 文本字段 (102个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `idKey` | `idKey` | `idKey` | 行标识 |
| `cProductCode` | `cProductCode` | `productCode` | 商品编码 |
| `cProductName` | `cProductName` | `productName` | 商品名称 |
| `cSkuCode` | `cSkuCode` | `skuCode` | sku编码 |
| `cOrderProductType` | `cOrderProductType` | `orderProductType` | 商品售卖类型 |
| `cMasterUnitMeasure` | `cMasterUnitMeasure` | `qtyName` | 主计量 |
| `cProductUnitName` | `cProductUnitName` | `productUnitName` | 计价单位 |
| `cProductAuxUnitName` | `cProductAuxUnitName` | `productAuxUnitName` | 销售单位 |
| `iReceiveCode` | `iReceiveCode` | `receiveCode` | 收货地址编码 |
| `out_sys_lineid` | `out_sys_lineid` | `out_sys_lineid` | 外部来源行 |
| `lineCloseReason` | `lineCloseReason` | `lineCloseReason` | 订单行关闭原因 |
| `collaboration_source` | `collaboration_source` | `collaborationSource` | 协同来源单据类型 |
| `cProductLineName` | `cProductLineName` | `productLineName` | 产品线名称 |
| `out_sys_rowno` | `out_sys_rowno` | `out_sys_rowno` | 外部来源行号 |
| `collaboration_pocode` | `collaboration_pocode` | `collaborationPocode` | 协同来源单据号 |
| `cTaxCode` | `cTaxCode` | `taxCode` | 税目税率编码 |
| `cTaxItems` | `cTaxItems` | `taxItems` | 税目 |
| `cCostCurrencyName` | `cCostCurrencyName` | `costCurrencyName` | 成本币种 |
| `cCostCurrencyCode` | `cCostCurrencyCode` | `costCurrencyCode` | 成本币种简称 |
| `cCostId` | `cCostId` | `costId` | 成本价格记录id |
| `productId_priceListFlag` | `productId_priceListFlag` | `productId_priceListFlag` | 价表取价标记 |
| `cStockName` | `cStockName` | `stockName` | 仓库名称 |
| `cReceiver` | `cReceiver` | `receiver` | 收货人 |
| `iReceiveMobile` | `iReceiveMobile` | `receiveMobile` | 收货电话 |
| `iReceiveTelePhone` | `iReceiveTelePhone` | `receiveTelePhone` | 收货人固定电话 |
| `iReceiveAddress` | `iReceiveAddress` | `receiveAddress` | 收货地址 |
| `iReceiveZipCode` | `iReceiveZipCode` | `receiveZipCode` | 收货人邮编 |
| `cErpCode` | `cErpCode` | `erpCode` | skuERP编码 |
| `stockSensClue` | `stockSensClue` | `stockSensClue` | 现存量特征敏感线索 |
| `cSpecDescription` | `cSpecDescription` | `specDescription` | 规格 |
| `` | `free1` | `free1` | 物料规格1 |
| `` | `free2` | `free2` | 物料规格2 |
| `` | `free3` | `free3` | 物料规格3 |
| `` | `free4` | `free4` | 物料规格4 |
| `` | `free5` | `free5` | 物料规格5 |
| `` | `free6` | `free6` | 物料规格6 |
| `` | `free7` | `free7` | 物料规格7 |
| `` | `free8` | `free8` | 物料规格8 |
| `` | `free9` | `free9` | 物料规格9 |
| `` | `free10` | `free10` | 物料规格10 |
| `linecloser` | `linecloser` | `linecloser` | 关闭人 |
| `cMemo` | `cMemo` | `memo` | 行备注 |
| `cBatchNo` | `cBatchNo` | `batchNo` | 批次号 |
| `cExpireDateUnit` | `cExpireDateUnit` | `expireDateUnit` | 保质期单位 |
| `` | `define1` | `define1` | 批次属性1 |
| `` | `define2` | `define2` | 批次属性2 |
| `` | `define3` | `define3` | 批次属性3 |
| `` | `define4` | `define4` | 批次属性4 |
| `` | `define5` | `define5` | 批次属性5 |
| `` | `define6` | `define6` | 批次属性6 |
| `` | `define7` | `define7` | 批次属性7 |
| `` | `define8` | `define8` | 批次属性8 |
| `` | `define9` | `define9` | 批次属性9 |
| `` | `define10` | `define10` | 批次属性10 |
| `` | `define11` | `define11` | 批次属性11 |
| `` | `define12` | `define12` | 批次属性12 |
| `` | `define13` | `define13` | 批次属性13 |
| `` | `define14` | `define14` | 批次属性14 |
| `` | `define15` | `define15` | 批次属性15 |
| `` | `define16` | `define16` | 批次属性16 |
| `` | `define17` | `define17` | 批次属性17 |
| `` | `define18` | `define18` | 批次属性18 |
| `` | `define19` | `define19` | 批次属性19 |
| `` | `define20` | `define20` | 批次属性20 |
| `` | `define21` | `define21` | 批次属性21 |
| `` | `define22` | `define22` | 批次属性22 |
| `` | `define23` | `define23` | 批次属性23 |
| `` | `define24` | `define24` | 批次属性24 |
| `` | `define25` | `define25` | 批次属性25 |
| `` | `define26` | `define26` | 批次属性26 |
| `` | `define27` | `define27` | 批次属性27 |
| `` | `define28` | `define28` | 批次属性28 |
| `` | `define29` | `define29` | 批次属性29 |
| `` | `define30` | `define30` | 批次属性30 |
| `distributionSide` | `distributionSide` | `distributionSide` | 配送方 |
| `cSourceType` | `cSourceType` | `source` | 来源单据类型 |
| `cOrderNo` | `cOrderNo` | `code` | 订单号 |
| `` | `firstsource` | `firstsource` | 源头单据类型 |
| `` | `firstupcode` | `firstupcode` | 源头单据号 |
| `contractTpye` | `contractTpye` | `contractTpye` | 合同类型 |
| `sactcode` | `sactcode` | `sactCode` | 销售合同编码 |
| `deliveryLot` | `deliveryLot` | `deliveryLot` | 贸易合同交付批号 |
| `contractLot` | `contractLot` | `contractLot` | 贸易合同批次 |
| `cSourceType` | `cSourceType` | `sourceType` | 协同来源单据类型 |
| `csynSourceNo` | `csynSourceNo` | `upcode` | 协同来源单据号 |
| `cCoSourceType` | `cCoSourceType` | `coSourceType` | 协同源头单据类型 |
| `cCoUpcode` | `cCoUpcode` | `coUpcode` | 协同源头单据号 |
| `` | `subBusinessSourceType` | `subBusinessSourceType` | 子业务源头单据类型 |
| `` | `subBusinessSourceNo` | `subBusinessSourceNo` | 子业务源头单据号 |
| `reserveidDemandtype` | `reserveidDemandtype` | `reserveidDemandtype` | 需求跟踪方式 |
| `suiteGroup` | `suiteGroup` | `suiteGroup` | 套件组号 |
| `cCreator` | `cCreator` | `cCreator` | 创建人 |
| `cModifier` | `cModifier` | `cModifier` | 修改人 |
| `productId_pbatchName` | `productId_pbatchName` | `productId_pbatchName` | 商品包装单位 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `cMutualActivities` | `cMutualActivities` | `mutualActivities` | 活动的对象,用于校验互斥活动 |
| `cActivities` | `cActivities` | `activities` | 包含的类型,用于校验互斥 |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编码 |
| `cOutSysKey` | `cOutSysKey` | `outSysKey` | 接口标识 |
| `cBizName` | `cBizName` | `cBizName` | 供应商名称 |
| `cSkuOutSysKey` | `cSkuOutSysKey` | `cSkuOutSysKey` | 未定义名称 |
| `cProductOutSysKey` | `cProductOutSysKey` | `cProductOutSysKey` | 未定义名称 |

### 引用字段 (42个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iorderId` | `iorderId` | `orderId` | 主表关联标识 |
| `iProductId` | `iProductId` | `productId` | 商品id |
| `iSKUId` | `iSKUId` | `skuId` | skuId |
| `agentProductId` | `agentProductId` | `agentProductId` | 客户商品ID |
| `iMasterUnitId` | `iMasterUnitId` | `masterUnitId` | 主计量单位id |
| `iProductUnitId` | `iProductUnitId` | `iProductUnitId` | 计价单位id |
| `iProductAuxUnitId` | `iProductAuxUnitId` | `iProductAuxUnitId` | 销售单位id |
| `activity` | `activity` | `activity` | 活动 |
| `iProductLineId` | `iProductLineId` | `productLineId` | 产品线id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `ptoId` | `ptoId` | `ptoId` | PTO件id |
| `wbs` | `wbs` | `wbs` | WBS |
| `` | `tradeRouteID` | `tradeRouteID` | 贸易路径Id |
| `cTaxId` | `cTaxId` | `taxId` | 税目税率id |
| `cDomesticPk` | `cDomesticPk` | `natCurrency` | 本币pk |
| `cCostCurrencyPK` | `cCostCurrencyPK` | `costCurrency` | 成本币种pk |
| `provider_profit_center` | `provider_profit_center` | `providerProfitCenter` | 供方利润中心 |
| `consumer_profit_center` | `consumer_profit_center` | `consumerProfitCenter` | 需方利润中心 |
| `cost_center` | `cost_center` | `costCenter` | 成本中心 |
| `iRebateReturnProductId` | `iRebateReturnProductId` | `rebateReturnProductId` | 返货单商品id |
| `iStockOrgId` | `iStockOrgId` | `stockOrgId` | 库存组织id |
| `iSettlementOrgId` | `iSettlementOrgId` | `settlementOrgId` | 开票组织 |
| `iStockId` | `iStockId` | `stockId` | 仓库ID |
| `cProjectId` | `cProjectId` | `projectId` | 项目id |
| `iReceiverCust` | `iReceiverCust` | `receiverCustId` | 收货客户 |
| `iReceiveStore` | `iReceiveStore` | `receiveStoreId` | 收货终端网点 |
| `iReceiver` | `iReceiver` | `receiverId` | 收货人id |
| `variantConfiguration` | `variantConfiguration` | `variantConfiguration` | 选配参数文件id |
| `iOrgId` | `iOrgId` | `iOrgId` | 组织ID |
| `iTransactionTypeId` | `iTransactionTypeId` | `transactionTypeId` | 交易类型 |
| `iSalesOrgId` | `iSalesOrgId` | `salesOrgId` | 销售组织id |
| `iSaleDepartmentId` | `iSaleDepartmentId` | `saleDepartmentId` | 销售部门id |
| `iBatchId` | `iBatchId` | `batchId` | 批次id |
| `logisticsOrgId` | `logisticsOrgId` | `logisticsOrgId` | 物流组织id |
| `shipPointId` | `shipPointId` | `shipPointId` | 发货点id |
| `loadModeId` | `loadModeId` | `loadModeId` | 装载方式id |
| `startAreaId` | `startAreaId` | `startAreaId` | 始发地运输区域id |
| `planTransRouteId` | `planTransRouteId` | `planTransRouteId` | 计划运输路线id |
| `` | `reserveid` | `reserveid` | 预留id |
| `suiteId` | `suiteId` | `suiteId` | 套件-id |
| `iProductId` | `iProductId` | `productAuth` | 物料权限 |
| `iOrderDetailPriceId` | `iOrderDetailPriceId` | `orderDetailPrice` | 订单金额 |

### 日期字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dConsignTime` | `dConsignTime` | `consignTime` | 计划发货日期 |
| `dHopeReceiveDate` | `dHopeReceiveDate` | `hopeReceiveDate` | 希望到货日期 |
| `planTransCompleteDate` | `planTransCompleteDate` | `planTransCompleteDate` | 运输计划完成日期 |
| `wopStrateDate` | `wopStrateDate` | `wopStrateDate` | 仓储开始日期 |
| `loadDate` | `loadDate` | `loadDate` | 装载日期 |
| `planArrivalDate` | `planArrivalDate` | `planArrivalDate` | 计划到货日期 |
| `EstiDeliveryCreateDate` | `EstiDeliveryCreateDate` | `EstiDeliveryCreateDate` | 预计发货单创建日期 |
| `dCreatedTime` | `dCreatedTime` | `dCreatedTime` | 创建时间 |

### 布尔字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iPriceMark` | `iPriceMark` | `priceMark` | 价格标识 |
| `isAdvRecInv` | `isAdvRecInv` | `isAdvRecInv` | 预收款开票 |
| `mtoPolicy` | `mtoPolicy` | `mtoPolicy` | MTO策略 |
| `inquiry` | `inquiry` | `inquiry` | 是否参与询价 |
| `isUserAddGiveaway` | `isUserAddGiveaway` | `isUserAddGiveaway` | 是否手工赠品 |
| `isParticipateRebate` | `isParticipateRebate` | `isParticipateRebate` | 是否可参与返利计算 |
| `receivedBilling` | `receivedBilling` | `receivedBilling` | 签收后开票 |
| `taxIssuedDiscountline` | `taxIssuedDiscountline` | `taxIssuedDiscountline` | 税票开具折扣行 |
| `iMerchAddrAutoSynFlag` | `iMerchAddrAutoSynFlag` | `merchAddrAutoSynFlag` | 收货信息自动建档 |
| `isBatchManage` | `isBatchManage` | `isBatchManage` | 是否批次管理 |
| `isreserve` | `isreserve` | `isreserve` | 是否预留 |
| `isSkuReserve` | `isSkuReserve` | `isSkuReserve` | 商品是否预留 |
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 行号 |
| `unitExchangeType` | `unitExchangeType` | `unitExchangeType` | 浮动(计价) |
| `unitExchangeTypePrice` | `unitExchangeTypePrice` | `unitExchangeTypePrice` | 浮动(销售) |
| `iPoints` | `iPoints` | `points` | 积分分摊 |
| `iExpireDateNo` | `iExpireDateNo` | `expireDateNo` | 保质期 |
| `ptoHierarchyType` | `ptoHierarchyType` | `ptoHierarchyType` | 层级结构类型 |
| `ptoPricingMethod` | `ptoPricingMethod` | `ptoPricingMethod` | 定价方式 |
| `throw_status` | `throw_status` | `throwStatus` | 抛单状态 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEndTrade` | `isEndTrade` | 是否末级 |
| `iDeleted` | `iDeleted` | `iDeleted` | 是否删除 |
| `version` | `version` | `version` | 未定义名称 |

### 长整数 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主体ID |
| `ptoRowId` | `ptoRowId` | `ptoRowId` | PTO件行id |
| `collaboration_poid` | `collaboration_poid` | `collaborationPoid` | 协同来源单据主表id |
| `variantconfigctsId` | `variantconfigctsId` | `variantconfigctsId` | 选配结果清单id |
| `collaboration_podetailid` | `collaboration_podetailid` | `collaborationPodetailid` | 协同来源单据子表id |
| `planIdForDeliveryArr` | `planIdForDeliveryArr` | `planIdForDeliveryArr` | 发货计划行id标识 |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |
| `iBizId` | `iBizId` | `bizId` | 商家id |
| `iBizProductId` | `iBizProductId` | `bizProductId` | 商家商品id |
| `iBizSkuId` | `iBizSkuId` | `bizSkuId` | 商家skuid |
| `` | `firstsourceid` | `firstsourceid` | 源头单据主表id |
| `` | `firstsourceautoid` | `firstsourceautoid` | 源头单据子表id |
| `sactid` | `sactid` | `sactId` | 销售合同表头id |
| `sacoid` | `sacoid` | `sacoId` | 销售合同表体行id |
| `iSourceid` | `iSourceid` | `sourceid` | 协同来源单据头id |
| `iSourceautoid` | `iSourceautoid` | `sourceautoid` | 协同来源单据行id |
| `iCoSourceid` | `iCoSourceid` | `coSourceid` | 协同源头单据头id |
| `iCoSourceautoid` | `iCoSourceautoid` | `coSourceautoid` | 协同源头单据行id |
| `` | `subBusinessSourceId` | `subBusinessSourceId` | 子业务源头单据id |
| `` | `subBusinessSourceLineId` | `subBusinessSourceLineId` | 子业务源头单据行id |
| `iGroupId` | `iGroupId` | `groupId` | 分组Id |
| `iGroupIndex` | `iGroupIndex` | `groupIndex` | 分组顺序 |
| `iShoppingCartId` | `iShoppingCartId` | `shoppingCartId` | 购物车id |
| `fMarketPrice` | `fMarketPrice` | `fMarketPrice` | 未定义名称 |

### 数值字段 (109个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `lineno` | `lineno` | `lineno` | 行号 |
| `fMainExchangeRate` | `fMainExchangeRate` | `invPriceExchRate` | 计价换算率 |
| `fAuxExchangeRate` | `fAuxExchangeRate` | `invExchRate` | 销售换算率 |
| `fMasterMeasureQuantity` | `fMasterMeasureQuantity` | `qty` | 数量 |
| `iAuxUnitQuantity` | `iAuxUnitQuantity` | `subQty` | 销售数量 |
| `iQuantity` | `iQuantity` | `priceQty` | 计价数量 |
| `fProdPrice` | `fProdPrice` | `prodPrice` | 基础报价 |
| `fProdCost` | `fProdCost` | `prodCost` | 基础报价金额 |
| `fCusDiscountRate` | `fCusDiscountRate` | `cusDiscountRate` | 报价扣率% |
| `fCusDiscountMoney` | `fCusDiscountMoney` | `cusDiscountMoney` | 报价扣额 |
| `fNoTaxSalePrice` | `fNoTaxSalePrice` | `noTaxSalePrice` | 无税报价 |
| `fOrderPurchaseCoQty` | `fOrderPurchaseCoQty` | `orderPurchaseCoQty` | 协同采购数量 |
| `preGProfit` | `preGProfit` | `preGProfit` | 行预估毛利 |
| `offsetNatAdvRecInvMoney` | `offsetNatAdvRecInvMoney` | `offsetNatAdvRecInvMoney` | 累计冲抵本币预收款开票金额 |
| `advRecInvTaxMoney` | `advRecInvTaxMoney` | `advRecInvTaxMoney` | 累计预收款开票税额 |
| `` | `tradeRouteLineno` | `tradeRouteLineno` | 站点 |
| `ptoQty` | `ptoQty` | `ptoQty` | PTO件底数 |
| `ptoCostScrap` | `ptoCostScrap` | `ptoCostScrap` | 成本比例 |
| `natTaxPayEMoney` | `natTaxPayEMoney` | `natTaxPayEMoney` | 行应付费用本币含税金额 |
| `offsetAdvRecInvMoney` | `offsetAdvRecInvMoney` | `offsetAdvRecInvMoney` | 累计冲抵预收款开票金额 |
| `sacoLineno` | `sacoLineno` | `sacoLineno` | 合同行号 |
| `natPayEMoney` | `natPayEMoney` | `natPayEMoney` | 行应付费用本币无税金额 |
| `natTaxReceiEMoney` | `natTaxReceiEMoney` | `natTaxReceiEMoney` | 行应收费用本币含税金额 |
| `preGProfitRate` | `preGProfitRate` | `preGProfitRate` | 行预估毛利率% |
| `offsetAdvRecInvQty` | `offsetAdvRecInvQty` | `offsetAdvRecInvQty` | 累计冲抵预收款开票数量 |
| `natAdvRecInvTaxMoney` | `natAdvRecInvTaxMoney` | `natAdvRecInvTaxMoney` | 累计本币预收款开票税额 |
| `ptoSonQty` | `ptoSonQty` | `ptoSonQty` | PTO子件主数量 |
| `natReceiEMoney` | `natReceiEMoney` | `natReceiEMoney` | 行应收费用本币无税金额 |
| `offsetAdvRecInvTaxMoney` | `offsetAdvRecInvTaxMoney` | `offsetAdvRecInvTaxMoney` | 累计冲抵预收款开票税额 |
| `advRecInvQty` | `advRecInvQty` | `advRecInvQty` | 累计预收款开票数量 |
| `offsetNatAdvRecInvTaxMoney` | `offsetNatAdvRecInvTaxMoney` | `offsetNatAdvRecInvTaxMoney` | 累计冲抵本币预收款开票税额 |
| `fCusFavorableRate` | `fCusFavorableRate` | `cusFavorableRate` | 报价倒扣 |
| `natAdvRecInvMoney` | `natAdvRecInvMoney` | `natAdvRecInvMoney` | 累计本币预收款开票金额 |
| `fClosedCount` | `fClosedCount` | `closedCount` | 行关闭主数量 |
| `collaboration_porowno` | `collaboration_porowno` | `collaborationPorowno` | 协同来源单据行号 |
| `advRecInvMoney` | `advRecInvMoney` | `advRecInvMoney` | 累计预收款开票金额 |
| `fNoTaxSaleCost` | `fNoTaxSaleCost` | `noTaxSaleCost` | 报价无税金额 |
| `fSalePrice` | `fSalePrice` | `salePrice` | 含税报价 |
| `fSaleCost` | `fSaleCost` | `saleCost` | 报价含税金额 |
| `fTransactionPrice` | `fTransactionPrice` | `oriTaxUnitPrice` | 含税成交价 |
| `fSalePayMoney` | `fSalePayMoney` | `oriSum` | 含税金额 |
| `oriUnitPrice` | `oriUnitPrice` | `oriUnitPrice` | 无税成交价 |
| `oriMoney` | `oriMoney` | `oriMoney` | 无税金额 |
| `fTaxRate` | `fTaxRate` | `taxRate` | 税率 |
| `oriTax` | `oriTax` | `oriTax` | 税额 |
| `fRebateMoney` | `fRebateMoney` | `rebateMoney` | 返利分摊金额 |
| `fcashRebateMoney` | `fcashRebateMoney` | `cashRebateMoney` | 返利直接抵现 |
| `fOrderRebateMoney` | `fOrderRebateMoney` | `orderRebateMoney` | 货补分摊金额 |
| `fPromotionMoney` | `fPromotionMoney` | `promotionMoney` | 优惠金额 |
| `fParticularlyMoney` | `fParticularlyMoney` | `particularlyMoney` | 特殊优惠 |
| `fPointsMoney` | `fPointsMoney` | `pointsMoney` | 积分抵扣金额 |
| `fOrdRealMoney` | `fOrdRealMoney` | `ordRealMoney` | 应收金额 |
| `natTaxUnitPrice` | `natTaxUnitPrice` | `natTaxUnitPrice` | 本币含税单价 |
| `natSum` | `natSum` | `natSum` | 本币含税金额 |
| `natUnitPrice` | `natUnitPrice` | `natUnitPrice` | 本币无税单价 |
| `natMoney` | `natMoney` | `natMoney` | 本币无税金额 |
| `natTax` | `natTax` | `natTax` | 本币税额 |
| `natTaxExpenses` | `natTaxExpenses` | `natTaxExpenses` | 行费用本币含税金额 |
| `natTaxIncludedExpenses` | `natTaxIncludedExpenses` | `natTaxIncludedExpenses` | 行费用本币分摊含税金额 |
| `fLowestPrice` | `fLowestPrice` | `lowestPrice` | 最低售价 |
| `fCostPrice` | `fCostPrice` | `costPrice` | 成本价 |
| `fCostAmt` | `fCostAmt` | `costAmt` | 成本金额 |
| `fMarketPricie` | `fMarketPricie` | `marketPricie` | 物料/sku 价格 |
| `fClosedRowCount` | `fClosedRowCount` | `closedRowCount` | 行关闭数量 |
| `fClosedSumMoney` | `fClosedSumMoney` | `closedSumMoney` | 关闭总金额 |
| `fSendQty` | `fSendQty` | `sendQty` | 累计已发货数量 |
| `fSendPriceQty` | `fSendPriceQty` | `sendPriceQty` | 累计已发货计价数量 |
| `aSalePayMoney` | `aSalePayMoney` | `sendPayMoney` | 累计已发货含税金额 |
| `fAuditCount` | `fAuditCount` | `auditCount` | 累计发货已审数量 |
| `fsendPlanQty` | `fsendPlanQty` | `sendPlanQty` | 累计已发货计划数量 |
| `fOutBoundQty` | `fOutBoundQty` | `totalOutStockQuantity` | 累计出库主数量 |
| `fTotalOutStockSubQty` | `fTotalOutStockSubQty` | `totalOutStockSubQty` | 累计出库件数 |
| `fTotalOutStockPriceQty` | `fTotalOutStockPriceQty` | `totalOutStockPriceQty` | 累计出库计价数量 |
| `fOutBoundSumMoney` | `fOutBoundSumMoney` | `totalOutStockOriTaxMoney` | 累计出库金额 |
| `fTotalOutStockOriMoney` | `fTotalOutStockOriMoney` | `totalOutStockOriMoney` | 累计出库无税金额 |
| `tQuantity` | `tQuantity` | `takeQuantity` | 累计签收数量 |
| `tSalePayMoney` | `tSalePayMoney` | `takeSalePayMoney` | 累计签收金额 |
| `totalVarianceQty` | `totalVarianceQty` | `totalVarianceQty` | 累计签收差异数量 |
| `fReturnQty` | `fReturnQty` | `returnQty` | 退货数量 |
| `fReturnPreSendQty` | `fReturnPreSendQty` | `returnPreSendQty` | 退货补发数量 |
| `fReSendPriceQty` | `fReSendPriceQty` | `reSendPriceQty` | 退货待发计价数量 |
| `invoiceQty` | `invoiceQty` | `invoiceQty` | 累计开票数量 |
| `invoicePriceQty` | `invoicePriceQty` | `invoicePriceQty` | 累计开票计价数量 |
| `invoiceOriSum` | `invoiceOriSum` | `invoiceOriSum` | 累计开票含税金额 |
| `fOrderPurchaseQty` | `fOrderPurchaseQty` | `orderPurchaseQty` | 累计采购数量 |
| `fOrderOutPut` | `fOrderOutPut` | `orderOutPut` | 累计下达生产量 |
| `fTotalSubcontractApplyQty` | `fTotalSubcontractApplyQty` | `totalSubcontractApplyQty` | 累计下达委外申请量 |
| `fTotalSubcontractOrderQty` | `fTotalSubcontractOrderQty` | `totalSubcontractOrderQty` | 累计下达委外订单量 |
| `fProjectSettlementQty` | `fProjectSettlementQty` | `projectSettlementQty` | 项目已结算数量 |
| `` | `coordinationQuantity` | `coordinationQuantity` | 社会化协同量 |
| `overflowRate` | `overflowRate` | `overflowRate` | 溢装率% |
| `shortageRate` | `shortageRate` | `shortageRate` | 短装率% |
| `canSendQty` | `canSendQty` | `canSendQty` | 可发货数量 |
| `uplineno` | `uplineno` | `uplineno` | 来源单据行号 |
| `firstlineno` | `firstlineno` | `firstlineno` | 源头单据行号 |
| `coSourceLineNo` | `coSourceLineNo` | `coSourceLineNo` | 协同源头单据行号 |
| `` | `subBusinessSourceLineNo` | `subBusinessSourceLineNo` | 子业务源头单据行号 |
| `suite_amount` | `suite_amount` | `suite_amount` | 套件数量 |
| `suiteSon_amount` | `suiteSon_amount` | `suiteSon_amount` | 套内子件数量 |
| `cSuiteQuotePrice` | `cSuiteQuotePrice` | `suiteQuotePrice` | 套件报价价格 |
| `suiteSon_priceWeight` | `suiteSon_priceWeight` | `suiteSon_priceWeight` | 金额权重比% |
| `fReceiveCount` | `fReceiveCount` | `receiveCount` | 已收数量 |
| `fSendSubQty` | `fSendSubQty` | `sendSubQty` | 已发货销售数量 |
| `aQuantity` | `aQuantity` | `sendQuantity` | 已审核发货数量 |
| `iConversionRate` | `iConversionRate` | `conversionRate` | 主辅换算率 |
| `invexchrateden` | `invexchrateden` | `invExchRateDen` | 换算率分母 |
| `invexchratenum` | `invexchratenum` | `invExchRateNum` | 换算率分子 |
| `invpriceexchrateden` | `invpriceexchrateden` | `invPriceExchRateDen` | 计价换算率分母 |
| `invpriceexchratenum` | `invpriceexchratenum` | `invPriceExchRateNum` | 计价换算率分子 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `orderDetailDefineCharacter` | `orderDetailDefineCharacter` | `orderDetailDefineCharacter` | 表体自定义项特征组 |

### OptionCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `optionCharacteristics` | `optionCharacteristics` | `optionCharacteristics` | 选配特征组 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `orderDetailCharacteristics` | `orderDetailCharacteristics` | `orderDetailCharacteristics` | 特征组 |

### timestamp (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `lineclose_time` | `lineclose_time` | `linecloseTime` | 关闭时间 |
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
| `dProductDate` | `dProductDate` | `productDate` | 生产日期 |
| `dValidDate` | `dValidDate` | `invalidDate` | 有效期至 |
| `dCreated` | `dCreated` | `createDate` | 创建时间 |
| `dModifyTime` | `dModifyTime` | `dModifyTime` | 修改时间 |
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodyFreeItem` | 销售订单表体自由自定义项 |
| `` | `` | `bodyItem` | 销售订单表体自定义项 |
| `` | `` | `detailDeliveryPlans` | 订单发货计划 |
| `` | `` | `orderDetailPrices` | 订单商品金额 |
| `` | `` | `orderProductApportions` | 订单分摊 |
