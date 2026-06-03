---
tags: [BIP, 元数据, 数据字典, pgrm.projectschedule.ProjectScheduleItemResult]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目进度成果物 (`pgrm.projectschedule.ProjectScheduleItemResult`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prjc_project_schedule_item_result` | domain：`yonbip-pm-projectme` | 应用：`PGRM` | 业务对象ID：`5ed50b6c-9204-42ec-8910-4b7147d2f488`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目进度成果物 |
| 物理表 | `prjc_project_schedule_item_result` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `PGRM` |
| 直连字段 | 22 个 |
| 子表 | 1 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `pgrm.projectschedule.ProjectScheduleItemResultDefine` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `schedule_item_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `project_id` | `` |
| `org_id` | `` |
| `submit_id` | `` |
| `` | `` |

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

> 共 22 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `files` | `files` | `files` | 附件 |
| `files_result` | `files_result` | `filesResult` | 成果物附件 |
| `id` | `id` | `id` | 主键 |
| `result_name` | `result_name` | `resultName` | 成果物名称 |
| `template_name` | `template_name` | `templateName` | 模板名称 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_id` | `org_id` | `orgId` | 主组织 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `schedule_item_id` | `schedule_item_id` | `scheduleItemId` | 项目进度计划主表外键 |
| `submit_id` | `submit_id` | `submitId` | 提交人id |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `submit_date` | `submit_date` | `submitDate` | 提交日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `result_upload_flag` | `result_upload_flag` | `resultUploadFlag` | 成果物已上传标识 |
| `submit_flag` | `submit_flag` | `submitFlag` | 是否需要提交标识 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acceptance_status` | `acceptance_status` | `acceptanceStatus` | 验收状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 项目进度成果物自定义项 |
