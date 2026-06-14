---
tags: [BIP, 元数据, 数据字典, crmc.visitexecuterule.VisitExecuteRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 拜访执行规则 (`crmc.visitexecuterule.VisitExecuteRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`crmc_visit_execute_rule` | domain：`yycrm` | 应用：`CRMC` | 业务对象ID：`e2f3ba83-4870-4980-80ed-0dfafba83899`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 拜访执行规则 |
| 物理表 | `crmc_visit_execute_rule` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `CRMC` |
| 直连字段 | 29 个 |
| 子表 | 2 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `executeActionTypeList` | `crmc.visitexecuterule.VisitExecuteActionType` | composition |
| `executeActionItemList` | `crmc.visitexecuterule.VisitExecuteActionItem` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |

## 继承接口 (4个, 12字段)

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
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 29 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `modifier` | `modifier` | 修改人名称 |
| `code` | `code` | `code` | 规则编码 |
| `name` | `name` | `name` | 规则名称 |
| `` | `creator` | `creator` | 创建人 |
| `outside_type` | `outside_type` | `outsideType` | 人力外勤类型ID |
| `outside_type_name` | `outside_type_name` | `outsideTypeName` | 人力外勤类型名称 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `min_retention_time` | `min_retention_time` | `minRetentionTime` | 最小停留时间 |
| `is_sign_in` | `is_sign_in` | `isSignIn` | 是否签到 |
| `is_sign_out` | `is_sign_out` | `isSignOut` | 是否签退 |
| `sign_in_force_control` | `sign_in_force_control` | `signInForceControl` | 签到强控 |
| `sign_out_force_control` | `sign_out_force_control` | `signOutForceControl` | 签退强控 |
| `is_refer_history` | `is_refer_history` | `isReferHistory` | 允许引用历史签到记录 |
| `need_photo` | `need_photo` | `needPhoto` | 签到上传图片 |
| `sign_out_need_photo` | `sign_out_need_photo` | `signOutNeedPhoto` | 签退上传图片 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sign_in_range` | `sign_in_range` | `signInRange` | 签到距离范围(米) |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `execute_object` | `execute_object` | `visitObject` | 规则对象 |
| `` | `` | `executeActionItemList` | 拜访执行规则行动事项 |
| `` | `` | `executeActionTypeList` | 执行规则行动类型 |
