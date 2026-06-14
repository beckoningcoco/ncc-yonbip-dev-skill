---
tags: [BIP, 元数据, 数据字典, EFA.EFA.FaInitAmount]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 期初余额 (`EFA.EFA.FaInitAmount`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_init_balance` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`fd22dbe1-b1c0-43fe-8d0c-f1a57e3642a1`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 期初余额 |
| 物理表 | `fa_init_balance` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
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

> 共 22 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_id` | `accentity_id` | `accentityId` | 会计主体id |
| `accbook_id` | `accbook_id` | `accbookId` | 账簿id |
| `period_code` | `period_code` | `periodCode` | 会计期间code |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 币种 |
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

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `period_id` | `period_id` | `periodId` | 会计期间id |

### 数值字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `init_ori_value` | `init_ori_value` | `initOriValue` | 期初原值 |
| `ori_value_balance` | `ori_value_balance` | `oriValueBalance` | 本期原值 |
| `af_ori_value` | `af_ori_value` | `afOriValue` | 期末原值 |
| `init_accum_depr_amount` | `init_accum_depr_amount` | `initAccumDeprAmount` | 期初累计折旧 |
| `accum_depr_amount_balance` | `accum_depr_amount_balance` | `accumDeprAmountBalance` | 本期累计折旧 |
| `af_accum_depr_amount` | `af_accum_depr_amount` | `afAccumDeprAmount` | 期末累计折旧 |
| `init_accum_impairment_amount` | `init_accum_impairment_amount` | `initAccumImpairmentAmount` | 期初累计减值 |
| `impairment_amount_balance` | `impairment_amount_balance` | `impairmentAmountBalance` | 本期累计减值 |
| `af_accum_impairment_amount` | `af_accum_impairment_amount` | `afAccumImpairmentAmount` | 期末累计减值 |
