---
tags: [BIP, 元数据, 数据字典, eaai.mergerule.GLMergeRuleEventVoucherDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分录合并规则事项分录子表 (`eaai.mergerule.GLMergeRuleEventVoucherDO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aai_merge_rule_b_field` | domain：`yonbip-fi-eaai` | 应用：`AAI` | 业务对象ID：`f0b8252c-f1de-442a-bf28-f721575b312a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 分录合并规则事项分录子表 |
| 物理表 | `aai_merge_rule_b_field` |
| domain/服务域 | `yonbip-fi-eaai` |
| schema | `fieaai` |
| 所属应用 | `AAI` |
| 直连字段 | 10 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `header_id` | `` |

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

> 共 10 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `field` | `field` | String | 字段 |
| `id` | `id` | String | 主键 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `header_id` | `header_id` | 13c3898d-86d1-4c2f-a1df-857a8dd4611b | 分录合并规则 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `dr` | `dr` | Short | 逻辑删除 |
