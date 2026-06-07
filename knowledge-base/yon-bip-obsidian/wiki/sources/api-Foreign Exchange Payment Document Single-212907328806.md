---
title: "外汇付款单单个保存"
apiId: "2129073288063221765"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "FX Payment"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, FX Payment]
platform_version: "BIP"
source_type: community-api-docs
---

# 外汇付款单单个保存

>  请求方式	POST | FX Payment (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ctm/foreignpayment/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	外汇付款单信息
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	否	外汇付款单ID 新增时无需填写，修改时必填 示例：2670440860701696
accentity	string	否	是	资金组织ID,或资金组织code 示例：快乐柠檬
accentityRaw	string	否	否	核算会计主体ID,或核算会计主体code
code	string	否	否	单据编号,自动编码时不必填，手动编码时必填 示例：MDPT20240806000038
vouchdate	string	否	是	单据日期 示例：2021-05-06
tradetype_code	string	否	是	交易类型code 示例：cmp_foreign_payment
settlestatus	number
小数位数:0,最大长度:2	否	是	结算状态（1：待结算，7：已结算补单）
iscrossborder	number
小数位数:0,最大长度:1	否	是	是否跨境（0：否，1：是）
isurgent	number
小数位数:0,最大长度:1	否	否	是否加急（0：否，1：是）
currency	string	否	是	原币币种id，或原币币种code 示例：1867797130226171944
amount	number
小数位数:5,最大长度:20	否	是	原币金额
expectedsettlementdate	string	否	否	期望结算日期 示例：2021-05-06
settlemode_code	string	否	是	结算方式ID或者结算方式编码
paymenterprisebankaccount	string	否	是	付款方银行账户ID或编码
payernamenocn	string	否	否	付款方名称（非中文）
accountcurrency	string	否	是	账户币种id，或账户币种code 示例：1867797130226171944
paycountry	string	否	是	付款方常驻国家地区ID或编码 示例：CN
address	string	否	否	汇款人地址
foreignpaymenttype	number
小数位数:0,最大长度:1	否	是	外汇支付方式（1：现汇支付，2：购汇支付，3：其他支付）
postscript	string	否	是	汇款附言
description	string	否	否	备注 示例：采购工程款
publicorprivate	number
小数位数:0,最大长度:1	否	是	对公/对私（1：对私，2：对公）
receivetype	number
小数位数:0,最大长度:2	否	是	收款方类型（1：客户，2：供应商，3：员工，4：其他，5：资金业务对象，6：内部单位）
receivenameid	string	否	是	收款方名称ID或者编码
receivebankaccountid	string	否	是	收款方账号ID或者编码
othername	string	否	否	其他名称
otherbankaccount	string	否	否	其他账号
otherbankaccountname	string	否	否	其他账户名称
receivenameother	string	否	否	收款方非中文名称
receivecountry	string	否	是	收款方常驻国家地区ID或编码
receiveaddress	string	否	否	收款方地址
isagencybank	number
小数位数:0,最大长度:1	否	是	是否通过代理行（0：否，1：是）
agencybankaccount	string	否	否	收款方开户行在其代理行账号
agencybankname	string	否	否	代理行名称
agencybankaddress	string	否	否	代理行地址
agencybankswift	string	否	否	代理行SWIFT
receivebankaddr	string	否	否	收款方开户行名称.ID
receivebanktype	string	否	否	收款方银行类别.ID或者编码
receivebankaddress	string	否	否	收款方开户行地址
isfullpayment	number
小数位数:0,最大长度:1	否	否	全额到账
paymentaccount	string	否	否	费用支付账号ID或编码
foreignpaymentaccount	string	否	否	费用支付账号(外币)ID或编码
transactioncodeA_code	string	否	是	交易编码A,ID或者编码
transactionamountA	number
小数位数:5,最大长度:20	否	是	交易金额A
tradepostscriptA	string	否	是	交易附言A
transactioncodeB_code	string	否	否	交易编码B，ID或者编码
tradepostscriptB	string	否	否	交易附言B 示例：3600
fundpurpose	string	否	否	资金用途
fundtype	string	否	否	付款类型（预付货款:A,货到付款:P,退款:R,信贷资金支付:O,非信贷资金支付:S,其他:T）
declarationnumber	string	否	否	原申报号
applicantname	string	否	否	填报人姓名
applicantphonenumber	string	否	否	填报人电话
org	string	否	否	业务组织ID,或业务组织code 示例：快乐柠檬
expenseitem_code	string	否	否	费用项目ID,或费用项目code
quickType_code	string	否	否	款项类型.ID或款项类型code 示例：快乐柠檬
project	string	否	否	项目ID或者项目编码 示例：Zp002
dept	string	否	否	部门.ID 示例：快乐柠檬
currencyexchangeratetype	string	否	否	折本币汇率类型汇率类型id或编码
swapOutExchangeRateType	string	否	是	换出汇率类型编码
receivebankswift	string	否	否	收款方开户行SWIFT 示例：当是否直联=是时，该字段必输 当是否直联=否时，该字段非必输
bankflag	number
小数位数:0,最大长度:2	否	是	是否跨行（1：本地本行，2：异地本行，3：本地他行，4：异地他行，5：国外他行，6：国外本行）
profitcenter	string	否	否	利润中心ID或编码
receivevalidate	number
小数位数:0,最大长度:1	否	否	收款方校验条件
_status	string	否	是	操作标识, Insert:新增、 Update:更新 示例：Insert

## 3. 请求示例

Url: /yonbip/ctm/foreignpayment/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "2670440860701696",
		"accentity": "快乐柠檬",
		"accentityRaw": "",
		"code": "MDPT20240806000038",
		"vouchdate": "2021-05-06",
		"tradetype_code": "cmp_foreign_payment",
		"settlestatus": 0,
		"iscrossborder": 0,
		"isurgent": 0,
		"currency": "1867797130226171944",
		"amount": 0,
		"expectedsettlementdate": "2021-05-06",
		"settlemode_code": "",
		"paymenterprisebankaccount": "",
		"payernamenocn": "",
		"accountcurrency": "1867797130226171944",
		"paycountry": "CN",
		"address": "",
		"foreignpaymenttype": 0,
		"postscript": "",
		"description": "采购工程款",
		"publicorprivate": 0,
		"receivetype": 0,
		"receivenameid": "",
		"receivebankaccountid": "",
		"othername": "",
		"otherbankaccount": "",
		"otherbankaccountname": "",
		"receivenameother": "",
		"receivecountry": "",
		"receiveaddress": "",
		"isagencybank": 0,
		"agencybankaccount": "",
		"agencybankname": "",
		"agencybankaddress": "",
		"agencybankswift": "",
		"receivebankaddr": "",
		"receivebanktype": "",
		"receivebankaddress": "",
		"isfullpayment": 0,
		"paymentaccount": "",
		"foreignpaymentaccount": "",
		"transactioncodeA_code": "",
		"transactionamountA": 0,
		"tradepostscriptA": "",
		"transactioncodeB_code": "",
		"tradepostscriptB": "3600",
		"fundpurpose": "",
		"fundtype": "",
		"declarationnumber": "",
		"applicantname": "",
		"applicantphonenumber": "",
		"org": "快乐柠檬",
		"expenseitem_code": "",
		"quickType_code": "快乐柠檬",
		"project": "Zp002",
		"dept": "快乐柠檬",
		"currencyexchangeratetype": "",
		"swapOutExchangeRateType": "",
		"receivebankswift": "当是否直联=是时，该字段必输 当是否直联=否时，该字段非必输",
		"bankflag": 0,
		"profitcenter": "",
		"receivevalidate": 0,
		"_status": "Insert"
	}
}

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
message	string	否	返回信息 示例：操作成功
data	object	否	外汇付款单信息
id	string	否	外汇付款单ID 新增时无需填写，修改时必填 示例：2670440860701696
accentity	string	否	资金组织ID,或资金组织code 示例：快乐柠檬
accentityRaw	string	否	核算会计主体ID,或核算会计主体code
expenseitem	string	否	费用项目ID,或费用项目code
code	string	否	单据编号,自动编码时不必填，手动编码时必填 示例：MDPT20240806000038
applicantname	string	否	填报人姓名
applicantphonenumber	string	否	填报人电话
tradetype	string	否	交易类型code 示例：cmp_foreign_payment
isWfControlled	string	否	是否审批流控制 示例：true
description	string	否	备注 示例：采购工程款
project	string	否	项目ID或者项目编码 示例：Zp002
swapOutExchangeRateType	string	否	换出汇率类型编码
settlemode	string	否	结算方式ID或者结算方式编码
paymenterprisebankaccount	string	否	付款方银行账户ID或编码
paymentaccount	string	否	费用支付账号ID或编码
foreignpaymentaccount	string	否	费用支付账号(外币)ID或编码
transactioncodeA	string	否	交易编码A编码
transactioncodeB	string	否	交易编码B编码
tradepostscriptB	string	否	交易附言B 示例：3600
receivecountry	string	否	收款方常驻国家地区ID或编码
receivebankaccount	string	否	收款方账号ID或者编码
tradepostscriptA	string	否	交易附言A
otherbankaccountname	string	否	其他账户名称
receiveaddress	string	否	收款方地址
receivebankaddress	string	否	收款方开户行地址
receivebankswift	string	否	收款方开户行SWIFT
costbearers	string	否	国内外费用承担方（OUR：汇款人，BEN：收款人，SHA：共同承担） 示例：OUR 默认值：OUR
costcenter	string	否	成本中心.ID或者成本中心.code
contractnumber	string	否	合同号
invoicenumber	string	否	发票号
filingnumber	string	否	外汇局批件号/备案表号/业务编号
paymentnature	string	否	付款性质（A：A-保税区，B：B-出口加工区，C：C-钻石交易所，D：D-其他特殊经济区域，E：E-深加工结转，F：F-经常项目贸易，G：G-经常项目非贸易，H：H-资本项目，I：I-代理进口，J：J-其他，K：K-保税监管区域，L：L-离岸账户） 示例：J 默认值：J
paymentsettlemode	string	否	付款结算模式（0：主动结算，1：被动扣款）
entrytype	string	否	入账类型（1：正常入账，2：挂账，3：冲挂账）
agencybankaccount	string	否	收款方开户行在其代理行账号
agencybankname	string	否	代理行名称
agencybankaddress	string	否	代理行地址
agencybankswift	string	否	代理行SWIFT
receivebankaddr	string	否	收款方开户行名称.ID
receivebanktype	string	否	收款方银行类别.ID或者编码
org	string	否	业务组织ID,或业务组织code 示例：快乐柠檬
quickType	string	否	款项类型.ID或款项类型code 示例：快乐柠檬
dept	string	否	部门.ID 示例：快乐柠檬
declarationnumber	string	否	原申报号
payernamenocn	string	否	付款方名称（非中文）
receivename	string	否	收款方名称ID或者编码
receivenameother	string	否	收款方非中文名称
accountcurrency	string	否	账户币种id，或账户币种code 示例：1867797130226171944
currency	string	否	原币币种id，或原币币种code 示例：1867797130226171944
paycountry	string	否	付款方常驻国家地区ID或编码 示例：CN
profitcenter	string	否	利润中心ID或编码
address	string	否	汇款人地址
fundpurpose	string	否	资金用途
postscript	string	否	汇款附言
creator	string	否	创建人 示例：lqy
modifier	string	否	修改人 示例：lqy
auditor	string	否	审批人 示例：lqy
vouchdate	string	否	单据日期 示例：2021-05-06
expectedsettlementdate	string	否	期望结算日期 示例：2021-05-06
isurgent	number
小数位数:0,最大长度:1	否	是否直联（0：否，1：是）
fundtype	number
小数位数:0,最大长度:1	否	付款类型（0：否，1：是）
foreignpaymenttype	number
小数位数:0,最大长度:1	否	外汇支付方式（1：现汇支付，2：购汇支付，3：其他支付）

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "2670440860701696",
		"accentity": "快乐柠檬",
		"accentityRaw": "",
		"expenseitem": "",
		"code": "MDPT20240806000038",
		"applicantname": "",
		"applicantphonenumber": "",
		"tradetype": "cmp_foreign_payment",
		"isWfControlled": "true",
		"description": "采购工程款",
		"project": "Zp002",
		"swapOutExchangeRateType": "",
		"settlemode": "",
		"paymenterprisebankaccount": "",
		"paymentaccount": "",
		"foreignpaymentaccount": "",
		"transactioncodeA": "",
		"transactioncodeB": "",
		"tradepostscriptB": "3600",
		"receivecountry": "",
		"receivebankaccount": "",
		"tradepostscriptA": "",
		"otherbankaccountname": "",
		"receiveaddress": "",
		"receivebankaddress": "",
		"receivebankswift": "",
		"costbearers": "OUR",
		"costcenter": "",
		"contractnumber": "",
		"invoicenumber": "",
		"filingnumber": "",
		"paymentnature": "J",
		"paymentsettlemode": "",
		"entrytype": "",
		"agencybankaccount": "",
		"agencybankname": "",
		"agencybankaddress": "",
		"agencybankswift": "",
		"receivebankaddr": "",
		"receivebanktype": "",
		"org": "快乐柠檬",
		"quickType": "快乐柠檬",
		"dept": "快乐柠檬",
		"declarationnumber": "",
		"payernamenocn": "",
		"receivename": "",
		"receivenameother": "",
		"accountcurrency": "1867797130226171944",
		"currency": "1867797130226171944",
		"paycountry": "CN",
		"profitcenter": "",
		"address": "",
		"fundpurpose": "",
		"postscript": "",
		"creator": "lqy",
		"modifier": "lqy",
		"auditor": "lqy"
	},
	"vouchdate": "2021-05-06",
	"expectedsettlementdate": "2021-05-06",
	"isurgent": 0,
	"fundtype": 0,
	"foreignpaymenttype": 0
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	原币金额不能等于0！	参照返回信息修改请求数据

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

