---
tags: [BIP, 元数据, 数据字典, voucher.rebate.WhiteProduct]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 例外商品 (`voucher.rebate.WhiteProduct`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `udh_rebatesharesetting_whiteproduct` | 应用: `BBSMK` | 类型: `Class`

## 属性（7 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `bizId` | bizID | `iBizId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 2 | `id` | ID | `id` | Long | `long` |
| 3 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |
| 4 | `shareSettingId` | shareSettingID | `shareSettingId` | 6353a3f1-4736-4c35-bc35-64ec2ea8bb7d | `quote` |
| 5 | `uordercorp` | uordercorp | `iCorpId` | Long | `long` |
| 6 | `whiteProductDetails` | whiteProductDetails | `` | d7822ed6-dc54-4f33-8372-c6f011911bfc | `` |
| 7 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `bizId` -> `aa.merchant.Merchant` ()
- `whiteProductDetails` -> `voucher.rebate.WhiteProductDetail` (0..n)
- `shareSettingId` -> `voucher.rebate.RebateShareSetting` (0..n)
