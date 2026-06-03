---
tags: [BIP, 元数据, 数据字典, eia.accountparam.AccountParamVO_assignedUnitCost]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 允许指定单价得会计事务多选引用子实体 (`eia.accountparam.AccountParamVO_assignedUnitCost`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_account_param_assigned` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`cea17e61-e57b-4d5e-b936-933d3fb06130`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 允许指定单价得会计事务多选引用子实体 |
| 物理表 | `ia_account_param_assigned` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 10 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `mainid` | `yonbip-fi-eaai2.RefTable_a70ca2f048` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `fkid` | `` |

## 继承接口 (3个, 6字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 10 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `assignedUnitCost` | 允许指定单价得会计事务 |
| `creator` | `creator` | `creator` | 创建人 |
| `fkid` | `fkid` | `fkid` | 外键 |
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
