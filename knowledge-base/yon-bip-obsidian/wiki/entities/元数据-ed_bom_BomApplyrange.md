---
tags: [BIP, 元数据, 数据字典, ed.bom.BomApplyrange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# BOM适用范围 (`ed.bom.BomApplyrange`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ed_bom_applyrange` | domain：`engineeringdata` | 应用：`ED` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | BOM适用范围 |
| 物理表 | `ed_bom_applyrange` |
| domain/服务域 | `engineeringdata` |
| 所属应用 | `ED` |
| 直连字段 | 13 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `admin_org_id` | `` |
| `bom_id` | `` |
| `ytenant_id` | `` |
| `operator` | `` |
| `org_id` | `` |

## 继承接口 (2个, 2字段)

- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 13 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fail_reason` | `fail_reason` | `failReason` | 失败原因 |
| `operator_name` | `operator_name` | `operatorName` | 分配人名称 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `admin_org_id` | `admin_org_id` | `adminOrgId` | 管理组织 |
| `bom_id` | `bom_id` | `bomId` | 所属母件 |
| `operator` | `operator` | `operator` | 分配人 |
| `org_id` | `org_id` | `orgId` | 使用组织 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allocation_status` | `allocation_status` | `allocationStatus` | 分配状态 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allocation_bom_id` | `allocation_bom_id` | `allocationBomId` | 分配BomId |
| `id` | `id` | `id` | ID |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allocation_time` | `allocation_time` | `allocationTime` | 分配时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
