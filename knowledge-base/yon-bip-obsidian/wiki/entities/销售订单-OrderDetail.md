---
tags: [BIP, 元数据, 数据字典, 销售订单, SCMSA, voucher.order.OrderDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
parent_entity: voucher.order.Order
---

# 订单详情 (`voucher.order.OrderDetail`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP 供应链（SCMSA）模块销售订单的子实体元数据字典。
> 物理表：`orderdetail` | 所属应用：`SCMSA`
> 父实体：[[销售订单元数据]] (`voucher.order.Order`)

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 订单详情 |
| 描述 | 订单详情 |
| 物理表 | `orderdetail` |
| 所属应用 | `SCMSA` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 数据权限场景 | `bill_maintain` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键ID |
| 编码 | `rowno` | `rowno` | Integer | rowno |

## 部署信息

- **部署时间**: 2026-05-22 23:41:47:000
- **安装来源**: `/app/uorders/ubill/src/ubill-server/scripts/db/patch/mongodb/V5_R0_2507/0001_udinghuo/0010_iuap_common/DML/0270_iuap_metadata/202602/202512260940_metadata_voucher-order_delta.zip`
- **安装人**: mongoTools

## 业务场景

- `workflow`
- `DataAuth`
- `transtype`
- `isCoreBill`
- `userdefine`
- `prewarning`
- `extdevelop`
- `FieldAuth`
- `print`
- `UITemplate`
- `filegroup`
- `report`
- `billcode`
- `ruleengine`
- `msgtemplate`
- `barcode`
- `bpm`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `doc`, `billBatchUserdef`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

---

## 依赖接口（共 31 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | IUOMExchRate (`IUOMExchRate`) | `gscm.itf.IUOMExchRate` | 2 | 5 |
| 2 | IUOMPriceExchRate (`IUOMPriceExchRate`) | `gscm.itf.IUOMPriceExchRate` | 2 | 5 |
| 3 | IBackWrite (`IBackWrite`) | `base.itf.IBackWrite` | 254 | 7 |
| 4 | IUordercorp (`IUordercorp`) | `base.itf.IUordercorp` | 73 | 1 |
| 5 | ISocialCoordination (`ISocialCoordination`) | `base.itf.ISocialCoordination` | 29 | 1 |
| 6 | IUOMInfo (`IUOMInfo`) | `voucher.base.IUOMInfo` | 44 | 3 |
| 7 | IUOMPriceInfo (`IUOMPriceInfo`) | `voucher.base.IUOMPriceInfo` | 44 | 3 |
| 8 | IOriMoneyInfo (`IOriMoneyInfo`) | `voucher.base.IOriMoneyInfo` | 74 | 6 |
| 9 | INatMoneyInfo (`INatMoneyInfo`) | `voucher.base.INatMoneyInfo` | 64 | 5 |
| 10 | IInvoiceReWrite (`IInvoiceReWrite`) | `uorder.voucher.IInvoiceReWrite` | 40 | 2 |
| 11 | Deletable (`Deletable`) | `base.itf.Deletable` | 67 | 1 |
| 12 | IFirstSourceData (`IFirstSourceData`) | `sale.aa.IFirstSourceData` | 1 | 5 |
| 13 | ILineClosing (`ILineClosing`) | `base.itf.ILineClosing` | 92 | 2 |
| 14 | IReservationID (`IReservationID`) | `st.reservation.IReservationID` | 33 | 1 |
| 15 | FreeItem (`FreeItem`) | `base.itf.FreeItem` | 399 | 10 |
| 16 | ISuiteInfo (`ISuiteInfo`) | `sale.aa.ISuiteInfo` | 16 | 6 |
| 17 | ILineNo (`ILineNo`) | `base.itf.ILineNo` | 1 | 1 |
| 18 | IUpLineNo (`IUpLineNo`) | `sale.aa.IUpLineNo` | 2 | 1 |
| 19 | ICustLine (`ICustLine`) | `uorder.voucher.ICustLine` | 43 | 10 |
| 20 | CostCenter (`CostCenter`) | `sale.aa.CostCenter` | 5 | 1 |
| 21 | ProfitCenter (`ProfitCenter`) | `sale.aa.ProfitCenter` | 7 | 2 |
| 22 | CharacterInfo (`CharacterInfo`) | `gscm.itf.CharacterInfo` | 2 | 1 |
| 23 | ISubBusinessSourceData (`ISubBusinessSourceData`) | `sale.aa.ISubBusinessSourceData` | 1 | 5 |
| 24 | ICoSourceData (`ICoSourceData`) | `sale.aa.ICoSourceData` | 3 | 5 |
| 25 | UserdefItemBatch (`UserdefItemBatch`) | `base.itf.UserdefItemBatch` | 1092 | 30 |
| 26 | IProductToOrder (`IProductToOrder`) | `usp.pto.IProductToOrder` | 1 | 7 |
| 27 | IYTenantExt (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |
| 28 | IOutSysObjLineClue (`IOutSysObjLineClue`) | `base.itf.IOutSysObjLineClue` | 3 | 2 |
| 29 | projectStructureProperties (`projectStructureProperties`) | `BGDM.wbs.projectStructureProperties` | 49 | 2 |
| 30 | ITradeRouteID (`ITradeRouteID`) | `sccs.multitrade.ITradeRouteID` | 27 | 4 |
| 31 | ICollaborationSourceData (`ICollaborationSourceData`) | `sale.aa.ICollaborationSourceData` | 39 | 5 |

### IUOMExchRate (`IUOMExchRate`)
> URI: `gscm.itf.IUOMExchRate` | 版本: 2

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `invExchRate` (invExchRate) | `` | `number` | `Real` |
| `invExchRateDen` (invExchRateDen) | `invexchrateden` | `number` | `Real` |
| `invExchRateNum` (invExchRateNum) | `invexchratenum` | `number` | `Real` |
| `qty` (qty) | `` | `number` | `Real` |
| `subQty` (subQty) | `` | `number` | `Real` |

### IUOMPriceExchRate (`IUOMPriceExchRate`)
> URI: `gscm.itf.IUOMPriceExchRate` | 版本: 2

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `invPriceExchRate` (计价汇率) | `` | `number` | `Real` |
| `invPriceExchRateDen` (计价汇率分母) | `invpriceexchrateden` | `number` | `Real` |
| `invPriceExchRateNum` (计价汇率分子) | `invpriceexchratenum` | `number` | `Real` |
| `priceQty` (计价数量) | `` | `number` | `Real` |
| `qty` (qty) | `` | `number` | `Real` |

### IBackWrite (`IBackWrite`)
> URI: `base.itf.IBackWrite` | 版本: 254

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `groupTaskKey` (groupTaskKey) | `groupTaskKey` | `text` | `String` |
| `makeRuleCode` (makeRuleCode) | `makerule_code` | `text` | `String` |
| `source` (订单来源) | `` | `text` | `String` |
| `sourceautoid` (sourceautoid) | `` | `long` | `Long` |
| `sourceid` (sourceid) | `` | `long` | `Long` |
| `sourceMainPubts` (sourceMainPubts) | `sourceMainPubts` | `timestamp` | `Timestamp` |
| `upcode` (upcode) | `` | `text` | `String` |

### IUordercorp (`IUordercorp`)
> URI: `base.itf.IUordercorp` | 版本: 73

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `uordercorp` (公司(分区键)) | `iCorpId` | `long` | `Long` |

### ISocialCoordination (`ISocialCoordination`)
> URI: `base.itf.ISocialCoordination` | 版本: 29

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `coordinationQuantity` (coordinationQuantity) | `` | `number` | `Real` |

### IUOMInfo (`IUOMInfo`)
> URI: `voucher.base.IUOMInfo` | 版本: 44

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `invExchRate` (invExchRate) | `` | `number` | `Real` |
| `qty` (qty) | `` | `number` | `Real` |
| `subQty` (subQty) | `` | `number` | `Real` |

### IUOMPriceInfo (`IUOMPriceInfo`)
> URI: `voucher.base.IUOMPriceInfo` | 版本: 44

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `invPriceExchRate` (计价汇率) | `` | `number` | `Real` |
| `priceQty` (计价数量) | `` | `number` | `Real` |
| `qty` (qty) | `` | `number` | `Real` |

### IOriMoneyInfo (`IOriMoneyInfo`)
> URI: `voucher.base.IOriMoneyInfo` | 版本: 74

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `oriMoney` (oriMoney) | `` | `number` | `Real` |
| `oriSum` (oriSum) | `` | `number` | `Real` |
| `oriTax` (oriTax) | `` | `number` | `Real` |
| `oriTaxUnitPrice` (含税成交价) | `` | `number` | `Real` |
| `oriUnitPrice` (无税成交价) | `` | `number` | `Real` |
| `taxRate` (税率) | `` | `number` | `Real` |

### INatMoneyInfo (`INatMoneyInfo`)
> URI: `voucher.base.INatMoneyInfo` | 版本: 64

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `natMoney` (本币金额) | `` | `number` | `Real` |
| `natSum` (natSum) | `` | `number` | `Real` |
| `natTax` (natTax) | `` | `number` | `Real` |
| `natTaxUnitPrice` (本币含税单价) | `` | `number` | `Real` |
| `natUnitPrice` (本币无税单价) | `` | `number` | `Real` |

### IInvoiceReWrite (`IInvoiceReWrite`)
> URI: `uorder.voucher.IInvoiceReWrite` | 版本: 40

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `invoiceOriSum` (invoiceOriSum) | `invoiceOriSum` | `number` | `Real` |
| `invoiceQty` (invoiceQty) | `invoiceQty` | `number` | `Real` |

### Deletable (`Deletable`)
> URI: `base.itf.Deletable` | 版本: 67

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `isDeleted` (isDeleted) | `iDeleted` | `switch` | `Boolean` |

### IFirstSourceData (`IFirstSourceData`)
> URI: `sale.aa.IFirstSourceData` | 版本: 1

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `firstlineno` (firstlineno) | `firstlineno` | `number` | `Real` |
| `firstsource` (firstsource) | `` | `text` | `String` |
| `firstsourceautoid` (firstsourceautoid) | `` | `long` | `Long` |
| `firstsourceid` (firstsourceid) | `` | `long` | `Long` |
| `firstupcode` (firstupcode) | `` | `text` | `String` |

### ILineClosing (`ILineClosing`)
> URI: `base.itf.ILineClosing` | 版本: 92

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `linecloser` (linecloser) | `linecloser` | `text` | `String` |
| `linecloseTime` (linecloseTime) | `lineclose_time` | `timestamp` | `Timestamp` |

### IReservationID (`IReservationID`)
> URI: `st.reservation.IReservationID` | 版本: 33

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `reserveid` (reserveid) | `` | `quote` | `st.reservation.Reservation` |

### FreeItem (`FreeItem`)
> URI: `base.itf.FreeItem` | 版本: 399

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `free1` (free1) | `` | `text` | `String` |
| `free10` (free10) | `` | `text` | `String` |
| `free2` (free2) | `` | `text` | `String` |
| `free3` (free3) | `` | `text` | `String` |
| `free4` (free4) | `` | `text` | `String` |
| `free5` (free5) | `` | `text` | `String` |
| `free6` (free6) | `` | `text` | `String` |
| `free7` (free7) | `` | `text` | `String` |
| `free8` (free8) | `` | `text` | `String` |
| `free9` (free9) | `` | `text` | `String` |

### ISuiteInfo (`ISuiteInfo`)
> URI: `sale.aa.ISuiteInfo` | 版本: 16

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `suiteGroup` (suiteGroup) | `suiteGroup` | `text` | `String` |
| `suiteId` (suiteId) | `suiteId` | `quote` | `ec.suiteGoodsInfo.EcSuiteGoods` |
| `suiteQuotePrice` (suiteQuotePrice) | `cSuiteQuotePrice` | `number` | `Real` |
| `suiteSon_amount` (suiteSon_amount) | `suiteSon_amount` | `number` | `Real` |
| `suiteSon_priceWeight` (suiteSon_priceWeight) | `suiteSon_priceWeight` | `number` | `Real` |
| `suite_amount` (suite_amount) | `suite_amount` | `number` | `Real` |

### ILineNo (`ILineNo`)
> URI: `base.itf.ILineNo` | 版本: 1

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `lineno` (lineno) | `lineno` | `number` | `Real` |

### IUpLineNo (`IUpLineNo`)
> URI: `sale.aa.IUpLineNo` | 版本: 2

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `uplineno` (uplineno) | `uplineno` | `number` | `Real` |

### ICustLine (`ICustLine`)
> URI: `uorder.voucher.ICustLine` | 版本: 43

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `merchAddrAutoSynFlag` (merchAddrAutoSynFlag) | `iMerchAddrAutoSynFlag` | `switch` | `Boolean` |
| `receiveAddress` (收货地址) | `iReceiveAddress` | `text` | `String` |
| `receiveCode` (收货地址编码) | `iReceiveCode` | `text` | `String` |
| `receiveMobile` (收货电话) | `iReceiveMobile` | `text` | `String` |
| `receiver` (收货人) | `cReceiver` | `text` | `String` |
| `receiverCustId` (收货客户) | `iReceiverCust` | `quote` | `aa.merchant.Merchant` |
| `receiverId` (receiverId) | `iReceiver` | `quote` | `aa.merchant.AddressInfo` |
| `receiveStoreId` (receiveStoreId) | `iReceiveStore` | `quote` | `aa.store.Store` |
| `receiveTelePhone` (收货固定电话) | `iReceiveTelePhone` | `text` | `String` |
| `receiveZipCode` (收货邮编) | `iReceiveZipCode` | `text` | `String` |

### CostCenter (`CostCenter`)
> URI: `sale.aa.CostCenter` | 版本: 5

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `costCenter` (costCenter) | `cost_center` | `quote` | `bd.costcenter.CostCenter` |

### ProfitCenter (`ProfitCenter`)
> URI: `sale.aa.ProfitCenter` | 版本: 7

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `consumerProfitCenter` (consumerProfitCenter) | `consumer_profit_center` | `quote` | `bd.virtualaccbody.VirtualAccbody` |
| `providerProfitCenter` (providerProfitCenter) | `provider_profit_center` | `quote` | `bd.virtualaccbody.VirtualAccbody` |

### CharacterInfo (`CharacterInfo`)
> URI: `gscm.itf.CharacterInfo` | 版本: 2

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `stockSensClue` (stockSensClue) | `stockSensClue` | `text` | `String` |

### ISubBusinessSourceData (`ISubBusinessSourceData`)
> URI: `sale.aa.ISubBusinessSourceData` | 版本: 1

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `subBusinessSourceId` (subBusinessSourceId) | `` | `long` | `Long` |
| `subBusinessSourceLineId` (subBusinessSourceLineId) | `` | `long` | `Long` |
| `subBusinessSourceLineNo` (subBusinessSourceLineNo) | `` | `number` | `Real` |
| `subBusinessSourceNo` (subBusinessSourceNo) | `` | `text` | `String` |
| `subBusinessSourceType` (subBusinessSourceType) | `` | `text` | `String` |

### ICoSourceData (`ICoSourceData`)
> URI: `sale.aa.ICoSourceData` | 版本: 3

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `coSourceautoid` (coSourceautoid) | `iCoSourceautoid` | `long` | `Long` |
| `coSourceid` (coSourceid) | `iCoSourceid` | `long` | `Long` |
| `coSourceLineNo` (coSourceLineNo) | `coSourceLineNo` | `number` | `Real` |
| `coSourceType` (coSourceType) | `cCoSourceType` | `text` | `String` |
| `coUpcode` (coUpcode) | `cCoUpcode` | `text` | `String` |

### UserdefItemBatch (`UserdefItemBatch`)
> URI: `base.itf.UserdefItemBatch` | 版本: 1092

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `define1` (define1) | `` | `text` | `String` |
| `define10` (define10) | `` | `text` | `String` |
| `define11` (define11) | `` | `text` | `String` |
| `define12` (define12) | `` | `text` | `String` |
| `define13` (define13) | `` | `text` | `String` |
| `define14` (define14) | `` | `text` | `String` |
| `define15` (define15) | `` | `text` | `String` |
| `define16` (define16) | `` | `text` | `String` |
| `define17` (define17) | `` | `text` | `String` |
| `define18` (define18) | `` | `text` | `String` |
| `define19` (define19) | `` | `text` | `String` |
| `define2` (define2) | `` | `text` | `String` |
| `define20` (define20) | `` | `text` | `String` |
| `define21` (define21) | `` | `text` | `String` |
| `define22` (define22) | `` | `text` | `String` |
| `define23` (define23) | `` | `text` | `String` |
| `define24` (define24) | `` | `text` | `String` |
| `define25` (define25) | `` | `text` | `String` |
| `define26` (define26) | `` | `text` | `String` |
| `define27` (define27) | `` | `text` | `String` |
| `define28` (define28) | `` | `text` | `String` |
| `define29` (define29) | `` | `text` | `String` |
| `define3` (define3) | `` | `text` | `String` |
| `define30` (define30) | `` | `text` | `String` |
| `define4` (define4) | `` | `text` | `String` |
| `define5` (define5) | `` | `text` | `String` |
| `define6` (define6) | `` | `text` | `String` |
| `define7` (define7) | `` | `text` | `String` |
| `define8` (define8) | `` | `text` | `String` |
| `define9` (define9) | `` | `text` | `String` |

### IProductToOrder (`IProductToOrder`)
> URI: `usp.pto.IProductToOrder` | 版本: 1

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `ptoCostScrap` (ptoCostScrap) | `ptoCostScrap` | `number` | `Real` |
| `ptoHierarchyType` (ptoHierarchyType) | `ptoHierarchyType` | `int` | `Integer` |
| `ptoId` (ptoId) | `ptoId` | `quote` | `pc.product.Product` |
| `ptoPricingMethod` (ptoPricingMethod) | `ptoPricingMethod` | `int` | `Integer` |
| `ptoQty` (ptoQty) | `ptoQty` | `number` | `Real` |
| `ptoRowId` (ptoRowId) | `ptoRowId` | `long` | `Long` |
| `ptoSonQty` (ptoSonQty) | `ptoSonQty` | `number` | `Real` |

### IYTenantExt (`IYTenantExt`)
> URI: `ucfbase.ucfbaseItf.IYTenantExt` | 版本: 24

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `ytenant` (租户) | `ytenant_id` | `quote` | `yht.tenant.YhtTenant` |

### IOutSysObjLineClue (`IOutSysObjLineClue`)
> URI: `base.itf.IOutSysObjLineClue` | 版本: 3

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `out_sys_lineid` (out_sys_lineid) | `out_sys_lineid` | `text` | `String` |
| `out_sys_rowno` (out_sys_rowno) | `out_sys_rowno` | `text` | `String` |

### projectStructureProperties (`projectStructureProperties`)
> URI: `BGDM.wbs.projectStructureProperties` | 版本: 49

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `activity` (activity) | `activity` | `quote` | `pgrm.projecttask.ProjectScheduleTask` |
| `wbs` (WBS) | `wbs` | `quote` | `BGDM.wbs.wbs_doc` |

### ITradeRouteID (`ITradeRouteID`)
> URI: `sccs.multitrade.ITradeRouteID` | 版本: 27

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `isEndTrade` (是否末级) | `` | `short` | `Short` |
| `throwStatus` (抛单状态) | `throw_status` | `int` | `Integer` |
| `tradeRouteID` (贸易路线ID) | `` | `quote` | `sccs.multitrade.TradeRoute` |
| `tradeRouteLineno` (站号) | `` | `number` | `Real` |

### ICollaborationSourceData (`ICollaborationSourceData`)
> URI: `sale.aa.ICollaborationSourceData` | 版本: 39

| 属性名 | 数据库列 | 业务类型 | 类型URI |
|--------|---------|---------|---------|
| `collaborationPocode` (collaborationPocode) | `collaboration_pocode` | `text` | `String` |
| `collaborationPodetailid` (collaborationPodetailid) | `collaboration_podetailid` | `long` | `Long` |
| `collaborationPoid` (collaborationPoid) | `collaboration_poid` | `long` | `Long` |
| `collaborationPorowno` (collaborationPorowno) | `collaboration_porowno` | `number` | `Real` |
| `collaborationSource` (collaborationSource) | `collaboration_source` | `text` | `String` |

---

## 全部直接属性（共 324 个）

> 含直接映射数据库列的字段。类型为 UUID 的为外键引用（详见关联属性节）。

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 | URI |
|---|--------|--------|---------|------|---------|------|------|-----|
| 1 | `id` | 主键ID | `id` | Long | `long` |  | true | `base.entity.BizObject.id` |
| 2 | `orderId` | 订单ID | `iorderId` | c7c0beb4-f830-486d-83e1-51072b319fd2 | `quote` |  | true | `voucher.order.OrderDetail.orderId` |
| 3 | `idKey` | idKey | `idKey` | String | `text` |  | true | `voucher.order.OrderDetail.idKey` |
| 4 | `lineno` | lineno | `lineno` | Decimal | `number` |  | true | `base.itf.ILineNo.lineno` |
| 5 | `rowno` | rowno | `rowno` | Integer | `int` |  | true | `voucher.base.IRowNum.rowno` |
| 6 | `productId` | 产品ID | `iProductId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | true | `voucher.order.OrderDetail.productId` |
| 7 | `productCode` | 产品编码 | `cProductCode` | String | `text` | false | true | `voucher.order.OrderDetail.productCode` |
| 8 | `productName` | 产品名称 | `cProductName` | String | `text` | false | true | `voucher.order.OrderDetail.productName` |
| 9 | `skuId` | skuId | `iSKUId` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |  | true | `voucher.order.OrderDetail.skuId` |
| 10 | `skuCode` | skuCode | `cSkuCode` | String | `text` | false | true | `voucher.order.OrderDetail.skuCode` |
| 11 | `agentProductId` | agentProductId | `agentProductId` | 27a41e77-558c-4f2b-9fdb-f108db09b3b5 | `quote` |  | true | `voucher.order.OrderDetail.agentProductId` |
| 12 | `orderProductType` | orderProductType | `cOrderProductType` | String | `text` |  | true | `voucher.order.OrderDetail.orderProductType` |
| 13 | `qtyName` | qtyName | `cMasterUnitMeasure` | String | `text` | false | true | `voucher.order.OrderDetail.qtyName` |
| 14 | `masterUnitId` | 主计量单位ID | `iMasterUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | true | `voucher.order.OrderDetail.masterUnitId` |
| 15 | `productUnitName` | 计价单位 | `cProductUnitName` | String | `text` | false | true | `voucher.order.OrderDetail.productUnitName` |
| 16 | `iProductUnitId` | 计价单位ID | `iProductUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | true | `voucher.order.OrderDetail.iProductUnitId` |
| 17 | `productAuxUnitName` | 辅计量单位 | `cProductAuxUnitName` | String | `text` | false | true | `voucher.order.OrderDetail.productAuxUnitName` |
| 18 | `iProductAuxUnitId` | 辅计量单位ID | `iProductAuxUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | true | `voucher.order.OrderDetail.iProductAuxUnitId` |
| 19 | `invPriceExchRate` | 计价汇率 | `fMainExchangeRate` | Decimal | `number` |  | true | `voucher.order.OrderDetail.invPriceExchRate` |
| 20 | `invExchRate` | invExchRate | `fAuxExchangeRate` | Decimal | `number` |  | true | `voucher.order.OrderDetail.invExchRate` |
| 21 | `qty` | qty | `fMasterMeasureQuantity` | Decimal | `number` |  | true | `voucher.order.OrderDetail.qty` |
| 22 | `subQty` | subQty | `iAuxUnitQuantity` | Decimal | `number` |  | true | `voucher.order.OrderDetail.subQty` |
| 23 | `priceQty` | 计价数量 | `iQuantity` | Decimal | `number` |  | true | `voucher.order.OrderDetail.priceQty` |
| 24 | `unitExchangeType` | 换算率(计价) | `unitExchangeType` | Integer | `int` |  | true | `voucher.order.OrderDetail.unitExchangeType` |
| 25 | `unitExchangeTypePrice` | 换算率(价格) | `unitExchangeTypePrice` | Integer | `int` |  | true | `voucher.order.OrderDetail.unitExchangeTypePrice` |
| 26 | `priceMark` | 价格标识 | `iPriceMark` | Boolean | `switch` |  | true | `voucher.order.OrderDetail.priceMark` |
| 27 | `prodPrice` | 商品单价 | `fProdPrice` | Decimal | `number` |  | true | `voucher.order.OrderDetail.prodPrice` |
| 28 | `prodCost` | prodCost | `fProdCost` | Decimal | `number` |  | true | `voucher.order.OrderDetail.prodCost` |
| 29 | `cusDiscountRate` | cusDiscountRate | `fCusDiscountRate` | Decimal | `number` |  | true | `voucher.order.OrderDetail.cusDiscountRate` |
| 30 | `cusDiscountMoney` | cusDiscountMoney | `fCusDiscountMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.cusDiscountMoney` |
| 31 | `noTaxSalePrice` | 无税单价 | `fNoTaxSalePrice` | Decimal | `number` |  | true | `voucher.order.OrderDetail.noTaxSalePrice` |
| 32 | `orderPurchaseCoQty` | orderPurchaseCoQty | `fOrderPurchaseCoQty` | Decimal | `number` |  | true | `voucher.order.OrderDetail.orderPurchaseCoQty` |
| 33 | `receiveCode` | 收货地址编码 | `iReceiveCode` | String | `text` |  | true | `uorder.voucher.ICustLine.receiveCode` |
| 34 | `isAdvRecInv` | isAdvRecInv | `isAdvRecInv` | Boolean | `switch` |  | true | `voucher.order.OrderDetail.isAdvRecInv` |
| 35 | `preGProfit` | preGProfit | `preGProfit` | Decimal | `number` |  | true | `voucher.order.OrderDetail.preGProfit` |
| 36 | `activity` | activity | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |  | true | `BGDM.wbs.projectStructureProperties.activity` |
| 37 | `offsetNatAdvRecInvMoney` | offsetNatAdvRecInvMoney | `offsetNatAdvRecInvMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.offsetNatAdvRecInvMoney` |
| 38 | `advRecInvTaxMoney` | advRecInvTaxMoney | `advRecInvTaxMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.advRecInvTaxMoney` |
| 39 | `tradeRouteLineno` | 站号 | `tradeRouteLineno` | Decimal | `number` |  | true | `sccs.multitrade.ITradeRouteID.tradeRouteLineno` |
| 40 | `productLineId` | productLineId | `iProductLineId` | fcdf5213-a995-4874-928f-ff97bcfa4b91 | `quote` | false | true | `voucher.order.OrderDetail.productLineId` |
| 41 | `isEndTrade` | 是否末级 | `isEndTrade` | Short | `short` |  | true | `sccs.multitrade.ITradeRouteID.isEndTrade` |
| 42 | `ptoQty` | ptoQty | `ptoQty` | Decimal | `number` |  | true | `usp.pto.IProductToOrder.ptoQty` |
| 43 | `ptoCostScrap` | ptoCostScrap | `ptoCostScrap` | Decimal | `number` |  | true | `usp.pto.IProductToOrder.ptoCostScrap` |
| 44 | `ptoRowId` | ptoRowId | `ptoRowId` | Long | `long` |  | true | `usp.pto.IProductToOrder.ptoRowId` |
| 45 | `collaborationPoid` | collaborationPoid | `collaboration_poid` | Long | `long` |  | true | `sale.aa.ICollaborationSourceData.collaborationPoid` |
| 46 | `natTaxPayEMoney` | natTaxPayEMoney | `natTaxPayEMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.natTaxPayEMoney` |
| 47 | `offsetAdvRecInvMoney` | offsetAdvRecInvMoney | `offsetAdvRecInvMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.offsetAdvRecInvMoney` |
| 48 | `out_sys_lineid` | out_sys_lineid | `out_sys_lineid` | String | `text` |  | true | `base.itf.IOutSysObjLineClue.out_sys_lineid` |
| 49 | `lineCloseReason` | lineCloseReason | `lineCloseReason` | String | `text` |  | true | `voucher.order.OrderDetail.lineCloseReason` |
| 50 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true | `ucfbase.ucfbaseItf.IYTenantExt.ytenant` |
| 51 | `sacoLineno` | sacoLineno | `sacoLineno` | Decimal | `number` |  | true | `voucher.order.OrderDetail.sacoLineno` |
| 52 | `natPayEMoney` | natPayEMoney | `natPayEMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.natPayEMoney` |
| 53 | `natTaxReceiEMoney` | natTaxReceiEMoney | `natTaxReceiEMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.natTaxReceiEMoney` |
| 54 | `ptoId` | ptoId | `ptoId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | true | `usp.pto.IProductToOrder.ptoId` |
| 55 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |  | true | `BGDM.wbs.projectStructureProperties.wbs` |
| 56 | `preGProfitRate` | preGProfitRate | `preGProfitRate` | Decimal | `number` |  | true | `voucher.order.OrderDetail.preGProfitRate` |
| 57 | `collaborationSource` | collaborationSource | `collaboration_source` | String | `text` |  | true | `sale.aa.ICollaborationSourceData.collaborationSource` |
| 58 | `offsetAdvRecInvQty` | offsetAdvRecInvQty | `offsetAdvRecInvQty` | Decimal | `number` |  | true | `voucher.order.OrderDetail.offsetAdvRecInvQty` |
| 59 | `natAdvRecInvTaxMoney` | natAdvRecInvTaxMoney | `natAdvRecInvTaxMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.natAdvRecInvTaxMoney` |
| 60 | `mtoPolicy` | mtoPolicy | `mtoPolicy` | Boolean | `switch` |  | true | `voucher.order.OrderDetail.mtoPolicy` |
| 61 | `ptoSonQty` | ptoSonQty | `ptoSonQty` | Decimal | `number` |  | true | `usp.pto.IProductToOrder.ptoSonQty` |
| 62 | `productLineName` | productLineName | `cProductLineName` | String | `text` | false | true | `voucher.order.OrderDetail.productLineName` |
| 63 | `inquiry` | inquiry | `inquiry` | Boolean | `switch` |  | true | `voucher.order.OrderDetail.inquiry` |
| 64 | `natReceiEMoney` | natReceiEMoney | `natReceiEMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.natReceiEMoney` |
| 65 | `offsetAdvRecInvTaxMoney` | offsetAdvRecInvTaxMoney | `offsetAdvRecInvTaxMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.offsetAdvRecInvTaxMoney` |
| 66 | `advRecInvQty` | advRecInvQty | `advRecInvQty` | Decimal | `number` |  | true | `voucher.order.OrderDetail.advRecInvQty` |
| 67 | `offsetNatAdvRecInvTaxMoney` | offsetNatAdvRecInvTaxMoney | `offsetNatAdvRecInvTaxMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.offsetNatAdvRecInvTaxMoney` |
| 68 | `out_sys_rowno` | out_sys_rowno | `out_sys_rowno` | String | `text` |  | true | `base.itf.IOutSysObjLineClue.out_sys_rowno` |
| 69 | `cusFavorableRate` | cusFavorableRate | `fCusFavorableRate` | Decimal | `number` |  | true | `voucher.order.OrderDetail.cusFavorableRate` |
| 70 | `natAdvRecInvMoney` | natAdvRecInvMoney | `natAdvRecInvMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.natAdvRecInvMoney` |
| 71 | `points` | 积分 | `iPoints` | Integer | `int` |  | true | `voucher.order.OrderDetail.points` |
| 72 | `variantconfigctsId` | variantconfigctsId | `variantconfigctsId` | Long | `long` |  | true | `voucher.order.OrderDetail.variantconfigctsId` |
| 73 | `closedCount` | closedCount | `fClosedCount` | Decimal | `number` |  | true | `voucher.order.OrderDetail.closedCount` |
| 74 | `tradeRouteID` | 贸易路线ID | `tradeRouteID` | c69f1d6a-783c-4f79-b446-b4da14cb7fff | `quote` |  | true | `sccs.multitrade.ITradeRouteID.tradeRouteID` |
| 75 | `collaborationPorowno` | collaborationPorowno | `collaboration_porowno` | Decimal | `number` |  | true | `sale.aa.ICollaborationSourceData.collaborationPorowno` |
| 76 | `collaborationPocode` | collaborationPocode | `collaboration_pocode` | String | `text` |  | true | `sale.aa.ICollaborationSourceData.collaborationPocode` |
| 77 | `collaborationPodetailid` | collaborationPodetailid | `collaboration_podetailid` | Long | `long` |  | true | `sale.aa.ICollaborationSourceData.collaborationPodetailid` |
| 78 | `advRecInvMoney` | advRecInvMoney | `advRecInvMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.advRecInvMoney` |
| 79 | `noTaxSaleCost` | noTaxSaleCost | `fNoTaxSaleCost` | Decimal | `number` |  | true | `voucher.order.OrderDetail.noTaxSaleCost` |
| 80 | `salePrice` | 含税单价 | `fSalePrice` | Decimal | `number` |  | true | `voucher.order.OrderDetail.salePrice` |
| 81 | `saleCost` | saleCost | `fSaleCost` | Decimal | `number` |  | true | `voucher.order.OrderDetail.saleCost` |
| 82 | `oriTaxUnitPrice` | 含税成交价 | `fTransactionPrice` | Decimal | `number` |  | true | `voucher.order.OrderDetail.oriTaxUnitPrice` |
| 83 | `oriSum` | oriSum | `fSalePayMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.oriSum` |
| 84 | `oriUnitPrice` | 无税成交价 | `oriUnitPrice` | Decimal | `number` |  | true | `voucher.order.OrderDetail.oriUnitPrice` |
| 85 | `oriMoney` | oriMoney | `oriMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.oriMoney` |
| 86 | `taxRate` | 税率 | `fTaxRate` | Decimal | `number` |  | true | `voucher.order.OrderDetail.taxRate` |
| 87 | `oriTax` | oriTax | `oriTax` | Decimal | `number` |  | true | `voucher.order.OrderDetail.oriTax` |
| 88 | `taxId` | taxId | `cTaxId` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |  | true | `voucher.order.OrderDetail.taxId` |
| 89 | `taxCode` | taxCode | `cTaxCode` | String | `text` |  | true | `voucher.order.OrderDetail.taxCode` |
| 90 | `taxItems` | taxItems | `cTaxItems` | String | `text` |  | true | `voucher.order.OrderDetail.taxItems` |
| 91 | `rebateMoney` | 返利金额 | `fRebateMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.rebateMoney` |
| 92 | `cashRebateMoney` | cashRebateMoney | `fcashRebateMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.cashRebateMoney` |
| 93 | `orderRebateMoney` | orderRebateMoney | `fOrderRebateMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.orderRebateMoney` |
| 94 | `promotionMoney` | 促销金额 | `fPromotionMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.promotionMoney` |
| 95 | `particularlyMoney` | 特别优惠金额 | `fParticularlyMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.particularlyMoney` |
| 96 | `pointsMoney` | 积分抵扣金额 | `fPointsMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.pointsMoney` |
| 97 | `ordRealMoney` | ordRealMoney | `fOrdRealMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.ordRealMoney` |
| 98 | `natCurrency` | natCurrency | `cDomesticPk` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | true | `voucher.order.OrderDetail.natCurrency` |
| 99 | `natTaxUnitPrice` | 本币含税单价 | `natTaxUnitPrice` | Decimal | `number` |  | true | `voucher.order.OrderDetail.natTaxUnitPrice` |
| 100 | `natSum` | natSum | `natSum` | Decimal | `number` |  | true | `voucher.order.OrderDetail.natSum` |
| 101 | `natUnitPrice` | 本币无税单价 | `natUnitPrice` | Decimal | `number` |  | true | `voucher.order.OrderDetail.natUnitPrice` |
| 102 | `natMoney` | 本币金额 | `natMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.natMoney` |
| 103 | `natTax` | natTax | `natTax` | Decimal | `number` |  | true | `voucher.order.OrderDetail.natTax` |
| 104 | `natTaxExpenses` | natTaxExpenses | `natTaxExpenses` | Decimal | `number` |  | true | `voucher.order.OrderDetail.natTaxExpenses` |
| 105 | `natTaxIncludedExpenses` | natTaxIncludedExpenses | `natTaxIncludedExpenses` | Decimal | `number` |  | true | `voucher.order.OrderDetail.natTaxIncludedExpenses` |
| 106 | `lowestPrice` | 最低限价 | `fLowestPrice` | Decimal | `number` |  | true | `voucher.order.OrderDetail.lowestPrice` |
| 107 | `costCurrency` | costCurrency | `cCostCurrencyPK` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | true | `voucher.order.OrderDetail.costCurrency` |
| 108 | `costCurrencyName` | costCurrencyName | `cCostCurrencyName` | String | `text` |  | true | `voucher.order.OrderDetail.costCurrencyName` |
| 109 | `costCurrencyCode` | costCurrencyCode | `cCostCurrencyCode` | String | `text` |  | true | `voucher.order.OrderDetail.costCurrencyCode` |
| 110 | `costPrice` | 成本价 | `fCostPrice` | Decimal | `number` |  | true | `voucher.order.OrderDetail.costPrice` |
| 111 | `costAmt` | costAmt | `fCostAmt` | Decimal | `number` |  | true | `voucher.order.OrderDetail.costAmt` |
| 112 | `costId` | costId | `cCostId` | String | `text` |  | true | `voucher.order.OrderDetail.costId` |
| 113 | `providerProfitCenter` | providerProfitCenter | `provider_profit_center` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |  | true | `sale.aa.ProfitCenter.providerProfitCenter` |
| 114 | `consumerProfitCenter` | consumerProfitCenter | `consumer_profit_center` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` |  | true | `sale.aa.ProfitCenter.consumerProfitCenter` |
| 115 | `costCenter` | costCenter | `cost_center` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |  | true | `sale.aa.CostCenter.costCenter` |
| 116 | `productId_priceListFlag` | 价表取价标识 | `productId_priceListFlag` | String | `text` |  | true | `voucher.order.OrderDetail.productId_priceListFlag` |
| 117 | `isUserAddGiveaway` | isUserAddGiveaway | `isUserAddGiveaway` | Boolean | `switch` |  | true | `voucher.order.OrderDetail.isUserAddGiveaway` |
| 118 | `isParticipateRebate` | isParticipateRebate | `isParticipateRebate` | Boolean | `switch` |  | true | `voucher.order.OrderDetail.isParticipateRebate` |
| 119 | `receivedBilling` | receivedBilling | `receivedBilling` | Boolean | `switch` |  | true | `voucher.order.OrderDetail.receivedBilling` |
| 120 | `taxIssuedDiscountline` | taxIssuedDiscountline | `taxIssuedDiscountline` | Boolean | `switch` |  | true | `voucher.order.OrderDetail.taxIssuedDiscountline` |
| 121 | `planIdForDeliveryArr` | planIdForDeliveryArr | `planIdForDeliveryArr` | Long | `long` |  | true | `voucher.order.OrderDetail.planIdForDeliveryArr` |
| 122 | `rebateReturnProductId` | rebateReturnProductId | `iRebateReturnProductId` | 631cf218-f93d-48a9-8d02-7c2d4c520538 | `quote` | false | true | `voucher.order.OrderDetail.rebateReturnProductId` |
| 123 | `stockOrgId` | stockOrgId | `iStockOrgId` | e18e914b-4518-4e8c-ac21-783145fe7da1 | `quote` |  | true | `voucher.order.OrderDetail.stockOrgId` |
| 124 | `settlementOrgId` | 开票组织 | `iSettlementOrgId` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | `quote` |  | true | `voucher.order.OrderDetail.settlementOrgId` |
| 125 | `stockName` | stockName | `cStockName` | String | `text` |  | true | `voucher.order.OrderDetail.stockName` |
| 126 | `stockId` | stockId | `iStockId` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |  | true | `voucher.order.OrderDetail.stockId` |
| 127 | `consignTime` | consignTime | `dConsignTime` | Date | `date` |  | true | `voucher.order.OrderDetail.consignTime` |
| 128 | `hopeReceiveDate` | 希望收货日期 | `dHopeReceiveDate` | Date | `date` |  | true | `voucher.order.OrderDetail.hopeReceiveDate` |
| 129 | `projectId` | projectId | `cProjectId` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |  | true | `voucher.order.OrderDetail.projectId` |
| 130 | `receiverCustId` | 收货客户 | `iReceiverCust` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | true | `uorder.voucher.ICustLine.receiverCustId` |
| 131 | `receiveStoreId` | receiveStoreId | `iReceiveStore` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | `quote` |  | true | `uorder.voucher.ICustLine.receiveStoreId` |
| 132 | `receiverId` | receiverId | `iReceiver` | 9fcf5601-f03e-4437-8377-1b82efea453a | `quote` |  | true | `uorder.voucher.ICustLine.receiverId` |
| 133 | `receiver` | 收货人 | `cReceiver` | String | `text` |  | true | `uorder.voucher.ICustLine.receiver` |
| 134 | `receiveMobile` | 收货电话 | `iReceiveMobile` | String | `text` |  | true | `uorder.voucher.ICustLine.receiveMobile` |
| 135 | `receiveTelePhone` | 收货固定电话 | `iReceiveTelePhone` | String | `text` |  | true | `uorder.voucher.ICustLine.receiveTelePhone` |
| 136 | `receiveAddress` | 收货地址 | `iReceiveAddress` | String | `text` |  | true | `uorder.voucher.ICustLine.receiveAddress` |
| 137 | `receiveZipCode` | 收货邮编 | `iReceiveZipCode` | String | `text` |  | true | `uorder.voucher.ICustLine.receiveZipCode` |
| 138 | `merchAddrAutoSynFlag` | merchAddrAutoSynFlag | `iMerchAddrAutoSynFlag` | Boolean | `switch` |  | true | `uorder.voucher.ICustLine.merchAddrAutoSynFlag` |
| 139 | `marketPricie` | marketPricie | `fMarketPricie` | Decimal | `number` |  | true | `voucher.order.OrderDetail.marketPricie` |
| 140 | `orderDetailDefineCharacter` | orderDetailDefineCharacter | `orderDetailDefineCharacter` | 9c5ec380-1f21-49f9-933d-43ea00ad6ad9 | `UserDefine` |  | true | `voucher.order.OrderDetail.orderDetailDefineCharacter` |
| 141 | `erpCode` | erpCode | `cErpCode` | String | `text` |  | true | `voucher.order.OrderDetail.erpCode` |
| 142 | `variantConfiguration` | variantConfiguration | `variantConfiguration` | f4984814-116e-4188-ab12-1b922a40f2cc | `quote` |  | true | `voucher.order.OrderDetail.variantConfiguration` |
| 143 | `stockSensClue` | stockSensClue | `stockSensClue` | String | `text` |  | true | `gscm.itf.CharacterInfo.stockSensClue` |
| 144 | `optionCharacteristics` | optionCharacteristics | `optionCharacteristics` | 20f21b13-8f8c-45af-b96d-2cd7e32a2aff | `OptionCT` |  | true | `voucher.order.OrderDetail.optionCharacteristics` |
| 145 | `orderDetailCharacteristics` | orderDetailCharacteristics | `orderDetailCharacteristics` | 45c9c9b8-b728-4989-9e37-c572fe740966 | `FreeCT` |  | true | `voucher.order.OrderDetail.orderDetailCharacteristics` |
| 146 | `specDescription` | specDescription | `cSpecDescription` | String | `text` |  | true | `voucher.order.OrderDetail.specDescription` |
| 147 | `free1` | free1 | `free1` | String | `text` |  | true | `base.itf.FreeItem.free1` |
| 148 | `free2` | free2 | `free2` | String | `text` |  | true | `base.itf.FreeItem.free2` |
| 149 | `free3` | free3 | `free3` | String | `text` |  | true | `base.itf.FreeItem.free3` |
| 150 | `free4` | free4 | `free4` | String | `text` |  | true | `base.itf.FreeItem.free4` |
| 151 | `free5` | free5 | `free5` | String | `text` |  | true | `base.itf.FreeItem.free5` |
| 152 | `free6` | free6 | `free6` | String | `text` |  | true | `base.itf.FreeItem.free6` |
| 153 | `free7` | free7 | `free7` | String | `text` |  | true | `base.itf.FreeItem.free7` |
| 154 | `free8` | free8 | `free8` | String | `text` |  | true | `base.itf.FreeItem.free8` |
| 155 | `free9` | free9 | `free9` | String | `text` |  | true | `base.itf.FreeItem.free9` |
| 156 | `free10` | free10 | `free10` | String | `text` |  | true | `base.itf.FreeItem.free10` |
| 157 | `iOrgId` | iOrgId | `iOrgId` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` | false | true | `voucher.order.OrderDetail.iOrgId` |
| 158 | `uordercorp` | 公司(分区键) | `iCorpId` | Long | `long` |  | true | `base.itf.IUordercorp.uordercorp` |
| 159 | `transactionTypeId` | 交易类型 | `iTransactionTypeId` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | true | `voucher.order.OrderDetail.transactionTypeId` |
| 160 | `bizId` | 商家ID | `iBizId` | Long | `long` |  | true | `voucher.order.OrderDetail.bizId` |
| 161 | `salesOrgId` | 销售组织 | `iSalesOrgId` | 4991976e-11ee-406e-bdbb-0f73f9f89ff2 | `quote` |  | true | `voucher.order.OrderDetail.salesOrgId` |
| 162 | `saleDepartmentId` | 销售部门 | `iSaleDepartmentId` | ca871996-b447-42f9-8dac-dd7c21ee0662 | `quote` |  | true | `voucher.order.OrderDetail.saleDepartmentId` |
| 163 | `bizProductId` | bizProductId | `iBizProductId` | Long | `long` |  | true | `voucher.order.OrderDetail.bizProductId` |
| 164 | `bizSkuId` | bizSkuId | `iBizSkuId` | Long | `long` |  | true | `voucher.order.OrderDetail.bizSkuId` |
| 165 | `linecloser` | linecloser | `linecloser` | String | `text` |  | true | `base.itf.ILineClosing.linecloser` |
| 166 | `linecloseTime` | linecloseTime | `lineclose_time` | DateTime | `timestamp` |  | true | `base.itf.ILineClosing.linecloseTime` |
| 167 | `closedRowCount` | closedRowCount | `fClosedRowCount` | Decimal | `number` |  | true | `voucher.order.OrderDetail.closedRowCount` |
| 168 | `closedSumMoney` | closedSumMoney | `fClosedSumMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.closedSumMoney` |
| 169 | `memo` | 备注 | `cMemo` | String | `text` | false | true | `voucher.order.OrderDetail.memo` |
| 170 | `sendQty` | sendQty | `fSendQty` | Decimal | `number` |  | true | `voucher.order.OrderDetail.sendQty` |
| 171 | `sendPriceQty` | 累计已发计价数量 | `fSendPriceQty` | Decimal | `number` |  | true | `voucher.order.OrderDetail.sendPriceQty` |
| 172 | `sendPayMoney` | sendPayMoney | `aSalePayMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.sendPayMoney` |
| 173 | `auditCount` | auditCount | `fAuditCount` | Decimal | `number` |  | true | `voucher.order.OrderDetail.auditCount` |
| 174 | `sendPlanQty` | sendPlanQty | `fsendPlanQty` | Decimal | `number` |  | true | `voucher.order.OrderDetail.sendPlanQty` |
| 175 | `totalOutStockQuantity` | 累计出货数量 | `fOutBoundQty` | Decimal | `number` |  | true | `voucher.order.OrderDetail.totalOutStockQuantity` |
| 176 | `totalOutStockSubQty` | totalOutStockSubQty | `fTotalOutStockSubQty` | Decimal | `number` |  | true | `voucher.order.OrderDetail.totalOutStockSubQty` |
| 177 | `totalOutStockPriceQty` | 累计出货计价数量 | `fTotalOutStockPriceQty` | Decimal | `number` |  | true | `voucher.order.OrderDetail.totalOutStockPriceQty` |
| 178 | `totalOutStockOriTaxMoney` | totalOutStockOriTaxMoney | `fOutBoundSumMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.totalOutStockOriTaxMoney` |
| 179 | `totalOutStockOriMoney` | totalOutStockOriMoney | `fTotalOutStockOriMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.totalOutStockOriMoney` |
| 180 | `takeQuantity` | takeQuantity | `tQuantity` | Decimal | `number` |  | true | `voucher.order.OrderDetail.takeQuantity` |
| 181 | `takeSalePayMoney` | takeSalePayMoney | `tSalePayMoney` | Decimal | `number` |  | true | `voucher.order.OrderDetail.takeSalePayMoney` |
| 182 | `totalVarianceQty` | totalVarianceQty | `totalVarianceQty` | Decimal | `number` |  | true | `voucher.order.OrderDetail.totalVarianceQty` |
| 183 | `returnQty` | returnQty | `fReturnQty` | Decimal | `number` |  | true | `voucher.order.OrderDetail.returnQty` |
| 184 | `returnPreSendQty` | returnPreSendQty | `fReturnPreSendQty` | Decimal | `number` |  | true | `voucher.order.OrderDetail.returnPreSendQty` |
| 185 | `reSendPriceQty` | 退货累计计价数量 | `fReSendPriceQty` | Decimal | `number` |  | true | `voucher.order.OrderDetail.reSendPriceQty` |
| 186 | `invoiceQty` | invoiceQty | `invoiceQty` | Decimal | `number` |  | true | `uorder.voucher.IInvoiceReWrite.invoiceQty` |
| 187 | `invoicePriceQty` | 累计开票计价数量 | `invoicePriceQty` | Decimal | `number` |  | true | `voucher.order.OrderDetail.invoicePriceQty` |
| 188 | `invoiceOriSum` | invoiceOriSum | `invoiceOriSum` | Decimal | `number` |  | true | `uorder.voucher.IInvoiceReWrite.invoiceOriSum` |
| 189 | `orderPurchaseQty` | orderPurchaseQty | `fOrderPurchaseQty` | Decimal | `number` |  | true | `voucher.order.OrderDetail.orderPurchaseQty` |
| 190 | `orderOutPut` | orderOutPut | `fOrderOutPut` | Decimal | `number` |  | true | `voucher.order.OrderDetail.orderOutPut` |
| 191 | `totalSubcontractApplyQty` | totalSubcontractApplyQty | `fTotalSubcontractApplyQty` | Decimal | `number` |  | true | `voucher.order.OrderDetail.totalSubcontractApplyQty` |
| 192 | `totalSubcontractOrderQty` | totalSubcontractOrderQty | `fTotalSubcontractOrderQty` | Decimal | `number` |  | true | `voucher.order.OrderDetail.totalSubcontractOrderQty` |
| 193 | `projectSettlementQty` | projectSettlementQty | `fProjectSettlementQty` | Decimal | `number` |  | true | `voucher.order.OrderDetail.projectSettlementQty` |
| 194 | `coordinationQuantity` | coordinationQuantity | `coordinationQuantity` | Decimal | `number` |  | true | `base.itf.ISocialCoordination.coordinationQuantity` |
| 195 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |  | true | `voucher.order.OrderDetail.pubts` |
| 196 | `isBatchManage` | isBatchManage | `isBatchManage` | Boolean | `switch` |  | true | `voucher.order.OrderDetail.isBatchManage` |
| 197 | `batchId` | batchId | `iBatchId` | 9458cb44-2675-4988-8e64-f6a59fefed89 | `quote` |  | true | `voucher.order.OrderDetail.batchId` |
| 198 | `batchNo` | batchNo | `cBatchNo` | String | `text` |  | true | `voucher.order.OrderDetail.batchNo` |
| 199 | `expireDateNo` | expireDateNo | `iExpireDateNo` | Integer | `int` |  | true | `voucher.order.OrderDetail.expireDateNo` |
| 200 | `expireDateUnit` | 有效期单位 | `cExpireDateUnit` | String | `text` |  | true | `voucher.order.OrderDetail.expireDateUnit` |
| 201 | `productDate` | productDate | `dProductDate` | DateTime | `timestamp` |  | true | `voucher.order.OrderDetail.productDate` |
| 202 | `invalidDate` | invalidDate | `dValidDate` | DateTime | `timestamp` |  | true | `voucher.order.OrderDetail.invalidDate` |
| 203 | `define1` | define1 | `define1` | String | `text` | false | true | `base.itf.UserdefItemBatch.define1` |
| 204 | `define2` | define2 | `define2` | String | `text` | false | true | `base.itf.UserdefItemBatch.define2` |
| 205 | `define3` | define3 | `define3` | String | `text` | false | true | `base.itf.UserdefItemBatch.define3` |
| 206 | `define4` | define4 | `define4` | String | `text` | false | true | `base.itf.UserdefItemBatch.define4` |
| 207 | `define5` | define5 | `define5` | String | `text` | false | true | `base.itf.UserdefItemBatch.define5` |
| 208 | `define6` | define6 | `define6` | String | `text` | false | true | `base.itf.UserdefItemBatch.define6` |
| 209 | `define7` | define7 | `define7` | String | `text` | false | true | `base.itf.UserdefItemBatch.define7` |
| 210 | `define8` | define8 | `define8` | String | `text` | false | true | `base.itf.UserdefItemBatch.define8` |
| 211 | `define9` | define9 | `define9` | String | `text` | false | true | `base.itf.UserdefItemBatch.define9` |
| 212 | `define10` | define10 | `define10` | String | `text` | false | true | `base.itf.UserdefItemBatch.define10` |
| 213 | `define11` | define11 | `define11` | String | `text` | false | true | `base.itf.UserdefItemBatch.define11` |
| 214 | `define12` | define12 | `define12` | String | `text` | false | true | `base.itf.UserdefItemBatch.define12` |
| 215 | `define13` | define13 | `define13` | String | `text` | false | true | `base.itf.UserdefItemBatch.define13` |
| 216 | `define14` | define14 | `define14` | String | `text` | false | true | `base.itf.UserdefItemBatch.define14` |
| 217 | `define15` | define15 | `define15` | String | `text` | false | true | `base.itf.UserdefItemBatch.define15` |
| 218 | `define16` | define16 | `define16` | String | `text` | false | true | `base.itf.UserdefItemBatch.define16` |
| 219 | `define17` | define17 | `define17` | String | `text` | false | true | `base.itf.UserdefItemBatch.define17` |
| 220 | `define18` | define18 | `define18` | String | `text` | false | true | `base.itf.UserdefItemBatch.define18` |
| 221 | `define19` | define19 | `define19` | String | `text` | false | true | `base.itf.UserdefItemBatch.define19` |
| 222 | `define20` | define20 | `define20` | String | `text` | false | true | `base.itf.UserdefItemBatch.define20` |
| 223 | `define21` | define21 | `define21` | String | `text` | false | true | `base.itf.UserdefItemBatch.define21` |
| 224 | `define22` | define22 | `define22` | String | `text` | false | true | `base.itf.UserdefItemBatch.define22` |
| 225 | `define23` | define23 | `define23` | String | `text` | false | true | `base.itf.UserdefItemBatch.define23` |
| 226 | `define24` | define24 | `define24` | String | `text` | false | true | `base.itf.UserdefItemBatch.define24` |
| 227 | `define25` | define25 | `define25` | String | `text` | false | true | `base.itf.UserdefItemBatch.define25` |
| 228 | `define26` | define26 | `define26` | String | `text` | false | true | `base.itf.UserdefItemBatch.define26` |
| 229 | `define27` | define27 | `define27` | String | `text` | false | true | `base.itf.UserdefItemBatch.define27` |
| 230 | `define28` | define28 | `define28` | String | `text` | false | true | `base.itf.UserdefItemBatch.define28` |
| 231 | `define29` | define29 | `define29` | String | `text` | false | true | `base.itf.UserdefItemBatch.define29` |
| 232 | `define30` | define30 | `define30` | String | `text` | false | true | `base.itf.UserdefItemBatch.define30` |
| 233 | `logisticsOrgId` | logisticsOrgId | `logisticsOrgId` | 5b3cb420-49f7-4289-a937-76cee6a2a349 | `quote` |  | true | `voucher.order.OrderDetail.logisticsOrgId` |
| 234 | `shipPointId` | shipPointId | `shipPointId` | 42ee9178-d4e8-4c05-b72e-9650c492d33b | `quote` |  | true | `voucher.order.OrderDetail.shipPointId` |
| 235 | `loadModeId` | loadModeId | `loadModeId` | 3b73800a-106b-41bb-8960-826a7f003aaa | `quote` |  | true | `voucher.order.OrderDetail.loadModeId` |
| 236 | `startAreaId` | startAreaId | `startAreaId` | 373171f0-f497-4bab-bda7-ff4b6489c13e | `quote` |  | true | `voucher.order.OrderDetail.startAreaId` |
| 237 | `planTransRouteId` | planTransRouteId | `planTransRouteId` | 9aea767e-c207-4758-863d-afa266aa0138 | `quote` |  | true | `voucher.order.OrderDetail.planTransRouteId` |
| 238 | `distributionSide` | distributionSide | `distributionSide` | String | `text` |  | true | `voucher.order.OrderDetail.distributionSide` |
| 239 | `planTransCompleteDate` | planTransCompleteDate | `planTransCompleteDate` | Date | `date` |  | true | `voucher.order.OrderDetail.planTransCompleteDate` |
| 240 | `wopStrateDate` | wopStrateDate | `wopStrateDate` | Date | `date` |  | true | `voucher.order.OrderDetail.wopStrateDate` |
| 241 | `overflowRate` | overflowRate | `overflowRate` | Decimal | `number` |  | true | `voucher.order.OrderDetail.overflowRate` |
| 242 | `shortageRate` | shortageRate | `shortageRate` | Decimal | `number` |  | true | `voucher.order.OrderDetail.shortageRate` |
| 243 | `loadDate` | loadDate | `loadDate` | Date | `date` |  | true | `voucher.order.OrderDetail.loadDate` |
| 244 | `planArrivalDate` | planArrivalDate | `planArrivalDate` | Date | `date` |  | true | `voucher.order.OrderDetail.planArrivalDate` |
| 245 | `canSendQty` | canSendQty | `canSendQty` | Decimal | `number` |  | true | `voucher.order.OrderDetail.canSendQty` |
| 246 | `EstiDeliveryCreateDate` | EstiDeliveryCreateDate | `EstiDeliveryCreateDate` | Date | `date` |  | true | `voucher.order.OrderDetail.EstiDeliveryCreateDate` |
| 247 | `source` | 订单来源 | `cSourceType` | String | `text` |  | true | `voucher.order.OrderDetail.source` |
| 248 | `uplineno` | uplineno | `uplineno` | Decimal | `number` |  | true | `sale.aa.IUpLineNo.uplineno` |
| 249 | `code` | 编码 | `cOrderNo` | String | `text` |  | true | `voucher.order.OrderDetail.code` |
| 250 | `firstsource` | firstsource | `firstsource` | String | `text` |  | true | `sale.aa.IFirstSourceData.firstsource` |
| 251 | `firstupcode` | firstupcode | `firstupcode` | String | `text` |  | true | `sale.aa.IFirstSourceData.firstupcode` |
| 252 | `firstlineno` | firstlineno | `firstlineno` | Decimal | `number` |  | true | `sale.aa.IFirstSourceData.firstlineno` |
| 253 | `firstsourceid` | firstsourceid | `firstsourceid` | Long | `long` |  | true | `sale.aa.IFirstSourceData.firstsourceid` |
| 254 | `firstsourceautoid` | firstsourceautoid | `firstsourceautoid` | Long | `long` |  | true | `sale.aa.IFirstSourceData.firstsourceautoid` |
| 255 | `contractTpye` | contractTpye | `contractTpye` | String | `text` |  | true | `voucher.order.OrderDetail.contractTpye` |
| 256 | `sactCode` | sactCode | `sactcode` | String | `text` |  | true | `voucher.order.OrderDetail.sactCode` |
| 257 | `sactId` | sactId | `sactid` | Long | `long` |  | true | `voucher.order.OrderDetail.sactId` |
| 258 | `sacoId` | sacoId | `sacoid` | Long | `long` |  | true | `voucher.order.OrderDetail.sacoId` |
| 259 | `deliveryLot` | deliveryLot | `deliveryLot` | String | `text` |  | true | `voucher.order.OrderDetail.deliveryLot` |
| 260 | `contractLot` | contractLot | `contractLot` | String | `text` |  | true | `voucher.order.OrderDetail.contractLot` |
| 261 | `sourceType` | 来源单据类型 | `cSourceType` | String | `text` |  | true | `voucher.order.OrderDetail.sourceType` |
| 262 | `upcode` | upcode | `csynSourceNo` | String | `text` |  | true | `voucher.order.OrderDetail.upcode` |
| 263 | `sourceid` | sourceid | `iSourceid` | Long | `long` |  | true | `voucher.order.OrderDetail.sourceid` |
| 264 | `sourceautoid` | sourceautoid | `iSourceautoid` | Long | `long` |  | true | `voucher.order.OrderDetail.sourceautoid` |
| 265 | `coSourceType` | coSourceType | `cCoSourceType` | String | `text` |  | true | `sale.aa.ICoSourceData.coSourceType` |
| 266 | `coUpcode` | coUpcode | `cCoUpcode` | String | `text` |  | true | `sale.aa.ICoSourceData.coUpcode` |
| 267 | `coSourceLineNo` | coSourceLineNo | `coSourceLineNo` | Decimal | `number` |  | true | `sale.aa.ICoSourceData.coSourceLineNo` |
| 268 | `coSourceid` | coSourceid | `iCoSourceid` | Long | `long` |  | true | `sale.aa.ICoSourceData.coSourceid` |
| 269 | `coSourceautoid` | coSourceautoid | `iCoSourceautoid` | Long | `long` |  | true | `sale.aa.ICoSourceData.coSourceautoid` |
| 270 | `subBusinessSourceType` | subBusinessSourceType | `subBusinessSourceType` | String | `text` |  | true | `sale.aa.ISubBusinessSourceData.subBusinessSourceType` |
| 271 | `subBusinessSourceNo` | subBusinessSourceNo | `subBusinessSourceNo` | String | `text` |  | true | `sale.aa.ISubBusinessSourceData.subBusinessSourceNo` |
| 272 | `subBusinessSourceLineNo` | subBusinessSourceLineNo | `subBusinessSourceLineNo` | Decimal | `number` |  | true | `sale.aa.ISubBusinessSourceData.subBusinessSourceLineNo` |
| 273 | `subBusinessSourceId` | subBusinessSourceId | `subBusinessSourceId` | Long | `long` |  | true | `sale.aa.ISubBusinessSourceData.subBusinessSourceId` |
| 274 | `subBusinessSourceLineId` | subBusinessSourceLineId | `subBusinessSourceLineId` | Long | `long` |  | true | `sale.aa.ISubBusinessSourceData.subBusinessSourceLineId` |
| 275 | `isreserve` | isreserve | `isreserve` | Boolean | `switch` |  | true | `voucher.order.OrderDetail.isreserve` |
| 276 | `reserveid` | reserveid | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 | `quote` |  | true | `st.reservation.IReservationID.reserveid` |
| 277 | `reserveidDemandtype` | reserveidDemandtype | `reserveidDemandtype` | String | `text` |  | true | `voucher.order.OrderDetail.reserveidDemandtype` |
| 278 | `isSkuReserve` | isSkuReserve | `isSkuReserve` | Boolean | `switch` |  | true | `voucher.order.OrderDetail.isSkuReserve` |
| 279 | `suiteId` | suiteId | `suiteId` | bd6ceb9e-378b-4e63-8b2c-75712bdc84ee | `quote` |  | true | `sale.aa.ISuiteInfo.suiteId` |
| 280 | `suite_amount` | suite_amount | `suite_amount` | Decimal | `number` |  | true | `sale.aa.ISuiteInfo.suite_amount` |
| 281 | `suiteSon_amount` | suiteSon_amount | `suiteSon_amount` | Decimal | `number` |  | true | `sale.aa.ISuiteInfo.suiteSon_amount` |
| 282 | `suiteQuotePrice` | suiteQuotePrice | `cSuiteQuotePrice` | Decimal | `number` |  | true | `sale.aa.ISuiteInfo.suiteQuotePrice` |
| 283 | `suiteSon_priceWeight` | suiteSon_priceWeight | `suiteSon_priceWeight` | Decimal | `number` |  | true | `sale.aa.ISuiteInfo.suiteSon_priceWeight` |
| 284 | `suiteGroup` | suiteGroup | `suiteGroup` | String | `text` |  | true | `sale.aa.ISuiteInfo.suiteGroup` |
| 285 | `productAuth` | productAuth | `iProductId` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 | `quote` |  | true | `voucher.order.OrderDetail.productAuth` |
| 286 | `cCreator` | cCreator | `cCreator` | String | `text` |  | true | `voucher.order.OrderDetail.cCreator` |
| 287 | `createDate` | 创建日期 | `dCreated` | DateTime | `timestamp` |  | true | `voucher.order.OrderDetail.createDate` |
| 288 | `dCreatedTime` | dCreatedTime | `dCreatedTime` | Date | `date` |  | true | `voucher.order.OrderDetail.dCreatedTime` |
| 289 | `cModifier` | cModifier | `cModifier` | String | `text` |  | true | `voucher.order.OrderDetail.cModifier` |
| 290 | `dModifyTime` | dModifyTime | `dModifyTime` | DateTime | `timestamp` |  | true | `voucher.order.OrderDetail.dModifyTime` |
| 291 | `productId_pbatchName` | 产品包装单位 | `productId_pbatchName` | String | `text` |  | true | `voucher.order.OrderDetail.productId_pbatchName` |
| 292 | `iDeleted` | 是否删除 | `iDeleted` | Short | `short` |  | true | `voucher.order.OrderDetail.iDeleted` |
| 293 | `groupId` | groupId | `iGroupId` | Long | `long` | false | true | `voucher.order.OrderDetail.groupId` |
| 294 | `groupTaskKey` | groupTaskKey | `groupTaskKey` | String | `text` |  | true | `base.itf.IBackWrite.groupTaskKey` |
| 295 | `mutualActivities` | mutualActivities | `cMutualActivities` | String | `text` |  | true | `voucher.order.OrderDetail.mutualActivities` |
| 296 | `activities` | activities | `cActivities` | String | `text` |  | true | `voucher.order.OrderDetail.activities` |
| 297 | `makeRuleCode` | makeRuleCode | `makerule_code` | String | `text` |  | true | `base.itf.IBackWrite.makeRuleCode` |
| 298 | `isDeleted` | isDeleted | `iDeleted` | Boolean | `switch` |  | true | `base.itf.Deletable.isDeleted` |
| 299 | `outSysKey` | 来源系统KEY | `cOutSysKey` | String | `text` |  | true | `voucher.order.OrderDetail.outSysKey` |
| 300 | `groupIndex` | 组序号 | `iGroupIndex` | Long | `long` |  | true | `voucher.order.OrderDetail.groupIndex` |
| 301 | `shoppingCartId` | shoppingCartId | `iShoppingCartId` | Long | `long` |  | true | `voucher.order.OrderDetail.shoppingCartId` |
| 302 | `sourceMainPubts` | sourceMainPubts | `sourceMainPubts` | DateTime | `timestamp` |  | true | `base.itf.IBackWrite.sourceMainPubts` |
| 303 | `receiveCount` | receiveCount | `fReceiveCount` | Decimal | `number` |  | true | `voucher.order.OrderDetail.receiveCount` |
| 304 | `sendSubQty` | sendSubQty | `fSendSubQty` | Decimal | `number` |  | true | `voucher.order.OrderDetail.sendSubQty` |
| 305 | `sendQuantity` | 已发数量 | `aQuantity` | Decimal | `number` |  | true | `voucher.order.OrderDetail.sendQuantity` |
| 306 | `conversionRate` | conversionRate | `iConversionRate` | Decimal | `number` |  | true | `voucher.order.OrderDetail.conversionRate` |
| 307 | `cBizName` | cBizName | `cBizName` | String | `text` |  | true | `voucher.order.OrderDetail.cBizName` |
| 308 | `orderDetailPrice` | 订单明细价格 | `iOrderDetailPriceId` | 36aa3114-3181-4338-9684-9df21055b1a0 | `quote` |  | true | `voucher.order.OrderDetail.orderDetailPrice` |
| 309 | `cSkuOutSysKey` | cSkuOutSysKey | `cSkuOutSysKey` | String | `text` |  | true | `voucher.order.OrderDetail.cSkuOutSysKey` |
| 310 | `fMarketPrice` | 市场价格 | `fMarketPrice` | Long | `long` |  | true | `voucher.order.OrderDetail.fMarketPrice` |
| 311 | `cProductOutSysKey` | cProductOutSysKey | `cProductOutSysKey` | String | `text` |  | true | `voucher.order.OrderDetail.cProductOutSysKey` |
| 312 | `version` | 版本号 | `version` | Short | `short` |  | true | `voucher.order.OrderDetail.version` |
| 313 | `bodyFreeItem` | bodyFreeItem | `` | 44880691-7f9f-43ec-87fb-95dba6a07110 | `` |  |  | `` |
| 314 | `bodyItem` | bodyItem | `` | 525923f4-68e8-43ed-a799-3b25fcbd7f40 | `` |  |  | `` |
| 315 | `detailDeliveryPlans` | detailDeliveryPlans | `` | 17b7b108-3479-4808-9ef3-7374017882d0 | `` |  |  | `` |
| 316 | `invExchRateDen` | invExchRateDen | `invexchrateden` | Decimal | `number` |  | true | `voucher.order.OrderDetail.invExchRateDen` |
| 317 | `invExchRateNum` | invExchRateNum | `invexchratenum` | Decimal | `number` |  | true | `voucher.order.OrderDetail.invExchRateNum` |
| 318 | `invPriceExchRateDen` | 计价汇率分母 | `invpriceexchrateden` | Decimal | `number` |  | true | `voucher.order.OrderDetail.invPriceExchRateDen` |
| 319 | `invPriceExchRateNum` | 计价汇率分子 | `invpriceexchratenum` | Decimal | `number` |  | true | `voucher.order.OrderDetail.invPriceExchRateNum` |
| 320 | `orderDetailPrices` | 订单明细多价格 | `` | 36aa3114-3181-4338-9684-9df21055b1a0 | `` |  |  | `` |
| 321 | `orderProductApportions` | orderProductApportions | `` | ed6bf689-2650-4bdc-bf4a-a5f002ec19c6 | `` |  |  | `` |
| 322 | `ptoHierarchyType` | ptoHierarchyType | `ptoHierarchyType` | Integer | `int` |  | true | `usp.pto.IProductToOrder.ptoHierarchyType` |
| 323 | `ptoPricingMethod` | ptoPricingMethod | `ptoPricingMethod` | Integer | `int` |  | true | `usp.pto.IProductToOrder.ptoPricingMethod` |
| 324 | `throwStatus` | 抛单状态 | `throw_status` | Integer | `int` | false | true | `sccs.multitrade.ITradeRouteID.throwStatus` |

---

## 关联属性（共 50 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `orderDetailPrice` | 订单明细价格 | `voucher.order.OrderDetailPrice` | `iOrderDetailPriceId` | 外键引用 |  |  | None |  |
| 2 | `orderId` | 订单ID | `voucher.order.Order` | `iorderId` | orderDetails → orderId | 1..n | Y | None |  |
| 3 | `orderDetailDefineCharacter` | orderDetailDefineCharacter | `voucher.order.OrderDetailDefineCharacter` | `orderDetailDefineCharacter` | 外键引用 |  |  | None |  |
| 4 | `ptoId` | ptoId | `pc.product.Product` | `ptoId` | 外键引用 |  |  | Service |  |
| 5 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | `wbs` | 外键引用 |  |  | Service |  |
| 6 | `iOrgId` | iOrgId | `org.func.BaseOrg` | `iOrgId` | 外键引用 |  |  | Service |  |
| 7 | `rebateReturnProductId` | rebateReturnProductId | `voucher.rebate.RebateReturnProduct` | `iRebateReturnProductId` | 外键引用 |  |  | Service |  |
| 8 | `shipPointId` | shipPointId | `usp.sendAndReceiveSite.SendAndReceiveSite` | `shipPointId` | 外键引用 |  |  | Service |  |
| 9 | `providerProfitCenter` | providerProfitCenter | `bd.virtualaccbody.VirtualAccbody` | `provider_profit_center` | 外键引用 |  |  | Service |  |
| 10 | `natCurrency` | natCurrency | `bd.currencytenant.CurrencyTenantVO` | `cDomesticPk` | 外键引用 |  |  | Service |  |
| 11 | `receiverId` | receiverId | `aa.merchant.AddressInfo` | `iReceiver` | 外键引用 |  |  | Service |  |
| 12 | `logisticsOrgId` | logisticsOrgId | `org.func.LogisticsOrg` | `logisticsOrgId` | 外键引用 |  |  | Service |  |
| 13 | `skuId` | skuId | `pc.product.ProductSKU` | `iSKUId` | 外键引用 |  |  | Service |  |
| 14 | `suiteId` | suiteId | `ec.suiteGoodsInfo.EcSuiteGoods` | `suiteId` | 外键引用 |  |  | Service |  |
| 15 | `bodyItem` | bodyItem | `voucher.order.OrderDetailDefine` | `` | bodyItem → orderDetailId | 1 | Y | None | true |
| 16 | `productId` | 产品ID | `pc.product.Product` | `iProductId` | 外键引用 |  |  | Service |  |
| 17 | `costCenter` | costCenter | `bd.costcenter.CostCenter` | `cost_center` | 外键引用 |  |  | Service |  |
| 18 | `orderDetailPrices` | 订单明细多价格 | `voucher.order.OrderDetailPrice` | `` | orderDetailPrices → orderDetailId | 1 | Y | None |  |
| 19 | `tradeRouteID` | 贸易路线ID | `sccs.multitrade.TradeRoute` | `tradeRouteID` | 外键引用 |  |  | Service |  |
| 20 | `orderProductApportions` | orderProductApportions | `voucher.order.OrderProductApportion` | `` | orderProductApportions → orderDetailId | 0..n | Y | None |  |
| 21 | `masterUnitId` | 主计量单位ID | `pc.unit.Unit` | `iMasterUnitId` | 外键引用 |  |  | Service |  |
| 22 | `receiveStoreId` | receiveStoreId | `aa.store.Store` | `iReceiveStore` | 外键引用 |  |  | Service |  |
| 23 | `saleDepartmentId` | 销售部门 | `bd.adminOrg.DeptOrgVO` | `iSaleDepartmentId` | 外键引用 |  |  | Service |  |
| 24 | `taxId` | taxId | `archive.taxArchives.TaxRateArchive` | `cTaxId` | 外键引用 |  |  | Service |  |
| 25 | `bodyFreeItem` | bodyFreeItem | `voucher.order.OrderDetailFreeDefine` | `` | bodyFreeItem → id | 1 | Y | None | true |
| 26 | `productAuth` | productAuth | `pb.dataauth.ProductDataAuth` | `iProductId` | 外键引用 |  |  | None |  |
| 27 | `settlementOrgId` | 开票组织 | `org.func.FinanceOrg` | `iSettlementOrgId` | 外键引用 |  |  | Service |  |
| 28 | `loadModeId` | loadModeId | `base.loadway.LoadWay` | `loadModeId` | 外键引用 |  |  | Service |  |
| 29 | `projectId` | projectId | `bd.project.ProjectVO` | `cProjectId` | 外键引用 |  |  | Service |  |
| 30 | `iProductAuxUnitId` | 辅计量单位ID | `pc.unit.Unit` | `iProductAuxUnitId` | 外键引用 |  |  | Service |  |
| 31 | `reserveid` | reserveid | `st.reservation.Reservation` | `reserveid` | 外键引用 |  |  | Service |  |
| 32 | `activity` | activity | `pgrm.projecttask.ProjectScheduleTask` | `activity` | 外键引用 |  |  | Service |  |
| 33 | `agentProductId` | agentProductId | `sa.agent.AgentProductRelation` | `agentProductId` | 外键引用 |  |  | None |  |
| 34 | `planTransRouteId` | planTransRouteId | `usp.plantransportroute.PlanTransportRoute` | `planTransRouteId` | 外键引用 |  |  | Service |  |
| 35 | `batchId` | batchId | `st.batchno.Batchno` | `iBatchId` | 外键引用 |  |  | Service |  |
| 36 | `variantConfiguration` | variantConfiguration | `vc.variantConfiguration.VariantConfiguration` | `variantConfiguration` | 外键引用 |  |  | Service |  |
| 37 | `productLineId` | productLineId | `pc.productline.ProductLine` | `iProductLineId` | 外键引用 |  |  | Service |  |
| 38 | `detailDeliveryPlans` | detailDeliveryPlans | `voucher.order.OrderDetailDeliveryPlan` | `` | detailDeliveryPlans → orderDetailId | 0..n | Y | None |  |
| 39 | `startAreaId` | startAreaId | `base.shipregion.ShipRegion` | `startAreaId` | 外键引用 |  |  | Service |  |
| 40 | `transactionTypeId` | 交易类型 | `bd.bill.TransType` | `iTransactionTypeId` | 外键引用 |  |  | Service |  |
| 41 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | `ytenant_id` | 外键引用 |  |  | Service |  |
| 42 | `orderDetailCharacteristics` | orderDetailCharacteristics | `voucher.order.OrderDetailCharacteristics` | `orderDetailCharacteristics` | 外键引用 |  |  | None |  |
| 43 | `consumerProfitCenter` | consumerProfitCenter | `bd.virtualaccbody.VirtualAccbody` | `consumer_profit_center` | 外键引用 |  |  | Service |  |
| 44 | `optionCharacteristics` | optionCharacteristics | `voucher.order.OptionCharacteristics` | `optionCharacteristics` | 外键引用 |  |  | None |  |
| 45 | `stockId` | stockId | `aa.warehouse.Warehouse` | `iStockId` | 外键引用 |  |  | Service |  |
| 46 | `receiverCustId` | 收货客户 | `aa.merchant.Merchant` | `iReceiverCust` | 外键引用 |  |  | Service |  |
| 47 | `stockOrgId` | stockOrgId | `org.func.InventoryOrg` | `iStockOrgId` | 外键引用 |  |  | Service |  |
| 48 | `costCurrency` | costCurrency | `bd.currencytenant.CurrencyTenantVO` | `cCostCurrencyPK` | 外键引用 |  |  | Service |  |
| 49 | `iProductUnitId` | 计价单位ID | `pc.unit.Unit` | `iProductUnitId` | 外键引用 |  |  | Service |  |
| 50 | `salesOrgId` | 销售组织 | `org.func.SalesOrg` | `iSalesOrgId` | 外键引用 |  |  | Service |  |

### Composition（子表）

- **订单ID**: `orderId` → `voucher.order.Order` | 1..n
- **bodyItem**: `bodyItem` → `voucher.order.OrderDetailDefine` | 1 ⚠️ 已废弃
- **订单明细多价格**: `orderDetailPrices` → `voucher.order.OrderDetailPrice` | 1
- **orderProductApportions**: `orderProductApportions` → `voucher.order.OrderProductApportion` | 0..n
- **bodyFreeItem**: `bodyFreeItem` → `voucher.order.OrderDetailFreeDefine` | 1 ⚠️ 已废弃
- **detailDeliveryPlans**: `detailDeliveryPlans` → `voucher.order.OrderDetailDeliveryPlan` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ptoId` (ptoId) | `pc.product.Product` | `ptoId` |
| `wbs` (WBS) | `BGDM.wbs.wbs_doc` | `wbs` |
| `iOrgId` (iOrgId) | `org.func.BaseOrg` | `iOrgId` |
| `rebateReturnProductId` (rebateReturnProductId) | `voucher.rebate.RebateReturnProduct` | `iRebateReturnProductId` |
| `shipPointId` (shipPointId) | `usp.sendAndReceiveSite.SendAndReceiveSite` | `shipPointId` |
| `providerProfitCenter` (providerProfitCenter) | `bd.virtualaccbody.VirtualAccbody` | `provider_profit_center` |
| `natCurrency` (natCurrency) | `bd.currencytenant.CurrencyTenantVO` | `cDomesticPk` |
| `receiverId` (receiverId) | `aa.merchant.AddressInfo` | `iReceiver` |
| `logisticsOrgId` (logisticsOrgId) | `org.func.LogisticsOrg` | `logisticsOrgId` |
| `skuId` (skuId) | `pc.product.ProductSKU` | `iSKUId` |
| `suiteId` (suiteId) | `ec.suiteGoodsInfo.EcSuiteGoods` | `suiteId` |
| `productId` (产品ID) | `pc.product.Product` | `iProductId` |
| `costCenter` (costCenter) | `bd.costcenter.CostCenter` | `cost_center` |
| `tradeRouteID` (贸易路线ID) | `sccs.multitrade.TradeRoute` | `tradeRouteID` |
| `masterUnitId` (主计量单位ID) | `pc.unit.Unit` | `iMasterUnitId` |
| `receiveStoreId` (receiveStoreId) | `aa.store.Store` | `iReceiveStore` |
| `saleDepartmentId` (销售部门) | `bd.adminOrg.DeptOrgVO` | `iSaleDepartmentId` |
| `taxId` (taxId) | `archive.taxArchives.TaxRateArchive` | `cTaxId` |
| `settlementOrgId` (开票组织) | `org.func.FinanceOrg` | `iSettlementOrgId` |
| `loadModeId` (loadModeId) | `base.loadway.LoadWay` | `loadModeId` |
| `projectId` (projectId) | `bd.project.ProjectVO` | `cProjectId` |
| `iProductAuxUnitId` (辅计量单位ID) | `pc.unit.Unit` | `iProductAuxUnitId` |
| `reserveid` (reserveid) | `st.reservation.Reservation` | `reserveid` |
| `activity` (activity) | `pgrm.projecttask.ProjectScheduleTask` | `activity` |
| `planTransRouteId` (planTransRouteId) | `usp.plantransportroute.PlanTransportRoute` | `planTransRouteId` |
| `batchId` (batchId) | `st.batchno.Batchno` | `iBatchId` |
| `variantConfiguration` (variantConfiguration) | `vc.variantConfiguration.VariantConfiguration` | `variantConfiguration` |
| `productLineId` (productLineId) | `pc.productline.ProductLine` | `iProductLineId` |
| `startAreaId` (startAreaId) | `base.shipregion.ShipRegion` | `startAreaId` |
| `transactionTypeId` (交易类型) | `bd.bill.TransType` | `iTransactionTypeId` |
| `ytenant` (租户) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `consumerProfitCenter` (consumerProfitCenter) | `bd.virtualaccbody.VirtualAccbody` | `consumer_profit_center` |
| `stockId` (stockId) | `aa.warehouse.Warehouse` | `iStockId` |
| `receiverCustId` (收货客户) | `aa.merchant.Merchant` | `iReceiverCust` |
| `stockOrgId` (stockOrgId) | `org.func.InventoryOrg` | `iStockOrgId` |
| `costCurrency` (costCurrency) | `bd.currencytenant.CurrencyTenantVO` | `cCostCurrencyPK` |
| `iProductUnitId` (计价单位ID) | `pc.unit.Unit` | `iProductUnitId` |
| `salesOrgId` (销售组织) | `org.func.SalesOrg` | `iSalesOrgId` |

---

## 使用示例

```sql
-- 查询 订单详情 数据
SELECT id, iorderId, idKey, lineno, rowno, iProductId, cProductCode, cProductName, iSKUId, cSkuCode
FROM orderdetail
WHERE orderId = ? -- 关联订单ID
```

### 通过 API 获取元数据

```bash
python bip_metadata_query.py voucher.order.OrderDetail
```
