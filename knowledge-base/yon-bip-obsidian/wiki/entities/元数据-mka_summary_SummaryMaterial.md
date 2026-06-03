---
tags: [BIP, 元数据, 数据字典, mka.summary.SummaryMaterial]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 活动小结活动物料 (`mka.summary.SummaryMaterial`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mka_summary_material` | domain：`yycrm` | 应用：`MKA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 活动小结活动物料 |
| 物理表 | `mka_summary_material` |
| 数据库 schema | `yycrm` |
| 所属应用 | `MKA` |
| 直连字段 | 28 个 |
| 子表 | 1 个 |
| 关联引用 | 13 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `materialBodyDef` | `mka.summary.SummaryMaterialDef` | composition |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `expenseItem` | `finbd.bd_expenseitemref` |
| `product` | `productcenter.pc_productquerytreeref` |
| `ytenant_id` | `` |
| `` | `` |
| `productDefineCharacter` | `` |
| `activityMaterial` | `` |
| `activityId` | `` |
| `unit` | `productcenter.pc_unitref` |
| `summaryMaterialDefineCharacter` | `` |
| `summaryId` | `` |
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

> 共 28 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `productSensCode` | `productSensCode` | `productSensCode` | 物料敏感域编码 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activityId` | `activityId` | `activityId` | 活动ID |
| `summaryId` | `summaryId` | `summaryId` | 活动小结ID |
| `product` | `product` | `product` | 物料ID |
| `unit` | `unit` | `unit` | 单位ID |
| `expenseItem` | `expenseItem` | `expenseItem` | 费用项ID |
| `activityMaterial` | `activityMaterial` | `activityMaterial` | 来源活动物料行ID |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `standbook_manage` | `standbook_manage` | `standbookManage` | 允许物料台账管理 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `lineNo` | `lineNo` | `lineNo` | 行号 |
| `quantity` | `quantity` | `quantity` | 使用数量 |
| `product_price` | `product_price` | `productPrice` | 单价 |
| `product_amount` | `product_amount` | `productAmount` | 金额 |
| `activityLineNo` | `activityLineNo` | `activityLineNo` | 来源活动物料行 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `summaryMaterialDefineCharacter` | `summaryMaterialDefineCharacter` | `summaryMaterialDefineCharacter` | 活动物料自定义特征组 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productDefineCharacter` | `productDefineCharacter` | `productDefineCharacter` | 物料自由项特征组 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `materialBodyDef` | 小结物料自定义项 |
