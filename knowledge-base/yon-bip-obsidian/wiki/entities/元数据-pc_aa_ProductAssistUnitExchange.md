---
tags: [BIP, 元数据, 数据字典, pc.aa.ProductAssistUnitExchange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# (停用)物料辅计量换算对照 (`pc.aa.ProductAssistUnitExchange`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`productAssistUnitExchange` | domain：`productcenter` | 应用：`pc` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | (停用)物料辅计量换算对照 |
| 物理表 | `productAssistUnitExchange` |
| 数据库 schema | `productcenter` |
| 所属应用 | `pc` |
| 直连字段 | 7 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `assistUnitId` | `` |
| `productId` | `` |
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 7 个直连字段

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `assistUnitId` | `assistUnitId` | `assistUnit` | 辅计量单位 |
| `productId` | `productId` | `productId` | 物料ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iOrder` | `iOrder` | `iOrder` | 排序 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fAssistUnitCount` | `fAssistUnitCount` | `assistUnitCount` | 辅计量数量 |
| `fMainUnitCount` | `fMainUnitCount` | `mainUnitCount` | 主计量数量 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `unitExchangeType` | `unitExchangeType` | `unitExchangeType` | 换算方式 |
