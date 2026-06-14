---
tags: [BIP, 元数据, 数据字典, org.doc.CompanyType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 组织形态 (`org.doc.CompanyType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`org_company_type` | domain：`ucf-org-center` | 应用：`GZTORG` | 业务对象ID：`93809811-1bf5-4b31-81c0-411a1b92471b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 组织形态 |
| 物理表 | `org_company_type` |
| domain/服务域 | `ucf-org-center` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `GZTORG` |
| 直连字段 | 24 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `modifier` | `` |
| `tenantid` | `` |

## 继承接口 (6个, 12字段)

- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审批信息** (`bd.itf.ISystemInfo`)
  - `dr` → `dr`
  - `enable` → `enable`
  - `sysid` → `sysid`
  - `tenantid` → `tenantid`
  - `ts` → `ts`
- **审计信息** (`bd.itf.IAuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `code` | `code` | `code` | 编码 |
| `name2` | `name2` | `name2` | 名称(多语备用) |
| `name3` | `name3` | `name3` | 名称(多语备用) |
| `name4` | `name4` | `name4` | 名称(多语备用) |
| `name5` | `name5` | `name5` | 名称(多语备用) |
| `name6` | `name6` | `name6` | 名称(多语备用) |
| `memo` | `memo` | `memo` | 备注 |
| `creator` | `creator` | `creator` | 创建人 |
| `tenantid` | `tenantid` | `tenantid` | 租户标识 |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `related_func` | `related_func` | `relatedFunc` | 关联职能(废弃) |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modifier` | `modifier` | `modifier` | 修改人 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `displayorder` | `displayorder` | `displayorder` | 排序号 |
| `enable` | `enable` | `enable` | 状态 |
| `sysdefine` | `sysdefine` | `sysdefine` | 系统预制(废弃) |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标识 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `ts` | `ts` | `ts` | 时间戳 |
