---
tags: [BIP, metadata, st, TransferApplys]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 调拨订单子表 (st.transferapply.TransferApplys)

> Platform: BIP V5 | Module: st | Table: st_transferapplys | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 调拨订单子表 |
| uri | st.transferapply.TransferApplys |
| tableName | st_transferapplys |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | st.voucher.UstockVouchLine |
| isBusinessObject | true |
| description | 调拨订单子表 |

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
| 7 | 行关闭信息 (ILineClosing) | base.itf.ILineClosing |
| 8 | 生单回写 (IBackWrite) | base.itf.IBackWrite |
| 9 | 源头单据信息 (IFirstSourceData) | st.voucher.IFirstSourceData |
| 10 | 预留双向 (IReservationInOut) | st.reservation.IReservationInOut |
| 11 | 计价单位信息 (IUOMPriceInfo) | voucher.base.IUOMPriceInfo |
| 12 | 货主对象 (IInventoryOwner) | st.inventoryowner.IInventoryOwner |
| 13 | 货权归属 (IOwnerType) | st.inventoryowner.IOwnerType |
| 14 | 物权转移单回写 (vmiBackWrite) | st.billstate.vmiBackWrite |
| 15 | 货位相关 (IGoodsPosition) | st.voucher.IGoodsPosition |
| 16 | 后端自动行号接口 (ILineNo) | base.itf.ILineNo |
| 17 | 上游单据行号 (IUpLinenNO) | st.uplineno.IUpLinenNO |
| 18 | 源头单据行号 (FirstupLinenNO) | st.uplineno.FirstupLinenNO |
| 19 | 来源订单行号 (SourceOrderLinenNO) | st.uplineno.SourceOrderLinenNO |
| 20 | 特征适配相关信息 (CharacterInfo) | gscm.itf.CharacterInfo |
| 21 | 租户相关 (ITenant) | base.itf.ITenant |
| 22 | 库存类型对象 (IStockType) | st.stocktype.IStockType |
| 23 | 来源订单信息 (IOrderSource) | st.orderSource.IOrderSource |
| 24 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 25 | 项目结构属性 (projectStructureProperties) | BGDM.wbs.projectStructureProperties |
| 26 | 外部来源行线索 (IOutSysObjLineClue) | base.itf.IOutSysObjLineClue |

---

