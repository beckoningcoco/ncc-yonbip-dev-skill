---
tags: [BIP, 元数据, 数据字典, pc.product.Product]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料 (`pc.product.Product`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`product` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：`5cd77c8c-7034-45e0-802e-f59fdbb703a0`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料 |
| 物理表 | `product` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 116 个 |
| 子表 | 26 个 |
| 关联引用 | 55 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `productskus` | `pc.product.ProductSKU` | composition |
| `productShops` | `pc.product.ProductApplyRange` | composition |
| `productAssistUnitExchanges` | `pc.product.ProductAssistUnitExchange` | composition |
| `description` | `pc.product.ProductDescription` | composition |
| `productOrgs` | `pc.product.ProductApplyRange` | composition |
| `productSpecFrees` | `pc.product.ProductCheckFreeExtend` | composition |
| `productParams` | `pc.product.ProductParameterExtend` | composition |
| `productAssistClasses` | `pc.product.ProductAssistClass` | composition |
| `productApplyRange` | `pc.product.ProductApplyRange` | composition |
| `productApplyRangeGroup` | `pc.product.ProductApplyRangeGroup` | composition |
| `define` | `pc.product.ProductDefine` | composition |
| `productspecitems` | `pc.product.ProductSpecItem` | composition |
| `productDepositTimeDetail` | `pc.product.ProductDepositTimeDetail` | composition |
| `productCheckFrees` | `pc.product.ProductCheckFreeExtend` | composition |
| `productSkuDetailNew` | `pc.product.ProductSkuDetailNew` | composition |
| `defaultSKUOrderProperties` | `pc.product.SKUOrderPropertyExtend` | composition |
| `productDetail` | `pc.product.ProductDetail` | composition |
| `product_waimaList` | `pc.product.product_waima` | composition |
| `productfreecharacteritems` | `pc.product.ProductFreeCharacterItem` | composition |
| `productCustomers` | `pc.product.ProductApplyRange` | composition |
| `freeDefine` | `pc.product.ProductFreeDefine` | composition |
| `productLoadWays` | `pc.product.ProductLoadWay` | composition |
| `time` | `pc.product.ProductDepositTimeExtend` | composition |
| `detail` | `pc.product.ProductExtend` | composition |
| `productBarCodes` | `pc.product.ProductBarCode` | composition |
| `productTags` | `pc.product.ProductTagExtend` | composition |

## 关联引用 (55个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `couponId` | `uhy.pt_couponref` |
| `planClass` | `productcenter.pc_planclassref` |
| `productLineId` | `productcenter.pc_productlineref` |
| `giftCard_id` | `upromotion.pmc_giftcardref` |
| `iProductPropCharacterDefine` | `` |
| `brand_id` | `productcenter.pc_brandref` |
| `oProductClass_id` | `productcenter.pc_presentationclassref` |
| `oUnit_id` | `productcenter.pc_unitref_new` |
| `transType` | `transtype.bd_billtyperef` |
| `weightUnitId` | `productcenter.pc_unitref_new` |
| `material_status` | `productcenter.pc_materialstatusref` |
| `iShopID` | `` |
| `volumeUnitId` | `productcenter.pc_unitref_new` |
| `life_cycle_template` | `productcenter.pc_lifecycletemplateref` |
| `orgId` | `productcenter.aa_adminorgref` |
| `defaultSKUId` | `` |
| `manageClass` | `productcenter.pc_managementclassref` |
| `netWeightUnitId` | `productcenter.pc_unitref_new` |
| `taxClass` | `productcenter.pc_taxrevenueref` |
| `ytenant_id` | `` |
| `optional_material_id` | `productcenter.productref` |
| `costClass` | `productcenter.pc_costclassref` |
| `oSPTemplate_id` | `productcenter.pc_producttplref` |
| `internal_supply_orgid` | `ucf-org-center.bd_inventoryorg` |
| `iCustID` | `` |
| `purchaseClass` | `productcenter.pc_purchaseclassref` |
| `product_character_def` | `` |

## 继承接口 (8个, 17字段)

- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **社会化核心企业档案** (`base.itf.ISociCoreArchive`)
  - `sociCoreArchive_id` → `sociCoreArchive_id`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **租户相关** (`coredoc.pub.TenantObselete`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 116 个直连字段

### 文本字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 物料编码 |
| `placeOfOrigin` | `placeOfOrigin` | `placeOfOrigin` | 产地 |
| `manufacturer` | `manufacturer` | `manufacturer` | 生产厂商 |
| `url` | `url` | `url` | 物料首图片 |
| `homepage_business_id` | `homepage_business_id` | `homepageBusinessId` | 物料首页图片业务 |
| `img_business_id` | `img_business_id` | `imgBusinessId` | 物料图片业务 |
| `video_business_id` | `video_business_id` | `videoBusinessId` | 物料视频业务 |
| `erpCode` | `erpCode` | `erpCode` | 外部编码 |
| `productClassPath` | `productClassPath` | `productClassPath` | 商品分类路径 |
| `cPlatFormRemark` | `cPlatFormRemark` | `cPlatFormRemark` | 平台处理商家物料备注 |
| `platformCode` | `platformCode` | `platformCode` | 平台编码 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源 |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `sunshinePurchaseNo` | `sunshinePurchaseNo` | `sunshinePurchaseNo` | 阳光采购号 |
| `registrationNo` | `registrationNo` | `registrationNo` | 注册证号 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `orgId` | `orgId` | `orgId` | 管理组织 |
| `transType` | `transType` | `transType` | 物料类型 |
| `manageClass` | `manageClass` | `manageClass` | 物料分类 |
| `oProductClass_id` | `oProductClass_id` | `productClass` | 商品分类 |
| `purchaseClass` | `purchaseClass` | `purchaseClass` | 采购品类 |
| `planClass` | `planClass` | `planClass` | 计划分类 |
| `optional_material_id` | `optional_material_id` | `optionalMaterialId` | 选配物料 |
| `oSPTemplate_id` | `oSPTemplate_id` | `productTemplate` | 物料模板 |
| `productLineId` | `productLineId` | `productLine` | 产品线 |
| `brand_id` | `brand_id` | `brand` | 物料品牌 |
| `life_cycle_template` | `life_cycle_template` | `lifeCycleTemplate` | 物料生命周期模板 |
| `material_status` | `material_status` | `materialStatus` | 物料状态 |
| `couponId` | `couponId` | `couponId` | 卡券 |
| `giftCard_id` | `giftCard_id` | `giftCardId` | 礼品卡 |
| `oUnit_id` | `oUnit_id` | `unit` | 主计量单位 |
| `weightUnitId` | `weightUnitId` | `weightUnit` | 毛重单位 |
| `netWeightUnitId` | `netWeightUnitId` | `netWeightUnit` | 净重单位 |
| `volumeUnitId` | `volumeUnitId` | `volumeUnit` | 体积单位 |
| `taxClass` | `taxClass` | `taxClass` | 税收分类码 |
| `costClass` | `costClass` | `costClass` | 成本分类 |
| `internal_supply_orgid` | `internal_supply_orgid` | `internalSupplyOrgId` | 内部供应组织 |
| `defaultSKUId` | `defaultSKUId` | `defaultSKUId` | 默认SKU |
| `iShopID` | `iShopID` | `shop` | 商家 |
| `iCustID` | `iCustID` | `cust` | 创建者客户 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bEnableAssistUnit` | `bEnableAssistUnit` | `enableAssistUnit` | 启用辅计量 |
| `hasSpecs` | `hasSpecs` | `hasSpecs` | 是否包含属性 |
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |
| `isRegistrationManager` | `isRegistrationManager` | `isRegistrationManager` | 注册证管理 |
| `isAuthorizationManager` | `isAuthorizationManager` | `isAuthorizationManager` | 授权书管理 |

### 整数 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_optional_material` | `is_optional_material` | `isOptionalMaterial` | 是否可选配 |
| `is_derived_material` | `is_derived_material` | `isDerivedMaterial` | 是否派生物料 |
| `use_sku` | `use_sku` | `useSku` | 商品SKU |
| `product_family` | `product_family` | `productFamily` | 产品族 |
| `realProductAttribute` | `realProductAttribute` | `realProductAttribute` | 物料性质 |
| `realProductAttributeType` | `realProductAttributeType` | `realProductAttributeType` | 实物物料属性 |
| `virtualProductAttribute` | `virtualProductAttribute` | `virtualProductAttribute` | 虚拟物料属性 |
| `sales_and_operations` | `sales_and_operations` | `salesAndOperations` | 参与S&OP |
| `iCustomerServiceDay` | `iCustomerServiceDay` | `customerServiceDay` | 售后服务期限 |
| `pto_price_type` | `pto_price_type` | `ptoPriceType` | PTO定价类型-按母件定价(废弃) |
| `couponType` | `couponType` | `couponType` | 卡券类型 |
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |
| `is_batch` | `is_batch` | `isBatch` | 是否批量 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `optionalType` | `optionalType` | `optionalType` | 选配方式 |
| `iUnitUseType` | `iUnitUseType` | `unitUseType` | 设置规则 |
| `iPlatFormStaus` | `iPlatFormStaus` | `platFormStaus` | 平台处理商家物料状态 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `attachmentGroupId` | `attachmentGroupId` | `attachmentGroupId` | 附件分组 |
| `sociCoreArchive_id` | `sociCoreArchive_id` | `sociCoreArchive` | 社会化核心企业档案 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `weight` | `weight` | `weight` | 毛重 |
| `netWeight` | `netWeight` | `netWeight` | 净重 |
| `volume` | `volume` | `volume` | 体积 |
| `length` | `length` | `length` | 长 |
| `width` | `width` | `width` | 宽 |
| `height` | `height` | `height` | 高 |

### multiLanguage (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 物料名称 |
| `cModelDescription` | `cModelDescription` | `modelDescription` | 规格 |
| `cModel` | `cModel` | `model` | 型号 |
| `shareDescription` | `shareDescription` | `shareDescription` | 分享说明 |
| `keywords` | `keywords` | `keywords` | 关键字 |

### other (29个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `productspecitems` | 商品SKU-规格值图片（废弃） |
| `` | `` | `define` | 物料-物料属性 |
| `` | `` | `freeDefine` | 物料-自定义项 |
| `source` | `source` | `source` | 物料来源 |
| `iCreatorType` | `iCreatorType` | `creatorType` | 创建者类型 |
| `logically_delete_type` | `logically_delete_type` | `logicallyDeleteType` | 逻辑删除类型 |
| `` | `` | `defaultSKUOrderProperties` | (停用)物料订单属性(管理组织) |
| `` | `` | `description` | 物料描述 |
| `` | `` | `detail` | （停用）物料详情（管理组织） |
| `` | `` | `productApplyRange` | 物料适用范围 |
| `` | `` | `productApplyRangeGroup` | 物料适用范围组 |
| `` | `` | `productAssistClasses` | 物料辅助分类 |
| `` | `` | `productAssistUnitExchanges` | 物料辅计量换算对照 |
| `` | `` | `productBarCodes` | 物料条码 |
| `` | `` | `productCheckFrees` | (停用)指定核算的规格 |
| `` | `` | `productCustomers` | 物料适用范围 |
| `` | `` | `productDepositTimeDetail` | 物料定金时间关联明细表 |
| `` | `` | `productDetail` | 物料业务信息 |
| `` | `` | `productLoadWays` | 物料装载方式(整合) |
| `` | `` | `productOrgs` | 物料适用范围 |
| `` | `` | `productParams` | (停用)物料参数表(管理组织) |
| `` | `` | `productShops` | 物料适用范围 |
| `` | `` | `productSkuDetailNew` | 物料SKU详情(整合) |
| `` | `` | `productSpecFrees` | (停用)指定核算的规格 |
| `` | `` | `productTags` | (停用)物料标签关联表(管理组织) |
| `` | `` | `product_waimaList` |  |
| `` | `` | `productfreecharacteritems` | 物料特征值冗余表 |
| `` | `` | `productskus` | 物料SKU |
| `` | `` | `time` | (停用)物料定金时间关联(管理组织) |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `product_character_def` | `product_character_def` | `productCharacterDef` | 物料自定义项 |

### MaterialPropCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iProductPropCharacterDefine` | `iProductPropCharacterDefine` | `productPropCharacterDefine` | 物料自定义属性 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
