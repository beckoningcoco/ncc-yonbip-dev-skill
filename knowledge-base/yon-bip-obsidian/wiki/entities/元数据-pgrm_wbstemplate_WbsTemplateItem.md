---
tags: [BIP, 元数据, 数据字典, pgrm.wbstemplate.WbsTemplateItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# WBS模板明细 (`pgrm.wbstemplate.WbsTemplateItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pm_pgrm_wbstpl_item` | domain：`yonbip-pm-projectme` | 应用：`PGRM` | 业务对象ID：`5b1fe33b-f5ca-4a2f-96c1-94bf2d130a37`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | WBS模板明细 |
| 物理表 | `pm_pgrm_wbstpl_item` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `PGRM` |
| 直连字段 | 42 个 |
| 子表 | 6 个 |
| 关联引用 | 18 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `projectScheduleItemParticipants` | `pgrm.wbstemplate.WbsTemplateParticipantsItem` | composition |
| `checkitem` | `pgrm.wbstemplate.WbsTemplateCheckitem` | composition |
| `WbsTemplateItemDefineList` | `pgrm.wbstemplate.WbsTemplateItemDefine` | composition |
| `WbsTemplateMaterialList` | `pgrm.wbstemplate.WbsTemplateMaterial` | composition |
| `feedbacks` | `pgrm.wbstemplate.FeedbackTemplateItem` | composition |
| `WbsTemplateEngineeringQuantityList` | `pgrm.wbstemplate.WbsTemplateEngineeringQuantity` | composition |

## 关联引用 (18个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `department_id` | `ucf-org-center.org_unit_tree_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `wbs_template_id` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `schedule_type` | `ucfbasedoc.bd_billtyperef` |
| `standard_milepost_id` | `yonbip-pm-commonbd.standard_milepost_ref` |
| `responsible_id` | `iuap-ptc-yoncmm.sattUuser` |
| `activity_type` | `ucfbasedoc.bd_billtyperef` |
| `define_character` | `` |
| `fin_org_id` | `ucf-org-center.bd_financeorgtreeref` |

## 继承接口 (3个, 6字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 42 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `memo` | `memo` | `memo` | 备注 |
| `node` | `node` | `node` | 节点id |
| `pnode` | `pnode` | `pnode` | 父节点id |
| `pre_wbs_code` | `pre_wbs_code` | `preWBSCode` | 前置计划id集合 |
| `project_template_id` | `project_template_id` | `projectTemplateId` | 项目模板ID |
| `wbs_name` | `wbs_name` | `wbsName` | WBS名称 |
| `wbs_number` | `wbs_number` | `wbsNumber` | WBS编码 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activity_type` | `activity_type` | `activityType` | 活动类型 |
| `department_id` | `department_id` | `departmentId` | 责任部门id |
| `fin_org_id` | `fin_org_id` | `finOrgId` | 会计主体 |
| `org_id` | `org_id` | `orgId` | 主组织 |
| `responsible_id` | `responsible_id` | `responsibleId` | 责任人id |
| `schedule_type` | `schedule_type` | `scheduleType` | 计划类型 |
| `wbs_template_id` | `wbs_template_id` | `wbsTemplateId` | WBS模板主表外键 |
| `standard_milepost_id` | `standard_milepost_id` | `standardMilepostId` | 标准里程碑ID |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cost_accounting_flag` | `cost_accounting_flag` | `costAccountingFlag` | 是否成本核算 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_grouping_wbs` | `is_grouping_wbs` | `isGroupingWbs` | 是否库存管理WBS |
| `is_need_audit_flag` | `is_need_audit_flag` | `isNeedAuditFlag` | 是否需要审批 |
| `schedule_flag` | `schedule_flag` | `scheduleFlag` | 是否计划 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 等级 |
| `plan_time` | `plan_time` | `planTime` | 计划工期(天) |
| `serial` | `serial` | `serial` | 排序 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `milestone_flag` | `milestone_flag` | `milestoneFlag` | 是否里程碑 |
| `phase_acceptance_flag` | `phase_acceptance_flag` | `phaseAcceptanceFlag` | 是否阶段验收 |
| `wbs_type` | `wbs_type` | `wbsType` | wbs类型.1:wbs.2:活动 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `milestone_ratio` | `milestone_ratio` | `milestoneRatio` | 里程碑进度 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define_character` | `define_character` | `defineCharacter` | wbs模版特征 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `WbsTemplateEngineeringQuantityList` | 工程量指标模板 |
| `` | `` | `WbsTemplateItemDefineList` | WBS模板明细自定义项 |
| `` | `` | `WbsTemplateMaterialList` | 项目物资清单模板 |
| `` | `` | `checkitem` | wbs模版检查项 |
| `` | `` | `feedbacks` | 成果物模板明细 |
| `` | `` | `projectScheduleItemParticipants` | 参与人模板明细 |
