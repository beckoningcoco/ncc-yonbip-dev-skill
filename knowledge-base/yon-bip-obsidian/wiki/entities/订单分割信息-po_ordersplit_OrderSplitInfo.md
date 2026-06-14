---
tags: ["BIP", "元数据", "数据字典", "PO", "po.ordersplit.OrderSplitInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 订单分割信息 (`po.ordersplit.OrderSplitInfo`)

> PO | 物理表：`po_order_split_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 订单分割信息 |
| 物理表 | `po_order_split_info` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:32:47.1240` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（30个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `productionDepartmentId` | 源订单部门 | `production_department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 4 | `routingId` | 源订单工艺路线 | `routing_id` | 37955d3b-2143-4a4d-bdd5-0213a13394f5 |
| 5 | `orderId` | 源订单Id | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 6 | `toProductAuth` | 物料权限 | `to_product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 7 | `modifier` | 修改人名称 | `modifier` | String |
| 8 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `orgId` | 源订单组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 11 | `toOrderProductId` | 目标订单产品Id | `to_order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 12 | `toBomId` | 目标订单BOM | `to_bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 14 | `toProductId` | 目标订单物料 | `to_product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 15 | `transTypeId` | 源订单交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 16 | `pubts` | 时间戳 | `pubts` | DateTime |
| 17 | `createDate` | 创建日期 | `create_date` | Date |
| 18 | `creator` | 创建人名称 | `creator` | String |
| 19 | `bomId` | 源订单BOM | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 20 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 21 | `productId` | 源订单物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 22 | `toOrderId` | 目标订单Id | `to_order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 23 | `operateType` | 操作类型 | `operate_type` | Integer |
| 24 | `orderProductId` | 源订单产品Id | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 25 | `toRoutingId` | 目标订单工艺路线 | `to_routing_id` | 37955d3b-2143-4a4d-bdd5-0213a13394f5 |
| 26 | `splitQuantity` | 分割数量 | `split_quantity` | Decimal |
| 27 | `orderProcessId` | 源订单工序Id | `order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 28 | `createTime` | 创建时间 | `create_time` | DateTime |
| 29 | `productAuth` | 物料权限 | `product_id` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 30 | `orderSplitInfo` | 订单分割信息详情 | `` | 09d90635-9977-403c-a239-a3a723b07340 |

---

## 关联属性（20个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bomId` | 源订单BOM | `ed.bom.Bom` | Service |  |
| 2 | `toProductAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 3 | `routingId` | 源订单工艺路线 | `ed.routing.Routing` | Service |  |
| 4 | `productId` | 源订单物料 | `pc.product.Product` | Service |  |
| 5 | `toOrderId` | 目标订单Id | `po.order.Order` | None |  |
| 6 | `orderId` | 源订单Id | `po.order.Order` | None |  |
| 7 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 8 | `orderSplitInfo` | 订单分割信息详情 | `po.ordersplit.OrderSplitDetail` | None | true |
| 9 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 10 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 11 | `orderProductId` | 源订单产品Id | `po.order.OrderProduct` | None |  |
| 12 | `toRoutingId` | 目标订单工艺路线 | `ed.routing.Routing` | Service |  |
| 13 | `orgId` | 源订单组织 | `aa.baseorg.OrgMV` | Service |  |
| 14 | `toOrderProductId` | 目标订单产品Id | `po.order.OrderProduct` | None |  |
| 15 | `toBomId` | 目标订单BOM | `ed.bom.Bom` | Service |  |
| 16 | `orderProcessId` | 源订单工序Id | `po.order.OrderProcess` | None |  |
| 17 | `toProductId` | 目标订单物料 | `pc.product.Product` | Service |  |
| 18 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 19 | `transTypeId` | 源订单交易类型 | `bd.bill.TransType` | Service |  |
| 20 | `productionDepartmentId` | 源订单部门 | `aa.baseorg.DeptMV` | Service |  |
