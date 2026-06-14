---
tags: ["BIP", "元数据", "数据字典", "PO", "po.replenishdemand.ReplenishDemandDetailVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 补货需求子表 (`po.replenishdemand.ReplenishDemandDetailVO`)

> PO | 物理表：`po_replenish_demand_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 补货需求子表 |
| 物理表 | `po_replenish_demand_detail` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:34:04.3600` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 子表ID |
| 编码 | `rowno` | Decimal | 序号 |

---

## 直接属性（93个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `detailDefineCharacter` | 自定义项特征属性组 | `demand_detail_define_ct` | 0954bcb5-c673-4e85-97ac-53221d5195ca |
| 2 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 516bcc57-b39a-448f-afbf-f1dd278c8eb9 |
| 3 | `id` | 子表ID | `id` | Long |
| 4 | `rowno` | 序号 | `rowno` | Decimal |
| 5 | `lineNo` | 行号 | `line_no` | Decimal |
| 6 | `replenishDemandId` | 补货需求主表id | `replenish_demand_id` | 89a56b5c-f2ae-456e-9a58-25a7c59efac6 |
| 7 | `orgId` | 调入组织id | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 8 | `warehouseId` | 调入仓库id | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 9 | `transReqQty` | 已调拨申请数量 | `transreq_qty` | Decimal |
| 10 | `auxiliaryTransReqQty` | 已调拨申请件数 | `auxiliary_transreq_qty` | Decimal |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 12 | `outOrgId` | 调出组织id | `out_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 13 | `outWarehouseId` | 调出仓库id | `out_warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 14 | `materialId` | 制造物料id | `material_id` | Long |
| 15 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 16 | `skuId` | skuId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 17 | `stockUnitId` | 库存单位ID | `stock_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 18 | `quantity` | 数量 | `quantity` | Decimal |
| 19 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 20 | `changeType` | 换算方式 | `change_type` | Integer |
| 21 | `auxiliaryQuantity` | 件数 | `auxiliary_quantity` | Decimal |
| 22 | `planRcvDate` | 计划到货日期 | `plan_rcv_date` | Date |
| 23 | `planShipDate` | 计划发货日期 | `plan_ship_date` | Date |
| 24 | `batchNumber` | 批次号 | `batch_number` | String |
| 25 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 26 | `firstsource` | 源头单据类型 | `first_source` | String |
| 27 | `firstupcode` | 源头单据号 | `first_upcode` | String |
| 28 | `firstsourceautoid` | 源头单据子表id | `first_source_autoid` | Long |
| 29 | `sourceType` | 来源单据类型 | `source_type` | String |
| 30 | `source` | 来源单据类型(推拉单) | `source` | String |
| 31 | `sourceid` | 来源单据主表id | `sourceid` | Long |
| 32 | `upcode` | 来源单据号 | `upcode` | String |
| 33 | `sourceautoid` | 来源单据子表id | `sourceautoid` | Long |
| 34 | `projectId` | 项目Id | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 35 | `transinQuantity` | 已调拨数量 | `transin_quantity` | Decimal |
| 36 | `auxiliaryTransinQuantity` | 已调拨件数 | `auxiliary_transin_quantity` | Decimal |
| 37 | `reserveid` | 预留对象Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 38 | `remark` | 备注 | `remark` | String |
| 39 | `adjustQty` | 调整数量 | `adjust_qty` | Decimal |
| 40 | `free1` | 物料规格1 | `free1` | String |
| 41 | `adjustPieces` | 调整件数 | `adjust_pieces` | Decimal |
| 42 | `free2` | 物料规格2 | `free2` | String |
| 43 | `doubleReplenish` | 补货倍量 | `double_replenish` | Decimal |
| 44 | `free3` | 物料规格3 | `free3` | String |
| 45 | `free4` | 香雪产地 | `free4` | String |
| 46 | `free5` | 组织 | `free5` | String |
| 47 | `free6` | 物料规格6 | `free6` | String |
| 48 | `free7` | 物料规格7 | `free7` | String |
| 49 | `free8` | 物料规格8 | `free8` | String |
| 50 | `free9` | 物料规格9 | `free9` | String |
| 51 | `free10` | 物料规格10 | `free10` | String |
| 52 | `define1` | 批次属性1 | `define1` | String |
| 53 | `define2` | 批次属性2 | `define2` | String |
| 54 | `define3` | 批次属性3 | `define3` | String |
| 55 | `define4` | 批次属性4 | `define4` | String |
| 56 | `define5` | 批次属性5 | `define5` | String |
| 57 | `define6` | 批次属性6 | `define6` | String |
| 58 | `define7` | 批次属性7 | `define7` | String |
| 59 | `define8` | 批次属性8 | `define8` | String |
| 60 | `define9` | 批次属性9 | `define9` | String |
| 61 | `define10` | 批次属性10 | `define10` | String |
| 62 | `define11` | 批次属性11 | `define11` | String |
| 63 | `define12` | 批次属性12 | `define12` | String |
| 64 | `define13` | 批次属性13 | `define13` | String |
| 65 | `define14` | 批次属性14 | `define14` | String |
| 66 | `define15` | 批次属性15 | `define15` | String |
| 67 | `define16` | 批次属性16 | `define16` | String |
| 68 | `define17` | 批次属性17 | `define17` | String |
| 69 | `define18` | 批次属性18 | `define18` | String |
| 70 | `define19` | 批次属性19 | `define19` | String |
| 71 | `define20` | 批次属性20 | `define20` | String |
| 72 | `define21` | 批次属性21 | `define21` | String |
| 73 | `define22` | 批次属性22 | `define22` | String |
| 74 | `define23` | 批次属性23 | `define23` | String |
| 75 | `define24` | 批次属性24 | `define24` | String |
| 76 | `define25` | 批次属性25 | `define25` | String |
| 77 | `define26` | 批次属性26 | `define26` | String |
| 78 | `define27` | 批次属性27 | `define27` | String |
| 79 | `define28` | 批次属性28 | `define28` | String |
| 80 | `define29` | 批次属性29 | `define29` | String |
| 81 | `define30` | 批次属性30 | `define30` | String |
| 82 | `productAuth` | 数据权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 83 | `pubts` | 时间戳 | `pubts` | DateTime |
| 84 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 85 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 86 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 87 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 88 | `inventoryowner` | 货主ID | `inventory_owner` | af1b583d-f5e4-4f7c-bba5-66d570ef7e3e |
| 89 | `linecloseDate` | 行关闭日期 | `lineclose_date` | DateTime |
| 90 | `linecloseTime` | 行关闭时间 | `lineclose_time` | DateTime |
| 91 | `linecloser` | 行关闭人 | `linecloser` | String |
| 92 | `ownertype` | 货主类型 | `owner_type` | Integer |
| 93 | `replenishDemandDetailUserdefItem` | 补货需求体自定义项 | `` | a245ac8c-990f-4396-9499-26da5238e15d |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `replenishDemandId` | 补货需求主表id | `po.replenishdemand.ReplenishDemandVO` | None | true |
| 2 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 3 | `reserveid` | 预留对象Id | `st.reservation.Reservation` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `detailDefineCharacter` | 自定义项特征属性组 | `po.replenishdemand.DemandDetailDefineCharacter` | None |  |
| 6 | `outOrgId` | 调出组织id | `aa.baseorg.OrgMV` | Service |  |
| 7 | `orgId` | 调入组织id | `aa.baseorg.OrgMV` | Service |  |
| 8 | `outWarehouseId` | 调出仓库id | `aa.warehouse.Warehouse` | Service |  |
| 9 | `replenishDemandDetailUserdefItem` | 补货需求体自定义项 | `po.replenishdemand.ReplenishDemandDetailUserdefItem` | None | true |
| 10 | `freeCharacteristics` | 自由项特征组 | `po.replenishdemand.DemandFreeCharacteristics` | None |  |
| 11 | `warehouseId` | 调入仓库id | `aa.warehouse.Warehouse` | Service |  |
| 12 | `productAuth` | 数据权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 13 | `projectId` | 项目Id | `bd.project.ProjectVO` | Service |  |
| 14 | `inventoryowner` | 货主ID | `st.inventoryowner.InventoryOwner` | Service |  |
| 15 | `skuId` | skuId | `pc.product.ProductSKU` | Service |  |
| 16 | `stockUnitId` | 库存单位ID | `pc.unit.Unit` | Service |  |
