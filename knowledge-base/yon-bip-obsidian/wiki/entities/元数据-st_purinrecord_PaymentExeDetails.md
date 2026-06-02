---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, st.purinrecord.PaymentExeDetails]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 付款执行明细孙表(新架构) (`st.purinrecord.PaymentExeDetails`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `st_paymentexedetail` | 应用: `ST`

## 属性（30 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `copyStartBaseDate` | copyStartBase日期 | `copyStartBaseDate` | DateTime | `timestamp` |
| 2 | `expireDate` | expire日期 | `expireDate` | Date | `date` |
| 3 | `firstsourceautoid` | firstsourceautoid | `firstsourceautoid` | Long | `long` |
| 4 | `id` | ID | `id` | Long | `long` |
| 5 | `inInvoiceOrg` | inInvoiceOrg | `inInvoiceOrg` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 | `quote` |
| 6 | `isAdvancePay` | 是否AdvancePay | `isAdvancePay` | Boolean | `switch` |
| 7 | `isRetentionMoney` | 是否RetentionMoney | `isRetentionMoney` | Boolean | `switch` |
| 8 | `mainid` | mainid | `iMainId` | da282394-f665-4148-b271-97b57607779a | `quote` |
| 9 | `order` | order | `iNumber` | Integer | `int` |
| 10 | `paidMoney` | paidMoney | `paidMoney` | Decimal | `number` |
| 11 | `paidNatMoney` | paidNatMoney | `paidNatMoney` | Decimal | `number` |
| 12 | `payMoney` | payMoney | `payMoney` | Decimal | `number` |
| 13 | `payNatMoney` | payNatMoney | `payNatMoney` | Decimal | `number` |
| 14 | `payNatSum` | payNatSum | `payNatSum` | Decimal | `number` |
| 15 | `payRatio` | payRatio | `payRatio` | Decimal | `number` |
| 16 | `paySum` | paySum | `paySum` | Decimal | `number` |
| 17 | `period` | period | `period` | String | `text` |
| 18 | `prePayType` | prePayType | `prePayType` | Integer | `int` |
| 19 | `product` | product | `iProductid` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 20 | `productsku` | productsku | `iProductSkuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 21 | `settlemethod` | settlemethod | `iSettleMethodId` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff | `quote` |
| 22 | `startDateTime` | startDateTime | `startDateTime` | Date | `date` |
| 23 | `totalPayAmount` | totalPayAmount | `totalPayAmount` | Decimal | `number` |
| 24 | `vouchcode` | vouchcode | `vouchcode` | String | `text` |
| 25 | `vouchid` | vouchid | `vouchid` | Long | `long` |
| 26 | `vouchsubid` | vouchsubid | `vouchsubid` | Long | `long` |
| 27 | `vouchtype` | vouchtype | `vouchtype` | String | `text` |
| 28 | `writeBackNatSum` | writeBackNatSum | `writeBackNatSum` | Decimal | `number` |
| 29 | `writeBackSum` | writeBackSum | `writeBackSum` | Decimal | `number` |
| 30 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（6 个）

- `product` -> `pc.product.Product` () 
- `productsku` -> `pc.product.ProductSKU` () 
- `inInvoiceOrg` -> `aa.baseorg.FinanceOrgMV` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `settlemethod` -> `aa.settlemethod.SettleMethod` () 
- `mainid` -> `st.purinrecord.PurInRecords` (0..n) 
