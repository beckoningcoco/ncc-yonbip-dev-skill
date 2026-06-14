---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "osmsu.order.OrderProcess"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 受托加工单工序 (`osmsu.order.OrderProcess`)

> ycSaleCoor | 物理表：`osmsu_order_process`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 受托加工单工序 |
| 物理表 | `osmsu_order_process` |
| domain/服务域 | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:33:10.4780` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `sn` | 顺序号 | `sn` | Decimal |
| 3 | `operationId` | 工序ID | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 4 | `planStartDate` | 计划开工时间 | `plan_start_date` | DateTime |
| 5 | `planEndDate` | 计划完工时间 | `plan_end_date` | DateTime |
| 6 | `timeUnit` | 时间单位 | `time_unit` | Short |
| 7 | `prepareTime` | 计划准备时间 | `prepare_time` | Decimal |
| 8 | `processTime` | 计划加工时间 | `process_time` | Decimal |
| 9 | `prodQty` | 计划生产件数 | `prodQty` | Decimal |
| 10 | `outUnitId` | 工序产出单位id | `out_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 11 | `orderId` | 受托加工单id | `order_id` | Long |
| 12 | `orderProductId` | 订单成产品id | `order_product_id` | 1570856b-127c-4512-9d6e-a3bfb55162ef |
| 13 | `buyerTenant` | 采购商租户id | `buyer_tenant_id` | String |
| 14 | `ctId` | 自定义项特征组id | `ct_id` | 2947de5c-9697-4c87-bac4-0ac7365cd12f |
| 15 | `orderProcessAttrextItem` | 工序表自由自定义项 | `` | d2a68f42-d439-448c-a087-1dd75bb8bc11 |
| 16 | `orderProcessUserdefItem` | 工序表固定自定义项 | `` | a94f399a-cd9a-4307-8560-96a4bc8622ce |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `tenant` | 租户ID | `tenant_id` | String |
| 19 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ctId` | 自定义项特征组id | `osmsu.order.OrderProcessCt` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `orderProcessAttrextItem` | 工序表自由自定义项 | `osmsu.order.OrderProcessAttrextItem` | None | true |
| 4 | `operationId` | 工序ID | `ed.operation.Operation` | Service |  |
| 5 | `orderProductId` | 订单成产品id | `osmsu.order.OrderProduct` | None | true |
| 6 | `orderProcessUserdefItem` | 工序表固定自定义项 | `osmsu.order.OrderProcessUserdefItem` | None | true |
| 7 | `outUnitId` | 工序产出单位id | `pc.unit.Unit` | Service |  |
