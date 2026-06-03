---
tags: [BIP, 元数据, 数据字典, aa.merchant.MerchantDetailForCRM]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户适用范围组详情(CRM) (`aa.merchant.MerchantDetailForCRM`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`merchant_detail_for_crm` | domain：`productcenter` | 应用：`DPMCUS` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户适用范围组详情(CRM) |
| 物理表 | `merchant_detail_for_crm` |
| 数据库 schema | `productcenter` |
| 所属应用 | `DPMCUS` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `apply_person` | `` |
| `recent_follower` | `` |
| `merchant_id` | `` |
| `ytenant_id` | `` |
| `belong_org_id` | `` |
| `merchant_apply_range_id` | `` |
| `merchant_apply_range_group_id` | `` |
| `merchant_detail_id` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `no_follow_time` | `no_follow_time` | `noFollowTime` | 未跟进时间 |
| `positive_people` | `positive_people` | `positivePeople` | 转正人 |
| `recent_follow_content` | `recent_follow_content` | `recentFollowContent` | 最近跟进内容 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `merchant_id` | `merchant_id` | `merchantId` | 客户 |
| `apply_person` | `apply_person` | `applyPerson` | 申领人 |
| `belong_org_id` | `belong_org_id` | `belongOrgId` | 所属组织 |
| `recent_follower` | `recent_follower` | `recentFollower` | 最近跟进人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |
| `merchant_apply_range_group_id` | `merchant_apply_range_group_id` | `merchantApplyRangeGroupId` | 客户适用范围组 |
| `merchant_apply_range_id` | `merchant_apply_range_id` | `merchantApplyRangeId` | 客户分配范围 |
| `merchant_detail_id` | `merchant_detail_id` | `merchantDetailId` | 客户适用范围组详情 |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `apply_status` | `apply_status` | `applyStatus` | 申领状态 |
| `is_potential` | `is_potential` | `isPotential` | 是否潜客 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clue_id` | `clue_id` | `clue` | 来源线索 |
| `high_seas_id` | `high_seas_id` | `highSeas` | 所属公海 |
| `source_of_the_high_seas_id` | `source_of_the_high_seas_id` | `sourceOfTheHighSeas` | 来源公海 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `apply_time` | `apply_time` | `applyTime` | 申领时间 |
| `positive_time` | `positive_time` | `positiveTime` | 转正时间 |
| `recently_follow_time` | `recently_follow_time` | `recentlyFollowTime` | 最近跟进时间 |
