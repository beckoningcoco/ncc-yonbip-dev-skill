---
tags: [BIP, 元数据, 数据字典, aa, aa.store.Store]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 终端 (`aa.store.Store`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `mp_store` | 应用: `Marketingpublic` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 终端 |
| 物理表 | `mp_store` |
| 应用 | `Marketingpublic` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `cDaima` | |

## 部署信息

- 部署时间: 2026-01-23 23:12:07:000
- 安装来源: `/app/pricecenter/src/yxybase-service/scripts/db/patch/mongodb/V5_R0_2507/0001_yxybase/0010_iuap_common/DML/0270_iuap_metadata/202512/202512231550_metadata_aa-store_delta.zip`

## 术语标记

`doc`, `isMain`, `MasterData`

## 依赖接口（8 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IPosition (`IPosition`) | `base.itf.IPosition` | 118 | 2 |
| IAuto编码 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| ITenant (`ITenant`) | `base.itf.ITenant` | 73 | 1 |
| ICust (`ICust`) | `aa.itf.ICust` | 52 | 1 |
| ICustAll (`ICustAll`) | `aa.itf.ICustAll` | 22 | 0 |
| ICustShippingAddress (`ICustShippingAddress`) | `aa.itf.ICustShippingAddress` | 43 | 1 |
| IYTenantExt (`IYTenantExt`) | `ucfbase.ucfbaseItf.IYTenantExt` | 24 | 1 |
| IBusinessFlow (`IBusinessFlow`) | `base.itf.IBusinessFlow` | 77 | 2 |

---

## 全部属性（102 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `cPhotoList` | PhotoList | `cPhotoList` | String | `text` |  | true |
| 2 | `cScanQrCodeUrl` | ScanQrCodeUrl | `cScanQrCodeUrl` | String | `text` |  | true |
| 3 | `codeType` | codeType(类型) | `codeType` | String | `text` |  | true |
| 4 | `createDate` | 创建日期 | `dCreateDate` | Date | `date` |  | true |
| 5 | `creatorId` | 创建人ID | `creatorId` | String | `text` |  | true |
| 6 | `defaultMallShop` | efaultMallShop(日期) | `iDefaultMallShop` | Short | `short` |  | true |
| 7 | `modifierId` | 修改人ID | `modifierId` | String | `text` |  | true |
| 8 | `modifyDate` | 修改日期 | `dModifyDate` | Date | `date` |  | true |
| 9 | `isMergedTerminal` | 是否MergedTerminal | `is_merged_terminal` | Integer | `int` |  | true |
| 10 | `enterpriseName` | enterprise名称 | `cEnterpriseName` | String | `text` |  | true |
| 11 | `money` | money | `cMoney` | String | `text` |  | true |
| 12 | `buildTime` | buildTime(时间) | `cBuildTime` | DateTime | `timestamp` |  | true |
| 13 | `isOcrRecognition` | 是否OcrRecognition | `is_ocr_recognition` | Integer | `int` |  | true |
| 14 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true |
| 15 | `bizFlow` | bizFlow | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 | `quote` |  | true |
| 16 | `isFlowCoreBill` | 是否FlowCoreBill | `isFlowCoreBill` | Boolean | `switch` |  | true |
| 17 | `qrcodeUrl` | qrcodeUrl | `cQrcodeUrl` | String | `text` |  | true |
| 18 | `storeDefineCharacter` | storeDefineCharacter | `storeDefineCharacter` | 0a977d29-432f-4e11-bfd3-bef875bddc51 | `UserDefine` |  | true |
| 19 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 20 | `vendor` | vendor | `iVendorID` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | true |
| 21 | `org` | org | `iOrgID` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` | true | true |
| 22 | `id` | 主键ID | `id` | Long | `long` |  | true |
| 23 | `codebianma` | odebianma | `cCode` | String | `text` |  | true |
| 24 | `name` | 名称 | `cName` | String | `multiLanguage` |  | true |
| 25 | `mnemonic` | mnemonic | `cMnemonic` | String | `text` |  | true |
| 26 | `terminalType` | terminalType(类型) | `iTerminalType` | String | `text` |  | true |
| 27 | `storeLevel` | storeLevel | `iStorelevelID` | b46e7d42-ed6a-4e20-9e0b-75d45967a3db | `quote` | false | true |
| 28 | `inventoryOrg` | nventoryOrg(ID) | `inventoryOrg` | e18e914b-4518-4e8c-ac21-783145fe7da1 | `quote` |  | true |
| 29 | `storeType` | 门店类型 | `iStoreType` | StoreType | `` |  | true |
| 30 | `shopType` | shopType(类型) | `iShopType` | ShopType | `` |  | true |
| 31 | `platformType` | platformType(类型) | `iPlatformType` | String | `text` |  | true |
| 32 | `iEnableCyclePurchase` | EnableCyclePurchase(ID) | `iEnableCyclePurchase` | Boolean | `switch` |  | true |
| 33 | `code` | 编码 | `cDaima` | String | `text` |  | true |
| 34 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | true |
| 35 | `terminalCategory` | terminalCategory | `iTerminalCategoryID` | 40cc0fc7-3cfe-4621-94bc-b241c0d66936 | `quote` |  | true |
| 36 | `specifyExistingCustomer` | specifyExistingCustomer | `iSpecifyExistingCustomer` | Short | `short` |  | true |
| 37 | `chainSystem` | hainSystem | `iChainSystem` | ba7bad3b-8619-4d8c-8659-5d1bf82cc9f9 | `quote` |  | true |
| 38 | `dept` | ept(日期) | `iDeptID` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 | `quote` |  | true |
| 39 | `contact` | ontact | `cContact` | String | `text` |  | true |
| 40 | `contactPhone` | 联系电话 | `cContactPhone` | String | `text` |  | true |
| 41 | `centralWarehouseDistribution` | entralWarehouseDistribution | `iCentralWarehouseDistribution` | Short | `short` |  | true |
| 42 | `channelCustomer` | hannelCustomer | `iChannelCustomer` | Short | `short` |  | true |
| 43 | `supplier` | supplier | `iSupplierID` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | true |
| 44 | `customerName` | customer名称 | `cCustomerName` | String | `multiLanguage` |  | true |
| 45 | `channelCustomerClass` | hannelCustomerClass | `iChannelCustomerClassID` | 3198ce2d-0e64-462d-bacf-54d18171756a | `quote` |  | true |
| 46 | `socialCreditCode` | socialCredit编码 | `social_credit_code` | String | `text` |  | true |
| 47 | `merchantStore` | merchantStore | `iMerchantStore` | Short | `short` |  | true |
| 48 | `cust` | ust | `iCustID` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | true |
| 49 | `verifyId` | verifyId | `verify_id` | String | `text` |  | true |
| 50 | `custShippingAddress` | ustShippingAddress | `iCustShippingAddressID` | 9fcf5601-f03e-4437-8377-1b82efea453a | `quote` |  | true |
| 51 | `verifyStatus` | verifyStatus(状态) | `verify_status` | VerifyStatus | `` |  | true |
| 52 | `areaClass` | areaClass | `iAreaclassID` | 75fb7b76-fdb5-4e87-ab0d-e4215a299634 | `quote` |  | true |
| 53 | `registerAddress` | registerAddress | `register_address` | String | `text` |  | true |
| 54 | `regionCode` | region编码 | `cRegionCode` | String | `text` |  | true |
| 55 | `province` | province | `cProvince` | String | `text` |  | true |
| 56 | `city` | ity | `cCity` | String | `text` |  | true |
| 57 | `area` | area | `cArea` | String | `text` |  | true |
| 58 | `deliveryMethod` | eliveryMethod(日期) | `deliveryMethod` | String | `text` |  | true |
| 59 | `kmradius` | kmradius | `kmradius` | Decimal | `number` |  | true |
| 60 | `polygonPath` | polygonPath | `polygonPath` | String | `text` | false | true |
| 61 | `circleRadius` | ircleRadius | `circleRadius` | Decimal | `number` |  | true |
| 62 | `longitude` | 经度 | `iLNG` | Decimal | `number` |  | true |
| 63 | `latitude` | 纬度 | `iLAT` | Decimal | `number` |  | true |
| 64 | `storeArea` | 门店面积 | `fStoreArea` | Decimal | `number` |  | true |
| 65 | `startTime` | startTime(时间) | `cbusinessStratTime` | String | `text` |  | true |
| 66 | `welcome` | welcome | `cWelcome` | String | `multiLanguage` |  | true |
| 67 | `desc` | esc(日期) | `cIntroduction` | String | `text` |  | true |
| 68 | `shareRes` | shareRes | `bShareRes` | Short | `short` |  | true |
| 69 | `endTime` | endTime(时间) | `cbusinessEndTime` | String | `text` |  | true |
| 70 | `stop` | stop | `iStop` | StopStore | `` |  | true |
| 71 | `stoptime` | stoptime | `dStopTime` | DateTime | `timestamp` |  | true |
| 72 | `latestFollowUpTime` | latestFollowUpTime(时间) | `dLatestFollowUpTime` | DateTime | `timestamp` |  | true |
| 73 | `creator` | 创建人 | `cCreator` | String | `text` |  | true |
| 74 | `createTime` | 创建时间 | `dCreateTime` | DateTime | `timestamp` |  | true |
| 75 | `modifier` | 修改人 | `cModifier` | String | `text` |  | true |
| 76 | `modifyTime` | 修改时间 | `dModifyTime` | DateTime | `timestamp` |  | true |
| 77 | `productsOfStore` | productsOfStore | `iProductsOfStoreID` | a27b73da-ba81-41cd-aa4d-595d7647eb9e | `quote` |  | true |
| 78 | `orgPath` | 组织路径 | `cPath` | String | `text` |  | true |
| 79 | `maxNumLicence` | maxNumLicence | `maxNumLicence` | Integer | `int` |  | true |
| 80 | `warehouse` | warehouse | `iWarehouseID` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |  | true |
| 81 | `doorPhoto` | oorPhoto(日期) | `doorPhoto` | String | `text` |  | true |
| 82 | `outCode` | out编码 | `cOutCode` | String | `text` |  | true |
| 83 | `certificateOfBusiness` | ertificateOfBusiness | `certificateOfBusiness` | String | `text` |  | true |
| 84 | `stopReason` | stopReason | `stop_reason` | String | `text` |  | true |
| 85 | `address` | 地址 | `cAddress` | String | `text` |  | true |
| 86 | `iOnlineDelivery` | OnlineDelivery(ID) | `iOnlineDelivery` | Short | `short` |  | true |
| 87 | `customer` | ustomer | `cOutErpCode` | String | `text` |  | true |
| 88 | `partner` | partner | `partner` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 | `quote` |  | true |
| 89 | `attachment` | attachment | `attachment` | String | `text` |  | true |
| 90 | `businessLicense` | businessLicense | `` | 0a8bf0af-a906-414e-b0b3-a3e0d40a3226 | `` |  |  |
| 91 | `electronicCommerce` | electronicCommerce | `` | 3930b27f-e8c3-471d-9f4d-7fed3f5bfe44 | `` |  |  |
| 92 | `iQRCode` | iQR编码 | `` | 4bf4c022-f2df-473c-a7b5-36894a2f8773 | `` |  |  |
| 93 | `mallFreightTemplateList` | mallFreightTemplateList | `` | 6c7eed8f-3b64-444a-9edc-0b6e9275d591 | `` |  |  |
| 94 | `relatedPerson` | relatedPerson | `` | d92b034c-aa87-4abe-9a54-70c314676406 | `` |  |  |
| 95 | `salesBusinessInfo` | salesBusinessInfo | `` | 4c9719dd-4a85-4395-8964-fa2d63988401 | `` |  |  |
| 96 | `shoppingMall` | shoppingMall | `` | 7760d7a3-6728-4542-9d99-7a45514d5977 | `` |  |  |
| 97 | `storeCustomItem` | storeCustomItem | `` | 47085bda-c031-4fc3-b751-dc885099efe5 | `` |  |  |
| 98 | `storeLabels` | storeLabels | `` | 343db890-78ad-4d52-a330-afc43d4d3d61 | `` |  |  |
| 99 | `storePhoto` | storePhoto | `` | 5da51e42-af53-4ab7-b124-b5d40f24e6be | `` |  |  |
| 100 | `storeStartupCost` | storeStartupCost | `storeStartupCost` | Decimal | `number` |  | true |
| 101 | `storeSupplier` | storeSupplier | `` | 2d54a119-e5e6-4a02-8d63-411e16096070 | `` |  |  |
| 102 | `warehouses` | warehouses | `` | 4f1f2dbf-8424-413a-9c4f-ad60e1ea6031 | `` |  |  |

## 关联属性（31 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `storeLabels` | storeLabels | `aa.store.StoreLabel` | `` | storeLabels → terminal | 0..n | Y | None |  |
| 2 | `businessLicense` | businessLicense | `aa.store.BusinessLicense` | `` | businessLicense → store | 0..n | Y | None |  |
| 3 | `storeLevel` | storeLevel | `aa.store.StoreLevel` | `iStorelevelID` | 外键 |  |  | None |  |
| 4 | `bizFlow` | bizFlow | `bf.bizflow.BusinessFlow` | `bizFlowId` | 外键 |  |  | Service |  |
| 5 | `storePhoto` | storePhoto | `aa.store.StorePhoto` | `` | storePhoto → store | 0..n | Y | None |  |
| 6 | `inventoryOrg` | nventoryOrg(ID) | `org.func.InventoryOrg` | `inventoryOrg` | 外键 |  |  | Service |  |
| 7 | `salesBusinessInfo` | salesBusinessInfo | `aa.store.SalesBusinessInfo` | `` | salesBusinessInfo → store | 0..n | Y | None |  |
| 8 | `vendor` | vendor | `aa.vendor.Vendor` | `iVendorID` | 外键 |  |  | Service |  |
| 9 | `supplier` | supplier | `aa.merchant.Merchant` | `iSupplierID` | 外键 |  |  | Service |  |
| 10 | `areaClass` | areaClass | `aa.salearea.SaleArea` | `iAreaclassID` | 外键 |  |  | Service |  |
| 11 | `storeCustomItem` | storeCustomItem | `aa.store.StoreCustomItem` | `` | storeCustomItem → id | 1 | Y | None |  |
| 12 | `channelCustomerClass` | hannelCustomerClass | `aa.custcategory.CustCategory` | `iChannelCustomerClassID` | 外键 |  |  | Service |  |
| 13 | `iQRCode` | iQR编码 | `aa.store.IQRCode` | `` | iQRCode → iStoreId | 1 | Y | None |  |
| 14 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | Service |  |
| 15 | `storeSupplier` | storeSupplier | `aa.store.StoreSupplier` | `` | storeSupplier → store | 0..n | Y | None |  |
| 16 | `org` | org | `org.func.BaseOrg` | `iOrgID` | 外键 |  |  | Service |  |
| 17 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 18 | `warehouses` | warehouses | `aa.store.StoreOweWarehouse` | `` | warehouses → store | 0..n | Y | None |  |
| 19 | `productsOfStore` | productsOfStore | `aa.productsofstore.ProductsofStore` | `iProductsOfStoreID` | 外键 |  |  | None |  |
| 20 | `shoppingMall` | shoppingMall | `aa.store.ShoppingMall` | `` | shoppingMall → store | 1 | Y | None |  |
| 21 | `dept` | ept(日期) | `aa.baseorg.DeptMV` | `iDeptID` | 外键 |  |  | Service |  |
| 22 | `warehouse` | warehouse | `aa.warehouse.Warehouse` | `iWarehouseID` | 外键 |  |  | Service |  |
| 23 | `storeDefineCharacter` | storeDefineCharacter | `aa.store.StoreDefineCharacter` | `storeDefineCharacter` | 外键 |  |  | None |  |
| 24 | `chainSystem` | hainSystem | `aa.store.ChainSystem` | `iChainSystem` | 外键 |  |  | None |  |
| 25 | `relatedPerson` | relatedPerson | `aa.store.RelatedPerson` | `` | relatedPerson → store | 0..n | Y | None |  |
| 26 | `terminalCategory` | terminalCategory | `aa.store.StoreCategory` | `iTerminalCategoryID` | 外键 |  |  | None |  |
| 27 | `partner` | partner | `aa.merchant.Merchant` | `partner` | 外键 |  |  | Service |  |
| 28 | `custShippingAddress` | ustShippingAddress | `aa.merchant.AddressInfo` | `iCustShippingAddressID` | 外键 |  |  | Service |  |
| 29 | `cust` | ust | `aa.merchant.Merchant` | `iCustID` | 外键 |  |  | Service |  |
| 30 | `electronicCommerce` | electronicCommerce | `aa.store.ElectronicCommerce` | `` | electronicCommerce → store | 0..n | Y | None |  |
| 31 | `mallFreightTemplateList` | mallFreightTemplateList | `aa.store.MallFreightTemplate` | `` | mallFreightTemplateList → storeId | 0..n | Y | None |  |

---

## SQL 示例

```sql
SELECT cPhotoList, cScanQrCodeUrl, codeType, dCreateDate, creatorId, iDefaultMallShop, modifierId, dModifyDate
FROM mp_store
```