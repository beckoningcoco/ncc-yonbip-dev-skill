---
tags: ["BIP", "元数据", "数据字典", "PO", "po.order.PaymentExeDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 付款执行明细 (`po.order.PaymentExeDetail`)

> PO | 物理表：`osm_paymentexedetail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 付款执行明细 |
| 物理表 | `osm_paymentexedetail` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:23:23.4710` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（45个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `adjustMoney` | 应付调整金额 | `adjust_money` | Decimal |
| 2 | `copyStartBaseDate` | 备用起算日 | `copyStartBaseDate` | DateTime |
| 3 | `expiringDateTime` | 到期日 | `iExpiringDateTime` | DateTime |
| 4 | `firstsource` | 源头单据类型 | `firstsource` | String |
| 5 | `firstsourceautoid` | 源头单据子表id | `firstsourceautoid` | Long |
| 6 | `firstsourceid` | 源头单据主表id | `firstsourceid` | Long |
| 7 | `firstupcode` | 源头单据号 | `firstupcode` | String |
| 8 | `fixAccoutDateTime` | 出账日 | `iFixAccoutDateTime` | DateTime |
| 9 | `freeCharacteristics` | 自由项特征组 | `free_cts` | a69e9a50-bde6-4402-9b4a-2cbe66a69974 |
| 10 | `id` | ID | `id` | Long |
| 11 | `inInvoiceOrg` | 收票组织 | `accentity` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 |
| 12 | `isAdvancePay` | 是否预付 | `isAdvancePay` | Boolean |
| 13 | `lineNo` | 行号 | `line_no` | Decimal |
| 14 | `number` | 期号 | `iorder` | Integer |
| 15 | `orderId` | 委外订单id | `orderId` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 16 | `orderproductid` | 订单产品id | `orderproductid` | 8eadf170-a715-41e1-b654-51ef707f7e90 |
| 17 | `payMoney` | 应付金额 | `payMoney` | Decimal |
| 18 | `payMoneyRatio` | 应付金额(原有付款比例) | `pay_money_ratio` | Decimal |
| 19 | `payNatMoney` | 本币应付金额 | `iPayNatMoney` | Decimal |
| 20 | `payRatio` | 付款比例 | `payRatio` | Decimal |
| 21 | `payedStatus` | 付款状态 | `payed_status` | Integer |
| 22 | `paymentProcessTotalFc` | 本币付款流程总金额 | `payment_process_total_fc` | Decimal |
| 23 | `paymentProcessTotalTc` | 付款流程总金额 | `payment_process_total_tc` | Decimal |
| 24 | `period` | 阶段 | `startBase` | String |
| 25 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 26 | `pubts` | 时间戳 | `pubts` | DateTime |
| 27 | `qty` | 计价数量 | `qty` | Decimal |
| 28 | `requestedPaymentFC` | 累计付款申请金额(本币) | `requested_payment_fc` | Decimal |
| 29 | `requestedPaymentTC` | 累计付款申请金额(交易币) | `requested_payment_tc` | Decimal |
| 30 | `schedulesid` | 付款计划id | `schedulesid` | Long |
| 31 | `sourceautoid` | 来源单据子表id | `sourceautoid` | Long |
| 32 | `startColumn` | 起算字段 | `startColumn` | String |
| 33 | `startDateTime` | 起算日 | `iStartDateTime` | DateTime |
| 34 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 35 | `totalPayNatMoney` | 累计付款核销金额(本币) | `total_pay_nat_money` | Decimal |
| 36 | `totalPayOriMoney` | 累计付款核销金额(交易币) | `total_pay_ori_money` | Decimal |
| 37 | `totalPaymentFC` | 累计付款金额(本币) | `total_payment_fc` | Decimal |
| 38 | `totalPaymentTC` | 累计付款金额(交易币) | `total_payment_tc` | Decimal |
| 39 | `vouchNo` | 单据行号 | `vouchNo` | String |
| 40 | `vouchcode` | 单据编号 | `vouchcode` | String |
| 41 | `vouchid` | 单据主表id | `vouchid` | Long |
| 42 | `vouchsubid` | 单据子表id | `vouchsubid` | Long |
| 43 | `vouchtype` | 单据类型 | `vouchtype` | String |
| 44 | `writeOffStatus` | 冲销状态 | `write_off_status` | Short |
| 45 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `freeCharacteristics` | 自由项特征组 | `po.order.ProductFreeCharacteristics` | None |  |
| 2 | `inInvoiceOrg` | 收票组织 | `aa.baseorg.FinanceOrgMV` | Service |  |
| 3 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 4 | `orderId` | 委外订单id | `po.order.Order` | None | true |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `orderproductid` | 订单产品id | `po.order.OrderProduct` | None |  |
| 7 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
