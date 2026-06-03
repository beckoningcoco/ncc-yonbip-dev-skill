---
tags: [BIP, 元数据, 数据字典, GL.GL.InnerTransMatchData]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 对符数据 (`GL.GL.InnerTransMatchData`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_inner_trans_match_data` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`378653b6-65a5-4408-97ad-c7fc3769dc1d`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 对符数据 |
| 物理表 | `gl_inner_trans_match_data` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 16 个 |
| 子表 | 2 个 |
| 关联引用 | 5 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `InnerTransFilterList` | `GL.GL.InnerTransFilter` | composition |
| `InnerTransDataList` | `GL.GL.InnerTransData` | composition |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

## 继承接口 (3个, 6字段)

- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 16 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `batch` | `batch` | `batch` | 批次号 |
| `coordination_no` | `coordination_no` | `coordinationNo` | 协同号 |
| `id` | `id` | `id` | 主键 |
| `rule_id` | `rule_id` | `rule` | 对账规则 |
| `version` | `version` | `version` | 版本号 |

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

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_voucher` | `bln_voucher` | `blnVoucher` | 是否是凭证数据 |
| `match_state` | `match_state` | `matchState` | 对符状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `InnerTransDataList` | 本对方对账数据 |
| `` | `` | `InnerTransFilterList` | 对账数据查询条件 |
