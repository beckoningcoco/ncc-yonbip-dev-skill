---
tags: [BIP, 元数据, 数据字典, znbzbx.filesystem.FileSystemVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 文件附件 (`znbzbx.filesystem.FileSystemVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_sm_pub_filesystem` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`bc2e5106-1f0c-4d40-b767-c440a8513cc3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 文件附件 |
| 物理表 | `znbz_sm_pub_filesystem` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 27 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `cfinaceorg` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 27 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `filelength` | `filelength` | `filelength` | 文件长度 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `path` | `path` | `path` | 路径 |
| `sourceFileId` | `sourceFileId` | `sourceFileId` | 源文件ID |
| `vattachmentass` | `vattachmentass` | `vattachmentass` | 单据附件id |
| `vfileid` | `vfileid` | `vfileid` | 协同文件存储ID |
| `vfilepath` | `vfilepath` | `vfilepath` | 路径(文件服务器) |
| `vimageid` | `vimageid` | `vimageid` | PDF/OFD解析接⼝返回值 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 业务单元 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isfolder` | `isfolder` | `isfolder` | 是否目录 |
| `isrepair` | `isrepair` | `isrepair` | 是否后补 |

### 短整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ifiletype` | `ifiletype` | `ifiletype` | 文件类型 |
| `inecessity` | `inecessity` | `inecessity` | 必要性 |
| `ipagecount` | `ipagecount` | `ipagecount` | 文件页数 |
| `iselecvmatched` | `iselecvmatched` | `iselecvmatched` | 电子凭证匹配关系 |
| `orientation` | `orientation` | `orientation` | 旋转角度 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
