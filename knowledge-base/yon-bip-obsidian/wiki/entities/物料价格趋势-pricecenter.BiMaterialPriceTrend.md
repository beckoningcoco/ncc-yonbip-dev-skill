---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.pricecenter.BiMaterialPriceTrend"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 物料价格趋势 (`aa.pricecenter.BiMaterialPriceTrend`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_biprice` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.pricecenter.BiMaterialPriceTrend` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料价格趋势 |
| 物理表 | `cpu_biprice` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `4e1aff57-9893-47ad-9348-7c126683e3c2` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:19:09.0450` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |
| 编码 | `vsrc_billcode` | `vsrc_billcode` | String | 来源单据编号（必填，isCode）|

## 部署信息

- **部署时间**: 2025-10-24 23:29:24:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202509141412_metadata_aa-pricecenter.zip`
- **安装人**: mongoTools
- **安装排名**: `645ac0bf-7bd9-4cb0-b908-69aa6f187dcc`

## 业务场景

- `DataAuth`
- `report`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `data_auth`, `isMain`, `report`, `reportHide`

## 约束

- **migration_id** (MetaClassPrimary): id — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | UCF公共租户相关 (`BasedocITenant`) | `basedoc.basedocItf.BasedocITenant` | 103 | 1 |
| 3 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |

---

