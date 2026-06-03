---
tags: [BIP, 元数据, 数据字典, sfa.highseas.RetakePerson]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收回提醒人员 (`sfa.highseas.RetakePerson`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_high_seas_retake_person` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收回提醒人员 |
| 物理表 | `sfa_high_seas_retake_person` |
| 数据库 schema | `yycrm` |
| 所属应用 | `SFA` |
| 直连字段 | 8 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `rule_id` | `` |
| `staff_id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 8 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `staff_name` | `staff_name` | `staffName` | 人员名称 |
| `user_id` | `user_id` | `userId` | 用户Id |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rule_id` | `rule_id` | `ruleId` | 规则ID |
| `staff_id` | `staff_id` | `staffId` | 人员 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rule_type` | `rule_type` | `ruleType` | 规则类型 0--收回规则|1--分配规则|2--客户收回规则|3--客户分配规则 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
