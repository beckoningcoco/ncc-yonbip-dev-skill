---
tags: ["BIP", "元数据", "数据字典", "ycContractManagement", "cpu-contract.contractchangenew.ContractPayTermHistoryNewVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 合同付款协议变更历史 (`cpu-contract.contractchangenew.ContractPayTermHistoryNewVO`)

> ycContractManagement | 物理表：`cpu_ct_payterm_history`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同付款协议变更历史 |
| 物理表 | `cpu_ct_payterm_history` |
| domain/服务域 | `cpu-contract` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycContractManagement` |
| 构建时间 | `2026-06-04 23:44:25.1160` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（63个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ContractPayTermHistoryNewVODefineCharacter` | 协议变更特征属性组 | `defineCharacter` | 9dd71c81-826a-40e9-9ca4-f6015211f137 |
| 2 | `CtPayTermCharacterDefine` | 采购合同协议特征属性组 | `defineCharacter` | 1eced9c7-16a7-43c7-a4fd-10da89cba2e3 |
| 3 | `accountingUnit` | 账期单位 | `accounting_unit` | String |
| 4 | `contractHistoryId` | 合同历史主表id | `contract_history_id` | 49f97b1c-2c1f-4fc9-855d-6a465985bdf3 |
| 5 | `contractId` | 合同主表id | `contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 |
| 6 | `prServiceConfirmMoney` | 项目云累计服务确认金额 | `pr_service_confirm_money` | Decimal |
| 7 | `supplydocId` | 供应商档案ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 8 | `delayDay` | 延迟天数 | `delay_day` | Integer |
| 9 | `pubts` | 时间戳 | `ts` | DateTime |
| 10 | `delayMonth` | 延迟月份 | `delay_month` | Integer |
| 11 | `dueDateType` | 到期日确定方式 | `due_date_type` | String |
| 12 | `fixedexpireDay` | 固定到期日 | `fixedexpire_day` | Integer |
| 13 | `fixedexpireDay1` | 固定到期日1 | `fixedexpire_day1` | Integer |
| 14 | `fixedexpireDay2` | 固定到期日2 | `fixedexpire_day2` | Integer |
| 15 | `fixedexpireDay3` | 固定到期日3 | `fixedexpire_day3` | Integer |
| 16 | `fixedexpireDay4` | 固定到期日4 | `fixedexpire_day4` | Integer |
| 17 | `fixedoutDay` | 固定出账日 | `fixedout_day` | Integer |
| 18 | `fixedoutDay1` | 固定出账日1 | `fixedout_day1` | Integer |
| 19 | `fixedoutDay2` | 固定出账日2 | `fixedout_day2` | Integer |
| 20 | `fixedoutDay3` | 固定出账日3 | `fixedout_day3` | Integer |
| 21 | `fixedoutDay4` | 固定出账日4 | `fixedout_day4` | Integer |
| 22 | `outDay` | 出账日 | `out_day` | DateTime |
| 23 | `outDayType` | 出账日确定方式 | `out_day_type` | String |
| 24 | `payName` | 付款名称 | `pay_name` | String |
| 25 | `payPointAfterDayNew` | 账期 | `pay_point_after_day_new` | Integer |
| 26 | `ts` | 时间戳 | `ts` | DateTime |
| 27 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 28 | `id` | ID | `id` | Long |
| 29 | `contractPayTermId` | 原合同预付款ID | `contract_payterm_id` | e9956481-c2c6-4f0b-a371-960b026a67f6 |
| 30 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 31 | `payPeriod` | 付款阶段 | `pay_period` | Integer |
| 32 | `enterpriseName` | 所属租户名称 | `enterprise_name` | String |
| 33 | `payPoint` | 付款起点 | `pay_point` | String |
| 34 | `payPointName` | 付款起点 | `pay_point_name` | String |
| 35 | `payPointId` | 付款起点 | `pay_point_id` | a4a03d83-ea92-422d-9f64-b5f18f26a4a9 |
| 36 | `payPointAfterDay` | 账期天数 | `pay_point_after_day` | Integer |
| 37 | `payRatio` | 付款比例% | `pay_ratio` | Decimal |
| 38 | `dr` | dr | `dr` | Integer |
| 39 | `payTaxMoney` | 付款金额 | `pay_tax_money` | Decimal |
| 40 | `accPayApplyMoney` | 累计预付付款申请金额 | `acc_pay_apply_money` | Decimal |
| 41 | `advancePay` | 是否预付款 | `advance_pay` | Boolean |
| 42 | `shelf` | 是否质保金 | `shelf` | Boolean |
| 43 | `settleType` | 结算方式 | `settle_type` | String |
| 44 | `settleTypeName` | 结算方式 | `settle_type_name` | String |
| 45 | `settleTypeId` | 结算方式 | `settle_type_id` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff |
| 46 | `defaultValueEditable` | defaultValueEditable | `default_value_editable` | Boolean |
| 47 | `changingAction` | 变更动作:删除原协议、变更协议、新增协议 | `changing_action` | String |
| 48 | `changingInfo` | 变更信息 | `changing_info` | String |
| 49 | `memo` | 备注 | `memo` | String |
| 50 | `prePayType` | 预付折算方式 | `pre_pay_type` | String |
| 51 | `isProgressConfirm` | 需进度确认 | `is_progress_confirm` | String |
| 52 | `initialDate` | 起算日 | `initial_date` | DateTime |
| 53 | `dueDate` | 到期日 | `due_date` | DateTime |
| 54 | `intendPaymentmny` | 累计预付金额 | `intend_paymentmny` | Decimal |
| 55 | `practicalPaymentmny` | 累计预付实付金额 | `practical_paymentmny` | Decimal |
| 56 | `totalPayContractMoney` | 累计付款申请金额 | `total_pay_contract_money` | Decimal |
| 57 | `defines` | 表体付款协议自定义项 | `` | d7442fd9-936f-4085-9f2d-6445e0b3ad39 |
| 58 | `paymentInvoiceMoney` | 收票无税金额 | `payment_invoice_money` | Decimal |
| 59 | `paymentInvoiceNatMoney` | 本币收票无税金额 | `payment_invoice_nat_money` | Decimal |
| 60 | `paymentInvoiceNatTax` | 本币收票税额 | `payment_invoice_nat_tax` | Decimal |
| 61 | `paymentInvoiceNatTaxMoney` | 本币收票含税金额 | `payment_invoice_nat_tax_money` | Decimal |
| 62 | `paymentInvoiceTax` | 收票税额 | `payment_invoice_tax` | Decimal |
| 63 | `paymentInvoiceTaxMoney` | 收票含税金额 | `payment_invoice_tax_money` | Decimal |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `CtPayTermCharacterDefine` | 采购合同协议特征属性组 | `cpu-contract.contract.CtPayTermCharacterDefine` | None |  |
| 2 | `supplydocId` | 供应商档案ID | `aa.vendor.Vendor` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `payPointId` | 付款起点 | `bd.payments.PayStartBase` | Service |  |
| 5 | `contractPayTermId` | 原合同预付款ID | `cpu-contract.contract.ContractPayTermVO` | None |  |
| 6 | `contractId` | 合同主表id | `cpu-contract.contract.ContractVO` | None |  |
| 7 | `settleTypeId` | 结算方式 | `aa.settlemethod.SettleMethod` | Service |  |
| 8 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 9 | `ContractPayTermHistoryNewVODefineCharacter` | 协议变更特征属性组 | `cpu-contract.contractchangenew.CtPayTermHistoryCharacterDefine` | None |  |
| 10 | `contractHistoryId` | 合同历史主表id | `cpu-contract.contractchangenew.ContractHistryNewVO` | None | true |
| 11 | `defines` | 表体付款协议自定义项 | `cpu-contract.contractchangenew.ContractPayTermHistoryNewVODefine` | None | true |
