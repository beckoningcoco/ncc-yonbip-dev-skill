---
tags: [BIP, 元数据, 数据字典, cust.customeraddapply.MerchantApplyRange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户适用范围 (`cust.customeraddapply.MerchantApplyRange`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_customeraddapply_merchant_applyrange` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户适用范围 |
| 物理表 | `cust_customeraddapply_merchant_applyrange` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `CUST` |
| 直连字段 | 17 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `merchantId` | `` |
| `ytenant_id` | `` |
| `orgId` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 17 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nofollowtime` | `nofollowtime` | `noFollowTime` | 未跟进时间 |
| `positivepeople` | `positivepeople` | `positivePeople` | 转正人 |
| `sourceDataId` | `sourceDataId` | `sourceDataId` | 客户档案子表数据ID |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `merchantId` | `merchantId` | `merchantId` | 所属客户 |
| `orgId` | `orgId` | `orgId` | 组织ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isApplied` | `isApplied` | `isApplied` | 是否被分配者使用 |
| `isCreator` | `isCreator` | `isCreator` | 是否创建者 |
| `ispotential` | `ispotential` | `isPotential` | 是否潜客 |
| `isSalesOrg` | `isSalesOrg` | `isSalesOrg` | 是否销售组织 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iRangeType` | `iRangeType` | `rangeType` | 适用范围类型 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `ishopId` | `ishopId` | `shop` | 商家ID |
| `ishopId` | `ishopId` | `shopId` | 商家ID |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `positivetime` | `positivetime` | `positiveTime` | 转正时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `recentlyfollowtime` | `recentlyfollowtime` | `recentlyFollowTime` | 最近跟进时间 |
