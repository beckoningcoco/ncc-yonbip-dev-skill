---
tags: [BIP, 元数据, 数据字典, aa.merchant.MerchantApplyRange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户适用范围 (`aa.merchant.MerchantApplyRange`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`merchantapplyrange` | domain：`productcenter` | 应用：`DPMCUS` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户适用范围 |
| 物理表 | `merchantapplyrange` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `DPMCUS` |
| 直连字段 | 28 个 |
| 子表 | 5 个 |
| 关联引用 | 12 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `invoicingCustomerss` | `aa.merchant.InvoicingCustomers` | composition |
| `merchantDetailForCrm` | `aa.merchant.MerchantDetailForCRM` | composition |
| `merchantAppliedDetail` | `aa.merchant.MerchantApplyRangeDetail` | composition |
| `principals` | `aa.merchant.Principal` | composition |
| `customerAreas` | `aa.merchant.CustomerArea` | composition |

## 关联引用 (12个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `merchantId` | `` |
| `ytenant_id` | `` |
| `merchant_detail_id` | `` |
| `ishopId` | `` |
| `allocator_id` | `` |
| `orgId` | `productcenter.aa_adminorgrangeref` |
| `tenant_id` | `` |

## 继承接口 (3个, 3字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **商家相关** (`base.itf.IShop`)
  - `iShopID` → `iShopID`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 28 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allocator_name` | `allocator_name` | `allocatorName` | 分配人 |
| `allocate_source` | `allocate_source` | `allocateSource` | 来源 |
| `nofollowtime` | `nofollowtime` | `noFollowTime` | 未跟进时间 |
| `positivepeople` | `positivepeople` | `positivePeople` | 转正人 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `merchantId` | `merchantId` | `merchantId` | 客户 |
| `merchant_detail_id` | `merchant_detail_id` | `merchantDetailId` | 客户业务信息 |
| `orgId` | `orgId` | `orgId` | 组织 |
| `allocator_id` | `allocator_id` | `allocatorId` | 分配人 |
| `ishopId` | `ishopId` | `shopId` | 商家 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isCreator` | `isCreator` | `isCreator` | 是否为创建者 |
| `isApplied` | `isApplied` | `isApplied` | 是否被使用组织使用 |
| `isSalesOrg` | `isSalesOrg` | `isSalesOrg` | 是否销售组织 |
| `ispotential` | `ispotential` | `isPotential` | 是否潜客 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iRangeType` | `iRangeType` | `rangeType` | 客户分配范围类型 |
| `control_rule_version` | `control_rule_version` | `controlRuleVersion` | 管控规则版本号 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `iShopID` | `iShopID` | `shop` | 商家(废弃) |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allocate_time` | `allocate_time` | `allocateTime` | 分配时间 |
| `recentlyfollowtime` | `recentlyfollowtime` | `recentlyFollowTime` | 最近跟进时间 |
| `positivetime` | `positivetime` | `positiveTime` | 转正时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `customerAreas` | 销售区域 |
| `` | `` | `invoicingCustomerss` | 开票客户 |
| `` | `` | `merchantAppliedDetail` | (停用)客户适用范围详情 |
| `` | `` | `merchantDetailForCrm` | 客户适用范围组详情(CRM) |
| `` | `` | `principals` | 负责人 |
