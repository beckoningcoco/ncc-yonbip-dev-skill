---
tags: ["BIP", "元数据", "数据字典", "PO", "po.order.OrderProductStartinfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 生产订单开工记录表 (`po.order.OrderProductStartinfo`)

> PO | 物理表：`po_order_product_startinfo`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 生产订单开工记录表 |
| 物理表 | `po_order_product_startinfo` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:25:45.3990` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `orderProductId` | 订单母件ID | `order_product_id` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `seqNum` | 序号 | `seq_num` | String |
| 6 | `businessDirection` | 业务方向 | `business_direction` | String |
| 7 | `quantity` | 数量 | `quantity` | Decimal |
| 8 | `startDate` | 日期 | `start_date` | Date |
| 9 | `managerId` | 负责人ID | `manager_id` | Long |
| 10 | `manager` | 负责人 | `manager` | String |
| 11 | `startTime` | 时间 | `start_time` | DateTime |
| 12 | `auxiliaryQuantity` | 件数 | `aux_quantity` | Decimal |
| 13 | `changeRate` | 换算率 | `change_rate` | Decimal |
| 14 | `changeRateDen` | 换算率分母 | `change_rateden` | Decimal |
| 15 | `changeRateNum` | 换算率分子 | `change_ratenum` | Decimal |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `orderProductId` | 订单母件ID | `po.order.OrderProduct` | None | true |
