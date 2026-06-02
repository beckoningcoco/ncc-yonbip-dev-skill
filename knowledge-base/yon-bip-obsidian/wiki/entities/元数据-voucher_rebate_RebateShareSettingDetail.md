---
tags: [BIP, 元数据, 数据字典, voucher.rebate.RebateShareSettingDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 返利分摊设置明细 (`voucher.rebate.RebateShareSettingDetail`)

> **平台版本：BIP 旗舰版 V5** -- 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `udh_rebatesharesettingdetail` | 应用: `BBSMK` | 类型: `Class`

## 属性（21 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype |
|---|--------|--------|-----|------|---------|
| 1 | `id` | ID | `id` | Long | `long` |
| 2 | `productLineId` | productLineID | `iProductLineId` | fcdf5213-a995-4874-928f-ff97bcfa4b91 | `quote` |
| 3 | `productBrandId` | productBrandID | `iProductBrandId` | 75116b40-efe4-455e-b62d-d56ac4811eb1 | `quote` |
| 4 | `productClassId` | productClassID | `iProductClassId` | 5ad8fc93-4e6b-409f-a70f-462efa6fcee9 | `quote` |
| 5 | `productId` | productID | `iProductId` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |
| 6 | `skuId` | skuID | `iProductSkuId` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |
| 7 | `maxRebateRatio` | maxRebateRatio | `maxRebateRatio` | Decimal | `number` |
| 8 | `maxRebateMoney` | maxRebateMoney | `maxRebateMoney` | Decimal | `number` |
| 9 | `minRebateMoney` | minRebateMoney | `minRebateMoney` | Decimal | `number` |
| 10 | `applicableType` | applicableType | `applicableType` | RebateApplicableTypeEnum | `` |
| 11 | `bizId` | bizID | `iBizId` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |
| 12 | `isDocumentLineControl` | 是否DocumentLineControl | `isDocumentLineControl` | Boolean | `switch` |
| 13 | `materialClassId` | materialClassID | `iMaterialClassId` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |
| 14 | `pubts` | 时间戳 | `pubuts` | DateTime | `timestamp` |
| 15 | `rebateShareSettingDetailCharacteristics` | rebateShareSettingDetailCharacteristics | `rebateShareSettingDetailCharacteristics` | eaf4d196-4184-4084-9c36-ad928ffb89bb | `FreeCT` |
| 16 | `rebateShareSettingDetailDefineCharacter` | rebateShareSettingDetailDefineCharacter | `rebateShareSettingDetailDefineCharacter` | c6a200f8-0193-43a4-9a81-f23a5d6014be | `UserDefine` |
| 17 | `saleOrgId` | saleOrgID | `iSaleOrgId` | 4991976e-11ee-406e-bdbb-0f73f9f89ff2 | `quote` |
| 18 | `shareSettingId` | shareSettingID | `iShareSettingId` | 6353a3f1-4736-4c35-bc35-64ec2ea8bb7d | `quote` |
| 19 | `stepCondition` | stepCondition | `` | 1f0babeb-762b-46b3-be4e-1aa218d79d57 | `` |
| 20 | `uordercorp` | uordercorp | `iCorpId` | Long | `long` |
| 21 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |

## 关联（13 个）

- `saleOrgId` -> `org.func.SalesOrg` ()
- `productClassId` -> `pc.cls.PresentationClass` ()
- `materialClassId` -> `pc.cls.ManagementClass` ()
- `productId` -> `pc.product.Product` ()
- `ytenant` -> `yht.tenant.YhtTenant` ()
- `productBrandId` -> `pc.brand.Brand` ()
- `rebateShareSettingDetailCharacteristics` -> `voucher.rebate.RebateShareSettingDetailCharacteristics` ()
- `shareSettingId` -> `voucher.rebate.RebateShareSetting` (0..n)
- `bizId` -> `aa.merchant.Merchant` ()
- `rebateShareSettingDetailDefineCharacter` -> `voucher.rebate.RebateShareSettingDetailDefineCharacter` ()
- `stepCondition` -> `voucher.rebate.StepCondition` (0..n)
- `skuId` -> `pc.product.ProductSKU` ()
- `productLineId` -> `pc.productline.ProductLine` ()
