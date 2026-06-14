---
tags: [BIP, 元数据, 数据字典, EFA.lease.FaLeaseChangeFinance]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 使用权资产变更财务信息 (`EFA.lease.FaLeaseChangeFinance`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_lease_change_finance` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`5cf2bdef-2e5e-496c-9c42-9dd2af7ee31e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 使用权资产变更财务信息 |
| 物理表 | `fa_lease_change_finance` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 42 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `lease_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `reduce_way_id` | `finbd.bd_reducewayref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `acc_currtype_id` | `ucfbasedoc.bd_currencytenantref` |

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

> 共 42 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `af_life_month` | `af_life_month` | `afLifeMonth` | 变更后使用年月 |
| `be_life_month` | `be_life_month` | `beLifeMonth` | 变更前使用年月 |
| `depr_method_id` | `depr_method_id` | `deprMethodId` | 折旧方法 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_currtype_id` | `acc_currtype_id` | `accCurrtypeId` | 本币币种 |
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `creator` | `creator` | `creator` | 创建人 |
| `lease_id` | `lease_id` | `leaseId` | 使用权资产变更 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织币币种 |
| `reduce_way_id` | `reduce_way_id` | `reduceWayId` | 减少方式 |
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

### 数值字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_accum_depr_amount` | `acc_accum_depr_amount` | `accAccumDeprAmount` | 本币累计折旧 |
| `acc_accum_imp_amount` | `acc_accum_imp_amount` | `accAccumImpAmount` | 本币累计减值 |
| `acc_af_lease_payment` | `acc_af_lease_payment` | `accAfLeasePayment` | 本币变更后租赁付款额 |
| `acc_af_unconfirmed_fc_amount` | `acc_af_unconfirmed_fc_amount` | `accAfUnconfirmedFcAmount` | 本币变更后未确认融资费用 |
| `acc_be_lease_payment` | `acc_be_lease_payment` | `accBeLeasePayment` | 本币变更前租赁付款额 |
| `acc_be_unconfirmed_fc_amount` | `acc_be_unconfirmed_fc_amount` | `accBeUnconfirmedFcAmount` | 本币变更前未确认融资费用 |
| `acc_dis_accum_depr_amount` | `acc_dis_accum_depr_amount` | `accDisAccumDeprAmount` | 本币处置累计折旧 |
| `acc_dis_accum_imp_amount` | `acc_dis_accum_imp_amount` | `accDisAccumImpAmount` | 本币处置累计减值 |
| `acc_dis_adjust_depr_amount` | `acc_dis_adjust_depr_amount` | `accDisAdjustDeprAmount` | 本币处置影响折旧额 |
| `acc_dis_lease_ori_value_amount` | `acc_dis_lease_ori_value_amount` | `accDisLeaseOriValueAmount` | 本币处置使用权资产原值 |
| `acc_dis_unconfirmed_fc_amount` | `acc_dis_unconfirmed_fc_amount` | `accDisUnconfirmedFcAmount` | 本币处置未确认融资费用 |
| `acc_net_value` | `acc_net_value` | `accNetValue` | 本币账面净值 |
| `acc_ori_value_amount` | `acc_ori_value_amount` | `accOriValueAmount` | 本币原值 |
| `org_accum_depr_amount` | `org_accum_depr_amount` | `orgAccumDeprAmount` | 组织币累计折旧 |
| `org_accum_imp_amount` | `org_accum_imp_amount` | `orgAccumImpAmount` | 组织币累计减值 |
| `org_af_lease_payment` | `org_af_lease_payment` | `orgAfLeasePayment` | 组织币变更后租赁付款额 |
| `org_af_unconfirmed_fc_amount` | `org_af_unconfirmed_fc_amount` | `orgAfUnconfirmedFcAmount` | 组织币变更后未确认融资费用 |
| `org_be_lease_pavment` | `org_be_lease_pavment` | `orgBeLeasePayment` | 组织币变更前租赁付款额 |
| `org_be_unconfirmed_fc_amount` | `org_be_unconfirmed_fc_amount` | `orgBeUnconfirmedFcAmount` | 组织币变更前未确认融资费用 |
| `org_dis_accum_depr_amount` | `org_dis_accum_depr_amount` | `orgDisAccumDeprAmount` | 组织币处置累计折旧 |
| `org_dis_accum_imp_amount` | `org_dis_accum_imp_amount` | `orgDisAccumImpAmount` | 组织币处置累计减值 |
| `org_dis_adjust_depr_amount` | `org_dis_adjust_depr_amount` | `orgDisAdjustDeprAmount` | 组织币处置影响折旧额 |
| `org_dis_lease_ori_value_amount` | `org_dis_lease_ori_value_amount` | `orgDisLeaseOriValueAmount` | 组织币处置使用权资产原值 |
| `org_dis_unconfirmed_fc_amount` | `org_dis_unconfirmed_fc_amount` | `orgDisUnconfirmedFcAmount` | 组织币处置未确认融资费用 |
| `org_net_value` | `org_net_value` | `orgNetValue` | 组织币账面净值 |
| `org_ori_value_amount` | `org_ori_value_amount` | `orgOriValueAmount` | 组织币原值 |
