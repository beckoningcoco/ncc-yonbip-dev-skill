---
tags: [BIP, metadata, st, MaterialOuts]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 材料出库单子表 (st.materialout.MaterialOuts)

> Platform: BIP V5 | Module: st | Table: st_materialouts | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 材料出库单子表 |
| uri | st.materialout.MaterialOuts |
| tableName | st_materialouts |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | st.voucher.UstockVouchLine |
| isBusinessObject | true |
| description | 材料出库单子表 |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (28)

| # | Name | URI |
|---|------|-----|
| 1 | 换算比 (IUOMExchRate) | gscm.itf.IUOMExchRate |
| 2 | 规格 (FreeItem) | base.itf.FreeItem |
| 3 | 生单回写 (IBackWrite) | base.itf.IBackWrite |
| 4 | 原币金额信息 (IOriMoneyInfo) | voucher.base.IOriMoneyInfo |
| 5 | 本币金额信息 (INatMoneyInfo) | voucher.base.INatMoneyInfo |
| 6 | 往来（应收应付）账户 (IContactsAccount) | voucher.base.IContactsAccount |
| 7 | 库存成本信息 (ICostMoneyInfo) | voucher.base.ICostMoneyInfo |
| 8 | 计量单位信息 (IUOMInfo) | voucher.base.IUOMInfo |
| 9 | 材料出和产品入公共体 (IMODetailCommon) | st.materialout.IMODetailCommon |
| 10 | 库存接口 (IInventory) | st.internaltransaction.IInventory |
| 11 | 库存状态接口 (IStockStatus) | st.stockStatusRecord.IStockStatus |
| 12 | 预留对象相关 (IReservationID) | st.reservation.IReservationID |
| 13 | 是否更新存货成本接口 (IUpdateCost) | st.inventoryaccounting.IUpdateCost |
| 14 | 货主对象 (IInventoryOwner) | st.inventoryowner.IInventoryOwner |
| 15 | 物权转移单回写 (vmiBackWrite) | st.billstate.vmiBackWrite |
| 16 | 货权归属 (IOwnerType) | st.inventoryowner.IOwnerType |
| 17 | 后端自动行号接口 (ILineNo) | base.itf.ILineNo |
| 18 | 上游单据行号 (IUpLinenNO) | st.uplineno.IUpLinenNO |
| 19 | 源头单据行号 (FirstupLinenNO) | st.uplineno.FirstupLinenNO |
| 20 | 来源订单行号 (SourceOrderLinenNO) | st.uplineno.SourceOrderLinenNO |
| 21 | 租户相关 (ITenant) | base.itf.ITenant |
| 22 | 特征适配相关信息 (CharacterInfo) | gscm.itf.CharacterInfo |
| 23 | 库存类型对象 (IStockType) | st.stocktype.IStockType |
| 24 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 25 | 项目结构属性 (projectStructureProperties) | BGDM.wbs.projectStructureProperties |
| 26 | 跟踪线索MTO销售订单 (ReservationMtoSalesOrder) | st.inventoryaccounting.ReservationMtoSalesOrder |
| 27 | 外部来源行线索 (IOutSysObjLineClue) | base.itf.IOutSysObjLineClue |
| 28 | 库存是否更新存量标识接口 (IStockUpdate) | st.stockupdate.IStockUpdate |

---

