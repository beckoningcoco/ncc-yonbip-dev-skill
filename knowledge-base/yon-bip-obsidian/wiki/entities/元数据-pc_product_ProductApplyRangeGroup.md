---
tags: [BIP, 元数据, 数据字典, pc.product.ProductApplyRangeGroup]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料适用范围组 (`pc.product.ProductApplyRangeGroup`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`product_apply_range_group` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料适用范围组 |
| 物理表 | `product_apply_range_group` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `product_id` | `` |
| `ytenant_id` | `` |
| `org_group_id` | `` |
| `product_detail_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `org_group_type` | `org_group_type` | `orgGroupType` | 组织组类别 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `product_id` | `product_id` | `productId` | 物料 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `org_group_id` | `org_group_id` | `orgGroupId` | 组织组 |
| `product_detail_id` | `product_detail_id` | `productDetailId` | 物料组织级表 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `control_rule_version` | `control_rule_version` | `controlRuleVersion` | 管控规则版本号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
