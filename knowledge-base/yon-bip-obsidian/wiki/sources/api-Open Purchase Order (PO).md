---
title: "采购订单打开"
apiId: "208b1c280e8e4746b97a0a7b2c791377"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Order"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购订单打开

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Order (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/purchaseorder/open

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
| data | object | 是 | 是 | 请求体 |
| id | long | 否 | 是 | 采购订单主表id 示例：2224754591355136 |

## 3. 请求示例

Url: /yonbip/scm/purchaseorder/open?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2224754591355136
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
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回值 |
| count | long | 否 | 数量 示例：1 |
| sucessCount | long | 否 | 成功数 示例：1 |
| failCount | long | 否 | 失败数 示例：0 |
| messages | string | 是 | 返回信息 示例：["操作成功"] |
| infos | object | 是 | 返回数据体 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			"操作成功"
		],
		"infos": [
			{
				"isMaxLimitPrice": false,
				"oriTax": 34.513274,
				"bEffectStock": true,
				"invoiceVendor": 2381691498598656,
				"modifyStatus": 0,
				"settlemethod": 2154759262621965,
				"natTax": 34.513274,
				"directShipment": "1",
				"totalQuantity": 3,
				"natCurrency": "2155547424560384",
				"isAllowAdjustPrice": "0",
				"inInvoiceOrg": "2163951720681984",
				"maturityDate": "2021-08-10 00:00:00",
				"id": 2384404861014272,
				"paymentagrement": 2381689780506880,
				"tenant": 2155538208313600,
				"isWfControlled": true,
				"oriUnitPrice": 88.495575,
				"socialStatus": "false",
				"natSum": 300,
				"barCode": "st_purchaseorder|2384404861014272",
				"isContract": false,
				"auditorId": 2192008994279680,
				"auditTime": "2021-08-12 09:43:40",
				"exchRateType": "csrka3z7",
				"oriTaxUnitPrice": 100,
				"moneysum": 300,
				"oriMoney": 265.486726,
				"purchaseOrders": [
					{
						"discountRate": 100,
						"purUOM": 2261943102066944,
						"oriTax": 34.513274,
						"inOrg": "2163951720681984",
						"totalReturnInSubQty": 0,
						"natTax": 34.513274,
						"subQty": 3,
						"proDescFlag": "0",
						"totalInTaxMoney": 0,
						"isLogisticsRelated": false,
						"inInvoiceOrg": "2163951720681984",
						"unDeductTax": 53.097345,
						"id": 2384404861030656,
						"mainid": 2384404861014272,
						"closeqty": 0,
						"totalArrivedTaxMoney": 300,
						"totalInvoiceQty": 0,
						"oriUnitPrice": 88.495575,
						"totalPayAmount": 0,
						"ticketCollectionClose": false,
						"natSum": 300,
						"approveqty": 0,
						"taxRate": 13,
						"unit": 2261943102066944,
						"totalSendQty": 0,
						"productsku": 2325195035316480,
						"qty": 3,
						"oriTaxUnitPrice": 100,
						"oriMoney": 265.486726,
						"invExchRate": 1,
						"discountTaxType": 0,
						"unitExchangeTypePrice": 0,
						"isGiftProduct": false,
						"natUnitPrice": 88.495575,
						"paymentClose": false,
						"totalPayApplyAmount": 0,
						"totalInSubqty": 0,
						"rejectReplenishQty": 0,
						"totalRecieveSubqty": 3,
						"demandOrg": "2163951720681984",
						"weighFinish": false,
						"totalPayOriMoney": 0,
						"totalPayNATMoney": 0,
						"totalSaleOrderQty": 0,
						"isDoLogistics": 0,
						"priceUOM": 2261943102066944,
						"totalPayQty": 0,
						"totalPurchaseSendQty": 0,
						"invPriceExchRate": 1,
						"totalInQty": 0,
						"arrivalClose": false,
						"warehousingClose": false,
						"totalInvoiceMoney": 0,
						"rowno": 10,
						"product": 2325195025928448,
						"materialClassId": 2325191710134528,
						"oriSum": 300,
						"unitExchangeType": 0,
						"totalRecieveQty": 3,
						"totalReturnInQty": 0,
						"priceQty": 3,
						"taxitems": "2155547427149056",
						"natTaxUnitPrice": 100,
						"unDeductTaxRate": 20,
						"natMoney": 265.486726
					}
				],
				"status": 1,
				"verifystate": 2,
				"code": "000143",
				"creatorId": 2192008994279680,
				"exchRate": 1,
				"vouchdate": "2021-08-12 00:00:00",
				"vendor": 2381691498598656,
				"bizstatus": 1,
				"currency": "2155547424560384",
				"department": "2282501338845440",
				"pubts": "2021-08-13 09:44:09",
				"generalPurchaseOrderType": "1",
				"auditDate": "2021-08-12 00:00:00",
				"createDate": "2021-08-12 00:00:00",
				"accountDate": "2021-08-10 00:00:00",
				"creator": "刘预发接口测试员工",
				"oriSum": 300,
				"org": "2163951720681984",
				"auditor": "刘预发接口测试员工",
				"bustype": "2155547426590991",
				"createTime": "2021-08-12 09:42:03",
				"taxitems": "2155547427149056",
				"natMoney": 265.486726,
				"approvenum": 0
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	服务端逻辑异常


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

