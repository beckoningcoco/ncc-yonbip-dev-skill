---
tags: [BIP, 元数据, 数据字典, cust.customeraddapply.MerchantCharacterEntity]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户基本信息特征实体 (`cust.customeraddapply.MerchantCharacterEntity`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_customeraddapply_merchantCharacterEntity` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户基本信息特征实体 |
| 物理表 | `cust_customeraddapply_merchantCharacterEntity` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CUST` |
| 直连字段 | 4 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `id` | `` |
| `merchant_character` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 4 个直连字段

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 所属客户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `merchant_character` | `merchant_character` | `merchantCharacter` | 基本信息自定义项 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
