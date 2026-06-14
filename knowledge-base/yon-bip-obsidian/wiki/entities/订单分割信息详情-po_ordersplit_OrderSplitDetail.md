---
tags: ["BIP", "元数据", "数据字典", "PO", "po.ordersplit.OrderSplitDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 订单分割信息详情 (`po.ordersplit.OrderSplitDetail`)

> PO | 物理表：`po_order_split_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 订单分割信息详情 |
| 物理表 | `po_order_split_detail` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:34:01.3390` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（6个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `orderProcessId` | 工序ID | `order_process_id` | 980e8d68-00ee-467f-bfd6-5fbd69855bd7 |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime |
| 4 | `splitId` | 分割ID | `split_id` | 53cec100-c4f8-4c00-88e4-a49cc64d92c1 |
| 5 | `splitQuantity` | 分割数量 | `split_quantity` | Decimal |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `orderProcessId` | 工序ID | `po.order.OrderProcess` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `splitId` | 分割ID | `po.ordersplit.OrderSplitInfo` | None | true |
