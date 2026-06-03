---
tags: [BIP, 元数据, 数据字典, tlm.execcontractchange.ExecContractChangeCostFlow]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 融入变更费用明细 (`tlm.execcontractchange.ExecContractChangeCostFlow`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_execcontchange_cost_flow` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 融入变更费用明细 |
| 物理表 | `tlm_execcontchange_cost_flow` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 53 个 |
| 子表 | 0 个 |
| 关联引用 | 18 个 |

## 关联引用 (18个)

| 字段名 | 引用类型 |
|--------|---------|
| `customerBankAccount` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `payee_unit` | `` |
| `sync_code` | `` |
| `otherBankAccount` | `` |
| `supplierBankAccount` | `` |
| `accentity` | `` |
| `financein_cost_flow_character_def` | `` |
| `supplier` | `` |
| `cost_currency` | `` |
| `mainid` | `` |
| `fee_item` | `` |
| `tenant_id` | `` |
| `customer` | `` |
| `flow_type` | `` |

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
| `` | `auditor` | `auditor` | 审批人名称 |
| `code` | `code` | `code` | 现金流ID |
| `` | `creator` | `creator` | 创建人名称 |
| `direction` | `direction` | `direction` | 方向 |
| `event` | `event` | `event` | 现金流事件 |
| `if_used` | `if_used` | `ifUsed` | 参照是否被使用 |
| `if_own_add` | `if_own_add` | `isOwnAdd` | 是否手动添加 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `other_type` | `other_type` | `otherType` | 对方类型 |
| `payee_type` | `payee_type` | `payeeType` | 收款方类型 |
| `plan_scope` | `plan_scope` | `planScope` | 计划内/外 |
| `relate_code` | `relate_code` | `relateCode` | 关联现金流ID |
| `term` | `term` | `term` | 融资期限 |
| `term_unit` | `term_unit` | `termUnit` | 期限类型 |
| `voucher_type` | `voucher_type` | `voucherType` | 关联单据类型 |

### 引用字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 会计主体 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `cost_currency` | `cost_currency` | `costCurrency` | 费用币种 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `customer` | `customer` | `customer` | 客户 |
| `customerBankAccount` | `customerBankAccount` | `customerBankAccount` | 客户银行账号 |
| `fee_item` | `fee_item` | `feeItem` | 付费项目 |
| `flow_type` | `flow_type` | `flowType` | 流类型 |
| `mainid` | `mainid` | `mainid` | 融入变更ID |
| `` | `modifierId` | `modifierId` | 修改人 |
| `otherBankAccount` | `otherBankAccount` | `otherBankAccount` | 资金业务对象对方银行账号 |
| `payee_unit` | `payee_unit` | `payeeUnit` | 收款方单位(取资金业务对象) |
| `supplier` | `supplier` | `supplier` | 供应商 |
| `supplierBankAccount` | `supplierBankAccount` | `supplierBankAccount` | 供应商银行账号 |
| `sync_code` | `sync_code` | `syncCode` | 协同费用计划ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `end_date` | `end_date` | `endDate` | 结束日期 |
| `execute_date` | `execute_date` | `executeDate` | 执行日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `plan_date` | `plan_date` | `planDate` | 计划日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

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
| `debt_id` | `debt_id` | `debtId` | 所属借据id |
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |
| `voucher_id` | `voucher_id` | `voucherId` | 关联单据id |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cost_amount` | `cost_amount` | `costAmount` | 费用币种金额 |
| `execute_amount` | `execute_amount` | `executeAmount` | 执行金额 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `financein_cost_flow_character_def` | `financein_cost_flow_character_def` | `financeinCostFlowCharacterDef` | 融入变更费用明细特征 |
