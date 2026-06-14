---
tags: [BIP, 元数据, 数据字典, tlm.financein.FinanceinCostFlow]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 融入登记费用明细 (`tlm.financein.FinanceinCostFlow`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financein_cost_flow` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`173e9ebc-c4ca-440a-b924-fc5bec5f991b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 融入登记费用明细 |
| 物理表 | `tlm_financein_cost_flow` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 53 个 |
| 子表 | 0 个 |
| 关联引用 | 18 个 |

## 关联引用 (18个)

| 字段名 | 引用类型 |
|--------|---------|
| `customerBankAccount` | `aa_merchantbankref` |
| `ytenant_id` | `` |
| `` | `` |
| `payee_unit` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `sync_code` | `` |
| `otherBankAccount` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `supplierBankAccount` | `yssupplier.aa_vendorbankref` |
| `accentity` | `bd_accbody` |
| `financein_cost_flow_character_def` | `` |
| `supplier` | `yssupplier.aa_vendor ` |
| `cost_currency` | `ucfbasedoc.bd_currencytenantref` |
| `mainid` | `` |
| `fee_item` | `finbd.bd_expenseitemref` |
| `tenant_id` | `` |
| `customer` | `productcenter.aa_merchantref` |
| `flow_type` | `tlm_flowtypeRef` |

## 继承接口 (3个, 6字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`

## 字段列表（按类型分组）

> 共 53 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 现金流ID |
| `event` | `event` | `event` | 现金流事件 |
| `voucher_type` | `voucher_type` | `voucherType` | 关联单据类型 |
| `direction` | `direction` | `direction` | 方向 |
| `plan_scope` | `plan_scope` | `planScope` | 计划内/外 |
| `payee_type` | `payee_type` | `payeeType` | 收款方类型 |
| `other_type` | `other_type` | `otherType` | 对方类型id |
| `if_own_add` | `if_own_add` | `isOwnAdd` | 是否手动添加 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `` | `creator` | `creator` | 创建人名称 |
| `if_used` | `if_used` | `ifUsed` | 参照是否被使用 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `relate_code` | `relate_code` | `relateCode` | 关联现金流ID |
| `term` | `term` | `term` | 融资期限 |
| `term_unit` | `term_unit` | `termUnit` | 期限类型 |

### 引用字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 融资登记主表id |
| `accentity` | `accentity` | `accentity` | 会计主体id |
| `flow_type` | `flow_type` | `flowType` | 流类型id |
| `cost_currency` | `cost_currency` | `costCurrency` | 费用币种id |
| `fee_item` | `fee_item` | `feeItem` | 付费项目id |
| `customer` | `customer` | `customer` | 客户档案id |
| `supplier` | `supplier` | `supplier` | 平台供应商id |
| `payee_unit` | `payee_unit` | `payeeUnit` | 资金业务对象id |
| `otherBankAccount` | `otherBankAccount` | `otherBankAccount` | 对方账户名称id |
| `customerBankAccount` | `customerBankAccount` | `customerBankAccount` | 对方账户名称id |
| `supplierBankAccount` | `supplierBankAccount` | `supplierBankAccount` | 对方账户名称id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `sync_code` | `sync_code` | `syncCode` | 协同费用计划ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `plan_date` | `plan_date` | `planDate` | 计划日期 |
| `execute_date` | `execute_date` | `executeDate` | 执行日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `end_date` | `end_date` | `endDate` | 结束日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `term_number` | `term_number` | `termNumber` | 期限数量 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `execute_status` | `execute_status` | `executeStatus` | 执行状态 |
| `` | `status` | `status` | 单据状态 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `voucher_id` | `voucher_id` | `voucherId` | 关联单据id |
| `debt_id` | `debt_id` | `debtId` | 所属借据id |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cost_amount` | `cost_amount` | `costAmount` | 费用币种金额 |
| `execute_amount` | `execute_amount` | `executeAmount` | 执行金额 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `financein_cost_flow_character_def` | `financein_cost_flow_character_def` | `financeinCostFlowCharacterDef` | 融入登记费用明细特征 |
