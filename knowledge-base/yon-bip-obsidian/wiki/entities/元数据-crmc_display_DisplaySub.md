---
tags: [BIP, 元数据, 数据字典, crmc.display.DisplaySub]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 陈列商品子表 (`crmc.display.DisplaySub`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mka_display_sub` | domain：`yycrm` | 应用：`CRMC` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 陈列商品子表 |
| 物理表 | `mka_display_sub` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `CRMC` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 11 个 |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `materialClass` | `productcenter.pc_managementclassref` |
| `productClass` | `productcenter.pc_presentationclassref` |
| `displayMethod` | `yycrm.crmc_custdocref` |
| `materials` | `productcenter.pc_productquerytreeref` |
| `ytenant_id` | `` |
| `display` | `` |
| `salesUnit` | `productcenter.pc_productassitunitsref` |
| `` | `` |
| `displaySubDefineCharacter` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
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

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `materials` | `materials` | `materials` | 物料id |
| `materialClass` | `materialClass` | `materialClass` | 物料分类id |
| `productClass` | `productClass` | `productClass` | 商品分类id |
| `salesUnit` | `salesUnit` | `salesUnit` | 销售单位id |
| `displayMethod` | `displayMethod` | `displayMethod` | 陈列方式id |
| `display` | `display` | `display` | 陈列规格ID |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `quantity` | `quantity` | `quantity` | 陈列数量 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `displaySubDefineCharacter` | `displaySubDefineCharacter` | `displaySubDefineCharacter` | 陈列规格商品自定义项 |
