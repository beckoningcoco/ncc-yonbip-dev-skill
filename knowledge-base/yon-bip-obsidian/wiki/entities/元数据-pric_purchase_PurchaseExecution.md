---
tags: [BIP, 元数据, 数据字典, pric.purchase.PurchaseExecution]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 项目采购基本信息 (`pric.purchase.PurchaseExecution`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pm_purchase_execution` | domain：`yonbip-pm-revexp` | 应用：`PRPR` | 业务对象ID：`d33969d8-7ea0-4981-9bfe-03a57e4f648f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 项目采购基本信息 |
| 物理表 | `pm_purchase_execution` |
| domain/服务域 | `yonbip-pm-revexp` |
| schema | `pmcloud` |
| 所属应用 | `PRPR` |
| 直连字段 | 68 个 |
| 子表 | 1 个 |
| 关联引用 | 15 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `items` | `pric.purchase.PurchaseExecutionItem` | composition |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `receive_org_id` | `ucf-org-center.bd_financeorgtreeref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `deal_psn_id` | `` |
| `org_id` | `` |
| `nat_currency_id` | `` |
| `exchange_rate_type_id` | `` |
| `purchaser_id` | `ucf-staff-center.bd_staff_all_ref` |
| `purchase_exec_define_character` | `` |
| `supply_id` | `` |
| `currency_id` | `` |
| `project_id` | `` |
| `purchaser_dept_id` | `ucf-org-center.org_pure_tree_ref` |
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

> 共 68 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_code` | `contract_code` | `contractCode` | 采购合同编码 |
| `contract_id` | `contract_id` | `contractId` | 采购合同ID |
| `contract_name` | `contract_name` | `contractName` | 采购合同名称 |
| `contract_status` | `contract_status` | `contractStatus` | 采购合同状态 |
| `id` | `id` | `id` | ID |
| `settlement_basis` | `settlement_basis` | `settlementBasis` | 结算依据 |
| `ctjl_code` | `ctjl_code` | `ctjlCode` | 合同台帐编号 |
| `ctjl_id` | `ctjl_id` | `ctjlId` | 合同台账id |
| `expense_flag` | `expense_flag` | `expenseFlag` | 是否对接费用报销 |
| `memo` | `memo` | `memo` | 备注 |
| `ownership_contract_code` | `ownership_contract_code` | `ownershipContractCode` | 所属合同编码 |
| `ownership_contract_id` | `ownership_contract_id` | `ownershipContractId` | 所属合同 |
| `service_confir_mode` | `service_confir_mode` | `serviceConfirMode` | 服务确认方式 |
| `supplier_collaboration_flag` | `supplier_collaboration_flag` | `supplierCollaborationFlag` | 是否供应商协同 |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creator` | `creator` | `creator` | 创建人 |
| `currency_id` | `currency_id` | `currencyId` | 币种 |
| `deal_psn_id` | `deal_psn_id` | `dealPsnId` | 处理人id |
| `exchange_rate_type_id` | `exchange_rate_type_id` | `exchangeRateTypeId` | 汇率类型 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `nat_currency_id` | `nat_currency_id` | `natCurrencyId` | 币种(本币) |
| `org_id` | `org_id` | `orgId` | 采购组织 |
| `project_id` | `project_id` | `projectId` | 项目ID |
| `purchaser_id` | `purchaser_id` | `purchaserId` | 采购员Id |
| `supply_id` | `supply_id` | `supplyId` | 供货商ID |
| `purchaser_dept_id` | `purchaser_dept_id` | `purchaserDeptId` | 采购部门 |
| `receive_org_id` | `receive_org_id` | `receiveOrgId` | 收票组织 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_effective_date` | `contract_effective_date` | `contractEffectiveDate` | 合同生效日期 |
| `contract_expiration_date` | `contract_expiration_date` | `contractExpirationDate` | 合同失效日期 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `epay_type` | `epay_type` | `epayType` | 是否超合同付款 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pmcloud_execution_flag` | `pmcloud_execution_flag` | `pmcloudExecutionFlag` | 是否项目云执行 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `opening_flag` | `opening_flag` | `openingFlag` | 期初标识 |
| `src_system` | `src_system` | `srcSystem` | 来源系统 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `contr_relate_type` | `contr_relate_type` | `contrRelateType` | 来源类型 |

### 数值字段 (28个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `contract_mny` | `contract_mny` | `contractMny` | 合同金额 |
| `exch_rate` | `exch_rate` | `exchRate` | 汇率 |
| `invoice_mny` | `invoice_mny` | `invoiceMny` | 收票金额 |
| `nat_contract_mny` | `nat_contract_mny` | `natContractMny` | 合同金额(本币) |
| `nat_invoice_mny` | `nat_invoice_mny` | `natInvoiceMny` | 收票金额(本币) |
| `nat_payed_mny` | `nat_payed_mny` | `natPayedMny` | 付款金额(本币) |
| `nat_payment_mny` | `nat_payment_mny` | `natPaymentMny` | 应付金额(本币) |
| `nat_settled_mny` | `nat_settled_mny` | `natSettledMny` | 结算金额(本币) |
| `payed_mny` | `payed_mny` | `payedMny` | 付款金额 |
| `payment_mny` | `payment_mny` | `paymentMny` | 应付金额 |
| `settled_mny` | `settled_mny` | `settledMny` | 结算金额 |
| `exec_ratio` | `exec_ratio` | `execRatio` | 执行比例 |
| `nat_pre_payment_mny` | `nat_pre_payment_mny` | `natPrePaymentMny` | 预付款金额(本币) |
| `nat_pre_payment_mny_return` | `nat_pre_payment_mny_return` | `natPrePaymentMnyReturn` | 预付退款金额(本币) |
| `nat_pre_payment_mny_written_off` | `nat_pre_payment_mny_written_off` | `natPrePaymentMnyWrittenOff` | 预付款核销金额(本币) |
| `nat_untaxed_contract_mny` | `nat_untaxed_contract_mny` | `natUntaxedContractMny` | 无税合同金额(本币) |
| `nat_withholding_amount_mny` | `nat_withholding_amount_mny` | `natWithholdingAmountMny` | 预提金额(本币) |
| `nat_withholding_balance_mny` | `nat_withholding_balance_mny` | `natWithholdingBalanceMny` | 预提余额(本币) |
| `nat_withholding_mny_written_off` | `nat_withholding_mny_written_off` | `natWithholdingMnyWrittenOff` | 预提核销金额(本币) |
| `nat_withholding_reverse_mny` | `nat_withholding_reverse_mny` | `natWithholdingReverseMny` | 预提红冲(本币) |
| `pre_payment_mny` | `pre_payment_mny` | `prePaymentMny` | 预付款金额 |
| `pre_payment_mny_return` | `pre_payment_mny_return` | `prePaymentMnyReturn` | 预付退款金额 |
| `pre_payment_mny_written_off` | `pre_payment_mny_written_off` | `prePaymentMnyWrittenOff` | 预付款核销金额 |
| `untaxed_contract_mny` | `untaxed_contract_mny` | `untaxedContractMny` | 无税合同金额 |
| `withholding_amount_mny` | `withholding_amount_mny` | `withholdingAmountMny` | 预提金额 |
| `withholding_balance_mny` | `withholding_balance_mny` | `withholdingBalanceMny` | 预提余额 |
| `withholding_mny_written_off` | `withholding_mny_written_off` | `withholdingMnyWrittenOff` | 预提核销金额 |
| `withholding_reverse_mny` | `withholding_reverse_mny` | `withholdingReverseMny` | 预提红冲 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `items` | 采购执行项 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `purchase_exec_define_character` | `purchase_exec_define_character` | `purchaseExecDefineCharacter` | 自定义项特征属性 |
