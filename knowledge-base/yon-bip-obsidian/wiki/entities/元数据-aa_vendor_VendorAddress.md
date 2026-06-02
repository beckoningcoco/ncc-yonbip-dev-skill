---
tags: [BIP, 元数据, 数据字典, aa.vendor.VendorAddress]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 供应商地址 (`aa.vendor.VendorAddress`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_vendor_address` | 应用: `DPMSPL` | 类型: `Class`

## 属性（20 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `vendor` | vendor | `iVendorId` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 3 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 4 | `addressName` | address名称 | `address_name` | String | `text` |
| 5 | `country` | country | `country_id` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `quote` |
| 6 | `region` | region | `region` | 0d98e246-387e-4239-a8da-c372e94fff77 | `quote` |
| 7 | `regionCode` | region编码 | `region_code` | String | `text` |
| 8 | `detailAddress` | detailAddress | `detail_address` | String | `text` |
| 9 | `zipcode` | zipcode | `zipcode` | String | `text` |
| 10 | `longitude` | longitude | `longitude` | String | `text` |
| 11 | `latitude` | latitude | `latitude` | String | `text` |
| 12 | `contact` | contact | `contact_id` | b94fa77c-2f2b-464c-96fb-d028543825ee | `quote` |
| 13 | `shipregion` | shipregion | `iShipregionId` | 373171f0-f497-4bab-bda7-ff4b6489c13e | `quote` |
| 14 | `isDefault` | 是否Default | `is_default` | Boolean | `switch` |
| 15 | `addressType` | addressType | `address_type` | Short | `short` |
| 16 | `memo` | 备注 | `memo` | String | `text` |
| 17 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 19 | `vendorAddressCharacterDefine` | vendorAddressCharacterDefine | `vendorAddressCharacterDefine` | 3d382731-ccf5-43d0-9da7-5f3da2980048 | `UserDefine` |
| 20 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |

## 关联（8 个）

- `country` -> `bd.country.CountryVO` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `vendor` -> `aa.vendor.Vendor` (0..n)
- `contact` -> `aa.vendor.VendorContacts` ()
- `shipregion` -> `base.shipregion.ShipRegion` ()
- `region` -> `aa.regioncorp.RegionCorp` ()
- `vendorAddressCharacterDefine` -> `aa.vendor.VendorAddressCharacterDefine` ()
- `tenant` -> `base.tenant.Tenant` ()
