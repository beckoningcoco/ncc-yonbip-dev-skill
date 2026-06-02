---
tags: [BIP, 元数据, 数据字典, aa.store.StoreSupplier]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 供货商家 (`aa.store.StoreSupplier`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_storesupplier` | 应用: `Marketingpublic` | 类型: `Class`

## 属性（6 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `supplier` | supplier | `iSupplierID` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 3 | `store` | store | `iStoreId` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | `quote` |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 5 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 6 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `supplier` -> `aa.merchant.Merchant` ()
- `store` -> `aa.store.Store` (0..n)
- `tenant` -> `base.tenant.Tenant` ()
