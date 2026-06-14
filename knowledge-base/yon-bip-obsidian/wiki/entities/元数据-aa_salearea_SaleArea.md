---
tags: [BIP, 元数据, 数据字典, aa.salearea.SaleArea]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售区域 (`aa.salearea.SaleArea`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_salearea` | domain：`productcenter` | 应用：`DPMCUS` | 业务对象ID：`6755d5af-50f1-4ca0-b95f-d757acfa10c4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售区域 |
| 物理表 | `aa_salearea` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `DPMCUS` |
| 直连字段 | 32 个 |
| 子表 | 2 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `saleAreaApplyRange` | `aa.salearea.SaleAreaApplyRange` | composition |
| `defines` | `aa.salearea.SaleAreaDefine` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `productcenter.aa_salearearef` |
| `aa_salearea_character` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `orgId` | `productcenter.aa_adminorgref` |
| `tenant_id` | `` |

## 继承接口 (6个, 18字段)

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
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **商家相关** (`base.itf.IShop`)
  - `iShopID` → `iShopID`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 32 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `cErpCode` | `cErpCode` | `erpCode` | 外部编码 |
| `path` | `path` | `path` | 路径 |
| `cCreatorName` | `cCreatorName` | `creatorName` | 创建人 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `orgId` | `orgId` | `orgId` | 管理组织 |
| `parent_id` | `parent_id` | `parent` | 上级区域 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bStopStatus` | `bStopStatus` | `stopstatus` | 启用状态 |
| `` | `isEnd` | `isEnd` | 是否末级 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iOrder` | `iOrder` | `order` | 排序 |
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序(废弃) |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `iShopID` | `iShopID` | `shop` | 商家 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `remark` | `remark` | `remark` | 备注 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCreatorType` | `iCreatorType` | `custType` | 创建者类型 |
| `logically_delete_type` | `logically_delete_type` | `logicallyDeleteType` | 逻辑删除类型 |
| `` | `` | `defines` | 销售区域(自定义项)表 |
| `` | `` | `saleAreaApplyRange` | 销售区域适用范围 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dStopTime` | `dStopTime` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `aa_salearea_character` | `aa_salearea_character` | `saleAreaCharacter` | 销售区域表头自定义项 |
