---
tags: [BIP, 元数据, 数据字典, ec.suiteGoodsInfo.EcSuiteGoodsSub]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 套件货品 (`ec.suiteGoodsInfo.EcSuiteGoodsSub`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `ec_suite_goods_sub` | 应用: `SDOC` | 类型: `Class`

## 属性（31 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `product` | product | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 2 | `productSku` | productSku | `productsku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 3 | `goodsRange` | goodsRange | `goodsRange` | String | `text` |
| 4 | `amount` | amount | `amount` | Decimal | `number` |
| 5 | `maxFee` | maxFee | `maxFee` | Decimal | `number` |
| 6 | `priceWeight` | priceWeight | `price_weight` | Decimal | `number` |
| 7 | `assistUnitId` | assistUnitID | `assistUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |
| 8 | `assistUnitNum` | assistUnitNum | `assistUnitNum` | Decimal | `number` |
| 9 | `rate` | rate | `rate` | Decimal | `number` |
| 10 | `id` | ID | `id` | Long | `long` |
| 11 | `suiteGood` | suiteGood | `suite_good` | bd6ceb9e-378b-4e63-8b2c-75712bdc84ee | `quote` |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |
| 13 | `createDate` | 创建日期 | `create_date` | Date | `date` |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |
| 15 | `creator` | 创建人 | `creator` | String | `text` |
| 16 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 17 | `cust` | cust | `i_cust_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 18 | `ecSuiteGoodsDetailCustomCharacter` | ecSuiteGoodsDetailCustomCharacter | `oms_suiteGoods_detail_custom_character` | 91d041e2-c005-40f4-a1f6-b97f4eb16bef | `UserDefine` |
| 19 | `groupName` | group名称 | `group_name` | String | `text` |
| 20 | `modifier` | 修改人 | `modifier` | String | `text` |
| 21 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |
| 22 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |
| 23 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |
| 24 | `org` | org | `org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |
| 25 | `price` | price | `price` | Decimal | `number` |
| 26 | `rateDen` | rateDen | `rateden` | Decimal | `number` |
| 27 | `rateNum` | rateNum | `ratenum` | Decimal | `number` |
| 28 | `skuType` | skuType | `sku_type` | Integer | `int` |
| 29 | `stockSensClue` | stockSensClue | `stockSensClue` | String | `text` |
| 30 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` |
| 31 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（11 个）

- `product` -> `pc.product.Product` ()
- `productSku` -> `pc.product.ProductSKU` ()
- `org` -> `bd.adminOrg.BaseOrgVO` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `assistUnitId` -> `pc.unit.Unit` ()
- `creatorId` -> `base.user.User` ()
- `modifierId` -> `base.user.User` ()
- `suiteGood` -> `ec.suiteGoodsInfo.EcSuiteGoods` (1..n)
- `cust` -> `aa.merchant.Merchant` ()
- `tenant` -> `base.tenant.Tenant` ()
- `ecSuiteGoodsDetailCustomCharacter` -> `ec.suiteGoodsInfo.EcSuiteGoodsDetailCustomCharacter` ()
