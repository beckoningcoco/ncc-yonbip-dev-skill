---
tags: ["BIP", "元数据", "数据字典", "PO", "po.directdelivery.DirectDelivery"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 完工直送 (`po.directdelivery.DirectDelivery`)

> PO | 物理表：`po_direct_delivery`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 完工直送 |
| 物理表 | `po_direct_delivery` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:32:44.1230` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（32个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 5 | `orderId` | 生产订单Id | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 6 | `orderProductId` | 生产订单产品行Id | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 7 | `orderMaterialId` | 生产订单材料行Id | `order_material_id` | 1b1bb4a9-8a2a-44af-9c61-f22d398ec0b7 |
| 8 | `finishedReportId` | 完工报告Id | `finished_report_id` | 62bd3c56-84e5-4cb6-96af-159c3188b4ef |
| 9 | `finishedReportDetailId` | 完工报告产品Id | `finished_report_detail_id` | d8490919-eda7-40f8-a9a3-9869fc46b507 |
| 10 | `productId` | 物料Id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 11 | `quantity` | 直送数量 | `quantity` | Decimal |
| 12 | `batchNo` | 批次号 | `batch_no` | String |
| 13 | `warehouseId` | 直送仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 14 | `goodspositionId` | 直送货位 | `goods_position_id` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 15 | `materialOutId` | 材料出库单Id | `materialout_id` | Long |
| 16 | `materialOutCode` | 材料出库单编码 | `materialout_code` | String |
| 17 | `inrecordId` | 产品入库单Id | `inrecord_id` | Long |
| 18 | `inrecordCode` | 产品入库单编码 | `inrecord_code` | String |
| 19 | `deliveryMassage` | 直送信息 | `delivery_massage` | String |
| 20 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 21 | `tplid` | 模板id | `tplid` | Long |
| 22 | `status` | 单据状态 | `status` | Short |
| 23 | `code` | 编码 | `code` | String |
| 24 | `createTime` | 创建时间 | `create_time` | DateTime |
| 25 | `createDate` | 创建日期 | `create_date` | Date |
| 26 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 27 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 28 | `creator` | 创建人名称 | `creator` | String |
| 29 | `modifier` | 修改人名称 | `modifier` | String |
| 30 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 31 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 32 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `finishedReportDetailId` | 完工报告产品Id | `po.finishedreport.FinishedReportDetail` | None |  |
| 2 | `productId` | 物料Id | `pc.product.Product` | Service |  |
| 3 | `orderId` | 生产订单Id | `po.order.Order` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `goodspositionId` | 直送货位 | `aa.goodsposition.GoodsPosition` | Service |  |
| 8 | `orderProductId` | 生产订单产品行Id | `po.order.OrderProduct` | None |  |
| 9 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 10 | `orderMaterialId` | 生产订单材料行Id | `po.order.OrderMaterial` | None |  |
| 11 | `warehouseId` | 直送仓库 | `aa.warehouse.Warehouse` | Service |  |
| 12 | `finishedReportId` | 完工报告Id | `po.finishedreport.FinishedReport` | None |  |
| 13 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
