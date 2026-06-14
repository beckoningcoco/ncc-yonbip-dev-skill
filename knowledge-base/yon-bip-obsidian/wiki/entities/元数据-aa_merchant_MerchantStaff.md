---
tags: [BIP, 元数据, 数据字典, aa.merchant.MerchantStaff]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户员工 (`aa.merchant.MerchantStaff`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`merchantstaff` | domain：`productcenter` | 应用：`DPMCUS` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户员工 |
| 物理表 | `merchantstaff` |
| domain/服务域 | `productcenter` |
| schema | `iuap_apdoc_coredoc` |
| 所属应用 | `DPMCUS` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `imerchantId` | `` |
| `ytenant_id` | `` |
| `iPosition` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cHeadPicUrl` | `cHeadPicUrl` | `cHeadPicUrl` | 员工照片 |
| `cCode` | `cCode` | `code` | 员工编码 |
| `cEmail` | `cEmail` | `email` | 邮箱 |
| `cFullName` | `cFullName` | `fullName` | 姓名 |
| `cMobile` | `cMobile` | `mobile` | 手机号 |
| `cQQ` | `cQQ` | `qq` | QQ |
| `cRemarks` | `cRemarks` | `remarks` | 备注 |
| `source` | `source` | `source` | 来源 |
| `cUserName` | `cUserName` | `userName` | 账号 |
| `cWeChat` | `cWeChat` | `weChat` | 微信 |
| `cyhtUserId` | `cyhtUserId` | `yhtUserId` | 友互通用户标识 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iPosition` | `iPosition` | `iPosition` | 员工职位Id |
| `imerchantId` | `imerchantId` | `merchantId` | 所属客户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iGender` | `iGender` | `gender` | 性别 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dEntryTime` | `dEntryTime` | `dEntryTime` | 入职时间 |
| `dLeaveTime` | `dLeaveTime` | `dLeaveTime` | 离职时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
