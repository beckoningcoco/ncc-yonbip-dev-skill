---
tags: ["BIP", "元数据", "数据字典", "ycBase", "category.level.EvaluationTaskIndicator"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 品类定级评估指标 (`category.level.EvaluationTaskIndicator`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_category_level_indicator` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `category.level.EvaluationTaskIndicator` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 品类定级评估指标 |
| 物理表 | `cpu_category_level_indicator` |
| domain/服务域 | `yonbip-cpu-bctask` |
| schema | `cpu_base_doc` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:16:15.8960` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |

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

## 直接属性（共 15 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `evaluationTaskId` | 评估任务 | `evaluation_task_id` | 6abe0119-2fcc-4a77-af87-aee92bfc8e63 | `quote` |  | ✓ |
| 2 | `scoreDim` | 评估维度 | `score_dim` | String | `text` |  | ✓ |
| 3 | `indicatorClassId` | 指标分类 | `indicator_class_id` | ad912949-efeb-43a5-9a00-1de3af2b3f0c | `quote` |  | ✓ |
| 4 | `indicatorId` | 指标 | `indicator_id` | 6ce0285a-5c64-4f45-a3b1-8a01ef51a8c7 | `quote` |  | ✓ |
| 5 | `scoreDescription` | 评分描述 | `score_description` | String | `text` |  | ✓ |
| 6 | `scoreRationale` | 评分依据 | `score_rationale` | String | `text` |  | ✓ |
| 7 | `itemWeight` | 分项权重 | `item_weight` | Decimal | `number` |  | ✓ |
| 8 | `totalWeight` | 总权重 | `total_weight` | Decimal | `number` |  | ✓ |
| 9 | `maxScore` | 最高分 | `max_score` | Decimal | `number` |  | ✓ |
| 10 | `indicatorDefineCharacter` | 特征 | `define_character_id` | 670525c9-c027-45e2-8e65-52d6795b7119 | `UserDefine` |  | ✓ |
| 11 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 12 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 13 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 15 | `evaMemberList` | 评估人员 | `` | 6e0c1b6b-5abc-403d-ade8-33076d4044c8 | `` |  |  |

---

## 关联属性（共 6 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `indicatorDefineCharacter` | 特征 | `category.level.TaskIndicatorDefineCharacter` | `define_character_id` |  →  |  |  | None |  |
| 2 | `evaMemberList` | 评估人员 | `category.level.EvaluationIndicatorMember` | `` | evaMemberList → indicatorId | 0..n | true | None |  |
| 3 | `indicatorId` | 指标 | `suppliermgr.target.Target` | `indicator_id` |  →  |  |  | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `evaluationTaskId` | 评估任务 | `category.level.EvaluationTask` | `evaluation_task_id` | indicatorList → evaluationTaskId | 0..n | true | None |  |
| 6 | `indicatorClassId` | 指标分类 | `suppliermgr.target.TargetClass` | `indicator_class_id` |  →  |  |  | Service |  |

### Composition（子表）

- **evaMemberList**: `evaMemberList` → `category.level.EvaluationIndicatorMember` | 0..n
- **evaluationTaskId**: `indicatorList` → `category.level.EvaluationTask` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `indicatorId` (指标) | `suppliermgr.target.Target` | `indicator_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `indicatorClassId` (指标分类) | `suppliermgr.target.TargetClass` | `indicator_class_id` |
