---
tags: [BIP, 元数据, 数据字典, epub.component.CostComponentDTO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成本组件 (`epub.component.CostComponentDTO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_cost_component` | domain：`fiepub` | 应用：`FP` | 业务对象ID：`417e6f28-c699-4964-b04c-d75ef6789754`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成本组件 |
| 物理表 | `epub_cost_component` |
| domain/服务域 | `fiepub` |
| schema | `fiepub` |
| 所属应用 | `FP` |
| 直连字段 | 21 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `character` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `header_id` | `fiepub.epub_component_classify_treeref` |
| `tenant_id` | `` |

## 继承接口 (4个, 11字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | String | ID |
| `code` | `code` | String | 组件编码 |
| `description` | `description` | String | 备注 |
| `` | `creator` | String | 创建人名称 |
| `` | `modifier` | String | 修改人名称 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `header_id` | `header_id` | 0d2387db-c724-478b-b97f-82ce173e380c | 组件分类id |
| `` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |
| `` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_date` | `create_date` | Date | 创建日期 |
| `modify_date` | `modify_date` | Date | 修改日期 |

### 短整数 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `item_detail_restore` | `item_detail_restore` | Short | 分项明细还原 |
| `purpose` | `purpose` | Short | 组件用途 |
| `data_source` | `data_source` | Short | 数据来源 |
| `dr` | `dr` | Short | 逻辑删除标记 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 组件名称 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `character` | `character` | b63e85c3-22e9-41d0-90c0-9dc314e20df2 | 成本组件特征属性 |

### timestamp (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |
