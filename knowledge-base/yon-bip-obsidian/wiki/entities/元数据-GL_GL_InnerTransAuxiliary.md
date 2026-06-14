---
tags: [BIP, 元数据, 数据字典, GL.GL.InnerTransAuxiliary]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 辅助核算 (`GL.GL.InnerTransAuxiliary`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`gl_inner_trans_auxiliary_tb` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`5bb88ff4-5ba7-41a7-a215-79b43455fb91`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 辅助核算 |
| 物理表 | `gl_inner_trans_auxiliary_tb` |
| domain/服务域 | `yonbip-fi-egl` |
| schema | `figl` |
| 所属应用 | `GL` |
| 直连字段 | 11 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `auxiliary_id` | `fiepub.epub_multidimensionextref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `rule_id` | `yonbip-fi-egl.RefTable_7406dde875` |
| `ytenant_id` | `` |

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

> 共 11 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `code` | `code` | `code` | 编码 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rule_id` | `rule_id` | `rule` | 内部交易对账规则 |
| `auxiliary_id` | `auxiliary_id` | `auxiliary` | 辅助核算 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 最新修改时间 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
