---
tags: ["BIP", "元数据", "数据字典", "PO", "po.wholereportresult.WholeReportResultDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 齐套分析结果详情 (`po.wholereportresult.WholeReportResultDetail`)

> PO | 物理表：`po_whole_result_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 齐套分析结果详情 |
| 物理表 | `po_whole_result_detail` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:34:24.4520` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（46个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `auxiliaryDemandQuantity` | 需求件数 | `auxiliary_demand_quantity` | Decimal |
| 2 | `auxiliaryReplenishAdjustQuantity` | 补货调整件数 | `auxiliary_replenish_adjust_quantity` | Decimal |
| 3 | `auxiliaryTransferQuantity` | 已调拨件数 | `auxiliary_transfer_quantity` | Decimal |
| 4 | `reserveid` | 跟踪线索Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 5 | `billSource` | 生单来源 | `bill_source` | Integer |
| 6 | `dsDate` | 需求日期 | `ds_date` | DateTime |
| 7 | `expLevel` | 备料层级 | `exp_level` | Integer |
| 8 | `needOrgSupply` | 需要企业仓供给 | `need_org_supply` | Boolean |
| 9 | `orgId` | 库存组织 | `org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 10 | `processQuantity` | 在途量 | `process_quantity` | Decimal |
| 11 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 12 | `replenishAdjustQuantity` | 补货调整数量 | `replenish_adjust_quantity` | Decimal |
| 13 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 14 | `stockQuantity` | 企业仓现存量 | `stock_quantity` | Decimal |
| 15 | `subcontractShortQuantity` | 委外仓缺料量 | `subcontract_short_quantity` | Decimal |
| 16 | `subcontractStockQuantity` | 委外仓现存量 | `subcontract_stock_quantity` | Decimal |
| 17 | `subcontractVendorId` | 委外供应商 | `subcontract_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 18 | `supDirectShip` | 供应商直运 | `sup_direct_ship` | Boolean |
| 19 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 20 | `transferQuantity` | 已调拨数量 | `transfer_quantity` | Decimal |
| 21 | `warehouseId` | 供应仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 22 | `wrrDsId` | 供需明细信息 | `wrr_ds_id` | 208fc55e-7717-4237-b6f0-07aaed5de2d6 |
| 23 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 24 | `id` | ID | `id` | Long |
| 25 | `resultId` | 齐套分析产品id | `result_id` | 93dfc464-b9cb-49dc-b925-d6dcde23f2ae |
| 26 | `wholeMaterialId` | 齐套分析材料id | `whole_material_id` | e3f3243c-2971-40f2-85cb-bc0e58a3dfbb |
| 27 | `orderMaterialId` | 生产订单材料id | `order_material_id` | d421b3fa-9bcd-4db2-b43b-fbc55db29ae7 |
| 28 | `materialId` | 制造物料 | `material_id` | Long |
| 29 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 30 | `isWholeSet` | 是否齐套 | `is_whole_set` | Boolean |
| 31 | `demandQuantity` | 需求数量 | `demand_quantity` | Decimal |
| 32 | `extantQuantity` | 现存量 | `extant_quantity` | Decimal |
| 33 | `wholeSetQuantity` | 可齐套数量 | `whole_set_quantity` | Decimal |
| 34 | `shortQuantity` | 缺料量 | `short_quantity` | Decimal |
| 35 | `shortStatus` | 缺料标识 | `short_status` | String |
| 36 | `pubts` | 创建时间 | `pubts` | DateTime |
| 37 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 38 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 39 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 40 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 41 | `defineDts` | 自定义项特征组 | `define_cts` | ffd422f4-0683-48f1-966f-8430e357e85b |
| 42 | `inventoryowner` | 货主ID | `inventory_owner` | af1b583d-f5e4-4f7c-bba5-66d570ef7e3e |
| 43 | `ownertype` | 货主类型 | `owner_type` | Integer |
| 44 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 45 | `shortAuxiliaryQty` | 缺料件数 | `short_auxiliary_qty` | Decimal |
| 46 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |

---

## 关联属性（18个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 2 | `reserveid` | 跟踪线索Id | `st.reservation.Reservation` | Service |  |
| 3 | `resultId` | 齐套分析产品id | `po.wholereportresult.WholeReportResult` | None | true |
| 4 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 7 | `wholeMaterialId` | 齐套分析材料id | `po.wholereport.WholeReportMaterial` | None |  |
| 8 | `orgId` | 库存组织 | `org.func.InventoryOrg` | Service |  |
| 9 | `subcontractVendorId` | 委外供应商 | `aa.vendor.Vendor` | Service |  |
| 10 | `orderMaterialId` | 生产订单材料id | `base.entity.BizObject` | None |  |
| 11 | `wrrDsId` | 供需明细信息 | `po.wholereportresult.WholeReportResultDs` | None |  |
| 12 | `warehouseId` | 供应仓库 | `aa.warehouse.Warehouse` | Service |  |
| 13 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 14 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 15 | `inventoryowner` | 货主ID | `st.inventoryowner.InventoryOwner` | Service |  |
| 16 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 17 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 18 | `defineDts` | 自定义项特征组 | `po.wholereportresult.WholeResultDetailDefineCharacter` | None |  |
