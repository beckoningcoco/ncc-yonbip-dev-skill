---
tags: [BIP, 元数据, 数据字典, marketing.price.BillDimensionMap]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 单据 (`marketing.price.BillDimensionMap`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`udh_price_billdimension_map` | domain：`marketingbill` | 应用：`B2Bpricing` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 单据 |
| 物理表 | `udh_price_billdimension_map` |
| domain/服务域 | `marketingbill` |
| 所属应用 | `B2Bpricing` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 0 个 |

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billfield` | `billfield` | `billField` | 维度类型 |
| `billnum` | `billnum` | `billNum` | 单据编码 |
| `dimensionfield` | `dimensionfield` | `dimensionField` | 字段名称 |
| `format` | `format` | `format` | 格式化编码 |
| `ytenant_id` | `ytenant_id` | `ytenant_id` | 租户ID |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bfixfield` | `bfixfield` | `isFixField` | 是否是固定维度字段 |
| `bmainfield` | `bmainfield` | `isMainField` | 是否是主表字段 |
| `breverseMap` | `breverseMap` | `isReverseMap` | 是否是赋值映射 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `version` | `version` | `version` | 版本号 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `tenant_id` | `tenant_id` | `tenant_id` | 租户ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
