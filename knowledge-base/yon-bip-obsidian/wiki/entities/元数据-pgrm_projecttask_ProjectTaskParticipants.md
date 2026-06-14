---
tags: [BIP, 元数据, 数据字典, pgrm.projecttask.ProjectTaskParticipants]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目活动参与人 (`pgrm.projecttask.ProjectTaskParticipants`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pgrm_activity_participants` | domain：`yonbip-pm-projectme` | 应用：`PGRM` | 业务对象ID：`f76a015a-f5ed-4916-8354-47da523fbe1f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目活动参与人 |
| 物理表 | `pgrm_activity_participants` |
| domain/服务域 | `yonbip-pm-projectme` |
| schema | `pmcloud` |
| 所属应用 | `PGRM` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `participating_enterprise_id` | `yonbip-pm-projectme.prjc_projectparticipant_ref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `define_character` | `` |
| `project_id` | `ucfbasedoc.bd_projectNewRef` |
| `org_id` | `ucf-org-center.org_pure_tree_ref_na` |
| `task_id` | `` |
| `member_id` | `iuap-ptc-yoncmm.sattUuser` |

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

> 共 21 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `user_id` | `user_id` | `userId` | 用户id |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `org_id` | `org_id` | `orgId` | 主组织 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `task_id` | `task_id` | `taskId` | 主表外键 |
| `member_id` | `member_id` | `memberId` | 参与人 |
| `participating_enterprise_id` | `participating_enterprise_id` | `participatingEnterprise` | 参与企业 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `plan_start_date` | `plan_start_date` | `planStartDate` | 计划开始日期 |
| `plan_end_date` | `plan_end_date` | `planEndDate` | 计划结束日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_external_person` | `is_external_person` | `isExternalPerson` | 是否外部人员 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `plan_hours` | `plan_hours` | `planHours` | 计划工时 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `plan_labor_cost` | `plan_labor_cost` | `planLaborCost` | 计划人工成本 |
| `rank_rate` | `rank_rate` | `rankRate` | 费率 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define_character` | `define_character` | `defineCharacter` | 自定义项特征 |
