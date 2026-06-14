---
tags: [BIP, 元数据, 数据字典, aa.merchant.MerchantApplyRangeGroup]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户适用范围组 (`aa.merchant.MerchantApplyRangeGroup`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`merchant_apply_range_group` | domain：`productcenter` | 应用：`DPMCUS` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户适用范围组 |
| 物理表 | `merchant_apply_range_group` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `DPMCUS` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `merchant_id` | `` |
| `ytenant_id` | `` |
| `org_group_id` | `` |
| `merchant_detail_id` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `org_group_type` | `org_group_type` | `orgGroupType` | 组织组类别(0:原始组; 1:使用者组) |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `merchant_detail_id` | `merchant_detail_id` | `merchantDetailId` | 客户适用范围组详情 |
| `merchant_id` | `merchant_id` | `merchantId` | 所属客户 |
| `org_group_id` | `org_group_id` | `orgGroupId` | 组织组 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `control_rule_version` | `control_rule_version` | `controlRuleVersion` | 管控规则版本号 |
