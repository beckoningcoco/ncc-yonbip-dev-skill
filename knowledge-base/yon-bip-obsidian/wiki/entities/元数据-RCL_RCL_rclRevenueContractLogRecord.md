---
tags: [BIP, 元数据, 数据字典, RCL.RCL.rclRevenueContractLogRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 合同收入日志记录 (`RCL.RCL.rclRevenueContractLogRecord`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_log_record` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`4b3873aa-2d7c-4bab-bd14-c82cfb580241`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同收入日志记录 |
| 物理表 | `rcl_log_record` |
| 数据库 schema | `yonbip-fi-ercl` |
| 所属应用 | `RVN` |
| 直连字段 | 16 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `accentity` | `ucf-org-center.bd_financeorgtreeref` |

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

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `baseInfo_id` | `baseInfo_id` | `baseInfoId` | 合同行id |
| `contract_code` | `contract_code` | `contractCode` | 合同号 |
| `contract_id` | `contract_id` | `contractId` | 合同id |
| `execute_situation_id` | `execute_situation_id` | `executeSituationId` | 执行情况id |
| `id` | `id` | `id` | 主键 |
| `incomeTs` | `incomeTs` | `incomeTs` | 收入更新时间戳 |
| `log_id` | `log_id` | `logId` | 任务id |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `period_id` | `period_id` | `periodId` | 会计期间 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

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
