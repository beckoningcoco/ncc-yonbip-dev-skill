---
tags: [BIP, 元数据, 数据字典, znbzbx.commonexpensebill.CommonExpenseBillWhTaxVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 报销单代扣税 (`znbzbx.commonexpensebill.CommonExpenseBillWhTaxVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_expensebill_cwhtax` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 报销单代扣税 |
| 物理表 | `znbz_expensebill_cwhtax` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `pk_expensebill` | `` |
| `whtax_id` | `` |
| `ytenant_id` | `` |
| `creator_id` | `` |
| `modifier_id` | `` |
| `whtax_type_id` | `` |
| `whtax_subject_id` | `` |
| `tenant_id` | `` |

## 字段列表（按类型分组）

> 共 20 个直连字段

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_expensebill` | `pk_expensebill` | `pk_expensebill` | 通用报销单主表id |
| `whtax_id` | `whtax_id` | `whtax_id` | 代扣税税码 |
| `whtax_type_id` | `whtax_type_id` | `whtax_type_id` | 代扣税类型 |
| `whtax_subject_id` | `whtax_subject_id` | `whtax_subject_id` | 代扣税税目 |
| `creator_id` | `creator_id` | `creator_id` | 创建人ID |
| `modifier_id` | `modifier_id` | `modifier_id` | 修改人ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `wht_parentid` | `wht_parentid` | `wht_parentid` | 与代扣税孙表关联的报销明细表字段 |
| `id` | `id` | `id` | 主键 |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `row_no` | `row_no` | `row_no` | 行号 |
| `whtax_rate` | `whtax_rate` | `whtax_rate` | 税率 |
| `nwhtax_base_amount` | `nwhtax_base_amount` | `nwhtax_base_amount` | 税基 |
| `nnatwhtax_base_amount` | `nnatwhtax_base_amount` | `nnatwhtax_base_amount` | 本币税基 |
| `nwhtax_amount` | `nwhtax_amount` | `nwhtax_amount` | 代扣税税额 |
| `nnatwhtax_amount` | `nnatwhtax_amount` | `nnatwhtax_amount` | 代扣税税额-本币 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `create_time` | 创建时间 |
| `modify_time` | `modify_time` | `modify_time` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
