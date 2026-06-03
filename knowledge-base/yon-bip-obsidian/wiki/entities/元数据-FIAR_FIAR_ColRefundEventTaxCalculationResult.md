---
tags: [BIP, 元数据, 数据字典, FIAR.FIAR.ColRefundEventTaxCalculationResult]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计税单 (`FIAR.FIAR.ColRefundEventTaxCalculationResult`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`arap_ledger_g_taxcalc` | domain：`yonbip-fi-earap` | 应用：`EAR` | 业务对象ID：`8fadc641-5abf-4eed-9f06-99c607cb4536`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计税单 |
| 物理表 | `arap_ledger_g_taxcalc` |
| 数据库 schema | `yonbip-fi-earap` |
| 所属应用 | `EAR` |
| 直连字段 | 61 个 |
| 子表 | 0 个 |
| 关联引用 | 16 个 |

## 关联引用 (16个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `free_ch_id` | `` |
| `tax_bureau_id` | `yonbip-fi-taxpubdoc.RefTable_457b0fd24` |
| `tax_type_id` | `yonbip-fi-taxpubdoc.RefTable_c271791694` |
| `ytenant_id` | `` |
| `body_id` | `` |
| `tax_code_id` | `yonbip-fi-taxpubdoc.RefTable_832e0ffa60` |
| `calc_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `calc_component_id` | `yonbip-fi-taxpubdoc.RefTable_9ec104ed1` |
| `calc_input_bid` | `` |
| `tax_rate_id` | `yonbip-fi-taxpubdoc.RefTable_55c5b82f11` |
| `calc_input_id` | `` |
| `calc_unit_id` | `productcenter.pc_unitref` |
| `event_id` | `` |
| `tax_subject_id` | `yonbip-fi-taxpubdoc.RefTable_182eb8090` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 61 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_book_id` | `acc_book_id` | `accBookId` | 财务账簿ID |
| `acc_period_code` | `acc_period_code` | `accPeriodCode` | 会计期间编码 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年度编码 |
| `arap_event_type` | `arap_event_type` | `arapEventType` | 应收应付会计事务类型 |
| `bln_carryover` | `bln_carryover` | `blnCarryover` | 是否结转 |
| `calc_component_formula` | `calc_component_formula` | `calculationComponentFormula` | 计税组件表达式 |
| `carryover_period_code` | `carryover_period_code` | `carryoverPeriodCode` | 结转期间编码 |
| `carryover_year_code` | `carryover_year_code` | `carryoverYearCode` | 结转年度编码 |
| `dtc_gtxid` | `dtc_gtxid` | `dtcGtxid` | 全局分布式事务ID |
| `event_type_id` | `event_type_id` | `eventTypeId` | 会计事务类型ID |
| `finance_org_id` | `finance_org_id` | `financeOrgId` | 会计主体ID |
| `id` | `id` | `id` | 主键 |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `body_id` | `body_id` | `body` | 收款退款明细信息 |
| `calc_currency_id` | `calc_currency_id` | `calcCurrencyId` | 计税币种 |
| `calc_component_id` | `calc_component_id` | `calculationComponentId` | 计税组件 |
| `calc_input_bid` | `calc_input_bid` | `calculationInputBid` | 计税输入明细 |
| `calc_input_id` | `calc_input_id` | `calculationInputId` | 计税输入 |
| `creator` | `creator` | `creator` | 创建人 |
| `event_id` | `event_id` | `event` | 收款退款基本信息(租户) |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `tax_bureau_id` | `tax_bureau_id` | `taxBureauArchiveId` | 税制 |
| `tax_type_id` | `tax_type_id` | `taxCategoryArchiveId` | 税种 |
| `tax_code_id` | `tax_code_id` | `taxCodeId` | 税码 |
| `tax_subject_id` | `tax_subject_id` | `taxItemId` | 税目 |
| `tax_rate_id` | `tax_rate_id` | `taxrateId` | 税率 |
| `calc_unit_id` | `calc_unit_id` | `unitId` | 单位 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `calc_currency_type` | `calc_currency_type` | `currType` | 计税币种类型 |
| `round_type` | `round_type` | `roundingId` | 舍入规则 |
| `bln_hold_remit` | `bln_hold_remit` | `withholdRemit` | 是否代扣代缴 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtc_status` | `dtc_status` | `dtcStatus` | 分布式事务的状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_period_id` | `acc_period_id` | `accPeriodId` | 会计期间ID |
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年度ID |
| `carryover_period_id` | `carryover_period_id` | `carryoverPeriodId` | 结转期间ID |
| `carryover_year_id` | `carryover_year_id` | `carryoverYearId` | 结转年度ID |

### 数值字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_deduct_tax_amount` | `acc_deduct_tax_amount` | `accDeductTaxAmount` | 本币减免税额 |
| `acc_final_tax_amount` | `acc_final_tax_amount` | `accFinTaxAmount` | 本币最终税额 |
| `acc_calc_amount` | `acc_calc_amount` | `accTaxAmount` | 本币计税金额 |
| `ori_calc_amount` | `ori_calc_amount` | `calcMny` | 计税金额 |
| `calc_quantity` | `calc_quantity` | `calcQty` | 计税数量 |
| `ori_calc_tax_amount` | `ori_calc_tax_amount` | `calcTaxMny` | 计算税额 |
| `deduct_tax_rate` | `deduct_tax_rate` | `deductTaxrateQty` | 减免税率值 |
| `ori_deduct_tax_amount` | `ori_deduct_tax_amount` | `finDeductTaxMny` | 最终减免税额 |
| `ori_final_tax_amount` | `ori_final_tax_amount` | `finTaxMny` | 最终税额 |
| `gbl_deduct_tax_amount` | `gbl_deduct_tax_amount` | `gblDeductTaxAmount` | 全局币减免税额 |
| `gbl_final_tax_amount` | `gbl_final_tax_amount` | `gblFinTaxAmount` | 全局币最终税额 |
| `gbl_calc_amount` | `gbl_calc_amount` | `gblTaxAmount` | 全局币计税金额 |
| `grp_deduct_tax_amount` | `grp_deduct_tax_amount` | `grpDeductTaxAmount` | 集团币减免税额 |
| `grp_final_tax_amount` | `grp_final_tax_amount` | `grpFinTaxAmount` | 集团币最终税额 |
| `grp_calc_amount` | `grp_calc_amount` | `grpTaxAmount` | 集团币计税金额 |
| `org_deduct_tax_amount` | `org_deduct_tax_amount` | `orgDeductTaxAmount` | 组织币减免税额 |
| `org_final_tax_amount` | `org_final_tax_amount` | `orgFinTaxAmount` | 组织币最终税额 |
| `org_calc_amount` | `org_calc_amount` | `orgTaxAmount` | 组织币计税金额 |
| `tax_rate` | `tax_rate` | `taxrateQty` | 税率值 |
| `ori_deduct_balance` | `ori_deduct_balance` | `totDeductMny` | 累计减免金额(明细汇总) |
| `ori_deduct_tax_balance` | `ori_deduct_tax_balance` | `totDeductTaxMny` | 累计减免税额(明细汇总) |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征 |
