---
tags: [BIP, 元数据, 数据字典, usp.plantransportroute.PlanTransportRoute]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计划运输路线 (`usp.plantransportroute.PlanTransportRoute`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`usp_plantransportroute` | domain：`uscmpub` | 应用：`SCCS` | 业务对象ID：`b678acf1-6b29-44d2-9d4a-bbf563c66e7b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划运输路线 |
| 物理表 | `usp_plantransportroute` |
| 数据库 schema | `uscmpub` |
| 所属应用 | `SCCS` |
| 直连字段 | 28 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `childs` | `usp.plantransportroute.PlanTransportRouteDetail` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `defaultCarrier` | `yonbip-mm-ilsbd.les_carrier_ref` |
| `` | `` |
| `sendTransWay` | `productcenter.aa_sendtranswayref` |
| `tenant_id` | `` |

## 继承接口 (5个, 13字段)

- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 28 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `code` | `code` | 计划路线编码 |
| `startPoint` | `startPoint` | `startPoint` | 起点 |
| `endPoint` | `endPoint` | `endPoint` | 终点 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `sendTransWay` | `sendTransWay` | `sendTransWay` | 发运方式ID |
| `defaultCarrier` | `defaultCarrier` | `defaultCarrier` | 默认承运商ID |
| `` | `creatorId` | `creatorId` | 创建人id |
| `` | `modifierId` | `modifierId` | 修改人id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `specifyCarrier` | `specifyCarrier` | `specifyCarrier` | 是否指定承运商 |
| `isConsiderPlan` | `isConsiderPlan` | `isConsiderPlan` | 是否考虑运输计划 |
| `isSegmentedTransport` | `isSegmentedTransport` | `isSegmentedTransport` | 是否有分段运输 |
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主表id |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `routeDistance` | `routeDistance` | `routeDistance` | 整条路线总距离(公里) |
| `routeDuration` | `routeDuration` | `routeDuration` | 整条路线在途时长(天) |
| `planLeadTime` | `planLeadTime` | `planLeadTime` | 运输计划提前期(天) |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 计划路线名称 |
| `memo` | `memo` | `memo` | 备注 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `childs` | 计划运输路线子表 |
