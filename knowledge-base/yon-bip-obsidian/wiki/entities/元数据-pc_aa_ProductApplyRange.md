---
tags: [BIP, 元数据, 数据字典, pc.aa.ProductApplyRange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# (停用)物料适用范围 (`pc.aa.ProductApplyRange`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`productApplyRange` | domain：`productcenter` | 应用：`pc` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | (停用)物料适用范围 |
| 物理表 | `productApplyRange` |
| 数据库 schema | `productcenter` |
| 所属应用 | `pc` |
| 直连字段 | 11 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `productId` | `` |
| `ytenant_id` | `` |
| `customerId` | `` |
| `orgId` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 11 个直连字段

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `customerId` | `customerId` | `customerId` | 客户ID |
| `orgId` | `orgId` | `orgId` | 组织ID |
| `productId` | `productId` | `productId` | 物料ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isApplied` | `isApplied` | `isApplied` | 是否被分配者使用 |
| `isCreator` | `isCreator` | `isCreator` | 是否创建者 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iRangeType` | `iRangeType` | `rangeType` | 物料适用范围类型 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `shopId` | `shopId` | `shopId` | 商家ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
