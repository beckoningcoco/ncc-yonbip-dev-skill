---
tags: ["BIP", "元数据", "数据字典", "OSM", "osm.reqchange.OsmReqByproductChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外申请单联副产品变更 (`osm.reqchange.OsmReqByproductChange`)

> OSM | 物理表：`osm_req_byproduct_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外申请单联副产品变更 |
| 物理表 | `osm_req_byproduct_change` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:56:52.7300` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（47个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `auxiliaryQuantity` | 产出件数 | `auxiliary_quantity` | Decimal |
| 2 | `bomId` | BOMID | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 3 | `byProductDefineDts` | 自定义项特征组 | `define_cts` | cc25e7b4-0cf3-43de-8480-74d2f1d11142 |
| 4 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 5 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 6 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 7 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 8 | `denominatorQuantity` | 分母用量 | `denominator_quantity` | Decimal |
| 9 | `free1` | 规格1 | `free1` | String |
| 10 | `free10` | 规格10 | `free10` | String |
| 11 | `free2` | 规格2 | `free2` | String |
| 12 | `free3` | 规格3 | `free3` | String |
| 13 | `free4` | 规格4 | `free4` | String |
| 14 | `free5` | 规格5 | `free5` | String |
| 15 | `free6` | 规格6 | `free6` | String |
| 16 | `free7` | 规格7 | `free7` | String |
| 17 | `free8` | 规格8 | `free8` | String |
| 18 | `free9` | 规格9 | `free9` | String |
| 19 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 632c6135-b45f-4da8-80d8-c793473952d1 |
| 20 | `id` | id | `id` | Long |
| 21 | `lineNo` | 行号 | `line_no` | Decimal |
| 22 | `mainUnitId` | 主计量 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 23 | `materialId` | 制造物料 | `material_id` | Long |
| 24 | `numeratorQuantity` | 分子用量 | `numerator_quantity` | Decimal |
| 25 | `orgId` | 收货组织 | `org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 26 | `originalReqByproductId` | 原委外申请单联副产品ID | `original_req_byproduct_id` | 0d81bc02-b4d6-486f-bdfc-7702f35c8aee |
| 27 | `originalReqProductId` | 原委外申请行ID | `original_req_product_id` | 88cbcf2d-a040-4a0b-845a-25bce8d0fb5d |
| 28 | `processId` | 委外申请工序ID | `process_id` | e8543cf3-c89d-40ac-8ef2-369317b016f2 |
| 29 | `processSn` | 工序顺序号 | `process_sn` | Decimal |
| 30 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 31 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 32 | `productionDate` | 产出日期 | `production_date` | DateTime |
| 33 | `productionType` | 产出类型 | `production_type` | String |
| 34 | `productionUnitId` | 产出单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 35 | `pubts` | 时间戳 | `pubts` | DateTime |
| 36 | `quantity` | 产出数量 | `quantity` | Decimal |
| 37 | `remark` | 备注 | `remark` | String |
| 38 | `reqProductId` | 产品id | `req_product_id` | 3b18adf7-8938-4841-b5af-5f11d4a5b9b0 |
| 39 | `rowno` | 序号 | `rowno` | Integer |
| 40 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 41 | `sourcePoOrderByproductId` | 来源生产订单产出ID | `source_po_order_byproduct_id` | Long |
| 42 | `sourceautoid` | 来源单据孙表id | `source_autoid` | Long |
| 43 | `subcontractRequisitionProductId` | 委外申请单行ID | `subcontract_requisition_product_id` | 88cbcf2d-a040-4a0b-845a-25bce8d0fb5d |
| 44 | `subcontractRequisitionProductLineNo` | 主产品行号 | `subcontract_requisition_product_line_no` | Decimal |
| 45 | `unitUseQuantity` | 单位使用数量 | `unit_use_quantity` | Decimal |
| 46 | `warehouseId` | 预入仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 47 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（16个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bomId` | BOMID | `ed.bom.Bom` | Service |  |
| 2 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `byProductDefineDts` | 自定义项特征组 | `osm.reqchange.OsmReqByproductChangeDefineCharacteristics` | None |  |
| 5 | `reqProductId` | 产品id | `osm.reqchange.OsmReqProductChange` | None | true |
| 6 | `productionUnitId` | 产出单位 | `pc.unit.Unit` | Service |  |
| 7 | `orgId` | 收货组织 | `org.func.InventoryOrg` | Service |  |
| 8 | `originalReqProductId` | 原委外申请行ID | `po.subcontractrequisition.SubcontractRequisitionProduct` | None |  |
| 9 | `freeCharacteristics` | 自由项特征组 | `osm.reqchange.OsmReqByproductChangeFreeCharacteristics` | None |  |
| 10 | `processId` | 委外申请工序ID | `po.subcontractrequisition.SubcontractRequisitionProcess` | None |  |
| 11 | `warehouseId` | 预入仓库 | `aa.warehouse.Warehouse` | Service |  |
| 12 | `originalReqByproductId` | 原委外申请单联副产品ID | `po.subcontractrequisition.SubcontractRequisitionByProduct` | None |  |
| 13 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 14 | `subcontractRequisitionProductId` | 委外申请单行ID | `po.subcontractrequisition.SubcontractRequisitionProduct` | None |  |
| 15 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 16 | `mainUnitId` | 主计量 | `pc.unit.Unit` | Service |  |
