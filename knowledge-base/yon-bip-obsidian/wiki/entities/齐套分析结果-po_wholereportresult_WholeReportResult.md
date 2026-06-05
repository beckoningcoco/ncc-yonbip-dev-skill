---
tags: ["BIP", "元数据", "数据字典", "PO", "po.wholereportresult.WholeReportResult"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 齐套分析结果 (`po.wholereportresult.WholeReportResult`)

> PO | 物理表：`po_whole_result`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 齐套分析结果 |
| 物理表 | `po_whole_result` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:32:57.8800` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（28个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `billSource` | 生单来源 | `bill_source` | Integer |
| 2 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 3 | `reserveid` | 跟踪线索Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 4 | `subcontractVendorId` | 委外供应商 | `subcontract_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 5 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 6 | `wrrDsId` | 供需明细信息 | `wrr_ds_id` | 208fc55e-7717-4237-b6f0-07aaed5de2d6 |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 8 | `id` | ID | `id` | Long |
| 9 | `wholeId` | 齐套分析id | `whole_id` | a8af8064-3e34-4ffe-9eb9-8f289b1aabcc |
| 10 | `wholeOrderId` | 齐套分析订单行id | `whole_order_id` | 8e000d8b-2e14-4c34-8786-9c392cb498d7 |
| 11 | `priorityNo` | 优先级 | `priority_no` | Decimal |
| 12 | `orderProductId` | 产品行id | `order_product_id` | d421b3fa-9bcd-4db2-b43b-fbc55db29ae7 |
| 13 | `materialId` | 制造物料 | `material_id` | Long |
| 14 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 15 | `wholeStatus` | 齐套状态 | `whole_status` | String |
| 16 | `reportQuantity` | 分析数量 | `report_quantity` | Decimal |
| 17 | `reportAuxQuantity` | 分析件数 | `report_aux_quantity` | Decimal |
| 18 | `wholeQuantity` | 齐套数量 | `whole_quantity` | Decimal |
| 19 | `wholeAuxQuantity` | 齐套件数 | `whole_aux_quantity` | Decimal |
| 20 | `remark` | 备注 | `remark` | String |
| 21 | `pubts` | 创建时间 | `pubts` | DateTime |
| 22 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 23 | `defineDts` | 自定义项特征组 | `define_cts` | d9af250e-2213-4069-a9ab-217739539a23 |
| 24 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 25 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 26 | `wholeReportResultDetail` | 齐套分析结果详情 | `` | ffba25dc-387b-47a0-ad26-c98473d9fb1b |
| 27 | `wholeReportResultDs` | 齐套分析结果供需匹配明细 | `` | 208fc55e-7717-4237-b6f0-07aaed5de2d6 |
| 28 | `wholeReportResultDsTree` | 齐套分析结果供需追溯明细 | `` | 49139086-9187-4ab9-9307-4d4ec9934eca |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 2 | `reserveid` | 跟踪线索Id | `st.reservation.Reservation` | Service |  |
| 3 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 6 | `wholeReportResultDetail` | 齐套分析结果详情 | `po.wholereportresult.WholeReportResultDetail` | None | true |
| 7 | `orderProductId` | 产品行id | `base.entity.BizObject` | None |  |
| 8 | `subcontractVendorId` | 委外供应商 | `aa.vendor.Vendor` | Service |  |
| 9 | `wholeReportResultDsTree` | 齐套分析结果供需追溯明细 | `po.wholereportresult.WholeReportResultDsTree` | None | true |
| 10 | `wholeReportResultDs` | 齐套分析结果供需匹配明细 | `po.wholereportresult.WholeReportResultDs` | None | true |
| 11 | `wrrDsId` | 供需明细信息 | `po.wholereportresult.WholeReportResultDs` | None |  |
| 12 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 13 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 14 | `wholeOrderId` | 齐套分析订单行id | `po.wholereport.WholeReportOrder` | None |  |
| 15 | `wholeId` | 齐套分析id | `po.wholereport.WholeReport` | None |  |
| 16 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 17 | `defineDts` | 自定义项特征组 | `po.wholereportresult.WholeResultDefineCharacter` | None |  |
