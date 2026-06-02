---
tags: [BIP, 元数据, 数据字典, pc, pc.product.Product]
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

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `product` | 应用: `GZTBDM` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料 |
| 物理表 | `product` |
| 应用 | `GZTBDM` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-05-22 23:00:11:000
- 安装来源: `/app/ugoods/upc/src/upc-server/scripts/db/patch/mongodb/V7_R0_2507/0001_material/0010_iuap_common/DML/0270_iuap_metadata/20260515-itr/202604132057_metadata_pc-product_delta.zip`

## 术语标记

`isBusinessLog`, `isAssigned`, `isExtend`, `isMultiCodeRule`, `MasterData`, `doc`, `DirectConnection`, `isCacheRefData`, `isUseCondition`

## 依赖接口（8 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| Deletable (`Deletable`) | `base.itf.Deletable` | 67 | 1 |
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| IErp编码 (`IErpCode`) | `base.itf.IErpCode` | 73 | 1 |
| ISociCoreArchive (`ISociCoreArchive`) | `base.itf.ISociCoreArchive` | 28 | 1 |
| IAuto编码 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| ISocialMcType(类型) (`ISocialMcType`) | `bd.social.ISocialMcType` | 977 | 3 |
| TenantObselete (`TenantObselete`) | `coredoc.pub.TenantObselete` | 43 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（116 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 2 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 3 | `orgId` | 组织ID | `orgId` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | true |
| 4 | `code` | 编码 | `code` | String | `text` |  | true |
| 5 | `name` | 名称 | `name` | String | `multiLanguage` |  | true |
| 6 | `modelDescription` | modelDescription | `cModelDescription` | String | `multiLanguage` |  | true |
| 7 | `model` | model | `cModel` | String | `multiLanguage` |  | true |
| 8 | `transType` | transType(类型) | `transType` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | true |
| 9 | `productspecitems` | productspecitems | `` | ecd93788-e454-46e1-9ac1-204e4652d235 | `` |  |  |
| 10 | `define` | efine(日期) | `` | 7a1a021a-657f-47e9-a14d-dbd88a18d5bf | `` |  |  |
| 11 | `freeDefine` | reeDefine(金额) | `` | eb7d9145-cb45-4a96-974a-c2877736eb38 | `` |  |  |
| 12 | `manageClass` | manageClass | `manageClass` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |  | true |
| 13 | `productClass` | 产品分类 | `oProductClass_id` | 5ad8fc93-4e6b-409f-a70f-462efa6fcee9 | `quote` |  | true |
| 14 | `purchaseClass` | purchaseClass | `purchaseClass` | ec3f827d-4cff-462d-b74c-1dd556c96baa | `quote` |  | true |
| 15 | `planClass` | planClass | `planClass` | 5f9b1ee7-d6e8-4ba0-b5d7-6728fa089ae3 | `quote` |  | true |
| 16 | `isOptionalMaterial` | 是否OptionalMaterial | `is_optional_material` | Integer | `int` |  | true |
| 17 | `optionalType` | optionalType(类型) | `optionalType` | Short | `short` |  | true |
| 18 | `isDerivedMaterial` | 是否DerivedMaterial | `is_derived_material` | Integer | `int` |  | true |
| 19 | `optionalMaterialId` | optionalMaterialId | `optional_material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | true |
| 20 | `productTemplate` | productTemplate | `oSPTemplate_id` | c40d564b-d166-4e0e-875f-1fafdab28955 | `quote` |  | true |
| 21 | `useSku` | useSku | `use_sku` | Integer | `int` |  | true |
| 22 | `productFamily` | productFamily | `product_family` | Integer | `int` |  | true |
| 23 | `productLine` | 产品线 | `productLineId` | fcdf5213-a995-4874-928f-ff97bcfa4b91 | `quote` |  | true |
| 24 | `brand` | brand | `brand_id` | 75116b40-efe4-455e-b62d-d56ac4811eb1 | `quote` |  | true |
| 25 | `placeOfOrigin` | placeOfOrigin | `placeOfOrigin` | String | `text` |  | true |
| 26 | `manufacturer` | manufacturer | `manufacturer` | String | `text` |  | true |
| 27 | `lifeCycleTemplate` | lifeCycleTemplate | `life_cycle_template` | 5597146c-9a8e-4fb8-ad04-4c6af0696600 | `quote` |  | true |
| 28 | `materialStatus` | materialStatus(状态) | `material_status` | 84a32a36-3aa1-444f-8155-79e7ce0869c8 | `quote` |  | true |
| 29 | `realProductAttribute` | realProductAttribute | `realProductAttribute` | Integer | `int` |  | true |
| 30 | `realProductAttributeType` | realProductAttributeType(类型) | `realProductAttributeType` | Integer | `int` |  | true |
| 31 | `virtualProductAttribute` | virtualProductAttribute | `virtualProductAttribute` | Integer | `int` |  | true |
| 32 | `couponId` | couponId | `couponId` | 01269572-184b-47c7-ad59-d4125d0f8cce | `quote` |  | true |
| 33 | `giftCardId` | giftCardId | `giftCard_id` | ad55be22-aca7-4de2-96f7-8c3167128542 | `quote` |  | true |
| 34 | `unitUseType` | unitUseType(类型) | `iUnitUseType` | Short | `short` |  | true |
| 35 | `unit` | unit | `oUnit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | true |
| 36 | `enableAssistUnit` | enableAssistUnit | `bEnableAssistUnit` | Boolean | `switch` |  | true |
| 37 | `weight` | 重量 | `weight` | Decimal | `number` |  | true |
| 38 | `weightUnit` | weightUnit | `weightUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | true |
| 39 | `netWeight` | netWeight | `netWeight` | Decimal | `number` |  | true |
| 40 | `netWeightUnit` | netWeightUnit | `netWeightUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | true |
| 41 | `volume` | 体积 | `volume` | Decimal | `number` |  | true |
| 42 | `volumeUnit` | volumeUnit | `volumeUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | true |
| 43 | `length` | 长度 | `length` | Decimal | `number` |  | true |
| 44 | `width` | 宽度 | `width` | Decimal | `number` |  | true |
| 45 | `height` | 高度 | `height` | Decimal | `number` |  | true |
| 46 | `taxClass` | taxClass | `taxClass` | d81afee5-cdcb-4c02-b2ac-054f55275897 | `quote` |  | true |
| 47 | `salesAndOperations` | salesAndOperations | `sales_and_operations` | Integer | `int` |  | true |
| 48 | `costClass` | ostClass | `costClass` | 80e9c421-f9e9-4752-b1e9-7c240cb2fc1f | `quote` |  | true |
| 49 | `internalSupplyOrgId` | internalSupplyOrgId | `internal_supply_orgid` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | true |
| 50 | `customerServiceDay` | ustomerServiceDay | `iCustomerServiceDay` | Integer | `int` |  | true |
| 51 | `shareDescription` | shareDescription | `shareDescription` | String | `multiLanguage` |  | true |
| 52 | `keywords` | keywords | `keywords` | String | `multiLanguage` |  | true |
| 53 | `url` | url | `url` | String | `text` |  | true |
| 54 | `homepageBusinessId` | homepageBusinessId | `homepage_business_id` | String | `text` |  | true |
| 55 | `imgBusinessId` | imgBusinessId | `img_business_id` | String | `text` |  | true |
| 56 | `videoBusinessId` | videoBusinessId | `video_business_id` | String | `text` |  | true |
| 57 | `attachmentGroupId` | attachmentGroupId | `attachmentGroupId` | Long | `long` |  | true |
| 58 | `erpCode` | erp编码 | `erpCode` | String | `text` |  | true |
| 59 | `productClassPath` | productClassPath | `productClassPath` | String | `text` |  | true |
| 60 | `hasSpecs` | hasSpecs | `hasSpecs` | Boolean | `switch` |  | true |
| 61 | `defaultSKUId` | defaultSKUId | `defaultSKUId` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |  | true |
| 62 | `ptoPriceType` | ptoPriceType(类型) | `pto_price_type` | Integer | `int` |  | true |
| 63 | `couponType` | couponType(类型) | `couponType` | Integer | `int` |  | true |
| 64 | `productCharacterDef` | productCharacterDef | `product_character_def` | aaeeced0-c14a-4d49-ad04-2ce42771c2fa | `UserDefine` |  | true |
| 65 | `productPropCharacterDefine` | productPropCharacterDefine | `iProductPropCharacterDefine` | 34e76385-7dbd-4fd1-91ff-56ead36c9565 | `MaterialPropCT` |  | true |
| 66 | `source` | source | `source` | ProductSource | `` |  | true |
| 67 | `creatorType` | creatorType(类型) | `iCreatorType` | CreatorType | `` |  | true |
| 68 | `shop` | shop | `iShopID` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | true |
| 69 | `platFormStaus` | platFormStaus | `iPlatFormStaus` | Short | `short` |  | true |
| 70 | `cPlatFormRemark` | PlatFormRemark | `cPlatFormRemark` | String | `text` |  | true |
| 71 | `cust` | ust | `iCustID` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | true |
| 72 | `platformCode` | platform编码 | `platformCode` | String | `text` |  | true |
| 73 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |  | true |
| 74 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |  | true |
| 75 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |  | true |
| 76 | `sociCoreArchive` | sociCoreArchive | `sociCoreArchive_id` | Long | `long` |  | true |
| 77 | `isBatch` | 是否Batch | `is_batch` | Integer | `int` |  | true |
| 78 | `logicallyDeleteType` | logicallyDeleteType(类型) | `logically_delete_type` | LogicallyDeleteType | `` |  | true |
| 79 | `isDeleted` | 是否Deleted | `iDeleted` | Boolean | `switch` |  | true |
| 80 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 81 | `isRegistrationManager` | 是否RegistrationManager | `isRegistrationManager` | Boolean | `switch` |  | true |
| 82 | `isAuthorizationManager` | 是否AuthorizationManager | `isAuthorizationManager` | Boolean | `switch` |  | true |
| 83 | `sunshinePurchaseNo` | sunshinePurchaseNo | `sunshinePurchaseNo` | String | `text` |  | true |
| 84 | `registrationNo` | registrationNo | `registrationNo` | String | `text` |  | true |
| 85 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 86 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 87 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 88 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 89 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 90 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 91 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 92 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 93 | `tenant` | tenant | `tenant_id` | Long | `long` | true | true |
| 94 | `defaultSKUOrderProperties` | efaultSKUOrderProperties(日期) | `` | ffe4348b-a1f1-41fe-a489-253ea8ff22d4 | `` |  |  |
| 95 | `description` | 描述 | `` | e6b9fe0e-5479-4951-b240-c4820f5eccd9 | `` |  |  |
| 96 | `detail` | etail(日期) | `` | 65319ec8-ef40-4b1c-82cf-b5c7e646ffdf | `` |  |  |
| 97 | `productApplyRange` | productApplyRange | `` | ed1f55f2-a3f7-4617-8bd2-7f2f404843ab | `` |  |  |
| 98 | `productApplyRangeGroup` | productApplyRangeGroup | `` | 835f8ff1-6fbb-4e12-8b9e-bae87db98b64 | `` |  |  |
| 99 | `productAssistClasses` | productAssistClasses | `` | 17002e15-b160-4b71-be81-90050b484bb4 | `` |  |  |
| 100 | `productAssistUnitExchanges` | productAssistUnitExchanges | `` | 29ceaa4e-0c8c-41b0-bb31-42ee46f8a530 | `` |  |  |
| 101 | `productBarCodes` | productBarCodes | `` | ddab7c90-d6a4-49a6-b6f5-aa9d8e5b31e0 | `` |  |  |
| 102 | `productCheckFrees` | productCheckFrees | `` | 222f69f1-57e1-4d12-abd4-8d5b24dfd4ee | `` |  |  |
| 103 | `productCustomers` | productCustomers | `` | ed1f55f2-a3f7-4617-8bd2-7f2f404843ab | `` |  |  |
| 104 | `productDepositTimeDetail` | productDepositTimeDetail | `` | 50af4617-0d26-41d3-a575-2fda1f544f2d | `` |  |  |
| 105 | `productDetail` | productDetail | `` | 04616b02-47f8-4821-8c02-2e7a6d3264a8 | `` |  |  |
| 106 | `productLoadWays` | productLoadWays | `` | 3c00f201-5ce7-4cfc-bc56-d214ae327f98 | `` |  |  |
| 107 | `productOrgs` | productOrgs | `` | ed1f55f2-a3f7-4617-8bd2-7f2f404843ab | `` |  |  |
| 108 | `productParams` | productParams | `` | 4792dd15-bc42-4272-96e0-5fac15f3f550 | `` |  |  |
| 109 | `productShops` | productShops | `` | ed1f55f2-a3f7-4617-8bd2-7f2f404843ab | `` |  |  |
| 110 | `productSkuDetailNew` | productSkuDetailNew | `` | da35aa40-15cd-4e54-b5fb-4608d40aa13c | `` |  |  |
| 111 | `productSpecFrees` | productSpecFrees | `` | 222f69f1-57e1-4d12-abd4-8d5b24dfd4ee | `` |  |  |
| 112 | `productTags` | productTags | `` | 4b164737-acf7-4498-a65b-c7556f42ca8a | `` |  |  |
| 113 | `product_waimaList` | product_waimaList | `` | a7e44832-56ac-40a5-84f8-9eeeb8f80fb1 | `` |  |  |
| 114 | `productfreecharacteritems` | productfreecharacteritems | `` | 21570b2f-6eeb-438c-9ab0-3b2625e6b9b3 | `` |  |  |
| 115 | `productskus` | productskus | `` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `` |  |  |
| 116 | `time` | time | `` | 9c29fa3c-ed0f-4daf-9ab3-eaf87a5b6f83 | `` |  |  |

## 关联属性（55 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `productAssistUnitExchanges` | productAssistUnitExchanges | `pc.product.ProductAssistUnitExchange` | `` | productAssistUnitExchanges → productId | 0..n | Y | None |  |
| 2 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 3 | `productOrgs` | productOrgs | `pc.product.ProductApplyRange` | `` | productOrgs → productId | 0..n | Y | None | true |
| 4 | `couponId` | couponId | `uhybase.coupon.Coupon` | `couponId` | 外键 |  |  | Service |  |
| 5 | `planClass` | planClass | `pc.cls.PlanClass` | `planClass` | 外键 |  |  | None |  |
| 6 | `productSpecFrees` | productSpecFrees | `pc.product.ProductCheckFreeExtend` | `` | productSpecFrees → productId | 0..n | Y | None | true |
| 7 | `productLine` | 产品线 | `pc.productline.ProductLine` | `productLineId` | 外键 |  |  | None |  |
| 8 | `giftCardId` | giftCardId | `pmc.giftcard.GiftCard` | `giftCard_id` | 外键 |  |  | Service |  |
| 9 | `productApplyRange` | productApplyRange | `pc.product.ProductApplyRange` | `` | productApplyRange → productId | 0..n | Y | None |  |
| 10 | `productspecitems` | productspecitems | `pc.product.ProductSpecItem` | `` | productspecitems → productId | 0..n | Y | None | true |
| 11 | `productPropCharacterDefine` | productPropCharacterDefine | `pc.product.ProductPropCharacterDefine` | `iProductPropCharacterDefine` | 外键 |  |  | None |  |
| 12 | `brand` | brand | `pc.brand.Brand` | `brand_id` | 外键 |  |  | None |  |
| 13 | `productClass` | 产品分类 | `pc.cls.PresentationClass` | `oProductClass_id` | 外键 |  |  | None |  |
| 14 | `productSkuDetailNew` | productSkuDetailNew | `pc.product.ProductSkuDetailNew` | `` | productSkuDetailNew → productId | 0..n | Y | None |  |
| 15 | `product_waimaList` | product_waimaList | `pc.product.product_waima` | `` | product_waimaList → foreignerKey | 0..n | Y | None |  |
| 16 | `productfreecharacteritems` | productfreecharacteritems | `pc.product.ProductFreeCharacterItem` | `` | productfreecharacteritems → productId | 0..n | Y | None | true |
| 17 | `unit` | unit | `pc.unit.Unit` | `oUnit_id` | 外键 |  |  | None |  |
| 18 | `transType` | transType(类型) | `bd.bill.TransType` | `transType` | 外键 |  |  | Service |  |
| 19 | `productLoadWays` | productLoadWays | `pc.product.ProductLoadWay` | `` | productLoadWays → productId | 0..n | Y | None |  |
| 20 | `detail` | etail(日期) | `pc.product.ProductExtend` | `` | detail → id | 1 | Y | None | true |
| 21 | `weightUnit` | weightUnit | `pc.unit.Unit` | `weightUnitId` | 外键 |  |  | None |  |
| 22 | `productTags` | productTags | `pc.product.ProductTagExtend` | `` | productTags → productId | 0..n | Y | None | true |
| 23 | `materialStatus` | materialStatus(状态) | `pc.manage.MaterialStatus` | `material_status` | 外键 |  |  | None |  |
| 24 | `productskus` | productskus | `pc.product.ProductSKU` | `` | productskus → productId | 0..n | Y | None |  |
| 25 | `shop` | shop | `aa.merchant.Merchant` | `iShopID` | 外键 |  |  | None |  |
| 26 | `productShops` | productShops | `pc.product.ProductApplyRange` | `` | productShops → productId | 0..n | Y | None | true |
| 27 | `volumeUnit` | volumeUnit | `pc.unit.Unit` | `volumeUnitId` | 外键 |  |  | None |  |
| 28 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 29 | `description` | 描述 | `pc.product.ProductDescription` | `` | description → productId | 1 | Y | None |  |
| 30 | `lifeCycleTemplate` | lifeCycleTemplate | `pc.manage.LifeCycleTemplate` | `life_cycle_template` | 外键 |  |  | None |  |
| 31 | `orgId` | 组织ID | `bd.adminOrg.BaseOrgVO` | `orgId` | 外键 |  |  | Service |  |
| 32 | `productParams` | productParams | `pc.product.ProductParameterExtend` | `` | productParams → productId | 0..n | Y | None | true |
| 33 | `productAssistClasses` | productAssistClasses | `pc.product.ProductAssistClass` | `` | productAssistClasses → productId | 0..n | Y | None |  |
| 34 | `defaultSKUId` | defaultSKUId | `pc.product.ProductSKU` | `defaultSKUId` | 外键 |  |  | None |  |
| 35 | `manageClass` | manageClass | `pc.cls.ManagementClass` | `manageClass` | 外键 |  |  | None |  |
| 36 | `productApplyRangeGroup` | productApplyRangeGroup | `pc.product.ProductApplyRangeGroup` | `` | productApplyRangeGroup → productId | 0..n | Y | None |  |
| 37 | `define` | efine(日期) | `pc.product.ProductDefine` | `` | define → productId | 1 | Y | None | true |
| 38 | `productDepositTimeDetail` | productDepositTimeDetail | `pc.product.ProductDepositTimeDetail` | `` | productDepositTimeDetail → productId | 0..n | Y | None |  |
| 39 | `netWeightUnit` | netWeightUnit | `pc.unit.Unit` | `netWeightUnitId` | 外键 |  |  | None |  |
| 40 | `taxClass` | taxClass | `taxpubdoc.taxesClassification.TaxesClassification` | `taxClass` | 外键 |  |  | Service | true |
| 41 | `productCheckFrees` | productCheckFrees | `pc.product.ProductCheckFreeExtend` | `` | productCheckFrees → productId | 0..n | Y | None | true |
| 42 | `defaultSKUOrderProperties` | efaultSKUOrderProperties(日期) | `pc.product.SKUOrderPropertyExtend` | `` | defaultSKUOrderProperties → productId | 0..n | Y | None | true |
| 43 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 44 | `productDetail` | productDetail | `pc.product.ProductDetail` | `` | productDetail → productId | 0..n | Y | None |  |
| 45 | `optionalMaterialId` | optionalMaterialId | `pc.product.Product` | `optional_material_id` | 外键 |  |  | None |  |
| 46 | `productCustomers` | productCustomers | `pc.product.ProductApplyRange` | `` | productCustomers → productId | 0..n | Y | None | true |
| 47 | `costClass` | ostClass | `pc.cls.CostClass` | `costClass` | 外键 |  |  | None | true |
| 48 | `productTemplate` | productTemplate | `pc.tpl.ProductTpl` | `oSPTemplate_id` | 外键 |  |  | None |  |
| 49 | `freeDefine` | reeDefine(金额) | `pc.product.ProductFreeDefine` | `` | freeDefine → id | 1 | Y | None | true |
| 50 | `internalSupplyOrgId` | internalSupplyOrgId | `bd.adminOrg.BaseOrgVO` | `internal_supply_orgid` | 外键 |  |  | Service | true |
| 51 | `time` | time | `pc.product.ProductDepositTimeExtend` | `` | time → productId | 1 | Y | None | true |
| 52 | `cust` | ust | `aa.merchant.Merchant` | `iCustID` | 外键 |  |  | None | true |
| 53 | `purchaseClass` | purchaseClass | `pc.cls.PurchaseClass` | `purchaseClass` | 外键 |  |  | None |  |
| 54 | `productBarCodes` | productBarCodes | `pc.product.ProductBarCode` | `` | productBarCodes → productId | 0..n | Y | None |  |
| 55 | `productCharacterDef` | productCharacterDef | `pc.product.ProductCharacterDef` | `product_character_def` | 外键 |  |  | None |  |

---

## SQL 示例

```sql
SELECT id, ytenant_id, orgId, code, name, cModelDescription, cModel, transType
FROM product
```