## All Fields (185)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | budgetMoney | 预算金额 | budgetMoney | number | Decimal |  |  | nullable |
| 2 | budgetUnitPrice | 预算单价 | budgetUnitPrice | number | Decimal |  |  | nullable |
| 3 | expenseItems | 费用项目 | expenseItems | quote | bd.expenseitem.ExpenseItem |  |  | nullable |
| 4 | isExcess | 超额领料 | is_excess | switch | Boolean |  |  | nullable |
| 5 | productAuth | 物料权限 | iProductid | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 6 | product | 物料id | iProductid | quote | pc.aa.Product |  |  | data_auth,nullable,dataPowerFlag |
| 7 | productCp | 制造产品id | iProductid_cp | quote | pc.product.Product |  |  | nullable |
| 8 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable |
| 9 | productskun | 默认SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | nullable |
| 10 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 11 | isUpdateStock | 是否更新存量 | isUpdateStock | switch | Boolean |  |  | nullable |
| 12 | materialReqType | 领料类型 | material_req_type | int | Integer |  |  | nullable |
| 13 | matlSourceId | 来源材料出库主表ID | matl_source_id | long | Long |  |  | nullable |
| 14 | matlSourceAutoId | 来源材料出库子表ID | matl_source_auto_id | long | Long |  |  | nullable |
| 15 | matlSourceLineno | 来源材料出库行号 | matl_source_lineno | number | Decimal |  |  | nullable |
| 16 | matlSourceCode | 来源材料出库单据号 | matl_source_code | text | String |  |  | nullable |
| 17 | retQty | 已退库数量 | ret_qty | number | Decimal |  |  | nullable |
| 18 | retSubQty | 已退库件数 | ret_sub_qty | number | Decimal |  |  | nullable |
| 19 | matlRetCount | 退料单数 | matl_ret_count | int | Integer |  |  | nullable |
| 20 | mtoSalesOrderCode | MTO销售订单单据号 | mtoSalesOrderCode | text | String |  |  | nullable |
| 21 | mtoSalesOrderId | MTO销售订单主表id | mtoSalesOrderId | long | Long |  |  | nullable |
| 22 | mtoSalesOrderLineId | MTO销售订单行id | mtoSalesOrderLineId | long | Long |  |  | nullable |
| 23 | mtoSalesOrderLineNo | MTO销售订单行号 | mtoSalesOrderLineNo | number | Decimal |  |  | nullable |
| 24 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 25 | out_sys_rowno | 外部来源行号 | out_sys_rowno | text | String |  |  | nullable |
| 26 | out_sys_lineid | 外部来源行 | out_sys_lineid | text | String |  |  | nullable |
| 27 | bizDocLineNo | 业务单据行号 | biz_doc_line_no | text | String |  |  | nullable |
| 28 | bizDocCode | 业务单据号 | biz_doc_code | text | String |  |  | nullable |
| 29 | bizDocType | 业务单据类型 | biz_docType | text | String |  |  | nullable |
| 30 | bomMaterialId | 子件ID | bom_material_id | long | Long |  |  | nullable |
| 31 | alternateId | 替代料ID | alternate_id | long | Long |  |  | nullable |
| 32 | bizDocAutoId | 业务单据子表id | biz_doc_auto_id | long | Long |  |  | nullable |
| 33 | isWip | 在制品 | is_wip | switch | Boolean |  |  | nullable |
| 34 | fixedAssetQty | 已转固数量 | fixed_asset_qty | number | Decimal |  |  | nullable |
| 35 | alternateMaterialId | 标准件来源订单材料行ID | alternate_material_id | long | Long |  |  | nullable |
| 36 | bizDocId | 业务单据id | biz_docId | long | Long |  |  | nullable |
| 37 | stockType | 库存类型 | stockType | quote | st.stocktype.StockType |  |  | nullable |
| 38 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 39 | fixedAsset | 转固 | fixed_asset | int | Integer | Y |  |  |
| 40 | stockSensClue | 现存量特征敏感线索 | stockSensClue | text | String |  |  | nullable |
| 41 | allTotalInternalNatMoney | 累计内部结算金额本币 | fAllTotalInternalNatMoney | number | Decimal |  |  |  |
| 42 | allTotalInternalOriMoney | 累计内部结算金额原币 | fAllTotalInternalOriMoney | number | Decimal |  |  |  |
| 43 | allTotalInternalQty | 累计待内部结算数量 | fAllTotalInternalQty | number | Decimal |  |  |  |
| 44 | allTotalInternalUnit | 累计内部结算数量主计量 | fAllTotalInternalUnit | number | Decimal |  |  |  |
| 45 | balance_qty | 已补差数量 | balance_qty | number | Decimal |  |  | nullable |
| 46 | balance_subQty | 已补差件数 | balance_subQty | number | Decimal |  |  | nullable |
| 47 | bfilled | 是否已经补差处理 | bfilled | switch | Boolean |  |  | nullable |
| 48 | firstsourceautodate | 源头单据子表时间戳 | firstsourceautodate | timestamp | Timestamp |  |  | isRedundant,nullable |
| 49 | groupTaskKey | 分组任务KEY | groupTaskKey | text | String |  |  | nullable,reportHide |
| 50 | ifilledsourceid | 补差单据子表id | ifilledsourceid | long | Long |  |  | nullable |
| 51 | materialOutsDefineCharacter | 自定义项特征属性组 | materialOutsDefineCharacter | UserDefine | st.materialout.MaterialOutsDefineCharacter |  |  | nullable |
| 52 | rowno | 序号 | rowno | int | Integer |  |  | isCode,nullable |
| 53 | sourceMainPubts | 时间戳 | sourceMainPubts | timestamp | Timestamp |  |  | nullable,reportHide |
| 54 | sourceid2 | 来源主表id | sourceid2 | long | Long |  |  | nullable |
| 55 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 56 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 57 | materialOutsCharacteristics | 自由项特征组 | materialOutsCharacteristics | FreeCT | st.materialout.MaterialOutsCharacteristics |  |  | nullable |
| 58 | establishedCardQty | 已建卡数量 | fEstablishedCardQty | number | Decimal |  |  | nullable |
| 59 | inventoryowner | 货主对象Id | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 60 | ownertype | 货权归属 | ownertype | int | Integer |  |  | nullable |
| 61 | productskuCp | 成品SKU的id | iProductSkuid_cp | quote | pc.product.ProductSKU |  |  | nullable |
| 62 | free1 | 规格1 | free1 | text | String |  |  | isGlobalization,nullable |
| 63 | free2 | 规格2 | free2 | text | String |  |  | isGlobalization,nullable |
| 64 | free3 | 规格3 | free3 | text | String |  |  | isGlobalization,nullable |
| 65 | free4 | 规格4 | free4 | text | String |  |  | isGlobalization,nullable |
| 66 | free5 | 规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 67 | free6 | 规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 68 | free7 | 规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 69 | free8 | 规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 70 | free9 | 规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 71 | free10 | 规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 72 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 73 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 74 | invaliddate | 失效日期 | dInvalidDate | date | Date |  |  | nullable |
| 75 | stockStatusDoc | 库存状态 | stockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 76 | natTaxUnitPrice | 本币含税单价 | natTaxUnitPrice | number | Decimal |  |  |  |
| 77 | natSum | 本币含税金额 | natSum | number | Decimal |  |  |  |
| 78 | natTax | 本币税额 | natTax | number | Decimal |  |  |  |
| 79 | oriUnitPrice | 原币无税单价 | oriUnitPrice | number | Decimal |  |  |  |
| 80 | oriTaxUnitPrice | 原币含税单价 | oriTaxUnitPrice | number | Decimal |  |  |  |
| 81 | oriMoney | 原币无税金额 | oriMoney | number | Decimal |  |  |  |
| 82 | oriSum | 原币含税金额 | oriSum | number | Decimal |  |  |  |
| 83 | oriTax | 原币税额 | oriTax | number | Decimal |  |  |  |
| 84 | taxRate | 税率 | taxRate | number | Decimal |  |  |  |
| 85 | qty | 主计量数量 | qty | number | Decimal |  |  | nullable |
| 86 | unit | 单位id | iUnitId | quote | pc.unit.Unit | Y |  |  |
| 87 | stockUnitId | 库存单位id | stock_unit_id | quote | pc.unit.Unit | Y |  |  |
| 88 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  | nullable |
| 89 | unitExchangeType | 库存单位转换率的换算方式 | unitExchangeType | int | Integer |  |  | nullable |
| 90 | subQty | 副计量数量 | subQty | number | Decimal |  |  | nullable |
| 91 | goodsposition | 货位 | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 92 | reserveid | 预留对象Id | reserveid | quote | st.reservation.Reservation |  |  | nullable |
| 93 | natUnitPrice | 成本单价 | natUnitPrice | number | Decimal |  |  |  |
| 94 | autoCalcCost | 自动计算成本 | autoCalcCost | switch | Boolean |  |  |  |
| 95 | natMoney | 成本金额 | natMoney | number | Decimal |  |  |  |
| 96 | productsku | 商品SKUid | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable |
| 97 | costUnitPrice | 成本单价 | cost_unit_price | number | Decimal |  |  |  |
| 98 | costMoney | 成本金额 | cost_money | number | Decimal |  |  |  |
| 99 | contactsQuantity | 往来数量 | contacts_quantity | number | Decimal |  |  |  |
| 100 | contactsPieces | 往来件数 | contacts_pieces | number | Decimal |  |  |  |
| 101 | isScrap | 是否废品 | isScrap | switch | Boolean |  |  | nullable |
| 102 | mainid | mainid | iMainId | quote | st.materialout.MaterialOut |  |  | nullable |
| 103 | project | 项目 | iProject | quote | bd.project.ProjectVO |  |  | dataPowerFlag,data_auth,nullable |
| 104 | memo | 备注 | cMemo | text | String |  |  | nullable |
| 105 | recorddate | 出库日期 | dRecordDate | date | Date |  |  | nullable |
| 106 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 107 | isUpdateCost | 是否更新存货成本 | isUpdateCost | switch | Boolean |  |  | nullable |
| 108 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 109 | propertyRightsTransferred | 已物权转移 | propertyRightsTransferred | switch | Boolean |  |  | nullable |
| 110 | source | 上游单据类型 | source | text | String |  |  | nullable,reportHide |
| 111 | upcode | 上游单据号 | upcode | text | String |  |  | nullable |
| 112 | firstsource | 来源订单类型 | firstsource | text | String |  |  | nullable |
| 113 | topsource | 源头单据类型 | top_source | text | String |  |  | nullable |
| 114 | firstupcode | 来源订单号 | firstupcode | text | String |  |  | nullable |
| 115 | topupcode | 源头单据号 | top_upcode | text | String |  |  | nullable |
| 116 | makeproduct | 制造部门材料使用的物料id | make_product | long | Long |  |  | nullable |
| 117 | orderproduct_makeproduct | 制造部门产成品使用的物料id | orderproduct_makeproduct | long | Long |  |  | nullable |
| 118 | fixedQuantity | 固定用量 | fixed_quantity | short | Short |  |  | isRedundant,nullable |
| 119 | recipientQuantity | 应领数量 | recipient_quantity | number | Decimal |  |  | isRedundant,nullable |
| 120 | receivedQuantity | 已领数量 | received_quantity | number | Decimal |  |  | isRedundant,nullable |
| 121 | substituteFlag | 替代标识 | substitute_flag | short | Short |  |  | nullable |
| 122 | supplyType | 生产制造材料的应用类型 | supplyType | text | String |  |  | nullable |
| 123 | verificationQty | 已核销数量 | verification_qty | number | Decimal |  |  | nullable |
| 124 | verificationSubQty | 已核销件数 | verification_subqty | number | Decimal |  |  | nullable |
| 125 | moCode | 来源订单号(不可使用) | mo_code | text | String |  |  | nullable |
| 126 | moautoLine | 来源订单行(不可使用) | mo_autoline | text | String |  |  | isRedundant,nullable |
| 127 | mograndsonLine | 来源订单材料行(不可使用) | mo_grandsonline | text | String |  |  | isRedundant,nullable |
| 128 | firstlineno | 来源订单物料子表行号 | firstlineno | text | String |  |  | nullable |
| 129 | firstgrandlineno | 来源订单物料孙表行号 | firstgrandlineno | text | String |  |  | nullable |
| 130 | sourceid | 上游单据主表id | sourceid | long | Long |  |  | nullable |
| 131 | sourceautoid | 上游单据子表id | sourceautoid | long | Long |  |  | nullable |
| 132 | makeRuleCode | 生单规则编号 | makerule_code | text | String |  |  | nullable,reportHide |
| 133 | sourceGrandchildrenId | 上游单据孙表id | source_grandchildrenId | long | Long |  |  | nullable |
| 134 | firstsourceid | 来源订单主表id | firstsourceid | long | Long |  |  | nullable |
| 135 | firstsourceautoid | 来源订单子表id | firstsourceautoid | long | Long |  |  | nullable |
| 136 | uplineno | 上游单据行号 | uplineno | number | Decimal |  |  | nullable |
| 137 | firstsourceGrandchildrenId | 来源订单孙表id | firstsource_grandchildrenId | long | Long |  |  | nullable |
| 138 | sourceOrderlineno | 来源订单行号 | sourceOrderlineno | number | Decimal |  |  | nullable |
| 139 | firstuplineno | 源头单据行号 | firstuplineno | number | Decimal |  |  | nullable |
| 140 | topsourceid | 源头单据主表id | top_sourceid | long | Long |  |  | nullable |
| 141 | topsourceautoid | 源头单据子表id | top_sourceautoid | long | Long |  |  | nullable |
| 142 | sourceautodate | 上游单据子表时间戳 | sourceautodate | timestamp | Timestamp |  |  | isRedundant,nullable |
| 143 | bodyItem | 材料出库单子表自定义项 | - | - | st.materialout.MaterialOutsCustomItem |  |  |  |
| 144 | bodyParallel | 材料出库单子表平行表 | - | - | st.materialout.MaterialOutsParallel |  |  |  |
| 145 | define1 | 自定义项1 | define1 | text | String |  |  | isGlobalization,nullable |
| 146 | define10 | 自定义项10 | define10 | text | String |  |  | isGlobalization,nullable |
| 147 | define11 | 自定义项11 | define11 | text | String |  |  | isGlobalization,nullable |
| 148 | define12 | 自定义项12 | define12 | text | String |  |  | isGlobalization,nullable |
| 149 | define13 | 自定义项13 | define13 | text | String |  |  | isGlobalization,nullable |
| 150 | define14 | 自定义项14 | define14 | text | String |  |  | isGlobalization,nullable |
| 151 | define15 | 自定义项15 | define15 | text | String |  |  | isGlobalization,nullable |
| 152 | define16 | 自定义项16 | define16 | text | String |  |  | isGlobalization,nullable |
| 153 | define17 | 自定义项17 | define17 | text | String |  |  | isGlobalization,nullable |
| 154 | define18 | 自定义项18 | define18 | text | String |  |  | isGlobalization,nullable |
| 155 | define19 | 自定义项19 | define19 | text | String |  |  | isGlobalization,nullable |
| 156 | define2 | 自定义项2 | define2 | text | String |  |  | isGlobalization,nullable |
| 157 | define20 | 自定义项20 | define20 | text | String |  |  | isGlobalization,nullable |
| 158 | define21 | 自定义项21 | define21 | text | String |  |  | isGlobalization,nullable |
| 159 | define22 | 自定义项22 | define22 | text | String |  |  | isGlobalization,nullable |
| 160 | define23 | 自定义项23 | define23 | text | String |  |  | isGlobalization,nullable |
| 161 | define24 | 自定义项24 | define24 | text | String |  |  | isGlobalization,nullable |
| 162 | define25 | 自定义项25 | define25 | text | String |  |  | isGlobalization,nullable |
| 163 | define26 | 自定义项26 | define26 | text | String |  |  | isGlobalization,nullable |
| 164 | define27 | 自定义项27 | define27 | text | String |  |  | isGlobalization,nullable |
| 165 | define28 | 自定义项28 | define28 | text | String |  |  | isGlobalization,nullable |
| 166 | define29 | 自定义项29 | define29 | text | String |  |  | isGlobalization,nullable |
| 167 | define3 | 自定义项3 | define3 | text | String |  |  | isGlobalization,nullable |
| 168 | define30 | 自定义项30 | define30 | text | String |  |  | isGlobalization,nullable |
| 169 | define4 | 自定义项4 | define4 | text | String |  |  | isGlobalization,nullable |
| 170 | define5 | 自定义项5 | define5 | text | String |  |  | isGlobalization,nullable |
| 171 | define6 | 自定义项6 | define6 | text | String |  |  | isGlobalization,nullable |
| 172 | define7 | 自定义项7 | define7 | text | String |  |  | isGlobalization,nullable |
| 173 | define8 | 自定义项8 | define8 | text | String |  |  | isGlobalization,nullable |
| 174 | define9 | 自定义项9 | define9 | text | String |  |  | isGlobalization,nullable |
| 175 | defines | 材料出库单子表自由自定义项 | - | - | st.materialout.MaterialOutsDefine |  |  |  |
| 176 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 177 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 178 | materOutsSNs | 材料出库单序列号 | - | - | st.materialout.MaterialOutsSN |  |  |  |
| 179 | settlementQty | 结算数量 | settlement_qty | number | Decimal |  |  | nullable |
| 180 | subWarehouse | 仓库 | sub_warehouse | quote | aa.warehouse.Warehouse |  |  | data_auth,nullable |
| 181 | writeOffQtyTotal | 累计冲销数量 | write_off_qty_total | number | Decimal |  |  | nullable |
| 182 | writeOffSourceautoid | 冲销线索子表id | write_off_sourceautoid | long | Long |  |  | nullable |
| 183 | writeOffSourceid | 冲销线索主表id | write_off_sourceid | long | Long |  |  | nullable |
| 184 | writeOffUpcode | 冲销单据号 | write_off_upcode | text | String |  |  | nullable |
| 185 | writeOffUplineno | 冲销单据行号 | write_off_uplineno | number | Decimal |  |  | nullable |

