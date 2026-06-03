---
tags: [BIP, 元数据, 数据字典, efa1010.efa1010.FixedAssetSystemParamter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 系统参数设置 (`efa1010.efa1010.FixedAssetSystemParamter`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_system_param` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`5ff44779-4dc3-4b92-9f21-65b29433baff`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 系统参数设置 |
| 物理表 | `fa_system_param` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 34 个 |
| 子表 | 1 个 |
| 关联引用 | 4 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `FixedAssetDeprDimensionList` | `efa1010.efa1010.FixedAssetDeprDimension` | composition |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `` | `` |

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

> 共 34 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `book_keeping_model` | `book_keeping_model` | `bookkeepingmodel` | 财务记账模式 |
| `separator` | `separator` | `cateseparator` | 资产类别层级分隔符 |
| `daily_discount_rate_type` | `daily_discount_rate_type` | `dailyDiscountRateType` | 日折现率计算方式 |
| `use_change_bill` | `use_change_bill` | `useChangeBill` | 使用变动单 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begin_date` | `begin_date` | `begin_date` | 资产类别规则最早开始时间 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_af_settle_asset_process` | `bln_af_settle_asset_process` | `blnAfSettleAssetProcess` | 关结账后资产管理数据处理方式 |
| `bln_allocate_in` | `bln_allocate_in` | `blnAllocateIn` | 固定资产调入生成方式 |
| `bln_allocate_request_start` | `bln_allocate_request_start` | `blnAllocateRequestStart` | 是否启用调拨申请管理 |
| `bln_api_use_change_bill` | `bln_api_use_change_bill` | `blnApiUseChangeBill` | api是否接入变动单 |
| `bln_check_custodian` | `bln_check_custodian` | `blnCheckCustodian` | 校验保管人关系 |
| `bln_lease` | `bln_lease` | `blnLease` | 启用使用权资产特性 |
| `bln_cat_need_audit` | `bln_cat_need_audit` | `isauditclass` | 账簿级资产类别版本管理 |
| `bln_consistent` | `bln_consistent` | `isconsistent` | 同一卡片不同账簿不同类别 |
| `bln_depr_post_time` | `bln_depr_post_time` | `isdeprpostpoint` | 折旧过账时点 |
| `bln_depr_to_acc` | `bln_depr_to_acc` | `isdeprtoacc` | 折旧分配到科目 |
| `bln_display_add_equ` | `bln_display_add_equ` | `isdispaddequ` | 是否显示附属设备 |
| `bln_display_asset_card` | `bln_display_asset_card` | `isdispassetcard` | 是否显示科目分配 |
| `bln_display_cost` | `bln_display_cost` | `isdispexprec` | 是否显示费用记录 |
| `bln_future_period_enter` | `bln_future_period_enter` | `isenterfuture` | 允许未来期间录入 |
| `bln_mult_acc_feature` | `bln_mult_acc_feature` | `ismultaccbookfeature` | 多账簿特性 |
| `bln_one_of_quan` | `bln_one_of_quan` | `isoneofquan` | 资产一物一卡管理 |
| `bln_percentage` | `bln_percentage` | `ispercentage` | 分配比例显示方式 |
| `bln_display_src` | `bln_display_src` | `issourceinfo` | 是否显示来源信息 |
| `bln_senior_depr` | `bln_senior_depr` | `issuperdepr` | 启用高级折旧方法 |
| `bln_manual_modify_bln_lease` | `bln_manual_modify_bln_lease` | `blnManualModifyBlnLease` | 是否手工修改启用使用权资产特性 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `FixedAssetDeprDimensionList` | 折旧分配维度定义 |
