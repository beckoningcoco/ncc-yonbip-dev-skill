---
tags: [BIP, 元数据, 数据字典, sfa.clue.ClueHighSeas]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 线索公海 (`sfa.clue.ClueHighSeas`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_cluehighseas` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：`878f148a-ac0d-45ab-9a80-e921b66c66c5`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 线索公海 |
| 物理表 | `sfa_cluehighseas` |
| 数据库 schema | `yycrm` |
| 所属应用 | `SFA` |
| 直连字段 | 47 个 |
| 子表 | 8 个 |
| 关联引用 | 15 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `clueRetakeRule` | `sfa.clue.SeasRetakeRule` | composition |
| `clueHighSeasTemplate` | `sfa.clue.ClueHighSeasTemplate` | composition |
| `clueHighSeasMobileTemplate` | `sfa.clue.ClueHighSeasMobileTemplate` | composition |
| `seasAdministrator` | `sfa.clue.ClueHighSeasAdministrator` | composition |
| `clueDistributeRule` | `sfa.clue.SeasDistributeRule` | composition |
| `seasMemberDept` | `sfa.clue.ClueHighSeasMemberDept` | composition |
| `seasMemberOrg` | `sfa.clue.ClueHighSeasMemberOrg` | composition |
| `seasMember` | `sfa.clue.ClueHighSeasMember` | composition |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `seasSaleArea` | `` |
| `seasOrg` | `` |
| `seasDept` | `` |
| `tenant_id` | `` |

## 继承接口 (5个, 17字段)

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
- **树型结构** (`base.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 47 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 公海编码 |
| `name` | `name` | `name` | 公海名称 |
| `path` | `path` | `path` | 路径 |
| `parent_name` | `parent_name` | `parentName` | 上级名称 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `seasDept` | `seasDept` | `seasDept` | 部门 |
| `seasOrg` | `seasOrg` | `seasOrg` | 销售组织 |
| `seasSaleArea` | `seasSaleArea` | `seasSaleArea` | 销售区域 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isReceiveLimit` | `isReceiveLimit` | `isReceiveLimit` | 领取限制 |
| `isReceiveMsg` | `isReceiveMsg` | `isReceiveMsg` | 领取提醒 |
| `` | `isEnd` | `isEnd` | 是否末级 |
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 整数 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `order` | `order` | `order` | 顺序 |
| `iDepth` | `iDepth` | `depth` | 层级 |
| `is_show_detail` | `is_show_detail` | `isShowDetail` | 成员可查看线索详情 |
| `receive_method` | `receive_method` | `receiveMethod` | 领取机制 |
| `max_receive_time` | `max_receive_time` | `maxReceiveTime` | 最多领取时间 |
| `max_receive_time_type` | `max_receive_time_type` | `maxReceiveTimeType` | 最多领取时间类型 |
| `max_receive_num` | `max_receive_num` | `maxReceiveNum` | 最多领取个数 |
| `continue_receive_time` | `continue_receive_time` | `continueReceiveTime` | 连续领取时间 |
| `continue_receive_time_type` | `continue_receive_time_type` | `continueReceiveTimeType` | 连续领取时间类型 |
| `iDeleted` | `iDeleted` | `deleted` | 删除 |
| `level` | `level` | `level` | 层级 |
| `returnApply` | `returnApply` | `returnApply` | 退回申请 1:否,2:是,默认1 |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `followRecordAuth` | `followRecordAuth` | `followRecordAuth` | 跟进记录权限：0-查看所有数据|1-查看权限内数据 默认为1 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `parent_id` | `parent_id` | `parent` | 上级ID |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### other (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `clueDistributeRule` | 公海池分配规则表 |
| `` | `` | `clueHighSeasMobileTemplate` | 线索公海模板设置 |
| `` | `` | `clueHighSeasTemplate` | 线索公海模板设置 |
| `` | `` | `clueRetakeRule` | 公海池收回规则表 |
| `` | `` | `seasAdministrator` | 线索公海管理员 |
| `` | `` | `seasMember` | 线索公海成员 |
| `` | `` | `seasMemberDept` | 线索公海成员 |
| `` | `` | `seasMemberOrg` | 线索公海成员 |
