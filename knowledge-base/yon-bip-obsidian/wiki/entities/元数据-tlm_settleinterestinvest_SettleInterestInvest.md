---
tags: [BIP, 元数据, 数据字典, tlm.settleinterestinvest.SettleInterestInvest]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 投资结息 (`tlm.settleinterestinvest.SettleInterestInvest`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_settleinterestinvest` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`8910bf48-45ff-4093-b503-ab0115c01282`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投资结息 |
| 物理表 | `tlm_settleinterestinvest` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 91 个 |
| 子表 | 2 个 |
| 关联引用 | 24 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `settleInterestInvestDetail` | `tlm.settleinterestinvest.SettleInterestInvestDetail` | composition |
| `defines` | `tlm.settleinterestinvest.SettleInterestInvestDefine` | composition |

## 关联引用 (24个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `cost_center` | `` |
| `financing_org_bank` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `dept_id` | `` |
| `purchase` | `ucf-org-center.bd_financeorgtreeref_na` |
| `` | `` |
| `profit_center` | `` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `protocol_currency` | `ucf-org-center.bd_financeorgtreeref_na` |
| `tradetype` | `ucf-org-center.bd_financeorgtreeref_na` |
| `financial_product` | `ucf-org-center.bd_financeorgtreeref_na` |
| `syncId` | `` |
| `rate_type` | `ucf-org-center.bd_financeorgtreeref_na` |
| `si_define_character` | `ucf-org-center.bd_financeorgtreeref_na` |
| `interest_currency` | `ucf-org-center.bd_financeorgtreeref_na` |
| `protocol` | `ucf-org-center.bd_financeorgtreeref_na` |
| `nat_currency` | `ucf-org-center.bd_financeorgtreeref_na` |
| `material` | `` |
| `tenant_id` | `` |

## 继承接口 (5个, 17字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
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
| `holiday_principle` | `holiday_principle` | `holidayPrinciple` | 节假日处理原则 |
| `effective_time` | `effective_time` | `effectiveTime` | 单据生效时机 |
| `iseffect` | `iseffect` | `isEffect` | 是否生效 |
| `modifyStatus` | `modifyStatus` | `modifyStatus` | 是否修改过 |
| `interes_base` | `interes_base` | `interesBase` | 计息基数 |
| `settlement_cycle` | `settlement_cycle` | `settlementCycle` | 结息周期 |
| `voucherNo` | `voucherNo` | `voucherNo` | 凭证号 |
| `ymd_interestRate` | `ymd_interestRate` | `ymdInterestRate` | 年/月/日利率 |
| `code` | `code` | `code` | 单据编号 |
| `audit_status` | `audit_status` | `auditStatus` | 单据状态 |
| `initialization` | `initialization` | `initialization` | 是否初始化 |
| `depositInterestRate` | `depositInterestRate` | `depositInterestRate` | 存款利率id |
| `interestRateValues` | `interestRateValues` | `interestRateValues` | 存款利率值 |
| `preOperatePurchaseBillCode` | `preOperatePurchaseBillCode` | `preOperatePurchaseBillCode` | 上一次操作申购登记的单据类型编号 |
| `data_source` | `data_source` | `dataSource` | 数据来源 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `sync_msg` | `sync_msg` | `syncMsg` | 协同失败原因 |

### 引用字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `financing_org_bank` | `financing_org_bank` | `financingOrgForBank` | 投资机构 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `material` | `material` | `material` | 物料 |
| `syncId` | `syncId` | `syncId` | 协同单ID |
| `dept_id` | `dept_id` | `deptid` | 部门 |
| `cost_center` | `cost_center` | `costCenter` | 成本中心 |
| `profit_center` | `profit_center` | `profitCenter` | 利润中心 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `interest_currency` | `interest_currency` | `interestCurrency` | 计息币种id |
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `protocol` | `protocol` | `protocol` | 协议号id |
| `purchase` | `purchase` | `purchase` | 申购单Id |
| `financial_product` | `financial_product` | `financialProduct` | 金融产品id |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种id |
| `nat_currency` | `nat_currency` | `natCurrency` | 本币币种id |
| `rate_type` | `rate_type` | `rateType` | 汇率类型id |
| `tradetype` | `tradetype` | `bustype` | 交易类型id |

### 日期字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `begin_date` | `begin_date` | `beginDate` | 结息起息日 |
| `end_date` | `end_date` | `endDate` | 结息止息日 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `canuseflow` | `canuseflow` | `canuseflow` | 是否走审批流 |
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |

### 枚举字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `interest_rate_type` | `interest_rate_type` | `interestRateType` | 利率类型 |
| `interest_settlement_rule` | `interest_settlement_rule` | `interestSettlementRule` | 结息头尾规则 |
| `interest_settlement_method` | `interest_settlement_method` | `interestSettlementMethod` | 结息方式 |
| `settle_interest_voucher` | `settle_interest_voucher` | `settleInterestVoucher` | 结息凭证生成方式 |
| `interest_accrual_day` | `interest_accrual_day` | `interestAccrualDay` | 计息天数 |
| `plan_voucher` | `plan_voucher` | `planVoucher` | 是否计划结息 |

### 短整数 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `billtype` | `billtype` | `billtype` | 单据类型编码 |
| `if_filter` | `if_filter` | `ifFilter` | 是否过滤:1是0否 |
| `` | `returncount` | `returncount` | 退回次数 |
| `srcEventType` | `srcEventType` | `srcEventType` | 事项类型 |
| `srcitem` | `srcitem` | `srcitem` | 来源系统编码 |
| `` | `status` | `status` | 单据状态 |
| `voucherstatus` | `voucherstatus` | `voucherstatus` | 凭证状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `exchange_rate_ops` | `exchange_rate_ops` | `exchangeRateOps` | 汇率折算方式 |
| `send_sync` | `send_sync` | `sendSync` | 协同状态，0-未协同；1-协同成功；2-协同失败；3-不协同 |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | 主表id |
| `preOperatePurchaseBillId` | `preOperatePurchaseBillId` | `preOperatePurchaseBillId` | 上一次操作申购登记的单据类型Id |
| `data_source_id` | `data_source_id` | `dataSourceId` | 数据来源Id |
| `filesCount` | `filesCount` | `filesCount` | 附件数 |

### 数值字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `adjust_amount` | `adjust_amount` | `adjustAmount` | 调整后结息金额(计息币种) |
| `issued_tax_money` | `issued_tax_money` | `issuedTaxMoney` | 已开税票金额 |
| `diff_amount` | `diff_amount` | `diffAmount` | 结息调整差额(计息币种) |
| `appoint_rate` | `appoint_rate` | `appointRate` | 利息约定汇率 |
| `interest_rate` | `interest_rate` | `interestRate` | 利率(%) |
| `exchange_rate` | `exchange_rate` | `exchangeRate` | 汇率 |
| `settlement_amountsum_x` | `settlement_amountsum_x` | `settlementAmountSumX` | 结息金额(计息币种) |
| `withholding_amountsum_x` | `withholding_amountsum_x` | `withholdingAmountSumX` | 已预提金额(计息币种) |
| `writeoff_amountsum_x` | `writeoff_amountsum_x` | `writeoffAmountSumX` | 核销后差额合计(计息币种) |
| `settlement_amountsum_b` | `settlement_amountsum_b` | `settlementAmountSumB` | 结息金额(本币币种) |
| `withholding_amountsum_b` | `withholding_amountsum_b` | `withholdingAmountSumB` | 已预提金额(本币币种) |
| `settlement_amountsum` | `settlement_amountsum` | `settlementAmountSum` | 结息金额(协议币种) |
| `writeoff_amountsum_b` | `writeoff_amountsum_b` | `writeoffAmountSumB` | 预提核销差额合计(本币币种) |
| `adjust_amount_x` | `adjust_amount_x` | `adjustAmountX` | 调整后结息金额(协议币种) |
| `adjust_amount_b` | `adjust_amount_b` | `adjustAmountB` | 调整后结息金额(本币币种) |

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
| `si_define_character` | `si_define_character` | `settleInterestInvestCharacterDef` | 投资结息自定义项 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 结息自定义项 |
| `` | `` | `settleInterestInvestDetail` | 投资结息明细信息 |
