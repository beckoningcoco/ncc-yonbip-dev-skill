---
tags: [BIP, 元数据, 数据字典, RCL.RCL.rclContractChange]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 变更历史 (`RCL.RCL.rclContractChange`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_change` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`29a1c8eb-18f3-4f82-b4a8-2d20ae258702`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 变更历史 |
| 物理表 | `rcl_change` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `acc_book_id` | `fiepub.fiepub_accountbooktreeref` |
| `contract_modifier` | `yonbip-ndi-jgmj.secret_bipuserref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `rcl_revenuecontract_base_id` | `` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 分布式事务ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBook` | 账簿 |
| `contract_modifier` | `contract_modifier` | `contractModifier` | 变更人 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `rcl_revenuecontract_base_id` | `rcl_revenuecontract_base_id` | `rclRevenuecontractBaseId` | 履约义务主表 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begin_adjust_period` | `begin_adjust_period` | `beginAdjustPeriod` | 开始调整期间 |
| `contract_modify_time` | `contract_modify_time` | `contractModifyTime` | 变更时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_trace_adjust` | `bln_trace_adjust` | `blnTraceAdjust` | 是否追溯调整 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `idx` | `idx` | `idx` | 序号 |
| `version` | `version` | `version` | 履约义务版本号 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |

### bigText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_reason` | `modify_reason` | `modifyReason` | 变更原因 |
