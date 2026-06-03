---
tags: [BIP, 元数据, 数据字典, pc.product.ProductAssistUnitExchange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料辅计量换算对照 (`pc.product.ProductAssistUnitExchange`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`productassistunitexchange` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料辅计量换算对照 |
| 物理表 | `productassistunitexchange` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `assistUnitId` | `productcenter.pc_unitref_new` |
| `productId` | `` |
| `ytenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `assistVersValue` | `assistVersValue` | `assistVersValue` | 主辅计量换算比 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productId` | `productId` | `productId` | 物料 |
| `assistUnitId` | `assistUnitId` | `assistUnit` | 辅计量单位 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `balance` | `balance` | `balance` | 结存 |
| `iOrder` | `iOrder` | `iOrder` | 排序号 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainUnitRate` | `mainUnitRate` | `mainUnitRate` | 主辅计量换算率 |
| `mainUnitCount` | `mainUnitCount` | `mainUnitCountNew` | 主计量数量(新) |
| `fAssistUnitCount` | `fAssistUnitCount` | `assistUnitCount` | 辅单位数量 |
| `fMainUnitCount` | `fMainUnitCount` | `mainUnitCount` | 主单位数量 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `unitExchangeType` | `unitExchangeType` | `unitExchangeType` | 主辅计量换算类型 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
