---
tags: [BIP, 元数据, 数据字典, sact.contract.IBpmStep]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 当前业务阶段 (`sact.contract.IBpmStep`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sact_ibpmstep` | domain：`sact` | 应用：`SACT` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 当前业务阶段 |
| 物理表 | `sact_ibpmstep` |
| 数据库 schema | `sact` |
| 所属应用 | `SACT` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `stepid` | `transtype.bd_businessstep_ref` |
| `sact_vid` | `` |

## 继承接口 (2个, 7字段)

- **业务阶段** (`ucfbase.ucfbaseItf.IBpmStep`)
  - `flag` → `flag`
  - `processinstid` → `processinstid`
  - `stepid` → `stepid`
  - `stepcode_lastmodify` → `stepcode_lastmodify`
  - `stepparam` → `stepparam`
  - `taskid` → `taskid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 10 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `flag` | `flag` | `flag` | 状态标志位 |
| `processinstid` | `processinstid` | `processinstId` | 流程实例 |
| `stepparam` | `stepparam` | `stepparam` | 业务阶段参数 |
| `taskid` | `taskid` | `taskId` | 任务ID |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sact_vid` | `sact_vid` | `sactVId` | 合同版本 |
| `stepid` | `stepid` | `stepId` | 业务阶段ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stepcode_lastmodify` | `stepcode_lastmodify` | `stepLastModify` | 业务阶段编码最后修改时间 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
