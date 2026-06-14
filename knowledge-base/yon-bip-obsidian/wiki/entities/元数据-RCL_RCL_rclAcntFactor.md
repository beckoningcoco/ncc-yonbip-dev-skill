---
tags: [BIP, 元数据, 数据字典, RCL.RCL.rclAcntFactor]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收入影响因素 (`RCL.RCL.rclAcntFactor`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_acntfactor` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`51495890-56f8-4e5c-a04e-e6d0219beb5b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收入影响因素 |
| 物理表 | `rcl_acntfactor` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `doc_type_id` | `fiepub.epub_doctype_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

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

> 共 21 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 影响因素编码 |
| `doc_type_full_name` | `doc_type_full_name` | `docTypeFullName` | 档案类型参照全名称 |
| `doc_type_ref_code` | `doc_type_ref_code` | `docTypeRefCode` | 档案类型参照编码 |
| `enum_attr` | `enum_attr` | `enumAttr` | 枚举属性 |
| `filed_meta_url` | `filed_meta_url` | `filedMetaUrl` | 履约义务层级 |
| `filed_meta_url_name` | `filed_meta_url_name` | `filedMetaUrlName` | 履约义务字段 |
| `meta_id` | `meta_id` | `metaId` | 元数据 |
| `multi_filed_name` | `multi_filed_name` | `multiFiledName` | 多语字符串 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `doc_type_id` | `doc_type_id` | `docTypeId` | 档案类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
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
| `bln_system` | `bln_system` | `blnSystem` | 系统预置 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ct_attr` | `ct_attr` | `ctAttr` | 履约义务属性 |
| `data_type` | `data_type` | `dataType` | 数据类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 影响因素名称 |
