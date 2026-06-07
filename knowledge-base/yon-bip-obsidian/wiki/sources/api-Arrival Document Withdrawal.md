---
title: "到货单撤回"
apiId: "45d4cfd069d2483aaa220ab68d36dbc8"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Arrival Notice"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Arrival Notice]
platform_version: "BIP"
source_type: community-api-docs
---

# 到货单撤回

> `ContentType	application/json` 请求方式	POST | 分类: Arrival Notice (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/scm/arrivalorder/batchunsubmit

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
| id | long | 否 | 是 | 到货单主表id 示例：2282796996055296 |

## 3. 请求示例

Url: /yonbip/scm/arrivalorder/batchunsubmit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2282796996055296
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
				"returncount": 0,
				"verifystate": 0,
				"code": "000057",
				"arrivalOrders": [
					{
						"purUOM": 2261943102066944,
						"oriTax": 0,
						"firstsource": "st_purchaseorder",
						"firstupcode": "000131",
						"source": "st_purchaseorder",
						"natTax": 0,
						"subQty": 850,
						"proDescFlag": "0",
						"isLogisticsRelated": false,
						"valuationRefuseQty": 0,
						"refuseqty": 0,
						"id": 2383438809813249,
						"mainid": 2383438809813248,
						"oriUnitPrice": 40,
						"warehousingByResult": false,
						"natSum": 34000,
						"warehouse": 2381826272055552,
						"arrivalInspect": false,
						"valuationAcceptQty": 850,
						"purchaseorderCode": "000131",
						"taxRate": 0,
						"unit": 2261943102066944,
						"productsku": 2363189361742080,
						"DemandOrg": "2163951720681984",
						"qty": 850,
						"oriTaxUnitPrice": 40,
						"oriMoney": 34000,
						"invExchRate": 1,
						"discountTaxType": 0,
						"unitExchangeTypePrice": 0,
						"natUnitPrice": 40,
						"firstsourceautoid": 2381986142753032,
						"makeRuleCode": "st_purchaseorder2",
						"isDoLogistics": 0,
						"priceUOM": 2261943102066944,
						"invPriceExchRate": 1,
						"isGift": false,
						"firstsourceid": 2381986142753024,
						"purchaseRefuseQty": 0,
						"purchaseAcceptQty": 850,
						"sourceid": 2381986142753024,
						"rowno": 20,
						"product": 2363189353451776,
						"oriSum": 34000,
						"sourceProDescFlag": "0",
						"totalInQuantity": 0,
						"unitExchangeType": 0,
						"acceptqty": 850,
						"sourceautoid": 2381986142753032,
						"priceQty": 850,
						"upcode": "000131",
						"natTaxUnitPrice": 40,
						"natMoney": 34000
					}
				],
				"creatorId": 2265901234393344,
				"exchRate": 1,
				"source": "st_purchaseorder",
				"srcBill": 2381986142753024,
				"vouchdate": "2021-08-11 00:00:00",
				"nativeSum": 36000,
				"natCurrency": "2155547424560384",
				"inInvoiceOrg": "2163951720681984",
				"vendor": 2381691498598656,
				"currency": "2155547424560384",
				"id": 2383438809813248,
				"busType": "2381994365423872",
				"pubts": "2021-08-11 17:20:31",
				"purchaseOrg": "2163951720681984",
				"tenant": 2155538208313600,
				"createDate": "2021-08-11 00:00:00",
				"creator": "杨海波",
				"org": "2163951720681984",
				"isWfControlled": true,
				"barCode": "pu_arrivalorder|2383438809813248",
				"isContract": false,
				"createTime": "2021-08-11 17:19:20",
				"exchRateType": "csrka3z7",
				"invoiceSupplier": 2381691498598656,
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

