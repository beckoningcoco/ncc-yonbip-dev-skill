---
tags: [BIP, 元数据, 数据字典, fa.fadepr.DeprAccural]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资产折旧计提 (`fa.fadepr.DeprAccural`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_depr_accural` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`f8c9a54f-d5a8-4ded-b109-2f9b7b74d81c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资产折旧计提 |
| 物理表 | `fa_depr_accural` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `accbook_property_id` | `fiepub.epub_accountbookpropertyref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `accounting_classifi` | `fiepub.fiepub_accountbooktypelistref` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |

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

> 共 21 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `msg` | `msg` | `msg` | 失败消息 |
| `period_code` | `period_code` | `period` | 会计期间编码 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `accbook_property_id` | `accbook_property_id` | `accbookProperty` | 账簿属性 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `accpurpose_id` | `accpurpose_id` | `accpurposeId` | 核算目的列表(系统) |
| `accounting_classifi` | `accounting_classifi` | `booktype` | 账簿分类 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `period_id` | `period_id` | `periodId` | 会计期间 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `last_accrued_time` | `last_accrued_time` | `lastAccuralTime` | 上次计提时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_all_fi_data_cancel_fail` | `is_all_fi_data_cancel_fail` | `isAllFiDataCancelFail` | 是否所有会计事务取消过账失败 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accrued_status` | `accrued_status` | `accuralStatus` | 计提状态 |
| `voucher_status` | `voucher_status` | `voucherStatus` | 过账状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_depr_rate_precision` | `org_depr_rate_precision` | `orgDeprRatePrecision` | 组织级折旧率精度 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |
