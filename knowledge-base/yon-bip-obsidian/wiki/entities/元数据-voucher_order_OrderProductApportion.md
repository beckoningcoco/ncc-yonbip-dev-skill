---
tags: [BIP, 元数据, 数据字典, voucher.order.OrderProductApportion]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 订单分摊 (`voucher.order.OrderProductApportion`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `orderproductapportion` | 应用: `SCMSA` | 类型: `Class`

## 属性（22 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `apportionAttr` | apportionAttr | `cApportionAttr` | String | `text` |
| 2 | `apportionMoney` | apportionMoney | `fApportionMoney` | Decimal | `number` |
| 3 | `apportionName` | apportion名称 | `cApportionName` | String | `text` |
| 4 | `apportionNum` | apportionNum | `fApportionNum` | Decimal | `number` |
| 5 | `apportionType` | apportionType | `cApportionType` | String | `text` |
| 6 | `detailSkuId` | detailSkuID | `iDetailSkuId` | Long | `long` |
| 7 | `discount` | discount | `iDiscount` | Decimal | `number` |
| 8 | `enableMaxPreferential` | enableMaxPreferential | `bEnableMaxPreferential` | Boolean | `switch` |
| 9 | `entityPreType` | entityPreType | `iEntityPreType` | Short | `short` |
| 10 | `hide` | hide | `bHide` | Boolean | `switch` |
| 11 | `id` | ID | `id` | Long | `long` |
| 12 | `orderDetailId` | orderDetailID | `iOrderDetailId` | 3722d563-08aa-453d-ac82-6b8cf906b1ab | `quote` |
| 13 | `orderId` | orderID | `iOrderId` | Long | `long` |
| 14 | `orderNo` | orderNo | `cOrderNo` | String | `text` |
| 15 | `overlimit` | overlimit | `bOverlimit` | Boolean | `switch` |
| 16 | `preId` | preID | `iPreId` | Long | `long` |
| 17 | `proId` | proID | `iProId` | Long | `long` |
| 18 | `productType` | productType | `cProductType` | String | `text` |
| 19 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |
| 20 | `type` | type | `pType` | Integer | `int` |
| 21 | `uordercorp` | uordercorp | `iCorpId` | Long | `long` |
| 22 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（2 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `orderDetailId` -> `voucher.order.OrderDetail` (0..n)
