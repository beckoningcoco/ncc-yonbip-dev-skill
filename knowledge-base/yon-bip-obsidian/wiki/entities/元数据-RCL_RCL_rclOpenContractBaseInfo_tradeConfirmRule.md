---
tags: [BIP, 元数据, 数据字典, RCL.RCL.rclOpenContractBaseInfo_tradeConfirmRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# rclOpenContractBaseInfo_tradeConfirmRule (`RCL.RCL.rclOpenContractBaseInfo_tradeConfirmRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_contract_b_tradeconfirmrule` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`0dcdcca0-a433-419f-8e06-38e109b5ba50`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | rclOpenContractBaseInfo_tradeConfirmRule |
| 物理表 | `rcl_contract_b_tradeconfirmrule` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `mainid` | `fiepub.fiepub_receivable_confirm_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `fkid` | `` |

## 继承接口 (2个, 5字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 9 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `fkid` | `fkid` | `fkid` | 外键 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `mainid` | `mainid` | `tradeConfirmRule` | 应收确认规则 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
