---
tags: [BIP, 元数据, 数据字典, ampub.entity.EntityVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 实体类型 (`ampub.entity.EntityVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_entity` | domain：`ucf-amc-ambd` | 应用：`AIM` | 业务对象ID：`33cb8ab0-77f8-4262-9f27-a172c9adcf8c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 实体类型 |
| 物理表 | `pam_entity` |
| 数据库 schema | `ucf-amc-ambd` |
| 所属应用 | `AIM` |
| 直连字段 | 13 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `tenantid` | `` |

## 继承接口 (3个, 3字段)

- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 13 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `controlType` | `controlType` | `controlType` | 控制类型 |
| `data_name` | `data_name` | `data_name` | 数据类型名称 |
| `data_type` | `data_type` | `data_type` | 数据类型 |
| `entity_code` | `entity_code` | `entity_code` | 类型编码 |
| `entity_name_resid` | `entity_name_resid` | `entity_name_resid` | 名称多语资源号 |
| `erp_code` | `erp_code` | `erp_code` | erp编码 |
| `id` | `id` | `id` | ID |
| `sysid` | `sysid` | `sysid` | 应用标识 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `entity_name` | `entity_name` | `entity_name` | 类型名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
