---
tags: [BIP, 元数据, 数据字典, tlm.financingregister.FinancingRegisterMargin]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 金融合同关联保证金 (`tlm.financingregister.FinancingRegisterMargin`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financingregister_margin` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 金融合同关联保证金 |
| 物理表 | `tlm_financingregister_margin` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 48 个 |
| 子表 | 0 个 |
| 关联引用 | 14 个 |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `marginaccid` | `bd_enterprisebankacctref` |
| `margin_define_character` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `debt_id` | `tlm_financeinRef` |
| `settlement_method` | `aa_settlemethodref` |
| `nat_currency` | `` |
| `nat_exchange_rate_type` | `` |
| `current_account` | `bd_enterprisebankacctref` |
| `mainid` | `` |
| `margin_currency` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 6字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 48 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_settle` | `is_settle` | `isSettle` | 是否结算 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `` | `code` | `code` | 编码 |
| `create_method` | `create_method` | `createMethod` | 生成方式 |
| `` | `creator` | `creator` | 创建人名称 |
| `is_history` | `is_history` | `isHistory` | yes:关联保证金的历史数据(历史数据已提交结束时不释放保证金,未提交的提交后去掉这个标志) |
| `` | `modifier` | `modifier` | 修改人名称 |
| `remark1` | `remark1` | `remark1` | 备用1 |
| `remark2` | `remark2` | `remark2` | 备用2 |
| `remark3` | `remark3` | `remark3` | 备用3 |
| `settle_payment_mode` | `settle_payment_mode` | `settlePaymentMode` | 付款结算模式 |
| `settle_status` | `settle_status` | `settleStatus` | 结算状态 |
| `transaction_receipt` | `transaction_receipt` | `transactionReceipt` | 交易成绩单id |
| `voucher_type` | `voucher_type` | `voucherType` | 关联单据类型 |
| `with_margin` | `with_margin` | `withMargin` | 是否同时扣除保证金:yes/no |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 融资登记主表id |
| `current_account` | `current_account` | `currentAccount` | 活期账号id |
| `marginaccid` | `marginaccid` | `marginaccid` | 保证金账号id |
| `settlement_method` | `settlement_method` | `settlementMethod` | 结算方式id |
| `debt_id` | `debt_id` | `debtId` | 借据id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `margin_currency` | `margin_currency` | `marginCurrency` | 保证金币种 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `nat_currency` | `nat_currency` | `natCurrency` | 本币币种 |
| `nat_exchange_rate_type` | `nat_exchange_rate_type` | `natExchangeRateType` | 本币币种汇率类型 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nat_exchange_rate_ops` | `nat_exchange_rate_ops` | `natExchangeRateOps` | 本币币种汇率折算方式 |
| `` | `status` | `status` | 单据状态 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `debt_margin_id` | `debt_margin_id` | `debtMarginId` | 借据保证金子表id |
| `` | `tplid` | `tplid` | 模板id |
| `voucher_id` | `voucher_id` | `voucherId` | 关联单据id |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `margin_ratio` | `margin_ratio` | `marginRatio` | 保证金比例（%） |
| `margin_amount` | `margin_amount` | `marginAmount` | 保证金金额 |
| `total_amount` | `total_amount` | `totalAmount` | 总占用额度 |
| `remain_amount` | `remain_amount` | `remainAmount` | 剩余占用额度 |
| `nat_exchange_rate` | `nat_exchange_rate` | `natExchangeRate` | 本币币种汇率 |

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
| `margin_define_character` | `margin_define_character` | `fRMarginCharacterDef` | 保证金子表特征 |
