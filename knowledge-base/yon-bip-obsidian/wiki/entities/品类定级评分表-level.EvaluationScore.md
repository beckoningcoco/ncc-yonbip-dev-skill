---
tags: ["BIP", "元数据", "数据字典", "ycBase", "category.level.EvaluationScore"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 品类定级评分表 (`category.level.EvaluationScore`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_category_level_score` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `category.level.EvaluationScore` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 品类定级评分表 |
| 物理表 | `cpu_category_level_score` |
| 数据库 schema | `yonbip-cpu-bctask` |
| 所属应用 | `ycBase` |
| 业务对象ID | `978550f0-c97f-4c39-9477-cbfdabf3c03a` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:26:26.5220` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |

## 部署信息

- **部署时间**: 2026-05-22 23:41:14:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202604152013_metadata_category-level.zip`
- **安装人**: mongoTools
- **安装排名**: `03995fcc-802c-4cfd-beaf-72651c24cdec`

## 业务场景

- `extdevelop`
- `dataMultilanguage`
- `UITemplate`
- `DataAuth`
- `userdefine`
- `msgtemplate`
- `bpm`

## 术语标记

`BusinessData`, `data_auth`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 4 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 5 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |

---

## 直接属性（共 28 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `evaluationTaskId` | 评估任务 | `evaluation_task_id` | 6abe0119-2fcc-4a77-af87-aee92bfc8e63 | `quote` |  | ✓ |
| 2 | `evaluationScoreDate` | 评分日期 | `evaluation_score_date` | Date | `date` |  | ✓ |
| 3 | `scorerId` | 当前评估人 | `scorer_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 4 | `billStatus` | 单据状态 | `bill_status` | String | `text` |  | ✓ |
| 5 | `creatorId` | 创建人 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 6 | `modifierId` | 修改人 | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 7 | `scoreDefineCharacter` | 特征 | `define_character_id` | 3254d61f-ea7f-41c2-9036-37dcd57914d3 | `UserDefine` |  | ✓ |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 9 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 12 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 13 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 14 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 16 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 17 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 18 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 19 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 20 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 21 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 22 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 23 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 25 | `applyOrgId` | 发起组织 | `apply_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 26 | `preBillStatus` | 汇总前单据状态 | `pre_bill_status` | String | `text` |  | ✓ |
| 27 | `scoreList` | 品类定级评分表详情 | `` | b7b1c82d-7d39-4f69-a0c0-0a6550bb6aef | `` |  |  |
| 28 | `transferList` | 品类定级评分表转派记录 | `` | 5c6a5939-6d69-465a-bf87-b35a519075c4 | `` |  |  |

---

## 关联属性（共 10 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `scoreList` | 品类定级评分表详情 | `category.level.EvaluationScoreDetail` | `` | scoreList → evaluationScoreId | 1..n | true | None |  |
| 2 | `transferList` | 品类定级评分表转派记录 | `category.level.EvaluationScoreTransfer` | `` | transferList → evaluationScoreId | 0..n | true | None |  |
| 3 | `applyOrgId` | 发起组织 | `org.func.BaseOrg` | `apply_org_id` |  →  |  |  | Service |  |
| 4 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | `creator_id` |  →  |  |  | Service |  |
| 7 | `evaluationTaskId` | 评估任务 | `category.level.EvaluationTask` | `evaluation_task_id` |  →  |  |  | None |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | `modifier_id` |  →  |  |  | Service |  |
| 9 | `scorerId` | 当前评估人 | `bd.staff.Staff` | `scorer_id` |  →  |  |  | Service |  |
| 10 | `scoreDefineCharacter` | 特征 | `category.level.ScoreDefineCharacter` | `define_character_id` |  →  |  |  | None |  |

### Composition（子表）

- **scoreList**: `scoreList` → `category.level.EvaluationScoreDetail` | 1..n
- **transferList**: `transferList` → `category.level.EvaluationScoreTransfer` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `applyOrgId` (发起组织) | `org.func.BaseOrg` | `apply_org_id` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creator_id` |
| `modifierId` (修改人) | `base.user.User` | `modifier_id` |
| `scorerId` (当前评估人) | `bd.staff.Staff` | `scorer_id` |
