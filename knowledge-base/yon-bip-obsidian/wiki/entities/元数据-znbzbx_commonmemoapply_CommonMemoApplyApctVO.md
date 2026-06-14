---
tags: [BIP, 元数据, 数据字典, znbzbx.commonmemoapply.CommonMemoApplyApctVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 通用申请合同子表 (`znbzbx.commonmemoapply.CommonMemoApplyApctVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_memoapply_apct` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 通用申请合同子表 |
| 物理表 | `znbz_memoapply_apct` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 6 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `pk_memoapply` | `` |
| `pk_apct` | `apct.apct_apctref` |
| `tenant_id` | `` |

## 字段列表（按类型分组）

> 共 6 个直连字段

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_apct` | `pk_apct` | `pk_apct` | 合同 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `pk_memoapply` | `pk_memoapply` | `pk_memoapply` | 事项申请表头主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
