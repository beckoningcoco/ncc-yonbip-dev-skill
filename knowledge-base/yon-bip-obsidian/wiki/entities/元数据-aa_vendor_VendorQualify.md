---
tags: [BIP, 元数据, 数据字典, aa.vendor.VendorQualify]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 供应商资质 (`aa.vendor.VendorQualify`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `aa_vendorqualify` | 应用: `DPMSPL` | 类型: `Class`

## 属性（24 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `vendor` | vendor | `iVendorId` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |
| 3 | `enterMode` | enterMode | `enter_mode` | String | `text` |
| 4 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 5 | `qualifydoc` | qualifydoc | `qualifydoc_id` | 24adca98-a52e-4e01-bd71-6304184e474c | `quote` |
| 6 | `qualifydocCode` | qualifydoc编码 | `qualifydoc_code` | String | `text` |
| 7 | `qualifydocName` | qualifydoc名称 | `qualify_name` | String | `text` |
| 8 | `qualifydocDescription` | qualifydocDescription | `qualifydoc_remark` | String | `text` |
| 9 | `qualifyGrade` | qualifyGrade | `qualify_grade_id` | 8f27a7c2-2ae4-449e-b65a-4a0adbf0196f | `quote` |
| 10 | `qualifyGradeName` | qualifyGrade名称 | `qualify_grade_name` | String | `text` |
| 11 | `qualifyCode` | qualify编码 | `qualify_code` | String | `text` |
| 12 | `longEffective` | longEffective | `long_effective` | Boolean | `switch` |
| 13 | `qualifyDate` | qualifyDate | `qualify_date` | DateTime | `timestamp` |
| 14 | `qualifyExpDate` | qualifyExpDate | `qualify_exp_date` | DateTime | `timestamp` |
| 15 | `fileMust` | fileMust | `file_must` | Boolean | `switch` |
| 16 | `remark` | remark | `remark` | String | `text` |
| 17 | `filePath` | filePath | `file_path` | String | `text` |
| 18 | `isPreset` | 是否Preset | `is_preset` | Short | `short` |
| 19 | `qualifyDefine` | qualifyDefine | `qualify_define` | Short | `short` |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 21 | `vendorQualifyCharacterDefine` | vendorQualifyCharacterDefine | `vendorQualifyCharacterDefine` | f5b6b47a-b545-4826-bd55-4ebb2cf5c2fc | `UserDefine` |
| 22 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 23 | `defines` | defines | `` | 72a3b767-2277-462c-81d2-899840e8b5a6 | `` |
| 24 | `erpCode` | erp编码 | `erpCode` | String | `text` |

## 关联（7 个）

- `ytenant` -> `yht.tenant.YhtTenant` ()
- `vendor` -> `aa.vendor.Vendor` (0..n)
- `vendorQualifyCharacterDefine` -> `aa.vendor.VendorQualifyCharacterDefine` ()
- `qualifyGrade` -> `aa.qualify.QualifyGrade` ()
- `qualifydoc` -> `aa.qualify.Qualify` ()
- `tenant` -> `base.tenant.Tenant` ()
- `defines` -> `aa.vendor.VendorQualifyDefine` (1)
