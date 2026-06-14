---
tags: [BIP, 元数据, 数据字典, lgm.guaranteefee.GuaranteeFee]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 保函费用 (`lgm.guaranteefee.GuaranteeFee`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`lgm_guaranteefee` | domain：`yonbip-fi-ctmlgm` | 应用：`LGM` | 业务对象ID：`cdc3f331-81d3-4431-8352-b408d3f9ef69`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 保函费用 |
| 物理表 | `lgm_guaranteefee` |
| domain/服务域 | `yonbip-fi-ctmlgm` |
| schema | `yonbip_fi_ctmlc` |
| 所属应用 | `LGM` |
| 直连字段 | 106 个 |
| 子表 | 0 个 |
| 关联引用 | 30 个 |

## 关联引用 (30个)

| 字段名 | 引用类型 |
|--------|---------|
| `activity` | `` |
| `` | `` |
| `feeCurrency` | `bd_currencytenantreflist` |
| `project` | `ucfbasedoc.bd_projectcardref` |
| `wbs` | `` |
| `localCurrency` | `` |
| `openInstitution` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `profitCenter` | `finbd.bd_allaccbodyref_inner` |
| `accentity` | `ucf-org-center.bd_fundsorg_na` |
| `dep` | `ucf-org-center.bd_adminorgsharetreeref` |
| `localExchangeRateType` | `ucfbasedoc.bd_exchangeratetyperef` |
| `lgm_define_character_def` | `` |
| `currency` | `` |
| `department` | `ucf-org-center.bd_adminorgsharetreeref` |
| `settleMethod` | `productcenter.aa_settlemethodref` |
| `tenant_id` | `` |
| `oppositeType` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobject_typeRef` |
| `feeAccount` | `ucfbasedoc.bd_enterprisebankacct` |
| `ytenant_id` | `` |
| `costCenter` | `finbd.bd_costcenterref` |
| `accentity_raw` | `ucf-org-center.bd_financeorgtreeref_na` |
| `oppositeUnit` | `` |
| `bustype` | `bd_transtypelistref` |
| `oppositeTypeBack` | `` |
| `guaranteeType` | `lgm_guaranteetypeRef` |
| `oppositeBankAccount` | `` |
| `guaranteeNumber` | `lgm_guaranteeregisterRef` |
| `feeItem` | `finbd.bd_expenseitemref` |

## 继承接口 (6个, 12字段)

- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 106 个直连字段

### 文本字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `itemSourceNumber` | `itemSourceNumber` | `itemSourceNumber` | 事项来源编号 |
| `voucher_no` | `voucher_no` | `voucherNo` | 凭证号 |
| `oppositeBankAccountUnionNumber` | `oppositeBankAccountUnionNumber` | `oppositeBankAccountUnionNumber` | 对方账户联行号 |
| `extraInfo` | `extraInfo` | `extraInfo` | 凭证|应付 |
| `billTypeId` | `billTypeId` | `billTypeId` | 单据类型Id |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `oppositeBankAccountBankType` | `oppositeBankAccountBankType` | `oppositeBankAccountBankType` | 对方账户银行类别 |
| `accounting_docId` | `accounting_docId` | `accountingDocId` | 会计平台的凭证id |
| `backItem6` | `backItem6` | `backItem6` | 备用字段6 |
| `backItem4` | `backItem4` | `backItem4` | 备用字段4 |
| `backItem5` | `backItem5` | `backItem5` | 备用字段5 |
| `backItem2` | `backItem2` | `backItem2` | 备用字段2 |
| `backItem3` | `backItem3` | `backItem3` | 备用字段3 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `backItem1` | `backItem1` | `backItem1` | 备用字段1 |
| `transferReason` | `transferReason` | `transferReason` | 过账说明 |
| `oppositeBankAccountName` | `oppositeBankAccountName` | `oppositeBankAccountName` | 对方账户名称 |
| `openAgency` | `openAgency` | `openAgency` | 开立机构 |
| `itemType` | `itemType` | `itemType` | 事项类型 |
| `code` | `code` | `code` | 单据编号 |
| `oppositeBankAccountOpenBank` | `oppositeBankAccountOpenBank` | `oppositeBankAccountOpenBank` | 对方账户开户行 |
| `itemSource` | `itemSource` | `itemSource` | 事项来源 |
| `identification_code` | `identification_code` | `dentificationCode` | 财资统一对账码 |

### 引用字段 (29个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `modifierId` | `modifierId` | 修改人 |
| `wbs` | `wbs` | `wbs` | WBS |
| `localCurrency` | `localCurrency` | `localCurrency` | 本币币种 |
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `dep` | `dep` | `dep` | 费用部门 |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `costCenter` | `costCenter` | `costCenter` | 成本中心 |
| `oppositeUnit` | `oppositeUnit` | `oppositeUnit` | 对方单位 |
| `oppositeTypeBack` | `oppositeTypeBack` | `oppositeTypeBack` | 对方类型备份 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `activity` | `activity` | `activity` | 活动 |
| `currency` | `currency` | `currency` | 币种 |
| `settleMethod` | `settleMethod` | `settleMethod` | 结算方式 |
| `oppositeBankAccount` | `oppositeBankAccount` | `oppositeBankAccount` | 对方银行账号 |
| `feeItem` | `feeItem` | `feeItem` | 费用项目 |
| `feeCurrency` | `feeCurrency` | `feeCurrency` | 费用币种 |
| `project` | `project` | `project` | 项目 |
| `guaranteeType` | `guaranteeType` | `guaranteeType` | 保函类型 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `openInstitution` | `openInstitution` | `openInstitution` | 机构名称 |
| `profitCenter` | `profitCenter` | `profitCenter` | 利润中心 |
| `localExchangeRateType` | `localExchangeRateType` | `localExchangeRateType` | 本币币种汇率类型 |
| `department` | `department` | `department` | 部门 |
| `oppositeType` | `oppositeType` | `oppositeType` | 对方类型 |
| `feeAccount` | `feeAccount` | `feeAccount` | 付费账户 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `guaranteeNumber` | `guaranteeNumber` | `guaranteeNumber` | 保函编号 |

### 日期字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `feeDate` | `feeDate` | `feeDate` | 费用日期 |
| `guaranteeBeginDate` | `guaranteeBeginDate` | `guaranteeBeginDate` | 保函开始日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `billDate` | `billDate` | `billDate` | 单据日期 |
| `settleSuccessDate` | `settleSuccessDate` | `settleSuccessDate` | 结算成功日期 |
| `guaranteeEndDate` | `guaranteeEndDate` | `guaranteeEndDate` | 保函结束日期 |
| `guaranteeOpenDate` | `guaranteeOpenDate` | `guaranteeOpenDate` | 开函日期 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `budgeted` | `budgeted` | `budgeted` | 是否已发起预算 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `replenished_settlement` | `replenished_settlement` | `replenishedSettlement` | 已结算补单 |

### 枚举字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `settleStatus` | `settleStatus` | `settleStatus` | 结算状态 |
| `auditStatus` | `auditStatus` | `auditStatus` | 审批状态 |
| `transferStatus` | `transferStatus` | `transferStatus` | 过账状态 |
| `fundPayMode` | `fundPayMode` | `fundPayMode` | 资金支付模式 |
| `feeParam` | `feeParam` | `feeParam` | 费用参数 |

### 短整数 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `settleStatusBack` | `settleStatusBack` | `settleStatusBack` | 结算状态 |
| `srcEventType` | `srcEventType` | `srcEventType` | 事项类型 |
| `` | `status` | `status` | 单据状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `srcitem` | `srcitem` | `srcitem` | 来源系统编码 |
| `voucherstatus` | `voucherstatus` | `voucherstatus` | 凭证状态 |
| `billtype` | `billtype` | `billtype` | 单据类型编码 |
| `paymentStatus` | `paymentStatus` | `paymentStatus` | 应付过账状态 |
| `approvalStatus` | `approvalStatus` | `approvalStatus` | 审批状态 |
| `nat_exchange_rate_ops` | `nat_exchange_rate_ops` | `natExchangeRateOps` | 本币汇率折算方式 |

### 长整数 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |
| `settleBenchId` | `settleBenchId` | `settleBenchId` | 结算工作台Id |
| `backItem10` | `backItem10` | `backItem10` | 备用字段10 |
| `voucher_id` | `voucher_id` | `voucherId` | 凭证单id |
| `fundSettleId` | `fundSettleId` | `fundSettleId` | 待结算数据Id |
| `backItem9` | `backItem9` | `backItem9` | 备用字段9 |
| `paymentBillId` | `paymentBillId` | `paymentBillId` | 付款单Id  |
| `relationBankId` | `relationBankId` | `relationBankId` | 关联银行对账单id |
| `claimAccountId` | `claimAccountId` | `claimAccountId` | 关联认领单id |
| `paymentTransId` | `paymentTransId` | `paymentTransId` | 付款事务Id  |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `executedAmt` | `executedAmt` | `executedAmt` | 已执行金额 |
| `guaranteeAmount` | `guaranteeAmount` | `guaranteeAmount` | 保函金额 |
| `backItem8` | `backItem8` | `backItem8` | 备用字段8 |
| `backItem7` | `backItem7` | `backItem7` | 备用字段7 |
| `feeAmt` | `feeAmt` | `feeAmt` | 费用金额(费用币种) |
| `localExchangeRate` | `localExchangeRate` | `localExchangeRate` | 本币币种汇率 |
| `olcmoney` | `olcmoney` | `olcmoney` | 凭证金额 |
| `localFeeAmt` | `localFeeAmt` | `localFeeAmt` | 费用金额(本币币种) |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `lgm_define_character_def` | `lgm_define_character_def` | `lgm_define_character_def` | 自由项特征组 |
