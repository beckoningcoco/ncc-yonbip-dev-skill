---
tags: [BIP, 元数据, 数据字典, bd.accbooktype.BdModularEnabletimeVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 模块启用时间 (`bd.accbooktype.BdModularEnabletimeVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_modular_enabletime` | domain：`finbd` | 应用：`GL` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 模块启用时间 |
| 物理表 | `bd_modular_enabletime` |
| domain/服务域 | `finbd` |
| schema | `iuap_apdoc_finbd` |
| 所属应用 | `GL` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `modular` | `bd_modular_refer` |
| `accbooktype` | `` |
| `startperiodid` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 3字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 模块编码 |
| `name` | `name` | `name` | 模块名称 |
| `description` | `description` | `description` | 描述信息 |
| `startperiod` | `startperiod` | `startperiod` | 启用期间 |
| `enabletime` | `enabletime` | `enabletime` | 启用时间 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbooktype` | `accbooktype` | `accbooktype` | 业务账簿 |
| `modular` | `modular` | `modular` | 模块 |
| `startperiodid` | `startperiodid` | `startperiodid` | 启用期间id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enabled` | `enabled` | `enabled` | 启用状态 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 最新修改时间 |
