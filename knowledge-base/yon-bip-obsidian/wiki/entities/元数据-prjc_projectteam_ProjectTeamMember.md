---
tags: [BIP, 元数据, 数据字典, prjc.projectteam.ProjectTeamMember]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目团队(成员)明细 (`prjc.projectteam.ProjectTeamMember`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`project_team_member` | domain：`yonbip-pm-projectme` | 应用：`PRJC` | 业务对象ID：`2f111a05-cb82-472d-be79-b39bd927b096`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目团队(成员)明细 |
| 物理表 | `project_team_member` |
| domain/服务域 | `yonbip-pm-projectme` |
| schema | `pmcloud` |
| 所属应用 | `PRJC` |
| 直连字段 | 23 个 |
| 子表 | 0 个 |
| 关联引用 | 11 个 |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `team_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `outStaff_id` | `` |
| `ytenant_id` | `` |
| `participant_role_id` | `yonbip-pm-projectme.RefTable_718e6ba236` |
| `team_member_define_character` | `` |
| `project_participant_id` | `yonbip-pm-projectme.prjc_projectparticipant_ref` |
| `org_id` | `` |
| `project_role_id` | `yonbip-pm-projectme.prjr_superiorrole_ref` |
| `member_id` | `` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `memo` | `memo` | `memo` | 备注 |
| `role_type` | `role_type` | `roleType` | 成员角色 |
| `source_id` | `source_id` | `sourceId` | 来源id |
| `staff_type` | `staff_type` | `staffType` | 员工类型 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `member_id` | `member_id` | `memberId` | 成员姓名 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_id` | `org_id` | `orgId` | 企业 |
| `outStaff_id` | `outStaff_id` | `outStaffId` | 外部成员ID |
| `participant_role_id` | `participant_role_id` | `participantRoleId` | 参与方角色 |
| `project_participant_id` | `project_participant_id` | `projectParticipantId` | 项目参与方 |
| `project_role_id` | `project_role_id` | `projectRoleId` | 项目角色ID |
| `team_id` | `team_id` | `teamId` | 项目团队主表外键 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enter_team_date` | `enter_team_date` | `enterTeamDate` | 进入团队时间 |
| `leave_team_date` | `leave_team_date` | `leavaTeamDate` | 离开团队时间 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `plan_hours` | `plan_hours` | `planHours` | 计划投入时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `team_member_define_character` | `team_member_define_character` | `teamMemberDefineCharacter` | 自定义项特征组 |
