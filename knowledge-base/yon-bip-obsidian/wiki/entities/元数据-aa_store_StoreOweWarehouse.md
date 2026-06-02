---
tags: [BIP, 元数据, 数据字典, aa.store.StoreOweWarehouse]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 门店所属仓库 (`aa.store.StoreOweWarehouse`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_storeowewarehouse` | 应用: `Marketingpublic` | 类型: `Class`

## 属性（14 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `warehouse` | warehouse | `iWarehouseID` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |
| 2 | `isDefault` | 是否Default | `iDefault` | Short | `short` |
| 3 | `isDefaultEc` | 是否DefaultEc | `iDefaultEc` | Short | `short` |
| 4 | `store` | store | `iStoreID` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | `quote` |
| 5 | `id` | ID | `id` | Long | `long` |
| 6 | `isDefaultMaterial` | 是否DefaultMaterial | `iDefaultMaterial` | Short | `short` |
| 7 | `isDefaultRequire` | 是否DefaultRequire | `isDefaultRequire` | Short | `short` |
| 8 | `priorityLevel` | priorityLevel | `iPriorityLevel` | PriorityLevel | `` |
| 9 | `isPlatformWarehouse` | 是否PlatformWarehouse | `isPlatformWarehouse` | Short | `short` |
| 10 | `isDefaultBack` | 是否DefaultBack | `isDefaultBack` | Short | `short` |
| 11 | `bCanSellWarehouse` | bCanSellWarehouse | `bCanSellWarehouse` | Short | `short` |
| 12 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |
| 13 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 14 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（4 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `store` -> `aa.store.Store` (0..n)
- `warehouse` -> `aa.warehouse.Warehouse` ()
- `tenant` -> `base.tenant.Tenant` ()