---

## Reference Fields (22)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | expenseItems | 费用项目 | expenseItems | bd.expenseitem.ExpenseItem |
| 2 | productAuth | 物料权限 | iProductid | pb.dataauth.ProductDataAuth |
| 3 | product | 物料id | iProductid | pc.aa.Product |
| 4 | productCp | 制造产品id | iProductid_cp | pc.product.Product |
| 5 | productn | 物料 | iProductid | pc.product.Product |
| 6 | productskun | 默认SKUID | iProductSkuid | pc.product.ProductSKU |
| 7 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 8 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 9 | stockType | 库存类型 | stockType | st.stocktype.StockType |
| 10 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 11 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 12 | inventoryowner | 货主对象Id | inventoryowner | st.inventoryowner.InventoryOwner |
| 13 | productskuCp | 成品SKU的id | iProductSkuid_cp | pc.product.ProductSKU |
| 14 | stockStatusDoc | 库存状态 | stockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 15 | unit | 单位id | iUnitId | pc.unit.Unit |
| 16 | stockUnitId | 库存单位id | stock_unit_id | pc.unit.Unit |
| 17 | goodsposition | 货位 | iGoodsPositionId | aa.goodsposition.GoodsPosition |
| 18 | reserveid | 预留对象Id | reserveid | st.reservation.Reservation |
| 19 | productsku | 商品SKUid | iProductSkuid | pc.aa.ProductSKU |
| 20 | mainid | mainid | iMainId | st.materialout.MaterialOut |
| 21 | project | 项目 | iProject | bd.project.ProjectVO |
| 22 | subWarehouse | 仓库 | sub_warehouse | aa.warehouse.Warehouse |

