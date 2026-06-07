---
title: "销售报价批量审核"
apiId: "eafbdf46a8ba41bfbe83c1af9b1f8bdf"
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

# 销售报价批量审核

> `ContentType	application/json` 请求方式	POST | 分类: Sales Quotation (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/quote/salesquotation/batchaudit

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
| id | long | 否 | 是 | 报价单ID 示例：1958317327470848 |

## 3. 请求示例

Url: /yonbip/sd/quote/salesquotation/batchaudit?access_token=访问令牌
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
| code | string | 否 | 返回码 示例：200 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 调用成功时的返回数据 |
| count | long | 否 | 审核单据数量 示例：1 |
| sucessCount | long | 否 | 审核成功数量 示例：1 |
| failCount | long | 否 | 审核失败数量 示例：0 |
| messages | string | 是 | 调用失败时的错误信息 |
| infos | object | 是 | 单据信息 |
| failInfos | string | 是 | 失败提示 |

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
				"agentId": 2523546128438016,
				"code": "BJD20220308000021",
				"totalOriMoney": 3426.56,
				"exchRate": 1,
				"quoteStatus": 5,
				"validityDateEnd": "2022-03-31 00:00:00",
				"vouchdate": "2022-03-08 00:00:00",
				"natCurrency": "2351874939032064",
				"quoteTableTotalMoney": 0,
				"quotePersonId": 2510689921126656,
				"currency": "2351874939032064",
				"id": 2679251790189568,
				"pubts": "2022-03-08 16:36:11",
				"transactionTypeId": "2351874939490562",
				"oriSum": 1936,
				"totalDiscountSum": 0,
				"isWfControlled": true,
				"totalDiscountRate": 100,
				"totalMoney": 3872,
				"taxRateId": "8b99f589-bc47-4c3a-bfqw-13d78jka20b0",
				"validityDateBegin": "2022-03-08 00:00:00",
				"name": "审核api",
				"totalOriTax": 445.44,
				"returncount": 0,
				"salesOrgId": "2352669639348480",
				"status": 1,
				"changestatus": 0,
				"isPotential": false,
				"agentRelationId": 2523546132206346,
				"orderPayType": "FIRSTDELIVER",
				"invoiceAgentId": 2523546128438016,
				"modifyInvoiceType": true,
				"invoiceTitleType": 0,
				"totalParticularlyMoney": 0,
				"exchangeRateType": "2351874941506048",
				"isFlowCoreBill": true,
				"openDate": "2022-03-08 00:00:00",
				"autoCheckDate": "2022-03-08 16:36:11",
				"operationDate": "2022-03-08 00:00:00",
				"createDate": "2022-03-08 00:00:00",
				"createTime": "2022-03-08 16:35:51",
				"creator": "wangwenfeng",
				"creatorId": 2510689921126656,
				"quoteVersion": "1",
				"source": "0",
				"tenant": 2351873187860736,
				"changelastid": 2679251790189568,
				"transtype_id": "2351874939490562",
				"verifystate": 2,
				"auditor": "wangwenfeng",
				"auditorId": 2510689921126656,
				"auditTime": "2022-03-08 16:36:11",
				"auditDate": "2022-03-08 00:00:00",
				"childs": [
					{
						"oriTaxUnitPrice": 0,
						"oriSum": 1936,
						"discountRate": 100,
						"oriTax": 27.84,
						"natTax": 27.84,
						"taxcCodeId": "2351874942145024",
						"discountSum": 0,
						"subQty": 22,
						"invPriceExchRate": 1,
						"cqtUnitExchangeType": 0,
						"isUserAddGiveaway": false,
						"id": 2679251790189569,
						"skuId": 2353235022893312,
						"productType": "SALE",
						"quoteDate": "2022-03-08 16:35:47",
						"tenant": 2351873187860736,
						"cqtUnitId": 2352410771869952,
						"saleunitId": 2352410771869952,
						"rowno": 10,
						"productId": 2353235008721152,
						"quoteSalePrice": 0,
						"exclusiveTaxQuotation": 15,
						"oriUnitPrice": 9.7345,
						"saleUnitExchangeType": 0,
						"natSum": 242,
						"taxRate": 13,
						"idKey": "SQ2605945642635520",
						"masterUnitId": 2352410771869952,
						"quotationExclusiveTaxMoney": 20,
						"discountNatSum": 0,
						"priceQty": 22,
						"qty": 22,
						"stockOrgId": "2352669639348480",
						"settlementOrgId": "2352669639348480",
						"oriMoney": 214.16,
						"invExchRate": 1,
						"natTaxUnitPrice": 11,
						"natMoney": 214.16,
						"totalPushSactQty": 0,
						"priceMark": "0",
						"quoteSaleCost": 0,
						"natUnitPrice": 9.7345
					}
				],
				"quoteExecutes": [
					{
						"quotationDetailId": 2679251790189569,
						"quotationId": 2679251790189568,
						"id": 2679251790189569,
						"tenant": 2351873187860736
					}
				]
			}
		],
		"failInfos": [
			""
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