## All Fields (159)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | stockType | 库存类型ID | stockType | quote | st.stocktype.StockType |  |  | nullable |
| 2 | isLineClose | 是否行关闭 | isLineClose | switch | Boolean |  |  | nullable |
| 3 | operationCode | 工序编码 | operation_code | text | String |  |  | nullable |
| 4 | operationId | 标准工序ID | operation_id | long | Long |  |  | nullable |
| 5 | operationName | 工序名称 | operation_name | text | String |  |  | nullable |
| 6 | processid | 工序id | process_id | long | Long |  |  | nullable |
| 7 | processsn | 工序顺序号 | process_sn | text | String |  |  | nullable |
| 8 | productAuth | 物料权限 | iProductid | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 9 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable |
| 10 | productskun | 默认SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | nullable |
| 11 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 12 | demandApplyId | 调拨申请id | demandApply_id | long | Long |  |  | nullable |
| 13 | outCustodian | 调出保管者 | outCustodianid | quote | st.custodian.Custodian |  |  | nullable |
| 14 | outCustodianType | 调出保管者类型 | outCustodian_type | text | String |  |  | nullable |
| 15 | inCustodian | 调入保管者 | inCustodianid | quote | st.custodian.Custodian |  |  | nullable |
| 16 | inCustodianType | 调入保管者类型 | inCustodian_type | text | String |  |  | nullable |
| 17 | cfmOutStockQuantity | 累计确认出库数量 | cfm_out_stock_quantity | number | Decimal |  |  | nullable |
| 18 | cfmOutStockSubQuantity | 累计确认出库件数 | cfm_out_stock_sub_quantity | number | Decimal |  |  | nullable |
| 19 | cfmInStockQuantity | 累计确认入库数量 | cfm_in_stock_quantity | number | Decimal |  |  | nullable |
| 20 | cfmInStockSubQuantity | 累计确认入库件数 | cfm_in_stock_sub_quantity | number | Decimal |  |  | nullable |
| 21 | demandApplysId | 调拨申请行id | demandApplys_id | long | Long |  |  | nullable |
| 22 | replenishmentMethod | 补货方式 | replenishment_method | short | Short |  |  | nullable |
| 23 | childoutwarehouse | 调出仓库 | ioutwarehouseid | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 24 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 25 | product | 物料 | iProductid | quote | pc.aa.Product |  |  | data_auth,nullable,dataPowerFlag |
| 26 | out_sys_rowno | 外部来源行号 | out_sys_rowno | text | String |  |  | nullable |
| 27 | productsku | 物料SKU | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable |
| 28 | out_sys_lineid | 外部来源行 | out_sys_lineid | text | String |  |  | nullable |
| 29 | childinwarehouse | 调入仓库 | iInWarehouseId | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 30 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 31 | groupTaskKey | 分组任务KEY | groupTaskKey | text | String |  |  | nullable,reportHide |
| 32 | sourceMainPubts | 时间戳 | sourceMainPubts | timestamp | Timestamp |  |  | nullable,reportHide |
| 33 | srcBillCode | 来源单据 | srcBillCode | text | String |  |  | nullable |
| 34 | stockSensClue | 现存量特征敏感线索 | stockSensClue | text | String |  |  | nullable |
| 35 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 36 | transferApplysCharacteristics | 自由项特征组 | transferApplysCharacteristics | FreeCT | st.transferapply.TransferApplysCharacteristics |  |  | nullable |
| 37 | transferApplysDefineCharacter | 自定义项特征组 | transferApplysDefineCharacter | UserDefine | st.transferapply.TransferApplysDefineCharacter |  |  | nullable |
| 38 | sourceGrandchildrenId | 上游单据孙表id | source_grandchildrenId | long | Long |  |  | nullable |
| 39 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 40 | makeproduct | 制造部门材料使用的物料id | make_product | long | Long |  |  | nullable |
| 41 | firstsourceGrandchildrenId | 源头单据孙表id | firstsource_grandchildrenId | long | Long |  |  | nullable |
| 42 | manageClass | 物料分类 | manage_class | long | Long |  |  | nullable |
| 43 | free1 | 物料规格1 | free1 | text | String |  |  | isGlobalization,nullable |
| 44 | free2 | 物料规格2 | free2 | text | String |  |  | isGlobalization,nullable |
| 45 | free3 | 物料规格3 | free3 | text | String |  |  | isGlobalization,nullable |
| 46 | free4 | 物料规格4 | free4 | text | String |  |  | isGlobalization,nullable |
| 47 | free5 | 物料规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 48 | free6 | 物料规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 49 | free7 | 物料规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 50 | free8 | 物料规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 51 | free9 | 物料规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 52 | free10 | 物料规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 53 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 54 | invaliddate | 有效期至 | dInvalidDate | date | Date |  |  | nullable |
| 55 | mainid | 主表id | iMainId | quote | st.transferapply.TransferApply |  |  | nullable |
| 56 | rowno | 行号 | rowno | int | Integer |  |  | isCode,nullable |
| 57 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 58 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 59 | qty | 数量 | fQuantity | number | Decimal |  |  | nullable |
| 60 | unit | 主计量id | iUnitId | quote | pc.unit.Unit |  |  | nullable |
| 61 | unitName | 主计量 | iunitName | text | String |  |  | nullable |
| 62 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  | nullable |
| 63 | subQty | 件数 | subQty | number | Decimal |  |  | nullable |
| 64 | stockUnitId | 库存单位id | stockUnitId | quote | pc.unit.Unit |  |  | nullable |
| 65 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int | Integer |  |  | nullable |
| 66 | priceUOM | 计价单位id | oPriceUOM | quote | pc.unit.Unit |  |  | nullable |
| 67 | invPriceExchRate | 计价换算率 | invPriceExchRate | number | Decimal |  |  | nullable |
| 68 | priceQty | 计价数量 | priceQty | number | Decimal |  |  | nullable |
| 69 | settlementPriceBy | 结算价格依据 | settlement_price_by | text | String |  |  | nullable |
| 70 | isCanModPrice | 价格可改 | isCanModPrice | switch | Boolean |  |  | nullable |
| 71 | taxUnitPriceTag | 价格含税 | taxUnitPriceTag | switch | Boolean |  |  | nullable |
| 72 | oriUnitPrice | 无税单价 | oriUnitPrice | number | Decimal |  |  |  |
| 73 | oriTaxUnitPrice | 含税单价 | oriTaxUnitPrice | number | Decimal |  |  |  |
| 74 | oriMoney | 无税金额 | oriMoney | number | Decimal |  |  |  |
| 75 | oriSum | 含税金额 | oriSum | number | Decimal |  |  |  |
| 76 | oriTax | 税额 | oriTax | number | Decimal |  |  |  |
| 77 | taxRate | 税率 | taxRate | number | Decimal |  |  |  |
| 78 | taxitems | 税目id | iTaxItems | quote | archive.taxArchives.TaxRateArchive |  |  | nullable |
| 79 | natUnitPrice | 本币无税单价 | natUnitPrice | number | Decimal |  |  |  |
| 80 | natTaxUnitPrice | 本币含税单价 | natTaxUnitPrice | number | Decimal |  |  |  |
| 81 | natMoney | 本币无税金额 | natMoney | number | Decimal |  |  |  |
| 82 | natSum | 本币含税金额 | natSum | number | Decimal |  |  |  |
| 83 | natTax | 本币税额 | natTax | number | Decimal |  |  |  |
| 84 | finishoutqty | 已出库数量 | fFinishOutQty | number | Decimal |  |  | nullable |
| 85 | finishoutnum | 已出库件数 | fFinishOutNum | number | Decimal |  |  | nullable |
| 86 | finishinqty | 已入库数量 | fFinishInQty | number | Decimal |  |  | nullable |
| 87 | finishinnum | 已入库件数 | fFinishInNum | number | Decimal |  |  | nullable |
| 88 | project | 项目id | iProject | quote | bd.project.ProjectVO |  |  | dataPowerFlag,data_auth,nullable |
| 89 | outreserveid | 调出预留对象 | outreserveid | quote | st.reservation.Reservation |  |  | nullable |
| 90 | inreserveid | 调入预留对象 | inreserveid | quote | st.reservation.Reservation |  |  | nullable |
| 91 | sourceid | 上游单据主表id | sourceid | long | Long |  |  | nullable |
| 92 | firstsourceid | 源头单据主表id | firstsourceid | long | Long |  |  | nullable |
| 93 | sourceautoid | 上游单据子表id | sourceautoid | long | Long |  |  | nullable |
| 94 | firstsourceautoid | 源头单据子表id | firstsourceautoid | long | Long |  |  | nullable |
| 95 | uplineno | 来源单据行号 | uplineno | number | Decimal |  |  | nullable |
| 96 | linecloser | 行关闭人 | linecloser | text | String |  |  | isGlobalization,nullable |
| 97 | sourceOrderlineno | 来源订单行号 | sourceOrderlineno | number | Decimal |  |  | nullable |
| 98 | firstuplineno | 源头单据行号 | firstuplineno | number | Decimal |  |  | nullable |
| 99 | linecloseTime | 行关闭时间 | lineclose_time | timestamp | Timestamp |  |  | nullable,reportHide |
| 100 | memo | 备注 | cMemo | text | String |  |  | nullable |
| 101 | makeRuleCode | 生单规则编号 | makerule_code | text | String |  |  | nullable,reportHide |
| 102 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 103 | sourceautoid4storeout | 上游调出单据子表id | sourceautoid4storeout | long | Long |  |  | nullable |
| 104 | firstupcode | 源头单据号 | firstupcode | text | String |  |  | nullable |
| 105 | upcode | 来源单据 | upcode | text | String |  |  | nullable |
| 106 | inventoryowner | 货主对象 | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 107 | source | 来源单据类型 | source | text | String |  |  | nullable,reportHide |
| 108 | firstsource | 源头单据类型 | firstsource | text | String |  |  | nullable |
| 109 | ownertype | 货权归属 | ownertype | int | Integer |  |  | nullable |
| 110 | propertyRightsTransferred | 已货权转移 | propertyRightsTransferred | switch | Boolean |  |  | nullable |
| 111 | goodsposition | 货位id | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 112 | externalSource | 外部来源类型 | externalSource | text | String |  |  | nullable |
| 113 | externalCode | 外部来源单号 | externalCode | text | String |  |  | nullable |
| 114 | externalSourceLineNo | 外部来源行号 | externalSourceLineNo | number | Decimal |  |  | nullable |
| 115 | externalSourceid | 外部来源ID | externalSourceid | long | Long |  |  | nullable |
| 116 | externalSourceautoid | 外部来源行ID | externalSourceautoid | long | Long |  |  | nullable |
| 117 | orderSource | 来源订单类型 | orderSource | text | String |  |  | nullable |
| 118 | orderCode | 来源订单号 | orderCode | text | String |  |  | nullable |
| 119 | orderSourceid | 来源订单ID | orderSourceid | long | Long |  |  | nullable |
| 120 | orderSourceautoid | 来源订单行ID | orderSourceautoid | long | Long |  |  | nullable |
| 121 | orderSourceGrandchildrenId | 来源订单孙ID | orderSourceGrandchildrenId | long | Long |  |  | nullable |
| 122 | bodyItem | 调拨订单子表自定义项 | - | - | st.transferapply.TransferApplysCustomItem |  |  |  |
| 123 | bodyParallel | 调拨订单子表平行表 | - | - | st.transferapply.TransferApplysParallel |  |  |  |
| 124 | define1 | 自定义项1 | define1 | text | String |  |  | isGlobalization,nullable |
| 125 | define10 | 自定义项10 | define10 | text | String |  |  | isGlobalization,nullable |
| 126 | define11 | 自定义项11 | define11 | text | String |  |  | isGlobalization,nullable |
| 127 | define12 | 自定义项12 | define12 | text | String |  |  | isGlobalization,nullable |
| 128 | define13 | 自定义项13 | define13 | text | String |  |  | isGlobalization,nullable |
| 129 | define14 | 自定义项14 | define14 | text | String |  |  | isGlobalization,nullable |
| 130 | define15 | 自定义项15 | define15 | text | String |  |  | isGlobalization,nullable |
| 131 | define16 | 自定义项16 | define16 | text | String |  |  | isGlobalization,nullable |
| 132 | define17 | 自定义项17 | define17 | text | String |  |  | isGlobalization,nullable |
| 133 | define18 | 自定义项18 | define18 | text | String |  |  | isGlobalization,nullable |
| 134 | define19 | 自定义项19 | define19 | text | String |  |  | isGlobalization,nullable |
| 135 | define2 | 自定义项2 | define2 | text | String |  |  | isGlobalization,nullable |
| 136 | define20 | 自定义项20 | define20 | text | String |  |  | isGlobalization,nullable |
| 137 | define21 | 自定义项21 | define21 | text | String |  |  | isGlobalization,nullable |
| 138 | define22 | 自定义项22 | define22 | text | String |  |  | isGlobalization,nullable |
| 139 | define23 | 自定义项23 | define23 | text | String |  |  | isGlobalization,nullable |
| 140 | define24 | 自定义项24 | define24 | text | String |  |  | isGlobalization,nullable |
| 141 | define25 | 自定义项25 | define25 | text | String |  |  | isGlobalization,nullable |
| 142 | define26 | 自定义项26 | define26 | text | String |  |  | isGlobalization,nullable |
| 143 | define27 | 自定义项27 | define27 | text | String |  |  | isGlobalization,nullable |
| 144 | define28 | 自定义项28 | define28 | text | String |  |  | isGlobalization,nullable |
| 145 | define29 | 自定义项29 | define29 | text | String |  |  | isGlobalization,nullable |
| 146 | define3 | 自定义项3 | define3 | text | String |  |  | isGlobalization,nullable |
| 147 | define30 | 自定义项30 | define30 | text | String |  |  | isGlobalization,nullable |
| 148 | define4 | 自定义项4 | define4 | text | String |  |  | isGlobalization,nullable |
| 149 | define5 | 自定义项5 | define5 | text | String |  |  | isGlobalization,nullable |
| 150 | define6 | 自定义项6 | define6 | text | String |  |  | isGlobalization,nullable |
| 151 | define7 | 自定义项7 | define7 | text | String |  |  | isGlobalization,nullable |
| 152 | define8 | 自定义项8 | define8 | text | String |  |  | isGlobalization,nullable |
| 153 | define9 | 自定义项9 | define9 | text | String |  |  | isGlobalization,nullable |
| 154 | defines | 调拨出库单子表自由自定义项 | - | - | st.transferapply.TransferApplysAttrextItem |  |  |  |
| 155 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 156 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 157 | invPriceExchRateDen | 计价换算率分母 | invpriceexchrateden | number | Decimal |  |  | nullable |
| 158 | invPriceExchRateNum | 计价换算率分子 | invpriceexchratenum | number | Decimal |  |  | nullable |
| 159 | unitExchangeTypePrice | 计价单位转换率的换算方式 | unitExchangeTypePrice | int | Integer |  |  | nullable |

