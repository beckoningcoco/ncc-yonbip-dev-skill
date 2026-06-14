---
tags: [BIP, 元数据, 数据字典, marketing.cpq.OptionalQuotationRuleProduct]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 配置报价规则适用物料 (`marketing.cpq.OptionalQuotationRuleProduct`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`optionalquotationruleproduct` | domain：`marketingbill` | 应用：`CPQ` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 配置报价规则适用物料 |
| 物理表 | `optionalquotationruleproduct` |
| domain/服务域 | `marketingbill` |
| 所属应用 | `CPQ` |
| 直连字段 | 8 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `optionalQuotationRuleId` | `` |
| `productId` | `` |
| `ytenant_id` | `` |
| `productDefineCharacter` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 8 个直连字段

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `optionalQuotationRuleId` | `optionalQuotationRuleId` | `optionalQuotationRuleId` | 配置报价规则ID |
| `productId` | `productId` | `productId` | 商家id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isDefault` | `isDefault` | `default` | 是否默认创建 |
| `iStatus` | `iStatus` | `status` | 状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productDefineCharacter` | `productDefineCharacter` | `productDefineCharacter` | 物料自由项特征组 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