---

## Number Fields (53)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | budgetMoney | 预算金额 | budgetMoney | number |
| 2 | budgetUnitPrice | 预算单价 | budgetUnitPrice | number |
| 3 | materialReqType | 领料类型 | material_req_type | int |
| 4 | matlSourceLineno | 来源材料出库行号 | matl_source_lineno | number |
| 5 | retQty | 已退库数量 | ret_qty | number |
| 6 | retSubQty | 已退库件数 | ret_sub_qty | number |
| 7 | matlRetCount | 退料单数 | matl_ret_count | int |
| 8 | mtoSalesOrderLineNo | MTO销售订单行号 | mtoSalesOrderLineNo | number |
| 9 | fixedAssetQty | 已转固数量 | fixed_asset_qty | number |
| 10 | fixedAsset | 转固 | fixed_asset | int |
| 11 | allTotalInternalNatMoney | 累计内部结算金额本币 | fAllTotalInternalNatMoney | number |
| 12 | allTotalInternalOriMoney | 累计内部结算金额原币 | fAllTotalInternalOriMoney | number |
| 13 | allTotalInternalQty | 累计待内部结算数量 | fAllTotalInternalQty | number |
| 14 | allTotalInternalUnit | 累计内部结算数量主计量 | fAllTotalInternalUnit | number |
| 15 | balance_qty | 已补差数量 | balance_qty | number |
| 16 | balance_subQty | 已补差件数 | balance_subQty | number |
| 17 | rowno | 序号 | rowno | int |
| 18 | lineno | 行号 | lineno | number |
| 19 | establishedCardQty | 已建卡数量 | fEstablishedCardQty | number |
| 20 | ownertype | 货权归属 | ownertype | int |
| 21 | natTaxUnitPrice | 本币含税单价 | natTaxUnitPrice | number |
| 22 | natSum | 本币含税金额 | natSum | number |
| 23 | natTax | 本币税额 | natTax | number |
| 24 | oriUnitPrice | 原币无税单价 | oriUnitPrice | number |
| 25 | oriTaxUnitPrice | 原币含税单价 | oriTaxUnitPrice | number |
| 26 | oriMoney | 原币无税金额 | oriMoney | number |
| 27 | oriSum | 原币含税金额 | oriSum | number |
| 28 | oriTax | 原币税额 | oriTax | number |
| 29 | taxRate | 税率 | taxRate | number |
| 30 | qty | 主计量数量 | qty | number |
| 31 | invExchRate | 换算率 | invExchRate | number |
| 32 | unitExchangeType | 库存单位转换率的换算方式 | unitExchangeType | int |
| 33 | subQty | 副计量数量 | subQty | number |
| 34 | natUnitPrice | 成本单价 | natUnitPrice | number |
| 35 | natMoney | 成本金额 | natMoney | number |
| 36 | costUnitPrice | 成本单价 | cost_unit_price | number |
| 37 | costMoney | 成本金额 | cost_money | number |
| 38 | contactsQuantity | 往来数量 | contacts_quantity | number |
| 39 | contactsPieces | 往来件数 | contacts_pieces | number |
| 40 | fixedQuantity | 固定用量 | fixed_quantity | short |
| 41 | recipientQuantity | 应领数量 | recipient_quantity | number |
| 42 | receivedQuantity | 已领数量 | received_quantity | number |
| 43 | substituteFlag | 替代标识 | substitute_flag | short |
| 44 | verificationQty | 已核销数量 | verification_qty | number |
| 45 | verificationSubQty | 已核销件数 | verification_subqty | number |
| 46 | uplineno | 上游单据行号 | uplineno | number |
| 47 | sourceOrderlineno | 来源订单行号 | sourceOrderlineno | number |
| 48 | firstuplineno | 源头单据行号 | firstuplineno | number |
| 49 | invExchRateDen | 换算率分母 | invexchrateden | number |
| 50 | invExchRateNum | 换算率分子 | invexchratenum | number |
| 51 | settlementQty | 结算数量 | settlement_qty | number |
| 52 | writeOffQtyTotal | 累计冲销数量 | write_off_qty_total | number |
| 53 | writeOffUplineno | 冲销单据行号 | write_off_uplineno | number |

---

## Date Fields (3)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | producedate | 生产日期 | dProduceDate | date |
| 2 | invaliddate | 失效日期 | dInvalidDate | date |
| 3 | recorddate | 出库日期 | dRecordDate | date |

---

## Child Tables (4)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | bodyItem | 材料出库单子表自定义项 | st.materialout.MaterialOutsCustomItem |
| 2 | materOutsSNs | 材料出库单序列号 | st.materialout.MaterialOutsSN |
| 3 | bodyParallel | 材料出库单子表平行表 | st.materialout.MaterialOutsParallel |
| 4 | defines | 材料出库单子表自由自定义项 | st.materialout.MaterialOutsDefine |
