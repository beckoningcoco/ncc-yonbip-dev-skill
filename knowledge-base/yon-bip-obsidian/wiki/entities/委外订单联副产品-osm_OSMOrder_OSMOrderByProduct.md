---
tags: ["BIP", "元数据", "数据字典", "OSM", "osm.OSMOrder.OSMOrderByProduct"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外订单联副产品 (`osm.OSMOrder.OSMOrderByProduct`)

> OSM | 物理表：`po_order_byproduct`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外订单联副产品 |
| 物理表 | `po_order_byproduct` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:55:42.1230` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（93个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `auxilaryWarehousingQuantity` | 累计入库件数 | `auxilary_warehousing_quantity` | Decimal |
| 2 | `auxiliaryQuantity` | 产出件数 | `auxiliary_quantity` | Decimal |
| 3 | `bomId` | 物料清单 | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 4 | `bomSensitiveUID` | BOM敏感域唯一性ID | `bom_sensitive_uid` | String |
| 5 | `byProductDefineDts` | 自定义项特征组 | `define_cts` | 61e28ed6-ddf5-4453-9209-e13f0f936127 |
| 6 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 7 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 8 | `replenishSubQuantity` | 拒收需补货件数 | `replenish_sub_quantity` | Decimal |
| 9 | `osmOutQty` | 委外产出数量 | `osm_out_qty` | Decimal |
| 10 | `ulRate` | 上限比例 | `ul_rate` | Decimal |
| 11 | `hasArrivePlan` | 有到货计划 | `has_arrive_plan` | Boolean |
| 12 | `ecnNo` | 工程变更单号 | `ecn_no` | String |
| 13 | `ecnUser` | 变更人 | `ecn_user` | String |
| 14 | `ecnDetailNo` | 工程变更行号 | `ecn_detail_no` | String |
| 15 | `ecnDetails` | 变更详情 | `ecn_details` | String |
| 16 | `cfmIncomingQty` | 确认累计入库数量 | `cfm_incoming_qty` | Decimal |
| 17 | `cfmIncomingAuxQty` | 确认累计入库件数 | `cfm_incoming_auxqty` | Decimal |
| 18 | `cfmScrapStockQty` | 确认报废入库数量 | `cfm_scrapstock_qty` | Decimal |
| 19 | `cfmScrapStockAuxQty` | 确认报废入库件数 | `cfm_scrapstock_auxqty` | Decimal |
| 20 | `bomByproductId` | BOM产出id | `bom_byproduct_id` | 0445cbea-e503-4d98-83bb-4761d390762b |
| 21 | `ecnId` | 工程变更ID | `ecn_id` | Long |
| 22 | `ecnDetailId` | 工程变更行ID | `ecn_detail_id` | Long |
| 23 | `ecnTime` | 变更时间 | `ecn_time` | DateTime |
| 24 | `ecnStatus` | 变更状态 | `ecn_status` | Integer |
| 25 | `returnQtyMU` | 累计退货数量 | `return_qty_mu` | Decimal |
| 26 | `refuseSubQuantity` | 累计拒收件数 | `refuse_sub_quantity` | Decimal |
| 27 | `arriveSubQuantity` | 累计到货件数 | `arrive_sub_quantity` | Decimal |
| 28 | `acceptQuantity` | 累计实收数量 | `accept_quantity` | Decimal |
| 29 | `refuseQuantity` | 累计拒收数量 | `refuse_quantity` | Decimal |
| 30 | `incomingQuantityNoArrive` | 累计入库数量(无到货环节) | `incoming_quantity_no_arrive` | Decimal |
| 31 | `incomingQuantitySUNoArrive` | 累计入库件数(无到货环节) | `incoming_quantity_su_no_arrive` | Decimal |
| 32 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 33 | `acceptSubQuantity` | 累计实收件数 | `accept_sub_quantity` | Decimal |
| 34 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 35 | `arriveQuantity` | 累计到货数量 | `arrive_quantity` | Decimal |
| 36 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 37 | `returnQtySU` | 累计退货数量(采购单位) | `return_qty_su` | Decimal |
| 38 | `replenishQuantity` | 拒收需补货数量 | `replenish_quantity` | Decimal |
| 39 | `returnQtyNoOutMU` | 累计退货未退库数量 | `return_qty_no_out_mu` | Decimal |
| 40 | `sourcePoOrderByproductId` | 来源生产订单产出ID | `source_po_order_byproduct_id` | Long |
| 41 | `completedAuxiliaryQuantity` | 已完工件数 | `completed_auxiliary_quantity` | Decimal |
| 42 | `completedIncomingQuantity` | 已完工入库数量(不使用) | `completed_incoming_quantity` | Decimal |
| 43 | `completedQuantity` | 已完工数量 | `completed_quantity` | Decimal |
| 44 | `denominatorQuantity` | 分母用量 | `denominator_quantity` | Decimal |
| 45 | `externalSystemAutoId` | 外部系统联副产品ID | `external_system_auto_id` | String |
| 46 | `free1` | 规格1 | `free1` | String |
| 47 | `free10` | 规格10 | `free10` | String |
| 48 | `free2` | 规格2 | `free2` | String |
| 49 | `free3` | 规格3 | `free3` | String |
| 50 | `free4` | 规格4 | `free4` | String |
| 51 | `free5` | 规格5 | `free5` | String |
| 52 | `free6` | 规格6 | `free6` | String |
| 53 | `free7` | 规格7 | `free7` | String |
| 54 | `free8` | 规格8 | `free8` | String |
| 55 | `free9` | 规格9 | `free9` | String |
| 56 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 6724c751-d914-47b6-a883-94fc3a815eeb |
| 57 | `id` | ID | `id` | Long |
| 58 | `lineNo` | 行号 | `line_no` | Decimal |
| 59 | `materialId` | 制造物料 | `material_id` | Long |
| 60 | `numeratorQuantity` | 分子用量 | `numerator_quantity` | Decimal |
| 61 | `offChartReceipt` | 表外产出 | `off_chart_receipt` | Boolean |
| 62 | `orderProductId` | 订单母件ID | `order_product_id` | 7d39c327-90bf-4f63-b030-c953035dd99e |
| 63 | `orderProductLineNo` | 主产品行号 | `order_product_line_no` | Decimal |
| 64 | `orgId` | 库存组织 | `org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 65 | `processId` | 工序ID | `process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 66 | `processSn` | 工序顺序号 | `process_sn` | Decimal |
| 67 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 68 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 69 | `productionDate` | 产出日期 | `production_date` | DateTime |
| 70 | `productionType` | 产出类型 | `production_type` | String |
| 71 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 72 | `pubts` | 时间戳 | `pubts` | DateTime |
| 73 | `qualifiedAuxiliaryQuantity` | 合格件数 | `qualified_auxiliary_quantity` | Decimal |
| 74 | `qualifiedQuantity` | 合格数量 | `qualified_quantity` | Decimal |
| 75 | `quantity` | 产出数量 | `quantity` | Decimal |
| 76 | `remark` | 备注 | `remark` | String |
| 77 | `returnAuxiliaryQuantity` | 返工件数 | `return_auxiliary_quantity` | Decimal |
| 78 | `returnQuantity` | 返工数量 | `return_quantity` | Decimal |
| 79 | `routingByproductId` | 工艺路线联副产品id | `routing_byproduct_id` | Long |
| 80 | `routingOperationId` | 工艺路线工序id | `routing_operation_id` | Long |
| 81 | `scrapAuxiliaryQuantity` | 报废件数 | `scrap_auxiliary_quantity` | Decimal |
| 82 | `scrapQuantity` | 报废数量 | `scrap_quantity` | Decimal |
| 83 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 84 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 85 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 86 | `sourceautoid` | 来源单据孙表id | `source_autoid` | Long |
| 87 | `stockSensClue` | 现存量特征敏感线索 | `stockSensClue` | String |
| 88 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 89 | `unitUseQuantity` | 单位使用数量 | `unit_use_quantity` | Decimal |
| 90 | `warehouseId` | 预入仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 91 | `warehousingQuantity` | 累计入库数量 | `warehousing_quantity` | Decimal |
| 92 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 93 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |

---

## 关联属性（14个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bomId` | 物料清单 | `ed.bom.Bom` | Service |  |
| 2 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `bomByproductId` | BOM产出id | `ed.bom.BomByproduct` | Service |  |
| 5 | `byProductDefineDts` | 自定义项特征组 | `po.order.ByProductDefineCharacteristics` | None |  |
| 6 | `orderProductId` | 订单母件ID | `osm.OSMOrder.OSMOrderProduct` | None | true |
| 7 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 8 | `orgId` | 库存组织 | `org.func.InventoryOrg` | Service |  |
| 9 | `freeCharacteristics` | 自由项特征组 | `po.order.ByProductFreeCharacteristics` | None |  |
| 10 | `processId` | 工序ID | `po.order.OrderProcess` | None |  |
| 11 | `warehouseId` | 预入仓库 | `aa.warehouse.Warehouse` | Service |  |
| 12 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 13 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 14 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
