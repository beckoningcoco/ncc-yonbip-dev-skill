---
tags: ["BIP", "元数据", "数据字典", "PO", "po.wholereportresult.WholeReportResultDs"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 齐套分析结果供需匹配明细 (`po.wholereportresult.WholeReportResultDs`)

> PO | 物理表：`po_whole_result_ds`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 齐套分析结果供需匹配明细 |
| 物理表 | `po_whole_result_ds` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:35:42.5480` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（38个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `WholeReportVersion` | 齐套版本 | `whole_report_version` | Integer |
| 2 | `departmentId` | 部门 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 3 | `dsOrgId` | 需求/供应组织 | `ds_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 4 | `reserveid` | 跟踪线索Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 5 | `dsSign` | 需求/供应标识 | `ds_sign` | Integer |
| 6 | `dsType` | 需求/供应类型 | `ds_type` | Integer |
| 7 | `expLevel` | 备料层级 | `exp_level` | Integer |
| 8 | `freeCharacteristics` | 自由项特征组 | `free_cts` | 04456bd9-5bf4-4e9d-99d6-5944ddeff187 |
| 9 | `id` | ID | `id` | Long |
| 10 | `matchQuantity` | 匹配量 | `match_quantity` | Decimal |
| 11 | `materialId` | 制造物料 | `material_id` | Long |
| 12 | `orderCode` | 单据号 | `order_code` | String |
| 13 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 14 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime |
| 16 | `resultId` | 齐套分析结果id | `result_id` | 93dfc464-b9cb-49dc-b925-d6dcde23f2ae |
| 17 | `rootDocId` | 源头单据 | `root_doc_id` | Long |
| 18 | `rootDocLineId` | 源头单据行 | `root_doc_line_id` | Long |
| 19 | `rootDocLineNo` | 源头单据行号 | `root_doc_line_no` | String |
| 20 | `rootDocNo` | 源头单据号 | `root_doc_no` | String |
| 21 | `rootDocTypeCode` | 源头单据类型 | `root_doc_type_code` | aeaf3baa-b7f8-4d47-90d8-4c775fa9780d |
| 22 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 23 | `srcDocId` | 来源单据 | `src_doc_id` | Long |
| 24 | `srcDocLineId` | 来源单据行 | `src_doc_line_id` | Long |
| 25 | `srcDocLineNo` | 来源单据行号 | `src_doc_line_no` | String |
| 26 | `srcDocNo` | 来源单据号 | `src_doc_no` | String |
| 27 | `srcDocTypeId` | 来源单据类型 | `src_doc_type_id` | aeaf3baa-b7f8-4d47-90d8-4c775fa9780d |
| 28 | `surplusQuantity` | 需求/供应余量 | `surplus_quantity` | Decimal |
| 29 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 30 | `uom` | 单位 | `uom` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 31 | `voucherQuantity` | 需求/供应原量 | `voucher_quantity` | Decimal |
| 32 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 33 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 34 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 35 | `inventoryowner` | 货主Id | `inventory_owner` | af1b583d-f5e4-4f7c-bba5-66d570ef7e3e |
| 36 | `ownertype` | 货主类型 | `owner_type` | Integer |
| 37 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 38 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |

---

## 关联属性（18个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `rootDocTypeCode` | 源头单据类型 | `po.wholereport.DocType` | None |  |
| 2 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 3 | `reserveid` | 跟踪线索Id | `st.reservation.Reservation` | Service |  |
| 4 | `resultId` | 齐套分析结果id | `po.wholereportresult.WholeReportResult` | None | true |
| 5 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `departmentId` | 部门 | `aa.baseorg.DeptMV` | Service |  |
| 8 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 9 | `dsOrgId` | 需求/供应组织 | `org.func.BaseOrg` | Service |  |
| 10 | `srcDocTypeId` | 来源单据类型 | `po.wholereport.DocType` | None |  |
| 11 | `uom` | 单位 | `pc.unit.Unit` | Service |  |
| 12 | `freeCharacteristics` | 自由项特征组 | `po.wholereportresult.WholeDsFreeCharacteristics` | None |  |
| 13 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 14 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 15 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 16 | `inventoryowner` | 货主Id | `st.inventoryowner.InventoryOwner` | Service |  |
| 17 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 18 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
