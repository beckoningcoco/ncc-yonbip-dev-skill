---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.supplyevaluate.EvaluateScore"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评价表 (`cpu-supplymgr.supplyevaluate.EvaluateScore`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_evaluate_score` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.supplyevaluate.EvaluateScore` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评价表 |
| 物理表 | `cpu_evaluate_score` |
| domain/服务域 | `cpu-supplymgr` |
| schema | `cpu_suppliermgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `6576b953-61c8-4ae1-b8eb-ecc7b18df50e` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:30:02.9150` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |
| 编码 | `apply_code` | `apply_code` | String | 申请单编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:45:59:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202601222106_metadata_cpu-supplymgr-supplyevaluate_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `09c7c8dc-2b90-47fb-a98a-106dfcdaf943`

## 业务场景

- `DataAuth`
- `imextmp`
- `report`
- `ruleengine`
- `userdefine`
- `msgtemplate`

## 术语标记

`BusinessData`, `data_auth`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): 主键 — 唯一字段: `['id']`

## 依赖接口（共 4 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 3 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |
| 4 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 43 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | id | `id` | Long | `long` |  | ✓ |
| 2 | `applyOrgId` | 发起组织id | `apply_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 3 | `evaApplyId` | 申请单id | `eva_apply_id` | cea9d2e2-dd02-406a-b705-64892d3959cd | `quote` |  | ✓ |
| 4 | `evaGroupId` | 评价组id | `eva_group_id` | b04119ff-753c-4e07-b18b-f92bd12d949e | `quote` |  | ✓ |
| 5 | `scoreDate` | 打分日期 | `score_date` | DateTime | `timestamp` |  | ✓ |
| 6 | `billStatus` | 状态 | `status` | String | `text` |  | ✓ |
| 7 | `applyCode` | 申请单编码 | `apply_code` | String | `text` |  | ✓ |
| 8 | `applyTitle` | 申请单标题 | `apply_title` | String | `text` |  | ✓ |
| 9 | `evaStartDate` | 开始时间 | `eva_start_date` | DateTime | `dateTime` |  | ✓ |
| 10 | `applyOrgName` | 发起组织名称 | `apply_org_name` | String | `text` |  | ✓ |
| 11 | `applyPsnId` | 发起人id | `apply_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 12 | `applyPsnName` | 发起人名称 | `apply_psn_name` | String | `text` |  | ✓ |
| 13 | `applyDeptId` | 部门id | `apply_dept_id` | c3b96360-c57f-455b-9728-2ca499d9922a | `quote` |  | ✓ |
| 14 | `applyDeptName` | 部门名称 | `apply_dept_name` | String | `text` |  | ✓ |
| 15 | `scorerName` | 打分人名称 | `scorer_name` | String | `text` |  | ✓ |
| 16 | `scorerOrgName` | 打分人组织名称 | `scorer_org_name` | String | `text` |  | ✓ |
| 17 | `objectType` | 维度分类 | `object_type` | String | `text` |  | ✓ |
| 18 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 19 | `createTime` | 创建时间 | `createtime` | DateTime | `timestamp` |  | ✓ |
| 20 | `fileId` | 说明文件 | `file_id` | String | `text` |  | ✓ |
| 21 | `submitTime` | 提交时间 | `submit_time` | DateTime | `timestamp` |  | ✓ |
| 22 | `isBizLeaderForMe` | 评价人为我 | `is_biz_leader_for_me` | String | `text` |  | ✓ |
| 23 | `reason` | 退回原因 | `reason` | String | `text` |  | ✓ |
| 24 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 25 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 26 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 27 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 28 | `auditor` | 审批人名称 | `auditor` | String | `text` |  | ✓ |
| 29 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 30 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 31 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 32 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 33 | `scorerOrgId` | 评价组织id | `scorer_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 34 | `scorerId` | 当前评估人id | `scorer_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 35 | `status` | 评分状态 | `approve_status` | String | `text` |  | ✓ |
| 36 | `evaEndDate` | 截止时间 | `eva_end_date` | DateTime | `dateTime` |  | ✓ |
| 37 | `userDefineCharacter` | 评价表特征实体 | `user_define_character` | e3107255-04e8-46b8-bdd2-0dda74464747 | `UserDefine` |  | ✓ |
| 38 | `evaExtraList` | 供应商评估打分扩展 | `` | 667229f1-0b62-4436-8d17-2ae7c0410df9 | `` |  |  |
| 39 | `evaScoreList` | 评价表详情子表 | `` | b2589326-6599-40bb-bcfc-bc82a4fd3065 | `` |  |  |
| 40 | `oldStatus` | 汇总前状态 | `old_status` | String | `text` |  | ✓ |
| 41 | `sourceScorerId` | 源头打分人id | `source_scorer_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 42 | `sourceScorerOrgId` | 源头打分人组织id | `source_scorer_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 43 | `transType` | 交易类型id | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |

