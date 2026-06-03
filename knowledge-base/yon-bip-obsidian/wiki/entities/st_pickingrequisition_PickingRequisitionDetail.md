---
tags: [BIP, metadata, st, PickingRequisitionDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [metadata-api]
platform_version: BIP V5
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 出库申请单详情 (st.pickingrequisition.PickingRequisitionDetail)

> Platform: BIP V5 | Module: st | Table: po_picking_requisition_detail | Schema: ustock

## Basic Info

| Property | Value |
|----------|-------|
| displayName | 出库申请单详情 |
| uri | st.pickingrequisition.PickingRequisitionDetail |
| tableName | po_picking_requisition_detail |
| domain | ustock |
| applicationCode | ST |
| superUri | voucher.base.VouchLine |
| isBusinessObject | true |

## Key
| Role | Column |
|------|--------|
| key | id |

## Suppliers (17)

| # | Name | URI |
|---|------|-----|
| 1 | 货主对象 (IInventoryOwner) | st.inventoryowner.IInventoryOwner |
| 2 | 货权归属 (IOwnerType) | st.inventoryowner.IOwnerType |
| 3 | 规格 (FreeItem) | base.itf.FreeItem |
| 4 | 行关闭信息 (ILineClosing) | base.itf.ILineClosing |
| 5 | 生单回写 (IBackWrite) | base.itf.IBackWrite |
| 6 | 预留对象相关 (IReservationID) | st.reservation.IReservationID |
| 7 | 货位相关 (IGoodsPosition) | st.voucher.IGoodsPosition |
| 8 | 后端自动行号接口 (ILineNo) | base.itf.ILineNo |
| 9 | 上游单据行号 (IUpLinenNO) | st.uplineno.IUpLinenNO |
| 10 | 源头单据行号 (FirstupLinenNO) | st.uplineno.FirstupLinenNO |
| 11 | 来源订单行号 (SourceOrderLinenNO) | st.uplineno.SourceOrderLinenNO |
| 12 | 批次相关 (IBatch) | scmbd.voucher.IBatch |
| 13 | 效期相关 (IExp) | scmbd.voucher.IExp |
| 14 | 租户相关 (ITenant) | base.itf.ITenant |
| 15 | 特征适配相关信息 (CharacterInfo) | gscm.itf.CharacterInfo |
| 16 | 统一租户接口(扩展) (IYTenantExt) | ucfbase.ucfbaseItf.IYTenantExt |
| 17 | 项目结构属性 (projectStructureProperties) | BGDM.wbs.projectStructureProperties |

---

## All Fields (120)

| # | name | displayName | columnName | biztype | typeUri | required | partition | terms |
|---|------|-------------|------------|---------|---------|----------|-----------|-------|
| 1 | stockSensClue | 现存量特征敏感线索 | stockSensClue | text | String |  |  | nullable |
| 2 | groupTaskKey | 分组任务KEY | groupTaskKey | text | String |  |  | nullable,reportHide |
| 3 | linecloseTime | 行关闭时间 | lineclose_time | timestamp | Timestamp |  |  | nullable,reportHide |
| 4 | linecloser | 行关闭人 | linecloser | text | String |  |  | isGlobalization,nullable |
| 5 | orderProductId | 生产订单产品id | order_product_id | quote | po.order.OrderProduct |  |  | nullable |
| 6 | productAuth | 物料权限 | product_id | quote | pb.dataauth.ProductDataAuth |  |  | nullable |
| 7 | pubts | 时间戳 | pubts | timestamp | Timestamp |  |  | isSyncKey,nullable |
| 8 | skuId | skuId | sku_id | quote | pc.aa.ProductSKU |  |  | nullable |
| 9 | changeRateNum | 换算率分子 | change_ratenum | number | Decimal |  |  | nullable |
| 10 | changeRateDen | 换算率分母 | change_rateden | number | Decimal |  |  | nullable |
| 11 | materialReqType | 领料类型 | material_req_type | int | Integer |  |  | nullable |
| 12 | inventoryowner | 货主对象Id | inventoryowner | quote | st.inventoryowner.InventoryOwner |  |  | nullable |
| 13 | ownertype | 货权归属 | ownertype | int | Integer |  |  | nullable |
| 14 | cfmStockQuantity | 累计确认出库数量 | cfm_stock_quantity | number | Decimal |  |  | nullable |
| 15 | cfmAuxiliaryStockQuantity | 累计确认出库件数 | cfm_auxiliary_stock_quantity | number | Decimal |  |  | nullable |
| 16 | isLineClose | 是否行关闭 | is_line_close | switch | Boolean |  |  | nullable |
| 17 | collaborationType | 材料协同方式 | collaboration_type | short | Short |  |  | nullable |
| 18 | wbs | WBS | wbs | quote | BGDM.wbs.wbs_doc |  |  | nullable |
| 19 | activity | 活动 | activity | quote | pgrm.projecttask.ProjectScheduleTask |  |  | nullable |
| 20 | productId | 物料Id | product_id | quote | pc.aa.Product |  |  | dataPowerFlag,data_auth,nullable |
| 21 | isWip | 在制品 | is_wip | switch | Boolean |  |  | nullable |
| 22 | reserveid | 跟踪线索Id1 | reserveid | quote | st.reservation.Reservation |  |  | nullable |
| 23 | productskun | 默认SKUID | sku_id | quote | pc.product.ProductSKU |  |  | nullable |
| 24 | firstsourceid | 源头单据主表id | firstsourceid | long | Long |  |  | nullable |
| 25 | ytenant | 租户id | ytenant_id | quote | yht.tenant.YhtTenant |  | Y | notGenerate,nullable,uiHide |
| 26 | productn | 物料Id | product_id | quote | pc.product.Product |  |  | dataPowerFlag,data_auth,nullable |
| 27 | requisitionDetailDefineCharacter | 自定义项特征属性组 | requisitionDetailDefineCharacter | UserDefine | st.pickingrequisition.RequisitionDetailDefineCharacter |  |  | nullable |
| 28 | sourceMainPubts | 时间戳 | sourceMainPubts | timestamp | Timestamp |  |  | nullable,reportHide |
| 29 | sourceautodate | 上游单据子表时间戳 | sourceautodate | date | Date |  |  | nullable |
| 30 | tenant | 租户 | tenant_id | quote | base.tenant.Tenant | Y | Y | nullable,TENANTID |
| 31 | id | ID | id | long | Long |  |  | nullable,REF.ID |
| 32 | lineno | 行号 | lineno | number | Decimal |  |  | nullable |
| 33 | requisitionId | 单据id | requisition_id | quote | st.pickingrequisition.PickingRequisition |  |  | nullable |
| 34 | materialId | 制造物料id | material_id | long | Long |  |  | nullable |
| 35 | requisitionDetailCharacteristics | 自由项特征组 | requisitionDetailCharacteristics | FreeCT | st.pickingrequisition.RequisitionDetailCharacteristics |  |  | nullable |
| 36 | stockUnitId | 库存单位ID | stock_unit_id | quote | pc.unit.Unit |  |  | nullable |
| 37 | changeRate | 换算率 | change_rate | number | Decimal |  |  | nullable |
| 38 | changeType | 换算方式 | change_type | - | st.pickingrequisition.ChangeType |  |  | nullable |
| 39 | quantity | 数量 | quantity | number | Decimal |  |  | nullable |
| 40 | auxiliaryQuantity | 件数 | auxiliary_quantity | number | Decimal |  |  | nullable |
| 41 | requirementDate | 需求日期 | requirement_date | date | Date |  |  | nullable |
| 42 | returnDate | 预计归还日期 | return_date | date | Date |  |  | nullable |
| 43 | orgId | 库存组织id | org_id | quote | aa.baseorg.InventoryOrgMV |  |  | nullable |
| 44 | warehouseId | 出库仓库id | warehouse_id | quote | aa.warehouse.Warehouse |  |  | data_auth,nullable |
| 45 | batchNo | 批次号 | batch_number | text | String |  |  | isRedundant,nullable |
| 46 | makeRuleCode | 生单规则编号 | makerule_code | text | String |  |  | nullable,reportHide |
| 47 | firstsource | 源头单据类型 | first_source | text | String |  |  | nullable |
| 48 | producedate | 生产日期 | dProduceDate | date | Date |  |  | nullable |
| 49 | firstupcode | 源头单据号 | first_upcode | text | String |  |  | nullable |
| 50 | invaliddate | 有效期至 | dInvalidDate | date | Date |  |  | nullable |
| 51 | firstsourceautoid | 源头单据子表id | first_source_autoid | long | Long |  |  | nullable |
| 52 | sourceType | 来源单据类型 | source_type | text | String |  |  | nullable |
| 53 | source | 来源单据类型(推拉单) | source | text | String |  |  | nullable,reportHide |
| 54 | sourceid | 来源单据主表id | sourceid | long | Long |  |  | nullable |
| 55 | upcode | 来源单据号 | upcode | text | String |  |  | nullable |
| 56 | sourceautoid | 来源单据子表id | sourceautoid | long | Long |  |  | nullable |
| 57 | projectId | 项目Id | project_id | quote | bd.project.ProjectVO |  |  | data_auth,nullable |
| 58 | trackNumber | 跟踪号 | track_number | text | String |  |  | nullable |
| 59 | uplineno | 来源单据行号 | uplineno | number | Decimal |  |  | nullable |
| 60 | sourceOrderlineno | 来源订单行号 | sourceOrderlineno | number | Decimal |  |  | nullable |
| 61 | stockQuantity | 已出库数量 | stock_quantity | number | Decimal |  |  | nullable |
| 62 | auxiliaryStockQuantity | 已出库件数 | auxiliary_stock_quantity | number | Decimal |  |  | nullable |
| 63 | firstuplineno | 源头单据行号 | firstuplineno | number | Decimal |  |  | nullable |
| 64 | orderMaterialId | 生产订单材料id | order_material_id | quote | po.order.OrderMaterial |  |  | nullable |
| 65 | remark | 备注 | remark | text | String |  |  | nullable |
| 66 | free1 | 物料规格1 | free1 | text | String |  |  | isGlobalization,nullable |
| 67 | free2 | 物料规格2 | free2 | text | String |  |  | isGlobalization,nullable |
| 68 | free3 | 物料规格3 | free3 | text | String |  |  | isGlobalization,nullable |
| 69 | free4 | 物料规格4 | free4 | text | String |  |  | isGlobalization,nullable |
| 70 | free5 | 物料规格5 | free5 | text | String |  |  | isGlobalization,nullable |
| 71 | free6 | 物料规格6 | free6 | text | String |  |  | isGlobalization,nullable |
| 72 | free7 | 物料规格7 | free7 | text | String |  |  | isGlobalization,nullable |
| 73 | free8 | 物料规格8 | free8 | text | String |  |  | isGlobalization,nullable |
| 74 | free9 | 物料规格9 | free9 | text | String |  |  | isGlobalization,nullable |
| 75 | free10 | 物料规格10 | free10 | text | String |  |  | isGlobalization,nullable |
| 76 | changeStockQuantity | 已调拨数量 | change_stock_quantity | number | Decimal |  |  | nullable |
| 77 | changeAuxiliaryStockQuantity | 已调拨件数 | change_auxiliary_stock_quantity | number | Decimal |  |  | nullable |
| 78 | sourceGrandchildrenId | 上游单据孙表id | source_grandchildren_id | long | Long |  |  | nullable |
| 79 | sourceOrderProductRowno | 源订单子表行号 | source_order_product_rowno | number | Decimal |  |  | nullable |
| 80 | rowno | 序号 | rowno | int | Integer |  |  | isCode,nullable |
| 81 | goodsposition | 货位id | iGoodsPositionId | quote | aa.goodsposition.GoodsPosition |  |  | nullable |
| 82 | budgetUnitPrice | 预算单价 | budgetUnitPrice | number | Decimal |  |  | nullable |
| 83 | budgetMoney | 预算金额 | budgetMoney | number | Decimal |  |  | nullable |
| 84 | expenseItems | 费用项目id | expenseItems | quote | bd.expenseitem.ExpenseItem |  |  | nullable |
| 85 | isExcess | 超额领料 | is_excess | switch | Boolean |  |  | nullable |
| 86 | batchno | 批次号 | sBatchNo | text | String |  |  | nullable |
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
| 117 | defines | 出库申请单子表自由自定义项 | - | - | st.pickingrequisition.PickingRequisitionDetailDefine |  |  |  |
| 118 | lineNo | 行号 | line_no | number | Decimal |  |  | nullable |
| 119 | pickingRequisitionDetailExtend | 借出申请子表扩展 | - | - | st.pickingrequisition.PickingRequisitionDetailExtend |  |  |  |
| 120 | pickingRequisitionDetailUserdefItem | 表体固定自定义项 | - | - | st.pickingrequisition.PickingRequisitionDetailUserdefItem |  |  |  |

---

## Reference Fields (20)

| # | name | displayName | columnName | typeUri |
|---|------|-------------|------------|---------|
| 1 | orderProductId | 生产订单产品id | order_product_id | po.order.OrderProduct |
| 2 | productAuth | 物料权限 | product_id | pb.dataauth.ProductDataAuth |
| 3 | skuId | skuId | sku_id | pc.aa.ProductSKU |
| 4 | inventoryowner | 货主对象Id | inventoryowner | st.inventoryowner.InventoryOwner |
| 5 | wbs | WBS | wbs | BGDM.wbs.wbs_doc |
| 6 | activity | 活动 | activity | pgrm.projecttask.ProjectScheduleTask |
| 7 | productId | 物料Id | product_id | pc.aa.Product |
| 8 | reserveid | 跟踪线索Id1 | reserveid | st.reservation.Reservation |
| 9 | productskun | 默认SKUID | sku_id | pc.product.ProductSKU |
| 10 | ytenant | 租户id | ytenant_id | yht.tenant.YhtTenant |
| 11 | productn | 物料Id | product_id | pc.product.Product |
| 12 | tenant | 租户 | tenant_id | base.tenant.Tenant |
| 13 | requisitionId | 单据id | requisition_id | st.pickingrequisition.PickingRequisition |
| 14 | stockUnitId | 库存单位ID | stock_unit_id | pc.unit.Unit |
| 15 | orgId | 库存组织id | org_id | aa.baseorg.InventoryOrgMV |
| 16 | warehouseId | 出库仓库id | warehouse_id | aa.warehouse.Warehouse |
| 17 | projectId | 项目Id | project_id | bd.project.ProjectVO |
| 18 | orderMaterialId | 生产订单材料id | order_material_id | po.order.OrderMaterial |
| 19 | goodsposition | 货位id | iGoodsPositionId | aa.goodsposition.GoodsPosition |
| 20 | expenseItems | 费用项目id | expenseItems | bd.expenseitem.ExpenseItem |

---

## Number Fields (23)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | changeRateNum | 换算率分子 | change_ratenum | number |
| 2 | changeRateDen | 换算率分母 | change_rateden | number |
| 3 | materialReqType | 领料类型 | material_req_type | int |
| 4 | ownertype | 货权归属 | ownertype | int |
| 5 | cfmStockQuantity | 累计确认出库数量 | cfm_stock_quantity | number |
| 6 | cfmAuxiliaryStockQuantity | 累计确认出库件数 | cfm_auxiliary_stock_quantity | number |
| 7 | collaborationType | 材料协同方式 | collaboration_type | short |
| 8 | lineno | 行号 | lineno | number |
| 9 | changeRate | 换算率 | change_rate | number |
| 10 | quantity | 数量 | quantity | number |
| 11 | auxiliaryQuantity | 件数 | auxiliary_quantity | number |
| 12 | uplineno | 来源单据行号 | uplineno | number |
| 13 | sourceOrderlineno | 来源订单行号 | sourceOrderlineno | number |
| 14 | stockQuantity | 已出库数量 | stock_quantity | number |
| 15 | auxiliaryStockQuantity | 已出库件数 | auxiliary_stock_quantity | number |
| 16 | firstuplineno | 源头单据行号 | firstuplineno | number |
| 17 | changeStockQuantity | 已调拨数量 | change_stock_quantity | number |
| 18 | changeAuxiliaryStockQuantity | 已调拨件数 | change_auxiliary_stock_quantity | number |
| 19 | sourceOrderProductRowno | 源订单子表行号 | source_order_product_rowno | number |
| 20 | rowno | 序号 | rowno | int |
| 21 | budgetUnitPrice | 预算单价 | budgetUnitPrice | number |
| 22 | budgetMoney | 预算金额 | budgetMoney | number |
| 23 | lineNo | 行号 | line_no | number |

---

## Date Fields (5)

| # | name | displayName | columnName | biztype |
|---|------|-------------|------------|---------|
| 1 | sourceautodate | 上游单据子表时间戳 | sourceautodate | date |
| 2 | requirementDate | 需求日期 | requirement_date | date |
| 3 | returnDate | 预计归还日期 | return_date | date |
| 4 | producedate | 生产日期 | dProduceDate | date |
| 5 | invaliddate | 有效期至 | dInvalidDate | date |

---

## Child Tables (3)

| # | name | displayName | typeUri |
|---|------|-------------|---------|
| 1 | pickingRequisitionDetailUserdefItem | 表体固定自定义项 | st.pickingrequisition.PickingRequisitionDetailUserdefItem |
| 2 | pickingRequisitionDetailExtend | 借出申请子表扩展 | st.pickingrequisition.PickingRequisitionDetailExtend |
| 3 | defines | 出库申请单子表自由自定义项 | st.pickingrequisition.PickingRequisitionDetailDefine |
