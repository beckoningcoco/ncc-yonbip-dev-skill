---
tags: [BIP, 元数据, 数据字典, aa.merchant.MerchantsManager]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户管理员 (`aa.merchant.MerchantsManager`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `merchantsmanager` | 应用: `DPMCUS` | 类型: `Class`

## 属性（13 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `merchantId` | merchantID | `imerchantId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 3 | `countryCode` | country编码 | `cCountryCode` | String | `text` |
| 4 | `mobile` | mobile | `cMobile` | String | `text` |
| 5 | `fullName` | full名称 | `cFullName` | String | `text` |
| 6 | `email` | email | `cEmail` | String | `text` |
| 7 | `yhtUserId` | yhtUserID | `cyhtUserId` | String | `text` |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 9 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 10 | `expireDate` | expireDate | `dexpireDate` | DateTime | `timestamp` |
| 11 | `qq` | qq | `cQQ` | String | `text` |
| 12 | `userName` | user名称 | `cUserName` | String | `text` |
| 13 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |

## 关联（3 个）

- `merchantId` -> `aa.merchant.Merchant` (1)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `tenant` -> `base.tenant.Tenant` ()
