---
tags: [BIP, 元数据, 数据字典, aa.merchant.CustomerArea]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售区域 (`aa.merchant.CustomerArea`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `customerarea` | 应用: `DPMCUS` | 类型: `Class`

## 属性（9 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `merchantId` | merchantID | `imerchantid` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 3 | `merchantApplyRangeId` | merchantApplyRangeID | `merchantapplyrangeid` | b023ebd3-0f7f-4a9a-a28b-32183b1b8022 | `quote` |
| 4 | `saleAreaId` | saleAreaID | `csaleareaid` | 75fb7b76-fdb5-4e87-ab0d-e4215a299634 | `quote` |
| 5 | `isDefault` | 是否Default | `bdefaultcustomerarea` | Boolean | `switch` |
| 6 | `customerAreaCharacter` | customerAreaCharacter | `customer_area_character` | 9ff39c65-e4c9-4414-81ec-bf9e448e26e4 | `UserDefine` |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 8 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 9 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |

## 关联（6 个）

- `merchantId` -> `aa.merchant.Merchant` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `merchantApplyRangeId` -> `aa.merchant.MerchantApplyRangeExt` (0..n)
- `customerAreaCharacter` -> `aa.merchant.CustomerAreaCharacter` ()
- `saleAreaId` -> `aa.salearea.SaleArea` ()
- `tenant` -> `base.tenant.Tenant` ()
