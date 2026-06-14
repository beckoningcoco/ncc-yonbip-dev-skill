---
tags: [BIP, 元数据, 数据字典, cust.customeraddapply.CustomerAddApplyParticipant]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户申请参与人 (`cust.customeraddapply.CustomerAddApplyParticipant`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_relateperson` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户申请参与人 |
| 物理表 | `cust_relateperson` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `CUST` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `business_role` | `` |
| `partner_person` | `` |
| `ytenant_id` | `` |
| `person` | `` |
| `relate_object_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 10 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `joinKey` | `joinKey` | `joinKey` | 相关对象类型和相关对象ID |
| `relate_object_type` | `relate_object_type` | `relateObjectType` | 相关对象类型 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `business_role` | `business_role` | `businessRole` | 业务角色 |
| `partner_person` | `partner_person` | `partnerPerson` | 伙伴人员 |
| `person` | `person` | `person` | 人员 |
| `relate_object_id` | `relate_object_id` | `relateObject` | 客户申请ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `person_type` | `person_type` | `personType` | 人员类型 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
