---
title: "融入登记生单"
apiId: "2120718133559296003"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lending Registration"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lending Registration]
platform_version: "BIP"
source_type: community-api-docs
---

# 融入登记生单

> `ContentType	application/json` 请求方式	POST | 分类: Lending Registration (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/fm/financein/openapi/create

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| protocolNumber | string | 否 | 是 | 协议号(可传入协议ID/编码/协议号) 示例：银行贷款A |
| accentity | string | 否 | 是 | 资金组织 示例：收入中台演示销售组织 |
| cashflowplan | string | 否 | 否 | 现金流计划(可输入id/code) 示例：ZJ20251104001 |
| initialization | string | 否 | 是 | 是否期初(true-是;false-否) 示例：false |
| initialRepaymentAmtXY | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 期初已还本金额(协议币种) 示例：100.00 |
| initialRepaymentAmtBJ | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 期初已还本金额(本金币种) 示例：100.00 |
| repaidAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 已还本金额 示例：100.00 |
| repaidAmountBJ | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 已还本金额(本金币种) 示例：100.00 |
| initialInterestAmtXY | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 期初已付息金额(协议币种) 示例：100.00 |
| initialInterestAmtJX | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 期初已付息金额(计息币种) 示例：100.00 |
| payInterestAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 已付息金额 示例：100.00 |
| payInterestAmountJX | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 已付息金额(计息币种) 示例：100.00 |
| lasthbdate | string | 否 | 否 | 期初末次还本日 示例：2025-10-23 |
| lastfxdate | string | 否 | 否 | 期初末次付息日 示例：2025-10-23 |
| debtcode | string | 否 | 否 | 借据号 示例：融入登记test1 |
| financeindate | string | 否 | 是 | 融入日期 示例：2024-10-23 |
| financeintermUnit | string | 否 | 是 | 融入期限类型(year-年;month-月;day-日) 示例：year |
| financeinterm | string | 否 | 是 | 融入期限 示例：1年 |
| financeintermNumber | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 融入期限数量 示例：1 |
| termType | string | 否 | 是 | 融资期限分类(0-短期;1-中期;2-长期) 示例：0 |
| financeinexpireDate | string | 否 | 是 | 融入到期日期 示例：2025-10-23 |
| capitalCurrency | string | 否 | 是 | 本金币种(可输入币种id/币种名称) 示例：人民币 |
| capitalExchangeRate | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 本金约定汇率 示例：1.000 |
| financeinnatoriginAmount | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 融入金额(本金币种) 示例：10000000 |
| financeinamount | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 融入金额(协议币种) 示例：10000000 |
| repaymentType | string | 否 | 是 | 还款方式(period_repayment-周期还本;expire_once-到期一次;average_capital-等额本金;average_interest-等额本息;custom-自定义;no_repayment-不还本) 示例：period_repayment |
| repaymentCycle | string | 否 | 否 | 还款周期(1-年;2-半年;3-季度;4-月) 示例：4 |
| firstRepaymentDate | string | 否 | 否 | 首次还款日 示例：2024-11-30 |
| monthAdjustDate | string | 否 | 否 | 月末日期调整(还本) 示例：31 |
| gracePeriod | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 宽限期 示例：3 |
| useOverdue | string | 否 | 否 | 是否启用逾期(yes-是;no-否) 示例：yes |
| isPenalty | string | 否 | 否 | 是否计算罚息(yes-是;no-否) 示例：yes |
| penaltyFloatPercent | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 罚息上浮比例(%) 示例：10 |
| penaltyRate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 罚息利率(%) 示例：4.4 |
| isCompoundInterest | string | 否 | 否 | 是否计算复利(yes-是;no-否) 示例：yes |
| compoundFloatPercent | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 复利上浮比例(%) 示例：10 |
| compoundRate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 复利利率(%) 示例：4.4 |
| periodHeadTail | string | 否 | 否 | 周期首尾规则(1-首期不合,尾期合;2-首期合,尾期不合;3-首尾均不合) 示例：1 |
| payFeeSameTime | string | 否 | 否 | 是否同时扣费(yes-是;no-否) 示例：yes |
| underwritingAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 费用金额(协议币种) 示例：10 |
| advanceDate | string | 否 | 否 | 预付本金日期 示例：2025-01-01 |
| advancePrincipal | string | 否 | 否 | 是否预付本金(yes-是;no-否) 示例：no |
| advanceAmountBJ | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 预付本金(本金币种) 示例：100 |
| advanceAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 预付本金（协议币种） 示例：100 |
| holidayPrinciple | string | 否 | 是 | 节假日处理原则(normal-正常;advance-提前;delayed-延后) 示例：normal |
| holidayInterestPrinciple | string | 否 | 是 | 节假日计息原则(normal-不变;advance-提前;delayed-延后) 示例：normal |
| postscriptInfo | string | 否 | 否 | 附言 |
| abstractInfo | string | 否 | 否 | 摘要 |
| interestDays | string | 否 | 是 | 计息天数(standard-标准-360;standard365-标准-365;reality-实际-365/366;standard360-实际-360;reality365-实际-365) 示例：standard |
| interestRateType | string | 否 | 是 | 利率类型(fixed-固定利率;float-浮动利率) 示例：fixed |
| baseRateType | string | 否 | 否 | 基准利率种类(可输入id/名称) 示例：基准利率 |
| yearMonthDay | string | 否 | 是 | 年/月/日利率(year-年;half_year-半年;month-月;day-日) 示例：year |
| baserate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 基准利率 示例：4 |
| floatType | string | 否 | 否 | 浮动方式(0-加减点（BP）;1-比例（%）) 示例：0 |
| floatValue | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 浮动值 示例：0 |
| debtRate | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 借据利率 示例：4 |
| rateAdjustCycle | string | 否 | 否 | 利率调整周期(0-即时浮动;1-按月;2-按季度;3-按半年;4-按年) 示例：1 |
| firstEffectDate | string | 否 | 否 | 利率调整首次生效日期 示例：2025-10-10 |
| settlementType | string | 否 | 是 | 结息方式(expire_once-到期一次;principal_clear_period-利随本清&周期计息;principal_clear-利随本清;period-周期计息;withhold_interest-预扣利息;custom-自定义;no_interest-不计息) 示例：period |
| settlementCycle | string | 否 | 否 | 结息周期(1-年;2-半年;3-季度;4-月) 示例：4 |
| firstPaymentDate | string | 否 | 否 | 首次付息日 示例：2024-11-30 00:00:00 |
| interestSettlementRule | string | 否 | 是 | 结息头尾规则(heads_not_tails-算头不算尾;heads_and_tails-算头算尾) 示例：heads_not_tails |
| monthInterestAdjustDate | string | 否 | 否 | 月末日期调整(计息) 示例：31 |
| interestCurrency | string | 否 | 是 | 计息币种(可输入id/名称) 示例：人民币 |
| appointRate | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 利息约定汇率 示例：1 |
| realAccrualRate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 实际利率(%) 示例：1 |
| oldcurrency | string | 否 | 是 | 本币币种(可输入id/名称) 示例：人民币 |
| exchangerateType | string | 否 | 是 | 本币币种汇率类型((可输入id/名称)) 示例：基准汇率 |
| exchangerate | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 本币币种汇率 示例：2 |
| financeinnatlocalAmount | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 融入金额(本币币种) 示例：20000000 |
| realInAmountBJWhenNum | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 实际融入金额(本金币种) 示例：100000 |
| infuseIncomeAccid | string | 否 | 否 | 收入账户(可输入id/名称) 示例：1541098836418101253 |
| outlayAccid | string | 否 | 否 | 支出账户(可输入id/名称) 示例：32423423 |
| settledAddition | string | 否 | 是 | 已结算补单(yes-是;no-否) 示例：no |
| settlementMethod | string | 否 | 否 | 结算方式(可输入id/名称) 示例：银行转账 |
| otherType | string | 否 | 否 | 对方类型(TBOT0005-银行;TBOT0004-非银类金融机构;TBOT0006-结算中心;TBOT0007-资金组织;supplier-供应商;other-其他;bank_consortium-银团;TBOT0009-财务公司;customer-客户) 示例：TBOT0005 |
| financeinMethod | string | 否 | 是 | 融入方式(ownpay-自主支付;truteepay-受托支付;hybridpay-混合支付;nopay-不实际支付) 示例：ownpay |
| trusteePayType | string | 否 | 否 | 受托支付类型(0-收入账户支付;1-银行直接支付) 示例：0 |
| thirdAccout | string | 否 | 否 | 第三方银行账号(可输入id/名称) 示例：88888 |
| ownPayAmountBJ | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 自主支付金额(本金币种) 示例：10000000 |
| ownPayAmountBB | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 自主支付金额(本币币种) 示例：20000000 |
| trusteePayAmountBJ | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 受托支付金额(本金币种) 示例：0 |
| trusteePayAmountBB | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 受托支付金额(本币币种) 示例：0 |
| withholdingInterestDate | string | 否 | 否 | 预提起息日 示例：2024-10-23 |
| accrualPeriod | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 预提利息周期(1-年;2-半年;3-季度;4-月) 示例：4 |
| firstAccrualDate | string | 否 | 否 | 首次预提利息日 示例：2024-10-31 |
| monthWithHoldingAdjustDate | string | 否 | 否 | 月末日期调整(预提)(29-29日;30-30日;31-31日) 示例：31 |
| withholdingRule | string | 否 | 否 | 预提头尾规则(heads_not_tails-算头不算尾;heads_and_tails-算头算尾) 示例：heads_and_tails |
| capitalSource | string | 否 | 否 | 资金来源(1-自有资金;2-外部筹集;3-内部筹集;4-其他) 示例：1 |
| settleParam | string | 否 | 否 | 结算集成参数（stwb-资金结算;no-不结算） 示例：stwb |
| deptid | string | 否 | 否 | 部门(可输入id/名称) 示例：融资部 |
| bondType | string | 否 | 否 | 债券类别(可输入id/名称) 示例：长期债券 |
| issueNum | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 发行数量 示例：100000 |
| issueunitPrice | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 发行单价 示例：1 |
| fxcustomerBankAccount | string | 否 | 否 | 付息客户银行账号(可输入id/名称) 示例：999999 |
| fxotherType | string | 否 | 否 | 付息对方类型(TBOT0005-银行;TBOT0004-非银类金融机构;TBOT0006-结算中心;TBOT0007-资金组织;supplier-供应商;other-其他;bank_consortium-银团;TBOT0009-财务公司;customer-客户) 示例：TBOT0005 |
| realInAmountXYWhenNum | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 实际融入金额(协议币种) 示例：10000000 |
| realInAmountBBWhenNum | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 实际融入金额(本币币种) 示例：10000000 |
| realownPayAmountBB | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 实际收款金额(本币币种) 示例：10000000 |
| tobeamortizedBJWhenNum | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 需摊销费用(本金币种) 示例：10.00 |
| fxSettledAddition | string | 否 | 否 | 已结算补单(yes-是;no-否) 示例：no |
| fxsettleMethod | string | 否 | 否 | 结算方式(可输入id/名称) 示例：银行转账 |
| supplier | string | 否 | 否 | 供应商(可输入id/名称) 示例：供应商A |
| customer | string | 否 | 否 | 客户(可输入id/名称) 示例：客户A |
| amortizedCost | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 摊余成本 示例：100000 |
| amortizedCostUpdateDate | string | 否 | 否 | 摊余成本更新日期 示例：2025-10-01 |
| amortizedCostFirst | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 融入时摊余成本 示例：9999990 |
| otherBankAccount | string | 否 | 否 | 对方银行账号(可输入id/名称) 示例：123456 |
| fxsupplierBankAccount | string | 否 | 否 | 付息供应商银行账号(可输入id/名称) 示例：123456 |
| fxinterestBearTransCurrency | string | 否 | 否 | 计息交易币种(可输入id/名称) 示例：人民币 |
| thirdBanktype | string | 否 | 否 | 第三方账户名称(可输入id/名称) 示例：123456 |
| agencyInterestAcc | string | 否 | 否 | 代理付息账户(可输入id/名称) 示例：123456 |
| costCenter | string | 否 | 否 | 成本中心(可输入id/名称) 示例：中心A |
| underwritingAmountCapital | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 承销费(付费币种) 示例：10.00 |
| realownPayAmountBJ | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 实际收款金额(本金币种) 示例：100000 |
| agencyInfuseIncomeAcc | string | 否 | 否 | 代理收入账户(可输入id/名称) 示例：123456 |
| interestAccid | string | 否 | 否 | 计息账户(可输入id/名称) 示例：123456 |
| reduceInterestAmountJX | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 减免利息(计息币种) 示例：100000 |
| agencySettleInterestAcc | string | 否 | 否 | 代理结息账户(可输入id/名称) 示例：123456 |
| fxrate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 付息汇率 示例：2 |
| underwritingRate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 承销费率(%) 示例：1 |
| settlementTotalAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 已结息金额 示例：0 |
| tjtdReleaseAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 已释放金额(协议币种) 示例：0 |
| feeItem | string | 否 | 否 | 付费项目(可输入id/名称) 示例：项目A |
| fireallocalAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 实际收款金额(本币币种) 示例：0 |
| rrsupplierBankAccount | string | 否 | 否 | 融入供应商银行账号(可输入id/名称) 示例：123456 |
| fxotherAccountName | string | 否 | 否 | 对方账户名称(可输入id/名称) 示例：123456 |
| settlementCurrency | string | 否 | 否 | 结算币种(可输入id/名称) 示例：人民币 |
| payCurrency | string | 否 | 否 | 付费币种(可输入id/名称) 示例：人民币 |
| thirdNumber | string | 否 | 否 | 第三方账户开户行(可输入id/名称) 示例：工商银行 |
| tobeamortizedBBWhenNum | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 需摊销费用(本币币种) 示例：20.00 |
| xyzotherOpenAccountBank | string | 否 | 否 | 对方账户开户行(可输入id/名称) 示例：工商银行 |
| firealnatoriginAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 实际收款金额(本金币种) 示例：0 |
| normalInteresBase | string | 否 | 否 | 正常还本计息基数(repayment_amount-还本金额;financein_balance-借据余额) 示例：repayment_amount |
| contractType | string | 否 | 否 | 担保方式(1-抵押担保;2-质押担保;3-第三方保证担保;4-第三方抵押担保;5-第三方质押担保;0-信用;8-定金;9-留置;a-流动性支持函;b-差额补足承诺;c-承诺函;d-安慰函;e-共同借款合同;f-其他隐性担保) 示例：1 |
| reducePrincipalAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 减免本金 示例：0 |
| moreCurrency | string | 否 | 否 | 是否多币种贷款(yes-是;no-否) 示例：no |
| financeApplyID | string | 否 | 否 | 融入申请单(可输入id/名称) 示例：融入申请单A |
| fxotherBankType | string | 否 | 否 | 付息结算对方账户银行类别(可输入id/名称) 示例：工商银行 |
| fxinterestContractedRate | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 付息利息约定汇率 示例：1 |
| otherAccid | string | 否 | 否 | 付息对方银行账户(可输入id/名称) 示例：123456 |
| reduceInterestAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 减免利息 示例：100 |
| fxotherBankAccount | string | 否 | 否 | 付息结算对方银行账号(可输入id/名称) 示例：123456 |
| includedExpirationDate | string | 否 | 否 | 是否含到期日(yes-是;no-否) 示例：no |
| reservationPrice | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 留购价款 示例：1000 |
| underwritingAmountLocal | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 承销费(本币币种) 示例：20.00 |
| lockAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 已锁定金额 示例：0 |
| fxfunctionalCurrency | string | 否 | 否 | 付息结算本币币种(可输入id/名称) 示例：人民币 |
| fxrateType | string | 否 | 否 | 付息结算汇率类型(可输入id/名称) 示例：基准汇率 |
| otherAccountInput | string | 否 | 否 | 本方银行账户(可输入id/名称) 示例：123456 |
| rrcustomerBankAccount | string | 否 | 否 | 融入客户银行账号(可输入id/名称) 示例：123456 |
| fxourBankAccount | string | 否 | 否 | 付息本方银行账户(可输入id/名称) 示例：123456 |
| tobeamortizedXYWhenNum | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 需摊销费用(协议币种) 示例：10 |
| profitCenter | string | 否 | 否 | 利润中心(可输入id/名称) 示例：中心A |
| agencyIncomeAcc | string | 否 | 否 | 代理收入账户(可输入id/名称) 示例：123456 |
| allowLoan | string | 否 | 否 | 允许内部借贷(yes-是;no-否) 示例：no |
| interesBase | string | 否 | 否 | 提前还本计息基数(repayment_amount-还本金额;financein_balance-借据余额) 示例：repayment_amount |
| exchangerateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 本币币种汇率折算方式(1-*;2-/) 示例：1 默认值：1 |
| fxrateOps | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 付息汇率折算方式(1-*;2-/) 示例：1 默认值：1 |
| fiDefineCharacterDef | string | 否 | 否 | 融入登记自定义项 示例：{"tlm_zjjhmxzib":25671,"tlm_zjjhxmmxnew":4,"tlm_zjjhmxzib_capitalPlanProjectName":"chx应付账款","tlm_zjjhxmmxnew_code":"123"} |
| financein_cashflow | object | 是 | 否 | 现金流列表 |
| event | string | 否 | 是 | 现金流事件(JS-减少本金;FX-付息) 示例：JS |
| code | string | 否 | 是 | 现金流编码 示例：JS202512010001 |
| planDate | string | 否 | 是 | 计划日期 示例：2025-12-01 |
| protocolAmount | number |
| 小数位数:2,最大长度:10 | 否 | 是 | 协议币种金额 示例：100000.00 |
| dealCurrency | string | 否 | 否 | 交易币种(可输入id/名称) 示例：人民币 |
| dealCurrencyAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 交易币种金额 示例：1000.00 |
| executeStatus | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 执行状态(0-未执行;1-已执行) 示例：0 |
| isOverdue | number |
| 小数位数:0,最大长度:1 | 否 | 否 | 是否逾期(0-未逾期;1-已逾期) 示例：0 |
| interestBeginDate | string | 否 | 否 | 起息日，付息现金流必填 示例：2025-12-01 |
| executeDate | string | 否 | 否 | 执行日期，已执行现金流必填 示例：2025-12-01 |
| executeAmount | number |
| 小数位数:2,最大长度:10 | 否 | 否 | 执行金额(交易币种)，已执行现金流必填 示例：100000.00 |

## 3. 请求示例

Url: /yonbip/ctm/fm/financein/openapi/create?access_token=访问令牌
Body: {
	"protocolNumber": "银行贷款A",
	"accentity": "收入中台演示销售组织",
	"cashflowplan": "ZJ20251104001",
	"initialization": "false",
	"initialRepaymentAmtXY": 100,
	"initialRepaymentAmtBJ": 100,
	"repaidAmount": 100,
	"repaidAmountBJ": 100,
	"initialInterestAmtXY": 100,
	"initialInterestAmtJX": 100,
	"payInterestAmount": 100,
	"payInterestAmountJX": 100,
	"lasthbdate": "2025-10-23",
	"lastfxdate": "2025-10-23",
	"debtcode": "融入登记test1",
	"financeindate": "2024-10-23",
	"financeintermUnit": "year",
	"financeinterm": "1年",
	"financeintermNumber": 1,
	"termType": "0",
	"financeinexpireDate": "2025-10-23",
	"capitalCurrency": "人民币",
	"capitalExchangeRate": 1,
	"financeinnatoriginAmount": 10000000,
	"financeinamount": 10000000,
	"repaymentType": "period_repayment",
	"repaymentCycle": "4",
	"firstRepaymentDate": "2024-11-30",
	"monthAdjustDate": "31",
	"gracePeriod": 3,
	"useOverdue": "yes",
	"isPenalty": "yes",
	"penaltyFloatPercent": 10,
	"penaltyRate": 4.4,
	"isCompoundInterest": "yes",
	"compoundFloatPercent": 10,
	"compoundRate": 4.4,
	"periodHeadTail": "1",
	"payFeeSameTime": "yes",
	"underwritingAmount": 10,
	"advanceDate": "2025-01-01",
	"advancePrincipal": "no",
	"advanceAmountBJ": 100,
	"advanceAmount": 100,
	"holidayPrinciple": "normal",
	"holidayInterestPrinciple": "normal",
	"postscriptInfo": "",
	"abstractInfo": "",
	"interestDays": "standard",
	"interestRateType": "fixed",
	"baseRateType": "基准利率",
	"yearMonthDay": "year",
	"baserate": 4,
	"floatType": "0",
	"floatValue": 0,
	"debtRate": 4,
	"rateAdjustCycle": "1",
	"firstEffectDate": "2025-10-10",
	"settlementType": "period",
	"settlementCycle": "4",
	"firstPaymentDate": "2024-11-30 00:00:00",
	"interestSettlementRule": "heads_not_tails",
	"monthInterestAdjustDate": "31",
	"interestCurrency": "人民币",
	"appointRate": 1,
	"realAccrualRate": 1,
	"oldcurrency": "人民币",
	"exchangerateType": "基准汇率",
	"exchangerate": 2,
	"financeinnatlocalAmount": 20000000,
	"realInAmountBJWhenNum": 100000,
	"infuseIncomeAccid": "1541098836418101253",
	"outlayAccid": "32423423",
	"settledAddition": "no",
	"settlementMethod": "银行转账",
	"otherType": "TBOT0005",
	"financeinMethod": "ownpay",
	"trusteePayType": "0",
	"thirdAccout": "88888",
	"ownPayAmountBJ": 10000000,
	"ownPayAmountBB": 20000000,
	"trusteePayAmountBJ": 0,
	"trusteePayAmountBB": 0,
	"withholdingInterestDate": "2024-10-23",
	"accrualPeriod": 4,
	"firstAccrualDate": "2024-10-31",
	"monthWithHoldingAdjustDate": "31",
	"withholdingRule": "heads_and_tails",
	"capitalSource": "1",
	"settleParam": "stwb",
	"deptid": "融资部",
	"bondType": "长期债券",
	"issueNum": 100000,
	"issueunitPrice": 1,
	"fxcustomerBankAccount": "999999",
	"fxotherType": "TBOT0005",
	"realInAmountXYWhenNum": 10000000,
	"realInAmountBBWhenNum": 10000000,
	"realownPayAmountBB": 10000000,
	"tobeamortizedBJWhenNum": 10,
	"fxSettledAddition": "no",
	"fxsettleMethod": "银行转账",
	"supplier": "供应商A",
	"customer": "客户A",
	"amortizedCost": 100000,
	"amortizedCostUpdateDate": "2025-10-01",
	"amortizedCostFirst": 9999990,
	"otherBankAccount": "123456",
	"fxsupplierBankAccount": "123456",
	"fxinterestBearTransCurrency": "人民币",
	"thirdBanktype": "123456",
	"agencyInterestAcc": "123456",
	"costCenter": "中心A",
	"underwritingAmountCapital": 10,
	"realownPayAmountBJ": 100000,
	"agencyInfuseIncomeAcc": "123456",
	"interestAccid": "123456",
	"reduceInterestAmountJX": 100000,
	"agencySettleInterestAcc": "123456",
	"fxrate": 2,
	"underwritingRate": 1,
	"settlementTotalAmount": 0,
	"tjtdReleaseAmount": 0,
	"feeItem": "项目A",
	"fireallocalAmount": 0,
	"rrsupplierBankAccount": "123456",
	"fxotherAccountName": "123456",
	"settlementCurrency": "人民币",
	"payCurrency": "人民币",
	"thirdNumber": "工商银行",
	"tobeamortizedBBWhenNum": 20,
	"xyzotherOpenAccountBank": "工商银行",
	"firealnatoriginAmount": 0,
	"normalInteresBase": "repayment_amount",
	"contractType": "1",
	"reducePrincipalAmount": 0,
	"moreCurrency": "no",
	"financeApplyID": "融入申请单A",
	"fxotherBankType": "工商银行",
	"fxinterestContractedRate": 1,
	"otherAccid": "123456",
	"reduceInterestAmount": 100,
	"fxotherBankAccount": "123456",
	"includedExpirationDate": "no",
	"reservationPrice": 1000,
	"underwritingAmountLocal": 20,
	"lockAmount": 0,
	"fxfunctionalCurrency": "人民币",
	"fxrateType": "基准汇率",
	"otherAccountInput": "123456",
	"rrcustomerBankAccount": "123456",
	"fxourBankAccount": "123456",
	"tobeamortizedXYWhenNum": 10,
	"profitCenter": "中心A",
	"agencyIncomeAcc": "123456",
	"allowLoan": "no",
	"interesBase": "repayment_amount",
	"exchangerateOps": 1,
	"fxrateOps": 1,
	"fiDefineCharacterDef": "{\"tlm_zjjhmxzib\":25671,\"tlm_zjjhxmmxnew\":4,\"tlm_zjjhmxzib_capitalPlanProjectName\":\"chx应付账款\",\"tlm_zjjhxmmxnew_code\":\"123\"}",
	"financein_cashflow": [
		{
			"event": "JS",
			"code": "JS202512010001",
			"planDate": "2025-12-01",
			"protocolAmount": 100000,
			"dealCurrency": "人民币",
			"dealCurrencyAmount": 1000,
			"executeStatus": 0,
			"isOverdue": 0,
			"interestBeginDate": "2025-12-01",
			"executeDate": "2025-12-01",
			"executeAmount": 100000
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | 状态码 示例：200 |
| message | string | 否 | 处理结果 示例：成功 |
| data | object | 否 | 返回数据 |
| code | string | 否 | 单据编码 示例：RR2511040002 |
| id | string | 否 | 单据id 示例：2396924224787185673 |

## 5. 正确返回示例

{
	"code": 200,
	"message": "成功",
	"data": {
		"code": "RR2511040002",
		"id": "2396924224787185673"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-04-24

新增

请求参数 (5)

更新

请求参数 (10)

2	2025-12-31

更新

请求说明

新增

请求参数 (12)

更新

请求参数 (125)

删除

请求参数 (107)

新增

返回参数 id

更新

返回参数 (4)

删除

返回参数 statusMsg

删除

返回参数 timestamp

3	2025-12-05

更新

请求说明

新增

请求参数 (12)

更新

请求参数 (121)

删除

请求参数 (107)

新增

返回参数 id

更新

返回参数 (4)

删除

返回参数 statusMsg

删除

返回参数 timestamp

4	2025-09-09

新增

请求参数 settledAddition

新增

请求参数 fxSettledAddition

更新

请求参数 settlementStatus

更新

请求参数 fxsettleStatus


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

