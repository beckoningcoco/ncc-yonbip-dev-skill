---
tags: [BIP, metadata, st, MorphologyConversionDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 形态转换单明细表 (st.morphologyConversion.MorphologyConversionDetail)

> Platform: BIP V5 | Module: st | Table: st_morphologyconversion_detail | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 形态转换单明细表 |
| uri | st.morphologyConversion.MorphologyConversionDetail |
| tableName | st_morphologyconversion_detail |
| domain | ustock |
| schema | `ustock` |
| applicationCode | ST |
| superUri | voucher.base.VouchLine |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (23)

| # | Name | URI |
|---|------|-----|
| 1 | 换算比 (IUOMExchRate) | gscm.itf.IUOMExchRate |
| 2 | 商品相关 (IProduct) | st.voucher.IProduct |
| 3 | 商品sku相关 (IProductSku) | st.voucher.IProductSku |
| 4 | 批次相关 (IBatch) | scmbd.voucher.IBatch |
| 5 | 效期相关 (IExp) | scmbd.voucher.IExp |
| 6 | 计量单位信息 (IUOMInfo) | voucher.base.IUOMInfo |
| 7 | 是否 (IUnitExchangeType) | pub.uom.IUnitExchangeType |
| 8 | 本币金额信息 (INatMoneyInfo) | voucher.base.INatMoneyInfo |
| 9 | 规格 (FreeItem) | base.itf.FreeItem |
| 10 | 库存状态接口 (IStockStatus) | st.stockStatusRecord.IStockStatus |
| 11 | 后端自动行号接口 (ILineNo) | base.itf.ILineNo |
| 12 | 上游单据行号 (IUpLinenNO) | st.uplineno.IUpLinenNO |
| 13 | 源头单据行号 (FirstupLinenNO) | st.uplineno.FirstupLinenNO |
| 14 | 来源单据信息 (ISourceData) | st.voucher.ISourceData |
| 15 | 源头单据信息 (IFirstSourceData) | st.voucher.IFirstSourceData |
| 16 | 生单回写 (IBackWrite) | base.itf.IBackWrite |
| 17 | 租户相关 (ITenant) | base.itf.ITenant |
| 18 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 19 | 库存类型对象 (IStockType) | st.stocktype.IStockType |
| 20 | 预留对象相关 (IReservationID) | st.reservation.IReservationID |
| 21 | 项目结构属性 (projectStructureProperties) | BGDM.wbs.projectStructureProperties |
| 22 | 货权归属 (IOwnerType) | st.inventoryowner.IOwnerType |
| 23 | 货主对象 (IInventoryOwner) | st.inventoryowner.IInventoryOwner |

---

## All Fields (120)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | alternateId | 替代料Id | alternate_id | quote | ed.bom.BomAlternate |  |  | nullable |
| 2 | firstuplineno | 源头单据行号 | firstuplineno | number | Decimal |  |  | nullable |
| 3 | groupTaskKey | 分组任务KEY | groupTaskKey | text | String |  |  | nullable,reportHide |
| 4 | makeRuleCode | 生单规则编号 | makerule_code | text | String |  |  | nullable,reportHide |
| 5 | morphologyConversionDetailCharacteristics | 自由项特征组 | morphologyConversionDetailCharacteristics | FreeCT | st.morphologyConversion.MorphologyConversionDetailCharacteristics |  |  | nullable |
| 6 | morphologyConversionDetailDefineCharacter | 自定义项特征属性组 | morphologyConversionDetailDefineCharacter | UserDefine | st.morphologyConversion.MorphologyConversionDetailDefineCharacter |  |  | nullable |
| 7 | natSum | 本币含税金额 | natSum | number | Decimal |  |  |  |
| 8 | reserveid | 预留对象 | reserveid | quote | st.reservation.Reservation |  |  | nullable |
| 9 | writeOffQtyTotal | 累计冲销数量 | write_off_qty_total | number | Decimal |  |  | nullable |
| 10 | writeOffUpcode | 冲销单据号 | write_off_upcode | text | String |  |  | nullable |
| 11 | writeOffSourceid | 冲销线索主表id | write_off_sourceid | long | Long |  |  | nullable |
| 12 | writeOffSourceautoid | 冲销线索子表id | write_off_sourceautoid | long | Long |  |  | nullable |
| 13 | writeOffUplineno | 冲销单据行号 | write_off_uplineno | number | Decimal |  |  | nullable |
| 14 | productn | 物料 | iProductid | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable |
| 15 | productAuth | 物料权限 | iProductid | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 16 | productskun | 默认SKUID | iProductSkuid | quote | pc.product.ProductSKU |  |  | nullable |
| 17 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 18 | stockType | 库存类型 | stockType | quote | st.stocktype.StockType |  |  | nullable |
| 19 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 20 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 21 | ownertype | 货权归属 | ownertype | int | Integer |  |  | nullable |
| 22 | inventoryowner | 货主对象Id | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 23 | rowno | 序号 | rowno | int | Integer |  |  | isCode,nullable |
| 24 | sourceMainPubts | 时间戳 | sourceMainPubts | timestamp | Timestamp |  |  | nullable,reportHide |
| 25 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 26 | unitExchangeTypePrice | 计价单位转换率的换算方式 | unitExchangeTypePrice | int | Integer |  |  |  |
| 27 | uplineno | 上游单据行号 | uplineno | number | Decimal |  |  | nullable |
| 28 | groupNumber | 组号 | group_number | int | Integer |  |  | nullable |
| 29 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 30 | lineType | 行类型 | line_type | - | st.morphologyConversion.LineType |  |  | nullable |
| 31 | warehouse | 仓库id | warehouse | quote | aa.warehouse.Warehouse |  |  | dataPowerFlag,data_auth,nullable |
| 32 | qty | 数量 | qty | number | Decimal |  |  | nullable |
| 33 | bomSelect | BOM选择 | bom_select | text | String |  |  | nullable |
| 34 | bomId | bomId | bom_id | quote | ed.bom.Bom |  |  | nullable |
| 35 | fixedQuantity | 固定用量 | fixed_quantity | switch | Boolean |  |  | nullable |
| 36 | numeratorQuantity | 分子用量 | numerator_quantity | number | Decimal |  |  | nullable |
| 37 | denominatorQuantity | 分母用量 | denominator_quantity | number | Decimal |  |  | nullable |
| 38 | scrap | 损耗率% | scrap | number | Decimal |  |  | nullable |
| 39 | unitUseQuantity | 单位使用数量 | unit_use_quantity | number | Decimal |  |  | nullable |
| 40 | proratadistribution | 分摊权重 | proratadistribution | number | Decimal |  |  | nullable |
| 41 | bomMaterialId | 材料id | bom_material_id | long | Long |  |  | nullable |
| 42 | noTaxCostPrice | 参考成本价 | noTaxCostPrice | number | Decimal |  |  | nullable |
| 43 | truncUp | 向上取整 | truncUp | int | Integer |  |  | nullable |
| 44 | sourceid | 来源单据id | sourceid | long | Long |  |  | nullable |
| 45 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
| 46 | stockStatusDoc | 库存状态id | stockStatusDoc | quote | st.stockStatusRecord.stockStatusRecord |  |  | nullable |
| 47 | lineSort | 排序行 | lineSort | int | Integer |  |  | nullable |
| 48 | morphologyConversionId | 形态转换主表ID | morphologyconversion_id | quote | st.morphologyConversion.MorphologyConversion |  |  | nullable |
| 49 | goodsposition | 货位 | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 50 | isCostScrap | 是否取成本比例 | isCostScrap | text | String |  |  | nullable |
| 51 | warehousePersonId | 库管员id | warehouse_person_id | quote | bd.staff.Staff |  |  | dataPowerFlag,data_auth,nullable |
| 52 | free1 | 颜色 | free1 | text | String |  |  | isGlobalization,nullable |
| 53 | free2 | 测试3 | free2 | text | String |  |  | isGlobalization,nullable |
| 54 | free3 | 定量测试 | free3 | text | String |  |  | isGlobalization,nullable |
| 55 | free4 | 香雪产地 | free4 | text | String |  |  | isGlobalization,nullable |
| 56 | free5 | 物料规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 57 | free6 | 物料规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 58 | free7 | 物料规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 59 | free8 | 物料规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 60 | free9 | 物料规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 61 | free10 | 物料规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 62 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 63 | invaliddate | 失效日期 | dInvalidDate | date | Date |  |  | nullable |
| 64 | product | 物料id | iProductid | quote | pc.aa.Product |  |  | data_auth,nullable,dataPowerFlag |
| 65 | mainUnitId | 主计量id | main_unit_id | quote | pc.unit.Unit |  |  | nullable |
| 66 | invExchRate | 换算率 | invExchRate | number | Decimal |  |  | nullable |
| 67 | subQty | 件数 | subQty | number | Decimal |  |  | nullable |
| 68 | stockUnitId | 库存单位id | stock_unit_id | quote | pc.unit.Unit |  |  | nullable |
| 69 | natUnitPrice | 单价 | natUnitPrice | number | Decimal |  |  |  |
| 70 | natTaxUnitPrice | 本币含税单价 | natTaxUnitPrice | number | Decimal |  |  |  |
| 71 | natMoney | 本币含税金额 | natMoney | number | Decimal |  |  |  |
| 72 | natTax | 本币税额 | natTax | number | Decimal |  |  |  |
| 73 | unitExchangeType | 换算方式 | unitExchangeType | int | Integer |  |  |  |
| 74 | projectId | 项目id | project_id | quote | bd.project.ProjectVO |  |  | dataPowerFlag,data_auth,nullable |
| 75 | remark | 备注 | remark | text | String |  |  | nullable |
| 76 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 77 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 78 | sourceautoid | 来源单据行id | sourceautoid | long | Long |  |  | nullable |
| 79 | source | 来源单据类型 | source | text | String |  |  | nullable,reportHide |
| 80 | productsku | 物料SKUid | iProductSkuid | quote | pc.aa.ProductSKU |  |  | nullable |
| 81 | upcode | 来源单据号 | upcode | text | String |  |  | nullable |
| 82 | firstsourceid | 源头单据id | firstsourceid | long | Long |  |  | nullable |
| 83 | firstsourceautoid | 源头单据行id | firstsourceautoid | long | Long |  |  | nullable |
| 84 | firstsource | 源头单据类型 | firstsource | text | String |  |  | nullable |
| 85 | firstupcode | 源头单据号 | firstupcode | text | String |  |  | nullable |
| 86 | bodyItem | 形态转换单子表自定义项 | - | - | st.morphologyConversion.MorphologyConversionDetailCustomItem |  |  |  |
| 87 | define1 | 自定义项1 | define1 | text | String |  |  | isGlobalization,nullable |
| 88 | define10 | 自定义项10 | define10 | text | String |  |  | isGlobalization,nullable |
| 89 | define11 | 自定义项11 | define11 | text | String |  |  | isGlobalization,nullable |
| 90 | define12 | 自定义项12 | define12 | text | String |  |  | isGlobalization,nullable |
| 91 | define13 | 自定义项13 | define13 | text | String |  |  | isGlobalization,nullable |
| 92 | define14 | 自定义项14 | define14 | text | String |  |  | isGlobalization,nullable |
| 93 | define15 | 自定义项15 | define15 | text | String |  |  | isGlobalization,nullable |
| 94 | define16 | 自定义项16 | define16 | text | String |  |  | isGlobalization,nullable |
| 95 | define17 | 自定义项17 | define17 | text | String |  |  | isGlobalization,nullable |
| 96 | define18 | 自定义项18 | define18 | text | String |  |  | isGlobalization,nullable |
| 97 | define19 | 自定义项19 | define19 | text | String |  |  | isGlobalization,nullable |
| 98 | define2 | 自定义项2 | define2 | text | String |  |  | isGlobalization,nullable |
| 99 | define20 | 自定义项20 | define20 | text | String |  |  | isGlobalization,nullable |
| 100 | define21 | 自定义项21 | define21 | text | String |  |  | isGlobalization,nullable |
| 101 | define22 | 自定义项22 | define22 | text | String |  |  | isGlobalization,nullable |
| 102 | define23 | 自定义项23 | define23 | text | String |  |  | isGlobalization,nullable |
| 103 | define24 | 自定义项24 | define24 | text | String |  |  | isGlobalization,nullable |
| 104 | define25 | 自定义项25 | define25 | text | String |  |  | isGlobalization,nullable |
| 105 | define26 | 自定义项26 | define26 | text | String |  |  | isGlobalization,nullable |
| 106 | define27 | 自定义项27 | define27 | text | String |  |  | isGlobalization,nullable |
| 107 | define28 | 自定义项28 | define28 | text | String |  |  | isGlobalization,nullable |
| 108 | define29 | 自定义项29 | define29 | text | String |  |  | isGlobalization,nullable |
| 109 | define3 | 自定义项3 | define3 | text | String |  |  | isGlobalization,nullable |
| 110 | define30 | 自定义项30 | define30 | text | String |  |  | isGlobalization,nullable |
| 111 | define4 | 自定义项4 | define4 | text | String |  |  | isGlobalization,nullable |
| 112 | define5 | 自定义项5 | define5 | text | String |  |  | isGlobalization,nullable |
| 113 | define6 | 自定义项6 | define6 | text | String |  |  | isGlobalization,nullable |
| 114 | define7 | 自定义项7 | define7 | text | String |  |  | isGlobalization,nullable |
| 115 | define8 | 自定义项8 | define8 | text | String |  |  | isGlobalization,nullable |
| 116 | define9 | 自定义项9 | define9 | text | String |  |  | isGlobalization,nullable |
| 117 | defines | 形态转换单子表自由自定义项 | - | - | st.morphologyConversion.MorphologyConversionDetailDefine |  |  |  |
| 118 | invExchRateDen | 换算率分母 | invexchrateden | number | Decimal |  |  | nullable |
| 119 | invExchRateNum | 换算率分子 | invexchratenum | number | Decimal |  |  | nullable |
| 120 | morphologyconversionsn | 形态转换单序列号 | - | - | st.morphologyConversion.MorphologyConversionSN |  |  |  |

---

## Reference Fields (22)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | alternateId | 替代料Id | alternate_id | ed.bom.BomAlternate |
| 2 | reserveid | 预留对象 | reserveid | st.reservation.Reservation |
| 3 | productn | 物料 | iProductid | pc.product.Product |
| 4 | productAuth | 物料权限 | iProductid | pb.dataauth.ProductDataAuth |
| 5 | productskun | 默认SKUID | iProductSkuid | pc.product.ProductSKU |
| 6 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 7 | stockType | 库存类型 | stockType | st.stocktype.StockType |
| 8 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 9 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 10 | inventoryowner | 货主对象Id | inventoryowner | st.inventoryowner.InventoryOwner |
| 11 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 12 | warehouse | 仓库id | warehouse | aa.warehouse.Warehouse |
| 13 | bomId | bomId | bom_id | ed.bom.Bom |
| 14 | stockStatusDoc | 库存状态id | stockStatusDoc | st.stockStatusRecord.stockStatusRecord |
| 15 | morphologyConversionId | 形态转换主表ID | morphologyconversion_id | st.morphologyConversion.MorphologyConversion |
| 16 | goodsposition | 货位 | iGoodsPositionId | aa.goodsposition.GoodsPosition |
| 17 | warehousePersonId | 库管员id | warehouse_person_id | bd.staff.Staff |
| 18 | product | 物料id | iProductid | pc.aa.Product |
| 19 | mainUnitId | 主计量id | main_unit_id | pc.unit.Unit |
| 20 | stockUnitId | 库存单位id | stock_unit_id | pc.unit.Unit |
| 21 | projectId | 项目id | project_id | bd.project.ProjectVO |
| 22 | productsku | 物料SKUid | iProductSkuid | pc.aa.ProductSKU |

---

## Number Fields (28)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | firstuplineno | 源头单据行号 | firstuplineno | number |
| 2 | natSum | 本币含税金额 | natSum | number |
| 3 | writeOffQtyTotal | 累计冲销数量 | write_off_qty_total | number |
| 4 | writeOffUplineno | 冲销单据行号 | write_off_uplineno | number |
| 5 | ownertype | 货权归属 | ownertype | int |
| 6 | rowno | 序号 | rowno | int |
| 7 | unitExchangeTypePrice | 计价单位转换率的换算方式 | unitExchangeTypePrice | int |
| 8 | uplineno | 上游单据行号 | uplineno | number |
| 9 | groupNumber | 组号 | group_number | int |
| 10 | lineno | 行号 | lineno | number |
| 11 | qty | 数量 | qty | number |
| 12 | numeratorQuantity | 分子用量 | numerator_quantity | number |
| 13 | denominatorQuantity | 分母用量 | denominator_quantity | number |
| 14 | scrap | 损耗率% | scrap | number |
| 15 | unitUseQuantity | 单位使用数量 | unit_use_quantity | number |
| 16 | proratadistribution | 分摊权重 | proratadistribution | number |
| 17 | noTaxCostPrice | 参考成本价 | noTaxCostPrice | number |
| 18 | truncUp | 向上取整 | truncUp | int |
| 19 | lineSort | 排序行 | lineSort | int |
| 20 | invExchRate | 换算率 | invExchRate | number |
| 21 | subQty | 件数 | subQty | number |
| 22 | natUnitPrice | 单价 | natUnitPrice | number |
| 23 | natTaxUnitPrice | 本币含税单价 | natTaxUnitPrice | number |
| 24 | natMoney | 本币含税金额 | natMoney | number |
| 25 | natTax | 本币税额 | natTax | number |
| 26 | unitExchangeType | 换算方式 | unitExchangeType | int |
| 27 | invExchRateDen | 换算率分母 | invexchrateden | number |
| 28 | invExchRateNum | 换算率分子 | invexchratenum | number |

---

## Date Fields (2)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | producedate | 生产日期 | dProduceDate | date |
| 2 | invaliddate | 失效日期 | dInvalidDate | date |

---

## Child Tables (3)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | morphologyconversionsn | 形态转换单序列号 | st.morphologyConversion.MorphologyConversionSN |
| 2 | bodyItem | 形态转换单子表自定义项 | st.morphologyConversion.MorphologyConversionDetailCustomItem |
| 3 | defines | 形态转换单子表自由自定义项 | st.morphologyConversion.MorphologyConversionDetailDefine |
