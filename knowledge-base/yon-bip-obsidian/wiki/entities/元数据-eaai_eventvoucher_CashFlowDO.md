---
tags: [BIP, 元数据, 数据字典, eaai.eventvoucher.CashFlowDO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 现金流量项目 (`eaai.eventvoucher.CashFlowDO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`aai_voucher_cashflow` | domain：`yonbip-fi-eaai` | 应用：`AAI` | 业务对象ID：`98f70a5f-8833-436d-bfcc-966d309e5c22`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 现金流量项目 |
| 物理表 | `aai_voucher_cashflow` |
| 数据库 schema | `yonbip-fi-eaai` |
| 所属应用 | `AAI` |
| 直连字段 | 27 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `cashflowitem` | `fiepub.fiepub_cashflowitecommref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `innerorg` | `ucf-org-center.org_pure_tree_ref` |
| `voucher_record_id` | `` |

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

> 共 27 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `accbook_id` | `accbook_id` | String | 账簿 |
| `accsubject_direction` | `accsubject_direction` | String | 科目方向 |
| `direction` | `direction` | String | 方向属性 |
| `gl_cash_flow_id` | `gl_cash_flow_id` | String | 总账现金流量ID |
| `merge_record_id` | `merge_record_id` | String | 事项分录合并ID |
| `period_code` | `period_code` | String | 期间编码 |
| `period_year` | `period_year` | String | 期间年 |
| `voucher_id` | `voucher_id` | String | 事项分录id |
| `id` | `id` | String | 主键 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `cashflowitem` | `cashflowitem` | b109e775-1973-4764-95d6-5f6efd9f0070 | 现金流量项目ID |
| `innerorg` | `innerorg` | 14302233-1394-4a70-94e1-bed51636f312 | 内部单位 |
| `voucher_record_id` | `voucher_record_id` | bb20407e-4c44-4dae-a919-bd08eb8f266a | 事项分录明细 |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `pubts` | `pubts` | DateTime | 时间戳 |
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `is_cash_flow_opening` | `is_cash_flow_opening` | Boolean | 是否为现金流量期初 |
| `main_item` | `main_item` | Boolean | 是否主表项目 |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `dr` | `dr` | Short | 逻辑删除 |

### 数值字段 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `amount_org` | `amount_org` | Decimal | 本币金额 |
| `amount_original` | `amount_original` | Decimal | 原币金额 |
| `control_amount` | `control_amount` | Decimal | 管控币金额 |
| `global_amount` | `global_amount` | Decimal | 全局币金额 |
| `group_amount` | `group_amount` | Decimal | 集团币金额 |
| `org_amount` | `org_amount` | Decimal | 组织币金额 |
