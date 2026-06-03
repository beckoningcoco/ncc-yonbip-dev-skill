---
tags: [BIP, 元数据, 数据字典, cam.syndicated.ExpensePlan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 费用计划 (`cam.syndicated.ExpensePlan`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`cam_syndicated_expense_plan` | domain：`yonbip-fi-ctmcam` | 应用：`CAM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 费用计划 |
| 物理表 | `cam_syndicated_expense_plan` |
| 数据库 schema | `yonbip-fi-ctmcam` |
| 所属应用 | `CAM` |
| 直连字段 | 19 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `fee_currency` | `bd_currencytenantreflist` |
| `cam_define_character_def` | `` |
| `mainid` | `` |
| `fee_item` | `finbd.bd_expenseitemref` |
| `tenant_id` | `` |

## 继承接口 (3个, 6字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 19 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creditSubagreement` | `creditSubagreement` | `creditSubagreement` | 授信子协议号 |
| `fee_scheme` | `fee_scheme` | `feeScheme` | 费用方案编号 |
| `fee_plan` | `fee_plan` | `feePlan` | 费用计划编号 |
| `` | `auditor` | `auditor` | 审批人名称 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 授信信息主表id |
| `fee_item` | `fee_item` | `feeItem` | 费用项目Id |
| `fee_currency` | `fee_currency` | `feeCurrency` | 费用币种id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fee_date` | `fee_date` | `feeDate` | 费用日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `execution_status` | `execution_status` | `executionStatus` | 执行状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fee_amt` | `fee_amt` | `feeAmt` | 费用金额（费用币种） |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cam_define_character_def` | `cam_define_character_def` | `camDefineCharacterDef` | 银团授信费用计划特征 |
