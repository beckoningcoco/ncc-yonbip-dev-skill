---
tags: [BIP, 元数据, 数据字典, aa.store.Store]
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

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_store` | domain：`yxybase` | 应用：`Marketingpublic` | 业务对象ID：`d7d5dd19-6601-4c3a-8ecf-69c48898e38f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 终端 |
| 物理表 | `mp_store` |
| domain/服务域 | `yxybase` |
| schema | `pricecenter` |
| 所属应用 | `Marketingpublic` |
| 直连字段 | 102 个 |
| 子表 | 12 个 |
| 关联引用 | 31 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `storeLabels` | `aa.store.StoreLabel` | composition |
| `businessLicense` | `aa.store.BusinessLicense` | composition |
| `storeSupplier` | `aa.store.StoreSupplier` | composition |
| `salesBusinessInfo` | `aa.store.SalesBusinessInfo` | composition |
| `warehouses` | `aa.store.StoreOweWarehouse` | composition |
| `shoppingMall` | `aa.store.ShoppingMall` | composition |
| `storeCustomItem` | `aa.store.StoreCustomItem` | composition |
| `storePhoto` | `aa.store.StorePhoto` | composition |
| `electronicCommerce` | `aa.store.ElectronicCommerce` | composition |
| `iQRCode` | `aa.store.IQRCode` | composition |
| `mallFreightTemplateList` | `aa.store.MallFreightTemplate` | composition |
| `relatedPerson` | `aa.store.RelatedPerson` | composition |

## 关联引用 (31个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `iStorelevelID` | `yxybase.aa_storelevel` |
| `bizFlowId` | `` |
| `inventoryOrg` | `ucf-org-center.bd_inventoryorg` |
| `iVendorID` | `` |
| `iSupplierID` | `productcenter.aa_merchantoutref` |
| `iAreaclassID` | `productcenter.aa_salearearef` |
| `iChannelCustomerClassID` | `productcenter.aa_custcategoryref` |
| `tenant_id` | `` |
| `iOrgID` | `ucf-org-center.bd_salesorg` |
| `ytenant_id` | `` |
| `iProductsOfStoreID` | `yxybase.aa_productsofstoreref` |
| `iDeptID` | `ucf-org-center.bd_adminorgsharetreeref` |
| `iWarehouseID` | `productcenter.aa_warehouse_stocksref` |
| `storeDefineCharacter` | `` |
| `iChainSystem` | `aa_chainsystemref` |
| `iTerminalCategoryID` | `aa_storecategory` |
| `partner` | `` |
| `iCustShippingAddressID` | `productcenter.aa_merchantaddressref` |
| `iCustID` | `productcenter.aa_merchantoutref` |

## 继承接口 (8个, 9字段)

- **位置信息** (`base.itf.IPosition`)
  - `` → ``
  - `` → ``
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **客户接口** (`aa.itf.ICust`)
  - `iCustID` → `iCustID`
- **客户接口** (`aa.itf.ICustAll`)
- **客户收货地址接口** (`aa.itf.ICustShippingAddress`)
  - `iCustShippingAddressID` → `iCustShippingAddressID`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **流程接口** (`base.itf.IBusinessFlow`)
  - `bizFlowId` → `bizFlowId`
  - `isFlowCoreBill` → `isFlowCoreBill`

## 字段列表（按类型分组）

> 共 102 个直连字段

