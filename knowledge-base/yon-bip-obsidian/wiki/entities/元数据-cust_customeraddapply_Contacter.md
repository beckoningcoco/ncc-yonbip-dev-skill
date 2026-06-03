---
tags: [BIP, 元数据, 数据字典, cust.customeraddapply.Contacter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 申请单联系人信息 (`cust.customeraddapply.Contacter`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cust_customeraddapply_contacter` | domain：`yycrm` | 应用：`CUST` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 申请单联系人信息 |
| 物理表 | `cust_customeraddapply_contacter` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CUST` |
| 直连字段 | 30 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `imerchantId` | `` |
| `org` | `ucf-org-center.bd_salesorg_na` |
| `ytenant_id` | `` |
| `contacter_character` | `` |
| `salearea` | `productcenter.aa_salearearef` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |

## 继承接口 (2个, 2字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`

## 字段列表（按类型分组）

> 共 30 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceDataId` | `sourceDataId` | `sourceDataId` | 客户档案子表ID |
| `dataStatus` | `dataStatus` | `dataStatus` | 数据状态 |
| `cPositionName` | `cPositionName` | `positionName` | 职务 |
| `cMobile` | `cMobile` | `mobile` | 手机号 |
| `cTelePhone` | `cTelePhone` | `telePhone` | 固定电话 |
| `cEmail` | `cEmail` | `email` | 邮箱 |
| `cQQ` | `cQQ` | `qq` | QQ |
| `cWeChat` | `cWeChat` | `weChat` | 微信 |
| `cRemarks` | `cRemarks` | `remarks` | 备注 |
| `area_code_mobile` | `area_code_mobile` | `areaCodeMobile` | 区号手机号 |
| `contact_department` | `contact_department` | `contactDepartment` | 任职部门 |
| `erpCode` | `erpCode` | `erpCode` | 商家编码 |
| `stop_status` | `stop_status` | `stopStatus` | 启用状态 |
| `cyhtUserId` | `cyhtUserId` | `yhtUserId` | 友互通用户标识 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imerchantId` | `imerchantId` | `merchantId` | 手工码 |
| `org` | `org` | `org` | 销售组织ID |
| `dept` | `dept` | `dept` | 部门ID |
| `salearea` | `salearea` | `saleArea` | 销售区域ID |
| `ower` | `ower` | `ower` | 负责人ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bDefaultContact` | `bDefaultContact` | `isDefault` | 默认联系人 |
| `custContact` | `custContact` | `custContact` | 客户联系人 |
| `cOrderContact` | `cOrderContact` | `orderContact` | 订货商家联系人 |
| `cMallContact` | `cMallContact` | `mallContact` | 商城商家联系人 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iGender` | `iGender` | `gender` | 性别 |
| `iCreatorYhtUserType` | `iCreatorYhtUserType` | `isCreatorYhtUserType` | 是否创建yht用户标识 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键ID |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cFullName` | `cFullName` | `fullName` | 姓名 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contacter_character` | `contacter_character` | `contacterCharacter` | 自定义项特征组 |
