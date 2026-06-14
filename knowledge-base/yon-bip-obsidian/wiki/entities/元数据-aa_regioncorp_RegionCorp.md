---
tags: [BIP, 元数据, 数据字典, aa.regioncorp.RegionCorp]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 地址档案 (`aa.regioncorp.RegionCorp`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`regioncorp` | domain：`productcenter` | 应用：`DPMSI` | 业务对象ID：`2d99e5eb-c47f-4dc2-8fd7-3c7d6eee8a19`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 地址档案 |
| 物理表 | `regioncorp` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `DPMSI` |
| 直连字段 | 32 个 |
| 子表 | 1 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `regionCorpSubData` | `aa.regioncorp.RegionCorpSubData` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `iParentId` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (7个, 29字段)

- **树型结构** (`base.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **树型结构** (`iuap.busiObj.ITree`)
  - `ifend` → `ifend`
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **树型结构** (`ucfbase.ucfbaseItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`

## 字段列表（按类型分组）

> 共 32 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cityCode` | `cityCode` | `cityCode` | 城市代码 |
| `cCode` | `cCode` | `code` | 地址编码 |
| `mergerName` | `mergerName` | `mergerName` | 全名称 |
| `parentCode` | `parentCode` | `parentCode` | 上级地址编码 |
| `cPath` | `cPath` | `path` | 路径 |
| `zipCode` | `zipCode` | `zipCode` | 邮政编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iParentId` | `iParentId` | `parent` | 上级地址 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `initDataEnd` | `initDataEnd` | `initDataEnd` | 初始化数据末级 |
| `isCashOnDelivery` | `isCashOnDelivery` | `isCashOnDelivery` | 货到付款 |
| `isEnd` | `isEnd` | `isEnd` | 是否末级 |
| `sourcetype` | `sourcetype` | `sourcetype` | 是否系统预置 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `levelType` | `levelType` | `level` | 级别 |
| `ordernum` | `ordernum` | `order` | 排序 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `regionCorpSubData` | 地址档案子表 |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `keyWord` | `keyWord` | `keyWord` | 关键字 |
| `name` | `name` | `name` | 地址名称 |
| `showName` | `showName` | `showName` | 显示名称 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
