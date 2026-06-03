---
tags: [BIP, 元数据, 数据字典, bd.controlscope.ControlScopeVersionMappingVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 管控范围版本表 (`bd.controlscope.ControlScopeVersionMappingVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_controlscope_version_mapping` | domain：`finbd` | 应用：`FP` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 管控范围版本表 |
| 物理表 | `bd_controlscope_version_mapping` |
| 数据库 schema | `finbd` |
| 所属应用 | `FP` |
| 直连字段 | 7 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `controlscope` | `` |
| `ytenant_id` | `` |
| `version` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 3字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 7 个直连字段

### 引用字段 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `controlscope` | `controlscope` | b382fbab-2ecb-4733-bdb3-a6d3b81bf726 | 管控范围 |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `version` | `version` | 116e95cc-9b54-415d-82e4-dece7ffa2c27 | 版本 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `dr` | `dr` | Short | 逻辑删除标记 |

### 长整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | Long | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `pubts` | `pubts` | DateTime | 时间戳 |