### 文本字段 (37个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cPhotoList` | `cPhotoList` | `cPhotoList` | 相册id集合 |
| `cScanQrCodeUrl` | `cScanQrCodeUrl` | `cScanQrCodeUrl` | 支付二维码 |
| `codeType` | `codeType` | `codeType` | 二维码类型 |
| `creatorId` | `creatorId` | `creatorId` | 创建人 |
| `modifierId` | `modifierId` | `modifierId` | 修改人 |
| `cEnterpriseName` | `cEnterpriseName` | `enterpriseName` | 工商企业名称 |
| `cMoney` | `cMoney` | `money` | 注册资本 |
| `cQrcodeUrl` | `cQrcodeUrl` | `qrcodeUrl` | 门店二维码 |
| `cCode` | `cCode` | `codebianma` | 编码 |
| `cMnemonic` | `cMnemonic` | `mnemonic` | 助记码 |
| `iTerminalType` | `iTerminalType` | `terminalType` | 终端类型 |
| `iPlatformType` | `iPlatformType` | `platformType` | 线上渠道 |
| `cDaima` | `cDaima` | `code` | 终端代码 |
| `cContact` | `cContact` | `contact` | 联系人 |
| `cContactPhone` | `cContactPhone` | `contactPhone` | 联系电话 |
| `social_credit_code` | `social_credit_code` | `socialCreditCode` | 统一社会信用代码 |
| `verify_id` | `verify_id` | `verifyId` | 核实公司id |
| `register_address` | `register_address` | `registerAddress` | 注册地址 |
| `cRegionCode` | `cRegionCode` | `regionCode` | 行政区划代码 |
| `cProvince` | `cProvince` | `province` | 省 |
| `cCity` | `cCity` | `city` | 市 |
| `cArea` | `cArea` | `area` | 区 |
| `deliveryMethod` | `deliveryMethod` | `deliveryMethod` | 配送范围 |
| `polygonPath` | `polygonPath` | `polygonPath` | 电子围栏 |
| `cbusinessStratTime` | `cbusinessStratTime` | `startTime` | 营业时间 |
| `cIntroduction` | `cIntroduction` | `desc` | 简介 |
| `cbusinessEndTime` | `cbusinessEndTime` | `endTime` | 结束时间 |
| `cCreator` | `cCreator` | `creator` | 创建人 |
| `cModifier` | `cModifier` | `modifier` | 修改人 |
| `cPath` | `cPath` | `orgPath` | orgPath |
| `doorPhoto` | `doorPhoto` | `doorPhoto` | 门头照片 |
| `cOutCode` | `cOutCode` | `outCode` | 商家编码 |
| `certificateOfBusiness` | `certificateOfBusiness` | `certificateOfBusiness` | 营业执照 |
| `stop_reason` | `stop_reason` | `stopReason` | 停用原因 |
| `cAddress` | `cAddress` | `address` | 详细地址 |
| `cOutErpCode` | `cOutErpCode` | `customer` | 客户ERP编码 |
| `attachment` | `attachment` | `attachment` | 附件 |

