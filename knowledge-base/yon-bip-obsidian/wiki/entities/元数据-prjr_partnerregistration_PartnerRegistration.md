---
tags: [BIP, 元数据, 数据字典, prjr.partnerregistration.PartnerRegistration]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 协作企业登记 (`prjr.partnerregistration.PartnerRegistration`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`prjr_partner_registration` | domain：`yonbip-pm-projectme` | 应用：`PRJR` | 业务对象ID：`e1bb1cbb-0acb-4174-bd07-7904197bf07e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 协作企业登记 |
| 物理表 | `prjr_partner_registration` |
| domain/服务域 | `yonbip-pm-projectme` |
| schema | `pmcloud` |
| 所属应用 | `PRJR` |
| 直连字段 | 23 个 |
| 子表 | 1 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `items` | `prjr.partnerregistration.PartnerRegistrationItem` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `ucfbasedoc.bd_countryref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `supplier_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `customer_id` | `` |
| `timeZone` | `ucfbasedoc.bd_timezoneref` |
| `ytenant_id` | `` |
| `` | `` |

## 继承接口 (5个, 10字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **启用** (`ucfbase.ucfbaseItf.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 编码 |
| `search_code` | `search_code` | `searchCode` | 助记码 |
| `partner_type` | `partner_type` | `partnerType` | 伙伴类型 |
| `external_staff_type` | `external_staff_type` | `externalStaffType` | 角色类别 |
| `relation_object_id` | `relation_object_id` | `relationObjectId` | 关联用户Id |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `country` | `country` | `country` | 国家/地区id |
| `timeZone` | `timeZone` | `timeZone` | 时区id |
| `customer_id` | `customer_id` | `customerId` | 客户 |
| `supplier_id` | `supplier_id` | `supplierId` | 供应商 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建日期 |
| `modify_time` | `modify_time` | `modifyTime` | 修改日期 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 启用 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |
| `short_name` | `short_name` | `shortName` | 简称 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `items` | 人员信息 |
