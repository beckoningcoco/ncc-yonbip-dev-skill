---
tags: ["BIP", "元数据", "数据字典", "ycContractManagement", "cpu-contract.contractchangenew.ContractPrepayHistoryNewVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 合同预付付款单变更历史 (`cpu-contract.contractchangenew.ContractPrepayHistoryNewVO`)

> ycContractManagement | 物理表：`cpu_ct_prepay_history`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 合同预付付款单变更历史 |
| 物理表 | `cpu_ct_prepay_history` |
| 数据库 schema | `cpu-contract` |
| 所属应用 | `ycContractManagement` |
| 构建时间 | `2026-06-04 23:44:26.5190` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（42个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `contractHistoryId` | 合同历史主表id | `contract_history_id` | 49f97b1c-2c1f-4fc9-855d-6a465985bdf3 |
| 2 | `payPointName` | 付款起点名称 | `pay_point_name` | String |
| 3 | `settleTypeId` | 结算方式id | `settle_type_id` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff |
| 4 | `contractMaterialId` | 合同物料表主键 | `contract_material_id` | 07141343-35c1-4687-b99c-405bfa7a3096 |
| 5 | `paymentInvoiceMoney` | 收票无税金额 | `payment_invoice_money` | Decimal |
| 6 | `supplydocId` | 供应商档案ID | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 7 | `paymentInvoiceTax` | 收票税额 | `payment_invoice_tax` | Decimal |
| 8 | `pubts` | 时间戳 | `ts` | DateTime |
| 9 | `paymentInvoiceTaxMoney` | 收票含税金额 | `payment_invoice_tax_money` | Decimal |
| 10 | `paymentInvoiceNatMoney` | 本币收票无税金额 | `payment_invoice_nat_money` | Decimal |
| 11 | `paymentInvoiceNatTax` | 本币收票税额 | `payment_invoice_nat_tax` | Decimal |
| 12 | `paymentInvoiceNatTaxMoney` | 本币收票含税金额 | `payment_invoice_nat_tax_money` | Decimal |
| 13 | `expenseItemId` | 费用项目 | `expense_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 |
| 14 | `reqUapProjectId` | 平台项目档案id | `req_uap_project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 16 | `payPeriod` | 付款阶段(期号) | `pay_period` | Integer |
| 17 | `payPointAfterDay` | 账期天数 | `pay_point_after_day` | Integer |
| 18 | `serialNumber` | 序号 | `serial_number` | Integer |
| 19 | `takerOrgName` | 收票组织 | `taker_orgname` | String |
| 20 | `payRatio` | 付款比例 | `pay_ratio` | Decimal |
| 21 | `payTaxMoney` | 付款金额 | `pay_tax_money` | Decimal |
| 22 | `accPayApplyMoney` | 累计预付付款申请金额 | `acc_pay_apply_money` | Decimal |
| 23 | `intendPaymentmny` | 累计付款金额 | `intend_paymentmny` | Decimal |
| 24 | `practicalPaymentmny` | 累计实付金额 | `practical_paymentmny` | Decimal |
| 25 | `advancePay` | 是否预付款 | `advance_pay` | Boolean |
| 26 | `settleTypeName` | 结算方式 | `settle_type_name` | String |
| 27 | `initialDate` | 起算日 | `initial_date` | DateTime |
| 28 | `dueDate` | 到期日 | `due_date` | DateTime |
| 29 | `contractPrepayId` | 原合同预付款ID | `contract_prepay_id` | 6c467ee0-a02c-496c-958f-94b8fb0c566c |
| 30 | `id` | id | `id` | Long |
| 31 | `contractPaytermId` | 付款协议id | `ct_payterm_id` | e9956481-c2c6-4f0b-a371-960b026a67f6 |
| 32 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 33 | `enterpriseName` | 所属租户名称 | `enterprise_name` | String |
| 34 | `payPoint` | 付款起点code | `pay_point` | String |
| 35 | `takerOrgId` | 收票组织id | `taker_orgid` | 14302233-1394-4a70-94e1-bed51636f312 |
| 36 | `takerOrgCode` | 收票组织code | `taker_orgcode` | String |
| 37 | `settleType` | 结算方式code | `settle_type` | String |
| 38 | `changingAction` | 变更动作 | `changing_action` | String |
| 39 | `changingInfo` | 变更信息 | `changing_info` | String |
| 40 | `ts` | 时间戳 | `ts` | DateTime |
| 41 | `dr` | dr | `dr` | Integer |
| 42 | `contractId` | 合同主表id | `contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `expenseItemId` | 费用项目 | `bd.expenseitem.ExpenseItem` | Service |  |
| 2 | `reqUapProjectId` | 平台项目档案id | `bd.project.ProjectVO` | Service |  |
| 3 | `supplydocId` | 供应商档案ID | `aa.vendor.Vendor` | Service |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `contractId` | 合同主表id | `cpu-contract.contract.ContractVO` | None |  |
| 6 | `contractPaytermId` | 付款协议id | `cpu-contract.contract.ContractPayTermVO` | None |  |
| 7 | `settleTypeId` | 结算方式id | `aa.settlemethod.SettleMethod` | Service |  |
| 8 | `contractPrepayId` | 原合同预付款ID | `cpu-contract.contract.ContractPrepayVo` | None |  |
| 9 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 10 | `takerOrgId` | 收票组织id | `org.func.BaseOrg` | Service |  |
| 11 | `contractMaterialId` | 合同物料表主键 | `cpu-contract.contract.ContractBodyVO` | None |  |
| 12 | `contractHistoryId` | 合同历史主表id | `cpu-contract.contractchangenew.ContractHistryNewVO` | None | true |
