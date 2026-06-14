---
tags: [BIP, 元数据, 数据字典, fa.changebill.FixedAssetChangeType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 变动方式 (`fa.changebill.FixedAssetChangeType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`at_fixedassetchangetype` | domain：`yonyoufi` | 应用：`FA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 变动方式 |
| 物理表 | `at_fixedassetchangetype` |
| domain/服务域 | `yonyoufi` |
| schema | `figl` |
| 所属应用 | `FA` |
| 直连字段 | 12 个 |
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

> 共 12 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `afterchange` | `afterchange` | `afterchange` | 变动后对应字段 |
| `beforechange` | `beforechange` | `beforechange` | 变动前对应字段 |
| `code` | `code` | `code` | 变动方式编码 |
| `optionname` | `optionname` | `optionname` | 业务参数对应的name |
| `showcode` | `showcode` | `showcode` | 变动方式显示编码 |
| `showcolumns` | `showcolumns` | `showcolumns` | 变动类型对应的字段显示脚本 |

### 引用字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isvoucher` | `isvoucher` | `isvoucher` | 是否生成凭证 |
| `presetdate` | `presetdate` | `presetdate` | 是否为预置数据 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 变动方式名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
