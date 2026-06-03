---
tags: [BIP, 元数据, 数据字典, tlm.financingapply.FinancingApplyRecord]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 申请明细子表 (`tlm.financingapply.FinancingApplyRecord`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financingapply_record` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 申请明细子表 |
| 物理表 | `tlm_financingapply_record` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 59 个 |
| 子表 | 1 个 |
| 关联引用 | 13 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `financingApplyRecordCurrency` | `tlm.financingapply.FinancingApplyRecordCurrency` | composition |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `trading_market` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `ytenant_id` | `` |
| `base_rate_type` | `tlm_interestrateRef` |
| `` | `` |
| `protocol` | `` |
| `capital_currency` | `ucfbasedoc.bd_currencytenantref` |
| `record_define_character` | `` |
| `bond_class` | `tlm_bondclassdefinitionRef` |
| `mainid` | `` |
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

> 共 59 个直连字段

### 文本字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `term_unit` | `term_unit` | `termUnit` | 期限单位 |
| `more_currency` | `more_currency` | `moreCurrency` | 是否多币种贷款 |
| `term` | `term` | `term` | 期限 |
| `term_type` | `term_type` | `termType` | 融资期限分类 |
| `repayment_type` | `repayment_type` | `repaymentType` | 还款方式 |
| `call_option` | `call_option` | `callOption` | 是否有赎回选择权 |
| `has_debt_rating` | `has_debt_rating` | `hasDebtRating` | 是否有债项评级 |
| `rate_type` | `rate_type` | `rateType` | 利率类型 |
| `debt_rating` | `debt_rating` | `debtRating` | 债项评级结果 |
| `year_month_day` | `year_month_day` | `yearMonthDay` | 年/月/日利率 |
| `float_type` | `float_type` | `floatType` | 浮动方式 |
| `settlement_type` | `settlement_type` | `settlementType` | 结息方式 |
| `remark` | `remark` | `remark` | 备注 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `release_ids` | `release_ids` | `releaseIds` | 释放单id集合 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bond_class` | `bond_class` | `bondClass` | 债券类别id |
| `mainid` | `mainid` | `mainid` | 融资申请主表id |
| `trading_market` | `trading_market` | `tradingMarket` | 交易市场id |
| `capital_currency` | `capital_currency` | `capitalCurrency` | 本金币种id |
| `base_rate_type` | `base_rate_type` | `baseRateType` | 基准利率类型id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `protocol` | `protocol` | `protocol` | 协议 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begin_date` | `begin_date` | `beginDate` | 预计开始日期 |
| `expire_date` | `expire_date` | `expireDate` | 预计到期日期 |
| `redeem_date` | `redeem_date` | `redeemDate` | 赎回日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `standard_expire_date` | `standard_expire_date` | `standardExpireDate` | 到期日期（规则计算的到期日期） |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_index` | `create_index` | `createIndex` | 明细创建顺序 |
| `term_number` | `term_number` | `termNumber` | 期限 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `apply_status` | `apply_status` | `applyStatus` | 申请状态 |
| `` | `status` | `status` | 单据状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `price` | `price` | `price` | 单价 |
| `num` | `num` | `num` | 数量 |
| `protocol_amount` | `protocol_amount` | `protocolAmount` | 融资金额 |
| `capital_exchange_rate` | `capital_exchange_rate` | `capitalExchangeRate` | 本金约定汇率 |
| `underwriting_rate` | `underwriting_rate` | `underwritingRate` | 承销费率(%) |
| `base_rate` | `base_rate` | `baseRate` | 基准利率（%） |
| `float_value` | `float_value` | `floatValue` | 浮动值 |
| `protocol_rate` | `protocol_rate` | `protocolRate` | 预计利率（%） |
| `bond_release` | `bond_release` | `bondRelease` | 债券释放金额 |
| `credit_release` | `credit_release` | `creditRelease` | 授信释放金额 |

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
| `record_define_character` | `record_define_character` | `financingApplyRecordCharacterDef` | 申请明细子表特征 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `financingApplyRecordCurrency` | 融资明细本金币种 |
