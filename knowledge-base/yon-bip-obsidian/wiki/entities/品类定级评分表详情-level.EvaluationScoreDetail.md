---
tags: ["BIP", "元数据", "数据字典", "ycBase", "category.level.EvaluationScoreDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 品类定级评分表详情 (`category.level.EvaluationScoreDetail`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_category_level_score_detail` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `category.level.EvaluationScoreDetail` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 品类定级评分表详情 |
| 物理表 | `cpu_category_level_score_detail` |
| domain/服务域 | `yonbip-cpu-bctask` |
| schema | `cpu_base_doc` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:16:12.7230` |

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

## 直接属性（共 12 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `evaluationScoreId` | 评分表 | `evaluation_score_id` | 9f18dea1-b42d-4887-8d87-68479b729b7a | `quote` |  | ✓ |
| 2 | `evaluationIndicatorId` | 评估指标 | `evaluation_indicator_id` | 9eb2b2c0-bee5-470b-b629-1c036a5dd006 | `quote` |  | ✓ |
| 3 | `score` | 指标得分 | `score` | Decimal | `number` |  | ✓ |
| 4 | `refuseStatus` | 拒评状态 | `refuse_status` | String | `text` |  | ✓ |
| 5 | `refuseReasons` | 拒评原因 | `refuse_reasons` | String | `text` |  | ✓ |
| 6 | `remark` | 评分说明 | `remark` | String | `text` |  | ✓ |
| 7 | `scoreAttachment` | 评分附件 | `score_attachment` | String | `text` |  | ✓ |
| 8 | `scoreDetailDefineCharacter` | 特征 | `define_character_id` | 7bc206c8-509d-454b-9ad4-6453f7710648 | `UserDefine` |  | ✓ |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 10 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 11 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |

---

## 关联属性（共 4 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `evaluationIndicatorId` | 评估指标 | `category.level.EvaluationTaskIndicator` | `evaluation_indicator_id` |  →  |  |  | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `evaluationScoreId` | 评分表 | `category.level.EvaluationScore` | `evaluation_score_id` | scoreList → evaluationScoreId | 1..n | true | None |  |
| 4 | `scoreDetailDefineCharacter` | 特征 | `category.level.ScoreDetailDefineCharacter` | `define_character_id` |  →  |  |  | None |  |

### Composition（子表）

- **evaluationScoreId**: `scoreList` → `category.level.EvaluationScore` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
