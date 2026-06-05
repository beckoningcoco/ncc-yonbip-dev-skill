---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.subcontractchange.OsmOrderByProductChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外订单联副变更表 (`po.subcontractchange.OsmOrderByProductChange`)

> OSM | 物理表：`osm_order_byproduct_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外订单联副变更表 |
| 物理表 | `osm_order_byproduct_change` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:57:16.5640` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（97个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `auxilaryWarehousingQuantity` | 累计入库件数 | `auxilary_warehousing_quantity` | Decimal |
| 2 | `externalSystemAutoId` | 外部系统联副产品ID | `external_system_auto_id` | String |
| 3 | `offChartReceipt` | 表外产出 | `off_chart_receipt` | Boolean |
| 4 | `stockSensClue` | 现存量特征敏感线索 | `stockSensClue` | String |
| 5 | `warehousingQuantity` | 累计入库数量 | `warehousing_quantity` | Decimal |
| 6 | `bomSensitiveUID` | BOM敏感域唯一性ID | `bom_sensitive_uid` | String |
| 7 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 24784462-d145-4189-a274-034f1cd4c2a1 |
| 8 | `routingByproductId` | 工艺路线联副产品id | `routing_byproduct_id` | Long |
| 9 | `routingOperationId` | 工艺路线工序id | `routing_operation_id` | Long |
| 10 | `sourcePoOrderByproductId` | 来源生产订单产出ID | `source_po_order_byproduct_id` | Long |
| 11 | `osmOutQty` | 委外产出数量 | `osm_out_qty` | Decimal |
| 12 | `incomingQuantityNoArrive` | 累计入库数量(无到货环节) | `incoming_quantity_no_arrive` | Decimal |
| 13 | `incomingQuantitySUNoArrive` | 累计入库件数(无到货环节) | `incoming_quantity_su_no_arrive` | Decimal |
| 14 | `arriveQuantity` | 累计到货数量 | `arrive_quantity` | Decimal |
| 15 | `acceptQuantity` | 累计实收数量 | `accept_quantity` | Decimal |
| 16 | `refuseQuantity` | 累计拒收数量 | `refuse_quantity` | Decimal |
| 17 | `replenishQuantity` | 拒收需补货数量 | `replenish_quantity` | Decimal |
| 18 | `arriveSubQuantity` | 累计到货件数 | `arrive_sub_quantity` | Decimal |
| 19 | `acceptSubQuantity` | 累计实收件数 | `accept_sub_quantity` | Decimal |
| 20 | `refuseSubQuantity` | 累计拒收件数 | `refuse_sub_quantity` | Decimal |
| 21 | `replenishSubQuantity` | 拒收需补货件数 | `replenish_sub_quantity` | Decimal |
| 22 | `returnQtyMU` | 累计退货数量 | `return_qty_mu` | Decimal |
| 23 | `returnQtySU` | 累计退货数量(采购单位) | `return_qty_su` | Decimal |
| 24 | `returnQtyNoOutMU` | 累计退货未退库数量 | `return_qty_no_out_mu` | Decimal |
| 25 | `ulRate` | 上限比例 | `ul_rate` | Decimal |
| 26 | `hasArrivePlan` | 有到货计划 | `has_arrive_plan` | Boolean |
| 27 | `ecnNo` | 工程变更单号 | `ecn_no` | String |
| 28 | `ecnUser` | 变更人 | `ecn_user` | String |
| 29 | `ecnDetailNo` | 工程变更行号 | `ecn_detail_no` | String |
| 30 | `ecnDetails` | 变更详情 | `ecn_details` | String |
| 31 | `cfmIncomingQty` | 确认累计入库数量 | `cfm_incoming_qty` | Decimal |
| 32 | `cfmIncomingAuxQty` | 确认累计入库件数 | `cfm_incoming_auxqty` | Decimal |
| 33 | `cfmScrapStockQty` | 确认报废入库数量 | `cfm_scrapstock_qty` | Decimal |
| 34 | `cfmScrapStockAuxQty` | 确认报废入库件数 | `cfm_scrapstock_auxqty` | Decimal |
| 35 | `bomByproductId` | BOM产出id | `bom_byproduct_id` | 0445cbea-e503-4d98-83bb-4761d390762b |
| 36 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 37 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 38 | `ecnId` | 工程变更ID | `ecn_id` | Long |
| 39 | `ecnDetailId` | 工程变更行ID | `ecn_detail_id` | Long |
| 40 | `ecnTime` | 变更时间 | `ecn_time` | DateTime |
| 41 | `ecnStatus` | 变更状态 | `ecn_status` | Integer |
| 42 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 43 | `sourceautoid` | 来源单据孙表id | `source_autoid` | Long |
| 44 | `processId` | 工序ID | `process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 45 | `processSn` | 工序顺序号 | `process_sn` | Decimal |
| 46 | `id` | ID | `id` | Long |
| 47 | `orderProductId` | 订单成产品id | `order_product_id` | 874c6c6f-0c0e-4582-800e-77098c273c53 |
| 48 | `originalOrderProductId` | 原单产品ID | `original_order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 49 | `originalByProductId` | 原单联副产品ID | `original_order_byproduct_id` | 4b08ee17-121c-4d32-9d32-e896d0d3a395 |
| 50 | `byProductDefineDts` | 自定义项特征组 | `define_cts` | f5b5ee7b-d564-448f-ace9-6e320e4536d0 |
| 51 | `productionType` | 产出类型 | `production_type` | String |
| 52 | `materialId` | 制造物料id | `material_id` | Long |
| 53 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 54 | `bomId` | bomId | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 55 | `skuId` | skuId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 56 | `productionUnitId` | 生产单位ID | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 57 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 58 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 59 | `unitUseQuantity` | 单位产出数量 | `unit_use_quantity` | Decimal |
| 60 | `quantity` | 产出数量 | `quantity` | Decimal |
| 61 | `auxiliaryQuantity` | 产出件数 | `auxiliary_quantity` | Decimal |
| 62 | `numeratorQuantity` | 子件用量 | `numerator_quantity` | Decimal |
| 63 | `denominatorQuantity` | 母件底数 | `denominator_quantity` | Decimal |
| 64 | `productionDate` | 产出日期 | `production_date` | DateTime |
| 65 | `orgId` | 库存组织id | `org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 66 | `warehouseId` | 预入仓库Id | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 67 | `remark` | 备注 | `remark` | String |
| 68 | `pubts` | 时间戳 | `pubts` | DateTime |
| 69 | `free1` | 物料规格1 | `free1` | String |
| 70 | `free2` | 物料规格2 | `free2` | String |
| 71 | `free3` | 物料规格3 | `free3` | String |
| 72 | `free4` | 香雪产地 | `free4` | String |
| 73 | `free5` | 组织 | `free5` | String |
| 74 | `free6` | 物料规格6 | `free6` | String |
| 75 | `free7` | 物料规格7 | `free7` | String |
| 76 | `free8` | 物料规格8 | `free8` | String |
| 77 | `free9` | 物料规格9 | `free9` | String |
| 78 | `free10` | 物料规格10 | `free10` | String |
| 79 | `scrapQuantity` | 报废数量 | `scrap_quantity` | Decimal |
| 80 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 81 | `orderProductLineNo` | 主产品行号 | `order_product_line_no` | Decimal |
| 82 | `lineNo` | 行号 | `line_no` | Decimal |
| 83 | `qualifiedAuxiliaryQuantity` | 合格件数 | `qualified_auxiliary_quantity` | Decimal |
| 84 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 85 | `qualifiedQuantity` | 合格数量 | `qualified_quantity` | Decimal |
| 86 | `returnQuantity` | 返工数量 | `return_quantity` | Decimal |
| 87 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 88 | `completedAuxiliaryQuantity` | 已完工件数 | `completed_auxiliary_quantity` | Decimal |
| 89 | `returnAuxiliaryQuantity` | 返工件数 | `return_auxiliary_quantity` | Decimal |
| 90 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 91 | `completedIncomingQuantity` | 已完工入库数量 | `completed_incoming_quantity` | Decimal |
| 92 | `completedQuantity` | 已完工数量 | `completed_quantity` | Decimal |
| 93 | `scrapAuxiliaryQuantity` | 报废件数 | `scrap_auxiliary_quantity` | Decimal |
| 94 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 95 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 96 | `orderByProductAttrextItem` | 联副产品表自由自定义项 | `` | bf005618-1bfb-4b57-8fb4-d991ac1219f1 |
| 97 | `orderByProductUserdefItem` | 委外联副产品表固定自定义项 | `` | fdcb9571-6593-494b-8b90-9c4bf183a59e |

---

## 关联属性（18个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `originalByProductId` | 原单联副产品ID | `po.order.OrderByProduct` | None |  |
| 2 | `bomId` | bomId | `ed.bom.Bom` | Service |  |
| 3 | `originalOrderProductId` | 原单产品ID | `po.order.OrderProduct` | None |  |
| 4 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 5 | `orderByProductAttrextItem` | 联副产品表自由自定义项 | `po.subcontractchange.OsmOrderByProductChangeAttrextItem` | None | true |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `bomByproductId` | BOM产出id | `ed.bom.BomByproduct` | Service |  |
| 8 | `byProductDefineDts` | 自定义项特征组 | `po.subcontractchange.OsmOrderByProductChangeDefineCharacteristics` | None |  |
| 9 | `orderProductId` | 订单成产品id | `po.subcontractchange.OsmOrderProductChange` | None | true |
| 10 | `productionUnitId` | 生产单位ID | `pc.unit.Unit` | Service |  |
| 11 | `orgId` | 库存组织id | `org.func.InventoryOrg` | Service |  |
| 12 | `freeCharacteristics` | 自由项特征组 | `po.subcontractchange.ByProductFreeCharacteristics` | None |  |
| 13 | `orderByProductUserdefItem` | 委外联副产品表固定自定义项 | `po.subcontractchange.OsmOrderByProductChangeDefine` | None | true |
| 14 | `processId` | 工序ID | `po.order.OrderProcess` | None |  |
| 15 | `warehouseId` | 预入仓库Id | `aa.warehouse.Warehouse` | Service |  |
| 16 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 17 | `skuId` | skuId | `pc.product.ProductSKU` | Service |  |
| 18 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
