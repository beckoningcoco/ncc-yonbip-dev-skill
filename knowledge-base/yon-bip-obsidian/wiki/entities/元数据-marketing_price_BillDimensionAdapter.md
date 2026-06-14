---
tags: [BIP, 元数据, 数据字典, marketing.price.BillDimensionAdapter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 单据 (`marketing.price.BillDimensionAdapter`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`udh_price_billdimension_adapter` | domain：`marketingbill` | 应用：`B2Bpricing` | 业务对象ID：`e83bd2f7-68e2-4ea8-9609-97cdba001c21`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 单据 |
| 物理表 | `udh_price_billdimension_adapter` |
| domain/服务域 | `marketingbill` |
| 所属应用 | `B2Bpricing` |
| 直连字段 | 10 个 |
| 子表 | 1 个 |
| 关联引用 | 1 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `dimensionMaps` | `marketing.price.BillDimensionMap` | composition |

## 关联引用 (1个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |

## 字段列表（按类型分组）

> 共 10 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `adapter` | `adapter` | `adapter` | 字段名称 |
| `billnum` | `billnum` | `billNum` | 维度类型 |
| `billname` | `billname` | `billname` | 维度类型名称 |
| `detailfield` | `detailfield` | `detailField` | 取价的具体字段名称 |
| `key_filed_name` | `key_filed_name` | `keyFiledName` | 字段名称 |
| `save_key` | `save_key` | `saveKey` | 保存定价过程所指定字段类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `version` | `version` | `version` | 版本号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `dimensionMaps` | 单据 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