---

## Reference Fields (24)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | stockType | 库存类型ID | stockType | st.stocktype.StockType |
| 2 | productAuth | 物料权限 | iProductid | pb.dataauth.ProductDataAuth |
| 3 | productn | 物料 | iProductid | pc.product.Product |
| 4 | productskun | 默认SKUID | iProductSkuid | pc.product.ProductSKU |
| 5 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 6 | outCustodian | 调出保管者 | outCustodianid | st.custodian.Custodian |
| 7 | inCustodian | 调入保管者 | inCustodianid | st.custodian.Custodian |
| 8 | childoutwarehouse | 调出仓库 | ioutwarehouseid | aa.warehouse.Warehouse |
| 9 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 10 | product | 物料 | iProductid | pc.aa.Product |
| 11 | productsku | 物料SKU | iProductSkuid | pc.aa.ProductSKU |
| 12 | childinwarehouse | 调入仓库 | iInWarehouseId | aa.warehouse.Warehouse |
| 13 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 14 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 15 | mainid | 主表id | iMainId | st.transferapply.TransferApply |
| 16 | unit | 主计量id | iUnitId | pc.unit.Unit |
| 17 | stockUnitId | 库存单位id | stockUnitId | pc.unit.Unit |
| 18 | priceUOM | 计价单位id | oPriceUOM | pc.unit.Unit |
| 19 | taxitems | 税目id | iTaxItems | archive.taxArchives.TaxRateArchive |
| 20 | project | 项目id | iProject | bd.project.ProjectVO |
| 21 | outreserveid | 调出预留对象 | outreserveid | st.reservation.Reservation |
| 22 | inreserveid | 调入预留对象 | inreserveid | st.reservation.Reservation |
| 23 | inventoryowner | 货主对象 | inventoryowner | st.inventoryowner.InventoryOwner |
| 24 | goodsposition | 货位id | iGoodsPositionId | aa.goodsposition.GoodsPosition |

