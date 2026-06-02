---
tags: [BIP, 元数据, 数据字典, aa.merchant.MerchantAttachment]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 证照证书附件 (`aa.merchant.MerchantAttachment`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `merchantattachment` | 应用: `DPMCUS` | 类型: `Class`

## 属性（11 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `merchantId` | merchantID | `merchantId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 3 | `fileName` | 文件名 | `cFileName` | String | `text` |
| 4 | `folder` | folder | `cFolder` | String | `text` |
| 5 | `type` | type | `cType` | String | `text` |
| 6 | `size` | size | `cFileSize` | Long | `long` |
| 7 | `attachmentGroupItemId` | attachmentGroupItemID | `attachmentGroupItemId` | 7b8622be-6487-4697-91fe-92791a501932 | `quote` |
| 8 | `sort` | 排序 | `iSort` | Integer | `int` |
| 9 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 10 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 11 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |

## 关联（4 个）

- `merchantId` -> `aa.merchant.Merchant` (0..n)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `attachmentGroupItemId` -> `pc.attachment.AttachmentGroupItem` ()
- `tenant` -> `base.tenant.Tenant` ()
