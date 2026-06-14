---
tags: [BIP, 元数据, 数据字典, pc.cls.CostClassApplyRange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 成本分类适用范围 (`pc.cls.CostClassApplyRange`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`costclass_applyrange` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成本分类适用范围 |
| 物理表 | `costclass_applyrange` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `clsId` | `` |
| `ytenant_id` | `` |
| `orgId` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 10 个直连字段

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clsId` | `clsId` | `clsId` | 分类 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `orgId` | `orgId` | `orgId` | 组织 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isEnd` | `isEnd` | `isEnd` | 是否末级 |
| `isCreator` | `isCreator` | `isCreator` | 是否管理组织 |
| `isApplied` | `isApplied` | `isApplied` | 使用组织是否修改数据 |
| `isupgrade` | `isupgrade` | `isUpgrade` | 是否升级数据 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
