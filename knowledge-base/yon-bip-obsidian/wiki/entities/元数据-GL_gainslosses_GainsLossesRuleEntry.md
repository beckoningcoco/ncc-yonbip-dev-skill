---
tags: [BIP, 元数据, 数据字典, GL.gainslosses.GainsLossesRuleEntry]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 本方分录规则 (`GL.gainslosses.GainsLossesRuleEntry`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fi_exchange_gains_losses_entry_subject_tb` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`7c3969b2-c993-472e-a3b2-90653c4a79ec`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 本方分录规则 |
| 物理表 | `fi_exchange_gains_losses_entry_subject_tb` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 14 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `accsubject` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `ytenant_id` | `` |
| `rule_id` | `` |

## 继承接口 (2个, 5字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 14 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auxiliary` | `auxiliary` | `auxiliary` | 入账辅助核算 |
| `srctplid` | `srctplid` | `srcTplId` | 档案ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accsubject` | `accsubject` | `accSubject` | 入账科目 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `rule_id` | `rule_id` | `ruleId` | 外键 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `follow_calc_accsubject` | `follow_calc_accsubject` | `followCalcAccSubject` | 同结转科目 |
| `follow_calc_auxiliary` | `follow_calc_auxiliary` | `followCalcAuxiliary` | 同结转科目辅助核算 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `description` | `description` | `description` | 摘要 |
