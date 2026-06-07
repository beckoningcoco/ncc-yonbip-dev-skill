---
title: "外汇付款单详情查询"
apiId: "2131084372118339592"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "FX Payment"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, FX Payment]
platform_version: "BIP"
source_type: community-api-docs
---

# 外汇付款单详情查询

>  请求方式	GET | FX Payment (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ctm/foreignpayment/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
code	string	query	否	单据编码code（单据id或单据编码不能同时传递）    示例: FDP20220507000869
id	number
小数位数:0,最大长度:20	query	否	外汇付款单id（单据id或单据编码不能同时传递）    示例: 2763855623180544

## 3. 请求示例

Url: /yonbip/ctm/foreignpayment/detail?access_token=访问令牌&code=FDP20220507000869&id=2763855623180544

## 4. 返回值参数

名称	类型	数组	描述
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
creator	string	否	创建人
displayCode	string	否	异常码
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
salesOrgId	string	否	销售组织id
saleDepartmentId	string	否	销售部门id
transactionTypeId	string	否	交易类型id
settlementOrgId	string	否	开票组织id
bizId	string	否	商家id
createDate	string	否	创建时间
synSourceOrg	string	否	协同来源组织id
ecsuiteuser	string	否	气泡联系人
ecsuiteuser	string	否	气泡联系人
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	返回的数据
accentity	string	否	资金组织id
accentity_name	string	否	资金组织名称
accentityRaw	string	否	会计主体id
accentityRaw_name	string	否	会计主体名称
accountcurrency	string	否	账户币种id
accountcurrency_name	string	否	账户币种名称
agencybankaccount	string	否	收款方开户行在其代理行账号
agencybankaddress	string	否	代理行地址
agencybankname	string	否	代理行名称
agencybankswift	string	否	代理行SWIFT
amount	number
小数位数:5,最大长度:20	否	原币金额
applicantname	string	否	填报人姓名
applicantphonenumber	string	否	填报人电话
bankflag	number
小数位数:0,最大长度:2	否	是否跨行
billtype	string	否	单据类型
code	string	否	单据编号
costbearers	string	否	国内外费用承担方
currency	string	否	原币币种id
currency_name	string	否	原币币种名称
currencyamount	number
小数位数:5,最大长度:20	否	折本币金额
currencyexchRate	string	否	折本币汇率
filingnumber	string	否	外汇局批件号/备案表号/业务编号
foreignpaymentaccount	string	否	费用支付账号(外币)id
foreignpaymentaccount_account	string	否	费用支付账号(外币)账号
foreignpaymenttype	number
小数位数:0,最大长度:1	否	外汇支付方式
fundpurpose	string	否	资金用途
fundtype	number
小数位数:0,最大长度:1	否	付款类型
iscrossborder	number
小数位数:0,最大长度:2	否	是否跨境
isurgent	number
小数位数:0,最大长度:2	否	是否加急
natCurrency	string	否	本币币种id
natCurrency_name	string	否	本币币种名称
paycountry_code	string	否	付款方常驻国家地区编码
paycountry_name	string	否	付款方常驻国家地区名称
paymentaccount	string	否	费用支付账号id
paymentaccount_account	string	否	费用支付账号
paymenterprisebankaccount	string	否	付款方银行账户id
paymenterprisebankaccount_account	string	否	付款方银行账户
paymenterprisebankaccount_name	string	否	付款方银行账户名称
paymentnature	string	否	付款性质
paymentsettlemode	string	否	付款结算模式
postscript	string	否	汇款附言
publicorprivate	number
小数位数:0,最大长度:2	否	对公/对私
quickType	string	否	款项类型
receivebankswift	string	否	收款方开户行swift
receivebanktype	string	否	收款方银行类别id
receivebanktype_name	string	否	收款方银行类别
receivecountry_code	string	否	收款方常驻国家地区编码
receivecountry_name	string	否	收款方常驻国家地区
receivenameid	string	否	名称id
receivetype	number
小数位数:0,最大长度:1	否	收款方类型
settleAmount	string	否	实际结算金额
settleExchangeRate	string	否	实际结算汇率
settleaccount	string	否	实际结算账号
settleerrorSum	string	否	结算止付金额
settlemode	string	否	结算方式id
settlemode_name	string	否	结算方式名称
settlestatus	number
小数位数:0,最大长度:2	否	结算状态
settlesuccessSum	number
小数位数:5,最大长度:20	否	结算成功金额
settlesuccesstime	string	否	结算成功时间
swapOutAmountEstimate	number
小数位数:5,最大长度:20	否	换出金额预估
swapOutExchangeRateEstimate	string	否	换出汇率预估
tradepostscriptA	string	否	交易附言A
tradepostscriptB	string	否	交易附言B
tradetype	string	否	交易类型id
tradetype_name	string	否	交易类型名称
transactionamountA	number
小数位数:5,最大长度:20	否	交易金额A
transactionamountB	number
小数位数:5,最大长度:20	否	交易金额B
transactioncodeA	string	否	交易编码Aid
transactioncodeB	string	否	交易编码Bid
transactioncodeA_trade_code	string	否	交易编码A
transactioncodeB_trade_code	string	否	交易编码B
transactioncurrencyA	string	否	交易币种Aid
transactioncurrencyB	string	否	交易币种Bid
transactioncurrencyA_name	string	否	交易币种A
transactioncurrencyB_name	string	否	交易币种B
verifystate	string	否	单据状态
vouchdate	string	否	单据日期
voucherstatus	number
小数位数:0,最大长度:2	否	凭证状态
receiveBankAccount	string	否	银行账号id
receivename	string	否	名称
receivebankaccount_name	string	否	账户名称
receiveBankAccount_account	string	否	银行账号

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"accentity": "",
		"accentity_name": "",
		"accentityRaw": "",
		"accentityRaw_name": "",
		"accountcurrency": "",
		"accountcurrency_name": "",
		"agencybankaccount": "",
		"agencybankaddress": "",
		"agencybankname": "",
		"agencybankswift": "",
		"amount": 0,
		"applicantname": "",
		"applicantphonenumber": "",
		"bankflag": 0,
		"billtype": "",
		"code": "",
		"costbearers": "",
		"currency": "",
		"currency_name": "",
		"currencyamount": 0,
		"currencyexchRate": "",
		"filingnumber": "",
		"foreignpaymentaccount": "",
		"foreignpaymentaccount_account": "",
		"foreignpaymenttype": 0,
		"fundpurpose": "",
		"fundtype": 0,
		"iscrossborder": 0,
		"isurgent": 0,
		"natCurrency": "",
		"natCurrency_name": "",
		"paycountry_code": "",
		"paycountry_name": "",
		"paymentaccount": "",
		"paymentaccount_account": "",
		"paymenterprisebankaccount": "",
		"paymenterprisebankaccount_account": "",
		"paymenterprisebankaccount_name": "",
		"paymentnature": "",
		"paymentsettlemode": "",
		"postscript": "",
		"publicorprivate": 0,
		"quickType": "",
		"receivebankswift": "",
		"receivebanktype": "",
		"receivebanktype_name": "",
		"receivecountry_code": "",
		"receivecountry_name": "",
		"receivenameid": "",
		"receivetype": 0,
		"settleAmount": "",
		"settleExchangeRate": "",
		"settleaccount": "",
		"settleerrorSum": "",
		"settlemode": "",
		"settlemode_name": "",
		"settlestatus": 0,
		"settlesuccessSum": 0,
		"settlesuccesstime": "",
		"swapOutAmountEstimate": 0,
		"swapOutExchangeRateEstimate": "",
		"tradepostscriptA": "",
		"tradepostscriptB": "",
		"tradetype": "",
		"tradetype_name": "",
		"transactionamountA": 0,
		"transactionamountB": 0,
		"transactioncodeA": "",
		"transactioncodeB": "",
		"transactioncodeA_trade_code": "",
		"transactioncodeB_trade_code": "",
		"transactioncurrencyA": "",
		"transactioncurrencyB": "",
		"transactioncurrencyA_name": "",
		"transactioncurrencyB_name": "",
		"verifystate": "",
		"vouchdate": "",
		"voucherstatus": 0,
		"receiveBankAccount": "",
		"receivename": "",
		"receivebankaccount_name": "",
		"receiveBankAccount_account": ""
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

