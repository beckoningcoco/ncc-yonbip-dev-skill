---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "bctask.marketProductClass.marketProductClass"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 超市商品分类 (`bctask.marketProductClass.marketProductClass`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`cpu_marketproduct_class` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `bctask.marketProductClass.marketProductClass` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 超市商品分类 |
| 物理表 | `cpu_marketproduct_class` |
| 数据库 schema | `yonbip-cpu-bctask` |
| 所属应用 | `ycYuncaiMall` |
| 业务对象ID | `53eaf6d1-4b9c-4575-b4f1-18da553158a9` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:00:42.2290` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |
| 编码 | `code` | `code` | String | 分类编码（必填，isCode）|

## 部署信息

- **部署时间**: 2025-10-25 00:18:17:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202509181710_metadata_bctask-marketProductClass.zip`
- **安装人**: mongoTools
- **安装排名**: `88e3815e-a202-49bd-9f10-70bb194f5aaf`

## 术语标记

`MasterData`, `isMain`, `tree_tag`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 4 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 3 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 4 | 树型结构 (`ITree`) | `ucfbase.ucfbaseItf.ITree` | 339 | 6 |

---

## 直接属性（共 18 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `code` | 分类编码 | `code` | String | `text` |  | ✓ |
| 2 | `name` | 超市商品分类名称 | `name` | String | `multiLanguage` |  | ✓ |
| 3 | `id` | id | `id` | Long | `long` |  | ✓ |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 5 | `parent` | 上级分类id | `parent_id` | a91b6b98-9252-4589-9d29-d402a2c7c999 | `quote` |  | ✓ |
| 6 | `sort` | 序号 | `sort` | Integer | `int` |  | ✓ |
| 7 | `materialId` | 物料映射ID | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 8 | `defaultClass` | 电商默认分类 | `defaultClass` | Integer | `int` |  | ✓ |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | ✓ |
| 10 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 11 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 12 | `imgurl` | 图片 | `imgurl` | String | `text` |  | ✓ |
| 13 | `isEnd` | 是否末级 | `isEnd` | Boolean | `switch` |  | ✓ |
| 14 | `level` | 层级 | `class_type` | Integer | `int` |  | ✓ |
| 15 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 17 | `path` | 路径 | `path` | String | `text` |  | ✓ |
| 18 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 5 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `parent` | 上级分类id | `bctask.marketProductClass.marketProductClass` | `parent_id` |  →  |  |  | None |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 5 | `materialId` | 物料映射ID | `pc.product.Product` | `material_id` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `creator` (创建人) | `base.user.BipUser` | `creator` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `materialId` (物料映射ID) | `pc.product.Product` | `material_id` |
