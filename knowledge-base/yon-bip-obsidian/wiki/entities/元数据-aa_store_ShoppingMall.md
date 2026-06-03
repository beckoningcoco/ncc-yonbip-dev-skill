---
tags: [BIP, 元数据, 数据字典, aa.store.ShoppingMall]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 商城业务 (`aa.store.ShoppingMall`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_shoppingmall` | domain：`yxybase` | 应用：`Marketingpublic` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商城业务 |
| 物理表 | `mp_shoppingmall` |
| 数据库 schema | `yxybase` |
| 所属应用 | `Marketingpublic` |
| 直连字段 | 51 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `dlyFeeRuleId` | `` |
| `ytenant_id` | `` |
| `storeDlyFeeRuleId` | `` |
| `iStoreId` | `` |
| `pcTemplateId` | `` |
| `templateId` | `` |
| `orderTakeTemplateId` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 51 个直连字段

### 文本字段 (28个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `detailAddress` | `detailAddress` | `address` | 详细地址 |
| `beginTime` | `beginTime` | `beginTime` | 营业开始时间 |
| `cAppId` | `cAppId` | `cAppId` | AppID(应用ID) |
| `cPayWay` | `cPayWay` | `cPayWay` | 支付类型 |
| `cPaytypeCodes` | `cPaytypeCodes` | `cPaytypeCodes` | 支付方式 |
| `concatQrcode` | `concatQrcode` | `concatQrcode` | 联系人二维码图片 |
| `deliveryScope` | `deliveryScope` | `deliveryScope` | 行政区划地址编码 |
| `deliveryScopeAddress` | `deliveryScopeAddress` | `deliveryScopeAddress` | 行政区划地址 |
| `deliveryType` | `deliveryType` | `deliveryType` | 配送方式 |
| `endTime` | `endTime` | `endTime` | 营业结束时间 |
| `extendFeild` | `extendFeild` | `extendFeild` | 客服坐席ID |
| `groupreferenceIds` | `groupreferenceIds` | `groupreferenceIds` | 门店组 |
| `mobileManualUrl` | `mobileManualUrl` | `mobileManualUrl` | 移动端手工链接地址 |
| `name` | `name` | `name` | 线上店铺名称 |
| `orderTakeTemplatePage` | `orderTakeTemplatePage` | `orderTakeTemplatePage` | 扫码点单页面 |
| `pcTemplatePage` | `pcTemplatePage` | `pcTemplatePage` | pc端主页 |
| `fenceJsonStr` | `fenceJsonStr` | `polygonPath` | 地图范围坐标集合(依照JSON串保存) |
| `regionCode` | `regionCode` | `regionCode` | 地址编码 |
| `regionName` | `regionName` | `regionName` | 地址名称 |
| `returnDetail` | `returnDetail` | `returnDetail` | 退货信息 |
| `scopeCode` | `scopeCode` | `scopeCode` | 行政区划编码 |
| `scopeName` | `scopeName` | `scopeName` | 行政区划名称 |
| `shopsid` | `shopsid` | `shopsid` | 门店组id |
| `shopsname` | `shopsname` | `shopsname` | 门店组名称 |
| `siteType` | `siteType` | `siteType` | 站点类型 |
| `templatePage` | `templatePage` | `templatePage` | 移动端主页 |
| `unionPayMid` | `unionPayMid` | `unionPayMid` | 支付商户号 |
| `unionPaytid` | `unionPaytid` | `unionPaytid` | 支付终端号 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dlyFeeRuleId` | `dlyFeeRuleId` | `dlyFeeRuleId` | 运费模板 |
| `orderTakeTemplateId` | `orderTakeTemplateId` | `orderTakeTemplateId` | 扫码点单页面模板id |
| `pcTemplateId` | `pcTemplateId` | `pcTemplateId` | pc端主页模板id |
| `iStoreId` | `iStoreId` | `store` | 所属门店主表 |
| `storeDlyFeeRuleId` | `storeDlyFeeRuleId` | `storeDlyFeeRuleId` | 门店配送运费模板ID |
| `templateId` | `templateId` | `templateId` | 移动端主页模板id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iDeleted` | `iDeleted` | `iDeleted` | 是否删除 |
| `iStart` | `iStart` | `iStart` | 启用状态 |
| `isHeadQuarters` | `isHeadQuarters` | `isHeadQuarters` | 总部 |

### 短整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cInventoryType` | `cInventoryType` | `cInventoryType` | 库存规则 |
| `closed` | `closed` | `closed` | 是否打烊 |
| `iDistributionMode` | `iDistributionMode` | `iDistributionMode` | 商城配送范围 |
| `iHotSpot` | `iHotSpot` | `iHotSpot` | 热门区域 |
| `mobilePageType` | `mobilePageType` | `mobilePageType` | 移动端页面类型 |
| `referenceRetailPrice` | `referenceRetailPrice` | `referenceRetailPrice` | 商品取价规则 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `referenceId` | `referenceId` | `referenceId` | 交货门店id |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fDistributionRadius` | `fDistributionRadius` | `fDistributionRadius` | 配送半径 |
| `latitude` | `latitude` | `latitude` | 纬度 |
| `longitude` | `longitude` | `longitude` | 经度 |
| `minDeliveryFee` | `minDeliveryFee` | `minDeliveryFee` | 起送费 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