### 引用字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `bizFlowId` | `bizFlowId` | `bizFlow` | 流程ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `iVendorID` | `iVendorID` | `vendor` | 供应商ID |
| `iOrgID` | `iOrgID` | `org` | 销售组织 |
| `iStorelevelID` | `iStorelevelID` | `storeLevel` | 门店等级id |
| `inventoryOrg` | `inventoryOrg` | `inventoryOrg` | 库存组织id |
| `iTerminalCategoryID` | `iTerminalCategoryID` | `terminalCategory` | 终端分类 |
| `iChainSystem` | `iChainSystem` | `chainSystem` | 连锁系统id |
| `iDeptID` | `iDeptID` | `dept` | 所属部门ID |
| `iSupplierID` | `iSupplierID` | `supplier` | 供货商家ID |
| `iChannelCustomerClassID` | `iChannelCustomerClassID` | `channelCustomerClass` | 渠道客户分类ID |
| `iCustID` | `iCustID` | `cust` | 所属客户ID |
| `iCustShippingAddressID` | `iCustShippingAddressID` | `custShippingAddress` | 客户收货地址ID |
| `iAreaclassID` | `iAreaclassID` | `areaClass` | 所属地区ID |
| `iProductsOfStoreID` | `iProductsOfStoreID` | `productsOfStore` | 经营范围 |
| `iWarehouseID` | `iWarehouseID` | `warehouse` | 默认仓库 |
| `partner` | `partner` | `partner` | 伙伴主键 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dCreateDate` | `dCreateDate` | `createDate` | 创建日期 |
| `dModifyDate` | `dModifyDate` | `modifyDate` | 修改日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isFlowCoreBill` | `isFlowCoreBill` | `isFlowCoreBill` | 是否流程核心单据 |
| `iEnableCyclePurchase` | `iEnableCyclePurchase` | `iEnableCyclePurchase` | 启用周期购 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_merged_terminal` | `is_merged_terminal` | `isMergedTerminal` | 被合并网点 |
| `is_ocr_recognition` | `is_ocr_recognition` | `isOcrRecognition` | 是否识别 |
| `maxNumLicence` | `maxNumLicence` | `maxNumLicence` | 最大许可数 |

### 短整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iDefaultMallShop` | `iDefaultMallShop` | `defaultMallShop` | 商城默认店铺 |
| `iSpecifyExistingCustomer` | `iSpecifyExistingCustomer` | `specifyExistingCustomer` | 是否指定已有客户 |
| `iCentralWarehouseDistribution` | `iCentralWarehouseDistribution` | `centralWarehouseDistribution` | 中心仓配送 |
| `iChannelCustomer` | `iChannelCustomer` | `channelCustomer` | 渠道客户 |
| `iMerchantStore` | `iMerchantStore` | `merchantStore` | 商家店铺 |
| `bShareRes` | `bShareRes` | `shareRes` | 资源共享 |
| `iOnlineDelivery` | `iOnlineDelivery` | `iOnlineDelivery` | 线上订单发货 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `kmradius` | `kmradius` | `kmradius` | 配送半径 |
| `circleRadius` | `circleRadius` | `circleRadius` | 半径(米) |
| `iLNG` | `iLNG` | `longitude` | 经度 |
| `iLAT` | `iLAT` | `latitude` | 纬度 |
| `fStoreArea` | `fStoreArea` | `storeArea` | 营业面积 |
| `storeStartupCost` | `storeStartupCost` | `storeStartupCost` | 开店成本 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cBuildTime` | `cBuildTime` | `buildTime` | 成立日期 |
| `ts` | `ts` | `pubts` | 时间戳 |
| `dStopTime` | `dStopTime` | `stoptime` | 停用日期 |
| `dLatestFollowUpTime` | `dLatestFollowUpTime` | `latestFollowUpTime` | 最近跟进时间 |
| `dCreateTime` | `dCreateTime` | `createTime` | 创建时间 |
| `dModifyTime` | `dModifyTime` | `modifyTime` | 修改时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `storeDefineCharacter` | `storeDefineCharacter` | `storeDefineCharacter` | 自定义项特征属性组 |

### multiLanguage (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cName` | `cName` | `name` | 名称 |
| `cCustomerName` | `cCustomerName` | `customerName` | 客户名称 |
| `cWelcome` | `cWelcome` | `welcome` | 扫码欢迎词 |

### other (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iStoreType` | `iStoreType` | `storeType` | 门店类型 |
| `iShopType` | `iShopType` | `shopType` | 店铺类型 |
| `verify_status` | `verify_status` | `verifyStatus` | 是否核实 |
| `iStop` | `iStop` | `stop` | 启用状态 |
| `` | `` | `businessLicense` | 营业执照 |
| `` | `` | `electronicCommerce` | 电商业务 |
| `` | `` | `iQRCode` | 渠道 |
| `` | `` | `mallFreightTemplateList` | 商城业务运费模板 |
| `` | `` | `relatedPerson` | 相关人员 |
| `` | `` | `salesBusinessInfo` | 销售业务信息 |
| `` | `` | `shoppingMall` | 商城业务 |
| `` | `` | `storeCustomItem` | 终端自定义项 |
| `` | `` | `storeLabels` | 终端标签 |
| `` | `` | `storePhoto` | 门店相册 |
| `` | `` | `storeSupplier` | 供货商家 |
| `` | `` | `warehouses` | 门店所属仓库 |
