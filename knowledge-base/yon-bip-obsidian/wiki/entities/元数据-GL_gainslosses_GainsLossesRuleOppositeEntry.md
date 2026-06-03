---
tags: [BIP, 元数据, 数据字典, GL.gainslosses.GainsLossesRuleOppositeEntry]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 对方分录规则 (`GL.gainslosses.GainsLossesRuleOppositeEntry`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fi_exchange_gains_losses_entry_opposite_subject_tb` | domain：`yonbip-fi-egl` | 应用：`GL` | 业务对象ID：`7c3969b2-c993-472e-a3b2-90653c4a79ec`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 对方分录规则 |
| 物理表 | `fi_exchange_gains_losses_entry_opposite_subject_tb` |
| 数据库 schema | `yonbip-fi-egl` |
| 所属应用 | `GL` |
| 直连字段 | 18 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `loss_accsubject` | `fiepub.epub_accsubjectversion_treecard_ref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `cashflow_item` | `fiepub.fiepub_cashflowitecommref` |
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

> 共 18 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auxiliary` | `auxiliary` | `auxiliary` | 损益/收益辅助核算 |
| `loss_auxiliary` | `loss_auxiliary` | `lossAuxiliary` | 损失辅助核算 |
| `srctplid` | `srctplid` | `srcTplId` | 档案ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accsubject` | `accsubject` | `accSubject` | 损益/收益科目 |
| `loss_accsubject` | `loss_accsubject` | `lossAccSubject` | 损失科目 |
| `cashflow_item` | `cashflow_item` | `cashFlowItem` | 现金流量项目 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `rule_id` | `rule_id` | `ruleId` | 外键 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_follow_subject_direction` | `is_follow_subject_direction` | `blnFollowSubjectDirection` | 发生额方向限定 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_split` | `is_split` | `blnSplit` | 对方科目 |
| `currency` | `currency` | `currency` | 币种 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `description` | `description` | `description` | 摘要 |
