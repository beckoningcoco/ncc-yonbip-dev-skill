---
tags: [BIP, 元数据, 数据字典, act.task.Task]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 任务 (`act.task.Task`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`act_task` | domain：`yycrm` | 应用：`ACT` | 业务对象ID：`0ef0ca9f-2703-436e-a1d8-29f282bd99a2`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 任务 |
| 物理表 | `act_task` |
| 数据库 schema | `yycrm` |
| 所属应用 | `ACT` |
| 直连字段 | 81 个 |
| 子表 | 8 个 |
| 关联引用 | 45 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `taskExecutorList` | `act.task.TaskExecutor` | composition |
| `assistTaskInvitationInformationList` | `act.task.AssistTaskInvitationInformation` | composition |
| `headDef` | `act.task.TaskDef` | composition |
| `taskItemList` | `act.task.TaskItem` | composition |
| `taskRemindRuleList` | `act.task.TaskRemindRule` | composition |
| `taskEmailList` | `act.task.TaskEmail` | composition |
| `taskCirculationRecordList` | `act.task.TaskCirculationRecord` | composition |
| `taskContactList` | `act.task.TaskContact` | composition |

## 关联引用 (45个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `task_plan_item_id` | `` |
| `activity` | `yycrm.mka_activityref` |
| `custOperatePlan_id` | `yycrm.cust_custoperateplanref` |
| `originator_id` | `ucf-staff-center.bd_staff_ref` |
| `attachment_group_item_id` | `` |
| `oppt_id` | `yycrm.sfa_opptref` |
| `custOperateTarget_id` | `yycrm.cust_custoperatetargetref` |
| `attachment_group_id` | `` |
| `clue_id` | `yycrm.sfa_clueref` |
| `contact_id` | `yycrm.cust_contactref` |
| `contract_draft` | `yycrm.sfa_contractdraftref` |
| `tenant_id` | `` |
| `assist_task` | `yycrm.act_taskref` |
| `visit_recommend_rule_id` | `yycrm.crmc_recommendruleref` |
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `org` | `ucf-org-center.bd_salesorg` |
| `ytenant_id` | `` |
| `milestonePlan_id` | `yycrm.cust_milestoneplanref` |
| `src_visitsummary` | `yycrm.dsfa_visitsummaryref` |
| `src_summary` | `yycrm.mka_summaryref` |
| `salearea` | `productcenter.aa_salearearef` |
| `terminal` | `yxybase.aa_storeterminal` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `bustype` | `transtype.bd_billtyperef` |
| `taskDefineCharacter` | `` |
| `follow_cord_id` | `yycrm.act_followrecordref` |
| `partner_person` | `ucf-staff-center.bd_outerstaff_info` |
| `task_plan_id` | `` |
| `tender_sheet_id` | `yycrm.sfa_tendersheetref` |
| `task_trans_type` | `yycrm.act_tasktranstyperef` |
| `oppt_stage` | `yycrm.sfa_processstageref` |
| `partner_dept` | `yycrm.prm_partnerdepartmentref` |
| `iCustID` | `yycrm.cust_customerref` |
| `customer_id` | `yycrm.cust_customerref` |

## 继承接口 (7个, 22字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **数字营销数据权限** (`crmc.base.IDataPermissions`)
  - `dept` → `dept`
  - `org` → `org`
  - `ower` → `ower`
  - `salearea` → `salearea`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 81 个直连字段

### 文本字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 任务编号 |
| `status` | `status` | `status` | 状态 |
| `regionCode` | `regionCode` | `regionCode` | 行政区划 |
| `quarterPlan` | `quarterPlan` | `quarterPlan` | 季度计划 |
| `yearPlan` | `yearPlan` | `yearPlan` | 年度计划 |
| `assist_task_executors` | `assist_task_executors` | `assistTaskExecutors` | 协访任务执行人集合 |
| `suggest_picture` | `suggest_picture` | `suggestPicture` | 任务图片 |
| `summary` | `summary` | `summary` | 任务摘要 |
| `content` | `content` | `content` | 任务内容 |
| `obsolete_reason` | `obsolete_reason` | `obsoleteReason` | 作废原因 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `batch_number` | `batch_number` | `batchNumber` | 任务批次 |
| `picture_1` | `picture_1` | `picture1` | 照片1 |
| `circle_batchno` | `circle_batchno` | `circleBatchNo` | 周期任务编码 |

### 引用字段 (36个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `task_trans_type` | `task_trans_type` | `taskTransType` | 任务类型ID |
| `attachment_group_id` | `attachment_group_id` | `attachmentGroupId` | 附件分组 |
| `attachment_group_item_id` | `attachment_group_item_id` | `attachmentGroupItemId` | 附件分组项 |
| `iCustID` | `iCustID` | `cust` | 客户 |
| `partner_person` | `partner_person` | `partnerPerson` | 伙伴人员 |
| `partner_dept` | `partner_dept` | `partnerDept` | 伙伴部门 |
| `follow_cord_id` | `follow_cord_id` | `followCordId` | 来源跟进记录ID |
| `custOperateTarget_id` | `custOperateTarget_id` | `custOperateTarget` | 经营目标 |
| `custOperatePlan_id` | `custOperatePlan_id` | `custOperatePlan` | 经营规划 |
| `milestonePlan_id` | `milestonePlan_id` | `milestonePlan` | 月度计划 |
| `tender_sheet_id` | `tender_sheet_id` | `tenderSheet` | 投标单 |
| `assist_task` | `assist_task` | `assistTask` | 协访任务 |
| `visit_recommend_rule_id` | `visit_recommend_rule_id` | `visitRecommendRuleId` | 拜访推荐规则id |
| `src_visitsummary` | `src_visitsummary` | `srcVisitsummary` | 来源拜访小结 |
| `src_summary` | `src_summary` | `srcSummary` | 来源活动小结 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `customer_id` | `customer_id` | `customer` | 客户ID |
| `clue_id` | `clue_id` | `clue` | 线索ID |
| `contact_id` | `contact_id` | `contact` | 联系人ID |
| `contract_draft` | `contract_draft` | `contractDraft` | 合同草案ID |
| `terminal` | `terminal` | `terminal` | 终端ID |
| `oppt_id` | `oppt_id` | `oppt` | 商机ID |
| `activity` | `activity` | `activity` | 营销活动Id |
| `oppt_stage` | `oppt_stage` | `opptStage` | 商机阶段 |
| `originator_id` | `originator_id` | `originator` | 发起人ID |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `task_plan_id` | `task_plan_id` | `taskPlanId` | 来源计划ID |
| `org` | `org` | `org` | 销售组织ID |
| `task_plan_item_id` | `task_plan_item_id` | `taskPlanItemId` | 来源计划明细ID |
| `salearea` | `salearea` | `saleArea` | 销售区域ID |
| `dept` | `dept` | `dept` | 部门ID |
| `ower` | `ower` | `ower` | 负责人ID |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_circle_task` | `is_circle_task` | `circleTask` | 是否周期任务 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `partner_execute` | `partner_execute` | `partnerExecute` | 伙伴执行 |
| `plan_task` | `plan_task` | `planTask` | 计划内任务 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `obsolete_status` | `obsolete_status` | `obsoleteStatus` | 作废状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `source_type` | `source_type` | `sourceType` | 来源类型 0-手动新增 1-计划生成 2-接口生成 3-推荐生成 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `verifystate` | `verifystate` | 审批状态 |
| `` | `returncount` | `returncount` | 退回次数 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iLNG` | `iLNG` | `longitude` | 经度 |
| `iLAT` | `iLAT` | `latitude` | 纬度 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `taskDefineCharacter` | `taskDefineCharacter` | `taskDefineCharacter` | 任务主表自定义项特征组 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `start_date` | `start_date` | `startDate` | 开始日期 |
| `end_date` | `end_date` | `endDate` | 截至日期 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `taskEmailList` | 邮件 |
| `` | `` | `assistTaskInvitationInformationList` | 协访邀请信息 |
| `` | `` | `headDef` | 任务主表自定义项 |
| `` | `` | `taskCirculationRecordList` | 流转记录 |
| `` | `` | `taskContactList` | 任务联系人 |
| `` | `` | `taskExecutorList` | 任务执行人 |
| `` | `` | `taskItemList` | 任务事项 |
| `` | `` | `taskRemindRuleList` | 提醒规则 |
