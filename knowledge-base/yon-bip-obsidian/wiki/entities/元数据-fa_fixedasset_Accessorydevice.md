---
tags: [BIP, 元数据, 数据字典, fa.fixedasset.Accessorydevice]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 附属设备 (`fa.fixedasset.Accessorydevice`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`at_accessorydevice` | domain：`yonyoufi` | 应用：`FA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 附属设备 |
| 物理表 | `at_accessorydevice` |
| 数据库 schema | `yonyoufi` |
| 所属应用 | `FA` |
| 直连字段 | 15 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `fixedassetsinfo` | `` |
| `measuringunit` | `productcenter.pc_unitref` |
| `tenant_id` | `` |

## 继承接口 (1个, 1字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`

## 字段列表（按类型分组）

> 共 15 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `deivcecode` | `deivcecode` | `deivcecode` | 设备编码 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `measuringunit` | `measuringunit` | `measuringunit` | 计量单位 |
| `fixedassetsinfo` | `fixedassetsinfo` | `fixedassetsinfo` | 卡片主表关联标识 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `usedate` | `usedate` | `usedate` | 使用日期 |
| `changedate` | `changedate` | `changedate` | 变动日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amount` | `amount` | `amount` | 数量 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `value` | `value` | `value` | 价值 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### multiLanguage (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 设备名称 |
| `model` | `model` | `model` | 规格型号 |
| `usage` | `usage` | `usage` | 使用情况 |
| `comment` | `comment` | `comment` | 备注 |
| `changereason` | `changereason` | `changereason` | 变动原因 |
