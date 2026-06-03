---
tags: [BIP, 元数据, 数据字典, fa.fixedasset.ChangeBillRecords]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 变动单记录 (`fa.fixedasset.ChangeBillRecords`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`at_changebillrecords` | domain：`yonyoufi` | 应用：`FA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 变动单记录 |
| 物理表 | `at_changebillrecords` |
| 数据库 schema | `yonyoufi` |
| 所属应用 | `FA` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `fixedassetsinfo` | `` |
| `calculateinfo` | `` |
| `changetype` | `at_fixedassetchangetypelistref` |
| `tenant_id` | `` |

## 继承接口 (1个, 1字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `changebillno` | `changebillno` | `changebillno` | 变动单号 |
| `befchange` | `befchange` | `befchange` | 变动前内容 |
| `aftchange` | `aftchange` | `aftchange` | 变动后内容 |
| `changereason` | `changereason` | `changereason` | 变动原因 |
| `reffullname` | `reffullname` | `reffullname` | 变动参照实体 |
| `refdomain` | `refdomain` | `refdomain` | 变动参照域 |
| `changetypecode` | `changetypecode` | `changetypecode` | 变动类型code |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `calculateinfo` | `calculateinfo` | `calculateinfo` | 核算信息 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `changetype` | `changetype` | `changetype` | 变动类型 |
| `fixedassetsinfo` | `fixedassetsinfo` | `fixedassetsinfo` | 固定资产主表 |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `changedate` | `changedate` | `changedate` | 变动日期 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
