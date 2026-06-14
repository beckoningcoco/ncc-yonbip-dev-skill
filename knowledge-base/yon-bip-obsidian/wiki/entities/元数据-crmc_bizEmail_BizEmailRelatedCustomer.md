---
tags: [BIP, 元数据, 数据字典, crmc.bizEmail.BizEmailRelatedCustomer]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 业务邮件关联客户 (`crmc.bizEmail.BizEmailRelatedCustomer`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`crmc_biz_email_related_customer` | domain：`yycrm` | 应用：`ACT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务邮件关联客户 |
| 物理表 | `crmc_biz_email_related_customer` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `ACT` |
| 直连字段 | 8 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `org` | `` |
| `ytenant_id` | `` |
| `customer_id` | `` |
| `email_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 8 个直连字段

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `email_id` | `email_id` | `bizEmail` | 业务邮件id |
| `customer_id` | `customer_id` | `customerId` | 客户Id |
| `org` | `org` | `org` | 销售组织id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `has_followuprecord` | `has_followuprecord` | `hasFollowuprecord` | 是否生成跟进记录 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `followuprecord_id` | `followuprecord_id` | `followuprecordId` | 跟进记录id |
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
