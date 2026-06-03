---
tags: [BIP, 元数据, 数据字典, pc.cls.PurchaseClassApplyRangeGroup]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 采购品类适用范围组 (`pc.cls.PurchaseClassApplyRangeGroup`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`purchase_class_apply_range_group` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：`6ef63f6b-634e-479f-aef8-f2d7c7ec14ca`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购品类适用范围组 |
| 物理表 | `purchase_class_apply_range_group` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 6 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `cls_id` | `` |
| `ytenant_id` | `` |
| `org_group_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 6 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `org_group_type` | `org_group_type` | `orgGroupType` | 组织组类别 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_group_id` | `org_group_id` | `orgGroupId` | 组织组 |
| `cls_id` | `cls_id` | `clsId` | 采购品类 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
