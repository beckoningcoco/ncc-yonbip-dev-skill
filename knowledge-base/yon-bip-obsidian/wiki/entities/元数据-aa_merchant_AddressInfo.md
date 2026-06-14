---
tags: [BIP, 元数据, 数据字典, aa.merchant.AddressInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 地址信息 (`aa.merchant.AddressInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`addressinfo` | domain：`productcenter` | 应用：`DPMCUS` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 地址信息 |
| 物理表 | `addressinfo` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `DPMCUS` |
| 直连字段 | 34 个 |
| 子表 | 1 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `addressInfoDefine` | `aa.merchant.AddressInfoDefine` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `address_info_character` | `` |
| `cReceivingWarehouse` | `productcenter.aa_warehouse` |
| `` | `` |
| `imerchantId` | `productcenter.aa_merchantref` |
| `ytenant_id` | `` |
| `shipregion` | `productcenter.base_shipregionref` |
| `tenant_id` | `` |
| `oAddress_id` | `` |

## 继承接口 (3个, 3字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 34 个直连字段

### 文本字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `erpCode` | `erpCode` | `erpCode` | ERP编码 |
| `cAddressCode` | `cAddressCode` | `addressCode` | 地址编码 |
| `cRegionCode` | `cRegionCode` | `regionCode` | 行政区划 |
| `cAddress` | `cAddress` | `address` | 详细地址 |
| `cZipCode` | `cZipCode` | `zipCode` | 邮政编码 |
| `cReceiver` | `cReceiver` | `receiver` | 联系人姓名 |
| `cMobile` | `cMobile` | `mobile` | 联系人手机 |
| `cTelePhone` | `cTelePhone` | `telePhone` | 固定电话 |
| `cEmail` | `cEmail` | `email` | 邮箱 |
| `cQQ` | `cQQ` | `qq` | QQ |
| `cWeChat` | `cWeChat` | `weChat` | 微信 |
| `cRemarks` | `cRemarks` | `remarks` | 备注 |
| `stop_status` | `stop_status` | `stopStatus` | 启用状态 |
| `deliveryAddressErpCode` | `deliveryAddressErpCode` | `deliveryAddressErpCode` | 发货地址ERP编码 |
| `cErp` | `cErp` | `shippingAddressErpCode` | 收货地址ERP编码 |
| `cMergerName` | `cMergerName` | `mergerName` | 组合名称 |
| `cCountry` | `cCountry` | `country` | 国家(废弃) |
| `cProvince` | `cProvince` | `province` | 省(废弃) |
| `cArea` | `cArea` | `area` | 区(废弃) |
| `cCity` | `cCity` | `city` | 市(废弃) |
| `cRegion` | `cRegion` | `region` | 所在地区(废弃) |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imerchantId` | `imerchantId` | `merchantId` | 客户 |
| `shipregion` | `shipregion` | `shipregion` | 运输区域 |
| `cReceivingWarehouse` | `cReceivingWarehouse` | `receivingWarehouse` | 收货默认仓库 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `oAddress_id` | `oAddress_id` | `addressId` | 地址标识(废弃) |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bDefaultAddr` | `bDefaultAddr` | `isDefault` | 默认地址 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iLNG` | `iLNG` | `longitude` | 经度 |
| `iLAT` | `iLAT` | `latitude` | 纬度 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `address_info_character` | `address_info_character` | `addressInfoCharacter` | 地址信息自定义项 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `addressInfoDefine` | 客户档案地址信息自定义项(废弃) |
