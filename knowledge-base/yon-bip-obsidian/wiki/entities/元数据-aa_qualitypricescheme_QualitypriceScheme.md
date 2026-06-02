---
tags: [BIP, 元数据, 数据字典, 采购入库, ST, aa.qualitypricescheme.QualitypriceScheme]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 优质优价方案 (`aa.qualitypricescheme.QualitypriceScheme`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `cpu_qualityprice_scheme` | 应用: `ycPriceCenter`

## 属性（33 个）

| # | 字段 | 显示名 | 列 | 类型 | biztype |
|---|------|--------|-----|------|---------|
| 1 | `code` | 编码 | `code` | String | `text` |
| 2 | `schemeName` | scheme名称 | `scheme_name` | String | `multiLanguage` |
| 3 | `schemeType` | schemeType | `scheme_type` | 55cc1587-1f0f-4bd4-beae-18f37f40fb7c | `quote` |
| 4 | `islast` | 是否last | `islast` | Boolean | `switch` |
| 5 | `oid` | oid | `oid` | Long | `long` |
| 6 | `orderId` | orderID | `order_id` | String | `text` |
| 7 | `orderType` | orderType | `order_type` | BillTypeEnum | `` |
| 8 | `orderItemId` | orderItemID | `order_item_id` | String | `text` |
| 9 | `creatorName` | creator名称 | `creatorName` | String | `text` |
| 10 | `modifierName` | modifier名称 | `modifierName` | String | `text` |
| 11 | `enablets` | enablets | `enablets` | DateTime | `dateTime` |
| 12 | `disablets` | disablets | `disablets` | DateTime | `dateTime` |
| 13 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 15 | `productId` | productID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 16 | `manageClass` | manageClass | `manage_class` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |
| 17 | `featureRange` | featureRange | `feature_range` | String | `text` |
| 18 | `effectiveDate` | effective日期 | `effective_date` | DateTime | `timestamp` |
| 19 | `expiryDate` | expiry日期 | `expiry_date` | DateTime | `timestamp` |
| 20 | `vmemo` | vmemo | `vmemo` | String | `text` |
| 21 | `version` | 版本号 | `version` | String | `text` |
| 22 | `type` | type | `type` | SchemeTypeEnum | `` |
| 23 | `enable` | enable | `enable` | sys_intboolean | `singleOption` |
| 24 | `id` | ID | `id` | Long | `long` |
| 25 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 26 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |
| 27 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |
| 28 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |
| 29 | `QualitypriceSchemeDefineCharacter` | QualitypriceSchemeDefineCharacter | `cpu_qualityprice_scheme_define` | b4ce51bc-5468-4745-8f4b-4dc6022036c0 | `UserDefine` |
| 30 | `applyScene` | applyScene | `apply_scene` | ApplyScene | `` |
| 31 | `inspectResultSource` | inspectResultSource | `inspect_result_source` | InspectResultSource | `` |
| 32 | `priceSchemeItemList` | priceSchemeItemList | `` | f0819815-58ef-4551-91e4-d7fa8cfc56d3 | `` |
| 33 | `priceSchemeOrganizationList` | priceSchemeOrganizationList | `` | aead02dd-9270-4992-9f71-e2c6b35d2571 | `` |

## 关联（9 个）

- `QualitypriceSchemeDefineCharacter` -> `aa.qualitypricescheme.QualitypriceSchemeDefine` () 
- `creator` -> `base.user.BipUser` () 
- `priceSchemeItemList` -> `aa.qualitypricescheme.QualitypriceSchemeItem` (1..n) 
- `productId` -> `pc.product.Product` () 
- `schemeType` -> `aa.qualitypricescheme.SchemeType` () 
- `ytenant` -> `yht.tenant.YhtTenant` () 
- `modifier` -> `base.user.BipUser` () 
- `manageClass` -> `pc.cls.ManagementClass` () 
- `priceSchemeOrganizationList` -> `aa.qualitypricescheme.ApplicableOrganization` (1..n) 
