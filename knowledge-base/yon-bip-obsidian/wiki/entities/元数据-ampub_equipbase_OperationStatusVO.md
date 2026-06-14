---
tags: [BIP, 元数据, 数据字典, ampub.equipbase.OperationStatusVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资产运行状态 (`ampub.equipbase.OperationStatusVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_operation_status` | domain：`ucf-amc-ambd` | 应用：`AMBD` | 业务对象ID：`ee7ce1b2-88c7-4d6c-a778-a47a1c1f7008`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资产运行状态 |
| 物理表 | `pam_operation_status` |
| domain/服务域 | `ucf-amc-ambd` |
| schema | `amc_ambd` |
| 所属应用 | `AMBD` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `user_defines` | `` |
| `ytenant_id` | `` |
| `pk_sealer` | `` |
| `modifier` | `` |
| `tenantid` | `` |

## 继承接口 (5个, 10字段)

- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **审计信息** (`baseapp.itf.IAuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **停启用状态** (`baseapp.itf.IEnableState`)
  - `enablestate` → `enablestate`
  - `pk_sealer` → `pk_sealer`
  - `seal_time` → `seal_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `memo` | `memo` | `memo` | 备注 |
| `id` | `id` | `id` | 主键 |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `name_resid` | `name_resid` | `name_resid` | 名称多语资源号 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 最后修改人 |
| `pk_sealer` | `pk_sealer` | `pk_sealer` | 启用人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenantid` | `tenantid` | `tenant` | 租户 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pre_flag` | `pre_flag` | `pre_flag` | 预置标记 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `operation_status_type` | `operation_status_type` | `operation_status_type` | 运行状态类别 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enablestate` | `enablestate` | `enablestate` | 启用状态 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 最后修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `seal_time` | `seal_time` | `seal_time` | 启用时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_defines` | `user_defines` | `userDefines` | 自定义项特征组 |
