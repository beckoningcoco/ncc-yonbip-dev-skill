---
tags: [BIP, 元数据, 数据字典, pc.tpl.ProductTplAssistUnitExchange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料模板辅计量换算对照 (`pc.tpl.ProductTplAssistUnitExchange`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`producttpl_assist_unitexchange` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料模板辅计量换算对照 |
| 物理表 | `producttpl_assist_unitexchange` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 15 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `tpl_id` | `` |
| `assistUnitId` | `` |
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 3字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 15 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `assistVersValue` | `assistVersValue` | `assistVersValue` | 主辅计量换算比 |
| `erpCode` | `erpCode` | `erpCode` | 商家编码 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `assistUnitId` | `assistUnitId` | `assistUnit` | 辅计量单位 |
| `tpl_id` | `tpl_id` | `template` | 物料模板 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `balance` | `balance` | `balance` | 结存 |
| `iOrder` | `iOrder` | `iOrder` | 排序号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fAssistUnitCount` | `fAssistUnitCount` | `assistUnitCount` | 辅计量数量 |
| `fMainUnitCount` | `fMainUnitCount` | `mainUnitCount` | 主计量数量 |
| `mainUnitCount` | `mainUnitCount` | `mainUnitCountNew` | 主计量数量(新) |
| `mainUnitRate` | `mainUnitRate` | `mainUnitRate` | 主辅计量换算率 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `unitExchangeType` | `unitExchangeType` | `unitExchangeType` | 换算类型 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
