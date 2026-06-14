---
tags: [BIP, 元数据, 数据字典, aa.vendorclass.VendorClass]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 供应商分类 (`aa.vendorclass.VendorClass`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_vendorclass` | domain：`yssupplier` | 应用：`DPMSPL` | 业务对象ID：`c10e22c0-aa28-411d-92cc-1e069b24423f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商分类 |
| 物理表 | `aa_vendorclass` |
| domain/服务域 | `yssupplier` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `DPMSPL` |
| 直连字段 | 35 个 |
| 子表 | 2 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `vendorClassOrgs` | `aa.vendorclass.VendorClassOrg` | composition |
| `defines` | `aa.vendorclass.VendorClassDefine` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `iParentId` | `aa_vendorclassificationref` |
| `` | `` |
| `vendorClassCharacterDefine` | `` |
| `vcCrowd` | `` |
| `orgId` | `yssupplier.aa_adminorgref` |
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (6个, 19字段)

- **树型结构** (`base.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
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
- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 35 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 分类编码 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源id |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `cPath` | `cPath` | `path` | 路径 |
| `cErpCode` | `cErpCode` | `erpCode` | 外部编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `cCreatorName` | `cCreatorName` | `creatorName` | 创建者名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `cOutSysKey` | `cOutSysKey` | `outSysKey` | 数据来源主键 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vcCrowd` | `vcCrowd` | `vcCrowd` | 群 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `iParentId` | `iParentId` | `parent` | 上级分类主键 |
| `` | `creatorId` | `creatorId` | 创建人ID |
| `` | `modifierId` | `modifierId` | 修改人 |
| `orgId` | `orgId` | `org` | 创建组织主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isEnd` | `isEnd` | `isEnd` | 是否末级 |
| `isEnabled` | `isEnabled` | `isEnabled` | 是否启用 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |
| `iDepth` | `iDepth` | `level` | 层级 |
| `iOrder` | `iOrder` | `order` | 排序号 |
| `iDeleted` | `iDeleted` | `iDeleted` | 状态 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 分类主键 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 分类名称 |
| `cComment` | `cComment` | `comment` | 备注 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCreatorType` | `iCreatorType` | `classType` | 创建者类型 |
| `` | `` | `defines` | 项目(自定义项)表1 |
| `` | `` | `vendorClassOrgs` | 供应商分类组织分配子表-用于导入 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vendorClassCharacterDefine` | `vendorClassCharacterDefine` | `vendorClassCharacterDefine` | 供应商分类自定义项 |
