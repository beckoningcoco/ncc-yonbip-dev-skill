---
tags: [BIP, 元数据, 数据字典, um.logisticssetting.DistanceFreight]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 距离运费 (`um.logisticssetting.DistanceFreight`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`distancefreight` | domain：`umall` | 应用：`SDMA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 距离运费 |
| 物理表 | `distancefreight` |
| 数据库 schema | `umall` |
| 所属应用 | `SDMA` |
| 直连字段 | 7 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `dlytypeId` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 7 个直连字段

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dlytypeId` | `dlytypeId` | `dlytypeId` | 主表主键 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `distanceEnd` | `distanceEnd` | `distanceEnd` | 结束距离 |
| `distanceStart` | `distanceStart` | `distanceStart` | 起始距离 |
| `freight` | `freight` | `freight` | 运费 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
