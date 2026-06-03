---
tags: [BIP, 元数据, 数据字典, tlm.payinterest.PayIntPaymentDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 付款明细子表 (`tlm.payinterest.PayIntPaymentDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_payint_payment_detail` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 付款明细子表 |
| 物理表 | `tlm_payint_payment_detail` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 68 个 |
| 子表 | 1 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `payIntPaymentInterestDetail` | `tlm.payinterest.PayIntPaymentInterestDetail` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `interestCurrency` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `tlm_define_character_def` | `` |
| `debt_id` | `` |
| `mainid` | `` |
| `protocol_currency` | `` |
| `flow_type` | `` |
| `ptCurrency` | `` |

## 继承接口 (3个, 10字段)

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
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 68 个直连字段

### 文本字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_id` | `accentity_id` | `accentityId` | 资金组织Id |
| `accentity_Name` | `accentity_Name` | `accentityName` | 资金组织 |
| `cf_business_type` | `cf_business_type` | `cfBusinessType` | 上个写融入现金流的业务类型 |
| `code` | `code` | `code` | 现金流ID |
| `` | `creator` | `creator` | 创建人名称 |
| `creatorId` | `creatorId` | `creatorId` | 创建人 |
| `direction` | `direction` | `direction` | 方向 |
| `event` | `event` | `event` | 现金流事件 |
| `ifAfterAuditAutoCreate` | `ifAfterAuditAutoCreate` | `ifAfterAuditAutoCreate` | 是否审批通过自动生成 |
| `if_used` | `if_used` | `ifUsed` | 参照是否被使用 |
| `interest_base` | `interest_base` | `interestBase` | 计息基数 |
| `interest_rate_ids` | `interest_rate_ids` | `interestRateIds` | 现金流引用利率id集合 |
| `interest_rate_values` | `interest_rate_values` | `interestRateValues` | 现金流引用利率值集合 |
| `is_endwt` | `is_endwt` | `isEndWt` | 是否末次付息且全部预提 |
| `if_own_add` | `if_own_add` | `isOwnAdd` | 是否手动添加 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `modifierId` | `modifierId` | `modifierId` | 修改人 |
| `next_payinterest_plan` | `next_payinterest_plan` | `nextPayInterestPlan` | 下次付息计划 |
| `plan_scope` | `plan_scope` | `planScope` | 计划内/外 |
| `protocol_id` | `protocol_id` | `protocolId` | 协议id |
| `relate_code` | `relate_code` | `relateCode` | 关联现金流编码 |
| `relateCodeId` | `relateCodeId` | `relateCodeId` | 关联现金流id |
| `sync_code` | `sync_code` | `syncCode` | 协同的现金流ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户id |
| `term` | `term` | `term` | 融资期限 |
| `term_unit` | `term_unit` | `termUnit` | 期限类型 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `debt_id` | `debt_id` | `debtId` | 借据id |
| `flow_type` | `flow_type` | `flowType` | 流类型 |
| `interestCurrency` | `interestCurrency` | `interestCurrency` | 计息币种 |
| `mainid` | `mainid` | `mainid` | 付息主键 |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种 |
| `ptCurrency` | `ptCurrency` | `ptCurrency` | 本金币种 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `end_date` | `end_date` | `endDate` | 结束日期 |
| `execute_date` | `execute_date` | `executeDate` | 执行日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `pay_interest_end_date` | `pay_interest_end_date` | `payInsterestEndDate` | 付息止息日 |
| `pay_interest_start_date` | `pay_interest_start_date` | `payInsterestStartDate` | 付息起息日 |
| `penaltyCompoundEndDate` | `penaltyCompoundEndDate` | `penaltyCompoundEndDate` | 罚息/复利止息日 |
| `plan_date` | `plan_date` | `planDate` | 计划日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `interest_settlement_rule` | `interest_settlement_rule` | `interestSettlementRule` | 结息头尾规则 |
| `rush_withholding` | `rush_withholding` | `rushWithholding` | 预提冲销方式 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `term_number` | `term_number` | `termNumber` | 期限数量 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `execute_status` | `execute_status` | `executeStatus` | 执行状态 |
| `` | `status` | `status` | 单据状态 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cf_business_id` | `cf_business_id` | `cfBusinessId` | 上个写融入现金流的业务id |
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `adjustInterestAmount` | `adjustInterestAmount` | `adjustInterestAmount` | 调整后付息金额(计息币种) |
| `deal_currency_amount` | `deal_currency_amount` | `dealCurrencyAmount` | 交易币种金额 |
| `detail_margin_amount` | `detail_margin_amount` | `detailMarginAmount` | 保证金抵扣(本金币种) |
| `detail_real_pi_amount` | `detail_real_pi_amount` | `detailRealPayInterestAmount` | 实付利息(计息币种) |
| `detail_debtoffset_interAmount` | `detail_debtoffset_interAmount` | `detaildebtOffsetInterestAmount` | 抵销利息（计息币种） |
| `detail_dt_interCurrAmount` | `detail_dt_interCurrAmount` | `detaildeductInterCurrAmount` | 减免利息（计息币种） |
| `detail_dt_localCurrAmount` | `detail_dt_localCurrAmount` | `detaildeductLocalCurrAmount` | 减免本金（本金币种） |
| `execute_amount` | `execute_amount` | `executeAmount` | 执行金额 |
| `protocol_currency_amount` | `protocol_currency_amount` | `payInsterestAmount` | 协议币种金额 |
| `protocol_currency_amount` | `protocol_currency_amount` | `protocolAmount` | 协议币种金额 |
| `taxAmount` | `taxAmount` | `taxAmount` | 代扣代缴税费(计息币种) |
| `taxInterestAmount` | `taxInterestAmount` | `taxInterestAmount` | 代扣代缴税费后付息金额(计息币种) |
| `wt_amt_int_ccy` | `wt_amt_int_ccy` | `wtAmtIntCcy` | 核销预提金额（计息币种） |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `payIntPaymentInterestDetail` | 付款明细利息分段 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tlm_define_character_def` | `tlm_define_character_def` | `tlmDefineCharacterDef` | 付息付款明细自定义项 |
