---
tags: ["BIP", "元数据", "数据字典", "PO", "po.order.PaymentSchedules"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 付款计划表 (`po.order.PaymentSchedules`)

> PO | 物理表：`osm_paymentschedules`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 付款计划表 |
| 物理表 | `osm_paymentschedules` |
| domain/服务域 | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:23:24.9050` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（37个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `accountDay` | 账期 | `iAccountDay` | Integer |
| 2 | `accountType` | 账期类型 | `iAccounType` | String |
| 3 | `accountUnit` | 账期单位 | `iAccountUnit` | String |
| 4 | `amount` | 应付金额 | `iAmount` | Decimal |
| 5 | `delayDay` | 起算日延迟日 | `iDelayDay` | Integer |
| 6 | `delayMonth` | 起算日延迟月 | `iDelayMonth` | Integer |
| 7 | `expiringDateTime` | 到期日 | `iExpiringDateTime` | DateTime |
| 8 | `fixAccoutDateTime` | 出账日 | `iFixAccoutDateTime` | DateTime |
| 9 | `fixAccoutDay` | 固定出账日 | `iFixAccoutDay` | Integer |
| 10 | `fixAccoutDayFour` | 固定出账日4 | `iFixAccoutDayFour` | Integer |
| 11 | `fixAccoutDayOne` | 固定出账日1 | `iFixAccoutDayOne` | Integer |
| 12 | `fixAccoutDayThree` | 固定出账日3 | `iFixAccoutDayThree` | Integer |
| 13 | `fixAccoutDayTwo` | 固定出账日2 | `iFixAccoutDayTwo` | Integer |
| 14 | `fixExpireDay` | 固定到期日 | `fixExpireDay` | Integer |
| 15 | `fixExpireDayFour` | 固定到期日4 | `iFixExpireDayFour` | Integer |
| 16 | `fixExpireDayOne` | 固定到期日1 | `iFixExpireDayOne` | Integer |
| 17 | `fixExpireDayThree` | 固定到期日3 | `iFixExpireDayThree` | Integer |
| 18 | `fixExpireDayTwo` | 固定到期日2 | `iFixExpireDayTwo` | Integer |
| 19 | `id` | ID | `id` | Long |
| 20 | `isAdvancePay` | 是否预付 | `isAdvancePay` | Boolean |
| 21 | `isRetentionMoney` | 是否质保金 | `isRetentionMoney` | Boolean |
| 22 | `lineNo` | 行号 | `line_no` | Decimal |
| 23 | `name` | 付款名称 | `iName` | String |
| 24 | `number` | 期号 | `iNumber` | Integer |
| 25 | `orderId` | 委外订单id | `orderId` | b80026c8-0517-4255-aca1-b7f374771eb6 |
| 26 | `paidAmount` | 累计付款核销金额 | `iPaidAmount` | Decimal |
| 27 | `payNatMoney` | 本币付款金额 | `iPayNatMoney` | Decimal |
| 28 | `payRatio` | 付款比例 | `iPayRatio` | Decimal |
| 29 | `prePayType` | 折算方式 | `prePayType` | Integer |
| 30 | `pubts` | 时间戳 | `pubts` | DateTime |
| 31 | `settlemethod` | 结算方式 | `iSettleMethodId` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff |
| 32 | `startDate` | 起算时点 | `iStartDate` | a4a03d83-ea92-422d-9f64-b5f18f26a4a9 |
| 33 | `startDateTime` | 起算日 | `iStartDateTime` | DateTime |
| 34 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 35 | `totalPayAmount` | 累计付款金额 | `totalPayAmount` | Decimal |
| 36 | `totalPayNATMoney` | 本币累计付款核销金额 | `fTotalPayNATMoney` | Decimal |
| 37 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `orderId` | 委外订单id | `po.order.Order` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `settlemethod` | 结算方式 | `aa.settlemethod.SettleMethod` | Service |  |
| 4 | `startDate` | 起算时点 | `bd.payments.PayStartBase` | Service |  |
| 5 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
