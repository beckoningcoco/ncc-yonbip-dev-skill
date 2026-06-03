---
tags: [BIP, 元数据, 数据字典, cust.customeraddapply.AddressInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 申请单地址信息 (`cust.customeraddapply.AddressInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_customeraddapply_address` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 申请单地址信息 |
| 物理表 | `cust_customeraddapply_address` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CUST` |
| 直连字段 | 35 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `address_info_character` | `` |
| `cReceivingWarehouse` | `` |
| `imerchantId` | `` |
| `ytenant_id` | `` |
| `shipregion` | `` |
| `oAddress_id` | `` |

## 继承接口 (2个, 2字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`

## 字段列表（按类型分组）

> 共 35 个直连字段

### 文本字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dataStatus` | `dataStatus` | `dataStatus` | 数据状态 |
| `sourceDataId` | `sourceDataId` | `sourceDataId` | 客户档案子表ID |
| `cAddressCode` | `cAddressCode` | `addressCode` | 地址编码 |
| `cRegion` | `cRegion` | `region` | 注册地区 |
| `cRegionCode` | `cRegionCode` | `regionCode` | 行政区划 |
| `cAddress` | `cAddress` | `address` | 详细地址 |
| `cReceiver` | `cReceiver` | `receiver` | 联系人姓名 |
| `cMergerName` | `cMergerName` | `mergerName` | 组合名称 |
| `cMobile` | `cMobile` | `mobile` | 联系人手机 |
| `cTelePhone` | `cTelePhone` | `telePhone` | 固定电话 |
| `cZipCode` | `cZipCode` | `zipCode` | 邮政编码 |
| `cEmail` | `cEmail` | `email` | 邮箱 |
| `cQQ` | `cQQ` | `qq` | QQ |
| `cWeChat` | `cWeChat` | `weChat` | 微信 |
| `erpCode` | `erpCode` | `erpCode` | 外部编码 |
| `cRemarks` | `cRemarks` | `remarks` | 备注 |
| `cArea` | `cArea` | `area` | 区 |
| `cCity` | `cCity` | `city` | 市 |
| `cCountry` | `cCountry` | `country` | 国家 |
| `deliveryAddressErpCode` | `deliveryAddressErpCode` | `deliveryAddressErpCode` | 发货地址ERP编码 |
| `cInputAddress` | `cInputAddress` | `inputAddress` | 全球化详细地址 |
| `cProvince` | `cProvince` | `province` | 省 |
| `cErp` | `cErp` | `shippingAddressErpCode` | 收货地址ERP编码 |
| `stop_status` | `stop_status` | `stopStatus` | 启用状态 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imerchantId` | `imerchantId` | `merchantId` | 手工码 |
| `oAddress_id` | `oAddress_id` | `addressId` | 地址标识 |
| `cReceivingWarehouse` | `cReceivingWarehouse` | `receivingWarehouse` | 收货默认仓库 |
| `shipregion` | `shipregion` | `shipregion` | 运输区域 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bDefaultAddr` | `bDefaultAddr` | `isDefault` | 默认地址 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iLNG` | `iLNG` | `longitude` | 经度 |
| `iLAT` | `iLAT` | `latitude` | 纬度 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `address_info_character` | `address_info_character` | `addressInfoCharacter` | 自定义项特征组 |
