---
tags: [BIP, 元数据, 数据字典, aa.paymentmethod.PaymentMethod]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收款方式 (`aa.paymentmethod.PaymentMethod`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_payment_method` | 应用: `RM` | 类型: `Class`

## 属性（39 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `creator` | 创建人 | `creator` | String | `text` |
| 2 | `code` | 编码 | `code` | String | `text` |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 4 | `modifier` | 修改人 | `modifier` | String | `text` |
| 5 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 6 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 7 | `id` | ID | `id` | Long | `long` |
| 8 | `name` | 名称 | `name` | String | `multiLanguage` |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 10 | `paymentType` | paymentType | `paymentType` | Short | `short` |
| 11 | `cOnlinePaymethod` | cOnlinePaymethod | `cOnlinePaymethod` | String | `text` |
| 12 | `iconType` | iconType | `iconType` | String | `text` |
| 13 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 14 | `settlementName` | settlement名称 | `settlementName` | String | `text` |
| 15 | `settlementId` | settlementID | `settlementId` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 16 | `cCurrencyId` | cCurrencyID | `cCurrencyId` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |
| 17 | `cCurrencyName` | cCurrency名称 | `cCurrencyName` | String | `text` |
| 18 | `fExchangeSettleAmount` | fExchangeSettleAmount | `fExchangeSettleAmount` | Decimal | `number` |
| 19 | `isDefault` | 是否Default | `isDefault` | Boolean | `switch` |
| 20 | `isPayment` | 是否Payment | `isPayment` | Boolean | `switch` |
| 21 | `isOpenCashDrawer` | 是否OpenCashDrawer | `isOpenCashDrawer` | Boolean | `switch` |
| 22 | `isOpening` | 是否Opening | `isOpening` | Boolean | `switch` |
| 23 | `iPoint` | iPoint | `iPoint` | Boolean | `switch` |
| 24 | `isPublishInvoice` | 是否PublishInvoice | `isPublishInvoice` | Boolean | `switch` |
| 25 | `enableState` | enableState | `enableState` | String | `text` |
| 26 | `isUsedToPC` | 是否UsedToPC | `isUsedToPC` | Boolean | `switch` |
| 27 | `isQuick` | 是否Quick | `isQuick` | Boolean | `switch` |
| 28 | `isUsedToMobile` | 是否UsedToMobile | `isUsedToMobile` | Boolean | `switch` |
| 29 | `isMobileQuick` | 是否MobileQuick | `isMobileQuick` | Boolean | `switch` |
| 30 | `cCurrencyERPCode` | cCurrencyERP编码 | `cCurrencyERPCode` | String | `text` |
| 31 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 32 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 33 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 34 | `paymentCategoryId` | paymentCategoryID | `paymentCategoryId` | 34ffd457-7a79-46da-8167-b23484b3ec1a | `quote` |
| 35 | `paymentMethodCoupon` | paymentMethodCoupon | `` | 541ea1e7-680d-423f-bc35-cfcf7076da72 | `` |
| 36 | `paymentMethodStore` | paymentMethodStore | `` | 4691164a-f711-40b8-85ac-1d93ff9c942a | `` |
| 37 | `paymentMethodWallet` | paymentMethodWallet | `` | a63c589f-16c8-48c3-8dd0-b53b722d619a | `` |
| 38 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 39 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（10 个）

- `paymentMethodStore` -> `aa.paymentmethod.PaymentMethodStore` (0..n)
- `paymentMethodWallet` -> `aa.paymentmethod.PaymentMethodWallet` (0..n)
- `paymentCategoryId` -> `aa.paymentmethod.PaymentCategory` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `paymentMethodCoupon` -> `aa.paymentmethod.PaymentMethodCoupon` (0..n)
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `cCurrencyId` -> `bd.currencytenant.CurrencyTenantVO` ()
- `settlementId` -> `aa.settlemethod.SettleMethod` ()
- `tenant` -> `base.tenant.Tenant` ()
