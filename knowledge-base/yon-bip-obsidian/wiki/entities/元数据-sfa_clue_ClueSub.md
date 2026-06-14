---
tags: [BIP, 元数据, 数据字典, sfa.clue.ClueSub]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 线索子表 (`sfa.clue.ClueSub`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_clue_sub` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 线索子表 |
| 物理表 | `sfa_clue_sub` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `SFA` |
| 直连字段 | 24 个 |
| 子表 | 1 个 |
| 关联引用 | 13 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyDef` | `sfa.clue.ClueSubDef` | composition |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `materialClass` | `productcenter.pc_managementclassref` |
| `productClass` | `productcenter.pc_presentationclassref` |
| `ytenant_id` | `` |
| `` | `` |
| `productLine` | `productcenter.pc_productlineref` |
| `materials` | `productcenter.pc_productquerytreeref` |
| `clue` | `` |
| `salesUnit` | `productcenter.pc_productassitunitsref` |
| `brand` | `productcenter.pc_brandref` |
| `clueSubDefineCharacter` | `` |
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

> 共 24 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `` | `name` | `name` | 显示名称 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `materials` | `materials` | `materials` | 物料ID |
| `materialClass` | `materialClass` | `materialClass` | 物料分类ID |
| `productClass` | `productClass` | `productClass` | 商品分类ID |
| `brand` | `brand` | `brand` | 品牌ID |
| `productLine` | `productLine` | `productLine` | 产品线ID |
| `salesUnit` | `salesUnit` | `salesUnit` | 销售单位ID |
| `clue` | `clue` | `clue` | 线索编码 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `quantity` | `quantity` | `quantity` | 数量 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `clueSubDefineCharacter` | `clueSubDefineCharacter` | `clueSubDefineCharacter` | 线索子表自定义项特征属性组 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodyDef` | 线索子表自定义项扩展 |
