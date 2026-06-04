---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.supplyevaluate.EvaluateApply"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评价任务 (`cpu-supplymgr.supplyevaluate.EvaluateApply`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_evaluate_apply` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.supplyevaluate.EvaluateApply` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评价任务 |
| 物理表 | `cpu_evaluate_apply` |
| 数据库 schema | `cpu-supplymgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `6763e96d-8b0e-4093-bc73-0749820aeaac` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:30:00.6880` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |

## 部署信息

- **部署时间**: 2026-05-22 23:45:58:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202601201940_metadata_cpu-supplymgr-supplyevaluate.zip`
- **安装人**: mongoTools
- **安装排名**: `381ec7c1-7af7-49f5-b852-fff1aee2ffcb`

## 业务场景

- `workflow`
- `UITemplate`
- `DataAuth`
- `transtype`
- `report`
- `billcode`
- `ruleengine`
- `userdefine`
- `msgtemplate`
- `api`

## 术语标记

`BusinessData`, `data_auth`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 7 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 3 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |
| 4 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 5 | 生单回写 (`IBackWrite`) | `base.itf.IBackWrite` | 254 | 7 |
| 6 | 流程接口 (`IBusinessFlow`) | `base.itf.IBusinessFlow` | 77 | 2 |
| 7 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |

---

## 直接属性（共 68 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | id | `id` | Long | `long` |  | ✓ |
| 2 | `parentApplyId` | 父任务ID | `parent_apply_id` | Long | `long` |  | ✓ |
| 3 | `rootApplyId` | 主任务ID | `root_apply_id` | Long | `long` |  | ✓ |
| 4 | `chargeOrgId` | 负责组织ID | `charge_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 5 | `evaOrgType` | 评价标准 | `eva_org_type` | String | `text` |  | ✓ |
| 6 | `isRoot` | 任务类型 | `is_root` | String | `text` |  | ✓ |
| 7 | `enableWeight` | 启用权重 | `enable_weight` | String | `text` |  | ✓ |
| 8 | `dr` | 逻辑删除标记 | `dr` | Short | `short` |  | ✓ |
| 9 | `transType` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 10 | `tenantId` | 租户ID | `ytenant_id` | String | `text` |  | ✓ |
| 11 | `businessStartDate` | 业务开始日期 | `business_start_date` | Date | `date` |  | ✓ |
| 12 | `source` | 上游单据类型 | `source` | String | `text` |  | ✓ |
| 13 | `isAutomaticSyn` | 是否自动同步评价结果 | `is_automatic_syn` | String | `text` |  | ✓ |
| 14 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String | `text` |  | ✓ |
| 15 | `applyDeptId` | 申请部门 | `apply_dept_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 16 | `reportStatus` | 审批状态 | `report_status` | String | `text` |  | ✓ |
| 17 | `evaIndicatorType` | 自动指标 | `eva_indicator_type` | String | `text` |  | ✓ |
| 18 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 19 | `operateUserId` | 操作人 | `operate_user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 20 | `applyCode` | 编码 | `apply_code` | String | `text` |  | ✓ |
| 21 | `operateDate` | 操作时间 | `operate_date` | DateTime | `timestamp` |  | ✓ |
| 22 | `fileId` | 附件ID | `file_id` | String | `text` |  | ✓ |
| 23 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String | `text` |  | ✓ |
| 24 | `isBizLeaderForMe` | 负责人为我 | `is_biz_leader_for_me` | String | `text` |  | ✓ |
| 25 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |  | ✓ |
| 26 | `supSynergyStatus` | 反馈状态 | `sup_synergy_status` | String | `text` |  | ✓ |
| 27 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | ✓ |
| 28 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean | `switch` |  | ✓ |
| 29 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 30 | `sourceid` | 上游单据主表id | `sourceid` | Long | `long` |  | ✓ |
| 31 | `chargePsnId` | 评价负责人 | `charge_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 32 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime | `timestamp` |  | ✓ |
| 33 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 34 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long | `long` |  | ✓ |
| 35 | `upcode` | 上游单据号 | `upcode` | String | `text` |  | ✓ |
| 36 | `applyDate` | 申请日期 | `apply_date` | DateTime | `timestamp` |  | ✓ |
| 37 | `applyTitle` | 标题 | `apply_title` | String | `multiLanguage` |  | ✓ |
| 38 | `code` | 编码 | `code` | String | `text` |  | ✓ |
| 39 | `applyPsnId` | 发起人 | `apply_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 40 | `applyOrgId` | 发起组织ID | `apply_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 41 | `evaAutoDuration` | 考评周期 | `eva_auto_duration` | String | `text` |  | ✓ |
| 42 | `evaAutoYear` | 周期(年) | `eva_auto_year` | String | `text` |  | ✓ |
| 43 | `evaAutoSeason` | 周期(季) | `eva_auto_season` | String | `text` |  | ✓ |
| 44 | `evaAutoMonth` | 周期(月) | `eva_auto_month` | String | `text` |  | ✓ |
| 45 | `businessEndDate` | 业务截止日期 | `business_end_date` | Date | `date` |  | ✓ |
| 46 | `evaStartDate` | 开始日期 | `eva_start_date` | DateTime | `dateTime` |  | ✓ |
| 47 | `evaEndDate` | 结束日期 | `eva_end_date` | DateTime | `dateTime` |  | ✓ |
| 48 | `evaWeightType` | 评分方式 | `eva_weight_type` | String | `text` |  | ✓ |
| 49 | `summaryRule` | 汇总规则 | `summary_rule` | String | `text` |  | ✓ |
| 50 | `supSynergy` | 需要反馈 | `sup_synergy` | String | `text` |  | ✓ |
| 51 | `evaObjectType` | 考评颗粒度 | `eva_object_type` | String | `text` |  | ✓ |
| 52 | `evaBillNum` | 业务单据 | `eva_bill_num` | String | `text` |  | ✓ |
| 53 | `evaAbilityId` | 等级体系ID | `eva_ability_id` | 960ce6ff-03b4-4afc-ba32-2342d2e50e5b | `quote` |  | ✓ |
| 54 | `evaStandard` | 等级标准 | `eva_standard` | String | `text` |  | ✓ |
| 55 | `enableIndClassWeight` | 是否启用指标分类权重 | `enable_ind_class_weight` | String | `text` |  | ✓ |
| 56 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 57 | `status` | 状态 | `status` | String | `text` |  | ✓ |
| 58 | `verifystate` | 审批流状态 | `verifystate` | Short | `short` |  | ✓ |
| 59 | `userDefineCharacter` | 评价任务特征 | `user_define_character` | 0be9213f-580b-4804-8961-26c8182e5afc | `UserDefine` |  | ✓ |
| 60 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 61 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 62 | `auditor` | 审批人 | `auditor` | String | `text` |  | ✓ |
| 63 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 64 | `evaExtraList` | 其他补充项 | `` | 2c583a41-a43a-4510-ad10-628c30a65d93 | `` |  |  |
| 65 | `evaIndicatorList` | 评价指标 | `` | a99aa5d4-6970-4966-b154-f50bfb8dc5ee | `` |  |  |
| 66 | `evaObjectList` | 评价任务对象子表 | `` | 2b18e876-be06-4c22-beed-455e43f1b75f | `` |  |  |
| 67 | `evaOrgList` | 评价组织 | `` | 62ed14b2-5761-4041-ac96-98067d0bd651 | `` |  |  |
| 68 | `evaTransferList` | 转派记录 | `` | 2db8b8aa-0ec9-4195-a84c-5dc4e246f008 | `` |  |  |

---

## 关联属性（共 17 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `chargePsnId` | 评价负责人 | `bd.staff.Staff` | `charge_psn_id` |  →  |  |  | Service |  |
| 2 | `applyOrgId` | 发起组织ID | `org.func.BaseOrg` | `apply_org_id` |  →  |  |  | Service |  |
| 3 | `userDefineCharacter` | 评价任务特征 | `cpu-supplymgr.supplyevaluate.EvaluateApplyUserDefineCharacter` | `user_define_character` |  →  |  |  | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 5 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | `bizFlowId` |  →  |  |  | Service |  |
| 6 | `evaOrgList` | 评价组织 | `cpu-supplymgr.supplyevaluate.EvaluateApplyOrg` | `` | evaOrgList → evaApplyId | 0..n | true | None |  |
| 7 | `evaAbilityId` | 等级体系ID | `aa.supplyability.SupplyAbility` | `eva_ability_id` |  →  |  |  | Service |  |
| 8 | `evaTransferList` | 转派记录 | `cpu-supplymgr.supplyevaluate.EvaluateApplyTransfer` | `` | evaTransferList → evaApplyId | 0..n | true | None |  |
| 9 | `evaObjectList` | 评价任务对象子表 | `cpu-supplymgr.supplyevaluate.EvaluateApplyObject` | `` | evaObjectList → evaApplyId | 0..n | true | None |  |
| 10 | `evaIndicatorList` | 评价指标 | `cpu-supplymgr.supplyevaluate.EvaluateApplyIndicator` | `` | evaIndicatorList → evaApplyId | 0..n | true | None |  |
| 11 | `chargeOrgId` | 负责组织ID | `org.func.BaseOrg` | `charge_org_id` |  →  |  |  | Service |  |
| 12 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 13 | `transType` | 交易类型 | `bd.bill.TransType` | `trans_type_id` |  →  |  |  | Service |  |
| 14 | `applyDeptId` | 申请部门 | `org.func.BaseOrg` | `apply_dept_id` |  →  |  |  | Service |  |
| 15 | `evaExtraList` | 其他补充项 | `cpu-supplymgr.supplyevaluate.EvaluateApplyExtra` | `` | evaExtraList → evaApplyId | 0..n | true | None |  |
| 16 | `applyPsnId` | 发起人 | `bd.staff.Staff` | `apply_psn_id` |  →  |  |  | Service |  |
| 17 | `operateUserId` | 操作人 | `bd.staff.Staff` | `operate_user_id` |  →  |  |  | Service |  |

### Composition（子表）

- **evaOrgList**: `evaOrgList` → `cpu-supplymgr.supplyevaluate.EvaluateApplyOrg` | 0..n
- **evaTransferList**: `evaTransferList` → `cpu-supplymgr.supplyevaluate.EvaluateApplyTransfer` | 0..n
- **evaObjectList**: `evaObjectList` → `cpu-supplymgr.supplyevaluate.EvaluateApplyObject` | 0..n
- **evaIndicatorList**: `evaIndicatorList` → `cpu-supplymgr.supplyevaluate.EvaluateApplyIndicator` | 0..n
- **evaExtraList**: `evaExtraList` → `cpu-supplymgr.supplyevaluate.EvaluateApplyExtra` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `chargePsnId` (评价负责人) | `bd.staff.Staff` | `charge_psn_id` |
| `applyOrgId` (发起组织ID) | `org.func.BaseOrg` | `apply_org_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `bizFlow` (流程ID) | `bf.bizflow.BusinessFlow` | `bizFlowId` |
| `evaAbilityId` (等级体系ID) | `aa.supplyability.SupplyAbility` | `eva_ability_id` |
| `chargeOrgId` (负责组织ID) | `org.func.BaseOrg` | `charge_org_id` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `transType` (交易类型) | `bd.bill.TransType` | `trans_type_id` |
| `applyDeptId` (申请部门) | `org.func.BaseOrg` | `apply_dept_id` |
| `applyPsnId` (发起人) | `bd.staff.Staff` | `apply_psn_id` |
| `operateUserId` (操作人) | `bd.staff.Staff` | `operate_user_id` |
