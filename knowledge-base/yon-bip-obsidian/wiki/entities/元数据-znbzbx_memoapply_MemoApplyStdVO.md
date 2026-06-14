---
tags: [BIP, 元数据, 数据字典, znbzbx.memoapply.MemoApplyStdVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 事项申请单差旅标准 (`znbzbx.memoapply.MemoApplyStdVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_memoapply_stb` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 事项申请单差旅标准 |
| 物理表 | `znbz_memoapply_stb` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `pk_memoapply` | `` |
| `pk_stdaddr` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `vstandardid` | `vstandardid` | `vstandardid` | 补贴标准id |
| `vstdaddrname` | `vstdaddrname` | `vstdaddrname` | 补贴地点名称 |
| `vstddescription` | `vstddescription` | `vstddescription` | 补贴描述 |
| `vstdtypename` | `vstdtypename` | `vstdtypename` | 标准类型名称 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_memoapply` | `pk_memoapply` | `pk_memoapply` | 主表主键 |
| `pk_stdaddr` | `pk_stdaddr` | `pk_stdaddr` | 补贴地点 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nlineno` | `nlineno` | `nlineno` | 行号 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
