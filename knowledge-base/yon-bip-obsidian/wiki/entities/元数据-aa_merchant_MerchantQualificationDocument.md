---
tags: [BIP, 元数据, 数据字典, aa.merchant.MerchantQualificationDocument]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户资质文件管理 (`aa.merchant.MerchantQualificationDocument`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `merchant_qualification_document` | 应用: `DPMCUS` | 类型: `Class`

## 属性（15 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | String | `text` |
| 2 | `merchantId` | merchantID | `merchant_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 3 | `licenseName` | license名称 | `license_name` | 24adca98-a52e-4e01-bd71-6304184e474c | `quote` |
| 4 | `attachment` | attachment | `attachment` | String | `text` |
| 5 | `licenseNumber` | licenseNumber | `license_number` | String | `text` |
| 6 | `longTermEffective` | longTermEffective | `long_term_effective` | String | `text` |
| 7 | `validityStartDate` | validityStartDate | `validity_start_date` | Date | `date` |
| 8 | `dueDate` | dueDate | `due_date` | Date | `date` |
| 9 | `remarks` | remarks | `remarks` | String | `text` |
| 10 | `documentUploader` | documentUploader | `document_uploader` | String | `text` |
| 11 | `documentUploaderTime` | documentUploaderTime | `document_uploader_time` | Date | `date` |
| 12 | `informationModifier` | informationModifier | `information_modifier` | String | `text` |
| 13 | `informationModifyTime` | informationModifyTime | `information_modify_time` | Date | `date` |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 15 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `merchantId` -> `aa.merchant.Merchant` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `licenseName` -> `aa.qualify.Qualify` ()
