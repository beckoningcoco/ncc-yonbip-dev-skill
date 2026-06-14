---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.saleorderchange.SaleOrdersPaymentProgressAckChange"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售订单进度确认执行变更孙表 (`cpu-order.saleorderchange.SaleOrdersPaymentProgressAckChange`)

> ycSaleCoor | 物理表：`cpu_saleorders_paymentprogressack_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售订单进度确认执行变更孙表 |
| 物理表 | `cpu_saleorders_paymentprogressack_change` |
| domain/服务域 | `cpu-order` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:33:00.6040` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（27个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `purOrdersId` | 采购订单子表ID | `purorders_id` | Long |
| 2 | `detailId` | 销售订单子表ID | `sale_order_detail_id` | 5fb7781a-74b1-4980-8261-0a9878c38f7b |
| 3 | `totalAckExecutedQty` | 累计确认已执行数量 | `ftotalAckExecutedQty` | Decimal |
| 4 | `dr` | 逻辑删除标记 | `dr` | Short |
| 5 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 6 | `number` | 期号 | `iNumber` | Integer |
| 7 | `paymentSchedulesId` | 采购订单付款计划子表ID | `ipaymentSchedulesId` | Long |
| 8 | `id` | ID | `id` | Long |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime |
| 10 | `purOrdersModify` | 采购订单变更单子表 | `purorders_modify` | Long |
| 11 | `executedStatus` | 执行状态 | `executedStatus` | Integer |
| 12 | `rowno` | 序号 | `rowno` | Integer |
| 13 | `saleOrderPayId` | 销售订单付款计划子表ID | `sale_order_pay_id` | aeddca26-5275-4d1b-9de2-681a69c618f4 |
| 14 | `totalAckExecutedMoney` | 累计执行金额 | `fTotalAckExecutedMoney` | Decimal |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 16 | `paymentSchedulesModify` | 采购订单付款计划变更子表ID | `ipaymentSchedules_modifyId` | Long |
| 17 | `purOrdersProgressAckModify` | 采购付款进度确认变更孙表ID | `purorders_progressack_modify` | Long |
| 18 | `totalAckQty` | 累计确认数量 | `ftotalAckQty` | Decimal |
| 19 | `totalAckUnExecutedQty` | 累计确认不执行数量 | `ftotalAckUnExecutedQty` | Decimal |
| 20 | `startDateTime` | 起算日 | `iStartDateTime` | DateTime |
| 21 | `expiringDateTime` | 到期日 | `iExpiringDateTime` | DateTime |
| 22 | `saleOrderPayChangeId` | 销售订单付款计划变更表ID | `sale_orderpay_change_id` | 03906bae-0c23-4bd8-82a5-a7c66812754b |
| 23 | `saleDetailChangeId` | 销售订单变更子表ID | `sale_detail_change_id` | 3e4ed587-ba2b-4f00-9f28-d1b58c972250 |
| 24 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 25 | `purordersProgressAck` | 采购付款进度确认孙表ID | `purorders_progressack` | Long |
| 26 | `startDate` | 付款起算时点 | `iStartDate` | a4a03d83-ea92-422d-9f64-b5f18f26a4a9 |
| 27 | `saleOrderProgressAckId` | 销售订单进度确认执行孙表ID | `sale_progressack_id` | 8a4787fc-f267-4e90-b81a-1cd9c245f580 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `saleOrderProgressAckId` | 销售订单进度确认执行孙表ID | `cpu-order.saleorder.SaleOrdersPaymentProgressAck` | None |  |
| 2 | `saleOrderPayId` | 销售订单付款计划子表ID | `cpu-order.saleorder.SaleOrderPayTermVO` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `saleOrderPayChangeId` | 销售订单付款计划变更表ID | `cpu-order.saleorderchange.SaleOrderPayTermChangeVO` | None |  |
| 5 | `saleDetailChangeId` | 销售订单变更子表ID | `cpu-order.saleorderchange.SaleOrderDetailChangeVO` | None | true |
| 6 | `detailId` | 销售订单子表ID | `cpu-order.saleorder.SaleOrderDetailVO` | None |  |
| 7 | `startDate` | 付款起算时点 | `bd.payments.PayStartBase` | Service |  |
