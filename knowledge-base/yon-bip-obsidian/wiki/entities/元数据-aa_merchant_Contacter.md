---
tags: [BIP, 元数据, 数据字典, aa.merchant.Contacter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 联系人信息 (`aa.merchant.Contacter`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`contacter` | domain：`productcenter` | 应用：`DPMCUS` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 联系人信息 |
| 物理表 | `contacter` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `DPMCUS` |
| 直连字段 | 27 个 |
| 子表 | 1 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `contacterDefine` | `aa.merchant.ContacterDefine` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `imerchantId` | `` |
| `ytenant_id` | `` |
| `contacter_character` | `` |
| `tenant_id` | `` |
| `` | `` |

## 继承接口 (3个, 3字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 27 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `erpCode` | `erpCode` | `erpCode` | ERP编码 |
| `contact_department` | `contact_department` | `contactDepartment` | 任职部门 |
| `cPositionName` | `cPositionName` | `positionName` | 职务 |
| `area_code_mobile` | `area_code_mobile` | `areaCodeMobile` | 手机号 |
| `cMobile` | `cMobile` | `mobile` | 备用手机号 |
| `cTelePhone` | `cTelePhone` | `telePhone` | 固定电话 |
| `cEmail` | `cEmail` | `email` | 邮箱 |
| `cQQ` | `cQQ` | `qq` | QQ |
| `cWeChat` | `cWeChat` | `weChat` | 微信 |
| `stop_status` | `stop_status` | `stopStatus` | 启用状态 |
| `cRemarks` | `cRemarks` | `remarks` | 备注 |
| `crm_contact` | `crm_contact` | `crmContact` | crm联系人档案 |
| `cyhtUserId` | `cyhtUserId` | `yhtUserId` | 专管业务员关联友户通标识 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imerchantId` | `imerchantId` | `merchantId` | 客户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bDefaultContact` | `bDefaultContact` | `isDefault` | 默认联系人 |
| `cOrderContact` | `cOrderContact` | `orderContact` | 订货商家联系人 |
| `cMallContact` | `cMallContact` | `mallContact` | 商城商家联系人 |
| `custContact` | `custContact` | `custContact` | CRM客户联系人 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cFullName` | `cFullName` | `fullName` | 姓名（废弃） |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `contacterDefine` | 客户档案联系人信息自定义（废弃） |
| `iGender` | `iGender` | `gender` | 性别 |
| `iCreatorYhtUserType` | `iCreatorYhtUserType` | `isCreatorYhtUserType` | 是否创建友户通用户标识 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contacter_character` | `contacter_character` | `contacterCharacter` | 联系人信息自定义项 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
