---
tags: [BIP, 元数据, 数据字典, cust.customeraddapply.CustomerArea]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 申请单销售区域 (`cust.customeraddapply.CustomerArea`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_customeraddapply_customer_area` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 申请单销售区域 |
| 物理表 | `cust_customeraddapply_customer_area` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CUST` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `imerchantid` | `` |
| `ytenant_id` | `` |
| `merchantapplyrangeid` | `` |
| `customer_area_character` | `` |
| `csaleareaid` | `productcenter.aa_salearearef` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 10 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceDataId` | `sourceDataId` | `sourceDataId` | 客户档案子表ID |
| `dataStatus` | `dataStatus` | `dataStatus` | 数据状态 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imerchantid` | `imerchantid` | `merchantId` | 手工码 |
| `merchantapplyrangeid` | `merchantapplyrangeid` | `merchantApplyRangeId` | 使用范围主键 |
| `csaleareaid` | `csaleareaid` | `saleAreaId` | 区域 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bdefaultcustomerarea` | `bdefaultcustomerarea` | `isDefault` | 是否默认 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 销售区域主键 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `customer_area_character` | `customer_area_character` | `customerAreaCharacter` | 客户销售区域信息自定义项 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
