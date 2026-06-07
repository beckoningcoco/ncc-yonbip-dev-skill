---
title: "外汇付款单列表查询"
apiId: "2130543283548454920"
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

# 外汇付款单列表查询

> `ContentType	application/json` 请求方式	POST | 分类: FX Payment (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/ctm/foreignpayment/list

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 页号 示例：1 默认值：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 是 | 每页行数 示例：10 默认值：10 |
| code | string | 否 | 否 | 单据编码 示例：MDPT20240806000038 |
| accentity | string | 否 | 否 | 资金组织id 示例：2404308656854308 |
| verifystate | string | 否 | 否 | 审批状态；0：初始开立，1：审批中，2：审批完成，3：流程终止，4：驳回到制单 示例：0 |
| open_vouchdate_begin | string | 否 | 否 | 单据日期开始日期,格式为:yyyy-MM-dd 示例：2022-05-01 |
| open_vouchdate_end | string | 否 | 否 | 单据日期结束日期,格式为:yyyy-MM-dd 示例：2022-05-17 |
| simpleVOs | object | 是 | 否 | 扩展条件查询 |
| field | string | 否 | 否 | 属性名(条件) ，1：defines.define4(表头自由自定义项4) ，2：pubts(时间戳) 示例：pubts |
| op | string | 否 | 否 | 比较符(in:包含;eq:等于;lt:小于;gt:大于;like:模糊匹配;between:介于) 示例：between |
| value1 | string | 否 | 否 | 值1 示例：2022-05-01 13:52:47 |
| value2 | string | 否 | 否 | 值2 示例：2022-05-17 13:52:47 |

## 3. 请求示例

Url: /yonbip/ctm/foreignpayment/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"code": "MDPT20240806000038",
	"accentity": "2404308656854308",
	"verifystate": "0",
	"open_vouchdate_begin": "2022-05-01",
	"open_vouchdate_end": "2022-05-17",
	"simpleVOs": [
		{
			"field": "pubts",
			"op": "between",
			"value1": "2022-05-01 13:52:47",
			"value2": "2022-05-17 13:52:47"
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
| code | string | 否 | 返回码，调用成功时返回200 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 返回的数据 |
| pageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 页号 示例：1 |
| pageSize | number |
| 小数位数:0,最大长度:10 | 否 | 每页数量 示例：500 |
| recordCount | number |
| 小数位数:0,最大长度:10 | 否 | 总页数 示例：3 |
| pageCount | number |
| 小数位数:0,最大长度:10 | 否 | 总页数 示例：1 |
| beginPageIndex | number |
| 小数位数:0,最大长度:10 | 否 | 开始页号 示例：1 |
| endPageIndex | number |
| 小数位数:2,最大长度:10 | 否 | 终止页号 示例：1 |
| recordList | object | 是 | 返回的数据列表 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 500,
		"recordCount": 3,
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"recordList": [
			{
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
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

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

