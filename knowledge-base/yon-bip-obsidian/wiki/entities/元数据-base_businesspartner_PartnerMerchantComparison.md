---
tags: [BIP, 元数据, 数据字典, base.businesspartner.PartnerMerchantComparison]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务伙伴客户对照 (`base.businesspartner.PartnerMerchantComparison`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `base_partnermerchantcomparison` | 应用: `DPMBP` | 类型: `Class`

## 属性（8 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `merchantId` | merchantID | `merchant_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 3 | `partnerId` | partnerID | `partnerId` | c1627369-6457-4828-883d-756b79bd0f46 | `quote` |
| 4 | `isDefault` | 是否Default | `isDefault` | Boolean | `switch` |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 6 | `dr` | 逻辑删除 | `dr` | Short | `short` |
| 7 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 8 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |

## 关联（4 个）

- `merchantId` -> `aa.merchant.Merchant` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `partnerId` -> `base.businesspartner.BusinessPartner` (0..n)
- `tenant` -> `base.tenant.Tenant` ()
