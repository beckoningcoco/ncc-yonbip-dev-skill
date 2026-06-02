---
tags: [BIP, 元数据, 数据字典, aa.store.SalesBusinessInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售业务信息 (`aa.store.SalesBusinessInfo`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_salessbusinessinfo` | 应用: `Marketingpublic` | 类型: `Class`

## 属性（12 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `salesBusinessInfoDefineCharacter` | salesBusinessInfoDefineCharacter | `salesBusinessInfoDefineCharacter` | 99cac752-2ba4-435f-83c7-c8794d86c3ec | `UserDefine` |
| 2 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 3 | `id` | ID | `id` | Long | `long` |
| 4 | `store` | store | `iStoreId` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | `quote` |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 6 | `saleOrg` | saleOrg | `saleorg` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |
| 7 | `saleArea` | saleArea | `salearea` | 75fb7b76-fdb5-4e87-ab0d-e4215a299634 | `quote` |
| 8 | `storeLevel` | storeLevel | `storelevel` | b46e7d42-ed6a-4e20-9e0b-75d45967a3db | `quote` |
| 9 | `saleLatestFollowUpTime` | saleLatestFollowUpTime | `dSaleLatestFollowUpTime` | DateTime | `timestamp` |
| 10 | `saleLatestFollowPerson` | saleLatestFollowPerson | `iSaleLatestFollowPerson` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |
| 11 | `salesBusinessInfoDefine` | salesBusinessInfoDefine | `` | 2eeb0361-a03e-4f53-a097-2bc9efb67750 | `` |
| 12 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（9 个）

- `saleLatestFollowPerson` -> `bd.staff.Staff` ()
- `storeLevel` -> `aa.store.StoreLevel` ()
- `salesBusinessInfoDefine` -> `aa.store.SalesBusinessInfoDefine` (1)
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `saleArea` -> `aa.salearea.SaleArea` ()
- `store` -> `aa.store.Store` (0..n)
- `salesBusinessInfoDefineCharacter` -> `aa.store.SalesBusinessInfoDefineCharacter` ()
- `saleOrg` -> `org.func.BaseOrg` ()
- `tenant` -> `base.tenant.Tenant` ()
