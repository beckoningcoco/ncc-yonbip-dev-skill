---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.quotation.BiQuotationBody"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 价格目录报价模型表体 (`aa.quotation.BiQuotationBody`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_bi_quotation_body` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.quotation.BiQuotationBody` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 价格目录报价模型表体 |
| 物理表 | `cpu_bi_quotation_body` |
| 数据库 schema | `cpu-bi-service` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:24:58.1190` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |

## 部署信息

- **部署时间**: 2024-07-20 00:11:13:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V3_R5_2312/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202405291414_metadata_aa-quotation_delta.zip`
- **安装人**: migration
- **安装排名**: `08f2128e-cafb-4802-83a4-cd3aadf1045a`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 26 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | id | `id` | Long | `long` |  | ✓ |
| 2 | `BiPriceEntityDefineCharacter` | 价格目录自定义项 | `biprice_definenew` | 73bdd79d-3e19-4bf0-ab49-fc9b91899036 | `UserDefine` |  | ✓ |
| 3 | `BiPriceEntityFreeCharacteristics` | 物料自由项特征组 | `instance_id` | 2ae17ff8-b4e9-4ca0-a04d-3b661965c474 | `FreeCT` |  | ✓ |
| 4 | `discountTaxType` | 扣税类别 | `discount_tax_type` | String | `text` |  | ✓ |
| 5 | `dr` | dr | `dr` | Integer | `int` |  | ✓ |
| 6 | `isCalculate` | 是否参与价格计算 | `is_calculate` | PriceIsCalculate | `` |  | ✓ |
| 7 | `npriceNoTaxOrigin` | 无税单价 | `nprice_notax_origin` | Decimal | `number` |  | ✓ |
| 8 | `npriceNoTaxOriginAccept` | 承兑无税单价 | `nprice_notax_origin_accept` | Decimal | `number` |  | ✓ |
| 9 | `npriceNoTaxOriginAccount` | 账期无税单价 | `nprice_notax_origin_account` | Decimal | `number` |  | ✓ |
| 10 | `npriceNoTaxOriginCash` | 现金无税单价 | `nprice_notax_origin_cash` | Decimal | `number` |  | ✓ |
| 11 | `npriceOrigin` | 含税单价 | `nprice_origin` | Decimal | `number` |  | ✓ |
| 12 | `npriceOriginAccept` | 承兑含税单价 | `nprice_origin_accept` | Decimal | `number` |  | ✓ |
| 13 | `npriceOriginAccount` | 账期含税单价 | `nprice_origin_account` | Decimal | `number` |  | ✓ |
| 14 | `npriceOriginCash` | 现金含税单价 | `nprice_origin_cash` | Decimal | `number` |  | ✓ |
| 15 | `nsumEnd` | 数量止 | `nsum_end` | Decimal | `number` |  | ✓ |
| 16 | `nsumStart` | 数量起 | `nsum_start` | Decimal | `number` |  | ✓ |
| 17 | `ntax` | 税率 | `ntax` | Decimal | `number` |  | ✓ |
| 18 | `priceScheme` | 价格方案 | `price_scheme` | 4850dcd9-c8e1-4882-bbd1-67a6dd8db017 | `quote` |  | ✓ |
| 19 | `priceStrategy` | 取价策略 | `price_trategy` | 3dab7aea-9e18-4a82-8712-f029fd1ec393 | `quote` |  | ✓ |
| 20 | `priceType` | 定价类型 | `price_type` | 8495de5e-0f17-483c-947c-a5a8a35739e6 | `quote` |  | ✓ |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 22 | `quotationId` | 报价id | `quotation_id` | efd1e4c5-9da5-490b-acfc-9b097f70f890 | `quote` |  | ✓ |
| 23 | `taxPriority` | 含税优先 | `taxPriority` | Integer | `int` |  | ✓ |
| 24 | `vtaxItemsId` | 税目id | `vtax_items_id` | 01e7528c-c35c-4d33-b2aa-382b4b4f4534 | `quote` |  | ✓ |
| 25 | `vunitId` | 单位id | `vunit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 9 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `priceStrategy` | 取价策略 | `aa.pricestrategy.PriceStrategy` | `price_trategy` |  →  |  |  | None |  |
| 2 | `vunitId` | 单位id | `pc.unit.Unit` | `vunit_id` |  →  |  |  | Service |  |
| 3 | `BiPriceEntityFreeCharacteristics` | 物料自由项特征组 | `aa.quotation.BiQuotationBodyCharacteristicsDefine` | `instance_id` |  →  |  |  | None |  |
| 4 | `quotationId` | 报价id | `aa.quotation.BiQuotationHead` | `quotation_id` | biQuotationBodyList → quotationId | 1..n | true | None |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 6 | `priceType` | 定价类型 | `aa.pricetype.PriceType` | `price_type` |  →  |  |  | None |  |
| 7 | `BiPriceEntityDefineCharacter` | 价格目录自定义项 | `aa.quotation.BiQuotationBodyDefineNew` | `biprice_definenew` |  →  |  |  | None |  |
| 8 | `priceScheme` | 价格方案 | `aa.dynamicpricescheme.PriceScheme` | `price_scheme` |  →  |  |  | None |  |
| 9 | `vtaxItemsId` | 税目id | `bd.taxrate.TaxRateVO` | `vtax_items_id` |  →  |  |  | Service |  |

### Composition（子表）

- **quotationId**: `biQuotationBodyList` → `aa.quotation.BiQuotationHead` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `vunitId` (单位id) | `pc.unit.Unit` | `vunit_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `vtaxItemsId` (税目id) | `bd.taxrate.TaxRateVO` | `vtax_items_id` |
