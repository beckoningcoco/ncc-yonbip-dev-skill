---
tags: [BIP, 元数据, 数据字典, act.signinexecute.SignInExecute]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 签到执行 (`act.signinexecute.SignInExecute`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`act_signinexecute` | domain：`yycrm` | 应用：`ACT` | 业务对象ID：`bf493e54-5e57-4872-93c5-1f671d3b22bb`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 签到执行 |
| 物理表 | `act_signinexecute` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `ACT` |
| 直连字段 | 46 个 |
| 子表 | 0 个 |
| 关联引用 | 17 个 |

## 关联引用 (17个)

| 字段名 | 引用类型 |
|--------|---------|
| `org` | `` |
| `ytenant_id` | `` |
| `follow_record_id` | `` |
| `` | `` |
| `salearea` | `` |
| `dept` | `` |
| `terminal` | `` |
| `partner_person` | `` |
| `signinid` | `` |
| `action_id` | `` |
| `timeFrameId` | `` |
| `iCustID` | `` |
| `staffid` | `` |
| `task_id` | `` |
| `tenant_id` | `` |
| `customer_id` | `` |

## 继承接口 (3个, 10字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 46 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `location` | `location` | `location` | 签到地区 |
| `photo` | `photo` | `photo` | 签到照片 |
| `locationstate` | `locationstate` | `locationState` | 签到说明 |
| `signinstatus` | `signinstatus` | `signInStatus` | 签到状态 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `adcode` | `adcode` | `adcode` | 行政区划 |
| `area` | `area` | `area` | 区 |
| `city` | `city` | `city` | 市 |
| `province` | `province` | `province` | 省 |
| `tzone` | `tzone` | `timeZone` | 时区 |

### 引用字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `task_id` | `task_id` | `taskId` | 任务 |
| `action_id` | `action_id` | `actionId` | 行动 |
| `signinid` | `signinid` | `signInId` | 签到组ID |
| `staffid` | `staffid` | `staffId` | 人员ID |
| `timeFrameId` | `timeFrameId` | `timeFrameId` | 签到时段ID |
| `terminal` | `terminal` | `terminal` | 终端 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `org` | `org` | `org` | 管理组织 |
| `dept` | `dept` | `dept` | 部门 |
| `follow_record_id` | `follow_record_id` | `followRecordId` | 跟进记录 |
| `iCustID` | `iCustID` | `cust` | 伙伴 |
| `partner_person` | `partner_person` | `partnerPerson` | 伙伴人员 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `salearea` | `salearea` | `saleArea` | 销售区域 |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `signDate` | `signDate` | `signDate` | 签到日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sign_in_way` | `sign_in_way` | `signInWay` | 签到方式 |
| `sign_in_type` | `sign_in_type` | `signInType` | 签到类型 |
| `isRelocation` | `isRelocation` | `isRelocation` | 是否重新定位 |
| `associationbusinessobject` | `associationbusinessobject` | `associationBusinessObject` | 关联业务对象 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_workday` | `is_workday` | `isWorkday` | 是否工作日 |
| `sign_in_distance` | `sign_in_distance` | `signInDistance` | 签到距离 |
| `sign_out_distance` | `sign_out_distance` | `signOutDistance` | 签退距离 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iLNG` | `iLNG` | `longitude` | 签到经度 |
| `iLAT` | `iLAT` | `latitude` | 签到纬度 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `locationtime` | `locationtime` | `locationTime` | 签到时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `timezone_signintime` | `timezone_signintime` | `timeZoneTime` | 当前时区签到时间 |
