---
tags: [BIP, 元数据, 数据字典, pgrm.projecttask.ProjectTaskResult]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目活动成果物 (`pgrm.projecttask.ProjectTaskResult`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pgrm_activity_result` | domain：`yonbip-pm-projectme` | 应用：`PGRM` | 业务对象ID：`f76a015a-f5ed-4916-8354-47da523fbe1f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目活动成果物 |
| 物理表 | `pgrm_activity_result` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `PGRM` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `submitter_id` | `` |
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

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `name` | `name` | `name` | 成果物名称 |
| `result` | `result` | `result` | 成果物 |
| `template` | `template` | `template` | 附件模板 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_id` | `org_id` | `orgId` | 主组织 |
| `project_id` | `project_id` | `projectId` | 项目id |
| `submitter_id` | `submitter_id` | `submitterId` | 提交人 |
| `task_id` | `task_id` | `taskId` | 项目活动主表外键 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `submission_time` | `submission_time` | `submissionTime` | 最后提交时间 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `must_submit` | `must_submit` | `mustSubmit` | 是否必须提交 |
| `result_upload_flag` | `result_upload_flag` | `resultUploadFlag` | 成果物已上传标识 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acceptance_status` | `acceptance_status` | `acceptanceStatus` | 验收状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `define_character` | `define_character` | `defineCharacter` | 自定义项属性特征 |

### link (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `project_document_url` | `project_document_url` | `projectDocumentUrl` | 项目文档地址 |
