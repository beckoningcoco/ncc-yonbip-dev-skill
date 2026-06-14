---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.saleorderchange.SaleOrderPayTermChangeVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售订单变更付款协议 (`cpu-order.saleorderchange.SaleOrderPayTermChangeVO`)

> ycSaleCoor | 物理表：`cpu_sale_order_payterm_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售订单变更付款协议 |
| 物理表 | `cpu_sale_order_payterm_change` |
| domain/服务域 | `cpu-order` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:36.4220` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（35个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `payPeriod` | 付款阶段 | `pay_period` | Integer |
| 2 | `payPointName` | 付款起点 | `pay_point_name` | String |
| 3 | `payPointAfterDay` | 账期 | `pay_point_after_day` | Integer |
| 4 | `payRatio` | 付款比例 | `pay_ratio` | Decimal |
| 5 | `payTaxMoney` | 付款金额 | `pay_tax_money` | Decimal |
| 6 | `advancePay` | 是否预付款 | `advance_pay` | Boolean |
| 7 | `shelf` | 是否质保金 | `shelf` | Boolean |
| 8 | `settleTypeName` | 结算方式 | `settle_type_name` | String |
| 9 | `memo` | 备注 | `memo` | String |
| 10 | `accountUnit` | 账期单位 | `account_unit` | String |
| 11 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 12 | `payPoint` | 付款起点 | `pay_point` | String |
| 13 | `settleType` | 结算方式 | `settle_type` | String |
| 14 | `id` | ID | `id` | Long |
| 15 | `saleOrderId` | 销售订单 | `sale_order_id` | 411548cf-a4fa-45ff-934f-06be5c9ddd04 |
| 16 | `enterpriseId` | 租户 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 17 | `payTermDetailId` | 外系统付款协议子表id | `pay_term_detail_id` | String |
| 18 | `sourcePayTermId` | 上游单据付款协议子表id | `source_pay_term_id` | Long |
| 19 | `purOrderPayTermId` | 采购付款协议子表id | `pur_order_pay_term_id` | Long |
| 20 | `rowStatus` | 修改状态 | `row_status` | String |
| 21 | `delayDay` | 起算延迟日 | `iDelayDay` | Integer |
| 22 | `delayMonth` | 起算延迟月 | `iDelayMonth` | Integer |
| 23 | `dr` | 逻辑删除标记 | `dr` | Short |
| 24 | `expiringDateTime` | 到期日 | `iExpiringDateTime` | DateTime |
| 25 | `needPaymentAck` | 需进度确认 | `needPaymentAck` | Boolean |
| 26 | `payName` | 付款名称 | `pay_name` | String |
| 27 | `pubts` |  | `ts` | DateTime |
| 28 | `purChangeId` | 采购订单变更主表 | `pur_change_id` | Long |
| 29 | `purPayChangeId` | 采购订单变更付款协议 | `pur_paychange_id` | Long |
| 30 | `saleOrderChangeId` | 销售订单变更主表 | `sale_order_change_id` | 885ed154-e570-4cd5-a2ac-d9fdbe34f93d |
| 31 | `salePayId` | 销售订单付款协议 | `sale_pay_id` | Long |
| 32 | `startDateTime` | 起算日 | `iStartDateTime` | DateTime |
| 33 | `ts` |  | `ts` | DateTime |
| 34 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 35 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `saleOrderChangeId` | 销售订单变更主表 | `cpu-order.saleorderchange.SaleOrderChangeVO` | None | true |
| 3 | `saleOrderId` | 销售订单 | `cpu-order.saleorder.SaleOrderVO` | None |  |
| 4 | `enterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
