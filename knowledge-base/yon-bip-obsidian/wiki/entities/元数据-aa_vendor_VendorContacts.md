---
tags: [BIP, 元数据, 数据字典, aa.vendor.VendorContacts]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 供应商联系人 (`aa.vendor.VendorContacts`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_vendorcontacts` | 应用: `DPMSPL` | 类型: `Class`

## 属性（23 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `vendor` | vendor | `iVendorId` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 3 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 4 | `contactname` | contactname | `cContactName` | String | `text` |
| 5 | `headPhoto` | headPhoto | `head_photo` | String | `text` |
| 6 | `position` | position | `cPosition` | String | `multiLanguage` |
| 7 | `gender` | gender | `cGender` | Integer | `int` |
| 8 | `mobileCountrycode` | mobileCountrycode | `mobileCountrycode` | String | `text` |
| 9 | `contactmobile` | contactmobile | `cContactMobile` | String | `text` |
| 10 | `contactphone` | contactphone | `cContactPhone` | String | `text` |
| 11 | `contactemail` | contactemail | `cContactEmail` | String | `text` |
| 12 | `qq` | qq | `cQQ` | String | `text` |
| 13 | `WeChat` | WeChat | `cWeChat` | String | `text` |
| 14 | `defaultcontact` | defaultcontact | `bDefaultContact` | Boolean | `switch` |
| 15 | `memo` | 备注 | `cmemo` | String | `multiLanguage` |
| 16 | `erpCode` | erp编码 | `erpCode` | String | `text` |
| 17 | `customcontact` | customcontact | `bCustomContact` | Boolean | `switch` |
| 18 | `udhcontact` | udhcontact | `bUdhContact` | Boolean | `switch` |
| 19 | `umallcontact` | umallcontact | `bUmallContact` | Boolean | `switch` |
| 20 | `vendorContactsCharacterDefine` | vendorContactsCharacterDefine | `vendorContactsCharacterDefine` | 1b7966a8-8f3f-43ec-be09-91c54bcbdbba | `UserDefine` |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 22 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 23 | `defines` | defines | `` | 784d4638-5920-464e-9060-df4e3785c88a | `` |

## 关联（5 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `vendor` -> `aa.vendor.Vendor` (0..n)
- `vendorContactsCharacterDefine` -> `aa.vendor.VendorContactsCharacterDefine` ()
- `tenant` -> `base.tenant.Tenant` ()
- `defines` -> `aa.vendor.VendorContactDefine` (1)
