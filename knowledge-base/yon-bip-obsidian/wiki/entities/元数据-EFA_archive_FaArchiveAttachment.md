---
tags: [BIP, 元数据, 数据字典, EFA.archive.FaArchiveAttachment]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 电子档案采集文件信息 (`EFA.archive.FaArchiveAttachment`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_archive_attachment` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`4ad54ac9-3479-4b01-90e7-75cec1acc8a8`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 电子档案采集文件信息 |
| 物理表 | `fa_archive_attachment` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 16 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 16 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `file_name` | `file_name` | `fileName` | 文件名称 |
| `file_type` | `file_type` | `fileType` | 文件类型 |
| `file_url` | `file_url` | `fileUrl` | 文件地址 |
| `checksum` | `checksum` | `checksum` | 文件校验码 |
| `file_size` | `file_size` | `fileSize` | 文件大小 |
| `file_desc` | `file_desc` | `fileDesc` | 附件描述 |
| `description` | `description` | `description` | 备注 |
| `id` | `id` | `id` | 主键 |
| `task_id` | `task_id` | `taskId` | 采集任务 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
