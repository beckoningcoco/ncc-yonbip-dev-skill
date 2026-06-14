---
tags: [BIP, 元数据, 数据字典, PRJC.projectParticipant.ProjectParticipantItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 人员信息 (`PRJC.projectParticipant.ProjectParticipantItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prjc_project_participant_b` | domain：`yonbip-pm-projectme` | 应用：`PRJC` | 业务对象ID：`b27c6ed6-5f27-4b1e-90e2-9c78304de2a1`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 人员信息 |
| 物理表 | `prjc_project_participant_b` |
| domain/服务域 | `yonbip-pm-projectme` |
| schema | `pmcloud` |
| 所属应用 | `PRJC` |
| 直连字段 | 16 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `project_participant_id` | `` |
| `staff_id` | `ucf-staff-center.bd_staff_all_ref` |

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

> 共 16 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `remark` | `remark` | `remark` | 备注 |
| `user_id` | `user_id` | `userId` | 用户ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `project_participant_id` | `project_participant_id` | `projectParticipantId` | 项目参与方 |
| `staff_id` | `staff_id` | `staffId` | 员工ID |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 是否启用 |
| `estaff_type` | `estaff_type` | `estaffType` | 角色类别 |
| `is_admin` | `is_admin` | `isAdmin` | 是否管理员 |
| `user_status` | `user_status` | `userStatus` | 用户状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
