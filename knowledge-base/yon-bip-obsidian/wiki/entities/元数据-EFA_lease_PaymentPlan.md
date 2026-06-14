---
tags: [BIP, 元数据, 数据字典, EFA.lease.PaymentPlan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 付款计划 (`EFA.lease.PaymentPlan`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_payment_plan` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`72ab5693-d9be-4d88-8132-7608ad74377a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 付款计划 |
| 物理表 | `fa_payment_plan` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 27 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 27 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编码 |
| `end_date` | `end_date` | `endDate` | 受益结束日期 |
| `id` | `id` | `id` | 主键 |
| `payment_date` | `payment_date` | `paymentDate` | 计划付款日期 |
| `rent_type` | `rent_type` | `rentType` | 租金类型 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据 |
| `start_date` | `start_date` | `startDate` | 受益开始日期 |
| `version` | `version` | `version` | 版本 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asset_id` | `asset_id` | `assetId` | 固定资产卡片 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_discount` | `bln_discount` | `blnDiscount` | 是否参与折现 |
| `bln_effective` | `bln_effective` | `blnEffective` | 生效标识 |
| `bln_modified` | `bln_modified` | `blnModified` | 修改标识 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `discount_days` | `discount_days` | `discountDays` | 折现天数 |
| `version_no` | `version_no` | `versionNo` | 版本号 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `discount_factor` | `discount_factor` | `discountFactor` | 折现系数 |
| `lease_liability` | `lease_liability` | `leaseLiability` | 租赁负债现值 |
| `lease_payment` | `lease_payment` | `leasePayment` | 租赁付款额 |
| `ori_lease_liability` | `ori_lease_liability` | `oriLeaseLiability` | 租赁负债原值 |
| `out_tax_amount` | `out_tax_amount` | `outTaxAmount` | 不含税金额 |
| `tax_amount` | `tax_amount` | `taxAmount` | 税额 |
