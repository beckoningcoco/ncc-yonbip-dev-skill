---
tags: [BIP, 元数据, 数据字典, aa.store.MallFreightTemplate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 商城业务运费模板 (`aa.store.MallFreightTemplate`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_mall_freight_template` | 应用: `Marketingpublic` | 类型: `Class`

## 属性（5 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `dlyFeeRuleId` | dlyFeeRuleID | `dlyFeeRuleId` | b4505671-79b1-4593-8be4-ddc7eed18484 | `quote` |
| 2 | `id` | ID | `id` | Long | `long` |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 4 | `storeId` | storeID | `storeId` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | `quote` |
| 5 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（3 个）

- `dlyFeeRuleId` -> `um.logisticssetting.Deliverytype` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `storeId` -> `aa.store.Store` (0..n)
