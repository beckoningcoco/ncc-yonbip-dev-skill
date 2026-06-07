---
title: "销售订单行打开"
apiId: "eeb4cd6662694a9f9fb0e5512b3855cd"
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

# 销售订单行打开

> `ContentType	application/json` 请求方式	POST | 分类: Sales Order (SCMSD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/sd/voucherorder/lineopen

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
| data | object | 是 | 否 | 请求数据包 |
| id | long | 否 | 是 | 销售订单id 示例：2360382974350336 |
| lockIn | boolean | 否 | 是 | 单据锁状态 true或false 示例：false |
| orderDetails | object | 是 | 否 | 销售订单子表 |

## 3. 请求示例

Url: /yonbip/sd/voucherorder/lineopen?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2360382974350336,
			"lockIn": false,
			"orderDetails": [
				{
					"id": 2360382974350337
				}
			]
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
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| count | long | 否 | 返回数据数量 示例：1 |
| sucessCount | long | 否 | 返回成功数量 示例：1 |
| failCount | long | 否 | 返回失败数量 示例：0 |
| messages | string | 是 | 返回信息 |
| infos | object | 是 | 调用成功的返回数据 |

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
				"unConfirmPrice": 0,
				"downloadU8": false,
				"isFromApi": true,
				"bEffectStock": true,
				"sendDate": "2021-08-16 00:00:00",
				"orderRealMoney": 15868.8,
				"payStatusCode": "NOTPAYMENT",
				"source": 0,
				"realMoney": -43228.8,
				"nextStatusName": "待发货",
				"iDeleted": 0,
				"settVoucherType": "SHIPPING",
				"reight": 0,
				"invoiceTitleType": 0,
				"bizId": 2287063215034624,
				"modifyInvoiceType": true,
				"id": 2364998977557248,
				"isWfControlled": false,
				"lockIn": false,
				"pointsMoney": 0,
				"totalMoney": 15868.8,
				"promotionMoney": 0,
				"agentRelationId": 2347688631816451,
				"invoiceAgentId": 2347688629391616,
				"downSuccess": false,
				"version": 0,
				"rebateMoney": 0,
				"barCode": "voucher_order|2364998977557248",
				"rebateCashMoney": 0,
				"auditorId": 2353258793455872,
				"auditTime": "2021-07-29 16:41:38",
				"settlementOrgId": "2290981365895424",
				"orderDate": "2021-07-29 16:41:22",
				"statusCode": "CONFIRMORDER",
				"status": 1,
				"returncount": 0,
				"verifystate": 2,
				"agentId": 2347688629391616,
				"code": "UO-542420210729000352",
				"particularlyMoney": 0,
				"invoiceMoney": 0,
				"occupyInventory": "CONFIRM",
				"confirmPrice": 0,
				"creatorId": 2353258793455872,
				"orderPayType": "FIRSTDELIVER",
				"bizFlow": "ae158299-d009-11eb-a68a-0624d60000dc",
				"vouchdate": "2021-07-29 00:00:00",
				"payMoney": 15868.8,
				"orderPayMoney": 15868.8,
				"pubts": "2021-07-29 17:53:20",
				"createDate": "2021-07-29 00:00:00",
				"auditDate": "2021-07-29 00:00:00",
				"haveDelivery": false,
				"creator": "郭雨婷",
				"uordercorp": 2287063215034624,
				"submitSource": 3,
				"transactionTypeId": "2287065063444736",
				"nextStatus": "DELIVERGOODS",
				"currentStatus": 1,
				"auditor": "郭雨婷",
				"downloadSource": 0,
				"receiveId": 0,
				"orderDetails": [
					{
						"uordercorp": 2287063215034624,
						"linecloser": "YonSuite默认用户",
						"id": 2364998977557249,
						"linecloseTime": "2021-07-29 17:53:20"
					}
				],
				"confirmDate": "2021-07-29",
				"createSource": 0,
				"createTime": "2021-07-29 16:41:27",
				"invoiceUpcType": 0,
				"confirmer": 0,
				"salesOrgId": "2290981365895424"
			}
		]
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	"当前单据不存在"	填写系统中存在的销售订单id


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

