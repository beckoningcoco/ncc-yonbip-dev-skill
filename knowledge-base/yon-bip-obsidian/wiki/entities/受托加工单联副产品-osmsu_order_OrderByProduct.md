---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "osmsu.order.OrderByProduct"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 受托加工单联副产品 (`osmsu.order.OrderByProduct`)

> ycSaleCoor | 物理表：`osmsu_order_byproduct`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 受托加工单联副产品 |
| 物理表 | `osmsu_order_byproduct` |
| domain/服务域 | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:33:07.7230` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（37个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `lineNo` | 行号 | `line_no` | Decimal |
| 3 | `productionType` | 产出类型 | `production_type` | String |
| 4 | `ctId` | 自定义项特征组id | `ct_id` | 0ad39fe0-09ea-401e-96f6-c255fbc1532a |
| 5 | `dctId` | 自由项特征组id | `dct_id` | db784540-481f-4ac4-8fe4-b55bc8970ec4 |
| 6 | `opSn` | 工序顺序号 | `op_sn` | Decimal |
| 7 | `operationId` | 工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 8 | `free1` | 规格1 | `free1` | String |
| 9 | `free2` | 规格2 | `free2` | String |
| 10 | `free3` | 规格3 | `free3` | String |
| 11 | `free4` | 规格4 | `free4` | String |
| 12 | `free5` | 规格5 | `free5` | String |
| 13 | `free6` | 规格6 | `free6` | String |
| 14 | `free7` | 规格7 | `free7` | String |
| 15 | `free8` | 规格8 | `free8` | String |
| 16 | `free9` | 规格9 | `free9` | String |
| 17 | `free10` | 规格10 | `free10` | String |
| 18 | `tenant` | 租户ID | `tenant_id` | String |
| 19 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 20 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 21 | `productId` | 物料id | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 22 | `productionUnitId` | 生产单位ID | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 23 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 24 | `quantity` | 单位产出数量 | `quantity` | Decimal |
| 25 | `auxiliaryQuantity` | 产出数量 | `auxiliary_quantity` | Decimal |
| 26 | `numeratorQuantity` | 子件用量 | `numerator_quantity` | Decimal |
| 27 | `denominatorQuantity` | 母件底数 | `denominator_quantity` | Decimal |
| 28 | `orgId` | 收货组织ID | `org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 |
| 29 | `remark` | 备注 | `remark` | String |
| 30 | `engineeringDrawNo` | 工程图号 | `engineering_draw_no` | String |
| 31 | `orderProductId` | 订单成产品id | `order_product_id` | 1570856b-127c-4512-9d6e-a3bfb55162ef |
| 32 | `buyerTenant` | 采购商租户id | `buyer_tenant_id` | String |
| 33 | `pubts` | 时间戳 | `pubts` | DateTime |
| 34 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 35 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |
| 36 | `orderByProductAttrextItem` | 联副产品表自由自定义项 | `` | aa459ba0-6840-462f-82ff-8839c34b3679 |
| 37 | `orderByProductUserdefItem` | 联副产品表固定自定义项 | `` | 43a12554-67e6-4d70-a7d8-7efa9180b919 |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ctId` | 自定义项特征组id | `osmsu.order.OrderByProductCt` | None |  |
| 2 | `productId` | 物料id | `pc.product.Product` | Service |  |
| 3 | `orderByProductAttrextItem` | 联副产品表自由自定义项 | `osmsu.order.OrderByProductAttrextItem` | None | true |
| 4 | `orderByProductUserdefItem` | 联副产品表固定自定义项 | `osmsu.order.OrderByProductUserdefItem` | None | true |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `operationId` | 工序ID | `ed.operation.Operation` | Service |  |
| 7 | `orderProductId` | 订单成产品id | `osmsu.order.OrderProduct` | None | true |
| 8 | `productionUnitId` | 生产单位ID | `pc.unit.Unit` | Service |  |
| 9 | `orgId` | 收货组织ID | `org.func.InventoryOrg` | Service |  |
| 10 | `dctId` | 自由项特征组id | `osmsu.order.OrderByProductDct` | None |  |
