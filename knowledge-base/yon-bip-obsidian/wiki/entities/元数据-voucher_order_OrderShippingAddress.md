---
tags: [BIP, 元数据, 数据字典, voucher.order.OrderShippingAddress]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 订单收货地址 (`voucher.order.OrderShippingAddress`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `orders_shippingaddress` | 应用: `SCMSA` | 类型: `Class`

## 属性（18 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `address` | address | `cAddress` | String | `text` |
| 2 | `area` | area | `cArea` | String | `text` |
| 3 | `city` | city | `cCity` | String | `text` |
| 4 | `code` | 编码 | `cOrderNo` | String | `text` |
| 5 | `country` | country | `cCountry` | String | `text` |
| 6 | `email` | email | `cEmail` | String | `text` |
| 7 | `fullAddress` | fullAddress | `cFullAddress` | String | `text` |
| 8 | `id` | ID | `id` | Long | `long` |
| 9 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |
| 10 | `province` | province | `cProvince` | String | `text` |
| 11 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |
| 12 | `receiveMobile` | receiveMobile | `cReceiveMobile` | String | `text` |
| 13 | `receiveTelePhone` | receiveTelePhone | `cReceiveTelePhone` | String | `text` |
| 14 | `receiver` | receiver | `cReceiver` | String | `text` |
| 15 | `region` | region | `cRegion` | String | `text` |
| 16 | `uordercorp` | uordercorp | `iCorpId` | Long | `long` |
| 17 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 18 | `zipCode` | zip编码 | `cZipCode` | String | `text` |

## 关联（1 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
