---
tags: [BIP, 元数据, 数据字典, BGDM.wbs.wbs_doc]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# WBS (`BGDM.wbs.wbs_doc`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bgdm_wbs_doc` | domain：`yonbip-pm-commonbd` | 应用：`BGDM` | 业务对象ID：`38ae6498-2aff-4ebe-af4c-1113160f8c9b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | WBS |
| 物理表 | `bgdm_wbs_doc` |
| domain/服务域 | `yonbip-pm-commonbd` |
| schema | `pmcloud` |
| 所属应用 | `BGDM` |
| 直连字段 | 62 个 |
| 关联引用 | 15 个 |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `department_id` | `ucf-org-center.admin_dept_tree_ref_na` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |
| `wbs_doc_define_character` | `` |
| `participating_enterprise_id` | `yonbip-pm-projectme.prjc_projectparticipant_ref` |
| `schedule_type` | `ucfbasedoc.bd_billtyperef` |
| `bill_maker` | `iuap-ptc-yoncmm.sattUuser` |
| `responsible_id` | `ucf-staff-center.bd_staff_leave_ref` |
| `currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `fin_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `stage_id` | `yonbip-pm-projectme.RefTable_0494c88295` |

## 继承接口 (4个, 9字段)

- **主组织** (`iuap.busiObj.OrgItf`)
  - `org_id` → `org_id`
- **树型结构** (`iuap.busiObj.ITree`)
  - `ifend` → `ifend`
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 62 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `plan_time` | `plan_time` | String | 计划工期 |
| `reason_for_completion_delay` | `reason_for_completion_delay` | String | 完成延期原因 |
| `reason_for_starting_delay` | `reason_for_starting_delay` | String | 开始延期原因 |
| `remark` | `remark` | String | 备注 |
| `source_id` | `source_id` | String | 来源id |
| `id` | `id` | String | 主键 |
| `code` | `code` | String | 编码 |
| `name` | `name` | String | 名称 |
| `path` | `path` | String | 路径 |

### 引用字段 (14个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `bill_maker` | `bill_maker` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | 制单人 |
| `currency_id` | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 币种 |
| `fin_org_id` | `fin_org_id` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 | 会计主体 |
| `parent_id` | `parent_id` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | 上级分类 |
| `project_id` | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | 项目 |
| `schedule_type` | `schedule_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | 计划类型 |
| `stage_id` | `stage_id` | 226fae36-161f-456a-adb9-95a7497bf9fd | 项目阶段 |
| `participating_enterprise_id` | `participating_enterprise_id` | f730d346-ca82-43e3-bbe3-ce0bb1a32530 | 参与企业 |
| `department_id` | `department_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | 责任部门id |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |
| `org_id` | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 | 主组织 |
| `responsible_id` | `responsible_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | 责任人id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `actual_end_date` | `actual_end_date` | String | 实际完成日期 |
| `actual_start_date` | `actual_start_date` | String | 实际开始日期 |
| `plan_end_date` | `plan_end_date` | String | 计划结束日期 |
| `plan_start_date` | `plan_start_date` | String | 计划开始日期 |

### 日期时间 (13个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `bill_make_time` | `bill_make_time` | Date | 制单时间 |
| `plan_early_end_date` | `plan_early_end_date` | Date | 计划最早结束时间 |
| `plan_early_start_date` | `plan_early_start_date` | Date | 计划最早开始时间 |
| `plan_latest_end_date` | `plan_latest_end_date` | Date | 计划最晚结束时间 |
| `plan_latest_start_date` | `plan_latest_start_date` | Date | 计划最晚开始时间 |
| `predicate_end_date` | `predicate_end_date` | Date | 预测结束日期 |
| `predicate_start_date` | `predicate_start_date` | Date | 预测开始日期 |
| `cost_accounting_start_date` | `cost_accounting_start_date` | Date | 成本核算启用日期 |
| `pubts` | `pubts` | DateTime | 时间戳 |
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `disablets` | `disablets` | DateTime | 停用时间 |
| `enablets` | `enablets` | DateTime | 启用时间 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `schedule_flag` | `schedule_flag` | Boolean | 是否计划 |
| `cost_accounting_flag` | `cost_accounting_flag` | Boolean | 是否成本核算 |
| `wbs_budget_flag` | `wbs_budget_flag` | Boolean | WBS预算属性 |

### 枚举字段 (8个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `is_grouping_wbs` | `is_grouping_wbs` | pm_common_yesno | 是否库存管理WBS |
| `stage_inspection_flag` | `stage_inspection_flag` | schedule_milestone | 阶段验收标识 |
| `wbs_schedule_method` | `wbs_schedule_method` | wbsScheduleMethod | 编制方式 |
| `bresource_plan` | `bresource_plan` | pm_common_yesno | 是否资源计划 |
| `source_type` | `source_type` | wbsSourceType | 来源类型 |
| `type` | `type` | wbsDocType | WBS类型 |
| `wbs_status` | `wbs_status` | wbsStatus | WBS状态 |
| `enable` | `enable` | sys_intboolean | 档案状态 |

### 整数 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `actual_time` | `actual_time` | Integer | 实际工期 |
| `floating_time` | `floating_time` | Integer | 浮动天数 |
| `predicate_time` | `predicate_time` | Integer | 预测天数 |
| `serial` | `serial` | Integer | 排序号 |
| `tx_status` | `tx_status` | Integer | 事务状态 |
| `level` | `level` | Integer | 层级 |

### 短整数 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `leaf_flag` | `leaf_flag` | Short | 是否末级 |
| `dr` | `dr` | Short | 逻辑删除 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `plan_hours` | `plan_hours` | Decimal | 计划时长 |
| `completion_ratio` | `completion_ratio` | Decimal | 完工比 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `wbs_doc_define_character` | `wbs_doc_define_character` | f45f2fe4-4c7e-4592-8f72-2325ac905482 | 自定义项特征属性 |
