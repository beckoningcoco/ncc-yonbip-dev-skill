---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.priceformula.PriceFactor"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 价格因子 (`aa.priceformula.PriceFactor`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_price_factor` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.priceformula.PriceFactor` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 价格因子 |
| 物理表 | `cpu_price_factor` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `153e31a2-6d75-49c7-bbbd-30ccc1083310` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:09.5280` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键id |
| 编码 | `code` | `code` | String | 因子编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:53:02:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202603101530_metadata_aa-priceformula_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `6f2735d8-a564-4781-b599-e0ee4338186c`

## 业务场景

- `dataMultilanguage`
- `imextmp`
- `billcode`

## 术语标记

`isMain`, `MasterData`

## 约束

- **code,ytenant_transform** (transformKey): code — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 2 | 审计信息 (`YcIAuditInfo`) | `aa.priceformula.YcIAuditInfo` | 201 | 2 |
| 3 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 4 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 5 | 自动编码 (`IAutoCode`) | `ucfbase.ucfbaseItf.IAutoCode` | 37 | 0 |

---

## 直接属性（共 40 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `creatorName` | 创建人 | `creatorName` | String | `text` |  | ✓ |
| 2 | `factorClass` | 因子分类 | `factor_class` | 95fe9dd1-64c2-4846-8564-90ae3f011796 | `quote` |  | ✓ |
| 3 | `creator` | 创建人id | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 4 | `factorSource` | 因子来源 | `factor_source` | FactorSource | `` |  | ✓ |
| 5 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 6 | `factorType` | 因子类型 | `factor_type` | FactorType | `` |  | ✓ |
| 7 | `modifier` | 修改人id | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 8 | `modifierName` | 修改人 | `modifierName` | String | `text` |  | ✓ |
| 9 | `code` | 因子编码 | `code` | String | `text` |  | ✓ |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 11 | `name` | 因子名称 | `name` | String | `multiLanguage` |  | ✓ |
| 12 | `factorDesc` | 因子说明 | `factor_desc` | String | `text` |  | ✓ |
| 13 | `valueSource` | 值来源 | `value_source` | ValueSource | `` |  | ✓ |
| 14 | `valueType` | 固定值类型 | `value_ype` | ValueType | `` |  | ✓ |
| 15 | `souObject` | 来源对象URI | `sou_object` | String | `text` |  | ✓ |
| 16 | `souObjectName` | 来源对象 | `sou_object_name` | String | `text` |  | ✓ |
| 17 | `souAttrName` | 来源属性 | `sou_attr_name` | String | `text` |  | ✓ |
| 18 | `souAttr` | 来源属性字段名 | `sou_attr` | String | `text` |  | ✓ |
| 19 | `priceUnitSour` | 价格类引用值计价单位来源字段名 | `price_unit_sour` | String | `text` |  | ✓ |
| 20 | `priceUnitSourName` | 价格类引用值计价单位来源 | `price_unit_sour_name` | String | `text` |  | ✓ |
| 21 | `curSouObject` | 币种来源对象URI | `cur_sou_object` | String | `text` |  | ✓ |
| 22 | `curSouObjectName` | 币种来源对象 | `cur_sou_object_name` | String | `text` |  | ✓ |
| 23 | `priceCurrSour` | 价格类引用值币种来源字段名 | `price_curr_sour` | String | `text` |  | ✓ |
| 24 | `priceCurrSourName` | 价格类引用值币种来源 | `price_curr_sour_name` | String | `text` |  | ✓ |
| 25 | `factorValue` | 最新因子值 | `factor_value` | String | `text` |  | ✓ |
| 26 | `currency` | 最新因子值币种 | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 27 | `factorUnit` | 最新因子值计价单位 | `factor_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 28 | `updateFreq` | 更新频度 | `update_freq` | UpdateFreq | `` |  | ✓ |
| 29 | `effectiveDate` | 生效日期 | `effective_date` | DateTime | `timestamp` | ✓ |  |
| 30 | `expiryDate` | 失效日期 | `expiry_date` | DateTime | `timestamp` |  | ✓ |
| 31 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 32 | `id` | 主键id | `id` | Long | `long` |  | ✓ |
| 33 | `PriceFactorDimensionList` | 价格因子值影响维度 | `` | 547a75ff-8ccc-43fe-a411-7c17cbeeee25 | `` |  |  |
| 34 | `dimensionType` | 维度类型 | `dimension_type` | String | `text` |  | ✓ |
| 35 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 36 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 37 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 38 | `orgId` | 组织 | `orgid` | a4916c85-f087-4e87-a178-0ad37aff7cd0 | `quote` |  | ✓ |
| 39 | `scope` | 适用范围 | `apply_scope` | String | `text` |  | ✓ |
| 40 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 8 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `factorUnit` | 最新因子值计价单位 | `pc.unit.Unit` | `factor_unit` |  →  |  |  | Service |  |
| 2 | `creator` | 创建人id | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 3 | `PriceFactorDimensionList` | 价格因子值影响维度 | `aa.priceformula.PriceFactorDimension` | `` | PriceFactorDimensionList → factor | 0..n | true | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `modifier` | 修改人id | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 6 | `factorClass` | 因子分类 | `aa.priceformula.PriceFactorClass` | `factor_class` |  →  |  |  | None |  |
| 7 | `currency` | 最新因子值币种 | `bd.currencytenant.CurrencyTenantVO` | `currency` |  →  |  |  | Service |  |
| 8 | `orgId` | 组织 | `org.func.PurchaseOrg` | `orgid` |  →  |  |  | Service |  |

### Composition（子表）

- **PriceFactorDimensionList**: `PriceFactorDimensionList` → `aa.priceformula.PriceFactorDimension` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `factorUnit` (最新因子值计价单位) | `pc.unit.Unit` | `factor_unit` |
| `creator` (创建人id) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人id) | `base.user.BipUser` | `modifier` |
| `currency` (最新因子值币种) | `bd.currencytenant.CurrencyTenantVO` | `currency` |
| `orgId` (组织) | `org.func.PurchaseOrg` | `orgid` |
