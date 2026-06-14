---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "aa.priceformula.PriceFactorClass"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 定价类型分类 (`aa.priceformula.PriceFactorClass`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_price_factorclass` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `aa.priceformula.PriceFactorClass` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 定价类型分类 |
| 物理表 | `cpu_price_factorclass` |
| domain/服务域 | `cpu-bi-service` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `d702fa73-6ae7-4371-afbb-4d71b18f2a6d` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:18:14.4430` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |
| 编码 | `factorclass_code` | `factorclass_code` | String | 分类编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:53:03:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202603241658_metadata_aa-priceformula_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `bcfdf107-d7ef-4d4d-8718-0def26011bc3`

## 业务场景

- `dataMultilanguage`

## 术语标记

`MasterData`, `tree_tag`

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
| 5 | 树型结构 (`ITree`) | `ucfbase.ucfbaseItf.ITree` | 339 | 6 |

---

## 直接属性（共 22 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `initialize` | 系统预置 | `factorclass_initialize` | Initialize | `singleOption` |  | ✓ |
| 2 | `ytenant` | 租户id | `ytenant_id` | String | `text` | ✓ | ✓ |
| 3 | `code` | 分类编码 | `factorclass_code` | String | `text` |  | ✓ |
| 4 | `level` | 因子分类层级 | `level` | Integer | `int` |  | ✓ |
| 5 | `id` | id | `id` | Long | `long` |  | ✓ |
| 6 | `name` | 分类名称 | `factorclass_name` | String | `multiLanguage` |  | ✓ |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 8 | `remark` | 备注 | `factorclass_remark` | String | `text` |  | ✓ |
| 9 | `path` | 因子分类路径 | `path` | String | `text` |  | ✓ |
| 10 | `parent` | 上级分类id | `Parent_id` | 95fe9dd1-64c2-4846-8564-90ae3f011796 | `quote` |  | ✓ |
| 11 | `order` | 序号 | `order` | Integer | `int` |  | ✓ |
| 12 | `enable` | 状态 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 13 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 14 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 15 | `creatorName` | 创建人名称 | `creatorName` | String | `text` |  | ✓ |
| 16 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 17 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 18 | `isEnd` | 是否末级 | `isEnd` | Boolean | `switch` |  | ✓ |
| 19 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 20 | `modifierName` | 修改人名称 | `modifierName` | String | `text` |  | ✓ |
| 21 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 22 | `sort` | 排序号 | `sort_num` | Integer | `int` |  | ✓ |

---

## 关联属性（共 3 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `parent` | 上级分类id | `aa.priceformula.PriceFactorClass` | `Parent_id` |  →  |  |  | None |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 3 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
