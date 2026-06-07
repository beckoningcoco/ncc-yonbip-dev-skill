---
title: "销售报价批量弃审"
apiId: "c08f8c40bd9b42ce960e40e4c956758e"
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

# 销售报价批量弃审

> `ContentType	application/json` 请求方式	POST | 分类: Sales Quotation (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/quote/salesquotation/unaudit

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
| id | long | 否 | 是 | 销售报价单id 示例：2679251790189568 |

## 3. 请求示例

Url: /yonbip/sd/quote/salesquotation/unaudit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2679251790189568
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
				"id": 2679493268804608,
				"pubts": "2022-03-09 10:25:33",
				"salesOrgId": "2523669103481344",
				"transactionTypeId": "2351874939490562",
				"name": "工业原料报价",
				"code": "BJD20220308000028",
				"quoteStatus": 0,
				"status": 0,
				"changestatus": 0,
				"isPotential": false,
				"vouchdate": "2022-03-08 00:00:00",
				"validityDateBegin": "2022-03-08 00:00:00",
				"validityDateEnd": "2022-03-31 00:00:00",
				"quotePersonId": 2510689921126656,
				"agentId": 2580097169659136,
				"agentRelationId": 2580097174345007,
				"currency": "2351874939032064",
				"orderPayType": "FIRSTDELIVER",
				"invoiceAgentId": 2580097169659136,
				"natCurrency": "2351874939032064",
				"modifyInvoiceType": true,
				"invoiceTitleType": "0",
				"totalMoney": 0,
				"totalOriMoney": 0,
				"totalParticularlyMoney": 0,
				"exchangeRateType": "2351874941506048",
				"exchRate": 1,
				"totalOriTax": 0,
				"isWfControlled": false,
				"verifystate": 0,
				"returncount": 0,
				"isFlowCoreBill": false,
				"openDate": "2022-03-08 00:00:00",
				"autoCheckDate": "2022-03-09 00:00:00",
				"operationDate": "2022-03-09 00:00:00",
				"createDate": "2022-03-08 00:00:00",
				"createTime": "2022-03-08 20:41:30",
				"creator": "wangwenfeng",
				"creatorId": 2510689921126656,
				"quoteTableTotalMoney": 0,
				"quoteVersion": "V.1",
				"source": 0,
				"tenant": 2351873187860736,
				"totalDiscountRate": 100,
				"totalDiscountSum": 0,
				"childs": [
					{
						"discountRate": 100,
						"oriTax": 0,
						"natTax": 0,
						"taxcCodeId": "8b99f589-bc47-4c3a-bfqw-13d78jka20b0",
						"discountSum": 0,
						"subQty": 5,
						"invPriceExchRate": 1,
						"cqtUnitExchangeType": 0,
						"isUserAddGiveaway": false,
						"id": 2679493268804609,
						"skuId": 2573307156451584,
						"productType": "SALE",
						"quoteDate": "2022-03-08 20:40:46",
						"tenant": 2351873187860736,
						"cqtUnitId": 2353296592359680,
						"saleunitId": 2353296592359680,
						"rowno": 10,
						"productId": 2573307147997440,
						"quoteSalePrice": 0,
						"exclusiveTaxQuotation": 15,
						"oriSum": 0,
						"quotationId": 2679493268804608,
						"oriUnitPrice": 0,
						"saleUnitExchangeType": 0,
						"natSum": 0,
						"taxRate": 0,
						"idKey": "SQ2679492608660480",
						"masterUnitId": 2353296592359680,
						"quotationExclusiveTaxMoney": 20,
						"discountNatSum": 0,
						"priceQty": 5,
						"qty": 5,
						"stockOrgId": "2523669103481344",
						"settlementOrgId": "2523669103481344",
						"oriTaxUnitPrice": 0,
						"oriMoney": 0,
						"invExchRate": 1,
						"natTaxUnitPrice": 0,
						"natMoney": 0,
						"totalPushSactQty": 0,
						"priceMark": "0",
						"quoteSaleCost": 0,
						"natUnitPrice": 0,
						"defines": {
							"tenant": 2351873187860736,
							"id": 2679493268804609,
							"define": "2022-03-24"
						}
					}
				],
				"quoteExecutes": [
					{
						"quotationDetailId": 2679493268804609,
						"quotationId": 2679493268804608,
						"id": 2679493268804609,
						"tenant": 2351873187860736
					}
				],
				"frees": {
					"define": "false",
					"tenant": 2351873187860736,
					"id": 2679493268804608
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

