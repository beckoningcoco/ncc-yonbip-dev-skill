---
tags: [BIP, 元数据, 数据字典, aa.store.ShoppingMall]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 商城业务 (`aa.store.ShoppingMall`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_shoppingmall` | 应用: `Marketingpublic` | 类型: `Class`

## 属性（51 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `address` | address | `detailAddress` | String | `text` |
| 2 | `beginTime` | beginTime | `beginTime` | String | `text` |
| 3 | `cAppId` | cAppID | `cAppId` | String | `text` |
| 4 | `cInventoryType` | cInventoryType | `cInventoryType` | Short | `short` |
| 5 | `cPayWay` | cPayWay | `cPayWay` | String | `text` |
| 6 | `cPaytypeCodes` | cPaytypeCodes | `cPaytypeCodes` | String | `text` |
| 7 | `closed` | closed | `closed` | Short | `short` |
| 8 | `concatQrcode` | concatQrcode | `concatQrcode` | String | `text` |
| 9 | `deliveryScope` | deliveryScope | `deliveryScope` | String | `text` |
| 10 | `deliveryScopeAddress` | deliveryScopeAddress | `deliveryScopeAddress` | String | `text` |
| 11 | `deliveryType` | deliveryType | `deliveryType` | String | `text` |
| 12 | `dlyFeeRuleId` | dlyFeeRuleID | `dlyFeeRuleId` | b4505671-79b1-4593-8be4-ddc7eed18484 | `quote` |
| 13 | `endTime` | endTime | `endTime` | String | `text` |
| 14 | `extendFeild` | extendFeild | `extendFeild` | String | `text` |
| 15 | `fDistributionRadius` | fDistributionRadius | `fDistributionRadius` | Decimal | `number` |
| 16 | `groupreferenceIds` | groupreferenceIds | `groupreferenceIds` | String | `text` |
| 17 | `iDeleted` | iDeleted | `iDeleted` | Boolean | `switch` |
| 18 | `iDistributionMode` | iDistributionMode | `iDistributionMode` | Short | `short` |
| 19 | `iHotSpot` | iHotSpot | `iHotSpot` | Short | `short` |
| 20 | `iStart` | iStart | `iStart` | Boolean | `switch` |
| 21 | `id` | ID | `id` | Long | `long` |
| 22 | `isHeadQuarters` | 是否HeadQuarters | `isHeadQuarters` | Boolean | `switch` |
| 23 | `latitude` | latitude | `latitude` | Decimal | `number` |
| 24 | `longitude` | longitude | `longitude` | Decimal | `number` |
| 25 | `minDeliveryFee` | minDeliveryFee | `minDeliveryFee` | Decimal | `number` |
| 26 | `mobileManualUrl` | mobileManualUrl | `mobileManualUrl` | String | `text` |
| 27 | `mobilePageType` | mobilePageType | `mobilePageType` | Short | `short` |
| 28 | `name` | 名称 | `name` | String | `text` |
| 29 | `orderTakeTemplateId` | orderTakeTemplateID | `orderTakeTemplateId` | fe1b83d8-10c2-4b21-ad18-e4122194d629 | `quote` |
| 30 | `orderTakeTemplatePage` | orderTakeTemplatePage | `orderTakeTemplatePage` | String | `text` |
| 31 | `pcTemplateId` | pcTemplateID | `pcTemplateId` | fe1b83d8-10c2-4b21-ad18-e4122194d629 | `quote` |
| 32 | `pcTemplatePage` | pcTemplatePage | `pcTemplatePage` | String | `text` |
| 33 | `polygonPath` | polygonPath | `fenceJsonStr` | String | `text` |
| 34 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 35 | `referenceId` | referenceID | `referenceId` | Long | `long` |
| 36 | `referenceRetailPrice` | referenceRetailPrice | `referenceRetailPrice` | Short | `short` |
| 37 | `regionCode` | region编码 | `regionCode` | String | `text` |
| 38 | `regionName` | region名称 | `regionName` | String | `text` |
| 39 | `returnDetail` | returnDetail | `returnDetail` | String | `text` |
| 40 | `scopeCode` | scope编码 | `scopeCode` | String | `text` |
| 41 | `scopeName` | scope名称 | `scopeName` | String | `text` |
| 42 | `shopsid` | shopsid | `shopsid` | String | `text` |
| 43 | `shopsname` | shopsname | `shopsname` | String | `text` |
| 44 | `siteType` | siteType | `siteType` | String | `text` |
| 45 | `store` | store | `iStoreId` | 16e4e14c-ab05-4ee5-bbb8-c67351c9a8b3 | `quote` |
| 46 | `storeDlyFeeRuleId` | storeDlyFeeRuleID | `storeDlyFeeRuleId` | b4505671-79b1-4593-8be4-ddc7eed18484 | `quote` |
| 47 | `templateId` | templateID | `templateId` | fe1b83d8-10c2-4b21-ad18-e4122194d629 | `quote` |
| 48 | `templatePage` | templatePage | `templatePage` | String | `text` |
| 49 | `unionPayMid` | unionPayMid | `unionPayMid` | String | `text` |
| 50 | `unionPaytid` | unionPaytid | `unionPaytid` | String | `text` |
| 51 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（7 个）

- `dlyFeeRuleId` -> `um.logisticssetting.Deliverytype` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `storeDlyFeeRuleId` -> `um.logisticssetting.Deliverytype` ()
- `store` -> `aa.store.Store` (1)
- `pcTemplateId` -> `um.templatepage.Templatepage` ()
- `templateId` -> `um.templatepage.Templatepage` ()
- `orderTakeTemplateId` -> `um.templatepage.Templatepage` ()
