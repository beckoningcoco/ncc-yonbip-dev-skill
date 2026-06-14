---
tags: [BIP, 元数据, 数据字典, sfa.clue.AuthBusiobjectDimensionClue]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 相关管理维度-线索关联数据表 (`sfa.clue.AuthBusiobjectDimensionClue`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`crmc_auth_busiobject_dimension_clue` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 相关管理维度-线索关联数据表 |
| 物理表 | `crmc_auth_busiobject_dimension_clue` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `SFA` |
| 直连字段 | 31 个 |
| 子表 | 0 个 |
| 关联引用 | 11 个 |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `source_id` | `` |
| `productLine` | `` |
| `materialClass` | `` |
| `org` | `` |
| `ytenant_id` | `` |
| `customerTrade` | `` |
| `` | `` |
| `salearea` | `` |
| `customerCategory` | `` |
| `dimension` | `` |

## 字段列表（按类型分组）

> 共 31 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busiobjectCode` | `busiobjectCode` | `busiobjectCode` | 业务对象单据编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `extend1` | `extend1` | `extend1` | 扩展字段1 |
| `extend10` | `extend10` | `extend10` | 扩展字段10 |
| `extend2` | `extend2` | `extend2` | 扩展字段2 |
| `extend3` | `extend3` | `extend3` | 扩展字段3 |
| `extend4` | `extend4` | `extend4` | 扩展字段4 |
| `extend5` | `extend5` | `extend5` | 扩展字段5 |
| `extend6` | `extend6` | `extend6` | 扩展字段6 |
| `extend7` | `extend7` | `extend7` | 扩展字段7 |
| `extend8` | `extend8` | `extend8` | 扩展字段8 |
| `extend9` | `extend9` | `extend9` | 扩展字段9 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `customerCategory` | `customerCategory` | `customerCategory` | 客户分类 |
| `customerTrade` | `customerTrade` | `customerTrade` | 客户行业 |
| `dimension` | `dimension` | `dimension` | 管理维度 |
| `materialClass` | `materialClass` | `materialClass` | 物料分类 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `org` | `org` | `org` | 管理组织 |
| `productLine` | `productLine` | `productLine` | 产品线 |
| `salearea` | `salearea` | `saleArea` | 销售区域 |
| `source_id` | `source_id` | `sourceId` | 单据id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bCreated` | `bCreated` | `bCreated` | 是否手动新增 |

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
