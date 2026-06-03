---
tags: [BIP, 元数据, 数据字典, tlm.withholding.Withholding]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 预提 (`tlm.withholding.Withholding`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_withholding` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`2b537c10-fff6-484c-b10e-1dd22dc05a70`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 预提 |
| 物理表 | `tlm_withholding` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 82 个 |
| 子表 | 2 个 |
| 关联引用 | 21 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `WithholdingDetail` | `tlm.withholding.WithholdingDetail` | composition |
| `defines` | `tlm.withholding.WithholdingDefine` | composition |

## 关联引用 (21个)

| 字段名 | 引用类型 |
|--------|---------|
| `withholdingCharacterDef` | `` |
| `ytenant_id` | `` |
| `cost_center` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `dept_id` | `` |
| `` | `` |
| `profit_center` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `protocol_currency` | `bd_currencytenantreflist` |
| `bustype` | `bd_transtypelistref` |
| `financialProduct` | `tlm_financialProductRef` |
| `interestCurrency` | `bd_currencytenantreflist` |
| `debtcode` | `tlm_financeinRef` |
| `protocol_number` | `tlm_financingregisterRef` |
| `exchangeratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `tenant_id` | `` |
| `functionalcurrency` | `ucfbasedoc.bd_currencytenantref` |

## 继承接口 (5个, 17字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``

## 字段列表（按类型分组）

> 共 82 个直连字段

### 文本字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 单据编号 |
| `create_method` | `create_method` | `createMethod` | 生成方式 |
| `if_nextmonth_rush` | `if_nextmonth_rush` | `ifNextMonthRush` | 是否次月回冲 |
| `main_voucherId` | `main_voucherId` | `mainVoucherId` | 凭证id |
| `interest_rate_type` | `interest_rate_type` | `interestRateType` | 利率类型 |
| `voucherNo` | `voucherNo` | `voucherNo` | 凭证号 |
| `entry_time` | `entry_time` | `entryTime` | 入账时机 |
| `holiday_principle` | `holiday_principle` | `holidayPrinciple` | 节假日处理原则 |
| `interest_accrual_day` | `interest_accrual_day` | `interestAccrualDay` | 计息天数 |
| `ymd_interestRate` | `ymd_interestRate` | `ymdInterestRate` | 年/月/日利率 |
| `financing_org_for_other` | `financing_org_for_other` | `financingOrgForOther` | 融资机构 |
| `withholding_rule` | `withholding_rule` | `withholdingRule` | 预提头尾规则 |
| `if_exit_plan` | `if_exit_plan` | `ifExitPlan` | 是否有预提计划 |
| `settleInterestDetailId` | `settleInterestDetailId` | `settleInterestDetailId` | 融资结息详情id |
| `lasttype` | `lasttype` | `lasttype` | 上次操作单据类型 |
| `settleInterestId` | `settleInterestId` | `settleInterestId` | 结息关联id |
| `loan_interest_rate` | `loan_interest_rate` | `loanInterestRate` | 贷款利率管理id |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |

### 引用字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `financialProduct` | `financialProduct` | `financialProduct` | 金融产品 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `cost_center` | `cost_center` | `costCenter` | 成本中心 |
| `profit_center` | `profit_center` | `profitCenter` | 利润中心 |
| `dept_id` | `dept_id` | `deptid` | 部门 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `interestCurrency` | `interestCurrency` | `interestCurrency` | 计息币种 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `protocol_number` | `protocol_number` | `protocolNumber` | 协议号id |
| `debtcode` | `debtcode` | `debtcode` | 借据号id |
| `functionalcurrency` | `functionalcurrency` | `functionalCurrency` | 本币币种id |
| `exchangeratetype` | `exchangeratetype` | `exchangeratetype` | 汇率类型id |
| `bustype` | `bustype` | `bustype` | 交易类型id |

### 日期字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vouch_date` | `vouch_date` | `vouchdate` | 单据日期 |
| `amortized_cost_update_date` | `amortized_cost_update_date` | `amortizedCostUpdateDate` | 摊余成本更新日期 |
| `begin_date` | `begin_date` | `beginDate` | 预提起息日 |
| `end_date` | `end_date` | `endDate` | 预提止息日 |
| `financein_end_date` | `financein_end_date` | `financeinEndDate` | 借据结束日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rush_withholding` | `rush_withholding` | `rushWithholding` | 预提冲销方式 |
| `is_budget` | `is_budget` | `isBudget` | 是否占用預算 |

### 短整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_status` | `audit_status` | `auditStatus` | 单据状态 |
| `` | `status` | `status` | 单据状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `verifystate` | `verifystate` | `verifystate` | 审批状态 |
| `srcitem` | `srcitem` | `srcitem` | 来源系统编码 |
| `voucherstatus` | `voucherstatus` | `voucherstatus` | 凭证状态 |
| `billtype` | `billtype` | `billtype` | 单据类型编码 |
| `exchangerate_ops` | `exchangerate_ops` | `exchangerateOps` | 本币币种汇率折算方式 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |
| `lastcode` | `lastcode` | `lastcode` | 上次操作单据编号 |
| `filesCount` | `filesCount` | `filesCount` | 附件数 |

### 数值字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amountNotWrittenOff` | `amountNotWrittenOff` | `amountNotWrittenOff` | 未核销金额(计息币种) |
| `amountWrittenOffDef` | `amountWrittenOffDef` | `amountWrittenOffDef` | 已核销金额备份(计息币种) |
| `amountWrittenOff` | `amountWrittenOff` | `amountWrittenOff` | 已核销金额(计息币种) |
| `interest_rate` | `interest_rate` | `interestRate` | 利率 |
| `amortized_cost` | `amortized_cost` | `amortizedCost` | 摊余成本 |
| `amount` | `amount` | `amount` | 预提金额合计(协议币种) |
| `financialExpenses` | `financialExpenses` | `financialExpenses` | 财务费用合计(计息币种) |
| `amountInt` | `amountInt` | `amountInt` | 预提金额合计(计息币种) |
| `interestAdjustment` | `interestAdjustment` | `interestAdjustment` | 利息调整合计(计息币种) |
| `exchangerate` | `exchangerate` | `exchangerate` | 汇率 |
| `local_amount` | `local_amount` | `localAmount` | 预提金额合计(本币币种) |
| `natFinancialExpenses` | `natFinancialExpenses` | `natFinancialExpenses` | 财务费用合计(本币币种) |
| `appoint_rate` | `appoint_rate` | `appointRate` | 利息约定汇率 |
| `natInterestAdjustment` | `natInterestAdjustment` | `natInterestAdjustment` | 利息调整合计(本币币种) |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `withholdingCharacterDef` | `withholdingCharacterDef` | `withholdingCharacterDef` | 融资预提自定义项 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `WithholdingDetail` | 预提利息明细信息 |
| `` | `` | `defines` | 预提自定义项 |
