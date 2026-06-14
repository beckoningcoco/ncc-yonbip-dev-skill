---
tags: [BIP, 元数据, 数据字典, RVN.RVN.rclAllocationChangeHistory]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分摊表变更历史 (`RVN.RVN.rclAllocationChangeHistory`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_allocation_change_history` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`6280abd8-2dde-4781-b77a-0346edb31386`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 分摊表变更历史 |
| 物理表 | `rcl_allocation_change_history` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 16 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `rclFinanceIncomeAllocation_id` | `` |
| `changer` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

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

> 共 16 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_version_no` | `contract_version_no` | `contractVersionNo` | 履约义务版本号 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `changer` | `changer` | `changer` | 变更人 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `rclFinanceIncomeAllocation_id` | `rclFinanceIncomeAllocation_id` | `rclFinanceIncomeAllocation_id` | 融资收益分摊 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_date` | `change_date` | `changeDate` | 变更日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_retrospective_adjustment` | `is_retrospective_adjustment` | `isRetrospectiveAdjustment` | 是否追溯调整 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_method` | `change_method` | `changeMethod` | 变更方式 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allocation_table_version_no` | `allocation_table_version_no` | `allocationTableVersionNo` | 分摊表版本号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### bigText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `change_reason` | `change_reason` | `changeReason` | 变更原因 |
