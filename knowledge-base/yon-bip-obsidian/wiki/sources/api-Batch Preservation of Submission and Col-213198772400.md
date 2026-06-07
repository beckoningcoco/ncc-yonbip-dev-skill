---
title: "交单收款批量保存"
apiId: "2131987724002394114"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Document Presentation Collection"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Document Presentation Collection]
platform_version: "BIP"
source_type: community-api-docs
---

# 交单收款批量保存

>  请求方式	POST | Document Presentation Collection (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ctm/receiptregOpenApi/saveData
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
accentity	string	否	是	组织机构编码
status	string	否	是	审核状态：0已保存
receiptregs	object	是	是	交单收款列表
number	number
小数位数:0,最大长度:18	否	是	流水号 示例：使用时间戳
vouchdate	date
格式:yyyy-MM-dd	否	否	单据日期
presentationNo	string	否	是	交单编号
project	string	否	否	项目编码
wbs	string	否	否	wbs编码
activity	string	否	否	活动编码
dept	string	否	否	部门编码
costCenter	string	否	否	成本中心
profitCenter	string	否	否	利润中心
isSameTimePay	string	否	否	同时付费: true是 false否
collectReceived	object	是	否	交单收款信息子表
expensePay	object	是	否	费用付款信息子表

## 3. 请求示例

Url: /yonbip/ctm/receiptregOpenApi/saveData?access_token=访问令牌
Body: {
	"accentity": "",
	"status": "",
	"receiptregs": [
		{
			"number": NaN,
			"vouchdate": "2026-06-07",
			"presentationNo": "",
			"project": "",
			"wbs": "",
			"activity": "",
			"dept": "",
			"costCenter": "",
			"profitCenter": "",
			"isSameTimePay": "",
			"collectReceived": [
				{
					"collectMoneyType": "",
					"collectMoneyAmt": 0,
					"collectCurrency": "",
					"collectAccount": "",
					"settlementType": "",
					"collectMoneyCurrencyAmt": 0,
					"actualCollectMoneyDate": "2026-06-07",
					"receivedOtherType": "",
					"otherUnit": "",
					"oppoAccount": "",
					"collectExchangeType": "",
					"collectExchangeRate": 0
				}
			],
			"expensePay": [
				{
					"expenseItemType": "",
					"expensePayAmt": 0,
					"expensePayCurrency": "",
					"expenseAccount": "",
					"expenseSettlementType": "",
					"expenseMoneyCurrencyAmt": "",
					"actualExpenseMoneyDate": "2026-06-07",
					"payOtherType": "",
					"otherUnit": "",
					"oppoAccount": "",
					"oppoopenbank": "",
					"oppobankLineNumber": "",
					"expenseExchangeRate": 0
				}
			]
		}
	]
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
code	string	否	返回码
message	string	否	描述信息
data	object	是	返回数据
responseCode	string	否	单条数据返回码：200保存成功 501 502 503 保存失败
message	string	否	失败原因
id	string	否	单据Id
number	string	否	流水号

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": [
		{
			"responseCode": "",
			"message": "",
			"id": "",
			"number": ""
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
999	服务端异常	

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

