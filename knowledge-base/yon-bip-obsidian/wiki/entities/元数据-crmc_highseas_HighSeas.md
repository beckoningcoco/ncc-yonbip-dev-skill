---
tags: [BIP, 元数据, 数据字典, crmc.highseas.HighSeas]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 公海设置 (`crmc.highseas.HighSeas`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`crmc_high_seas` | domain：`yycrm` | 应用：`CRMC` | 业务对象ID：`1c4f6f3d-a7d9-4aec-b786-4466ae4ff618`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 公海设置 |
| 物理表 | `crmc_high_seas` |
| 数据库 schema | `yycrm` |
| 所属应用 | `CRMC` |
| 直连字段 | 35 个 |
| 子表 | 6 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `highSeasMobileTemplate` | `crmc.highseas.HighSeasMobileTemplateSet` | composition |
| `retakeRule` | `crmc.highseas.RetakeRule` | composition |
| `seasAdministrator` | `crmc.highseas.HighSeasAdministrator` | composition |
| `highSeasPCTemplate` | `crmc.highseas.HighSeasTemplateSet` | composition |
| `seasMemberDept` | `crmc.highseas.HighSeasMemberDept` | composition |
| `seasMember` | `crmc.highseas.HighSeasMember` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `org_id` | `` |

## 继承接口 (3个, 11字段)

- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
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

## 字段列表（按类型分组）

> 共 35 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 公海编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `name` | `name` | `name` | 公海名称 |
| `voucher_type` | `voucher_type` | `voucherType` | 单据类型 线索: clue|商机:oppt|客户:customer |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `org_id` | `org_id` | `orgId` | 组织 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_member_view_detail` | `is_member_view_detail` | `isMemberViewDetail` | 成员是否可查看详情 |
| `is_receive_remind` | `is_receive_remind` | `isReceiveRemind` | 是否领取提醒 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `continue_receive_time` | `continue_receive_time` | `continueReceiveTime` | 连续领取上限时间 |
| `high_seas_count` | `high_seas_count` | `highSeasCount` | 公海中的线索|商机|客户数 |
| `max_receive_num` | `max_receive_num` | `maxReceiveNum` | 领取上限个数 |
| `max_receive_time` | `max_receive_time` | `maxReceiveTime` | 领取上限时间 |

### 短整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `continue_receive_time_type` | `continue_receive_time_type` | `continueReceiveTimeType` | 连续领取上限时间类型 |
| `follow_record_auth` | `follow_record_auth` | `followRecordAuth` | 跟进记录权限 0-查看所有数据|1-查看权限内数据 |
| `max_receive_time_type` | `max_receive_time_type` | `maxReceiveTimeType` | 领取上限时间类型 |
| `receive_limit` | `receive_limit` | `receiveLimit` | 领取限制 0:不限制|1:领取限制 |
| `receive_method` | `receive_method` | `receiveMethod` | 领取机制 1-管理员分配|2-成员自行领取|3-成员申领 |
| `return_apply` | `return_apply` | `returnApply` | 退回申请 1-否|2-是 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `highSeasMobileTemplate` | 公海池列表显示设置 |
| `` | `` | `highSeasPCTemplate` | 公海池列表显示设置 |
| `` | `` | `retakeRule` | 收回规则 |
| `` | `` | `seasAdministrator` | 公海管理员 |
| `` | `` | `seasMember` | 公海成员 |
| `` | `` | `seasMemberDept` | 公海成员 |