## 直接属性（共 125 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `vtenantId` | 采购租户id-用户中心 | `vtenant_id` | String | `text` |  | ✓ |
| 2 | `vpurchaseEnterpriseId` | 采购租户id-云采 | `vpurchase_enterprise_id` | String | `text` |  | ✓ |
| 3 | `vpurchaseEnterpriseCode` | 采购租户编码-云采 | `vpurchase_enterprise_code` | String | `text` |  | ✓ |
| 4 | `vpurchaseEnterpriseName` | 采购租户名称-云采 | `vpurchase_enterprise_name` | String | `text` |  | ✓ |
| 5 | `vpurchaseErpId` | 采购组织id-ERP | `vpurchase_erp_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 6 | `vpurchaseErpCode` | 采购组织编码-ERP | `vpurchase_erp_code` | String | `text` |  | ✓ |
| 7 | `vpurchaseErpName` | 采购组织名称-ERP | `vpurchase_erp_name` | String | `text` |  | ✓ |
| 8 | `vpurchaseCode` | 采购租户编码-用户中心 | `vpurchase_code` | String | `text` |  | ✓ |
| 9 | `vpurchaseName` | 采购租户名称-用户中心 | `vpurchase_name` | String | `text` |  | ✓ |
| 10 | `vpurchase` | 采购租户信息字符串 | `vpurchase` | String | `text` |  | ✓ |
| 11 | `vsupplyTenantId` | 供应商租户id-用户中心 | `vsupply_tenant_id` | String | `text` |  | ✓ |
| 12 | `vsupplyEnterpriseId` | 供应商租户id-云采 | `vsupply_enterprise_id` | String | `text` |  | ✓ |
| 13 | `vsupplyErpId` | 供应商id-ERP | `vsupply_erp_id` | String | `text` |  | ✓ |
| 14 | `vsupplyCode` | 供应商编码-供应商档案 | `vsupply_code` | String | `text` |  | ✓ |
| 15 | `vsupplyName` | 供应商名称-供应商档案 | `vsupply_name` | String | `text` |  | ✓ |
| 16 | `vsupply` | 供应商扩展字段 | `vsupply` | String | `text` |  | ✓ |
| 17 | `nsupplierId` | 供应商Id | `nsupplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 18 | `vmaterialErpId` | 物料id-erp | `vmaterial_erp_id` | String | `text` |  | ✓ |
| 19 | `vmaterialCode` | 物料编码 | `vmaterial_code` | String | `text` |  | ✓ |
| 20 | `vmaterialName` | 物料名称 | `vmaterial_name` | String | `text` |  | ✓ |
| 21 | `vmaterial` | 物料扩展字段 | `vmaterial` | String | `text` |  | ✓ |
| 22 | `nsum` | 数量 | `nsum` | Decimal | `number` |  | ✓ |
| 23 | `nprice` | 统一币种含税单价 | `nprice` | Decimal | `number` |  | ✓ |
| 24 | `nmny` | 价税合计 | `nmny` | Decimal | `number` |  | ✓ |
| 25 | `cpriceModel` | 报价类型 | `cprice_model` | String | `text` |  | ✓ |
| 26 | `vcondition` | 条件扩展字段 | `vcondition` | String | `text` |  | ✓ |
| 27 | `vprice` | 价格扩展字段 | `vprice` | String | `text` |  | ✓ |
| 28 | `vsrcMark` | 来源唯一标识 | `vsrc_mark` | String | `text` |  | ✓ |
| 29 | `dbilldate` | 来源单据生效时间 | `dbilldate` | String | `text` |  | ✓ |
| 30 | `ts` | 时间戳 | `ts` | Date | `date` |  | ✓ |
| 31 | `vupdateMark` | 同步事务标识-NC回调一次成功后记录一次 | `vupdate_mark` | String | `text` |  | ✓ |
| 32 | `vmaterialSpec` | 物料规格 | `vmaterial_spec` | String | `text` |  | ✓ |
| 33 | `vsupplyProdId` | 供应商商品id | `vsupply_prod_id` | String | `text` |  | ✓ |
| 34 | `vsupplyProdName` | 供应商商品名称 | `vsupply_prod_name` | String | `text` |  | ✓ |
| 35 | `vsupplyProdCode` | 供应商商品编码 | `vsupply_prod_code` | String | `text` |  | ✓ |
| 36 | `vunitName` | 单位名称 | `vunit_name` | String | `text` |  | ✓ |
| 37 | `vcurrency` | 采购币种 | `vcurrency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 38 | `npriceNoTax` | 采购币种无税单价 | `nprice_notax` | Decimal | `number` |  | ✓ |
| 39 | `vcurrencyOrigin` | 原币币种 | `vcurrency_origin` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 40 | `nrate` | 汇率 | `nrate` | Decimal | `number` |  | ✓ |
| 41 | `vrateType` | 汇率类型 | `vrate_type` | String | `text` |  | ✓ |
| 42 | `npriceOrigin` | 原币含税单价 | `nprice_origin` | Decimal | `number` |  | ✓ |
| 43 | `npriceNoTaxOrigin` | 原币无税单价 | `nprice_notax_origin` | Decimal | `number` |  | ✓ |
| 44 | `ntax` | 税率 | `ntax` | Decimal | `number` |  | ✓ |
| 45 | `nmnyNoTax` | 无税金额 | `nmny_notax` | Decimal | `number` |  | ✓ |
| 46 | `vsrcSystem` | 来源系统 | `vsrc_system` | String | `text` |  | ✓ |
| 47 | `vaddType` | 价格来源 | `vadd_type` | String | `text` |  | ✓ |
| 48 | `vsrcBillCode` | 来源单据编号 | `vsrc_billcode` | String | `text` |  | ✓ |
| 49 | `vbelongOrgCode` | 所属组织编码 | `vbelong_org_code` | String | `text` |  | ✓ |
| 50 | `vbelongOrgName` | 所属组织名称 | `vbelong_org_name` | String | `text` |  | ✓ |
| 51 | `nmatSkuId` | 物料sku | `nmat_sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |  | ✓ |
| 52 | `vtaxItemsId` | 税目id | `vtax_items_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |  | ✓ |
| 53 | `vtaxItemsCode` | 税目编码 | `vtax_items_code` | String | `text` |  | ✓ |
| 54 | `vtaxItemsName` | 税目名称 | `vtax_items_name` | String | `text` |  | ✓ |
| 55 | `vbusinessType` | 业务类型 | `vbusiness_type` | String | `text` |  | ✓ |
| 56 | `vpriceInvalidate` | 失效日期 | `vprice_invalidate` | String | `text` |  | ✓ |
| 57 | `nsumEnd` | 数量止 | `nsum_end` | Decimal | `number` |  | ✓ |
| 58 | `skuSpec` | sku规格 | `sku_spec` | String | `text` |  | ✓ |
| 59 | `orinpriceNoTaxOrigin` | 原币无税单价(原价) | `orinprice_notax_origin` | Decimal | `number` |  | ✓ |
| 60 | `orinpriceOrigin` | 原币含税单价(原价) | `orinprice_origin` | Decimal | `number` |  | ✓ |
| 61 | `discountRate` | 折扣率(%) | `discount_rate` | Decimal | `number` |  | ✓ |
| 62 | `skuDesc` | SKU规格说明 | `sku_desc` | String | `text` |  | ✓ |
| 63 | `receiveOrgId` | 到货组织id | `receive_org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 64 | `nsumStart` | 数量起 | `nsum_start` | Decimal | `number` |  | ✓ |
| 65 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 66 | `skuModel` | SKU型号 | `sku_model` | String | `text` |  | ✓ |
| 67 | `vpriceValidate` | 生效日期 | `vprice_validate` | String | `text` |  | ✓ |
| 68 | `tenant` | 租户id | `ytenant_id` | String | `text` | ✓ | ✓ |
| 69 | `npriceStatus` | 有效状态 | `nprice_status` | Integer | `int` |  | ✓ |
| 70 | `primaryId` | 来源表头id | `primary_id` | Long | `long` |  | ✓ |
| 71 | `receiveOrgName` | 到货组织名称 | `receive_org_name` | String | `text` |  | ✓ |
| 72 | `childId` | 来源表体id | `child_id` | Long | `long` |  | ✓ |
| 73 | `grandsonId` | 来源孙表id | `grandson_id` | Long | `long` |  | ✓ |
| 74 | `vpriceHash` | 价格查询hash | `vprice_hash` | String | `text` |  | ✓ |
| 75 | `vpriceHashNoVendor` | 价格查询hashNoVendor | `vprice_hash_no_vendor` | String | `text` |  | ✓ |
| 76 | `vbillTranstypeId` | 交易类型id | `vbill_transtype_id` | String | `text` |  | ✓ |
| 77 | `vbillTranstypeCode` | 交易类型编码 | `vbill_transtype_code` | String | `text` |  | ✓ |
| 78 | `vmemo` | 备注 | `vmemo` | String | `text` |  | ✓ |
| 79 | `vpurchaseOrgId` | 采购组织id-云采 | `vpurchase_org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 80 | `OperatorId` | 最新操作人ID | `operator_id` | String | `text` |  | ✓ |
| 81 | `OperatorName` | 最新操作人名称 | `operator_name` | String | `text` |  | ✓ |
| 82 | `OperateTime` | 最新操作时间 | `operate_time` | DateTime | `timestamp` |  | ✓ |
| 83 | `OperateType` | 操作类型 | `operate_type` | PriceListOperateType | `` |  | ✓ |
| 84 | `BrandId` | 品牌 | `brand_id` | 75116b40-efe4-455e-b62d-d56ac4811eb1 | `quote` |  | ✓ |
| 85 | `mainUnitNum` | 主计量单位数量 | `main_unit_num` | Decimal | `number` |  | ✓ |
| 86 | `mainUnitPrice` | 主计量单位含税单价 | `main_unit_price` | Decimal | `number` |  | ✓ |
| 87 | `mainUnitPriceNoTax` | 主计量单位无税单价 | `main_unit_price_notax` | Decimal | `number` |  | ✓ |
| 88 | `mainUnitUnifyPrice` | 主计量单位统一币种含税单价 | `main_unit_unify_price` | Decimal | `number` |  | ✓ |
| 89 | `mainUnitUnifyPriceNoTax` | 主计量单位统一币种无税单价 | `main_unit_unify_price_notax` | Decimal | `number` |  | ✓ |
| 90 | `BiPriceEntityFreeCharacteristics` | 物料自由项特征组 | `instance_id` | b4e97f60-2455-4678-a355-29104ed4d1b9 | `FreeCT` |  | ✓ |
| 91 | `BiPriceEntityDefineCharacter` | 价格目录自定义项 | `biprice_definenew` | 72b829aa-142b-44ba-a3c0-b41415c1fd88 | `UserDefine` |  | ✓ |
| 92 | `vunitId` | 单位id | `vunit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 93 | `mainUnit` | 物料主计量单位 | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 94 | `priceType` | 定价类型 | `price_type` | 8495de5e-0f17-483c-947c-a5a8a35739e6 | `quote` |  | ✓ |
| 95 | `priceScheme` | 价格方案 | `price_scheme` | 4850dcd9-c8e1-4882-bbd1-67a6dd8db017 | `quote` |  | ✓ |
| 96 | `quotationId` | 报价id | `quotation_id` | a27a4bb3-6c84-4140-a3ae-ebbb3d2604d1 | `quote` |  | ✓ |
| 97 | `priceStrategy` | 取价策略 | `price_trategy` | 3dab7aea-9e18-4a82-8712-f029fd1ec393 | `quote` |  | ✓ |
| 98 | `strategySchemeHash` | 策略方案哈希 | `strategy_scheme_hash` | String | `text` |  | ✓ |
| 99 | `npriceOriginCash` | 现金含税单价 | `nprice_origin_cash` | Decimal | `number` |  | ✓ |
| 100 | `npriceNoTaxOriginCash` | 现金无税单价 | `nprice_notax_origin_cash` | Decimal | `number` |  | ✓ |
| 101 | `npriceOriginAccount` | 账期含税单价 | `nprice_origin_account` | Decimal | `number` |  | ✓ |
| 102 | `npriceNoTaxOriginAccount` | 账期无税单价 | `nprice_notax_origin_account` | Decimal | `number` |  | ✓ |
| 103 | `npriceOriginAccept` | 承兑含税单价 | `nprice_origin_accept` | Decimal | `number` |  | ✓ |
| 104 | `npriceNoTaxOriginAccept` | 承兑无税单价 | `nprice_notax_origin_accept` | Decimal | `number` |  | ✓ |
| 105 | `isCalculate` | 是否参与价格计算 | `is_calculate` | PriceIsCalculate | `` |  | ✓ |
| 106 | `taxPriority` | 价格标识 | `tax_priority` | taxPriority | `` |  | ✓ |
| 107 | `fixedConversionRate` | 计价换算率(物料) | `fixed_conversion_rate` | Decimal | `number` |  | ✓ |
| 108 | `floatConversionRate` | 计价换算率 | `float_conversion_rate` | Decimal | `number` |  | ✓ |
| 109 | `discountTaxType` | 扣税类别 | `discount_tax_type` | String | `text` |  | ✓ |
| 110 | `operationId` | 工序主键 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 | `quote` |  | ✓ |
| 111 | `vmaterialId` | 物料id | `vmaterial_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 112 | `nbelongOrgId` | 所属组织id | `nbelong_org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 113 | `costquotegroupId` | 成本项报价id | `costquotegroup_id` | aa.costquote.CostQuoteGroup | `quote` |  | ✓ |
| 114 | `vsrc` | 来源标识 | `vsrc` | String | `text` |  | ✓ |
| 115 | `vmaterialType` | 物料型号 | `vmaterial_type` | String | `text` |  | ✓ |
| 116 | `vmatSkuCode` | sku编码 | `vmat_sku_code` | String | `text` |  | ✓ |
| 117 | `vmatSkuName` | sku名称 | `vmat_sku_name` | String | `text` |  | ✓ |
| 118 | `id` | id | `id` | Long | `long` |  | ✓ |
| 119 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 120 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 121 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 122 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 123 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 124 | `nrateDate` | 汇率日期 | `nrateDate` | DateTime | `timestamp` |  | ✓ |
| 125 | `nrateOps` | 汇率折算方式 | `nrateOps` | ExchangeRateMethod | `` |  | ✓ |

