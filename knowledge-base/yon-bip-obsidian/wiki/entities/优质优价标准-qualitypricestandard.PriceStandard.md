---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.qualitypricestandard.PriceStandard"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 优质优价标准 (`aa.qualitypricestandard.PriceStandard`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_price_standard` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.qualitypricestandard.PriceStandard` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 优质优价标准 |
| 物理表 | `cpu_price_standard` |
| 数据库 schema | `cpu-bi-service` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `33665ad7-8343-4844-9688-55f98120004b` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:12.7560` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键id |
| 编码 | `code` | `code` | String | 标准编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:52:50:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202512251640_metadata_aa-qualitypricestandard_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `3698e19d-8fa8-4678-882a-65cdc2d13f9f`

## 业务场景

- `DataAuth`
- `billcode`
- `userdefine`

## 术语标记

`ConfigData`, `dataAuth`, `data_auth`, `doc`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 2 | 审计信息 (`YcIAuditInfo`) | `aa.priceformula.YcIAuditInfo` | 201 | 2 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 4 | 自动编码 (`IAutoCode`) | `ucfbase.ucfbaseItf.IAutoCode` | 37 | 0 |
| 5 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |

---

## 直接属性（共 33 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `code` | 标准编码 | `code` | String | `text` |  | ✓ |
| 2 | `name` | 标准名称 | `name` | String | `multiLanguage` |  | ✓ |
| 3 | `materialId` | 物料 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 4 | `manageClass` | 物料分类 | `manage_class` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |  | ✓ |
| 5 | `featureApplyScope` | 适用特征范围 | `feature_apply_scope` | String | `text` |  | ✓ |
| 6 | `standardAjustItem` | 标准调整项 | `standard_ajust_item` | StandardAdjustItem | `` |  | ✓ |
| 7 | `addupMethod` | 累计方式 | `addup_method` | AddupMethod | `` |  | ✓ |
| 8 | `currency` | 币种 | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 9 | `standardType` | 标准类型 | `standard_type` | StandardType | `` |  | ✓ |
| 10 | `effectiveDate` | 生效日期 | `effective_date` | DateTime | `timestamp` |  | ✓ |
| 11 | `expiryDate` | 失效日期 | `expiry_date` | DateTime | `timestamp` |  | ✓ |
| 12 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 13 | `id` | 主键id | `id` | Long | `long` |  | ✓ |
| 14 | `version` | 版本 | `version` | Long | `long` |  | ✓ |
| 15 | `creator` | 创建人id | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 16 | `creatorName` | 创建人 | `creatorName` | String | `text` |  | ✓ |
| 17 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 18 | `modifier` | 更新人id | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 19 | `modifierName` | 更新人 | `modifierName` | String | `text` |  | ✓ |
| 20 | `featureApplyScopeIds` | 适用特征范围id | `feature_apply_scope_ids` | String | `text` |  | ✓ |
| 21 | `modifyTime` | 更新时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 23 | `PriceStandardDefineCharacter` | 优质优价标准自定义项 | `cpu_price_standard_define` | 98080dd2-b3fd-4766-b49a-d184c36fb4e9 | `UserDefine` |  | ✓ |
| 24 | `applyScene` | 应用场景 | `apply_scene` | String | `text` |  | ✓ |
| 25 | `beLatestVersion` | 是否最新版本 | `beLatestVersion` | Boolean | `switch` |  | ✓ |
| 26 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 27 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 28 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 29 | `nNumFeature` | 标准区间检验项目 | `nnum_feature` | 1a5d304f-40a4-47a2-a075-f8b5ab6af37b | `quote` |  | ✓ |
| 30 | `oid` | 初始id | `oid` | Long | `long` |  | ✓ |
| 31 | `priceStandardFeatureApplyScopeList` | 适用特征范围 | `` | 9dac2c83-9d42-44b0-9829-c69a27efa9d4 | `` |  |  |
| 32 | `priceStandardItemList` | 优质优价标准项 | `` | 9ba07035-505d-48f6-9bed-685946596297 | `` |  |  |
| 33 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 10 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `creator` | 创建人id | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `modifier` | 更新人id | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 4 | `manageClass` | 物料分类 | `pc.cls.ManagementClass` | `manage_class` |  →  |  |  | Service |  |
| 5 | `priceStandardFeatureApplyScopeList` | 适用特征范围 | `aa.qualitypricestandard.PriceStandardFeatureApplyScope` | `` | priceStandardFeatureApplyScopeList → standardId | 0..n | true | None |  |
| 6 | `nNumFeature` | 标准区间检验项目 | `base.character.Character` | `nnum_feature` |  →  |  |  | Service |  |
| 7 | `PriceStandardDefineCharacter` | 优质优价标准自定义项 | `aa.qualitypricestandard.PriceStandardDefine` | `cpu_price_standard_define` |  →  |  |  | None |  |
| 8 | `currency` | 币种 | `bd.currencytenant.CurrencyTenantVO` | `currency` |  →  |  |  | Service |  |
| 9 | `priceStandardItemList` | 优质优价标准项 | `aa.qualitypricestandard.PriceStandardItem` | `` | priceStandardItemList → standardId | 1..n | true | None |  |
| 10 | `materialId` | 物料 | `pc.product.Product` | `material_id` |  →  |  |  | Service |  |

### Composition（子表）

- **priceStandardFeatureApplyScopeList**: `priceStandardFeatureApplyScopeList` → `aa.qualitypricestandard.PriceStandardFeatureApplyScope` | 0..n
- **priceStandardItemList**: `priceStandardItemList` → `aa.qualitypricestandard.PriceStandardItem` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人id) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (更新人id) | `base.user.BipUser` | `modifier` |
| `manageClass` (物料分类) | `pc.cls.ManagementClass` | `manage_class` |
| `nNumFeature` (标准区间检验项目) | `base.character.Character` | `nnum_feature` |
| `currency` (币种) | `bd.currencytenant.CurrencyTenantVO` | `currency` |
| `materialId` (物料) | `pc.product.Product` | `material_id` |
