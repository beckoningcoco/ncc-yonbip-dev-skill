---
tags: [BIP, 元数据, 数据字典, cust.customeraddapply.MerchantsManager]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 管理员 (`cust.customeraddapply.MerchantsManager`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_customeraddapply_manager` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 管理员 |
| 物理表 | `cust_customeraddapply_manager` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CUST` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `imerchantId` | `` |
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCountryCode` | `cCountryCode` | `countryCode` | 手机号国际区号 |
| `dataStatus` | `dataStatus` | `dataStatus` | 数据状态 |
| `cEmail` | `cEmail` | `email` | 邮箱 |
| `cFullName` | `cFullName` | `fullName` | 姓名 |
| `cMobile` | `cMobile` | `mobile` | 手机 |
| `cQQ` | `cQQ` | `qq` | QQ |
| `sourceDataId` | `sourceDataId` | `sourceDataId` | 客户档案子表数据ID |
| `cUserName` | `cUserName` | `userName` | 账号 |
| `cyhtUserId` | `cyhtUserId` | `yhtUserId` | 友互通用户标识 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imerchantId` | `imerchantId` | `merchantId` | 所属客户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dexpireDate` | `dexpireDate` | `expireDate` | 失效日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
