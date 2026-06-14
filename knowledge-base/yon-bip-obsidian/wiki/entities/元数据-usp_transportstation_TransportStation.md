---
tags: [BIP, 元数据, 数据字典, usp.transportstation.TransportStation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 运输中转站 (`usp.transportstation.TransportStation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`usp_transportstation` | domain：`uscmpub` | 应用：`SCCS` | 业务对象ID：`1f4f30e4-f4dd-459c-9bf2-b72eefc5ef84`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 运输中转站 |
| 物理表 | `usp_transportstation` |
| domain/服务域 | `uscmpub` |
| schema | `usp_plantransportroute` |
| 所属应用 | `SCCS` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `tenant_id` | `` |
| `transport_area_id` | `` |

## 继承接口 (4个, 12字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 中转站编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `linkman` | `linkman` | `linkman` | 联系人 |
| `phone` | `phone` | `phone` | 联系电话 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 新租户id |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `transport_area_id` | `transport_area_id` | `transportAreaId` | 所属运输区域 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `partial_delivery` | `partial_delivery` | `partialDelivery` | 可分批二次交货 |
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `goods_stay_hours` | `goods_stay_hours` | `goodsStayHours` | 货物停留时长（天） |
| `latitude` | `latitude` | `latitude` | 纬度 |
| `longitude` | `longitude` | `longitude` | 经度 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `station_name` | `station_name` | `stationName` | 中转站名称 |
| `station_address` | `station_address` | `stationAddress` | 中转站地址 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `station_type` | `station_type` | `stationType` | 中转站类型 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
