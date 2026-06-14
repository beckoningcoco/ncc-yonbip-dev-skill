---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.saleorder.SaleOrdersPaymentProgressAck"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售订单进度确认执行孙表 (`cpu-order.saleorder.SaleOrdersPaymentProgressAck`)

> ycSaleCoor | 物理表：`cpu_saleorders_paymentprogressack`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售订单进度确认执行孙表 |
| 物理表 | `cpu_saleorders_paymentprogressack` |
| domain/服务域 | `cpu-order` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:55.1670` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（21个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `rowno` | 序号 | `rowno` | Integer |
| 2 | `saleOrderPayId` | 销售订单付款计划子表ID | `sale_order_pay_id` | aeddca26-5275-4d1b-9de2-681a69c618f4 |
| 3 | `totalAckExecutedMoney` | 累计执行金额 | `fTotalAckExecutedMoney` | Decimal |
| 4 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 5 | `purOrdersId` | 采购订单子表ID | `purorders_id` | Long |
| 6 | `detailId` | 销售订单子表ID | `sale_order_detail_id` | 5fb7781a-74b1-4980-8261-0a9878c38f7b |
| 7 | `totalAckExecutedQty` | 累计确认已执行数量 | `ftotalAckExecutedQty` | Decimal |
| 8 | `dr` | 逻辑删除标记 | `dr` | Short |
| 9 | `totalAckQty` | 累计确认数量 | `ftotalAckQty` | Decimal |
| 10 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 11 | `number` | 期号 | `iNumber` | Integer |
| 12 | `totalAckUnExecutedQty` | 累计确认不执行数量 | `ftotalAckUnExecutedQty` | Decimal |
| 13 | `paymentSchedulesId` | 采购订单付款计划子表ID | `ipaymentSchedulesId` | Long |
| 14 | `startDateTime` | 起算日 | `iStartDateTime` | DateTime |
| 15 | `expiringDateTime` | 到期日 | `iExpiringDateTime` | DateTime |
| 16 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 17 | `id` | ID | `id` | Long |
| 18 | `purordersProgressAck` | 采购付款进度确认孙表ID | `purorders_progressack` | Long |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |
| 20 | `startDate` | 付款起算时点 | `iStartDate` | a4a03d83-ea92-422d-9f64-b5f18f26a4a9 |
| 21 | `executedStatus` | 执行状态 | `executedStatus` | Integer |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `saleOrderPayId` | 销售订单付款计划子表ID | `cpu-order.saleorder.SaleOrderPayTermVO` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `detailId` | 销售订单子表ID | `cpu-order.saleorder.SaleOrderDetailVO` | None | true |
| 4 | `startDate` | 付款起算时点 | `bd.payments.PayStartBase` | Service |  |
