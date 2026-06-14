---
tags: [BIP, 元数据, 数据字典, prjr.partnerregistration.PartnerRegistrationItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 人员信息 (`prjr.partnerregistration.PartnerRegistrationItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prjr_partner_registration_b` | domain：`yonbip-pm-projectme` | 应用：`PRJR` | 业务对象ID：`e1bb1cbb-0acb-4174-bd07-7904197bf07e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 人员信息 |
| 物理表 | `prjr_partner_registration_b` |
| domain/服务域 | `yonbip-pm-projectme` |
| schema | `pmcloud` |
| 所属应用 | `PRJR` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `cert_type` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `partner_registration_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `staff_id` | `` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 25 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `staff_code` | `staff_code` | `staffCode` | 人员编码 |
| `cert_no` | `cert_no` | `certNo` | 证件号 |
| `user_status` | `user_status` | `userStatus` | 用户状态 |
| `user_id` | `user_id` | `userId` | 员工ID |
| `business_name` | `business_name` | `businessName` | 企业名称 |
| `external_staff_type` | `external_staff_type` | `externalStaffType` | 外部人员类别 |
| `memo` | `memo` | `memo` | 备注 |
| `partner_type` | `partner_type` | `partnerType` | 伙伴类型 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cert_type` | `cert_type` | `certType` | 证件类型id |
| `staff_id` | `staff_id` | `staffId` | 备注 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `partner_registration_id` | `partner_registration_id` | `partnerRegistrationId` | 协作企业登记主表外键 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `birth_date` | `birth_date` | `birthDate` | 出生日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_admin` | `is_admin` | `isAdmin` | 是否管理员 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sex` | `sex` | `sex` | 性别 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `staff_name` | `staff_name` | `staffName` | 人员姓名 |

### contact (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `email` | `email` | `email` | 邮箱 |
| `mobile` | `mobile` | `mobile` | 手机号 |
