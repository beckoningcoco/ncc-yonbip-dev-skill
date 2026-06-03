---
tags: [BIP, 元数据, 数据字典, aa.vendor.VendorAddress]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 供应商地址 (`aa.vendor.VendorAddress`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_vendor_address` | domain：`yssupplier` | 应用：`DPMSPL` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商地址 |
| 物理表 | `aa_vendor_address` |
| 数据库 schema | `yssupplier` |
| 所属应用 | `DPMSPL` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `country_id` | `ucfbasedoc.bd_countryref` |
| `ytenant_id` | `` |
| `iVendorId` | `` |
| `contact_id` | `` |
| `iShipregionId` | `productcenter.base_shipregionref` |
| `region` | `` |
| `vendorAddressCharacterDefine` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `address_name` | `address_name` | `addressName` | 地点名称 |
| `region_code` | `region_code` | `regionCode` | 注册地区编码 |
| `detail_address` | `detail_address` | `detailAddress` | 详细地址 |
| `zipcode` | `zipcode` | `zipcode` | 邮政编码 |
| `longitude` | `longitude` | `longitude` | 经度 |
| `latitude` | `latitude` | `latitude` | 纬度 |
| `memo` | `memo` | `memo` | 备注 |
| `erpCode` | `erpCode` | `erpCode` | erpCode |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iVendorId` | `iVendorId` | `vendor` | 供应商档案主键 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `country_id` | `country_id` | `country` | 国家主键 |
| `region` | `region` | `region` | 行政区划 |
| `contact_id` | `contact_id` | `contact` | 联系人ID |
| `iShipregionId` | `iShipregionId` | `shipregion` | 运输区域ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_default` | `is_default` | `isDefault` | 默认地址 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `address_type` | `address_type` | `addressType` | 地址类型 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 供应商地址主键 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vendorAddressCharacterDefine` | `vendorAddressCharacterDefine` | `vendorAddressCharacterDefine` | 供应商地址自定义项 |
