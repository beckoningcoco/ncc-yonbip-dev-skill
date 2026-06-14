---
tags: [BIP, 元数据, 数据字典, act.actiontypesetting.ActionTypeSetting]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 行动类型设置 (`act.actiontypesetting.ActionTypeSetting`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`act_actiontypesetting` | domain：`yycrm` | 应用：`ACT` | 业务对象ID：`eeb44523-059e-429a-ae9e-ca049b77179c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 行动类型设置 |
| 物理表 | `act_actiontypesetting` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `ACT` |
| 直连字段 | 32 个 |
| 子表 | 4 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `actionTypeSettingApplyRoleList` | `act.actiontypesetting.ActionTypeSettingApplyRole` | composition |
| `actionTypeSettingApplySaleAreaList` | `act.actiontypesetting.ActionTypeSettingApplySaleArea` | composition |
| `actionTypeSettingActionMatterList` | `act.actiontypesetting.ActionTypeSettingActionMatter` | composition |
| `actionTypeSettingApplySaleOrgList` | `act.actiontypesetting.ActionTypeSettingApplySaleOrg` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `activity_type` | `transtype.bd_billtyperef` |
| `bustype` | `transtype.bd_billtyperef` |
| `tenant_id` | `` |

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

> 共 32 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `modifier` | `modifier` | 修改人名称 |
| `` | `creator` | `creator` | 创建人名称 |
| `outsideType` | `outsideType` | `outsideType` | 人力外勤类型ID |
| `outsideTypeName` | `outsideTypeName` | `outsideTypeName` | 人力外勤类型 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bustype` | `bustype` | `bustype` | 行动交易类型ID |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `activity_type` | `activity_type` | `activityType` | 活动类型ID |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `signOut_needPhoto` | `signOut_needPhoto` | `signOutNeedPhoto` | 签退上传图片 |
| `need_photo` | `need_photo` | `needPhoto` | 签到上传图片 |
| `issignin` | `issignin` | `isSignIn` | 是否签到 |
| `sign_in_force_control` | `sign_in_force_control` | `signInForceControl` | 签到强控 |
| `issignout` | `issignout` | `isSignOut` | 是否签退 |
| `banmanualcreate` | `banmanualcreate` | `banManualCreate` | 禁止手动新建 |
| `isreferhistory` | `isreferhistory` | `isReferHistory` | 允许引用历史签到记录 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `associationbusinessobject` | `associationbusinessobject` | `associationBusinessObject` | 关联业务 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sign_out_force_control` | `sign_out_force_control` | `signOutForceControl` | 签退强控 |
| `visit_Type` | `visit_Type` | `visitType` | 拜访类型 |
| `min_retention_time` | `min_retention_time` | `minRetentionTime` | 最小停留时间 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `signInRange` | `signInRange` | `signInRange` | 签到距离范围(米) |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `actionTypeSettingActionMatterList` | 行动类型设置行动事项 |
| `` | `` | `actionTypeSettingApplyRoleList` | 行动类型设置适用角色 |
| `` | `` | `actionTypeSettingApplySaleAreaList` | (行动类型设置)行动类型设置适用销售区域 |
| `` | `` | `actionTypeSettingApplySaleOrgList` | (行动类型设置)行动类型设置适用销售组织 |
