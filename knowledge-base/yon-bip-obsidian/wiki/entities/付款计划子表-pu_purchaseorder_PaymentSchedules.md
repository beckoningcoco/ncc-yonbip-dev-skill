---
tags: ["BIP", "元数据", "数据字典", "PU", "pu.purchaseorder.PaymentSchedules"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 付款计划子表 (`pu.purchaseorder.PaymentSchedules`)

> PU | 物理表：`pu_paymentschedules`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 付款计划子表 |
| 物理表 | `pu_paymentschedules` |
| domain/服务域 | `upu` |
| schema | `upurchase` |
| 所属应用 | `PU` |
| 构建时间 | `2026-06-04 23:31:53.0720` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 行号 |

---

## 直接属性（40个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `payNatSum` | 本币付款总金额 | `iPayNatSum` | Decimal |
| 2 | `number` | 期号 | `iNumber` | Integer |
| 3 | `name` | 付款名称 | `iName` | String |
| 4 | `payRatio` | 付款比例 | `iPayRatio` | Decimal |
| 5 | `contracTotalPayAmount` | 合同预付款 | `contracTotalPayAmount` | Decimal |
| 6 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 7 | `amount` | 应付金额 | `iAmount` | Decimal |
| 8 | `payNatMoney` | 本币应付金额 | `iPayNatMoney` | Decimal |
| 9 | `startDate` | 起算时点id | `iStartDate` | a4a03d83-ea92-422d-9f64-b5f18f26a4a9 |
| 10 | `needPaymentAck` | 需进度确认 | `needPaymentAck` | Boolean |
| 11 | `startDateTime` | 起算日 | `iStartDateTime` | DateTime |
| 12 | `fixAccoutDayTwo` | 固定出账日2 | `iFixAccoutDayTwo` | Integer |
| 13 | `delayDay` | 起算日延迟日 | `iDelayDay` | Integer |
| 14 | `fixAccoutDayThree` | 固定出账日3 | `iFixAccoutDayThree` | Integer |
| 15 | `delayMonth` | 起算日延迟月 | `iDelayMonth` | Integer |
| 16 | `fixAccoutDayFour` | 固定出账日4 | `iFixAccoutDayFour` | Integer |
| 17 | `accountDay` | 账期 | `iAccountDay` | Integer |
| 18 | `fixExpireDayOne` | 固定到期日1 | `iFixExpireDayOne` | Integer |
| 19 | `fixedoaday` | 固定出账日 | `fixedoaday` | Integer |
| 20 | `accountUnit` | 账期单位 | `iAccountUnit` | DateUnit |
| 21 | `fixExpireDayTwo` | 固定到期日2 | `iFixExpireDayTwo` | Integer |
| 22 | `accountType` | 账期类型 | `iAccounType` | AccountType |
| 23 | `fixExpireDayThree` | 固定到期日3 | `iFixExpireDayThree` | Integer |
| 24 | `fixAccoutDateTime` | 出账日 | `iFixAccoutDateTime` | DateTime |
| 25 | `fixExpireDayFour` | 固定到期日4 | `iFixExpireDayFour` | Integer |
| 26 | `fixedexpireday` | 固定到期日 | `fixedexpireday` | Integer |
| 27 | `expiringDateTime` | 到期日 | `iExpiringDateTime` | DateTime |
| 28 | `rowno` | 行号 | `rowno` | Integer |
| 29 | `paidAmount` | 累计付款核销金额 | `iPaidAmount` | Decimal |
| 30 | `mainid` | 采购订单主表 | `iMainId` | ae75b080-0515-44b5-a9b3-d154d498325b |
| 31 | `totalApplyPaymentAmount` | 累计付款申请金额 | `total_apply_payment_amount` | Decimal |
| 32 | `isAdvancePay` | 预付款 | `isAdvancePay` | Boolean |
| 33 | `totalPayAmount` | 累计付款金额 | `totalPayAmount` | Decimal |
| 34 | `fixAccoutDayOne` | 固定出账日1 | `iFixAccoutDayOne` | Integer |
| 35 | `id` | ID | `id` | Long |
| 36 | `settlemethod` | 结算方式id | `iSettleMethodId` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff |
| 37 | `pubts` | 时间戳 | `pubts` | DateTime |
| 38 | `prePayType` | 预付折算方式 | `prePayType` | Integer |
| 39 | `isRetentionMoney` | 是否质保金 | `isRetentionMoney` | Boolean |
| 40 | `beginningAmount` | 期初付款金额 | `beginning_pay_amount` | Decimal |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `settlemethod` | 结算方式id | `aa.settlemethod.SettleMethod` | Service |  |
| 3 | `mainid` | 采购订单主表 | `pu.purchaseorder.PurchaseOrder` | None | true |
| 4 | `startDate` | 起算时点id | `bd.payments.PayStartBase` | Service |  |
