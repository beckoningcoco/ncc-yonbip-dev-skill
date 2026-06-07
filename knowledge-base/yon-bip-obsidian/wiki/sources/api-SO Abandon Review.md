---
title: "销售订单弃审"
apiId: "d83ae795099043f981933aae5ebdd2bd"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Order"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售订单弃审

> `ContentType	application/json` 请求方式	POST | 分类: Sales Order (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/voucherorder/batchunaudit

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
| data | object | 是 | 否 | 销售订单[voucher.order.Order] |
| id | long | 否 | 否 | 订单主键id 示例：1958317327470848 |

## 3. 请求示例

Url: /yonbip/sd/voucherorder/batchunaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 1958317327470848
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
| data | object | 否 | 调用成功时的返回数据 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| successCountAI | long | 否 | 成功次数 示例：1 |
| failCount | long | 否 | 失败次数 示例：0 |
| failCountAI | long | 否 | 失败次数 示例：0 |
| count | long | 否 | 总数 示例：1 |
| messages | string | 是 | 返回消息 |
| sucessCount | long | 否 | 成功次数 示例：1 |
| infos | object | 是 | 单据信息 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"successCountAI": 1,
		"failCount": 0,
		"failCountAI": 0,
		"count": 1,
		"messages": [
			""
		],
		"sucessCount": 1,
		"infos": [
			{
				"receiveContacter": "联系人02",
				"payStatusCode": "NOTPAYMENT",
				"nextStatus": "CONFIRMORDER",
				"oriSum": "0",
				"unit_Precision": "3",
				"saleCost": "0",
				"statusCode": "CONFIRMBACK",
				"payMoney": 0,
				"createDate": "2020-09-01 00:00:00",
				"salesOrgId": "1511044359426304",
				"currentStatus": 0,
				"pubts": "2020-09-02 10:31:21",
				"totalMoney": 0,
				"verifystate": 0,
				"isFinishDelivery": false,
				"code": "UO-6304202009010001",
				"priceUOM_Precision": "3",
				"nextStatusName": "待确认",
				"agentRelationId": 1511112572326147,
				"status": 0,
				"isWfControlled": false,
				"settlementOrgId_name": "yontest云创股份",
				"purUOM_Precision": "3",
				"orderDetailPrices": {
					"oriTax": 0
				},
				"pubuts": "2020-09-02 10:25:21",
				"receiveContacterPhone": "13601118888",
				"lockIn": false,
				"createTime": "2020-09-01 18:38:28",
				"rebateMoney": 0,
				"orderPrices": {
					"currency_priceDigit": "7",
					"natCurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
					"exchangeRateType_name": "用户自定义汇率",
					"domesticName": "丹麦克朗11",
					"exchRate": 1,
					"currency_moneyDigit": "2",
					"originalName": "丹麦克朗11",
					"exchangeRateType": "41a219073e1e4b78ba9f63adabc1b224",
					"uordercorp": 1511008618713344,
					"domesticCode": "CNY222",
					"natCurrency_moneyDigit": 2,
					"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
					"natCurrency_priceDigit": 7
				},
				"uordercorp": 1511008618713344,
				"particularlyMoney": 0,
				"promotionMoney": 0,
				"id": 1896557904777472,
				"agentId": 1511112571719936,
				"unConfirmPrice": 0,
				"confirmDate": "2020-09-01"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

"failCountAI": 1	业务单据不存在，请检查！	请录入正确单据ID


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-05-13

更新

请求说明


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

