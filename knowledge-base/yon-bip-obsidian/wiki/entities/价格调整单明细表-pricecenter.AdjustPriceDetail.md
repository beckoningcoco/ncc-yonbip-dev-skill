---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "yc.pricecenter.AdjustPriceDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 价格调整单明细表 (`yc.pricecenter.AdjustPriceDetail`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`pu_adjustprice_detail` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `yc.pricecenter.AdjustPriceDetail` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 价格调整单明细表 |
| 物理表 | `pu_adjustprice_detail` |
| 数据库 schema | `yuncai-upu-service` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:25:20.5600` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 子表关联标识 |

## 部署信息

- **部署时间**: 2026-03-26 21:31:03:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202603261609_metadata_yc-pricecenter_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `cdf5eefb-d7fe-43e2-843e-b86fbf1f4001`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `data_auth`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 7 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 商品相关 (`IProduct`) | `retail.voucher.IProduct` | 70 | 1 |
| 2 | 原币金额信息 (`IOriMoneyInfo`) | `voucher.base.IOriMoneyInfo` | 74 | 6 |
| 3 | 规格 (`FreeItem`) | `base.itf.FreeItem` | 399 | 10 |
| 4 | 商品sku相关 (`IProductSku`) | `retail.voucher.IProductSku` | 60 | 1 |
| 5 | 物料属性 (`MaterialProperties`) | `yc.pricecenter.MaterialProperties` | 1491 | 30 |
| 6 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 7 | 生单回写 (`IBackWrite`) | `base.itf.IBackWrite` | 254 | 7 |

---

## 直接属性（共 90 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `free1` | 规格1 | `free1` | String | `text` |  | ✓ |
| 2 | `free10` | 规格10 | `free10` | String | `text` |  | ✓ |
| 3 | `free2` | 规格2 | `free2` | String | `text` |  | ✓ |
| 4 | `free3` | 规格3 | `free3` | String | `text` |  | ✓ |
| 5 | `free4` | 规格4 | `free4` | String | `text` |  | ✓ |
| 6 | `free5` | 规格5 | `free5` | String | `text` |  | ✓ |
| 7 | `biPriceEntityId` | 价格目录id | `bi_price_entity_id` | eb9690f1-b4ed-4223-8ce3-06710f2c6242 | `quote` |  | ✓ |
| 8 | `operationId` | 工序主键 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 | `quote` |  | ✓ |
| 9 | `adjustPriceRangeNotax` | 无税调价幅度 | `adjustPriceRangeNotax` | Decimal | `number` |  | ✓ |
| 10 | `lastPriceId` | 上一次调价价格目录ID | `last_price_id` | eb9690f1-b4ed-4223-8ce3-06710f2c6242 | `quote` |  | ✓ |
| 11 | `dBillDate` | 来源单据生效时间 | `dbilldate` | DateTime | `timestamp` |  | ✓ |
| 12 | `sourceid` | 上游单据主表id | `sourceid` | Long | `long` |  | ✓ |
| 13 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long | `long` |  | ✓ |
| 14 | `source` | 上游单据类型 | `source` | String | `text` |  | ✓ |
| 15 | `upcode` | 上游单据号 | `upcode` | String | `text` |  | ✓ |
| 16 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String | `text` |  | ✓ |
| 17 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime | `timestamp` |  | ✓ |
| 18 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String | `text` |  | ✓ |
| 19 | `adjustPriceRange` | 含税调价幅度 | `adjustPriceRange` | Decimal | `number` |  | ✓ |
| 20 | `priceScheme` | 价格方案 | `price_scheme` | 4850dcd9-c8e1-4882-bbd1-67a6dd8db017 | `quote` |  | ✓ |
| 21 | `AdjustPriceDetailDefineCharacter` | 价格调整单子表自定义项 | `adjustprice_detail_definenew` | 8c8036db-5bb9-469d-9eae-1eaa8c8f0b8d | `UserDefine` |  | ✓ |
| 22 | `dimensionPricingId` | 报价id | `dimension_pricing_id` | a27a4bb3-6c84-4140-a3ae-ebbb3d2604d1 | `quote` |  | ✓ |
| 23 | `lowesPriceNotax` | 最低调价价格(无税) | `lowesPriceNotax` | Decimal | `number` |  | ✓ |
| 24 | `discountTaxType` | 扣税类别 | `discount_tax_type` | String | `text` |  | ✓ |
| 25 | `AdjustPriceDetailFreeCharacteristics` | 物料自由项特征组 | `instance_id` | bcca8caa-ad2c-46fc-ae0c-c238ceb4c6d4 | `FreeCT` |  | ✓ |
| 26 | `priceStrategy` | 取价策略 | `price_strategy` | 3dab7aea-9e18-4a82-8712-f029fd1ec393 | `quote` |  | ✓ |
| 27 | `lowesPrice` | 最低调价价格(含税) | `lowesPrice` | Decimal | `number` |  | ✓ |
| 28 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 29 | `lastPriceNotax` | 上一次调价无税价格(原币) | `lastPriceNotax` | Decimal | `number` |  | ✓ |
| 30 | `lastPrice` | 上一次调价含税价格(原币) | `lastPrice` | Decimal | `number` |  | ✓ |
| 31 | `free6` | 规格6 | `free6` | String | `text` |  | ✓ |
| 32 | `free7` | 规格7 | `free7` | String | `text` |  | ✓ |
| 33 | `free8` | 规格8 | `free8` | String | `text` |  | ✓ |
| 34 | `free9` | 规格9 | `free9` | String | `text` |  | ✓ |
| 35 | `adjustPriceId` | 主表关联标识ID | `adjustprice_id` | 10f3f7e7-cd06-4371-8d8b-05be8212d986 | `quote` |  | ✓ |
| 36 | `operationStatus` | 操作类型 | `operation_status` | OperationStatus | `` |  | ✓ |
| 37 | `vendorId` | 供应商Id | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 38 | `oriUnitPrice` | 无税单价 | `oriUnitPrice` | Decimal | `number` |  | ✓ |
| 39 | `oriTaxUnitPrice` | 含税单价 | `oriTaxUnitPrice` | Decimal | `number` |  | ✓ |
| 40 | `taxRate` | 税率(%) | `taxRate` | Decimal | `number` |  | ✓ |
| 41 | `effectiveDate` | 生效日期 | `effective_date` | DateTime | `timestamp` |  | ✓ |
| 42 | `oriUnitPriceOriginal` | 无税单价(原价) | `oriUnitPriceOriginal` | Decimal | `number` |  | ✓ |
| 43 | `expiryDate` | 失效日期 | `expiry_date` | DateTime | `timestamp` |  | ✓ |
| 44 | `oriTax` | 原币税额 | `oriTax` | Decimal | `number` |  |  |
| 45 | `productsku` | 物料skuId | `iProductSkuid` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |  | ✓ |
| 46 | `oriMoney` | 原币无税金额 | `oriMoney` | Decimal | `number` |  |  |
| 47 | `oriSum` | 原币含税金额 | `oriSum` | Decimal | `number` |  |  |
| 48 | `product` | 物料Id | `iProductid` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 49 | `currency` | 币种Id | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 50 | `productUnitId` | 计价单位Id | `product_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 51 | `quantityFloor` | 数量下限 | `quantity_floor` | Decimal | `number` |  | ✓ |
| 52 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 53 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 54 | `id` | 子表关联标识 | `id` | Long | `long` |  | ✓ |
| 55 | `quantityStart` | 数量(起) | `quantity_start` | Decimal | `number` |  | ✓ |
| 56 | `quantityEnd` | 数量(止) | `quantity_end` | Decimal | `number` |  | ✓ |
| 57 | `taxRateId` | 税目ID | `taxRateId` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |  | ✓ |
| 58 | `materialProperty1` | 物料属性1 | `materialProperty1` | String | `text` |  | ✓ |
| 59 | `materialProperty2` | 物料属性2 | `materialProperty2` | String | `text` |  | ✓ |
| 60 | `materialProperty3` | 物料属性3 | `materialProperty3` | String | `text` |  | ✓ |
| 61 | `materialProperty4` | 物料属性4 | `materialProperty4` | String | `text` |  | ✓ |
| 62 | `materialProperty5` | 物料属性5 | `materialProperty5` | String | `text` |  | ✓ |
| 63 | `materialProperty6` | 物料属性6 | `materialProperty6` | String | `text` |  | ✓ |
| 64 | `materialProperty7` | 物料属性7 | `materialProperty7` | String | `text` |  | ✓ |
| 65 | `materialProperty8` | 物料属性8 | `materialProperty8` | String | `text` |  | ✓ |
| 66 | `materialProperty9` | 物料属性9 | `materialProperty9` | String | `text` |  | ✓ |
| 67 | `materialProperty10` | 物料属性10 | `materialProperty10` | String | `text` |  | ✓ |
| 68 | `materialProperty11` | 物料属性11 | `materialProperty11` | String | `text` |  | ✓ |
| 69 | `materialProperty12` | 物料属性12 | `materialProperty12` | String | `text` |  | ✓ |
| 70 | `materialProperty13` | 物料属性13 | `materialProperty13` | String | `text` |  | ✓ |
| 71 | `materialProperty14` | 物料属性14 | `materialProperty14` | String | `text` |  | ✓ |
| 72 | `materialProperty15` | 物料属性15 | `materialProperty15` | String | `text` |  | ✓ |
| 73 | `materialProperty16` | 物料属性16 | `materialProperty16` | String | `text` |  | ✓ |
| 74 | `materialProperty17` | 物料属性17 | `materialProperty17` | String | `text` |  | ✓ |
| 75 | `materialProperty18` | 物料属性18 | `materialProperty18` | String | `text` |  | ✓ |
| 76 | `materialProperty19` | 物料属性19 | `materialProperty19` | String | `text` |  | ✓ |
| 77 | `materialProperty20` | 物料属性20 | `materialProperty20` | String | `text` |  | ✓ |
| 78 | `materialProperty21` | 物料属性21 | `materialProperty21` | String | `text` |  | ✓ |
| 79 | `materialProperty22` | 物料属性22 | `materialProperty22` | String | `text` |  | ✓ |
| 80 | `materialProperty23` | 物料属性23 | `materialProperty23` | String | `text` |  | ✓ |
| 81 | `materialProperty24` | 物料属性24 | `materialProperty24` | String | `text` |  | ✓ |
| 82 | `materialProperty25` | 物料属性25 | `materialProperty25` | String | `text` |  | ✓ |
| 83 | `materialProperty26` | 物料属性26 | `materialProperty26` | String | `text` |  | ✓ |
| 84 | `materialProperty27` | 物料属性27 | `materialProperty27` | String | `text` |  | ✓ |
| 85 | `materialProperty28` | 物料属性28 | `materialProperty28` | String | `text` |  | ✓ |
| 86 | `materialProperty29` | 物料属性29 | `materialProperty29` | String | `text` |  | ✓ |
| 87 | `materialProperty30` | 物料属性30 | `materialProperty30` | String | `text` |  | ✓ |
| 88 | `oriTaxUnitPriceOriginal` | 含税单价(原价) | `oriTaxUnitPriceOriginal` | Decimal | `number` |  | ✓ |
| 89 | `discountRate` | 折扣率(%) | `discountRate` | Decimal | `number` |  | ✓ |
| 90 | `defines` | 价格调整单子表自由自定义项 | `` | 2bb4b2c0-b513-4459-bb64-21340136cf12 | `` |  |  |

