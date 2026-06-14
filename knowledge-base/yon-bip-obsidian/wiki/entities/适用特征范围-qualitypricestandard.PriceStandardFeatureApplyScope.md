---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.qualitypricestandard.PriceStandardFeatureApplyScope"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 适用特征范围 (`aa.qualitypricestandard.PriceStandardFeatureApplyScope`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_price_standard_feature_apply_scope` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.qualitypricestandard.PriceStandardFeatureApplyScope` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 适用特征范围 |
| 物理表 | `cpu_price_standard_feature_apply_scope` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:24:56.6670` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
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
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |

---

## 直接属性（共 9 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 2 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 3 | `featureId` | 特征 | `feature_id` | 1a5d304f-40a4-47a2-a075-f8b5ab6af37b | `quote` |  | ✓ |
| 4 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 5 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 6 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 8 | `standardId` | 标准id | `standard_id` | bf9f35b7-ea48-444e-9de9-dee31f271568 | `quote` |  | ✓ |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 5 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 4 | `standardId` | 标准id | `aa.qualitypricestandard.PriceStandard` | `standard_id` | priceStandardFeatureApplyScopeList → standardId | 0..n | true | None |  |
| 5 | `featureId` | 特征 | `base.character.Character` | `feature_id` |  →  |  |  | Service |  |

### Composition（子表）

- **standardId**: `priceStandardFeatureApplyScopeList` → `aa.qualitypricestandard.PriceStandard` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `featureId` (特征) | `base.character.Character` | `feature_id` |
