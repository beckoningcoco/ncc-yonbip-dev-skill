---
tags: [BIP, 元数据, 数据字典, fa.fixedasset.MoreDepartment]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 多部门 (`fa.fixedasset.MoreDepartment`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`at_moredepartment` | domain：`yonyoufi` | 应用：`FA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 多部门 |
| 物理表 | `at_moredepartment` |
| 数据库 schema | `yonyoufi` |
| 所属应用 | `FA` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `fixedassetsinfo` | `` |
| `project` | `ucfbasedoc.bd_projectNewRef` |
| `department` | `ucf-org-center.bd_adminorgsharetreeref` |
| `tenant_id` | `` |

## 继承接口 (1个, 1字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `departmentname` | `departmentname` | `departmentname` | 部门名称 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `project` | `project` | `project` | 项目 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `department` | `department` | `department` | 部门 |
| `fixedassetsinfo` | `fixedassetsinfo` | `fixedassetsinfo` | 卡片主表关联标识 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `proportion` | `proportion` | `proportion` | 比例(%) |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `remark` | `remark` | `remark` | 备注 |