---

## 关联属性（共 22 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `costquotegroupId` | 成本项报价id | `aa.costquote.CostQuoteGroup` | `costquotegroup_id` |  →  |  |  | None |  |
| 2 | `vmaterialId` | 物料id | `pc.product.Product` | `vmaterial_id` |  →  |  |  | Service |  |
| 3 | `mainUnit` | 物料主计量单位 | `pc.unit.Unit` | `main_unit` |  →  |  |  | Service |  |
| 4 | `receiveOrgId` | 到货组织id | `bd.adminOrg.BaseOrgVO` | `receive_org_id` |  →  |  |  | Service |  |
| 5 | `BiPriceEntityFreeCharacteristics` | 物料自由项特征组 | `aa.pricecenter.BipriceCharacteristicsDefine` | `instance_id` |  →  |  |  | None |  |
| 6 | `vpurchaseErpId` | 采购组织id-ERP | `bd.adminOrg.BaseOrgVO` | `vpurchase_erp_id` |  →  |  |  | Service |  |
| 7 | `quotationId` | 报价id | `aa.pricecenter.BiDimensionPricing` | `quotation_id` | biMaterialPriceTrend → quotationId | 1..n | true | None |  |
| 8 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 9 | `vcurrencyOrigin` | 原币币种 | `bd.currencytenant.CurrencyTenantVO` | `vcurrency_origin` |  →  |  |  | Service |  |
| 10 | `priceType` | 定价类型 | `aa.pricetype.PriceType` | `price_type` |  →  |  |  | None |  |
| 11 | `nbelongOrgId` | 所属组织id | `bd.adminOrg.BaseOrgVO` | `nbelong_org_id` |  →  |  |  | Service |  |
| 12 | `BiPriceEntityDefineCharacter` | 价格目录自定义项 | `aa.pricecenter.BiPriceDefineNew` | `biprice_definenew` |  →  |  |  | None |  |
| 13 | `BrandId` | 品牌 | `pc.brand.Brand` | `brand_id` |  →  |  |  | Service |  |
| 14 | `priceScheme` | 价格方案 | `aa.dynamicpricescheme.PriceScheme` | `price_scheme` |  →  |  |  | None |  |
| 15 | `vtaxItemsId` | 税目id | `archive.taxArchives.TaxRateArchive` | `vtax_items_id` |  →  |  |  | Service |  |
| 16 | `priceStrategy` | 取价策略 | `aa.pricestrategy.PriceStrategy` | `price_trategy` |  →  |  |  | None |  |
| 17 | `vcurrency` | 采购币种 | `bd.currencytenant.CurrencyTenantVO` | `vcurrency` |  →  |  |  | Service |  |
| 18 | `vunitId` | 单位id | `pc.unit.Unit` | `vunit_id` |  →  |  |  | Service |  |
| 19 | `vpurchaseOrgId` | 采购组织id-云采 | `bd.adminOrg.BaseOrgVO` | `vpurchase_org_id` |  →  |  |  | Service |  |
| 20 | `operationId` | 工序主键 | `ed.operation.Operation` | `operation_id` |  →  |  |  | Service |  |
| 21 | `nmatSkuId` | 物料sku | `pc.product.ProductSKU` | `nmat_sku_id` |  →  |  |  | Service |  |
| 22 | `nsupplierId` | 供应商Id | `aa.vendor.Vendor` | `nsupplier_id` |  →  |  |  | Service |  |

