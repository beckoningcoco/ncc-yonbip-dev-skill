---
title: "采购发票撤回"
apiId: "1c12245b23984ffcb829d2460d52b9bc"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Invoice"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Invoice]
platform_version: "BIP"
source_type: community-api-docs
---

# 采购发票撤回

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Invoice (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/purinvoice/batchunsubmit

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
| id | long | 否 | 是 | 采购发票主表id 示例：2267032477487616 |

## 3. 请求示例

Url: /yonbip/scm/purinvoice/batchunsubmit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2267032477487616
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
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 返回信息 |

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
				"returncount": 0,
				"verifystate": 0,
				"invVendorBankId": "23432334543434",
				"code": "FP201124000023",
				"oriTax": 0,
				"isBeginning": false,
				"invoiceVendor": 1978496548475136,
				"modifier": "达利园集团",
				"creatorId": 1755926883488000,
				"modifierId": 1856459214409984,
				"bizFlow": "56902a83-9008-11ea-8d5f-0624d60000dc",
				"memo": "333444121213",
				"exchRate": 1,
				"source": "ustock.st_purinrecord",
				"operator": "2015293275476224",
				"contact": "神盾局",
				"contactTel": "15612348764",
				"natTax": 0,
				"srcBill": 2015293275476224,
				"smallTaxpayer": "0",
				"vouchdate": "2020-11-24 00:00:00",
				"totalQuantity": 5,
				"natCurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"otherInvoiceDate": "2020-11-25 15:47:00",
				"modifyTime": "2020-11-25 15:47:00",
				"inInvoiceOrg": "1730475987734784",
				"vendor": 1978496548475136,
				"maturityDate": "2020-11-24 00:00:00",
				"otherInvoiceCode": "34323432",
				"invoiceType": 1,
				"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"department": "1978496548475136",
				"id": 2015294651977984,
				"isInvBack": false,
				"pubts": "2021-07-21 19:59:23",
				"isFlowCoreBill": false,
				"tenant": 1730438231412992,
				"createDate": "2020-11-24 00:00:00",
				"accountDate": "2020-11-24 00:00:00",
				"creator": "xullf",
				"oriSum": 50,
				"modifyDate": "2020-11-25 00:00:00",
				"org": "1730475987734784",
				"isWfControlled": true,
				"taxRate": 1,
				"invVendorAccount": "2345432343",
				"srcBillNO": "CGRK20201124000003",
				"taxitems": "1848166507073792",
				"natSum": 50,
				"bustype": "1848166507073792",
				"createTime": "2020-11-24 15:43:44",
				"exchRateType": "lzsrm3iy",
				"oriMoney": 50,
				"natMoney": 50,
				"purInvoices": {
					"purUOM": 2192249830953216,
					"oriTax": 0.087379,
					"inOrg": "2163951720681984",
					"project": "2306587387253248",
					"memo": "666",
					"firstsource": "productionorder.po_subcontract_order",
					"firstupcode": "09010222",
					"natTax": 0.087379,
					"source": "ustock.st_osminrecord",
					"subQty": 2,
					"costedMoney": 2.912621,
					"proDescFlag": "0",
					"unDeductTax": 0,
					"id": 2382996215681537,
					"mainid": 2382996215681536,
					"oriUnitPrice": 1.456311,
					"natSum": 3,
					"srcPOLineID": 2254272968511745,
					"taxRate": 2,
					"unit": 2192249830953216,
					"srcPOID": 2254272968511744,
					"productsku": 2192250219548928,
					"qty": 2,
					"oriTaxUnitPrice": 1.5,
					"oriMoney": 2.912621,
					"invExchRate": 1,
					"discountTaxType": "0",
					"unitExchangeTypePrice": 0,
					"isGiftProduct": false,
					"isUpdateCost": false,
					"natUnitPrice": 1.456311,
					"demandOrg": "2163951720681984",
					"firstsourceautoid": 2254272968511745,
					"makeRuleCode": "st_osminrecord2invoice",
					"priceUOM": 2192249830953216,
					"invPriceExchRate": 1,
					"firstsourceid": 2254272968511744,
					"sourceid": 2254278663214080,
					"rowno": 10,
					"product": 2192250208538880,
					"oriSum": 3,
					"accountOrg": "2163951720681984",
					"unitExchangeType": 0,
					"creditStatus": false,
					"sourceautoid": 2254278663263232,
					"priceQty": 1,
					"upcode": "OSMI20210512000001",
					"srcPOCode": "09010222",
					"taxitems": "2155547427149061",
					"natTaxUnitPrice": 1,
					"unDeductTaxRate": 1,
					"natMoney": 2.33
				},
				"status": 0
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

