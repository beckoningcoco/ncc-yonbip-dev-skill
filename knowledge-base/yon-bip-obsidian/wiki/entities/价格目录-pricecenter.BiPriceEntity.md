---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.pricecenter.BiPriceEntity"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 价格目录 (`aa.pricecenter.BiPriceEntity`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_biprice` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.pricecenter.BiPriceEntity` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 价格目录 |
| 物理表 | `cpu_biprice` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `dfb29088-66ac-4aee-a6d6-79785246f7dd` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:06.3150` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 价格目录主键id |
| 编码 | `vsrc_billcode` | `vsrc_billcode` | String | 来源单据编号（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:53:02:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202603171728_metadata_aa-pricecenter_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `629465dc-4c3e-490b-9cef-e5807a7883d6`

## 业务场景

- `FieldAuth`
- `workflow`
- `UITemplate`
- `DataAuth`
- `imextmp`
- `report`
- `userdefine`
- `classified`
- `msgtemplate`
- `api`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `data_auth`, `isMain`, `dataAuth`

## 约束

- **migration_id** (MetaClassPrimary): id — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | UCF公共租户相关 (`BasedocITenant`) | `basedoc.basedocItf.BasedocITenant` | 103 | 1 |
| 2 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 132 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `BiPriceEntityDefineCharacter` | 价格目录自定义项 | `biprice_definenew` | 72b829aa-142b-44ba-a3c0-b41415c1fd88 | `UserDefine` |  | ✓ |
| 2 | `BiPriceEntityFreeCharacteristics` | 物料自由项特征组 | `instance_id` | b4e97f60-2455-4678-a355-29104ed4d1b9 | `FreeCT` |  | ✓ |
| 3 | `vmaterialId` | 物料id | `vmaterial_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 4 | `OperateTime` | 最新操作时间 | `operate_time` | DateTime | `timestamp` |  | ✓ |
| 5 | `vmaterialName` | 物料名称 | `vmaterial_name` | String | `text` |  | ✓ |
| 6 | `OperateType` | 操作类型 | `operate_type` | PriceListOperateType | `` |  | ✓ |
| 7 | `vsupplyCode` | 供应商编码-供应商档案 | `vsupply_code` | String | `text` |  | ✓ |
| 8 | `vsupplyName` | 供应商名称-供应商档案 | `vsupply_name` | String | `text` |  | ✓ |
| 9 | `OperatorId` | 最新操作人ID | `operator_id` | String | `text` |  | ✓ |
| 10 | `vaddType` | 价格来源 | `vadd_type` | String | `text` |  | ✓ |
| 11 | `BrandId` | 品牌 | `brand_id` | 75116b40-efe4-455e-b62d-d56ac4811eb1 | `quote` |  | ✓ |
| 12 | `OperatorName` | 最新操作人名称 | `operator_name` | String | `text` |  | ✓ |
| 13 | `costquotegroupId` | 成本项报价id | `costquotegroup_id` | 2b728cc3-82ca-4e8f-8b98-49f9f1df7acd | `quote` |  | ✓ |
| 14 | `nrateDate` | 汇率日期 | `nrateDate` | DateTime | `timestamp` |  | ✓ |
| 15 | `nrateOps` | 汇率折算方式 | `nrateOps` | ExchangeRateMethod | `` |  | ✓ |
| 16 | `fixedConversionRateNum` | 计价换算率分子(物料) | `fixed_conversion_ratenum` | Decimal | `number` |  | ✓ |
| 17 | `fixedConversionRateDen` | 计价换算率分母(物料) | `fixed_conversion_rateden` | Decimal | `number` |  | ✓ |
| 18 | `floatConversionRateNum` | 计价换算率分子 | `float_conversion_ratenum` | Decimal | `number` |  | ✓ |
| 19 | `floatConversionRateDen` | 计价换算率分母 | `float_conversion_rateden` | Decimal | `number` |  | ✓ |
| 20 | `stopReason` | 停用原因 | `stop_reason` | String | `text` |  | ✓ |
| 21 | `formulaId` | 价格公式ID | `formula_id` | 97790819-6d1f-4b4b-8d1c-f6d78b6531e4 | `quote` |  | ✓ |
| 22 | `operationId` | 工序主键 | `operation_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 | `quote` |  | ✓ |
| 23 | `discountTaxType` | 扣税类别 | `discount_tax_type` | String | `text` |  | ✓ |
| 24 | `priceScheme` | 价格方案 | `price_scheme` | 4850dcd9-c8e1-4882-bbd1-67a6dd8db017 | `quote` |  | ✓ |
| 25 | `npriceNoTaxOriginAccount` | 账期无税单价 | `nprice_notax_origin_account` | Decimal | `number` |  | ✓ |
| 26 | `npriceNoTaxOriginCash` | 现金无税单价 | `nprice_notax_origin_cash` | Decimal | `number` |  | ✓ |
| 27 | `priceType` | 定价类型 | `price_type` | 8495de5e-0f17-483c-947c-a5a8a35739e6 | `quote` |  | ✓ |
| 28 | `strategySchemeHash` | 策略方案哈希 | `strategy_scheme_hash` | String | `text` |  | ✓ |
| 29 | `npriceOriginAccept` | 承兑含税单价 | `nprice_origin_accept` | Decimal | `number` |  | ✓ |
| 30 | `quotationId` | 报价id | `quotation_id` | a27a4bb3-6c84-4140-a3ae-ebbb3d2604d1 | `quote` |  | ✓ |
| 31 | `priceStrategy` | 取价策略 | `price_trategy` | 3dab7aea-9e18-4a82-8712-f029fd1ec393 | `quote` |  | ✓ |
| 32 | `npriceOriginAccount` | 账期含税单价 | `nprice_origin_account` | Decimal | `number` |  | ✓ |
| 33 | `npriceNoTaxOriginAccept` | 承兑无税单价 | `nprice_notax_origin_accept` | Decimal | `number` |  | ✓ |
| 34 | `npriceOriginCash` | 现金含税单价 | `nprice_origin_cash` | Decimal | `number` |  | ✓ |
| 35 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 36 | `isCalculate` | 是否参与价格计算 | `is_calculate` | PriceIsCalculate | `` |  | ✓ |
| 37 | `vpurchaseOrgId` | 采购组织id-云采 | `vpurchase_org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 38 | `nsumStart` | 数量起 | `nsum_start` | Decimal | `number` |  | ✓ |
| 39 | `fixedConversionRate` | 计价换算率(物料) | `fixed_conversion_rate` | Decimal | `number` |  | ✓ |
| 40 | `floatConversionRate` | 计价换算率 | `float_conversion_rate` | Decimal | `number` |  | ✓ |
| 41 | `mainUnit` | 物料主计量单位 | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 42 | `mainUnitNum` | 主计量单位数量 | `main_unit_num` | Decimal | `number` |  | ✓ |
| 43 | `mainUnitPrice` | 主计量单位含税单价 | `main_unit_price` | Decimal | `number` |  | ✓ |
| 44 | `mainUnitPriceNoTax` | 主计量单位无税单价 | `main_unit_price_notax` | Decimal | `number` |  | ✓ |
| 45 | `mainUnitUnifyPrice` | 主计量单位统一币种含税单价 | `main_unit_unify_price` | Decimal | `number` |  | ✓ |
| 46 | `mainUnitUnifyPriceNoTax` | 主计量单位统一币种无税单价 | `main_unit_unify_price_notax` | Decimal | `number` |  | ✓ |
| 47 | `taxPriority` | 价格标识 | `tax_priority` | taxPriority | `` |  | ✓ |
| 48 | `tenant` | 租户id | `ytenant_id` | String | `text` | ✓ | ✓ |
| 49 | `vmaterialCode` | 物料编码 | `vmaterial_code` | String | `text` |  | ✓ |
| 50 | `nsupplierId` | 供应商Id | `nsupplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 51 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 52 | `vmatSkuName` | sku名称 | `vmat_sku_name` | String | `text` |  | ✓ |
| 53 | `npriceNoTax` | 采购币种无税单价 | `nprice_notax` | Decimal | `number` |  | ✓ |
| 54 | `npriceNoTaxOrigin` | 原币无税单价 | `nprice_notax_origin` | Decimal | `number` |  | ✓ |
| 55 | `nprice` | 统一币种含税单价 | `nprice` | Decimal | `number` |  | ✓ |
| 56 | `vmatSkuCode` | sku编码 | `vmat_sku_code` | String | `text` |  | ✓ |
| 57 | `orinpriceNoTaxOrigin` | 原币无税单价(原价) | `orinprice_notax_origin` | Decimal | `number` |  | ✓ |
| 58 | `orinpriceOrigin` | 原币含税单价(原价) | `orinprice_origin` | Decimal | `number` |  | ✓ |
| 59 | `vpurchaseEnterpriseName` | 采购租户名称-云采 | `vpurchase_enterprise_name` | String | `text` |  | ✓ |
| 60 | `cpriceModel` | 报价类型 | `cprice_model` | String | `text` |  | ✓ |
| 61 | `nsum` | 数量 | `nsum` | Decimal | `number` |  | ✓ |
| 62 | `nsumEnd` | 数量止 | `nsum_end` | Decimal | `number` |  | ✓ |
| 63 | `vpurchaseCode` | 采购租户编码-用户中心 | `vpurchase_code` | String | `text` |  | ✓ |
| 64 | `npriceOrigin` | 原币含税单价 | `nprice_origin` | Decimal | `number` |  | ✓ |
| 65 | `vcurrency` | 折算币种 | `vcurrency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 66 | `vpriceInvalidate` | 失效日期 | `vprice_invalidate` | String | `text` |  | ✓ |
| 67 | `vpriceValidate` | 生效日期 | `vprice_validate` | String | `text` |  | ✓ |
| 68 | `vpurchaseName` | 采购租户名称-用户中心 | `vpurchase_name` | String | `text` |  | ✓ |
| 69 | `dbilldate` | 来源单据生效时间 | `dbilldate` | String | `text` |  | ✓ |
| 70 | `vsrcBillCode` | 来源单据编号 | `vsrc_billcode` | String | `text` |  | ✓ |
| 71 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 72 | `vsrcSystem` | 来源系统 | `vsrc_system` | String | `text` |  | ✓ |
| 73 | `discountRate` | 折扣率(%) | `discount_rate` | Decimal | `number` |  | ✓ |
| 74 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 75 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 76 | `grandsonId` | 来源孙表id | `grandson_id` | Long | `long` |  | ✓ |
| 77 | `id` | 价格目录主键id | `id` | Long | `long` |  | ✓ |
| 78 | `nbelongOrgId` | 所属组织id | `nbelong_org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 79 | `nmatSkuId` | 物料sku | `nmat_sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |  | ✓ |
| 80 | `nmny` | 价税合计 | `nmny` | Decimal | `number` |  | ✓ |
| 81 | `nmnyNoTax` | 无税金额 | `nmny_notax` | Decimal | `number` |  | ✓ |
| 82 | `npriceStatus` | 有效状态 | `nprice_status` | Integer | `int` |  | ✓ |
| 83 | `nrate` | 汇率 | `nrate` | Decimal | `number` |  | ✓ |
| 84 | `ntax` | 税率 | `ntax` | Decimal | `number` |  | ✓ |
| 85 | `primaryId` | 来源表头id | `primary_id` | Long | `long` |  | ✓ |
| 86 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 87 | `receiveOrgId` | 到货组织id | `receive_org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 88 | `receiveOrgName` | 到货组织名称 | `receive_org_name` | String | `text` |  | ✓ |
| 89 | `skuDesc` | SKU规格说明 | `sku_desc` | String | `text` |  | ✓ |
| 90 | `skuModel` | SKU型号 | `sku_model` | String | `text` |  | ✓ |
| 91 | `skuSpec` | sku规格 | `sku_spec` | String | `text` |  | ✓ |
| 92 | `ts` | 时间戳 | `ts` | Date | `date` |  | ✓ |
| 93 | `vbelongOrgCode` | 所属组织编码 | `vbelong_org_code` | String | `text` |  | ✓ |
| 94 | `vbelongOrgName` | 所属组织名称 | `vbelong_org_name` | String | `text` |  | ✓ |
| 95 | `vbillTranstypeCode` | 交易类型编码 | `vbill_transtype_code` | String | `text` |  | ✓ |
| 96 | `vbillTranstypeId` | 交易类型id | `vbill_transtype_id` | String | `text` |  | ✓ |
| 97 | `vbusinessType` | 业务类型 | `vbusiness_type` | String | `text` |  | ✓ |
| 98 | `vcondition` | 条件扩展字段 | `vcondition` | String | `text` |  | ✓ |
| 99 | `vcurrencyOrigin` | 原币币种 | `vcurrency_origin` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 100 | `vmaterial` | 物料扩展字段 | `vmaterial` | String | `text` |  | ✓ |
| 101 | `vmaterialErpId` | 物料id-erp | `vmaterial_erp_id` | String | `text` |  | ✓ |
| 102 | `vmaterialSpec` | 物料规格 | `vmaterial_spec` | String | `text` |  | ✓ |
| 103 | `childId` | 来源表体id | `child_id` | Long | `long` |  | ✓ |
| 104 | `vmaterialType` | 物料型号 | `vmaterial_type` | String | `text` |  | ✓ |
| 105 | `vmemo` | 备注 | `vmemo` | String | `text` |  | ✓ |
| 106 | `vprice` | 价格扩展字段 | `vprice` | String | `text` |  | ✓ |
| 107 | `vpriceHash` | 价格查询hash | `vprice_hash` | String | `text` |  | ✓ |
| 108 | `vpriceHashNoVendor` | 价格查询hashNoVendor | `vprice_hash_no_vendor` | String | `text` |  | ✓ |
| 109 | `vpurchase` | 采购租户信息字符串 | `vpurchase` | String | `text` |  | ✓ |
| 110 | `vpurchaseEnterpriseCode` | 采购租户编码-云采 | `vpurchase_enterprise_code` | String | `text` |  | ✓ |
| 111 | `vpurchaseEnterpriseId` | 采购租户id-云采 | `vpurchase_enterprise_id` | String | `text` |  | ✓ |
| 112 | `vpurchaseErpCode` | 采购组织编码-ERP | `vpurchase_erp_code` | String | `text` |  | ✓ |
| 113 | `vpurchaseErpId` | 采购组织id-ERP | `vpurchase_erp_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 114 | `vpurchaseErpName` | 采购组织名称-ERP | `vpurchase_erp_name` | String | `text` |  | ✓ |
| 115 | `vrateType` | 汇率类型 | `vrate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 | `quote` |  | ✓ |
| 116 | `vsrc` | 来源标识 | `vsrc` | String | `text` |  | ✓ |
| 117 | `vsrcMark` | 来源唯一标识 | `vsrc_mark` | String | `text` |  | ✓ |
| 118 | `vsupply` | 供应商扩展字段 | `vsupply` | String | `text` |  | ✓ |
| 119 | `vsupplyEnterpriseId` | 供应商租户id-云采 | `vsupply_enterprise_id` | String | `text` |  | ✓ |
| 120 | `vsupplyErpId` | 供应商id-ERP | `vsupply_erp_id` | String | `text` |  | ✓ |
| 121 | `vsupplyProdCode` | 供应商商品编码 | `vsupply_prod_code` | String | `text` |  | ✓ |
| 122 | `vsupplyProdId` | 供应商商品id | `vsupply_prod_id` | String | `text` |  | ✓ |
| 123 | `vsupplyProdName` | 供应商商品名称 | `vsupply_prod_name` | String | `text` |  | ✓ |
| 124 | `vsupplyTenantId` | 供应商租户id-用户中心 | `vsupply_tenant_id` | String | `text` |  | ✓ |
| 125 | `vtaxItemsCode` | 税目编码 | `vtax_items_code` | String | `text` |  | ✓ |
| 126 | `vtaxItemsId` | 税目id | `vtax_items_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |  | ✓ |
| 127 | `vtaxItemsName` | 税目名称 | `vtax_items_name` | String | `text` |  | ✓ |
| 128 | `vtenantId` | 采购租户id-用户中心 | `vtenant_id` | String | `text` |  | ✓ |
| 129 | `vunitId` | 单位id | `vunit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 130 | `vunitName` | 单位名称 | `vunit_name` | String | `text` |  | ✓ |
| 131 | `vupdateMark` | 同步事务标识-NC回调一次成功后记录一次 | `vupdate_mark` | String | `text` |  | ✓ |
| 132 | `defines` | 价格目录自由自定义项 | `` | 3c7dfc35-4fd6-4ccb-b7a6-48773ca51022 | `` |  |  |

---

## 关联属性（共 25 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `vpurchaseErpId` | 采购组织id-ERP | `bd.adminOrg.BaseOrgVO` | `vpurchase_erp_id` |  →  |  |  | Service |  |
| 2 | `vcurrencyOrigin` | 原币币种 | `bd.currencytenant.CurrencyTenantVO` | `vcurrency_origin` |  →  |  |  | Service |  |
| 3 | `vrateType` | 汇率类型 | `bd.exchangeRate.ExchangeRateTypeVO` | `vrate_type` |  →  |  |  | Service |  |
| 4 | `BrandId` | 品牌 | `pc.brand.Brand` | `brand_id` |  →  |  |  | Service |  |
| 5 | `priceScheme` | 价格方案 | `aa.dynamicpricescheme.PriceScheme` | `price_scheme` |  →  |  |  | None |  |
| 6 | `vtaxItemsId` | 税目id | `archive.taxArchives.TaxRateArchive` | `vtax_items_id` |  →  |  |  | Service |  |
| 7 | `defines` | 价格目录自由自定义项 | `aa.pricecenter.BiPriceAttrextItem` | `` | defines → id | 1 | true | None | ⚠️ |
| 8 | `priceStrategy` | 取价策略 | `aa.pricestrategy.PriceStrategy` | `price_trategy` |  →  |  |  | None |  |
| 9 | `vcurrency` | 折算币种 | `bd.currencytenant.CurrencyTenantVO` | `vcurrency` |  →  |  |  | Service |  |
| 10 | `vpurchaseOrgId` | 采购组织id-云采 | `bd.adminOrg.BaseOrgVO` | `vpurchase_org_id` |  →  |  |  | Service |  |
| 11 | `operationId` | 工序主键 | `ed.operation.Operation` | `operation_id` |  →  |  |  | Service |  |
| 12 | `costquotegroupId` | 成本项报价id | `aa.costquote.CpuCostPricing` | `costquotegroup_id` |  →  |  |  | None |  |
| 13 | `vmaterialId` | 物料id | `pc.product.Product` | `vmaterial_id` |  →  |  |  | Service |  |
| 14 | `mainUnit` | 物料主计量单位 | `pc.unit.Unit` | `main_unit` |  →  |  |  | Service |  |
| 15 | `receiveOrgId` | 到货组织id | `bd.adminOrg.BaseOrgVO` | `receive_org_id` |  →  |  |  | Service |  |
| 16 | `BiPriceEntityFreeCharacteristics` | 物料自由项特征组 | `aa.pricecenter.BipriceCharacteristicsDefine` | `instance_id` |  →  |  |  | None |  |
| 17 | `quotationId` | 报价id | `aa.pricecenter.BiDimensionPricing` | `quotation_id` | biPriceEntityList → quotationId | 1..n | true | None |  |
| 18 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 19 | `priceType` | 定价类型 | `aa.pricetype.PriceType` | `price_type` |  →  |  |  | None |  |
| 20 | `nbelongOrgId` | 所属组织id | `bd.adminOrg.BaseOrgVO` | `nbelong_org_id` |  →  |  |  | Service |  |
| 21 | `BiPriceEntityDefineCharacter` | 价格目录自定义项 | `aa.pricecenter.BiPriceDefineNew` | `biprice_definenew` |  →  |  |  | None |  |
| 22 | `vunitId` | 单位id | `pc.unit.Unit` | `vunit_id` |  →  |  |  | Service |  |
| 23 | `formulaId` | 价格公式ID | `aa.priceformula.PriceFormula` | `formula_id` |  →  |  |  | None |  |
| 24 | `nmatSkuId` | 物料sku | `pc.product.ProductSKU` | `nmat_sku_id` |  →  |  |  | Service |  |
| 25 | `nsupplierId` | 供应商Id | `aa.vendor.Vendor` | `nsupplier_id` |  →  |  |  | Service |  |

### Composition（子表）

- **defines**: `defines` → `aa.pricecenter.BiPriceAttrextItem` | 1 ⚠️ 已废弃
- **quotationId**: `biPriceEntityList` → `aa.pricecenter.BiDimensionPricing` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `vpurchaseErpId` (采购组织id-ERP) | `bd.adminOrg.BaseOrgVO` | `vpurchase_erp_id` |
| `vcurrencyOrigin` (原币币种) | `bd.currencytenant.CurrencyTenantVO` | `vcurrency_origin` |
| `vrateType` (汇率类型) | `bd.exchangeRate.ExchangeRateTypeVO` | `vrate_type` |
| `BrandId` (品牌) | `pc.brand.Brand` | `brand_id` |
| `vtaxItemsId` (税目id) | `archive.taxArchives.TaxRateArchive` | `vtax_items_id` |
| `vcurrency` (折算币种) | `bd.currencytenant.CurrencyTenantVO` | `vcurrency` |
| `vpurchaseOrgId` (采购组织id-云采) | `bd.adminOrg.BaseOrgVO` | `vpurchase_org_id` |
| `operationId` (工序主键) | `ed.operation.Operation` | `operation_id` |
| `vmaterialId` (物料id) | `pc.product.Product` | `vmaterial_id` |
| `mainUnit` (物料主计量单位) | `pc.unit.Unit` | `main_unit` |
| `receiveOrgId` (到货组织id) | `bd.adminOrg.BaseOrgVO` | `receive_org_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `nbelongOrgId` (所属组织id) | `bd.adminOrg.BaseOrgVO` | `nbelong_org_id` |
| `vunitId` (单位id) | `pc.unit.Unit` | `vunit_id` |
| `nmatSkuId` (物料sku) | `pc.product.ProductSKU` | `nmat_sku_id` |
| `nsupplierId` (供应商Id) | `aa.vendor.Vendor` | `nsupplier_id` |
