---
tags: ["BIP", "元数据", "数据字典", "ycPriceCenter", "business.rule.BusinessRuleSceneClass"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 业务场景分类 (`business.rule.BusinessRuleSceneClass`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPriceCenter 模块实体元数据字典。
> 物理表：`cpu_business_rule_scene_class` | 所属应用：`ycPriceCenter`
> 来源：元数据API `queryByUri` 返回的 `business.rule.BusinessRuleSceneClass` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务场景分类 |
| 物理表 | `cpu_business_rule_scene_class` |
| domain/服务域 | `cpu-base` |
| schema | `cpu_baseservice` |
| 所属应用 | `ycPriceCenter` |
| 业务对象ID | `309b6b85-79cc-4b76-acae-9474466c78dd` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:29:44.2250` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `code` | `code` | String | 编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:38:04:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bcprice/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bcprice/0010_iuap_common/DML/0270_iuap_metadata/202511252119_metadata_business-rule_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `49e8743e-ad89-40fd-8267-b2402351715a`

## 业务场景

- `dataMultilanguage`

## 术语标记

`ConfigData`, `tree_tag`

## 约束

- **code_UK** (transformKey): code — 唯一字段: `['code']`
- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 4 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 树型结构 (`ITree`) | `ucfbase.ucfbaseItf.ITree` | 339 | 6 |
| 2 | 启用 (`IEnable`) | `ucfbase.ucfbaseItf.IEnable` | 141 | 3 |
| 3 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 4 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 17 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 2 | `disablets` | 停用时间 | `disablets` | DateTime | `dateTime` |  | ✓ |
| 3 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 4 | `enable` | 启用 | `enable` | sys_intboolean | `singleOption` |  | ✓ |
| 5 | `enablets` | 启用时间 | `enablets` | DateTime | `dateTime` |  | ✓ |
| 6 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 7 | `isEnd` | 是否末级 | `isEnd` | Boolean | `switch` |  | ✓ |
| 8 | `isSys` | 是否系统预置 | `is_sys` | Short | `short` |  | ✓ |
| 9 | `level` | 层级 | `level` | Integer | `int` |  | ✓ |
| 10 | `name` | 名称 | `name` | String | `multiLanguage` |  | ✓ |
| 11 | `parent` | 上级分类 | `parent_id` | String | `text` |  | ✓ |
| 12 | `path` | 路径 | `path` | String | `text` |  | ✓ |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 14 | `remark` | 备注 | `remark` | String | `text` |  | ✓ |
| 15 | `sort` | 排序号 | `sort_num` | Integer | `int` |  | ✓ |
| 16 | `sysId` | 系统标识 | `sys_id` | Long | `long` |  | ✓ |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 1 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
