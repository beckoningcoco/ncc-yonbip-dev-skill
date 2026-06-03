---
tags: [BIP, 元数据, 数据字典, pgrm.projecttask.ProjectTaskCheckitem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目活动检查项 (`pgrm.projecttask.ProjectTaskCheckitem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pgrm_activity_checkitem` | domain：`yonbip-pm-projectme` | 应用：`PGRM` | 业务对象ID：`f76a015a-f5ed-4916-8354-47da523fbe1f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目活动检查项 |
| 物理表 | `pgrm_activity_checkitem` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `PGRM` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `define_character` | `` |
| `project_id` | `` |
| `org_id` | `` |
| `task_id` | `yonbip-pm-projectme.RefTable_ebcf54ed61` |

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

> 共 21 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `content` | `content` | `content` | 检查项内容 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_id` | `org_id` | `orgId` | 主组织 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `task_id` | `task_id` | `taskId` | 主表外键 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `actual_end_date` | `actual_end_date` | `actualEndDate` | 实际结束日期 |
| `actual_start_date` | `actual_start_date` | `actualStartDate` | 实际开始时间 |
| `plan_end_date` | `plan_end_date` | `planEndDate` | 计划完成日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iorder` | `iorder` | `iOrder` | 序号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `checkFlag` | `checkFlag` | `checkFlag` | 是否已检查 |
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `weight` | `weight` | `weight` | 权重 |
| `weight_percent` | `weight_percent` | `weightPercent` | 权重百分比 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define_character` | `define_character` | `defineCharacter` | 自定义项特征 |

### link (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `project_document_url` | `project_document_url` | `projectDocumentUrl` | 项目文档地址 |
