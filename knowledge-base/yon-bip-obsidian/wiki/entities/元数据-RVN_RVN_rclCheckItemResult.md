---
tags: [BIP, 元数据, 数据字典, RVN.RVN.rclCheckItemResult]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 月结检查项结果记录 (`RVN.RVN.rclCheckItemResult`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_check_item_result` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`ae231299-b7df-4ace-9a2f-090217babd7b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 月结检查项结果记录 |
| 物理表 | `rcl_check_item_result` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 17 个 |
| 子表 | 1 个 |
| 关联引用 | 4 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `rclCheckItemResultDetailList` | `RVN.RVN.rclCheckItemResultDetail` | composition |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `` | `` |

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

> 共 17 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book` | `acc_book` | `accBook` | 账簿 |
| `acc_period` | `acc_period` | `accPeriod` | 期间 |
| `check_result` | `check_result` | `checkResult` | 检查结果 |
| `code` | `code` | `code` | 编码 |
| `err_msg` | `err_msg` | `errMsg` | 错误信息 |
| `finance_org` | `finance_org` | `financeOrg` | 会计组织 |
| `id` | `id` | `id` | 主键 |
| `name` | `name` | `name` | 名称 |
| `task_id` | `task_id` | `taskId` | 任务ID |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
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

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `rclCheckItemResultDetailList` | 月结检查项结果记录子表 |
