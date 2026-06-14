---
tags: [BIP, 元数据, 数据字典, sfa.competeopponent.CompeteOpponent]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 竞争对手 (`sfa.competeopponent.CompeteOpponent`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_opponent` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：`1f812cd9-8531-4476-81e4-baffb0077b81`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞争对手 |
| 物理表 | `sfa_opponent` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `SFA` |
| 直连字段 | 54 个 |
| 子表 | 7 个 |
| 关联引用 | 19 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `opptList` | `sfa.competeopponent.CompeteOpponentRelateOppt` | composition |
| `deptList` | `sfa.competeopponent.CompeteOpponentDept` | composition |
| `headDef` | `sfa.competeopponent.CompeteOpponentDef` | composition |
| `areaList` | `sfa.competeopponent.CompeteOpponentArea` | composition |
| `orgList` | `sfa.competeopponent.CompeteOpponentOrg` | composition |
| `customerList` | `sfa.competeopponent.CompeteOpponentRelateCustomer` | composition |
| `brandList` | `sfa.competeopponent.CompeteOpponentBrand` | composition |

## 关联引用 (19个)

| 字段名 | 引用类型 |
|--------|---------|
| `ower` | `` |
| `` | `` |
| `cSuppliers` | `` |
| `ytenant_id` | `` |
| `attachment_group_item_id` | `` |
| `competeOpponentDefineCharacter` | `` |
| `bustype` | `` |
| `enterprisetype` | `ucfbasedoc.bd_enterprisenatureref` |
| `attachment_group_id` | `` |
| `tenant_id` | `` |
| `customer_id` | `` |

## 继承接口 (5个, 13字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 54 个直连字段

### 文本字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `managestatus` | `managestatus` | `manageStatus` | 经营状态 |
| `founddate` | `founddate` | `foundDate` | 成立日期 |
| `legalperson` | `legalperson` | `legalPerson` | 法人 |
| `registeredcapital` | `registeredcapital` | `registeredCapital` | 注册资本 |
| `businessterm` | `businessterm` | `businessTerm` | 营业期限 |
| `code` | `code` | `code` | 编码 |
| `phone` | `phone` | `phone` | 电话 |
| `detailaddress` | `detailaddress` | `detailAddress` | 详细地址 |
| `website` | `website` | `website` | 网址 |
| `wechatofficialaccount` | `wechatofficialaccount` | `wechatOfficialAccount` | 微信公众号 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `verfiyId` | `verfiyId` | `verfiyId` | 核实主键 |
| `business_information` | `business_information` | `businessInformation` | 工商信息 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `name2` | `name2` | `name2` | 名称2 |
| `name3` | `name3` | `name3` | 名称3 |
| `name4` | `name4` | `name4` | 名称4 |
| `name5` | `name5` | `name5` | 名称5 |
| `name6` | `name6` | `name6` | 名称6 |
| `rival` | `rival` | `rival` | 类型 |
| `short_name` | `short_name` | `shortName` | 竞争对手简称 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enterprisetype` | `enterprisetype` | `enterpriseType` | 企业性质ID |
| `attachment_group_id` | `attachment_group_id` | `attachmentGroupId` | 附件分组 |
| `attachment_group_item_id` | `attachment_group_item_id` | `attachmentGroupItemId` | 附件分组项 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ower` | `ower` | `ower` | 负责人 |
| `cSuppliers` | `cSuppliers` | `suppliers` | 供应商 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 状态 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `verfyMark` | `verfyMark` | `verfyMark` | 核实状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `associated_archive` | `associated_archive` | `associatedArchive` | 关联档案 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `longitude` | `longitude` | `longitude` | 经度 |
| `latitude` | `latitude` | `latitude` | 纬度 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### other (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `areaList` | (竞争对手)销售区域 |
| `` | `` | `brandList` | 竞争对手品牌 |
| `` | `` | `customerList` | 客户相关竞争对手 |
| `` | `` | `deptList` | (竞争对手)部门 |
| `` | `` | `headDef` | 竞争对手主表自定义项扩展 |
| `` | `` | `opptList` | 商机相关竞争对手 |
| `` | `` | `orgList` | (竞争对手)组织 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `competeOpponentDefineCharacter` | `competeOpponentDefineCharacter` | `competeOpponentDefineCharacter` | 竞争对手自定义项 |
