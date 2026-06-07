---
title: "支付保证金业务台账新增"
apiId: "2122377141993078793"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Pay Security Deposit"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Pay Security Deposit]
platform_version: "BIP"
source_type: community-api-docs
---

# 支付保证金业务台账新增

>  请求方式	POST | Pay Security Deposit (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ctm/paymargin/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
accentity_code	string	否	是	资金组织，资金组织id，或资金组织编码code 示例：pkm00
code	string	否	否	单据编号(以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输) 示例：MDPT20241029000165
vouchdate	string	否	是	单据日期 示例：2024-10-29
tradetype_code	string	否	是	交易类型编码 1、cmp_paymargin_payment 支付保证金 2、cmp_paymargin_withdraw 取回保证金 示例：cmp_paymargin_payment
marginbusinessno	string	否	是	保证金原始业务号：外部系统原始业务号 作为保证金业务层面的重要统计维度； 示例：MDPT20241029000165
margintype_code	string	否	否	保证金类型：保证金模块自定义的保证金类型； 保证金类型编码 示例：MDTP000003
currency_code	string	否	是	币种：币种id，或币种编码 示例：CNY
project_code	string	否	否	项目：项目id，或项目编码 项目档案是在系统中自定义创建的数据 示例：00000000123
dept_code	string	否	否	部门：部门id,或部门编码 示例：Nicole Test Company
expectedretrievaldate	string	否	否	预计取回日期：保证金预计取回日期 示例：2024-10-31
exchangeratetype_code	string	否	否	汇率类型：平台汇率类型编码 示例：01
srcbillno	string	否	是	来源业务单据编号
description	string	否	否	备注，可以上送保证金说明信息 示例：AAAAAA
oppositetype	number
小数位数:0,最大长度:10	否	是	对方类型，枚举：客户、供应商、资金业务对象、内部单位、其他 编号开发看下 1 客户 2 供应商 3 其他 4 内部单位 5 资金业务伙伴 同名账户划转类型的保证金，对方类型需要上送内部单位，内部单位代表租户内单位，包含其他成员单位和单位本身 示例：3
marginamount	number
小数位数:2,最大长度:10	否	是	保证金金额，交易类型为：支付保证金时，传入支付金额 交易类型为：取回保证金时，传入取回金额 示例：12
settleflag	number
小数位数:0,最大长度:5	否	是	是否结算，枚举：1-是 0-否 示例：1
paymenttype	number
小数位数:0,最大长度:5	否	否	收付类型，1.当是否结算为否时，非必填； 2.当是否结算为是时，必填，枚举值为1-付款/0-收款 交易类型为：支付保证金时，传入付款 交易类型为：取回保证金时，若取回时是同名账户之间的划转，则上送付款，非同名账户之间的划转，则上送收款即可！ 示例：1
settlemode_code	string	否	否	结算方式，是否结算字段为否时，非必填 是否结算字段为是时，必填； 传入业务属性为银行业务的结算方式编码 结算方式是系统中自定义创建的档案； 示例：1525649083156923163
settlestatus	number
小数位数:0,最大长度:10	否	否	结算状态，是否结算字段为否时，非必填 是否结算字段为是时，必填； 枚举：1-待结算、7-已结算补单 示例：7
enterprisebankaccount_code	string	否	否	本方银行账户，是否结算字段为否时，非必填 是否结算字段为是时，必填； 银行账号ID，或银行账号编码，或银行账号 示例: 4000021119201298365 示例：001110110
paymentsettlemode	number
小数位数:0,最大长度:10	否	否	付款结算方式，枚举：0-主动结算、1-被动扣款 示例：0
targetId	string	否	否	对方档案ID，是否结算字段为否时，非必填 是否结算字段为是时，必填； 对方类型为客户、供应商、资金业务对象、内部单位，上送对应类型的档案id或code；对方类型为内部单位时，上送会计主体档案id或code 示例：1460N0000000080120241010
targetbankaccount	string	否	否	对方银行账号ID:如果对方类型为客户、供应商、资金业务对象、内部单位，上送对应类型档案的银行账号档案id或银行账号编码或银行账号； 对方类型为内部单位时，对方银行信息id为企业银行账户档案id或银行账号编码或银行账号； 示例：88888888889
oppositename	string	否	否	对方名称，仅对方类型为其他时，必填 示例：testAAAA
oppositebankaccountname	string	否	否	对方银行账户名称，对方类型为其他时，录入对方账户名称，非必填 示例：testAAAA
oppositebankaccount	string	否	否	对方银行账号，对方类型为其他时，录入对方银行账号，非必填 示例：testAAAA
oppositebankNumber_code	string	否	否	对方开户网点，对方类型为其他时，录入银行网点ID,或银行网点编码，或联行号 示例：1526316125917807070
oppositebankType_code	string	否	否	对方银行类别，对方类型为其他时，录入银行网点ID,银行类别ID或银行类别编码 示例：01
netIdentificateCode	string	否	否	轧差识别码，当传入的保证金单据需要与其他收支单据轧差时，录入与其他收支单据相同的轧差码；非必填
netSettleCount	number
小数位数:0,最大长度:10	否	否	轧差结算总笔数，轧差识别码有值时，必填
afterNetAmt	number
小数位数:2,最大长度:10	否	否	轧差后金额，轧差识别码有值时，必填
afterNetDir	number
小数位数:0,最大长度:10	否	否	轧差后收付方向，轧差识别码有值时，必填 枚举：0-收款，1-付款
conversionmarginflag	number
小数位数:0,最大长度:5	否	否	转换保证金，枚举：1-是，0-否 交易类型为取回保证金时，可传值， 当取回保证金需要进行转换处理时（如投标保证金转履约保证金），可传入此字段
conversionamount	number
小数位数:2,最大长度:10	否	否	转换金额，转换保证金为是时，必填
newmarginbusinessno	string	否	否	新保证金原始业务号，转换保证金为是时，必填 传入新转换的外部系统原始业务号；
newmargintype_code	string	否	否	新保证金类型，保证金模块自定义的保证金类型；非必填 保证金类型编码 示例：MDTP000001
newproject_code	string	否	否	新项目，项目id，或项目编码 项目档案是在系统中自定义创建的数据 示例：00000000123
newdept_code	string	否	否	新部门，部门id,或部门编码
newexpectedretrievaldate	string	否	否	新预计取回日期，转换新的保证金预计取回日期 示例: 2023-04-20

## 3. 请求示例

Url: /yonbip/ctm/paymargin/save?access_token=访问令牌
Body: {
	"accentity_code": "pkm00",
	"code": "MDPT20241029000165",
	"vouchdate": "2024-10-29",
	"tradetype_code": "cmp_paymargin_payment",
	"marginbusinessno": "MDPT20241029000165",
	"margintype_code": "MDTP000003",
	"currency_code": "CNY",
	"project_code": "00000000123",
	"dept_code": "Nicole Test Company",
	"expectedretrievaldate": "2024-10-31",
	"exchangeratetype_code": "01",
	"srcbillno": "",
	"description": "AAAAAA",
	"oppositetype": 3,
	"marginamount": 12,
	"settleflag": 1,
	"paymenttype": 1,
	"settlemode_code": "1525649083156923163",
	"settlestatus": 7,
	"enterprisebankaccount_code": "001110110",
	"paymentsettlemode": 0,
	"targetId": "1460N0000000080120241010",
	"targetbankaccount": "88888888889",
	"oppositename": "testAAAA",
	"oppositebankaccountname": "testAAAA",
	"oppositebankaccount": "testAAAA",
	"oppositebankNumber_code": "1526316125917807070",
	"oppositebankType_code": "01",
	"netIdentificateCode": "",
	"netSettleCount": 0,
	"afterNetAmt": 0,
	"afterNetDir": 0,
	"conversionmarginflag": 0,
	"conversionamount": 0,
	"newmarginbusinessno": "",
	"newmargintype_code": "",
	"newproject_code": "00000000123",
	"newdept_code": "",
	"newexpectedretrievaldate": ""
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
code	string	是	返回码，调用成功200
message	string	是	返回信息
data	object	是	返回数据
id	string	是	单据主键ID
code	string	是	单据编号
marginvirtualaccount	string	是	保证金虚拟户

## 5. 正确返回示例

{
	"code": [
		""
	],
	"message": [
		""
	],
	"data": [
		{
			"id": [
				""
			],
			"code": [
				""
			],
			"marginvirtualaccount": [
				""
			]
		}
	]
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

