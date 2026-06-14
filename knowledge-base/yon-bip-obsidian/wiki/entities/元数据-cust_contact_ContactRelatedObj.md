---
tags: [BIP, 元数据, 数据字典, cust.contact.ContactRelatedObj]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 关联对象 (`cust.contact.ContactRelatedObj`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_contact_related_obj` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 关联对象 |
| 物理表 | `cust_contact_related_obj` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `CUST` |
| 直连字段 | 11 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `contactId` | `yycrm.cust_contactref` |
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 11 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dimention_info` | `dimention_info` | `dimentionInfo` | 维度信息 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `relatedType` | `relatedType` | `relatedType` | 相关对象类型 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `contactId` | `contactId` | `contactId` | 联系人ID |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_main` | `is_main` | `isMain` | 是否主联系人 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `secondId` | `secondId` | `secondId` | 商机阶段ID |
| `relatedId` | `relatedId` | `relatedId` | 相关对象ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
