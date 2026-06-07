---
title: "汇率批量查询（返回折算方式）"
apiId: "2362642577387683842"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Exchange Rate Details"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Exchange Rate Details]
platform_version: "BIP"
source_type: community-api-docs
---

# 汇率批量查询（返回折算方式）

>  请求方式	POST | Exchange Rate Details (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/PFC/basedoc/exchangerate/batchQueryWithConversionMethod
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
quotationDate	date
格式:yyyy-MM-dd	否	是	报价日期 示例：2025-09-19
exchangeRateType	string	否	否	汇率类型id，与exchangeRateType___code二选一录入即可，默认id有值时，code字段不生效 示例：0000ME9LYT882DDVY90000
exchangeRateType___code	string	否	否	汇率类型code，与exchangeRateType二选一录入即可，exchangeRateType为空时，按code匹配汇率类型 示例：01
sourceCurrencyId	string	否	否	原币种id，与sourceCurrencyId___code二选一录入即可，默认id有值时，code字段不生效 示例：2336841600754778113
sourceCurrencyId___code	string	否	否	原币种code，与sourceCurrencyId二选一录入即可，sourceCurrencyId为空时，按code匹配源币种 示例：CNY
targetCurrencyId	string	否	否	目的币种id，与targetCurrencyId___code二选一录入即可，默认id有值时，code字段不生效 示例：2335327221060206700
targetCurrencyId___code	string	否	否	目的币种code，与targetCurrencyId二选一录入即可，targetCurrencyId为空时，按code匹配目的币种 示例：USD

## 3. 请求示例

Url: /yonbip/PFC/basedoc/exchangerate/batchQueryWithConversionMethod?access_token=访问令牌
Body: [{
	"quotationDate": "2025-09-19",
	"exchangeRateType": "0000ME9LYT882DDVY90000",
	"exchangeRateType___code": "01",
	"sourceCurrencyId": "2336841600754778113",
	"sourceCurrencyId___code": "CNY",
	"targetCurrencyId": "2335327221060206700",
	"targetCurrencyId___code": "USD"
}]

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
code	string	否	响应编码 示例：200
data	object	否	响应数据
recordCount	number
小数位数:0,最大长度:10	否	总数 示例：2
recordList	object	是	数据记录

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"recordCount": 2,
		"recordList": [
			{
				"quotationDate": "2025-09-01",
				"exchangeRateType": "0000LB7GORZKFK09HO0000",
				"currency": "2336841600754778113",
				"currency___code": "CNY",
				"natCurrency": "2335327221060206700",
				"natCurrency___code": "USD",
				"exchRate": 1.2,
				"exchRateOps": 1,
				"isReverse": true
			}
		]
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-10-30	
更新
请求参数 sourceCurrencyId
更新
请求参数 sourceCurrencyId___code
更新
返回参数 currency
更新
返回参数 currency___code
api文档中，所有的“源币种”都改为“原币种”

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

