---
title: "融资合同生单（审核态）"
apiId: "2094014775676633096"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financial Contract"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financial Contract]
platform_version: "BIP"
source_type: community-api-docs
---

# 融资合同生单（审核态）

> `ContentType	application/json` 请求方式	POST | 分类: Financial Contract (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/financingRegister/open/createBill

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| tran_seq_no_apply | string | 否 | 否 | 融资申请生单时的交易明细号 |
| protocolNumber | string | 否 | 是 | 协议号 示例：融资合同openapi测试 |
| accentity | string | 否 | 是 | 资金组织(支持id、编码、名称) 示例：XX建投公司 |
| accentityRaw | string | 否 | 否 | 核算会计主体 示例：XX建投公司 |
| financialProduct | string | 否 | 是 | 金融产品 示例：银行贷款 |
| financingOrgType | string | 否 | 是 | 融资机构类型(TBOT0005-银行,TBOT0007-资金组织,supplier-供应商,customer-客户,other-其他) 示例：TBOT0005 |
| financingOrgForBank | string | 否 | 是 | 融资机构(资金业务伙伴档案编码) 示例：ZJDX250102000007 |
| protocolAmount | number |
| 小数位数:8,最大长度:28 | 否 | 是 | 协议金额 示例：1000 |
| protocolCurrency | string | 否 | 是 | 协议币种(编码-CNY，名称-人民币) 示例：人民币 |
| capitalCurrency | string | 否 | 是 | 本金币种(编码-CNY，名称-人民币) 示例：人民币 |
| interestCurrency | string | 否 | 是 | 计息币种(编码-CNY，名称-人民币) 示例：人民币 |
| signDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 签约日期 示例：2025-01-01 |
| beginDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 开始日期 示例：2025-01-01 |
| expireDate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 到期日期 示例：2026-01-01 |
| termNumber | string | 否 | 是 | 期限数量 示例：1 |
| termUnit | string | 否 | 是 | 期限类型(year-年,month-月,day-日) 示例：year |
| capitalExchangeRate | string | 否 | 否 | 本金约定汇率，默认为1 示例：1 |
| fundPaymentType | string | 否 | 是 | 资金支付模式(0-被动还款,1-主动付款) 示例：0 |
| balanceMethod | string | 否 | 否 | 余额方式(once-一次性,recyclable-可循环) 示例：once |
| fpSyncDirection | string | 否 | 否 | 融入/申购发起方(0-融资方,1-投资方,2-不协同) 示例：0 |
| fpcSyncDirection | string | 否 | 否 | 融入/申购变更发起方(0-融资方,1-投资方,2-不协同) 示例：0 |
| riSyncDirection | string | 否 | 否 | 还本/赎回发起方(0-融资方,1-投资方,2-不协同) 示例：0 |
| piSyncDirection | string | 否 | 否 | 付息/收息发起方(0-融资方,1-投资方,2-不协同) 示例：0 |
| settleDirection | string | 否 | 否 | 结息发起方(0-融资方,1-投资方,2-不协同) 示例：0 |
| redSyncDirection | string | 否 | 否 | 减免发起方(0-融资方,1-投资方,2-不协同) 示例：0 |
| frcSyncDirection | string | 否 | 否 | 变更发起方(0-融资方,1-投资方,2-不协同) 示例：0 |
| exSyncDirection | string | 否 | 否 | 展期发起方(0-融资方,1-投资方,2-不协同) 示例：0 |
| syncAccessory | string | 否 | 否 | 是否协同附件/影像:yes-是,no-否 示例：no |
| periodHeadTail | string | 否 | 否 | 周期首尾规则:1-首期不合,尾期合,2-首期合,尾期不合,3-首尾均不合 示例：1 |
| capitalSource | string | 否 | 否 | 资金来源:1-自有资金,2-外部筹集,3-内部筹集,4-其他 示例：1 |
| repaymentType | string | 否 | 否 | 还款方式:average_capital-等额本金,average_interest-等额本息,custom-自定义,expire_once-到期一次,no_repayment-不还本,period_repayment-周期还本 示例：expire_once |
| holidayPrinciple | string | 否 | 否 | 节假日处理原则:advance-提前,delayed-延后,normal-正常 示例：normal |
| holidayInterestPrinciple | string | 否 | 否 | 节假日计息原则:advance-提前,delayed-延后,normal-正常 示例：normal |
| rateType | string | 否 | 是 | 利率类型(fixed-固定利率,float-浮动利率) 示例：fixed |
| baseRateType | string | 否 | 否 | 基准利率类型 示例：LPR利率 示例：LPR利率 |
| interestRateDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 利率日期 示例：2025-01-01 |
| baseRateTypeBusiness | string | 否 | 否 | 基准利率类型业务（loanbusiness-贷款，depositbusiness-存款） 示例：loanbusiness |
| settlementType | string | 否 | 否 | 结息方式:custom-自定义,expire_once-到期一次,no_interest-不计息,period-周期计息,principal_clear-利随本清,principal_clear_period-利随本清&周期计息,withhold_interest-预扣利息 示例：expire_once |
| protocolRate | string | 否 | 否 | 协议利率 示例：2 |
| appointRate | string | 否 | 否 | 利息约定汇率 示例：1 |
| interestAccid | string | 否 | 否 | 计息账户（账户编码或id） 示例：1665124091621277704 |
| useOverdue | string | 否 | 否 | 是否启用逾期:yes-是,no-否 示例：no |
| isPenalty | string | 否 | 否 | 是否计算罚息(yes-是,no-否) 示例：no |
| penaltyFloatPercent | string | 否 | 否 | 罚息上浮比例（%） 示例：10 |
| penaltyRate | string | 否 | 否 | 罚息利率（%） 示例：2.2 |
| isCompoundInterest | string | 否 | 否 | 是否计算复利(yes-是,no-否) 示例：no |
| compoundFloatPercent | string | 否 | 否 | 复利上浮比例（%） 示例：5 |
| compoundRate | string | 否 | 否 | 复利利率（%） 示例：2.1 |
| repaymentCycle | string | 否 | 否 | 还款周期:1-年,2-半年,3-季度,4-月 |
| firstRepaymentDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 首次还款日 示例：2025-02-01 |
| gracePeriod | string | 否 | 否 | 宽限期（单位：天） 示例：5 |
| monthAdjustDate | string | 否 | 否 | 月末日期调整（还本）：29日-29，30日-30，31日-31 示例：31 |
| settlementCycle | string | 否 | 否 | 结息周期:1-年,2-半年,3-季度,4-月 |
| firstPaymentDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 首次付息日 |
| normalInteresBase | string | 否 | 否 | 正常还本计息基数:financein_balance-借据余额,repayment_amount-还本金额 示例：financein_balance |
| monthInterestAdjustDate | string | 否 | 否 | 月末日期调整（付息）：29日-29，30日-30，31日-31 示例：31 |
| rateAdjustCycle | string | 否 | 否 | 利率调整周期（0:即时浮动,1:按月,2:季度,3:按半年,4:按年） |
| firstEffectDate | string | 否 | 否 | 利率首次生效日，YYYYMMDD |
| isInit | string | 否 | 否 | 是否初始化(true:是,false:-否) 示例：false |
| initHbDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 初始化还本日 |
| initHbAmountCapital | string | 否 | 否 | 初始化还本金额（本金币种） 示例：400 |
| initFxDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 初始化付息日 |
| initFxAmountInterest | string | 否 | 否 | 初始化付息金额（计息币种） 示例：100 |
| advancePrincipal | string | 否 | 否 | 是否预付本金,默认为否（true:是,false:否） 示例：false |
| code | string | 否 | 否 | 单据编号（可以不传，由系统生成） |
| renew | string | 否 | 否 | 是否续签（yes-是,no-否） 示例：no |
| relationPastProtocol | number |
| 小数位数:2,最大长度:28 | 否 | 否 | 关联原协议.ID |
| supplier | number |
| 小数位数:2,最大长度:36 | 否 | 否 | 供应商id |
| customer | string | 否 | 否 | 客户id |
| price | string | 否 | 否 | 单价 |
| num | string | 否 | 否 | 数量 |
| termType | string | 否 | 否 | 融资期限分类（0-短期,1-中期,2-长期） 示例：0 |
| incomeAccid | string | 否 | 否 | 收入账户（账户编码或id） 示例：1665124091621277704 |
| outlayAccid | string | 否 | 否 | 支出账户（账户编码或id） 示例：1665124091621277704 |
| interestDays | string | 否 | 否 | 计息天数(standard:标准-360,standard365:标准-365,reality:实际-365/366,reality360:实际-360,reality365:实际-365) 示例：reality |
| yearMonthDay | string | 否 | 否 | 年/月/日/利率(year:年,half_year:半年,month:月,day:日) 示例：year |
| baseRate | string | 否 | 否 | 基准利率 |
| bank | string | 否 | 否 | 贷款利率的银行类别 |
| floatType | string | 否 | 否 | 浮动方式（0-加减点,1-按比例） 示例：1 |
| floatValue | string | 否 | 否 | 浮动值 示例：10 |
| infuseCapitalCurrency | string | 否 | 否 | 融入本金币种（编码或名称） 示例：人民币 |
| infuseCapitalRate | string | 否 | 否 | 融入本金约定利率 示例：1 |
| financeInnateOriginAmount | string | 否 | 否 | 融入金额（本金币种） 示例：1000 |
| oldCurrency | string | 否 | 否 | 本币币种（编码或名称） 示例：人民币 |
| exchangeRateType | string | 否 | 否 | 融入本币币种汇率类型（编码或名称） 示例：基准汇率 |
| exchangeRate | string | 否 | 否 | 融入本币币种汇率 示例：1 |
| financeInnateLocalAmount | string | 否 | 否 | 融入金额（本币币种） 示例：1000 |
| infuseIncomeAccid | string | 否 | 否 | 融入收入账户（账户编码或id） 示例：1665124091621277704 |
| settledAddition | string | 否 | 否 | 已结算补单（是-yes；否-no） 示例：no |
| settlementStatus | string | 否 | 否 | 融入结算状态（0:待结算,2:结算成功） 示例：0 |
| settlementMethod | string | 否 | 否 | 结算方式（编码或名称） 示例：银行转账 |
| otherType | string | 否 | 否 | 对方类型（bank_consortium:银团,customer:客户,other:其他,supplier:供应商,TBOT0004:非银类金融机构,TBOT0005:银行,TBOT0006:结算中心,TBOT0007:资金组织,TBOT0009:财务公司） 示例：TBOT0005 |
| remarks | string | 否 | 否 | 备注 示例：填写备注：银行贷款业务 |
| collectedOriginAmount | string | 否 | 否 | 实际收款金额（本金币种） 示例：1000 |
| collectedLocalAmount | string | 否 | 否 | 实际收款金额（本币币种） 示例：1000 |
| fundBusinessObject | string | 否 | 否 | 融入对方银行账号（编码或名称） |
| otherName | string | 否 | 否 | 对方账户名称 |
| otherAccout | string | 否 | 否 | 对方银行账号 |
| otherNumber | string | 否 | 否 | 对方账户联行号 |
| otherBank | string | 否 | 否 | 对方账户开户行 |
| inSupplierBankAccount | string | 否 | 否 | 方账户名称id.ID |
| inCustomerBankAccount | string | 否 | 否 | 对方账户名称id.ID |
| trusteeType | string | 否 | 否 | 受托人机构类型（范围：TBOT0004-非银类金融机构, TBOT0005-银行, TBOT0006-结算中心, TBOT0007-资金组织, TBOT0009-财务公司） 示例：TBOT0005 |
| trustee | string | 否 | 否 | 受托人.ID |
| lendByTrustee | string | 否 | 否 | 是否通过受托人放款（1:是,0:否,默认为1） 示例：0 |
| payAccountType | string | 否 | 否 | 收支账户类型（bank-银行账户） 示例：bank |
| dealPrice | string | 否 | 否 | 交易单价 |
| purchaseDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 融入日期/申购日期 示例：2025-01-01 |
| withholdingCycle | string | 否 | 否 | 预提利息周期（1:年,2:半年,3:季度,4:月） |
| firstWithholdingDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 首次预提利息日 示例：2025-01-01 |
| withholdingInterestDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 预提起息日 示例：2025-01-01 |
| realRate | string | 否 | 否 | 实际利率（%） 示例：2 |
| interestAccOther | string | 否 | 否 | 计息账户（账户编码或id） 示例：1665124091621277704 |
| infuseType | string | 否 | 否 | 融入方式（ownpay-自主支付,truteepay-受托支付,hybridpay-混合支付,nopay-不实际支付） 示例：ownpay |
| trusteePayType | string | 否 | 否 | 受托支付类型(0-收入账户支付;1-银行直接支付) |
| ownPayAmountCapital | string | 否 | 否 | 自主支付金额（本金币种） 示例：1000 |
| trusteePayAmountCapital | string | 否 | 否 | 受托支付金额（本金币种） 示例：0 |
| ownPayAmountLocal | string | 否 | 否 | 自主支付金额（本币币种） 示例：1000 |
| trusteePayAmountLocal | string | 否 | 否 | 托支付金额（本币币种） 示例：0 |
| thirdBankAccount | string | 否 | 否 | 第三方银行账号 |
| thirdBankName | string | 否 | 否 | 第三方账户名称 |
| thirdBank | string | 否 | 否 | 第三方账户开户行 |
| settleInterestAmountOrigin | string | 否 | 否 | 付息金额（协议币种） |
| settleBeginDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 付息起息日 |
| settleEndDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 付息止息日 |
| settleInterestCurrency | string | 否 | 否 | 付息计息币种（编码或名称） |
| settleAppointRate | string | 否 | 否 | 付息利息约定汇率 示例：1 |
| settleInterestAmount | string | 否 | 否 | 付息金额（计息币种） |
| settleLocalCurrency | string | 否 | 否 | 付息本币币种（编码或名称） 示例：人民币 |
| settleErType | string | 否 | 否 | 付息本币币种汇率类型（编码或名称） 示例：基准汇率 |
| settleEr | string | 否 | 否 | 本币币种汇率 示例：1 |
| settleInterestAmountLocal | string | 否 | 否 | 付息金额（本币币种） |
| fxSettledAddition | string | 否 | 否 | 已结算补单（yes:是,no:否） 示例：no |
| settleJsStatus | string | 否 | 否 | 付息结算状态（0:待结算,2:结算成功） 示例：0 |
| settleJsMethod | string | 否 | 否 | 付息结算方式（编码或名称） 示例：银行转账 |
| settleOtherType | string | 否 | 否 | 付息结算对方类型（bank_consortium:银团,customer:客户,other:其他,supplier:供应商,TBOT0004:非银类金融机构,TBOT0005:银行,TBOT0006:结算中心,TBOT0007:资金组织,TBOT0009:财务公司） |
| settleLocalAccid | string | 否 | 否 | 付息本方账户（账户编码或id） 示例：1665124091621277704 |
| localAccOther | string | 否 | 否 | 本方银行账户 |
| settleOtherId | string | 否 | 否 | 付息对方资金业务对象银行信息参照（编码或名称） |
| settleSupplierBankAccount | string | 否 | 否 | 付息供应商银行账号（编码或名称） |
| settleCustomerBankAccount | string | 否 | 否 | 付息客户银行账号（编码或名称） |
| settleOtherName | string | 否 | 否 | 付息对方账户名称 |
| settleOtherAccout | string | 否 | 否 | 付息对方银行账号（编码或名称） |
| settleOtherBanktype | string | 否 | 否 | 付息对方账户银行类别 |
| settleOtherNumber | string | 否 | 否 | 付息对方账户联行号 |
| settleOtherBank | string | 否 | 否 | 付息对方账户开户行 |
| moreCurrency | string | 否 | 否 | 多币种贷款（yes-是,no-否） 示例：no |
| isAgreedRepayment | string | 否 | 否 | 是否约定还款计划（yes-是,no-否） 示例：no |
| allowLoan | string | 否 | 否 | 允许内部借贷（yes-是,no-否） 示例：yes |
| contractType | string | 否 | 否 | 担保方式（0-信用,1:抵押担保,2:质押担保,3:第三方保证担保,4:第三方抵押担保,5:第三方质押担保,6:保证担保,8:定金,9:留置） 示例：1,2,4 |
| debtAllotMethod | string | 否 | 否 | 借据分配方式（fifo:先进先出,percent:按比例分配） 示例：fifo |
| interestSettlementRule | string | 否 | 否 | 结息头尾规则（heads_not_tails:算头不算尾,heads_and_tails:算头算尾,heads_and_tails_repayment_included:算头算尾(还款日不扣本金)） 示例：heads_not_tails |
| includedExpirationDate | string | 否 | 否 | 是否含到期日（yes:是,no:否） 示例：no |
| settleInterestFirst | string | 否 | 否 | 是否先结息再付息（yes:是,no:否） |
| advanceDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 预付本金日期 |
| advanceAmountCapital | string | 否 | 否 | 预付本金（本金币种） |
| isSupportSettleCenter | string | 否 | 否 | 是否集成结算中心（yes:是,no:否） |
| scAmount | string | 否 | 否 | 对方银行账户（内部存款） |
| withholdingRule | string | 否 | 否 | 预提头尾规则（heads_and_tails:算头算尾,heads_not_tails:算头不算尾） 示例：heads_and_tails |
| reservationPrice | string | 否 | 否 | 留购价款 |
| financingRegisterCashFlow | object | 是 | 否 | 现金流集合 |
| code | string | 否 | 否 | 现金流ID |
| event | string | 否 | 否 | 事件类型（ZJ:增加本金，JS:减少本金,FX:付息,SX:收息） |
| flowType | string | 否 | 否 | 现金流项目 |
| relateCode | string | 否 | 否 | 关联现金流ID |
| planDate | string | 否 | 否 | 计划日期 |
| interestBeginDate | string | 否 | 否 | 起息日期 |
| termNumber | string | 否 | 否 | 期限数量 |
| termUnit | string | 否 | 否 | 期限类型(year-年,month-月,day-日) |
| term | string | 否 | 否 | 期限 |
| endDate | string | 否 | 否 | 结束日期 |
| protocolAmount | string | 否 | 否 | 协议币种金额 |
| dealCurrencyAmount | string | 否 | 否 | 交易金额 |
| executeStatus | string | 否 | 否 | 执行状态（0:未执行,1:已执行） |
| planScope | string | 否 | 否 | 计划内/外（in:计划内,out:计划外） |
| executeDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 执行日期（YYYYMMDD） |
| executeAmount | string | 否 | 否 | 执行金额 |
| isOverdue | string | 否 | 否 | 是否逾期（0:否,1:是） |
| isInit | string | 否 | 否 | 是否初始化（true:是,false:否） |
| relateCodeForShow | string | 否 | 否 | 展示关联现金流ID |
| financingRegisterCostFlow | object | 是 | 否 | 融资合同费用明细集合 |
| endDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 结束日期,YYYYMMDD |
| executeAmount | string | 否 | 否 | 执行金额 |
| term | string | 否 | 否 | 期限 |
| termNumber | string | 否 | 否 | 期限数量 |
| termUnit | string | 否 | 否 | 期限类型(year-年,month-月,day-日) |
| code | string | 否 | 否 | 现金流ID |
| flowType | string | 否 | 否 | 现金流项目 |
| planDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 计划日期,YYYYMMDD |
| costCurrency | string | 否 | 否 | 费用币种（币种或名称） |
| costAmount | string | 否 | 否 | 费用金额 |
| executeStatus | string | 否 | 否 | 执行状态（0:未执行,1:已执行） |
| planScope | string | 否 | 否 | 计划内/外（in:计划内,out:计划外） |
| executeDate | date |
| 格式:yyyy-MM-dd | 否 | 否 | 执行日期,YYYYMMDD |
| customer | string | 否 | 否 | 客户ID |
| customerBankAccount | string | 否 | 否 | 银行账号ID |
| feeItem | string | 否 | 否 | 付费项目ID |
| otherBankAccount | string | 否 | 否 | 资金对方银行账号.ID |
| otherType | string | 否 | 否 | 对方类型（bank_consortium:银团,customer:客户,other:其他,supplier:供应商,TBOT0004:非银类金融机构,TBOT0005:银行,TBOT0006:结算中心,TBOT0007:资金组织,TBOT0009:财务公司） |
| payeeType | string | 否 | 否 | 收款方类型(capital_business-资金业务对象；customer-客户；supplier-供应商) |
| payeeUnit | string | 否 | 否 | 收款方单位ID（伙伴档案id） |
| supplier | string | 否 | 否 | 供应商ID |
| supplierBankAccount | string | 否 | 否 | 供应商银行账户ID |
| costCode | string | 否 | 否 | 费用方案编号 |
| action | string | 否 | 否 | 动作(save:保存;submit-审批) 示例：save |

## 3. 请求示例

Url: /yonbip/ctm/financingRegister/open/createBill?access_token=访问令牌
Body: {
	"tran_seq_no_apply": "",
	"protocolNumber": "融资合同openapi测试",
	"accentity": "XX建投公司",
	"accentityRaw": "XX建投公司",
	"financialProduct": "银行贷款",
	"financingOrgType": "TBOT0005",
	"financingOrgForBank": "ZJDX250102000007",
	"protocolAmount": 1000,
	"protocolCurrency": "人民币",
	"capitalCurrency": "人民币",
	"interestCurrency": "人民币",
	"signDate": "2025-01-01",
	"beginDate": "2025-01-01",
	"expireDate": "2026-01-01",
	"termNumber": "1",
	"termUnit": "year",
	"capitalExchangeRate": "1",
	"fundPaymentType": "0",
	"balanceMethod": "once",
	"fpSyncDirection": "0",
	"fpcSyncDirection": "0",
	"riSyncDirection": "0",
	"piSyncDirection": "0",
	"settleDirection": "0",
	"redSyncDirection": "0",
	"frcSyncDirection": "0",
	"exSyncDirection": "0",
	"syncAccessory": "no",
	"periodHeadTail": "1",
	"capitalSource": "1",
	"repaymentType": "expire_once",
	"holidayPrinciple": "normal",
	"holidayInterestPrinciple": "normal",
	"rateType": "fixed",
	"baseRateType": "LPR利率",
	"interestRateDate": "2025-01-01",
	"baseRateTypeBusiness": "loanbusiness",
	"settlementType": "expire_once",
	"protocolRate": "2",
	"appointRate": "1",
	"interestAccid": "1665124091621277704",
	"useOverdue": "no",
	"isPenalty": "no",
	"penaltyFloatPercent": "10",
	"penaltyRate": "2.2",
	"isCompoundInterest": "no",
	"compoundFloatPercent": "5",
	"compoundRate": "2.1",
	"repaymentCycle": "",
	"firstRepaymentDate": "2025-02-01",
	"gracePeriod": "5",
	"monthAdjustDate": "31",
	"settlementCycle": "",
	"firstPaymentDate": "2026-06-07",
	"normalInteresBase": "financein_balance",
	"monthInterestAdjustDate": "31",
	"rateAdjustCycle": "",
	"firstEffectDate": "",
	"isInit": "false",
	"initHbDate": "2026-06-07",
	"initHbAmountCapital": "400",
	"initFxDate": "2026-06-07",
	"initFxAmountInterest": "100",
	"advancePrincipal": "false",
	"code": "",
	"renew": "no",
	"relationPastProtocol": 0,
	"supplier": 0,
	"customer": "",
	"price": "",
	"num": "",
	"termType": "0",
	"incomeAccid": "1665124091621277704",
	"outlayAccid": "1665124091621277704",
	"interestDays": "reality",
	"yearMonthDay": "year",
	"baseRate": "",
	"bank": "",
	"floatType": "1",
	"floatValue": "10",
	"infuseCapitalCurrency": "人民币",
	"infuseCapitalRate": "1",
	"financeInnateOriginAmount": "1000",
	"oldCurrency": "人民币",
	"exchangeRateType": "基准汇率",
	"exchangeRate": "1",
	"financeInnateLocalAmount": "1000",
	"infuseIncomeAccid": "1665124091621277704",
	"settledAddition": "no",
	"settlementStatus": "0",
	"settlementMethod": "银行转账",
	"otherType": "TBOT0005",
	"remarks": "填写备注：银行贷款业务",
	"collectedOriginAmount": "1000",
	"collectedLocalAmount": "1000",
	"fundBusinessObject": "",
	"otherName": "",
	"otherAccout": "",
	"otherNumber": "",
	"otherBank": "",
	"inSupplierBankAccount": "",
	"inCustomerBankAccount": "",
	"trusteeType": "TBOT0005",
	"trustee": "",
	"lendByTrustee": "0",
	"payAccountType": "bank",
	"dealPrice": "",
	"purchaseDate": "2025-01-01",
	"withholdingCycle": "",
	"firstWithholdingDate": "2025-01-01",
	"withholdingInterestDate": "2025-01-01",
	"realRate": "2",
	"interestAccOther": "1665124091621277704",
	"infuseType": "ownpay",
	"trusteePayType": "",
	"ownPayAmountCapital": "1000",
	"trusteePayAmountCapital": "0",
	"ownPayAmountLocal": "1000",
	"trusteePayAmountLocal": "0",
	"thirdBankAccount": "",
	"thirdBankName": "",
	"thirdBank": "",
	"settleInterestAmountOrigin": "",
	"settleBeginDate": "2026-06-07",
	"settleEndDate": "2026-06-07",
	"settleInterestCurrency": "",
	"settleAppointRate": "1",
	"settleInterestAmount": "",
	"settleLocalCurrency": "人民币",
	"settleErType": "基准汇率",
	"settleEr": "1",
	"settleInterestAmountLocal": "",
	"fxSettledAddition": "no",
	"settleJsStatus": "0",
	"settleJsMethod": "银行转账",
	"settleOtherType": "",
	"settleLocalAccid": "1665124091621277704",
	"localAccOther": "",
	"settleOtherId": "",
	"settleSupplierBankAccount": "",
	"settleCustomerBankAccount": "",
	"settleOtherName": "",
	"settleOtherAccout": "",
	"settleOtherBanktype": "",
	"settleOtherNumber": "",
	"settleOtherBank": "",
	"moreCurrency": "no",
	"isAgreedRepayment": "no",
	"allowLoan": "yes",
	"contractType": "1,2,4",
	"debtAllotMethod": "fifo",
	"interestSettlementRule": "heads_not_tails",
	"includedExpirationDate": "no",
	"settleInterestFirst": "",
	"advanceDate": "2026-06-07",
	"advanceAmountCapital": "",
	"isSupportSettleCenter": "",
	"scAmount": "",
	"withholdingRule": "heads_and_tails",
	"reservationPrice": "",
	"financingRegisterCashFlow": [
		{
			"code": "",
			"event": "",
			"flowType": "",
			"relateCode": "",
			"planDate": "",
			"interestBeginDate": "",
			"termNumber": "",
			"termUnit": "",
			"term": "",
			"endDate": "",
			"protocolAmount": "",
			"dealCurrencyAmount": "",
			"executeStatus": "",
			"planScope": "",
			"executeDate": "2026-06-07",
			"executeAmount": "",
			"isOverdue": "",
			"isInit": "",
			"relateCodeForShow": ""
		}
	],
	"financingRegisterCostFlow": [
		{
			"endDate": "2026-06-07",
			"executeAmount": "",
			"term": "",
			"termNumber": "",
			"termUnit": "",
			"code": "",
			"flowType": "",
			"planDate": "2026-06-07",
			"costCurrency": "",
			"costAmount": "",
			"executeStatus": "",
			"planScope": "",
			"executeDate": "2026-06-07",
			"customer": "",
			"customerBankAccount": "",
			"feeItem": "",
			"otherBankAccount": "",
			"otherType": "",
			"payeeType": "",
			"payeeUnit": "",
			"supplier": "",
			"supplierBankAccount": "",
			"costCode": ""
		}
	],
	"action": "save"
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
| data | object | 否 | data |
| code | string | 否 | 单据编码 示例：RZ2511040005 |
| id | string | 否 | 单据ID 示例：2342342342324 |
| code | number |
| 小数位数:0,最大长度:10 | 否 | code 示例：200 |
| message | string | 否 | message 示例：成功 |
| timestamp | string | 否 | timestamp 示例：1727601954618 |

## 5. 正确返回示例

{
	"data": {
		"code": "RZ2511040005",
		"id": "2342342342324"
	},
	"code": 200,
	"message": "成功",
	"timestamp": "1727601954618"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

暂时没有数据哦~


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-09

更新

请求说明

新增

请求参数 action

更新

请求参数 (203)

删除

请求参数 (13)

新增

返回参数 id

更新

返回参数 data

更新

返回参数 code

删除

返回参数 statusMsg

增加action参数

2	2025-09-09

新增

请求参数 settledAddition

新增

请求参数 fxSettledAddition

更新

请求参数 settlementStatus

更新

请求参数 settleJsStatus


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

