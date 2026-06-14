---
tags: ["BIP", "元数据", "数据字典", "PO", "po.order.OrderExpinfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 生产订单扩展信息 (`po.order.OrderExpinfo`)

> PO | 物理表：`po_order_expinfo`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 生产订单扩展信息 |
| 物理表 | `po_order_expinfo` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:23:01.8800` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（9个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `isAutoExp` | 自动展开 | `is_auto_exp` | Boolean |
| 3 | `orderId` | 生产订单ID | `order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 4 | `parentOrderId` | 父生产订单ID | `parent_order_id` | Long |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `rootOrderCode` | 根生产订单单号 | `root_order_code` | String |
| 7 | `rootOrderId` | 根生产订单ID | `root_order_id` | Long |
| 8 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `orderId` | 生产订单ID | `po.order.Order` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
