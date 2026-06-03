---
tags: [BIP, 元数据, 数据字典, EIA.EIA.DepreciationRateChildItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计提比率Item (`EIA.EIA.DepreciationRateChildItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_depreciation_rate_g` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`8d76ab92-c6c4-4aa6-8d58-1635fbf20704`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计提比率Item |
| 物理表 | `ia_depreciation_rate_g` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `body_id` | `` |

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

> 共 12 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `body_id` | `body_id` | `body` | 外键 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `row_no` | `row_no` | `rowNo` | 行号 |
| `rate_order` | `rate_order` | `rateOrder` | 范围顺序 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ratio` | `ratio` | `ratio` | 计提比率 |
