---
tags: [BIP, 元数据, 数据字典, EFA.lease.FaLeaseChangePaymentRule]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 使用权资产变更付款规则 (`EFA.lease.FaLeaseChangePaymentRule`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_payment_rule` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`5cf2bdef-2e5e-496c-9c42-9dd2af7ee31e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 使用权资产变更付款规则 |
| 物理表 | `fa_payment_rule` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 17 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `src_bill_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 17 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `end_date` | `end_date` | `endDate` | 受益结束日期 |
| `id` | `id` | `id` | 主键 |
| `payment_date_ref` | `payment_date_ref` | `paymentDateRef` | 付款日期计算参照 |
| `payment_frequency` | `payment_frequency` | `paymentFrequency` | 付款频率 |
| `start_date` | `start_date` | `startDate` | 受益开始日期 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asset_id` | `asset_id` | `assetId` | 固定资产卡片 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 使用权资产变更 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `delay_days` | `delay_days` | `delayDays` | 第几天支付 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `lease_payment` | `lease_payment` | `leasePayment` | 含税金额 |
| `tax_amount` | `tax_amount` | `taxAmount` | 税额 |
