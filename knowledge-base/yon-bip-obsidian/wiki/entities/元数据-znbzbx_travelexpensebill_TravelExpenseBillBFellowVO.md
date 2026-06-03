---
tags: [BIP, 元数据, 数据字典, znbzbx.travelexpensebill.TravelExpenseBillBFellowVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 差旅费报销单明细同行人参照表 (`znbzbx.travelexpensebill.TravelExpenseBillBFellowVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbzbx_expensebill_b_fellow` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 差旅费报销单明细同行人参照表 |
| 物理表 | `znbzbx_expensebill_b_fellow` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 7 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `fellowjoblistids` | `ucf-staff-center.bd_staff_ref` |
| `fellowid` | `ucf-staff-center.bd_staff_ref` |
| `pk_expensebillb` | `` |
| `tenant_id` | `` |

## 字段列表（按类型分组）

> 共 7 个直连字段

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fellowid` | `fellowid` | `fellowid` | 同行人员工 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `fellowjoblistids` | `fellowjoblistids` | `fellowjoblistids` | 同行人 |
| `pk_expensebillb` | `pk_expensebillb` | `pk_expensebillb` | 差旅费报销单明细子表主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
