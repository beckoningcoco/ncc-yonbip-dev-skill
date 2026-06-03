---
tags: [BIP, 元数据, 数据字典, prtp.projecttemplate.ProjectTemplateParam]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目模板专属属性 (`prtp.projecttemplate.ProjectTemplateParam`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prtp_project_template_param` | domain：`yonbip-pm-projectme` | 应用：`PRTP` | 业务对象ID：`1918a1f1-91f6-43bf-a2f8-1d077792a17f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目模板专属属性 |
| 物理表 | `prtp_project_template_param` |
| 数据库 schema | `yonbip-pm-projectme` |
| 所属应用 | `PRTP` |
| 直连字段 | 23 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `project_template_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `org_v_id` | `` |
| `org_id` | `` |

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

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `archive_code` | `archive_code` | `archiveCode` | 引用档案参照code |
| `archive_define_name` | `archive_define_name` | `archiveDefineName` | 自定义档案名称name |
| `archive_domain` | `archive_domain` | `archiveDomain` | 来源域code |
| `archive_name` | `archive_name` | `archiveName` | 基础档案名称name |
| `archive_return` | `archive_return` | `archiveReturn` | 档案返回值 |
| `class_type` | `class_type` | `classType` | 专属属性类型 |
| `group_id` | `group_id` | `groupId` | 集团 |
| `id` | `id` | `id` | 主键 |
| `name` | `name` | `name` | 名称 |
| `null_flag` | `null_flag` | `nullFlag` | 必输 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_id` | `org_id` | `orgId` | 业务单元最新版 |
| `org_v_id` | `org_v_id` | `orgVId` | 业务单元 |
| `project_template_id` | `project_template_id` | `projectTemplateId` | 主表主键 |
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
| `enablestate` | `enablestate` | `enablestate` | 停用启用 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `input_digit` | `input_digit` | `inputDigit` | 精度 |
| `input_length` | `input_length` | `inputLength` | 输入长度 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
