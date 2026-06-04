---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.costquote.CpuCostpricingDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 报价清单明细 (`aa.costquote.CpuCostpricingDetail`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_costpricing_detail` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.costquote.CpuCostpricingDetail` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报价清单明细 |
| 物理表 | `cpu_costpricing_detail` |
| 数据库 schema | `cpu-bi-service` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:24:37.4040` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-01-23 23:38:05:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202512021636_metadata_aa-costquote_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `242651eb-e5ff-4a41-91ee-77df40af4274`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 45 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `CostpricingDetailDefCharac` | 报价清单子表自定义项 | `costpricing_detail_def_charac` | 66fc960c-ae33-45ce-9ad9-82ad53a8b807 | `UserDefine` |  | ✓ |
| 2 | `acceptTaxPrice` | 承兑含税单价 | `accept_tax_price` | Decimal | `number` |  | ✓ |
| 3 | `acceptUntaxPrice` | 承兑无税单价 | `accept_untax_price` | Decimal | `number` |  | ✓ |
| 4 | `accountTaxPrice` | 账期含税单价 | `account_tax_price` | Decimal | `number` |  | ✓ |
| 5 | `accountUntaxPrice` | 账期无税单价 | `account_untax_price` | Decimal | `number` |  | ✓ |
| 6 | `brand` | 品牌 | `brand` | String | `text` |  | ✓ |
| 7 | `costCode` | 成本项编码 | `cost_code` | String | `text` |  | ✓ |
| 8 | `costId` | 成本项id | `cost_id` | ac44f4aa-24eb-4fb1-bfae-1949bc4b5931 | `quote` |  | ✓ |
| 9 | `costName` | 成本项名称 | `cost_name` | String | `text` |  | ✓ |
| 10 | `costdesc` | 成本项描述 | `costdesc` | String | `text` |  | ✓ |
| 11 | `costpath` | 成本项路径 | `costpath` | String | `text` |  | ✓ |
| 12 | `costpricingId` | 报价清单id | `costpricing_id` | 2b728cc3-82ca-4e8f-8b98-49f9f1df7acd | `quote` |  | ✓ |
| 13 | `discountTaxType` | 扣税类别 | `discount_tax_type` | String | `text` |  | ✓ |
| 14 | `globaltaxCode` | 税码 | `globaltax_code` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |  | ✓ |
| 15 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 16 | `isFinal` | 是否末级 | `is_final` | Integer | `int` |  | ✓ |
| 17 | `ismakeupitem` | 是否参与成本项构成 | `ismakeupitem` | Integer | `int` |  | ✓ |
| 18 | `level` | 层级 | `level` | String | `text` |  | ✓ |
| 19 | `manufacturer` | 生产厂商 | `manufacturer` | String | `text` |  | ✓ |
| 20 | `model` | 型号 | `model` | String | `text` |  | ✓ |
| 21 | `ntax` | 税率 | `ntax` | Decimal | `number` |  | ✓ |
| 22 | `num` | 用量 | `num` | Decimal | `number` |  | ✓ |
| 23 | `parent` | 上级 | `parent` | 575c0982-2f70-4b26-844f-be557a7e5732 | `quote` |  | ✓ |
| 24 | `path` | 路径 | `path` | String | `text` |  | ✓ |
| 25 | `product` | 物料 | `product` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 26 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 27 | `readyTaxPrice` | 现金含税单价 | `ready_tax_price` | Decimal | `number` |  | ✓ |
| 28 | `readyUntaxPrice` | 现金无税单价 | `ready_untax_price` | Decimal | `number` |  | ✓ |
| 29 | `realPath` | 路径 | `real_path` | String | `text` |  | ✓ |
| 30 | `recentcalBilldate` | 上次定标时间 | `recentcal_billdate` | DateTime | `timestamp` |  | ✓ |
| 31 | `recentcalSupplierId` | 上次定标供应商 | `recentcal_supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 32 | `recentcalTaxPrice` | 上次定标含税单价 | `recentcal_tax_price` | Decimal | `number` |  | ✓ |
| 33 | `recentcalUntaxPrice` | 上次定标无税单价 | `recentcal_untax_price` | Decimal | `number` |  | ✓ |
| 34 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 35 | `rowNum` | 行号 | `row_num` | String | `text` |  | ✓ |
| 36 | `sn` | 序号 | `sn` | String | `text` |  | ✓ |
| 37 | `specifications` | 规格说明 | `specifications` | String | `text` |  | ✓ |
| 38 | `supplydocId` | 供应商id | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 39 | `taxPrice` | 含税单价 | `tax_price` | Decimal | `number` |  | ✓ |
| 40 | `taxPriority` | 价格标识 | `taxPriority` | Integer | `int` |  | ✓ |
| 41 | `taxRateId` | 税目 | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |  | ✓ |
| 42 | `templateDetailId` | 参考模板行id | `template_detail_id` | 89305c8c-fd63-410b-a9d4-4a1dde15ef7a | `quote` |  | ✓ |
| 43 | `unitId` | 计量单位 | `unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 44 | `untaxPrice` | 无税单价 | `untax_price` | Decimal | `number` |  | ✓ |
| 45 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 12 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `CostpricingDetailDefCharac` | 报价清单子表自定义项 | `aa.costquote.CostpricingDetailDefineNew` | `costpricing_detail_def_charac` |  →  |  |  | None |  |
| 2 | `costpricingId` | 报价清单id | `aa.costquote.CpuCostPricing` | `costpricing_id` | cpuCostpricingDetailList → costpricingId | 1..n | true | None |  |
| 3 | `parent` | 上级 | `aa.costquote.CpuCostpricingDetail` | `parent` |  →  |  |  | None |  |
| 4 | `product` | 物料 | `pc.product.Product` | `product` |  →  |  |  | Service |  |
| 5 | `globaltaxCode` | 税码 | `archive.taxArchives.TaxRateArchive` | `globaltax_code` |  →  |  |  | Service |  |
| 6 | `recentcalSupplierId` | 上次定标供应商 | `aa.vendor.Vendor` | `recentcal_supplier_id` |  →  |  |  | Service |  |
| 7 | `supplydocId` | 供应商id | `aa.vendor.Vendor` | `supplydoc_id` |  →  |  |  | Service |  |
| 8 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 9 | `costId` | 成本项id | `aa.costitem.CostItem` | `cost_id` |  →  |  |  | None |  |
| 10 | `unitId` | 计量单位 | `pc.unit.Unit` | `unit_id` |  →  |  |  | Service |  |
| 11 | `taxRateId` | 税目 | `archive.taxArchives.TaxRateArchive` | `tax_rate_id` |  →  |  |  | Service |  |
| 12 | `templateDetailId` | 参考模板行id | `aa.costitem.CostItemTemplate` | `template_detail_id` |  →  |  |  | None |  |

### Composition（子表）

- **costpricingId**: `cpuCostpricingDetailList` → `aa.costquote.CpuCostPricing` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `product` (物料) | `pc.product.Product` | `product` |
| `globaltaxCode` (税码) | `archive.taxArchives.TaxRateArchive` | `globaltax_code` |
| `recentcalSupplierId` (上次定标供应商) | `aa.vendor.Vendor` | `recentcal_supplier_id` |
| `supplydocId` (供应商id) | `aa.vendor.Vendor` | `supplydoc_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `unitId` (计量单位) | `pc.unit.Unit` | `unit_id` |
| `taxRateId` (税目) | `archive.taxArchives.TaxRateArchive` | `tax_rate_id` |
