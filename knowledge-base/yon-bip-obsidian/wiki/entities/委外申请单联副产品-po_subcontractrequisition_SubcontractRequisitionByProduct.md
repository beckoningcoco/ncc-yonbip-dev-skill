---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.subcontractrequisition.SubcontractRequisitionByProduct"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 委外申请单联副产品 (`po.subcontractrequisition.SubcontractRequisitionByProduct`)

> OSM | 物理表：`po_subcontract_requisition_byproduct`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外申请单联副产品 |
| 物理表 | `po_subcontract_requisition_byproduct` |
| 数据库 schema | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:58:32.0380` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（46个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `mainUnitId` | 主计量 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 2 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 3 | `rowno` | 序号 | `rowno` | Integer |
| 4 | `sourceautoid` | 来源单据孙表id | `source_autoid` | Long |
| 5 | `sourcePoOrderByproductId` | 来源生产订单产出ID | `source_po_order_byproduct_id` | Long |
| 6 | `processId` | 委外申请工序ID | `process_id` | e8543cf3-c89d-40ac-8ef2-369317b016f2 |
| 7 | `processSn` | 工序顺序号 | `process_sn` | Decimal |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 9 | `bomId` | BOMID | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 10 | `id` | ID | `id` | Long |
| 11 | `lineNo` | 行号 | `line_no` | Decimal |
| 12 | `subcontractRequisitionProductId` | 委外申请单行ID | `subcontract_requisition_product_id` | 88cbcf2d-a040-4a0b-845a-25bce8d0fb5d |
| 13 | `subcontractRequisitionProductLineNo` | 主产品行号 | `subcontract_requisition_product_line_no` | Decimal |
| 14 | `materialId` | 制造物料id | `material_id` | Long |
| 15 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 16 | `byProductDefineDts` | 自定义项特征组 | `define_cts` | 4921f285-c989-4044-8767-fff740bad915 |
| 17 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 9947b615-9998-4940-a195-888648ba248a |
| 18 | `skuId` | skuId | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 19 | `productionType` | 产出类型 | `production_type` | String |
| 20 | `numeratorQuantity` | 分子用量 | `numerator_quantity` | Decimal |
| 21 | `denominatorQuantity` | 分母用量 | `denominator_quantity` | Decimal |
| 22 | `unitUseQuantity` | 单位产出数量 | `unit_use_quantity` | Decimal |
| 23 | `quantity` | 产出数量 | `quantity` | Decimal |
| 24 | `auxiliaryQuantity` | 产出件数 | `auxiliary_quantity` | Decimal |
| 25 | `productionUnitId` | 产出单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 26 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 27 | `productionDate` | 产出日期 | `production_date` | DateTime |
| 28 | `changeType` | 换算方式 | `change_type` | ChangeType |
| 29 | `orgId` | 收货组织id | `org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 30 | `warehouseId` | 预入仓库Id | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 31 | `remark` | 备注 | `remark` | String |
| 32 | `pubts` | 时间戳 | `pubts` | DateTime |
| 33 | `free1` | 物料规格1 | `free1` | String |
| 34 | `free2` | 物料规格2 | `free2` | String |
| 35 | `free3` | 物料规格3 | `free3` | String |
| 36 | `free4` | 物料规格4 | `free4` | String |
| 37 | `free5` | 物料规格5 | `free5` | String |
| 38 | `free6` | 物料规格6 | `free6` | String |
| 39 | `free7` | 物料规格7 | `free7` | String |
| 40 | `free8` | 物料规格8 | `free8` | String |
| 41 | `free9` | 物料规格9 | `free9` | String |
| 42 | `free10` | 物料规格10 | `free10` | String |
| 43 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 44 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 45 | `orderByProductAttrextItem` | 委外申请行联副产品自由自定义项 | `` | 8f58ca36-1308-49f8-b1ac-d547c9cb214d |
| 46 | `orderByProductUserdefItem` | 委外申请行联副产品固定自定义项 | `` | 56038c27-d3eb-4120-96a0-805deb34d0dc |

---

## 关联属性（15个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bomId` | BOMID | `ed.bom.Bom` | Service |  |
| 2 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 3 | `orderByProductAttrextItem` | 委外申请行联副产品自由自定义项 | `po.subcontractrequisition.SubcontractRequisitionByProductExtItem` | None | true |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `byProductDefineDts` | 自定义项特征组 | `po.subcontractrequisition.ByProductDefineCharacteristics` | None |  |
| 6 | `productionUnitId` | 产出单位 | `pc.unit.Unit` | Service |  |
| 7 | `orgId` | 收货组织id | `org.func.InventoryOrg` | Service |  |
| 8 | `freeCharacteristics` | 自由项特征组 | `po.subcontractrequisition.ByProductFreeCharacteristics` | None |  |
| 9 | `orderByProductUserdefItem` | 委外申请行联副产品固定自定义项 | `po.subcontractrequisition.SubcontractRequisitionByProductDefine` | None | true |
| 10 | `processId` | 委外申请工序ID | `po.subcontractrequisition.SubcontractRequisitionProcess` | None |  |
| 11 | `warehouseId` | 预入仓库Id | `aa.warehouse.Warehouse` | Service |  |
| 12 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 13 | `subcontractRequisitionProductId` | 委外申请单行ID | `po.subcontractrequisition.SubcontractRequisitionProduct` | None | true |
| 14 | `skuId` | skuId | `pc.product.ProductSKU` | Service |  |
| 15 | `mainUnitId` | 主计量 | `pc.unit.Unit` | Service |  |
