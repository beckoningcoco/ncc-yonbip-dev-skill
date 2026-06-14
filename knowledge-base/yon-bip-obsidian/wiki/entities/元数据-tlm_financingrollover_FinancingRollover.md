---
tags: [BIP, 元数据, 数据字典, tlm.financingrollover.FinancingRollover]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 融入展期 (`tlm.financingrollover.FinancingRollover`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financingrollover` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`75aa4e47-88ba-479f-b0a5-aa1abe0a85f1`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 融入展期 |
| 物理表 | `tlm_financingrollover` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 101 个 |
| 子表 | 11 个 |
| 关联引用 | 24 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `financingRolloverRiskClauseBackup` | `tlm.financingrollover.FinancingRolloverRiskClauseBackup` | composition |
| `financingRolloverMarginBackup` | `tlm.financingrollover.FinancingRolloverMarginBackup` | composition |
| `rolloverCashFlow` | `tlm.financingrollover.FinancingRolloverCashFlow` | composition |
| `financingRolloverMargin` | `tlm.financingrollover.FinancingRolloverMargin` | composition |
| `rolloverDB` | `tlm.financingrollover.FinancingRolloverDB` | composition |
| `financingRolloverTransactionFlow` | `tlm.financingrollover.FinancingRolloverTransactionFlow` | composition |
| `customRate` | `tlm.financingrollover.FinancingRolloverCustomRate` | composition |
| `rolloverCashFlowBackup` | `tlm.financingrollover.FinancingRolloverCashFlowBackup` | composition |
| `financingRolloverRiskClause` | `tlm.financingrollover.FinancingRolloverRiskClause` | composition |
| `defines` | `tlm.financingrollover.FinancingRolloverDefine` | composition |
| `rolloverBH` | `tlm.financingrollover.FinancingRolloverBH` | composition |

## 关联引用 (24个)

| 字段名 | 引用类型 |
|--------|---------|
| `marginaccid` | `bd_enterprisebankacctref` |
| `financingRolloverCharacterDef` | `` |
| `` | `` |
| `ytenant_id` | `` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `bustype` | `bd_transtypelistref` |
| `protocol` | `tlm_financingregisterRef` |
| `debtcode` | `tlm_financeinRef` |
| `synergy_invest_rollover` | `` |
| `tenant_id` | `` |

## 继承接口 (5个, 17字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
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

## 字段列表（按类型分组）

> 共 101 个直连字段

### 文本字段 (28个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人 |
| `protocol_contract_type` | `protocol_contract_type` | `protocolContractType` | 协议担保方式 |
| `lastBackBusinessType` | `lastBackBusinessType` | `lastBackBusinessType` | 备份上个写现金流的业务类型 |
| `debtStatus` | `debtStatus` | `debtStatus` | 借据状态 |
| `lastBusinessType` | `lastBusinessType` | `lastBusinessType` | 上个写现金流的业务类型 |
| `protocolVersion` | `protocolVersion` | `protocolVersion` | 协议版本号 |
| `rolloverTerm` | `rolloverTerm` | `rolloverTerm` | 展期期限 |
| `` | `code` | `code` | 单据号 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `loanInterestRate` | `loanInterestRate` | `loanInterestRate` | 贷款利率Id |
| `interestRateValues` | `interestRateValues` | `interestRateValues` | 利率区间值 |
| `rolloverProtocolNo` | `rolloverProtocolNo` | `rolloverProtocolNo` | 展期协议号 |
| `rolloverReason` | `rolloverReason` | `rolloverReason` | 展期原因 |
| `item1` | `item1` | `item1` | 是否适配交易类型 |
| `item2` | `item2` | `item2` | 适配交易类型(金融产品Id) |
| `contract_type` | `contract_type` | `contractType` | 担保方式 |
| `item5` | `item5` | `item5` | backItem |
| `item6` | `item6` | `item6` | backItem |
| `item3` | `item3` | `item3` | 融资登记编码 |
| `item4` | `item4` | `item4` | 融入登记编码 |
| `back_item1` | `back_item1` | `backItem1` | backItem1 |
| `back_item2` | `back_item2` | `backItem2` | backItem2 |
| `back_item3` | `back_item3` | `backItem3` | backItem3 |
| `back_item4` | `back_item4` | `backItem4` | backItem4 |
| `back_item5` | `back_item5` | `backItem5` | backItem5 |
| `back_item6` | `back_item6` | `backItem6` | backItem6 |
| `sync_msg` | `sync_msg` | `syncMsg` | 协同失败原因 |

### 引用字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `protocol` | `protocol` | `protocol` | 协议号id |
| `marginaccid` | `marginaccid` | `marginaccid` | 保证金账号id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `debtcode` | `debtcode` | `debtcode` | 借据id |
| `bustype` | `bustype` | `bustype` | 交易类型id |
| `synergy_invest_rollover` | `synergy_invest_rollover` | `synergyInvestRollover` | 协同投资展期单 |

### 日期字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rollover_start_date` | `rollover_start_date` | `rolloverStartDate` | 展期开始日 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `rolloverBeginDate` | `rolloverBeginDate` | `rolloverBeginDate` | 展期日期 |
| `rolloverEndDate` | `rolloverEndDate` | `rolloverEndDate` | 展期后到期日 |
| `firstRepaymentDate` | `firstRepaymentDate` | `firstRepaymentDate` | 首次还本日 |
| `firstPayInterestDate` | `firstPayInterestDate` | `firstPayInterestDate` | 首次付息日 |
| `debt_rollover_end_date` | `debt_rollover_end_date` | `debtRolloverEndDate` | 展期后到期日  |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `canuseflow` | `canuseflow` | `canuseflow` | 是否从融资登记跳转 |
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |

### 枚举字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_auto_rollover` | `is_auto_rollover` | `isAutoRollover` | 是否自动展期 |
| `auditStatus` | `auditStatus` | `auditStatus` | 单据状态 |
| `rateTypeZQ` | `rateTypeZQ` | `rateTypeZQ` | 利率类型 |
| `create_method` | `create_method` | `createMethod` | 生成方式 |
| `bill_effect_moment` | `bill_effect_moment` | `billEffectMoment` | 单据生效时机 |
| `is_effect` | `is_effect` | `isEffect` | 是否生效 |
| `is_direct_connect` | `is_direct_connect` | `isDirectConnect` | 是否直连 |
| `rolloverTermUnit` | `rolloverTermUnit` | `rolloverTermUnit` | 展期期限单位 |
| `floatMethod` | `floatMethod` | `floatMethod` | 浮动方式 |
| `month_adjust_date` | `month_adjust_date` | `monthAdjustDate` | 月末日期调整(还本) |
| `month_interest_adjust_date` | `month_interest_adjust_date` | `monthInterestAdjustDate` | 月末日期调整(付息) |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rolloverTermNumber` | `rolloverTermNumber` | `rolloverTermNumber` | 展期期限 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `send_sync` | `send_sync` | `sendSync` | 协同状态 |

### 长整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `relate_backup_protocol` | `relate_backup_protocol` | `relateBackupProtocol` | 关联备份协议Id |
| `relate_backup_debt` | `relate_backup_debt` | `relateBackupDebt` | 关联备份借据Id |
| `` | `tplid` | `tplid` | 模板id |
| `lastBackBusinessId` | `lastBackBusinessId` | `lastBackBusinessId` | 备份上个写现金流的业务id |
| `related_rate_record` | `related_rate_record` | `relatedRateRecord` | 关联利率变更记录Id |
| `lastBusinessId` | `lastBusinessId` | `lastBusinessId` | 上个写现金流的业务id |
| `id` | `id` | `id` | ID |
| `back_item9` | `back_item9` | `backItem9` | backItem9 |
| `back_item10` | `back_item10` | `backItem10` | backItem10 |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rolloverAmount` | `rolloverAmount` | `rolloverAmount` | 展期金额 |
| `margin_ratio` | `margin_ratio` | `marginRatio` | 保证金比例 |
| `margin_amount` | `margin_amount` | `marginAmount` | 保证金金额 |
| `baseInterestRate` | `baseInterestRate` | `baseInterestRate` | 基准利率(%) |
| `floatValue` | `floatValue` | `floatValue` | 浮动值 |
| `rolloverInterestRate` | `rolloverInterestRate` | `rolloverInterestRate` | 展期利率(%) |
| `back_item7` | `back_item7` | `backItem7` | backItem7 |
| `back_item8` | `back_item8` | `backItem8` | backItem8 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `financingRolloverCharacterDef` | `financingRolloverCharacterDef` | `financingRolloverCharacterDef` | 融入展期自定义项 |

### other (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `customRate` | 自定义利率 |
| `` | `` | `defines` | 融入展期自定义项 |
| `` | `` | `financingRolloverMargin` | 融入展期关联保证金 |
| `` | `` | `financingRolloverMarginBackup` | 融入展期备份关联保证金 |
| `` | `` | `financingRolloverRiskClause` | 融入展期关联风险条款 |
| `` | `` | `financingRolloverRiskClauseBackup` | 融入展期备份关联风险条款 |
| `` | `` | `financingRolloverTransactionFlow` | 交易进度表 |
| `` | `` | `rolloverBH` | 融入展期关联保函 |
| `` | `` | `rolloverCashFlow` | 融入展期关联现金流 |
| `` | `` | `rolloverCashFlowBackup` | 融入展期关联现金流历史备份表 |
| `` | `` | `rolloverDB` | 融入展期关联担保 |
