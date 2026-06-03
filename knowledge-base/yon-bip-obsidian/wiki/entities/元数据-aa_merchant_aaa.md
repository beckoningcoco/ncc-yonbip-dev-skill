---
tags: [BIP, 元数据, 数据字典, aa.merchant.aaa]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 扩展 (`aa.merchant.aaa`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`iuap_extend_i92076_aaa` | domain：`productcenter` | 应用：`DPMCUS` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 扩展 |
| 物理表 | `iuap_extend_i92076_aaa` |
| 数据库 schema | `productcenter` |
| 所属应用 | `DPMCUS` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `foreign_key_bigint` | `` |
| `` | `` |
| `ytenant_id` | `` |
| `bigint_1` | `productcenter.aa_invoicemerchantref` |

## 继承接口 (4个, 8字段)

- **逻辑删除接口** (`common.base.LogicDelete`)
  - `dr` → `dr`
- **模版接口** (`common.base.Template`)
  - `pk_temp` → `pk_temp`
  - `version` → `version`
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `pk_temp` | `pk_temp` | `pk_temp` | 模版 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bigint_1` | `bigint_1` | `extend1` | 客户档案 |
| `` | `creator` | `creator` | 创建人 |
| `foreign_key_bigint` | `foreign_key_bigint` | `foreignerKey` | 外键 |
| `` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `version` | `version` | `version` | 版本 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
