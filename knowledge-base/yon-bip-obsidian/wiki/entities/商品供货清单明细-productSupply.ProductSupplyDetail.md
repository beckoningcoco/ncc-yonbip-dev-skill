---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.productSupply.ProductSupplyDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 商品供货清单明细 (`mall.productSupply.ProductSupplyDetail`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`cpu_product_supply_detail` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.productSupply.ProductSupplyDetail` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商品供货清单明细 |
| 物理表 | `cpu_product_supply_detail` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycYuncaiMall` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:08:26.2070` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 23:52:51:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202512261400_metadata_mall-productSupply_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `77593581-f38b-40d0-8d59-f153bafe1459`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 生单回写 (`IBackWrite`) | `base.itf.IBackWrite` | 254 | 7 |

---

## 直接属性（共 51 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 2 | `productSupplyId` | 主表id | `product_supply_id` | 5d912e6b-8617-496c-b50f-16e979152298 | `quote` |  | ✓ |
| 3 | `status` | 状态 | `status` | Integer | `int` |  | ✓ |
| 4 | `materialId` | 物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 5 | `materialBrandId` | 物料品牌 | `material_brand_id` | 75116b40-efe4-455e-b62d-d56ac4811eb1 | `quote` |  | ✓ |
| 6 | `decisionId` | 定标单主键 | `decision_id` | 1fc86047-2eea-424c-b46f-8fd24fdcc970 | `quote` |  | ✓ |
| 7 | `dsnMaterialId` | 定标单表体主键 | `dsn_material_id` | 23f77ada-9b2b-43f8-963c-0d689e9b2464 | `quote` |  | ✓ |
| 8 | `priceStructure` | 价格构成 | `price_structure` | String | `text` |  | ✓ |
| 9 | `dimensionPricingId` | 报价主表主键 | `dimension_pricing_id` | a27a4bb3-6c84-4140-a3ae-ebbb3d2604d1 | `quote` |  | ✓ |
| 10 | `taxPrice` | 含税单价 | `tax_price` | Decimal | `number` |  | ✓ |
| 11 | `price` | 无税单价 | `price` | Decimal | `number` |  | ✓ |
| 12 | `taxCategoryId` | 税率id | `tax_category_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |  | ✓ |
| 13 | `taxrate` | 税率 | `taxrate` | Decimal | `number` |  | ✓ |
| 14 | `materialMainUnitId` | 主单位id | `material_main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 15 | `materialPurUnitId` | 采购单位id | `material_pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 16 | `materialPriceUnitId` | 计价单位id | `material_price_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 17 | `priceOuterDate` | 有效期 | `price_outer_date` | DateTime | `timestamp` |  | ✓ |
| 18 | `saleContractId` | 销售合同id | `sale_contract_id` | Long | `long` |  | ✓ |
| 19 | `contractId` | 采购合同id | `contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 | `quote` |  | ✓ |
| 20 | `contractMaterialId` | 采购合同表体 | `contract_material_id` | 07141343-35c1-4687-b99c-405bfa7a3096 | `quote` |  | ✓ |
| 21 | `productId` | 商品id | `product_id` | Long | `long` |  | ✓ |
| 22 | `productCode` | 商品编码 | `product_code` | String | `text` |  | ✓ |
| 23 | `productName` | 商品名称 | `product_name` | String | `text` |  | ✓ |
| 24 | `productSubject` | 商品标题 | `product_subject` | String | `text` |  | ✓ |
| 25 | `productImgUrl` | 商品主图 | `product_img_url` | String | `text` |  | ✓ |
| 26 | `productOpenTaxPrice` | 商品公开价 | `product_open_taxprice` | Decimal | `number` |  | ✓ |
| 27 | `productTaxrate` | 商品税率 | `product_taxrate` | Decimal | `number` |  | ✓ |
| 28 | `productUnit` | 商品单位 | `product_unit` | String | `text` |  | ✓ |
| 29 | `productBrand` | 商品品牌 | `product_brand` | String | `text` |  | ✓ |
| 30 | `skuId` | skuId | `sku_id` | Long | `long` |  | ✓ |
| 31 | `skuCode` | 商品sku编码 | `sku_code` | String | `text` |  | ✓ |
| 32 | `isPackage` | 是否包邮 | `is_package` | Integer | `int` |  | ✓ |
| 33 | `carriageRuleId` | 运费定价模板 | `carriage_rule_id` | Long | `long` |  | ✓ |
| 34 | `carriageRuleTempleteName` | 运费定价模板名称 | `carriage_rule_templete_name` | String | `text` |  | ✓ |
| 35 | `onhand` | 供应量 | `onhand` | Decimal | `number` |  | ✓ |
| 36 | `rejectedReason` | 驳回原因 | `rejected_reason` | String | `text` |  | ✓ |
| 37 | `scRejectedReason` | 上架驳回原因 | `sc_rejected_reason` | String | `text` |  | ✓ |
| 38 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 39 | `enterpriseId` | 供应商企业id | `enterprise_id` | Long | `long` |  | ✓ |
| 40 | `purEnterpriseId` | 采购商企业id | `pur_enterprise_id` | Long | `long` |  | ✓ |
| 41 | `buyerTenantId` | 采购商租户id | `buyer_tenant_id` | String | `text` |  | ✓ |
| 42 | `vendorTenantId` | 供应商租户id | `vendor_tenant_id` | String | `text` |  | ✓ |
| 43 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 44 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 45 | `sourceid` | 上游单据主表id | `sourceid` | Long | `long` |  | ✓ |
| 46 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long | `long` |  | ✓ |
| 47 | `source` | 上游单据类型 | `source` | String | `text` |  | ✓ |
| 48 | `upcode` | 上游单据号 | `upcode` | String | `text` |  | ✓ |
| 49 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String | `text` |  | ✓ |
| 50 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime | `timestamp` |  | ✓ |
| 51 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String | `text` |  | ✓ |

---

## 关联属性（共 13 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `dsnMaterialId` | 定标单表体主键 | `lawbid.decisionresult.CpuDsnMaterialDetail` | `dsn_material_id` |  →  |  |  | Service |  |
| 2 | `productSupplyId` | 主表id | `mall.productSupply.ProductSupply` | `product_supply_id` | details → productSupplyId | 1..n | true | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `materialBrandId` | 物料品牌 | `pc.brand.Brand` | `material_brand_id` |  →  |  |  | Service |  |
| 5 | `materialId` | 物料id | `pc.product.Product` | `material_id` |  →  |  |  | Service |  |
| 6 | `dimensionPricingId` | 报价主表主键 | `aa.pricecenter.BiDimensionPricing` | `dimension_pricing_id` |  →  |  |  | Service |  |
| 7 | `materialPriceUnitId` | 计价单位id | `pc.unit.Unit` | `material_price_unit_id` |  →  |  |  | Service |  |
| 8 | `materialMainUnitId` | 主单位id | `pc.unit.Unit` | `material_main_unit_id` |  →  |  |  | Service |  |
| 9 | `contractId` | 采购合同id | `cpu-contract.contract.ContractVO` | `contract_id` |  →  |  |  | Service |  |
| 10 | `materialPurUnitId` | 采购单位id | `pc.unit.Unit` | `material_pur_unit_id` |  →  |  |  | Service |  |
| 11 | `contractMaterialId` | 采购合同表体 | `cpu-contract.contract.ContractBodyVO` | `contract_material_id` |  →  |  |  | Service |  |
| 12 | `decisionId` | 定标单主键 | `lawbid.decisionresult.CpuDecision` | `decision_id` |  →  |  |  | Service |  |
| 13 | `taxCategoryId` | 税率id | `archive.taxArchives.TaxRateArchive` | `tax_category_id` |  →  |  |  | Service |  |

### Composition（子表）

- **productSupplyId**: `details` → `mall.productSupply.ProductSupply` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `dsnMaterialId` (定标单表体主键) | `lawbid.decisionresult.CpuDsnMaterialDetail` | `dsn_material_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `materialBrandId` (物料品牌) | `pc.brand.Brand` | `material_brand_id` |
| `materialId` (物料id) | `pc.product.Product` | `material_id` |
| `dimensionPricingId` (报价主表主键) | `aa.pricecenter.BiDimensionPricing` | `dimension_pricing_id` |
| `materialPriceUnitId` (计价单位id) | `pc.unit.Unit` | `material_price_unit_id` |
| `materialMainUnitId` (主单位id) | `pc.unit.Unit` | `material_main_unit_id` |
| `contractId` (采购合同id) | `cpu-contract.contract.ContractVO` | `contract_id` |
| `materialPurUnitId` (采购单位id) | `pc.unit.Unit` | `material_pur_unit_id` |
| `contractMaterialId` (采购合同表体) | `cpu-contract.contract.ContractBodyVO` | `contract_material_id` |
| `decisionId` (定标单主键) | `lawbid.decisionresult.CpuDecision` | `decision_id` |
| `taxCategoryId` (税率id) | `archive.taxArchives.TaxRateArchive` | `tax_category_id` |
