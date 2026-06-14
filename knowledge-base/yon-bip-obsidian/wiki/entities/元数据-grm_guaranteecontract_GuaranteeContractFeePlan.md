---
tags: [BIP, 元数据, 数据字典, grm.guaranteecontract.GuaranteeContractFeePlan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 费用方案 (`grm.guaranteecontract.GuaranteeContractFeePlan`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`grm_guarantee_contract_fee_plan` | domain：`yonbip-fi-ctmgrm` | 应用：`GRM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 费用方案 |
| 物理表 | `grm_guarantee_contract_fee_plan` |
| domain/服务域 | `yonbip-fi-ctmgrm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `GRM` |
| 直连字段 | 31 个 |
| 子表 | 0 个 |
| 关联引用 | 12 个 |

## 关联引用 (12个)

| 字段名 | 引用类型 |
|--------|---------|
| `expense_item` | `finbd.bd_expenseitemref` |
| `accentity_guarantor` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `vendor_fee_plan` | `` |
| `accentity_fee_plan` | `` |
| `vendor_guarantor` | `yssupplier.aa_vendor` |
| `ytenant_id` | `` |
| `feePlanDef` | `` |
| `customer_fee_plan` | `` |
| `currency` | `bd_currencytenantreflist` |
| `customer_guarantor` | `productcenter.aa_merchantref` |
| `mainid` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 31 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 费用方案编号 |
| `guarantor_type` | `guarantor_type` | `guarantorType` | 担保人类型 |
| `pay_method` | `pay_method` | `payMethod` | 费用收取方式 |
| `base` | `base` | `base` | 费用基数 |
| `frequency` | `frequency` | `frequency` | 费用频率 |
| `days` | `days` | `days` | 计费天数 |
| `fee_plan_direction` | `fee_plan_direction` | `feePlanDirection` | 费用方向 |
| `fee_plan_type` | `fee_plan_type` | `feePlanType` | 费用对象类型 |
| `guarantor` | `guarantor` | `guarantor` | 担保人 |
| `is_sync` | `is_sync` | `isSync` | 是否协同生成行数据 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 卡片主表关联标识 |
| `customer_guarantor` | `customer_guarantor` | `customerGuarantor` | 担保人客户id |
| `vendor_guarantor` | `vendor_guarantor` | `vendorGuarantor` | 担保人供应商id |
| `accentity_guarantor` | `accentity_guarantor` | `accentityGuarantor` | 担保人会计主体id |
| `expense_item` | `expense_item` | `expenseItem` | 费用项目Id |
| `currency` | `currency` | `currency` | 币种id |
| `accentity_fee_plan` | `accentity_fee_plan` | `accentityFeePlan` | 费用对象(资金伙伴) |
| `customer_fee_plan` | `customer_fee_plan` | `customerFeePlan` | 费用对象(客户) |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `vendor_fee_plan` | `vendor_fee_plan` | `vendorFeePlan` | 费用对象(供应商) |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `first_fee_date` | `first_fee_date` | `firstFeeDate` | 首次计费日 |
| `accrual_end_date` | `accrual_end_date` | `accrualEndDate` | 计提结束日 |
| `accrual_last_date` | `accrual_last_date` | `accrualLastDate` | 上次计提日 |
| `accrual_start_date` | `accrual_start_date` | `accrualStartDate` | 计提开始日 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 子表id |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amount` | `amount` | `amount` | 费用金额 |
| `rate` | `rate` | `rate` | 年费率(%) |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `feePlanDef` | `feePlanDef` | `feePlanDef` | 费用项目自定义项 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
