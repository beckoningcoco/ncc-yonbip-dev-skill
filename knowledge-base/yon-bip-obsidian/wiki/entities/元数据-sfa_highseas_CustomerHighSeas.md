---
tags: [BIP, 元数据, 数据字典, sfa.highseas.CustomerHighSeas]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户公海 (`sfa.highseas.CustomerHighSeas`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_customerhighseas` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：`450df5f6-fca6-4ed0-8009-f1738cd8b3d9`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户公海 |
| 物理表 | `sfa_customerhighseas` |
| 数据库 schema | `yycrm` |
| 所属应用 | `SFA` |
| 直连字段 | 43 个 |
| 子表 | 6 个 |
| 关联引用 | 11 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `customerHighSeasMobileTemplate` | `sfa.highseas.CustomerHighSeasMobileTemplate` | composition |
| `customerHighSeasMemberDept` | `sfa.highseas.CustomerHighSeasMemberDept` | composition |
| `customerHighSeasTemplate` | `sfa.highseas.CustomerHighSeasTemplate` | composition |
| `customerRetakeRule` | `sfa.highseas.CustomerSeasRetakeRule` | composition |
| `customerHighSeasMember` | `sfa.highseas.CustomerHighSeasMember` | composition |
| `customerHighSeasAdministrator` | `sfa.highseas.CustomerHighSeasAdministrator` | composition |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `orgId` | `ucf-org-center.bd_salesorg_na` |
| `tenant_id` | `` |

## 继承接口 (4个, 12字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 43 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 公海编码 |
| `name` | `name` | `name` | 公海名称 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `parent_name` | `parent_name` | `parentName` | 上级名称 |
| `path` | `path` | `path` | 路径 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人ID |
| `` | `modifierId` | `modifierId` | 修改人ID |
| `orgId` | `orgId` | `orgId` | 组织id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isReceiveMsg` | `isReceiveMsg` | `isReceiveMsg` | 领取提醒 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 整数 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_show_detail` | `is_show_detail` | `isShowDetail` | 成员可查看客户详情 |
| `customer_count` | `customer_count` | `customerCount` | 客户数 |
| `receive_method` | `receive_method` | `receiveMethod` | 领取机制 |
| `isReceiveLimit` | `isReceiveLimit` | `isReceiveLimit` | 领取限制 |
| `max_receive_time` | `max_receive_time` | `maxReceiveTime` | 领取上限 |
| `max_receive_time_type` | `max_receive_time_type` | `maxReceiveTimeType` | 最多领取时间类型 |
| `max_receive_num` | `max_receive_num` | `maxReceiveNum` | 最多领取个数 |
| `continue_receive_time` | `continue_receive_time` | `continueReceiveTime` | 连续领取时间 |
| `continue_receive_time_type` | `continue_receive_time_type` | `continueReceiveTimeType` | 连续领取时间类型 |
| `iDeleted` | `iDeleted` | `deleted` | 删除 |
| `iDepth` | `iDepth` | `depth` | 层级 |
| `order` | `order` | `order` | 顺序 |
| `retake_method` | `retake_method` | `retakeMethod` | 收回方式 |
| `returnApply` | `returnApply` | `returnApply` | 退回申请 1:否,2:是,默认1 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contactFollowAssign` | `contactFollowAssign` | `contactFollowAssign` | 联系人随客户分配/领取/收回/退回：0-否|1-是 默认为0 |
| `followRecordAuth` | `followRecordAuth` | `followRecordAuth` | 跟进记录权限：0-查看所有数据|1-查看权限内数据 默认为1 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 客户id |
| `parent_id` | `parent_id` | `parentId` | 上级Id |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `customerHighSeasAdministrator` | 客户公海管理员 |
| `` | `` | `customerHighSeasMember` | 客户公海成员 |
| `` | `` | `customerHighSeasMemberDept` | 客户公海成员 |
| `` | `` | `customerHighSeasMobileTemplate` | 客户公海模板设置 |
| `` | `` | `customerHighSeasTemplate` | 线索公海模板设置 |
| `` | `` | `customerRetakeRule` | 公海池收回规则表 |
