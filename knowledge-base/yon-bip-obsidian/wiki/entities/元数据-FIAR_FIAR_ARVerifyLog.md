---
tags: [BIP, 元数据, 数据字典, FIAR.FIAR.ARVerifyLog]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 应收自动核销异常日志 (`FIAR.FIAR.ARVerifyLog`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_verify_log` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`433602e8-d851-4069-90eb-f0bcaa762c7c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 应收自动核销异常日志 |
| 物理表 | `arap_verify_log` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAR` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `finance_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `verify_plan_id` | `yonbip-fi-earap.ar_verify_plan_ref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `verify_period_id` | `finbd.bd_period` |

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

> 共 22 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `busi_scene` | `busi_scene` | `busiScene` | 核销业务场景描述 |
| `error_msg` | `error_msg` | `errorMsg` | 异常信息 |
| `event_code` | `event_code` | `eventCode` | 会计事务编号 |
| `event_id` | `event_id` | `eventId` | 会计事务ID |
| `id` | `id` | `id` | 主键 |
| `system_type` | `system_type` | `systemType` | 系统标识 |
| `verify_relation_id` | `verify_relation_id` | `verifyRelationId` | 核销线索ID |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `finance_org_id` | `finance_org_id` | `financeOrgId` | 会计主体ID |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `verify_period_id` | `verify_period_id` | `verifyPeriodId` | 核销期间ID |
| `verify_plan_id` | `verify_plan_id` | `verifyPlanId` | 核销方案ID |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_date` | `acc_date` | `accDate` | 会计事务记账日期 |
| `verify_date` | `verify_date` | `verifyDate` | 核销日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `arap_event_type` | `arap_event_type` | `arapEventType` | 会计事务类型 |
| `error_type` | `error_type` | `errorType` | 异常类型 |
| `verify_way` | `verify_way` | `verifyWay` | 核销方式 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
