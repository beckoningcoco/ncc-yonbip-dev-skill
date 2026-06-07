---
title: "销售报价批量撤回"
apiId: "b3d538af3e034da089e9c8d5bbca261a"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Quotation"
domain: "SCMSD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Quotation]
platform_version: "BIP"
source_type: community-api-docs
---

# 销售报价批量撤回

> `ContentType	application/json` 请求方式	POST | 分类: Sales Quotation (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/quote/salesquotation/unsubmit

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
| data | object | 是 | 是 | 请求数据 |
| id | long | 否 | 是 | 报价单id 示例：2088849684795648 |

## 3. 请求示例

Url: /yonbip/sd/quote/salesquotation/unsubmit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2088849684795648
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
| message | string | 否 | 调用成功时返回的信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| count | int | 否 | 返回数据总数 示例：1 |
| sucessCount | int | 否 | 返回成功数 示例：1 |
| failCount | int | 否 | 返回失败数 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 返回成功数据 |
| failInfos | object | 是 | 返回失败数据 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"id": 2701560442802944,
				"taxRateId": "eeb8dd2262dc97ba9e449412dcd8ec94",
				"pubts": "2022-03-24 11:33:54",
				"salesOrgId": "2352278795260416",
				"transactionTypeId": "2351874939490562",
				"name": "一般耗材报价",
				"code": "BJD20220324000003",
				"quoteStatus": 0,
				"status": 0,
				"changestatus": 0,
				"isPotential": false,
				"vouchdate": "2022-03-24 00:00:00",
				"validityDateBegin": "2022-03-01 00:00:00",
				"validityDateEnd": "2022-03-30 00:00:00",
				"quotePersonId": 2351873188811008,
				"agentId": 2677895563186432,
				"agentRelationId": 2677895570231552,
				"receiveContacter": "王四",
				"receiveContacterPhone": "134444445554",
				"currency": 2351874939097600,
				"receiver": "王二",
				"receiveMobile": "138317533333",
				"receiveAddress": "北京市 市辖区 东城区 潇湘路",
				"orderPayType": "FIRSTDELIVER",
				"settlement": 2466599332237568,
				"shippingChoiceId": 2346428379960648,
				"invoiceAgentId": 2677895563186432,
				"natCurrency": "2351874939032064",
				"modifyInvoiceType": false,
				"invoiceUpcType": "3",
				"invoiceTitleType": "0",
				"invoiceTitle": "报价客户wls",
				"taxNum": "777777",
				"bankName": "招商银行",
				"subBankName": "招商银行北京支行",
				"bankAccount": "",
				"invoiceTelephone": "03175555",
				"invoiceAddress": "北京市 市辖区 东城区 潇湘路",
				"totalMoney": 500,
				"totalOriMoney": 490.2,
				"totalParticularlyMoney": 0,
				"exchangeRateType": "2351874941506048",
				"exchRate": 2,
				"totalOriTax": 9.8,
				"isWfControlled": true,
				"verifystate": 0,
				"isFlowCoreBill": false,
				"openDate": "2022-03-24 00:00:00",
				"autoCheckDate": "2022-03-22 00:00:00",
				"operationDate": "2022-03-22 00:00:00",
				"createDate": "2022-03-24 00:00:00",
				"createTime": "2022-03-24 10:49:24",
				"creator": "wangwenfeng",
				"creatorId": 2510689921126656,
				"quoteTableTotalMoney": 0,
				"quoteVersion": "3",
				"source": "0",
				"tenant": 2351873187860736,
				"totalDiscountSum": 0,
				"childs": [
					{
						"forecastCBPrice": 0,
						"discountRate": 100,
						"oriTax": 9.8,
						"forecastCBPriceSum": 0,
						"natTax": 19.6,
						"taxcCodeId": "1405266501287542784",
						"discountSum": 0,
						"subQty": 10,
						"invPriceExchRate": 1,
						"cqtUnitExchangeType": 0,
						"isUserAddGiveaway": false,
						"id": 2701560442802945,
						"productType": "SALE",
						"quoteDate": "2022-03-31 10:50:46",
						"tenant": 2351873187860736,
						"cqtUnitId": 2352410771869952,
						"saleunitId": 2352410771869952,
						"rowno": 10,
						"productId": 2352450812989696,
						"quoteSalePrice": 0,
						"exclusiveTaxQuotation": 15,
						"oriSum": 500,
						"quotationId": 2701560442802944,
						"forecastCostPrice": 0,
						"oriUnitPrice": 49.02,
						"saleUnitExchangeType": 0,
						"natSum": 1000,
						"taxRate": 2,
						"idKey": "SQ2699123192418561",
						"masterUnitId": 2352410771869952,
						"quotationExclusiveTaxMoney": 20,
						"discountNatSum": 0,
						"lineno": 10,
						"priceQty": 10,
						"forecastCostPriceSum": 0,
						"qty": 10,
						"stockOrgId": "2352278795260416",
						"settlementOrgId": "2352278795260416",
						"oriTaxUnitPrice": 50,
						"oriMoney": 490.2,
						"invExchRate": 1,
						"natTaxUnitPrice": 100,
						"natMoney": 980.4,
						"priceMark": "0",
						"quoteSaleCost": 0,
						"natUnitPrice": 98.04,
						"defines": {
							"tenant": 2351873187860736,
							"define": "false",
							"id": 2701560442802945
						},
						"frees": {
							"tenant": 2351873187860736,
							"id": 2701560442802945,
							"define": "true"
						}
					}
				],
				"quoteExecutes": [
					{
						"quotationDetailId": 2701560442802945,
						"quotationId": 2701560442802944,
						"id": 2701560442802945,
						"tenant": 2351873187860736
					}
				],
				"frees": {
					"define": "false",
					"tenant": 2351873187860736,
					"id": 2701560442802944
				},
				"defines": {
					"define": "2022-03-23",
					"tenant": 2351873187860736,
					"id": 2701560442802944
				}
			}
		],
		"failInfos": [
			{}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常	检查传入数据的正确性


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

