---
tags: [BIP, 元数据, 数据字典, tlm.financein.FinanceInUnderwriters]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 监管账户子表 (`tlm.financein.FinanceInUnderwriters`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financein_underwriters` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 监管账户子表 |
| 物理表 | `tlm_financein_underwriters` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 63 个 |
| 子表 | 0 个 |
| 关联引用 | 15 个 |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `financeamountban_accid` | `bd_enterprisebankacctref` |
| `free_characters_id` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `otherAccidForUnderWrier` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobjbank_Ref` |
| `settlement_method` | `aa_settlemethodref` |
| `protocol_currency` | `ucfbasedoc.bd_currencytenantref` |
| `org_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `org_type` | `` |
| `underwriterid` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `underwriter_type` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobject_typeRef` |
| `mainid` | `` |
| `tenant_id` | `` |

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

> 共 63 个直连字段

### 文本字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `underwrite_rrole` | `underwrite_rrole` | `underwriterrole` | 承销商角色 |
| `settlementId` | `settlementId` | `settlementId` | 结算单id |
| `unsettlementId` | `unsettlementId` | `unsettlementId` | 待结算id |
| `settlementbId` | `settlementbId` | `settlementbId` | 结算明细id |
| `settlementNo` | `settlementNo` | `settlementNo` | 结算单号 |
| `beiyong1` | `beiyong1` | `beiyong1` | 备用1 |
| `beiyong2` | `beiyong2` | `beiyong2` | 备用2 |
| `beiyong3` | `beiyong3` | `beiyong3` | 备用3 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `is_underwriter` | `is_underwriter` | `isUnderwriter` | 是否扣除承销费 |
| `sellmethod` | `sellmethod` | `sellmethod` | 销售方式 |
| `occupysx` | `occupysx` | `occupySX` | 是否占用授信 |
| `hitfinance_amount` | `hitfinance_amount` | `hitfinanceamount` | 是否打融资款 |
| `settlement_status` | `settlement_status` | `settlementStatus` | 结算状态 |
| `personincharge` | `personincharge` | `personincharge` | 负责人 |
| `picphone` | `picphone` | `picphone` | 联系电话 |
| `picremard` | `picremard` | `picremard` | 备注 |
| `isRelateCheckBill` | `isRelateCheckBill` | `isRelateCheckBill` | 是否关联对账单 |
| `associated_bank_statements` | `associated_bank_statements` | `associatedBankStatements` | 关联银行对账单id |
| `associated_claim_form` | `associated_claim_form` | `associatedClaimForm` | 关联认领单id |
| `bank_transaction_num` | `bank_transaction_num` | `bankTransactionNum` | 银行交易流水号 |
| `incorporation_num` | `incorporation_num` | `incorporationNum` | 财资统一对账码 |
| `settled_addition` | `settled_addition` | `settledAddition` | 已结算补单 |

### 引用字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 融入登记主表id |
| `org_id` | `org_id` | `orgId` | 监管机构id |
| `underwriter_type` | `underwriter_type` | `underwritertype` | 承销商机构类型ID |
| `underwriterid` | `underwriterid` | `underwriterid` | 承销商id |
| `org_type` | `org_type` | `orgType` | 监管机构类型 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种id |
| `financeamountban_accid` | `financeamountban_accid` | `financeamountbanAccid` | 融资款收款账户id |
| `settlement_method` | `settlement_method` | `settlementMethod` | 结算方式id |
| `otherAccidForUnderWrier` | `otherAccidForUnderWrier` | `otherAccidForUnderWrier` | 对方账户名称id |

### 日期字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `settlementDate` | `settlementDate` | `settlementDate` | 实际结算日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `plandate` | `plandate` | `plandate` | 计划日期 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `transaction_association_method` | `transaction_association_method` | `transactionAssociationMethod` | 流水关联方式 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `supervise_ratio` | `supervise_ratio` | `superviseRatio` | 监管比例(%) |
| `underwriter_percent` | `underwriter_percent` | `underwriterpercent` | 承销比例(%) |
| `underwriter_amountxy` | `underwriter_amountxy` | `underwriterAmountXY` | 承销金额(协议币种) |
| `plan_fiance_amount_xy` | `plan_fiance_amount_xy` | `planfianceAmountXY` | 计划融资金额(协议币种) |
| `real_fiance_amount_xy` | `real_fiance_amount_xy` | `realfianceAmountXY` | 实际融入金额(协议币种) |
| `plan_fiance_amount_bj` | `plan_fiance_amount_bj` | `planfianceAmountBJ` | 计划融资金额(本金币种) |
| `real_fiance_amount_bj` | `real_fiance_amount_bj` | `realfianceAmountBJ` | 实际融入金额(本金币种) |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `relate_check_bill_pubts` | `relate_check_bill_pubts` | `relateCheckBillpubts` | 银行对账单时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_characters_id` | `free_characters_id` | `underwritersFreeCharacteristics` | 承销商特征 |
