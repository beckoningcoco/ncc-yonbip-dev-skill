---
tags: [BIP, 元数据, 数据字典, FIEIA.FIEIA.IAUpgradeTask]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 存货任务升级 (`FIEIA.FIEIA.IAUpgradeTask`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_upgrade_task` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`b7076142-aa52-4599-ae2c-bc6e46ae9375`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 存货任务升级 |
| 物理表 | `ia_upgrade_task` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

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

> 共 14 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `info` | `info` | `info` | 提示信息 |
| `uptype` | `uptype` | `uptype` | 升级类型 |
| `status` | `status` | `status` | 状态 |
| `period_code` | `period_code` | `periodCode` | 会计期间 |
| `accentity_id` | `accentity_id` | `accentityId` | 会计主体 |
| `accbook_id` | `accbook_id` | `accbookId` | 账簿 |
| `id` | `id` | `id` | 主键 |

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
