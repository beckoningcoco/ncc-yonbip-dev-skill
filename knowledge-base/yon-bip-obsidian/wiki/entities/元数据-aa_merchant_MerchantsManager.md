---
tags: [BIP, 元数据, 数据字典, aa.merchant.MerchantsManager]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户管理员 (`aa.merchant.MerchantsManager`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`merchantsmanager` | domain：`productcenter` | 应用：`DPMCUS` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户管理员 |
| 物理表 | `merchantsmanager` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `DPMCUS` |
| 直连字段 | 13 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `imerchantId` | `` |
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 13 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCountryCode` | `cCountryCode` | `countryCode` | 手机号国际区号 |
| `cMobile` | `cMobile` | `mobile` | 手机 |
| `cFullName` | `cFullName` | `fullName` | 姓名 |
| `cEmail` | `cEmail` | `email` | 邮箱 |
| `cyhtUserId` | `cyhtUserId` | `yhtUserId` | 友户通用户标识 |
| `cQQ` | `cQQ` | `qq` | QQ(废弃) |
| `cUserName` | `cUserName` | `userName` | 账号(废弃) |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imerchantId` | `imerchantId` | `merchantId` | 所属客户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `dexpireDate` | `dexpireDate` | `expireDate` | 失效日期(废弃) |
