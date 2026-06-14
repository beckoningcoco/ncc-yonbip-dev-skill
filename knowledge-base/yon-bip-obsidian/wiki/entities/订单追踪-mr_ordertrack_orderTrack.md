---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.ordertrack.orderTrack"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 订单追踪 (`mr.ordertrack.orderTrack`)

> MR | 物理表：`mr_order_tracking`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 订单追踪 |
| 物理表 | `mr_order_tracking` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:53.5490` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（29个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `orgId` | 组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 5 | `sdDocType` | 供需类型 | `sd_doc_type` | String |
| 6 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 7 | `docNo` | 单据号 | `doc_no` | String |
| 8 | `docId` | 单据id | `doc_id` | Long |
| 9 | `docLineNo` | 单据行号 | `doc_line_no` | String |
| 10 | `docLineId` | 单据行id | `doc_line_id` | Long |
| 11 | `docDate` | 单据日期 | `doc_date` | DateTime |
| 12 | `status` | 单据状态 | `status` | String |
| 13 | `productId` | product | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 14 | `materialId` | 制造物料 | `material_id` | Long |
| 15 | `skuId` | SKU | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 16 | `freeCharacteristics` | 自由特征组实体 | `free_characteristics` | 55613cd3-f736-4a9e-9918-e206dd1fba8f |
| 17 | `uom` | 单位 | `uom_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 18 | `reqQuantity` | 需求数量 | `req_quantity` | Decimal |
| 19 | `sdDate` | 供需日期 | `sd_date` | DateTime |
| 20 | `agentId` | 客户id | `agent_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 21 | `stockOrgId` | 库存组织id | `stock_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 22 | `departmentId` | 生产 | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 23 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 24 | `trackType` | 追踪类型 | `track_type` | Short |
| 25 | `reserveid` | 跟踪线索id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 26 | `remark` | 备注 | `remark` | String |
| 27 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 28 | `datasub` | 应用来源 | `datasub` | String |
| 29 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（14个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `agentId` | 客户id | `aa.merchant.Merchant` | Service |  |
| 2 | `productId` | product | `pc.product.Product` | Service |  |
| 3 | `reserveid` | 跟踪线索id | `st.reservation.Reservation` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `departmentId` | 生产 | `aa.baseorg.DeptMV` | Service |  |
| 6 | `orgId` | 组织 | `aa.baseorg.OrgMV` | Service |  |
| 7 | `uom` | 单位 | `pc.unit.Unit` | Service |  |
| 8 | `freeCharacteristics` | 自由特征组实体 | `mr.ordertrack.orderTrackFCT` | None |  |
| 9 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 10 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 11 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 12 | `stockOrgId` | 库存组织id | `org.func.BaseOrg` | Service |  |
| 13 | `skuId` | SKU | `pc.product.ProductSKU` | Service |  |
| 14 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
