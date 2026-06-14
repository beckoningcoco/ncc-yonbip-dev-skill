---
tags: [BIP, 元数据, 数据字典, crmc.display.DisplayCustomerScopeCondition]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 陈列规格客户范围条件设定 (`crmc.display.DisplayCustomerScopeCondition`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mka_display_customer_scope_condition` | domain：`yycrm` | 应用：`CRMC` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 陈列规格客户范围条件设定 |
| 物理表 | `mka_display_customer_scope_condition` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `CRMC` |
| 直连字段 | 13 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `display` | `` |
| `parentId` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 13 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `attrSource` | `attrSource` | `attrSource` | 属性来源 |
| `code` | `code` | `code` | 数据编码 |
| `c_condition` | `c_condition` | `condition` | 条件 |
| `conditionRelation` | `conditionRelation` | `conditionRelation` | 条件关系 |
| `parentCode` | `parentCode` | `parentCode` | 父级数据编码 |
| `c_type` | `c_type` | `type` | 条件类型 |
| `value1` | `value1` | `value1` | 条件值1 |
| `valueName` | `valueName` | `valueName` | 条件值name |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `display` | `display` | `display` | 陈列规格ID |
| `parentId` | `parentId` | `parentId` | 父节点ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
