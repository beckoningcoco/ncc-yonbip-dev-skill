---
tags: [BIP, 元数据, 数据字典, aa.goodsposition.GoodsPosition]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 货位档案 (`aa.goodsposition.GoodsPosition`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_goodsposition` | domain：`productcenter` | 应用：`DPMSI` | 业务对象ID：`ad55f97a-4cfb-4e9b-8b23-f47286b7b599`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 货位档案 |
| 物理表 | `aa_goodsposition` |
| 数据库 schema | `productcenter` |
| 所属应用 | `DPMSI` |
| 直连字段 | 32 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `headDefine` | `aa.goodsposition.GoodsPositionDefine` | composition |
| `goodsProductsComparisons` | `aa.goodsposition.GoodsProductsComparison` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent` | `` |
| `` | `` |
| `warehouseId` | `productcenter.aa_warehouse_stocksref` |
| `ytenant_id` | `` |
| `defineCharacter` | `` |
| `iCustID` | `` |
| `tenant_id` | `` |

## 继承接口 (7个, 19字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **树型结构** (`base.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 32 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `barCode` | `barCode` | String | 货位条码 |
| `charger` | `charger` | String | 负责人 |
| `code` | `code` | String | 货位号 |
| `` | `creator` | String | 创建人名称 |
| `erpCode` | `erpCode` | String | ERP编码 |
| `` | `modifier` | String | 修改人名称 |
| `path` | `path` | String | 路径 |
| `remark` | `remark` | String | 备注 |
| `volume` | `volume` | String | 货位容积(立方米) |

### 引用字段 (7个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | 创建人 |
| `iCustID` | `iCustID` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | 所属客户 |
| `` | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | 修改人 |
| `parent` | `parent` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc | 上级货位 |
| `tenant_id` | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | 租户 |
| `warehouseId` | `warehouseId` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | 仓库id |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_date` | `create_date` | Date | 创建日期 |
| `modify_date` | `modify_date` | Date | 修改日期 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `isEnd` | `isEnd` | Boolean | 是否末级 |
| `isFastAdd` | `isFastAdd` | Boolean | 是否快速定义 |
| `stopstatus` | `stopstatus` | Boolean | 停用状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `level` | `level` | Integer | 层级 |
| `sort` | `sort` | Integer | 排序号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | Long | 主键 |

### timestamp (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |
| `stoptime` | `stoptime` | DateTime | 停用时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `defineCharacter` | `defineCharacter` | fdcfc20d-b825-4525-be65-dbb184a87910 | 自定义项特征 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 货位名称 |

### other (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | 0ab19a86-6669-4cc5-8ba7-b4b347b79aaa | 货位物料对照 |
| `` | `` | 288eb11a-6acd-4462-8d60-a2d4694f2bf7 | 货位档案自定义项 |
