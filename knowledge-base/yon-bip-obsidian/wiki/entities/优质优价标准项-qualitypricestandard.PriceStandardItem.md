---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.qualitypricestandard.PriceStandardItem"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 优质优价标准项 (`aa.qualitypricestandard.PriceStandardItem`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_price_standard_item` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.qualitypricestandard.PriceStandardItem` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 优质优价标准项 |
| 物理表 | `cpu_price_standard_item` |
| 数据库 schema | `cpu-bi-service` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:24:55.1810` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键id |
| 编码 | `standard_id` | `standard_id` | bf9f35b7-ea48-444e-9de9-dee31f271568 | 标准id（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:53:05:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202604031336_metadata_aa-qualitypricestandard_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `8652fe55-e4a6-4fb5-b317-f76083598953`

## 术语标记

`ConfigData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 38 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `standardId` | 标准id | `standard_id` | bf9f35b7-ea48-444e-9de9-dee31f271568 | `quote` |  | ✓ |
| 2 | `id` | 主键id | `id` | Long | `long` |  | ✓ |
| 3 | `featureNumerical` | 数值型特征 | `feature_numerical` | String | `text` |  | ✓ |
| 4 | `referenceValue` | 数值型特征基准值 | `reference_value` | Decimal | `number` |  | ✓ |
| 5 | `beIncludeLowerLimit` | 是否包含下限 | `beIncludeLowerLimit` | Boolean | `switch` |  | ✓ |
| 6 | `featureValueLowerLimit` | 特征值区间下限 | `featureValueLowerLimit` | Decimal | `number` |  | ✓ |
| 7 | `featureValueUpperLimit` | 特征值区间上限 | `featureValueUpperLimit` | Decimal | `number` |  | ✓ |
| 8 | `beIncludeUpperLimit` | 是否包含上限 | `beIncludeUpperLimit` | Boolean | `switch` |  | ✓ |
| 9 | `featureNonNumerical1` | 非数值型特征1 | `feature_non_numerical_1` | String | `text` |  | ✓ |
| 10 | `featureValueNonNumerical1` | 特征值 | `feature_value_non_numerical_1` | String | `text` |  | ✓ |
| 11 | `featureNonNumerical2` | 非数值型特征2 | `feature_non_numerical_2` | String | `text` |  | ✓ |
| 12 | `featureValueNonNumerical2` | 特征值 | `feature_value_non_numerical_2` | String | `text` |  | ✓ |
| 13 | `featureNonNumerical3` | 非数值型特征3 | `feature_non_numerical_3` | String | `text` |  | ✓ |
| 14 | `featureValueNonNumerical3` | 特征值 | `feature_value_non_numerical_3` | String | `text` |  | ✓ |
| 15 | `featureNonNumerical4` | 非数值型特征4 | `feature_non_numerical_4` | String | `text` |  | ✓ |
| 16 | `featureValueNonNumerical4` | 特征值 | `feature_value_non_numerical_4` | String | `text` |  | ✓ |
| 17 | `featureNonNumerical5` | 非数值型特征5 | `feature_non_numerical_5` | String | `text` |  | ✓ |
| 18 | `featureValueNonNumerical5` | 特征值 | `feature_value_non_numerical_5` | String | `text` |  | ✓ |
| 19 | `adjustmentType` | 调整类型 | `adjustment_type` | AdjustmentType | `` |  | ✓ |
| 20 | `treatmentMethod` | 处理方式 | `treatment_method` | TreatmentMethod | `` |  | ✓ |
| 21 | `adjustmentBase` | 调整基数 | `adjustment_base` | Decimal | `number` |  | ✓ |
| 22 | `adjustmentRange` | 调整幅度 | `adjustment_range` | Decimal | `number` |  | ✓ |
| 23 | `formula` | 优质优价公式 | `formula` | String | `text` |  | ✓ |
| 24 | `addupFormula` | 累计公式 | `addup_formula` | String | `text` |  | ✓ |
| 25 | `PriceStandardItemDefineCharacter` | 优质优价方案组成项自定义项 | `cpu_price_standard_item_define` | e00ee762-1fca-477b-a931-f9872421561f | `UserDefine` |  | ✓ |
| 26 | `addupFormulaFactor` | 累计公式因子描述 | `addup_formula_factor` | String | `text` |  | ✓ |
| 27 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 28 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 29 | `featureValueNonNumerical1Name` | 非数值型特征值1名 | `feature_value_non_numerical_1_name` | String | `text` |  | ✓ |
| 30 | `featureValueNonNumerical2Name` | 非数值型特征值2名 | `feature_value_non_numerical_2_name` | String | `text` |  | ✓ |
| 31 | `featureValueNonNumerical3Name` | 非数值型特征值3名 | `feature_value_non_numerical_3_name` | String | `text` |  | ✓ |
| 32 | `featureValueNonNumerical4Name` | 非数值型特征值4名 | `feature_value_non_numerical_4_name` | String | `text` |  | ✓ |
| 33 | `featureValueNonNumerical5Name` | 非数值型特征值5名 | `feature_value_non_numerical_5_name` | String | `text` |  | ✓ |
| 34 | `formulaFactor` | 优质优价公式因子描述 | `formula_factor` | String | `text` |  | ✓ |
| 35 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 36 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 37 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 38 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 5 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 4 | `standardId` | 标准id | `aa.qualitypricestandard.PriceStandard` | `standard_id` | priceStandardItemList → standardId | 1..n | true | None |  |
| 5 | `PriceStandardItemDefineCharacter` | 优质优价方案组成项自定义项 | `aa.qualitypricestandard.PriceStandardItemDefine` | `cpu_price_standard_item_define` |  →  |  |  | None |  |

### Composition（子表）

- **standardId**: `priceStandardItemList` → `aa.qualitypricestandard.PriceStandard` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
