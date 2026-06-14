---
tags: ["BIP", "元数据", "数据字典", "PO", "po.orderchange.OrderByProductChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 订单联副变更表 (`po.orderchange.OrderByProductChange`)

> PO | 物理表：`po_order_byproduct_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 订单联副变更表 |
| 物理表 | `po_order_byproduct_change` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:33:41.3220` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 变更单联副产品ID |

---

## 直接属性（98个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `externalSystemAutoId` | 外部系统联副产品ID | `external_system_auto_id` | String |
| 2 | `offChartReceipt` | 表外产出 | `off_chart_receipt` | Boolean |
| 3 | `auxilaryWarehousingQuantity` | 累计入库件数 | `auxilary_warehousing_quantity` | Decimal |
| 4 | `bomId` | 物料清单 | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 5 | `completedAuxiliaryQuantity` | 已完工件数 | `completed_auxiliary_quantity` | Decimal |
| 6 | `completedIncomingQuantity` | 已完工入库数量(不使用) | `completed_incoming_quantity` | Decimal |
| 7 | `completedQuantity` | 已完工数量 | `completed_quantity` | Decimal |
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
| 25 | `originalProcessId` | 原单工序id | `original_process_id` | Long |
| 26 | `returnQtyMU` | 累计退货数量 | `return_qty_mu` | Decimal |
| 27 | `qualifiedAuxiliaryQuantity` | 合格件数 | `qualified_auxiliary_quantity` | Decimal |
| 28 | `refuseSubQuantity` | 累计拒收件数 | `refuse_sub_quantity` | Decimal |
| 29 | `arriveSubQuantity` | 累计到货件数 | `arrive_sub_quantity` | Decimal |
| 30 | `acceptQuantity` | 累计实收数量 | `accept_quantity` | Decimal |
| 31 | `refuseQuantity` | 累计拒收数量 | `refuse_quantity` | Decimal |
| 32 | `incomingQuantityNoArrive` | 累计入库数量(无到货环节) | `incoming_quantity_no_arrive` | Decimal |
| 33 | `incomingQuantitySUNoArrive` | 累计入库件数(无到货环节) | `incoming_quantity_su_no_arrive` | Decimal |
| 34 | `out_sys_lineid` | 外部来源行 | `out_sys_lineid` | String |
| 35 | `acceptSubQuantity` | 累计实收件数 | `accept_sub_quantity` | Decimal |
| 36 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 37 | `arriveQuantity` | 累计到货数量 | `arrive_quantity` | Decimal |
| 38 | `out_sys_rowno` | 外部来源行号 | `out_sys_rowno` | String |
| 39 | `returnQtySU` | 累计退货数量(采购单位) | `return_qty_su` | Decimal |
| 40 | `replenishQuantity` | 拒收需补货数量 | `replenish_quantity` | Decimal |
| 41 | `returnQtyNoOutMU` | 累计退货未退库数量 | `return_qty_no_out_mu` | Decimal |
| 42 | `sourcePoOrderByproductId` | 来源生产订单产出ID | `source_po_order_byproduct_id` | Long |
| 43 | `qualifiedQuantity` | 合格数量 | `qualified_quantity` | Decimal |
| 44 | `returnAuxiliaryQuantity` | 返工件数 | `return_auxiliary_quantity` | Decimal |
| 45 | `returnQuantity` | 返工数量 | `return_quantity` | Decimal |
| 46 | `scrapAuxiliaryQuantity` | 报废件数 | `scrap_auxiliary_quantity` | Decimal |
| 47 | `scrapQuantity` | 报废数量 | `scrap_quantity` | Decimal |
| 48 | `scrapStockAuxiliaryQuantity` | 报废入库件数 | `scrap_stock_auxiliary_quantity` | Decimal |
| 49 | `scrapStockQuantity` | 报废入库数量 | `scrap_stock_quantity` | Decimal |
| 50 | `warehousingQuantity` | 累计入库数量 | `warehousing_quantity` | Decimal |
| 51 | `byProductDefineDts` | 自定义项特征组 | `define_cts` | 02d42706-d154-46d0-a1d5-a6d2b318f948 |
| 52 | `stockSensClue` | 现存量特征敏感线索 | `stockSensClue` | String |
| 53 | `bomSensitiveUID` | BOM敏感域唯一性ID | `bom_sensitive_uid` | String |
| 54 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 349eb893-1b41-4b0a-9e48-d948d01fd93b |
| 55 | `sourceautoid` | 来源单据孙表id | `source_autoid` | Long |
| 56 | `processId` | 工序ID | `process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 57 | `processSn` | 工序顺序号 | `process_sn` | Decimal |
| 58 | `routingByproductId` | 工艺路线联副产品id | `routing_byproduct_id` | Long |
| 59 | `id` | 变更单联副产品ID | `id` | Long |
| 60 | `routingOperationId` | 工艺路线工序id | `routing_operation_id` | Long |
| 61 | `orderProductId` | 变更订单产品ID | `order_product_id` | fbe0dedd-7f73-4c6b-91f0-6cd861f75f4f |
| 62 | `originalOrderProductId` | 原单产品ID | `original_order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 63 | `originalByProductId` | 原单联副产品ID | `original_order_byproduct_id` | 4b08ee17-121c-4d32-9d32-e896d0d3a395 |
| 64 | `productionType` | 产出类型 | `production_type` | String |
| 65 | `materialId` | 制造物料id | `material_id` | Long |
| 66 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 67 | `skuId` | skuId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 68 | `productionUnitId` | 生产单位ID | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 69 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 70 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 71 | `unitUseQuantity` | 单位产出数量 | `unit_use_quantity` | Decimal |
| 72 | `quantity` | 产出数量 | `quantity` | Decimal |
| 73 | `auxiliaryQuantity` | 产出件数 | `auxiliary_quantity` | Decimal |
| 74 | `numeratorQuantity` | 分子用量 | `numerator_quantity` | Decimal |
| 75 | `denominatorQuantity` | 分母用量 | `denominator_quantity` | Decimal |
| 76 | `productionDate` | 产出日期 | `production_date` | DateTime |
| 77 | `orgId` | 库存组织id | `org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 78 | `warehouseId` | 预入仓库Id | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 79 | `remark` | 备注 | `remark` | String |
| 80 | `pubts` | 时间戳 | `pubts` | DateTime |
| 81 | `free1` | 颜色测试 | `free1` | String |
| 82 | `free2` | 测试31 | `free2` | String |
| 83 | `free3` | 定量测试 | `free3` | String |
| 84 | `free4` | 香雪产地 | `free4` | String |
| 85 | `free5` | 组织 | `free5` | String |
| 86 | `free6` | 物料规格6 | `free6` | String |
| 87 | `free7` | 物料规格7 | `free7` | String |
| 88 | `free8` | 物料规格8 | `free8` | String |
| 89 | `free9` | 物料规格9 | `free9` | String |
| 90 | `free10` | 物料规格10 | `free10` | String |
| 91 | `lineNo` | 行号 | `line_no` | Decimal |
| 92 | `orderProductLineNo` | 主产品行号 | `order_product_line_no` | Decimal |
| 93 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 94 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 95 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 96 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 97 | `orderByProductChangeAttrextItem` | 联副产品表自由自定义项 | `` | 5b21ef05-4017-48e3-946d-a69191514c69 |
| 98 | `orderByProductUserdefItem` | 联副产品表固定自定义项 | `` | 875fb98f-75ec-4bca-b214-7316581865c7 |

---

## 关联属性（18个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `originalByProductId` | 原单联副产品ID | `po.order.OrderByProduct` | None |  |
| 2 | `bomId` | 物料清单 | `ed.bom.Bom` | Service |  |
| 3 | `originalOrderProductId` | 原单产品ID | `po.order.OrderProduct` | None |  |
| 4 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `bomByproductId` | BOM产出id | `ed.bom.BomByproduct` | Service |  |
| 7 | `byProductDefineDts` | 自定义项特征组 | `po.orderchange.ByProductChangeDefineCharacteristics` | None |  |
| 8 | `orderProductId` | 变更订单产品ID | `po.orderchange.OrderProductChange` | None | true |
| 9 | `productionUnitId` | 生产单位ID | `pc.unit.Unit` | Service |  |
| 10 | `orgId` | 库存组织id | `org.func.InventoryOrg` | Service |  |
| 11 | `freeCharacteristics` | 自由项特征组 | `po.orderchange.ByProductFreeCharacteristics` | None |  |
| 12 | `orderByProductUserdefItem` | 联副产品表固定自定义项 | `po.orderchange.OrderByProductChangeDefine` | None | true |
| 13 | `processId` | 工序ID | `po.order.OrderProcess` | None |  |
| 14 | `warehouseId` | 预入仓库Id | `aa.warehouse.Warehouse` | Service |  |
| 15 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 16 | `orderByProductChangeAttrextItem` | 联副产品表自由自定义项 | `po.orderchange.OrderByProductChangeAttrextItem` | None | true |
| 17 | `skuId` | skuId | `pc.product.ProductSKU` | Service |  |
| 18 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
