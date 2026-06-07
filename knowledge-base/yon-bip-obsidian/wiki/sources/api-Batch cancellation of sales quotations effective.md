---
title: "销售报价批量取消生效"
apiId: "d6036fbeeeb445759618733aa052268b"
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

# 销售报价批量取消生效

> `ContentType	application/json` 请求方式	POST | 分类: Sales Quotation (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/quote/salesquotation/uneffect

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
| data | object | 是 | 否 | 请求数据 |
| id | string | 否 | 是 | 销售报价单id 示例：64554643154546 |

## 3. 请求示例

Url: /yonbip/sd/quote/salesquotation/uneffect?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "64554643154546"
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
				"id": "2651959509078272",
				"taxRateId": "2351874942145024",
				"pubts": "2022-02-22 20:55:37",
				"salesOrgId": "2352669639348480",
				"transactionTypeId": "2351874939490562",
				"code": "BJD20220217000001",
				"quoteStatus": "1",
				"status": "1",
				"changestatus": "0",
				"isPotential": false,
				"vouchdate": "2022-02-17 00:00:00",
				"validityDateBegin": "2022-02-17 00:00:00",
				"validityDateEnd": "2022-02-23 00:00:00",
				"quotePersonId": "2510689921126656",
				"agentId": "2353231358169344",
				"agentRelationId": "2353231388659978",
				"currency": "2351874939032064",
				"receiver": "汪小菲",
				"receiveMobile": "18623424463",
				"receiveAddress": "北京市海淀区北清路68号",
				"orderPayType": "FIRSTDELIVER",
				"invoiceAgentId": "2353231358169344",
				"natCurrency": "2351874939032064",
				"modifyInvoiceType": true,
				"invoiceTitleType": "0",
				"totalMoney": 9,
				"totalOriMoney": 7.96,
				"totalParticularlyMoney": 0,
				"exchangeRateType": "2351874941506048",
				"exchRate": 1,
				"totalOriTax": 1.04,
				"isWfControlled": true,
				"verifystate": "2",
				"returncount": 0,
				"isFlowCoreBill": false,
				"openDate": "2022-02-17 00:00:00",
				"autoCheckDate": "2022-02-17 00:00:00",
				"operationDate": "2022-02-22 00:00:00",
				"auditDate": "2022-02-17 00:00:00",
				"auditTime": "2022-02-17 10:13:51",
				"auditor": "wangwenfeng",
				"auditorId": "2510689921126656",
				"changelastid": "2651959509078272",
				"createDate": "2022-02-17 00:00:00",
				"createTime": "2022-02-17 09:52:43",
				"creator": "wangwenfeng",
				"creatorId": "2510689921126656",
				"quoteTableTotalMoney": 0,
				"quoteVersion": "V.1",
				"source": "0",
				"tenant": "2351873187860736",
				"totalDiscountRate": 100,
				"totalDiscountSum": 0,
				"childs": [
					{
						"discountRate": 100,
						"oriTax": 1.04,
						"natTax": 1.04,
						"taxcCodeId": "2351874942145024",
						"discountSum": 0,
						"subQty": 1,
						"invPriceExchRate": 1,
						"cqtUnitExchangeType": 0,
						"isUserAddGiveaway": false,
						"id": "2651959509094656",
						"pubts": "2022-02-17 09:52:44",
						"skuId": "2353235022893312",
						"productType": "SALE",
						"quoteDate": "2022-02-17 09:52:21",
						"tenant": "2351873187860736",
						"cqtUnitId": "2352410771869952",
						"saleunitId": "2352410771869952",
						"rowno": 10,
						"productId": "2353235008721152",
						"quoteSalePrice": 0,
						"exclusiveTaxQuotation": 15,
						"oriSum": 9,
						"quotationId": "2651959509078272",
						"oriUnitPrice": 7.96,
						"saleUnitExchangeType": 0,
						"natSum": 9,
						"taxRate": 13,
						"idKey": "SQ2651959200420096",
						"masterUnitId": "2352410771869952",
						"quotationExclusiveTaxMoney": 20,
						"discountNatSum": 0,
						"priceQty": 1,
						"qty": 1,
						"stockOrgId": "2352669639348480",
						"settlementOrgId": "2352669639348480",
						"oriTaxUnitPrice": "9",
						"oriMoney": 7.96,
						"invExchRate": 1,
						"natTaxUnitPrice": 9,
						"natMoney": 7.96,
						"totalPushSactQty": 0,
						"priceMark": "0",
						"quoteSaleCost": 0,
						"natUnitPrice": 7.96
					}
				],
				"quoteExecutes": [
					{
						"quotationDetailId": "2651959509094656",
						"quotationId": "2651959509078272",
						"id": "2651959509094656",
						"pubts": "2022-02-17 09:52:43",
						"totalPushSaleQty": 8,
						"tenant": "2351873187860736"
					}
				],
				"frees": {
					"define": "false",
					"pubts": "2022-02-17 09:52:44",
					"tenant": "2351873187860736",
					"id": "2651959509078272"
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

200	没有找到对应的报价单，请检查数据！	检查请求参数的正确性


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

