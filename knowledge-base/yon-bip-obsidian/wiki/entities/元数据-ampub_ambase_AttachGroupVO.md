---
tags: [BIP, 元数据, 数据字典, ampub.ambase.AttachGroupVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资产类别附件分组 (`ampub.ambase.AttachGroupVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_attach_group` | domain：`ucf-amc-ambd` | 应用：`AMBD` | 业务对象ID：`8ea09f6b-aaf1-46b1-8257-fe7a1172dad4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资产类别附件分组 |
| 物理表 | `pam_attach_group` |
| 数据库 schema | `ucf-amc-ambd` |
| 所属应用 | `AMBD` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `pk_sealer` | `` |
| `fk_parent` | `ucf-amc-ambd.ampub_attach_group_ref` |
| `pk_category` | `` |
| `tenantid` | `` |

## 继承接口 (5个, 11字段)

- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **停启用状态** (`baseapp.itf.IEnableState`)
  - `enablestate` → `enablestate`
  - `pk_sealer` → `pk_sealer`
  - `seal_time` → `seal_time`
- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **树型结构** (`baseapp.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 分组编码 |
| `name` | `name` | `name` | 分组名称 |
| `describe` | `describe` | `describe` | 分组描述 |
| `mapId` | `mapId` | `mapId` | 映射ID |
| `id` | `id` | `id` | ID |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `path` | `path` | `path` | 路径 |
| `parent_id` | `parent_id` | `parent` | 上级分类 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fk_parent` | `fk_parent` | `fk_parent` | 上级分类 |
| `pk_category` | `pk_category` | `pk_category` | 资产类别 |
| `pk_sealer` | `pk_sealer` | `pk_sealer` | 启用人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenantid` | `tenantid` | `tenant` | 租户 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEnd` | `isEnd` | 是否末级 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sync_status` | `sync_status` | `sync_status` | 同步状态 |
| `enablestate` | `enablestate` | `enablestate` | 启用状态 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `file_sync_status` | `file_sync_status` | `file_sync_status` | 附件同步状态 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `seal_time` | `seal_time` | `seal_time` | 启用时间 |
