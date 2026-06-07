---
title: "采购订单弃审"
apiId: "1a7f6f5c03684a3981b4b153f9c94673"
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

# 采购订单弃审

> `ContentType	application/json` 请求方式	POST | 分类: Purchase Order (MM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/scm/purchaseorder/batchunaudit

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	批量保存/更新

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 是 | 是 | 采购订单[pu.purchaseorder.PurchaseOrder] |
| id | long | 否 | 是 | 采购订单id 示例：2224754591355136 |

## 3. 请求示例

Url: /yonbip/scm/purchaseorder/batchunaudit?access_token=访问令牌
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
| count | long | 否 | 操作数量 示例：1 |
| sucessCount | long | 否 | 操作成功数 示例：1 |
| failCount | long | 否 | 操作失败数 示例：0 |
| messages | string | 是 | 返回信息 示例：["操作成功"] |
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
			"操作成功"
		],
		"infos": [
			{
				"isMaxLimitPrice": false,
				"code": "CGA20002000523",
				"oriTax": 70.714286,
				"invoiceVendor": 2093277109932288,
				"modifyStatus": 0,
				"creatorId": 1730474215788800,
				"bizFlow": "105702af-39cd-11eb-a279-0624d60000dc",
				"exchRate": 1,
				"natTax": 70.714286,
				"vouchdate": "2021-07-19 00:00:00",
				"totalQuantity": 45,
				"natCurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"inInvoiceOrg": "1924667592954112",
				"vendor": 2093277109932288,
				"maturityDate": "2021-06-24 00:00:00",
				"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"id": 2350841972887808,
				"pubts": "2021-07-22 21:12:54",
				"tenant": 1730438231412992,
				"createDate": "2021-07-19 00:00:00",
				"accountDate": "2021-06-24 00:00:00",
				"creator": "王欢",
				"oriSum": 1485,
				"org": "1924667592954112",
				"isWfControlled": false,
				"natSum": 1485,
				"bustype": "1567660749738240",
				"barCode": "st_purchaseorder|2350841972887808",
				"isContract": false,
				"purchaseOrders": [
					{
						"purUOM": 1730486466924800,
						"oriTax": 70.714286,
						"inOrg": "1924667592954112",
						"natTax": 70.714286,
						"subQty": 45,
						"proDescFlag": "0",
						"inInvoiceOrg": "1924667592954112",
						"id": 2350841972887809,
						"mainid": 2350841972887808,
						"closeqty": 0,
						"natSum": 1485,
						"warehouse": 1730534474486016,
						"taxRate": 5,
						"unit": 1730486466924800,
						"qty": 45,
						"oriMoney": 1414.285714,
						"invExchRate": 1,
						"natUnitPrice": 31.428571,
						"demandOrg": "1924667592954112",
						"isDoLogistics": 0,
						"priceUOM": 1730486466924800,
						"totalInQty": 0,
						"rowno": 10,
						"product": 1730491724599552,
						"oriSum": 1485,
						"sourceProDescFlag": "0",
						"unitExchangeType": 0,
						"lineno": 10,
						"priceQty": 45,
						"natMoney": 1414.285714
					}
				],
				"natMoney": 1414.285714,
				"status": 1
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

1	2026-01-23

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

