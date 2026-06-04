---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.dynamicpricescheme.PriceScheme"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 价格模板 (`aa.dynamicpricescheme.PriceScheme`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`price_scheme` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.dynamicpricescheme.PriceScheme` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 价格模板 |
| 物理表 | `price_scheme` |
| 数据库 schema | `cpu-bi-service` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `cc5bc007-c4d2-43fb-8c2d-6533231318cc` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:17.4940` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 方案id |
| 编码 | `code` | `code` | String | 方案编号（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:53:00:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202603061123_metadata_aa-dynamicpricescheme_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `ce38c871-e275-4934-a616-c6500e47da00`

## 业务场景

- `dataMultilanguage`
- `billcode`

## 术语标记

`ConfigData`

## 约束

- **id** (transformKey): 主键 — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 6 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 2 | 审计信息 (`YcIAuditInfo`) | `aa.priceformula.YcIAuditInfo` | 201 | 2 |
| 3 | 自动编码 (`IAutoCode`) | `ucfbase.ucfbaseItf.IAutoCode` | 37 | 0 |
| 4 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 5 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 6 | 系统预置 (`PreSet`) | `aa.pricestrategy.PreSet` | 14 | 1 |

---

## 直接属性（共 20 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `code` | 方案编号 | `code` | String | `text` |  | ✓ |
| 2 | `schemeName` | 方案名称 | `scheme_name` | String | `multiLanguage` |  | ✓ |
| 3 | `id` | 方案id | `id` | Long | `long` |  | ✓ |
| 4 | `schemeType` | 方案类型 | `scheme_type` | SchemeType | `` |  | ✓ |
| 5 | `vmemo` | 备注 | `vmemo` | String | `text` |  | ✓ |
| 6 | `enable` | 状态 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 7 | `creator` | 创建人id | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 8 | `modifier` | 更新人id | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 10 | `modifyTime` | 更新时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 11 | `checkSum` | 校验和 | `check_sum` | String | `text` |  | ✓ |
| 12 | `creatorName` | 创建人名称 | `creatorName` | String | `text` |  | ✓ |
| 13 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 14 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 15 | `modifierName` | 修改人名称 | `modifierName` | String | `text` |  | ✓ |
| 16 | `preSet` | 是否系统预置 | `preSet` | String | `text` |  | ✓ |
| 17 | `priceSchemeDimensionList` | 价格维度子表 | `` | a94ec976-eed7-48c0-a22a-a051e874c2fc | `` |  |  |
| 18 | `priceSource` | 价格来源类型 | `value_source` | String | `text` |  | ✓ |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 4 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `creator` | 创建人id | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `priceSchemeDimensionList` | 价格维度子表 | `aa.dynamicpricescheme.PriceSchemeDimension` | `` | priceSchemeDimensionList → priceSchemeId | 1..n | true | None |  |
| 4 | `modifier` | 更新人id | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |

### Composition（子表）

- **priceSchemeDimensionList**: `priceSchemeDimensionList` → `aa.dynamicpricescheme.PriceSchemeDimension` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人id) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (更新人id) | `base.user.BipUser` | `modifier` |