---

## 关联属性（共 17 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `product` | 物料Id | `pc.product.Product` | `iProductid` |  →  |  |  | Service |  |
| 2 | `AdjustPriceDetailFreeCharacteristics` | 物料自由项特征组 | `yc.pricecenter.AdjustPriceDetailCharacteristicsDefine` | `instance_id` |  →  |  |  | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `AdjustPriceDetailDefineCharacter` | 价格调整单子表自定义项 | `yc.pricecenter.AdjustPriceDetailDefineNew` | `adjustprice_detail_definenew` |  →  |  |  | None |  |
| 5 | `biPriceEntityId` | 价格目录id | `aa.pricecenter.BiPriceEntity` | `bi_price_entity_id` |  →  |  |  | Service |  |
| 6 | `lastPriceId` | 上一次调价价格目录ID | `aa.pricecenter.BiPriceEntity` | `last_price_id` |  →  |  |  | Service |  |
| 7 | `vendorId` | 供应商Id | `aa.vendor.Vendor` | `vendor_id` |  →  |  |  | Service |  |
| 8 | `priceScheme` | 价格方案 | `aa.dynamicpricescheme.PriceScheme` | `price_scheme` |  →  |  |  | Service |  |
| 9 | `dimensionPricingId` | 报价id | `aa.pricecenter.BiDimensionPricing` | `dimension_pricing_id` |  →  |  |  | Service |  |
| 10 | `productUnitId` | 计价单位Id | `pc.unit.Unit` | `product_unit_id` |  →  |  |  | Service |  |
| 11 | `defines` | 价格调整单子表自由自定义项 | `yc.pricecenter.AdjustPriceDetailDefine` | `` | defines → id | 1 | true | None | ⚠️ |
| 12 | `priceStrategy` | 取价策略 | `aa.pricestrategy.PriceStrategy` | `price_strategy` |  →  |  |  | Service |  |
| 13 | `adjustPriceId` | 主表关联标识ID | `yc.pricecenter.AdjustPrice` | `adjustprice_id` | adjustpricedetail → adjustPriceId | 1..n | true | None |  |
| 14 | `productsku` | 物料skuId | `pc.product.ProductSKU` | `iProductSkuid` |  →  |  |  | Service |  |
| 15 | `operationId` | 工序主键 | `ed.operation.Operation` | `operation_id` |  →  |  |  | Service |  |
| 16 | `currency` | 币种Id | `bd.currencytenant.CurrencyTenantVO` | `currency` |  →  |  |  | Service |  |
| 17 | `taxRateId` | 税目ID | `archive.taxArchives.TaxRateArchive` | `taxRateId` |  →  |  |  | Service |  |

