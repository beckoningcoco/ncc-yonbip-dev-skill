---
tags: [BIP, 元数据, 数据字典, act.visitroute.VisitRouteInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 拜访路线明细表 (`act.visitroute.VisitRouteInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`dsfa_visit_route_info` | domain：`yycrm` | 应用：`ACT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 拜访路线明细表 |
| 物理表 | `dsfa_visit_route_info` |
| 数据库 schema | `yycrm` |
| 所属应用 | `ACT` |
| 直连字段 | 26 个 |
| 子表 | 1 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyDef` | `act.visitroute.VisitRouteInfoDef` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `visitRouteInfoDefineCharacter` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `visitrouteId` | `` |
| `terminal` | `yxybase.aa_storeterminal` |
| `tenant_id` | `` |
| `customer_id` | `yycrm.cust_customerref` |

## 继承接口 (3个, 10字段)

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
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 26 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `targetDivision` | `targetDivision` | `targetDivision` | 行政区域 |
| `targetName` | `targetName` | `targetName` | 名称 |
| `targetType` | `targetType` | `targetType` | 所属分类 |
| `targetLevel` | `targetLevel` | `targetLevel` | 所属等级 |
| `targetArea` | `targetArea` | `targetArea` | 所属区域 |
| `targetOwner` | `targetOwner` | `targetOwner` | 负责人 |
| `cRegionCode` | `cRegionCode` | `regionCode` | 行政区划 |
| `targetAddress` | `targetAddress` | `targetAddress` | 具体地址 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `visitrouteId` | `visitrouteId` | `visitrouteId` | 拜访路线id |
| `terminal` | `terminal` | `terminal` | 活动终端ID |
| `customer_id` | `customer_id` | `customer` | 活动客户ID |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iOrder` | `iOrder` | `iOrder` | 拜访顺序 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键ID |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `visitRouteInfoDefineCharacter` | `visitRouteInfoDefineCharacter` | `visitRouteInfoDefineCharacter` | 拜访路线详情自定义项特征属性组 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodyDef` | 拜访路线自定义项 |
