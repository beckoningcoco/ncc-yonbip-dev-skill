---
tags: [BIP, 元数据, 数据字典, pc.product.ProductDepositTimeDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料定金时间关联明细表 (`pc.product.ProductDepositTimeDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`productdeposittimedetail` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料定金时间关联明细表 |
| 物理表 | `productdeposittimedetail` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `productApplyRangeId` | `` |
| `productId` | `` |
| `ytenant_id` | `` |
| `productDetailId` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productId` | `productId` | `productId` | 物料 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `productApplyRangeId` | `productApplyRangeId` | `productApplyRangeId` | 物料分配范围 |
| `productDetailId` | `productDetailId` | `productDetailId` | 物料组织级表 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dEndDate` | `dEndDate` | `dEndDate` | 固定时间方式时收尾款结束日期 |
| `dStartDate` | `dStartDate` | `dStartDate` | 固定时间方式时收尾款开始日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isCreator` | `isCreator` | `isCreator` | 是否管理组织 |
| `iControlTime` | `iControlTime` | `iControlTime` | 线上付尾款规则:是否控制时间 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ControlTimeType` | `ControlTimeType` | `ControlTimeType` | 线上付尾款控制方式 |
| `RelativeDate` | `RelativeDate` | `RelativeDate` | 相对时间时几天后支付尾款 |
| `durationDate` | `durationDate` | `durationDate` | 相对时间时持续支付尾款的天数 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
