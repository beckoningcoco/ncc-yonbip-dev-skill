---
tags: [BIP, 元数据, 数据字典, GL.GL.CloseAccount]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 总账关账 (`GL.GL.CloseAccount`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fi_close_account` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`43c5d0bc-2e4f-4378-a0b3-c0e4072b0ffd`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 总账关账 |
| 物理表 | `fi_close_account` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 16 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `period_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `accperiod_scheme` | `finbd.bd_accperiodscheme` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |

## 继承接口 (4个, 8字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **期间类** (`ecc.common.IPeriod`)
  - `period_id` → `period_id`
  - `period_code` → `period_code`

## 字段列表（按类型分组）

> 共 16 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `period_code` | `period_code` | `periodCode` | 会计期间编码 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `period_id` | `period_id` | `period` | 会计期间 |
| `accperiod_scheme` | `accperiod_scheme` | `accperiodScheme` | 期间方案 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 最新修改时间 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `close_status` | `close_status` | `closeStatus` | 关账状态 |
| `period_status` | `period_status` | `periodStatus` | 结账状态 |
| `close_check_status` | `close_check_status` | `closeCheckStatus` | 检查结果 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### quoteList (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
