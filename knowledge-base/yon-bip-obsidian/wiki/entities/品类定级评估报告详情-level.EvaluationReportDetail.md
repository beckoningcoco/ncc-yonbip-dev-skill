---
tags: ["BIP", "元数据", "数据字典", "ycBase", "category.level.EvaluationReportDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 品类定级评估报告详情 (`category.level.EvaluationReportDetail`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_category_level_report_detail` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `category.level.EvaluationReportDetail` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 品类定级评估报告详情 |
| 物理表 | `cpu_category_level_report_detail` |
| 数据库 schema | `yonbip-cpu-bctask` |
| 所属应用 | `ycBase` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:16:11.1790` |

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

## 直接属性（共 8 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 2 | `evaluationIndicatorId` | 评估指标 | `evaluation_indicator_id` | 9eb2b2c0-bee5-470b-b629-1c036a5dd006 | `quote` |  | ✓ |
| 3 | `evaluationReportId` | 评估报告 | `evaluation_report_id` | 53960e3c-9bda-4c6f-b3e8-b0bbca7037b6 | `quote` |  | ✓ |
| 4 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 5 | `indicatorScore` | 汇总后指标得分 | `indicator_score` | Decimal | `number` |  | ✓ |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 7 | `reportDetailDefineCharacter` | 特征 | `define_character_id` | 75e88fe2-0bc5-4842-86da-601230a57002 | `UserDefine` |  | ✓ |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |

---

## 关联属性（共 4 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `evaluationIndicatorId` | 评估指标 | `category.level.EvaluationTaskIndicator` | `evaluation_indicator_id` |  →  |  |  | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `evaluationReportId` | 评估报告 | `category.level.EvaluationReport` | `evaluation_report_id` | reportList → evaluationReportId | 1..n | true | None |  |
| 4 | `reportDetailDefineCharacter` | 特征 | `category.level.ReportDetailDefineCharacter` | `define_character_id` |  →  |  |  | None |  |

### Composition（子表）

- **evaluationReportId**: `reportList` → `category.level.EvaluationReport` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
