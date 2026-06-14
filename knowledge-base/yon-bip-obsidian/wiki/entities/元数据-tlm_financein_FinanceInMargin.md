---
tags: [BIP, 元数据, 数据字典, tlm.financein.FinanceInMargin]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 融入登记关联保证金 (`tlm.financein.FinanceInMargin`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financein_margin` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 融入登记关联保证金 |
| 物理表 | `tlm_financein_margin` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 44 个 |
| 子表 | 0 个 |
| 关联引用 | 13 个 |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `financein_margin_character_def` | `` |
| `marginaccid` | `bd_enterprisebankacctref` |
| `ytenant_id` | `` |
| `` | `` |
| `settlement_method` | `aa_settlemethodref` |
| `nat_currency` | `` |
| `nat_exchange_rate_type` | `` |
| `current_account` | `bd_enterprisebankacctref` |
| `mainid` | `` |
| `margin_currency` | `bd_currencytenantreflist` |
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

> 共 44 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_settle` | `is_settle` | `isSettle` | 是否结算 |
| `create_method` | `create_method` | `createMethod` | 添加方式 |
| `voucher_type` | `voucher_type` | `voucherType` | 关联单据类型 |
| `remark1` | `remark1` | `remark1` | 备用1 |
| `remark2` | `remark2` | `remark2` | 备用2 |
| `remark3` | `remark3` | `remark3` | 备用3 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `with_margin` | `with_margin` | `withMargin` | 是否同时扣除保证金:yes/no |

### 引用字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 融入登记id |
| `current_account` | `current_account` | `currentAccount` | 活期账号id |
| `marginaccid` | `marginaccid` | `marginaccid` | 保证金账号id |
| `settlement_method` | `settlement_method` | `settlementMethod` | 结算方式id |
| `margin_currency` | `margin_currency` | `marginCurrency` | 保证金币种id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
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

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `voucher_id` | `voucher_id` | `voucherId` | 关联单据id |
| `debt_id` | `debt_id` | `debtId` | 借据id |
| `debt_margin_id` | `debt_margin_id` | `debtMarginId` | 借据保证金子表id |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `margin_ratio` | `margin_ratio` | `marginRatio` | 保证金比例 |
| `margin_amount` | `margin_amount` | `marginAmount` | 保证金金额 |
| `total_amount` | `total_amount` | `totalAmount` | 保证金总额 |
| `remain_amount` | `remain_amount` | `remainAmount` | 保证金余额 |
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
| `financein_margin_character_def` | `financein_margin_character_def` | `financeInMarginCharacterDef` | 融入登记关联保证金特征 |
