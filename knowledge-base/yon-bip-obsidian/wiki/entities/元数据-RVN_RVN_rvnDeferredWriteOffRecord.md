---
tags: [BIP, 元数据, 数据字典, RVN.RVN.rvnDeferredWriteOffRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 冲销记录 (`RVN.RVN.rvnDeferredWriteOffRecord`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rvn_deferred_writeoff_record` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`02e2b2e8-4c95-406f-b2ce-9e1588ac2f22`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 冲销记录 |
| 物理表 | `rvn_deferred_writeoff_record` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 24 个 |
| 子表 | 0 个 |
| 关联引用 | 10 个 |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `opposite_bus_event_id` | `` |
| `opposite_detail_id` | `` |
| `rcl_revenue_contract_id` | `` |
| `local_detail_id` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `local_bus_event_id` | `` |
| `ytenant_id` | `` |
| `rcl_contract_base_info_id` | `` |
| `account_entity_id` | `ucf-org-center.bd_financeorgtreeref` |

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

> 共 24 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `local_bus_event_code` | `local_bus_event_code` | `localBusEventCode` | 本方会计事务编号 |
| `opposite_bus_event_code` | `opposite_bus_event_code` | `oppositeBusEventCode` | 对方会计事务编号 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `account_entity_id` | `account_entity_id` | `accountEntity` | 会计主体 |
| `creator` | `creator` | `creator` | 创建人 |
| `local_bus_event_id` | `local_bus_event_id` | `localBusEventId` | 本方会计事务 |
| `local_detail_id` | `local_detail_id` | `localDetailId` | 本方会计事务明细 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `opposite_bus_event_id` | `opposite_bus_event_id` | `oppositeBusEventId` | 对方会计事务 |
| `opposite_detail_id` | `opposite_detail_id` | `oppositeDetailId` | 对方会计事务明细 |
| `rcl_contract_base_info_id` | `rcl_contract_base_info_id` | `rclContractBaseInfoId` | 合同基本信息行ID |
| `rcl_revenue_contract_id` | `rcl_revenue_contract_id` | `rclRevenueContractId` | 收入合同ID |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bus_date` | `bus_date` | `busDate` | 业务日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `local_exclude_amt` | `local_exclude_amt` | `localExcludeAmt` | 本方核销无税金额 |
| `local_include_amt` | `local_include_amt` | `localIncludeAmt` | 本方核销含税金额 |
| `local_tax_amt` | `local_tax_amt` | `localTaxAmt` | 本方核销税额 |
| `opp_exclude_amt` | `opp_exclude_amt` | `oppExcludeAmt` | 对方核销无税金额 |
| `opp_include_amt` | `opp_include_amt` | `oppIncludeAmt` | 对方核销含税金额 |
| `opp_tax_amt` | `opp_tax_amt` | `oppTaxAmt` | 对方核销税额 |
