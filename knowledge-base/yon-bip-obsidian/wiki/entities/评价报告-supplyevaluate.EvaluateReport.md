---
tags: ["BIP", "元数据", "数据字典", "ycSupplierManagement", "cpu-supplymgr.supplyevaluate.EvaluateReport"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评价报告 (`cpu-supplymgr.supplyevaluate.EvaluateReport`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycSupplierManagement 模块实体元数据字典。
> 物理表：`cpu_evaluate_report` | 所属应用：`ycSupplierManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-supplymgr.supplyevaluate.EvaluateReport` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评价报告 |
| 物理表 | `cpu_evaluate_report` |
| domain/服务域 | `cpu-supplymgr` |
| schema | `cpu_suppliermgr` |
| 所属应用 | `ycSupplierManagement` |
| 业务对象ID | `e254216a-cfe6-46fa-b5d5-1322e0256013` |
| 元数据类型 | `Class` |
| 元数据层级 | `0` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 16:35:48.1640` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | id |
| 编码 | `apply_code` | `apply_code` | String | 编码（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-22 23:45:59:000
- **安装来源**: `/app/data_scripts/cpu-suppliermgr-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-suppliermgr/0010_iuap_common/DML/0270_iuap_metadata/202602231522_metadata_cpu-supplymgr-supplyevaluate_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `4fcf7463-89bb-4597-9070-2a11ec91df20`

## 业务场景

- `print`
- `UITemplate`
- `imextmp`
- `transtype`
- `report`
- `userdefine`
- `msgtemplate`
- `bpm`

## 术语标记

`BusinessData`, `isMain`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 2 | 审批流信息 (`IApprovalFlow`) | `base.itf.IApprovalFlow` | 134 | 3 |
| 3 | 审批信息 (`IApprovalInfo`) | `base.itf.IApprovalInfo` | 172 | 4 |

---

## 直接属性（共 49 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | id | `id` | Long | `long` |  | ✓ |
| 2 | `applyOrgId` | 发起组织ID | `apply_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 3 | `applyTitle` | 标题 | `apply_title` | String | `text` |  | ✓ |
| 4 | `applyOrgName` | 申请组织名称 | `apply_org_name` | String | `text` |  | ✓ |
| 5 | `applyPsnName` | 申请人名称 | `apply_psn_name` | String | `text` |  | ✓ |
| 6 | `createTime` | 创建时间 | `createtime` | DateTime | `dateTime` |  | ✓ |
| 7 | `evaAbilityName` | 等级体系名称 | `eva_ability_name` | String | `text` |  | ✓ |
| 8 | `evaApplyId` | 评估申请id | `eva_apply_id` | cea9d2e2-dd02-406a-b705-64892d3959cd | `quote` |  | ✓ |
| 9 | `evaOrgType` | 评价标准 | `eva_org_type` | String | `text` |  | ✓ |
| 10 | `evaWeightType` | 评分方式 | `eva_weight_type` | String | `text` |  | ✓ |
| 11 | `isApprove` | 是否审批 | `is_approve` | Long | `long` |  | ✓ |
| 12 | `supVisible` | 供应商是否可见 | `sup_visible` | String | `text` |  | ✓ |
| 13 | `supSynergyStatus` | 供应商协同状态 | `sup_synergy_status` | String | `text` |  | ✓ |
| 14 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 15 | `evaIndicatorType` | 自动指标 | `eva_indicator_type` | String | `text` |  | ✓ |
| 16 | `evaAutoDuration` | 考评周期 | `eva_auto_duration` | String | `text` |  | ✓ |
| 17 | `evaAutoYear` | 周期(年) | `eva_auto_year` | String | `text` |  | ✓ |
| 18 | `evaAutoSeason` | 周期(季) | `eva_auto_season` | String | `text` |  | ✓ |
| 19 | `evaAutoMonth` | 周期(月) | `eva_auto_month` | String | `text` |  | ✓ |
| 20 | `reportFileId` | 附件 | `report_file_id` | String | `text` |  | ✓ |
| 21 | `enableIndClassWeight` | 是否启用指标分类权重 | `enable_ind_class_weight` | String | `text` |  | ✓ |
| 22 | `status` | 状态 | `status` | String | `text` |  | ✓ |
| 23 | `indClassWeightType` | 指标分类评分方式 | `ind_class_weight_type` | String | `text` |  | ✓ |
| 24 | `isTempReport` | 临时报告 | `is_temp_report` | String | `text` |  | ✓ |
| 25 | `enterpriseId` | 企业ID | `enterprise_id` | Long | `long` |  | ✓ |
| 26 | `isBizLeaderForMe` | 负责人为我 | `is_biz_leader_for_me` | String | `text` |  | ✓ |
| 27 | `transType` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 28 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 29 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | ✓ |
| 30 | `auditDate` | 审批日期 | `audit_date` | Date | `date` |  | ✓ |
| 31 | `applyCode` | 编码 | `apply_code` | String | `text` |  | ✓ |
| 32 | `applyPsnId` | 申请人ID | `apply_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 33 | `applyDate` | 申请日期 | `apply_date` | DateTime | `dateTime` |  | ✓ |
| 34 | `evaStartDate` | 开始时间 | `eva_start_date` | DateTime | `dateTime` |  | ✓ |
| 35 | `evaEndDate` | 结束时间 | `eva_end_date` | DateTime | `dateTime` |  | ✓ |
| 36 | `summaryRule` | 汇总规则 | `summary_rule` | String | `text` |  | ✓ |
| 37 | `supSynergy` | 需要反馈 | `sup_synergy` | String | `text` |  | ✓ |
| 38 | `evaObjectType` | 考评颗粒度 | `eva_object_type` | String | `text` |  | ✓ |
| 39 | `evaAbilityId` | 等级体系ID | `eva_ability_id` | 960ce6ff-03b4-4afc-ba32-2342d2e50e5b | `quote` |  | ✓ |
| 40 | `evaStandard` | 评估标准 | `eva_standard` | String | `text` |  | ✓ |
| 41 | `auditor` | 审批人 | `auditor` | String | `text` |  | ✓ |
| 42 | `auditTime` | 审批时间 | `audit_time` | DateTime | `timestamp` |  | ✓ |
| 43 | `verifystate` | 审批流状态 | `verifystate` | Short | `short` |  | ✓ |
| 44 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 45 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 46 | `userDefineCharacter` | 评价报告特征 | `user_define_character` | 162f4a8b-40f3-4cec-8034-8a7e7918ff6f | `UserDefine` |  | ✓ |
| 47 | `approveStatus` | 审批状态 | `approve_status` | String | `text` |  | ✓ |
| 48 | `evaReportSupplyList` | 评价报告供应商得分表 | `` | b4649a04-b935-4a17-9c24-92c261dd15ec | `` |  |  |
| 49 | `writeBackStatus` | 同步评价结果状态 | `write_back_status` | Short | `short` |  | ✓ |

---

## 关联属性（共 9 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `applyOrgId` | 发起组织ID | `org.func.BaseOrg` | `apply_org_id` |  →  |  |  | Service |  |
| 2 | `auditorId` | 审批人 | `base.user.User` | `auditorId` |  →  |  |  | Service |  |
| 3 | `transType` | 交易类型 | `bd.bill.TransType` | `trans_type_id` |  →  |  |  | Service |  |
| 4 | `userDefineCharacter` | 评价报告特征 | `cpu-supplymgr.supplyevaluate.EvaluateReportUserDefineCharacter` | `user_define_character` |  →  |  |  | None |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 6 | `applyPsnId` | 申请人ID | `bd.staff.Staff` | `apply_psn_id` |  →  |  |  | Service |  |
| 7 | `evaAbilityId` | 等级体系ID | `aa.supplyability.SupplyAbility` | `eva_ability_id` |  →  |  |  | Service |  |
| 8 | `evaApplyId` | 评估申请id | `cpu-supplymgr.supplyevaluate.EvaluateApply` | `eva_apply_id` |  →  |  |  | None |  |
| 9 | `evaReportSupplyList` | 评价报告供应商得分表 | `cpu-supplymgr.supplyevaluate.EvaluateReportSupply` | `` | evaReportSupplyList → evaReportId | 0..n | true | None |  |

### Composition（子表）

- **evaReportSupplyList**: `evaReportSupplyList` → `cpu-supplymgr.supplyevaluate.EvaluateReportSupply` | 0..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `applyOrgId` (发起组织ID) | `org.func.BaseOrg` | `apply_org_id` |
| `auditorId` (审批人) | `base.user.User` | `auditorId` |
| `transType` (交易类型) | `bd.bill.TransType` | `trans_type_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `applyPsnId` (申请人ID) | `bd.staff.Staff` | `apply_psn_id` |
| `evaAbilityId` (等级体系ID) | `aa.supplyability.SupplyAbility` | `eva_ability_id` |
