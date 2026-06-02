---
tags: [BIP, 元数据, 数据字典, base.businesspartner.BusinessPartnerCharacterDef]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务伙伴自定义项 (`base.businesspartner.BusinessPartnerCharacterDef`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `business_partner_character_def` | 应用: `DPMBP` | 类型: `Class`

## 属性（5 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `FL0401` | FL0401 | `lcol1` | 59ec0b4d-4e38-483d-9bdd-e7aa44176ce8 | `quote` |
| 2 | `YWTZ001` | YWTZ001 | `bcol50` | Boolean | `switch` |
| 3 | `id` | ID | `id` | String | `text` |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime | `dateTime` |
| 5 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（2 个）

- `FL0401` -> `aa.vendorclass.VendorClass` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
