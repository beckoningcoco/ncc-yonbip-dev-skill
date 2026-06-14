---
tags: [BIP, 元数据, 数据字典, fa.fixedasset.DepreciationMethod]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 折旧方法 (`fa.fixedasset.DepreciationMethod`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`at_depreciation_method` | domain：`yonyoufi` | 应用：`FA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 折旧方法 |
| 物理表 | `at_depreciation_method` |
| domain/服务域 | `yonyoufi` |
| schema | `figl` |
| 所属应用 | `FA` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 1 个 |

## 关联引用 (1个)

| 字段名 | 引用类型 |
|--------|---------|
| `tenant_id` | `` |

## 继承接口 (1个, 1字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `depreciationMethodPath` | `depreciationMethodPath` | `depreciationMethodPath` | 折旧方法类全路径 |
| `updatemonthdeprate` | `updatemonthdeprate` | `updatemonthdeprate` | 修改月折旧率公式 |
| `updatemonthdepreciation` | `updatemonthdepreciation` | `updatemonthdepreciation` | 修改月折旧额公式 |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isDepreciation` | `isDepreciation` | `isDepreciation` | 是否折旧 |
| `presetdate` | `presetdate` | `presetdate` | 是否为预置数据 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `sysid` | `sysid` | `sysid` | sysid |

### multiLanguage (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `description` | `description` | `description` | 备注 |
| `monthdeprate` | `monthdeprate` | `monthdeprate` | 月折旧率公式 |
| `monthdepreciation` | `monthdepreciation` | `monthdepreciation` | 月折旧额公式 |
| `name` | `name` | `name` | 名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
