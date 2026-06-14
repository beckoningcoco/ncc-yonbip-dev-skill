---
tags: [BIP, 元数据, 数据字典, st.stocktype.StockType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 库存类型档案 (`st.stocktype.StockType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`st_stocktype` | domain：`ustock` | 应用：`` | 业务对象ID：`0edf1ad0-a22a-4311-8d8d-cfe4374b1810`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 库存类型档案 |
| 物理表 | `st_stocktype` |
| domain/服务域 | `ustock` |
| schema | `ustock` |
| 所属应用 | `` |
| 直连字段 | 9 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `reservationType` | `` |

## 继承接口 (2个, 2字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **货权归属** (`st.inventoryowner.IOwnerType`)
  - `` → ``

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `code` | `code` | String | 库存类型编码 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `reservationType` | `reservationType` | 4c3758da-bf55-4619-a4c4-138e0382edde | 跟踪线索类型 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `isWithAvailableQtyCal` | `isWithAvailableQtyCal` | Boolean | 参与可用量计算 |

### 整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `ownertype` | Integer | 货权归属 |

### 长整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | Long | ID |

### multiLanguage (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `explanation` | `explanation` | String | 库存类型说明 |
| `name` | `name` | String | 库存类型名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `pubts` | `pubts` | DateTime | 时间戳 |
