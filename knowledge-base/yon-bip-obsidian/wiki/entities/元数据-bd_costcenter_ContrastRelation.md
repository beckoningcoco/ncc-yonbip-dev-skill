---
tags: [BIP, 元数据, 数据字典, bd.costcenter.ContrastRelation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 对照关系 (`bd.costcenter.ContrastRelation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_contrast_relation` | domain：`finbd` | 应用：`DPMACCT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 对照关系 |
| 物理表 | `bd_contrast_relation` |
| domain/服务域 | `finbd` |
| schema | `iuap_apdoc_finbd` |
| 所属应用 | `DPMACCT` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `orgId` | `ucf-org-center.org_pure_tree_ref` |
| `ytenant_id` | `` |
| `` | `` |
| `header` | `` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `accentity` | `` |
| `work_center` | `engineeringdata.ed_workcenter_ref` |
| `tenant_id` | `` |

## 继承接口 (4个, 11字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `header` | `header` | `header` | 成本中心id |
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `dept` | `dept` | `dept` | 部门 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `orgId` | `orgId` | `org` | 业务单元 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `work_center` | `work_center` | `workCenter` | 工作中心 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `effect` | `effect` | `effect` | 启用 |
| `is_default` | `is_default` | `isDefault` | 是否默认 |
| `default_costcenter` | `default_costcenter` | `defaultCostcenter` | 默认成本中心 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