### Composition（子表）

- **quotationId**: `biMaterialPriceTrend` → `aa.pricecenter.BiDimensionPricing` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `vmaterialId` (物料id) | `pc.product.Product` | `vmaterial_id` |
| `mainUnit` (物料主计量单位) | `pc.unit.Unit` | `main_unit` |
| `receiveOrgId` (到货组织id) | `bd.adminOrg.BaseOrgVO` | `receive_org_id` |
| `vpurchaseErpId` (采购组织id-ERP) | `bd.adminOrg.BaseOrgVO` | `vpurchase_erp_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `vcurrencyOrigin` (原币币种) | `bd.currencytenant.CurrencyTenantVO` | `vcurrency_origin` |
| `nbelongOrgId` (所属组织id) | `bd.adminOrg.BaseOrgVO` | `nbelong_org_id` |
| `BrandId` (品牌) | `pc.brand.Brand` | `brand_id` |
| `vtaxItemsId` (税目id) | `archive.taxArchives.TaxRateArchive` | `vtax_items_id` |
| `vcurrency` (采购币种) | `bd.currencytenant.CurrencyTenantVO` | `vcurrency` |
| `vunitId` (单位id) | `pc.unit.Unit` | `vunit_id` |
| `vpurchaseOrgId` (采购组织id-云采) | `bd.adminOrg.BaseOrgVO` | `vpurchase_org_id` |
| `operationId` (工序主键) | `ed.operation.Operation` | `operation_id` |
| `nmatSkuId` (物料sku) | `pc.product.ProductSKU` | `nmat_sku_id` |
| `nsupplierId` (供应商Id) | `aa.vendor.Vendor` | `nsupplier_id` |
