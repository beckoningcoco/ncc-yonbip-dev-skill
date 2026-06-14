---
tags: ["BIP", "元数据", "数据字典", "ycBase", "category.level.EvaluationReport"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 品类定级评估报告 (`category.level.EvaluationReport`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_category_level_report` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `category.level.EvaluationReport` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 品类定级评估报告 |
| 物理表 | `cpu_category_level_report` |
| domain/服务域 | `yonbip-cpu-bctask` |
| schema | `cpu_base_doc` |
| 所属应用 | `ycBase` |
| 业务对象ID | `a042ec53-a6df-434c-81af-3c8d6b6aef87` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:26:25.0610` |

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
- `print`
- `UITemplate`
- `imextmp`
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

## 直接属性（共 31 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `evaluationTaskId` | 评估任务 | `evaluation_task_id` | 6abe0119-2fcc-4a77-af87-aee92bfc8e63 | `quote` |  | ✓ |
| 2 | `applicationDetailId` | 申请单详情 | `application_detail_id` | d4f90d37-bcf2-404b-b2e3-977168f137ab | `quote` |  | ✓ |
| 3 | `categoryLevelId` | 等级 | `category_level_id` | 5ffdc7d3-9e62-4b5f-8668-eb39ddd20dd5 | `quote` |  | ✓ |
| 4 | `applyOrgId` | 发起组织 | `apply_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 5 | `valueImpactScore` | 价值影响得分 | `value_impact_score` | Decimal | `number` |  | ✓ |
| 6 | `supplyRiskScore` | 供应风险得分 | `supply_risk_score` | Decimal | `number` |  | ✓ |
| 7 | `calibratedValueImpactScore` | 校准后价值影响得分 | `calibrated_value_impact_score` | Decimal | `number` |  | ✓ |
| 8 | `calibratedSupplyRiskScore` | 校准后供应风险得分 | `calibrated_supply_risk_score` | Decimal | `number` |  | ✓ |
| 9 | `calibrationRemark` | 校准说明 | `calibration_remark` | String | `text` |  | ✓ |
| 10 | `reportAttachment` | 报告附件 | `report_attachment` | String | `text` |  | ✓ |
| 11 | `creatorId` | 创建人 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 12 | `modifierId` | 修改人 | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 13 | `reportDefineCharacter` | 特征 | `define_character_id` | cc24b3c7-5be0-4642-a927-7e5c26efdc68 | `UserDefine` |  | ✓ |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 15 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 16 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 18 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 19 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 20 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 21 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 22 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 23 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 24 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 25 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 26 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 27 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 28 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 29 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 30 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 31 | `reportList` | 品类定级评估报告详情 | `` | 3c8fcd59-47cc-49a9-98bd-0b45bbcb2e0e | `` |  |  |

---

## 关联属性（共 10 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `applyOrgId` | 发起组织 | `org.func.BaseOrg` | `apply_org_id` |  →  |  |  | Service |  |
| 2 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | `creator_id` |  →  |  |  | Service |  |
| 5 | `evaluationTaskId` | 评估任务 | `category.level.EvaluationTask` | `evaluation_task_id` |  →  |  |  | None |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | `modifier_id` |  →  |  |  | Service |  |
| 7 | `reportList` | 品类定级评估报告详情 | `category.level.EvaluationReportDetail` | `` | reportList → evaluationReportId | 1..n | true | None |  |
| 8 | `categoryLevelId` | 等级 | `aa.supplyability.SupplyAbilityDetail` | `category_level_id` |  →  |  |  | Service |  |
| 9 | `reportDefineCharacter` | 特征 | `category.level.ReportDefineCharacter` | `define_character_id` |  →  |  |  | None |  |
| 10 | `applicationDetailId` | 申请单详情 | `category.level.ApplicationDetail` | `application_detail_id` |  →  |  |  | None |  |

### Composition（子表）

- **reportList**: `reportList` → `category.level.EvaluationReportDetail` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `applyOrgId` (发起组织) | `org.func.BaseOrg` | `apply_org_id` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creator_id` |
| `modifierId` (修改人) | `base.user.User` | `modifier_id` |
| `categoryLevelId` (等级) | `aa.supplyability.SupplyAbilityDetail` | `category_level_id` |
