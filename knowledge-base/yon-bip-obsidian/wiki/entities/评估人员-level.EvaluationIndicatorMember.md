---
tags: ["BIP", "元数据", "数据字典", "ycBase", "category.level.EvaluationIndicatorMember"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评估人员 (`category.level.EvaluationIndicatorMember`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_category_level_evaluator` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `category.level.EvaluationIndicatorMember` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评估人员 |
| 物理表 | `cpu_category_level_evaluator` |
| 数据库 schema | `yonbip-cpu-bctask` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:29:52.6620` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-22 23:41:14:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202604152013_metadata_category-level.zip`
- **安装人**: mongoTools
- **安装排名**: `03995fcc-802c-4cfd-beaf-72651c24cdec`

## 术语标记

`BusinessData`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 2 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 9 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 2 | `evaluateGroupId` | 评价组 | `evaluate_group_id` | b04119ff-753c-4e07-b18b-f92bd12d949e | `quote` |  | ✓ |
| 3 | `evaluatorId` | 评价人 | `evaluator_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 4 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 5 | `indicatorId` | 评估指标ID | `evaluation_indicator_id` | 9eb2b2c0-bee5-470b-b629-1c036a5dd006 | `quote` |  | ✓ |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 7 | `type` | 类型 | `evaluator_type` | String | `text` |  | ✓ |
| 8 | `weight` | 权重 | `evaluator_weight` | Decimal | `number` |  | ✓ |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 4 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `indicatorId` | 评估指标ID | `category.level.EvaluationTaskIndicator` | `evaluation_indicator_id` | evaMemberList → indicatorId | 0..n | true | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `evaluateGroupId` | 评价组 | `cpu-supplymgr.supplyevaluate.EvaluateGroup` | `evaluate_group_id` |  →  |  |  | Service |  |
| 4 | `evaluatorId` | 评价人 | `bd.staff.Staff` | `evaluator_id` |  →  |  |  | Service |  |

### Composition（子表）

- **indicatorId**: `evaMemberList` → `category.level.EvaluationTaskIndicator` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `evaluateGroupId` (评价组) | `cpu-supplymgr.supplyevaluate.EvaluateGroup` | `evaluate_group_id` |
| `evaluatorId` (评价人) | `bd.staff.Staff` | `evaluator_id` |
