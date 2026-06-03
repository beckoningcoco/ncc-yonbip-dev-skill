---
tags: [BIP, 元数据, 数据字典, tlm.investaccrual.InvestAccrual]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 投资预提 (`tlm.investaccrual.InvestAccrual`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_investaccrual` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`4de2452d-ef38-4b18-86b0-5b07734b4616`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投资预提 |
| 物理表 | `tlm_investaccrual` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 91 个 |
| 子表 | 2 个 |
| 关联引用 | 24 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `investAccrualDetail` | `tlm.investaccrual.InvestAccrualDetail` | composition |
| `defines` | `tlm.investaccrual.InvestAccrualDefine` | composition |

## 关联引用 (24个)

| 字段名 | 引用类型 |
|--------|---------|
| `purchase_code` | `tlm_purchaseregisterRef` |
| `ytenant_id` | `` |
| `cost_center` | `` |
| `financing_org_bank` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref` |
| `dept_id` | `` |
| `` | `` |
| `profit_center` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `protocol_currency` | `` |
| `bustype` | `bd_transtypelistref` |
| `financialProduct` | `` |
| `exchangerate_type` | `ucfbasedoc.bd_exchangeratetyperef` |
| `interestCurrency` | `` |
| `investaccrualCharacterDef` | `` |
| `supplier` | `yssupplier.aa_vendor` |
| `protocol_number` | `tlm_financingregisterRef` |
| `tenant_id` | `` |
| `customer` | `productcenter.aa_merchantref` |
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
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 91 个直连字段

### 文本字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 单据编号 |
| `default_code` | `default_code` | `defaultCode` | 单据默认编号 |
| `invert_accrual_version` | `invert_accrual_version` | `invertAccrualVersion` | 投资预提版本号 |
| `investSettleInterestId` | `investSettleInterestId` | `investSettleInterestId` | 投资结息id |
| `investSettleInterestDetailId` | `investSettleInterestDetailId` | `investSettleInterestDetailId` | 投资结息详情id |
| `main_voucherId` | `main_voucherId` | `mainVoucherId` | 凭证id |
| `voucherNo` | `voucherNo` | `voucherNo` | 凭证号 |
| `generation` | `generation` | `generation` | 生成方式 |
| `preOperatePurchaseBillCode` | `preOperatePurchaseBillCode` | `preOperatePurchaseBillCode` | 上一次操作申购登记的单据类型编号 |
| `preOperatePurchaseBillId` | `preOperatePurchaseBillId` | `preOperatePurchaseBillId` | 上一次操作申购登记的单据类型Id |
| `entry_time` | `entry_time` | `entryTime` | 入账时机 |
| `if_nextmonth_rush` | `if_nextmonth_rush` | `ifNextMonthRush` | 是否已回冲 |
| `financing_org_other` | `financing_org_other` | `financingOrgForOther` | 投资机构 |
| `if_exit_plan` | `if_exit_plan` | `ifExitPlan` | 是否有预提计划 |
| `depositInterestRate` | `depositInterestRate` | `depositInterestRate` | 存款利率管理id |
| `interestRateValues` | `interestRateValues` | `interestRateValues` | 存款利率引用利率值 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |

### 引用字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `protocol_number` | `protocol_number` | `protocolNumber` | 融资协议id |
| `purchase_code` | `purchase_code` | `purchaseCode` | 申购单号id |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `financialProduct` | `financialProduct` | `financialProduct` | 金融产品 |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种 |
| `interestCurrency` | `interestCurrency` | `interestCurrency` | 计息币种 |
| `dept_id` | `dept_id` | `deptid` | 部门 |
| `cost_center` | `cost_center` | `costCenter` | 成本中心 |
| `profit_center` | `profit_center` | `profitCenter` | 利润中心 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `financing_org_bank` | `financing_org_bank` | `financingOrgForBank` | 投资机构ID |
| `customer` | `customer` | `customer` | 客户档案id |
| `supplier` | `supplier` | `supplier` | 平台供应商id |
| `functionalcurrency` | `functionalcurrency` | `functionalCurrency` | 本币币种id |
| `exchangerate_type` | `exchangerate_type` | `exchangerateType` | 汇率类型id |
| `bustype` | `bustype` | `bustype` | 交易类型id |

### 日期字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `lastAmorDate` | `lastAmorDate` | `lastAmortizedCostUpdateDate` | 上次摊余成本日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `begin_date` | `begin_date` | `beginDate` | 预提起息日 |
| `end_date` | `end_date` | `endDate` | 预提止息日 |
| `lastWDSIDate` | `lastWDSIDate` | `lastWDSIDate` | 上次预提日结息日 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `canuseflow` | `canuseflow` | `canuseflow` | 是否走审批流 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 枚举字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `withholding_rule` | `withholding_rule` | `withholdingRule` | 预提头尾规则 |
| `interest_accrual_day` | `interest_accrual_day` | `interestAccrualDay` | 计息天数 |
| `ymd_interestRate` | `ymd_interestRate` | `ymdInterestRate` | 年/月/日利率 |
| `holiday_principle` | `holiday_principle` | `holidayPrinciple` | 节假日处理原则 |
| `rush_withholding` | `rush_withholding` | `rushWithholding` | 预提冲销方式 |
| `financing_org_type` | `financing_org_type` | `financingOrgType` | 投资机构类型 |
| `interest_rate_type` | `interest_rate_type` | `interestRateType` | 利率类型 |
| `is_budget` | `is_budget` | `isBudget` | 是否占用預算 |

### 短整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_status` | `audit_status` | `auditStatus` | 单据状态 |
| `srcitem` | `srcitem` | `srcitem` | 来源系统编码 |
| `billtype` | `billtype` | `billtype` | 单据类型编码 |
| `srcEventType` | `srcEventType` | `srcEventType` | 事项类型 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `voucherstatus` | `voucherstatus` | `voucherstatus` | 过账状态 |
| `exchange_rate_ops` | `exchange_rate_ops` | `exchangeRateOps` | 汇率折算方式 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | ID |
| `filesCount` | `filesCount` | `filesCount` | 附件数 |

### 数值字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amount_written_off` | `amount_written_off` | `amountWrittenOff` | 已核销金额(计息币种) |
| `unamount_written_off` | `unamount_written_off` | `unAmountWrittenOff` | 未核销金额(计息币种) |
| `amount_written_offdef` | `amount_written_offdef` | `amountWrittenOffDef` | 已核销金额备份(计息币种) |
| `interest_rate` | `interest_rate` | `interestRate` | 利率(%) |
| `amount` | `amount` | `amount` | 预提金额合计(协议币种) |
| `proIncomeInvestAmount` | `proIncomeInvestAmount` | `protocolIncomeInvestAmount` | 投资收益(协议币种) |
| `proInterestAdjustAmount` | `proInterestAdjustAmount` | `protocolInterestAdjustAmount` | 利息调整(协议币种) |
| `interestAmount` | `interestAmount` | `interestAmount` | 预提金额合计(计息币种) |
| `iExchangeRate` | `iExchangeRate` | `exchangeRate` | 汇率 |
| `local_amount` | `local_amount` | `localAmount` | 预提金额合计(本币币种) |
| `interestIncomeInvestAmount` | `interestIncomeInvestAmount` | `interestIncomeInvestAmount` | 投资收益(计息币种) |
| `interestInterestAdjustAmount` | `interestInterestAdjustAmount` | `interestInterestAdjustAmount` | 利息调整(计息币种) |
| `locProIncomeInvestAmount` | `locProIncomeInvestAmount` | `localProtocolIncomeInvestAmount` | 投资收益(本币币种) |
| `locIntAdjustAmount` | `locIntAdjustAmount` | `localInterestAdjustAmount` | 利息调整(本币币种) |

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
| `investaccrualCharacterDef` | `investaccrualCharacterDef` | `investaccrualCharacterDef` | 投资预提自定义项 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 投资预提自定义项 |
| `` | `` | `investAccrualDetail` | 投资预提利息明细信息 |
