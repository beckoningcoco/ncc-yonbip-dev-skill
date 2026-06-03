---
tags: [BIP, 元数据, 数据字典, znbzbx.deferexpensedetail.DeferexpensedetailIBpmCurrentAuditor]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 待摊费用单审批当前审批人 (`znbzbx.deferexpensedetail.DeferexpensedetailIBpmCurrentAuditor`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_deferexpensedetail_ibpmcurrentauditor` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 待摊费用单审批当前审批人 |
| 物理表 | `znbz_deferexpensedetail_ibpmcurrentauditor` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `pk_deferexpensedetail` | `` |
| `ytenant_id` | `` |
| `stepcode` | `` |
| `auditor` | `` |
| `tenant_id` | `` |

## 继承接口 (4个, 7字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **当前审批人** (`ucfbase.ucfbaseItf.IBpmCurrentAuditor`)
  - `auditor` → `auditor`
  - `auditor_lastmodify` → `auditor_lastmodify`
  - `stepcode` → `stepcode`
  - `taskid` → `taskid`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `taskid` | `taskid` | `taskId` | 任务ID |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_deferexpensedetail` | `pk_deferexpensedetail` | `pk_deferexpensedetail` | 待摊费用单主表id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `stepcode` | `stepcode` | `stepcode` | 业务阶段编码 |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auditor_lastmodify` | `auditor_lastmodify` | `auditorLastModify` | 审批人最后修改时间 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
