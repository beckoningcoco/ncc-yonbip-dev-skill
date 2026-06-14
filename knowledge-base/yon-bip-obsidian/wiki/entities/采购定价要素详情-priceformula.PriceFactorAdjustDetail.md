---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.priceformula.PriceFactorAdjustDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购定价要素详情 (`aa.priceformula.PriceFactorAdjustDetail`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_price_factor_adjust_detail` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.priceformula.PriceFactorAdjustDetail` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购定价要素详情 |
| 物理表 | `cpu_price_factor_adjust_detail` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:24:42.1300` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |

## 部署信息

- **部署时间**: 2026-05-22 23:53:07:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202604200925_metadata_aa-priceformula_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `d113ede2-2046-4f14-aa9b-92e189959780`

## 术语标记

`BusinessData`, `data_auth`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 1 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 25 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `adjustId` | 调整单id | `adjust_Id` | 34335817-1d3a-4266-8ffd-f4e4fe4c2258 | `quote` |  | ✓ |
| 2 | `factorClass` | 价格因子分类 | `factor_class` | 95fe9dd1-64c2-4846-8564-90ae3f011796 | `quote` |  | ✓ |
| 3 | `priceScheme` | 价格方案 | `price_scheme` | 4850dcd9-c8e1-4882-bbd1-67a6dd8db017 | `quote` |  | ✓ |
| 4 | `priceType` | 定价类型 | `price_type` | 8495de5e-0f17-483c-947c-a5a8a35739e6 | `quote` |  | ✓ |
| 5 | `factorType` | 价格因子类型 | `factor_type` | FactorType | `` |  | ✓ |
| 6 | `code` | 价格因子编码 | `code` | String | `text` |  | ✓ |
| 7 | `valueSource` | 值来源 | `value_source` | ValueSource | `` |  | ✓ |
| 8 | `factorValue` | 原因子值 | `factor_value` | String | `text` |  | ✓ |
| 9 | `factorValueNew` | 新因子值 | `factor_value_new` | String | `text` |  | ✓ |
| 10 | `currency` | 币种 | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 11 | `factorUnit` | 计价单位 | `factor_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 12 | `updateFreq` | 更新频度 | `update_freq` | UpdateFreq | `` |  | ✓ |
| 13 | `effectiveDate` | 生效日期 | `effective_date` | DateTime | `timestamp` |  | ✓ |
| 14 | `expiryDate` | 失效日期 | `expiry_date` | DateTime | `timestamp` |  | ✓ |
| 15 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 16 | `factorId` | 价格因子 | `factor_id` | 5cf7014b-8d50-40b9-b2a0-bc00ad18e423 | `quote` |  | ✓ |
| 17 | `valueType` | 值类型 | `value_ype` | ValueType | `` |  | ✓ |
| 18 | `orgId` | 采购组织 | `org_id` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | ✓ |
| 19 | `vendorId` | 供应商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 20 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 21 | `productClassId` | 物料分类 | `productclass_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |  | ✓ |
| 22 | `priceFactorAdjustDetailChdId` | 采购定价要素子表自定义项 | `chd_id` | d8231631-8844-4bbd-a977-54af5af7e3d5 | `UserDefine` |  | ✓ |
| 23 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 24 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 25 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |

---

## 关联属性（共 13 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `factorUnit` | 计价单位 | `pc.unit.Unit` | `factor_unit` |  →  |  |  | Service |  |
| 2 | `adjustId` | 调整单id | `aa.priceformula.PriceFactorAdjust` | `adjust_Id` | priceadjustdetail → adjustId | 1..n | true | None |  |
| 3 | `productClassId` | 物料分类 | `pc.cls.ManagementClass` | `productclass_id` |  →  |  |  | Service |  |
| 4 | `productId` | 物料 | `pc.product.Product` | `product_id` |  →  |  |  | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 6 | `priceType` | 定价类型 | `aa.pricetype.PriceType` | `price_type` |  →  |  |  | None |  |
| 7 | `vendorId` | 供应商 | `aa.vendor.Vendor` | `vendor_id` |  →  |  |  | Service |  |
| 8 | `priceScheme` | 价格方案 | `aa.dynamicpricescheme.PriceScheme` | `price_scheme` |  →  |  |  | None |  |
| 9 | `orgId` | 采购组织 | `bd.adminOrg.BaseOrgVO` | `org_id` |  →  |  |  | Service |  |
| 10 | `factorId` | 价格因子 | `aa.priceformula.PriceFactor` | `factor_id` |  →  |  |  | None |  |
| 11 | `factorClass` | 价格因子分类 | `aa.priceformula.PriceFactorClass` | `factor_class` |  →  |  |  | None |  |
| 12 | `currency` | 币种 | `bd.currencytenant.CurrencyTenantVO` | `currency` |  →  |  |  | Service |  |
| 13 | `priceFactorAdjustDetailChdId` | 采购定价要素子表自定义项 | `aa.priceformula.PriceFactorAdjustDetailChd` | `chd_id` |  →  |  |  | None |  |

### Composition（子表）

- **adjustId**: `priceadjustdetail` → `aa.priceformula.PriceFactorAdjust` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `factorUnit` (计价单位) | `pc.unit.Unit` | `factor_unit` |
| `productClassId` (物料分类) | `pc.cls.ManagementClass` | `productclass_id` |
| `productId` (物料) | `pc.product.Product` | `product_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `vendorId` (供应商) | `aa.vendor.Vendor` | `vendor_id` |
| `orgId` (采购组织) | `bd.adminOrg.BaseOrgVO` | `org_id` |
| `currency` (币种) | `bd.currencytenant.CurrencyTenantVO` | `currency` |