---

## 关联属性（共 15 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `sourceScorerOrgId` | 源头打分人组织id | `org.func.BaseOrg` | `source_scorer_org_id` |  →  |  |  | Service |  |
| 2 | `applyOrgId` | 发起组织id | `org.func.BaseOrg` | `apply_org_id` |  →  |  |  | Service |  |
| 3 | `userDefineCharacter` | 评价表特征实体 | `cpu-supplymgr.supplyevaluate.EvaluateScoreUserDefineCharacter` | `user_define_character` |  →  |  |  | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `evaGroupId` | 评价组id | `cpu-supplymgr.supplyevaluate.EvaluateGroup` | `eva_group_id` |  →  |  |  | None |  |
| 6 | `evaScoreList` | 评价表详情子表 | `cpu-supplymgr.supplyevaluate.EvaluateScoreDetail` | `` | evaScoreList → evaScoreId | 0..n | true | None |  |
| 7 | `scorerId` | 当前评估人id | `bd.staff.Staff` | `scorer_id` |  →  |  |  | Service |  |
| 8 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 9 | `transType` | 交易类型id | `bd.bill.TransType` | `trans_type_id` |  →  |  |  | Service |  |
| 10 | `applyDeptId` | 部门id | `org.func.AdminOrg` | `apply_dept_id` |  →  |  |  | Service |  |
| 11 | `evaExtraList` | 供应商评估打分扩展 | `cpu-supplymgr.supplyevaluate.EvaluateScoreExtra` | `` | evaExtraList → evaScoreId | 0..n | true | None |  |
| 12 | `applyPsnId` | 发起人id | `bd.staff.Staff` | `apply_psn_id` |  →  |  |  | Service |  |
| 13 | `sourceScorerId` | 源头打分人id | `bd.staff.Staff` | `source_scorer_id` |  →  |  |  | Service |  |
| 14 | `evaApplyId` | 申请单id | `cpu-supplymgr.supplyevaluate.EvaluateApply` | `eva_apply_id` |  →  |  |  | None |  |
| 15 | `scorerOrgId` | 评价组织id | `org.func.BaseOrg` | `scorer_org_id` |  →  |  |  | Service |  |

### Composition（子表）

- **evaScoreList**: `evaScoreList` → `cpu-supplymgr.supplyevaluate.EvaluateScoreDetail` | 0..n
- **evaExtraList**: `evaExtraList` → `cpu-supplymgr.supplyevaluate.EvaluateScoreExtra` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `sourceScorerOrgId` (源头打分人组织id) | `org.func.BaseOrg` | `source_scorer_org_id` |
| `applyOrgId` (发起组织id) | `org.func.BaseOrg` | `apply_org_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `scorerId` (当前评估人id) | `bd.staff.Staff` | `scorer_id` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `transType` (交易类型id) | `bd.bill.TransType` | `trans_type_id` |
| `applyDeptId` (部门id) | `org.func.AdminOrg` | `apply_dept_id` |
| `applyPsnId` (发起人id) | `bd.staff.Staff` | `apply_psn_id` |
| `sourceScorerId` (源头打分人id) | `bd.staff.Staff` | `source_scorer_id` |
| `scorerOrgId` (评价组织id) | `org.func.BaseOrg` | `scorer_org_id` |
