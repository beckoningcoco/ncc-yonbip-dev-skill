---
tags: [BIP, 元数据, 数据字典, tlm.derivativesregister.DerivativesRegisterMargin]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 衍生品合约关联保证金子表 (`tlm.derivativesregister.DerivativesRegisterMargin`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_derivativesregister_margin` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 衍生品合约关联保证金子表 |
| 物理表 | `tlm_derivativesregister_margin` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 38 个 |
| 子表 | 0 个 |
| 关联引用 | 11 个 |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `marginaccid` | `` |
| `` | `` |
| `margin_define_character` | `` |
| `ytenant_id` | `` |
| `current_account` | `` |
| `mainid` | `` |
| `settlement_method` | `` |
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

> 共 38 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditor` | `auditor` | 审批人名称 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `is_history` | `is_history` | `isHistory` | yes：关联保证金的历史数据（历史数据已提交结束时不释放保证金，未提交的提交后去掉这个标志） |
| `is_settle` | `is_settle` | `isSettle` | 是否结算 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `remark1` | `remark1` | `remark1` | 备用1 |
| `remark2` | `remark2` | `remark2` | 备用2 |
| `remark3` | `remark3` | `remark3` | 备用3 |
| `settle_payment_mode` | `settle_payment_mode` | `settlePaymentMode` | 付款结算模式 |
| `settle_status` | `settle_status` | `settleStatus` | 结算状态 |
| `transaction_receipt` | `transaction_receipt` | `transactionReceipt` | 交易成交单ID |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `current_account` | `current_account` | `currentAccount` | 活期账号id |
| `mainid` | `mainid` | `mainid` | 衍生品合约主表ID |
| `margin_currency` | `margin_currency` | `marginCurrency` | 保证金币种id |
| `marginaccid` | `marginaccid` | `marginaccid` | 保证金账号id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `settlement_method` | `settlement_method` | `settlementMethod` | 结算方式 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `margin_amount` | `margin_amount` | `marginAmount` | 保证金金额 |
| `margin_ratio` | `margin_ratio` | `marginRatio` | 保证金比例 |
| `remain_amount` | `remain_amount` | `remainAmount` | 保证金余额 |
| `total_amount` | `total_amount` | `totalAmount` | 保证金总额 |

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
| `margin_define_character` | `margin_define_character` | `fRMarginCharacterDef` | 衍生品合约关联保证金子表特征 |
