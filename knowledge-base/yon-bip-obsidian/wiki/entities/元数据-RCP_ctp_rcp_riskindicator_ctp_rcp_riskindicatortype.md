---
tags: [BIP, 元数据, 数据字典, RCP.ctp_rcp_riskindicator.ctp_rcp_riskindicatortype]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 指标类型 (`RCP.ctp_rcp_riskindicator.ctp_rcp_riskindicatortype`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcp_riskindicatortype` | domain：`yonbip-mid-sscia` | 应用：`RCP` | 业务对象ID：`5c003627-be85-44df-a86b-7003c94f29a1`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 指标类型 |
| 物理表 | `rcp_riskindicatortype` |
| domain/服务域 | `yonbip-mid-sscia` |
| schema | `intelligent_audit` |
| 所属应用 | `RCP` |
| 直连字段 | 23 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `` |
| `ytenant_id` | `` |
| `` | `` |

## 继承接口 (1个, 6字段)

- **树型结构** (`ucfbase.ucfbaseItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `parent_code` | `parent_code` | `parentCode` | 父级编码 |
| `micro_service_code` | `micro_service_code` | `microServiceCode` | 原子服务编码 |
| `code` | `code` | `code` | 编码 |
| `id` | `id` | `id` | 主键 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `path` | `path` | `path` | 路径 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `parent_id` | `parent_id` | `parent` | 指标类型 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 日期时间 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEnd` | `isEnd` | 是否末级 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
