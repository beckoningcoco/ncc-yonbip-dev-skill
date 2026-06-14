---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.salestrack.SalesTrack"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 销售执行追踪表 (`mr.salestrack.SalesTrack`)

> MR | 物理表：`mr_sales_track`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售执行追踪表 |
| 物理表 | `mr_sales_track` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:18.9200` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（37个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `agentId` | 客户id | `agent_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 2 | `arriveQuantity` | 到货数量 | `arrive_quantity` | Decimal |
| 3 | `billCode` | 编码 | `bill_code` | String |
| 4 | `billType` | 单据类型 | `bill_type` | SourceOrderTypeEnum |
| 5 | `commodityId` | 商品id | `commodity_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 6 | `completedQuantity` | 完成数量 | `completed_quantity` | Decimal |
| 7 | `corpContactId` | 销售业务员 | `corp_contact_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 8 | `datasub` | 应用来源 | `datasub` | String |
| 9 | `docLineId` | 供应行号 | `doc_line_id` | String |
| 10 | `finishDate` | 完成日期 | `finish_date` | DateTime |
| 11 | `finishQuantity` | 完工数量 | `finish_quantity` | Decimal |
| 12 | `firstLineId` | 销售订单行号 | `first_line_Id` | Decimal |
| 13 | `firstSourceAutoid` | 销售订单子表id | `first_source_autoid` | 3722d563-08aa-453d-ac82-6b8cf906b1ab |
| 14 | `firstUpId` | pub_ref | `first_up_id` | c7c0beb4-f830-486d-83e1-51072b319fd2 |
| 15 | `firstUpcode` | 销售单据号 | `first_upcode` | String |
| 16 | `id` | ID | `id` | Long |
| 17 | `materialId` | 制造物料 | `material_id` | Long |
| 18 | `orderQuantity` | 转单数量 | `order_quantity` | Decimal |
| 19 | `originQuantity` | 原始数量 | `origin_quantity` | Decimal |
| 20 | `planStartDate` | 计划开工日期 | `plan_startDate` | DateTime |
| 21 | `productAuth` | 物料权限 | `commodity_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 22 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 23 | `projectId` | 项目projectId | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime |
| 25 | `reserveid` | 需求预留对象ID | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 26 | `saleDepartmentId` | 销售部门id | `sale_department_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 27 | `salesRemanentQuantity` | 订单余量 | `sales_remanent_qty` | Decimal |
| 28 | `settlementId` | 结算方式 | `settlement_id` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff |
| 29 | `startQuantity` | 开工数量 | `start_quantity` | Decimal |
| 30 | `status` | 单据状态 | `status` | String |
| 31 | `stockId` | 仓库ID | `stock_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 32 | `stockOrgId` | 库存组织id | `stock_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 33 | `supplyOrgId` | 供应组织 | `supply_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 34 | `supplyReserveid` | 供应预留对象ID | `supply_reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 35 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 36 | `vendorId` | 供应商ID | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 37 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（18个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `agentId` | 客户id | `aa.merchant.Merchant` | Service |  |
| 2 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 3 | `reserveid` | 需求预留对象ID | `st.reservation.Reservation` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `firstUpId` | pub_ref | `voucher.order.Order` | Service |  |
| 6 | `vendorId` | 供应商ID | `aa.vendor.Vendor` | Service |  |
| 7 | `commodityId` | 商品id | `pc.product.Product` | Service |  |
| 8 | `settlementId` | 结算方式 | `aa.settlemethod.SettleMethod` | Service |  |
| 9 | `corpContactId` | 销售业务员 | `bd.staff.Staff` | Service |  |
| 10 | `firstSourceAutoid` | 销售订单子表id | `voucher.order.OrderDetail` | Service |  |
| 11 | `saleDepartmentId` | 销售部门id | `bd.adminOrg.AdminOrgVO` | Service |  |
| 12 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 13 | `stockId` | 仓库ID | `aa.warehouse.Warehouse` | Service |  |
| 14 | `supplyReserveid` | 供应预留对象ID | `st.reservation.Reservation` | Service |  |
| 15 | `stockOrgId` | 库存组织id | `aa.baseorg.OrgMV` | Service |  |
| 16 | `supplyOrgId` | 供应组织 | `aa.baseorg.OrgMV` | Service |  |
| 17 | `projectId` | 项目projectId | `bd.project.ProjectVO` | Service |  |
| 18 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
