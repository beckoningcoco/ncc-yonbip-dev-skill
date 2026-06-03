---
tags: [BIP, 元数据, 数据字典, usp.plantransportroute.PlanTransportRouteDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计划运输路线子表 (`usp.plantransportroute.PlanTransportRouteDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`usp_plantransportroutedetail` | domain：`uscmpub` | 应用：`SCCS` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划运输路线子表 |
| 物理表 | `usp_plantransportroutedetail` |
| 数据库 schema | `uscmpub` |
| 所属应用 | `SCCS` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `endPoint` | `usp_transportstationref` |
| `ytenant_id` | `` |
| `defaultCarrier` | `yonbip-mm-ilsbd.les_carrier_ref` |
| `startPoint` | `usp_transportstationref` |
| `sendTransWay` | `productcenter.aa_sendtranswayref` |
| `mainId` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `mainId` | `mainId` | `mainId` | mainId |
| `startPoint` | `startPoint` | `startPoint` | 起始地ID |
| `endPoint` | `endPoint` | `endPoint` | 目的地ID |
| `sendTransWay` | `sendTransWay` | `sendTransWay` | 发运方式ID |
| `defaultCarrier` | `defaultCarrier` | `defaultCarrier` | 默认承运商ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `specifyCarrier` | `specifyCarrier` | `specifyCarrier` | 是否指定承运商 |
| `isConsiderPlan` | `isConsiderPlan` | `isConsiderPlan` | 是否考虑运输计划 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `segmentNum` | `segmentNum` | `segmentNum` | 分段行程编号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 表体id |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `routeDistance` | `routeDistance` | `routeDistance` | 分段距离(公里) |
| `routeDuration` | `routeDuration` | `routeDuration` | 分段在途时间(天) |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
