---
title: "付款单列表查询"
apiId: "a93fa93ab35546e0ace75b55b4d373bf"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Workbench"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payment Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 付款单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: Payment Workbench (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/cmppayment

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | int | 否 | 是 | 页号 默认值：1 |
| pageSize | int | 否 | 是 | 每页行数 默认值：10 |
| code | string | 否 | 否 | 单据编号 |
| accentity | string | 是 | 否 | 会计主体ID |
| open_vouchdate_begin | string | 否 | 否 | 单据日期开始日期,格式为:yyyy-MM-dd HH:mm:ss |
| open_vouchdate_end | string | 否 | 否 | 单据日期结束日期,格式为:yyyy-MM-dd HH:mm:ss |
| paystatus | string | 是 | 否 | 支付状态, 5:支付中、6:支付不明、7:线下支付成功、0:待支付、1:预下单成功、2:预下单失败、3:支付成功、4:支付失败、 |
| caobject | string | 是 | 否 | 付款对象, 4:其他、1:客户、2:供应商、3:人员、 |
| org | string | 是 | 否 | 业务组织ID |
| supplier | string | 是 | 否 | 供应商ID |
| dept | string | 是 | 否 | 部门 |
| srcitem | string | 是 | 否 | 事项来源, 9:导入、8:现金管理、1:销售管理、2:B2C订单中心、6:应收应付、7:采购管理、10:费用管理、3:在线商城、4:零售、5:库存、11:总账、12:内部交易、20:第三方、 |
| tradetype | string | 是 | 否 | 交易类型 |
| customer | string | 是 | 否 | 客户ID |
| employee | string | 是 | 否 | 员工ID |
| topsrcbillno | string | 否 | 否 | 来源单据号 |

## 3. 请求示例

Url: /yonbip/fi/cmppayment?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"code": "",
	"accentity": [
		""
	],
	"open_vouchdate_begin": "",
	"open_vouchdate_end": "",
	"paystatus": [
		""
	],
	"caobject": [
		""
	],
	"org": [
		""
	],
	"supplier": [
		""
	],
	"dept": [
		""
	],
	"srcitem": [
		""
	],
	"tradetype": [
		""
	],
	"customer": [
		""
	],
	"employee": [
		""
	],
	"topsrcbillno": ""
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
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| pageIndex | int | 否 | 当前页数 |
| pageSize | int | 否 | 每页行数 |
| pageCount | int | 否 | 总页数 |
| beginPageIndex | int | 否 | 开始页码（第一页） |
| endPageIndex | int | 否 | 结束页码（有多少页） |
| recordCount | int | 否 | 总数 |
| pubts | string | 否 | 时间戳,格式为:yyyy-MM-dd HH:mm:ss |
| sumRecordList | object | 否 | 合计 |
| recordList | object | 是 | 付款单列表 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"recordCount": 0,
		"pubts": "",
		"sumRecordList": {
			"orisum": 0,
			"natSum": 0
		},
		"recordList": [
			{
				"code": "",
				"accentity": "",
				"accentity_name": "",
				"natCurrency": "",
				"natCurrency_name": "",
				"natCurrency_priceDigit": "",
				"natCurrency_moneyDigit": "",
				"vouchdate": "",
				"billtype": "",
				"tradetype": "",
				"tradetype_code": "",
				"tradetype_name": "",
				"srcitem": "",
				"topsrcbillno": "",
				"exchangeRateType_digit": "",
				"exchangeRateType": "",
				"auditstatus": "",
				"paystatus": "",
				"exchangeRateType_name": "",
				"voucherstatus": "",
				"settlestatus": "",
				"settlemode": "",
				"settlemode_serviceAttr": "",
				"settlemode_name": "",
				"currency": "",
				"currency_name": "",
				"currency_priceDigit": "",
				"currency_moneyDigit": "",
				"oriSum": 0,
				"exchRate": 0,
				"natSum": 0,
				"enterprisebankaccount": "",
				"enterprisebankaccount_bank": "",
				"enterprisebankaccount_name": "",
				"cashaccount": "",
				"cashaccount_name": "",
				"caobject": "",
				"supplier": "",
				"supplier_name": "",
				"supplierbankaccount": "",
				"supplierbankaccount_bank": "",
				"supplierbankaccount_accountname": "",
				"customer": "",
				"customer_name": "",
				"customerbankaccount": "",
				"customerbankaccount_bank": "",
				"customerbankaccount_bankAccountName": "",
				"org": "",
				"org_name": "",
				"dept": "",
				"dept_name": "",
				"retailerBankType": "",
				"employee": "",
				"retailerBankType_name": "",
				"employee_name": "",
				"staffBankAccount": "",
				"staffBankAccount_bank": "",
				"staffBankAccount_account": "",
				"retailer": "",
				"retailerAccountName": "",
				"retailerAccountNo": "",
				"noteno": "",
				"project": "",
				"project_name": "",
				"description": "",
				"porderid": "",
				"batno": "",
				"requestseqno": "",
				"transeqno": "",
				"paymessage": "",
				"srcbillid": "",
				"period": "",
				"period_code": "",
				"id": "",
				"pubts": "",
				"auditor": "",
				"createTime": "",
				"auditTime": "",
				"modifier": "",
				"modifyTime": "",
				"creator": "",
				"dzdate": ""
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

200	操作成功	查询时不会出现错误信息，只是查出来的data为空。


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

