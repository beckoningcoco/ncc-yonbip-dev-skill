---
tags: [BIP, 元数据, 数据字典, st.salesout.SalesOuts]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售出库单子表 (`st.salesout.SalesOuts`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`st_salesouts` | domain：`ustock` | 应用：`ST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售出库单子表 |
| 物理表 | `st_salesouts` |
| 数据库 schema | `ustock` |
| 所属应用 | `ST` |
| 直连字段 | 201 个 |
| 关联引用 | 34 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyItem` | `st.salesout.SalesOutsCustomItem` | composition |
| `salesOutsExtend` | `st.salesout.SalesOutsExtend` | composition |
| `salesOutsSNs` | `st.salesout.SalesOutsSN` | composition |
| `bodyDefine` | `st.salesout.SalesOutsDefine` | composition |
| `paymentExeDetail` | `st.salesout.PaymentExeDetail` | composition |

## 关联引用 (34个)

| 字段名 | 引用类型 |
|--------|---------|
| `qualitypriceScheme` | `` |
| `` | `st_reservation` |
| `activity` | `` |
| `iProductSkuid` | `productcenter.productskuref` |
| `salesOutsCharacteristics` | `` |
| `agent_product_id` | `` |
| `stockStatusDoc` | `st_stockStatusref` |
| `iProject` | `ucfbasedoc.bd_outer_projectcardMCref` |
| `wbs` | `` |
| `firstSourceBusTypeId` | `` |
| `oPriceUOM` | `productcenter.pc_productassitunitsref` |
| `iGoodsPositionId` | `st_stockandstocklocationref` |
| `imainid` | `` |
| `tenant_id` | `` |
| `orderBusTypeId` | `` |
| `iProductid` | `productcenter.productref` |
| `custodianid` | `` |
| `stockType` | `` |
| `ytenant_id` | `` |
| `salesOutsDefineCharacter` | `` |
| `sub_warehouse` | `` |
| `iunitid` | `aa_productunit` |
| `iTaxId` | `` |
| `stock_unit_id` | `productcenter.pc_productassitunitsref` |

## 继承接口 (33个, 87字段)

- **是否** (`pub.uom.IUnitExchangeType`)
  - `unitExchangeType` → `unitExchangeType`
  - `unitExchangeTypePrice` → `unitExchangeTypePrice`
- **贸易路径Id接口** (`sccs.multitrade.ITradeRouteID`)
  - `` → ``
  - `throw_status` → `throw_status`
  - `` → ``
  - `` → ``
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
- **计量单位信息** (`voucher.base.IUOMInfo`)
  - `` → ``
  - `` → ``
  - `` → ``
- **计价单位信息** (`voucher.base.IUOMPriceInfo`)
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
- **源头单据信息** (`st.voucher.IFirstSourceData`)
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
- **库存成本信息** (`voucher.base.ICostMoneyInfo`)
  - `autoCalcCost` → `autoCalcCost`
  - `cost_money` → `cost_money`
  - `cost_unit_price` → `cost_unit_price`
- **往来（应收应付）账户** (`voucher.base.IContactsAccount`)
  - `contacts_pieces` → `contacts_pieces`
  - `contacts_quantity` → `contacts_quantity`
- **内部交易交换信息接口** (`st.inttradeinfo.IIntTradeinfo`)
- **库存接口** (`st.internaltransaction.IInventory`)
  - `fAllTotalInternalNatMoney` → `fAllTotalInternalNatMoney`
  - `fAllTotalInternalOriMoney` → `fAllTotalInternalOriMoney`
  - `fAllTotalInternalQty` → `fAllTotalInternalQty`
  - `fAllTotalInternalUnit` → `fAllTotalInternalUnit`
- **库存状态接口** (`st.stockStatusRecord.IStockStatus`)
  - `stockStatusDoc` → `stockStatusDoc`
- **预留对象相关** (`st.reservation.IReservationID`)
  - `` → ``
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **货主对象** (`st.inventoryowner.IInventoryOwner`)
  - `` → ``
- **货权归属** (`st.inventoryowner.IOwnerType`)
  - `` → ``
- **物权转移单回写** (`st.billstate.vmiBackWrite`)
  - `propertyRightsTransferred` → `propertyRightsTransferred`
- **是否更新存货成本接口** (`st.inventoryaccounting.IUpdateCost`)
  - `isUpdateCost` → `isUpdateCost`
- **后端自动行号接口** (`base.itf.ILineNo`)
  - `lineno` → `lineno`
- **上游单据行号** (`st.uplineno.IUpLinenNO`)
  - `uplineno` → `uplineno`
- **源头单据行号** (`st.uplineno.FirstupLinenNO`)
  - `firstuplineno` → `firstuplineno`
- **来源订单行号** (`st.uplineno.SourceOrderLinenNO`)
  - `sourceOrderlineno` → `sourceOrderlineno`
- **特征适配相关信息** (`gscm.itf.CharacterInfo`)
  - `stockSensClue` → `stockSensClue`
- **零售价格组件** (`st.retail.IRetailPrice`)
  - `retailMoney` → `retailMoney`
  - `retailUnitPrice` → `retailUnitPrice`
- **原币金额信息** (`voucher.base.IOriMoneyInfo`)
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
- **库存类型对象** (`st.stocktype.IStockType`)
  - `stockType` → `stockType`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **跟踪线索MTO销售订单** (`st.inventoryaccounting.ReservationMtoSalesOrder`)
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
- **外部来源行线索** (`base.itf.IOutSysObjLineClue`)
  - `out_sys_lineid` → `out_sys_lineid`
  - `out_sys_rowno` → `out_sys_rowno`

## 字段列表（按类型分组）

> 共 201 个直连字段

### 文本字段 (64个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `inspectinfo_id` | `inspectinfo_id` | String | 质检结果id |
| `inspectinfo_item_id` | `inspectinfo_item_id` | String | 质检结果行id |
| `contractTpye` | `contractTpye` | String | 合同类型 |
| `ercl_outbound_info` | `ercl_outbound_info` | String | 已生成收入出库信息 |
| `custodian_type` | `custodian_type` | String | 保管者类型 |
| `write_off_upcode` | `write_off_upcode` | String | 冲销单据号 |
| `` | `mtoSalesOrderCode` | String | MTO销售订单单据号 |
| `out_sys_rowno` | `out_sys_rowno` | String | 外部来源行号 |
| `out_sys_lineid` | `out_sys_lineid` | String | 外部来源行 |
| `stockSensClue` | `stockSensClue` | String | 现存量特征敏感线索 |
| `groupTaskKey` | `groupTaskKey` | String | 分组任务KEY |
| `` | `free1` | String | 物料规格1 |
| `` | `free2` | String | 物料规格2 |
| `` | `free3` | String | 物料规格3 |
| `` | `free4` | String | 物料规格4 |
| `` | `free5` | String | 物料规格5 |
| `` | `free6` | String | 物料规格6 |
| `` | `free7` | String | 物料规格7 |
| `` | `free8` | String | 物料规格8 |
| `` | `free9` | String | 物料规格9 |
| `` | `free10` | String | 物料规格10 |
| `sBatchNo` | `sBatchNo` | String | 批次号 |
| `` | `source` | String | 来源单据类型 |
| `collaboration_source` | `collaboration_source` | String | 协同来源类型 |
| `` | `upcode` | String | 来源单据号 |
| `` | `firstsource` | String | 源头单据类型 |
| `` | `firstupcode` | String | 源头单据号 |
| `collaboration_pocode` | `collaboration_pocode` | String | 协同来源单据号 |
| `ifirstsrcbillrow` | `ifirstsrcbillrow` | String | 源头单据行 |
| `sact_code` | `sact_code` | String | 销售合同编码 |
| `order_code` | `order_code` | String | 销售订单号 |
| `cMemo` | `cMemo` | String | 备注 |
| `salestyle` | `salestyle` | String | 商品售卖方式 |
| `makerule_code` | `makerule_code` | String | 生单规则编号 |
| `` | `define1` | String | 自定义项1 |
| `` | `define10` | String | 自定义项10 |
| `` | `define11` | String | 自定义项11 |
| `` | `define12` | String | 自定义项12 |
| `` | `define13` | String | 自定义项13 |
| `` | `define14` | String | 自定义项14 |
| `` | `define15` | String | 自定义项15 |
| `` | `define16` | String | 自定义项16 |
| `` | `define17` | String | 自定义项17 |
| `` | `define18` | String | 自定义项18 |
| `` | `define19` | String | 自定义项19 |
| `` | `define2` | String | 自定义项2 |
| `` | `define20` | String | 自定义项20 |
| `` | `define21` | String | 自定义项21 |
| `` | `define22` | String | 自定义项22 |
| `` | `define23` | String | 自定义项23 |
| `` | `define24` | String | 自定义项24 |
| `` | `define25` | String | 自定义项25 |
| `` | `define26` | String | 自定义项26 |
| `` | `define27` | String | 自定义项27 |
| `` | `define28` | String | 自定义项28 |
| `` | `define29` | String | 自定义项29 |
| `` | `define3` | String | 自定义项3 |
| `` | `define30` | String | 自定义项30 |
| `` | `define4` | String | 自定义项4 |
| `` | `define5` | String | 自定义项5 |
| `` | `define6` | String | 自定义项6 |
| `` | `define7` | String | 自定义项7 |
| `` | `define8` | String | 自定义项8 |
| `` | `define9` | String | 自定义项9 |

### 引用字段 (27个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `stockType` | `stockType` | de7a641c-45f2-4b85-8424-2ed8acf02456 | 库存类型 |
| `iProductid` | `iProductid` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | 物料 |
| `iProductSkuid` | `iProductSkuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | 默认SKUID |
| `iProductid` | `iProductid` | 9a24ef07-e188-425b-b36a-402ddbf22073 | 物料 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |
| `custodianid` | `custodianid` | 0578a613-7f7f-4bec-b589-039035ca3f8a | 保管者 |
| `sub_warehouse` | `sub_warehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | 仓库 |
| `wbs` | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | WBS |
| `activity` | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | 活动 |
| `` | `tradeRouteID` | c69f1d6a-783c-4f79-b446-b4da14cb7fff | 贸易路径Id |
| `iProductid` | `iProductid` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 | 物料权限 |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `` | `inventoryowner` | af1b583d-f5e4-4f7c-bba5-66d570ef7e3e | 货主对象 |
| `iProductSkuid` | `iProductSkuid` | 0d86941d-5af3-4cf4-9255-4f5c74a3476f | SKU |
| `imainid` | `imainid` | 09b66409-4f08-4dc6-957b-3d5ac15e1ea8 | 主表id |
| `iunitid` | `iunitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | 单位id |
| `stock_unit_id` | `stock_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | 库存单位id |
| `oPriceUOM` | `oPriceUOM` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | 计价单位id |
| `iProject` | `iProject` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | 项目id |
| `iGoodsPositionId` | `iGoodsPositionId` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc | 货位id |
| `stockStatusDoc` | `stockStatusDoc` | 5275f074-3e60-4b90-9771-20970f1e905c | 库存状态id |
| `agent_product_id` | `agent_product_id` | 27a41e77-558c-4f2b-9fdb-f108db09b3b5 | 客户商品id |
| `` | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 | 预留对象id |
| `iTaxId` | `iTaxId` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | 税目id |
| `firstSourceBusTypeId` | `firstSourceBusTypeId` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | 源头交易类型(废弃) |
| `orderBusTypeId` | `orderBusTypeId` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | 订单交易类型(废弃) |
| `qualitypriceScheme` | `qualitypriceScheme` | c7cc8895-2b03-4c7d-a327-da6e09410f76 | 优质优价方案 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `dProduceDate` | `dProduceDate` | Date | 生产日期 |
| `dInvalidDate` | `dInvalidDate` | Date | 有效期至 |

### 布尔字段 (11个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `taxIssueDiscount` | `taxIssueDiscount` | Boolean | 税票开具折扣行 |
| `rev_manage_calculate` | `rev_manage_calculate` | Boolean | 收入管理核算 |
| `qualityCertificateFlag` | `qualityCertificateFlag` | Boolean | 已生成质证书 |
| `isGiftProduct` | `isGiftProduct` | Boolean | 是否赠品 |
| `isScrap` | `isScrap` | Boolean | 是否废品 |
| `isUpdateCost` | `isUpdateCost` | Boolean | 是否更新存货成本 |
| `propertyRightsTransferred` | `propertyRightsTransferred` | Boolean | 已货权转移 |
| `bInvoiceAfterReceipt` | `bInvoiceAfterReceipt` | Boolean | 签收后开票 |
| `rebateflag` | `rebateflag` | Boolean | 是否使用返利 |
| `autoCalcCost` | `autoCalcCost` | Boolean | 自动计算成本 |
| `taxUnitPriceTag` | `taxUnitPriceTag` | Boolean | 价格含税 |

### 整数 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `throw_status` | `throw_status` | Integer | 抛单状态 |
| `unitExchangeTypePrice` | `unitExchangeTypePrice` | Integer | 计价单位转换率的换算方式 |
| `rowno` | `rowno` | Integer | 行号 |
| `` | `ownertype` | Integer | 货权归属 |
| `unitExchangeType` | `unitExchangeType` | Integer | 库存单位转换率的换算方式 |
| `` | `isPriceSettled` | Integer | 价格结算 |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `isEndTrade` | Short | 是否末级 |

### 长整数 (17个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `write_off_sourceid` | `write_off_sourceid` | Long | 冲销线索主表id |
| `write_off_sourceautoid` | `write_off_sourceautoid` | Long | 冲销线索子表id |
| `` | `mtoSalesOrderId` | Long | MTO销售订单主表id |
| `` | `mtoSalesOrderLineId` | Long | MTO销售订单行id |
| `id` | `id` | Long | ID |
| `isrcbillrow` | `isrcbillrow` | Long | 来源单据行 |
| `` | `sourceid` | Long | 上游单据主表id |
| `` | `sourceautoid` | Long | 上游单据子表id |
| `sact_id` | `sact_id` | Long | 销售合同表头id |
| `` | `firstsourceid` | Long | 源头单据主表id |
| `saco_id` | `saco_id` | Long | 销售合同表体行id |
| `order_id` | `order_id` | Long | 销售订单id |
| `order_detail_id` | `order_detail_id` | Long | 销售订单行id |
| `collaboration_poid` | `collaboration_poid` | Long | 协同来源单据id |
| `collaboration_podetailid` | `collaboration_podetailid` | Long | 协同来源单据子表id |
| `` | `firstsourceautoid` | Long | 源头单据子表id |
| `ireceiveAgreementId` | `ireceiveAgreementId` | Long | 收付款协议id |

### 数值字段 (64个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `retailMoney` | `retailMoney` | Decimal | 零售金额 |
| `retailUnitPrice` | `retailUnitPrice` | Decimal | 零售单价 |
| `sacoLineno` | `sacoLineno` | Decimal | 销售合同行号 |
| `uninvoiceqty` | `uninvoiceqty` | Decimal | 可开票数量 |
| `write_off_uplineno` | `write_off_uplineno` | Decimal | 冲销单据行号 |
| `expense_natsum` | `expense_natsum` | Decimal | 费用本币含税金额 |
| `expense_natmoney` | `expense_natmoney` | Decimal | 费用本币无税金额 |
| `expense_orisum` | `expense_orisum` | Decimal | 费用含税金额 |
| `expense_orimoney` | `expense_orimoney` | Decimal | 费用无税金额 |
| `` | `mtoSalesOrderLineNo` | Decimal | MTO销售订单行号 |
| `collaboration_polineno` | `collaboration_polineno` | Decimal | 协同来源单据行号 |
| `` | `tradeRouteLineno` | Decimal | 站点 |
| `fAllTotalInternalNatMoney` | `fAllTotalInternalNatMoney` | Decimal | 累计内部结算金额本币 |
| `fAllTotalInternalOriMoney` | `fAllTotalInternalOriMoney` | Decimal | 累计内部结算金额原币 |
| `redInvoiceQty` | `redInvoiceQty` | Decimal | 累计发票红冲数量 |
| `fAllTotalInternalQty` | `fAllTotalInternalQty` | Decimal | 累计待内部结算数量 |
| `fAllTotalInternalUnit` | `fAllTotalInternalUnit` | Decimal | 累计内部结算数量主计量 |
| `dpreretailqty` | `dpreretailqty` | Decimal | 订单预占数量 |
| `fTransactionPrice` | `fTransactionPrice` | Decimal | 成交价 |
| `lineno` | `lineno` | Decimal | 行号 |
| `firstuplineno` | `firstuplineno` | Decimal | 源头单据行号 |
| `sourceOrderlineno` | `sourceOrderlineno` | Decimal | 来源订单行号 |
| `uplineno` | `uplineno` | Decimal | 来源单据行号 |
| `contacts_quantity` | `contacts_quantity` | Decimal | 应发数量 |
| `contacts_pieces` | `contacts_pieces` | Decimal | 应发件数 |
| `` | `qty` | Decimal | 数量 |
| `synergisticqty` | `synergisticqty` | Decimal | 累计协同数量 |
| `purinrecord_qty` | `purinrecord_qty` | Decimal | 采购入库主数量 |
| `` | `invExchRate` | Decimal | 换算率 |
| `` | `subQty` | Decimal | 件数 |
| `` | `invPriceExchRate` | Decimal | 计价换算率 |
| `` | `priceQty` | Decimal | 计价数量 |
| `cost_unit_price` | `cost_unit_price` | Decimal | 成本单价 |
| `cost_money` | `cost_money` | Decimal | 成本金额 |
| `` | `natUnitPrice` | Decimal | 本币无税单价 |
| `` | `natTaxUnitPrice` | Decimal | 本币含税单价 |
| `` | `natMoney` | Decimal | 本币无税金额 |
| `` | `natSum` | Decimal | 本币含税金额 |
| `` | `natTax` | Decimal | 本币税额 |
| `` | `oriUnitPrice` | Decimal | 无税单价 |
| `` | `oriTaxUnitPrice` | Decimal | 含税单价 |
| `` | `oriMoney` | Decimal | 无税金额 |
| `` | `oriSum` | Decimal | 含税金额 |
| `` | `oriTax` | Decimal | 税额 |
| `` | `taxRate` | Decimal | 税率 |
| `fRebateMoney_domestic` | `fRebateMoney_domestic` | Decimal | 本币分摊返利 |
| `fOrderRebateMoney_domestic` | `fOrderRebateMoney_domestic` | Decimal | 本币货补分摊金额 |
| `fCashRebateMoney_domestic` | `fCashRebateMoney_domestic` | Decimal | 本币返利直接抵现 |
| `fcashRebateMoney` | `fcashRebateMoney` | Decimal | 返利直接抵现 |
| `fOrderRebateMoney` | `fOrderRebateMoney` | Decimal | 货补分摊金额 |
| `receivedquantity` | `receivedquantity` | Decimal | 签收数量 |
| `rebatemoney` | `rebatemoney` | Decimal | 返利分摊金额 |
| `freight` | `freight` | Decimal | 运费分摊额 |
| `salereturnqty` | `salereturnqty` | Decimal | 已退货数量 |
| `invoiceqty` | `invoiceqty` | Decimal | 已开票数量 |
| `invoiceorisum` | `invoiceorisum` | Decimal | 已开票金额 |
| `retnotneedinvoiceqty` | `retnotneedinvoiceqty` | Decimal | 退货不开票数量 |
| `invexchrateden` | `invexchrateden` | Decimal | 换算率分母 |
| `invexchratenum` | `invexchratenum` | Decimal | 换算率分子 |
| `invpriceexchrateden` | `invpriceexchrateden` | Decimal | 计价换算率分母 |
| `invpriceexchratenum` | `invpriceexchratenum` | Decimal | 计价换算率分子 |
| `settledMoeny` | `settledMoeny` | Decimal | 已价格结算金额 |
| `totalSettledQty` | `totalSettledQty` | Decimal | 累计下达价格结算数量 |
| `write_off_qty_total` | `write_off_qty_total` | Decimal | 累计冲销数量 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `salesOutsDefineCharacter` | `salesOutsDefineCharacter` | 7d67de08-7cf2-4fcf-b4af-17d7bd739034 | 自定义项特征属性组 |

### timestamp (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `sourceMainPubts` | `sourceMainPubts` | DateTime | 时间戳 |
| `pubts` | `pubts` | DateTime | 时间戳 |

### FreeCT (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `salesOutsCharacteristics` | `salesOutsCharacteristics` | 5c969772-f383-4951-b37b-181f8f3ca1b7 | 自由项特征组 |

### other (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | 99430ab3-cee5-483c-8350-1b23189e96fa | 销售出库单子表自由自定义项 |
| `` | `` | 69ff6788-287c-4406-af46-62db2d0808d0 | 销售出库单子表自定义项 |
| `` | `` | c32b8798-a094-41ef-bd37-967138c0413d | 收款执行明细 |
| `` | `` | a8c11e39-d0c7-484a-a46c-4ba9ee909cba | 销售出库单子表扩展 |
| `` | `` | b7cdff0d-e4a9-4e14-ba4b-b4be2d974148 | 销售出库单序列号 |
