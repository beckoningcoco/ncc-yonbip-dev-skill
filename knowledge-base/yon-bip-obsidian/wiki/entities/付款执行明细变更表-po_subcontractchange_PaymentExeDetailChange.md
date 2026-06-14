---
tags: ["BIP", "元数据", "数据字典", "OSM", "po.subcontractchange.PaymentExeDetailChange"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 付款执行明细变更表 (`po.subcontractchange.PaymentExeDetailChange`)

> OSM | 物理表：`osm_paymentexedetail_change`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 付款执行明细变更表 |
| 物理表 | `osm_paymentexedetail_change` |
| domain/服务域 | `productionorder` |
| 所属应用 | `OSM` |
| 构建时间 | `2026-06-05 09:56:22.3340` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（48个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `copyStartBaseDate` | 备用起算日 | `copyStartBaseDate` | DateTime |
| 2 | `expiringDateTime` | 到期日 | `iExpiringDateTime` | DateTime |
| 3 | `firstsource` | 源头单据类型 | `firstsource` | String |
| 4 | `firstsourceautoid` | 源头单据子表id | `firstsourceautoid` | Long |
| 5 | `firstsourceid` | 源头单据主表id | `firstsourceid` | Long |
| 6 | `firstupcode` | 源头单据号 | `firstupcode` | String |
| 7 | `fixAccoutDateTime` | 出账日 | `iFixAccoutDateTime` | DateTime |
| 8 | `freeCharacteristics` | 自由项特征组 | `free_cts` | a69e9a50-bde6-4402-9b4a-2cbe66a69974 |
| 9 | `id` | id | `id` | Long |
| 10 | `inInvoiceOrg` | 收票组织 | `accentity` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 |
| 11 | `isAdvancePay` | 是否预付 | `isAdvancePay` | Boolean |
| 12 | `lineNo` | 行号 | `line_no` | Decimal |
| 13 | `number` | 期号 | `iorder` | Integer |
| 14 | `orderId` | 订单id | `order_id` | dadfc2eb-7638-4b21-95b9-e274fb4fe84d |
| 15 | `orderproductchangeid` | 订单产品变更id | `orderproductchangeid` | 874c6c6f-0c0e-4582-800e-77098c273c53 |
| 16 | `orderproductid` | 订单产品id | `orderproductid` | 7d39c327-90bf-4f63-b030-c953035dd99e |
| 17 | `originalId` | 原单付款执行明细id | `original_exedetail_id` | 446f3e8f-f404-458b-8f00-f701b59f384a |
| 18 | `originalOrderId` | 原单id | `original_order_id` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 19 | `payMoney` | 应付金额 | `payMoney` | Decimal |
| 20 | `payNatMoney` | 本币应付金额 | `iPayNatMoney` | Decimal |
| 21 | `payRatio` | 付款比例 | `payRatio` | Decimal |
| 22 | `period` | 阶段 | `startBase` | String |
| 23 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime |
| 25 | `requestedPaymentFC` | 累计付款申请金额(本币) | `requested_payment_fc` | Decimal |
| 26 | `requestedPaymentTC` | 累计付款申请金额(交易币) | `requested_payment_tc` | Decimal |
| 27 | `schedulesid` | 付款计划id | `schedulesid` | Long |
| 28 | `startColumn` | 起算字段 | `startColumn` | String |
| 29 | `startDateTime` | 起算日 | `iStartDateTime` | DateTime |
| 30 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 31 | `totalPayNatMoney` | 累计付款核销金额(本币) | `total_pay_nat_money` | Decimal |
| 32 | `totalPayOriMoney` | 累计付款核销金额(交易币) | `total_pay_ori_money` | Decimal |
| 33 | `totalPaymentFC` | 累计付款金额(本币) | `total_payment_fc` | Decimal |
| 34 | `totalPaymentTC` | 累计付款金额(交易币) | `total_payment_tc` | Decimal |
| 35 | `vouchNo` | 单据行号 | `vouchNo` | String |
| 36 | `vouchcode` | 单据编号 | `vouchcode` | String |
| 37 | `vouchid` | 单据主表id | `vouchid` | Long |
| 38 | `vouchsubid` | 单据子表id | `vouchsubid` | Long |
| 39 | `vouchtype` | 单据类型 | `vouchtype` | String |
| 40 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 41 | `adjustMoney` | 应付调整金额 | `adjust_money` | Decimal |
| 42 | `payMoneyRatio` | 应付金额(原有付款比例) | `pay_money_ratio` | Decimal |
| 43 | `payedStatus` | 付款状态 | `payed_status` | Integer |
| 44 | `paymentProcessTotalFc` | 本币付款流程总金额 | `payment_process_total_fc` | Decimal |
| 45 | `paymentProcessTotalTc` | 付款流程总金额 | `payment_process_total_tc` | Decimal |
| 46 | `qty` | 计价数量 | `qty` | Decimal |
| 47 | `sourceautoid` | 来源单据子表id | `sourceautoid` | Long |
| 48 | `writeOffStatus` | 冲销状态 | `write_off_status` | Short |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `originalOrderId` | 原单id | `po.order.Order` | None |  |
| 2 | `freeCharacteristics` | 自由项特征组 | `po.order.ProductFreeCharacteristics` | None |  |
| 3 | `inInvoiceOrg` | 收票组织 | `aa.baseorg.FinanceOrgMV` | Service |  |
| 4 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 5 | `orderId` | 订单id | `po.subcontractchange.OsmOrderChange` | None | true |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `orderproductid` | 订单产品id | `osm.OSMOrder.OSMOrderProduct` | None |  |
| 8 | `orderproductchangeid` | 订单产品变更id | `po.subcontractchange.OsmOrderProductChange` | None |  |
| 9 | `originalId` | 原单付款执行明细id | `po.order.PaymentExeDetail` | None |  |
| 10 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
