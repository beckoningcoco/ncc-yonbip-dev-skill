---
tags: [BIP, 元数据, 数据字典, znbzbx.tallydata.TallydataExtVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 账单扩展表 (`znbzbx.tallydata.TallydataExtVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_talltydata_ext` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 账单扩展表 |
| 物理表 | `znbz_talltydata_ext` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 39 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `id` | `` |

## 继承接口 (1个, 1字段)

- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 39 个直连字段

### 文本字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `buyer_company_register` | `buyer_company_register` | `buyer_company_register` | 购买方公司注册号 |
| `check_hint_message` | `check_hint_message` | `check_hint_message` | 校验提示信息 |
| `gender` | `gender` | `gender` | 性别 |
| `inpatient_department` | `inpatient_department` | `inpatient_department` | 住院科别 |
| `inpatient_number` | `inpatient_number` | `inpatient_number` | 住院号 |
| `invoiceGroupId` | `invoiceGroupId` | `invoiceGroupId` | 账单关联关系 |
| `invoiceThirdId` | `invoiceThirdId` | `invoiceThirdId` | 费控税务交互标识 |
| `invoice_number` | `invoice_number` | `invoice_number` | 发票编码 |
| `medical_institution_type` | `medical_institution_type` | `medical_institution_type` | 医疗机构类型 |
| `medical_insurance_number` | `medical_insurance_number` | `medical_insurance_number` | 医保编号 |
| `medical_insurance_type` | `medical_insurance_type` | `medical_insurance_type` | 医保类型 |
| `medical_record_number` | `medical_record_number` | `medical_record_number` | 病历号 |
| `original_invoiceno` | `original_invoiceno` | `original_invoiceno` | 原税票发票号码 |
| `outpatient_number` | `outpatient_number` | `outpatient_number` | 门诊号 |
| `project_name` | `project_name` | `project_name` | 项目名称 |
| `restaurant_name_all` | `restaurant_name_all` | `restaurant_name_all` | 餐厅名称（全） |
| `seller_company_register` | `seller_company_register` | `seller_company_register` | 销售方公司注册号 |
| `vallguests` | `vallguests` | `vallguests` | 所有入住人 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主表主键 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `admission_date` | `admission_date` | `admission_date` | 入院日期 |
| `discharge_date` | `discharge_date` | `discharge_date` | 出院日期 |
| `visit_date` | `visit_date` | `visit_date` | 就诊日期 |

### 数值字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `annual_health_insurance_coverage` | `annual_health_insurance_coverage` | `annual_health_insurance_coverage` | 年度医保范围内 |
| `annual_outpatient_catastrophic_payment` | `annual_outpatient_catastrophic_payment` | `annual_outpatient_catastrophic_payment` | 年度门诊大额支付 |
| `cash_payment` | `cash_payment` | `cash_payment` | 现金支付 |
| `diff_amount` | `diff_amount` | `diff_amount` | 差异金额 |
| `late_payment_fine` | `late_payment_fine` | `late_payment_fine` | 滞纳金 |
| `original_amount` | `original_amount` | `original_amount` | 原税票金额 |
| `other_payments` | `other_payments` | `other_payments` | 其他支付 |
| `overall_amount` | `overall_amount` | `overall_amount` | 统筹金额 |
| `personal_account_payment` | `personal_account_payment` | `personal_account_payment` | 个人账户支付 |
| `personal_expense` | `personal_expense` | `personal_expense` | 个人自费 |
| `personal_payment` | `personal_payment` | `personal_payment` | 个人自付 |
| `personal_self1` | `personal_self1` | `personal_self1` | 自付一 |
| `personal_self2` | `personal_self2` | `personal_self2` | 自付二 |
| `vehicle_vessel_tax` | `vehicle_vessel_tax` | `vehicle_vessel_tax` | 车船税 |
| `withholding_tax_amount` | `withholding_tax_amount` | `withholding_tax_amount` | 代扣税税额 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