### Composition（子表）

- **defines**: `defines` → `yc.pricecenter.AdjustPriceDetailDefine` | 1 ⚠️ 已废弃
- **adjustPriceId**: `adjustpricedetail` → `yc.pricecenter.AdjustPrice` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `product` (物料Id) | `pc.product.Product` | `iProductid` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `biPriceEntityId` (价格目录id) | `aa.pricecenter.BiPriceEntity` | `bi_price_entity_id` |
| `lastPriceId` (上一次调价价格目录ID) | `aa.pricecenter.BiPriceEntity` | `last_price_id` |
| `vendorId` (供应商Id) | `aa.vendor.Vendor` | `vendor_id` |
| `priceScheme` (价格方案) | `aa.dynamicpricescheme.PriceScheme` | `price_scheme` |
| `dimensionPricingId` (报价id) | `aa.pricecenter.BiDimensionPricing` | `dimension_pricing_id` |
| `productUnitId` (计价单位Id) | `pc.unit.Unit` | `product_unit_id` |
| `priceStrategy` (取价策略) | `aa.pricestrategy.PriceStrategy` | `price_strategy` |
| `productsku` (物料skuId) | `pc.product.ProductSKU` | `iProductSkuid` |
| `operationId` (工序主键) | `ed.operation.Operation` | `operation_id` |
| `currency` (币种Id) | `bd.currencytenant.CurrencyTenantVO` | `currency` |
| `taxRateId` (税目ID) | `archive.taxArchives.TaxRateArchive` | `taxRateId` |
