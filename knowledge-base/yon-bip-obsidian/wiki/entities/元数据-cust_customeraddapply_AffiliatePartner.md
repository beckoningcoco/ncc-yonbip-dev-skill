---
tags: [BIP, 元数据, 数据字典, cust.customeraddapply.AffiliatePartner]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 归属伙伴 (`cust.customeraddapply.AffiliatePartner`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_customeraddapply_affiliate_partner` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 归属伙伴 |
| 物理表 | `cust_customeraddapply_affiliate_partner` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CUST` |
| 直连字段 | 6 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `merchant_id` | `` |
| `ytenant_id` | `` |
| `merchantapplyrangeid` | `` |
| `iCustID` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 6 个直连字段

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCustID` | `iCustID` | `cust` | 伙伴 |
| `merchantapplyrangeid` | `merchantapplyrangeid` | `merchantApplyRangeId` | 客户分配范围ID |
| `merchant_id` | `merchant_id` | `merchantId` | 客户ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
