---
tags: ["BIP", "元数据", "数据字典", "PO", "po.exceptioncheck.ExceptionCheckDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 生产管理异常检查详情 (`po.exceptioncheck.ExceptionCheckDetail`)

> PO | 物理表：`po_exception_check_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 生产管理异常检查详情 |
| 物理表 | `po_exception_check_detail` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:33:25.5970` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `checkId` | 异常检查ID | `check_id` | 2cff801e-e8a9-4816-a0e9-47a2d049e055 |
| 2 | `exceptionMessage` | 异常明细 | `exc_message` | String |
| 3 | `id` | ID | `id` | Long |
| 4 | `orderId` | 生产订单Id | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 5 | `orderProductId` | 生产订单产品行Id | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 6 | `poExcLevel` | 异常等级 | `po_exc_level` | Short |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `orderId` | 生产订单Id | `po.order.Order` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `orderProductId` | 生产订单产品行Id | `po.order.OrderProduct` | None |  |
| 4 | `checkId` | 异常检查ID | `po.exceptioncheck.ExceptionCheck` | None | true |