---

## Number Fields (38)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | cfmOutStockQuantity | 累计确认出库数量 | cfm_out_stock_quantity | number |
| 2 | cfmOutStockSubQuantity | 累计确认出库件数 | cfm_out_stock_sub_quantity | number |
| 3 | cfmInStockQuantity | 累计确认入库数量 | cfm_in_stock_quantity | number |
| 4 | cfmInStockSubQuantity | 累计确认入库件数 | cfm_in_stock_sub_quantity | number |
| 5 | replenishmentMethod | 补货方式 | replenishment_method | short |
| 6 | lineno | 行号 | lineno | number |
| 7 | rowno | 行号 | rowno | int |
| 8 | qty | 数量 | fQuantity | number |
| 9 | invExchRate | 换算率 | invExchRate | number |
| 10 | subQty | 件数 | subQty | number |
| 11 | unitExchangeType | 库存换算率换算方式 | unitExchangeType | int |
| 12 | invPriceExchRate | 计价换算率 | invPriceExchRate | number |
| 13 | priceQty | 计价数量 | priceQty | number |
| 14 | oriUnitPrice | 无税单价 | oriUnitPrice | number |
| 15 | oriTaxUnitPrice | 含税单价 | oriTaxUnitPrice | number |
| 16 | oriMoney | 无税金额 | oriMoney | number |
| 17 | oriSum | 含税金额 | oriSum | number |
| 18 | oriTax | 税额 | oriTax | number |
| 19 | taxRate | 税率 | taxRate | number |
| 20 | natUnitPrice | 本币无税单价 | natUnitPrice | number |
| 21 | natTaxUnitPrice | 本币含税单价 | natTaxUnitPrice | number |
| 22 | natMoney | 本币无税金额 | natMoney | number |
| 23 | natSum | 本币含税金额 | natSum | number |
| 24 | natTax | 本币税额 | natTax | number |
| 25 | finishoutqty | 已出库数量 | fFinishOutQty | number |
| 26 | finishoutnum | 已出库件数 | fFinishOutNum | number |
| 27 | finishinqty | 已入库数量 | fFinishInQty | number |
| 28 | finishinnum | 已入库件数 | fFinishInNum | number |
| 29 | uplineno | 来源单据行号 | uplineno | number |
| 30 | sourceOrderlineno | 来源订单行号 | sourceOrderlineno | number |
| 31 | firstuplineno | 源头单据行号 | firstuplineno | number |
| 32 | ownertype | 货权归属 | ownertype | int |
| 33 | externalSourceLineNo | 外部来源行号 | externalSourceLineNo | number |
| 34 | invExchRateDen | 换算率分母 | invexchrateden | number |
| 35 | invExchRateNum | 换算率分子 | invexchratenum | number |
| 36 | invPriceExchRateDen | 计价换算率分母 | invpriceexchrateden | number |
| 37 | invPriceExchRateNum | 计价换算率分子 | invpriceexchratenum | number |
| 38 | unitExchangeTypePrice | 计价单位转换率的换算方式 | unitExchangeTypePrice | int |

---

## Date Fields (2)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | producedate | 生产日期 | dProduceDate | date |
| 2 | invaliddate | 有效期至 | dInvalidDate | date |

---

## Child Tables (3)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | bodyItem | 调拨订单子表自定义项 | st.transferapply.TransferApplysCustomItem |
| 2 | bodyParallel | 调拨订单子表平行表 | st.transferapply.TransferApplysParallel |
| 3 | defines | 调拨出库单子表自由自定义项 | st.transferapply.TransferApplysAttrextItem |
