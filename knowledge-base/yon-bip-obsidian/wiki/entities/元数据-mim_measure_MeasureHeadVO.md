---
tags: [BIP, 元数据, 数据字典, mim.measure.MeasureHeadVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计量器具目录 (`mim.measure.MeasureHeadVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_measure` | domain：`ucf-amc-aum` | 应用：`MIM` | 业务对象ID：`a1038aa9-4b7a-493b-a136-6fa71bd9afb3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计量器具目录 |
| 物理表 | `pam_measure` |
| domain/服务域 | `ucf-amc-aum` |
| schema | `amc_aum` |
| 所属应用 | `MIM` |
| 直连字段 | 26 个 |
| 子表 | 1 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `mim.measure.MeasureHeadVODefine` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `` |
| `creator` | `iuap-apcom-bipuser.bip_user_ref` |
| `user_defines` | `` |
| `ytenant_id` | `` |
| `pk_sealer` | `` |
| `modifier` | `` |
| `tenantid` | `` |
| `` | `` |

## 继承接口 (6个, 15字段)

- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **树型结构** (`baseapp.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
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

> 共 26 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 序号 |
| `monitor_way` | `monitor_way` | `monitor_way` | 监管方式 |
| `forced_inspection` | `forced_inspection` | `forced_inspection` | 强检方式 |
| `description` | `description` | `description` | 强检范围及说明 |
| `memo` | `memo` | `memo` | 备注 |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `path` | `path` | `path` | 路径 |
| `id` | `id` | `id` | 资产类别 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 最后修改人 |
| `pk_sealer` | `pk_sealer` | `pk_sealer` | 启用人 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `parent_id` | `parent_id` | `parent` | 上级目录 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEnd` | `isEnd` | 是否末级 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enablestate` | `enablestate` | `enablestate` | 启用状态 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `catalog` | `catalog` | `catalog` | 目录 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 最后修改时间 |
| `seal_time` | `seal_time` | `seal_time` | 启用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_defines` | `user_defines` | `userDefines` | 自定义项特征组 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 计量器具目录自定义项 |
