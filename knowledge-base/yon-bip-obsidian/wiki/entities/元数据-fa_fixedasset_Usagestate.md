---
tags: [BIP, 元数据, 数据字典, fa.fixedasset.Usagestate]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产使用状态 (`fa.fixedasset.Usagestate`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`at_usagestate` | domain：`yonyoufi` | 应用：`FA` | 业务对象ID：`d4e227fb-0abb-4be2-9650-f508886730c8`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产使用状态 |
| 物理表 | `at_usagestate` |
| 数据库 schema | `yonyoufi` |
| 所属应用 | `FA` |
| 直连字段 | 9 个 |
| 子表 | 1 个 |
| 关联引用 | 3 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `headItem` | `fa.fixedasset.UsagestateCustomItem` | composition |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `equipusagestate` | `ucf-amc-ambd.ampub_status_ref` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `equipusagestate` | `equipusagestate` | `equipusagestate` | 对应实物资产状态id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `presetdate` | `presetdate` | `presetdate` | 是否为预置数据 |
| `isDepreciation` | `isDepreciation` | `isDepreciation` | 是否折旧 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `headItem` | 使用状况自定义项 |
