---
title: "客户退款列表查询（根据客户和退货单号）"
apiId: "c8d171d6c3b94be8be10fb7a0afbaa0f"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounts Receivable"
domain: "FI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounts Receivable]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户退款列表查询（根据客户和退货单号）

> `ContentType	application/json` 请求方式	POST | 分类: Accounts Receivable (FI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/fi/paybill/queryByOrgAndCustomer

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
| pageIndex | string | 否 | 是 | 页数 |
| pageSize | string | 否 | 是 | 显示条数 |
| orderno | string | 否 | 否 | 订单编号 |
| customerId | long | 否 | 否 | 客户id |

## 3. 请求示例

Url: /yonbip/fi/paybill/queryByOrgAndCustomer?access_token=访问令牌
Body: {
	"pageIndex": "",
	"pageSize": "",
	"orderno": "",
	"customerId": 0
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| pageIndex | int | 否 | 页号 |
| pageSize | int | 否 | 每页行数 |
| recordCount | int | 否 | 记录数 |
| pageCount | int | 否 | 每页总数 |
| beginPageIndex | int | 否 | 起始页 |
| endPageIndex | int | 否 | 尾页 |
| pubts | string | 否 | 操作时间, 格式为:yyyy-MM-dd HH:mm:ss |
| recordList | object | 是 | 返回数据 |

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"pageIndex": 0,
		"pageSize": 0,
		"recordCount": 0,
		"pageCount": 0,
		"beginPageIndex": 0,
		"endPageIndex": 0,
		"pubts": "",
		"recordList": [
			{
				"vouchdate": "",
				"code": "",
				"accentity": "",
				"accentity_name": "",
				"period": "",
				"period_code": "",
				"currency_priceDigit": "",
				"currency_moneyDigit": "",
				"customer": "",
				"customer_code": "",
				"customer_name": "",
				"currency": "",
				"currency_name": "",
				"natCurrency": "",
				"natCurrency_name": "",
				"natCurrency_priceDigit": "",
				"exchangeRateType_digit": "",
				"exchangeRateType_name": "",
				"exchangeRateType": "",
				"natCurrency_moneyDigit": "",
				"exchRate": 0,
				"oriSum": 0,
				"natSum": 0,
				"balance": 0,
				"customerbankname": "",
				"customerbankaccount": "",
				"customerbankaccount_bankAccountName": "",
				"busiaccbook": "",
				"caobject": "",
				"paystatus": "",
				"srcitem": "",
				"basebilltype": "",
				"settlestatus": "",
				"accountdate": "",
				"tradetype": "",
				"tradetype_name": "",
				"writeoffstatus": "",
				"voucherstatus": "",
				"orderno": "",
				"status": "",
				"isWfControlled": "",
				"returncount": "",
				"verifystate": 0,
				"auditstatus": "",
				"PayBillb": {
					"quickType": 0,
					"quickType_name": "",
					"defiquickType_code": "",
					"oriSum": "",
					"localbalance": "",
					"natSum": "",
					"customer": "",
					"customer_name": "",
					"balance": "",
					"bookAmount": ""
				}
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

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

