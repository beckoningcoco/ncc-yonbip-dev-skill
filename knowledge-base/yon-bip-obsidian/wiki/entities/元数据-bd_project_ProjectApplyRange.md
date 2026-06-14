---
tags: [BIP, 元数据, 数据字典, bd.project.ProjectApplyRange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目适用范围 (`bd.project.ProjectApplyRange`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_project_applyrange` | domain：`ucfbasedoc` | 应用：`DPMPRJ` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目适用范围 |
| 物理表 | `bd_project_applyrange` |
| domain/服务域 | `ucfbasedoc` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMPRJ` |
| 直连字段 | 6 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `project_id` | `` |
| `org_id` | `ucf-org-center.org_pure_tree_ref` |

## 继承接口 (2个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)

## 字段列表（按类型分组）

> 共 6 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_id` | `org_id` | `rangeOrgId` | 组织 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iscreator` | `iscreator` | `isCreator` | 是否创建人名称 |
| `dr` | `dr` | `dr` | 删除状态 |
