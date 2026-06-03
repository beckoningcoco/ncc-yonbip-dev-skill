---
tags: [BIP, 元数据, 数据字典, pc.product.ProductSKU]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料SKU (`pc.product.ProductSKU`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`productsku` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：`e8be5fe7-fbdf-4df2-a802-28bd4181f974`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料SKU |
| 物理表 | `productsku` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 70 个 |
| 子表 | 12 个 |
| 关联引用 | 25 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `productSkuOrderProperty` | `pc.product.ProductSkuOrderProperty` | composition |
| `skudefine` | `pc.product.ProductSKUDefine` | composition |
| `productSKUAppliedDetail` | `pc.product.ProductSKUDetail` | composition |
| `skuFreeDefine` | `pc.product.ProductSkuFreeDefine` | composition |
| `skuTagNew` | `pc.product.SkuTagNew` | composition |
| `skufreecharacteritems` | `pc.product.SkuFreeCharacterItem` | composition |
| `productSkuDetailNew` | `pc.product.ProductSkuDetailNew` | composition |
| `productSKUSpecItems` | `pc.product.ProductSKUSpecItem` | composition |
| `skuAppliedOrderProperties` | `pc.product.SKUOrderProperty` | composition |
| `skuOrderProperties` | `pc.product.SKUOrderPropertyExtend` | composition |
| `skuTags` | `pc.product.SKUTagExtend` | composition |
| `productSKUDetail` | `pc.product.ProductSKUExtend` | composition |

## 关联引用 (25个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `freeidx1` | `productcenter.pc_userdefref` |
| `freeidx2` | `productcenter.pc_userdefref` |
| `freeidx3` | `productcenter.pc_userdefref` |
| `freeidx4` | `productcenter.pc_userdefref` |
| `freeidx5` | `productcenter.pc_userdefref` |
| `productId` | `` |
| `ytenant_id` | `` |
| `productsku_character_def` | `` |
| `skufreecharacter` | `` |
| `batchUnitId` | `productcenter.pc_unitref_new` |
| `skupropcharacter` | `` |

## 继承接口 (6个, 13字段)

- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **社会化核心企业档案** (`base.itf.ISociCoreArchive`)
  - `sociCoreArchive_id` → `sociCoreArchive_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 70 个直连字段

### 文本字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | SKU编码 |
| `erpCode` | `erpCode` | `erpCode` | 外部编码 |
| `free_value_ids` | `free_value_ids` | `freeValueIds` | 自由项特征值集合 |
| `free_value_ids_md5` | `free_value_ids_md5` | `freeValueIdsMd5` | 自由项特征值组合md5 |
| `free_values` | `free_values` | `freeValues` | 自由项特征值组合json |
| `free1` | `free1` | `free1` | 规格1 |
| `free2` | `free2` | `free2` | 规格2 |
| `free3` | `free3` | `free3` | 规格3 |
| `free4` | `free4` | `free4` | 规格4 |
| `free5` | `free5` | `free5` | 规格5 |
| `free6` | `free6` | `free6` | 规格6 |
| `free7` | `free7` | `free7` | 规格7 |
| `free8` | `free8` | `free8` | 规格8 |
| `free9` | `free9` | `free9` | 规格9 |
| `free10` | `free10` | `free10` | 规格10 |
| `freex1` | `freex1` | `freex1` | 动态规格值1 |
| `freex2` | `freex2` | `freex2` | 动态规格值2 |
| `freex3` | `freex3` | `freex3` | 动态规格值3 |
| `freex4` | `freex4` | `freex4` | 动态规格值4 |
| `freex5` | `freex5` | `freex5` | 动态规格值5 |
| `specNames` | `specNames` | `specNames` | 五个动态规格与值 |
| `cSpecIds` | `cSpecIds` | `specIds` | 冗余规格串 |
| `cSpecs` | `cSpecs` | `specs` | 冗余规格值串 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productId` | `productId` | `productId` | 物料 |
| `batchUnitId` | `batchUnitId` | `batchUnit` | 包装单位 |
| `freeidx1` | `freeidx1` | `freeidx1` | 动态规格1 |
| `freeidx2` | `freeidx2` | `freeidx2` | 动态规格2 |
| `freeidx3` | `freeidx3` | `freeidx3` | 动态规格3 |
| `freeidx4` | `freeidx4` | `freeidx4` | 动态规格4 |
| `freeidx5` | `freeidx5` | `freeidx5` | 动态规格5 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isSKU` | `isSKU` | `isSKU` | 是否SKU |
| `is_standard` | `is_standard` | `isStandard` | 是否标准SKU |
| `is_ed` | `is_ed` | `isED` | 是否制造SKU |
| `is_ia` | `is_ia` | `isIa` | 是否存货SKU |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `sociCoreArchive_id` | `sociCoreArchive_id` | `sociCoreArchive` | 社会化核心企业档案 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `batchRate` | `batchRate` | `batchRate` | 包装单位换算率 |
| `weight` | `weight` | `weight` | 重量 |
| `volume` | `volume` | `volume` | 体积 |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | SKU名称 |
| `cModelDescription` | `cModelDescription` | `modelDescription` | SKU规格说明 |
| `cModel` | `cModel` | `model` | SKU型号 |

### other (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `skudefine` | 商品SKU-SKU属性（废弃） |
| `source` | `source` | `source` | SKU来源 |
| `` | `` | `productSKUAppliedDetail` | (停用)物料SKU详情(使用组织) |
| `` | `` | `productSKUDetail` | (停用)物料SKU详情(管理组织) |
| `` | `` | `productSKUSpecItems` | SKU规格冗余表 |
| `` | `` | `productSkuDetailNew` | 物料SKU详情(整合) |
| `` | `` | `productSkuOrderProperty` | 物料订单属性(整合) |
| `` | `` | `skuAppliedOrderProperties` | (停用)物料订单属性(使用组织) |
| `` | `` | `skuFreeDefine` | SKU自由自定义项 |
| `` | `` | `skuOrderProperties` | (停用)物料订单属性(管理组织) |
| `` | `` | `skuTagNew` | SKU标签关联表(整合) |
| `` | `` | `skuTags` | (停用)SKU标签关联表(管理组织) |
| `` | `` | `skufreecharacteritems` | SKU特征冗余表 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `skufreecharacter` | `skufreecharacter` | `skuFreeCharacter` | SKU自由项特征组 |

### SkuPropCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `skupropcharacter` | `skupropcharacter` | `skuPropCharacter` | SKU属性特征组 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productsku_character_def` | `productsku_character_def` | `productSkuCharacterDef` | SKU特征自定义项 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
