---
tags: [BIP, 元数据, 数据字典, aa.vendor.VendorContacts]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 供应商联系人 (`aa.vendor.VendorContacts`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aa_vendorcontacts` | domain：`yssupplier` | 应用：`DPMSPL` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应商联系人 |
| 物理表 | `aa_vendorcontacts` |
| domain/服务域 | `yssupplier` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `DPMSPL` |
| 直连字段 | 23 个 |
| 子表 | 1 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `aa.vendor.VendorContactDefine` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `iVendorId` | `` |
| `vendorContactsCharacterDefine` | `` |
| `tenant_id` | `` |
| `` | `` |

## 继承接口 (3个, 3字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cContactName` | `cContactName` | `contactname` | 姓名 |
| `head_photo` | `head_photo` | `headPhoto` | 头像 |
| `mobileCountrycode` | `mobileCountrycode` | `mobileCountrycode` | 区号 |
| `cContactMobile` | `cContactMobile` | `contactmobile` | 手机号 |
| `cContactPhone` | `cContactPhone` | `contactphone` | 固定电话 |
| `cContactEmail` | `cContactEmail` | `contactemail` | 电子邮箱 |
| `cQQ` | `cQQ` | `qq` | QQ |
| `cWeChat` | `cWeChat` | `WeChat` | 微信 |
| `erpCode` | `erpCode` | `erpCode` | 外部编码 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iVendorId` | `iVendorId` | `vendor` | 供应商档案主键 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bDefaultContact` | `bDefaultContact` | `defaultcontact` | 默认联系人 |
| `bCustomContact` | `bCustomContact` | `customcontact` | 客户联系人 |
| `bUdhContact` | `bUdhContact` | `udhcontact` | 订货商家联系人 |
| `bUmallContact` | `bUmallContact` | `umallcontact` | 商城商家联系人 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cGender` | `cGender` | `gender` | 性别 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 供应商联系人主键 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cPosition` | `cPosition` | `position` | 职务 |
| `cmemo` | `cmemo` | `memo` | 备注 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vendorContactsCharacterDefine` | `vendorContactsCharacterDefine` | `vendorContactsCharacterDefine` | 供应商联系人自定义项 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 供应商联系人自定义项 |
