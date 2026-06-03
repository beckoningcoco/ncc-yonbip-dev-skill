---
tags: [BIP, 元数据, 数据字典, EIA.EIA.DepreciationBillBodyItemVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计提跌价准备孙表 (`EIA.EIA.DepreciationBillBodyItemVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_depreciationbill_g` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`9b23ae50-f691-42a5-853b-c53019d58caf`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计提跌价准备孙表 |
| 物理表 | `ia_depreciationbill_g` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 24 个 |
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

> 共 24 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `section_code` | `section_code` | `sectionCode` | 分段编码 |
| `section_name` | `section_name` | `sectionName` | 分段名称 |
| `description` | `description` | `description` | 备注 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `body_id` | `body_id` | `body` | 外键 |

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

### 数值字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_accrued_amount` | `org_accrued_amount` | `orgAccruedAmount` | 组织币应计提成本 |
| `org_balance_amount` | `org_balance_amount` | `orgBalanceAmount` | 组织币结存成本 |
| `accbook_accrued_amount` | `accbook_accrued_amount` | `accbookAccruedAmount` | 本币应计提成本 |
| `accbook_balance_amount` | `accbook_balance_amount` | `accbookBalanceAmount` | 本币结存成本 |
| `group_accrued_amount` | `group_accrued_amount` | `groupAccruedAmount` | 集团应计提成本 |
| `group_balance_amount` | `group_balance_amount` | `groupBalanceAmount` | 集团币结存成本 |
| `global_accrued_amount` | `global_accrued_amount` | `globalAccruedAmount` | 全局应计提成本 |
| `global_balance_amount` | `global_balance_amount` | `globalBalanceAmount` | 全局币结存成本 |
| `section_qty` | `section_qty` | `sectionQty` | 分段数量 |
| `section_ratio` | `section_ratio` | `sectionRatio` | 分段比例 |
| `section_end` | `section_end` | `sectionEnd` | 分段结束 |
| `section_start` | `section_start` | `sectionStart` | 分段开始 |
