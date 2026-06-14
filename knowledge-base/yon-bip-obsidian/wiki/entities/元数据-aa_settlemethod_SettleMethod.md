---
tags: [BIP, 元数据, 数据字典, aa.settlemethod.SettleMethod]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 结算方式 (`aa.settlemethod.SettleMethod`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`settle_method` | domain：`productcenter` | 应用：`DPMSETL` | 业务对象ID：`b44aa192-5483-4529-8f17-596253804126`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 结算方式 |
| 物理表 | `settle_method` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `DPMSETL` |
| 直连字段 | 30 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `settlemethodFreeDefines` | `aa.settlemethod.SettleMethodFreeDefine` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `iParentId` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `defineCharacter` | `` |
| `tenant_id` | `` |

## 继承接口 (7个, 28字段)

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
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **树型结构** (`ucfbase.ucfbaseItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **树型结构** (`iuap.busiObj.ITree`)
  - `ifend` → `ifend`
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`

## 字段列表（按类型分组）

> 共 30 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCode` | `cCode` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `cErpCode` | `cErpCode` | `erpCode` | 外部编码 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `cPath` | `cPath` | `path` | 路径 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `iParentId` | `iParentId` | `parent` | 上级结算方式 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isDefault` | `isDefault` | `isDefault` | 是否默认 |
| `isEnabled` | `isEnabled` | `isEnabled` | 启用状态 |
| `isEnd` | `isEnd` | `isEnd` | 是否末级 |
| `sourcetype` | `sourcetype` | `sourcetype` | 是否系统预置 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `direct_connection` | `direct_connection` | `directConnection` | 是否直连 |
| `iDeleted` | `iDeleted` | `iDeleted` | 启用状态 |
| `iDepth` | `iDepth` | `level` | 层级 |
| `iOrder` | `iOrder` | `order` | 排序号 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `settlemethodFreeDefines` | 结算方式自由自定义项 |
| `service_attr` | `service_attr` | `serviceAttr` | 业务属性 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cComment` | `cComment` | `comment` | 备注 |
| `cName` | `cName` | `name` | 结算方式 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `defineCharacter` | `defineCharacter` | `defineCharacter` | 自定义项特征 |
