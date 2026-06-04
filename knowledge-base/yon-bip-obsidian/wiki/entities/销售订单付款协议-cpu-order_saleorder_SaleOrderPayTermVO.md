---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.saleorder.SaleOrderPayTermVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售订单付款协议 (`cpu-order.saleorder.SaleOrderPayTermVO`)

> ycSaleCoor | 物理表：`cpu_sale_order_pay_term`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售订单付款协议 |
| 物理表 | `cpu_sale_order_pay_term` |
| 数据库 schema | `cpu-order` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:29.6640` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（30个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` |  | `dr` | Integer |
| 2 | `ts` |  | `ts` | DateTime |
| 3 | `payPeriod` | 付款阶段 | `pay_period` | Integer |
| 4 | `needPaymentAck` | 需进度确认 | `needPaymentAck` | Boolean |
| 5 | `pubts` |  | `ts` | DateTime |
| 6 | `payName` | 付款名称 | `pay_name` | String |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 8 | `delayMonth` | 起算延迟月 | `iDelayMonth` | Integer |
| 9 | `accountUnit` | 账期单位 | `account_unit` | String |
| 10 | `startDateTime` | 起算日 | `iStartDateTime` | DateTime |
| 11 | `expiringDateTime` | 到期日 | `iExpiringDateTime` | DateTime |
| 12 | `delayDay` | 起算延迟日 | `iDelayDay` | Integer |
| 13 | `payPointName` | 付款起点 | `pay_point_name` | String |
| 14 | `payPointAfterDay` | 账期天数 | `pay_point_after_day` | Integer |
| 15 | `payRatio` | 付款比例 | `pay_ratio` | Decimal |
| 16 | `payTaxMoney` | 付款金额 | `pay_tax_money` | Decimal |
| 17 | `advancePay` | 是否预付款 | `advance_pay` | Boolean |
| 18 | `shelf` | 是否质保金 | `shelf` | Boolean |
| 19 | `settleTypeName` | 结算方式 | `settle_type_name` | String |
| 20 | `memo` | 备注 | `memo` | String |
| 21 | `enterpriseName` | 供应商 | `enterprise_name` | String |
| 22 | `payPoint` | 付款起点 | `pay_point` | String |
| 23 | `settleType` | 结算方式 | `settle_type` | String |
| 24 | `id` | ID | `id` | Long |
| 25 | `saleOrderId` | 销售订单 | `sale_order_id` | 411548cf-a4fa-45ff-934f-06be5c9ddd04 |
| 26 | `enterpriseId` | 租户 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 27 | `payTermDetailId` | 外系统付款协议子表id | `pay_term_detail_id` | String |
| 28 | `sourcePayTermId` | 上游单据付款协议子表id | `source_pay_term_id` | Long |
| 29 | `purOrderPayTermId` | 采购付款协议子表id | `pur_order_pay_term_id` | Long |
| 30 | `rowStatus` | 修改状态 | `row_status` | String |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `saleOrderId` | 销售订单 | `cpu-order.saleorder.SaleOrderVO` | None | true |
| 3 | `enterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
