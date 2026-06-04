---
tags: ["BIP", "元数据", "数据字典", "ycBase", "category.level.EvaluationTask"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 品类定级评估任务 (`category.level.EvaluationTask`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycBase 模块实体元数据字典。
> 物理表：`cpu_category_level_task` | 所属应用：`ycBase`
> 来源：元数据API `queryByUri` 返回的 `category.level.EvaluationTask` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 品类定级评估任务 |
| 物理表 | `cpu_category_level_task` |
| 数据库 schema | `yonbip-cpu-bctask` |
| 所属应用 | `ycBase` |
| 业务对象ID | `a33a2f1d-f042-46a6-88ba-d83a527a1bdf` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:26:27.9470` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | 主键 |
| 编码 | `code` | `code` | String | 单据编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:41:15:000
- **安装来源**: `/app/data_scripts/yonbip-cpu-bctask/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-bctask/0010_iuap_common/DML/0270_iuap_metadata/202605062159_metadata_category-level_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `a40f70d7-fbf3-4c8b-b568-152d01d66420`

## 业务场景

- `extdevelop`
- `dataMultilanguage`
- `UITemplate`
- `DataAuth`
- `transtype`
- `billcode`
- `userdefine`
- `msgtemplate`
- `bpm`

## 术语标记

`BusinessData`, `data_auth`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 7 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 审计信息 (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 4 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 5 | 生单回写 (`IBackWrite`) | `base.itf.IBackWrite` | 254 | 7 |
| 6 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 7 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |

---

## 直接属性（共 52 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `applicationId` | 申请单 | `application_id` | e941d953-44c6-449a-b414-79608f83e14b | `quote` |  | ✓ |
| 2 | `evaluationReportId` | 评估报告 | `evaluation_report_id` | 53960e3c-9bda-4c6f-b3e8-b0bbca7037b6 | `quote` |  | ✓ |
| 3 | `applicationDetailId` | 申请单详情 | `application_detail_id` | d4f90d37-bcf2-404b-b2e3-977168f137ab | `quote` |  | ✓ |
| 4 | `code` | 单据编码 | `code` | String | `text` |  | ✓ |
| 5 | `name` | 单据名称 | `name` | String | `text` |  | ✓ |
| 6 | `applyPsnId` | 发起人 | `apply_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 7 | `applyOrgId` | 发起组织 | `apply_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 8 | `applyDate` | 申请日期 | `apply_date` | Date | `date` |  | ✓ |
| 9 | `businessStartDate` | 业务开始日期 | `business_start_date` | Date | `date` |  | ✓ |
| 10 | `businessEndDate` | 业务截止日期 | `business_end_date` | Date | `date` |  | ✓ |
| 11 | `evaStartDate` | 任务开始时间 | `eva_start_date` | DateTime | `dateTime` |  | ✓ |
| 12 | `evaEndDate` | 任务结束时间 | `eva_end_date` | DateTime | `dateTime` |  | ✓ |
| 13 | `evaWeightType` | 评分方式 | `eva_weight_type` | String | `text` |  | ✓ |
| 14 | `summaryRule` | 汇总规则 | `summary_rule` | String | `text` |  | ✓ |
| 15 | `evaObjectType` | 考评颗粒度 | `eva_object_type` | String | `text` |  | ✓ |
| 16 | `evaAbilityId` | 等级体系 | `eva_ability_id` | 960ce6ff-03b4-4afc-ba32-2342d2e50e5b | `quote` |  | ✓ |
| 17 | `evaStandard` | 评估标准 | `eva_standard` | String | `text` |  | ✓ |
| 18 | `enableWeight` | 启用权重 | `enable_weight` | String | `text` |  | ✓ |
| 19 | `templateId` | 考评模板 | `template_id` | 0f1b9f8e-a486-4e1c-a5ee-b4aa7534106f | `quote` |  | ✓ |
| 20 | `evaRemark` | 评估说明 | `eva_remark` | String | `text` |  | ✓ |
| 21 | `attachment` | 附件 | `attachment` | String | `text` |  | ✓ |
| 22 | `billStatus` | 单据状态 | `bill_status` | String | `text` |  | ✓ |
| 23 | `categoryId` | 采购品类 | `category_id` | ec3f827d-4cff-462d-b74c-1dd556c96baa | `quote` |  | ✓ |
| 24 | `creatorId` | 创建人 | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 25 | `modifierId` | 修改人 | `modifier_id` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 26 | `taskDefineCharacter` | 特征 | `define_character_id` | a6804faf-3e0c-444d-95c9-0b8ec4201e79 | `UserDefine` |  | ✓ |
| 27 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 28 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | ✓ |
| 29 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | ✓ |
| 30 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | ✓ |
| 31 | `creator` | 创建人名称 | `creator` | String | `text` |  | ✓ |
| 32 | `modifier` | 修改人名称 | `modifier` | String | `text` |  | ✓ |
| 33 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 34 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 35 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 36 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 37 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 38 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 39 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 40 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 41 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 42 | `id` | 主键 | `id` | Long | `long` |  | ✓ |
| 43 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 44 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String | `text` |  | ✓ |
| 45 | `indicatorList` | 品类定级评估指标 | `` | 9eb2b2c0-bee5-470b-b629-1c036a5dd006 | `` |  |  |
| 46 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String | `text` |  | ✓ |
| 47 | `source` | 上游单据类型 | `source` | String | `text` |  | ✓ |
| 48 | `sourceChildPubts` | 时间戳 | `sourceChildPubts` | DateTime | `timestamp` |  | ✓ |
| 49 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime | `timestamp` |  | ✓ |
| 50 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long | `long` |  | ✓ |
| 51 | `sourceid` | 上游单据主表id | `sourceid` | Long | `long` |  | ✓ |
| 52 | `upcode` | 上游单据号 | `upcode` | String | `text` |  | ✓ |

---

## 关联属性（共 14 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `applyOrgId` | 发起组织 | `org.func.BaseOrg` | `apply_org_id` |  →  |  |  | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | `creator_id` |  →  |  |  | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | `modifier_id` |  →  |  |  | Service |  |
| 5 | `evaAbilityId` | 等级体系 | `aa.supplyability.SupplyAbility` | `eva_ability_id` |  →  |  |  | Service |  |
| 6 | `templateId` | 考评模板 | `suppliermgr.template.Template` | `template_id` |  →  |  |  | Service |  |
| 7 | `applicationDetailId` | 申请单详情 | `category.level.ApplicationDetail` | `application_detail_id` |  →  |  |  | None |  |
| 8 | `evaluationReportId` | 评估报告 | `category.level.EvaluationReport` | `evaluation_report_id` |  →  |  |  | None |  |
| 9 | `taskDefineCharacter` | 特征 | `category.level.TaskDefineCharacter` | `define_character_id` |  →  |  |  | None |  |
| 10 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 11 | `indicatorList` | 品类定级评估指标 | `category.level.EvaluationTaskIndicator` | `` | indicatorList → evaluationTaskId | 0..n | true | None |  |
| 12 | `applyPsnId` | 发起人 | `bd.staff.Staff` | `apply_psn_id` |  →  |  |  | Service |  |
| 13 | `applicationId` | 申请单 | `category.level.Application` | `application_id` |  →  |  |  | None |  |
| 14 | `categoryId` | 采购品类 | `pc.cls.PurchaseClass` | `category_id` |  →  |  |  | Service |  |

### Composition（子表）

- **indicatorList**: `indicatorList` → `category.level.EvaluationTaskIndicator` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `applyOrgId` (发起组织) | `org.func.BaseOrg` | `apply_org_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `creatorId` (创建人) | `base.user.User` | `creator_id` |
| `modifierId` (修改人) | `base.user.User` | `modifier_id` |
| `evaAbilityId` (等级体系) | `aa.supplyability.SupplyAbility` | `eva_ability_id` |
| `templateId` (考评模板) | `suppliermgr.template.Template` | `template_id` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `applyPsnId` (发起人) | `bd.staff.Staff` | `apply_psn_id` |
| `categoryId` (采购品类) | `pc.cls.PurchaseClass` | `category_id` |
