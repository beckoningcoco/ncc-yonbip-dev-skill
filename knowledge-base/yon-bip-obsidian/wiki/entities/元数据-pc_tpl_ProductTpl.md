---
tags: [BIP, 元数据, 数据字典, pc.tpl.ProductTpl]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料模板 (`pc.tpl.ProductTpl`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`product_tpl` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：`531361b9-9863-4d35-b0b7-fb273a24c0bd`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料模板 |
| 物理表 | `product_tpl` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 41 个 |
| 子表 | 11 个 |
| 关联引用 | 20 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `CycleProperties` | `pc.tpl.ProductTplCycleProperty` | composition |
| `Parameters` | `pc.tpl.ProductTplParameter` | composition |
| `productTplAssistUnitExchanges` | `pc.tpl.ProductTplAssistUnitExchange` | composition |
| `freeCharacters` | `pc.tpl.ProductTplCharacter` | composition |
| `OrderProperties` | `pc.tpl.ProductTplOrderProperty` | composition |
| `productPropCharacters` | `pc.tpl.ProductTplCharacter4ProductProp` | composition |
| `Brands` | `pc.tpl.ProductTplBrand` | composition |
| `skuCharacters` | `pc.tpl.ProductTplCharacter4SKU` | composition |
| `OrderPropertySums` | `pc.tpl.ProductTplOrderPropertySum` | composition |
| `optionCharacters` | `pc.tpl.ProductTplCharacter4Option` | composition |
| `Units` | `pc.tpl.ProductTplUnit` | composition |

## 关联引用 (20个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `iSkuPropCT` | `` |
| `ytenant_id` | `` |
| `dlyFeeRuleId` | `umall.um_deliverytyperef` |
| `iOptionCT` | `` |
| `iFreeCT` | `` |
| `tenant_id` | `` |
| `iMaterialPropCT` | `` |

## 继承接口 (7个, 15字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **社会化核心企业档案** (`base.itf.ISociCoreArchive`)
  - `sociCoreArchive_id` → `sociCoreArchive_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 41 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `erpCode` | `erpCode` | `erpCode` | 外部编码 |
| `nameSpacer` | `nameSpacer` | `nameSpacer` | SKU名称间隔符 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `dlyFeeRuleId` | `dlyFeeRuleId` | `deliveryType` | 商城运费模板 |
| `iFreeCT` | `iFreeCT` | `freeCT` | 自由项特征组 |
| `iMaterialPropCT` | `iMaterialPropCT` | `materialPropCT` | 物料属性特征组 |
| `iSkuPropCT` | `iSkuPropCT` | `skuPropCT` | sku属性特征组 |
| `iOptionCT` | `iOptionCT` | `optionCT` | 选配特征组 |
| `tenant_id` | `tenant_id` | `tenant` | 租户ID(废弃) |
| `` | `modifierId` | `modifierId` | 修改人 |
| `` | `creatorId` | `creatorId` | 创建人 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iEnableCyclePurchase` | `iEnableCyclePurchase` | `enableCyclePurchase` | 启用周期购 |
| `isInvolveSKUNaming` | `isInvolveSKUNaming` | `involveSKUNaming` | 物料名称参与SKU名称命名 |
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |
| `sku_business_dynamic` | `sku_business_dynamic` | `skuBusinessDynamic` | SKU随业务动态产生 |
| `iEnableWeighing` | `iEnableWeighing` | `enableWeighing` | 启用称重 |
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_optional_template` | `is_optional_template` | `isOptionalTemplate` | 是否选配模板 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `freightId` | `freightId` | `FreightRule` | 订货运费模板 |
| `sociCoreArchive_id` | `sociCoreArchive_id` | `sociCoreArchive` | 社会化核心企业档案 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cName` | `cName` | `name` | 模板名称 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### other (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `Brands` | 物料模板-关联品牌 |
| `` | `` | `CycleProperties` | 物料模板-周期购 |
| `` | `` | `OrderProperties` | 物料模板-订单属性 |
| `` | `` | `OrderPropertySums` | 物料模板-订单属性 |
| `` | `` | `Parameters` | 物料模板-物料参数 |
| `` | `` | `Units` | 物料模板-计量单位 |
| `` | `` | `freeCharacters` | 物料模板自由项-特征 |
| `` | `` | `optionCharacters` | 物料模板选配-特征 |
| `` | `` | `productPropCharacters` | 物料模板物料属性-特征 |
| `` | `` | `productTplAssistUnitExchanges` | 物料模板辅计量换算对照 |
| `` | `` | `skuCharacters` | 物料模板SKU属性-特征 |
