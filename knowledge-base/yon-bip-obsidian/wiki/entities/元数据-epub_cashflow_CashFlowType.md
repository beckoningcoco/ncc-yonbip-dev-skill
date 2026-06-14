---
tags: [BIP, 元数据, 数据字典, epub.cashflow.CashFlowType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 现金流量类型 (`epub.cashflow.CashFlowType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`epub_cashflowtype` | domain：`fiepub` | 应用：`FP` | 业务对象ID：`b37670f1-57af-43be-90db-837c3b534cc0`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 现金流量类型 |
| 物理表 | `epub_cashflowtype` |
| domain/服务域 | `fiepub` |
| schema | `fiepub` |
| 所属应用 | `FP` |
| 直连字段 | 32 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `fiepub.fiepub_cashflowtyperef` |
| `ytenant_id` | `` |
| `creatorId` | `` |
| `modifierId` | `` |
| `refcashflowtype` | `fiepub.fiepub_cashflowtyperef` |
| `accstandard` | `fiepub.epub_accstandard_ref` |
| `accentity` | `finbd.bd_allaccbodyref` |
| `parenttype` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 12字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 32 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人名称 |
| `def29` | `def29` | `def29` | 自定义29 |
| `def30` | `def30` | `def30` | 自定义30 |
| `modifier` | `modifier` | `modifier` | 修改人名称 |
| `objid` | `objid` | `objid` | 友企连id |
| `srccoreid` | `srccoreid` | `srccoreid` | 社会化下发来源id |
| `sysid` | `sysid` | `sysid` | 来源主键 |
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 编码 |
| `description` | `description` | `description` | 描述 |
| `levelcode` | `levelcode` | `levelcode` | 层级 |
| `controlrange` | `controlrange` | `controlrange` | 派生范围 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源id |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creatorId` | `creatorId` | `creatorId` | 创建人 |
| `modifierId` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `accentity` | `accentity` | `accentity` | 会计主体id |
| `accstandard` | `accstandard` | `accstandard` | 会计准则id |
| `refcashflowtype` | `refcashflowtype` | `refcashflowtype` | 引用现金流量类型id |
| `parent_id` | `parent_id` | `parent` | 上级现金流量类型id |
| `parenttype` | `parenttype` | `parenttype` | 父现金流量类型 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `addfirstlevel` | `addfirstlevel` | `addfirstlevel` | 禁止增加一级 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `system` | `system` | `system` | 是否系统预制 |
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `createTime` | `createTime` | `createTime` | 创建时间 |
| `modifyTime` | `modifyTime` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
