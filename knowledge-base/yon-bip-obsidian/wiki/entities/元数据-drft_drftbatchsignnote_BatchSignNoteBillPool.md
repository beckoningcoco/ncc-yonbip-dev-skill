---
tags: [BIP, 元数据, 数据字典, drft.drftbatchsignnote.BatchSignNoteBillPool]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 票据池信息 (`drft.drftbatchsignnote.BatchSignNoteBillPool`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`drft_batchsignnote_billpool` | domain：`drft` | 应用：`DRFT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 票据池信息 |
| 物理表 | `drft_batchsignnote_billpool` |
| 数据库 schema | `drft` |
| 所属应用 | `DRFT` |
| 直连字段 | 7 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `bill_pool` | `` |
| `mainid` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 7 个直连字段

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_pool` | `bill_pool` | `billPool` | 票据池 |
| `mainid` | `mainid` | `mainid` | 票据签发id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `poolresiduerelease` | `poolresiduerelease` | `poolresiduerelease` | 票据池剩余可释放额度 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
